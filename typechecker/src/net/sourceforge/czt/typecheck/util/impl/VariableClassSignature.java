/*
  Copyright (C) 2004 Tim Miller
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
package net.sourceforge.czt.typecheck.util.impl;

import java.util.List;

import net.sourceforge.czt.z.ast.DeclName;
import net.sourceforge.czt.z.ast.Stroke;
import net.sourceforge.czt.oz.ast.ClassSignature;
import net.sourceforge.czt.oz.visitor.ClassSignatureVisitor;

/**
 * An implementation for ClassSignature that represents a class
 * signature variable.
 */
public class VariableClassSignature
  extends net.sourceforge.czt.base.impl.TermImpl
  implements ClassSignature
{
  /**
   * The Greek psi character as a string. Prefix with an
   * underscore to avoid clashes with user-defined variables.
   */
  //protected static final String PSI = "_" + Character.toString('\u03C8');
  protected static final String PSI = "_PSI";

  /** The number stroke of the next psi variable. */
  protected static int serial_ = 0;

  /** The name of this variable. */
  protected DeclName declName_ = null;

  /** The unified value of this signature. */
  protected ClassSignature value_ = null;

  protected VariableClassSignature(Factory factory)
  {
    List<Stroke> strokes = new java.util.ArrayList();
    strokes.add(factory.createNumStroke(new Integer(serial_++)));
    declName_ = factory.createDeclName(PSI, strokes, null);
  }

  protected VariableClassSignature(DeclName declName)
  {
    declName_ = declName;
  }

  /**
   * @return the value of the unified signature, or this signature if
   * it is not yet unified
   */
  public ClassSignature getValue()
  {
    if (value_ == null) {
      return this;
    }
    else {
      if (value_ instanceof VariableClassSignature) {
        VariableClassSignature vType = (VariableClassSignature) value_;
        return vType.getValue();
      }
      return value_;
    }
  }

  /**
   * Set the value of the signature.
   * @param signature the value of the signature
   */
  public void setValue(ClassSignature signature)
  {
    value_ = signature;
  }

  /**
   * Get the variable name associated with this type.
   */
  public DeclName getName()
  {
    return declName_;
  }

  /**
   * Set the variable name associated with this type.
   */
  public void setName(DeclName declName)
  {
    declName_ = declName;
  }

  public Object[] getChildren()
  {
    Object[] result = {getClassName(), getPrimaryDecl(), getSecondaryDecl(), getParentClass(), getAttribute(), getOperation(), getVisibility() };
    return result;
  }

  public void setClassName(net.sourceforge.czt.z.ast.DeclName declName)
  {
  }

  public net.sourceforge.czt.z.ast.DeclName getClassName()
  {
    return null;
  }

  public void setPrimaryDecl(net.sourceforge.czt.z.ast.Signature signature)
  {
  }

  public void setSecondaryDecl(net.sourceforge.czt.z.ast.Signature signature)
  {
  }

  public net.sourceforge.czt.z.ast.Signature getPrimaryDecl()
  {
    return null;
  }

  public net.sourceforge.czt.z.ast.Signature getSecondaryDecl()
  {
    return null;
  }

  public net.sourceforge.czt.base.ast.ListTerm getAttribute()
  {
    return new net.sourceforge.czt.base.impl.ListTermImpl();
  }

  public net.sourceforge.czt.base.ast.ListTerm getOperation()
  {
    return new net.sourceforge.czt.base.impl.ListTermImpl();
  }

  public net.sourceforge.czt.base.ast.ListTerm getParentClass()
  {
    return new net.sourceforge.czt.base.impl.ListTermImpl();
  }

  public net.sourceforge.czt.base.ast.ListTerm getVisibility()
  {
    return new net.sourceforge.czt.base.impl.ListTermImpl();
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
    VariableClassSignature zedObject = null;
    return zedObject;
  }

  public String toString()
  {
    String result = new String();

    if (value_ != null) {
      result += value_.toString();
    }
    else if (declName_.getWord().indexOf(PSI) >= 0) {
      result += declName_.toString();
    }
    else {
      result += "VCSIG(" + declName_.toString() + ")";
    }

    return result;
  }

  public boolean equals(Object o)
  {
    boolean result = false;

    if (o instanceof VariableClassSignature) {
      VariableClassSignature variableClassSignature =
        (VariableClassSignature) o;
      if (declName_.equals(variableClassSignature.getName())) {
        result = true;
      }
    }

    return result;
  }

  public int hashCode()
  {
    final int constant = 31;

    int hashCode = super.hashCode();
    hashCode += "VariableClassSignature".hashCode();
    if (declName_ != null) {
      hashCode += constant * declName_.hashCode();
    }
    return hashCode;
  }
}
