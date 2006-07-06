
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

package net.sourceforge.czt.circus.ast;

import net.sourceforge.czt.base.ast.*;
import net.sourceforge.czt.z.ast.*;

/**
 * <p>
        Circus action reference call. In other words, it permits a name to be an action.
        That is, it contains a reference name to lookup the action definition.
        </p>
        <p>
        Moreover, it contains a list of expressions representing possible actual parameters.
        An empty list of expressions means a simple action call of the grammar rule <b>N</b>,
        where <b>N</b> is the action name.
        If the list of expressions is not empty, then the this is a parameterised action.
        It represents the grammar rule <b>N(Expr+)</b> for CSP actions and commands.
        </p>
        <p>
        The invariant is as follows:        
        <ul>
          <li>N        = nonempty name and empty parameters. </li>
          <li>N(Expr+) = nonempty parameters. Internal name for on-the-fly, user given name for previously declared action. </li>
        </ul>
        </p>
 *
 * @author Gnast version 0.1
 */
public interface CallAction extends CircusAction
{

  /**
   * Returns the RefName element.
   *
   * @return the RefName element.
   */
  net.sourceforge.czt.z.ast.RefName getRefName();


  /**
   * Sets the RefName element.
   *
   * @param refName   the RefName element.
   * @see #getRefName
   */
  void setRefName(net.sourceforge.czt.z.ast.RefName refName);

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
