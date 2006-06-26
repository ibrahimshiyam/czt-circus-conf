
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
        An abstract Circus process definition. It represents the <b>ProcessDefinition</b> grammar rule.
        Available extensions are basic process description; recursion; prefixing; guarded process; 
        process call; all forms of unary, binary, iterated, and indexed processes;
        processes involving expressions; and processes involving declarations. 
        </p>
        <p>
        The parser is responsible to enforce restrictions over process definitions involving parameters 
        or indexes within some binary productions. For instance, the parse must rule out cases such as 
        <code>(x: nat @ A) [] (y: nat @ B)</code>, since parameterised process can only appear in an 
        external choice whenever the actual parameters are given.
        </p>
        <p>        
        This allows us to represent the grammar rules <b>ProcessDefinition</b> and <b>Process</b> with 
        a single class. The main advantage is that we can treat unary process definitions uniformly 
        through a single hierarchy tree.
        </p>
        <p>
        Naming this class <code>Process</code> would have been a better choice but unfortunately this would 
        conflict with the interface <code>java.lang.Process</code>.
        </p>
 *
 * @author Gnast version 0.1
 */
public interface CircusProcess extends Term
{
}
