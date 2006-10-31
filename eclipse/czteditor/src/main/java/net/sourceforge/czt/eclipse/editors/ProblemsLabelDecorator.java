/**
 * 
 */

package net.sourceforge.czt.eclipse.editors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import net.sourceforge.czt.eclipse.CZTPlugin;
import net.sourceforge.czt.eclipse.CZTPluginImages;
import net.sourceforge.czt.eclipse.editors.zeditor.ZEditor;
import net.sourceforge.czt.eclipse.outline.CztTreeNode;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.IAnnotationModel;
import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.jface.viewers.IDecoration;
import org.eclipse.jface.viewers.ILabelDecorator;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ILightweightLabelDecorator;
import org.eclipse.jface.viewers.LabelProviderChangedEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.texteditor.MarkerAnnotation;

/**
 * LabelDecorator that decorates an element's image with error and warning overlays that 
 * represent the severity of markers attached to the element's underlying resource. To see 
 * a problem decoration for a marker, the marker needs to be a subtype of <code>IMarker.PROBLEM</code>.
 * 
 * @since 2.0
 * 
 * @author Chengdong Xu
 */
public class ProblemsLabelDecorator
    implements
      ILabelDecorator,
      ILightweightLabelDecorator
{

  /**
   * This is a special <code>LabelProviderChangedEvent</code> carrying additional 
   * information whether the event origins from a maker change.
   * <p>
   * <code>ProblemsLabelChangedEvent</code>s are only generated by <code>
   * ProblemsLabelDecorator</code>s.
   * </p>
   */
  public static class ProblemsLabelChangedEvent
      extends
        LabelProviderChangedEvent
  {

    private static final long serialVersionUID = 1L;

    private boolean fMarkerChange;

    /**
     * Note: This constructor is for internal use only. Clients should not call this constructor.
     * 
     * @param eventSource the base label provider
     * @param changedResource the changed resources
     * @param isMarkerChange <code>true<code> if the change is a marker change; otherwise
     *  <code>false</code> 
     */
    public ProblemsLabelChangedEvent(IBaseLabelProvider eventSource,
        IResource[] changedResource, boolean isMarkerChange)
    {
      super(eventSource, changedResource);
      fMarkerChange = isMarkerChange;
    }

    /**
     * Returns whether this event origins from marker changes. If <code>false</code> an annotation 
     * model change is the origin. In this case viewers not displaying working copies can ignore these 
     * events.
     * 
     * @return if this event origins from a marker change.
     */
    public boolean isMarkerChange()
    {
      return fMarkerChange;
    }
  }

  private static final int ERRORTICK_WARNING = CztElementImageDescriptor.WARNING;

  private static final int ERRORTICK_ERROR = CztElementImageDescriptor.ERROR;

  private ImageDescriptorRegistry fRegistry;

  private boolean fUseNewRegistry = false;

  private List<ILabelProviderListener> fListeners = new ArrayList<ILabelProviderListener>();

  /**
   * Creates a new <code>ProblemsLabelDecorator</code>.
   */
  public ProblemsLabelDecorator()
  {
    this(null);
  }

  /**
   * Note: This constructor is for internal use only. Clients should not call this constructor.
   * 
   * @param registry The registry to use or <code>null</code> to use the Java plugin's
   *  image registry
   */
  public ProblemsLabelDecorator(ImageDescriptorRegistry registry)
  {
    fRegistry = registry;
  }

  private ImageDescriptorRegistry getRegistry()
  {
    if (fRegistry == null) {
      fRegistry = fUseNewRegistry ? new ImageDescriptorRegistry() : CZTPlugin
          .getImageDescriptorRegistry();
    }
    return fRegistry;
  }

  /**
   * @see org.eclipse.jface.viewers.ILabelDecorator#decorateText(java.lang.String, java.lang.Object)
   */
  public String decorateText(String text, Object element)
  {
    return text;
  }

  /**
   * @see org.eclipse.jface.viewers.ILabelDecorator#decorateImage(org.eclipse.swt.graphics.Image, java.lang.Object)
   */
  public Image decorateImage(Image image, Object obj)
  {
    int adornmentFlags = computeAdornmentFlags(obj);
    if (adornmentFlags != 0) {
      ImageDescriptor baseImage = new ImageImageDescriptor(image);
      Rectangle bounds = image.getBounds();
      return getRegistry().get(
          new CztElementImageDescriptor(baseImage, adornmentFlags, new Point(
              bounds.width, bounds.height)));
    }
    return image;
  }

  /**
   * Note: This method is for internal use only. Clients should not call this method.
   * 
   * @param obj the element to compute the flags for
   * 
   * @return the adornment flags
   */
  protected int computeAdornmentFlags(Object obj)
  {
    try {
      if (obj instanceof CztTreeNode) {
        Object source = ((CztTreeNode) obj).getSource();
        IAnnotationModel model = null;
        if (source != null && source instanceof ZEditor) {
          ZEditor editor = (ZEditor) source;
          model = editor.getViewer().getAnnotationModel();
        }
        int result = 0;
        if (model != null) {
          // open in Z editor: look at annotation model
          result = getErrorTicksFromAnnotationModel(model, (CztTreeNode) obj);
        }
        else {
          result = getErrorTicksFromMarkers(
              ((FileEditorInput) ((ZEditor) source).getEditorInput()).getFile(),
              IResource.DEPTH_ONE, (CztTreeNode) obj);
        }

        return result;
      }
      else if (obj instanceof IResource) {
        return getErrorTicksFromMarkers((IResource) obj,
            IResource.DEPTH_INFINITE, null);
      }
    } catch (CoreException e) {
      //			if (e instanceof JavaModelException) {
      //				if (((JavaModelException) e).isDoesNotExist()) {
      //					return 0;
      //				}
      //			}
      //			if (e.getStatus().getCode() == IResourceStatus.MARKER_NOT_FOUND) {
      //				return 0;
      //			}

      //			JavaPlugin.log(e);
      e.printStackTrace();
    }
    return 0;
  }

  private int getErrorTicksFromMarkers(IResource res, int depth,
      CztTreeNode sourceElement) throws CoreException
  {
    if (res == null || !res.isAccessible()) {
      return 0;
    }
    int info = 0;

    IMarker[] markers = res.findMarkers(IMarker.PROBLEM, true, depth);
    if (markers != null) {
      for (int i = 0; i < markers.length && (info != ERRORTICK_ERROR); i++) {
        IMarker curr = markers[i];
        if (sourceElement == null || isMarkerInRange(curr, sourceElement)) {
          int priority = curr.getAttribute(IMarker.SEVERITY, -1);
          if (priority == IMarker.SEVERITY_WARNING) {
            info = ERRORTICK_WARNING;
          }
          else if (priority == IMarker.SEVERITY_ERROR) {
            info = ERRORTICK_ERROR;
          }
        }
      }
    }
    return info;
  }

  private boolean isMarkerInRange(IMarker marker, CztTreeNode sourceElement)
      throws CoreException
  {
    if (marker != null && marker.exists()
        && marker.isSubtypeOf(IMarker.PROBLEM)) {
      Integer start = (Integer) marker.getAttribute(IMarker.CHAR_START);
      Integer end = (Integer) marker.getAttribute(IMarker.CHAR_END);
      if (start != null && end != null) {
        if (sourceElement.getRange().overlapsWith(start, end - start + 1)) {
          return true;
        }
      }
    }

    return false;
  }

  private int getErrorTicksFromAnnotationModel(IAnnotationModel model,
      CztTreeNode sourceElement) throws CoreException
  {
    int info = 0;
    Iterator iter = model.getAnnotationIterator();
    while ((info != ERRORTICK_ERROR) && iter.hasNext()) {
      Annotation annot = (Annotation) iter.next();
      if (annot instanceof MarkerAnnotation) {
        IMarker marker = ((MarkerAnnotation) annot).getMarker();
        if (isMarkerInRange(marker, sourceElement)
            && marker.isSubtypeOf(IMarker.PROBLEM)) {
          int priority = marker.getAttribute(IMarker.SEVERITY, -1);
          if (priority == IMarker.SEVERITY_WARNING) {
            info = ERRORTICK_WARNING;
          }
          else if (priority == IMarker.SEVERITY_ERROR) {
            info = ERRORTICK_ERROR;
          }
        }
      }
    }

    return info;
  }

  /**
   * @see org.eclipse.jface.viewers.IBaseLabelProvider#dispose()
   */
  public void dispose()
  {
    if (fRegistry != null && fUseNewRegistry) {
      fRegistry.dispose();
    }
  }

  /**
   * @see org.eclipse.jface.viewers.IBaseLabelProvider#isLabelProperty(java.lang.Object, java.lang.String)
   */
  public boolean isLabelProperty(Object element, String property)
  {
    return true;
  }

  /**
   * @see org.eclipse.jface.viewers.IBaseLabelProvider#addListener(org.eclipse.jface.viewers.ILabelProviderListener)
   */
  public void addListener(ILabelProviderListener listener)
  {
    if (fListeners == null) {
      fListeners = new ArrayList<ILabelProviderListener>();
    }
    fListeners.add(listener);
    //		if (fProblemChangedListener == null) {
    //			fProblemChangedListener= new IProblemChangedListener() {
    //				public void problemsChanged(IResource[] changedResources, boolean isMarkerChange) {
    //					fireProblemsChanged(changedResources, isMarkerChange);
    //				}
    //			};
    //			JavaPlugin.getDefault().getProblemMarkerManager().addListener(fProblemChangedListener);
    //		}
  }

  /**
   * @see org.eclipse.jface.viewers.IBaseLabelProvider#removeListener(org.eclipse.jface.viewers.ILabelProviderListener)
   */
  public void removeListener(ILabelProviderListener listener)
  {
    if (fListeners != null) {
      fListeners.remove(listener);
      //			if (fListeners.isEmpty() && fProblemChangedListener != null) {
      //				CZTPlugin.getDefault().getProblemMarkerManager().removeListener(fProblemChangedListener);
      //				fProblemChangedListener= null;
      //			}
    }
  }

  /*
  private void fireProblemsChanged(IResource[] changedResources,
      boolean isMarkerChange)
  {
    if (fListeners != null && !fListeners.isEmpty()) {
      LabelProviderChangedEvent event = new ProblemsLabelChangedEvent(this,
          changedResources, isMarkerChange);
      for (ILabelProviderListener listener : fListeners) {
        listener.labelProviderChanged(event);
      }
    }
  }
  */
  /**
   * @see org.eclipse.jface.viewers.ILightweightLabelDecorator#decorate(java.lang.Object, org.eclipse.jface.viewers.IDecoration)
   */
  public void decorate(Object element, IDecoration decoration)
  {
    int adornmentFlags = computeAdornmentFlags(element);
    if (adornmentFlags == ERRORTICK_ERROR) {
      decoration.addOverlay(CZTPluginImages.DESC_OVR_ERROR);
    }
    else if (adornmentFlags == ERRORTICK_WARNING) {
      decoration.addOverlay(CZTPluginImages.DESC_OVR_WARNING);
    }
  }

}
