
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

import net.sourceforge.czt.z.visitor.ThetaExprVisitor;

/**
 * An implementation of the interface
 * {@link ThetaExpr}.
 *
 * @author Gnast version 0.1
 */
public class ThetaExprImpl
  extends Expr1Impl   implements ThetaExpr
{
  /**
   * The default constructor.
   *
   * Do not use it explicitly, unless you are extending this class.
   * If you want to create an instance of this class, please use the
   * {@link net.sourceforge.czt.z.ast.ZFactory object factory}.
   */
  protected ThetaExprImpl()
  {
  }

  protected ThetaExprImpl(BaseFactory factory)
  {
    super(factory);
  }

  /**
   * Compares the specified object with this ThetaExprImpl
   * for equality.  Returns true if and only if the specified object is
   * also a(n) ThetaExprImpl and all the getter methods except getAnns
   * return equal objects.
   */
  public boolean equals(Object obj)
  {
    if (obj != null) {
      if (this.getClass().equals(obj.getClass()) && super.equals(obj)) {
        ThetaExprImpl object = (ThetaExprImpl) obj;
        if (strokeList_ != null) {
          if (!strokeList_.equals(object.strokeList_)) {
            return false;
          }
        }
        else {
          if (object.strokeList_ != null) {
            return false;
          }
        }
        return true;
      }
    }
    return false;
  }

  /**
   * Returns the hash code value for this ThetaExprImpl.
   */
  public int hashCode()
  {
    final int constant = 31;

    int hashCode = super.hashCode();
    hashCode += "ThetaExprImpl".hashCode();
    if (strokeList_ != null) {
      hashCode += constant * strokeList_.hashCode();
    }
    return hashCode;
  }

  /**
   * Accepts a visitor.
   */
  public <R> R accept(net.sourceforge.czt.util.Visitor<R> v)
  {
    if (v instanceof ThetaExprVisitor) {
      ThetaExprVisitor<R> visitor = (ThetaExprVisitor<R>) v;
      return visitor.visitThetaExpr(this);
    }
    return super.accept(v);
  }

  /**
   * Returns a new object of this class.
   */
  public ThetaExprImpl create(Object[] args)
  {
    ThetaExprImpl zedObject = null;
    try {
      Expr expr = (Expr) args[0];
      StrokeList strokeList = (StrokeList) args[1];
      zedObject = new ThetaExprImpl(getFactory());
      zedObject.setExpr(expr);
      zedObject.setStrokeList(strokeList);
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
    Object[] erg = { getExpr(), getStrokeList() };
    return erg;
  }

  private StrokeList strokeList_;

  public StrokeList getStrokeList()
  {
    return strokeList_;
  }

  public void setStrokeList(StrokeList strokeList)
  {
    strokeList_ = strokeList;
  }
  public ZStrokeList getZStrokeList()
  {
    StrokeList strokeList = getStrokeList();
    if (strokeList instanceof ZStrokeList) {
      return (ZStrokeList) strokeList;
    }
    throw new net.sourceforge.czt.base.util.UnsupportedAstClassException();
  }
}
