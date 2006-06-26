
/******************************************************************************
DO NOT EDIT THIS FILE!  THIS FILE WAS GENERATED BY GNAST
FROM THE TEMPLATE FILE AstVisitorInterface.vm.
ANY MODIFICATIONS TO THIS FILE WILL BE LOST UPON REGENERATION.

-------------------------------------------------------------------------------

Copyright 2003, 2004, 2005 Mark Utting
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
******************************************************************************/

package net.sourceforge.czt.oz.visitor;

import net.sourceforge.czt.util.Visitor;
import net.sourceforge.czt.oz.ast.ClassRefType;

/**
 * A(n) ClassRefType visitor.
 */
public interface ClassRefTypeVisitor<R> extends Visitor<R>
{
  /**
   * Visits a(n) ClassRefType.
   * @param  term the ClassRefType to be visited.
   * @return some kind of <code>Object</code>.
   */
  R visitClassRefType(ClassRefType term);
}

