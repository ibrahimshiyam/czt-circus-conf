/*
Copyright (C) 2003, 2004 Tim Miller, Petra Malik
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

package net.sourceforge.czt.parser.util;

import java.util.*;

import net.sourceforge.czt.base.ast.*;
import net.sourceforge.czt.z.ast.*;
import net.sourceforge.czt.util.CztException;
import net.sourceforge.czt.z.util.ZString;

/**
 * An operator table records each operator and its integer value.
 */
public class OperatorTable
{
  /** no precedence given */
  public static final int NO_PREC = -1;

  /** The name of the prelude section. */
  public static final String PRELUDE = "prelude";

  /**
   * A mapping from section names to a set of its (immediate) parents.
   */
  protected Map/*<String,Set<String>>*/ mParents_ = new HashMap();

  /**
   * The current section's ancestors.
   * This contains its parents, the parents of its parents, etc.
   */
  protected Set/*<String>*/ mCurrentParents_ = new HashSet();

  /** The name of the current section. */
  protected String mSection_ = null;

  /** The operators. */
  protected Map/*<String, OperatorInfo>*/ mOperators_ = new HashMap();

  /**
   * Construct a new operator table.
   */
  public OperatorTable()
  {
  }

  /**
   * Add an operator. Information is retrieved from the OptempPara.
   * @param otp the operator template paragraph containing the info.
   */
  public void add(OptempPara otp)
  {
    //TODO: throw an exception if an operator is defined twice with
    //difference precedences or associativities, or if two operators
    //with the same precedence and associativity are declared in the
    //same scope
    List oper = otp.getOper();
    if (oper.size() < 2) {
      throw new CztException("Error: operator template with less " +
                             "than 2 arguments");
    }
    Oper first = (Oper) oper.get(0);
    Oper last = (Oper) oper.get(oper.size() - 1);
    if (first instanceof Operand) {
      if (last instanceof Operand) {
        addInfix(otp);
        return;
      }
      addPostfix(otp);
      return;
    }
    if (last instanceof Operand) {
      addPrefix(otp);
      return;
    }
    addNofix(otp);
    return;
  }

  /**
   * Set the current section.
   * @param section the section
   */
  public void setSection(String section)
  {
    endSection();
    mSection_ = section;
    mParents_.put(section, new HashSet());
  }

  /**
   * @return the current section
   */
  public String getSection()
  {
    return mSection_;
  }

  /**
   * Returns true if and only if the specified section has been parsed.
   *
   * @param section the section
   * @return true if and only if the specified section has been parsed
   */
  public boolean isParsed(String section)
  {
    return mParents_.get(section) != null;
  }

  /**
   * Add a parent to the current section.
   * @param parent the name of a section to be added as a parent.
   */
  public void addParent(String parent)
  {
    mCurrentParents_.add(parent);
    mCurrentParents_.addAll(getTransitiveParents(parent));

    Set parents = (Set) mParents_.get(mSection_);
    if (parents == null) {
      parents = new HashSet();
      mParents_.put(mSection_, parents);
    }
    parents.add(parent);
  }

  /**
   * End the current section.
   */
  public void endSection()
  {
    mCurrentParents_ = new HashSet();
    mSection_ = null;
  }

  /**
   * Lookup the int token value of a symbol, e.g. Sym.PRE.
   * Assumes that symbols are never given the value -1.
   *
   * @param symbol the string value of the symbol
   * @return the int token value of symbol
   */
  public OperatorTokenType lookup(String symbol)
  {
    OperatorTokenType result = null;
    String section = null;
    OperatorInfo op = getOperatorInfo(symbol);
    if (op != null) {
      result = op.getType();
      section = op.getSection();
    }
    return isInScope(section) ? result : null;
  }
  
  /**
   * Returns whether an operator defined in the given
   * section is in the scope of the current section or not.
   *
   * @return true iff the current section is anonymous
   *         (i.e. all operators are available)
   *         or the given section is the current section
   *         or one of its ancestors.
   *         Note that the prelude is always an ancestor.
   */
  private boolean isInScope(String section)
  {
    final boolean anonymous = mSection_ == null;
    if (! anonymous) {
      final boolean sectIsPrelude = PRELUDE.equals(section);
      final boolean sectIsCurrentSect = mSection_.equals(section);
      final boolean sectIsParent = mCurrentParents_.contains(section);
      return sectIsPrelude || sectIsCurrentSect || sectIsParent;
    }
    return true;
  }

  /**
   * Returns the operator info for a given symbol, e.g. Sym.PRE.
   *
   * @param symbol the string value of the symbol.
   */
  private OperatorInfo getOperatorInfo(String symbol)
  {
    DeclName dn = Strokes.getWordAndStroke(symbol);
    String word = dn.getWord();
    OperatorInfo result = (OperatorInfo) mOperators_.get(word);
    return result;
  }

  /**
   * Lookup the precedence of an operator.
   *
   * @param symbol the string value of the symbol
   * @return the precedence of symbol, NO_PREC if it is not an operator
   */
  public int getPrec(String symbol)
  {
    int result = NO_PREC;
    String section = null;
    OperatorInfo op = getOperatorInfo(symbol);
    if (op != null) {
      result = op.getPrec();
      section = op.getSection();
    }
    return isInScope(section) ? result : NO_PREC;
  }

  /**
   * Lookup the category of an operator.
   *
   * @param symbol the string value of the symbol
   * @return the category of symbol, null if it is not an operator
   */
  public Cat getCat(String symbol)
  {
    Cat result = null;
    String section = null;
    OperatorInfo op = getOperatorInfo(symbol);
    if (op != null) {
      result = op.getCat();
      section = op.getSection();
    }
    return isInScope(section) ? result : null;
  }

  /**
   * Lookup the associativity of an operator.
   *
   * @param symbol the string value of the symbol
   * @return the associativity of symbol, null if it is not an operator
   */
  public Assoc getAssoc(String symbol)
  {
    Assoc result = null;
    String section = null;
    OperatorInfo op = getOperatorInfo(symbol);
    if (op != null) {
      result = op.getAssoc();
      section = op.getSection();
    }
    return isInScope(section) ? result : null;
  }

  /**
   * Gets the transitive parents of a section.
   */
  private Set getTransitiveParents(String section) {
    Set result = new HashSet();

    //get the set of direct parents
    Set parents = (Set) mParents_.get(section);

    if (parents != null) {
      result.addAll(parents);

      //for each direct parent, get the transitive parents
      for (Iterator iter = parents.iterator(); iter.hasNext(); ) {
        String parent = (String) iter.next();
        Set transitiveParents = getTransitiveParents(parent);
        result.addAll(transitiveParents);
      }
    }
    return result;
  }

  /**
   * Dump the entire contents of the table (for debugging purposes).
   */
  public void dump()
  {
    for (Iterator iter = mOperators_.values().iterator(); iter.hasNext(); ) {
      OperatorInfo op = (OperatorInfo) iter.next();
      System.err.println(op.getName() + ": " + op.getType());
    }
  }

  private void addPrefix(OptempPara otp)
  {
    List words = otp.getOper();

    final int start = 1;
    final int finish = words.size() - 4;
    if (words.size() == 2) {
      //"PRE _ | PREP _"
      addPreOrPrep(otp);
    }
    else {
      //"L  { _ (ES | SS) } _ (ERE | SRE) _ | "
      //"LP { _ (ES | SS) } _ (EREP | SREP) _"
      addLOrLp(otp);
      addEsOrSsList(otp, start, finish);
      addEreOrSreOrErepOrSRep(otp);
    }
  }

  private void addPostfix(OptempPara otp)
  {
    List words = otp.getOper();
    final int start = 2;
    final int finish = words.size() - 3;
    if (words.size() == 2) {
      //"_ POST | _ POSTP"
      addPostOrPostp(otp);
    }
    else {
      //"_ EL { _ (ES | SS) } _ (ER | SR) |"
      //"_ ELP { _ (ES | SS) } _ (ERP | SRP)"

      addElOrElp(otp);
      addEsOrSsList(otp, start, finish);
      addErOrSrOrErpOrSrp(otp);
    }
  }

  private void addInfix(OptempPara otp)
  {
    List words = otp.getOper();
    final int start = 2;
    final int finish = words.size() - 4;
    if (words.size() == 3) {
      addIOrIp(otp);
    }
    else {
      addElOrElp(otp);
      addEsOrSsList(otp, start, finish);
      addEreOrSreOrErepOrSRep(otp);
    }
  }

  private void addNofix(OptempPara otp)
  {
    List words = otp.getOper();
    final int start = 1;
    final int finish = words.size() - 2;

    addLOrLp(otp);
    addEsOrSsList(otp, start, finish);
    addErOrSrOrErpOrSrp(otp);
  }

  private void addPreOrPrep(OptempPara otp)
  {
    List words = otp.getOper();
    final int namePosition = 0;

    final OperatorTokenType type = otp.getCat().equals(Cat.Relation) ?
      OperatorTokenType.PREP :
      OperatorTokenType.PRE;

    addOp(words, namePosition, type, otp.getCat(), otp.getPrec(), otp.getAssoc());
  }

  private void addLOrLp(OptempPara otp)
  {
    List words = otp.getOper();
    final int namePosition = 0;

    final OperatorTokenType type = otp.getCat().equals(Cat.Relation) ?
      OperatorTokenType.LP :
      OperatorTokenType.L;

    addOp(words, namePosition, type, otp.getCat(), otp.getPrec(), otp.getAssoc());
  }

  private void addPostOrPostp(OptempPara otp)
  {
    List words = otp.getOper();
    final int namePosition = 1;

    final OperatorTokenType type = otp.getCat().equals(Cat.Relation) ?
      OperatorTokenType.POSTP :
      OperatorTokenType.POST;

    addOp(words, namePosition, type, otp.getCat(), otp.getPrec(), otp.getAssoc());
  }

  private void addElOrElp(OptempPara otp)
  {
    List words = otp.getOper();
    final int namePosition = 1;

    final OperatorTokenType type = otp.getCat().equals(Cat.Relation) ?
      OperatorTokenType.ELP :
      OperatorTokenType.EL;

    addOp(words, namePosition, type, otp.getCat(), otp.getPrec(), otp.getAssoc());
  }

  private void addEsOrSsList(OptempPara otp, int start, int finish)
  {
    List words = otp.getOper();

    for (int i = start; i < finish; i += 2) {
      OperatorTokenType type =
        isSeq(words, i) ?
        OperatorTokenType.SS :
        OperatorTokenType.ES;

      int namePosition = i + 1;
      addOp(words, namePosition, type, otp.getCat(), otp.getPrec(), otp.getAssoc());
    }
  }

  private void addErOrSrOrErpOrSrp(OptempPara otp)
  {
    List words = otp.getOper();
    OperatorTokenType type = null;
    final int opPosition = words.size() - 2;
    final int namePosition = words.size() - 1;

    if (otp.getCat().equals(Cat.Relation)) {
      type = isSeq(words, opPosition) ?
        OperatorTokenType.SRP :
        OperatorTokenType.ERP;
    }
    else {
      type = isSeq(words, opPosition) ?
        OperatorTokenType.SR :
        OperatorTokenType.ER;
    }

    addOp(words, namePosition, type, otp.getCat(), otp.getPrec(), otp.getAssoc());
  }

  private void addEreOrSreOrErepOrSRep(OptempPara otp)
  {
    List words = otp.getOper();
    OperatorTokenType type = null;
    final int opPosition = words.size() - 3;
    final int namePosition = words.size() - 2;

    if (otp.getCat().equals(Cat.Relation)) {
      type = isSeq(words, opPosition) ?
        OperatorTokenType.SREP :
        OperatorTokenType.EREP;
    }
    else {
      type = isSeq(words, opPosition) ?
        OperatorTokenType.SRE :
        OperatorTokenType.ERE;
    }

    addOp(words, namePosition, type, otp.getCat(), otp.getPrec(), otp.getAssoc());
  }

  private void addIOrIp(OptempPara otp)
  {
    List words = otp.getOper();
    final int namePosition = 1;

    final OperatorTokenType type = otp.getCat().equals(Cat.Relation) ?
      OperatorTokenType.IP :
      OperatorTokenType.I;

    addOp(words, namePosition, type, otp.getCat(), otp.getPrec(), otp.getAssoc());
  }

  private void addOp(String name, OperatorTokenType type, Cat cat, Integer prec, Assoc assoc)
  {
    OperatorInfo op =
      new OperatorInfo(name, mSection_, type, cat, prec, assoc);
    mOperators_.put(name, op);
  }

  private void addOp(List words, int namePosition, OperatorTokenType type, 
		     Cat cat, Integer prec, Assoc assoc)
  {
    String name = getName(words.get(namePosition));
    addOp(name, type, cat, prec, assoc);
  }

  /**
   * Converts a DeclName to its string representation.
   */
  private String getName(Object o)
  {
    String result = null;

    if (o instanceof Operator) {
      Operator op = (Operator) o;
      result = op.getWord();
    }
    else {
      throw new CztException("Attempt to add non-operator " + 
			     "into operator table");
    }
    return result;
  }

  private boolean isSeq(List words, int i)
  {
    return (((Operand) words.get(i)).getList()).booleanValue();
  }

  /**
   * An operator token.
   * For example, the operator  _ \limg _ \rimg  contains two
   * operator tokens, \limg and \rimg (actually their Unicode equivalents),
   * of type EL and ER, respectively.
   * Each of these becomes one OperatorInfo object.
   */
  private class OperatorInfo
  {
    /** The "name" of the token. */
    protected String mName_;

    /** The section in which the operator is declared. */
    protected String mSection_;

    /** The type of the token (e.g. Sym.IP). */
    protected OperatorTokenType mType_;

    /** The category of the token. */
    protected Cat mCat_;

    /** The precedence of the token. */
    protected int mPrec_;

    /** The associativity of the token. */
    protected Assoc mAssoc_;

    /**
     * Construct a new operator from the given info.
     */
    public OperatorInfo(String name, String section, OperatorTokenType type, 
			Cat cat, Integer prec, Assoc assoc)
    {
      mName_ = name;
      mSection_ = section;
      mType_ = type;
      mCat_ = cat;
      if (prec != null) {
        mPrec_ = prec.intValue();
      }
      else {
        mPrec_ = -1;
      }
      mAssoc_ = assoc;
    }

    /**
     * Return the name of this operator.
     */
    public String getName()
    {
      return mName_;
    }

    /**
     * Return the section in which this operator was declared.
     */
    public String getSection()
    {
      return mSection_;
    }

    /**
     * Return the type of this operator.
     */
    public OperatorTokenType getType()
    {
      return mType_;
    }

    /**
     * Return the category of this operator.
     */
    public Cat getCat()
    {
      return mCat_;
    }

    /**
     * Return the precedence of this operator.
     */
    public int getPrec()
    {
      return mPrec_;
    }

    /**
     * Return the associativity of this operator.
     */
    public Assoc getAssoc()
    {
      return mAssoc_;
    }
  }
}
