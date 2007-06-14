/**
Copyright (C) 2006 Mark Utting
This file is part of the CZT project.

The CZT project contains free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 2 of the License, or
(at your option) any later version.

The CZT project is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with CZT; if not, write to the Free Software
Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
*/

package net.sourceforge.czt.animation.eval.result;

import net.sourceforge.czt.base.ast.Term;
import net.sourceforge.czt.z.impl.ExprImpl;

/** A superclass for most of the different kinds of result expressions
 *  generated by ZLive.  (It also generates some standard Expr
 *  objects, such as NumExpr and TupleExpr etc.)
 * @author marku
 */
public class EvalResult extends ExprImpl
{

  /** {@inheritDoc}
   *  EvalResult provides a default implementation of
   *  getChildren that returns an empty array of children.
   */
  public Object[] getChildren()
  {
    return new Object[0];
  }

  /** {@inheritDoc}
   *  EvalResult provides a default implementation of
   *  create that throws UnsupportedOperationException.
   */
  public Term create(Object[] args)
  {
    throw new UnsupportedOperationException("GivenValue.create(...)");
  }
}
