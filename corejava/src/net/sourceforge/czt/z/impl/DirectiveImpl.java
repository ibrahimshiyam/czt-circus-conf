
/******************************************************************************
DO NOT EDIT THIS FILE!  THIS FILE WAS GENERATED BY GNAST
FROM THE TEMPLATE FILE AstClass.vm.
ANY MODIFICATIONS TO THIS FILE WILL BE LOST UPON REGENERATION.

-------------------------------------------------------------------------------

Copyright 2003, 2004 Mark Utting
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

import net.sourceforge.czt.z.visitor.DirectiveVisitor;

/**
 * An implementation of the interface
 * {@link Directive}.
 *
 * @author Gnast version 0.1
 */
public class DirectiveImpl
  extends TermImpl   implements Directive
{
  /**
   * The default constructor.
   *
   * Do not use it explicitly, unless you are extending this class.
   * If you want to create an instance of this class, please use the
   * {@link net.sourceforge.czt.z.ast.ZFactory object factory}.
   */
  protected DirectiveImpl()
  {
  }

  /**
   * Compares the specified object with this DirectiveImpl
   * for equality.  Returns true if and only if the specified object is
   * also a(n) DirectiveImpl and all the getter methods except getAnns
   * return equal objects.
   */
  public boolean equals(Object obj)
  {
    if (obj != null) {
      if (this.getClass().equals(obj.getClass()) && super.equals(obj)) {
        DirectiveImpl object = (DirectiveImpl) obj;
        if (command_ != null) {
          if (!command_.equals(object.command_)) {
            return false;
          }
        }
        else {
          if (object.command_ != null) {
            return false;
          }
        }
        if (unicode_ != null) {
          if (!unicode_.equals(object.unicode_)) {
            return false;
          }
        }
        else {
          if (object.unicode_ != null) {
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
   * Returns the hash code value for this DirectiveImpl.
   */
  public int hashCode()
  {
    final int constant = 31;

    int hashCode = super.hashCode();
    hashCode += "DirectiveImpl".hashCode();
    if (command_ != null) {
      hashCode += constant * command_.hashCode();
    }
    if (unicode_ != null) {
      hashCode += constant * unicode_.hashCode();
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
    if (v instanceof DirectiveVisitor) {
      DirectiveVisitor visitor = (DirectiveVisitor) v;
      return visitor.visitDirective(this);
    }
    return super.accept(v);
  }

  /**
   * Returns a new object of this class.
   */
  public net.sourceforge.czt.base.ast.Term create(Object[] args)
  {
    Directive zedObject = null;
    try {
      String command = (String) args[0];
      String unicode = (String) args[1];
      DirectiveType type = (DirectiveType) args[2];
      zedObject = new DirectiveImpl();
      zedObject.setCommand(command);
      zedObject.setUnicode(unicode);
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
    Object[] erg = { getCommand(), getUnicode(), getType() };
    return erg;
  }

  private String command_;

  public String getCommand()
  {
    return command_;
  }

  public void setCommand(String command)
  {
    command_ = command;
  }

  private String unicode_;

  public String getUnicode()
  {
    return unicode_;
  }

  public void setUnicode(String unicode)
  {
    unicode_ = unicode;
  }

  private DirectiveType type_;

  public DirectiveType getType()
  {
    return type_;
  }

  public void setType(DirectiveType type)
  {
    type_ = type;
  }
}
