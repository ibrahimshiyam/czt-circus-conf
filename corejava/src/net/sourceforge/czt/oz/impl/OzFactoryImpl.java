
/*
THIS FILE WAS GENERATED BY GNAST.
ANY MODIFICATIONS TO THIS FILE WILL BE LOST UPON REGENERATION.

************************************************************

Copyright 2003 Mark Utting
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

package net.sourceforge.czt.oz.impl;

import net.sourceforge.czt.z.ast.*;
import net.sourceforge.czt.oz.ast.*;

/**
 * <p>An implementation of the object factory for constructing
 * concrete Z terms.  Each factory method returns an instance
 * of the corresponding class provided in this package.</p>
 *
 * @author Gnast version 0.1
 */
public class OzFactoryImpl
  implements net.sourceforge.czt.oz.ast.OzFactory
{
  public RenameList createRenameList()
  {
    RenameList zedObject = new RenameListImpl();
    return zedObject;
  }

  public RenameList createRenameList(net.sourceforge.czt.z.ast.RenameExpr renameExpr)
  {
    RenameList zedObject = createRenameList();
    zedObject.setRenameExpr(renameExpr);
    return zedObject;
  }

  public ActualParameters createActualParameters()
  {
    ActualParameters zedObject = new ActualParametersImpl();
    return zedObject;
  }

  public ActualParameters createActualParameters(java.util.List expr)
  {
    ActualParameters zedObject = createActualParameters();
    zedObject.getExpr().addAll(expr);
    return zedObject;
  }

  public DistConjOpExpr createDistConjOpExpr()
  {
    DistConjOpExpr zedObject = new DistConjOpExprImpl();
    return zedObject;
  }

  public DistConjOpExpr createDistConjOpExpr(MainOpExpr mainOpExpr)
  {
    DistConjOpExpr zedObject = createDistConjOpExpr();
    zedObject.setMainOpExpr(mainOpExpr);
    return zedObject;
  }

  public BasicOpExpr createBasicOpExpr()
  {
    BasicOpExpr zedObject = new BasicOpExprImpl();
    return zedObject;
  }

  public BasicOpExpr createBasicOpExpr(StringListType deltaList, net.sourceforge.czt.z.ast.SchText schText)
  {
    BasicOpExpr zedObject = createBasicOpExpr();
    zedObject.setDeltaList(deltaList);
    zedObject.setSchText(schText);
    return zedObject;
  }

  public MainOpExpr createMainOpExpr()
  {
    MainOpExpr zedObject = new MainOpExprImpl();
    return zedObject;
  }

  public MainOpExpr createMainOpExpr(net.sourceforge.czt.z.ast.SchText schText, OperationExpr operationExpr)
  {
    MainOpExpr zedObject = createMainOpExpr();
    zedObject.setSchText(schText);
    zedObject.setOperationExpr(operationExpr);
    return zedObject;
  }

  public HideOpExpr createHideOpExpr()
  {
    HideOpExpr zedObject = new HideOpExprImpl();
    return zedObject;
  }

  public HideOpExpr createHideOpExpr(OperationExpr operationExpr, java.util.List hideName)
  {
    HideOpExpr zedObject = createHideOpExpr();
    zedObject.setOperationExpr(operationExpr);
    zedObject.getHideName().addAll(hideName);
    return zedObject;
  }

  public StringListType createStringListType()
  {
    StringListType zedObject = new StringListTypeImpl();
    return zedObject;
  }

  public StringListType createStringListType(java.util.List name)
  {
    StringListType zedObject = createStringListType();
    zedObject.getName().addAll(name);
    return zedObject;
  }

  public SeqOpExpr createSeqOpExpr()
  {
    SeqOpExpr zedObject = new SeqOpExprImpl();
    return zedObject;
  }

  public SeqOpExpr createSeqOpExpr(OperationExpr leftOperationExpr, OperationExpr rightOperationExpr)
  {
    SeqOpExpr zedObject = createSeqOpExpr();
    zedObject.setLeftOperationExpr(leftOperationExpr);
    zedObject.setRightOperationExpr(rightOperationExpr);
    return zedObject;
  }

  public InheritedClass createInheritedClass()
  {
    InheritedClass zedObject = new InheritedClassImpl();
    return zedObject;
  }

  public InheritedClass createInheritedClass(net.sourceforge.czt.z.ast.RefName name, ActualParameters actualParameters, RenameList renameList)
  {
    InheritedClass zedObject = createInheritedClass();
    zedObject.setName(name);
    zedObject.setActualParameters(actualParameters);
    zedObject.setRenameList(renameList);
    return zedObject;
  }

  public DistChoiceOpExpr createDistChoiceOpExpr()
  {
    DistChoiceOpExpr zedObject = new DistChoiceOpExprImpl();
    return zedObject;
  }

  public DistChoiceOpExpr createDistChoiceOpExpr(MainOpExpr mainOpExpr)
  {
    DistChoiceOpExpr zedObject = createDistChoiceOpExpr();
    zedObject.setMainOpExpr(mainOpExpr);
    return zedObject;
  }

  public AssoParallelOpExpr createAssoParallelOpExpr()
  {
    AssoParallelOpExpr zedObject = new AssoParallelOpExprImpl();
    return zedObject;
  }

  public AssoParallelOpExpr createAssoParallelOpExpr(OperationExpr leftOperationExpr, OperationExpr rightOperationExpr)
  {
    AssoParallelOpExpr zedObject = createAssoParallelOpExpr();
    zedObject.setLeftOperationExpr(leftOperationExpr);
    zedObject.setRightOperationExpr(rightOperationExpr);
    return zedObject;
  }

  public State createState()
  {
    State zedObject = new StateImpl();
    return zedObject;
  }

  public State createState(java.util.List decl, java.util.List secondaryAttributes, java.util.List pred)
  {
    State zedObject = createState();
    zedObject.getDecl().addAll(decl);
    zedObject.getSecondaryAttributes().addAll(secondaryAttributes);
    zedObject.getPred().addAll(pred);
    return zedObject;
  }

  public ConjOpExpr createConjOpExpr()
  {
    ConjOpExpr zedObject = new ConjOpExprImpl();
    return zedObject;
  }

  public ConjOpExpr createConjOpExpr(OperationExpr leftOperationExpr, OperationExpr rightOperationExpr)
  {
    ConjOpExpr zedObject = createConjOpExpr();
    zedObject.setLeftOperationExpr(leftOperationExpr);
    zedObject.setRightOperationExpr(rightOperationExpr);
    return zedObject;
  }

  public OpPromotionExpr createOpPromotionExpr()
  {
    OpPromotionExpr zedObject = new OpPromotionExprImpl();
    return zedObject;
  }

  public OpPromotionExpr createOpPromotionExpr(net.sourceforge.czt.z.ast.Expr expr, net.sourceforge.czt.z.ast.RefName opName)
  {
    OpPromotionExpr zedObject = createOpPromotionExpr();
    zedObject.setExpr(expr);
    zedObject.setOpName(opName);
    return zedObject;
  }

  public ClassPara createClassPara()
  {
    ClassPara zedObject = new ClassParaImpl();
    return zedObject;
  }

  public ClassPara createClassPara(net.sourceforge.czt.z.ast.DeclName name, FormalParameters formalParameters, StringListType visibilityList, java.util.List inheritedClass, LocalDef localDef, State state, InitialState initialState, java.util.List operation)
  {
    ClassPara zedObject = createClassPara();
    zedObject.setName(name);
    zedObject.setFormalParameters(formalParameters);
    zedObject.setVisibilityList(visibilityList);
    zedObject.getInheritedClass().addAll(inheritedClass);
    zedObject.setLocalDef(localDef);
    zedObject.setState(state);
    zedObject.setInitialState(initialState);
    zedObject.getOperation().addAll(operation);
    return zedObject;
  }

  public ParenOpExpr createParenOpExpr()
  {
    ParenOpExpr zedObject = new ParenOpExprImpl();
    return zedObject;
  }

  public Operation createOperation()
  {
    Operation zedObject = new OperationImpl();
    return zedObject;
  }

  public Operation createOperation(net.sourceforge.czt.z.ast.DeclName name, net.sourceforge.czt.base.ast.TermA operandBoxOrExpr)
  {
    Operation zedObject = createOperation();
    zedObject.setName(name);
    zedObject.setOperandBoxOrExpr(operandBoxOrExpr);
    return zedObject;
  }

  public LocalDef createLocalDef()
  {
    LocalDef zedObject = new LocalDefImpl();
    return zedObject;
  }

  public LocalDef createLocalDef(java.util.List givenPara, java.util.List axPara, java.util.List freePara)
  {
    LocalDef zedObject = createLocalDef();
    zedObject.getGivenPara().addAll(givenPara);
    zedObject.getAxPara().addAll(axPara);
    zedObject.getFreePara().addAll(freePara);
    return zedObject;
  }

  public OperationBox createOperationBox()
  {
    OperationBox zedObject = new OperationBoxImpl();
    return zedObject;
  }

  public OperationBox createOperationBox(StringListType deltaList, java.util.List decl, java.util.List pred)
  {
    OperationBox zedObject = createOperationBox();
    zedObject.setDeltaList(deltaList);
    zedObject.getDecl().addAll(decl);
    zedObject.getPred().addAll(pred);
    return zedObject;
  }

  public InitialState createInitialState()
  {
    InitialState zedObject = new InitialStateImpl();
    return zedObject;
  }

  public InitialState createInitialState(java.util.List pred)
  {
    InitialState zedObject = createInitialState();
    zedObject.getPred().addAll(pred);
    return zedObject;
  }

  public DistSeqOpExpr createDistSeqOpExpr()
  {
    DistSeqOpExpr zedObject = new DistSeqOpExprImpl();
    return zedObject;
  }

  public DistSeqOpExpr createDistSeqOpExpr(MainOpExpr mainOpExpr)
  {
    DistSeqOpExpr zedObject = createDistSeqOpExpr();
    zedObject.setMainOpExpr(mainOpExpr);
    return zedObject;
  }

  public ScopeEnrichOpExpr createScopeEnrichOpExpr()
  {
    ScopeEnrichOpExpr zedObject = new ScopeEnrichOpExprImpl();
    return zedObject;
  }

  public ScopeEnrichOpExpr createScopeEnrichOpExpr(OperationExpr leftOperationExpr, OperationExpr rightOperationExpr)
  {
    ScopeEnrichOpExpr zedObject = createScopeEnrichOpExpr();
    zedObject.setLeftOperationExpr(leftOperationExpr);
    zedObject.setRightOperationExpr(rightOperationExpr);
    return zedObject;
  }

  public SecondaryAttributes createSecondaryAttributes()
  {
    SecondaryAttributes zedObject = new SecondaryAttributesImpl();
    return zedObject;
  }

  public ExChoiceOpExpr createExChoiceOpExpr()
  {
    ExChoiceOpExpr zedObject = new ExChoiceOpExprImpl();
    return zedObject;
  }

  public ExChoiceOpExpr createExChoiceOpExpr(OperationExpr leftOperationExpr, OperationExpr rightOperationExpr)
  {
    ExChoiceOpExpr zedObject = createExChoiceOpExpr();
    zedObject.setLeftOperationExpr(leftOperationExpr);
    zedObject.setRightOperationExpr(rightOperationExpr);
    return zedObject;
  }

  public RenameOpExpr createRenameOpExpr()
  {
    RenameOpExpr zedObject = new RenameOpExprImpl();
    return zedObject;
  }

  public RenameOpExpr createRenameOpExpr(OperationExpr operationExpr, RenameList renameList)
  {
    RenameOpExpr zedObject = createRenameOpExpr();
    zedObject.setOperationExpr(operationExpr);
    zedObject.setRenameList(renameList);
    return zedObject;
  }

  public ParallelOpExpr createParallelOpExpr()
  {
    ParallelOpExpr zedObject = new ParallelOpExprImpl();
    return zedObject;
  }

  public ParallelOpExpr createParallelOpExpr(OperationExpr leftOperationExpr, OperationExpr rightOperationExpr)
  {
    ParallelOpExpr zedObject = createParallelOpExpr();
    zedObject.setLeftOperationExpr(leftOperationExpr);
    zedObject.setRightOperationExpr(rightOperationExpr);
    return zedObject;
  }

  public FormalParameters createFormalParameters()
  {
    FormalParameters zedObject = new FormalParametersImpl();
    return zedObject;
  }

  public FormalParameters createFormalParameters(java.util.List refName)
  {
    FormalParameters zedObject = createFormalParameters();
    zedObject.getRefName().addAll(refName);
    return zedObject;
  }

}
