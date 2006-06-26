
/******************************************************************************
DO NOT EDIT THIS FILE!  THIS FILE WAS GENERATED BY GNAST
FROM THE TEMPLATE FILE AstClass.vm.
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

package net.sourceforge.czt.zpatt.impl;

import java.util.*;
import java.util.logging.*;

import net.sourceforge.czt.base.ast.*;
import net.sourceforge.czt.base.impl.*;
import net.sourceforge.czt.base.visitor.*;
import net.sourceforge.czt.util.Visitor;
import net.sourceforge.czt.z.ast.*;
import net.sourceforge.czt.z.impl.*;
import net.sourceforge.czt.zpatt.ast.*;
import net.sourceforge.czt.zpatt.visitor.*;

import net.sourceforge.czt.zpatt.visitor.JokerDeclListVisitor;

/**
 * An implementation of the interface
 * {@link JokerDeclList}.
 *
 * @author Gnast version 0.1
 */
public class JokerDeclListImpl
  extends DeclListImpl   implements JokerDeclList
{
  /**
   * The default constructor.
   *
   * Do not use it explicitly, unless you are extending this class.
   * If you want to create an instance of this class, please use the
   * {@link net.sourceforge.czt.zpatt.ast.ZpattFactory object factory}.
   */
  protected JokerDeclListImpl()
  {
  }

  protected JokerDeclListImpl(BaseFactory factory)
  {
    super(factory);
  }

  /**
   * Compares the specified object with this JokerDeclListImpl
   * for equality.  Returns true if and only if the specified object is
   * also a(n) JokerDeclListImpl and all the getter methods except getAnns
   * return equal objects.
   */
  public boolean equals(Object obj)
  {
    if (obj != null) {
      if (this.getClass().equals(obj.getClass()) && super.equals(obj)) {
        JokerDeclListImpl object = (JokerDeclListImpl) obj;
        if (name_ != null) {
          if (!name_.equals(object.name_)) {
            return false;
          }
        }
        else {
          if (object.name_ != null) {
            return false;
          }
        }
        return true;
      }
    }
    return false;
  }

  /**
   * Returns the hash code value for this JokerDeclListImpl.
   */
  public int hashCode()
  {
    final int constant = 31;

    int hashCode = super.hashCode();
    hashCode += "JokerDeclListImpl".hashCode();
    if (name_ != null) {
      hashCode += constant * name_.hashCode();
    }
    return hashCode;
  }

  /**
   * Accepts a visitor.
   */
  public <R> R accept(net.sourceforge.czt.util.Visitor<R> v)
  {
    if (v instanceof JokerDeclListVisitor) {
      JokerDeclListVisitor<R> visitor = (JokerDeclListVisitor<R>) v;
      return visitor.visitJokerDeclList(this);
    }
    return super.accept(v);
  }

  /**
   * Returns a new object of this class.
   */
  public JokerDeclListImpl create(Object[] args)
  {
    JokerDeclListImpl zedObject = null;
    try {
      String name = (String) args[0];
      zedObject = new JokerDeclListImpl(getFactory());
      zedObject.setName(name);
    }
    catch (IndexOutOfBoundsException e) {
      throw new IllegalArgumentException();
    }
    catch (ClassCastException e) {
      throw new IllegalArgumentException();
    }
    return zedObject;
  }

  public Object[] getChildren()
  {
    Object[] erg = { getName() };
    return erg;
  }

  private String name_;

  public String getName()
  {
    return name_;
  }

  public void setName(String name)
  {
    name_ = name;
  }
}
