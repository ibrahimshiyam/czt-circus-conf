/*
  Copyright (C) 2006 Petra Malik
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

package net.sourceforge.czt.print.zpatt;

import java.util.Properties;

import net.sourceforge.czt.parser.z.Keyword;
import net.sourceforge.czt.parser.z.TokenName;
import net.sourceforge.czt.parser.zpatt.ZPattKeyword;
import net.sourceforge.czt.zpatt.ast.*;
import net.sourceforge.czt.zpatt.util.ZPattString;
import net.sourceforge.czt.zpatt.visitor.*;

public class ZpattPrintVisitor
  extends net.sourceforge.czt.print.z.ZPrintVisitor
  implements ZpattVisitor
{
  public ZpattPrintVisitor(ZPrinter printer, Properties props)
  {
    super(printer, props);
  }

  public Object visitCalculateProviso(CalculateProviso proviso)
  {
    print(ZPattKeyword.PROVISO);
    visit(proviso.getLeftExpr());
    print(Keyword.DEFEQUAL);
    visit(proviso.getRightExpr());
    return null;
  }

  public Object visitCheckProviso(CheckProviso proviso)
  {
    print(ZPattKeyword.PROVISO);
    visit(proviso.getPred());
    return null;
  }

  public Object visitDeduction(Deduction ded)
  {
    throw new UnsupportedOperationException();
  }

  public Object visitHeadDeclList(HeadDeclList list)
  {
    visit(list.getJokerDeclList());
    print(Keyword.COMMA);
    visit(list.getZDeclList());
    return null;
  }

  public Object visitJokers(Jokers jokers)
  {
    throw new UnsupportedOperationException();
  }

  public Object visitJokerDeclList(JokerDeclList joker)
  {
    printDecorword(joker.getName());
    return null;
  }

  public Object visitJokerDeclListBinding(JokerDeclListBinding binding)
  {
    visit(binding.getJokerDeclList());
    printDecorword("\u219D");
    visit(binding.getDeclList());
    return null;
  }

  public Object visitJokerDeclName(JokerDeclName joker)
  {
    printDecorword(joker.getName());
    return null;
  }

  public Object visitJokerDeclNameBinding(JokerDeclNameBinding binding)
  {
    visit(binding.getJokerDeclName());
    printDecorword("\u219D");
    visit(binding.getDeclName());
    return null;
  }

  public Object visitJokerExpr(JokerExpr joker)
  {
    printDecorword(joker.getName());
    return null;
  }

  public Object visitJokerExprBinding(JokerExprBinding binding)
  {
    visit(binding.getJokerExpr());
    printDecorword("\u219D");
    visit(binding.getExpr());
    return null;
  }

  public Object visitJokerExprList(JokerExprList joker)
  {
    printDecorword(joker.getName());
    return null;
  }

  public Object visitJokerExprListBinding(JokerExprListBinding binding)
  {
    visit(binding.getJokerExprList());
    printDecorword("\u219D");
    visit(binding.getExprList());
    return null;
  }

  public Object visitJokerPred(JokerPred joker)
  {
    printDecorword(joker.getName());
    return null;
  }

  public Object visitJokerPredBinding(JokerPredBinding binding)
  {
    visit(binding.getJokerPred());
    printDecorword("\u219D");
    visit(binding.getPred());
    return null;
  }

  public Object visitJokerRefName(JokerRefName joker)
  {
    printDecorword(joker.getName());
    return null;
  }

  public Object visitJokerRefNameBinding(JokerRefNameBinding binding)
  {
    visit(binding.getJokerRefName());
    printDecorword("\u219D");
    visit(binding.getRefName());
    return null;
  }

  public Object visitLookupPredProviso(LookupPredProviso proviso)
  {
    print(ZPattKeyword.PROVISO);
    print(TokenName.INSTROKE);
    visit(proviso.getPred());
    return null;
  }

  public Object visitLookupConstDeclProviso(LookupConstDeclProviso proviso)
  {
    print(ZPattKeyword.PROVISO);
    print(TokenName.INSTROKE);
    visit(proviso.getLeftExpr());
    print(Keyword.DEFEQUAL);
    visit(proviso.getRightExpr());
    return null;
  }

  public Object visitPredSequent(PredSequent predSequent)
  {
    visit(predSequent.getPred());
    return null;
  }

  public Object visitRule(Rule rule)
  {
    printDecorword(ZPattString.RULE);
    printDecorword(rule.getName());
    for (Sequent sequent : rule.getSequent()) {
      visit(sequent);
      print(TokenName.NL);
    }
    return null;
  }

  public Object visitSequentContext(SequentContext context)
  {
    throw new UnsupportedOperationException();
  }

  public Object visitTypeProviso(TypeProviso proviso)
  {
    print(ZPattKeyword.PROVISO);
    visit(proviso.getExpr());
    print(Keyword.COLON);
    visit(proviso.getType());
    return null;
  }
}
