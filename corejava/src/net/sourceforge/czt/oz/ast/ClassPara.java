
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
public interface ClassPara extends Para
{

  /**
   * Returns the Name element.
   *
   * @return the Name element.
   */
  public net.sourceforge.czt.z.ast.DeclName getName();

  /**
   * Sets the Name element.
   *
   * @param name   the Name element.
   * @see #getName
   */
  public void setName(net.sourceforge.czt.z.ast.DeclName name);

  /**
   * Returns the FormalParameters element.
   *
   * @return the FormalParameters element.
   */
  public FormalParameters getFormalParameters();

  /**
   * Sets the FormalParameters element.
   *
   * @param formalParameters   the FormalParameters element.
   * @see #getFormalParameters
   */
  public void setFormalParameters(FormalParameters formalParameters);

  /**
   * Returns the VisibilityList element.
   *
   * @return the VisibilityList element.
   */
  public DeclNameList getVisibilityList();

  /**
   * Sets the VisibilityList element.
   *
   * @param visibilityList   the VisibilityList element.
   * @see #getVisibilityList
   */
  public void setVisibilityList(DeclNameList visibilityList);

  /**
   * <p>Returns the InheritedClass elements.</p>
   * <p>To add or remove elements, use the methods provided by
   * the List interface (that's why there is no need for a setter
   * method).</p>
   *
   * @return a list of InheritedClass elements.
   */
  public java.util.List getInheritedClass();

  /**
   * Returns the LocalDef element.
   *
   * @return the LocalDef element.
   */
  public LocalDef getLocalDef();

  /**
   * Sets the LocalDef element.
   *
   * @param localDef   the LocalDef element.
   * @see #getLocalDef
   */
  public void setLocalDef(LocalDef localDef);

  /**
   * Returns the State element.
   *
   * @return the State element.
   */
  public State getState();

  /**
   * Sets the State element.
   *
   * @param state   the State element.
   * @see #getState
   */
  public void setState(State state);

  /**
   * Returns the InitialState element.
   *
   * @return the InitialState element.
   */
  public InitialState getInitialState();

  /**
   * Sets the InitialState element.
   *
   * @param initialState   the InitialState element.
   * @see #getInitialState
   */
  public void setInitialState(InitialState initialState);

  /**
   * <p>Returns the Operation elements.</p>
   * <p>To add or remove elements, use the methods provided by
   * the List interface (that's why there is no need for a setter
   * method).</p>
   *
   * @return a list of Operation elements.
   */
  public java.util.List getOperation();
}
