
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

import net.sourceforge.czt.base.impl.*;
import net.sourceforge.czt.util.TypesafeList;
import net.sourceforge.czt.z.ast.*;
import net.sourceforge.czt.z.visitor.*;

import net.sourceforge.czt.z.visitor.NameSectTypeTripleVisitor;

/**
 * An implementation of the interface
 * {@link NameSectTypeTriple}.
 *
 * @author Gnast version 0.1
 */
public class NameSectTypeTripleImpl
  extends TermImpl   implements NameSectTypeTriple
{
  /**
   * The default constructor.
   *
   * Do not use it explicitly, unless you are extending this class.
   * If you want to create an instance of this class, please use the
   * {@link net.sourceforge.czt.z.ast.ZFactory object factory}.
   */
  protected NameSectTypeTripleImpl()
  {
  }

  /**
   * Compares the specified object with this NameSectTypeTripleImpl
   * for equality.  Returns true if and only if the specified object is
   * also a(n) NameSectTypeTripleImpl and all the getter methods except getAnns
   * return equal objects.
   */
  public boolean equals(Object obj)
  {
    if (obj != null) {
      if (this.getClass().equals(obj.getClass()) && super.equals(obj)) {
        NameSectTypeTripleImpl object = (NameSectTypeTripleImpl) obj;
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
        if (sect_ != null) {
          if (!sect_.equals(object.sect_)) {
            return false;
          }
        }
        else {
          if (object.sect_ != null) {
            return false;
          }
        }
        if (type_ != null) {
          if (!type_.equals(object.type_)) {
            return false;
          }
        }
        else {
          if (object.type_ != null) {
            return false;
          }
        }
        return true;
      }
    }
    return false;
  }

  /**
   * Returns the hash code value for this NameSectTypeTripleImpl.
   */
  public int hashCode()
  {
    final int constant = 31;

    int hashCode = super.hashCode();
    hashCode += "NameSectTypeTripleImpl".hashCode();
    if (name_ != null) {
      hashCode += constant * name_.hashCode();
    }
    if (sect_ != null) {
      hashCode += constant * sect_.hashCode();
    }
    if (type_ != null) {
      hashCode += constant * type_.hashCode();
    }
    return hashCode;
  }

  /**
   * Accepts a visitor.
   */
  public Object accept(net.sourceforge.czt.util.Visitor v)
  {
    if (v instanceof NameSectTypeTripleVisitor) {
      NameSectTypeTripleVisitor visitor = (NameSectTypeTripleVisitor) v;
      return visitor.visitNameSectTypeTriple(this);
    }
    return super.accept(v);
  }

  /**
   * Returns a new object of this class.
   */
  public net.sourceforge.czt.base.ast.Term create(Object[] args)
  {
    NameSectTypeTriple zedObject = null;
    try {
      DeclName name = (DeclName) args[0];
      String sect = (String) args[1];
      Type type = (Type) args[2];
      zedObject = new NameSectTypeTripleImpl();
      zedObject.setName(name);
      zedObject.setSect(sect);
      zedObject.setType(type);
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
    Object[] erg = { getName(), getSect(), getType() };
    return erg;
  }

  private DeclName name_;

  public DeclName getName()
  {
    return name_;
  }

  public void setName(DeclName name)
  {
    name_ = name;
  }

  private String sect_;

  public String getSect()
  {
    return sect_;
  }

  public void setSect(String sect)
  {
    sect_ = sect;
  }

  private Type type_;

  public Type getType()
  {
    return type_;
  }

  public void setType(Type type)
  {
    type_ = type;
  }
}
