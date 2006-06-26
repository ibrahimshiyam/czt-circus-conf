
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

package net.sourceforge.czt.tcoz.impl;

import java.util.*;
import java.util.logging.*;

import net.sourceforge.czt.base.ast.*;
import net.sourceforge.czt.base.impl.*;
import net.sourceforge.czt.base.visitor.*;
import net.sourceforge.czt.util.Visitor;
import net.sourceforge.czt.z.ast.*;
import net.sourceforge.czt.z.impl.*;
import net.sourceforge.czt.oz.ast.*;
import net.sourceforge.czt.oz.impl.*;
import net.sourceforge.czt.tcoz.ast.*;
import net.sourceforge.czt.tcoz.visitor.*;

import net.sourceforge.czt.tcoz.visitor.TopologyProExprVisitor;

/**
 * An implementation of the interface
 * {@link TopologyProExpr}.
 *
 * @author Gnast version 0.1
 */
public class TopologyProExprImpl
  extends OpExprImpl   implements TopologyProExpr
{
  /**
   * The default constructor.
   *
   * Do not use it explicitly, unless you are extending this class.
   * If you want to create an instance of this class, please use the
   * {@link net.sourceforge.czt.tcoz.ast.TcozFactory object factory}.
   */
  protected TopologyProExprImpl()
  {
  }

  protected TopologyProExprImpl(BaseFactory factory)
  {
    super(factory);
  }

  /**
   * Compares the specified object with this TopologyProExprImpl
   * for equality.  Returns true if and only if the specified object is
   * also a(n) TopologyProExprImpl and all the getter methods except getAnns
   * return equal objects.
   */
  public boolean equals(Object obj)
  {
    if (obj != null) {
      if (this.getClass().equals(obj.getClass()) && super.equals(obj)) {
        TopologyProExprImpl object = (TopologyProExprImpl) obj;
        if (connection_ != null) {
          if (!connection_.equals(object.connection_)) {
            return false;
          }
        }
        else {
          if (object.connection_ != null) {
            return false;
          }
        }
        return true;
      }
    }
    return false;
  }

  /**
   * Returns the hash code value for this TopologyProExprImpl.
   */
  public int hashCode()
  {
    final int constant = 31;

    int hashCode = super.hashCode();
    hashCode += "TopologyProExprImpl".hashCode();
    if (connection_ != null) {
      hashCode += constant * connection_.hashCode();
    }
    return hashCode;
  }

  /**
   * Accepts a visitor.
   */
  public <R> R accept(net.sourceforge.czt.util.Visitor<R> v)
  {
    if (v instanceof TopologyProExprVisitor) {
      TopologyProExprVisitor<R> visitor = (TopologyProExprVisitor<R>) v;
      return visitor.visitTopologyProExpr(this);
    }
    return super.accept(v);
  }

  /**
   * Returns a new object of this class.
   */
  public TopologyProExprImpl create(Object[] args)
  {
    TopologyProExprImpl zedObject = null;
    try {
      java.util.List<Connection> connection = (java.util.List<Connection>) args[0];
      zedObject = new TopologyProExprImpl(getFactory());
      if (connection != null) {
        zedObject.getConnection().addAll(connection);
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
    Object[] erg = { getConnection() };
    return erg;
  }


  private ListTerm<Connection> connection_ =
    new ListTermImpl<Connection>();

  public ListTerm<Connection> getConnection()
  {
    return connection_;
  }
}
