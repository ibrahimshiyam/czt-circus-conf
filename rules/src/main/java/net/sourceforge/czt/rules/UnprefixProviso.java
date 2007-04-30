/*
  Copyright (C) 2007 Mark Utting
  Copyright (C) 2007 Petra Malik
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

package net.sourceforge.czt.rules;

import java.util.List;
import java.util.Set;

import net.sourceforge.czt.base.ast.Term;
import net.sourceforge.czt.rules.ast.ProverFactory;
import net.sourceforge.czt.rules.unification.*;
import net.sourceforge.czt.session.*;
import net.sourceforge.czt.typecheck.z.ErrorAnn;
import net.sourceforge.czt.typecheck.z.TypeCheckUtils;
import net.sourceforge.czt.z.ast.*;
import net.sourceforge.czt.zpatt.ast.*;
import net.sourceforge.czt.zpatt.util.Factory;

public class UnprefixProviso
  implements ProvisoChecker
{
  public Set<Binding> check(List args, SectionManager manager, String section)
    throws UnboundJokerException
  {
    Factory factory = new Factory(new ProverFactory());
    final ZName v1 = (ZName) ProverUtils.removeJoker((Term) args.get(0));
    final ZName v2 = (ZName) ProverUtils.removeJoker((Term) args.get(1));
    final Name v3 = (Name) args.get(2);
    final String leftWord = v1.getWord();
    final String rightWord = v2.getWord();
    if (rightWord.startsWith(leftWord)) {
      final String resultWord =
        rightWord.substring(leftWord.length(), rightWord.length());
      StrokeList strokes = v2.getStrokeList();
      // TODO: clean this up.
      final ZName result = factory.createZName(resultWord, strokes, null);
      return UnificationUtils.unify(result, v3);
    }
    return null;
  }
}
