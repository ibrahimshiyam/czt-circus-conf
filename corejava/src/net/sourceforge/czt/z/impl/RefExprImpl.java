
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

package net.sourceforge.czt.z.impl;

import java.util.*;
import java.util.logging.*;

import net.sourceforge.czt.base.impl.*;
import net.sourceforge.czt.z.ast.*;
import net.sourceforge.czt.z.visitor.*;

import net.sourceforge.czt.z.visitor.RefExprVisitor;

/**
 * An implementation of the interface
 * {@link RefExpr}.
 *
 * @author Gnast version 0.1
 */
public class RefExprImpl
extends ExprImpl implements RefExpr
{
  /**
   * The default constructor.
   *
   * Do not use it explicitly, unless you are extending this class.
   * If you want to create an instance of this class, please use the
   * {@link ZFactory object factory}.
   */
  protected RefExprImpl() { }

  /**
   * Compares the specified object with this RefExprImpl
   * for equality.  Returns true if and only if the specified object is
   * also a(n) RefExprImpl and all the getter methods except getAnns
   * return equal objects.
   */
  public boolean equals(Object obj)
  {
    if(obj != null &&
       this.getClass().equals(obj.getClass()) &&
       super.equals(obj)) {
      RefExprImpl object = (RefExprImpl) obj;
      if((mRefName == null && object.mRefName != null) ||
         (mRefName != null &&
         ! mRefName.equals(object.mRefName))) return false;
      if(mRefName == null && object.mRefName != null)
        return false;
      if((mExpr == null && object.mExpr != null) ||
         (mExpr != null &&
         ! mExpr.equals(object.mExpr))) return false;
      if(mExpr == null && object.mExpr != null)
        return false;
      if((mMixfix == null && object.mMixfix != null) ||
         (mMixfix != null &&
         ! mMixfix.equals(object.mMixfix))) return false;
      if(mMixfix == null && object.mMixfix != null)
        return false;
      return true;
    }
    return false;
  }

  /**
   * Returns the hash code value for this RefExprImpl.
   * The hash code of a RefExprImpl is defined to be
   * the result of the following calculation:
   *
   * @czt.todo Write the calculation procedure for method hashCode().
   */
  public int hashCode()
  {
    int hashCode = super.hashCode();
    hashCode += "RefExprImpl".hashCode();
    if(mRefName != null) {
      hashCode += 31*mRefName.hashCode();
    }
    if(mExpr != null) {
      hashCode += 31*mExpr.hashCode();
    }
    if(mMixfix != null) {
      hashCode += 31*mMixfix.hashCode();
    }
    return hashCode;
  }

  /**
   * Accepts a visitor.
   */
  public Object accept(net.sourceforge.czt.util.Visitor v)
  {
    if (v instanceof RefExprVisitor)
    {
      RefExprVisitor visitor = (RefExprVisitor) v;
      return visitor.visitRefExpr(this);
    }
    return super.accept(v);
  }

  /**
   * Returns a new object of this class.
   */
  public net.sourceforge.czt.base.ast.Term create(Object[] args) {
    RefExpr zedObject = null;
    try {
      RefName refName = (RefName) args[0];
      java.util.List expr = (java.util.List) args[1];
      Boolean mixfix = (Boolean) args[2];
      zedObject = new RefExprImpl();
      zedObject.setRefName(refName);
      if(expr != null) {
        zedObject.getExpr().addAll(expr);
      }
      zedObject.setMixfix(mixfix);
    } catch (IndexOutOfBoundsException e) {
      throw new IllegalArgumentException();
    } catch (ClassCastException e) {
      throw new IllegalArgumentException();
    }
    return zedObject;
  }

  public Object[] getChildren()
  {
    Object[] erg = { getRefName(), getExpr(), getMixfix() };
    return erg;
  }

  private RefName mRefName;

  public RefName getRefName()
  {
    return mRefName;
  }

  public void setRefName(RefName refName)
  {
    mRefName = refName;
  }

  private java.util.List mExpr = new net.sourceforge.czt.util.TypesafeList(Expr.class);

  public java.util.List getExpr()
  {
    return mExpr;
  }

  private Boolean mMixfix;

  public Boolean getMixfix()
  {
    return mMixfix;
  }

  public void setMixfix(Boolean mixfix)
  {
    mMixfix = mixfix;
  }
}
