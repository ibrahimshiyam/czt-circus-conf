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

package net.sourceforge.czt.parser.oz;

import java.util.*;

import net.sourceforge.czt.util.*;
import net.sourceforge.czt.z.util.*;
import net.sourceforge.czt.oz.util.*;

import net.sourceforge.czt.parser.z.LatexMarkup;

/**
 * An interface for commonly used OZ characters.
 *
 * @author generated by Gnast XSL script OzlatexMarkup2class.xsl
 */
public class OzLatexMarkup
{  
  /**
   * A mapping from latex commands to unicode strings.
   */
  private static Map unicodeMap_ = initUnicodeMap();

  /**
   * A mapping from latex commands to command type.
   */
  private static Map typeMap_ = initTypeMap();


  protected static Map initUnicodeMap()
  {
    Map map = LatexMarkup.initUnicodeMap();
</xsl:text>
<xsl:apply-templates mode="unicode" select="*"/>
<xsl:text>
    return map;
  }

  protected static Map initTypeMap()
  {
    Map map = LatexMarkup.initTypeMap();
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
    String result = LatexMarkup.toUnicode(command, spaces);

    if (result == null) {
      result = (String) unicodeMap_.get(command);
      if (spaces &amp;&amp; result != null) {
        LatexMarkup.Type type = (LatexMarkup.Type) typeMap_.get(command);
        String space = String.valueOf(ZChar.SPACE);
        if (type == LatexMarkup.Type.PRE) {
          return result + space;
        } else if (type == LatexMarkup.Type.POST) {
          return space + result;
        } else if (type == LatexMarkup.Type.IN) {
          return space + result + space;
        }
      }
    }
    return result;
  }

  public static Set getUnicodeMappingEntries()
  {
    Set result = LatexMarkup.getUnicodeMappingEntries();

    if (result == null) {
      result = unicodeMap_.entrySet();
    }
    return result;
  }

  public static Set getTypeMappingEntries()
  {
    Set result = LatexMarkup.getTypeMappingEntries();

    if (result == null) {
      result = typeMap_.entrySet();
    }
    return result;
  }

  public static LatexMarkup.Type getType(String command)
  {
    LatexMarkup.Type result = LatexMarkup.getType(command);

    if (result == null) {
      result = (LatexMarkup.Type) typeMap_.get(command);
    }
    return result;
  }

}
</xsl:text>
  </xsl:template>

  <xsl:template mode="unicode" match="char">
    <xsl:text>
    map.put("\</xsl:text>
    <xsl:value-of select="@command"/>
    <xsl:text>", </xsl:text>
    <xsl:text>String.valueOf(OzChar.</xsl:text>
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
        <xsl:text>LatexMarkup.Type.IN</xsl:text>
      </xsl:when>
      <xsl:when test="@type = 'PRE'">
        <xsl:text>LatexMarkup.Type.PRE</xsl:text>
      </xsl:when>
      <xsl:when test="@type = 'POST'">
        <xsl:text>LatexMarkup.Type.POST</xsl:text>
      </xsl:when>
      <xsl:otherwise>
        <xsl:text>LatexMarkup.Type.NONE</xsl:text>
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
        <xsl:text>LatexMarkup.Type.IN</xsl:text>
      </xsl:when>
      <xsl:when test="@type = 'PRE'">
        <xsl:text>LatexMarkup.Type.PRE</xsl:text>
      </xsl:when>
      <xsl:when test="@type = 'POST'">
        <xsl:text>LatexMarkup.Type.POST</xsl:text>
      </xsl:when>
      <xsl:otherwise>
        <xsl:text>LatexMarkup.Type.NONE</xsl:text>
      </xsl:otherwise>
    </xsl:choose>
    <xsl:text>);</xsl:text>
  </xsl:template>
</xsl:transform>
