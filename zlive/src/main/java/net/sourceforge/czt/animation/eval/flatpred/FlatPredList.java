/*
  ZLive - A Z animator -- Part of the CZT Project.
  Copyright 2004 Mark Utting

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
package net.sourceforge.czt.animation.eval.flatpred;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import net.sourceforge.czt.animation.eval.Envir;
import net.sourceforge.czt.animation.eval.EvalException;
import net.sourceforge.czt.animation.eval.ZLive;
import net.sourceforge.czt.animation.eval.ZRefNameComparator;
import net.sourceforge.czt.session.CommandException;
import net.sourceforge.czt.z.ast.ConstDecl;
import net.sourceforge.czt.z.ast.Decl;
import net.sourceforge.czt.z.ast.Expr;
import net.sourceforge.czt.z.ast.Name;
import net.sourceforge.czt.z.ast.Pred;
import net.sourceforge.czt.z.ast.VarDecl;
import net.sourceforge.czt.z.ast.ZName;
import net.sourceforge.czt.z.ast.ZSchText;
import net.sourceforge.czt.z.util.Factory;

/** Manages a list of FlatPred predicates.
 *  Provides methods for adding declarations and predicates
 *  to the list, doing mode analysis of the list, and
 *  evaluating the list (giving a series of updated environments).
 *  <p>
 *  Here is a typical use of FlatPredList:
 *  </p>
 *  <pre>
 *  // Stage 1: Setup.
 *  predlist = new FlatPredList(zlive_instance);
 *  // now add decls, predicates, expressions etc.
 *  ZName resultName = predlist.addExpr(expr);
 *  Envir env0 = new Envir(); // empty environment
 *
 *  // Stage 2: Optimisation.
 *  predlist.inferBounds(new Bounds()); // does some static analysis
 *  // Ask the FlatPredList to optimise itself for efficient
 *  // evaluation, given the inputs in env0 (none in this case).
 *  Mode m = predlist.chooseMode(env0);
 *  if (m == null)
 *    throw new EvalException("Cannot find mode to evaluate " + expr);
 *  predlist.setMode(m);
 *
 *  // Stage 3: Evaluation.
 *  predlist.startEvaluation();
 *  while (predlist.nextEvaluation())
 *      // lookup the result and do something with it.
 *      System.out.println(predlist.getEnvir().lookup(resultName));
 *  </pre>
 */
public class FlatPredList extends FlatPred
{
  /** solutionsReturned_ == ALLDONE means that all possible
   *  solutions have already been returned.
   */
  private final int ALLDONE = -2;

  /** Evaluation is left-to-right if this is false,
   *  or smallest-mode-first if it is true.
   */
  public static final boolean optimize_ = true;

  /** Maximum acceptable cost for evaluating each FlatPredList */
  private static double maxCost_ = 1000000000;

  /** This stores the list of FlatPreds used in the current evaluation. */
  protected List<FlatPred> predlist_ = new ArrayList<FlatPred>();

  /** Records the bound variables in this list
   *  (Ignoring the tmp vars produced by Flatten).
   *  It is set up as Declarations are added.
   */
  protected/*@non_null@*/Set<ZName> boundVars_
    = new HashSet<ZName>();

  /** The ZLive animator that owns/uses this FlatPred list. */
  private /*@non_null@*/ ZLive zlive_;

  /** Creates an empty FlatPred list. */
  public FlatPredList(ZLive newZLive)
  {
    zlive_ = newZLive;
  }

  /** Set the maximum acceptable cost for evaluating each FlatPredList.
   *  If no mode can be found with fewer solutions than this,
   *  then chooseMode returns null, so that evaluation path will
   *  not be considered.
   */
  public static double getMaxCost()
  {
    return maxCost_;
  }

  public static void setMaxCost(double maxCost)
  {
    FlatPredList.maxCost_ = maxCost_;
  }

  /** Returns the number of FlatPreds in this list. */
  public int size()
  { return predlist_.size(); }

  /** An iterator over the FlatPreds in this list.
   *  This should be used as a read-only iterator.
   * @return the iterator
   */
  public /*@non_null@*/ Iterator<FlatPred> iterator()
  { return predlist_.iterator(); }

  /** Returns the bound variables of this FlatPredList,
   *  ignoring any temporary variables.
   */
  public /*@non_null@*/ Set<ZName> boundVars()
  { return boundVars_; }

  /** Returns the free variables of all the FlatPreds.
   *  This must not be called until after all addPred/Expr
   *  calls have been done.  The first time it is called, it
   *  calculates the free variables as the union of the free
   *  variables of all the FlatPreds in the list.
   *  It also sets the args list to contain these same variables.
   */
  @Override public /*@non_null@*/ Set<ZName> freeVars() {
    if (freeVars_ == null) {
      freeVars_ = new HashSet<ZName>(); // to remove duplicates
      for (FlatPred flat : predlist_) {
        for (ZName var : flat.freeVars()) {
          if ( ! boundVars_.contains(var))
            freeVars_.add(var);
        }
      }
      args_ = new ArrayList<ZName>(freeVars_);
      Collections.sort(args_, ZRefNameComparator.create()); // so the order is reproducible
    }
    return freeVars_;
  }

  /** @inheritDoc
   *  The first time this is called, it calculates freeVars and
   *  sets <code>args</code> to contain the same set of variables.
   */
  @Override public List<ZName> getArgs()
  {
    if (freeVars_ == null)
      freeVars();  // calculate freeVars and args.
    return args_;
  }

  /** Add one FlatPred to the FlatPred list.
   *  This is a low-level method, and addDecl or addPred
   *  should usually be used in preference to this method.
   *  This method should be called before chooseMode
   *  or freeVars are called.
   *
   * @param flat  the FlatPred to add.
   */
  public void add(/*@non_null@*/FlatPred flat)
  {
    assert freeVars_ == null;
    predlist_.add(flat);
  }

  /** Clients can use this to mark some names as
   *  being local to (bound by) this FlatPred list.
   * @param name
   */
  public void makeBound(ZName name)
  {
    boundVars_.add(name);
  }

  /** Clients can use this to say that the given
   *  variable is actually a free variable of this FlatPredList.
   *  If it was in the set of bound variables, this also
   *  removes it from that set.
   */
  public void makeFree(ZName name)
  {
    boundVars_.remove(name);
  }

  /** Adds a whole schema text to the FlatPred list.
   *  This method should be called before chooseMode
   *  or freeVars are called.
   *
   * @param stext
   */
  public void addSchText(/*@non_null@*/ZSchText stext)
  {
    assert freeVars_ == null;
    for (Decl d : stext.getZDeclList())
      addDecl(d);
    Pred p = stext.getPred();
    if (p != null)
      addPred(p);
  }

  /** Adds one declaration to the FlatPred list.
   *  This converts x,y:T into x \in T \land y \in T.
   *  (More precisely, into: tmp=T; x \in tmp; y \in tmp).
   *  This method should be called before chooseMode
   *  or freeVars are called.
   *
   * @param decl  May declare several variables.
   */
  public void addDecl(/*@non_null@*/Decl decl)
  {
    assert freeVars_ == null;
    try {
      if (decl instanceof VarDecl) {
        VarDecl vdecl = (VarDecl) decl;
        Expr type = vdecl.getExpr();
        ZName typeName = zlive_.getFlatten().flattenExpr(type, this);
        for (Name name : vdecl.getName()) {
          ZName zname = (ZName) name;
          boundVars_.add(zname);
          predlist_.add(new FlatMember(typeName, zname));
        }
      }
      else if (decl instanceof ConstDecl) {
        ConstDecl cdecl = (ConstDecl) decl;
        ZName zname = cdecl.getZName();
        boundVars_.add(zname);
        Expr expr = cdecl.getExpr();
        Pred mem = getFactory().createMemPred(zname, expr);
        zlive_.getFlatten().flattenPred(mem, this);
      }
      else {
        throw new EvalException("Unknown kind of Decl: " + decl);
      }
    }
    catch (CommandException exception) {
      throw new EvalException(exception);
    }
  }

  /** Adds one predicate to the FlatPred list.
   *  This method should be called before chooseMode
   *  or freeVars are called.
   *
   * @param pred  The Pred to flatten and add.
   */
  public void addPred(/*@non_null@*/Pred pred)
  {
    assert freeVars_ == null;
    try {
      zlive_.getFlatten().flattenPred(pred,this);
    }
    catch (CommandException exception) {
      throw new EvalException(exception);
    }
  }

  /** Adds one expression to the FlatPred list.
   *  This method should be called before chooseMode
   *  or freeVars are called.
   *  Returns the 'result' name that will be bound to the result
   *  of the expression after evaluation.  That is,
   *  after chooseMode, startEvaluation and nextEvaluation have
   *  been called, then getOutputEnvir().lookup(result) can
   *  be called to get the value of the evaluated expression.
   *
   * @param expr  The Expr to flatten and add.
   * @return      The result name.  This is marked as a free variable.
   */
  public ZName addExpr(/*@non_null@*/Expr expr)
  {
    assert freeVars_ == null;
    try {
      ZName result = zlive_.getFlatten().flattenExpr(expr, this);
      makeFree(result);
      return result;
    }
    catch (CommandException exception) {
      throw new EvalException(exception);
    }
  }

  /** Infer bounds for any integer variables.
   *  See FlatPred.inferBounds(Bounds bnds);
   *  <p>
   *  This does upto inferPasses_ passes over all the predicates
   *  in the list (it stops if a fixed point is found earlier).
   *  </p>
   *  @param bnds  The database of lower and upper bounds for integer variables.
   *  @return      true iff the bnds database has been changed at all.
   */
  public boolean inferBounds(Bounds bnds)
  {
    LOG.entering("FlatPredList","inferBounds",bnds);
    for (FlatPred pred : predlist_)
      pred.inferBounds(bnds);
    LOG.exiting("FlatPredList","inferBounds",bnds.getDeductions() > 0);
    return bnds.getDeductions() > 0;
  }

  /** Equivalent to inferBoundsFixPoint(bnds, 5).
   *  That is, this does a default (maximum) number of
   *  static inference iterations.
   */
  public boolean inferBoundsFixPoint(Bounds bnds)
  {
    return inferBoundsFixPoint(bnds, 5);
  }

  /** Infer bounds for any integer variables.
   *  See FlatPred.inferBounds(Bounds bnds);
   *  <p>
   *  This does upto maxPasses passes over all the predicates
   *  in the list.  It stops earlier than maxPasses if a fixed
   *  point is reached.  That is, if the bounds are not getting
   *  any tighter on each pass over the list.
   *  </p>
   *  @param bnds  The database of lower and upper bounds for integer variables.
   *  @param maxPasses The maximum number of iterations done.  Must be > 0.
   *  @return      true iff a fix point has been reached.
   */
  public boolean inferBoundsFixPoint(Bounds bnds, int maxPasses)
  {
    assert maxPasses > 0;
    LOG.entering("FlatPredList","inferBoundsFixPoint",bnds);
    int deductions = 1;
    for (int i = 0; i < maxPasses; i++) {
      bnds.startAnalysis();
      LOG.fine("Starting inferBoundsFixPoint pass " + (i+1)
          + " with bounds="+bnds);
      for (FlatPred pred : predlist_)
        pred.inferBounds(bnds);
      bnds.endAnalysis();
      deductions = bnds.getDeductions();
    }
    LOG.exiting("FlatPredList","inferBoundsFixPoint",deductions == 0);
    return deductions == 0;
  }

  /** Optimises the list and chooses a mode.
   *  Note that inferBounds should usually be done before this,
   *  since it may narrow the search space of chooseMode.
   *
   *  @czt.todo Implement a simple reordering algorithm here.
   *  The current implementation does no reordering.
   */
  public ModeList chooseMode(Envir env0)
  {
    LOG.entering("FlatPredList", "chooseMode", env0);
    List<FlatPred> flatPreds = new ArrayList<FlatPred>(predlist_);
    List<Mode> submodes = new ArrayList<Mode>();
    Envir env = env0;
    getArgs(); // forces freeVars_ and args_ to be evaluated.
    LOG.finer(this.hashCode() + " starting");
    double cost = Mode.ONE_SOLUTION;
    while (!flatPreds.isEmpty() && chooseMode(env, flatPreds, submodes)) {
      Mode m = submodes.get(submodes.size() - 1);
      cost *= m.getSolutions();
      if (optimize_ && cost > maxCost_) {
        LOG.finer("too expensive (" + cost + ") to evaluate " + this
            + " with env=" + env);
        LOG.exiting("FlatPredList", "chooseMode", null);
        return null;
      }
      env = m.getEnvir();
      LOG.finer(this.hashCode() + " " + m.getParent() + " gives cost=" + cost
          + " and outputs=" + m.getOutputs());
    }
    if ( ! flatPreds.isEmpty()) {
      LOG.finer("no mode for " + flatPreds.get(0) + " with env=" + env);
      LOG.exiting("FlatPredList", "chooseMode", null);
      return null;
    }
    assert submodes.size() == predlist_.size();
    ModeList result = new ModeList(this, env, args_, cost, submodes);
    LOG.exiting("FlatPredList", "chooseMode", result);
    return result;
  }

  /**
   * Removes the corresponding FlatPred from the list
   * when a Mode is inserted into the mode list.
   */
  //@requires ! flatPreds.isEmpty();
  private boolean chooseMode(Envir env0, List<FlatPred> flatPreds,
      List<Mode> modes)
  {
    Mode mode = null;
    if (optimize_) {
      // choose first mode with the smallest number of solutions.
      for (Iterator<FlatPred> iter = flatPreds.iterator(); iter.hasNext();) {
        FlatPred flatPred = iter.next();
        Mode m = flatPred.chooseMode(env0);
        if (m != null) {
          assert flatPred == m.getParent();
          if (mode == null || m.getSolutions() < mode.getSolutions())
            mode = m;
        }
      }
    }
    else {
      // do them in the original order.
      mode = flatPreds.get(0).chooseMode(env0);
    }
    if (mode == null)
      return false;
    modes.add(mode);
    boolean removed = remove(mode.getParent(), flatPreds);
    assert removed;
    return true;
  }

  /**
   * Remove the first occurrence of the given element (checked with ==)
   * from the list.
   */
  private boolean remove(Object element, List list)
  {
    boolean removed = false;
    for (Iterator iter = list.iterator(); ! removed && iter.hasNext(); ) {
      Object o = iter.next();
      if (o == element) {
        iter.remove();
        removed = true;
      }
    }
    return removed;
  }

 /** Set the mode that will be used to evaluate this list.
  *  @param mode Must be one of the modes returned previously by chooseMode.
  */
  //@ requires mode instanceof ModeList;
  //@ ensures evalMode_ == mode;
  public void setMode(/*@non_null@*/Mode mode)
  {
    super.setMode(mode);
    ModeList modeList = (ModeList) evalMode_;
    assert modeList.size() == predlist_.size();
    predlist_.clear();
    for (Iterator<Mode> modes = modeList.iterator();
         modes.hasNext(); ) {
      final Mode m = modes.next();
      final FlatPred flatPred = m.getParent();
      predlist_.add(flatPred);
      flatPred.setMode(m);
    }
    assert modeList.size() == predlist_.size();
  }

  /** Starts a fresh evaluation.
   */
  //@ requires evalMode_ != null;
  public void startEvaluation()
  {
    super.startEvaluation();
    assert evalMode_ != null;
   }

  /** The output environment of this FlatPred list.
   *  This is only valid after startEvaluation.
   */
  //@ requires evalMode_ != null;
  public Envir getOutputEnvir() {
    return evalMode_.getEnvir();
  }

  /** Returns the next solution from this list of FlatPreds.
   *  This implements chronological backtracking, like Prolog.
   *  If it returns true, the output environment, available via
   *  getOutputEnvir(), will contain updated values for any bound
   *  variables defined within this FlatPredList.
   *  Note that the empty list of FlatPreds will return true once.
   *  @return true iff a new solution was found.
   */
  public boolean nextEvaluation() {
    //LOG.entering("FlatPredList","nextEvaluation");
    final int end = predlist_.size(); // points just PAST the last flatpred.
    int curr;
    if (solutionsReturned_ == ALLDONE)
      return false;
    if (solutionsReturned_ == 0) {
      // start from the beginning of the list
      solutionsReturned_++;
      curr = 0;
      //LOG.finest("starting search, size=" + end
      //    + ((curr < end) ? ": "+predlist_.get(curr) : ""));
      if (curr < end)
        predlist_.get(curr).startEvaluation();
      else {
        // curr==end==0, so we do not enter the loop below at all.
        // The result will be true.
      }
    }
    else {
      // start backtracking from the end of the list
      solutionsReturned_++;
      curr = end - 1;
      //LOG.finest("starting backtracking from "+curr);
    }
    // invariant: the output env contains a valid solution for predlist[0..curr-1]
    while (0 <= curr && curr < end) {
      FlatPred fp = predlist_.get(curr);
      if (fp.nextEvaluation()) {
        curr++;
        if (curr < end) {
          FlatPred nextfp = predlist_.get(curr);
          //LOG.finest("moving forward to "+curr+": "+nextfp);
          nextfp.startEvaluation();
        } else {
          //LOG.finer("producing new solution: "+this.getOutputEnvir());
        }
      }
      else {
        curr--;
        //LOG.finest("moving backwards to "+curr
        //    +((curr >= 0) ? ": "+predlist_.get(curr) : ""));
     }
    }
    //LOG.exiting("FlatPredList","nextEvaluation",new Boolean(curr == end));
    if (curr < 0)
      solutionsReturned_ = ALLDONE;
    return curr == end;
  }

  protected Factory getFactory()
  {
    return zlive_.getFactory();
  }

  public String toString() {
    StringBuffer result = new StringBuffer();
    for (Iterator<FlatPred> i = predlist_.iterator(); i.hasNext(); ) {
      result.append(i.next().toString());
      if (i.hasNext())
        result.append(", ");
    }
    return result.toString();
  }
}
