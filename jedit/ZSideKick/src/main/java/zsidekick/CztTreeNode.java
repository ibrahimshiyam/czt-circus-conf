/*
 * CztTreeNode.java
 * Copyright (C) 2006 Petra Malik
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package zsidekick;

import javax.swing.text.Position;
import javax.swing.tree.DefaultMutableTreeNode;

import org.gjt.sp.jedit.Buffer;

import net.sourceforge.czt.base.ast.*;
import net.sourceforge.czt.util.Visitor;
import net.sourceforge.czt.z.ast.*;

public class CztTreeNode
  extends DefaultMutableTreeNode
{
  private static Visitor<String> getShortStringVisitor_ =
    new ShortStringVisitor();
  private static Visitor<String> getLongStringVisitor_ =
    new LongStringVisitor();
  private static Visitor<Term[]> getChildrenVisitor_ =
    new GetChildrenVisitor();

  private Term term_;

  public CztTreeNode(Term term, Buffer buffer)
  {
    super(new CztAsset(term.accept(getShortStringVisitor_),
                       term.accept(getLongStringVisitor_),
                       getStart(term, buffer),
                       getEnd(term, buffer)));
    term_ = term;
    Term[] children = term.accept(getChildrenVisitor_);
    for (Term child : children) {
      add(new CztTreeNode(child, buffer));
    }
  }

  static private Position getStart(Term term, Buffer buffer)
  {
    int start = 0;
    if (term instanceof TermA) {
      TermA termA = (TermA) term;
      LocAnn locAnn = (LocAnn) termA.getAnn(LocAnn.class);
      if (locAnn != null) {
        start =
          buffer.getLineStartOffset(locAnn.getLine() - 1) + locAnn.getCol();
      }
    }
    return buffer.createPosition(start);
  }

  private static Position getEnd(Term term, Buffer buffer)
  {
    int end = buffer.getLength();
    return buffer.createPosition(end);
  }
}
