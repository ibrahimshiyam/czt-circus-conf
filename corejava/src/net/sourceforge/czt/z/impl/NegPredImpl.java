
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

import net.sourceforge.czt.z.visitor.NegPredVisitor;

/**
 * An implementation of the interface
 * {@link NegPred}.
 *
 * @author Gnast version 0.1
 */
public class NegPredImpl
  extends PredImpl   implements NegPred
{
  /**
   * The default constructor.
   *
   * Do not use it explicitly, unless you are extending this class.
   * If you want to create an instance of this class, please use the
   * {@link net.sourceforge.czt.z.ast.ZFactory object factory}.
   */
  protected NegPredImpl()
  {
  }

  /**
   * Compares the specified object with this NegPredImpl
   * for equality.  Returns true if and only if the specified object is
   * also a(n) NegPredImpl and all the getter methods except getAnns
   * return equal objects.
   */
  public boolean equals(Object obj)
  {
    if (obj != null) {
      if (this.getClass().equals(obj.getClass()) && super.equals(obj)) {
        NegPredImpl object = (NegPredImpl) obj;
        if (pred_ != null) {
          if (!pred_.equals(object.pred_)) {
            return false;
          }
        }
        else {
          if (object.pred_ != null) {
            return false;
          }
        }
        return true;
      }
    }
    return false;
  }

  /**
   * Returns the hash code value for this NegPredImpl.
   */
  public int hashCode()
  {
    final int constant = 31;

    int hashCode = super.hashCode();
    hashCode += "NegPredImpl".hashCode();
    if (pred_ != null) {
      hashCode += constant * pred_.hashCode();
    }
    return hashCode;
  }

  /**
   * Accepts a visitor.
   */
  public Object accept(net.sourceforge.czt.util.Visitor v)
  {
    if (v instanceof NegPredVisitor) {
      NegPredVisitor visitor = (NegPredVisitor) v;
      return visitor.visitNegPred(this);
    }
    return super.accept(v);
  }

  /**
   * Returns a new object of this class.
   */
  public net.sourceforge.czt.base.ast.Term create(Object[] args)
  {
    NegPred zedObject = null;
    try {
      Pred pred = (Pred) args[0];
      zedObject = new NegPredImpl();
      zedObject.setPred(pred);
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
    Object[] erg = { getPred() };
    return erg;
  }

  private Pred pred_;

  public Pred getPred()
  {
    return pred_;
  }

  public void setPred(Pred pred)
  {
    pred_ = pred;
  }
}
