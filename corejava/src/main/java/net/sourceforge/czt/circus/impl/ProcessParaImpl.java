
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

import net.sourceforge.czt.circus.visitor.ProcessParaVisitor;

/**
 * An implementation of the interface
 * {@link ProcessPara}.
 *
 * @author Gnast version 0.1
 */
public class ProcessParaImpl
  extends ParaImpl   implements ProcessPara
{
  /**
   * The default constructor.
   *
   * Do not use it explicitly, unless you are extending this class.
   * If you want to create an instance of this class, please use the
   * {@link net.sourceforge.czt.circus.ast.CircusFactory object factory}.
   */
  protected ProcessParaImpl()
  {
  }

  protected ProcessParaImpl(BaseFactory factory)
  {
    super(factory);
  }

  /**
   * Compares the specified object with this ProcessParaImpl
   * for equality.  Returns true if and only if the specified object is
   * also a(n) ProcessParaImpl and all the getter methods except getAnns
   * return equal objects.
   */
  public boolean equals(Object obj)
  {
    if (obj != null) {
      if (this.getClass().equals(obj.getClass()) && super.equals(obj)) {
        ProcessParaImpl object = (ProcessParaImpl) obj;
        if (processName_ != null) {
          if (!processName_.equals(object.processName_)) {
            return false;
          }
        }
        else {
          if (object.processName_ != null) {
            return false;
          }
        }
        if (genFormals_ != null) {
          if (!genFormals_.equals(object.genFormals_)) {
            return false;
          }
        }
        else {
          if (object.genFormals_ != null) {
            return false;
          }
        }
        if (circusProcess_ != null) {
          if (!circusProcess_.equals(object.circusProcess_)) {
            return false;
          }
        }
        else {
          if (object.circusProcess_ != null) {
            return false;
          }
        }
        return true;
      }
    }
    return false;
  }

  /**
   * Returns the hash code value for this ProcessParaImpl.
   */
  public int hashCode()
  {
    final int constant = 31;

    int hashCode = super.hashCode();
    hashCode += "ProcessParaImpl".hashCode();
    if (processName_ != null) {
      hashCode += constant * processName_.hashCode();
    }
    if (genFormals_ != null) {
      hashCode += constant * genFormals_.hashCode();
    }
    if (circusProcess_ != null) {
      hashCode += constant * circusProcess_.hashCode();
    }
    return hashCode;
  }

  /**
   * Accepts a visitor.
   */
  public <R> R accept(net.sourceforge.czt.util.Visitor<R> v)
  {
    if (v instanceof ProcessParaVisitor) {
      ProcessParaVisitor<R> visitor = (ProcessParaVisitor<R>) v;
      return visitor.visitProcessPara(this);
    }
    return super.accept(v);
  }

  /**
   * Returns a new object of this class.
   */
  public ProcessParaImpl create(Object[] args)
  {
    ProcessParaImpl zedObject = null;
    try {
      net.sourceforge.czt.z.ast.DeclName processName = (net.sourceforge.czt.z.ast.DeclName) args[0];
      net.sourceforge.czt.z.ast.DeclNameList genFormals = (net.sourceforge.czt.z.ast.DeclNameList) args[1];
      CircusProcess circusProcess = (CircusProcess) args[2];
      zedObject = new ProcessParaImpl(getFactory());
      zedObject.setProcessName(processName);
      zedObject.setGenFormals(genFormals);
      zedObject.setCircusProcess(circusProcess);
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
    Object[] erg = { getProcessName(), getGenFormals(), getCircusProcess() };
    return erg;
  }

  private net.sourceforge.czt.z.ast.DeclName processName_;

  public net.sourceforge.czt.z.ast.DeclName getProcessName()
  {
    return processName_;
  }

  public void setProcessName(net.sourceforge.czt.z.ast.DeclName processName)
  {
    processName_ = processName;
  }

  private net.sourceforge.czt.z.ast.DeclNameList genFormals_;

  public net.sourceforge.czt.z.ast.DeclNameList getGenFormals()
  {
    return genFormals_;
  }

  public void setGenFormals(net.sourceforge.czt.z.ast.DeclNameList genFormals)
  {
    genFormals_ = genFormals;
  }

  private CircusProcess circusProcess_;

  public CircusProcess getCircusProcess()
  {
    return circusProcess_;
  }

  public void setCircusProcess(CircusProcess circusProcess)
  {
    circusProcess_ = circusProcess;
  }
}
