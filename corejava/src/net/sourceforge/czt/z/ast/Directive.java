
/******************************************************************************
DO NOT EDIT THIS FILE!  THIS FILE WAS GENERATED BY GNAST
FROM THE TEMPLATE FILE AstInterface.vm.
ANY MODIFICATIONS TO THIS FILE WILL BE LOST UPON REGENERATION.

-------------------------------------------------------------------------------

Copyright 2003, 2004 Mark Utting
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

package net.sourceforge.czt.z.ast;

import net.sourceforge.czt.base.ast.*;

/**
 * <p>
          A latex markup directive.  This is used to represent
          %%Zchar and %%Zword directives used in latex markup (A.2.3).
          The Command contains the complete latex command, including
          the leading backslash, whereas Unicode contains the corresponding
          unicode representation.  The attribute is used to distinguish
          the kind or type of directive, for instance whether it was a
          %%Zinchar, which corresponds to type "NONE",
          or %%Zinword in which case the type is "IN".
        </p>
        <p>
          Note that there is no unique tranlation back to a latex markup
          directive in latex since there could be several latex strings
          representing a unicode string.
          However, if one does want to translate back into latex markup
          directives, then directives with a single unicode character 
          should be translated into the various %%Z...char commands and 
          all other directives should be translated into %%Z...word
          commands (after translating each unicode character into a
          latex command).
        </p>
 *
 * @author Gnast version 0.1
 */
public interface Directive extends TermA
{

  /**
   * Returns the Command element.
   *
   * @return the Command element.
   */
  String getCommand();

  /**
   * Sets the Command element.
   *
   * @param command   the Command element.
   * @see #getCommand
   */
  void setCommand(String command);

  /**
   * Returns the Unicode element.
   *
   * @return the Unicode element.
   */
  String getUnicode();

  /**
   * Sets the Unicode element.
   *
   * @param unicode   the Unicode element.
   * @see #getUnicode
   */
  void setUnicode(String unicode);

  /**
   * Returns the Type element.
   *
   * @return the Type element.
   */
  DirectiveType getType();

  /**
   * Sets the Type element.
   *
   * @param type   the Type element.
   * @see #getType
   */
  void setType(DirectiveType type);
}
