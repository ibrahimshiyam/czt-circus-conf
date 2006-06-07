/**
 * 
 */
package net.sourceforge.czt.eclipse.editors;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.Region;
import org.eclipse.jface.text.source.ICharacterPairMatcher;

/**
 * Matching pairs of brackets
 * @author Chengdong Xu
 */
public class ZPairMatcher implements ICharacterPairMatcher
{
  
  protected char[] fPairs;
  protected IDocument fDocument;
  protected int fOffset;

  protected int fStartPos;
  protected int fEndPos;
  protected int fAnchor;
  
  /**
     * Stores the source version state.
     * @since 3.1
     */
  private boolean fHighlightAngularBrackets= false;

  /**
   * 
   */
  public ZPairMatcher(char[] pairs)
  {
    fPairs= pairs;
  }
  
  /* (non-Javadoc)
   * @see org.eclipse.jface.text.source.ICharacterPairMatcher#match(org.eclipse.jface.text.IDocument, int)
   */
  public IRegion match(IDocument document, int offset)
  {
    fOffset= offset;

    if (fOffset < 0)
        return null;

    fDocument = document;

    if (fDocument != null && matchPairsAt() && fStartPos != fEndPos)
        return new Region(fStartPos, fEndPos - fStartPos + 1);

    return null;
  }
  
  /* (non-Javadoc)
   * @see org.eclipse.jface.text.source.ICharacterPairMatcher#getAnchor()
   */
  public int getAnchor()
  {
    return fAnchor;
  }
  
  /* (non-Javadoc)
   * @see org.eclipse.jface.text.source.ICharacterPairMatcher#dispose()
   */
  public void dispose()
  {
    clear();
    fDocument= null;
  }

  /* (non-Javadoc)
   * @see org.eclipse.jface.text.source.ICharacterPairMatcher#clear()
   */
  public void clear()
  {
    
  }
  
    protected boolean matchPairsAt() {

        int i;
        int pairIndex1= fPairs.length;
        int pairIndex2= fPairs.length;

        fStartPos= -1;
        fEndPos= -1;

        // get the char preceding the start position
        try {

            char prevChar= fDocument.getChar(Math.max(fOffset - 1, 0));
            // search for opening peer character next to the activation point
            for (i= 0; i < fPairs.length; i= i + 2) {
                if (prevChar == fPairs[i]) {
                    fStartPos= fOffset - 1;
                    pairIndex1= i;
                }
            }

            // search for closing peer character next to the activation point
            for (i= 1; i < fPairs.length; i= i + 2) {
                if (prevChar == fPairs[i]) {
                    fEndPos= fOffset - 1;
                    pairIndex2= i;
                }
            }

            if (fEndPos > -1) {
                fAnchor= RIGHT;
                fStartPos= searchForOpeningPeer(fEndPos, fPairs[pairIndex2 - 1], fPairs[pairIndex2], fDocument);
                if (fStartPos > -1)
                    return true;
                else
                    fEndPos= -1;
            }   else if (fStartPos > -1) {
                fAnchor= LEFT;
                fEndPos= searchForClosingPeer(fStartPos, fPairs[pairIndex1], fPairs[pairIndex1 + 1], fDocument);
                if (fEndPos > -1)
                    return true;
                else
                    fStartPos= -1;
            }

        } catch (BadLocationException x) {
        }

        return false;
    }

    protected int searchForClosingPeer(int offset, char openingPeer, char closingPeer, IDocument document) throws BadLocationException {
      /*
       boolean useGenericsHeuristic= openingPeer == '<';
        if (useGenericsHeuristic && !fHighlightAngularBrackets)
            return -1;
        JavaHeuristicScanner scanner= new JavaHeuristicScanner(document, IJavaPartitions.JAVA_PARTITIONING, TextUtilities.getContentType(document, IJavaPartitions.JAVA_PARTITIONING, offset, false));
        if (useGenericsHeuristic && !isTypeParameterBracket(offset, document, scanner))
            return -1;

        return scanner.findClosingPeer(offset + 1, openingPeer, closingPeer);
       */
      for(;offset < document.getLength(); offset++)
        if (document.getChar(offset) == closingPeer)
          return offset;
      
      return -1;
    }


    protected int searchForOpeningPeer(int offset, char openingPeer, char closingPeer, IDocument document) throws BadLocationException {
      /*
      boolean useGenericsHeuristic= openingPeer == '<';
        if (useGenericsHeuristic && !fHighlightAngularBrackets)
            return -1;

        JavaHeuristicScanner scanner= new JavaHeuristicScanner(document, IJavaPartitions.JAVA_PARTITIONING, TextUtilities.getContentType(document, IJavaPartitions.JAVA_PARTITIONING, offset, false));
        int peer= scanner.findOpeningPeer(offset - 1, openingPeer, closingPeer);
        if (peer == JavaHeuristicScanner.NOT_FOUND)
            return -1;
        if (useGenericsHeuristic && !isTypeParameterBracket(peer, document, scanner))
            return -1;
        return peer;
        */
      for(;offset > -1; offset--)
        if (document.getChar(offset) == openingPeer)
          return offset;
      
      return -1;
    }
}
