
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

import net.sourceforge.czt.oz.visitor.PrimaryDeclVisitor;

/**
 * An implementation of the interface
 * {@link PrimaryDecl}.
 *
 * @author Gnast version 0.1
 */
public class PrimaryDeclImpl
  extends TermImpl   implements PrimaryDecl
{
  /**
   * The default constructor.
   *
   * Do not use it explicitly, unless you are extending this class.
   * If you want to create an instance of this class, please use the
   * {@link net.sourceforge.czt.oz.ast.OzFactory object factory}.
   */
  protected PrimaryDeclImpl()
  {
  }

  protected PrimaryDeclImpl(BaseFactory factory)
  {
    super(factory);
  }

  /**
   * Compares the specified object with this PrimaryDeclImpl
   * for equality.  Returns true if and only if the specified object is
   * also a(n) PrimaryDeclImpl and all the getter methods except getAnns
   * return equal objects.
   */
  public boolean equals(Object obj)
  {
    if (obj != null) {
      if (this.getClass().equals(obj.getClass()) && super.equals(obj)) {
        PrimaryDeclImpl object = (PrimaryDeclImpl) obj;
        if (declList_ != null) {
          if (!declList_.equals(object.declList_)) {
            return false;
          }
        }
        else {
          if (object.declList_ != null) {
            return false;
          }
        }
        return true;
      }
    }
    return false;
  }

  /**
   * Returns the hash code value for this PrimaryDeclImpl.
   */
  public int hashCode()
  {
    final int constant = 31;

    int hashCode = super.hashCode();
    hashCode += "PrimaryDeclImpl".hashCode();
    if (declList_ != null) {
      hashCode += constant * declList_.hashCode();
    }
    return hashCode;
  }

  /**
   * Accepts a visitor.
   */
  public <R> R accept(net.sourceforge.czt.util.Visitor<R> v)
  {
    if (v instanceof PrimaryDeclVisitor) {
      PrimaryDeclVisitor<R> visitor = (PrimaryDeclVisitor<R>) v;
      return visitor.visitPrimaryDecl(this);
    }
    return super.accept(v);
  }

  /**
   * Returns a new object of this class.
   */
  public PrimaryDeclImpl create(Object[] args)
  {
    PrimaryDeclImpl zedObject = null;
    try {
      net.sourceforge.czt.z.ast.DeclList declList = (net.sourceforge.czt.z.ast.DeclList) args[0];
      zedObject = new PrimaryDeclImpl(getFactory());
      zedObject.setDeclList(declList);
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
    Object[] erg = { getDeclList() };
    return erg;
  }

  private net.sourceforge.czt.z.ast.DeclList declList_;

  public net.sourceforge.czt.z.ast.DeclList getDeclList()
  {
    return declList_;
  }

  public void setDeclList(net.sourceforge.czt.z.ast.DeclList declList)
  {
    declList_ = declList;
  }
  /**
   * This is a convenience method.
   * It returns a ZDeclList if #getDeclList
   * returns an instance of ZDeclList
   * and throws an UnsupportedAstClassException otherwise.
   */
  public ZDeclList getZDeclList()
  {
    DeclList object = getDeclList();
    if (object instanceof ZDeclList) {
      return (ZDeclList) object;
    }
    throw new net.sourceforge.czt.base.util.UnsupportedAstClassException();
  }
}
