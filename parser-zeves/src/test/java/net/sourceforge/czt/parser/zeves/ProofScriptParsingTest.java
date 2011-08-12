/*
 * Copyright (C) 2011 Leo Freitas
 * This file is part of the CZT project.
 * 
 * The CZT project contains free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * The CZT project is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with CZT; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

package net.sourceforge.czt.parser.zeves;

import java.io.IOException;
import java.net.URL;
import junit.framework.Test;
import junit.framework.TestCase;
import net.sourceforge.czt.parser.util.CztManagedTest;
import net.sourceforge.czt.session.CommandException;
import net.sourceforge.czt.session.FileSource;
import net.sourceforge.czt.session.SectionManager;
import net.sourceforge.czt.z.ast.Spec;
import net.sourceforge.czt.z.util.ZUtils;
import net.sourceforge.czt.zeves.jaxb.JaxbXmlWriter;
import net.sourceforge.czt.zeves.util.PrintVisitor;

/**
 *
 * @author Leo Freitas
 * @date Jul 4, 2011
 */

public class ProofScriptParsingTest 
        extends CztManagedTest
{

  protected ProofScriptParsingTest(boolean debug)
  {
    super("zeves", debug);
  }

  protected ProofScriptParsingTest(SectionManager manager, boolean debug)
  {
    super(manager, debug);
  }
  
  private PrintVisitor printer_ = null;

  private JaxbXmlWriter writer_ = new JaxbXmlWriter();
  
  @Override
  protected void setUp() throws Exception
  {
    super.setUp();
    printer_ = new PrintVisitor(false);
    printer_.setPrintIds(false);
    printer_.setOffset(1, 1);
  }

  @Override
  protected TestCase createNegativeTest(URL url, String exception, Class<?> expCls)
  {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  protected void testing(URL resource, Spec term)
  {
    if (printer_ != null) ZUtils.setToStringVisitor(term, printer_);
    System.out.println("Parsing successful, start printing of " + resource);
    try
    {
      try
      {
        LatexScannerDebugger.debugPrinter(new FileSource(resource.getPath()), getManager(), term);
      }
      catch (CommandException ex)
      {
        encounteredException(resource, ex, "while trying to print", false);
      }
    } catch (IOException e)
    {
      encounteredException(resource, e, "while trying to print", false);
      System.exit(0);
    }
//    SectionManager manager = getManager();
//    StringWriter sw = new StringWriter();
//    for(Sect s : term.getSect())
//    {
//      if (s instanceof ZSect)
//      {
//        ZSect zs = (ZSect)s;
//        final String name = zs.getName();
//        final String w = zs.toString();
//        System.out.println("  toString() okay");
//
//        PrintUtils.print(term, sw, manager, name, Markup.LATEX);
//        sw.flush();
//        System.out.println("  Print Latex okay");
//
//        PrintUtils.print(term, sw, manager, name, Markup.UNICODE);
//        sw.flush();
//        System.out.println("  Print Unicode okay");
//
//        //PrintUtils.print(term, sw, manager, name, Markup.ZML);
//        //sw.flush();
//        //System.out.println("  Print ZML okay");
//      }
//    }
  }

  @Override
  @SuppressWarnings("CallToThreadDumpStack")
  protected void encounteredException(URL resource, Throwable e, String failureMsg, boolean handled)
  {
    System.out.println("Encountered exception during parsing: " + e.getClass().getName());
    System.out.println("  " + failureMsg);
    if (!handled) e.printStackTrace();
  }
  protected static final boolean DEBUG_TESTING = false;
  protected final static String TEST_DIR =
          "/tests/zeves/";

  public static Test suite()
  {
    //String s, t = null;
    //s.replaceAll("", "").trim();
    ProofScriptParsingTest test = new ProofScriptParsingTest(DEBUG_TESTING);
    Test result = test.suite(TEST_DIR, null);
    System.out.println("Number of tests for Z/Eves proofs parsing: " + result.countTestCases());
    System.out.println();
    return result;
  }



}
