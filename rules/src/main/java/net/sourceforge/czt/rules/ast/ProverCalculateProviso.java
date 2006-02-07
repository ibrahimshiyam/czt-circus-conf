/*
  Copyright (C) 2005 Petra Malik
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

package net.sourceforge.czt.rules.ast;

import java.util.*;

import net.sourceforge.czt.base.ast.Term;
import net.sourceforge.czt.base.visitor.*;
import net.sourceforge.czt.parser.util.DefinitionTable;
import net.sourceforge.czt.rules.*;
import net.sourceforge.czt.rules.unification.*;
import net.sourceforge.czt.session.*;
import net.sourceforge.czt.typecheck.z.TypeCheckUtils;
import net.sourceforge.czt.util.CztException;
import net.sourceforge.czt.z.ast.*;
import net.sourceforge.czt.z.visitor.*;
import net.sourceforge.czt.zpatt.ast.*;
import net.sourceforge.czt.zpatt.impl.CalculateProvisoImpl;
import net.sourceforge.czt.zpatt.util.Factory;
import net.sourceforge.czt.zpatt.visitor.*;

/**
 * <p>A CalculateProviso used by the prover.</p>
 *
 * @author Petra Malik
 * @czt.todo Handle bindings!  Probably needs undo.
 */
public class ProverCalculateProviso
  extends CalculateProvisoImpl
  implements ProverProviso
{
  private Status status_ = Status.UNCHECKED;

  public void check(SectionManager manager, String section)
  {
    Factory factory_ = new Factory();
    final Expr expr = getRightExpr();
    if (expr instanceof DecorExpr) {
      final DecorExpr decorExpr = (DecorExpr) expr;
      final Stroke stroke = decorExpr.getStroke();
      if (decorExpr.getExpr() instanceof SchExpr) {
        final CollectStateVariablesVisitor collectVisitor =
          new CollectStateVariablesVisitor();
        final DecorateNamesVisitor visitor =
          new DecorateNamesVisitor(collectVisitor.getVariables(), stroke);
        try {
          SchExpr result =
            (SchExpr) ProverUtils.removeJoker(decorExpr.getExpr());
          List errors =
            TypeCheckUtils.typecheck(result, manager, false, section);
          if (errors == null || errors.isEmpty()) {
            result.getZSchText().getDeclList().accept(collectVisitor);
            result = (SchExpr) result.accept(visitor);
            if (result != null) {
              unify(result, getLeftExpr());
              return;
            }
          }
          else {
          }
          System.err.println("Typeckecking failed:");
          System.err.println(errors);
          status_ = Status.FAIL;
        }
        catch(ProverUtils.UnboundJokerException e) {
          // status is unknown
          final String message =
            "Found unbound joker when checking calculate proviso";
          System.err.println(message + "\nCause by:\n  " + e.getMessage());
        }
        catch(CztException e) {
          final String message =
            "Caught CztException when checking calculate proviso";
          System.err.println(message + "\nCause by:\n  " + e.getMessage());
          // status is unknown
        }
      }
    }
    else if (expr instanceof ApplExpr) {
      ApplExpr applExpr = (ApplExpr) expr;
      Expr left = applExpr.getLeftExpr();
      if (left instanceof RefExpr) {
        RefExpr refExpr = (RefExpr) left;
        RefName refName = refExpr.getRefName();
        if (refName instanceof ZRefName) {
          ZRefName zRefName = (ZRefName) refName;
          if ("binding".equals(zRefName.getWord())) {
            Expr rightExpr = applExpr.getRightExpr();
            if (rightExpr instanceof SchExpr) {
              SchExpr schExpr = (SchExpr) rightExpr;
              SchText schText = schExpr.getSchText();
              if (schText instanceof ZSchText) {
                ZSchText zSchText = (ZSchText) schText;
                ZDeclList zDeclList =
                  zSchText.accept(new GetZDeclList(factory_));
                ZDeclList newZDeclList = factory_.createZDeclList();
                for (Decl decl : zDeclList) {
                  if (decl instanceof VarDecl) {
                    VarDecl varDecl = (VarDecl) decl;
                    for (DeclName declName : varDecl.getDeclName()) {
                      ZDeclName zDeclName =
                        declName.accept(new GetZDeclName());
                      Object[] children = { zDeclName.getWord(),
                                            zDeclName.getStroke(),
                                            null };
                      ZDeclName newZDeclName =
                        factory_.createZDeclName(zDeclName.getWord(),
                                                 zDeclName.getStroke());
                      ZRefName newZRefName =
                        factory_.createZRefName(zDeclName.getWord(),
                                                zDeclName.getStroke(),
                                                zDeclName);
                      RefExpr newRefExpr =
                        factory_.createRefExpr(newZRefName);
                      ConstDecl constDecl =
                        factory_.createConstDecl(newZDeclName,
                                                 newRefExpr);
                      newZDeclList.add(constDecl);
                    }
                  }
                  else {
                    final String message = decl.getClass() +
                      " is not a supported Decl " +
                      " for the calculate proviso";
                    throw new CztException(message);
                  }
                }
                BindExpr bindExpr = factory_.createBindExpr(newZDeclList);
                unify(bindExpr, getLeftExpr());
                return;
              }
              else {
                final String message = schText.getClass() +
                  " is not a supported SchText " +
                  " for the calculate proviso";
                throw new CztException(message);
              }
            }
            else {
              final String message = rightExpr.getClass() +
                " is not supported by the binding function " +
                "of the calculate proviso";
              throw new CztException(message);
            }
          }
          else {
            final String message = zRefName.getWord() +
              " is not supported by the calculate proviso";
            throw new CztException(message);
          }
        }
        else {
          final String message = refName.getClass() +
            " is not a supported RefName " +
            " for the calculate proviso";
          throw new CztException(message);
        }
      }
      else {
        final String message = left.getClass() +
          " not supported as left exprssion" +
          "of ApplExpr by calculate proviso";
        throw new CztException(message);
      }
    }
    else {
      final String message =
        expr.getClass() + " not supported in calculate proviso";
      throw new CztException(message);
    }
    status_ = Status.UNKNOWN;
  }


  private void unify(Term term1, Term term2)
  {
    Set<Binding> bindings = UnificationUtils.unify(term1, term2);
    if (bindings != null) {
      status_ = Status.PASS;
    }
    else {
      status_ = Status.FAIL;
    }
  }

  private void unify2(Term term1, Term term2)
    throws UnificationException
  {
    try {
      Set<Binding> bindings = UnificationUtils.unify2(term1, term2);
      if (bindings != null) {
        status_ = Status.PASS;
      }
      else {
        status_ = Status.FAIL;
      }
    }
    catch(UnificationException e) {
      String message = "ProverCalculateProviso";
      throw new UnificationException(term1, term2, message, e);
    }
  }

  public Status getStatus()
  {
    return status_;
  }

  public static class GetZDeclList
    implements TermVisitor<ZDeclList>,
               HeadDeclListVisitor<ZDeclList>,
               JokerDeclListVisitor<ZDeclList>,
               SchExprVisitor<ZDeclList>,
               ZDeclListVisitor<ZDeclList>,
               ZSchTextVisitor<ZDeclList>
  {
    private Factory factory_;

    public GetZDeclList(Factory factory)
    {
      factory_ = factory;
    }

    public ZDeclList visitTerm(Term term)
    {
      final String message = term.getClass() +
        " is not a supported DeclList " +
        " for the calculate proviso";
      throw new CztException(message);
    }

    public ZDeclList visitHeadDeclList(HeadDeclList headDeclList)
    {
      ZDeclList rest = headDeclList.getJokerDeclList().accept(this);
      if (rest != null) {
        ZDeclList result = factory_.createZDeclList();
        result.addAll(headDeclList.getZDeclList());
        result.addAll(rest);
        return result;
      }
      return null;
    }

    public ZDeclList visitSchExpr(SchExpr schExpr)
    {
      return schExpr.getSchText().accept(this);
    }

    public ZDeclList visitZSchText(ZSchText zSchText)
    {
      return zSchText.getDeclList().accept(this);
    }

    public ZDeclList visitJokerDeclList(JokerDeclList jokerDeclList)
    {
      if (jokerDeclList instanceof ProverJokerDeclList) {
        Joker joker = (Joker) jokerDeclList;
        Term boundTo = joker.boundTo();
        if (boundTo != null) return boundTo.accept(this);
      }
      final String message = jokerDeclList.getClass() +
        " is not a supported JokerDeclList " +
        " for the calculate proviso";
      throw new CztException(message);
    }

    public ZDeclList visitZDeclList(ZDeclList zDeclList)
    {
      return zDeclList;
    }
  }

  public static class GetZDeclName
    implements TermVisitor<ZDeclName>,
               JokerDeclNameVisitor<ZDeclName>,
               ZDeclNameVisitor<ZDeclName>
  {
    public ZDeclName visitTerm(Term term)
    {
      final String message = term.getClass() +
        " is not a supported DeclName " +
        " for the calculate proviso";
      throw new CztException(message);
    }

    public ZDeclName visitJokerDeclName(JokerDeclName jokerDeclName)
    {
      if (jokerDeclName instanceof ProverJokerDeclName) {
        Joker joker = (Joker) jokerDeclName;
        Term boundTo = joker.boundTo();
        if (boundTo != null) return boundTo.accept(this);
      }
      final String message = jokerDeclName.getClass() +
        " is not a supported JokerDeclName " +
        " for the calculate proviso";
      throw new CztException(message);
    }

    public ZDeclName visitZDeclName(ZDeclName zDeclName)
    {
      return zDeclName;
    }
  }

  public static class CollectStateVariablesVisitor
    implements ConstDeclVisitor,
               HeadDeclListVisitor,
               InclDeclVisitor,
               VarDeclVisitor,
               JokerDeclListVisitor,
               ZDeclListVisitor
  {
    private Set<DeclName> variables_ = new HashSet<DeclName>();

    public Set<DeclName> getVariables()
    {
      return variables_;
    }

    public Object visitHeadDeclList(HeadDeclList headDeclList)
    {
      for (Decl decl : headDeclList.getZDeclList()) {
        decl.accept(this);
      }
      headDeclList.getJokerDeclList().accept(this);
      return null;
    }

    public Term visitInclDecl(InclDecl inclDecl)
    {
      String message = "CalculateProviso: Schema not normalised";
      throw new IllegalStateException(message);
    }

    public Object visitVarDecl(VarDecl varDecl)
    {
      for (DeclName declName : varDecl.getDeclName()) {
        variables_.add(declName);
      }
      return null;
    }

    public Object visitConstDecl(ConstDecl constDecl)
    {
      variables_.add(constDecl.getDeclName());
      return null;
    }

    public Object visitJokerDeclList(JokerDeclList jokerDeclList)
    {
      if (jokerDeclList instanceof Joker) {
        Joker joker = (Joker) jokerDeclList;
        Term boundTo = joker.boundTo();
        if (boundTo != null) {
          return boundTo.accept(this);
        }
      }
      throw new CztException("Found unbound Joker");
    }

    public Object visitZDeclList(ZDeclList zDeclList)
    {
      for (Decl decl : zDeclList) {
        decl.accept(this);
      }
      return null;
    }
  }

  public static class DecorateNamesVisitor
    implements InclDeclVisitor<Term>,
               TermVisitor<Term>,
               ZDeclNameVisitor<Term>,
               ZRefNameVisitor<Term>
  {
    private Set<DeclName> declNames_;
    private Factory factory_ = new Factory(new ProverFactory());

    /**
     * The stroke to be added to names.
     */
    private Stroke stroke_;

    public DecorateNamesVisitor(Set<DeclName> declNames, Stroke stroke)
    {
      declNames_ = declNames;
      stroke_ = stroke;
    }

    public Term visitInclDecl(InclDecl inclDecl)
    {
      // TODO: visit children?
      DecorExpr decorExpr =
        factory_.createDecorExpr(inclDecl.getExpr(), stroke_);
      InclDecl result = (InclDecl) inclDecl.create(new Object[] { decorExpr });
      return result;
    }

    public Term visitTerm(Term term)
    {
      if (term instanceof Joker) {
        Joker joker = (Joker) term;
        Term boundTo = joker.boundTo();
        if (boundTo != null) {
          return boundTo.accept(this);
        }
        throw new CztException("Found unbound Joker");
      }
      return (Term) VisitorUtils.visitTerm(this, term, true);
    }

    public Term visitZDeclName(ZDeclName zDeclName)
    {
      Object[] children = zDeclName.getChildren();
      for (int i = 0; i < children.length; i++) {
        if (children[i] instanceof Term) {
          children[i] = ((Term) children[i]).accept(this);
        }
      }
      ZDeclName newName = (ZDeclName) zDeclName.create(children);
      if (declNames_.contains(zDeclName)) {
        newName.getStroke().add(stroke_);
      }
      return newName;
    }

    public Term visitZRefName(ZRefName zRefName)
    {
      Object[] children = zRefName.getChildren();
      for (int i = 0; i < children.length; i++) {
        if (children[i] instanceof Term) {
          children[i] = ((Term) children[i]).accept(this);
        }
      }
      ZRefName newName = (ZRefName) zRefName.create(children);
      if (declNames_.contains(zRefName.getDecl())) {
        newName.getStroke().add(stroke_);
      }
      return newName;
    }
  }
}
