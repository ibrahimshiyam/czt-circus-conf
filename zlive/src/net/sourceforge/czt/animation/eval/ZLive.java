/*
  ZLive - A Z animator -- Part of the CZT Project.
  Copyright 2005 Mark Utting

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

import java.io.*;
import java.util.*;
import java.util.logging.*;

import net.sourceforge.czt.parser.util.*;
import net.sourceforge.czt.parser.util.ParseException;
import net.sourceforge.czt.base.ast.*;
import net.sourceforge.czt.z.ast.*;
import net.sourceforge.czt.typecheck.z.ErrorAnn;
import net.sourceforge.czt.typecheck.z.TypeCheckUtils;
import net.sourceforge.czt.util.*;
import net.sourceforge.czt.z.util.Factory;
import net.sourceforge.czt.parser.z.ParseUtils;
import net.sourceforge.czt.session.*;
import net.sourceforge.czt.animation.eval.flatpred.*;
import net.sourceforge.czt.print.z.PrintUtils;

public class ZLive
{
  private static final Logger sLogger
  = Logger.getLogger("net.sourceforge.czt.animation.eval");
  
  /** The name and current version of ZLive */
  public static final String banner = "ZLive version 0.2, (C) 2005, Mark Utting";
  
  private Factory factory_;

  private /*@non_null@*/ Flatten flatten_;
  
  private /*@non_null@*/ Preprocess preprocess_;
  
  /** A Writer interface to System.out. */
  protected PrintWriter writer_ = new PrintWriter(System.out);

  protected SectionManager sectman_;

  /** The name of the section in which all evaluations will be done.
      Evaluations are illegal until this is set.
   */
  protected String currSectName_;

  /** The definition table for the current section. */
  protected DefinitionTable defnTable_;

  /** Stores the code used in the most recent evaluation. */
  protected FlatPredList predlist_;

  private static long newNameNum = 0;

  private Map<String,String> properties_ = new HashMap<String,String>();
  public final String PROP_MARKUP = "markup";

  /** Generates a fresh temporary name. */
  public ZRefName createNewName()
  {
    // This is a temporary debugging aid, to detect some infinite loops.
    // Once we start evaluating larger terms it will need to be removed
    // (or at least the number increased!).
    if (newNameNum == 554) {
      Exception e = new Exception("infinite loop???  See ZLive.createNewName");
      StringWriter w = new StringWriter();
      e.printStackTrace(new PrintWriter(w));
      sLogger.fine("Stack dump: "+w.toString());
    }
    return factory_.createZRefName("tmp"+(newNameNum++));
  }

  /** Recognises the RefNames produced by createNewName. */
  public /*@pure@*/ boolean isNewName(/*@non_null@*/ ZRefName name) {
    String word = name.getWord();
    return word.matches("tmp[0-9]+");
  }

  public ZLive()
  {
    factory_ = new Factory();
    flatten_ = new Flatten(this);
    sectman_ = new SectionManager();
    sectman_.putCommands("zpatt");
    try {
	Source spec = new StringSource("\\begin{zsection} "
				       + "\\SECTION ZLiveDefault "
				       + "\\parents standard\\_toolkit "
				       + "\\end{zsection}");
	spec.setMarkup(Markup.LATEX);
	sectman_.put(new Key("ZLiveDefault",Source.class), spec);
	// This parses the above specification
	ZSect sec = (ZSect) sectman_.get(new Key("ZLiveDefault", ZSect.class));
	setCurrentSection(sec.getName());
    }
    catch (Exception e) {
      System.err.println("ERROR creating ZLiveDefault section: " + e);
      e.printStackTrace();
    }
    try {
        preprocess_ = new Preprocess(sectman_);
        preprocess_.setRules("/preprocess.tex");
    } catch (Exception e) {
      System.err.println("ERROR loading rules from preprocess.tex: " + e);
      e.printStackTrace();
    }
  }

  /**
   * Returns the factory used for creating AST objects.
   */
  public Factory getFactory()
  {
    return factory_;
  }

  /**
   * Sets the AST factory used for creating AST objects.
   **/
  public void setFactory(Factory fact)
  {
    factory_ = fact;
  }

  /** Get the current section manager. */
  public SectionManager getSectionManager()
  { return sectman_; }

   /** Set the section manager which will be used during evaluation. */
  //@ requires sm != null;
  public void setSectionManager(SectionManager sm)
  { sectman_ = sm; }

  /** Get a property. */
  public String getProperty(String key)
  {
    return properties_.get(key);
  }

  public Collection<String> propertyNames()
  {
    return properties_.keySet();
  }

  /** Sets a property. */
  public String setProperty(String key, String value)
  {
    return (String) properties_.put(key, value);
  }

  /** Unsets a property. */
  public String unsetProperty(String key)
  {
    return properties_.remove(key);
  }

  /** Get a flatten visitor. */
  public Flatten getFlatten()
  { return flatten_; }

  /** Which section evaluations are being done in. */
  public String getCurrentSection()
  { return currSectName_; }

  /** Say which section future evaluations will be done in.
   *  This checks that the given section is typechecked.
   */
  public void setCurrentSection(/*@non_null@*/String name)
    throws CommandException
  {
    Key key = new Key(name, DefinitionTable.class);
    DefinitionTable newTable = (DefinitionTable) sectman_.get(key);
    defnTable_ = newTable;
    currSectName_ = name;

    // now typecheck the section
    System.err.println("Setting current section to "+name);
    SectionManager manager = this.getSectionManager();
    ZSect sect = (ZSect) manager.get(new Key(name,ZSect.class));
    List<? extends ErrorAnn> errors = TypeCheckUtils.typecheck(sect, 
        manager, false, null);
    if (errors.size() > 0) {
      System.err.println("Warning: section "+name+" contains type errors.");
      //print any errors
      for (ErrorAnn next : errors) {
        System.err.println(next);
      }
    }
  }

  /** Evaluate a Pred.
      This throws some kind of EvalException if pred is too difficult
      to evaluate or contains an undefined expression.
      The input predicate must be type checked.
      @param pred  A net.sourceforge.czt.z.ast.Pred object.
      @return      Usually an instance of TruePred or FalsePred.
  */
  public Pred evalPred(Pred pred)
    throws EvalException
  {
    sLogger.entering("ZLive","evalPred");
    if (currSectName_ == null || defnTable_ == null) {
      throw new CztException("Must choose a section!");
    }
    // preprocess the predicate, to unfold things.
    pred = (Pred) preprocess_.preprocess(currSectName_, pred);
    
    predlist_ = new FlatPredList(this);
    predlist_.addPred(pred);
    Envir env0 = new Envir();
    Mode m = predlist_.chooseMode(env0);
    if (m == null)
      throw new EvalException("Cannot find mode to evaluate " + pred);
    predlist_.setMode(m);
    predlist_.startEvaluation();
    Pred result;
    if (predlist_.nextEvaluation())
      result = factory_.createTruePred();
    else
      result = factory_.createFalsePred();
    sLogger.exiting("ZLive","evalPred");
    return result;
  }

  /** Evaluate an Expr.
      This throws some kind of EvalException if expr is too difficult
      to evaluate or contains an undefined expression.
      The input expression must be type checked.
      @param expr  A net.sourceforge.czt.z.ast.Pred object.
      @return      Usually an instance of EvalSet, or some other expr.
  */
  public Expr evalExpr(Expr expr)
    throws EvalException
  {
    sLogger.entering("ZLive","evalExpr");
    if (currSectName_ == null || defnTable_ == null) {
      throw new CztException("Must choose a section!");
    }
    // preprocess the expr, to unfold things.
    expr = (Expr) preprocess_.preprocess(currSectName_, expr);
    
    predlist_ = new FlatPredList(this);
    ZRefName resultName = predlist_.addExpr(expr);
    Envir env0 = new Envir();
    Mode m = predlist_.chooseMode(env0);
    if (m == null)
      throw new EvalException("Cannot find mode to evaluate " + expr);
    predlist_.setMode(m);
    predlist_.startEvaluation();
    if ( ! predlist_.nextEvaluation())
        throw new CztException("No solution for expression");
    Expr result = predlist_.getOutputEnvir().lookup(resultName);
    sLogger.exiting("ZLive","evalExpr");
    return result;
  }

    public void printCode()
    {
      printCode(writer_);
    }

  /** Prints the list of FlatPreds used in the last call
    * to evalPred or evalExpr.
    */
    public void printCode(PrintWriter writer)
    {
      if(predlist_ == null) {
        writer.println("No previous evaluations");
      }
      else {
        try {
          if (predlist_.size() == 0)
            writer.println("Code is empty!");
          for (Iterator i = predlist_.iterator(); i.hasNext(); ) {
            FlatPred p = (FlatPred) i.next();
            writer.write("  " + p.toString() + "\n");
          }
          writer.flush();
        }
        catch (Exception e) {
          e.printStackTrace();
        }
      }
    }

  private void print(Term t, Writer writer) throws IOException
  {
    ZLiveToAstVisitor toAst = new ZLiveToAstVisitor();
    Term ast = (Term) t.accept(toAst);
    //writer.write(ast);
    PrintUtils.printUnicode(ast, writer, sectman_);
    writer.write("\n");
  }

  public static void main(String args[])
  {
    System.out.println(banner);
    System.out.println("To use ZLive from the command line, run TextUI.");
  }
}
