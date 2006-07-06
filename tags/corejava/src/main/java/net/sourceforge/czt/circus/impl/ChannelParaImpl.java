
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

package net.sourceforge.czt.circus.impl;

import java.util.*;
import java.util.logging.*;

import net.sourceforge.czt.base.ast.*;
import net.sourceforge.czt.base.impl.*;
import net.sourceforge.czt.base.visitor.*;
import net.sourceforge.czt.util.Visitor;
import net.sourceforge.czt.z.ast.*;
import net.sourceforge.czt.z.impl.*;
import net.sourceforge.czt.circus.ast.*;
import net.sourceforge.czt.circus.visitor.*;

import net.sourceforge.czt.circus.visitor.ChannelParaVisitor;

/**
 * An implementation of the interface
 * {@link ChannelPara}.
 *
 * @author Gnast version 0.1
 */
public class ChannelParaImpl
  extends ParaImpl   implements ChannelPara
{
  /**
   * The default constructor.
   *
   * Do not use it explicitly, unless you are extending this class.
   * If you want to create an instance of this class, please use the
   * {@link net.sourceforge.czt.circus.ast.CircusFactory object factory}.
   */
  protected ChannelParaImpl()
  {
  }

  protected ChannelParaImpl(BaseFactory factory)
  {
    super(factory);
  }

  /**
   * Compares the specified object with this ChannelParaImpl
   * for equality.  Returns true if and only if the specified object is
   * also a(n) ChannelParaImpl and all the getter methods except getAnns
   * return equal objects.
   */
  public boolean equals(Object obj)
  {
    if (obj != null) {
      if (this.getClass().equals(obj.getClass()) && super.equals(obj)) {
        ChannelParaImpl object = (ChannelParaImpl) obj;
        if (channelDecl_ != null) {
          if (!channelDecl_.equals(object.channelDecl_)) {
            return false;
          }
        }
        else {
          if (object.channelDecl_ != null) {
            return false;
          }
        }
        return true;
      }
    }
    return false;
  }

  /**
   * Returns the hash code value for this ChannelParaImpl.
   */
  public int hashCode()
  {
    final int constant = 31;

    int hashCode = super.hashCode();
    hashCode += "ChannelParaImpl".hashCode();
    if (channelDecl_ != null) {
      hashCode += constant * channelDecl_.hashCode();
    }
    return hashCode;
  }

  /**
   * Accepts a visitor.
   */
  public <R> R accept(net.sourceforge.czt.util.Visitor<R> v)
  {
    if (v instanceof ChannelParaVisitor) {
      ChannelParaVisitor<R> visitor = (ChannelParaVisitor<R>) v;
      return visitor.visitChannelPara(this);
    }
    return super.accept(v);
  }

  /**
   * Returns a new object of this class.
   */
  public ChannelParaImpl create(Object[] args)
  {
    ChannelParaImpl zedObject = null;
    try {
      net.sourceforge.czt.z.ast.DeclList channelDecl = (net.sourceforge.czt.z.ast.DeclList) args[0];
      zedObject = new ChannelParaImpl(getFactory());
      zedObject.setChannelDecl(channelDecl);
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
    Object[] erg = { getChannelDecl() };
    return erg;
  }

  private net.sourceforge.czt.z.ast.DeclList channelDecl_;

  public net.sourceforge.czt.z.ast.DeclList getChannelDecl()
  {
    return channelDecl_;
  }

  public void setChannelDecl(net.sourceforge.czt.z.ast.DeclList channelDecl)
  {
    channelDecl_ = channelDecl;
  }
}
