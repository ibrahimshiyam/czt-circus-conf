
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

package net.sourceforge.czt.core.impl;

import java.util.*;
import java.util.logging.*;

import net.sourceforge.czt.zed.impl.*;
import net.sourceforge.czt.core.ast.*;
import net.sourceforge.czt.core.visitor.*;

import net.sourceforge.czt.core.visitor.ExprPredVisitor;

/**
 * An implementation of the interface
 * {@link ExprPred}.
 *
 * @author Gnast version 0.1
 */
public class ExprPredImpl
extends PredImpl implements ExprPred
{
  private static final Logger sLogger =
    Logger.getLogger("net.sourceforge.czt.core.impl.ExprPredImpl");

  /**
   * The default constructor.
   *
   * Do not use it explicitly, unless you are extending this class.
   * If you want to create an instance of this class, please use the
   * {@link CoreFactory object factory}.
   */
  protected ExprPredImpl() { }

  /**
   * Compares the specified object with this ExprPredImpl
   * for equality.  Returns true if and only if the specified object is
   * also a(n) ExprPredImpl and all the getter methods except getAnns
   * return equal objects.
   */
  public boolean equals(Object obj)
  {
    if(obj != null &&
       this.getClass().equals(obj.getClass()) &&
       super.equals(obj)) {
      ExprPredImpl object = (ExprPredImpl) obj;
      if((mExpr == null && object.mExpr != null) ||
         (mExpr != null &&
         ! mExpr.equals(object.mExpr))) return false;
      if(mExpr == null && object.mExpr != null)
        return false;
      return true;
    }
    return false;
  }

  /**
   * Returns the hash code value for this ExprPredImpl.
   * The hash code of a ExprPredImpl is defined to be
   * the result of the following calculation:
   *
   * @czt.todo Write the calculation procedure for method hashCode().
   */
  public int hashCode()
  {
    int hashCode = super.hashCode();
    hashCode += "ExprPredImpl".hashCode();
    if(mExpr != null) {
      hashCode += 31*mExpr.hashCode();
    }
    return hashCode;
  }

  /**
   * Accepts a visitor.
   */
  public Object accept(net.sourceforge.czt.util.Visitor v)
  {
    if (v instanceof ExprPredVisitor)
    {
      ExprPredVisitor visitor = (ExprPredVisitor) v;
      return visitor.visitExprPred(this);
    }
    return super.accept(v);
  }

  /**
   * Returns a new object of this class.
   */
  public net.sourceforge.czt.zed.ast.Term create(Object[] args) {
    sLogger.entering("ExprPredImpl", "create", args);
    ExprPred zedObject = null;
    try {
      Expr expr = (Expr) args[0];
      zedObject = new ExprPredImpl();
      zedObject.setExpr(expr);
    } catch (IndexOutOfBoundsException e) {
      throw new IllegalArgumentException();
    } catch (ClassCastException e) {
      throw new IllegalArgumentException();
    }
    sLogger.exiting("ExprPredImpl", "create", zedObject);
    return zedObject;
  }

  public Object[] getChildren()
  {
    sLogger.entering("ExprPredImpl", "getChildren");
    Object[] erg = { getExpr() };
    sLogger.exiting("ExprPredImpl", "getChildren", erg);
    return erg;
  }

  private Expr mExpr;

  public Expr getExpr()
  {
    return mExpr;
  }

  public void setExpr(Expr expr)
  {
    mExpr = expr;
  }
}
