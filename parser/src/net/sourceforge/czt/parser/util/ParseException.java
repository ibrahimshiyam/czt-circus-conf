/*
  Copyright (C) 2004 Petra Malik
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

import java.util.Iterator;
import java.util.List;

import net.sourceforge.czt.session.CommandException;

/**
 * A parse exception.
 *
 * @author Petra Malik
 */
public class ParseException
  extends CommandException
{
  private List errorList_;

  /**
   * Constructs a new parse exception with the specified message, source
   * line number and column number.
   */
  public ParseException(List errorList)
  {
    errorList_ = errorList;
  }

  public List getErrorList()
  {
    return errorList_;
  }

  public void printErrorList()
  {
    for (Iterator iter = errorList_.iterator(); iter.hasNext(); ) {
      Object next = iter.next();
      System.err.println(next.toString());
    }
  }

  public String getMessage()
  {
    StringBuffer result = new StringBuffer();
    for (Iterator iter = errorList_.iterator(); iter.hasNext(); ) {
      Object next = iter.next();
      result.append("\n" + next.toString());
    }
    return result.toString();
  }
}
