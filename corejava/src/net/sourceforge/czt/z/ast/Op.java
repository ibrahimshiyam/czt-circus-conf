
/******************************************************************************
DO NOT EDIT THIS FILE!  THIS FILE WAS GENERATED BY GNAST
FROM THE TEMPLATE FILE Enum.vm.
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

/**
 * A typesafe enumeration.
 *
 * @author Gnast version 0.1
 */
public final class Op
{
  public static final Op And = new Op("And");
  public static final Op NL = new Op("NL");
  public static final Op Semi = new Op("Semi");
  public static final Op Chain = new Op("Chain");
  private final String name_;

  /**
   * Only this class can construct instances.
   */
  private Op(String name)
  {
    name_ = name;
  }

  public String toString()
  {
    return name_;
  }

  public int hashCode()
  {
    return super.hashCode();
  }

  public boolean equals(java.lang.Object o)
  {
    return super.equals(o);
  }

  public static Op fromString(java.lang.String value)
  {
    if (value.equals("And")) {
      return And;
    }
    if (value.equals("NL")) {
      return NL;
    }
    if (value.equals("Semi")) {
      return Semi;
    }
    if (value.equals("Chain")) {
      return Chain;
    }
    throw new IllegalArgumentException();
  }
}
