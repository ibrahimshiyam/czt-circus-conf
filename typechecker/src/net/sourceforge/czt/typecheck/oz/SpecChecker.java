/*
  Copyright (C) 2004, 2005 Tim Miller
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
package net.sourceforge.czt.typecheck.oz;

import net.sourceforge.czt.base.ast.*;
import net.sourceforge.czt.base.visitor.*;

/**
 */
public class SpecChecker
  extends Checker
{
  //a Z spec checker
  protected net.sourceforge.czt.typecheck.z.SpecChecker zSpecChecker_;

  public SpecChecker(TypeChecker typeChecker)
  {
    super(typeChecker);
    zSpecChecker_ =
      new net.sourceforge.czt.typecheck.z.SpecChecker(typeChecker);
  }

  public Object visitTerm(Term term)
  {
    return term.accept(zSpecChecker_);
  }
}
