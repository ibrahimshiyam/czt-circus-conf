
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

package net.sourceforge.czt.z.ast;

import net.sourceforge.czt.base.ast.*;

/**
 * A specification (C.2).
 *
 * @author Gnast version 0.1
 */
public interface Spec extends TermA
{

  /**
   * <p>Returns the Sect elements.</p>
   * <p>To add or remove elements, use the methods provided by
   * the List interface (that's why there is no need for a setter
   * method).</p>
   *
   * @return a list of Sect elements.
   */
  net.sourceforge.czt.base.ast.ListTerm getSect();

  /**
   * Returns the Version element.
   *
   * @return the Version element.
   */
  String getVersion();

  /**
   * Sets the Version element.
   *
   * @param version   the Version element.
   * @see #getVersion
   */
  void setVersion(String version);

  /**
   * Returns the Author element.
   *
   * @return the Author element.
   */
  String getAuthor();

  /**
   * Sets the Author element.
   *
   * @param author   the Author element.
   * @see #getAuthor
   */
  void setAuthor(String author);

  /**
   * Returns the Modified element.
   *
   * @return the Modified element.
   */
  java.util.Calendar getModified();

  /**
   * Sets the Modified element.
   *
   * @param modified   the Modified element.
   * @see #getModified
   */
  void setModified(java.util.Calendar modified);

  /**
   * Returns the Source element.
   *
   * @return the Source element.
   */
  String getSource();

  /**
   * Sets the Source element.
   *
   * @param source   the Source element.
   * @see #getSource
   */
  void setSource(String source);
}
