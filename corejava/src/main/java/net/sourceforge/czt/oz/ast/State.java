
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

package net.sourceforge.czt.oz.ast;

import net.sourceforge.czt.base.ast.*;
import net.sourceforge.czt.z.ast.*;

/**
 *
 * @author Gnast version 0.1
 */
public interface State extends Term
{

  /**
   * Returns the PrimaryDecl element.
   *
   * @return the PrimaryDecl element.
   */
  PrimaryDecl getPrimaryDecl();


  /**
   * Sets the PrimaryDecl element.
   *
   * @param primaryDecl   the PrimaryDecl element.
   * @see #getPrimaryDecl
   */
  void setPrimaryDecl(PrimaryDecl primaryDecl);

  /**
   * Returns the SecondaryDecl element.
   *
   * @return the SecondaryDecl element.
   */
  SecondaryDecl getSecondaryDecl();


  /**
   * Sets the SecondaryDecl element.
   *
   * @param secondaryDecl   the SecondaryDecl element.
   * @see #getSecondaryDecl
   */
  void setSecondaryDecl(SecondaryDecl secondaryDecl);

  /**
   * Returns the Pred element.
   *
   * @return the Pred element.
   */
  net.sourceforge.czt.z.ast.Pred getPred();


  /**
   * Sets the Pred element.
   *
   * @param pred   the Pred element.
   * @see #getPred
   */
  void setPred(net.sourceforge.czt.z.ast.Pred pred);

  /**
   * Returns the Box element.
   *
   * @return the Box element.
   */
  net.sourceforge.czt.z.ast.Box getBox();


  /**
   * Sets the Box element.
   *
   * @param box   the Box element.
   * @see #getBox
   */
  void setBox(net.sourceforge.czt.z.ast.Box box);
}
