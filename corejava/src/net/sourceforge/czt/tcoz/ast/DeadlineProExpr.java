
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

package net.sourceforge.czt.tcoz.ast;

import net.sourceforge.czt.base.ast.*;
import net.sourceforge.czt.z.ast.*;
import net.sourceforge.czt.oz.ast.*;

/**
 *
 * @author Gnast version 0.1
 */
public interface DeadlineProExpr extends OpExpr
{

  /**
   * Returns the OpExpr element.
   *
   * @return the OpExpr element.
   */
  net.sourceforge.czt.oz.ast.OpExpr getOpExpr();

  /**
   * Sets the OpExpr element.
   *
   * @param opExpr   the OpExpr element.
   * @see #getOpExpr
   */
  void setOpExpr(net.sourceforge.czt.oz.ast.OpExpr opExpr);

  /**
   * Returns the Deadline element.
   *
   * @return the Deadline element.
   */
  net.sourceforge.czt.z.ast.Expr1 getDeadline();

  /**
   * Sets the Deadline element.
   *
   * @param deadline   the Deadline element.
   * @see #getDeadline
   */
  void setDeadline(net.sourceforge.czt.z.ast.Expr1 deadline);
}
