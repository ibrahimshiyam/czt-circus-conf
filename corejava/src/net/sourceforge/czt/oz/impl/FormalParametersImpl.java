
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

package net.sourceforge.czt.oz.impl;

import java.util.*;
import java.util.logging.*;

import net.sourceforge.czt.base.impl.*;
import net.sourceforge.czt.z.ast.*;
import net.sourceforge.czt.z.impl.*;
import net.sourceforge.czt.oz.ast.*;
import net.sourceforge.czt.oz.visitor.*;

import net.sourceforge.czt.oz.visitor.FormalParametersVisitor;

/**
 * An implementation of the interface
 * {@link FormalParameters}.
 *
 * @author Gnast version 0.1
 */
public class FormalParametersImpl
extends TermAImpl implements FormalParameters
{
  /**
   * The default constructor.
   *
   * Do not use it explicitly, unless you are extending this class.
   * If you want to create an instance of this class, please use the
   * {@link OzFactory object factory}.
   */
  protected FormalParametersImpl() { }

  /**
   * Compares the specified object with this FormalParametersImpl
   * for equality.  Returns true if and only if the specified object is
   * also a(n) FormalParametersImpl and all the getter methods except getAnns
   * return equal objects.
   */
  public boolean equals(Object obj)
  {
    if(obj != null &&
       this.getClass().equals(obj.getClass()) &&
       super.equals(obj)) {
      FormalParametersImpl object = (FormalParametersImpl) obj;
      if((mRefName == null && object.mRefName != null) ||
         (mRefName != null &&
         ! mRefName.equals(object.mRefName))) return false;
      if(mRefName == null && object.mRefName != null)
        return false;
      return true;
    }
    return false;
  }

  /**
   * Returns the hash code value for this FormalParametersImpl.
   * The hash code of a FormalParametersImpl is defined to be
   * the result of the following calculation:
   *
   * @czt.todo Write the calculation procedure for method hashCode().
   */
  public int hashCode()
  {
    int hashCode = super.hashCode();
    hashCode += "FormalParametersImpl".hashCode();
    if(mRefName != null) {
      hashCode += 31*mRefName.hashCode();
    }
    return hashCode;
  }

  /**
   * Accepts a visitor.
   */
  public Object accept(net.sourceforge.czt.util.Visitor v)
  {
    if (v instanceof FormalParametersVisitor)
    {
      FormalParametersVisitor visitor = (FormalParametersVisitor) v;
      return visitor.visitFormalParameters(this);
    }
    return super.accept(v);
  }

  /**
   * Returns a new object of this class.
   */
  public net.sourceforge.czt.base.ast.Term create(Object[] args) {
    FormalParameters zedObject = null;
    try {
      java.util.List refName = (java.util.List) args[0];
      zedObject = new FormalParametersImpl();
      if(refName != null) {
        zedObject.getRefName().addAll(refName);
      }
    } catch (IndexOutOfBoundsException e) {
      throw new IllegalArgumentException();
    } catch (ClassCastException e) {
      throw new IllegalArgumentException();
    }
    return zedObject;
  }

  public Object[] getChildren()
  {
    Object[] erg = { getRefName() };
    return erg;
  }

  private java.util.List mRefName = new net.sourceforge.czt.util.TypesafeList(net.sourceforge.czt.z.ast.RefName.class);

  public java.util.List getRefName()
  {
    return mRefName;
  }
}
