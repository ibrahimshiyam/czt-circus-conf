
/*
THIS FILE WAS GENERATED BY GNAST.
ANY MODIFICATIONS TO THIS FILE WILL BE LOST UPON REGENERATION.

************************************************************

Copyright 2003 Mark Utting
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
package net.sourceforge.czt.oz.ast;

import net.sourceforge.czt.base.ast.*;
import net.sourceforge.czt.z.ast.*;

/**
 *
 * @author Gnast version 0.1
 */
public interface ScopeEnrichOpExpr extends OperationExpr
{

  /**
   * Returns the LeftOperationExpr element.
   *
   * @return the LeftOperationExpr element.
   */
  public OperationExpr getLeftOperationExpr();

  /**
   * Sets the LeftOperationExpr element.
   *
   * @param leftOperationExpr   the LeftOperationExpr element.
   * @see #getLeftOperationExpr
   */
  public void setLeftOperationExpr(OperationExpr leftOperationExpr);

  /**
   * Returns the RightOperationExpr element.
   *
   * @return the RightOperationExpr element.
   */
  public OperationExpr getRightOperationExpr();

  /**
   * Sets the RightOperationExpr element.
   *
   * @param rightOperationExpr   the RightOperationExpr element.
   * @see #getRightOperationExpr
   */
  public void setRightOperationExpr(OperationExpr rightOperationExpr);
}
