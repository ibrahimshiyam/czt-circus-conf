
/******************************************************************************
DO NOT EDIT THIS FILE!  THIS FILE WAS GENERATED BY GNAST
FROM THE TEMPLATE FILE AstToDom.vm.
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

package net.sourceforge.czt.zpatt.dom;

import java.util.logging.Logger;
import java.util.*;
import org.w3c.dom.*;

import net.sourceforge.czt.base.ast.Term;

import net.sourceforge.czt.util.CztException;

import net.sourceforge.czt.zpatt.ast.*;
import net.sourceforge.czt.zpatt.visitor.*;
import net.sourceforge.czt.z.ast.*;
import net.sourceforge.czt.z.visitor.*;

/**
 * Transformer from AST classes to a DOM tree.
 *
 * @author Gnast version 0.1
 */
public class AstToDom
  extends net.sourceforge.czt.z.dom.AstToDom
  implements net.sourceforge.czt.zpatt.visitor.ZpattVisitor
{
  private Logger getLogger()
  {
    return Logger.getLogger("net.sourceforge.czt.zpatt.dom.AstToDom");
  }



  public Object visitPredTransform(PredTransform zedObject)
  {
    getLogger().entering("dom.AstToDom", "visitPredTransform", zedObject);
    final String ns = "http://czt.sourceforge.net/zml";
    Element elem = getDocument().createElementNS(ns, "PredTransform");
    try {
      if (zedObject.getLeftPred() != null) {
        Term term = (Term) zedObject.getLeftPred();
        Node node = (Node) term.accept(this);
        elem.appendChild(node);
      }
      if (zedObject.getRightPred() != null) {
        Term term = (Term) zedObject.getRightPred();
        Node node = (Node) term.accept(this);
        elem.appendChild(node);
      }
    }
    catch (Exception exception) {
      String message = "class AstToDom: "
                       + "Cannot transform a PredTransform to the corresponding "
                       + "DOM object";
      throw new CztException(message, exception);
    }

    getLogger().exiting("dom.AstToDom", "visitPredTransform", elem);
    return elem;
  }

  public Object visitJokerExpr(JokerExpr zedObject)
  {
    getLogger().entering("dom.AstToDom", "visitJokerExpr", zedObject);
    final String ns = "http://czt.sourceforge.net/zml";
    Element elem = getDocument().createElementNS(ns, "JokerExpr");
    try {
      if (zedObject.getName() != null) {
        elem.setAttributeNS(ns, "Name", zedObject.getName().toString());
      }
    }
    catch (Exception exception) {
      String message = "class AstToDom: "
                       + "Cannot transform a JokerExpr to the corresponding "
                       + "DOM object";
      throw new CztException(message, exception);
    }

    getLogger().exiting("dom.AstToDom", "visitJokerExpr", elem);
    return elem;
  }

  public Object visitTransform(Transform zedObject)
  {
    throw(new UnsupportedOperationException());
  }

  public Object visitJokerPred(JokerPred zedObject)
  {
    getLogger().entering("dom.AstToDom", "visitJokerPred", zedObject);
    final String ns = "http://czt.sourceforge.net/zml";
    Element elem = getDocument().createElementNS(ns, "JokerPred");
    try {
      if (zedObject.getName() != null) {
        elem.setAttributeNS(ns, "Name", zedObject.getName().toString());
      }
    }
    catch (Exception exception) {
      String message = "class AstToDom: "
                       + "Cannot transform a JokerPred to the corresponding "
                       + "DOM object";
      throw new CztException(message, exception);
    }

    getLogger().exiting("dom.AstToDom", "visitJokerPred", elem);
    return elem;
  }

  public Object visitExprTransform(ExprTransform zedObject)
  {
    getLogger().entering("dom.AstToDom", "visitExprTransform", zedObject);
    final String ns = "http://czt.sourceforge.net/zml";
    Element elem = getDocument().createElementNS(ns, "ExprTransform");
    try {
      if (zedObject.getLeftExpr() != null) {
        Term term = (Term) zedObject.getLeftExpr();
        Node node = (Node) term.accept(this);
        elem.appendChild(node);
      }
      if (zedObject.getRightExpr() != null) {
        Term term = (Term) zedObject.getRightExpr();
        Node node = (Node) term.accept(this);
        elem.appendChild(node);
      }
    }
    catch (Exception exception) {
      String message = "class AstToDom: "
                       + "Cannot transform a ExprTransform to the corresponding "
                       + "DOM object";
      throw new CztException(message, exception);
    }

    getLogger().exiting("dom.AstToDom", "visitExprTransform", elem);
    return elem;
  }

  public Object visitTransformList(TransformList zedObject)
  {
    getLogger().entering("dom.AstToDom", "visitTransformList", zedObject);
    final String ns = "http://czt.sourceforge.net/zml";
    Element elem = getDocument().createElementNS(ns, "TransformList");
    try {
      for (Iterator iter = zedObject.getTransform().iterator(); iter.hasNext();) {
        Object o = iter.next();
        if (o instanceof Term) {
          Node node = (Node) ((Term) o).accept(this);
          elem.appendChild(node);
        }
        else {
          elem.appendChild(getDocument().createTextNode(o.toString()));
        }
      }
    }
    catch (Exception exception) {
      String message = "class AstToDom: "
                       + "Cannot transform a TransformList to the corresponding "
                       + "DOM object";
      throw new CztException(message, exception);
    }

    getLogger().exiting("dom.AstToDom", "visitTransformList", elem);
    return elem;
  }
}
