
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

import net.sourceforge.czt.z.visitor.ZStrokeListVisitor;

/**
 * An implementation of the interface
 * {@link ZStrokeList}.
 *
 * @author Gnast version 0.1
 */

public class ZStrokeListImpl
  extends java.util.AbstractList<Stroke>
  implements ZStrokeList
{
  private BaseFactory factory_;

  /**
   * The list containing the data.
   */
  /*@ non_null @*/
  private List<Stroke> list_ = new ArrayList<Stroke>();

  /**
   * A list of annotations.
   */
  private List anns_ = new java.util.ArrayList();

  /**
   * The default constructor.
   *
   * Do not use it explicitly, unless you are extending this class.
   * If you want to create an instance of this class, please use the
   * {@link net.sourceforge.czt.z.ast.ZFactory object factory}.
   */
  protected ZStrokeListImpl()
  {
    factory_ = null;
  }

  protected ZStrokeListImpl(BaseFactory factory)
  {
    super();
    factory_ = factory;
  }

  public String toString()
  {
    if (factory_ != null) {
      return factory_.toString(this);
    }
    return super.toString();
  }

  /**
   * Returns a list of annotiations.
   */
  public List getAnns()
  {
    return anns_;
  }


  public ZStrokeList getStroke()
  {
    return this;
  }

  public <T> T getAnn(Class<T> aClass)
  {
    for (Object annotation : anns_) {
      if (aClass.isInstance(annotation)) {
        return (T) annotation;
      }
    }
    return null;
  }

  /**
   * Inserts the specified element at the specified position in this list.
   * Shifts the element currently at that position (if any) and any
   * subsequent elements to the right (adds one to their indices).
   *
   * @param index the index at which the specified element is to be inserted.
   * @param element the element to be inserted.
   * @throws IndexOutOfBoundsException if the index is out of range
   *         <code>(index < 0 || index > size())</code>.
   */
  public void add(int index, Stroke element)
  {
    list_.add(index, element);
  }

  /**
   * Returns the element at the specified position in this list.
   *
   * @param index the index of the elment to be returned.
   * @return the element at the specified position in this list.
   * @throws IndexOutOfBoundsException if the index is out of range
   *         <code>(index < 0 || index >= size())</code>.
   */
  public Stroke get(int index)
  {
    return list_.get(index);
  }

  /**
   * Removes the element at the specified position in this list.
   * Shifts any subsequent elements to the left
   * (subtracts one from their indices).
   * Returns the element that was removed from the list.
   *
   * @param index the index of the element to be removed.
   * @return the element previously at the specified position.
   * @throws IndexOutOfBoundsException if the index is out of range
   *         <code>(index < 0 || index >= size())</code>.
   */
  public Stroke remove(int index)
  {
    return list_.remove(index);
  }

  /**
   * Replaces the elment at the specifed position
   * in this list with the specified element.
   *
   * @param index the position of the element to replace.
   * @param element the new element to be stored at the specified position.
   * @return the element previously at the specified position.
   * @throws ArrayIndexOutOfBoundsException if <code>index</code>
   *         is out of range <code>(index < 0 || index >= size())</code>.
   */
  public Stroke set(int index, Stroke element)
  {
    return list_.set(index, element);
  }

  /**
   * Returns the number of components in this list.
   */
  public int size()
  {
    return list_.size();
  }

  public <R> R accept(Visitor<R> v)
  {
    if (v instanceof ZStrokeListVisitor) {
      ZStrokeListVisitor<R> visitor = (ZStrokeListVisitor<R>) v;
      return visitor.visitZStrokeList(this);
    }
    if (v instanceof TermVisitor) {
      TermVisitor<R> visitor = (TermVisitor<R>) v;
      return visitor.visitTerm(this);
    }
    return null;
  }

  public Object[] getChildren()
  {
    return list_.toArray();
  }

  public ZStrokeListImpl create(Object[] args)
  {
    ZStrokeListImpl result = new ZStrokeListImpl(factory_);
    for (int i = 0; i < args.length; i++) {
      result.add((Stroke) args[i]);
    }
    return result;
  }
}
