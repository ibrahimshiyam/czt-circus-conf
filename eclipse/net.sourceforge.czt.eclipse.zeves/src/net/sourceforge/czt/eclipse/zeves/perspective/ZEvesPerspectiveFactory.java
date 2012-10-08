package net.sourceforge.czt.eclipse.zeves.perspective;

import net.sourceforge.czt.eclipse.util.CztUI;
import net.sourceforge.czt.eclipse.zeves.ZEvesPlugin;
import net.sourceforge.czt.eclipse.zeves.views.ZEvesOutputView;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;


/**
 * Defines layout of Z/EVES perspective.
 * 
 * @author Andrius Velykis
 */
public class ZEvesPerspectiveFactory implements IPerspectiveFactory
{

  private static final String ID_NAVIGATOR_FOLDER = ZEvesPlugin.PLUGIN_ID + ".navigatorFolder"; //$NON-NLS-1$
  private static final String ID_THEOREMS_FOLDER = ZEvesPlugin.PLUGIN_ID + ".theoremsFolder"; //$NON-NLS-1$
  private static final String ID_OUTPUT_FOLDER = ZEvesPlugin.PLUGIN_ID + ".outputFolder"; //$NON-NLS-1$
  private static final String ID_OUTLINE_FOLDER = ZEvesPlugin.PLUGIN_ID + ".outlineFolder"; //$NON-NLS-1$
  
  private static final String ID_SEARCH_VIEW = "org.eclipse.search.ui.views.SearchView"; //$NON-NLS-1$
  private static final String ID_CONSOLE_VIEW = "org.eclipse.ui.console.ConsoleView"; //$NON-NLS-1$
  
  private static final String ID_THEOREMS_VIEW = "net.sourceforge.czt.eclipse.zeves.view.Theorems"; //$NON-NLS-1$
  private static final String ID_ZEVES_STATE_VIEW = "net.sourceforge.czt.eclipse.zeves.view.ZEvesState"; //$NON-NLS-1$
  private static final String ID_VERIFICATION_VIEW = "net.sourceforge.czt.eclipse.vcg.views.VC"; //$NON-NLS-1$
  
  
  @Override
  public void createInitialLayout(IPageLayout layout)
  {
    
    String editorArea = layout.getEditorArea();

    // put project explorer on the left
    IFolderLayout navFolder = layout.createFolder(ID_NAVIGATOR_FOLDER, IPageLayout.LEFT, 0.25f, editorArea);
    navFolder.addView(IPageLayout.ID_PROJECT_EXPLORER);
    navFolder.addPlaceholder("org.eclipse.ui.views.ResourceNavigator"); //$NON-NLS-1$
    
    // put Theorems and Verification views below the navigator
    IFolderLayout theoremsFolder = layout.createFolder(ID_THEOREMS_FOLDER, IPageLayout.BOTTOM, 0.5f, ID_NAVIGATOR_FOLDER);
    theoremsFolder.addView(ID_THEOREMS_VIEW);
    theoremsFolder.addView(ID_VERIFICATION_VIEW);
    

    // put the Z/EVES output view on the bottom with Char Map, Conversion view and various IDE views
    IFolderLayout outputFolder = layout.createFolder(ID_OUTPUT_FOLDER, IPageLayout.BOTTOM, 0.75f, editorArea);
    outputFolder.addView(ZEvesOutputView.VIEW_ID);
    outputFolder.addView(CztUI.ID_CHARMAP);
    outputFolder.addPlaceholder(CztUI.ID_CONVERSIONVIEW);
    outputFolder.addView(IPageLayout.ID_PROBLEM_VIEW);
    outputFolder.addPlaceholder(ID_SEARCH_VIEW);
    outputFolder.addPlaceholder(ID_CONSOLE_VIEW);
    outputFolder.addPlaceholder(IPageLayout.ID_BOOKMARKS);

    // put outline on the right, together with Z/EVES state view
    IFolderLayout outlineFolder = layout.createFolder(ID_OUTLINE_FOLDER, IPageLayout.RIGHT, 0.75f, editorArea);
    outlineFolder.addView(IPageLayout.ID_OUTLINE);
    outlineFolder.addView(ID_ZEVES_STATE_VIEW);

    // Add action sets
    layout.addActionSet(IPageLayout.ID_NAVIGATE_ACTION_SET);

    // views - CZT
    layout.addShowViewShortcut(ZEvesOutputView.VIEW_ID);
    layout.addShowViewShortcut(ID_THEOREMS_VIEW);
    layout.addShowViewShortcut(ID_ZEVES_STATE_VIEW);
    layout.addShowViewShortcut(ID_VERIFICATION_VIEW);
    layout.addShowViewShortcut(CztUI.ID_CHARMAP);
    layout.addShowViewShortcut(CztUI.ID_CONVERSIONVIEW);

    // views - search
    layout.addShowViewShortcut(ID_SEARCH_VIEW);

    // views - debugging
    layout.addShowViewShortcut(ID_CONSOLE_VIEW);

    // views - standard workbench
    layout.addShowViewShortcut(IPageLayout.ID_BOOKMARKS);
    layout.addShowViewShortcut(IPageLayout.ID_OUTLINE);
    layout.addShowViewShortcut(IPageLayout.ID_PROBLEM_VIEW);
    layout.addShowViewShortcut(IPageLayout.ID_TASK_LIST);
    layout.addShowViewShortcut(IPageLayout.ID_PROJECT_EXPLORER);
    layout.addShowViewShortcut("org.eclipse.pde.runtime.LogView"); //$NON-NLS-1$

    // new actions - Java project creation wizard
    layout.addNewWizardShortcut(CztUI.ID_NEW_CZT_PROJECT_WIZARD);
    layout.addNewWizardShortcut(CztUI.ID_NEW_CZT_SPECIFICATION_WIZARD);
    layout.addNewWizardShortcut("org.eclipse.ui.wizards.new.folder");//$NON-NLS-1$
    layout.addNewWizardShortcut("org.eclipse.ui.wizards.new.file");//$NON-NLS-1$
    layout.addNewWizardShortcut("org.eclipse.ui.editors.wizards.UntitledTextFileWizard");//$NON-NLS-1$

    layout.addPerspectiveShortcut("net.sourceforge.czt.eclipse.ui.ZPerspective"); //$NON-NLS-1$
  }

}
