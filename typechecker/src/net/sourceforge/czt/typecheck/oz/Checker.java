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

import java.io.Writer;
import java.util.List;

import static net.sourceforge.czt.typecheck.oz.util.GlobalDefs.*;

import net.sourceforge.czt.base.ast.*;
import net.sourceforge.czt.z.ast.*;
import net.sourceforge.czt.oz.ast.*;
import net.sourceforge.czt.session.*;
import net.sourceforge.czt.oz.util.OzString;
import net.sourceforge.czt.print.oz.PrintUtils;
import net.sourceforge.czt.typecheck.z.util.UResult;
import net.sourceforge.czt.typecheck.z.util.TypeEnv;
import net.sourceforge.czt.typecheck.z.util.UndeclaredAnn;
import net.sourceforge.czt.typecheck.z.impl.UnknownType;
import net.sourceforge.czt.typecheck.oz.util.*;
import net.sourceforge.czt.typecheck.oz.impl.*;

/**
 * A super class for the *Checker classes in the typechecker.
 */
abstract public class Checker<R>
  extends net.sourceforge.czt.typecheck.z.Checker<R>
{
  //the information required for the typechecker classes.
  protected TypeChecker typeChecker_;

  public Checker(TypeChecker typeChecker)
  {
    super(typeChecker);
    typeChecker_ = typeChecker;
  }

  //a Factory for creating Object-Z terms
  protected Factory factory()
  {
    return typeChecker_.ozFactory_;
  }

  //the operation expr checker
  protected Checker<Signature> opExprChecker()
  {
    return typeChecker_.opExprChecker_;
  }

  //typing environment used in downcasting
  protected TypeEnv downcastEnv()
  {
    return typeChecker_.downcastEnv_;
  }

  //the current class name
  protected ZDeclName className()
  {
    return typeChecker_.classPara_.getClassName();
  }

  //the current class para
  protected ClassPara classPara()
  {
    return typeChecker_.classPara_;
  }

  //set the current class paragraph
  protected void setClassPara(ClassPara classPara)
  {
    typeChecker_.classPara_ = classPara;
  }

  //the lst of primary state variables in the current class
  protected List<ZDeclName> primary()
  {
    return typeChecker_.primary_;
  }

  //reset the list of primary variables in the current class to empty
  protected void resetPrimary()
  {
    typeChecker_.primary_.clear();
  }

  //typecheck a file using an instance of this typechecker
  protected List<net.sourceforge.czt.typecheck.z.ErrorAnn>
    typecheck(TermA termA, SectionInfo sectInfo)
  {
    return TypeCheckUtils.typecheck(termA, sectInfo, markup());
  }

  protected void error(TermA termA, ErrorMessage error, Object [] params)
  {
    ErrorAnn errorAnn = this.errorAnn(termA, error, params);
    error(termA, errorAnn);
  }

  protected void error(TermA termA,
                       net.sourceforge.czt.typecheck.z.ErrorMessage error,
                       Object [] params)
  {
    ErrorAnn errorAnn = this.errorAnn(termA, error.toString(), params);
    error(termA, errorAnn);
  }

  protected ErrorAnn errorAnn(TermA termA, ErrorMessage error, Object [] params)
  {
    ErrorAnn errorAnn = new ErrorAnn(error.toString(), params, sectInfo(),
                                     sectName(), nearestLocAnn(termA),
                                     markup());
    return errorAnn;
  }

  protected ErrorAnn errorAnn(TermA termA, String error, Object [] params)
  {
    ErrorAnn errorAnn = new ErrorAnn(error, params, sectInfo(),
                                     sectName(), nearestLocAnn(termA),
                                     markup());
    return errorAnn;
  }

  protected UResult strongUnify(Type2 typeA, Type2 typeB)
  {
    UnificationEnv unificationEnv = (UnificationEnv) unificationEnv();
    return unificationEnv.strongUnify(typeA, typeB);
  }

  protected UResult weakUnify(Type2 typeA, Type2 typeB)
  {
    UnificationEnv unificationEnv = (UnificationEnv) unificationEnv();
    return unificationEnv.weakUnify(typeA, typeB);
  }

  protected Type getType(ZRefName zRefName)
  {
    //first look up the name in the downcast environment
    Type type = downcastEnv().getType(zRefName);
    if (type instanceof UnknownType) {
      type = super.getType(zRefName);
    }
    else {
      //if this is ok, remove the undeclared annotation
      removeAnn(zRefName, UndeclaredAnn.class);
    }
    return type;
  }

  //go through a series of conjunctions to see if there is a downcast
  //so that downcasts can be performed either before or after the
  //predicate in which they are used.
  protected void traverseForDowncasts(Pred pred)
  {
    if (pred instanceof AndPred) {
      Pred2 pred2 = (Pred2) pred;
      Pred leftPred = pred2.getLeftPred();
      Pred rightPred = pred2.getRightPred();
      traverseForDowncasts(leftPred);
      traverseForDowncasts(rightPred);
    }
    else if  (pred instanceof MemPred) {
      MemPred memPred = (MemPred) pred;
      boolean mixfix = memPred.getMixfix().booleanValue();
      if (!mixfix) {
        memPred.accept(predChecker());
      }
    }
  }

  //go through a series of conj op exprs to see if there is a downcast
  //so that downcasts can be performed either before or after the
  //predicate in which they are used.
  protected void traverseForDowncasts(OpExpr opExpr)
  {
    if (opExpr instanceof ConjOpExpr) {
      ConjOpExpr conjOpExpr = (ConjOpExpr) opExpr;
      OpExpr leftOpExpr = conjOpExpr.getLeftOpExpr();
      OpExpr rightOpExpr = conjOpExpr.getRightOpExpr();
      traverseForDowncasts(leftOpExpr);
      traverseForDowncasts(rightOpExpr);
    }
    else if (opExpr instanceof ScopeEnrichOpExpr) {
      ScopeEnrichOpExpr scopeEnrichOpExpr = (ScopeEnrichOpExpr) opExpr;
      OpExpr leftOpExpr = scopeEnrichOpExpr.getLeftOpExpr();
      traverseForDowncasts(leftOpExpr);
    }
    else if (opExpr instanceof AnonOpExpr) {
      AnonOpExpr anonOpExpr = (AnonOpExpr) opExpr;
      OpText opText = anonOpExpr.getOpText();
      ZSchText zSchText = opText.getZSchText();

      //the list of Names declared in this schema text
      List<NameTypePair> pairs = list();

      //get and visit the list of declarations
      DeclList declList = zSchText.getDeclList();
      pairs.addAll(declList.accept(declChecker()));

      //we use a different downcasting environment because we do not
      //want to add the declarations into the typing environment, but
      //we need to downcasts in the environment
      downcastEnv().enterScope();
      for (NameTypePair pair : pairs) {
        downcastEnv().add(pair.getZDeclName(), pair.getType());
      }
      if (zSchText.getPred() != null) {
	traverseForDowncasts(zSchText.getPred());
      }
      downcastEnv().exitScope();
    }
  }

  protected ZDeclName getZDeclName(Expr expr)
  {
    ZDeclName result = null;
    if (expr instanceof RenameExpr) {      
      RenameExpr renameExpr = (RenameExpr) expr;
      result = getZDeclName(renameExpr.getExpr());
    }
    else if (expr instanceof RefExpr) {
      RefExpr refExpr = (RefExpr) expr;
      ZRefName zRefName = refExpr.getZRefName();
      result = factory().createZDeclName(zRefName);
    }
    else {
      assert false;
    }
    return result;
  }

  protected List<ClassRef> getSuperClasses(ClassRefType classRefType)
  {
    List<ClassRef> visited = list(classRefType.getThisClass());
    return getSuperClasses(classRefType, visited);
  }

  protected List<ClassRef> getSuperClasses(ClassRefType classRefType,
					   List<ClassRef> visited)
  {
    List<ClassRef> superClasses = list(classRefType.getSuperClass());
    List<ClassRef> superSuperClasses = list();
    for (ClassRef superClass : superClasses) {
      Type2 type = unwrapType(getType(superClass.getZRefName()));
      if (type instanceof PowerType &&
	  powerType(type).getType() instanceof ClassRefType) {
	ClassRefType superClassType =
	  (ClassRefType) powerType(type).getType();
	
	//add the super class itself
	if (!contains(superSuperClasses, superClassType.getThisClass())) {
	  superSuperClasses.add(superClassType.getThisClass());
	}
	
	//for each superclass, get its superclasses, and add
	List<ClassRef> superClassRefs = superClassType.getSuperClass();
	for (ClassRef next : superClassRefs) {
	  //do not search if this has already been looked up
	  if (!contains(visited, next)) {
	    visited.add(next);
	    List<ClassRef> nextSuperClasses = 
	      getSuperClasses(superClassType, visited);
	    //add all transitive superclass if not already present
	    for (ClassRef nextSuperClass : nextSuperClasses) {
	      if (!contains(superSuperClasses, nextSuperClass)) {
		superSuperClasses.add(nextSuperClass);
	      }
	    }
	  }
	}
      }
      else {
	assert false : "Type of " + superClass.getRefName() + " : " + type;
      }
    }

    //add the transitive superclasses to the superclass list
    for (ClassRef superSuperClass : superSuperClasses) {
      if (!contains(superClasses, superSuperClass)) {
	superClasses.add(superSuperClass);
      }
    }    
    return superClasses;
  }

  protected void inheritFeature(List<NameTypePair> source,
                                List<NameTypePair> target,
                                Expr expr)
  {
    for (NameTypePair pair : source) {
      ZDeclName sourceName = pair.getZDeclName();
      if (!isSelfName(sourceName)) {
        NameTypePair existing = findNameTypePair(sourceName, target);
        if (existing != null) {
          Type2 sourceType = unwrapType(pair.getType());
          Type2 existingType = unwrapType(existing.getType());
          UResult unified = unify(sourceType, existingType);
          if (unified == FAIL) {
            Object [] params = {sourceName, expr, sourceType, existingType};
            error(expr, ErrorMessage.INCOMPATIBLE_INHERIT, params);
          }
        }
        else {
          typeEnv().add(pair);
          target.add(pair);
        }
      }
    }
  }

  protected void inheritOps(List<NameSignaturePair> source,
                            List<NameSignaturePair> target,
                            Expr expr)
  {
    for (NameSignaturePair pair : source) {
      ZDeclName sourceName = pair.getZDeclName();
      NameSignaturePair existing = findNameSigPair(sourceName, target);
      if (existing != null) {
        Signature sourceSignature = pair.getSignature();
        Signature existingSignature = existing.getSignature();
        List<NameTypePair> conjoinedPairs =
	  list(sourceSignature.getNameTypePair());
        conjoinedPairs.addAll(existingSignature.getNameTypePair());
	List<TermA> params = list();
	params.add(expr);
	params.add(sourceName);
        checkForDuplicates(conjoinedPairs, params,
			   ErrorMessage.INCOMPATIBLE_OP_INHERIT.toString());
      }
      else {
        target.add(pair);
      }
    }
  }

  //get the type of "self"
  protected ClassRefType getSelfType()
  {
    ZRefName zRefName = factory().createZRefName(OzString.SELF);
    RefExpr refExpr = factory().createRefExpr(zRefName);
    Type2 selfType = (Type2) refExpr.accept(exprChecker());
    assert selfType instanceof ClassRefType;
    ClassRefType result = (ClassRefType) selfType;
    return result;
  }

  //get the class signature of "self"
  protected ClassSig getSelfSig()
  {
    ClassType classType = getSelfType();
    ClassSig result = classType.getClassSig();
    return result;
  }

  //returns true if and only if the expressions is a reference to the
  //variable "self"
  protected boolean isSelfExpr(Expr expr)
  {
    boolean result = false;
    if (expr instanceof RefExpr) {
      RefExpr refExpr = (RefExpr) expr;
      ZRefName zRefName = refExpr.getZRefName();
      result = zRefName.getWord().equals(OzString.SELF) &&
        zRefName.getStroke().size() == 0;
    }
    return result;
  }

  //take the intersection of 2 signatures
  protected Signature intersect(Signature sigA, Signature sigB)
  {
    Signature signature = factory().createSignature();
    List<NameTypePair> pairsA = sigA.getNameTypePair();
    List<NameTypePair> pairsB = sigB.getNameTypePair();
    for (NameTypePair pairA : pairsA) {
      NameTypePair pairB = findNameTypePair(pairA.getZDeclName(), sigB);
      if (pairB != null) {
        signature.getNameTypePair().add(pairA);
        signature.getNameTypePair().add(pairB);
      }
    }
    return signature;
  }

  //merge two class signatures and place result in newSig
  protected void merge(ClassSig newSig, ClassSig oldSig, TermA termA)
  {
    //merge the attributes
    List<NameTypePair> attrDecls = newSig.getAttribute();
    attrDecls.addAll(oldSig.getAttribute());
    checkForDuplicates(attrDecls, termA, ErrorMessage.INCOMPATIBLE_OVERRIDING);

    //merge the state signature
    List<NameTypePair> stateDecls = newSig.getState().getNameTypePair();
    stateDecls.addAll(oldSig.getState().getNameTypePair());
    checkForDuplicates(stateDecls, termA, ErrorMessage.INCOMPATIBLE_OVERRIDING);

    //merge the operations
    List<NameSignaturePair> newPairs = newSig.getOperation();
    for (NameSignaturePair newPair : newPairs) {
      ZDeclName zDeclName = newPair.getZDeclName();
      NameSignaturePair oldPair = findNameSigPair(zDeclName, oldSig.getOperation());
      if (oldPair == null) {
        newSig.getOperation().add(newPair);
      }
      else {
        UResult unified = unify(oldPair.getSignature(), newPair.getSignature());
        if (unified == FAIL) {
          Object [] params = {zDeclName, termA};
          error(zDeclName, ErrorMessage.INCOMPATIBLE_OVERRIDING, params);
        }
      }
    }
  }

  public void addImplicitOps()
  {
    //do nothing for Object-Z
  }

  protected void addOperation(ZDeclName opName, Signature signature, ClassSig cSig)
  {
    List<NameSignaturePair> ops = cSig.getOperation();
    NameSignaturePair existing = findOperation(opName, cSig);

    //if there is already a pair, check it is compatible with the new definition
    if (existing != null) {
      List<NameTypePair> pairs = list(signature.getNameTypePair());
      pairs.addAll(existing.getSignature().getNameTypePair());
      checkForDuplicates(pairs, opName, ErrorMessage.INCOMPATIBLE_OP_OVERRIDING);
      Signature newSig = factory().createSignature(pairs);
      NameSignaturePair newPair = factory().createNameSignaturePair(opName, newSig);
      cSig.getOperation().remove(existing);
      cSig.getOperation().add(newPair);
    }
    else {
      NameSignaturePair op = factory().createNameSignaturePair(opName, signature);
      cSig.getOperation().add(op);
    }
  }

  protected void checkForDuplicates(List<NameTypePair> pairs,
                                    TermA termA,
                                    ErrorMessage error)
  {
    checkForDuplicates(pairs, termA, error.toString());
  }

  //check for duplicate names a class paragraph
  protected void checkForDuplicates(List<ZDeclName> zDeclNames)
  {
    for (int i = 0; i < zDeclNames.size(); i++) {
      ZDeclName first = zDeclNames.get(i);
      for (int j = i + 1; j < zDeclNames.size(); j++) {
        ZDeclName second = zDeclNames.get(j);
        if (first.equals(second)) {
          Object [] params = {second, className()};
          error(second, ErrorMessage.REDECLARED_NAME_IN_CLASSPARA, params);
        }
      }
    }
  }

  //check for duplicates in a class paragraph, and that names in the
  //visibility list are names of features in the class
  protected void checkClassSig(ClassSig cSig,
                               TermA termA,
                               VisibilityList visibilityList,
                               ErrorMessage errorMessage)
  {
    List<ZDeclName> declNames = list(className());

    //collect the names
    List<NameTypePair> attrDecls = cSig.getAttribute();
    for (NameTypePair pair : attrDecls) {
      declNames.add(pair.getZDeclName());
    }
    Signature stateSig = cSig.getState();
    List<NameTypePair> stateDecls = stateSig.getNameTypePair();
    for (NameTypePair pair : stateDecls) {
      declNames.add(pair.getZDeclName());
    }
    List<NameSignaturePair> opDecls = cSig.getOperation();
    for (NameSignaturePair pair : opDecls) {
      declNames.add(pair.getZDeclName());
    }

    //check for duplicate names
    for (int i = 0; i < declNames.size(); i++) {
      ZDeclName first = declNames.get(i);
      for (int j = i + 1; j < declNames.size(); j++) {
        ZDeclName second = declNames.get(j);
        if (first.equals(second)) {
          Object [] params = {first, termA};
          error(first, errorMessage, params);
        }
      }
    }

    //check that all names in the visibility list are features of this class
    if (visibilityList != null) {
      List<RefName> visibleNames = visibilityList.getRefName();
      for (RefName visibleName : visibleNames) {
	ZRefName zVisibleName = assertZRefName(visibleName);
        boolean found = false;
        for (ZDeclName featureName : declNames) {
          if (namesEqual(featureName, zVisibleName) &&
              !namesEqual(className(), zVisibleName)) {
            found = true;
            break;
          }
        }
        if (!found) {
          Object [] params = {zVisibleName, className()};
          error(zVisibleName,
                ErrorMessage.NON_EXISTENT_NAME_IN_VISIBILITYLIST,
                params);
        }
      }
    }
  }

  //check that each visible feature of a class is visible in a subclass
  protected void checkVisibility(ClassRefType superClass,
                                 ClassRefType subClass,
                                 List<NameTypePair> superPairs,
                                 List<NameTypePair> subPairs,
                                 PolyExpr polyExpr)
  {
    for (NameTypePair superPair : superPairs) {
      ZRefName superName = factory().createZRefName(superPair.getZDeclName());
      if (isVisible(superName, superClass)) {
	//if this feature is visible in the super class, it must be visible
	//in the subclass as well
        NameTypePair subPair = findNameTypePair(superName, subPairs);
        if (subPair == null || !isVisible(superName, subClass)) {
          Object [] params = {subClass.getThisClass().getRefName(),
                              superName,
                              superClass.getThisClass().getRefName(),
                              polyExpr};
          error(polyExpr,
                ErrorMessage.NON_VISIBLE_FEATURE_IN_POLYEXPR, params);
        }
      }
    }
  }

  protected void checkOpVisibility(ClassRefType superClass,
                                   ClassRefType subClass,
                                   List<NameSignaturePair> superPairs,
                                   List<NameSignaturePair> subPairs,
                                   PolyExpr polyExpr)
  {
    for (NameSignaturePair superPair : superPairs) {
      ZRefName superName = factory().createZRefName(superPair.getZDeclName());
      if (isVisible(superName, superClass)) {
        NameSignaturePair subPair = findNameSigPair(superName, subPairs);
	//if this operation is visible in the super class, it must be
	//visible in the subclass as well
        if (subPair == null || !isVisible(superName, subClass)) {
          Object [] params = {subClass.getThisClass().getRefName(),
                              superName,
                              superClass.getThisClass().getRefName(),
                              polyExpr};

          error(polyExpr,
                ErrorMessage.NON_VISIBLE_FEATURE_IN_POLYEXPR, params);
        }
	//if it is visible, the signatures must be compatible
        else if (subPair != null) {
          Signature superSig = superPair.getSignature();
          Signature subSig = subPair.getSignature();
          UResult unified = unify(superSig, subSig);
          if (unified == FAIL) {
            Object [] params = {superName, polyExpr,
                                subClass.getThisClass().getRefName(),
                                superClass.getThisClass().getRefName(),
                                superSig, subSig};

            error(polyExpr,
                  ErrorMessage.INCOMPATIBLE_OP_IN_POLYEXPR, params);
          }
        }

      }
    }
  }

  protected Signature createPloSig(Signature lSig, Signature rSig,
                                   TermA termA, String errorMessage)
  {
    //b3 and b4 correspond to the variable names "\Beta_3" and
    //"\Beta_4" in the standard for piping expr
    List<NameTypePair> b3Pairs = list(lSig.getNameTypePair());
    List<NameTypePair> b4Pairs = list(rSig.getNameTypePair());
    List<NameTypePair> rPairs = rSig.getNameTypePair();

    for (NameTypePair rPair : rPairs) {
      ZDeclName rName = rPair.getZDeclName();
      List<Stroke> strokes = list(rName.getStroke());
      int size = strokes.size();
      if (size > 0 && strokes.get(size - 1) instanceof InStroke) {
        OutStroke out = factory().createOutStroke();
        strokes.set(size - 1, out);
        ZDeclName sName = factory().createZDeclName(rName.getWord(), strokes);
        NameTypePair foundPair = findNameTypePair(sName, lSig);
        if (foundPair != null) {
          Type2 fType = unwrapType(foundPair.getType());
          Type2 rType = unwrapType(rPair.getType());
          UResult unified = unify(fType, rType);
          if (unified == FAIL) {
            Object [] params = {termA, sName, fType, rName, rType};
            error(termA, errorMessage, params);
          }
          b4Pairs.remove(rPair);
        }
      }
    }
    //create the signature
    b3Pairs.addAll(b4Pairs);
    Signature result = factory().createSignature(b3Pairs);
    return result;
  }

  //rename the operations is a list
  protected List<NameSignaturePair> renameOps(List<NameSignaturePair> ops,
                                              List<NewOldPair> renamePairs)
  {
    List<NameSignaturePair> newPairs = list();
    for (NameSignaturePair pair : ops) {
      NewOldPair renamePair = findNewOldPair(pair.getZDeclName(), renamePairs);
      if (renamePair != null) {
        ZDeclName newName = renamePair.getZDeclName();
        NameSignaturePair newPair =
          factory().createNameSignaturePair(newName, pair.getSignature());
        newPairs.add(newPair);
      }
      else {
        newPairs.add(pair);
      }
    }
    return newPairs;
  }

  //rename the primary names in a class
  protected List<DeclName> renamePrimary(List<DeclName> primaryNames,
					 List<NewOldPair> renamePairs)
  {
    List<DeclName> newPrimaryNames = list();
    for (DeclName primaryName : primaryNames) {
      ZDeclName zPrimaryName = assertZDeclName(primaryName);
      NewOldPair renamePair = findNewOldPair(zPrimaryName, renamePairs);
      if (renamePair == null) {
        newPrimaryNames.add(zPrimaryName);
      }
      else {
        newPrimaryNames.add(renamePair.getZDeclName());
      }
    }
    return newPrimaryNames;
  }

  //rename the features in a class signature
  protected ClassSig createRenameClassSig(ClassSig cSig,
                                          RenameExpr renameExpr,
                                          String errorMessage)
  {
    List<NewOldPair> renamePairs = renameExpr.getRenamings();
    checkForDuplicateRenames(renamePairs, renameExpr,  errorMessage);

    List<NameTypePair> attrs = cSig.getAttribute();
    Signature attrSig = factory().createSignature(attrs);
    Signature newAttrSig = rename(attrSig, renamePairs);
    List<NameTypePair> newAttrs = newAttrSig.getNameTypePair();

    Signature state = cSig.getState();
    Signature newState = rename(state, renamePairs);

    List<NameSignaturePair> ops = cSig.getOperation();
    List<NameSignaturePair> newOps = renameOps(ops, renamePairs);

    ClassSig result = factory().createClassSig(cSig.getClasses(),
                                               newState, newAttrs, newOps);
    checkClassSig(result, renameExpr, null,
                  ErrorMessage.REDECLARED_NAME_IN_RENAMEEXPR);
    return result;
  }

  protected Type2 instantiate(Type2 type, List<Type2> preTypes)
  {
    Type2 result = factory().createUnknownType();
    //if this is a class type, instantiate it
    if (type instanceof ClassType) {
      ClassType classType = (ClassType) type;
      ClassSig cSig = classType.getClassSig();

      if (!containsObject(preTypes, classType)) {
        preTypes.add(classType);
      }

      ClassSig newCSig = null;
      if (!(cSig instanceof VariableClassSig)) {
        //instantiate the state
        Signature state = cSig.getState();
        Signature newState = null;
        if (state != null) {
          newState = instantiate(state, preTypes);
        }

        //instantiate the attributes
        List<NameTypePair> attrs = cSig.getAttribute();
        List<NameTypePair> newAttrs = instantiatePairs(attrs, preTypes);

        //instantiate the operations
        List<NameSignaturePair> ops = cSig.getOperation();
        List<NameSignaturePair> newOps = list();
        for (NameSignaturePair pair : ops) {
          Signature signature = instantiate(pair.getSignature(), preTypes);
          NameSignaturePair newPair =
            factory().createNameSignaturePair(pair.getZDeclName(), signature);
          newOps.add(newPair);
        }

        //instaniate the class references
        List<ClassRef> classRefs = cSig.getClasses();
        List<ClassRef> newClassRefs = list();
        for (ClassRef classRef : classRefs) {
          List<Type2> types = instantiateTypes(classRef.getType(), preTypes);
	  List<NewOldPair> pairs = list();
          ClassRef newClassRef =
            factory().createClassRef(classRef.getRefName(), types, pairs);
          newClassRefs.add(newClassRef);
        }
        newCSig =
          factory().createClassSig(newClassRefs, newState, newAttrs, newOps);
      }

      if (type instanceof ClassRefType) {
        ClassRefType classRefType = (ClassRefType) type;
        ClassRef classRef = instantiate(classRefType.getThisClass(), preTypes);
        result = factory().createClassRefType(newCSig, classRef,
                                              classRefType.getSuperClass(),
                                              classRefType.getVisibilityList(),
                                              classRefType.getPrimary());
      }
      else if (type instanceof ClassPolyType) {
        ClassPolyType classPolyType = (ClassPolyType) type;
        ClassRef classRef = instantiate(classPolyType.getRootClass(), preTypes);
        result = factory().createClassPolyType(newCSig, classRef);
      }
      else {
        ClassUnionType classUnionType = (ClassUnionType) type;
        result = factory().createClassUnionType(newCSig);
      }
    }
    //if not a class type, use the Z typechecker's instantiate method
    else {
      result = super.instantiate(type, preTypes);
    }
    return result;
  }

  protected ClassRef instantiate(ClassRef classRef, List<Type2> preTypes)
  {
    List<Type2> types = instantiateTypes(classRef.getType(), preTypes);
    List<NewOldPair> pairs = list();
    ClassRef result =
      factory().createClassRef(classRef.getRefName(), types, pairs);
    return result;
  }

  protected List<ClassRef> getClasses(Type2 type)
  {
    List<ClassRef> classes = list();
    if (type instanceof ClassType) {
      ClassType classType = (ClassType) type;
      classes = getClasses(classType.getClassSig());
    }
    return classes;
  }

  //get the classes that make up the parents of the class name.
  protected List<ClassRef> getClasses(ClassSig cSig)
  {
    List<ClassRef> classes = cSig.getClasses();
    return classes;
  }

  //find an attribute in a class signature
  protected NameTypePair findAttribute(ZDeclName zDeclName, ClassSig cSig)
  {
    NameTypePair result = findNameTypePair(zDeclName, cSig.getAttribute());
    return result;
  }

  //find a state variable in a class signature
  protected NameTypePair findStateDecl(ZDeclName zDeclName, ClassSig cSig)
  {
    List<NameTypePair> decls = cSig.getState().getNameTypePair();
    NameTypePair result = findNameTypePair(zDeclName, decls);
    return result;
  }

  //find a NameSignaturePair in a class signature
  protected NameSignaturePair findOperation(ZDeclName zDeclName, ClassSig cSig)
  {
    //problem with static import from GlobalDefs
    return GlobalDefs.findOperation(zDeclName, cSig);
  }

  protected NameSignaturePair findNameSigPair(ZDeclName zDeclName,
                                              List<NameSignaturePair> pairs)
  {
    //problem with static import from GlobalDefs
    return GlobalDefs.findNameSigPair(zDeclName, pairs);
  }

  protected NameSignaturePair findOperation(ZRefName zRefName, ClassSig cSig)
  {
    ZDeclName zDeclName = factory().createZDeclName(zRefName);
    NameSignaturePair result = findOperation(zDeclName, cSig);
    return result;
  }

  protected NameSignaturePair findNameSigPair(ZRefName zRefName,
                                              List<NameSignaturePair> pairs)
  {
    ZDeclName zDeclName = factory().createZDeclName(zRefName);
    NameSignaturePair result = findNameSigPair(zDeclName, pairs);
    return result;
  }

  protected ClassRef findRef(ZRefName zRefName, List<ClassRef> classRefs)
  {
    ClassRef result = null;
    for (ClassRef classRef : classRefs) {
      if (namesEqual(zRefName, classRef.getZRefName())) {
        result = classRef;
      }
    }
    return result;
  }

  protected Type2 resolveUnknownType(Type2 type)
  {
    Type2 result = type;
    if (sectTypeEnv().getSecondTime() && type instanceof UnknownType) {
      UnknownType uType = (UnknownType) type;
      Type2 resolved = super.resolveUnknownType(uType);
      result = renameClassType(resolved, uType.getPairs());
    }
    return result;
  }

  protected Type2 renameClassType(Type2 type, List<NewOldPair> pairs)
  {
    Type2 result = type;
    if (type instanceof ClassType && pairs.size() > 0) {
      ClassType classType = (ClassType) type;
      ClassSig cSig = classType.getClassSig();
      List<NameTypePair> attrs = cSig.getAttribute();
      Signature attrSig = factory().createSignature(attrs);
      Signature newAttrSig = rename(attrSig, pairs);
      List<NameTypePair> newAttrs = newAttrSig.getNameTypePair();

      Signature state = cSig.getState();
      Signature newState = rename(state, pairs);

      List<NameSignaturePair> ops = cSig.getOperation();
      List<NameSignaturePair> newOps = renameOps(ops, pairs);

      ClassSig newCSig = factory().createClassSig(cSig.getClasses(),
                                                  newState, newAttrs, newOps);
      result = (Type2) classType.create(result.getChildren());
      ((ClassType) result).setClassSig(newCSig);
    }
    return result;
  }

  protected Type2 lookupClass(ClassRef classRef)
  {
    Type2 result = factory().createUnknownType();
    Type refType = getType(classRef.getZRefName());
    if (refType instanceof GenericType) {
      List<ZDeclName> names = genericType(refType).getName();
      List<Type2> types = classRef.getType();
      if (names.size() == types.size()) {
        unificationEnv().enterScope();
        for (int i = 0; i < names.size(); i++) {
          unificationEnv().addGenName(names.get(i), types.get(i));
        }
        Type newType = instantiate(refType);
        refType = newType;
        unificationEnv().exitScope();
      }
    }

    if (unwrapType(refType) instanceof PowerType) {
      PowerType powerType = (PowerType) unwrapType(refType);
      result = renameClassType(powerType.getType(), classRef.getNewOldPair());
    }
    return result;
  }

  protected Type2 unionClasses(ClassUnionExpr classUnionExpr,
                               Type2 lType, Type2 rType)
  {
    Type2 result = factory().createUnknownType();
    if (lType instanceof ClassType && rType instanceof ClassType) {
      ClassType lClassType = (ClassType) lType;
      ClassType rClassType = (ClassType) rType;
      ClassSig lcSig = lClassType.getClassSig();
      ClassSig rcSig = rClassType.getClassSig();

      List<ClassRef> classes = list();
      List<NameTypePair> stateAndAttrs = list();
      Signature state = factory().createSignature();
      List<NameTypePair> attrs = list();
      List<NameSignaturePair> ops = list();

      //check that if there are any intersecting class references,
      //they are compatible
      for (ClassRef lClassRef : lcSig.getClasses()) {
	for (ClassRef rClassRef : rcSig.getClasses()) {
	  if (namesEqual(lClassRef.getZRefName(), rClassRef.getZRefName())) {
	    assert lClassRef.getType().size() == rClassRef.getType().size();
	    for (int i = 0; i < lClassRef.getType().size(); i++) {
	      Type2 lrType = lClassRef.getType().get(i);
	      Type2 rrType = rClassRef.getType().get(i);
	      UResult unified = unify(lrType, rrType);
	      if (unified == FAIL) {
		Object [] params = {classUnionExpr};
		error(classUnionExpr,
		      ErrorMessage.INCOMPATIBLE_CLASSUNIONEXPR, params);
		return result;
	      }
	    }
	  }
	}
      }

      //check that the features are compatible, and find common elements
      assert lcSig != null;
      assert rcSig != null;
      List<NameTypePair> lsPairs = lcSig.getState().getNameTypePair();
      List<NameTypePair> rsPairs = rcSig.getState().getNameTypePair();
      List<NameTypePair> laPairs = lcSig.getAttribute();
      List<NameTypePair> raPairs = rcSig.getAttribute();

      //gather pairs from the state
      for (NameTypePair lPair : lsPairs) {
        if (!isSelfName(lPair.getZDeclName())) {
          NameTypePair rPair = findNameTypePair(lPair.getZDeclName(), rsPairs);
          if (rPair != null) {
            state.getNameTypePair().add(lPair);
            state.getNameTypePair().add(rPair);
          }
	  rPair = findNameTypePair(lPair.getZDeclName(), raPairs);
	  if (rPair != null) {
	    stateAndAttrs.add(lPair);
	    stateAndAttrs.add(rPair);	    
	  }
        }
      }

      //gather pairs from local defs
      for (NameTypePair lPair : laPairs) {
        NameTypePair rPair = findNameTypePair(lPair.getZDeclName(), raPairs);
        if (rPair != null) {
          attrs.add(lPair);
          attrs.add(rPair);
        }
	rPair = findNameTypePair(lPair.getZDeclName(), rsPairs);
	if (rPair != null) {
	  stateAndAttrs.add(lPair);
	  stateAndAttrs.add(rPair);	    
	}
      }

      //check compatibility
      if (classUnionExpr != null) {
        checkForDuplicates(state.getNameTypePair(), classUnionExpr,
                           ErrorMessage.INCOMPATIBLE_FEATURE_IN_CLASSUNIONEXPR);
        checkForDuplicates(attrs, classUnionExpr,
                           ErrorMessage.INCOMPATIBLE_FEATURE_IN_CLASSUNIONEXPR);
	//state and local defs must also be compatible
	checkForDuplicates(stateAndAttrs, classUnionExpr,
                           ErrorMessage.INCOMPATIBLE_FEATURE_IN_CLASSUNIONEXPR);
      }

      //check compatibility of operations
      List<NameSignaturePair> loPairs = lcSig.getOperation();
      List<NameSignaturePair> roPairs = rcSig.getOperation();
      for (NameSignaturePair lPair : loPairs) {
        ZDeclName lName = lPair.getZDeclName();
        NameSignaturePair rPair = findOperation(lName, rcSig);
        if (rPair != null) {
          Signature lSig = lPair.getSignature();
          Signature rSig = rPair.getSignature();
          UResult unified = unify(lSig, rSig);
          if (unified == FAIL && classUnionExpr != null) {
            Object [] params = {lName, classUnionExpr, lSig, rSig};
            error(classUnionExpr,
                  ErrorMessage.INCOMPATIBLE_OP_IN_CLASSUNIONEXPR, params);
          }
          else {
            ops.add(lPair);
          }
        }
      }

      //add the class references
      for (ClassRef classRef : lcSig.getClasses()) {
	if (!contains(classes, classRef)) {
	  classes.add(classRef);
	}
      }
      for (ClassRef classRef : rcSig.getClasses()) {
	if (!contains(classes, classRef)) {
	  classes.add(classRef);
	}
      }
      ClassSig cSig = factory().createClassSig(classes, state, attrs, ops);
      result = factory().createClassUnionType(cSig);
    }
    return result;
  }

  protected Type2 resolveClassType(Type2 type)
  {
    Type2 result = type;
    if (type instanceof ClassUnionType && sectTypeEnv().getSecondTime()) {
      ClassUnionType cuType = (ClassUnionType) type;
      ClassSig cSig = cuType.getClassSig();
      List<ClassRef> classes = cSig.getClasses();

      //if this is the set \oid
      if (classes.size() != 0) {
	assert classes.size() > 1;
	Type2 firstType = lookupClass(classes.get(0));
	Type2 secondType = lookupClass(classes.get(1));
	Type2 unioned = unionClasses(null, firstType, secondType);
	for (int i = 2; i < classes.size(); i++) {
	  Type2 nextType = lookupClass(classes.get(0));
	  unioned = unionClasses(null, unioned, nextType);
	}
	result = unioned;
      }
    }
    else if (type instanceof VariableClassType) {
      VariableClassType vClassType = (VariableClassType) type;
      if (vClassType.getValue() != vClassType) {
	result = resolveClassType(vClassType.getValue());
      }
      else if (vClassType.getCandidateType() != null) {
	result = resolveClassType(vClassType.getCandidateType());
      }
    }   
    else if (type instanceof ClassType && sectTypeEnv().getSecondTime()) {
      ClassRef classRef = null;
      if (type instanceof ClassRefType) {
        ClassRefType classRefType = (ClassRefType) type;
        classRef = classRefType.getThisClass();
      }
      else if (type instanceof ClassPolyType) {
        ClassPolyType classPolyType = (ClassPolyType) type;
        classRef = classPolyType.getRootClass();
      }
      result = lookupClass(classRef);
    }
    else if (type instanceof UnknownType) {
      result = resolveUnknownType(type);
    }
    return result;
  }

  protected ClassRef rename(ClassRef classRef, RenameExpr renameExpr)
  {
    List<NewOldPair> cfPairs = classRef.getNewOldPair();
    List<NewOldPair> rnPairs = renameExpr.getRenamings();
    List<NewOldPair> newPairs = list();
    for (NewOldPair rnPair :rnPairs) {
      NewOldPair cfPair = findNewOldPair(rnPair.getZDeclName(), cfPairs);
      if (cfPair == null) {
        newPairs.add(rnPair);
      }
      else {
        NewOldPair newPair =
          factory().createNewOldPair(rnPair.getNewName(), cfPair.getOldName());
      }
    }
    ClassRef result = factory().createClassRef(classRef.getRefName(),
                                               classRef.getType(),
                                               newPairs);
    return result;
  }

  protected CarrierSet getCarrierSet()
  {
    return new net.sourceforge.czt.typecheck.oz.util.CarrierSet(true);
  }

  protected void print(Term term,
                       Writer writer,
                       SectionInfo sectInfo,
                       String sectName,
                       Markup markup)
  {
    PrintUtils.print(term, writer, sectInfo, sectName, markup());
  }

  public String toString(Type type)
  {
    String result = new String();
    if (unwrapType(type) instanceof PowerType &&
        powerType(unwrapType(type)).getType() instanceof ClassRefType) {
      net.sourceforge.czt.oz.ast.ClassRefType ctype =
        (ClassRefType) powerType(unwrapType(type)).getType();
      result = "P " + classRefTypeToString(ctype);
    }
    else if (type instanceof net.sourceforge.czt.oz.ast.ClassRefType) {
      ClassRefType ctype = (ClassRefType) type;
      result = classRefTypeToString(ctype);
    }
    else {
      result = type.toString();
    }
    return result;
  }

  public String classRefTypeToString(ClassRefType ctype)
  {
    String result = new String();
    ZRefName className = ctype.getThisClass().getZRefName();
    result += "(CLASS " + className + "\n";

    ClassSig csig = ctype.getClassSig();
    result += "\tATTR(" + className + ")\n";
    for (Object o : csig.getAttribute()) {
      NameTypePair pair = (NameTypePair) o;
      result += "\t\t" + pair.getZDeclName() + " : " + pair.getType() + "\n";
    }
    result += "\tSTATE(" + className + ")\n";
    for (Object o : csig.getState().getNameTypePair()) {
      NameTypePair pair = (NameTypePair) o;
      result += "\t\t" + pair.getZDeclName() + " : " + toString(pair.getType()) + "\n";
    }
    result += "\tOPS(" + className + ")\n";
    for (Object o : csig.getOperation()) {
      NameSignaturePair p = (net.sourceforge.czt.oz.ast.NameSignaturePair) o;
      result += "\t\t" + p.getZDeclName() + " : " + p.getSignature();
    }
    result += ")";
    return result;
  }
}
