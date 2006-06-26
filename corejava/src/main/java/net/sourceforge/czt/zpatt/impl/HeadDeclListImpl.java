
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

import net.sourceforge.czt.zpatt.visitor.HeadDeclListVisitor;

/**
 * An implementation of the interface
 * {@link HeadDeclList}.
 *
 * @author Gnast version 0.1
 */
public class HeadDeclListImpl
  extends DeclListImpl   implements HeadDeclList
{
  /**
   * The default constructor.
   *
   * Do not use it explicitly, unless you are extending this class.
   * If you want to create an instance of this class, please use the
   * {@link net.sourceforge.czt.zpatt.ast.ZpattFactory object factory}.
   */
  protected HeadDeclListImpl()
  {
  }

  protected HeadDeclListImpl(BaseFactory factory)
  {
    super(factory);
  }

  /**
   * Compares the specified object with this HeadDeclListImpl
   * for equality.  Returns true if and only if the specified object is
   * also a(n) HeadDeclListImpl and all the getter methods except getAnns
   * return equal objects.
   */
  public boolean equals(Object obj)
  {
    if (obj != null) {
      if (this.getClass().equals(obj.getClass()) && super.equals(obj)) {
        HeadDeclListImpl object = (HeadDeclListImpl) obj;
        if (zDeclList_ != null) {
          if (!zDeclList_.equals(object.zDeclList_)) {
            return false;
          }
        }
        else {
          if (object.zDeclList_ != null) {
            return false;
          }
        }
        if (jokerDeclList_ != null) {
          if (!jokerDeclList_.equals(object.jokerDeclList_)) {
            return false;
          }
        }
        else {
          if (object.jokerDeclList_ != null) {
            return false;
          }
        }
        return true;
      }
    }
    return false;
  }

  /**
   * Returns the hash code value for this HeadDeclListImpl.
   */
  public int hashCode()
  {
    final int constant = 31;

    int hashCode = super.hashCode();
    hashCode += "HeadDeclListImpl".hashCode();
    if (zDeclList_ != null) {
      hashCode += constant * zDeclList_.hashCode();
    }
    if (jokerDeclList_ != null) {
      hashCode += constant * jokerDeclList_.hashCode();
    }
    return hashCode;
  }

  /**
   * Accepts a visitor.
   */
  public <R> R accept(net.sourceforge.czt.util.Visitor<R> v)
  {
    if (v instanceof HeadDeclListVisitor) {
      HeadDeclListVisitor<R> visitor = (HeadDeclListVisitor<R>) v;
      return visitor.visitHeadDeclList(this);
    }
    return super.accept(v);
  }

  /**
   * Returns a new object of this class.
   */
  public HeadDeclListImpl create(Object[] args)
  {
    HeadDeclListImpl zedObject = null;
    try {
      net.sourceforge.czt.z.ast.ZDeclList zDeclList = (net.sourceforge.czt.z.ast.ZDeclList) args[0];
      JokerDeclList jokerDeclList = (JokerDeclList) args[1];
      zedObject = new HeadDeclListImpl(getFactory());
      zedObject.setZDeclList(zDeclList);
      zedObject.setJokerDeclList(jokerDeclList);
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
    Object[] erg = { getZDeclList(), getJokerDeclList() };
    return erg;
  }

  private net.sourceforge.czt.z.ast.ZDeclList zDeclList_;

  public net.sourceforge.czt.z.ast.ZDeclList getZDeclList()
  {
    return zDeclList_;
  }

  public void setZDeclList(net.sourceforge.czt.z.ast.ZDeclList zDeclList)
  {
    zDeclList_ = zDeclList;
  }

  private JokerDeclList jokerDeclList_;

  public JokerDeclList getJokerDeclList()
  {
    return jokerDeclList_;
  }

  public void setJokerDeclList(JokerDeclList jokerDeclList)
  {
    jokerDeclList_ = jokerDeclList;
  }

  public List getList()
  {
    return getZDeclList();
  }

  public Object getJoker()
  {
    return getJokerDeclList();
  }
}
