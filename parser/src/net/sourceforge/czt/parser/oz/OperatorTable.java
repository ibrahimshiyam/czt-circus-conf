/**
Copyright 2003 Tim Miller
This file is part of the CZT project.

The CZT project contains free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 2 of the License, or
(at your option) any later version.

The CZT project is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with CZT; if not, write to the Free Software
Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
*/
package net.sourceforge.czt.parser.oz;

import java.util.*;

import net.sourceforge.czt.base.ast.*;
import net.sourceforge.czt.z.ast.*;
import net.sourceforge.czt.util.CztException;

/**
 * An operator table records each operator and its integer value.
 */
public class OperatorTable
{
  /** The different types of templates. */
  public static final int PREFIX = 1;
  public static final int POSTFIX = PREFIX + 1;
  public static final int INFIX = POSTFIX + 1;
  public static final int NOFIX = INFIX + 1;

  /** The name of the prelude section */
  public static final String PRELUDE = "prelude";

  /** The function of all sections to their immediate parents */
  protected Map mParents_ = new HashMap();

  /** The current section's parents. */
  protected Set mCurrentParents_ = new HashSet();

  /** The current section. */
  protected String mSection_ = null;

  /** The operators. */
  protected Set mOperators_ = new HashSet();

  /** The operator names - allows hash lookup of names */
  protected Set mOperatorNames_ = new HashSet();

  /**
   * Construct a new operator table.
   */
  public OperatorTable()
  {
  }

  /**
   * Add an operatior with a specified prefix. Other information is
   * retrieved from the OptempPara
   * @param fix the "fix" e.g. OperatorTable.PREFIX
   * @param otp the operator template paragraph containing the info
   */
  public void add(int fix, OptempPara otp)
  {
    //TODO: throw an exception if an operator is defined twice with
    //difference precedences or associativities, or if two operators
    //with the same precedence and associativity are declared in the
    //same scope
    switch (fix)
    {
        case PREFIX:
          addPrefix(otp);
          break;
        case POSTFIX:
          addPostfix(otp);
          break;
        case INFIX:
          addInfix(otp);
          break;
        case NOFIX:
          addNofix(otp);
          break;
        default:
          //do nothing
    }
  }

  /**
   * Set the current section.
   * @param section the section
   */
  public void setSection(String section)
  {
    endSection();
    mSection_ = new String(section);
  }

  /**
   * @return the current section
   */
  public String getSection()
  {
    return mSection_;
  }

  /**
   * Add a parent to the current section.
   * @param parent the parent to be added
   */
  public void addParent(String parent)
  {
    //add the parent as a current parents
    mCurrentParents_.add(parent);

    //get the current section's list of parents
    Set parents = (Set) mParents_.get(mSection_);

    //add the parents to the list of the current section's parents
    if (parents == null) {
      parents = new HashSet();
    }
    parents.add(parent);
    mParents_.put(mSection_, parents);

    //add the transitive parents
    mCurrentParents_.addAll(getTransitiveParents(parent));
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
   * Lookup the int token value of a symbol, e.g. Sym.PRE
   * @param symbol the string value of the symbol
   * @return the int token value of symbol
   * Assumes that symbols are never given the value -1
   */
  public int lookup(String symbol)
  {
    int result = -1;
    String section = null;

    DeclName dn = Strokes.getWordAndStroke(symbol);
    String word = dn.getWord();

    OperatorInfo op = getOperatorInfo(word);
    if (op != null) {
      result = op.getType();
      section = op.getSection();
    }

    //true if and only if the symbol was defined in this section,
    //or this section's parents (the prelude will always be a section)
    //or the specification is anonymous (i.e. all operators are available)
    return (mCurrentParents_.contains(section) ||
            (mSection_ != null && mSection_.equals(section)) ||
            (section != null && section.equals(PRELUDE)) ||
            mSection_ == null) ?
      result :
      -1;
  }

  private OperatorInfo getOperatorInfo(String word)
  {
    OperatorInfo result = null;

    for (Iterator iter = mOperators_.iterator(); iter.hasNext(); ) {
      OperatorInfo op = (OperatorInfo) iter.next();
      if (op.getName().equals(word)) {
	result = op;
        break;
      }
    }
    return result;
  }

  /**
   * Lookup the precedence of an operator
   * @param symbol the string value of the symbol
   * @return the precedence of symbol, 0 if it is not an operator
   */
  public int getPrec(String symbol)
  {
    int result = 0;
    String section = null;

    DeclName dn = Strokes.getWordAndStroke(symbol);
    String word = dn.getWord();

    OperatorInfo op = getOperatorInfo(word);
    if (op != null) {
      result = op.getPrec();
      section = op.getSection();
    }

    //true if and only if the symbol was defined in this section,
    //or this section's parents (the prelude will always be a section)
    //or the specification is anonymous (i.e. all operators are available)
    return (mCurrentParents_.contains(section) ||
            (mSection_ != null && mSection_.equals(section)) ||
            (section != null && section.equals(PRELUDE)) ||
            mSection_ == null) ?
      result :
      0;
  }

  /**
   * Lookup the associativity of an operator
   * @param symbol the string value of the symbol
   * @return the associativity of symbol, null if it is not an operator
   */
  public Assoc getAssoc(String symbol)
  {
    Assoc result = null;
    String section = null;

    DeclName dn = Strokes.getWordAndStroke(symbol);
    String word = dn.getWord();

    OperatorInfo op = getOperatorInfo(word);
    if (op != null) {
      result = op.getAssoc();
      section = op.getSection();
    }

    //true if and only if the symbol was defined in this section,
    //or this section's parents (the prelude will always be a section)
    //or the specification is anonymous (i.e. all operators are available)
    return (mCurrentParents_.contains(section) ||
            (mSection_ != null && mSection_.equals(section)) ||
            (section != null && section.equals(PRELUDE)) ||
            mSection_ == null) ?
      result :
      null;
  }

  //get the transitive parents of a section
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
    for (Iterator iter = mOperators_.iterator(); iter.hasNext(); ) {
      OperatorInfo op = (OperatorInfo) iter.next();
      System.err.println(op.getName() + ": " + getType(op.getType()));
    }
  }

  /**
   * Returns the type as a string (for debugging purposes).
   */
  public static String getType(int type)
  {
    String result = null;
    switch (type) {
        case Sym.PREP:
          result = "PREP";
          break;
        case Sym.PRE:
          result = "PRE";
          break;
        case Sym.POSTP:
          result = "POSTP";
          break;
        case Sym.POST:
          result = "POST";
          break;
        case Sym.IP:
          result = "IP";
          break;
        case Sym.I:
          result = "I";
          break;
        case Sym.LP:
          result = "LP";
          break;
        case Sym.L:
          result = "L";
          break;
        case Sym.ELP:
          result = "ELP";
          break;
        case Sym.EL:
          result = "EL";
          break;
        case Sym.ERP:
          result = "ERP";
          break;
        case Sym.ER:
          result = "ER";
          break;
        case Sym.SRP:
          result = "SRP";
          break;
        case Sym.SR:
          result = "SR";
          break;
        case Sym.EREP:
          result = "EREP";
          break;
        case Sym.ERE:
          result = "ERE";
          break;
        case Sym.SREP:
          result = "SREP";
          break;
        case Sym.SRE:
          result = "SRE";
          break;
        case Sym.ES:
          result = "ES";
          break;
        case Sym.SS:
          result = "SS";
          break;
        default:
          result = "NOT_FOUND";
    }
    return result;
  }

  private void addPrefix(OptempPara otp)
  {
    List words = otp.getOper();

    int start = 1;
    int finish = words.size() - 4;

    if (words.size() < 2) {
      lessThan2Exception();
    }
    else if (words.size() == 2) {
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
    int start = 2;
    int finish = words.size() - 3;

    if (words.size() < 2) {
      lessThan2Exception();
    }
    else if (words.size() == 2) {
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
    int start = 2;
    int finish = words.size() - 4;

    if (words.size() < 2) {
      lessThan2Exception();
    }
    else if (words.size() == 3) {
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
    int start = 1;
    int finish = words.size() - 2;

    addLOrLp(otp);
    addEsOrSsList(otp, start, finish);
    addErOrSrOrErpOrSrp(otp);
  }

  private void addPreOrPrep(OptempPara otp)
  {
    List words = otp.getOper();
    int namePosition = 0;

    int type = otp.getCat().equals(Cat.Relation) ?
      Sym.PREP :
      Sym.PRE;

    addOp(words, namePosition, type, otp.getPrec(), otp.getAssoc());
  }

  private void addLOrLp(OptempPara otp)
  {
    List words = otp.getOper();
    int namePosition = 0;

    int type = otp.getCat().equals(Cat.Relation) ?
      Sym.LP :
      Sym.L;

    addOp(words, namePosition, type, otp.getPrec(), otp.getAssoc());
  }

  private void addPostOrPostp(OptempPara otp)
  {
    List words = otp.getOper();
    int namePosition = 1;

    int type = otp.getCat().equals(Cat.Relation) ?
      Sym.POSTP :
      Sym.POST;

    addOp(words, namePosition, type, otp.getPrec(), otp.getAssoc());
  }

  private void addElOrElp(OptempPara otp)
  {
    List words = otp.getOper();
    int namePosition = 1;

    int type = otp.getCat().equals(Cat.Relation) ?
      Sym.ELP :
      Sym.EL;

    addOp(words, namePosition, type, otp.getPrec(), otp.getAssoc());
  }

  private void addEsOrSsList(OptempPara otp, int start, int finish)
  {
    List words = otp.getOper();

    for (int i = start; i < finish; i += 2) {
      int type =
        isSeq(words, i) ?
        Sym.SS :
        Sym.ES;

      int namePosition = i + 1;
      addOp(words, namePosition, type, otp.getPrec(), otp.getAssoc());
    }
  }

  private void addErOrSrOrErpOrSrp(OptempPara otp)
  {
    List words = otp.getOper();
    int type = -1;
    int opPosition = words.size() - 2;
    int namePosition = words.size() - 1;

    if (otp.getCat().equals(Cat.Relation)) {
      type = isSeq(words, opPosition) ?
        Sym.SRP :
        Sym.ERP;
    }
    else {
      type = isSeq(words, opPosition) ?
        Sym.SR :
        Sym.ER;
    }

    addOp(words, namePosition, type, otp.getPrec(), otp.getAssoc());
  }

  private void addEreOrSreOrErepOrSRep(OptempPara otp)
  {
    List words = otp.getOper();
    int type = -1;
    int opPosition = words.size() - 3;
    int namePosition = words.size() - 2;

    if (otp.getCat().equals(Cat.Relation)) {
      type = isSeq(words, opPosition) ?
        Sym.SREP :
        Sym.EREP;
    }
    else {
      type = isSeq(words, opPosition) ?
        Sym.SRE :
        Sym.ERE;
    }

    addOp(words, namePosition, type, otp.getPrec(), otp.getAssoc());
  }

  private void addIOrIp(OptempPara otp)
  {
    List words = otp.getOper();
    int namePosition = 1;

    int type = otp.getCat().equals(Cat.Relation) ?
      Sym.IP :
      Sym.I;

    addOp(words, namePosition, type, otp.getPrec(), otp.getAssoc());
  }

  private void addOp(String name, int type, Integer prec, Assoc assoc)
  {
    OperatorInfo op =
      new OperatorInfo(name, mSection_, type, prec, assoc);
    mOperators_.add(op);
  }

  private void addOp(List words, int namePosition, int type, 
		     Integer prec, Assoc assoc)
  {
    String name = getName(words.get(namePosition));
    addOp(name, type, prec, assoc);
  }

  //convert a DeclName to its string representation
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

  private void lessThan2Exception()
  {
    throw new CztException("Error: operator template with less " +
			   "than 2 arguments");
  }

  /**
   * An operator
   */
  private class OperatorInfo
  {
    /** The "name" of the token. */
    protected String mName_;

    /** The section in which the operator is declared. */
    protected String mSection_;

    /** The type of the token (e.g. Sym.IP). */
    protected int mType_;

    /** The precedence of the token */
    protected int mPrec_;

    /** The associativity of the token */
    protected Assoc mAssoc_;

    /**
     * Construct a new operator.
     */
    public OperatorInfo()
    {
      mName_ = new String();
      mSection_ = new String();
      mType_ = -1;
      mPrec_ = -1;
      mAssoc_ = null;
    }

    /**
     * Construct a new operator from the given info.
     */
    public OperatorInfo(String name, String section, int type, 
			Integer prec, Assoc assoc)
    {
      mName_ = new String(name);
      mSection_ = (section == null) ? null : new String(section);
      mType_ = type;
      mPrec_ = prec.intValue();
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
    public int getType()
    {
      return mType_;
    }

    /**
     * Return the precedence of this operator
     */
    public int getPrec()
    {
      return mPrec_;
    }

    /**
     * Return the associativity of this operator
     */
    public Assoc getAssoc()
    {
      return mAssoc_;
    }
  }
}
