<?xml version="1.0" encoding="utf-8"?>
<xsl:transform xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                version="1.0">

  <xsl:output method="text"/>
  <xsl:strip-space elements="*"/>

  <xsl:variable name="NL">
    <xsl:text>
</xsl:text>
  </xsl:variable>

  <xsl:template match="/">
    <xsl:text>/**
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

package net.sourceforge.czt.parser.z;

import java.util.*;

import net.sourceforge.czt.util.*;
import net.sourceforge.czt.z.util.*;

/**
 * An interface for commonly used Z characters.
 *
 * @author generated by Gnast XSL script latexMarkup2class.xsl
 */
public class LatexMarkup
{
  /**
   * A mapping from latex commands to unicode strings.
   */
  protected static Map unicodeMap_ = initUnicodeMap();

  /**
   * A mapping from latex commands to command type.
   */
  protected static Map typeMap_ = initTypeMap();

  public static Map initUnicodeMap()
  {
    Map map = new HashMap();
</xsl:text>
<xsl:apply-templates mode="unicode" select="*"/>
<xsl:text>
    return map;
  }

  public static Map initTypeMap()
  {
    Map map = new HashMap();
</xsl:text>
<xsl:apply-templates mode="type" select="*"/>
<xsl:text>
    return map;
  }

  /**
   * Returns an unicode string representation of the given latex
   * command.
   *
   * @param command the latex command.
   * @param spaces indicates whether spaces should be added or not.
   * @return the unicode represention of the given latex command,
   *          or null if the command cannot be found.  Spaces are
   *          added (depending on the type of the command) if spaces
   *          is true.
   */
  public static String toUnicode(String command, boolean spaces)
  {
    String result = (String) unicodeMap_.get(command);
    if (spaces &amp;&amp; result != null) {
      Type type = (Type) typeMap_.get(command);
      String space = String.valueOf(ZChar.SPACE);
      if (type == Type.PRE) {
        return result + space;
      } else if (type == Type.POST) {
        return space + result;
      } else if (type == Type.IN) {
        return space + result + space;
      }
    }
    return result;
  }

  public static Set getUnicodeMappingEntries()
  {
    return unicodeMap_.entrySet();
  }

  public static Set getTypeMappingEntries()
  {
    return typeMap_.entrySet();
  }

  public static Type getType(String command)
  {
    return (Type) typeMap_.get(command);
  }

  public static final class Type
  {
    public final static Type NONE = new Type("NONE");
    public final static Type PRE = new Type("PRE");
    public final static Type POST = new Type("POST");
    public final static Type IN = new Type("IN");
    private final String name_;

    /**
     * Only this class can construct instances.
     */
    private Type(String name)
    {
      name_ = name;
    }

    public String toString()
    {
      return name_;
    }

    public final int hashCode()
    {
      return super.hashCode();
    }

    public final boolean equals(java.lang.Object o)
    {
      return super.equals(o);
    }

    public static Type fromString(java.lang.String value)
    {
      if (value.equals("NONE")) {
        return NONE;
      }
      if (value.equals("PRE")) {
        return PRE;
      }
      if (value.equals("POST")) {
        return POST;
      }
      if (value.equals("IN")) {
        return IN;
      }
      throw new IllegalArgumentException();
    }
  }
}
</xsl:text>
  </xsl:template>

  <xsl:template mode="unicode" match="char">
    <xsl:text>
    map.put("\</xsl:text>
    <xsl:value-of select="@command"/>
    <xsl:text>", </xsl:text>
    <xsl:text>String.valueOf(ZChar.</xsl:text>
    <xsl:value-of select="@ref"/>
    <xsl:text>));</xsl:text>
  </xsl:template>

  <xsl:template mode="unicode" match="word">
    <xsl:text>
    map.put("\</xsl:text>
    <xsl:value-of select="@command"/>
    <xsl:text>", "</xsl:text>
    <xsl:value-of select="@word"/>
    <xsl:text>");</xsl:text>
  </xsl:template>

  <xsl:template mode="type" match="char">
    <xsl:text>
    map.put("\</xsl:text>
    <xsl:value-of select="@command"/>
    <xsl:text>", </xsl:text>
    <xsl:choose>
      <xsl:when test="@type = 'IN'">
        <xsl:text>Type.IN</xsl:text>
      </xsl:when>
      <xsl:when test="@type = 'PRE'">
        <xsl:text>Type.PRE</xsl:text>
      </xsl:when>
      <xsl:when test="@type = 'POST'">
        <xsl:text>Type.POST</xsl:text>
      </xsl:when>
      <xsl:otherwise>
        <xsl:text>Type.NONE</xsl:text>
      </xsl:otherwise>
    </xsl:choose>
    <xsl:text>);</xsl:text>
  </xsl:template>

  <xsl:template mode="type" match="word">
    <xsl:text>
    map.put("\</xsl:text>
    <xsl:value-of select="@command"/>
    <xsl:text>", </xsl:text>
    <xsl:choose>
      <xsl:when test="@type = 'IN'">
        <xsl:text>Type.IN</xsl:text>
      </xsl:when>
      <xsl:when test="@type = 'PRE'">
        <xsl:text>Type.PRE</xsl:text>
      </xsl:when>
      <xsl:when test="@type = 'POST'">
        <xsl:text>Type.POST</xsl:text>
      </xsl:when>
      <xsl:otherwise>
        <xsl:text>Type.NONE</xsl:text>
      </xsl:otherwise>
    </xsl:choose>
    <xsl:text>);</xsl:text>
  </xsl:template>
</xsl:transform>
