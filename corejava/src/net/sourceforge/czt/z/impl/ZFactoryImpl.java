
/******************************************************************************
DO NOT EDIT THIS FILE!  THIS FILE WAS GENERATED BY GNAST
FROM THE TEMPLATE FILE CoreFactoryImpl.vm.
ANY MODIFICATIONS TO THIS FILE WILL BE LOST UPON REGENERATION.

-------------------------------------------------------------------------------

Copyright 2003, 2004 Mark Utting
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

package net.sourceforge.czt.z.impl;

import net.sourceforge.czt.z.ast.*;

/**
 * <p>An implementation of the object factory for constructing
 * concrete Z terms.  Each factory method returns an instance
 * of the corresponding class provided in this package.</p>
 *
 * <p>To use a differnt implementation for a particular interface
 * overwrite the corresponding object factory methods
 * returning an instance of your implementation instead.
 * If there are two factory methods for this class, it is sufficient to
 * overwrite the default factory method (the method without arguments)
 * since the factory method with arguments first calls the default
 * factory method and then uses setter methods to set the children.</p>
 *
 * @author Gnast version 0.1
 */
public class ZFactoryImpl
  implements net.sourceforge.czt.z.ast.ZFactory
{
  public Freetype createFreetype()
  {
    Freetype zedObject = new FreetypeImpl();
    return zedObject;
  }

  public Freetype createFreetype(DeclName declName, java.util.List branch)
  {
    Freetype zedObject = createFreetype();
    zedObject.setDeclName(declName);
    if (branch != null) {
      zedObject.getBranch().addAll(branch);
    }
    return zedObject;
  }

  public Exists1Expr createExists1Expr()
  {
    Exists1Expr zedObject = new Exists1ExprImpl();
    return zedObject;
  }

  public Exists1Expr createExists1Expr(SchText schText, Expr expr)
  {
    Exists1Expr zedObject = createExists1Expr();
    zedObject.setSchText(schText);
    zedObject.setExpr(expr);
    return zedObject;
  }

  public ParenAnn createParenAnn()
  {
    ParenAnn zedObject = new ParenAnnImpl();
    return zedObject;
  }

  public NameNamePair createNameNamePair()
  {
    NameNamePair zedObject = new NameNamePairImpl();
    return zedObject;
  }

  public NameNamePair createNameNamePair(RefName oldName, DeclName newName)
  {
    NameNamePair zedObject = createNameNamePair();
    zedObject.setOldName(oldName);
    zedObject.setNewName(newName);
    return zedObject;
  }

  public LatexMarkupPara createLatexMarkupPara()
  {
    LatexMarkupPara zedObject = new LatexMarkupParaImpl();
    return zedObject;
  }

  public LatexMarkupPara createLatexMarkupPara(java.util.List directive)
  {
    LatexMarkupPara zedObject = createLatexMarkupPara();
    if (directive != null) {
      zedObject.getDirective().addAll(directive);
    }
    return zedObject;
  }

  public ApplExpr createApplExpr()
  {
    ApplExpr zedObject = new ApplExprImpl();
    return zedObject;
  }

  public ApplExpr createApplExpr(Expr leftExpr, Expr rightExpr, Boolean mixfix)
  {
    ApplExpr zedObject = createApplExpr();
    zedObject.setLeftExpr(leftExpr);
    zedObject.setRightExpr(rightExpr);
    zedObject.setMixfix(mixfix);
    return zedObject;
  }

  public LetExpr createLetExpr()
  {
    LetExpr zedObject = new LetExprImpl();
    return zedObject;
  }

  public LetExpr createLetExpr(SchText schText, Expr expr)
  {
    LetExpr zedObject = createLetExpr();
    zedObject.setSchText(schText);
    zedObject.setExpr(expr);
    return zedObject;
  }

  public Signature createSignature()
  {
    Signature zedObject = new SignatureImpl();
    return zedObject;
  }

  public Signature createSignature(java.util.List nameTypePair)
  {
    Signature zedObject = createSignature();
    if (nameTypePair != null) {
      zedObject.getNameTypePair().addAll(nameTypePair);
    }
    return zedObject;
  }

  public ConstDecl createConstDecl()
  {
    ConstDecl zedObject = new ConstDeclImpl();
    return zedObject;
  }

  public ConstDecl createConstDecl(DeclName declName, Expr expr)
  {
    ConstDecl zedObject = createConstDecl();
    zedObject.setDeclName(declName);
    zedObject.setExpr(expr);
    return zedObject;
  }

  public NextStroke createNextStroke()
  {
    NextStroke zedObject = new NextStrokeImpl();
    return zedObject;
  }

  public InStroke createInStroke()
  {
    InStroke zedObject = new InStrokeImpl();
    return zedObject;
  }

  public RefName createRefName()
  {
    RefName zedObject = new RefNameImpl();
    return zedObject;
  }

  public RefName createRefName(String word, java.util.List stroke, DeclName decl)
  {
    RefName zedObject = createRefName();
    zedObject.setWord(word);
    if (stroke != null) {
      zedObject.getStroke().addAll(stroke);
    }
    zedObject.setDecl(decl);
    return zedObject;
  }

  public MemPred createMemPred()
  {
    MemPred zedObject = new MemPredImpl();
    return zedObject;
  }

  public MemPred createMemPred(Expr leftExpr, Expr rightExpr, Boolean mixfix)
  {
    MemPred zedObject = createMemPred();
    zedObject.setLeftExpr(leftExpr);
    zedObject.setRightExpr(rightExpr);
    zedObject.setMixfix(mixfix);
    return zedObject;
  }

  public ProdType createProdType()
  {
    ProdType zedObject = new ProdTypeImpl();
    return zedObject;
  }

  public ProdType createProdType(java.util.List type)
  {
    ProdType zedObject = createProdType();
    if (type != null) {
      zedObject.getType().addAll(type);
    }
    return zedObject;
  }

  public ImpliesExpr createImpliesExpr()
  {
    ImpliesExpr zedObject = new ImpliesExprImpl();
    return zedObject;
  }

  public ImpliesExpr createImpliesExpr(Expr leftExpr, Expr rightExpr)
  {
    ImpliesExpr zedObject = createImpliesExpr();
    zedObject.setLeftExpr(leftExpr);
    zedObject.setRightExpr(rightExpr);
    return zedObject;
  }

  public MuExpr createMuExpr()
  {
    MuExpr zedObject = new MuExprImpl();
    return zedObject;
  }

  public MuExpr createMuExpr(SchText schText, Expr expr)
  {
    MuExpr zedObject = createMuExpr();
    zedObject.setSchText(schText);
    zedObject.setExpr(expr);
    return zedObject;
  }

  public OrPred createOrPred()
  {
    OrPred zedObject = new OrPredImpl();
    return zedObject;
  }

  public OrPred createOrPred(Pred leftPred, Pred rightPred)
  {
    OrPred zedObject = createOrPred();
    zedObject.setLeftPred(leftPred);
    zedObject.setRightPred(rightPred);
    return zedObject;
  }

  public ExistsExpr createExistsExpr()
  {
    ExistsExpr zedObject = new ExistsExprImpl();
    return zedObject;
  }

  public ExistsExpr createExistsExpr(SchText schText, Expr expr)
  {
    ExistsExpr zedObject = createExistsExpr();
    zedObject.setSchText(schText);
    zedObject.setExpr(expr);
    return zedObject;
  }

  public VarDecl createVarDecl()
  {
    VarDecl zedObject = new VarDeclImpl();
    return zedObject;
  }

  public VarDecl createVarDecl(java.util.List declName, Expr expr)
  {
    VarDecl zedObject = createVarDecl();
    if (declName != null) {
      zedObject.getDeclName().addAll(declName);
    }
    zedObject.setExpr(expr);
    return zedObject;
  }

  public NarrSect createNarrSect()
  {
    NarrSect zedObject = new NarrSectImpl();
    return zedObject;
  }

  public NarrSect createNarrSect(java.util.List content)
  {
    NarrSect zedObject = createNarrSect();
    if (content != null) {
      zedObject.getContent().addAll(content);
    }
    return zedObject;
  }

  public FreePara createFreePara()
  {
    FreePara zedObject = new FreeParaImpl();
    return zedObject;
  }

  public FreePara createFreePara(java.util.List freetype)
  {
    FreePara zedObject = createFreePara();
    if (freetype != null) {
      zedObject.getFreetype().addAll(freetype);
    }
    return zedObject;
  }

  public CompExpr createCompExpr()
  {
    CompExpr zedObject = new CompExprImpl();
    return zedObject;
  }

  public CompExpr createCompExpr(Expr leftExpr, Expr rightExpr)
  {
    CompExpr zedObject = createCompExpr();
    zedObject.setLeftExpr(leftExpr);
    zedObject.setRightExpr(rightExpr);
    return zedObject;
  }

  public BindExpr createBindExpr()
  {
    BindExpr zedObject = new BindExprImpl();
    return zedObject;
  }

  public BindExpr createBindExpr(java.util.List nameExprPair)
  {
    BindExpr zedObject = createBindExpr();
    if (nameExprPair != null) {
      zedObject.getNameExprPair().addAll(nameExprPair);
    }
    return zedObject;
  }

  public CondExpr createCondExpr()
  {
    CondExpr zedObject = new CondExprImpl();
    return zedObject;
  }

  public CondExpr createCondExpr(Pred pred, Expr leftExpr, Expr rightExpr)
  {
    CondExpr zedObject = createCondExpr();
    zedObject.setPred(pred);
    zedObject.setLeftExpr(leftExpr);
    zedObject.setRightExpr(rightExpr);
    return zedObject;
  }

  public ForallExpr createForallExpr()
  {
    ForallExpr zedObject = new ForallExprImpl();
    return zedObject;
  }

  public ForallExpr createForallExpr(SchText schText, Expr expr)
  {
    ForallExpr zedObject = createForallExpr();
    zedObject.setSchText(schText);
    zedObject.setExpr(expr);
    return zedObject;
  }

  public NarrPara createNarrPara()
  {
    NarrPara zedObject = new NarrParaImpl();
    return zedObject;
  }

  public NarrPara createNarrPara(java.util.List content)
  {
    NarrPara zedObject = createNarrPara();
    if (content != null) {
      zedObject.getContent().addAll(content);
    }
    return zedObject;
  }

  public TruePred createTruePred()
  {
    TruePred zedObject = new TruePredImpl();
    return zedObject;
  }

  public Directive createDirective()
  {
    Directive zedObject = new DirectiveImpl();
    return zedObject;
  }

  public Directive createDirective(String command, String unicode, DirectiveType type)
  {
    Directive zedObject = createDirective();
    zedObject.setCommand(command);
    zedObject.setUnicode(unicode);
    zedObject.setType(type);
    return zedObject;
  }

  public Operator createOperator()
  {
    Operator zedObject = new OperatorImpl();
    return zedObject;
  }

  public Operator createOperator(String word)
  {
    Operator zedObject = createOperator();
    zedObject.setWord(word);
    return zedObject;
  }

  public NumExpr createNumExpr()
  {
    NumExpr zedObject = new NumExprImpl();
    return zedObject;
  }

  public NumExpr createNumExpr(java.math.BigInteger value)
  {
    NumExpr zedObject = createNumExpr();
    zedObject.setValue(value);
    return zedObject;
  }

  public NameExprPair createNameExprPair()
  {
    NameExprPair zedObject = new NameExprPairImpl();
    return zedObject;
  }

  public NameExprPair createNameExprPair(DeclName name, Expr expr)
  {
    NameExprPair zedObject = createNameExprPair();
    zedObject.setName(name);
    zedObject.setExpr(expr);
    return zedObject;
  }

  public TupleSelExpr createTupleSelExpr()
  {
    TupleSelExpr zedObject = new TupleSelExprImpl();
    return zedObject;
  }

  public TupleSelExpr createTupleSelExpr(Expr expr, Integer select)
  {
    TupleSelExpr zedObject = createTupleSelExpr();
    zedObject.setExpr(expr);
    zedObject.setSelect(select);
    return zedObject;
  }

  public LambdaExpr createLambdaExpr()
  {
    LambdaExpr zedObject = new LambdaExprImpl();
    return zedObject;
  }

  public LambdaExpr createLambdaExpr(SchText schText, Expr expr)
  {
    LambdaExpr zedObject = createLambdaExpr();
    zedObject.setSchText(schText);
    zedObject.setExpr(expr);
    return zedObject;
  }

  public IffExpr createIffExpr()
  {
    IffExpr zedObject = new IffExprImpl();
    return zedObject;
  }

  public IffExpr createIffExpr(Expr leftExpr, Expr rightExpr)
  {
    IffExpr zedObject = createIffExpr();
    zedObject.setLeftExpr(leftExpr);
    zedObject.setRightExpr(rightExpr);
    return zedObject;
  }

  public IffPred createIffPred()
  {
    IffPred zedObject = new IffPredImpl();
    return zedObject;
  }

  public IffPred createIffPred(Pred leftPred, Pred rightPred)
  {
    IffPred zedObject = createIffPred();
    zedObject.setLeftPred(leftPred);
    zedObject.setRightPred(rightPred);
    return zedObject;
  }

  public FalsePred createFalsePred()
  {
    FalsePred zedObject = new FalsePredImpl();
    return zedObject;
  }

  public TypeEnvAnn createTypeEnvAnn()
  {
    TypeEnvAnn zedObject = new TypeEnvAnnImpl();
    return zedObject;
  }

  public TypeEnvAnn createTypeEnvAnn(java.util.List nameTypePair)
  {
    TypeEnvAnn zedObject = createTypeEnvAnn();
    if (nameTypePair != null) {
      zedObject.getNameTypePair().addAll(nameTypePair);
    }
    return zedObject;
  }

  public UnparsedZSect createUnparsedZSect()
  {
    UnparsedZSect zedObject = new UnparsedZSectImpl();
    return zedObject;
  }

  public UnparsedZSect createUnparsedZSect(java.util.List content)
  {
    UnparsedZSect zedObject = createUnparsedZSect();
    if (content != null) {
      zedObject.getContent().addAll(content);
    }
    return zedObject;
  }

  public UnparsedPara createUnparsedPara()
  {
    UnparsedPara zedObject = new UnparsedParaImpl();
    return zedObject;
  }

  public UnparsedPara createUnparsedPara(java.util.List content)
  {
    UnparsedPara zedObject = createUnparsedPara();
    if (content != null) {
      zedObject.getContent().addAll(content);
    }
    return zedObject;
  }

  public ImpliesPred createImpliesPred()
  {
    ImpliesPred zedObject = new ImpliesPredImpl();
    return zedObject;
  }

  public ImpliesPred createImpliesPred(Pred leftPred, Pred rightPred)
  {
    ImpliesPred zedObject = createImpliesPred();
    zedObject.setLeftPred(leftPred);
    zedObject.setRightPred(rightPred);
    return zedObject;
  }

  public NameTypePair createNameTypePair()
  {
    NameTypePair zedObject = new NameTypePairImpl();
    return zedObject;
  }

  public NameTypePair createNameTypePair(DeclName name, Type type)
  {
    NameTypePair zedObject = createNameTypePair();
    zedObject.setName(name);
    zedObject.setType(type);
    return zedObject;
  }

  public GenericType createGenericType()
  {
    GenericType zedObject = new GenericTypeImpl();
    return zedObject;
  }

  public GenericType createGenericType(java.util.List name, Type2 type2, Type2 optionalType)
  {
    GenericType zedObject = createGenericType();
    if (name != null) {
      zedObject.getName().addAll(name);
    }
    zedObject.setType2(type2);
    zedObject.setOptionalType(optionalType);
    return zedObject;
  }

  public SchText createSchText()
  {
    SchText zedObject = new SchTextImpl();
    return zedObject;
  }

  public SchText createSchText(java.util.List decl, Pred pred)
  {
    SchText zedObject = createSchText();
    if (decl != null) {
      zedObject.getDecl().addAll(decl);
    }
    zedObject.setPred(pred);
    return zedObject;
  }

  public Operand createOperand()
  {
    Operand zedObject = new OperandImpl();
    return zedObject;
  }

  public Operand createOperand(Boolean list)
  {
    Operand zedObject = createOperand();
    zedObject.setList(list);
    return zedObject;
  }

  public ProjExpr createProjExpr()
  {
    ProjExpr zedObject = new ProjExprImpl();
    return zedObject;
  }

  public ProjExpr createProjExpr(Expr leftExpr, Expr rightExpr)
  {
    ProjExpr zedObject = createProjExpr();
    zedObject.setLeftExpr(leftExpr);
    zedObject.setRightExpr(rightExpr);
    return zedObject;
  }

  public Branch createBranch()
  {
    Branch zedObject = new BranchImpl();
    return zedObject;
  }

  public Branch createBranch(DeclName declName, Expr expr)
  {
    Branch zedObject = createBranch();
    zedObject.setDeclName(declName);
    zedObject.setExpr(expr);
    return zedObject;
  }

  public TypeAnn createTypeAnn()
  {
    TypeAnn zedObject = new TypeAnnImpl();
    return zedObject;
  }

  public TypeAnn createTypeAnn(Type type)
  {
    TypeAnn zedObject = createTypeAnn();
    zedObject.setType(type);
    return zedObject;
  }

  public OptempPara createOptempPara()
  {
    OptempPara zedObject = new OptempParaImpl();
    return zedObject;
  }

  public OptempPara createOptempPara(java.util.List oper, Cat cat, Assoc assoc, Integer prec)
  {
    OptempPara zedObject = createOptempPara();
    if (oper != null) {
      zedObject.getOper().addAll(oper);
    }
    zedObject.setCat(cat);
    zedObject.setAssoc(assoc);
    zedObject.setPrec(prec);
    return zedObject;
  }

  public ExistsPred createExistsPred()
  {
    ExistsPred zedObject = new ExistsPredImpl();
    return zedObject;
  }

  public ExistsPred createExistsPred(SchText schText, Pred pred)
  {
    ExistsPred zedObject = createExistsPred();
    zedObject.setSchText(schText);
    zedObject.setPred(pred);
    return zedObject;
  }

  public NameSectTypeTriple createNameSectTypeTriple()
  {
    NameSectTypeTriple zedObject = new NameSectTypeTripleImpl();
    return zedObject;
  }

  public NameSectTypeTriple createNameSectTypeTriple(DeclName name, String sect, Type type)
  {
    NameSectTypeTriple zedObject = createNameSectTypeTriple();
    zedObject.setName(name);
    zedObject.setSect(sect);
    zedObject.setType(type);
    return zedObject;
  }

  public NegPred createNegPred()
  {
    NegPred zedObject = new NegPredImpl();
    return zedObject;
  }

  public NegPred createNegPred(Pred pred)
  {
    NegPred zedObject = createNegPred();
    zedObject.setPred(pred);
    return zedObject;
  }

  public PreExpr createPreExpr()
  {
    PreExpr zedObject = new PreExprImpl();
    return zedObject;
  }

  public PreExpr createPreExpr(Expr expr)
  {
    PreExpr zedObject = createPreExpr();
    zedObject.setExpr(expr);
    return zedObject;
  }

  public SectTypeEnvAnn createSectTypeEnvAnn()
  {
    SectTypeEnvAnn zedObject = new SectTypeEnvAnnImpl();
    return zedObject;
  }

  public SectTypeEnvAnn createSectTypeEnvAnn(java.util.List nameSectTypeTriple)
  {
    SectTypeEnvAnn zedObject = createSectTypeEnvAnn();
    if (nameSectTypeTriple != null) {
      zedObject.getNameSectTypeTriple().addAll(nameSectTypeTriple);
    }
    return zedObject;
  }

  public ExprPred createExprPred()
  {
    ExprPred zedObject = new ExprPredImpl();
    return zedObject;
  }

  public ExprPred createExprPred(Expr expr)
  {
    ExprPred zedObject = createExprPred();
    zedObject.setExpr(expr);
    return zedObject;
  }

  public GivenType createGivenType()
  {
    GivenType zedObject = new GivenTypeImpl();
    return zedObject;
  }

  public GivenType createGivenType(DeclName name)
  {
    GivenType zedObject = createGivenType();
    zedObject.setName(name);
    return zedObject;
  }

  public InclDecl createInclDecl()
  {
    InclDecl zedObject = new InclDeclImpl();
    return zedObject;
  }

  public InclDecl createInclDecl(Expr expr)
  {
    InclDecl zedObject = createInclDecl();
    zedObject.setExpr(expr);
    return zedObject;
  }

  public SchemaType createSchemaType()
  {
    SchemaType zedObject = new SchemaTypeImpl();
    return zedObject;
  }

  public SchemaType createSchemaType(Signature signature)
  {
    SchemaType zedObject = createSchemaType();
    zedObject.setSignature(signature);
    return zedObject;
  }

  public BindSelExpr createBindSelExpr()
  {
    BindSelExpr zedObject = new BindSelExprImpl();
    return zedObject;
  }

  public BindSelExpr createBindSelExpr(Expr expr, RefName name)
  {
    BindSelExpr zedObject = createBindSelExpr();
    zedObject.setExpr(expr);
    zedObject.setName(name);
    return zedObject;
  }

  public DeclName createDeclName()
  {
    DeclName zedObject = new DeclNameImpl();
    return zedObject;
  }

  public DeclName createDeclName(String word, java.util.List stroke, String id)
  {
    DeclName zedObject = createDeclName();
    zedObject.setWord(word);
    if (stroke != null) {
      zedObject.getStroke().addAll(stroke);
    }
    zedObject.setId(id);
    return zedObject;
  }

  public ForallPred createForallPred()
  {
    ForallPred zedObject = new ForallPredImpl();
    return zedObject;
  }

  public ForallPred createForallPred(SchText schText, Pred pred)
  {
    ForallPred zedObject = createForallPred();
    zedObject.setSchText(schText);
    zedObject.setPred(pred);
    return zedObject;
  }

  public OrExpr createOrExpr()
  {
    OrExpr zedObject = new OrExprImpl();
    return zedObject;
  }

  public OrExpr createOrExpr(Expr leftExpr, Expr rightExpr)
  {
    OrExpr zedObject = createOrExpr();
    zedObject.setLeftExpr(leftExpr);
    zedObject.setRightExpr(rightExpr);
    return zedObject;
  }

  public Spec createSpec()
  {
    Spec zedObject = new SpecImpl();
    return zedObject;
  }

  public Spec createSpec(java.util.List sect, String version, String author, java.util.Calendar modified, String source)
  {
    Spec zedObject = createSpec();
    if (sect != null) {
      zedObject.getSect().addAll(sect);
    }
    zedObject.setVersion(version);
    zedObject.setAuthor(author);
    zedObject.setModified(modified);
    zedObject.setSource(source);
    return zedObject;
  }

  public GenParamType createGenParamType()
  {
    GenParamType zedObject = new GenParamTypeImpl();
    return zedObject;
  }

  public GenParamType createGenParamType(DeclName name)
  {
    GenParamType zedObject = createGenParamType();
    zedObject.setName(name);
    return zedObject;
  }

  public LocAnn createLocAnn()
  {
    LocAnn zedObject = new LocAnnImpl();
    return zedObject;
  }

  public LocAnn createLocAnn(String loc, Integer line, Integer col)
  {
    LocAnn zedObject = createLocAnn();
    zedObject.setLoc(loc);
    zedObject.setLine(line);
    zedObject.setCol(col);
    return zedObject;
  }

  public PowerExpr createPowerExpr()
  {
    PowerExpr zedObject = new PowerExprImpl();
    return zedObject;
  }

  public PowerExpr createPowerExpr(Expr expr)
  {
    PowerExpr zedObject = createPowerExpr();
    zedObject.setExpr(expr);
    return zedObject;
  }

  public HideExpr createHideExpr()
  {
    HideExpr zedObject = new HideExprImpl();
    return zedObject;
  }

  public HideExpr createHideExpr(Expr expr, java.util.List name)
  {
    HideExpr zedObject = createHideExpr();
    zedObject.setExpr(expr);
    if (name != null) {
      zedObject.getName().addAll(name);
    }
    return zedObject;
  }

  public GivenPara createGivenPara()
  {
    GivenPara zedObject = new GivenParaImpl();
    return zedObject;
  }

  public GivenPara createGivenPara(java.util.List declName)
  {
    GivenPara zedObject = createGivenPara();
    if (declName != null) {
      zedObject.getDeclName().addAll(declName);
    }
    return zedObject;
  }

  public PowerType createPowerType()
  {
    PowerType zedObject = new PowerTypeImpl();
    return zedObject;
  }

  public PowerType createPowerType(Type2 type)
  {
    PowerType zedObject = createPowerType();
    zedObject.setType(type);
    return zedObject;
  }

  public AndExpr createAndExpr()
  {
    AndExpr zedObject = new AndExprImpl();
    return zedObject;
  }

  public AndExpr createAndExpr(Expr leftExpr, Expr rightExpr)
  {
    AndExpr zedObject = createAndExpr();
    zedObject.setLeftExpr(leftExpr);
    zedObject.setRightExpr(rightExpr);
    return zedObject;
  }

  public RenameExpr createRenameExpr()
  {
    RenameExpr zedObject = new RenameExprImpl();
    return zedObject;
  }

  public RenameExpr createRenameExpr(Expr expr, java.util.List nameNamePair)
  {
    RenameExpr zedObject = createRenameExpr();
    zedObject.setExpr(expr);
    if (nameNamePair != null) {
      zedObject.getNameNamePair().addAll(nameNamePair);
    }
    return zedObject;
  }

  public AndPred createAndPred()
  {
    AndPred zedObject = new AndPredImpl();
    return zedObject;
  }

  public AndPred createAndPred(Pred leftPred, Pred rightPred, Op op)
  {
    AndPred zedObject = createAndPred();
    zedObject.setLeftPred(leftPred);
    zedObject.setRightPred(rightPred);
    zedObject.setOp(op);
    return zedObject;
  }

  public ConjPara createConjPara()
  {
    ConjPara zedObject = new ConjParaImpl();
    return zedObject;
  }

  public ConjPara createConjPara(java.util.List declName, Pred pred)
  {
    ConjPara zedObject = createConjPara();
    if (declName != null) {
      zedObject.getDeclName().addAll(declName);
    }
    zedObject.setPred(pred);
    return zedObject;
  }

  public NumStroke createNumStroke()
  {
    NumStroke zedObject = new NumStrokeImpl();
    return zedObject;
  }

  public NumStroke createNumStroke(Integer number)
  {
    NumStroke zedObject = createNumStroke();
    zedObject.setNumber(number);
    return zedObject;
  }

  public ZSect createZSect()
  {
    ZSect zedObject = new ZSectImpl();
    return zedObject;
  }

  public ZSect createZSect(String name, java.util.List parent, java.util.List para)
  {
    ZSect zedObject = createZSect();
    zedObject.setName(name);
    if (parent != null) {
      zedObject.getParent().addAll(parent);
    }
    if (para != null) {
      zedObject.getPara().addAll(para);
    }
    return zedObject;
  }

  public ThetaExpr createThetaExpr()
  {
    ThetaExpr zedObject = new ThetaExprImpl();
    return zedObject;
  }

  public ThetaExpr createThetaExpr(Expr expr, java.util.List stroke)
  {
    ThetaExpr zedObject = createThetaExpr();
    zedObject.setExpr(expr);
    if (stroke != null) {
      zedObject.getStroke().addAll(stroke);
    }
    return zedObject;
  }

  public SetExpr createSetExpr()
  {
    SetExpr zedObject = new SetExprImpl();
    return zedObject;
  }

  public SetExpr createSetExpr(java.util.List expr)
  {
    SetExpr zedObject = createSetExpr();
    if (expr != null) {
      zedObject.getExpr().addAll(expr);
    }
    return zedObject;
  }

  public SetCompExpr createSetCompExpr()
  {
    SetCompExpr zedObject = new SetCompExprImpl();
    return zedObject;
  }

  public SetCompExpr createSetCompExpr(SchText schText, Expr expr)
  {
    SetCompExpr zedObject = createSetCompExpr();
    zedObject.setSchText(schText);
    zedObject.setExpr(expr);
    return zedObject;
  }

  public PipeExpr createPipeExpr()
  {
    PipeExpr zedObject = new PipeExprImpl();
    return zedObject;
  }

  public PipeExpr createPipeExpr(Expr leftExpr, Expr rightExpr)
  {
    PipeExpr zedObject = createPipeExpr();
    zedObject.setLeftExpr(leftExpr);
    zedObject.setRightExpr(rightExpr);
    return zedObject;
  }

  public RefExpr createRefExpr()
  {
    RefExpr zedObject = new RefExprImpl();
    return zedObject;
  }

  public RefExpr createRefExpr(RefName refName, java.util.List expr, Boolean mixfix)
  {
    RefExpr zedObject = createRefExpr();
    zedObject.setRefName(refName);
    if (expr != null) {
      zedObject.getExpr().addAll(expr);
    }
    zedObject.setMixfix(mixfix);
    return zedObject;
  }

  public NegExpr createNegExpr()
  {
    NegExpr zedObject = new NegExprImpl();
    return zedObject;
  }

  public NegExpr createNegExpr(Expr expr)
  {
    NegExpr zedObject = createNegExpr();
    zedObject.setExpr(expr);
    return zedObject;
  }

  public ProdExpr createProdExpr()
  {
    ProdExpr zedObject = new ProdExprImpl();
    return zedObject;
  }

  public ProdExpr createProdExpr(java.util.List expr)
  {
    ProdExpr zedObject = createProdExpr();
    if (expr != null) {
      zedObject.getExpr().addAll(expr);
    }
    return zedObject;
  }

  public DecorExpr createDecorExpr()
  {
    DecorExpr zedObject = new DecorExprImpl();
    return zedObject;
  }

  public DecorExpr createDecorExpr(Expr expr, Stroke stroke)
  {
    DecorExpr zedObject = createDecorExpr();
    zedObject.setExpr(expr);
    zedObject.setStroke(stroke);
    return zedObject;
  }

  public OutStroke createOutStroke()
  {
    OutStroke zedObject = new OutStrokeImpl();
    return zedObject;
  }

  public Parent createParent()
  {
    Parent zedObject = new ParentImpl();
    return zedObject;
  }

  public Parent createParent(String word)
  {
    Parent zedObject = createParent();
    zedObject.setWord(word);
    return zedObject;
  }

  public Exists1Pred createExists1Pred()
  {
    Exists1Pred zedObject = new Exists1PredImpl();
    return zedObject;
  }

  public Exists1Pred createExists1Pred(SchText schText, Pred pred)
  {
    Exists1Pred zedObject = createExists1Pred();
    zedObject.setSchText(schText);
    zedObject.setPred(pred);
    return zedObject;
  }

  public AxPara createAxPara()
  {
    AxPara zedObject = new AxParaImpl();
    return zedObject;
  }

  public AxPara createAxPara(java.util.List declName, SchText schText, Box box)
  {
    AxPara zedObject = createAxPara();
    if (declName != null) {
      zedObject.getDeclName().addAll(declName);
    }
    zedObject.setSchText(schText);
    zedObject.setBox(box);
    return zedObject;
  }

  public SchExpr createSchExpr()
  {
    SchExpr zedObject = new SchExprImpl();
    return zedObject;
  }

  public SchExpr createSchExpr(SchText schText)
  {
    SchExpr zedObject = createSchExpr();
    zedObject.setSchText(schText);
    return zedObject;
  }

  public TupleExpr createTupleExpr()
  {
    TupleExpr zedObject = new TupleExprImpl();
    return zedObject;
  }

  public TupleExpr createTupleExpr(java.util.List expr)
  {
    TupleExpr zedObject = createTupleExpr();
    if (expr != null) {
      zedObject.getExpr().addAll(expr);
    }
    return zedObject;
  }

}
