
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

import net.sourceforge.czt.oz.visitor.ClassSignatureVisitor;

/**
 * An implementation of the interface
 * {@link ClassSignature}.
 *
 * @author Gnast version 0.1
 */
public class ClassSignatureImpl
  extends TermImpl   implements ClassSignature
{
  /**
   * The default constructor.
   *
   * Do not use it explicitly, unless you are extending this class.
   * If you want to create an instance of this class, please use the
   * {@link net.sourceforge.czt.oz.ast.OzFactory object factory}.
   */
  protected ClassSignatureImpl()
  {
  }

  /**
   * Compares the specified object with this ClassSignatureImpl
   * for equality.  Returns true if and only if the specified object is
   * also a(n) ClassSignatureImpl and all the getter methods except getAnns
   * return equal objects.
   */
  public boolean equals(Object obj)
  {
    if (obj != null) {
      if (this.getClass().equals(obj.getClass()) && super.equals(obj)) {
        ClassSignatureImpl object = (ClassSignatureImpl) obj;
        if (className_ != null) {
          if (!className_.equals(object.className_)) {
            return false;
          }
        }
        else {
          if (object.className_ != null) {
            return false;
          }
        }
        if (state_ != null) {
          if (!state_.equals(object.state_)) {
            return false;
          }
        }
        else {
          if (object.state_ != null) {
            return false;
          }
        }
        if (parentClass_ != null) {
          if (!parentClass_.equals(object.parentClass_)) {
            return false;
          }
        }
        else {
          if (object.parentClass_ != null) {
            return false;
          }
        }
        if (attribute_ != null) {
          if (!attribute_.equals(object.attribute_)) {
            return false;
          }
        }
        else {
          if (object.attribute_ != null) {
            return false;
          }
        }
        if (operation_ != null) {
          if (!operation_.equals(object.operation_)) {
            return false;
          }
        }
        else {
          if (object.operation_ != null) {
            return false;
          }
        }
        if (visibility_ != null) {
          if (!visibility_.equals(object.visibility_)) {
            return false;
          }
        }
        else {
          if (object.visibility_ != null) {
            return false;
          }
        }
        return true;
      }
    }
    return false;
  }

  /**
   * Returns the hash code value for this ClassSignatureImpl.
   */
  public int hashCode()
  {
    final int constant = 31;

    int hashCode = super.hashCode();
    hashCode += "ClassSignatureImpl".hashCode();
    if (className_ != null) {
      hashCode += constant * className_.hashCode();
    }
    if (state_ != null) {
      hashCode += constant * state_.hashCode();
    }
    if (parentClass_ != null) {
      hashCode += constant * parentClass_.hashCode();
    }
    if (attribute_ != null) {
      hashCode += constant * attribute_.hashCode();
    }
    if (operation_ != null) {
      hashCode += constant * operation_.hashCode();
    }
    if (visibility_ != null) {
      hashCode += constant * visibility_.hashCode();
    }
    return hashCode;
  }

  /**
   * Accepts a visitor.
   */
  public Object accept(net.sourceforge.czt.util.Visitor v)
  {
    if (v instanceof ClassSignatureVisitor) {
      ClassSignatureVisitor visitor = (ClassSignatureVisitor) v;
      return visitor.visitClassSignature(this);
    }
    return super.accept(v);
  }

  /**
   * Returns a new object of this class.
   */
  public net.sourceforge.czt.base.ast.Term create(Object[] args)
  {
    ClassSignature zedObject = null;
    try {
      net.sourceforge.czt.z.ast.DeclName className = (net.sourceforge.czt.z.ast.DeclName) args[0];
      net.sourceforge.czt.z.ast.Signature state = (net.sourceforge.czt.z.ast.Signature) args[1];
      java.util.List parentClass = (java.util.List) args[2];
      java.util.List attribute = (java.util.List) args[3];
      java.util.List operation = (java.util.List) args[4];
      java.util.List visibility = (java.util.List) args[5];
      zedObject = new ClassSignatureImpl();
      zedObject.setClassName(className);
      zedObject.setState(state);
      if (parentClass != null) {
        zedObject.getParentClass().addAll(parentClass);
      }
      if (attribute != null) {
        zedObject.getAttribute().addAll(attribute);
      }
      if (operation != null) {
        zedObject.getOperation().addAll(operation);
      }
      if (visibility != null) {
        zedObject.getVisibility().addAll(visibility);
      }
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
    Object[] erg = { getClassName(), getState(), getParentClass(), getAttribute(), getOperation(), getVisibility() };
    return erg;
  }

  private net.sourceforge.czt.z.ast.DeclName className_;

  public net.sourceforge.czt.z.ast.DeclName getClassName()
  {
    return className_;
  }

  public void setClassName(net.sourceforge.czt.z.ast.DeclName className)
  {
    className_ = className;
  }

  private net.sourceforge.czt.z.ast.Signature state_;

  public net.sourceforge.czt.z.ast.Signature getState()
  {
    return state_;
  }

  public void setState(net.sourceforge.czt.z.ast.Signature state)
  {
    state_ = state;
  }


  private net.sourceforge.czt.base.ast.ListTerm parentClass_ =
    new net.sourceforge.czt.base.impl.ListTermImpl(net.sourceforge.czt.z.ast.RefName.class);

  public net.sourceforge.czt.base.ast.ListTerm getParentClass()
  {
    return parentClass_;
  }


  private net.sourceforge.czt.base.ast.ListTerm attribute_ =
    new net.sourceforge.czt.base.impl.ListTermImpl(NameSignaturePair.class);

  public net.sourceforge.czt.base.ast.ListTerm getAttribute()
  {
    return attribute_;
  }


  private net.sourceforge.czt.base.ast.ListTerm operation_ =
    new net.sourceforge.czt.base.impl.ListTermImpl(NameSignaturePair.class);

  public net.sourceforge.czt.base.ast.ListTerm getOperation()
  {
    return operation_;
  }


  private net.sourceforge.czt.base.ast.ListTerm visibility_ =
    new net.sourceforge.czt.base.impl.ListTermImpl(net.sourceforge.czt.z.ast.RefName.class);

  public net.sourceforge.czt.base.ast.ListTerm getVisibility()
  {
    return visibility_;
  }
}
