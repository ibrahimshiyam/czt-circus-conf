
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

import net.sourceforge.czt.oz.visitor.OpTextVisitor;

/**
 * An implementation of the interface
 * {@link OpText}.
 *
 * @author Gnast version 0.1
 */
public class OpTextImpl
  extends TermAImpl   implements OpText
{
  /**
   * The default constructor.
   *
   * Do not use it explicitly, unless you are extending this class.
   * If you want to create an instance of this class, please use the
   * {@link net.sourceforge.czt.oz.ast.OzFactory object factory}.
   */
  protected OpTextImpl()
  {
  }

  /**
   * Compares the specified object with this OpTextImpl
   * for equality.  Returns true if and only if the specified object is
   * also a(n) OpTextImpl and all the getter methods except getAnns
   * return equal objects.
   */
  public boolean equals(Object obj)
  {
    if (obj != null) {
      if (this.getClass().equals(obj.getClass()) && super.equals(obj)) {
        OpTextImpl object = (OpTextImpl) obj;
        if (delta_ != null) {
          if (!delta_.equals(object.delta_)) {
            return false;
          }
        }
        else {
          if (object.delta_ != null) {
            return false;
          }
        }
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
        return true;
      }
    }
    return false;
  }

  /**
   * Returns the hash code value for this OpTextImpl.
   */
  public int hashCode()
  {
    final int constant = 31;

    int hashCode = super.hashCode();
    hashCode += "OpTextImpl".hashCode();
    if (delta_ != null) {
      hashCode += constant * delta_.hashCode();
    }
    if (schText_ != null) {
      hashCode += constant * schText_.hashCode();
    }
    return hashCode;
  }

  /**
   * Accepts a visitor.
   */
  public Object accept(net.sourceforge.czt.util.Visitor v)
  {
    if (v instanceof OpTextVisitor) {
      OpTextVisitor visitor = (OpTextVisitor) v;
      return visitor.visitOpText(this);
    }
    return super.accept(v);
  }

  /**
   * Returns a new object of this class.
   */
  public net.sourceforge.czt.base.ast.Term create(Object[] args)
  {
    OpText zedObject = null;
    try {
      java.util.List delta = (java.util.List) args[0];
      net.sourceforge.czt.z.ast.SchText schText = (net.sourceforge.czt.z.ast.SchText) args[1];
      zedObject = new OpTextImpl();
      if (delta != null) {
        zedObject.getDelta().addAll(delta);
      }
      zedObject.setSchText(schText);
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
    Object[] erg = { getDelta(), getSchText() };
    return erg;
  }


  private net.sourceforge.czt.base.ast.ListTerm delta_ =
    new net.sourceforge.czt.base.impl.ListTermImpl(net.sourceforge.czt.z.ast.RefName.class);

  public net.sourceforge.czt.base.ast.ListTerm getDelta()
  {
    return delta_;
  }

  private net.sourceforge.czt.z.ast.SchText schText_;

  public net.sourceforge.czt.z.ast.SchText getSchText()
  {
    return schText_;
  }

  public void setSchText(net.sourceforge.czt.z.ast.SchText schText)
  {
    schText_ = schText;
  }
}
