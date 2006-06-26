
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

import net.sourceforge.czt.circus.visitor.RefinementConjParaVisitor;

/**
 * An implementation of the interface
 * {@link RefinementConjPara}.
 *
 * @author Gnast version 0.1
 */
public class RefinementConjParaImpl
  extends CircusConjParaImpl   implements RefinementConjPara
{
  /**
   * The default constructor.
   *
   * Do not use it explicitly, unless you are extending this class.
   * If you want to create an instance of this class, please use the
   * {@link net.sourceforge.czt.circus.ast.CircusFactory object factory}.
   */
  protected RefinementConjParaImpl()
  {
  }

  protected RefinementConjParaImpl(BaseFactory factory)
  {
    super(factory);
  }

  /**
   * Compares the specified object with this RefinementConjParaImpl
   * for equality.  Returns true if and only if the specified object is
   * also a(n) RefinementConjParaImpl and all the getter methods except getAnns
   * return equal objects.
   */
  public boolean equals(Object obj)
  {
    if (obj != null) {
      if (this.getClass().equals(obj.getClass()) && super.equals(obj)) {
        RefinementConjParaImpl object = (RefinementConjParaImpl) obj;
        if (specification_ != null) {
          if (!specification_.equals(object.specification_)) {
            return false;
          }
        }
        else {
          if (object.specification_ != null) {
            return false;
          }
        }
        if (implementation_ != null) {
          if (!implementation_.equals(object.implementation_)) {
            return false;
          }
        }
        else {
          if (object.implementation_ != null) {
            return false;
          }
        }
        if (model_ != null) {
          if (!model_.equals(object.model_)) {
            return false;
          }
        }
        else {
          if (object.model_ != null) {
            return false;
          }
        }
        return true;
      }
    }
    return false;
  }

  /**
   * Returns the hash code value for this RefinementConjParaImpl.
   */
  public int hashCode()
  {
    final int constant = 31;

    int hashCode = super.hashCode();
    hashCode += "RefinementConjParaImpl".hashCode();
    if (specification_ != null) {
      hashCode += constant * specification_.hashCode();
    }
    if (implementation_ != null) {
      hashCode += constant * implementation_.hashCode();
    }
    if (model_ != null) {
      hashCode += constant * model_.hashCode();
    }
    return hashCode;
  }

  /**
   * Accepts a visitor.
   */
  public <R> R accept(net.sourceforge.czt.util.Visitor<R> v)
  {
    if (v instanceof RefinementConjParaVisitor) {
      RefinementConjParaVisitor<R> visitor = (RefinementConjParaVisitor<R>) v;
      return visitor.visitRefinementConjPara(this);
    }
    return super.accept(v);
  }

  /**
   * Returns a new object of this class.
   */
  public RefinementConjParaImpl create(Object[] args)
  {
    RefinementConjParaImpl zedObject = null;
    try {
      CircusAction specification = (CircusAction) args[0];
      CircusAction implementation = (CircusAction) args[1];
      Model model = (Model) args[2];
      zedObject = new RefinementConjParaImpl(getFactory());
      zedObject.setSpecification(specification);
      zedObject.setImplementation(implementation);
      zedObject.setModel(model);
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
    Object[] erg = { getSpecification(), getImplementation(), getModel() };
    return erg;
  }

  private CircusAction specification_;

  public CircusAction getSpecification()
  {
    return specification_;
  }

  public void setSpecification(CircusAction specification)
  {
    specification_ = specification;
  }

  private CircusAction implementation_;

  public CircusAction getImplementation()
  {
    return implementation_;
  }

  public void setImplementation(CircusAction implementation)
  {
    implementation_ = implementation;
  }

  private Model model_;

  public Model getModel()
  {
    return model_;
  }

  public void setModel(Model model)
  {
    model_ = model;
  }
}
