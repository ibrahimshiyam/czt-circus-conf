
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

import net.sourceforge.czt.base.ast.*;
import net.sourceforge.czt.base.impl.*;
import net.sourceforge.czt.base.visitor.*;
import net.sourceforge.czt.util.Visitor;
import net.sourceforge.czt.z.ast.*;
import net.sourceforge.czt.z.impl.*;
import net.sourceforge.czt.oz.ast.*;
import net.sourceforge.czt.oz.visitor.*;

import net.sourceforge.czt.oz.visitor.ClassTypeVisitor;

/**
 * An implementation of the interface
 * {@link ClassType}.
 *
 * @author Gnast version 0.1
 */
public abstract class ClassTypeImpl
  extends Type2Impl   implements ClassType
{
  /**
   * The default constructor.
   *
   * Do not use it explicitly, unless you are extending this class.
   * If you want to create an instance of this class, please use the
   * {@link net.sourceforge.czt.oz.ast.OzFactory object factory}.
   */
  protected ClassTypeImpl()
  {
  }

  protected ClassTypeImpl(BaseFactory factory)
  {
    super(factory);
  }

  /**
   * Compares the specified object with this ClassTypeImpl
   * for equality.  Returns true if and only if the specified object is
   * also a(n) ClassTypeImpl and all the getter methods except getAnns
   * return equal objects.
   */
  public boolean equals(Object obj)
  {
    if (obj != null) {
      if (this.getClass().equals(obj.getClass()) && super.equals(obj)) {
        ClassTypeImpl object = (ClassTypeImpl) obj;
        if (classSig_ != null) {
          if (!classSig_.equals(object.classSig_)) {
            return false;
          }
        }
        else {
          if (object.classSig_ != null) {
            return false;
          }
        }
        return true;
      }
    }
    return false;
  }

  /**
   * Returns the hash code value for this ClassTypeImpl.
   */
  public int hashCode()
  {
    final int constant = 31;

    int hashCode = super.hashCode();
    hashCode += "ClassTypeImpl".hashCode();
    if (classSig_ != null) {
      hashCode += constant * classSig_.hashCode();
    }
    return hashCode;
  }

  /**
   * Accepts a visitor.
   */
  public <R> R accept(net.sourceforge.czt.util.Visitor<R> v)
  {
    if (v instanceof ClassTypeVisitor) {
      ClassTypeVisitor<R> visitor = (ClassTypeVisitor<R>) v;
      return visitor.visitClassType(this);
    }
    return super.accept(v);
  }


  private ClassSig classSig_;

  public ClassSig getClassSig()
  {
    return classSig_;
  }

  public void setClassSig(ClassSig classSig)
  {
    classSig_ = classSig;
  }
}
