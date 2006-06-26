
/*
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
*/

package net.sourceforge.czt.oz.util;

import net.sourceforge.czt.z.util.*;

/**
 * An interface for commonly used OZ characters.
 *
 * @author generated by Gnast XSL script ozchar2class.xsl
 */
public class OzChar extends ZChar
{
  public OzChar(char[] chars)
  {
    super(chars);
  }



  /**
   * choice (Dijkstra's choice).
   */
  public static OzChar GCH = new OzChar(Character.toChars(0x2AFE));

  /**
   * parallel.
   */
  public static OzChar PARALLEL = new OzChar(Character.toChars(0x2225));

  /**
   * distributed choice (n-ary choice).
   */
  public static OzChar DGCH = new OzChar(Character.toChars(0x2AFF));

  /**
   * distributed conjunction (n-ary and).
   */
  public static OzChar DCNJ = new OzChar(Character.toChars(0x22C0));

  /**
   * class union.
   */
  public static OzChar CLASSUNION = new OzChar(Character.toChars(0x2A42));

  /**
   * horizontal operation definition.
   */
  public static OzChar SDEF = new OzChar(Character.toChars(0x2259));

  /**
   * down arrow (polymorphism).
   */
  public static OzChar POLY = new OzChar(Character.toChars(0x2193));

  /**
   * copyright symbol (object containment).
   */
  public static OzChar CONTAINMENT = new OzChar(Character.toChars(0x24B8));

  /**
   * mathematical       double-struck capital O.
   */
  public static OzChar OID = new OzChar(Character.toChars(0x1D546));

  /**
   * mathematical double-struck capital B.
   */
  public static OzChar BOOL = new OzChar(Character.toChars(0x1D539));
}
