/*
  Copyright (C) 2004 Tim Miller
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
package net.sourceforge.czt.typecheck.z;

import java.io.Writer;
import java.io.StringWriter;
import java.util.List;
import java.util.Iterator;
import java.util.logging.Logger;

import net.sourceforge.czt.base.ast.*;
import net.sourceforge.czt.base.visitor.*;
import net.sourceforge.czt.z.ast.*;
import net.sourceforge.czt.session.*;
import net.sourceforge.czt.print.z.PrintUtils;
import net.sourceforge.czt.util.CztException;
import net.sourceforge.czt.typecheck.z.util.*;
import net.sourceforge.czt.typecheck.z.impl.*;

/**
 * A super class for the *Checker classes in the typechecker.
 */
abstract public class Checker
  implements TermVisitor
{
  protected static final UResult SUCC = UResult.SUCC;
  protected static final UResult PARTIAL = UResult.PARTIAL;
  protected static final UResult FAIL = UResult.FAIL;

  //the information required for the typechecker classes.
  protected TypeChecker typeChecker_;

  public Checker(TypeChecker typeChecker)
  {
    typeChecker_ = typeChecker;
  }

  /**
   * Double check that this visitor is not being asked to visit a
   * non-Decl object.
   */
  public Object visitTerm(Term term)
  {
    throw new CztException(this.getClass().getName() +
                           " being asked to visit " +
                           term.getClass().getName());
  }

  /**
   * If this is a generic type, get the type without the
   * parameters. If not a generic type, return the type
   */
  protected static Type2 unwrapType(Type type)
  {
    Type2 result = null;

    if (type instanceof GenericType) {
      if (genericType(type).getOptionalType() != null) {
        result = genericType(type).getOptionalType();
      }
      else {
        result = genericType(type).getType();
      }
    }
    else {
      result = (Type2) type;
    }

    return result;
  }

  protected static boolean instanceOf(Object o, Class aClass)
  {
    return aClass.isInstance(o);
  }

  //non-safe typecast
  protected static SchemaType schemaType(Object o)
  {
    return (SchemaType) o;
  }

  //non-safe typecast
  protected static PowerType powerType(Object o)
  {
    return (PowerType) o;
  }

  //non-safe typecast
  protected static GivenType givenType(Object o)
  {
    return (GivenType) o;
  }

  //non-safe typecast
  protected static GenericType genericType(Object o)
  {
    return (GenericType) o;
  }

  //non-safe typecast
  protected static GenParamType genParamType(Object o)
  {
    return (GenParamType) o;
  }

  //non-safe typecast
  protected static ProdType prodType(Object o)
  {
    return (ProdType) o;
  }

  //non-safe typecast
  protected static UnknownType unknownType(Object o)
  {
    return (UnknownType) o;
  }

  //non-safe typecast
  protected static VariableType variableType(Object o)
  {
    return (VariableType) o;
  }

  //non-safe typecast
  protected static VariableSignature variableSignature(Object o)
  {
    return (VariableSignature) o;
  }

  //if this is a variable type, returned the resolved type if there is
  //one, otherwise, return the input
  protected Type2 resolve(Type2 type)
  {
    Type2 result = type;
    if (type instanceof VariableType) {
      VariableType vType = (VariableType) type;
      if (vType.getValue() != vType) {
        result = vType.getValue();
      }
    }
    return result;
  }

  //if this is a variable signature, return the resolved signature if there is
  //one, otherwise, return the input
  protected Signature resolve(Signature signature)
  {
    Signature result = signature;
    if (signature instanceof VariableSignature) {
      VariableSignature vSig = (VariableSignature) signature;
      if (vSig.getValue() != vSig) {
        result = vSig.getValue();
      }
    }
    return result;
  }

  //adds an annotation to a TermA
  protected void addAnn(TermA termA, Object ann)
  {
    if (ann != null) {
      termA.getAnns().add(ann);
    }
  }

  //removes a type annotation from a TermA
  protected void removeAnn(TermA termA, Object ann)
  {
    if (ann != null) {
      List anns = termA.getAnns();
      for (Iterator iter = anns.iterator(); iter.hasNext(); ) {
        Object next = iter.next();
        if (next == ann) {
          iter.remove();
        }
      }
    }
  }

  //removes all type annotations of a particular class from a TermA
  protected void removeAnn(TermA termA, Class aClass)
  {
    List anns = termA.getAnns();
    for (Iterator iter = anns.iterator(); iter.hasNext(); ) {
      Object ann = iter.next();
      if (aClass.isInstance(ann)) {
        iter.remove();
      }
    }
  }

  //adds a type annotation created from a type to a TermA
  protected void addTypeAnn(TermA termA, Type type)
  {
    assert type != null;

    TypeAnn typeAnn = (TypeAnn) termA.getAnn(TypeAnn.class);
    if (typeAnn == null) {
      typeAnn = factory().createTypeAnn(type);
      termA.getAnns().add(typeAnn);
    }
    else {
      typeAnn.setType(type);
    }
  }

  //adds a signature annotation create from a signature to a TermA
  protected void addSignatureAnn(TermA termA, Signature signature)
  {
    SignatureAnn signatureAnn =
      (SignatureAnn) termA.getAnn(SignatureAnn.class);

    if (signatureAnn == null) {
      signatureAnn = factory().createSignatureAnn(signature);
      termA.getAnns().add(signatureAnn);
    }
    else {
      signatureAnn.setSignature(signature);
    }
  }

  protected TypeAnn getTypeAnn(TermA termA)
  {
    TypeAnn typeAnn = (TypeAnn) termA.getAnn(TypeAnn.class);

    if (typeAnn == null) {
      typeAnn = factory().createTypeAnn();
      addAnn(termA, typeAnn);
    }

    return typeAnn;
  }

  protected Type2 getType2FromAnns(TermA termA)
  {
    Type annType = getTypeFromAnns(termA);
    Type2 result = unwrapType(annType);
    return result;
  }

  protected Type getTypeFromAnns(TermA termA)
  {
    Type result = factory().createUnknownType();
    TypeAnn typeAnn = (TypeAnn) termA.getAnn(TypeAnn.class);

    if (typeAnn != null) {
      result = typeAnn.getType();
    }
    return result;
  }

  //returns true if and only if 'list' contains a reference to 'o'
  protected static boolean containsDoubleEquals(List list, Object o)
  {
    boolean result = false;

    for (Iterator iter = list.iterator(); iter.hasNext(); ) {
      Object next = iter.next();
      if (next == o) {
        result = true;
        break;
      }
    }
    return result;
  }

  //returns true if and only if the specified type contains a variable
  //type
  protected boolean containsVariableType(Type2 type2)
  {
    return UnificationEnv.containsVariable(type2);
  }

  //add an error to the list of error annotation
  protected void error(ErrorAnn errorAnn)
  {
    paraErrors().add(errorAnn);
  }

  //add an error as an annotation to the term. Return true if and only
  //if this error is not already added to this term
  protected boolean addErrorAnn(TermA termA, ErrorAnn errorAnn)
  {
    for (Object ann : termA.getAnns()) {
      if (ann instanceof ErrorAnn) {
        ErrorAnn existingAnn = (ErrorAnn) ann;
        if (errorAnn.getErrorMessage().equals(existingAnn.getErrorMessage())) {
          return false;
        }
      }
    }
    termA.getAnns().add(errorAnn);
    return true;
  }

  //add an error to the list of error messages, and as an annotation to the term
  protected void error(TermA termA, ErrorAnn errorAnn)
  {
    boolean added = addErrorAnn(termA, errorAnn);
    if (added) error(errorAnn);
  }

  protected void error(TermA termA, ErrorMessage error, Object [] params)
  {
    ErrorAnn errorAnn = errorAnn(termA, error, params);
    error(termA, errorAnn);
  }

  protected void error(TermA termA, String error, Object [] params)
  {
    ErrorAnn errorAnn = errorAnn(termA, error, params);
    error(termA, errorAnn);
  }

  protected ErrorAnn errorAnn(TermA termA, ErrorMessage error, Object [] params)
  {
    ErrorAnn errorAnn = exprChecker().errorAnn(termA, error.toString(), params);
    return errorAnn;
  }

  protected ErrorAnn errorAnn(TermA termA, String error, Object [] params)
  {
    ErrorAnn errorAnn = new ErrorAnn(error, params, sectInfo(),
                                     sectName(), nearestLocAnn(termA),
                                     termA, markup());
    return errorAnn;
  }

  protected void removeError(TermA termA)
  {
    List anns = termA.getAnns();
    for (Iterator iter = anns.iterator(); iter.hasNext(); ) {
      Object ann = iter.next();
      if (ann instanceof ErrorAnn) {
        iter.remove();
        paraErrors().remove(ann);
      }
    }
  }

  //converts a Term to a string
  protected String format(Term term)
  {
    try {
      Term newTerm = (Term) term.accept(exprChecker().getCarrierSet());
      StringWriter writer = new StringWriter();
      print(newTerm, writer, sectInfo(), sectName(), markup());
      return writer.toString();
    }
    catch (Exception e) {
      String message = "Cannot be printed";
      e.printStackTrace();
      return message;
    }
  }

  protected CarrierSet getCarrierSet()
  {
    return new CarrierSet();
  }

  protected void print(Term term,
                       Writer writer,
                       SectionInfo sectInfo,
                       String sectName,
                       Markup markup)
  {
    PrintUtils.print(term, writer, sectInfo, sectName, markup());
  }

  //get the position of a TermA from its annotations
  protected String position(TermA termA)
  {
    String result = "Unknown location: ";

    LocAnn locAnn = nearestLocAnn(termA);
    if (locAnn != null) {
      result = "\"" + locAnn.getLoc() + "\", ";
      result += "line " + locAnn.getLine() + ": ";
    }
    else {
      result = "No location information";
    }

    return result;
  }

  //find the closest LocAnn
  protected LocAnn nearestLocAnn(TermA termA)
  {
    LocAnn result = (LocAnn) termA.getAnn(LocAnn.class);

    if (result == null) {
      for (int i = 0; i < termA.getChildren().length; i++) {
        Object next = termA.getChildren()[i];
        if (next instanceof TermA) {
          LocAnn nextLocAnn = nearestLocAnn((TermA) next);
          return nextLocAnn;
        }
      }
    }
    return result;
  }

  protected static ListTerm listTerm()
  {
    return new net.sourceforge.czt.base.impl.ListTermImpl();
  }

  protected static <E> List<E> list()
  {
    return new java.util.ArrayList<E>();
  }

  protected static <E> List<E> list(E e)
  {
    List result = list();
    result.add(e);
    return result;
  }

  protected static <E> List<E> list(E e1, E e2)
  {
    List result = list(e1);
    result.add(e2);
    return result;
  }

  protected static <E> List<E> list(List<E> list)
  {
    List<E> result = new java.util.ArrayList<E>(list);
    return result;
  }

  protected UResult unify(Type2 typeA, Type2 typeB)
  {
    return unificationEnv().unify(typeA, typeB);
  }

  protected UResult unify(Signature sigA, Signature sigB)
  {
    return unificationEnv().unify(sigA, sigB);
  }

  protected CarrierSet carrierSet()
  {
    return typeChecker_.carrierSet_;
  }

  //a Factory for creating Z terms
  protected Factory factory()
  {
    return typeChecker_.zFactory_;
  }

  //the SectTypeEnv for all parent specifications
  protected SectTypeEnv sectTypeEnv()
  {
    return typeChecker_.sectTypeEnv_;
  }

  //the TypeEnv for local variable scopes
  protected TypeEnv typeEnv()
  {
    return typeChecker_.typeEnv_;
  }

  //the TypeEnv for pending global declarations
  protected TypeEnv pending()
  {
    return typeChecker_.pending_;
  }

  //the UnificationEnv for recording unified generic types
  protected UnificationEnv unificationEnv()
  {
    return typeChecker_.unificationEnv_;
  }

  //a section manager
  protected SectionInfo sectInfo()
  {
    return typeChecker_.sectInfo_;
  }

  //the markup
  protected Markup markup()
  {
    return typeChecker_.markup_;
  }

  //the current section name
  protected String sectName()
  {
    return typeChecker_.sectName_.toString();
  }

  //set the current section name
  protected void sectName(String sectName)
  {
    typeChecker_.sectName_.replace(0, typeChecker_.sectName_.length(),
                                   sectName);
  }

  //the list of errors thrown by retrieving type info
  protected List<ErrorAnn> errors()
  {
    return typeChecker_.errors_;
  }

  //the list of errors thrown by retrieving type info
  protected List<Object> paraErrors()
  {
    return typeChecker_.paraErrors_;
  }

  protected boolean useBeforeDecl()
  {
    return typeChecker_.useBeforeDecl_;
  }

  //the logger instance
  protected Logger logger()
  {
    return typeChecker_.logger_;
  }

  //typecheck a file using an instance of this typechecker
  protected List typecheck(TermA termA, SectionInfo sectInfo)
  {
    return TypeCheckUtils.typecheck(termA, sectInfo, markup());
  }

  //the visitors used to typechecker a spec
  protected Checker specChecker()
  {
    return typeChecker_.specChecker_;
  }

  protected Checker paraChecker()
  {
    return typeChecker_.paraChecker_;
  }

  protected Checker declChecker()
  {
    return typeChecker_.declChecker_;
  }

  protected Checker exprChecker()
  {
    return typeChecker_.exprChecker_;
  }

  protected Checker predChecker()
  {
    return typeChecker_.predChecker_;
  }

  protected Checker postChecker()
  {
    return typeChecker_.postChecker_;
  }

  protected void checkForDuplicates(List<NameTypePair> pairs,
                                    TermA termA)
  {
    checkForDuplicates(pairs, termA,
                       ErrorMessage.TYPE_MISMATCH_IN_SIGNATURE.toString());
  }

  //check for type mismatches in a list of decls. Add an ErrorAnn to
  //any name that is in error
  protected void checkForDuplicates(List<NameTypePair> pairs,
                                    TermA termA,
                                    String errorMessage)
  {
    for (int i = 0; i < pairs.size(); i++) {
      NameTypePair first = pairs.get(i);
      for (int j = i + 1; j < pairs.size(); j++) {
        NameTypePair second = pairs.get(j);
        if (first.getName().equals(second.getName())) {
          Type2 firstType = unwrapType(first.getType());
          Type2 secondType = unwrapType(second.getType());
          UResult unified = unify(firstType, secondType);

          //if the types don't agree, raise an error
          if (unified == FAIL) {
            //termA is not printed in some error messages
            Object [] params = null;
            if (termA != null) {
              params = new Object []
                {second.getName(), termA, firstType, secondType};
	      error(termA, errorMessage, params);
            }
            else {
              params = new Object [] {second.getName(), firstType, secondType};
	      error(second.getName(), errorMessage, params);
            }
          }
          //if the types do agree, we don't need the second declaration
          else {
            pairs.remove(j--);
          }
        }
      }
    }
  }

  protected Signature createCompSig(Signature lSig, Signature rSig,
                                    TermA termA, String errorMessage)
  {
    //b3 and b4 correspond to the variable names "\Beta_3" and
    //"\Beta_4" in the standard
    List<NameTypePair> b3Pairs = list(lSig.getNameTypePair());
    List<NameTypePair> b4Pairs = list(rSig.getNameTypePair());
    List<NameTypePair> rPairs = rSig.getNameTypePair();
    for (NameTypePair rPair : rPairs) {
      DeclName rName = (DeclName) rPair.getName();

      //if the name + nextstoke is in lSig, remove it from b3, and
      //remove name from b4
      List<Stroke> strokes = list(rName.getStroke());
      int size = strokes.size();
      strokes.add(factory().createNextStroke());
      DeclName sName = factory().createDeclName(rName.getWord(),
                                                strokes, null);
      NameTypePair foundPair = findNameTypePair(sName, lSig);
      if (foundPair != null) {
        Type2 fType = unwrapType(foundPair.getType());
        Type2 rType = unwrapType(rPair.getType());
        UResult unified = unify(fType, rType);
        if (unified == FAIL) {
          Object [] params = {termA, sName, fType, rName, rType};
          error(termA, errorMessage, params);
        }
        b3Pairs.remove(foundPair);
        b4Pairs.remove(rPair);
      }
    }
    b3Pairs.addAll(b4Pairs);
    Signature result = factory().createSignature(b3Pairs);
    return result;
  }

  protected Signature createPipeSig(Signature lSig, Signature rSig,
                                    TermA termA, String errorMessage)
  {
    //b3 and b4 correspond to the variable names "\Beta_3" and
    //"\Beta_4" in the standard
    List<NameTypePair> b3Pairs = list(lSig.getNameTypePair());
    List<NameTypePair> b4Pairs = list(rSig.getNameTypePair());
    List<NameTypePair> rPairs = rSig.getNameTypePair();
    for (NameTypePair rPair : rPairs) {
      DeclName rName = (DeclName) rPair.getName();
      List<Stroke> strokes = list(rName.getStroke());
      int size = strokes.size();
      if (size > 0 && strokes.get(size - 1) instanceof InStroke) {
        OutStroke out = factory().createOutStroke();
        strokes.set(size - 1, out);
        DeclName sName = factory().createDeclName(rName.getWord(),
                                                  strokes, null);
        NameTypePair foundPair = findNameTypePair(sName, lSig);
        if (foundPair != null) {
          Type2 fType = unwrapType(foundPair.getType());
          Type2 rType = unwrapType(rPair.getType());
          UResult unified = unify(fType, rType);
          if (unified == FAIL) {
            Object [] params = {termA, sName, fType, rName, rType};
            error(termA, errorMessage, params);
          }
          b3Pairs.remove(foundPair);
          b4Pairs.remove(rPair);
        }
      }
    }
    //create the signature
    b3Pairs.addAll(b4Pairs);
    Signature result = factory().createSignature(b3Pairs);
    return result;
  }

  protected Signature createHideSig(Signature signature,
                                    List<RefName> refNames, TermA termA)
  {
    //create a new name/type pair list
    List<NameTypePair> pairs = signature.getNameTypePair();
    List<NameTypePair> newPairs = list(pairs);

    //iterate over every name, removing it from the signature
    for (RefName refName : refNames) {
      DeclName declName = factory().createDeclName(refName);
      NameTypePair rPair = findNameTypePair(declName, signature);

      //if this is name is not in the schema, raise an error
      if (rPair == null) {
        Object [] params = {termA, declName};
        error(termA, ErrorMessage.NON_EXISTENT_NAME_IN_HIDEEXPR, params);
      }
      //if it is in the schema, remove it
      else {
        for (Iterator pIter = newPairs.iterator(); pIter.hasNext(); ) {
          NameTypePair nPair = (NameTypePair) pIter.next();
          if (nPair == rPair) {
            pIter.remove();
          }
        }
      }
    }
    Signature result = factory().createSignature(newPairs);
    return result;
  }

  //check for duplicate names in a list of renames
  protected void checkForDuplicateRenames(List<NameNamePair> namePairs,
                                          TermA termA, String errorMessage)
  {
    //first check for duplicate renames
    List<RefName> oldNames = list();
    for (NameNamePair namePair : namePairs) {
      RefName oldName = namePair.getOldName();

      //if the old name is duplicated, raise an error
      if (oldNames.contains(oldName)) {
        Object [] params = {termA, oldName};
        error(termA, errorMessage, params);
      }
      oldNames.add(oldName);
    }
  }

  //rename the declarations
  protected Signature rename(Signature signature,
                             List<NameNamePair> namePairs)
  {
    List<NameTypePair> newPairs = list();
    List<NameTypePair> pairs = signature.getNameTypePair();
    for (NameTypePair pair : pairs) {
      NameNamePair namePair = findNameNamePair(pair.getName(), namePairs);
      if (namePair != null) {
        DeclName newName = namePair.getNewName();
        NameTypePair newPair =
          factory().createNameTypePair(newName, pair.getType());
        newPairs.add(newPair);
      }
      else {
        newPairs.add(pair);
      }
    }
    Signature result = factory().createSignature(newPairs);
    return result;
  }

  protected Signature createRenameSig(Signature signature,
                                      List<NameNamePair> namePairs,
                                      TermA termA, String errorMessage)
  {
    checkForDuplicateRenames(namePairs, termA, errorMessage);
    Signature result = rename(signature, namePairs);
    return result;
  }

  protected Type instantiate(Type type)
  {
    Type result = factory().createUnknownType();
    if (type instanceof GenericType) {
      GenericType gType = (GenericType) type;
      List<DeclName> declNames = gType.getName();
      Type2 firstType = gType.getType();
      Type2 optionalType = gType.getOptionalType();
      if (optionalType == null) {
        optionalType = exprChecker().instantiate(gType.getType());
      }
      else {
        optionalType = exprChecker().instantiate(optionalType);
      }
      result = factory().createGenericType(declNames, firstType, optionalType);
    }
    else {
      result = exprChecker().instantiate((Type2) type);
    }

    return result;
  }

  protected Type2 instantiate(Type2 type)
  {
    Type2 result = factory().createUnknownType();

    if (type instanceof GenParamType) {
      GenParamType genParamType = (GenParamType) type;
      DeclName genName = genParamType.getName();

      //try to get the type from the UnificationEnv
      Type unificationEnvType = unificationEnv().getType(genName);

      //if this type's reference is in the parameters
      if (containsDoubleEquals(typeEnv().getParameters(), genName)) {
        result = type;
      }
      else if (unificationEnvType instanceof UnknownType &&
               unknownType(unificationEnvType).getRefExpr() == null) {
        VariableType vType = factory().createVariableType();
        result = vType;
        unificationEnv().addGenName(genName, result);
      }
      else if (unificationEnvType instanceof Type2) {
        result = (Type2) unificationEnvType;
      }
      else {
        throw new CztException("Cannot instantiate " + type);
      }
    }
    else if (type instanceof VariableType) {
      VariableType vType = (VariableType) type;
      if (vType.getValue() != vType) {
        result = exprChecker().instantiate(vType.getValue());
      }
      else {
        result = vType;
      }
    }
    else if (type instanceof PowerType) {
      PowerType powerType = (PowerType) type;
      Type2 replaced = exprChecker().instantiate(powerType.getType());
      result = factory().createPowerType(replaced);
    }
    else if (type instanceof GivenType) {
      GivenType givenType = (GivenType) type;
      result = factory().createGivenType(givenType.getName());
    }
    else if (type instanceof SchemaType) {
      SchemaType schemaType = (SchemaType) type;
      Signature signature =
        exprChecker().instantiate(schemaType.getSignature());
      result = factory().createSchemaType(signature);
    }
    else if (type instanceof ProdType) {
      ProdType prodType = (ProdType) type;
      List<Type2> newTypes =
        exprChecker().instantiateTypes(prodType.getType());
      result = factory().createProdType(newTypes);
    }
    else if (type instanceof UnknownType) {
      UnknownType uType = (UnknownType) type;
      RefExpr refExpr = uType.getRefExpr();
      if (refExpr != null) {
        ParameterAnn pAnn = (ParameterAnn) refExpr.getAnn(ParameterAnn.class);
        List<Type2> types = uType.getType();
        if (pAnn != null && types.size() == 0) {
          types.addAll(pAnn.getParameters());
        }
        boolean isMem = uType.getIsMem();
        List<Type2> newTypes = exprChecker().instantiateTypes(types);
        result = factory().createUnknownType(refExpr, isMem, newTypes);
      }
      else {
        result = uType;
      }

    }
    return result;
  }

  protected Signature instantiate(Signature signature)
  {
    List<NameTypePair> pairs = signature.getNameTypePair();
    List<NameTypePair> newPairs = exprChecker().instantiatePairs(pairs);
    Signature result = factory().createSignature(newPairs);
    return result;
  }

  protected List<NameTypePair> instantiatePairs(List<NameTypePair> pairs)
  {
    List<NameTypePair> newPairs = list();
    for (NameTypePair pair : pairs) {
      Type replaced = exprChecker().instantiate(pair.getType());
      NameTypePair newPair = factory().createNameTypePair(pair.getName(),
                                                          replaced);
      newPairs.add(newPair);
    }
    return newPairs;
  }

  protected List<Type2> instantiateTypes(List<Type2> types)
  {
    List<Type2> newTypes = list();
    for (Type2 type : types) {
      Type2 replaced = exprChecker().instantiate(type);
      newTypes.add(replaced);
    }
    return newTypes;
  }

  protected boolean isPending(GenericType gType)
  {
    List<DeclName> params = typeEnv().getParameters();
    DeclName param = (DeclName) gType.getName().get(0);
    return containsDoubleEquals(params, param);
  }

  //if there are generics in the current type env, return a new
  //GenericType with this Type2 as the type
  protected Type addGenerics(Type2 type)
  {
    Type result = null;
    List<DeclName> params = typeEnv().getParameters();
    if (params.size() > 0) {
      result = factory().createGenericType(params, type, null);
    }
    else {
      result = type;
    }

    return result;
  }

  //add generic types from a list of DeclNames to the TypeEnv
  public void addGenParamTypes(List<DeclName> declNames)
  {
    typeEnv().addParameters(declNames);

    //add each DeclName and its type
    List<String> names = list();
    for (DeclName declName : declNames) {
      //declName.setId("" + id++);

      GenParamType genParamType = factory().createGenParamType(declName);
      PowerType powerType = factory().createPowerType(genParamType);

      //check if a generic parameter type is redeclared
      if (names.contains(declName.getWord())) {
        Object [] params = {declName};
        error(declName, ErrorMessage.REDECLARED_GEN, params);
      }
      else {
        names.add(declName.getWord());
      }

      //add the name and type to the TypeEnv
      typeEnv().add(declName, powerType);
    }
  }

  //gets the type of the expression represented by a name
  protected Type getType(RefName name)
  {
    //get the type from the TypeEnv
    Type type = typeEnv().getType(name);

    //if the type environment did not know of this expression.
    //then ask the pending env
    if (type instanceof UnknownType) {
      type = pending().getType(name);
    }

    //if the pending environment did not know of this expression,
    //then ask the SectTypeEnv
    if (type instanceof UnknownType) {
      Type sectTypeEnvType = sectTypeEnv().getType(name);
      if (!instanceOf(sectTypeEnvType, UnknownType.class)) {
        //type = (Type) factory().cloneTerm(sectTypeEnvType);
        type = sectTypeEnvType;
      }
      else {
        UnknownType uType = (UnknownType) sectTypeEnvType;
        RefExpr refExpr = uType.getRefExpr();
        if (refExpr != null && !name.equals(refExpr.getRefName())) {
          type = resolveUnknownType(uType);
        }
      }
    }

    //if not in any of the environments, return a variable type with the
    //specified name
    if (type instanceof UnknownType &&
        unknownType(type).getRefExpr() == null) {
      //add an UndeclaredAnn
      UndeclaredAnn ann = new UndeclaredAnn();
      name.getAnns().add(ann);
    }
    else {
      //remove an UndeclaredAnn if there is one
      removeAnn(name, UndeclaredAnn.class);
    }
    return type;
  }

  protected Type2 resolveUnknownType(Type2 type)
  {
    Type2 result = type;
    if (sectTypeEnv().getSecondTime() && type instanceof UnknownType) {
      UnknownType uType = (UnknownType) type;
      RefExpr refExpr = uType.getRefExpr();
      if (refExpr != null) {
        RefName refName = refExpr.getRefName();
        Type refType = getType(refName);
        if (refType instanceof GenericType) {
          List<DeclName> names = genericType(refType).getName();
          List<Type2> types = uType.getType();
          if (names.size() == types.size()) {
            unificationEnv().enterScope();
            for (int i = 0; i < names.size(); i++) {
              unificationEnv().addGenName(names.get(i), types.get(i));
            }
            Type newType = exprChecker().instantiate(refType);
            refType = newType;
            unificationEnv().exitScope();
          }
          else {
            refType = type;
          }
        }

        if (uType.getIsMem() && unwrapType(refType) instanceof PowerType) {
          result = powerType(unwrapType(refType)).getType();
        }
        else if (!uType.getIsMem()) {
          result = unwrapType(refType);
        }
      }
    }
    return result;
  }

  //get a name/type pair corresponding with a particular name
  //return null if this name is not in the signature
  protected NameTypePair findNameTypePair(DeclName declName,
                                          Signature signature)
  {
    List<NameTypePair> pairs = signature.getNameTypePair();
    NameTypePair result = findNameTypePair(declName, pairs);
    return result;
  }

  protected NameTypePair findNameTypePair(RefName refName,
                                          Signature signature)
  {
    DeclName declName = factory().createDeclName(refName);
    return findNameTypePair(declName, signature);
  }

  protected NameNamePair findNameNamePair(DeclName declName,
                                          List<NameNamePair> pairs)
  {
    RefName refName = factory().createRefName(declName);
    return findNameNamePair(refName, pairs);
  }

  protected NameNamePair findNameNamePair(RefName refName,
                                          List<NameNamePair> pairs)
  {
    NameNamePair result = null;
    for (NameNamePair pair : pairs) {
      if (pair.getOldName().equals(refName)) {
        result = pair;
        break;
      }
    }
    return result;
  }

  protected NameTypePair findNameTypePair(DeclName declName,
                                          List<NameTypePair> pairs)
  {
    NameTypePair result = null;
    for (NameTypePair pair : pairs) {
      if (pair.getName().equals(declName)) {
        result = pair;
        break;
      }
    }
    return result;
  }

  protected NameTypePair findNameTypePair(RefName refName,
                                          List<NameTypePair> pairs)
  {
    DeclName declName = factory().createDeclName(refName);
    return findNameTypePair(declName, pairs);
  }

  protected void removeTypeAnns(Term term)
  {
    //remove the type annotation
    if (term instanceof TermA) {
      TermA termA = (TermA) term;
      Object ann = termA.getAnn(TypeAnn.class);
      if (ann != null) {
        removeAnn(termA, ann);
      }
    }

    //do the same for the children
    Object [] children = term.getChildren();
    for (int i = 0; i < children.length; i++) {
      Object next = children[i];
      if (next != null && next instanceof Term) {
        removeTypeAnns((Term) next);
      }
    }
  }

  protected void removeErrorAnns(Term term)
  {
    //remove the type annotation
    if (term instanceof TermA) {
      TermA termA = (TermA) term;
      Object ann = termA.getAnn(ErrorAnn.class);
      while (ann != null) {
        removeAnn(termA, ann);
        ann = termA.getAnn(ErrorAnn.class);
      }
    }
  }

  protected void removeErrorAndTypeAnns(Term term)
  {
    //remove the type annotation
    if (term instanceof TermA) {
      TermA termA = (TermA) term;
      Object ann = termA.getAnn(TypeAnn.class);
      if (ann != null) {
        removeAnn(termA, ann);
      }
      ann = termA.getAnn(ErrorAnn.class);
      while (ann != null) {
        removeAnn(termA, ann);
        ann = termA.getAnn(ErrorAnn.class);
      }
    }

    //do the same for the children
    Object [] children = term.getChildren();
    for (int i = 0; i < children.length; i++) {
      Object next = children[i];
      if (next != null && next instanceof Term) {
        removeErrorAndTypeAnns((Term) next);
      }
    }
  }

  //print debuging info
  protected boolean debug()
  {
    return typeChecker_.debug_;
  }

  protected void setDebug(boolean b)
  {
    typeChecker_.debug_ = b;
  }

  protected void debug(String message)
  {
    if (debug()) {
      System.err.println(message);
    }
  }
}
