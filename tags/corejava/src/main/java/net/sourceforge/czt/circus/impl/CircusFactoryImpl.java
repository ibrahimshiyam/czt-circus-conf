
/******************************************************************************
DO NOT EDIT THIS FILE!  THIS FILE WAS GENERATED BY GNAST
FROM THE TEMPLATE FILE CoreFactoryImpl.vm.
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

import net.sourceforge.czt.base.util.VisitorImpl;

import net.sourceforge.czt.z.ast.*;
import net.sourceforge.czt.circus.ast.*;
import net.sourceforge.czt.circus.util.PrintVisitor;

/**
 * <p>An implementation of the object factory for constructing
 * concrete Z terms.  Each factory method returns an instance
 * of the corresponding class provided in this package.</p>
 *
 * @author Gnast version 0.1
 */
public class CircusFactoryImpl
  extends net.sourceforge.czt.z.impl.ZFactoryImpl
  implements net.sourceforge.czt.circus.ast.CircusFactory
{
  protected CircusFactoryImpl(VisitorImpl<String> toStringVisitor)
  {
    super(toStringVisitor);
  }

  public CircusFactoryImpl()
  {
    super(new PrintVisitor());
  }

  public ChannelSetType createChannelSetType()
  {
    ChannelSetType zedObject = new ChannelSetTypeImpl(this);
    return zedObject;
  }

  public ChannelSetType createChannelSetType( net.sourceforge.czt.z.ast.Signature  signature)
  {
    ChannelSetType zedObject = createChannelSetType();
    zedObject.setSignature(signature);
    return zedObject;
  }

  public GuardedAction createGuardedAction()
  {
    GuardedAction zedObject = new GuardedActionImpl(this);
    return zedObject;
  }

  public GuardedAction createGuardedAction( CircusAction  circusAction, net.sourceforge.czt.z.ast.Pred  pred)
  {
    GuardedAction zedObject = createGuardedAction();
    zedObject.setCircusAction(circusAction);
    zedObject.setPred(pred);
    return zedObject;
  }

  public ParallelAction createParallelAction()
  {
    ParallelAction zedObject = new ParallelActionImpl(this);
    return zedObject;
  }

  public ParallelAction createParallelAction( CircusAction  leftAction, CircusAction  rightAction, NameSet  leftNameSet, NameSet  rightNameSet, ChannelSet  channelSet)
  {
    ParallelAction zedObject = createParallelAction();
    zedObject.setLeftAction(leftAction);
    zedObject.setRightAction(rightAction);
    zedObject.setLeftNameSet(leftNameSet);
    zedObject.setRightNameSet(rightNameSet);
    zedObject.setChannelSet(channelSet);
    return zedObject;
  }

  public ChannelDecl createChannelDecl()
  {
    ChannelDecl zedObject = new ChannelDeclImpl(this);
    return zedObject;
  }

  public ChannelDecl createChannelDecl( net.sourceforge.czt.z.ast.DeclNameList  genFormals, net.sourceforge.czt.z.ast.DeclNameList  declNameList, net.sourceforge.czt.z.ast.Expr  expr)
  {
    ChannelDecl zedObject = createChannelDecl();
    zedObject.setGenFormals(genFormals);
    zedObject.setDeclNameList(declNameList);
    zedObject.setExpr(expr);
    return zedObject;
  }

  public HideAction createHideAction()
  {
    HideAction zedObject = new HideActionImpl(this);
    return zedObject;
  }

  public HideAction createHideAction( CircusAction  circusAction, ChannelSet  channelSet)
  {
    HideAction zedObject = createHideAction();
    zedObject.setCircusAction(circusAction);
    zedObject.setChannelSet(channelSet);
    return zedObject;
  }

  public ExtChoiceProcessIte createExtChoiceProcessIte()
  {
    ExtChoiceProcessIte zedObject = new ExtChoiceProcessIteImpl(this);
    return zedObject;
  }

  public ExtChoiceProcessIte createExtChoiceProcessIte( CircusProcess  circusProcess, net.sourceforge.czt.z.ast.DeclList  declList)
  {
    ExtChoiceProcessIte zedObject = createExtChoiceProcessIte();
    zedObject.setCircusProcess(circusProcess);
    zedObject.setDeclList(declList);
    return zedObject;
  }

  public ChaosAction createChaosAction()
  {
    ChaosAction zedObject = new ChaosActionImpl(this);
    return zedObject;
  }

  public CircusFieldList createCircusFieldList()
  {
    CircusFieldList zedObject = new CircusFieldListImpl(this);
    return zedObject;
  }

  public CircusFieldList createCircusFieldList(java.util.List<? extends Field>
 field)
  {
    CircusFieldList zedObject = createCircusFieldList();
    if (field != null) {
      zedObject.getField().addAll(field);
    }
    return zedObject;
  }

  public CircusStateAnn createCircusStateAnn()
  {
    CircusStateAnn zedObject = new CircusStateAnnImpl(this);
    return zedObject;
  }

  public IntChoiceProcessIte createIntChoiceProcessIte()
  {
    IntChoiceProcessIte zedObject = new IntChoiceProcessIteImpl(this);
    return zedObject;
  }

  public IntChoiceProcessIte createIntChoiceProcessIte( CircusProcess  circusProcess, net.sourceforge.czt.z.ast.DeclList  declList)
  {
    IntChoiceProcessIte zedObject = createIntChoiceProcessIte();
    zedObject.setCircusProcess(circusProcess);
    zedObject.setDeclList(declList);
    return zedObject;
  }

  public AlphabetisedParallelAction createAlphabetisedParallelAction()
  {
    AlphabetisedParallelAction zedObject = new AlphabetisedParallelActionImpl(this);
    return zedObject;
  }

  public AlphabetisedParallelAction createAlphabetisedParallelAction( CircusAction  leftAction, CircusAction  rightAction, NameSet  leftNameSet, NameSet  rightNameSet, ChannelSet  leftAlpha, ChannelSet  rightAlpha)
  {
    AlphabetisedParallelAction zedObject = createAlphabetisedParallelAction();
    zedObject.setLeftAction(leftAction);
    zedObject.setRightAction(rightAction);
    zedObject.setLeftNameSet(leftNameSet);
    zedObject.setRightNameSet(rightNameSet);
    zedObject.setLeftAlpha(leftAlpha);
    zedObject.setRightAlpha(rightAlpha);
    return zedObject;
  }

  public SkipAction createSkipAction()
  {
    SkipAction zedObject = new SkipActionImpl(this);
    return zedObject;
  }

  public ProcessType createProcessType()
  {
    ProcessType zedObject = new ProcessTypeImpl(this);
    return zedObject;
  }

  public ProcessType createProcessType( ProcessSignature  processSignature)
  {
    ProcessType zedObject = createProcessType();
    zedObject.setProcessSignature(processSignature);
    return zedObject;
  }

  public SeqProcessIdx createSeqProcessIdx()
  {
    SeqProcessIdx zedObject = new SeqProcessIdxImpl(this);
    return zedObject;
  }

  public SeqProcessIdx createSeqProcessIdx( CircusProcess  circusProcess, net.sourceforge.czt.z.ast.DeclList  declList)
  {
    SeqProcessIdx zedObject = createSeqProcessIdx();
    zedObject.setCircusProcess(circusProcess);
    zedObject.setDeclList(declList);
    return zedObject;
  }

  public ExtChoiceActionIte createExtChoiceActionIte()
  {
    ExtChoiceActionIte zedObject = new ExtChoiceActionIteImpl(this);
    return zedObject;
  }

  public ExtChoiceActionIte createExtChoiceActionIte( CircusAction  circusAction, net.sourceforge.czt.z.ast.DeclList  declList)
  {
    ExtChoiceActionIte zedObject = createExtChoiceActionIte();
    zedObject.setCircusAction(circusAction);
    zedObject.setDeclList(declList);
    return zedObject;
  }

  public QualifiedDecl createQualifiedDecl()
  {
    QualifiedDecl zedObject = new QualifiedDeclImpl(this);
    return zedObject;
  }

  public QualifiedDecl createQualifiedDecl( net.sourceforge.czt.z.ast.DeclNameList  declNameList, net.sourceforge.czt.z.ast.Expr  expr, ParamQualifier  paramQualifier)
  {
    QualifiedDecl zedObject = createQualifiedDecl();
    zedObject.setDeclNameList(declNameList);
    zedObject.setExpr(expr);
    zedObject.setParamQualifier(paramQualifier);
    return zedObject;
  }

  public AssignmentPairs createAssignmentPairs()
  {
    AssignmentPairs zedObject = new AssignmentPairsImpl(this);
    return zedObject;
  }

  public AssignmentPairs createAssignmentPairs( net.sourceforge.czt.z.ast.RefNameList  lHS, net.sourceforge.czt.z.ast.ExprList  rHS)
  {
    AssignmentPairs zedObject = createAssignmentPairs();
    zedObject.setLHS(lHS);
    zedObject.setRHS(rHS);
    return zedObject;
  }

  public IndexedProcess createIndexedProcess()
  {
    IndexedProcess zedObject = new IndexedProcessImpl(this);
    return zedObject;
  }

  public IndexedProcess createIndexedProcess( CircusProcess  circusProcess, net.sourceforge.czt.z.ast.DeclList  declList)
  {
    IndexedProcess zedObject = createIndexedProcess();
    zedObject.setCircusProcess(circusProcess);
    zedObject.setDeclList(declList);
    return zedObject;
  }

  public LetMuAction createLetMuAction()
  {
    LetMuAction zedObject = new LetMuActionImpl(this);
    return zedObject;
  }

  public LetMuAction createLetMuAction( CircusAction  circusAction, net.sourceforge.czt.z.ast.ParaList  paraList)
  {
    LetMuAction zedObject = createLetMuAction();
    zedObject.setCircusAction(circusAction);
    zedObject.setParaList(paraList);
    return zedObject;
  }

  public ChannelType createChannelType()
  {
    ChannelType zedObject = new ChannelTypeImpl(this);
    return zedObject;
  }

  public ChannelType createChannelType( net.sourceforge.czt.z.ast.DeclNameList  genFormals, net.sourceforge.czt.z.ast.Type2  declaredType, net.sourceforge.czt.z.ast.Type2  resolvedType)
  {
    ChannelType zedObject = createChannelType();
    zedObject.setGenFormals(genFormals);
    zedObject.setDeclaredType(declaredType);
    zedObject.setResolvedType(resolvedType);
    return zedObject;
  }

  public InterleaveAction createInterleaveAction()
  {
    InterleaveAction zedObject = new InterleaveActionImpl(this);
    return zedObject;
  }

  public InterleaveAction createInterleaveAction( CircusAction  leftAction, CircusAction  rightAction, NameSet  leftNameSet, NameSet  rightNameSet)
  {
    InterleaveAction zedObject = createInterleaveAction();
    zedObject.setLeftAction(leftAction);
    zedObject.setRightAction(rightAction);
    zedObject.setLeftNameSet(leftNameSet);
    zedObject.setRightNameSet(rightNameSet);
    return zedObject;
  }

  public IntChoiceProcess createIntChoiceProcess()
  {
    IntChoiceProcess zedObject = new IntChoiceProcessImpl(this);
    return zedObject;
  }

  public IntChoiceProcess createIntChoiceProcess( CircusProcess  leftProc, CircusProcess  rightProc)
  {
    IntChoiceProcess zedObject = createIntChoiceProcess();
    zedObject.setLeftProc(leftProc);
    zedObject.setRightProc(rightProc);
    return zedObject;
  }

  public SchExprAction createSchExprAction()
  {
    SchExprAction zedObject = new SchExprActionImpl(this);
    return zedObject;
  }

  public SchExprAction createSchExprAction( net.sourceforge.czt.z.ast.Expr  expr)
  {
    SchExprAction zedObject = createSchExprAction();
    zedObject.setExpr(expr);
    return zedObject;
  }

  public IfGuardedCommand createIfGuardedCommand()
  {
    IfGuardedCommand zedObject = new IfGuardedCommandImpl(this);
    return zedObject;
  }

  public IfGuardedCommand createIfGuardedCommand(java.util.List<? extends GuardedAction>
 guardedAction)
  {
    IfGuardedCommand zedObject = createIfGuardedCommand();
    if (guardedAction != null) {
      zedObject.getGuardedAction().addAll(guardedAction);
    }
    return zedObject;
  }

  public ParallelProcessIte createParallelProcessIte()
  {
    ParallelProcessIte zedObject = new ParallelProcessIteImpl(this);
    return zedObject;
  }

  public ParallelProcessIte createParallelProcessIte( CircusProcess  circusProcess, net.sourceforge.czt.z.ast.DeclList  declList, ChannelSet  channelSet)
  {
    ParallelProcessIte zedObject = createParallelProcessIte();
    zedObject.setCircusProcess(circusProcess);
    zedObject.setDeclList(declList);
    zedObject.setChannelSet(channelSet);
    return zedObject;
  }

  public ExtChoiceProcess createExtChoiceProcess()
  {
    ExtChoiceProcess zedObject = new ExtChoiceProcessImpl(this);
    return zedObject;
  }

  public ExtChoiceProcess createExtChoiceProcess( CircusProcess  leftProc, CircusProcess  rightProc)
  {
    ExtChoiceProcess zedObject = createExtChoiceProcess();
    zedObject.setLeftProc(leftProc);
    zedObject.setRightProc(rightProc);
    return zedObject;
  }

  public StopAction createStopAction()
  {
    StopAction zedObject = new StopActionImpl(this);
    return zedObject;
  }

  public ExtChoiceAction createExtChoiceAction()
  {
    ExtChoiceAction zedObject = new ExtChoiceActionImpl(this);
    return zedObject;
  }

  public ExtChoiceAction createExtChoiceAction( CircusAction  leftAction, CircusAction  rightAction)
  {
    ExtChoiceAction zedObject = createExtChoiceAction();
    zedObject.setLeftAction(leftAction);
    zedObject.setRightAction(rightAction);
    return zedObject;
  }

  public InterleaveProcessIdx createInterleaveProcessIdx()
  {
    InterleaveProcessIdx zedObject = new InterleaveProcessIdxImpl(this);
    return zedObject;
  }

  public InterleaveProcessIdx createInterleaveProcessIdx( CircusProcess  circusProcess, net.sourceforge.czt.z.ast.DeclList  declList)
  {
    InterleaveProcessIdx zedObject = createInterleaveProcessIdx();
    zedObject.setCircusProcess(circusProcess);
    zedObject.setDeclList(declList);
    return zedObject;
  }

  public AlphabetisedParallelProcessIte createAlphabetisedParallelProcessIte()
  {
    AlphabetisedParallelProcessIte zedObject = new AlphabetisedParallelProcessIteImpl(this);
    return zedObject;
  }

  public AlphabetisedParallelProcessIte createAlphabetisedParallelProcessIte( CircusProcess  circusProcess, net.sourceforge.czt.z.ast.DeclList  declList, ChannelSet  channelSet)
  {
    AlphabetisedParallelProcessIte zedObject = createAlphabetisedParallelProcessIte();
    zedObject.setCircusProcess(circusProcess);
    zedObject.setDeclList(declList);
    zedObject.setChannelSet(channelSet);
    return zedObject;
  }

  public AlphabetisedParallelProcessIdx createAlphabetisedParallelProcessIdx()
  {
    AlphabetisedParallelProcessIdx zedObject = new AlphabetisedParallelProcessIdxImpl(this);
    return zedObject;
  }

  public AlphabetisedParallelProcessIdx createAlphabetisedParallelProcessIdx( CircusProcess  circusProcess, net.sourceforge.czt.z.ast.DeclList  declList, ChannelSet  channelSet)
  {
    AlphabetisedParallelProcessIdx zedObject = createAlphabetisedParallelProcessIdx();
    zedObject.setCircusProcess(circusProcess);
    zedObject.setDeclList(declList);
    zedObject.setChannelSet(channelSet);
    return zedObject;
  }

  public PrefixingAction createPrefixingAction()
  {
    PrefixingAction zedObject = new PrefixingActionImpl(this);
    return zedObject;
  }

  public PrefixingAction createPrefixingAction( CircusAction  circusAction, Communication  communication)
  {
    PrefixingAction zedObject = createPrefixingAction();
    zedObject.setCircusAction(circusAction);
    zedObject.setCommunication(communication);
    return zedObject;
  }

  public NameSetType createNameSetType()
  {
    NameSetType zedObject = new NameSetTypeImpl(this);
    return zedObject;
  }

  public NameSetType createNameSetType( net.sourceforge.czt.z.ast.Signature  signature)
  {
    NameSetType zedObject = createNameSetType();
    zedObject.setSignature(signature);
    return zedObject;
  }

  public OnTheFlyDefAnn createOnTheFlyDefAnn()
  {
    OnTheFlyDefAnn zedObject = new OnTheFlyDefAnnImpl(this);
    return zedObject;
  }

  public ChannelSet createChannelSet()
  {
    ChannelSet zedObject = new ChannelSetImpl(this);
    return zedObject;
  }

  public ChannelSet createChannelSet( net.sourceforge.czt.z.ast.Expr  expr)
  {
    ChannelSet zedObject = createChannelSet();
    zedObject.setExpr(expr);
    return zedObject;
  }

  public AssignmentCommand createAssignmentCommand()
  {
    AssignmentCommand zedObject = new AssignmentCommandImpl(this);
    return zedObject;
  }

  public AssignmentCommand createAssignmentCommand( AssignmentPairs  assignmentPairs)
  {
    AssignmentCommand zedObject = createAssignmentCommand();
    zedObject.setAssignmentPairs(assignmentPairs);
    return zedObject;
  }

  public SeqProcessIte createSeqProcessIte()
  {
    SeqProcessIte zedObject = new SeqProcessIteImpl(this);
    return zedObject;
  }

  public SeqProcessIte createSeqProcessIte( CircusProcess  circusProcess, net.sourceforge.czt.z.ast.DeclList  declList)
  {
    SeqProcessIte zedObject = createSeqProcessIte();
    zedObject.setCircusProcess(circusProcess);
    zedObject.setDeclList(declList);
    return zedObject;
  }

  public IntChoiceProcessIdx createIntChoiceProcessIdx()
  {
    IntChoiceProcessIdx zedObject = new IntChoiceProcessIdxImpl(this);
    return zedObject;
  }

  public IntChoiceProcessIdx createIntChoiceProcessIdx( CircusProcess  circusProcess, net.sourceforge.czt.z.ast.DeclList  declList)
  {
    IntChoiceProcessIdx zedObject = createIntChoiceProcessIdx();
    zedObject.setCircusProcess(circusProcess);
    zedObject.setDeclList(declList);
    return zedObject;
  }

  public BasicProcessSignature createBasicProcessSignature()
  {
    BasicProcessSignature zedObject = new BasicProcessSignatureImpl(this);
    return zedObject;
  }

  public BasicProcessSignature createBasicProcessSignature( net.sourceforge.czt.z.ast.DeclName  processName, net.sourceforge.czt.z.ast.DeclNameList  genFormals, net.sourceforge.czt.z.ast.Signature  paramOrIndexes, ProcessKind  kind, net.sourceforge.czt.z.ast.SchemaType  stateType,java.util.List<? extends net.sourceforge.czt.z.ast.Signature>
 zSignature,java.util.List<? extends ActionSignature>
 actionSignature, net.sourceforge.czt.z.ast.ZRefNameList  nameSet)
  {
    BasicProcessSignature zedObject = createBasicProcessSignature();
    zedObject.setProcessName(processName);
    zedObject.setGenFormals(genFormals);
    zedObject.setParamOrIndexes(paramOrIndexes);
    zedObject.setKind(kind);
    zedObject.setStateType(stateType);
    if (zSignature != null) {
      zedObject.getZSignature().addAll(zSignature);
    }
    if (actionSignature != null) {
      zedObject.getActionSignature().addAll(actionSignature);
    }
    zedObject.setNameSet(nameSet);
    return zedObject;
  }

  public ParamProcess createParamProcess()
  {
    ParamProcess zedObject = new ParamProcessImpl(this);
    return zedObject;
  }

  public ParamProcess createParamProcess( CircusProcess  circusProcess, net.sourceforge.czt.z.ast.DeclList  declList)
  {
    ParamProcess zedObject = createParamProcess();
    zedObject.setCircusProcess(circusProcess);
    zedObject.setDeclList(declList);
    return zedObject;
  }

  public SigmaExpr createSigmaExpr()
  {
    SigmaExpr zedObject = new SigmaExprImpl(this);
    return zedObject;
  }

  public SigmaExpr createSigmaExpr( net.sourceforge.czt.z.ast.RefExpr  channel, net.sourceforge.czt.z.ast.Expr  value)
  {
    SigmaExpr zedObject = createSigmaExpr();
    zedObject.setChannel(channel);
    zedObject.setValue(value);
    return zedObject;
  }

  public SubstitutionAction createSubstitutionAction()
  {
    SubstitutionAction zedObject = new SubstitutionActionImpl(this);
    return zedObject;
  }

  public SubstitutionAction createSubstitutionAction( CircusAction  circusAction, net.sourceforge.czt.z.ast.RenameList  renameList)
  {
    SubstitutionAction zedObject = createSubstitutionAction();
    zedObject.setCircusAction(circusAction);
    zedObject.setRenameList(renameList);
    return zedObject;
  }

  public SpecStmtCommand createSpecStmtCommand()
  {
    SpecStmtCommand zedObject = new SpecStmtCommandImpl(this);
    return zedObject;
  }

  public SpecStmtCommand createSpecStmtCommand( net.sourceforge.czt.z.ast.RefNameList  frame, net.sourceforge.czt.z.ast.Pred  pre, net.sourceforge.czt.z.ast.Pred  post)
  {
    SpecStmtCommand zedObject = createSpecStmtCommand();
    zedObject.setFrame(frame);
    zedObject.setPre(pre);
    zedObject.setPost(post);
    return zedObject;
  }

  public MuAction createMuAction()
  {
    MuAction zedObject = new MuActionImpl(this);
    return zedObject;
  }

  public MuAction createMuAction( CircusAction  circusAction, net.sourceforge.czt.z.ast.DeclName  declName)
  {
    MuAction zedObject = createMuAction();
    zedObject.setCircusAction(circusAction);
    zedObject.setDeclName(declName);
    return zedObject;
  }

  public ProcessSignature createProcessSignature()
  {
    ProcessSignature zedObject = new ProcessSignatureImpl(this);
    return zedObject;
  }

  public ProcessSignature createProcessSignature( net.sourceforge.czt.z.ast.DeclName  processName, net.sourceforge.czt.z.ast.DeclNameList  genFormals, net.sourceforge.czt.z.ast.Signature  paramOrIndexes, ProcessKind  kind)
  {
    ProcessSignature zedObject = createProcessSignature();
    zedObject.setProcessName(processName);
    zedObject.setGenFormals(genFormals);
    zedObject.setParamOrIndexes(paramOrIndexes);
    zedObject.setKind(kind);
    return zedObject;
  }

  public AlphabetisedParallelProcess createAlphabetisedParallelProcess()
  {
    AlphabetisedParallelProcess zedObject = new AlphabetisedParallelProcessImpl(this);
    return zedObject;
  }

  public AlphabetisedParallelProcess createAlphabetisedParallelProcess( CircusProcess  leftProc, CircusProcess  rightProc, ChannelSet  leftAlpha, ChannelSet  rightAlpha)
  {
    AlphabetisedParallelProcess zedObject = createAlphabetisedParallelProcess();
    zedObject.setLeftProc(leftProc);
    zedObject.setRightProc(rightProc);
    zedObject.setLeftAlpha(leftAlpha);
    zedObject.setRightAlpha(rightAlpha);
    return zedObject;
  }

  public ProcessPara createProcessPara()
  {
    ProcessPara zedObject = new ProcessParaImpl(this);
    return zedObject;
  }

  public ProcessPara createProcessPara( net.sourceforge.czt.z.ast.DeclName  processName, net.sourceforge.czt.z.ast.DeclNameList  genFormals, CircusProcess  circusProcess)
  {
    ProcessPara zedObject = createProcessPara();
    zedObject.setProcessName(processName);
    zedObject.setGenFormals(genFormals);
    zedObject.setCircusProcess(circusProcess);
    return zedObject;
  }

  public SeqAction createSeqAction()
  {
    SeqAction zedObject = new SeqActionImpl(this);
    return zedObject;
  }

  public SeqAction createSeqAction( CircusAction  leftAction, CircusAction  rightAction)
  {
    SeqAction zedObject = createSeqAction();
    zedObject.setLeftAction(leftAction);
    zedObject.setRightAction(rightAction);
    return zedObject;
  }

  public BasicChannelSetExpr createBasicChannelSetExpr()
  {
    BasicChannelSetExpr zedObject = new BasicChannelSetExprImpl(this);
    return zedObject;
  }

  public BasicChannelSetExpr createBasicChannelSetExpr( ExprList  exprList)
  {
    BasicChannelSetExpr zedObject = createBasicChannelSetExpr();
    zedObject.setExprList(exprList);
    return zedObject;
  }

  public SeqActionIte createSeqActionIte()
  {
    SeqActionIte zedObject = new SeqActionIteImpl(this);
    return zedObject;
  }

  public SeqActionIte createSeqActionIte( CircusAction  circusAction, net.sourceforge.czt.z.ast.DeclList  declList)
  {
    SeqActionIte zedObject = createSeqActionIte();
    zedObject.setCircusAction(circusAction);
    zedObject.setDeclList(declList);
    return zedObject;
  }

  public ParamAction createParamAction()
  {
    ParamAction zedObject = new ParamActionImpl(this);
    return zedObject;
  }

  public ParamAction createParamAction( CircusAction  circusAction, net.sourceforge.czt.z.ast.DeclList  declList)
  {
    ParamAction zedObject = createParamAction();
    zedObject.setCircusAction(circusAction);
    zedObject.setDeclList(declList);
    return zedObject;
  }

  public DotField createDotField()
  {
    DotField zedObject = new DotFieldImpl(this);
    return zedObject;
  }

  public DotField createDotField( net.sourceforge.czt.z.ast.Expr  expr)
  {
    DotField zedObject = createDotField();
    zedObject.setExpr(expr);
    return zedObject;
  }

  public ChannelSetPara createChannelSetPara()
  {
    ChannelSetPara zedObject = new ChannelSetParaImpl(this);
    return zedObject;
  }

  public ChannelSetPara createChannelSetPara( net.sourceforge.czt.z.ast.DeclNameList  genFormals, net.sourceforge.czt.z.ast.DeclName  name, ChannelSet  channelSet)
  {
    ChannelSetPara zedObject = createChannelSetPara();
    zedObject.setGenFormals(genFormals);
    zedObject.setName(name);
    zedObject.setChannelSet(channelSet);
    return zedObject;
  }

  public CallAction createCallAction()
  {
    CallAction zedObject = new CallActionImpl(this);
    return zedObject;
  }

  public CallAction createCallAction( net.sourceforge.czt.z.ast.RefName  refName, net.sourceforge.czt.z.ast.ExprList  exprList)
  {
    CallAction zedObject = createCallAction();
    zedObject.setRefName(refName);
    zedObject.setExprList(exprList);
    return zedObject;
  }

  public ExtChoiceProcessIdx createExtChoiceProcessIdx()
  {
    ExtChoiceProcessIdx zedObject = new ExtChoiceProcessIdxImpl(this);
    return zedObject;
  }

  public ExtChoiceProcessIdx createExtChoiceProcessIdx( CircusProcess  circusProcess, net.sourceforge.czt.z.ast.DeclList  declList)
  {
    ExtChoiceProcessIdx zedObject = createExtChoiceProcessIdx();
    zedObject.setCircusProcess(circusProcess);
    zedObject.setDeclList(declList);
    return zedObject;
  }

  public NameSet createNameSet()
  {
    NameSet zedObject = new NameSetImpl(this);
    return zedObject;
  }

  public NameSet createNameSet( net.sourceforge.czt.z.ast.Expr  expr)
  {
    NameSet zedObject = createNameSet();
    zedObject.setExpr(expr);
    return zedObject;
  }

  public ParallelActionIte createParallelActionIte()
  {
    ParallelActionIte zedObject = new ParallelActionIteImpl(this);
    return zedObject;
  }

  public ParallelActionIte createParallelActionIte( CircusAction  circusAction, net.sourceforge.czt.z.ast.DeclList  declList, NameSet  nameSet, ChannelSet  channelSet)
  {
    ParallelActionIte zedObject = createParallelActionIte();
    zedObject.setCircusAction(circusAction);
    zedObject.setDeclList(declList);
    zedObject.setNameSet(nameSet);
    zedObject.setChannelSet(channelSet);
    return zedObject;
  }

  public Communication createCommunication()
  {
    Communication zedObject = new CommunicationImpl(this);
    return zedObject;
  }

  public Communication createCommunication( net.sourceforge.czt.z.ast.RefExpr  channelExpr, CircusFieldList  chanFields, CommKind  commKind, java.math.BigInteger  multiSych)
  {
    Communication zedObject = createCommunication();
    zedObject.setChannelExpr(channelExpr);
    zedObject.setChanFields(chanFields);
    zedObject.setCommKind(commKind);
    zedObject.setMultiSych(multiSych);
    return zedObject;
  }

  public OutputField createOutputField()
  {
    OutputField zedObject = new OutputFieldImpl(this);
    return zedObject;
  }

  public OutputField createOutputField( net.sourceforge.czt.z.ast.Expr  expr)
  {
    OutputField zedObject = createOutputField();
    zedObject.setExpr(expr);
    return zedObject;
  }

  public ActionPara createActionPara()
  {
    ActionPara zedObject = new ActionParaImpl(this);
    return zedObject;
  }

  public ActionPara createActionPara( net.sourceforge.czt.z.ast.DeclName  declName, CircusAction  circusAction)
  {
    ActionPara zedObject = createActionPara();
    zedObject.setDeclName(declName);
    zedObject.setCircusAction(circusAction);
    return zedObject;
  }

  public HideProcess createHideProcess()
  {
    HideProcess zedObject = new HideProcessImpl(this);
    return zedObject;
  }

  public HideProcess createHideProcess( CircusProcess  circusProcess, ChannelSet  channelSet)
  {
    HideProcess zedObject = createHideProcess();
    zedObject.setCircusProcess(circusProcess);
    zedObject.setChannelSet(channelSet);
    return zedObject;
  }

  public ParallelProcess createParallelProcess()
  {
    ParallelProcess zedObject = new ParallelProcessImpl(this);
    return zedObject;
  }

  public ParallelProcess createParallelProcess( CircusProcess  leftProc, CircusProcess  rightProc, ChannelSet  channelSet)
  {
    ParallelProcess zedObject = createParallelProcess();
    zedObject.setLeftProc(leftProc);
    zedObject.setRightProc(rightProc);
    zedObject.setChannelSet(channelSet);
    return zedObject;
  }

  public LetVarAction createLetVarAction()
  {
    LetVarAction zedObject = new LetVarActionImpl(this);
    return zedObject;
  }

  public LetVarAction createLetVarAction( CircusAction  circusAction, net.sourceforge.czt.z.ast.DeclList  declList, net.sourceforge.czt.z.ast.ExprList  exprList)
  {
    LetVarAction zedObject = createLetVarAction();
    zedObject.setCircusAction(circusAction);
    zedObject.setDeclList(declList);
    zedObject.setExprList(exprList);
    return zedObject;
  }

  public ActionType createActionType()
  {
    ActionType zedObject = new ActionTypeImpl(this);
    return zedObject;
  }

  public ActionType createActionType( ActionSignature  actionSignature)
  {
    ActionType zedObject = createActionType();
    zedObject.setActionSignature(actionSignature);
    return zedObject;
  }

  public IntChoiceAction createIntChoiceAction()
  {
    IntChoiceAction zedObject = new IntChoiceActionImpl(this);
    return zedObject;
  }

  public IntChoiceAction createIntChoiceAction( CircusAction  leftAction, CircusAction  rightAction)
  {
    IntChoiceAction zedObject = createIntChoiceAction();
    zedObject.setLeftAction(leftAction);
    zedObject.setRightAction(rightAction);
    return zedObject;
  }

  public ParallelProcessIdx createParallelProcessIdx()
  {
    ParallelProcessIdx zedObject = new ParallelProcessIdxImpl(this);
    return zedObject;
  }

  public ParallelProcessIdx createParallelProcessIdx( CircusProcess  circusProcess, net.sourceforge.czt.z.ast.DeclList  declList, ChannelSet  channelSet)
  {
    ParallelProcessIdx zedObject = createParallelProcessIdx();
    zedObject.setCircusProcess(circusProcess);
    zedObject.setDeclList(declList);
    zedObject.setChannelSet(channelSet);
    return zedObject;
  }

  public RenameProcess createRenameProcess()
  {
    RenameProcess zedObject = new RenameProcessImpl(this);
    return zedObject;
  }

  public RenameProcess createRenameProcess( CircusProcess  circusProcess, AssignmentPairs  assignmentPairs)
  {
    RenameProcess zedObject = createRenameProcess();
    zedObject.setCircusProcess(circusProcess);
    zedObject.setAssignmentPairs(assignmentPairs);
    return zedObject;
  }

  public ChannelPara createChannelPara()
  {
    ChannelPara zedObject = new ChannelParaImpl(this);
    return zedObject;
  }

  public ChannelPara createChannelPara( net.sourceforge.czt.z.ast.DeclList  channelDecl)
  {
    ChannelPara zedObject = createChannelPara();
    zedObject.setChannelDecl(channelDecl);
    return zedObject;
  }

  public CallProcess createCallProcess()
  {
    CallProcess zedObject = new CallProcessImpl(this);
    return zedObject;
  }

  public CallProcess createCallProcess( net.sourceforge.czt.z.ast.RefExpr  callExpr, net.sourceforge.czt.z.ast.ExprList  actuals, CallKind  callKind)
  {
    CallProcess zedObject = createCallProcess();
    zedObject.setCallExpr(callExpr);
    zedObject.setActuals(actuals);
    zedObject.setCallKind(callKind);
    return zedObject;
  }

  public IntChoiceActionIte createIntChoiceActionIte()
  {
    IntChoiceActionIte zedObject = new IntChoiceActionIteImpl(this);
    return zedObject;
  }

  public IntChoiceActionIte createIntChoiceActionIte( CircusAction  circusAction, net.sourceforge.czt.z.ast.DeclList  declList)
  {
    IntChoiceActionIte zedObject = createIntChoiceActionIte();
    zedObject.setCircusAction(circusAction);
    zedObject.setDeclList(declList);
    return zedObject;
  }

  public AlphabetisedParallelActionIte createAlphabetisedParallelActionIte()
  {
    AlphabetisedParallelActionIte zedObject = new AlphabetisedParallelActionIteImpl(this);
    return zedObject;
  }

  public AlphabetisedParallelActionIte createAlphabetisedParallelActionIte( CircusAction  circusAction, net.sourceforge.czt.z.ast.DeclList  declList, NameSet  nameSet, ChannelSet  channelSet)
  {
    AlphabetisedParallelActionIte zedObject = createAlphabetisedParallelActionIte();
    zedObject.setCircusAction(circusAction);
    zedObject.setDeclList(declList);
    zedObject.setNameSet(nameSet);
    zedObject.setChannelSet(channelSet);
    return zedObject;
  }

  public NameSetPara createNameSetPara()
  {
    NameSetPara zedObject = new NameSetParaImpl(this);
    return zedObject;
  }

  public NameSetPara createNameSetPara( net.sourceforge.czt.z.ast.DeclName  declName, NameSet  nameSet)
  {
    NameSetPara zedObject = createNameSetPara();
    zedObject.setDeclName(declName);
    zedObject.setNameSet(nameSet);
    return zedObject;
  }

  public InterleaveProcess createInterleaveProcess()
  {
    InterleaveProcess zedObject = new InterleaveProcessImpl(this);
    return zedObject;
  }

  public InterleaveProcess createInterleaveProcess( CircusProcess  leftProc, CircusProcess  rightProc)
  {
    InterleaveProcess zedObject = createInterleaveProcess();
    zedObject.setLeftProc(leftProc);
    zedObject.setRightProc(rightProc);
    return zedObject;
  }

  public SeqProcess createSeqProcess()
  {
    SeqProcess zedObject = new SeqProcessImpl(this);
    return zedObject;
  }

  public SeqProcess createSeqProcess( CircusProcess  leftProc, CircusProcess  rightProc)
  {
    SeqProcess zedObject = createSeqProcess();
    zedObject.setLeftProc(leftProc);
    zedObject.setRightProc(rightProc);
    return zedObject;
  }

  public InterleaveActionIte createInterleaveActionIte()
  {
    InterleaveActionIte zedObject = new InterleaveActionIteImpl(this);
    return zedObject;
  }

  public InterleaveActionIte createInterleaveActionIte( CircusAction  circusAction, net.sourceforge.czt.z.ast.DeclList  declList, NameSet  nameSet)
  {
    InterleaveActionIte zedObject = createInterleaveActionIte();
    zedObject.setCircusAction(circusAction);
    zedObject.setDeclList(declList);
    zedObject.setNameSet(nameSet);
    return zedObject;
  }

  public BasicProcess createBasicProcess()
  {
    BasicProcess zedObject = new BasicProcessImpl(this);
    return zedObject;
  }

  public BasicProcess createBasicProcess( net.sourceforge.czt.z.ast.Para  statePara, net.sourceforge.czt.z.ast.ParaList  localPara, net.sourceforge.czt.z.ast.ParaList  onTheFlyPara, CircusAction  mainAction)
  {
    BasicProcess zedObject = createBasicProcess();
    zedObject.setStatePara(statePara);
    zedObject.setLocalPara(localPara);
    zedObject.setOnTheFlyPara(onTheFlyPara);
    zedObject.setMainAction(mainAction);
    return zedObject;
  }

  public InterleaveProcessIte createInterleaveProcessIte()
  {
    InterleaveProcessIte zedObject = new InterleaveProcessIteImpl(this);
    return zedObject;
  }

  public InterleaveProcessIte createInterleaveProcessIte( CircusProcess  circusProcess, net.sourceforge.czt.z.ast.DeclList  declList)
  {
    InterleaveProcessIte zedObject = createInterleaveProcessIte();
    zedObject.setCircusProcess(circusProcess);
    zedObject.setDeclList(declList);
    return zedObject;
  }

  public VarDeclCommand createVarDeclCommand()
  {
    VarDeclCommand zedObject = new VarDeclCommandImpl(this);
    return zedObject;
  }

  public VarDeclCommand createVarDeclCommand( net.sourceforge.czt.z.ast.DeclList  declList, CircusAction  circusAction)
  {
    VarDeclCommand zedObject = createVarDeclCommand();
    zedObject.setDeclList(declList);
    zedObject.setCircusAction(circusAction);
    return zedObject;
  }

  public InputField createInputField()
  {
    InputField zedObject = new InputFieldImpl(this);
    return zedObject;
  }

  public InputField createInputField( net.sourceforge.czt.z.ast.RefName  variable, net.sourceforge.czt.z.ast.Pred  restriction)
  {
    InputField zedObject = createInputField();
    zedObject.setVariable(variable);
    zedObject.setRestriction(restriction);
    return zedObject;
  }

  public RefinementConjPara createRefinementConjPara()
  {
    RefinementConjPara zedObject = new RefinementConjParaImpl(this);
    return zedObject;
  }

  public RefinementConjPara createRefinementConjPara( CircusAction  specification, CircusAction  implementation, Model  model)
  {
    RefinementConjPara zedObject = createRefinementConjPara();
    zedObject.setSpecification(specification);
    zedObject.setImplementation(implementation);
    zedObject.setModel(model);
    return zedObject;
  }

  public ActionSignature createActionSignature()
  {
    ActionSignature zedObject = new ActionSignatureImpl(this);
    return zedObject;
  }

  public ActionSignature createActionSignature( net.sourceforge.czt.z.ast.DeclName  actionName, net.sourceforge.czt.z.ast.Signature  formalParams, net.sourceforge.czt.z.ast.Signature  localVars, net.sourceforge.czt.z.ast.Signature  usedChannels)
  {
    ActionSignature zedObject = createActionSignature();
    zedObject.setActionName(actionName);
    zedObject.setFormalParams(formalParams);
    zedObject.setLocalVars(localVars);
    zedObject.setUsedChannels(usedChannels);
    return zedObject;
  }


    /** Creates a parameterless call action. This is a convenience method */
    public CallAction createCallAction(RefName name) {
      return createCallAction(name, createZExprList());
    }

    /** Creates a parameterless call process with empty generic actuals. This is a convenience method */
    public CallProcess createCallProcess(RefName name) {
      return createCallProcess(createRefExpr(name, createZExprList(), Boolean.FALSE, Boolean.TRUE), 
		createZExprList(), CallKind.Param);
    }
    
    /** Creates an empty BasicNameSet. This is a convenience method */
    public NameSet createEmptyNameSet() {
      return createNameSet(createSetExpr(createZExprList()));
    }
    
    /** Creates an empty BasicChannelSet. This is a convenience method */
    public ChannelSet createEmptyChannelSet() {
      return createChannelSet(createSetExpr(createZExprList()));
    }
    
    /** Creates an interleave action with empty (basic) name sets. This is a convenience method */    
    public InterleaveAction createInterleaveAction(CircusAction left, CircusAction right) {
      return createInterleaveAction(left, right, createEmptyNameSet(), createEmptyNameSet());
    }
}
