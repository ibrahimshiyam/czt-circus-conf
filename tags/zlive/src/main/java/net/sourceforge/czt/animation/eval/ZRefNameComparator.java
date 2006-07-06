/*
  ZLive - A Z animator -- Part of the CZT Project.
  Copyright 2006 Mark Utting

  This program is free software; you can redistribute it and/or
  modify it under the terms of the GNU General Public License
  as published by the Free Software Foundation; either version 2
  of the License, or (at your option) any later version.

  This program is distributed in the hope that it will be useful,
  but WITHOUT ANY WARRANTY; without even the implied warranty of
  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  GNU General Public License for more details.

  You should have received a copy of the GNU General Public License
  along with this program; if not, write to the Free Software
  Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
*/
package net.sourceforge.czt.animation.eval;

import java.util.Comparator;

import net.sourceforge.czt.z.ast.ZRefName;
import net.sourceforge.czt.z.util.PrintVisitor;

/** A comparator for evaluated Z expressions.
 *  The compare method defines a total order over evaluated Z expressions,
 *  such that the inferred equivalence relation is semantic equality
 *  of the Z expressions.  This class uses the singleton pattern,
 *  so use the create() method to get an instance.
 * 
 * @author marku
 */
public class ZRefNameComparator implements Comparator<ZRefName>
{
  private static ZRefNameComparator singleton_ = new ZRefNameComparator();
  
  public static ZRefNameComparator create()
  {
    return singleton_;
  }

  /* This orders ZRefNames alphabetically.
   * More precisely, it turns each name into a string, 
   * then compares those strings.
   * @see java.util.Comparator#compare(T, T)
   */
  public int compare(ZRefName var0, ZRefName var1)
  {
    PrintVisitor printVisitor = new PrintVisitor();
    String name0 = var0.accept(printVisitor);
    String name1 = var1.accept(printVisitor);
    return name0.compareTo(name1);
  }
}
