/*
  ZLive - A Z animator -- Part of the CZT Project.
  Copyright 2004 Mark Utting

  This program is free software; you can redistribute it and/or
  modify it under the terms of the GNU General Public License
  as published by the Free Software Foundation; either version 2
  of the License, or (at your option) any later version.

  This program is distributed in the hope that it will be useful,
  but WITHOUT ANY WARRANTY; without even the implied warranty of
  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  GNU General Public License for more details.

  You should have received a copy of the GNU General Public License
  along with this program; if not, write to the Free Software
  Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
*/
package net.sourceforge.czt.animation.eval;

import java.util.*;
import java.util.logging.Logger;
import net.sourceforge.czt.base.ast.*;
import net.sourceforge.czt.base.visitor.*;
import net.sourceforge.czt.z.ast.*;
import net.sourceforge.czt.z.visitor.*;
import net.sourceforge.czt.z.util.ZString;

import net.sourceforge.czt.animation.eval.*;
import net.sourceforge.czt.animation.eval.flatpred.*;

/** Flattens a Pred/Expr term into a list of FlatPred objects.
 */
public class Flatten
    implements
      TermVisitor,
      AndPredVisitor,
      OrPredVisitor,
      ImpliesPredVisitor,
      IffPredVisitor,
      NegPredVisitor,
      MemPredVisitor,
      FalsePredVisitor,
      TruePredVisitor,
      ExistsPredVisitor,
      ForallPredVisitor,

      NameVisitor,
      NumExprVisitor,
      ApplExprVisitor,
      RefExprVisitor
{
  private List flat_;

  private static long newNameNum = 0;

  // TODO: allow this to be customised.
  private ZFactory factory_ = new net.sourceforge.czt.z.impl.ZFactoryImpl();
  private static final List empty = new ArrayList();

  protected RefName createNewName()
  {
    return factory_.createRefName("tmp"+(newNameNum++), empty, null);
  }

  public Flatten()
  {
    VisitorUtils.checkVisitorRules(this);
  }

  /** Flattens the toFlatten AST into a list of FlatPred predicates. */
  public void flatten(Term toFlatten, List destination)
  {
    flat_ = destination;
    toFlatten.accept(this);
  }

  /** We throw an error if we reach a kind of term that we do not handle. */
  public Object visitTerm(Term term) {
    throw new RuntimeException("cannot flatten " + term);
  }

  // TODO: implement these, or unfold them into something simpler.
  public Object visitAndPred(AndPred p) { return p; }
  public Object visitOrPred(OrPred p) { return p; }
  public Object visitImpliesPred(ImpliesPred p) { return p; }
  public Object visitIffPred(IffPred p) { return p; }
  public Object visitNegPred(NegPred p) { return p; }
  public Object visitMemPred(MemPred p) { return p; }
  public Object visitFalsePred(FalsePred p) { return p; }
  public Object visitTruePred(TruePred p) { return p; }
  public Object visitExistsPred(ExistsPred p) { return p; }
  public Object visitForallPred(ForallPred p) { return p; }

  /** Name objects are returned unchanged. */
  public Object visitName(Name e)
  { return e; }

  /** RefExpr objects are returned unchanged. */
  public Object visitRefExpr(RefExpr e)
  { return e; }

  /** NumExpr objects are returned unchanged. */
  public Object visitNumExpr(NumExpr e)
  {     
    RefName result = createNewName();
    flat_.add(new FlatConst(result,e));
    return result;
  }

  /** Each ApplExpr is flattened into a different kind of FlatPred.
   */
  public Object visitApplExpr(ApplExpr e) {
    Expr func = (Expr) e.getLeftExpr();
    Expr args = (Expr) e.getRightExpr();
    List argList = null;
    RefName result = createNewName();

    if (args instanceof TupleExpr)
      argList = ((TupleExpr) args).getExpr();

    if (func instanceof RefExpr
        && ((RefExpr) func).getRefName().getStroke().size() == 0) {
      String funcname = ((RefExpr) func).getRefName().getWord();
      if (funcname.equals(ZString.ARG_TOK + ZString.PLUS + ZString.ARG_TOK))
        flat_.add(new FlatPlus(
            (RefName)((Expr)argList.get(0)).accept(this),
            (RefName)((Expr)argList.get(1)).accept(this), 
            result));
      else if (funcname.equals(ZString.NEG + ZString.ARG_TOK))
        flat_.add(new FlatNegate(
            (RefName)((Expr)argList.get(0)).accept(this),
            result));
      // else if (...)   TODO: add more cases...
      else {
        throw new RuntimeException("ApplExpr not fully implemented");
        // TODO: flat_.add(new FlatAppl(func, args, result));
      }
    }
    return result;
  }

/*
  public Object visitPowerExpr(PowerExpr e) { return e; }
  public Object visitSetExpr(SetExpr e) { return e; }

  public Object visitProdExpr(ProdExpr e) { return e; }
  public Object visitTupleExpr(TupleExpr e) { return e; }
*/

/*
  public Object visitFreetype(Freetype zedObject) { return zedObject; }
  public Object visitNameNamePair(NameNamePair zedObject) {return zedObject; }
  public Object visitLetExpr(LetExpr zedObject) {return zedObject; }
  public Object visitSignature(Signature zedObject) {return zedObject; }
  public Object visitConstDecl(ConstDecl zedObject) {return zedObject; }
  public Object visitProdType(ProdType zedObject) {return zedObject; }
  public Object visitDecl(Decl zedObject) {return zedObject; }
  public Object visitImpliesExpr(ImpliesExpr zedObject) {return zedObject; }
  public Object visitMuExpr(MuExpr zedObject) {return zedObject; }
  public Object visitSchExpr2(SchExpr2 zedObject) {return zedObject; }
  public Object visitExistsExpr(ExistsExpr zedObject) {return zedObject; }
  public Object visitExists1Expr(Exists1Expr zedObject) {return zedObject; }
  public Object visitForallExpr(ForallExpr zedObject) {return zedObject; }
  public Object visitVarDecl(VarDecl zedObject) {return zedObject; }
  public Object visitCompExpr(CompExpr zedObject) {return zedObject; }
  public Object visitBindExpr(BindExpr zedObject) {return zedObject; }
  public Object visitCondExpr(CondExpr zedObject) {return zedObject; }
  public Object visitNameExprPair(NameExprPair zedObject) {return zedObject; }
  public Object visitTupleSelExpr(TupleSelExpr zedObject) {return zedObject; }
  public Object visitLambdaExpr(LambdaExpr zedObject) {return zedObject; }
  public Object visitIffExpr(IffExpr zedObject) {return zedObject; }
  public Object visitQntExpr(QntExpr zedObject) {return zedObject; }
  public Object visitNameTypePair(NameTypePair zedObject) {return zedObject; }
  public Object visitSchText(SchText zedObject) {return zedObject; }
  public Object visitQnt1Expr(Qnt1Expr zedObject) {return zedObject; }
  public Object visitOperand(Operand zedObject) {return zedObject; }
  public Object visitProjExpr(ProjExpr zedObject) {return zedObject; }
  public Object visitBranch(Branch zedObject) {return zedObject; }
  public Object visitGenType(GenType zedObject) {return zedObject; }
  public Object visitPreExpr(PreExpr zedObject) {return zedObject; }
  public Object visitExprPred(ExprPred zedObject) {return zedObject; }
  public Object visitGivenType(GivenType zedObject) {return zedObject; }
  public Object visitInclDecl(InclDecl zedObject) {return zedObject; }
  public Object visitPred(Pred zedObject) {return zedObject; }
  public Object visitSchemaType(SchemaType zedObject) {return zedObject; }
  public Object visitBindSelExpr(BindSelExpr zedObject) {return zedObject; }
  public Object visitDeclName(DeclName zedObject) {return zedObject; }
  public Object visitOrExpr(OrExpr zedObject) {return zedObject; }
  public Object visitSpec(Spec zedObject) {return zedObject; }
  public Object visitHideExpr(HideExpr zedObject) {return zedObject; }
  public Object visitPowerType(PowerType zedObject) {return zedObject; }
  public Object visitAndExpr(AndExpr zedObject) {return zedObject; }
  public Object visitRenameExpr(RenameExpr zedObject) {return zedObject; }
  public Object visitThetaExpr(ThetaExpr zedObject) {return zedObject; }
  public Object visitSetExpr(SetExpr zedObject) {return zedObject; }
  public Object visitSetCompExpr(SetCompExpr zedObject) {return zedObject; }
  public Object visitPipeExpr(PipeExpr zedObject) {return zedObject; }
  public Object visitNegExpr(NegExpr zedObject) {return zedObject; }
  public Object visitDecorExpr(DecorExpr zedObject) {return zedObject; }
  public Object visitExists1Pred(Exists1Pred zedObject) {return zedObject; }
  public Object visitSchExpr(SchExpr zedObject) {return zedObject; }
*/
}

