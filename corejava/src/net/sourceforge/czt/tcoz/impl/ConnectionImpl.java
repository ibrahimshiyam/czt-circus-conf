
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

package net.sourceforge.czt.tcoz.impl;

import java.util.*;
import java.util.logging.*;

import net.sourceforge.czt.base.impl.*;
import net.sourceforge.czt.util.TypesafeList;
import net.sourceforge.czt.z.ast.*;
import net.sourceforge.czt.z.impl.*;
import net.sourceforge.czt.oz.ast.*;
import net.sourceforge.czt.oz.impl.*;
import net.sourceforge.czt.tcoz.ast.*;
import net.sourceforge.czt.tcoz.visitor.*;

import net.sourceforge.czt.tcoz.visitor.ConnectionVisitor;

/**
 * An implementation of the interface
 * {@link Connection}.
 *
 * @author Gnast version 0.1
 */
public class ConnectionImpl
  extends TermAImpl   implements Connection
{
  /**
   * The default constructor.
   *
   * Do not use it explicitly, unless you are extending this class.
   * If you want to create an instance of this class, please use the
   * {@link net.sourceforge.czt.tcoz.ast.TcozFactory object factory}.
   */
  protected ConnectionImpl()
  {
  }

  /**
   * Compares the specified object with this ConnectionImpl
   * for equality.  Returns true if and only if the specified object is
   * also a(n) ConnectionImpl and all the getter methods except getAnns
   * return equal objects.
   */
  public boolean equals(Object obj)
  {
    if (obj != null) {
      if (this.getClass().equals(obj.getClass()) && super.equals(obj)) {
        ConnectionImpl object = (ConnectionImpl) obj;
        if (leftProcess_ != null) {
          if (!leftProcess_.equals(object.leftProcess_)) {
            return false;
          }
        }
        else {
          if (object.leftProcess_ != null) {
            return false;
          }
        }
        if (rightProcess_ != null) {
          if (!rightProcess_.equals(object.rightProcess_)) {
            return false;
          }
        }
        else {
          if (object.rightProcess_ != null) {
            return false;
          }
        }
        if (channels_ != null) {
          if (!channels_.equals(object.channels_)) {
            return false;
          }
        }
        else {
          if (object.channels_ != null) {
            return false;
          }
        }
        return true;
      }
    }
    return false;
  }

  /**
   * Returns the hash code value for this ConnectionImpl.
   */
  public int hashCode()
  {
    final int constant = 31;

    int hashCode = super.hashCode();
    hashCode += "ConnectionImpl".hashCode();
    if (leftProcess_ != null) {
      hashCode += constant * leftProcess_.hashCode();
    }
    if (rightProcess_ != null) {
      hashCode += constant * rightProcess_.hashCode();
    }
    if (channels_ != null) {
      hashCode += constant * channels_.hashCode();
    }
    return hashCode;
  }

  /**
   * Accepts a visitor.
   */
  public Object accept(net.sourceforge.czt.util.Visitor v)
  {
    if (v instanceof ConnectionVisitor) {
      ConnectionVisitor visitor = (ConnectionVisitor) v;
      return visitor.visitConnection(this);
    }
    return super.accept(v);
  }

  /**
   * Returns a new object of this class.
   */
  public net.sourceforge.czt.base.ast.Term create(Object[] args)
  {
    Connection zedObject = null;
    try {
      net.sourceforge.czt.oz.ast.RefNameList leftProcess = (net.sourceforge.czt.oz.ast.RefNameList) args[0];
      net.sourceforge.czt.oz.ast.RefNameList rightProcess = (net.sourceforge.czt.oz.ast.RefNameList) args[1];
      net.sourceforge.czt.oz.ast.RefNameList channels = (net.sourceforge.czt.oz.ast.RefNameList) args[2];
      zedObject = new ConnectionImpl();
      zedObject.setLeftProcess(leftProcess);
      zedObject.setRightProcess(rightProcess);
      zedObject.setChannels(channels);
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
    Object[] erg = { getLeftProcess(), getRightProcess(), getChannels() };
    return erg;
  }

  private net.sourceforge.czt.oz.ast.RefNameList leftProcess_;

  public net.sourceforge.czt.oz.ast.RefNameList getLeftProcess()
  {
    return leftProcess_;
  }

  public void setLeftProcess(net.sourceforge.czt.oz.ast.RefNameList leftProcess)
  {
    leftProcess_ = leftProcess;
  }

  private net.sourceforge.czt.oz.ast.RefNameList rightProcess_;

  public net.sourceforge.czt.oz.ast.RefNameList getRightProcess()
  {
    return rightProcess_;
  }

  public void setRightProcess(net.sourceforge.czt.oz.ast.RefNameList rightProcess)
  {
    rightProcess_ = rightProcess;
  }

  private net.sourceforge.czt.oz.ast.RefNameList channels_;

  public net.sourceforge.czt.oz.ast.RefNameList getChannels()
  {
    return channels_;
  }

  public void setChannels(net.sourceforge.czt.oz.ast.RefNameList channels)
  {
    channels_ = channels;
  }
}
