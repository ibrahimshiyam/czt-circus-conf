
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
 * Class reference type.
 *
 * @author Gnast version 0.1
 */
public interface ClassRefType extends ClassType
{

  /**
   * Returns the ThisClass element.
   *
   * @return the ThisClass element.
   */
  ClassRef getThisClass();


  /**
   * Sets the ThisClass element.
   *
   * @param thisClass   the ThisClass element.
   * @see #getThisClass
   */
  void setThisClass(ClassRef thisClass);

  /**
   * <p>Returns the SuperClass elements.</p>
   * <p>To add or remove elements, use the methods provided by
   * the List interface (that's why there is no need for a setter
   * method).</p>
   *
   * @return a list of ClassRef elements.
   */
  net.sourceforge.czt.base.ast.ListTerm<ClassRef> getSuperClass();

  /**
   * Returns the VisibilityList element.
   *
   * @return the VisibilityList element.
   */
  VisibilityList getVisibilityList();


  /**
   * Sets the VisibilityList element.
   *
   * @param visibilityList   the VisibilityList element.
   * @see #getVisibilityList
   */
  void setVisibilityList(VisibilityList visibilityList);

  /**
   * <p>Returns the Primary elements.</p>
   * <p>To add or remove elements, use the methods provided by
   * the List interface (that's why there is no need for a setter
   * method).</p>
   *
   * @return a list of DeclName elements.
   */
  net.sourceforge.czt.base.ast.ListTerm<net.sourceforge.czt.z.ast.DeclName> getPrimary();
}
