
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

import net.sourceforge.czt.core.ast.*;
import net.sourceforge.czt.core.util.*;

/**
 * An implementation of the interface
 * {@link Pred2}.
 *
 * @author Gnast version 0.1
 */
public abstract class Pred2Impl
extends PredImpl implements Pred2
{

  /**
   * Compares the specified object with this Pred2Impl
   * for equality.  Returns true if and only if the specified object is
   * also a(n) Pred2Impl and all the getter methods except getAnns
   * return equal objects.
   */
  public boolean equals(Object obj)
  {
    if(obj != null &&
       this.getClass().equals(obj.getClass()) &&
       super.equals(obj)) {
      Pred2Impl object = (Pred2Impl) obj;
      if((mLeftPred == null && object.mLeftPred != null) ||
         (mLeftPred != null &&
         ! mLeftPred.equals(object.mLeftPred))) return false;
      if(mLeftPred == null && object.mLeftPred != null)
        return false;
      if((mRightPred == null && object.mRightPred != null) ||
         (mRightPred != null &&
         ! mRightPred.equals(object.mRightPred))) return false;
      if(mRightPred == null && object.mRightPred != null)
        return false;
      return true;
    }
    return false;
  }

  /**
   * Returns the hash code value for this Pred2Impl.
   * The hash code of a Pred2Impl is defined to be
   * the result of the following calculation:
   *
   * @czt.todo Write the calculation procedure for method hashCode().
   */
  public int hashCode()
  {
    int hashCode = super.hashCode();
    hashCode += "Pred2Impl".hashCode();
    if(mLeftPred != null) {
      hashCode += 31*mLeftPred.hashCode();
    }
    if(mRightPred != null) {
      hashCode += 31*mRightPred.hashCode();
    }
    return hashCode;
  }


  private Pred mLeftPred;

  public Pred getLeftPred()
  {
    return mLeftPred;
  }

  public void setLeftPred(Pred leftPred)
  {
    mLeftPred = leftPred;
  }

  private Pred mRightPred;

  public Pred getRightPred()
  {
    return mRightPred;
  }

  public void setRightPred(Pred rightPred)
  {
    mRightPred = rightPred;
  }
}
