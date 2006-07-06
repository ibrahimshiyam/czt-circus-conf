
/******************************************************************************
DO NOT EDIT THIS FILE!  THIS FILE WAS GENERATED BY GNAST
FROM THE TEMPLATE FILE AstInterface.vm.
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

package net.sourceforge.czt.circus.ast;

import net.sourceforge.czt.base.ast.*;
import net.sourceforge.czt.z.ast.*;

/**
 * <p>
        A field that is part of a communication and contains an expression.
        It represents the grammar rule <b>.Expr</b>.
        </p>
        <p>
        In general, the ``dot'' is treated as output communication.
        However, depending on the purpose of use, it can be considered as a reading or writing synchronisation point.        
        </p>
        <p>        
        Another example where the differentiation between dot and output fields is relevant comes from CSP_M and FDR,
        where ``dot'' fields are used for resolved expressions, whereas ``output'' fields can be used for expressions 
        yet to be resolved. 
        Roscoe's give some insight on further interesting possibilities that motivates such differentiation in 
        his CSP book (p.27).
        </p>
 *
 * @author Gnast version 0.1
 */
public interface DotField extends Field
{

  /**
   * Returns the Expr element.
   *
   * @return the Expr element.
   */
  net.sourceforge.czt.z.ast.Expr getExpr();


  /**
   * Sets the Expr element.
   *
   * @param expr   the Expr element.
   * @see #getExpr
   */
  void setExpr(net.sourceforge.czt.z.ast.Expr expr);
}
