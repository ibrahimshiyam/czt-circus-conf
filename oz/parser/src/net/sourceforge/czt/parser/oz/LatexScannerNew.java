/**
Copyright 2003 Mark Utting
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

package net.sourceforge.czt.parser.oz;

import java.io.*;

import java_cup.runtime.*;

import net.sourceforge.czt.scanner.*;

class LatexScannerNew
  implements java_cup.runtime.Scanner
{
  private UnicodeScanner lexer_;

  /**
   * Creates a new scanner.
   *
   * @param reader the Reader to read input from.
   */
  public LatexScannerNew(Reader reader)
  {
    Latex2Unicode latexLexer = new Latex2Unicode(reader);
    Reader cztReader = new CztReader(latexLexer);
    lexer_ = new UnicodeScanner(cztReader);
  }

  /**
   * Creates a new scanner.
   *
   * @param stream the Inputstream to read input from.
   */
  public LatexScannerNew(InputStream stream)
  {
    this(new InputStreamReader(stream));
  }

  public void setWriter(Writer writer)
  {
    lexer_.setWriter(writer);
  }

  public Symbol next_token()
    throws java.lang.Exception
  {
    return lexer_.next_token();
  }

  /**
   * Lexes a given file.
   */
  public static void main(String argv[]) {    
    try {
      InputStream stream = new FileInputStream(argv[0]);
      InputStreamReader reader = new InputStreamReader(stream, "UTF-8");

      LatexScannerNew lexer = new LatexScannerNew(reader);
      OutputStreamWriter writer = new OutputStreamWriter(System.out);
      lexer.setWriter(writer);
      Symbol s = null;
      while ( (s = lexer.next_token()).sym != 0) {
      }
      writer.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
