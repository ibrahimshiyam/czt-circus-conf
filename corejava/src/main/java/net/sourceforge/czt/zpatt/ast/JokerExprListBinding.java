
/******************************************************************************
DO NOT EDIT THIS FILE!  THIS FILE WAS GENERATED BY GNAST
FROM THE TEMPLATE FILE AstInterface.vm.
ANY MODIFICATIONS TO THIS FILE WILL BE LOST UPON REGENERATION.

-------------------------------------------------------------------------------

Copyright 2003, 2004, 2005 Mark Utting
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
******************************************************************************/

package net.sourceforge.czt.zpatt.ast;

import net.sourceforge.czt.base.ast.*;
import net.sourceforge.czt.z.ast.*;

/**
 *
 * @author Gnast version 0.1
 */
public interface JokerExprListBinding extends Binding
{

  /**
   * Returns the JokerExprList element.
   *
   * @return the JokerExprList element.
   */
  JokerExprList getJokerExprList();


  /**
   * Sets the JokerExprList element.
   *
   * @param jokerExprList   the JokerExprList element.
   * @see #getJokerExprList
   */
  void setJokerExprList(JokerExprList jokerExprList);

  /**
   * Returns the ExprList element.
   *
   * @return the ExprList element.
   */
  net.sourceforge.czt.z.ast.ExprList getExprList();


  /**
   * This is a convenience method.
   * It returns a ZExprList if #getExprList
   * returns an instance of ZExprList
   * and throws an UnsupportedAstClassException otherwise.
   */
  ZExprList getZExprList();

  /**
   * Sets the ExprList element.
   *
   * @param exprList   the ExprList element.
   * @see #getExprList
   */
  void setExprList(net.sourceforge.czt.z.ast.ExprList exprList);
}
