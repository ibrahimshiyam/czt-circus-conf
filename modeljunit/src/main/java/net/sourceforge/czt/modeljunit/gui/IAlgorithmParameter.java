
package net.sourceforge.czt.modeljunit.gui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.lang.reflect.InvocationTargetException;

import net.sourceforge.czt.modeljunit.Tester;

/**
 * IAlgorithmParameter.java
 *
 * @author rong
 * ID : 1005450
 * 5th Aug 2007
 * */

public interface IAlgorithmParameter
{
  public void initialize();

  /**
   * Save parameters into configuration file
   * */
  public void saveParameters(BufferedWriter bufWriter);

  /**
   * Load parameters from configuration file
   * */
  public void loadParameters(BufferedReader bufReader);

  /**
   * Generate import statement to include libraries
   * @return generated import statement
   */
  public String generateImportLab();
  /**
   * Code generator, to generate test code by using this function
   * */
  public String generateCode();

  public void runAlgorithm();
}
