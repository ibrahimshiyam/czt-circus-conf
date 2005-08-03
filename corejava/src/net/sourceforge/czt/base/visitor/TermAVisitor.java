/*
  Copyright 2003, 2005 Mark Utting
  This file is part of the czt project.

  The czt project contains free software; you can redistribute it and/or modify
  it under the terms of the GNU General Public License as published by
  the Free Software Foundation; either version 2 of the License, or
  (at your option) any later version.

  The czt project is distributed in the hope that it will be useful,
  but WITHOUT ANY WARRANTY; without even the implied warranty of
  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  GNU General Public License for more details.

  You should have received a copy of the GNU General Public License
  along with czt; if not, write to the Free Software
  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
*/

package net.sourceforge.czt.base.visitor;

import net.sourceforge.czt.base.ast.TermA;
import net.sourceforge.czt.util.Visitor;

/**
 * A visitor for visiting annotated terms.
 */
public interface TermAVisitor<R> extends Visitor<R>
{
  /**
   * Visits a term.
   * @param  zedObject the Term to be visited.
   * @return some kind of <code>Object</code>.
   */
  R visitTermA(TermA zedObject);
}
