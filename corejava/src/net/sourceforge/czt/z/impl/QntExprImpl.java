
/******************************************************************************
DO NOT EDIT THIS FILE!  THIS FILE WAS GENERATED BY GNAST
FROM THE TEMPLATE FILE AstClass.vm.
ANY MODIFICATIONS TO THIS FILE WILL BE LOST UPON REGENERATION.

-------------------------------------------------------------------------------

Copyright 2003, 2004 Mark Utting
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

import net.sourceforge.czt.base.impl.*;
import net.sourceforge.czt.util.TypesafeList;
import net.sourceforge.czt.z.ast.*;
import net.sourceforge.czt.z.visitor.*;

import net.sourceforge.czt.z.visitor.QntExprVisitor;

/**
 * An implementation of the interface
 * {@link QntExpr}.
 *
 * @author Gnast version 0.1
 */
public abstract class QntExprImpl
  extends ExprImpl   implements QntExpr
{

  /**
   * Compares the specified object with this QntExprImpl
   * for equality.  Returns true if and only if the specified object is
   * also a(n) QntExprImpl and all the getter methods except getAnns
   * return equal objects.
   */
  public boolean equals(Object obj)
  {
    if (obj != null) {
      if (this.getClass().equals(obj.getClass()) && super.equals(obj)) {
        QntExprImpl object = (QntExprImpl) obj;
        if (schText_ != null) {
          if (!schText_.equals(object.schText_)) {
            return false;
          }
        }
        else {
          if (object.schText_ != null) {
            return false;
          }
        }
        if (expr_ != null) {
          if (!expr_.equals(object.expr_)) {
            return false;
          }
        }
        else {
          if (object.expr_ != null) {
            return false;
          }
        }
        return true;
      }
    }
    return false;
  }

  /**
   * Returns the hash code value for this QntExprImpl.
   */
  public int hashCode()
  {
    final int constant = 31;

    int hashCode = super.hashCode();
    hashCode += "QntExprImpl".hashCode();
    if (schText_ != null) {
      hashCode += constant * schText_.hashCode();
    }
    if (expr_ != null) {
      hashCode += constant * expr_.hashCode();
    }
    return hashCode;
  }

  /**
   * Accepts a visitor.
   */
  public Object accept(net.sourceforge.czt.util.Visitor v)
  {
    if (v instanceof QntExprVisitor) {
      QntExprVisitor visitor = (QntExprVisitor) v;
      return visitor.visitQntExpr(this);
    }
    return super.accept(v);
  }


  private SchText schText_;

  public SchText getSchText()
  {
    return schText_;
  }

  public void setSchText(SchText schText)
  {
    schText_ = schText;
  }

  private Expr expr_;

  public Expr getExpr()
  {
    return expr_;
  }

  public void setExpr(Expr expr)
  {
    expr_ = expr;
  }
}
