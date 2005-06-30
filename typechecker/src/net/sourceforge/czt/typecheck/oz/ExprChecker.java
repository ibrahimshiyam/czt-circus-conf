/*
  Copyright (C) 2004, 2005 Tim Miller
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
package net.sourceforge.czt.typecheck.oz;

import java.util.List;

import static net.sourceforge.czt.typecheck.oz.util.GlobalDefs.*;

import net.sourceforge.czt.base.ast.*;
import net.sourceforge.czt.base.visitor.*;
import net.sourceforge.czt.z.ast.*;
import net.sourceforge.czt.z.visitor.*;
import net.sourceforge.czt.oz.ast.*;
import net.sourceforge.czt.oz.visitor.*;
import net.sourceforge.czt.typecheck.z.util.*;
import net.sourceforge.czt.typecheck.z.impl.*;
import net.sourceforge.czt.typecheck.oz.impl.*;
import net.sourceforge.czt.typecheck.z.*;

/**
 * An <code>ExprChecker</code> instance visits the Exprs instances in
 * an AST, checks them for type consistencies, adding an ErrorAnn
 * if there are inconsistencies.
 *
 * Each visit method to Expr objects return the type (Type2) of the
 * expression.
 */
public class ExprChecker
  extends Checker
  implements
    ClassUnionExprVisitor,
    PolyExprVisitor,
    ContainmentExprVisitor,
    PredExprVisitor,
    BindSelExprVisitor,
    RenameExprVisitor
{
  //a Z expr checker
  protected net.sourceforge.czt.typecheck.z.ExprChecker zExprChecker_;

  public ExprChecker(TypeChecker typeChecker)
  {
    super(typeChecker);
    zExprChecker_ =
      new net.sourceforge.czt.typecheck.z.ExprChecker(typeChecker);
  }

  public Object visitTerm(Term term)
  {
    return term.accept(zExprChecker_);
  }

  public Object visitClassUnionExpr(ClassUnionExpr classUnionExpr)
  {
    Type2 type = factory().createUnknownType();

    Expr lExpr = (Expr) classUnionExpr.getLeftExpr();
    Expr rExpr = (Expr) classUnionExpr.getRightExpr();
    Type2 lType = (Type2) lExpr.accept(this);
    Type2 rType = (Type2) rExpr.accept(this);

    PowerType vlPowerType = factory().createPowerType();
    PowerType vrPowerType = factory().createPowerType();

    UResult lUnified = strongUnify(vlPowerType, lType);
    UResult rUnified = strongUnify(vrPowerType, rType);
    //if the left expr is not a class description, raise an error
    if (!instanceOf(vlPowerType.getType(), ClassRefType.class) &&
        !instanceOf(vlPowerType.getType(), ClassUnionType.class) &&
        !instanceOf(vlPowerType.getType(), VariableType.class)) {
      Object [] params = {classUnionExpr, lType};
      error(classUnionExpr, ErrorMessage.NON_CLASS_IN_CLASSUNIONEXPR, params);
    }

    //if the right expr is not a class description, raise an error
    if (!instanceOf(vrPowerType.getType(), ClassRefType.class) &&
        !instanceOf(vrPowerType.getType(), ClassUnionType.class) &&
        !instanceOf(vrPowerType.getType(), UnknownType.class) &&
        !instanceOf(vrPowerType.getType(), VariableType.class)) {
      Object [] params = {classUnionExpr, rType};
      error(classUnionExpr, ErrorMessage.NON_CLASS_IN_CLASSUNIONEXPR, params);
    }

    //if we have class types, intersect the features of the two classes
    if (vlPowerType.getType() instanceof ClassType &&
        vrPowerType.getType() instanceof ClassType) {
      ClassType lClassType = (ClassType) vlPowerType.getType();
      ClassType rClassType = (ClassType) vrPowerType.getType();
      ClassSig lcSig = lClassType.getClassSig();
      ClassSig rcSig = rClassType.getClassSig();

      ClassSig cSig = factory().createVariableClassSig();
      //if both signatures are complete
      if (!instanceOf(lcSig, VariableClassSig.class) &&
          !instanceOf(rcSig, VariableClassSig.class)) {
        Type2 unioned = unionClasses(classUnionExpr, lClassType, rClassType);
        type = factory().createPowerType(unioned);
      }
    }

    //add the type annotation
    addTypeAnn(classUnionExpr, type);

    return type;
  }

  public Object visitPolyExpr(PolyExpr polyExpr)
  {
    Type2 type = factory().createUnknownType();

    Expr expr = polyExpr.getExpr();
    Type2 exprType = (Type2) expr.accept(exprChecker());

    //if the left expr is not a class description, raise an error
    PowerType vPowerType = factory().createPowerType();
    UResult unified = strongUnify(vPowerType, exprType);

    //if the expr is not a class type, raise an error
    if (!instanceOf(vPowerType.getType(), ClassRefType.class) &&
        !instanceOf(vPowerType.getType(), VariableType.class)) {
      Object [] params = {polyExpr, exprType};
      error(polyExpr, ErrorMessage.NON_REF_IN_POLYEXPR, params);
    }
    else if (vPowerType.getType() instanceof ClassRefType) {
      ClassRefType classRefType = (ClassRefType) vPowerType.getType();
      ClassSig cSig = classRefType.getClassSig();
      if (!instanceOf(cSig, VariableClassSig.class)) {
        ClassRef cRef = classRefType.getThisClass();
        List<ClassRef> subClasses = list(cRef);

        //find any subclasses
        List<NameSectTypeTriple> triples = sectTypeEnv().getNameSectTypeTriple();
        for (NameSectTypeTriple triple : triples) {
          Type2 nextType = unwrapType(triple.getType());
          if (isPowerClassRefType(nextType)) {
            ClassRefType subClass = (ClassRefType) powerType(nextType).getType();
            if (contains(subClass.getSuperClass(), cRef)) {
              //the subclasses must have the same number of parameters as
              //the "top-level" class
              final int superSize = cRef.getType2().size();
              final int subSize = subClass.getThisClass().getType2().size();
              if (superSize != subSize) {
                Object [] params = {cRef.getRefName(), superSize,
                                    subClass.getThisClass().getRefName(),
                                    subSize};
                error(polyExpr,
                      ErrorMessage.PARAMETER_MISMATCH_IN_POLYEXPR, params);
              }

              //all visible features must also be visible in the subclass
              ClassSig subCSig = subClass.getClassSig();
              List<NameTypePair> superAttrs = cSig.getAttribute();
              List<NameTypePair> subAttrs = subCSig.getAttribute();
              checkVisibility(classRefType, subClass, superAttrs,
                              subAttrs, polyExpr);

              List<NameTypePair> superState = cSig.getState().getNameTypePair();
              List<NameTypePair> subState = subCSig.getState().getNameTypePair();
              checkVisibility(classRefType, subClass, superState,
                              subState, polyExpr);

              List<NameSignaturePair> superOps = cSig.getOperation();
              List<NameSignaturePair> subOps = subCSig.getOperation();
              checkOpVisibility(classRefType, subClass, superOps,
                                subOps, polyExpr);

              ClassRef subCRef = factory().createClassRef();
              subCRef.setRefName(subClass.getThisClass().getRefName());
              subCRef.getType2().addAll(cRef.getType2());
              subCRef.getNameNamePair().addAll(cRef.getNameNamePair());
              if (!contains(subClasses, subCRef)) {
                subClasses.add(subCRef);
              }
            }
          }
        }
        ClassSig polySig =
          factory().createClassSig(subClasses, cSig.getState(),
                                   cSig.getAttribute(),
                                   cSig.getOperation());
        ClassPolyType polyClass =
          factory().createClassPolyType(polySig, classRefType.getThisClass());
        type = factory().createPowerType(polyClass);
      }
    }

    //add the type annotation
    addTypeAnn(polyExpr, type);
    return type;
  }

  public Object visitContainmentExpr(ContainmentExpr containmentExpr)
  {
    Type2 type = factory().createUnknownType();

    Expr expr = containmentExpr.getExpr();
    Type2 exprType = (Type2) expr.accept(exprChecker());

    //if the left expr is not a class description, raise an error
    PowerType vPowerType = factory().createPowerType();
    UResult unified = strongUnify(vPowerType, exprType);

    //if the expr is not a class type, raise an error
    if (!instanceOf(vPowerType.getType(), ClassRefType.class) &&
        !instanceOf(vPowerType.getType(), VariableType.class)) {
      Object [] params = {containmentExpr, exprType};
      error(containmentExpr, ErrorMessage.NON_REF_IN_CONTAINMENTEXPR, params);
    }
    else if (vPowerType.getType() instanceof ClassRefType) {
      type = exprType;
    }

    //add the type annotation
    addTypeAnn(containmentExpr, type);
    return type;
  }

  public Object visitPredExpr(PredExpr predExpr)
  {
    Type2 type = factory().createUnknownType();

    //visit the predicate
    Pred pred = predExpr.getPred();
    UResult solved = (UResult) pred.accept(predChecker());

    if (solved == SUCC) {
      //create a boolean type (a power type containing an empty schema type)
      type = factory().createBoolType();
    }

    //add the type annotation
    addTypeAnn(predExpr, type);

    return type;
  }

  public Object visitBindSelExpr(BindSelExpr bindSelExpr)
  {
    Type type = factory().createUnknownType();

    //get the type of the expression
    Expr expr = bindSelExpr.getExpr();
    Type2 exprType = (Type2) expr.accept(exprChecker());
    exprType = resolveClassType(exprType);

    if (!instanceOf(exprType, VariableType.class)) {
      if (exprType instanceof SchemaType) {
        type = (Type2) zExprChecker_.visitBindSelExpr(bindSelExpr);
      }
      else if (exprType instanceof ClassType) {
        ClassType classType = (ClassType) exprType;
        ClassSig classSig = classType.getClassSig();
        RefName selectName = bindSelExpr.getName();
        if (!instanceOf(classSig, VariableClassSig.class)) {
          //try to find the name in the state signature
          Signature signature = classSig.getState();
          NameTypePair pair = findNameTypePair(selectName, signature);

          //if it is not found, try the attributes
          if (pair == null) {
            List<NameTypePair> pairs = classSig.getAttribute();
            pair = findNameTypePair(selectName, pairs);
          }

          //if it is not in the state or attributes, raise an error
          if (pair == null) {
            Object [] params = {bindSelExpr};
            error(selectName, ErrorMessage.NON_EXISTENT_SELECTION, params);
          }
          //otherwise, the type is the type of the selection
          else {
            type = pair.getType();
          }

          //if the feature exists, but it is not visible, raise an error
          if (pair != null && !isVisible(selectName, exprType)) {
            Object [] params = {selectName, bindSelExpr};
            error(bindSelExpr, ErrorMessage.NON_VISIBLE_NAME_IN_SELEXPR, params);
          }
        }
      }
      else {
        Object [] params = {bindSelExpr, exprType};
        error(bindSelExpr, ErrorMessage.NON_BINDING_IN_BINDSELEXPR, params);
      }
    }

    //try to resolve this type if it is unknown
    if (type instanceof Type2) {
      type = resolveUnknownType((Type2) type);
    }
    else if (type instanceof GenericType) {
      GenericType gType = (GenericType) type;
      List<Type2> instantiations = list();
      ParameterAnn pAnn =
        (ParameterAnn) bindSelExpr.getAnn(ParameterAnn.class);

      unificationEnv().enterScope();

      //add new vtypes for the (missing) parameters
      List<DeclName> declNames = gType.getName();
      for (DeclName declName : declNames) {
        //add a variable type corresponding to this name
        VariableType vType = factory().createVariableType();
        unificationEnv().addGenName(declName, vType);
        instantiations.add(vType);
      }

      //instantiate the type
      type = (GenericType) instantiate(gType);

      if (pAnn != null) {
        removeAnn(bindSelExpr, pAnn);
      }
      pAnn = new ParameterAnn(instantiations);
      addAnn(bindSelExpr, pAnn);
      unificationEnv().exitScope();

      //add this for post-checking
      if (!containsObject(paraErrors(), bindSelExpr)) {
        paraErrors().add(bindSelExpr);
      }
    }

    //add the type annotation
    addTypeAnn(bindSelExpr, type);
    Type2 result = unwrapType(type);
    return result;
  }

  public Object visitRenameExpr(RenameExpr renameExpr)
  {
    Type2 type = factory().createUnknownType();

    //get the type of the expression
    Expr expr = renameExpr.getExpr();
    Type2 exprType = (Type2) expr.accept(exprChecker());

    PowerType vPowerType = factory().createPowerType();
    UResult unified = strongUnify(vPowerType, exprType);

    if (unified == FAIL) {
      Object [] params = {renameExpr, exprType};
      error(renameExpr, ErrorMessage.NON_SCHEXPR_IN_RENAMEEXPR, params);
    }
    else if (!instanceOf(vPowerType.getType(), VariableType.class)) {
      if (vPowerType.getType() instanceof ClassRefType) {
        ClassRefType classRefType = (ClassRefType) vPowerType.getType();
        ClassSig classSig = classRefType.getClassSig();
        if (!instanceOf(classSig, VariableClassSig.class)) {
          String errorMessage =
            ErrorMessage.DUPLICATE_NAME_IN_RENAMEEXPR.toString();
          ClassSig renameClassSig =
            createRenameClassSig(classSig, renameExpr, errorMessage);
          ClassRef renameThisClass =
            rename(classRefType.getThisClass(), renameExpr);
          ClassRefType newRefType =
            factory().createClassRefType(renameClassSig,
                                         renameThisClass,
                                         classRefType.getSuperClass(),
                                         classRefType.getVisibilityList(),
                                         classRefType.getPrimary());
          type = factory().createPowerType(newRefType);
        }
      }
      else if (vPowerType.getType() instanceof SchemaType) {
        type = (Type2) zExprChecker_.visitRenameExpr(renameExpr);
      }
      else {
        Object [] params = {renameExpr, exprType};
        error(renameExpr, ErrorMessage.NON_SCHEXPR_IN_RENAMEEXPR, params);
      }
    }

    //add the type annotation
    addTypeAnn(renameExpr, type);
    return type;
  }
}
