
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

import net.sourceforge.czt.core.visitor.SchTextVisitor;

/**
 * An implementation of the interface
 * {@link SchText}.
 *
 * @author Gnast version 0.1
 */
public class SchTextImpl
extends TermAImpl implements SchText
{
  private static final Logger sLogger =
    Logger.getLogger("net.sourceforge.czt.core.impl.SchTextImpl");

  /**
   * The default constructor.
   *
   * Do not use it explicitly, unless you are extending this class.
   * If you want to create an instance of this class, please use the
   * {@link CoreFactory object factory}.
   */
  protected SchTextImpl() { }

  /**
   * Compares the specified object with this SchTextImpl
   * for equality.  Returns true if and only if the specified object is
   * also a(n) SchTextImpl and all the getter methods except getAnns
   * return equal objects.
   */
  public boolean equals(Object obj)
  {
    if(obj != null &&
       this.getClass().equals(obj.getClass()) &&
       super.equals(obj)) {
      SchTextImpl object = (SchTextImpl) obj;
      if((mDecl == null && object.mDecl != null) ||
         (mDecl != null &&
         ! mDecl.equals(object.mDecl))) return false;
      if(mDecl == null && object.mDecl != null)
        return false;
      if((mPred == null && object.mPred != null) ||
         (mPred != null &&
         ! mPred.equals(object.mPred))) return false;
      if(mPred == null && object.mPred != null)
        return false;
      return true;
    }
    return false;
  }

  /**
   * Returns the hash code value for this SchTextImpl.
   * The hash code of a SchTextImpl is defined to be
   * the result of the following calculation:
   *
   * @czt.todo Write the calculation procedure for method hashCode().
   */
  public int hashCode()
  {
    int hashCode = super.hashCode();
    hashCode += "SchTextImpl".hashCode();
    if(mDecl != null) {
      hashCode += 31*mDecl.hashCode();
    }
    if(mPred != null) {
      hashCode += 31*mPred.hashCode();
    }
    return hashCode;
  }

  /**
   * Accepts a visitor.
   */
  public Object accept(net.sourceforge.czt.util.Visitor v)
  {
    if (v instanceof SchTextVisitor)
    {
      SchTextVisitor visitor = (SchTextVisitor) v;
      return visitor.visitSchText(this);
    }
    return super.accept(v);
  }

  /**
   * Returns a new object of this class.
   */
  public net.sourceforge.czt.zed.ast.Term create(Object[] args) {
    sLogger.entering("SchTextImpl", "create", args);
    SchText zedObject = null;
    try {
      java.util.List decl = (java.util.List) args[0];
      Pred pred = (Pred) args[1];
      zedObject = new SchTextImpl();
      if(decl != null) {
        zedObject.getDecl().addAll(decl);
      }
      zedObject.setPred(pred);
    } catch (IndexOutOfBoundsException e) {
      throw new IllegalArgumentException();
    } catch (ClassCastException e) {
      throw new IllegalArgumentException();
    }
    sLogger.exiting("SchTextImpl", "create", zedObject);
    return zedObject;
  }

  public Object[] getChildren()
  {
    sLogger.entering("SchTextImpl", "getChildren");
    Object[] erg = { getDecl(), getPred() };
    sLogger.exiting("SchTextImpl", "getChildren", erg);
    return erg;
  }

  private java.util.List mDecl = new java.util.Vector();

  public java.util.List getDecl()
  {
    return mDecl;
  }

  private Pred mPred;

  public Pred getPred()
  {
    return mPred;
  }

  public void setPred(Pred pred)
  {
    mPred = pred;
  }
}
