
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

package net.sourceforge.czt.oz.impl;

import java.util.*;
import java.util.logging.*;

import net.sourceforge.czt.base.ast.*;
import net.sourceforge.czt.base.impl.*;
import net.sourceforge.czt.base.visitor.*;
import net.sourceforge.czt.util.Visitor;
import net.sourceforge.czt.z.ast.*;
import net.sourceforge.czt.z.impl.*;
import net.sourceforge.czt.oz.ast.*;
import net.sourceforge.czt.oz.visitor.*;

import net.sourceforge.czt.oz.visitor.HideOpExprVisitor;

/**
 * An implementation of the interface
 * {@link HideOpExpr}.
 *
 * @author Gnast version 0.1
 */
public class HideOpExprImpl
  extends OpExprImpl   implements HideOpExpr
{
  /**
   * The default constructor.
   *
   * Do not use it explicitly, unless you are extending this class.
   * If you want to create an instance of this class, please use the
   * {@link net.sourceforge.czt.oz.ast.OzFactory object factory}.
   */
  protected HideOpExprImpl()
  {
  }

  protected HideOpExprImpl(BaseFactory factory)
  {
    super(factory);
  }

  /**
   * Compares the specified object with this HideOpExprImpl
   * for equality.  Returns true if and only if the specified object is
   * also a(n) HideOpExprImpl and all the getter methods except getAnns
   * return equal objects.
   */
  public boolean equals(Object obj)
  {
    if (obj != null) {
      if (this.getClass().equals(obj.getClass()) && super.equals(obj)) {
        HideOpExprImpl object = (HideOpExprImpl) obj;
        if (opExpr_ != null) {
          if (!opExpr_.equals(object.opExpr_)) {
            return false;
          }
        }
        else {
          if (object.opExpr_ != null) {
            return false;
          }
        }
        if (refNameList_ != null) {
          if (!refNameList_.equals(object.refNameList_)) {
            return false;
          }
        }
        else {
          if (object.refNameList_ != null) {
            return false;
          }
        }
        return true;
      }
    }
    return false;
  }

  /**
   * Returns the hash code value for this HideOpExprImpl.
   */
  public int hashCode()
  {
    final int constant = 31;

    int hashCode = super.hashCode();
    hashCode += "HideOpExprImpl".hashCode();
    if (opExpr_ != null) {
      hashCode += constant * opExpr_.hashCode();
    }
    if (refNameList_ != null) {
      hashCode += constant * refNameList_.hashCode();
    }
    return hashCode;
  }

  /**
   * Accepts a visitor.
   */
  public <R> R accept(net.sourceforge.czt.util.Visitor<R> v)
  {
    if (v instanceof HideOpExprVisitor) {
      HideOpExprVisitor<R> visitor = (HideOpExprVisitor<R>) v;
      return visitor.visitHideOpExpr(this);
    }
    return super.accept(v);
  }

  /**
   * Returns a new object of this class.
   */
  public HideOpExprImpl create(Object[] args)
  {
    HideOpExprImpl zedObject = null;
    try {
      OpExpr opExpr = (OpExpr) args[0];
      net.sourceforge.czt.z.ast.RefNameList refNameList = (net.sourceforge.czt.z.ast.RefNameList) args[1];
      zedObject = new HideOpExprImpl(getFactory());
      zedObject.setOpExpr(opExpr);
      zedObject.setRefNameList(refNameList);
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
    Object[] erg = { getOpExpr(), getRefNameList() };
    return erg;
  }

  private OpExpr opExpr_;

  public OpExpr getOpExpr()
  {
    return opExpr_;
  }

  public void setOpExpr(OpExpr opExpr)
  {
    opExpr_ = opExpr;
  }

  private net.sourceforge.czt.z.ast.RefNameList refNameList_;

  public net.sourceforge.czt.z.ast.RefNameList getRefNameList()
  {
    return refNameList_;
  }

  public void setRefNameList(net.sourceforge.czt.z.ast.RefNameList refNameList)
  {
    refNameList_ = refNameList;
  }
  /**
   * This is a convenience method.
   * It returns a ZRefNameList if #getRefNameList
   * returns an instance of ZRefNameList
   * and throws an UnsupportedAstClassException otherwise.
   */
  public ZRefNameList getZRefNameList()
  {
    RefNameList object = getRefNameList();
    if (object instanceof ZRefNameList) {
      return (ZRefNameList) object;
    }
    throw new net.sourceforge.czt.base.util.UnsupportedAstClassException();
  }
  /**
   * This is a convenience method.
   * It returns the list of RefName if the RefNameList is an instance of
   * ZRefNameList and throws an UnsupportedAstClassException otherwise.
   */
  public ZRefNameList getName()
  {
    RefNameList refNameList = getRefNameList();
    if (refNameList instanceof ZRefNameList) {
      return ((ZRefNameList) refNameList).getRefName();
    }
    throw new net.sourceforge.czt.base.util.UnsupportedAstClassException();
  }

}
