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
package net.sourceforge.czt.typecheck.z.util;

import java.io.*;
import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;

import static net.sourceforge.czt.typecheck.z.util.GlobalDefs.*;

import net.sourceforge.czt.base.ast.*;
import net.sourceforge.czt.z.ast.*;
import net.sourceforge.czt.z.util.ZString;
import net.sourceforge.czt.z.impl.ZFactoryImpl;
import net.sourceforge.czt.parser.util.Pair;
import net.sourceforge.czt.typecheck.z.*;
import net.sourceforge.czt.typecheck.z.impl.*;

/**
 * A <code>SectTypeEnv</code> maintains a mapping between a global
 * declaration, its section name, and its type.
 */
public class SectTypeEnv
  extends AbstractTypeEnv
{
  /** The name of the prelude section. */
  public static final String PRELUDE = "prelude";

  /** The names of the toolkit sections. */
  public static final String [] TOOLKITS = {PRELUDE,
                                            "set_toolkit",
                                            "relation_toolkit",
                                            "function_toolkit",
                                            "sequence_toolkit",
                                            "number_toolkit",
                                            "standard_toolkit"};
  /** A Factory. */
  protected static Factory factory_;

  /** The list of all NameSectTypeTriples add so far. */
  protected List<NameSectTypeTriple> typeInfo_;

  /** The map of variables and declared in a 2nd pass of a specification. */
  protected List<NameSectTypeTriple> declarations_;

  /** The list of sections declared so far. */
  protected List<String> sectionDeclarations_;

  /** The current section. */
  protected String section_ = null;

  /** True if the typechecker is traversing for a 2nd time. */
  protected boolean secondTime_ = false;

  /** The currently visible sections. */
  protected Set<String> visibleSections_;

  /** The list of all typechecked parents. */
  protected Set<String> checkedSections_;

  /** The function of all sections to their immediate parents. */
  protected Map<String, Set<String>> parents_;

  public SectTypeEnv()
  {
    this(new ZFactoryImpl());
  }

  public SectTypeEnv(ZFactory zFactory)
  {
    factory_ = new Factory(zFactory);
    typeInfo_ = factory_.list();
    declarations_ = factory_.list();
    sectionDeclarations_ = factory_.list();
    visibleSections_ = set();
    checkedSections_ = set();
    parents_ = map();
  }

  public void overwriteTriples(List<NameSectTypeTriple> triples)
  {
    typeInfo_ = factory_.list();
    add(triples);
  }

  /**
   * Set the current section.
   * @param section the section
   */
  public void setSection(String section)
  {
    visibleSections_.clear();
    Set<String> parents = getTransitiveParents(section);
    visibleSections_.addAll(parents);
    visibleSections_.add(section);
    if (!checkedSections_.contains(section)) checkedSections_.add(section);
    section_ = section;
  }

  public void setSecondTime(boolean secondTime)
  {
    secondTime_ = secondTime;
  }

  public boolean getSecondTime()
  {
    return secondTime_;
  }

  public Factory getFactory()
  {
    return factory_;
  }

  /**
   * @return true if and only if this section has been checked.
   */
  public boolean isChecked(String section)
  {
    boolean result = checkedSections_.contains(section);
    if (secondTime_) {
      result = sectionDeclarations_.contains(section);
      sectionDeclarations_.add(section);
    }
    return result;
  }

  /**
   * @return the current section
   */
  public String getSection()
  {
    return section_;
  }

  /**
   * @return the visible sections
   */
  public Set<String> visibleSections()
  {
    return visibleSections_;
  }

  /**
   * End the current section.
   */
  protected void endSection()
  {
    visibleSections_.clear();
    section_ = null;
  }

  /**
   * Add a parent to the current section.
   * @param parent the parent to be added
   */
  public void addParent(String parent)
  {
    //add the parent as a visible section
    if (!visibleSections_.contains(parent)) visibleSections_.add(parent);

    //get the current section's list of parents
    Set<String> parents = parents_.get(section_);

    //add the parents to the list of the current section's parents
    if (parents == null) {
      parents = set();
    }
    parents.add(parent);
    parents_.put(section_, parents);

    //add the transitive parents
    visibleSections_.addAll(getTransitiveParents(parent));
  }

  /**
   * Add a <code>NameSectTypeTriple</code> to this environment.
   * @return true if and only if this name is not a duplicate
   */
  public NameSectTypeTriple add(NameSectTypeTriple triple)
  {
    NameSectTypeTriple result = null;

    //if not already declared, add this declaration to the environment
    NameSectTypeTriple existing = getTriple(triple.getZDeclName());
    if (existing == null) {
      typeInfo_.add(triple);
    }
    //otherwise, overwrite the existing declaration, and note that
    //this declaration is a duplicate
    else {
      existing.setType(triple.getType());
      if (!existing.getZDeclName().equals(triple.getZDeclName())) {
        result = existing;
      }
    }

    if (secondTime_) {
      result = null;
      for (NameSectTypeTriple declaration : declarations_) {
        if (namesEqual(declaration.getZDeclName(), triple.getZDeclName()) &&
            !declaration.getZDeclName().equals(triple.getZDeclName()) &&
            visibleSections_.contains(declaration.getSect())) {
          result = declaration;
          break;
        }
      }
      declarations_.add(triple);
    }

    return result;
  }

  public void add(List<NameSectTypeTriple> triples)
  {
    for (NameSectTypeTriple triple : triples) {
      add(triple);
    }
  }

  /**
   * Add a <code>NameTypePair</code> to this environment.
   * @return true if and only if this name is not a duplicate
   */
  public NameSectTypeTriple add(NameTypePair nameTypePair)
  {
    return add(nameTypePair.getZDeclName(), nameTypePair.getType());
  }

  public NameSectTypeTriple add(ZDeclName zDeclName, Type type)
  {
    NameSectTypeTriple insert =
      factory_.createNameSectTypeTriple(zDeclName, section_, type);
    NameSectTypeTriple result = add(insert);
    return result;
  }


  public List<NameSectTypeTriple> getTriple()
  {
    List<NameSectTypeTriple> triples = factory_.list();
    for (NameSectTypeTriple triple : typeInfo_) {
      if (visibleSections_.contains(section_) ||
          triple.getSect().equals(PRELUDE)) {
        triples.add(triple);
      }
    }
    return triples;
  }

  public SectTypeEnvAnn getSectTypeEnvAnn()
  {
    List<NameSectTypeTriple> triples = getTriple();
    return factory_.createSectTypeEnvAnn(triples);
  }

  /**
   * Return the type of the variable.
   */
  public Type getType(ZRefName zRefName)
  {
    ZDeclName zDeclName = factory_.createZDeclName(zRefName);
    Type result = factory_.createUnknownType();

    //get the info for this name
    NameSectTypeTriple triple = getTriple(zRefName);
    if (triple != null && visibleSections_.contains(triple.getSect())) {
      result = triple.getType();
      zRefName.setDecl(triple.getZDeclName());
    }

    //if the type is unknown, try looking up the Delta or Xi reference
    //of it
    if (result instanceof UnknownType) {
      result = getDeltaXiType(zRefName, result);
    }

    return result;
  }

  /**
   * For debugging purposes.
   */
  public void dump()
  {
    System.err.println("typeinfo:");
    for (NameSectTypeTriple next : typeInfo_) {
      System.err.print("\t(" + next.getZDeclName());
      System.err.print(", (" + next.getSect());
      System.err.println(", (" + next.getType() + ")))");
    }
  }

  private NameSectTypeTriple getTriple(ZRefName zRefName)
  {
    ZDeclName zDeclName = factory_.createZDeclName(zRefName);
    return getTriple(zDeclName);
  }

  //get a triple whose name matches a specified name and it
  //defined in a currently visible scope.
  private NameSectTypeTriple getTriple(ZDeclName zDeclName)
  {
    NameSectTypeTriple result = null;
    for (NameSectTypeTriple triple : typeInfo_) {
      //we don't use equals() in DeclName so that we can use this
      //lookup for RefName objects as well
      if (namesEqual(triple.getZDeclName(), zDeclName) &&
          (visibleSections_.contains(triple.getSect()) ||
           triple.getSect().equals(PRELUDE))) {
        result = triple;
        break;
      }
    }
    return result;
  }

  //get the transitive parents of a section
  private Set<String> getTransitiveParents(String section)
  {
    Set<String> result = set();

    //get the set of direct parents
    Set<String> parents = parents_.get(section);

    if (parents != null) {
      result.addAll(parents);
      //for each direct parent, get the transitive parents
      for (String parent : parents) {
        if (!parent.equals(section)) {
          Set<String> transitiveParents = getTransitiveParents(parent);
          result.addAll(transitiveParents);
        }
      }
    }
    return result;
  }
}
