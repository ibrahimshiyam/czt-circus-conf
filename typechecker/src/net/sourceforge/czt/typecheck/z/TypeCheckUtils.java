/*
  Copyright (C) 2004 Petra Malik
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

import java.io.*;
import java.util.List;

import net.sourceforge.czt.util.*;
import net.sourceforge.czt.base.ast.Term;
import net.sourceforge.czt.base.ast.TermA;
import net.sourceforge.czt.session.*;
import net.sourceforge.czt.z.ast.*;
import net.sourceforge.czt.z.ast.ZFactory;
import net.sourceforge.czt.z.impl.ZFactoryImpl;
import net.sourceforge.czt.parser.z.*;
import net.sourceforge.czt.parser.util.*;
import net.sourceforge.czt.typecheck.z.util.*;

/**
 * Utilities for typechecking Z specifications.
 *
 * @author Petra Malik, Tim Miller
 */
public class TypeCheckUtils
{
  /**
   * Do not generate instances of this class.
   */
  protected TypeCheckUtils()
  {
  }

  /**
   * Typecheck and type annotate a file.
   * @param term the <code>Term</code> to typecheck.
   * @param sectInfo the <code>SectionInfo</code> object to use.
   * @param markup the <code>Markup</code> of the specification.
   * returns the list of ErrorAnns in the AST added by the typechecker.
   */
  public static List typecheck(Term term,
                               SectionInfo sectInfo,
                               Markup markup)
  {
    return typecheck(term, sectInfo, markup, false);
  }

  /**
   * Typecheck and type annotate a file.
   * @param term the <code>Term</code> to typecheck.
   * @param sectInfo the <code>SectionInfo</code> object to use.
   * @param markup the <code>Markup</code> of the specification.
   * @param useBeforeDecl allow use of variables before declaration
   * returns the list of ErrorAnns in the AST added by the typechecker.
   */
  public static List typecheck(Term term,
                               SectionInfo sectInfo,
                               Markup markup,
                               boolean useBeforeDecl)
  {
    return typecheck(term, sectInfo, markup, useBeforeDecl, null);
  }

  /**
   * Typecheck and type annotate a file.
   * @param term the <code>Term</code> to typecheck.
   * @param sectInfo the <code>SectionInfo</code> object to use.
   * @param markup the <code>Markup</code> of the specification.
   * @param useBeforeDecl allow use of variables before declaration
   * @param sectName the section within which this term should be evaluated
   * returns the list of ErrorAnns in the AST added by the typechecker.
   */
  public static List typecheck(Term term,
                               SectionInfo sectInfo,
                               Markup markup,
                               boolean useBeforeDecl,
                               String sectName)
  {
    TypeCheckUtils utils = new TypeCheckUtils();
    return utils.lTypecheck(term, sectInfo, markup, useBeforeDecl, sectName);
  }

  protected List lTypecheck(Term term,
                            SectionInfo sectInfo,
                            Markup markup)
  {
    return lTypecheck(term, sectInfo, markup, false);
  }

  protected List lTypecheck(Term term,
                            SectionInfo sectInfo,
                            Markup markup,
                            boolean useBeforeDecl)
  {
    return lTypecheck(term, sectInfo, markup, useBeforeDecl, null);
  }

  protected List lTypecheck(Term term,
                            SectionInfo sectInfo,
                            Markup markup,
                            boolean useBeforeDecl,
                            String sectName)
  {
    ZFactory zFactory = new ZFactoryImpl();
    TypeChecker typeChecker =
      new TypeChecker(zFactory, sectInfo, markup, useBeforeDecl);
    typeChecker.setPreamble(sectName, sectInfo);
    term.accept(typeChecker);
    return typeChecker.errors();
  }

  protected Term parse(Source src, SectionInfo sectInfo)
    throws IOException, net.sourceforge.czt.parser.util.ParseException
  {
    return ParseUtils.parse(src, sectInfo);
  }

  protected Term parse(String file, SectionInfo sectInfo)
    throws IOException, net.sourceforge.czt.parser.util.ParseException
  {
    return ParseUtils.parse(file, sectInfo);
  }

  protected String name()
  {
    return "zedtypecheck";
  }

  protected void printUsage()
  {
    System.err.println("usage: " + name() + " [-sdt] filename ...");
    System.err.println("flags: -s     syntax check only");
    System.err.println("       -d     allow use before declaration");
    System.err.println("       -n     force declarations before use");
    System.err.println("       -t     print global type declarations");
  }

  protected boolean useBeforeDeclDefault()
  {
    return false;
  }

  protected List<String> toolkits()
  {
    List<String> toolkits = new java.util.ArrayList<String>();
    toolkits.add("prelude");
    toolkits.add("set_toolkit");
    toolkits.add("relation_toolkit");
    toolkits.add("function_toolkit");
    toolkits.add("sequence_toolkit");
    toolkits.add("number_toolkit");
    toolkits.add("standard_toolkit");
    return toolkits;
  }

  protected void printTypes(SectTypeEnvAnn sectTypeEnvAnn)
  {
    List<NameSectTypeTriple> triples = sectTypeEnvAnn.getNameSectTypeTriple();
    String prevSect = "";
    for (NameSectTypeTriple triple : triples) {
      if (!toolkits().contains(triple.getSect())) {
	if (!prevSect.equals(triple.getSect())) {
	  System.out.println("section " + triple.getSect());
	}
	System.out.println("\t" + triple.getName() + " : " + triple.getType());
	prevSect = triple.getSect();
      }
    }
  }

  protected void run(String [] args)
    throws IOException
  {
    if (args.length == 0) {
      printUsage();
      System.exit(0);
    }

    List<String> files = new java.util.ArrayList<String>();
    boolean syntaxOnly = false;
    boolean useBeforeDecl = useBeforeDeclDefault();
    boolean printTypes = false;

    for (int i = 0; i < args.length; i++) {
      if (args[i].startsWith("-")) {
        for (int j = 1; j < args[i].length(); j++) {
          switch (args[i].charAt(j)) {
          case 's':
            syntaxOnly = true;
            break;
          case 'd':
            useBeforeDecl = true;
            break;
          case 'n':
            useBeforeDecl = false;
            break;
          case 't':
            printTypes = true;
            break;
          default:
            printUsage();
          }
        }
      }
      else {
        files.add(args[i]);
      }
    }

    SectionManager manager = new SectionManager();
    int result = 0;
    for (String file : files) {
      //parse the file
      Term term = null;
      Markup markup = ParseUtils.getMarkup(file);
      try {
        if (markup == null) {
          Source src = new FileSource(file);
          term = this.parse(src, manager);
        }
        else {
          term = this.parse(file, manager);
        }
      }
      catch (net.sourceforge.czt.parser.util.ParseException exception) {
        exception.printErrorList();
      }

      //if the parse succeeded, typecheck the term
      if (term != null && !syntaxOnly) {
        List errors = this.lTypecheck(term, manager, markup, useBeforeDecl);

        //print any errors
        for (Object next : errors) {
          System.out.println(next);
          System.out.println();
          result = -1;
        }

        if (printTypes) {
	  SectTypeEnvAnn sectTypeEnvAnn =
	    (SectTypeEnvAnn) ((TermA) term).getAnn(SectTypeEnvAnn.class);
	  if (sectTypeEnvAnn != null) {
	    printTypes(sectTypeEnvAnn);
	  }
	  else {
	    System.err.println("No type information available");
	  }
        }
      }
    }

    System.exit(result);
  }

  public static void main(String[] args)
    throws IOException
  {
    TypeCheckUtils utils = new TypeCheckUtils();
    utils.run(args);
  }
}
