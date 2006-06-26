
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

package net.sourceforge.czt.z.impl;

import java.util.*;
import java.util.logging.*;

import net.sourceforge.czt.base.ast.*;
import net.sourceforge.czt.base.impl.*;
import net.sourceforge.czt.base.visitor.*;
import net.sourceforge.czt.util.Visitor;
import net.sourceforge.czt.z.ast.*;
import net.sourceforge.czt.z.visitor.*;

import net.sourceforge.czt.z.visitor.UnparsedZSectVisitor;

/**
 * An implementation of the interface
 * {@link UnparsedZSect}.
 *
 * @author Gnast version 0.1
 */
public class UnparsedZSectImpl
  extends SectImpl   implements UnparsedZSect
{
  /**
   * The default constructor.
   *
   * Do not use it explicitly, unless you are extending this class.
   * If you want to create an instance of this class, please use the
   * {@link net.sourceforge.czt.z.ast.ZFactory object factory}.
   */
  protected UnparsedZSectImpl()
  {
  }

  protected UnparsedZSectImpl(BaseFactory factory)
  {
    super(factory);
  }

  /**
   * Compares the specified object with this UnparsedZSectImpl
   * for equality.  Returns true if and only if the specified object is
   * also a(n) UnparsedZSectImpl and all the getter methods except getAnns
   * return equal objects.
   */
  public boolean equals(Object obj)
  {
    if (obj != null) {
      if (this.getClass().equals(obj.getClass()) && super.equals(obj)) {
        UnparsedZSectImpl object = (UnparsedZSectImpl) obj;
        if (content_ != null) {
          if (!content_.equals(object.content_)) {
            return false;
          }
        }
        else {
          if (object.content_ != null) {
            return false;
          }
        }
        return true;
      }
    }
    return false;
  }

  /**
   * Returns the hash code value for this UnparsedZSectImpl.
   */
  public int hashCode()
  {
    final int constant = 31;

    int hashCode = super.hashCode();
    hashCode += "UnparsedZSectImpl".hashCode();
    if (content_ != null) {
      hashCode += constant * content_.hashCode();
    }
    return hashCode;
  }

  /**
   * Accepts a visitor.
   */
  public <R> R accept(net.sourceforge.czt.util.Visitor<R> v)
  {
    if (v instanceof UnparsedZSectVisitor) {
      UnparsedZSectVisitor<R> visitor = (UnparsedZSectVisitor<R>) v;
      return visitor.visitUnparsedZSect(this);
    }
    return super.accept(v);
  }

  /**
   * Returns a new object of this class.
   */
  public UnparsedZSectImpl create(Object[] args)
  {
    UnparsedZSectImpl zedObject = null;
    try {
      java.util.List content = (java.util.List) args[0];
      zedObject = new UnparsedZSectImpl(getFactory());
      zedObject.setContent(content);
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
    Object[] erg = { getContent() };
    return erg;
  }

  private java.util.List content_;

  public java.util.List getContent()
  {
    return content_;
  }

  public void setContent(java.util.List content)
  {
    content_ = content;
  }
}
