
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

import net.sourceforge.czt.base.impl.*;
import net.sourceforge.czt.util.TypesafeList;
import net.sourceforge.czt.z.ast.*;
import net.sourceforge.czt.z.impl.*;
import net.sourceforge.czt.oz.ast.*;
import net.sourceforge.czt.oz.visitor.*;

import net.sourceforge.czt.oz.visitor.NameSignaturePairVisitor;

/**
 * An implementation of the interface
 * {@link NameSignaturePair}.
 *
 * @author Gnast version 0.1
 */
public class NameSignaturePairImpl
  extends TermImpl   implements NameSignaturePair
{
  /**
   * The default constructor.
   *
   * Do not use it explicitly, unless you are extending this class.
   * If you want to create an instance of this class, please use the
   * {@link net.sourceforge.czt.oz.ast.OzFactory object factory}.
   */
  protected NameSignaturePairImpl()
  {
  }

  /**
   * Compares the specified object with this NameSignaturePairImpl
   * for equality.  Returns true if and only if the specified object is
   * also a(n) NameSignaturePairImpl and all the getter methods except getAnns
   * return equal objects.
   */
  public boolean equals(Object obj)
  {
    if (obj != null) {
      if (this.getClass().equals(obj.getClass()) && super.equals(obj)) {
        NameSignaturePairImpl object = (NameSignaturePairImpl) obj;
        if (name_ != null) {
          if (!name_.equals(object.name_)) {
            return false;
          }
        }
        else {
          if (object.name_ != null) {
            return false;
          }
        }
        if (signature_ != null) {
          if (!signature_.equals(object.signature_)) {
            return false;
          }
        }
        else {
          if (object.signature_ != null) {
            return false;
          }
        }
        return true;
      }
    }
    return false;
  }

  /**
   * Returns the hash code value for this NameSignaturePairImpl.
   */
  public int hashCode()
  {
    final int constant = 31;

    int hashCode = super.hashCode();
    hashCode += "NameSignaturePairImpl".hashCode();
    if (name_ != null) {
      hashCode += constant * name_.hashCode();
    }
    if (signature_ != null) {
      hashCode += constant * signature_.hashCode();
    }
    return hashCode;
  }

  /**
   * Accepts a visitor.
   */
  public Object accept(net.sourceforge.czt.util.Visitor v)
  {
    if (v instanceof NameSignaturePairVisitor) {
      NameSignaturePairVisitor visitor = (NameSignaturePairVisitor) v;
      return visitor.visitNameSignaturePair(this);
    }
    return super.accept(v);
  }

  /**
   * Returns a new object of this class.
   */
  public net.sourceforge.czt.base.ast.Term create(Object[] args)
  {
    NameSignaturePair zedObject = null;
    try {
      net.sourceforge.czt.z.ast.DeclName name = (net.sourceforge.czt.z.ast.DeclName) args[0];
      net.sourceforge.czt.z.ast.Signature signature = (net.sourceforge.czt.z.ast.Signature) args[1];
      zedObject = new NameSignaturePairImpl();
      zedObject.setName(name);
      zedObject.setSignature(signature);
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
    Object[] erg = { getName(), getSignature() };
    return erg;
  }

  private net.sourceforge.czt.z.ast.DeclName name_;

  public net.sourceforge.czt.z.ast.DeclName getName()
  {
    return name_;
  }

  public void setName(net.sourceforge.czt.z.ast.DeclName name)
  {
    name_ = name;
  }

  private net.sourceforge.czt.z.ast.Signature signature_;

  public net.sourceforge.czt.z.ast.Signature getSignature()
  {
    return signature_;
  }

  public void setSignature(net.sourceforge.czt.z.ast.Signature signature)
  {
    signature_ = signature;
  }
}
