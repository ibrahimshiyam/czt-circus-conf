/**
Copyright 2003 Petra Malik
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

package net.sourceforge.czt.gnast;

import java.io.*;
import java.util.*;
import java.util.logging.*;

/**
 * <p>The GnAST command line user interface.</p>
 *
 * <p>
 * This class contains the main method for calling the AST code generator.
 * It parses all user settings
 * (provided via the gnast properties file and command line options)
 * and makes these settings available to other objects.
 * </p>
 *
 * @author Petra Malik
 */
public class Gnast implements GlobalProperties
{
  // ############################################################
  // ##################### MEMBER VARIABLES #####################
  // ############################################################

  /**
   * The class name of this class; used for logging purposes.
   */
  private static final String sClassName = "Gnast";

  /**
   * The logger used when logging information is provided.
   */
  private static final Logger sLogger =
    Logger.getLogger("net.sourceforge.czt.gnast" + "." + sClassName);

  /**
   * The location of the gnast properties file.
   */
  private static final String sPropertyFile = "gnast.properties";

  /**
   * <p>
   * Project independent settings intended to be used
   * within the generated code.
   * Examples are settings for author, copyright, etc.
   * </p>
   *
   * <p>Should never be <code>null</code>.
   */
  private Properties mDefaultContext;

  /**
   * <p>A mapping from namespaces (used in schema files)
   * to project names.</p>
   *
   * <p>Should never be <code>null</code>.
   */
  private Properties mNamespaces;

  /**
   * <p>The destination directory
   * where all the generated files go in.</p>
   *
   * <p>It can be set by setting property dest.dir in the
   * gnast properties file or by using the command line option
   * <code>-d</code>.
   *
   * <p>Should never be <code>null</code>.
   */
  private String mDestDir = ".";

  /**
   * <p>The name of the project for which code is generated.</p>
   *
   * <p>It can be set by setting property project in the
   * gnast properties file.
   *
   * <p>Should never be <code>null</code>.
   *
   * @czt.todo Should it be possible to set the project via
   *           command line options?
   * @czt.todo Is it useful to allow a list of projects for
   *           which code is generated?
   */
  private String mProjectName = "core";

  /**
   * <p>A mapping from project names to the actual projects.</p>
   *
   * <p>If {@link #getProject} is called, first this map is
   * tried to obtain the project. If no entry for the given
   * name is found, a new project is created and added to this map.
   * </p>
   */
  private Map mProjects = new HashMap();

  /**
   * The verbosity used for logging to stdout.
   */
  private Level mVerbosity = Level.SEVERE;


  // ############################################################
  // ####################### CONSTRUCTORS #######################
  // ############################################################

  /**
   * Constructs a new gnast code generator and initialises its
   * member variables by reading the gnast properties file
   * named {@link #sPropertyFile}.
   */
  public Gnast()
  {
    Properties gnastProperties = loadProperties(sPropertyFile);

    mDestDir = gnastProperties.getProperty("dest.dir", mDestDir);
    mProjectName = gnastProperties.getProperty("project", mProjectName);
    mDefaultContext = removePrefix("vm.", gnastProperties);
    mNamespaces = withPrefix("http:", gnastProperties);
  }

  // ############################################################
  // ################### (NON-STATC) METHODS ####################
  // ############################################################

  // ****************** ARGUMENT PARSING ************************

  /**
   * Prints usage information to stdout.
   */
  private void printUsage()
  {
    System.out.println("class options (all arguments are optional):\n"
      + "  -d <dir>  Generated files go into this directory\n"
      + "  -p <name> The name of the project to be generated\n"
      + "  -v        Verbose; display verbose debugging messages\n");
  }

  /**
   * Prints the given message followed by usage information
   * for the gnast code generator to stdout.
   */
  private void printUsageMessage(String message)
  {
    System.out.println(message);
    printUsage();
  }

  /**
   * Parses the arguments from the command line.
   *
   * @return <code>true</code> if parsing was successful;
   *         <code>false</code> otherwise.
   * @throws NullPointerException if <code>args</code> is <code>null</code>.
   */
  private boolean parseArguments(String[] args)
  {
    int i = 0;
    while (i < args.length && args[i].startsWith("-")) {
      String arg = args[i++];
      if (arg.equals("-v")) mVerbosity = Level.INFO;
      else if (arg.equals("-vv")) mVerbosity = Level.FINE;
      else if (arg.equals("-vvv")) mVerbosity = Level.FINER;
      else if (arg.equals("-d"))
      {
	if (i < args.length)
	  mDestDir = args[i++];
	else {
	  printUsageMessage(arg + " requires a directory name");
	  return false;
	}
      }
      else if (arg.equals("-p"))
      {
	if (i < args.length)
	  mProjectName = args[i++];
	else {
	  printUsageMessage(arg + " requires a project name");
	  return false;
	}
      }
    }
    if (i < args.length) {
      printUsageMessage("Parse error at " + args[i]);
      return false;
    }
    return true;
  }

  // ********************* LOGGING *************************

  private void handleLogging()
  {
    Logger rootLogger = Logger.getLogger("");
    rootLogger.setLevel(Level.FINEST);

    // setting console logger
    Handler handler = null;
    Handler[] h = rootLogger.getHandlers();
    for (int i=0; i<h.length; i++) {
      if (h[i] instanceof ConsoleHandler) {
	handler = h[i];
      }
    }
    if (handler == null) {
      handler = new ConsoleHandler();
      rootLogger.addHandler(handler);
    }
    handler.setLevel(mVerbosity);
    handler.setFormatter(new OutputFormatter());

    // setting file logger
    try {
      handler = new FileHandler("gnast.log");
      handler.setLevel(Level.ALL);
      handler.setEncoding("utf8");
    } catch(Exception e) {
      sLogger.severe(e.getMessage());
    }
    rootLogger.addHandler(handler);
  }

  // ********************* OTHERS *************************

  /**
   * The main code generator method.
   */
  public void generate(String[] args)
  {
    parseArguments(args);
    handleLogging();

    Project project = null;
    try {
      project = new Project(mProjectName, this);
      project.generate();
    } catch(RuntimeException e) {
      throw e;
    } catch(Exception e) {
      Throwable t = e;
      while(t != null) {
	if (t == e) sLogger.severe(t.getMessage());
	else sLogger.severe("Caused by: " + t.getMessage());
	t = t.getCause();
      }
      return;
    }
  }

  // ################ INTERFACE GlobalProperties ####################

  public String getProjectName(String namespace)
  {
    return mNamespaces.getProperty(namespace);
  }

  public Project getProject(String name)
  {
    Project result = (Project) mProjects.get(name);
    if (result == null) {
      try {
	result = new Project(name, this);
	mProjects.put(name, result);
      } catch (Exception e) {
	sLogger.fine("Cannot create project " + name);
      }
    }
    return result;
  }

  public Properties getDefaultContext()
  {
    return mDefaultContext;
  }

  public String toFileName(String packageName, String className)
  {
    return mDestDir
      + File.separatorChar
      + packageName.replace('.', File.separatorChar)
      + File.separatorChar
      + className
      + ".java";
  }

  // ############################################################
  // ##################### STATIC METHODS #######################
  // ############################################################

  /**
   * Returns the properties provided in the given file.
   * If the given file cannot be found or read, logging
   * messages are written and the empty property map is
   * returned.  This means that the caller cannot distinguish
   * whether an attempt to read a file was unseccessful or
   * the file did not contain properties.
   *
   * @param filename the file to be read.
   * @return the properties contained in the file or the
   *         empty property mapping (should never be
   *         <code>null</code>).
   */
  public static Properties loadProperties(String filename)
  {
    final String methodName = "loadProperties";
    sLogger.entering(sClassName, methodName, filename);
    Properties erg = new Properties();
    if (filename != null) {
      try {
	erg.load(new FileInputStream(filename));
      } catch(FileNotFoundException e) {
	sLogger.warning("Cannot find property file " + filename);
      } catch(java.io.IOException e) {
	sLogger.warning("Cannot read property file " + filename);
      }
    }
    sLogger.exiting(sClassName, methodName, erg);
    return erg;
  }

  /**
   * Returns a property list of all the properties in <code>props</code>
   * that start with the given <code>prefix</code>, but with the prefix
   * removed. That is, a property named Foo is in the returned property
   * list if and only if the value of <code>prefix</code> concatenated
   * with Foo is contained in <code>props</code>. Furthermore, the values
   * of both properties are equal.
   *
   * @return should never be <code>null</code>.
   */
  public static Properties removePrefix(String prefix, Properties props)
  {
    Properties result = new Properties();
    for (Enumeration e = props.propertyNames(); e.hasMoreElements();) {
      String propertyName = (String) e.nextElement();
      if (propertyName.startsWith(prefix))
	result.setProperty(propertyName.substring(prefix.length()),
			   props.getProperty(propertyName));
    }
    return result;
  }

  /**
   * Returns a property list of all the properties in <code>props</code>
   * that start with the given <code>prefix</code>.
   * Furthermore, the values of both properties are equal.
   *
   * @return should never be <code>null</code>.
   */
  public static Properties withPrefix(String prefix, Properties props)
  {
    Properties result = new Properties();
    for (Enumeration e = props.propertyNames(); e.hasMoreElements();) {
      String propertyName = (String) e.nextElement();
      if (propertyName.startsWith(prefix))
	result.setProperty(propertyName,
			   props.getProperty(propertyName));
    }
    return result;
  }

  /**
   * The main method.
   */
  public static void main (String[] args)
  {
    Gnast gen = new Gnast();
    gen.generate(args);
  }

  // ############################################################
  // ##################### INNER CLASSES ########################
  // ############################################################

  /**
   * The output formatter that provides a nice output
   * using the logging messages.
   */
  class OutputFormatter extends  Formatter
  {
    public String format(LogRecord record)
    {
      return record.getLevel().toString()
	+ ": "
	+ record.getMessage()
	+ "\n";
    }
  }
}
