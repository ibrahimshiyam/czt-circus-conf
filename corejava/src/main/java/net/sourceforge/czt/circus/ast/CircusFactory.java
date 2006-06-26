
/******************************************************************************
DO NOT EDIT THIS FILE!  THIS FILE WAS GENERATED BY GNAST
FROM THE TEMPLATE FILE CoreFactory.vm.
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

package net.sourceforge.czt.circus.ast;
import net.sourceforge.czt.z.ast.*;

/**
 * <p>The object factory for the AST.
 * This interface contains factory methods
 * for each concrete Z term.</p>
 *
 * <p>This object factory allows the programmer to programatically
 * construct new instances of concrete Z terms.
 * There is a factory method that does not require arguments
 * (called default factory method)
 * and a factory method where all the children (except annotations)
 * of that particular Z term can be provided.</p>
 *
 * @author Gnast version 0.1
 */
public interface CircusFactory
  extends net.sourceforge.czt.z.ast.ZFactory
{
  /**
   * Creates an instance of {@link ChannelSetType}.
   *
   * @return the new instance of ChannelSetType.
   */
  ChannelSetType createChannelSetType();

  /**
   * Creates an instance of {@link ChannelSetType} with the given children.
   *
   * @return the new instance of ChannelSetType.
   */
  ChannelSetType createChannelSetType( net.sourceforge.czt.z.ast.Signature  signature);

  /**
   * Creates an instance of {@link GuardedAction}.
   *
   * @return the new instance of GuardedAction.
   */
  GuardedAction createGuardedAction();

  /**
   * Creates an instance of {@link GuardedAction} with the given children.
   *
   * @return the new instance of GuardedAction.
   */
  GuardedAction createGuardedAction( CircusAction  circusAction, net.sourceforge.czt.z.ast.Pred  pred);

  /**
   * Creates an instance of {@link ParallelAction}.
   *
   * @return the new instance of ParallelAction.
   */
  ParallelAction createParallelAction();

  /**
   * Creates an instance of {@link ParallelAction} with the given children.
   *
   * @return the new instance of ParallelAction.
   */
  ParallelAction createParallelAction( CircusAction  leftAction, CircusAction  rightAction, NameSet  leftNameSet, NameSet  rightNameSet, ChannelSet  channelSet);

  /**
   * Creates an instance of {@link ChannelDecl}.
   *
   * @return the new instance of ChannelDecl.
   */
  ChannelDecl createChannelDecl();

  /**
   * Creates an instance of {@link ChannelDecl} with the given children.
   *
   * @return the new instance of ChannelDecl.
   */
  ChannelDecl createChannelDecl( net.sourceforge.czt.z.ast.DeclNameList  genFormals, net.sourceforge.czt.z.ast.DeclNameList  declNameList, net.sourceforge.czt.z.ast.Expr  expr);

  /**
   * Creates an instance of {@link HideAction}.
   *
   * @return the new instance of HideAction.
   */
  HideAction createHideAction();

  /**
   * Creates an instance of {@link HideAction} with the given children.
   *
   * @return the new instance of HideAction.
   */
  HideAction createHideAction( CircusAction  circusAction, ChannelSet  channelSet);

  /**
   * Creates an instance of {@link ExtChoiceProcessIte}.
   *
   * @return the new instance of ExtChoiceProcessIte.
   */
  ExtChoiceProcessIte createExtChoiceProcessIte();

  /**
   * Creates an instance of {@link ExtChoiceProcessIte} with the given children.
   *
   * @return the new instance of ExtChoiceProcessIte.
   */
  ExtChoiceProcessIte createExtChoiceProcessIte( CircusProcess  circusProcess, net.sourceforge.czt.z.ast.DeclList  declList);

  /**
   * Creates an instance of {@link ChaosAction}.
   *
   * @return the new instance of ChaosAction.
   */
  ChaosAction createChaosAction();

  /**
   * Creates an instance of {@link CircusFieldList}.
   *
   * @return the new instance of CircusFieldList.
   */
  CircusFieldList createCircusFieldList();

  /**
   * Creates an instance of {@link CircusFieldList} with the given children.
   *
   * @return the new instance of CircusFieldList.
   */
  CircusFieldList createCircusFieldList(java.util.List<? extends Field>
 field);

  /**
   * Creates an instance of {@link CircusStateAnn}.
   *
   * @return the new instance of CircusStateAnn.
   */
  CircusStateAnn createCircusStateAnn();

  /**
   * Creates an instance of {@link IntChoiceProcessIte}.
   *
   * @return the new instance of IntChoiceProcessIte.
   */
  IntChoiceProcessIte createIntChoiceProcessIte();

  /**
   * Creates an instance of {@link IntChoiceProcessIte} with the given children.
   *
   * @return the new instance of IntChoiceProcessIte.
   */
  IntChoiceProcessIte createIntChoiceProcessIte( CircusProcess  circusProcess, net.sourceforge.czt.z.ast.DeclList  declList);

  /**
   * Creates an instance of {@link AlphabetisedParallelAction}.
   *
   * @return the new instance of AlphabetisedParallelAction.
   */
  AlphabetisedParallelAction createAlphabetisedParallelAction();

  /**
   * Creates an instance of {@link AlphabetisedParallelAction} with the given children.
   *
   * @return the new instance of AlphabetisedParallelAction.
   */
  AlphabetisedParallelAction createAlphabetisedParallelAction( CircusAction  leftAction, CircusAction  rightAction, NameSet  leftNameSet, NameSet  rightNameSet, ChannelSet  leftAlpha, ChannelSet  rightAlpha);

  /**
   * Creates an instance of {@link SkipAction}.
   *
   * @return the new instance of SkipAction.
   */
  SkipAction createSkipAction();

  /**
   * Creates an instance of {@link ProcessType}.
   *
   * @return the new instance of ProcessType.
   */
  ProcessType createProcessType();

  /**
   * Creates an instance of {@link ProcessType} with the given children.
   *
   * @return the new instance of ProcessType.
   */
  ProcessType createProcessType( ProcessSignature  processSignature);

  /**
   * Creates an instance of {@link SeqProcessIdx}.
   *
   * @return the new instance of SeqProcessIdx.
   */
  SeqProcessIdx createSeqProcessIdx();

  /**
   * Creates an instance of {@link SeqProcessIdx} with the given children.
   *
   * @return the new instance of SeqProcessIdx.
   */
  SeqProcessIdx createSeqProcessIdx( CircusProcess  circusProcess, net.sourceforge.czt.z.ast.DeclList  declList);

  /**
   * Creates an instance of {@link ExtChoiceActionIte}.
   *
   * @return the new instance of ExtChoiceActionIte.
   */
  ExtChoiceActionIte createExtChoiceActionIte();

  /**
   * Creates an instance of {@link ExtChoiceActionIte} with the given children.
   *
   * @return the new instance of ExtChoiceActionIte.
   */
  ExtChoiceActionIte createExtChoiceActionIte( CircusAction  circusAction, net.sourceforge.czt.z.ast.DeclList  declList);

  /**
   * Creates an instance of {@link QualifiedDecl}.
   *
   * @return the new instance of QualifiedDecl.
   */
  QualifiedDecl createQualifiedDecl();

  /**
   * Creates an instance of {@link QualifiedDecl} with the given children.
   *
   * @return the new instance of QualifiedDecl.
   */
  QualifiedDecl createQualifiedDecl( net.sourceforge.czt.z.ast.DeclNameList  declNameList, net.sourceforge.czt.z.ast.Expr  expr, ParamQualifier  paramQualifier);

  /**
   * Creates an instance of {@link AssignmentPairs}.
   *
   * @return the new instance of AssignmentPairs.
   */
  AssignmentPairs createAssignmentPairs();

  /**
   * Creates an instance of {@link AssignmentPairs} with the given children.
   *
   * @return the new instance of AssignmentPairs.
   */
  AssignmentPairs createAssignmentPairs( net.sourceforge.czt.z.ast.RefNameList  lHS, net.sourceforge.czt.z.ast.ExprList  rHS);

  /**
   * Creates an instance of {@link IndexedProcess}.
   *
   * @return the new instance of IndexedProcess.
   */
  IndexedProcess createIndexedProcess();

  /**
   * Creates an instance of {@link IndexedProcess} with the given children.
   *
   * @return the new instance of IndexedProcess.
   */
  IndexedProcess createIndexedProcess( CircusProcess  circusProcess, net.sourceforge.czt.z.ast.DeclList  declList);

  /**
   * Creates an instance of {@link LetMuAction}.
   *
   * @return the new instance of LetMuAction.
   */
  LetMuAction createLetMuAction();

  /**
   * Creates an instance of {@link LetMuAction} with the given children.
   *
   * @return the new instance of LetMuAction.
   */
  LetMuAction createLetMuAction( CircusAction  circusAction, net.sourceforge.czt.z.ast.ParaList  paraList);

  /**
   * Creates an instance of {@link ChannelType}.
   *
   * @return the new instance of ChannelType.
   */
  ChannelType createChannelType();

  /**
   * Creates an instance of {@link ChannelType} with the given children.
   *
   * @return the new instance of ChannelType.
   */
  ChannelType createChannelType( net.sourceforge.czt.z.ast.DeclNameList  genFormals, net.sourceforge.czt.z.ast.Type2  declaredType, net.sourceforge.czt.z.ast.Type2  resolvedType);

  /**
   * Creates an instance of {@link InterleaveAction}.
   *
   * @return the new instance of InterleaveAction.
   */
  InterleaveAction createInterleaveAction();

  /**
   * Creates an instance of {@link InterleaveAction} with the given children.
   *
   * @return the new instance of InterleaveAction.
   */
  InterleaveAction createInterleaveAction( CircusAction  leftAction, CircusAction  rightAction, NameSet  leftNameSet, NameSet  rightNameSet);

  /**
   * Creates an instance of {@link IntChoiceProcess}.
   *
   * @return the new instance of IntChoiceProcess.
   */
  IntChoiceProcess createIntChoiceProcess();

  /**
   * Creates an instance of {@link IntChoiceProcess} with the given children.
   *
   * @return the new instance of IntChoiceProcess.
   */
  IntChoiceProcess createIntChoiceProcess( CircusProcess  leftProc, CircusProcess  rightProc);

  /**
   * Creates an instance of {@link SchExprAction}.
   *
   * @return the new instance of SchExprAction.
   */
  SchExprAction createSchExprAction();

  /**
   * Creates an instance of {@link SchExprAction} with the given children.
   *
   * @return the new instance of SchExprAction.
   */
  SchExprAction createSchExprAction( net.sourceforge.czt.z.ast.Expr  expr);

  /**
   * Creates an instance of {@link IfGuardedCommand}.
   *
   * @return the new instance of IfGuardedCommand.
   */
  IfGuardedCommand createIfGuardedCommand();

  /**
   * Creates an instance of {@link IfGuardedCommand} with the given children.
   *
   * @return the new instance of IfGuardedCommand.
   */
  IfGuardedCommand createIfGuardedCommand(java.util.List<? extends GuardedAction>
 guardedAction);

  /**
   * Creates an instance of {@link ParallelProcessIte}.
   *
   * @return the new instance of ParallelProcessIte.
   */
  ParallelProcessIte createParallelProcessIte();

  /**
   * Creates an instance of {@link ParallelProcessIte} with the given children.
   *
   * @return the new instance of ParallelProcessIte.
   */
  ParallelProcessIte createParallelProcessIte( CircusProcess  circusProcess, net.sourceforge.czt.z.ast.DeclList  declList, ChannelSet  channelSet);

  /**
   * Creates an instance of {@link ExtChoiceProcess}.
   *
   * @return the new instance of ExtChoiceProcess.
   */
  ExtChoiceProcess createExtChoiceProcess();

  /**
   * Creates an instance of {@link ExtChoiceProcess} with the given children.
   *
   * @return the new instance of ExtChoiceProcess.
   */
  ExtChoiceProcess createExtChoiceProcess( CircusProcess  leftProc, CircusProcess  rightProc);

  /**
   * Creates an instance of {@link StopAction}.
   *
   * @return the new instance of StopAction.
   */
  StopAction createStopAction();

  /**
   * Creates an instance of {@link ExtChoiceAction}.
   *
   * @return the new instance of ExtChoiceAction.
   */
  ExtChoiceAction createExtChoiceAction();

  /**
   * Creates an instance of {@link ExtChoiceAction} with the given children.
   *
   * @return the new instance of ExtChoiceAction.
   */
  ExtChoiceAction createExtChoiceAction( CircusAction  leftAction, CircusAction  rightAction);

  /**
   * Creates an instance of {@link InterleaveProcessIdx}.
   *
   * @return the new instance of InterleaveProcessIdx.
   */
  InterleaveProcessIdx createInterleaveProcessIdx();

  /**
   * Creates an instance of {@link InterleaveProcessIdx} with the given children.
   *
   * @return the new instance of InterleaveProcessIdx.
   */
  InterleaveProcessIdx createInterleaveProcessIdx( CircusProcess  circusProcess, net.sourceforge.czt.z.ast.DeclList  declList);

  /**
   * Creates an instance of {@link AlphabetisedParallelProcessIte}.
   *
   * @return the new instance of AlphabetisedParallelProcessIte.
   */
  AlphabetisedParallelProcessIte createAlphabetisedParallelProcessIte();

  /**
   * Creates an instance of {@link AlphabetisedParallelProcessIte} with the given children.
   *
   * @return the new instance of AlphabetisedParallelProcessIte.
   */
  AlphabetisedParallelProcessIte createAlphabetisedParallelProcessIte( CircusProcess  circusProcess, net.sourceforge.czt.z.ast.DeclList  declList, ChannelSet  channelSet);

  /**
   * Creates an instance of {@link AlphabetisedParallelProcessIdx}.
   *
   * @return the new instance of AlphabetisedParallelProcessIdx.
   */
  AlphabetisedParallelProcessIdx createAlphabetisedParallelProcessIdx();

  /**
   * Creates an instance of {@link AlphabetisedParallelProcessIdx} with the given children.
   *
   * @return the new instance of AlphabetisedParallelProcessIdx.
   */
  AlphabetisedParallelProcessIdx createAlphabetisedParallelProcessIdx( CircusProcess  circusProcess, net.sourceforge.czt.z.ast.DeclList  declList, ChannelSet  channelSet);

  /**
   * Creates an instance of {@link PrefixingAction}.
   *
   * @return the new instance of PrefixingAction.
   */
  PrefixingAction createPrefixingAction();

  /**
   * Creates an instance of {@link PrefixingAction} with the given children.
   *
   * @return the new instance of PrefixingAction.
   */
  PrefixingAction createPrefixingAction( CircusAction  circusAction, Communication  communication);

  /**
   * Creates an instance of {@link NameSetType}.
   *
   * @return the new instance of NameSetType.
   */
  NameSetType createNameSetType();

  /**
   * Creates an instance of {@link NameSetType} with the given children.
   *
   * @return the new instance of NameSetType.
   */
  NameSetType createNameSetType( net.sourceforge.czt.z.ast.Signature  signature);

  /**
   * Creates an instance of {@link OnTheFlyDefAnn}.
   *
   * @return the new instance of OnTheFlyDefAnn.
   */
  OnTheFlyDefAnn createOnTheFlyDefAnn();

  /**
   * Creates an instance of {@link ChannelSet}.
   *
   * @return the new instance of ChannelSet.
   */
  ChannelSet createChannelSet();

  /**
   * Creates an instance of {@link ChannelSet} with the given children.
   *
   * @return the new instance of ChannelSet.
   */
  ChannelSet createChannelSet( net.sourceforge.czt.z.ast.Expr  expr);

  /**
   * Creates an instance of {@link AssignmentCommand}.
   *
   * @return the new instance of AssignmentCommand.
   */
  AssignmentCommand createAssignmentCommand();

  /**
   * Creates an instance of {@link AssignmentCommand} with the given children.
   *
   * @return the new instance of AssignmentCommand.
   */
  AssignmentCommand createAssignmentCommand( AssignmentPairs  assignmentPairs);

  /**
   * Creates an instance of {@link SeqProcessIte}.
   *
   * @return the new instance of SeqProcessIte.
   */
  SeqProcessIte createSeqProcessIte();

  /**
   * Creates an instance of {@link SeqProcessIte} with the given children.
   *
   * @return the new instance of SeqProcessIte.
   */
  SeqProcessIte createSeqProcessIte( CircusProcess  circusProcess, net.sourceforge.czt.z.ast.DeclList  declList);

  /**
   * Creates an instance of {@link IntChoiceProcessIdx}.
   *
   * @return the new instance of IntChoiceProcessIdx.
   */
  IntChoiceProcessIdx createIntChoiceProcessIdx();

  /**
   * Creates an instance of {@link IntChoiceProcessIdx} with the given children.
   *
   * @return the new instance of IntChoiceProcessIdx.
   */
  IntChoiceProcessIdx createIntChoiceProcessIdx( CircusProcess  circusProcess, net.sourceforge.czt.z.ast.DeclList  declList);

  /**
   * Creates an instance of {@link BasicProcessSignature}.
   *
   * @return the new instance of BasicProcessSignature.
   */
  BasicProcessSignature createBasicProcessSignature();

  /**
   * Creates an instance of {@link BasicProcessSignature} with the given children.
   *
   * @return the new instance of BasicProcessSignature.
   */
  BasicProcessSignature createBasicProcessSignature( net.sourceforge.czt.z.ast.DeclName  processName, net.sourceforge.czt.z.ast.DeclNameList  genFormals, net.sourceforge.czt.z.ast.Signature  paramOrIndexes, ProcessKind  kind, net.sourceforge.czt.z.ast.SchemaType  stateType,java.util.List<? extends net.sourceforge.czt.z.ast.Signature>
 zSignature,java.util.List<? extends ActionSignature>
 actionSignature, net.sourceforge.czt.z.ast.ZRefNameList  nameSet);

  /**
   * Creates an instance of {@link ParamProcess}.
   *
   * @return the new instance of ParamProcess.
   */
  ParamProcess createParamProcess();

  /**
   * Creates an instance of {@link ParamProcess} with the given children.
   *
   * @return the new instance of ParamProcess.
   */
  ParamProcess createParamProcess( CircusProcess  circusProcess, net.sourceforge.czt.z.ast.DeclList  declList);

  /**
   * Creates an instance of {@link SigmaExpr}.
   *
   * @return the new instance of SigmaExpr.
   */
  SigmaExpr createSigmaExpr();

  /**
   * Creates an instance of {@link SigmaExpr} with the given children.
   *
   * @return the new instance of SigmaExpr.
   */
  SigmaExpr createSigmaExpr( net.sourceforge.czt.z.ast.RefExpr  channel, net.sourceforge.czt.z.ast.Expr  value);

  /**
   * Creates an instance of {@link SubstitutionAction}.
   *
   * @return the new instance of SubstitutionAction.
   */
  SubstitutionAction createSubstitutionAction();

  /**
   * Creates an instance of {@link SubstitutionAction} with the given children.
   *
   * @return the new instance of SubstitutionAction.
   */
  SubstitutionAction createSubstitutionAction( CircusAction  circusAction, net.sourceforge.czt.z.ast.RenameList  renameList);

  /**
   * Creates an instance of {@link SpecStmtCommand}.
   *
   * @return the new instance of SpecStmtCommand.
   */
  SpecStmtCommand createSpecStmtCommand();

  /**
   * Creates an instance of {@link SpecStmtCommand} with the given children.
   *
   * @return the new instance of SpecStmtCommand.
   */
  SpecStmtCommand createSpecStmtCommand( net.sourceforge.czt.z.ast.RefNameList  frame, net.sourceforge.czt.z.ast.Pred  pre, net.sourceforge.czt.z.ast.Pred  post);

  /**
   * Creates an instance of {@link MuAction}.
   *
   * @return the new instance of MuAction.
   */
  MuAction createMuAction();

  /**
   * Creates an instance of {@link MuAction} with the given children.
   *
   * @return the new instance of MuAction.
   */
  MuAction createMuAction( CircusAction  circusAction, net.sourceforge.czt.z.ast.DeclName  declName);

  /**
   * Creates an instance of {@link ProcessSignature}.
   *
   * @return the new instance of ProcessSignature.
   */
  ProcessSignature createProcessSignature();

  /**
   * Creates an instance of {@link ProcessSignature} with the given children.
   *
   * @return the new instance of ProcessSignature.
   */
  ProcessSignature createProcessSignature( net.sourceforge.czt.z.ast.DeclName  processName, net.sourceforge.czt.z.ast.DeclNameList  genFormals, net.sourceforge.czt.z.ast.Signature  paramOrIndexes, ProcessKind  kind);

  /**
   * Creates an instance of {@link AlphabetisedParallelProcess}.
   *
   * @return the new instance of AlphabetisedParallelProcess.
   */
  AlphabetisedParallelProcess createAlphabetisedParallelProcess();

  /**
   * Creates an instance of {@link AlphabetisedParallelProcess} with the given children.
   *
   * @return the new instance of AlphabetisedParallelProcess.
   */
  AlphabetisedParallelProcess createAlphabetisedParallelProcess( CircusProcess  leftProc, CircusProcess  rightProc, ChannelSet  leftAlpha, ChannelSet  rightAlpha);

  /**
   * Creates an instance of {@link ProcessPara}.
   *
   * @return the new instance of ProcessPara.
   */
  ProcessPara createProcessPara();

  /**
   * Creates an instance of {@link ProcessPara} with the given children.
   *
   * @return the new instance of ProcessPara.
   */
  ProcessPara createProcessPara( net.sourceforge.czt.z.ast.DeclName  processName, net.sourceforge.czt.z.ast.DeclNameList  genFormals, CircusProcess  circusProcess);

  /**
   * Creates an instance of {@link SeqAction}.
   *
   * @return the new instance of SeqAction.
   */
  SeqAction createSeqAction();

  /**
   * Creates an instance of {@link SeqAction} with the given children.
   *
   * @return the new instance of SeqAction.
   */
  SeqAction createSeqAction( CircusAction  leftAction, CircusAction  rightAction);

  /**
   * Creates an instance of {@link BasicChannelSetExpr}.
   *
   * @return the new instance of BasicChannelSetExpr.
   */
  BasicChannelSetExpr createBasicChannelSetExpr();

  /**
   * Creates an instance of {@link BasicChannelSetExpr} with the given children.
   *
   * @return the new instance of BasicChannelSetExpr.
   */
  BasicChannelSetExpr createBasicChannelSetExpr( ExprList  exprList);

  /**
   * Creates an instance of {@link SeqActionIte}.
   *
   * @return the new instance of SeqActionIte.
   */
  SeqActionIte createSeqActionIte();

  /**
   * Creates an instance of {@link SeqActionIte} with the given children.
   *
   * @return the new instance of SeqActionIte.
   */
  SeqActionIte createSeqActionIte( CircusAction  circusAction, net.sourceforge.czt.z.ast.DeclList  declList);

  /**
   * Creates an instance of {@link ParamAction}.
   *
   * @return the new instance of ParamAction.
   */
  ParamAction createParamAction();

  /**
   * Creates an instance of {@link ParamAction} with the given children.
   *
   * @return the new instance of ParamAction.
   */
  ParamAction createParamAction( CircusAction  circusAction, net.sourceforge.czt.z.ast.DeclList  declList);

  /**
   * Creates an instance of {@link DotField}.
   *
   * @return the new instance of DotField.
   */
  DotField createDotField();

  /**
   * Creates an instance of {@link DotField} with the given children.
   *
   * @return the new instance of DotField.
   */
  DotField createDotField( net.sourceforge.czt.z.ast.Expr  expr);

  /**
   * Creates an instance of {@link ChannelSetPara}.
   *
   * @return the new instance of ChannelSetPara.
   */
  ChannelSetPara createChannelSetPara();

  /**
   * Creates an instance of {@link ChannelSetPara} with the given children.
   *
   * @return the new instance of ChannelSetPara.
   */
  ChannelSetPara createChannelSetPara( net.sourceforge.czt.z.ast.DeclNameList  genFormals, net.sourceforge.czt.z.ast.DeclName  name, ChannelSet  channelSet);

  /**
   * Creates an instance of {@link CallAction}.
   *
   * @return the new instance of CallAction.
   */
  CallAction createCallAction();

  /**
   * Creates an instance of {@link CallAction} with the given children.
   *
   * @return the new instance of CallAction.
   */
  CallAction createCallAction( net.sourceforge.czt.z.ast.RefName  refName, net.sourceforge.czt.z.ast.ExprList  exprList);

  /**
   * Creates an instance of {@link ExtChoiceProcessIdx}.
   *
   * @return the new instance of ExtChoiceProcessIdx.
   */
  ExtChoiceProcessIdx createExtChoiceProcessIdx();

  /**
   * Creates an instance of {@link ExtChoiceProcessIdx} with the given children.
   *
   * @return the new instance of ExtChoiceProcessIdx.
   */
  ExtChoiceProcessIdx createExtChoiceProcessIdx( CircusProcess  circusProcess, net.sourceforge.czt.z.ast.DeclList  declList);

  /**
   * Creates an instance of {@link NameSet}.
   *
   * @return the new instance of NameSet.
   */
  NameSet createNameSet();

  /**
   * Creates an instance of {@link NameSet} with the given children.
   *
   * @return the new instance of NameSet.
   */
  NameSet createNameSet( net.sourceforge.czt.z.ast.Expr  expr);

  /**
   * Creates an instance of {@link ParallelActionIte}.
   *
   * @return the new instance of ParallelActionIte.
   */
  ParallelActionIte createParallelActionIte();

  /**
   * Creates an instance of {@link ParallelActionIte} with the given children.
   *
   * @return the new instance of ParallelActionIte.
   */
  ParallelActionIte createParallelActionIte( CircusAction  circusAction, net.sourceforge.czt.z.ast.DeclList  declList, NameSet  nameSet, ChannelSet  channelSet);

  /**
   * Creates an instance of {@link Communication}.
   *
   * @return the new instance of Communication.
   */
  Communication createCommunication();

  /**
   * Creates an instance of {@link Communication} with the given children.
   *
   * @return the new instance of Communication.
   */
  Communication createCommunication( net.sourceforge.czt.z.ast.RefExpr  channelExpr, CircusFieldList  chanFields, CommKind  commKind, java.math.BigInteger  multiSych);

  /**
   * Creates an instance of {@link OutputField}.
   *
   * @return the new instance of OutputField.
   */
  OutputField createOutputField();

  /**
   * Creates an instance of {@link OutputField} with the given children.
   *
   * @return the new instance of OutputField.
   */
  OutputField createOutputField( net.sourceforge.czt.z.ast.Expr  expr);

  /**
   * Creates an instance of {@link ActionPara}.
   *
   * @return the new instance of ActionPara.
   */
  ActionPara createActionPara();

  /**
   * Creates an instance of {@link ActionPara} with the given children.
   *
   * @return the new instance of ActionPara.
   */
  ActionPara createActionPara( net.sourceforge.czt.z.ast.DeclName  declName, CircusAction  circusAction);

  /**
   * Creates an instance of {@link HideProcess}.
   *
   * @return the new instance of HideProcess.
   */
  HideProcess createHideProcess();

  /**
   * Creates an instance of {@link HideProcess} with the given children.
   *
   * @return the new instance of HideProcess.
   */
  HideProcess createHideProcess( CircusProcess  circusProcess, ChannelSet  channelSet);

  /**
   * Creates an instance of {@link ParallelProcess}.
   *
   * @return the new instance of ParallelProcess.
   */
  ParallelProcess createParallelProcess();

  /**
   * Creates an instance of {@link ParallelProcess} with the given children.
   *
   * @return the new instance of ParallelProcess.
   */
  ParallelProcess createParallelProcess( CircusProcess  leftProc, CircusProcess  rightProc, ChannelSet  channelSet);

  /**
   * Creates an instance of {@link LetVarAction}.
   *
   * @return the new instance of LetVarAction.
   */
  LetVarAction createLetVarAction();

  /**
   * Creates an instance of {@link LetVarAction} with the given children.
   *
   * @return the new instance of LetVarAction.
   */
  LetVarAction createLetVarAction( CircusAction  circusAction, net.sourceforge.czt.z.ast.DeclList  declList, net.sourceforge.czt.z.ast.ExprList  exprList);

  /**
   * Creates an instance of {@link ActionType}.
   *
   * @return the new instance of ActionType.
   */
  ActionType createActionType();

  /**
   * Creates an instance of {@link ActionType} with the given children.
   *
   * @return the new instance of ActionType.
   */
  ActionType createActionType( ActionSignature  actionSignature);

  /**
   * Creates an instance of {@link IntChoiceAction}.
   *
   * @return the new instance of IntChoiceAction.
   */
  IntChoiceAction createIntChoiceAction();

  /**
   * Creates an instance of {@link IntChoiceAction} with the given children.
   *
   * @return the new instance of IntChoiceAction.
   */
  IntChoiceAction createIntChoiceAction( CircusAction  leftAction, CircusAction  rightAction);

  /**
   * Creates an instance of {@link ParallelProcessIdx}.
   *
   * @return the new instance of ParallelProcessIdx.
   */
  ParallelProcessIdx createParallelProcessIdx();

  /**
   * Creates an instance of {@link ParallelProcessIdx} with the given children.
   *
   * @return the new instance of ParallelProcessIdx.
   */
  ParallelProcessIdx createParallelProcessIdx( CircusProcess  circusProcess, net.sourceforge.czt.z.ast.DeclList  declList, ChannelSet  channelSet);

  /**
   * Creates an instance of {@link RenameProcess}.
   *
   * @return the new instance of RenameProcess.
   */
  RenameProcess createRenameProcess();

  /**
   * Creates an instance of {@link RenameProcess} with the given children.
   *
   * @return the new instance of RenameProcess.
   */
  RenameProcess createRenameProcess( CircusProcess  circusProcess, AssignmentPairs  assignmentPairs);

  /**
   * Creates an instance of {@link ChannelPara}.
   *
   * @return the new instance of ChannelPara.
   */
  ChannelPara createChannelPara();

  /**
   * Creates an instance of {@link ChannelPara} with the given children.
   *
   * @return the new instance of ChannelPara.
   */
  ChannelPara createChannelPara( net.sourceforge.czt.z.ast.DeclList  channelDecl);

  /**
   * Creates an instance of {@link CallProcess}.
   *
   * @return the new instance of CallProcess.
   */
  CallProcess createCallProcess();

  /**
   * Creates an instance of {@link CallProcess} with the given children.
   *
   * @return the new instance of CallProcess.
   */
  CallProcess createCallProcess( net.sourceforge.czt.z.ast.RefExpr  callExpr, net.sourceforge.czt.z.ast.ExprList  actuals, CallKind  callKind);

  /**
   * Creates an instance of {@link IntChoiceActionIte}.
   *
   * @return the new instance of IntChoiceActionIte.
   */
  IntChoiceActionIte createIntChoiceActionIte();

  /**
   * Creates an instance of {@link IntChoiceActionIte} with the given children.
   *
   * @return the new instance of IntChoiceActionIte.
   */
  IntChoiceActionIte createIntChoiceActionIte( CircusAction  circusAction, net.sourceforge.czt.z.ast.DeclList  declList);

  /**
   * Creates an instance of {@link AlphabetisedParallelActionIte}.
   *
   * @return the new instance of AlphabetisedParallelActionIte.
   */
  AlphabetisedParallelActionIte createAlphabetisedParallelActionIte();

  /**
   * Creates an instance of {@link AlphabetisedParallelActionIte} with the given children.
   *
   * @return the new instance of AlphabetisedParallelActionIte.
   */
  AlphabetisedParallelActionIte createAlphabetisedParallelActionIte( CircusAction  circusAction, net.sourceforge.czt.z.ast.DeclList  declList, NameSet  nameSet, ChannelSet  channelSet);

  /**
   * Creates an instance of {@link NameSetPara}.
   *
   * @return the new instance of NameSetPara.
   */
  NameSetPara createNameSetPara();

  /**
   * Creates an instance of {@link NameSetPara} with the given children.
   *
   * @return the new instance of NameSetPara.
   */
  NameSetPara createNameSetPara( net.sourceforge.czt.z.ast.DeclName  declName, NameSet  nameSet);

  /**
   * Creates an instance of {@link InterleaveProcess}.
   *
   * @return the new instance of InterleaveProcess.
   */
  InterleaveProcess createInterleaveProcess();

  /**
   * Creates an instance of {@link InterleaveProcess} with the given children.
   *
   * @return the new instance of InterleaveProcess.
   */
  InterleaveProcess createInterleaveProcess( CircusProcess  leftProc, CircusProcess  rightProc);

  /**
   * Creates an instance of {@link SeqProcess}.
   *
   * @return the new instance of SeqProcess.
   */
  SeqProcess createSeqProcess();

  /**
   * Creates an instance of {@link SeqProcess} with the given children.
   *
   * @return the new instance of SeqProcess.
   */
  SeqProcess createSeqProcess( CircusProcess  leftProc, CircusProcess  rightProc);

  /**
   * Creates an instance of {@link InterleaveActionIte}.
   *
   * @return the new instance of InterleaveActionIte.
   */
  InterleaveActionIte createInterleaveActionIte();

  /**
   * Creates an instance of {@link InterleaveActionIte} with the given children.
   *
   * @return the new instance of InterleaveActionIte.
   */
  InterleaveActionIte createInterleaveActionIte( CircusAction  circusAction, net.sourceforge.czt.z.ast.DeclList  declList, NameSet  nameSet);

  /**
   * Creates an instance of {@link BasicProcess}.
   *
   * @return the new instance of BasicProcess.
   */
  BasicProcess createBasicProcess();

  /**
   * Creates an instance of {@link BasicProcess} with the given children.
   *
   * @return the new instance of BasicProcess.
   */
  BasicProcess createBasicProcess( net.sourceforge.czt.z.ast.Para  statePara, net.sourceforge.czt.z.ast.ParaList  localPara, net.sourceforge.czt.z.ast.ParaList  onTheFlyPara, CircusAction  mainAction);

  /**
   * Creates an instance of {@link InterleaveProcessIte}.
   *
   * @return the new instance of InterleaveProcessIte.
   */
  InterleaveProcessIte createInterleaveProcessIte();

  /**
   * Creates an instance of {@link InterleaveProcessIte} with the given children.
   *
   * @return the new instance of InterleaveProcessIte.
   */
  InterleaveProcessIte createInterleaveProcessIte( CircusProcess  circusProcess, net.sourceforge.czt.z.ast.DeclList  declList);

  /**
   * Creates an instance of {@link VarDeclCommand}.
   *
   * @return the new instance of VarDeclCommand.
   */
  VarDeclCommand createVarDeclCommand();

  /**
   * Creates an instance of {@link VarDeclCommand} with the given children.
   *
   * @return the new instance of VarDeclCommand.
   */
  VarDeclCommand createVarDeclCommand( net.sourceforge.czt.z.ast.DeclList  declList, CircusAction  circusAction);

  /**
   * Creates an instance of {@link InputField}.
   *
   * @return the new instance of InputField.
   */
  InputField createInputField();

  /**
   * Creates an instance of {@link InputField} with the given children.
   *
   * @return the new instance of InputField.
   */
  InputField createInputField( net.sourceforge.czt.z.ast.RefName  variable, net.sourceforge.czt.z.ast.Pred  restriction);

  /**
   * Creates an instance of {@link RefinementConjPara}.
   *
   * @return the new instance of RefinementConjPara.
   */
  RefinementConjPara createRefinementConjPara();

  /**
   * Creates an instance of {@link RefinementConjPara} with the given children.
   *
   * @return the new instance of RefinementConjPara.
   */
  RefinementConjPara createRefinementConjPara( CircusAction  specification, CircusAction  implementation, Model  model);

  /**
   * Creates an instance of {@link ActionSignature}.
   *
   * @return the new instance of ActionSignature.
   */
  ActionSignature createActionSignature();

  /**
   * Creates an instance of {@link ActionSignature} with the given children.
   *
   * @return the new instance of ActionSignature.
   */
  ActionSignature createActionSignature( net.sourceforge.czt.z.ast.DeclName  actionName, net.sourceforge.czt.z.ast.Signature  formalParams, net.sourceforge.czt.z.ast.Signature  localVars, net.sourceforge.czt.z.ast.Signature  usedChannels);

  /** Creates a parameterless call action. This is a convenience method */
  CallAction createCallAction(RefName name);
  
  /** Creates a parameterless call process with empty generic actuals. This is a convenience method */
  CallProcess createCallProcess(RefName name);
  
  /** Creates an empty BasicNameSet. This is a convenience method */
  NameSet createEmptyNameSet();

  /** Creates an empty BasicChannelSet. This is a convenience method */
  ChannelSet createEmptyChannelSet();
  
  /** Creates an interleave action with empty (basic) name sets. This is a convenience method */    
  InterleaveAction createInterleaveAction(CircusAction left, CircusAction right);
  
  
}
