/*
Copyright (C) 2004 Petra Malik
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

package net.sourceforge.czt.print.z;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import net.sourceforge.czt.base.ast.*;
import net.sourceforge.czt.base.visitor.TermVisitor;
import net.sourceforge.czt.base.visitor.VisitorUtils;
import net.sourceforge.czt.parser.util.OpTable;
import net.sourceforge.czt.print.ast.*;
import net.sourceforge.czt.session.*;
import net.sourceforge.czt.util.*;
import net.sourceforge.czt.z.ast.*;
import net.sourceforge.czt.z.util.OperatorName;
import net.sourceforge.czt.z.visitor.*;

/**
 * <p>This visitor transforms an AST into a print tree, that is an AST
 * prepared for printing.</p>
 *
 * <p>In order to print, precedences and associativity of operators
 * needs to be known.  This information is provided by an SectInfo
 * object.</p>
 *
 * <p>Note that fixed precedences and associativities are defined
 * in the Z standard in Table 31; user defined precedences and
 * associativities are obtained from an operator table.  This
 * implies that this visitor cannot be used for an arbitrary term,
 * like an expression, without providing the operator table as well.</p>
 *
 * <p>The recommended way to use this visitor is via the #run(ZSect)
 * or #run(Spec) methods.  In this case, the operator table is
 * obtained from the SectInfo object (provided in the constructor of
 * this class) as soon as the name of the current section to be
 * visited becomes available (which happens when visiting a
 * ZSect).</p>
 *
 * <p>It is also possible to provide an operator table explicitly via
 * the #run(Term, OpTable) method.  This method enables the handling
 * of arbitrary terms where the name of the section is not apparent.
 * Note that this explicity provided operator table is discarded when
 * a ZSect is visited.  As soon as a ZSect is visited, the SectInfo
 * object is consulted to provide an operator table for the given
 * section and this operator table is used instead of the explicitly
 * provided one (even if the new one is <code>null</code>).</p>
 *
 * <p>It is not recommended to call the accept method of a term to use
 * this visitor since it is not guaranteed that the correct operator
 * table is used.</p>
 *
 * @author Petra Malik
 */
public class AstToPrintTreeVisitor
  implements TermVisitor,
             ApplExprVisitor,
             RefExprVisitor,
             ZSectVisitor
{
  /**
   * The operator table of the current section.  It is
   * used to lookup precedence and associativity of user
   * defined operators.
   */
  private OpTable opTable_;

  /**
   * Provides the operator table for sections.
   */
  private SectionInfo sectInfo_;

  /**
   * Creates a new ast to print tree visitor.
   * The section information should be able to provide information of
   * type <code>net.sourceforge.czt.parser.util.OpTable.class</code>.
   */
  public AstToPrintTreeVisitor(SectionInfo sectInfo)
  {
    sectInfo_ = sectInfo;
  }

  public Term run(String sectionName)
  {
    ZSect zSect = (ZSect) sectInfo_.getInfo(sectionName, ZSect.class);
    return (Term) zSect.accept(this);
  }

  /**
   * <p>Visits a term and transforms it into a printable tree.  The given
   * operator table is used to lookup precedence and associativity
   * of user defined operators, but only if the name of the section
   * is not apparent from the term.</p>
   * <p>For instance, the given operator table is used if the given
   * term is an expression, predicate, or paragraph, but not if the
   * given term is a Z section or specification.</p>
   */
  public Term run(Term term, OpTable opTable)
  {
    opTable_ = opTable;
    return (Term) term.accept(this);
  }

  /**
   * Visits all children of a term.  If at least one of the children
   * has changed during that visit, a new term of the same class is
   * created that contains the new children.  A child that has not
   * changed is shared between the new and the old AST.
   */
  public Object visitTerm(Term term)
  {
    return VisitorUtils.visitTerm(this, term, true);
  }

  /**
   * Transforms each function application (an application expression
   * with Mixfix set to <code>true</code>) into an
   * OperatorApplication, and each application (an application
   * expression with Mixfix set to <code>false</code>) into an
   * Application.
   */
  public Object visitApplExpr(ApplExpr applExpr)
  {
    final boolean isFunctionApplication =
      applExpr.getMixfix().booleanValue();
    if (isFunctionApplication) {
      RefExpr refExpr = (RefExpr) applExpr.getLeftExpr();
      OperatorName opName = refExpr.getRefName().getOperatorName();
      Expr args = (Expr) applExpr.getRightExpr().accept(this);
      List argList = new ArrayList();
      if (opName.isUnary()) {
        argList.add(args);
      }
      else {
        TupleExpr tuple = (TupleExpr) args;
        argList.addAll(tuple.getExpr());
      }
      return createOperatorApplication(opName, argList);
    }
    final Expr leftExpr = (Expr) applExpr.getLeftExpr().accept(this);
    final Expr rightExpr = (Expr) applExpr.getRightExpr().accept(this);
    Application appl = new Application();
    appl.setLeftExpr(leftExpr);
    appl.setRightExpr(rightExpr);
    return appl;
  }

  /**
   * Transforms each generic operator application, that is each
   * reference expression with Mixfix set to <code>true</code> into an
   * OperatorApplication.
   */
  public Object visitRefExpr(RefExpr refExpr)
  {
    final boolean isGenericOperatorApplication =
      refExpr.getMixfix().booleanValue();
    if (isGenericOperatorApplication) {
      final OperatorName opName = refExpr.getRefName().getOperatorName();
      final ListTerm argList = (ListTerm) refExpr.getExpr().accept(this);
      return createOperatorApplication(opName, argList);
    }
    return VisitorUtils.visitTerm(this, refExpr, true);
  }

  /**
   * Sets up the operator table for this Z section.
   */
  public Object visitZSect(ZSect zSect)
  {
    final String name = zSect.getName();
    opTable_ = (OpTable) sectInfo_.getInfo(name, OpTable.class);
    if (opTable_ == null) {
      String message = "Cannot get operator table for " + name + "; " +
        "try to print anyway ... ";
      printWarning(message);
      List parentOpTables = new ArrayList();
      for (Iterator iter = zSect.getParent().iterator(); iter.hasNext(); ) {
        Parent parent = (Parent) iter.next();
        OpTable parentOpTable = getOpTable(parent.getWord());
        if (parentOpTable != null) {
          parentOpTables.add(parentOpTable);
        }
      }
      if (parentOpTables.size() > 0) {
        try {
          opTable_ = new OpTable(zSect.getName(), parentOpTables);
        }
        catch (OpTable.OperatorException e) {
          throw new CannotPrintAstException(e);
        }
      }
    }
    return visitTerm(zSect);
  }

  protected boolean isPostfix(OperatorName opName)
  {
    if (opName == null) return false;
    return OperatorName.Fixity.POSTFIX.equals(opName.getFixity());
  }

  protected boolean isPrefix(OperatorName opName)
  {
    if (opName == null) return false;
    return OperatorName.Fixity.PREFIX.equals(opName.getFixity());
  }

  protected boolean isInfix(OperatorName opName)
  {
    if (opName == null) return false;
    return OperatorName.Fixity.INFIX.equals(opName.getFixity());
  }

  /**
   * Retrieves the operator table of the given section.
   */
  private OpTable getOpTable(String sectionName)
  {
    return (OpTable) sectInfo_.getInfo(sectionName, OpTable.class);
  }

  private void printWarning(String message)
  {
    CztLogger.getLogger(AstToPrintTreeVisitor.class).warning(message);
  }

  /**
   * @throws NullPointerException if <code>opName</code> is <code>null</null>.
   */
  private OperatorApplication createOperatorApplication(OperatorName opName,
                                                        List argList)
  {
    Precedence prec = null;
    Assoc assoc = null;
    if (isInfix(opName)) {
      if (opTable_ != null) {
        OpTable.OpInfo opInfo = opTable_.lookup(opName);
        if (opInfo != null) {
          if (opInfo.getPrec() == null) {
            String message =
              "Cannot find precedence of infix operator " + opName;
            throw new CannotPrintAstException(message);
          }
          prec = new Precedence(180, opInfo.getPrec().intValue());
          assoc = opInfo.getAssoc();
        }
        else {
          String message =
            "Cannot find precedence and associativity for '" + opName + "'";
          throw new CannotPrintAstException(message);
        }
      }
      else {
        String message =
          "Cannot find precedence and associativity for '" + opName +
          "'; no operator table available";
        throw new CannotPrintAstException(message);
      }
    }
    else if (isPostfix(opName)) {
      prec = new Precedence(200);
    }
    else if (isPrefix(opName)) {
      prec = new Precedence(190);
    }
    return new OperatorApplication(opName, argList, prec, assoc);
  }

  public static class CannotPrintAstException
    extends RuntimeException
  {
    public CannotPrintAstException(String message)
    {
      super(message);
    }

    public CannotPrintAstException(Exception cause)
    {
      super(cause);
    }
  }
}
