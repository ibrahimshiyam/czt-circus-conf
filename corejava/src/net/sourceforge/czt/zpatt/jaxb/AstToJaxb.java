
/*
THIS FILE WAS GENERATED BY GNAST.
ANY MODIFICATIONS TO THIS FILE WILL BE LOST UPON REGENERATION.

************************************************************

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

package net.sourceforge.czt.zpatt.jaxb;

import java.util.*;
import java.util.logging.Logger;

import net.sourceforge.czt.util.CztException;
import net.sourceforge.czt.base.ast.Term;

import net.sourceforge.czt.z.jaxb.gen.*;
import net.sourceforge.czt.zpatt.jaxb.gen.*;
import org.w3._2001.xmlschema.*;

/**
 * The marshaller responsible for serializing XML data.
 *
 * @author Gnast version 0.1
 */
public class AstToJaxb
  extends net.sourceforge.czt.z.jaxb.AstToJaxb
  implements net.sourceforge.czt.zpatt.visitor.ZpattVisitor,
             net.sourceforge.czt.base.visitor.TermVisitor
{

  /**
   * The ObjectFactory instances for generating Jaxb objects.
   */
  private net.sourceforge.czt.zpatt.jaxb.gen.ObjectFactory
    objectFactory_ = new net.sourceforge.czt.zpatt.jaxb.gen.ObjectFactory();
  private net.sourceforge.czt.z.jaxb.gen.ObjectFactory
    annsObjectFactory_ = new net.sourceforge.czt.z.jaxb.gen.ObjectFactory();
  private org.w3._2001.xmlschema.ObjectFactory
    anyTypeObjectFactory_ = new org.w3._2001.xmlschema.ObjectFactory();

  /**
   * A map that maps id's to the corresponding Object.
   */
  private Map hash_ = new HashMap();

  private String getClassName()
  {
    return "net.sourceforge.czt.zpatt.jaxb.AstToJaxb";
  }

  private Logger getLogger()
  {
    return Logger.getLogger(getClassName());
  }

  public Object visitTerm(Term zedObject)
  {
    throw(new UnsupportedOperationException("Unexpected element "
                                            + zedObject.getClass().getName()));
  }


  public Object visitJokerExpr(net.sourceforge.czt.zpatt.ast.JokerExpr zedObject)
  {
    getLogger().entering(getClassName(), "visitJokerExpr", zedObject);

    JokerExpr jaxbObject = null;
    try {
      jaxbObject = objectFactory_.createJokerExprElement();
      if (!createElement_) {
        jaxbObject = objectFactory_.createJokerExpr();
      }
      createElement_ = false;
      if (zedObject.getName() != null) {
        jaxbObject.setName(zedObject.getName());
      }
    }
    catch (Exception exception) {
      String message =
        "class AstToJaxb: "
        + "Cannot transform a JokerExpr to the corresponding "
        + "Jaxb class";
      throw new CztException(message, exception);
    }

    getLogger().exiting(getClassName(), "visitJokerExpr", jaxbObject);
    createElement_ = true;
    return jaxbObject;
  }

  public Object visitSubstitute(net.sourceforge.czt.zpatt.ast.Substitute zedObject)
  {
    getLogger().entering(getClassName(), "visitSubstitute", zedObject);

    Substitute jaxbObject = null;
    try {
      jaxbObject = objectFactory_.createSubstituteElement();
      if (!createElement_) {
        jaxbObject = objectFactory_.createSubstitute();
      }
      {
        java.util.List list = zedObject.getExpr();
        java.util.List newlist = jaxbObject.getExpr();
        for (Iterator iter = list.iterator(); iter.hasNext();) {
          Object o = iter.next();
          if (o instanceof Term) {
            createElement_ = true;
            o = ((Term) o).accept(this);
          }
          newlist.add(o);
        }
      }
      {
        java.util.List list = zedObject.getPred();
        java.util.List newlist = jaxbObject.getPred();
        for (Iterator iter = list.iterator(); iter.hasNext();) {
          Object o = iter.next();
          if (o instanceof Term) {
            createElement_ = true;
            o = ((Term) o).accept(this);
          }
          newlist.add(o);
        }
      }
    }
    catch (Exception exception) {
      String message =
        "class AstToJaxb: "
        + "Cannot transform a Substitute to the corresponding "
        + "Jaxb class";
      throw new CztException(message, exception);
    }

    getLogger().exiting(getClassName(), "visitSubstitute", jaxbObject);
    createElement_ = true;
    return jaxbObject;
  }

  public Object visitJokerPred(net.sourceforge.czt.zpatt.ast.JokerPred zedObject)
  {
    getLogger().entering(getClassName(), "visitJokerPred", zedObject);

    JokerPred jaxbObject = null;
    try {
      jaxbObject = objectFactory_.createJokerPredElement();
      if (!createElement_) {
        jaxbObject = objectFactory_.createJokerPred();
      }
      createElement_ = false;
      if (zedObject.getName() != null) {
        jaxbObject.setName(zedObject.getName());
      }
    }
    catch (Exception exception) {
      String message =
        "class AstToJaxb: "
        + "Cannot transform a JokerPred to the corresponding "
        + "Jaxb class";
      throw new CztException(message, exception);
    }

    getLogger().exiting(getClassName(), "visitJokerPred", jaxbObject);
    createElement_ = true;
    return jaxbObject;
  }

  public Object visitSubstList(net.sourceforge.czt.zpatt.ast.SubstList zedObject)
  {
    getLogger().entering(getClassName(), "visitSubstList", zedObject);

    SubstList jaxbObject = null;
    try {
      jaxbObject = objectFactory_.createSubstListElement();
      if (!createElement_) {
        jaxbObject = objectFactory_.createSubstList();
      }
      {
        java.util.List list = zedObject.getSubstitute();
        java.util.List newlist = jaxbObject.getSubstitute();
        for (Iterator iter = list.iterator(); iter.hasNext();) {
          Object o = iter.next();
          if (o instanceof Term) {
            createElement_ = true;
            o = ((Term) o).accept(this);
          }
          newlist.add(o);
        }
      }
    }
    catch (Exception exception) {
      String message =
        "class AstToJaxb: "
        + "Cannot transform a SubstList to the corresponding "
        + "Jaxb class";
      throw new CztException(message, exception);
    }

    getLogger().exiting(getClassName(), "visitSubstList", jaxbObject);
    createElement_ = true;
    return jaxbObject;
  }
}
