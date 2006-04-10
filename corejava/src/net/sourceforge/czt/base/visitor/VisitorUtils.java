/*
  Copyright (C) 2003, 2004, 2006 Mark Utting
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
*/

package net.sourceforge.czt.base.visitor;

import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.logging.Logger;

import net.sourceforge.czt.base.ast.Term;

import net.sourceforge.czt.util.Visitor;

/**
 * Static methods for visiting
 * {@link net.sourceforge.czt.base.ast.Term Z terms}.
 *
 * @author Petra Malik
 */
public final class VisitorUtils
{
  /**
   * No instances of this class are needed.
   */
  private VisitorUtils()
  {
  }

  /**
   * The class name of this class;
   * used for logging purposes.
   *
   * @return the name of this class.
   */
  private static String getClassName()
  {
    return "VisitorUtils";
  }

  /**
   * Returns the logger used for logging.
   *
   * @return the logger used for this class.
   */
  private static Logger getLogger()
  {
    return Logger.getLogger("net.sourceforge.czt.base.util."
                            + getClassName());
  }

  /**
   * <p>Visits all the terms and lists contained in this array
   * using the accept-method of term
   * with the provided visitor as argument.</p>
   *
   * <p>Note that arrays inside the given array are not visited.</p>
   *
   * @param visitor the Visitor used for visiting the Term elements.
   * @param array the array to be visited.
   * @throws NullPointerException if <code>array</code> is <code>null</code>.
   */
  public static void visitArray(Visitor visitor, Object[] array)
  {
    Object[] arguments = {visitor, array };
    getLogger().entering(getClassName(), "visitArray", arguments);
    for (int i = 0; i < array.length; i++) {
      Object object = array[i];
      if (object instanceof Term) {
        ((Term) object).accept(visitor);
      }
    }
  }

  /**
   * <p>Visits a term by visiting all its children returned via
   * the getChildren method of Term.  The returned term has the
   * return values of the correpsonding visit-calls as children.</p>
   *
   * @param visitor the Visitor used for visiting the term.
   * @param term the term to be visited.
   * @param share a flag used to indicate whether a term whos children are
   *              returned unchanged by the visitor should be shared
   *              (returned without copying).
   * @return a term that has the return values of the visit-calls as children.
   *         Argument <code>term</code> is returned unchanged
   *         iff each visit call returns the object it is visiting and
   *         <code>share</code> is <code>true</code>.
   * @throws IllegalArgumentException if a new term cannot be created using
   *         the new children.
   * @throws NullPointerException if <code>term</code> is <code>null</code>.
   */
  public static Term visitTerm(Visitor visitor, Term term, boolean share)
  {
    Object[] arguments = {visitor, term, Boolean.valueOf(share)};
    getLogger().entering(getClassName(), "visitTerm", arguments);
    boolean changed = false;
    Object[] args = term.getChildren();
    for (int i = 0; i < args.length; i++) {
      if (args[i] instanceof Term) {
        Object object = ((Term) args[i]).accept(visitor);
        if (object != args[i]) {
          args[i] = object;
          changed = true;
        }
      }
    }
    if (!changed && share) {
      getLogger().exiting(getClassName(), "visitTerm", term);
      return term;
    }
    getLogger().fine("Term has changed.");
    Term newTerm = term.create(args);
    getLogger().exiting(getClassName(), "visitTerm", newTerm);
    return newTerm;
  }

  /**
   * <p>Visits a term by visiting all its children returned via
   * the getChildren method of Term.</p>
   */
  public static void visitTerm(Visitor visitor, Term term)
  {
    Object[] arguments = {visitor, term};
    getLogger().entering(getClassName(), "visitTerm", arguments);
    Object[] args = term.getChildren();
    for (int i = 0; i < args.length; i++) {
      if (args[i] instanceof Term) {
        ((Term) args[i]).accept(visitor);
      }
    }
  }

  /**
   * Prints a warning to stderr about any visitXXX methods
   * of the provided visitor that may not be called
   * because it does not implement the associated interface.
   *
   * @param visitor the visitor to be checked.
   */
  public static void checkVisitorRules(Visitor visitor)
  {
    Class visitorClass = visitor.getClass();
    Method[] methods = visitorClass.getDeclaredMethods();
    Class[] interfaces = visitorClass.getInterfaces();
    for (int i = 0; i < methods.length; i++) {
      String methodName = methods[i].getName();
      final String visitMethodStart = "visit";
      if (methodName.startsWith(visitMethodStart)) {
        String interfaceName =
          methodName.substring(visitMethodStart.length()) + "Visitor";
        boolean found = false;
        for (int j = 0; j < interfaces.length && !found; j++) {
          found = interfaces[j].getName().endsWith(interfaceName);
        }
        if (!found) {
          System.err.println("Warning: class "
                             + visitorClass.getName()
                             + " should implement interface "
                             + interfaceName + ".");
        }
      }
    }
  }
}
