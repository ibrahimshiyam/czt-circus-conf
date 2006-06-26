
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

package net.sourceforge.czt.z.impl;

import java.util.*;
import java.util.logging.*;

import net.sourceforge.czt.base.ast.*;
import net.sourceforge.czt.base.impl.*;
import net.sourceforge.czt.base.visitor.*;
import net.sourceforge.czt.util.Visitor;
import net.sourceforge.czt.z.ast.*;
import net.sourceforge.czt.z.visitor.*;

import net.sourceforge.czt.z.visitor.GivenParaVisitor;

/**
 * An implementation of the interface
 * {@link GivenPara}.
 *
 * @author Gnast version 0.1
 */
public class GivenParaImpl
  extends ParaImpl   implements GivenPara
{
  /**
   * The default constructor.
   *
   * Do not use it explicitly, unless you are extending this class.
   * If you want to create an instance of this class, please use the
   * {@link net.sourceforge.czt.z.ast.ZFactory object factory}.
   */
  protected GivenParaImpl()
  {
  }

  protected GivenParaImpl(BaseFactory factory)
  {
    super(factory);
  }

  /**
   * Compares the specified object with this GivenParaImpl
   * for equality.  Returns true if and only if the specified object is
   * also a(n) GivenParaImpl and all the getter methods except getAnns
   * return equal objects.
   */
  public boolean equals(Object obj)
  {
    if (obj != null) {
      if (this.getClass().equals(obj.getClass()) && super.equals(obj)) {
        GivenParaImpl object = (GivenParaImpl) obj;
        if (declNameList_ != null) {
          if (!declNameList_.equals(object.declNameList_)) {
            return false;
          }
        }
        else {
          if (object.declNameList_ != null) {
            return false;
          }
        }
        return true;
      }
    }
    return false;
  }

  /**
   * Returns the hash code value for this GivenParaImpl.
   */
  public int hashCode()
  {
    final int constant = 31;

    int hashCode = super.hashCode();
    hashCode += "GivenParaImpl".hashCode();
    if (declNameList_ != null) {
      hashCode += constant * declNameList_.hashCode();
    }
    return hashCode;
  }

  /**
   * Accepts a visitor.
   */
  public <R> R accept(net.sourceforge.czt.util.Visitor<R> v)
  {
    if (v instanceof GivenParaVisitor) {
      GivenParaVisitor<R> visitor = (GivenParaVisitor<R>) v;
      return visitor.visitGivenPara(this);
    }
    return super.accept(v);
  }

  /**
   * Returns a new object of this class.
   */
  public GivenParaImpl create(Object[] args)
  {
    GivenParaImpl zedObject = null;
    try {
      DeclNameList declNameList = (DeclNameList) args[0];
      zedObject = new GivenParaImpl(getFactory());
      zedObject.setDeclNameList(declNameList);
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
    Object[] erg = { getDeclNameList() };
    return erg;
  }

  private DeclNameList declNameList_;

  public DeclNameList getDeclNameList()
  {
    return declNameList_;
  }

  public void setDeclNameList(DeclNameList declNameList)
  {
    declNameList_ = declNameList;
  }

  public ZDeclNameList getDeclNames()
  {
    DeclNameList dnl = getDeclNameList();
    if (dnl instanceof ZDeclNameList) {
      return (ZDeclNameList) dnl;
    }
    throw new net.sourceforge.czt.base.util.UnsupportedAstClassException();
  }
}
