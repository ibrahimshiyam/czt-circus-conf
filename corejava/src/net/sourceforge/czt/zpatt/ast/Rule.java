
/******************************************************************************
DO NOT EDIT THIS FILE!  THIS FILE WAS GENERATED BY GNAST
FROM THE TEMPLATE FILE AstInterface.vm.
ANY MODIFICATIONS TO THIS FILE WILL BE LOST UPON REGENERATION.

-------------------------------------------------------------------------------

Copyright 2003, 2004 Mark Utting
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
 * This is a proof/transformation rule with one conclusion sequent
        (the FIRST in the list of sequents) and optionally, several
        antecedent sequents.  
        Each sequent has the form Context |- Fact.
        The conclusion sequent must be a PredSequent.
 *
 * @author Gnast version 0.1
 */
public interface Rule extends Para
{

  /**
   * <p>Returns the Sequent elements.</p>
   * <p>To add or remove elements, use the methods provided by
   * the List interface (that's why there is no need for a setter
   * method).</p>
   *
   * @return a list of Sequent elements.
   */
  net.sourceforge.czt.base.ast.ListTerm getSequent();

  /**
   * Returns the Name element.
   *
   * @return the Name element.
   */
  String getName();

  /**
   * Sets the Name element.
   *
   * @param name   the Name element.
   * @see #getName
   */
  void setName(String name);
}
