
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
package net.sourceforge.czt.core.ast;

import net.sourceforge.czt.core.util.*;

/**
 * A member operator application (C.5.12).  The mixfix attribute distinguishes m = n (mixfix=true) from (m,n) in (_ = _) (mixfix=false).
 *
 * @author Gnast version 0.1
 */
public interface MemPred extends Pred
{

  /**
   * Returns the LeftExpr element.
   *
   * @return the LeftExpr element.
   */
  public Expr getLeftExpr();

  /**
   * Sets the LeftExpr element.
   *
   * @param leftExpr   the LeftExpr element.
   * @see #getLeftExpr
   */
  public void setLeftExpr(Expr leftExpr);

  /**
   * Returns the RightExpr element.
   *
   * @return the RightExpr element.
   */
  public Expr getRightExpr();

  /**
   * Sets the RightExpr element.
   *
   * @param rightExpr   the RightExpr element.
   * @see #getRightExpr
   */
  public void setRightExpr(Expr rightExpr);

  /**
   * Returns the Mixfix element.
   *
   * @return the Mixfix element.
   */
  public Boolean getMixfix();

  /**
   * Sets the Mixfix element.
   *
   * @param mixfix   the Mixfix element.
   * @see #getMixfix
   */
  public void setMixfix(Boolean mixfix);
}
