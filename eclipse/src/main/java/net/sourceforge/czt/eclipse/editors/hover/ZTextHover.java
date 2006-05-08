/**
 * 
 */
package net.sourceforge.czt.eclipse.editors.hover;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.sourceforge.czt.base.ast.Term;
import net.sourceforge.czt.eclipse.editors.ZCharacter;
import net.sourceforge.czt.eclipse.editors.parser.Triple;
import net.sourceforge.czt.eclipse.editors.visitor.NodeNameVisitor;
import net.sourceforge.czt.eclipse.editors.zeditor.ZEditor;
import net.sourceforge.czt.eclipse.util.Selector;
import net.sourceforge.czt.util.Visitor;
import net.sourceforge.czt.z.ast.Expr;
import net.sourceforge.czt.z.ast.TypeAnn;
import net.sourceforge.czt.z.ast.ZDeclName;
import net.sourceforge.czt.z.ast.ZRefName;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextHover;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.Region;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.IAnnotationModel;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.ISourceViewerExtension2;
import org.eclipse.jface.text.source.projection.AnnotationBag;
import org.eclipse.ui.texteditor.ITextEditor;

/**
 * The ZTextHover provides the text hover support for Z editors.
 * Provides a hover popup which appears on top of an editor with relevant
 * display information. If the text hover does not provide information no
 * hover popup is shown.
 * <p>
 * Clients may implement this interface.
 * </p>
 *
 * @see org.eclipse.ui.IEditorPart
 * @see org.eclipse.jface.text.ITextHover
 *
 * @since 2.0
 * @author Chengdong Xu
 */
public class ZTextHover implements ITextHover {

	private ISourceViewer fSourceViewer;
	private String fContentType;
	private ITextEditor fTextEditor;
	private static Visitor<String> getNodeNameVisitor = new NodeNameVisitor();
	
	public ZTextHover(ISourceViewer sourceViewer, String contentType, ITextEditor editor) {
		super();
		this.fSourceViewer = sourceViewer;
		this.fContentType = contentType;
		this.fTextEditor = editor;
	}
	
	public ITextEditor getEditor() {
		return this.fTextEditor;
	}
	
	public void setEditor(ITextEditor editor) {
		this.fTextEditor = editor;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.jface.text.ITextHover#getHoverInfo(org.eclipse.jface.text.ITextViewer, org.eclipse.jface.text.IRegion)
	 */
	public String getHoverInfo(ITextViewer textViewer, IRegion hoverRegion) {
		// TODO Auto-generated method stub
		if (hoverRegion == null)
			return null;
		List zAnnotations= getZAnnotationsForPoint(this.fSourceViewer, hoverRegion.getOffset());
		if (zAnnotations != null) {
			if (zAnnotations.size() == 1) {
				// optimization
				Annotation annotation= (Annotation) zAnnotations.get(0);
				String message= annotation.getText();
				if (message != null && message.trim().length() > 0)
					return formatSingleMessage(message);
			} else {
				List messages= new ArrayList();

				Iterator e= zAnnotations.iterator();
				while (e.hasNext()) {
					Annotation annotation= (Annotation) e.next();
					String message= annotation.getText();
					if (message != null && message.trim().length() > 0)
						messages.add(message.trim());
				}

				if (messages.size() == 1)
					return formatSingleMessage((String) messages.get(0));
				if (messages.size() > 1)
					return formatMultipleMessages(messages);
			}
		}
		String info = getInfoOfTerm(getTermOfRegion(hoverRegion));
		if (info != null)
			return info;
		
		return formatSingleMessage(getTypeOfWord(textViewer.getDocument(), hoverRegion));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.text.ITextHover#getHoverRegion(org.eclipse.jface.text.ITextViewer, int)
	 */
	public IRegion getHoverRegion(ITextViewer textViewer, int offset) {
		return findWordOfOffset(textViewer.getDocument(), offset);
	}
	
	private IRegion findWordOfOffset(IDocument document, int offset) {
		int regionStart = offset, regionEnd = offset;
		int line;
		int lineStart, lineEnd;
		try {
			if (!ZCharacter.isZWordPart(document.getChar(offset))) {
				return new Region(offset,1);
			}
			
			line = document.getLineOfOffset(offset);
			lineStart = document.getLineOffset(line);
			lineEnd = lineStart + document.getLineLength(line) - 1;
			for (; regionStart >= lineStart; regionStart--)
				if (!ZCharacter.isZWordPart(document.getChar(regionStart))) {
					break;
				}
			regionStart++;
			
			for (; regionEnd <= lineEnd; regionEnd++)
				if (!ZCharacter.isZWordPart(document.getChar(regionEnd))) {
					break;
				}
			regionEnd--;
					
			return new Region(regionStart, regionEnd - regionStart + 1);	
			
		} catch (BadLocationException ble) {
		}
		
		return null;
	}
	
	private String getTypeOfWord(IDocument document, IRegion word) {
		String name = null;
		try {
			name = document.get(word.getOffset(), word.getLength());
		} catch(BadLocationException ble) {
			return null;
		}
		
		if (getEditor() instanceof ZEditor) {

		}
		return name;
	}
	
	private String getInfoOfTerm(Term term) {
		if (term == null)
			return null;
		
		if (term instanceof ZDeclName) {
			List<Triple> triples = ((ZEditor)getEditor()).getParsedData().getNameSectTypeTriples();
			Triple triple = null;
			for (int index = 0; index < triples.size(); index++) {
				triple = triples.get(index);
				if (term.equals(triple.getDeclName()))
					return triple.getType();
			}
		}
		else if (term instanceof ZRefName) {
			return getInfoOfTerm(((ZRefName)term).getDecl());
		}
		if (term instanceof Expr) {
			TypeAnn typeAnn = (TypeAnn)term.getAnn(TypeAnn.class);
			if (typeAnn != null) {
				if (typeAnn.getType() != null)
					return String.valueOf(typeAnn.getType());
			}
		}
		
		return null;
	}
	
	private Term getTermOfRegion(IRegion region) {
		if (getEditor() instanceof ZEditor) {
			Selector selector = new Selector(((ZEditor)getEditor()).getParsedData().getSpec());
			if (selector != null) {
				int offset = region.getOffset();
				int length = region.getLength();
				Position pos = new Position(offset, length);
				Term term = selector.getTerm(pos);
				return term;
			}
		}
		return null;
	}
	
	/** 
	 * The ZAnnotationHover provides the hover support for Z editors.
	 */
	private IAnnotationModel getAnnotationModel(ISourceViewer viewer) {
		if (viewer instanceof ISourceViewerExtension2) {
			ISourceViewerExtension2 extension= (ISourceViewerExtension2) viewer;
			return extension.getVisualAnnotationModel();
		}
		return viewer.getAnnotationModel();
	}
	
	private boolean isRulerPoint(Position position, IDocument document, int offset) {
		int offsetOfPos = position.getOffset();
		
		return offsetOfPos <= offset && offset < offsetOfPos + position.getLength();
	}

	private boolean isDuplicateZAnnotation(Map messagesAtPosition, Position position, String message) {
		if (messagesAtPosition.containsKey(position)) {
			Object value= messagesAtPosition.get(position);
			if (message.equals(value))
				return true;

			if (value instanceof List) {
				List messages= (List)value;
				if  (messages.contains(message))
					return true;
				else
					messages.add(message);
			}
			else {
				ArrayList messages= new ArrayList();
				messages.add(value);
				messages.add(message);
				messagesAtPosition.put(position, messages);
			}
		} 
		else
			messagesAtPosition.put(position, message);
			
		return false;
	}

	private List getZAnnotationsForPoint(ISourceViewer viewer, int offset) {
		IAnnotationModel model= getAnnotationModel(viewer);
		if (model == null)
			return null;

		IDocument document= viewer.getDocument();
		List zAnnotations= new ArrayList();
		HashMap messagesAtPosition= new HashMap();
		Iterator iterator= model.getAnnotationIterator();

		while (iterator.hasNext()) {
			Annotation annotation= (Annotation) iterator.next();
			if (!annotation.getType().equals("org.eclipse.ui.workbench.texteditor.error"))
				continue;
			Position position= model.getPosition(annotation);
			if (position == null)
				continue;
			if (!isRulerPoint(position, document, offset))
				continue;
			if (annotation instanceof AnnotationBag) {
				AnnotationBag bag= (AnnotationBag) annotation;
				Iterator e= bag.iterator();
				while (e.hasNext()) {
					annotation= (Annotation) e.next();
					position= model.getPosition(annotation);
//					if (position != null && includeAnnotation(annotation, position, messagesAtPosition))
					if (position != null)
						zAnnotations.add(annotation);
				}
				continue;
			}

			zAnnotations.add(annotation);
		}

		return zAnnotations;
	}

	/*
	 * Formats a message as text.
	 */
	private String formatSingleMessage(String message) {
/*		
		StringBuffer buffer= new StringBuffer();
		HTMLPrinter.addPageProlog(buffer);
		HTMLPrinter.addParagraph(buffer, HTMLPrinter.convertToHTMLContent(message));
		HTMLPrinter.addPageEpilog(buffer);
		return buffer.toString();
*/
			
		return message;
	}

	/*
	 * Formats multiple message as text.
	 */
	private String formatMultipleMessages(List messages) {
/*		
		StringBuffer buffer= new StringBuffer();
		HTMLPrinter.addPageProlog(buffer);
		HTMLPrinter.addParagraph(buffer, HTMLPrinter.convertToHTMLContent(JavaUIMessages.JavaAnnotationHover_multipleMarkersAtThisLine));
		HTMLPrinter.startBulletList(buffer);
		Iterator e= messages.iterator();
		while (e.hasNext())
			HTMLPrinter.addBullet(buffer, HTMLPrinter.convertToHTMLContent((String) e.next()));
		HTMLPrinter.endBulletList(buffer);

		HTMLPrinter.addPageEpilog(buffer);
		return buffer.toString();
*/

		StringBuffer buffer = new StringBuffer();
		buffer.append("Multiple markers at this line:\n");

		Iterator e = messages.iterator();
		while (e.hasNext()) {
			buffer.append("\t- " + (String)e.next() + "\n");
		}
		return buffer.toString();
	}
}
