
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

package net.sourceforge.czt.tcoz.jaxb;

import java.util.*;
import java.util.logging.Logger;

import net.sourceforge.czt.util.CztException;
import net.sourceforge.czt.base.ast.Term;

import net.sourceforge.czt.z.jaxb.gen.*;
import net.sourceforge.czt.oz.jaxb.gen.*;
import net.sourceforge.czt.tcoz.jaxb.gen.*;
import org.w3._2001.xmlschema.*;

/**
 * The marshaller responsible for serializing XML data.
 *
 * @author Gnast version 0.1
 */
public class AstToJaxb
  extends net.sourceforge.czt.oz.jaxb.AstToJaxb
  implements net.sourceforge.czt.tcoz.visitor.TcozVisitor,
             net.sourceforge.czt.base.visitor.TermVisitor
{

  /**
   * The ObjectFactory instances for generating Jaxb objects.
   */
  private net.sourceforge.czt.tcoz.jaxb.gen.ObjectFactory
    objectFactory_ = new net.sourceforge.czt.tcoz.jaxb.gen.ObjectFactory();
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
    return "net.sourceforge.czt.tcoz.jaxb.AstToJaxb";
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


  public Object visitRecProExpr(net.sourceforge.czt.tcoz.ast.RecProExpr zedObject)
  {
    getLogger().entering(getClassName(), "visitRecProExpr", zedObject);

    RecProExpr jaxbObject = null;
    try {
      jaxbObject = objectFactory_.createRecProExprElement();
      if (!createElement_) {
        jaxbObject = objectFactory_.createRecProExpr();
      }
      createElement_ = false;
      if (zedObject.getOpName() != null) {
        Term term = zedObject.getOpName();
        jaxbObject.setOpName((RefName) term.accept(this));
      }
      createElement_ = true;
      if (zedObject.getOperationExpr() != null) {
        Term term = zedObject.getOperationExpr();
        jaxbObject.setOperationExpr((OperationExpr) term.accept(this));
      }
    }
    catch (Exception exception) {
      String message =
        "class AstToJaxb: "
        + "Cannot transform a RecProExpr to the corresponding "
        + "Jaxb class";
      throw new CztException(message, exception);
    }

    getLogger().exiting(getClassName(), "visitRecProExpr", jaxbObject);
    createElement_ = true;
    return jaxbObject;
  }

  public Object visitWaitUntilProExpr(net.sourceforge.czt.tcoz.ast.WaitUntilProExpr zedObject)
  {
    getLogger().entering(getClassName(), "visitWaitUntilProExpr", zedObject);

    WaitUntilProExpr jaxbObject = null;
    try {
      jaxbObject = objectFactory_.createWaitUntilProExprElement();
      if (!createElement_) {
        jaxbObject = objectFactory_.createWaitUntilProExpr();
      }
      createElement_ = true;
      if (zedObject.getOperationExpr() != null) {
        Term term = zedObject.getOperationExpr();
        jaxbObject.setOperationExpr((OperationExpr) term.accept(this));
      }
      createElement_ = false;
      if (zedObject.getWaitUntil() != null) {
        Term term = zedObject.getWaitUntil();
        jaxbObject.setWaitUntil((Expr1) term.accept(this));
      }
    }
    catch (Exception exception) {
      String message =
        "class AstToJaxb: "
        + "Cannot transform a WaitUntilProExpr to the corresponding "
        + "Jaxb class";
      throw new CztException(message, exception);
    }

    getLogger().exiting(getClassName(), "visitWaitUntilProExpr", jaxbObject);
    createElement_ = true;
    return jaxbObject;
  }

  public Object visitDeadlineProExpr(net.sourceforge.czt.tcoz.ast.DeadlineProExpr zedObject)
  {
    getLogger().entering(getClassName(), "visitDeadlineProExpr", zedObject);

    DeadlineProExpr jaxbObject = null;
    try {
      jaxbObject = objectFactory_.createDeadlineProExprElement();
      if (!createElement_) {
        jaxbObject = objectFactory_.createDeadlineProExpr();
      }
      createElement_ = true;
      if (zedObject.getOperationExpr() != null) {
        Term term = zedObject.getOperationExpr();
        jaxbObject.setOperationExpr((OperationExpr) term.accept(this));
      }
      createElement_ = false;
      if (zedObject.getDeadline() != null) {
        Term term = zedObject.getDeadline();
        jaxbObject.setDeadline((Expr1) term.accept(this));
      }
    }
    catch (Exception exception) {
      String message =
        "class AstToJaxb: "
        + "Cannot transform a DeadlineProExpr to the corresponding "
        + "Jaxb class";
      throw new CztException(message, exception);
    }

    getLogger().exiting(getClassName(), "visitDeadlineProExpr", jaxbObject);
    createElement_ = true;
    return jaxbObject;
  }

  public Object visitWaitProExpr(net.sourceforge.czt.tcoz.ast.WaitProExpr zedObject)
  {
    getLogger().entering(getClassName(), "visitWaitProExpr", zedObject);

    WaitProExpr jaxbObject = null;
    try {
      jaxbObject = objectFactory_.createWaitProExprElement();
      if (!createElement_) {
        jaxbObject = objectFactory_.createWaitProExpr();
      }
      createElement_ = true;
      if (zedObject.getExpr() != null) {
        Term term = zedObject.getExpr();
        jaxbObject.setExpr((Expr) term.accept(this));
      }
    }
    catch (Exception exception) {
      String message =
        "class AstToJaxb: "
        + "Cannot transform a WaitProExpr to the corresponding "
        + "Jaxb class";
      throw new CztException(message, exception);
    }

    getLogger().exiting(getClassName(), "visitWaitProExpr", jaxbObject);
    createElement_ = true;
    return jaxbObject;
  }

  public Object visitDivergeProExpr(net.sourceforge.czt.tcoz.ast.DivergeProExpr zedObject)
  {
    getLogger().entering(getClassName(), "visitDivergeProExpr", zedObject);

    DivergeProExpr jaxbObject = null;
    try {
      jaxbObject = objectFactory_.createDivergeProExpr();
    }
    catch (Exception exception) {
      String message =
        "class AstToJaxb: "
        + "Cannot transform a DivergeProExpr to the corresponding "
        + "Jaxb class";
      throw new CztException(message, exception);
    }

    getLogger().exiting(getClassName(), "visitDivergeProExpr", jaxbObject);
    createElement_ = true;
    return jaxbObject;
  }

  public Object visitSynPllProExpr(net.sourceforge.czt.tcoz.ast.SynPllProExpr zedObject)
  {
    getLogger().entering(getClassName(), "visitSynPllProExpr", zedObject);

    SynPllProExpr jaxbObject = null;
    try {
      jaxbObject = objectFactory_.createSynPllProExprElement();
      if (!createElement_) {
        jaxbObject = objectFactory_.createSynPllProExpr();
      }
      createElement_ = false;
      if (zedObject.getEvents() != null) {
        Term term = zedObject.getEvents();
        jaxbObject.setEvents((EventSet) term.accept(this));
      }
    }
    catch (Exception exception) {
      String message =
        "class AstToJaxb: "
        + "Cannot transform a SynPllProExpr to the corresponding "
        + "Jaxb class";
      throw new CztException(message, exception);
    }

    getLogger().exiting(getClassName(), "visitSynPllProExpr", jaxbObject);
    createElement_ = true;
    return jaxbObject;
  }

  public Object visitInterruptProExpr(net.sourceforge.czt.tcoz.ast.InterruptProExpr zedObject)
  {
    getLogger().entering(getClassName(), "visitInterruptProExpr", zedObject);

    InterruptProExpr jaxbObject = null;
    try {
      jaxbObject = objectFactory_.createInterruptProExpr();
      createElement_ = false;
      if (zedObject.getNormalOp() != null) {
        Term term = zedObject.getNormalOp();
        jaxbObject.setNormalOp((OperationExpr) term.accept(this));
      }
      createElement_ = false;
      if (zedObject.getIntOrTimeout() != null) {
        Term term = zedObject.getIntOrTimeout();
        jaxbObject.setIntOrTimeout((Expr1) term.accept(this));
      }
      createElement_ = false;
      if (zedObject.getHandlerOp() != null) {
        Term term = zedObject.getHandlerOp();
        jaxbObject.setHandlerOp((OperationExpr) term.accept(this));
      }
    }
    catch (Exception exception) {
      String message =
        "class AstToJaxb: "
        + "Cannot transform a InterruptProExpr to the corresponding "
        + "Jaxb class";
      throw new CztException(message, exception);
    }

    getLogger().exiting(getClassName(), "visitInterruptProExpr", jaxbObject);
    createElement_ = true;
    return jaxbObject;
  }

  public Object visitInterleaveProExpr(net.sourceforge.czt.tcoz.ast.InterleaveProExpr zedObject)
  {
    getLogger().entering(getClassName(), "visitInterleaveProExpr", zedObject);

    InterleaveProExpr jaxbObject = null;
    try {
      jaxbObject = objectFactory_.createInterleaveProExpr();
    }
    catch (Exception exception) {
      String message =
        "class AstToJaxb: "
        + "Cannot transform a InterleaveProExpr to the corresponding "
        + "Jaxb class";
      throw new CztException(message, exception);
    }

    getLogger().exiting(getClassName(), "visitInterleaveProExpr", jaxbObject);
    createElement_ = true;
    return jaxbObject;
  }

  public Object visitAtProExpr(net.sourceforge.czt.tcoz.ast.AtProExpr zedObject)
  {
    getLogger().entering(getClassName(), "visitAtProExpr", zedObject);

    AtProExpr jaxbObject = null;
    try {
      jaxbObject = objectFactory_.createAtProExprElement();
      if (!createElement_) {
        jaxbObject = objectFactory_.createAtProExpr();
      }
      createElement_ = true;
      if (zedObject.getEvent() != null) {
        Term term = zedObject.getEvent();
        jaxbObject.setEvent((Event) term.accept(this));
      }
      createElement_ = true;
      if (zedObject.getExpr() != null) {
        Term term = zedObject.getExpr();
        jaxbObject.setExpr((Expr) term.accept(this));
      }
      createElement_ = true;
      if (zedObject.getOperationExpr() != null) {
        Term term = zedObject.getOperationExpr();
        jaxbObject.setOperationExpr((OperationExpr) term.accept(this));
      }
    }
    catch (Exception exception) {
      String message =
        "class AstToJaxb: "
        + "Cannot transform a AtProExpr to the corresponding "
        + "Jaxb class";
      throw new CztException(message, exception);
    }

    getLogger().exiting(getClassName(), "visitAtProExpr", jaxbObject);
    createElement_ = true;
    return jaxbObject;
  }

  public Object visitConnection(net.sourceforge.czt.tcoz.ast.Connection zedObject)
  {
    getLogger().entering(getClassName(), "visitConnection", zedObject);

    Connection jaxbObject = null;
    try {
      jaxbObject = objectFactory_.createConnectionElement();
      if (!createElement_) {
        jaxbObject = objectFactory_.createConnection();
      }
      createElement_ = false;
      if (zedObject.getLeftProcess() != null) {
        Term term = zedObject.getLeftProcess();
        jaxbObject.setLeftProcess((RefNameList) term.accept(this));
      }
      createElement_ = false;
      if (zedObject.getRightProcess() != null) {
        Term term = zedObject.getRightProcess();
        jaxbObject.setRightProcess((RefNameList) term.accept(this));
      }
      createElement_ = false;
      if (zedObject.getChannels() != null) {
        Term term = zedObject.getChannels();
        jaxbObject.setChannels((RefNameList) term.accept(this));
      }
    }
    catch (Exception exception) {
      String message =
        "class AstToJaxb: "
        + "Cannot transform a Connection to the corresponding "
        + "Jaxb class";
      throw new CztException(message, exception);
    }
    if (zedObject.getAnns() != null) {
      java.util.List list = zedObject.getAnns();
      if (list.size() > 0) {
        try {
          net.sourceforge.czt.z.jaxb.gen.TermA.AnnsType anns =
                           annsObjectFactory_.createTermAAnnsType();
          java.util.List newlist = anns.getany();
          for (Iterator iter = list.iterator(); iter.hasNext();) {
            Term term = (Term) iter.next();
            Object o = term.accept(this);
            newlist.add(o);
          }
          jaxbObject.setAnns(anns);
        }
        catch (Exception exception) {
          String message = "class AstToJaxb: "
                    + "Cannot transform a Connection to the corresponding "
                    + "Jaxb class";
          throw new CztException(message, exception);
        }
      }
    }

    getLogger().exiting(getClassName(), "visitConnection", jaxbObject);
    createElement_ = true;
    return jaxbObject;
  }

  public Object visitInterruptTimeOpExpr(net.sourceforge.czt.tcoz.ast.InterruptTimeOpExpr zedObject)
  {
    getLogger().entering(getClassName(), "visitInterruptTimeOpExpr", zedObject);

    InterruptTimeOpExpr jaxbObject = null;
    try {
      jaxbObject = objectFactory_.createInterruptTimeOpExprElement();
      if (!createElement_) {
        jaxbObject = objectFactory_.createInterruptTimeOpExpr();
      }
      createElement_ = false;
      if (zedObject.getNormalOp() != null) {
        Term term = zedObject.getNormalOp();
        jaxbObject.setNormalOp((OperationExpr) term.accept(this));
      }
      createElement_ = false;
      if (zedObject.getIntOrTimeout() != null) {
        Term term = zedObject.getIntOrTimeout();
        jaxbObject.setIntOrTimeout((Expr1) term.accept(this));
      }
      createElement_ = false;
      if (zedObject.getHandlerOp() != null) {
        Term term = zedObject.getHandlerOp();
        jaxbObject.setHandlerOp((OperationExpr) term.accept(this));
      }
    }
    catch (Exception exception) {
      String message =
        "class AstToJaxb: "
        + "Cannot transform a InterruptTimeOpExpr to the corresponding "
        + "Jaxb class";
      throw new CztException(message, exception);
    }

    getLogger().exiting(getClassName(), "visitInterruptTimeOpExpr", jaxbObject);
    createElement_ = true;
    return jaxbObject;
  }

  public Object visitGuardProExpr(net.sourceforge.czt.tcoz.ast.GuardProExpr zedObject)
  {
    getLogger().entering(getClassName(), "visitGuardProExpr", zedObject);

    GuardProExpr jaxbObject = null;
    try {
      jaxbObject = objectFactory_.createGuardProExprElement();
      if (!createElement_) {
        jaxbObject = objectFactory_.createGuardProExpr();
      }
      createElement_ = false;
      if (zedObject.getGuard() != null) {
        Term term = zedObject.getGuard();
        jaxbObject.setGuard((SchText) term.accept(this));
      }
      createElement_ = true;
      if (zedObject.getOperationExpr() != null) {
        Term term = zedObject.getOperationExpr();
        jaxbObject.setOperationExpr((OperationExpr) term.accept(this));
      }
    }
    catch (Exception exception) {
      String message =
        "class AstToJaxb: "
        + "Cannot transform a GuardProExpr to the corresponding "
        + "Jaxb class";
      throw new CztException(message, exception);
    }

    getLogger().exiting(getClassName(), "visitGuardProExpr", jaxbObject);
    createElement_ = true;
    return jaxbObject;
  }

  public Object visitStopProExpr(net.sourceforge.czt.tcoz.ast.StopProExpr zedObject)
  {
    getLogger().entering(getClassName(), "visitStopProExpr", zedObject);

    StopProExpr jaxbObject = null;
    try {
      jaxbObject = objectFactory_.createStopProExpr();
    }
    catch (Exception exception) {
      String message =
        "class AstToJaxb: "
        + "Cannot transform a StopProExpr to the corresponding "
        + "Jaxb class";
      throw new CztException(message, exception);
    }

    getLogger().exiting(getClassName(), "visitStopProExpr", jaxbObject);
    createElement_ = true;
    return jaxbObject;
  }

  public Object visitSkipProExpr(net.sourceforge.czt.tcoz.ast.SkipProExpr zedObject)
  {
    getLogger().entering(getClassName(), "visitSkipProExpr", zedObject);

    SkipProExpr jaxbObject = null;
    try {
      jaxbObject = objectFactory_.createSkipProExpr();
    }
    catch (Exception exception) {
      String message =
        "class AstToJaxb: "
        + "Cannot transform a SkipProExpr to the corresponding "
        + "Jaxb class";
      throw new CztException(message, exception);
    }

    getLogger().exiting(getClassName(), "visitSkipProExpr", jaxbObject);
    createElement_ = true;
    return jaxbObject;
  }

  public Object visitChannelExpr(net.sourceforge.czt.tcoz.ast.ChannelExpr zedObject)
  {
    getLogger().entering(getClassName(), "visitChannelExpr", zedObject);

    ChannelExpr jaxbObject = null;
    try {
      jaxbObject = objectFactory_.createChannelExprElement();
      if (!createElement_) {
        jaxbObject = objectFactory_.createChannelExpr();
      }
      createElement_ = true;
      if (zedObject.getExpr() != null) {
        Term term = zedObject.getExpr();
        jaxbObject.setExpr((Expr) term.accept(this));
      }
      createElement_ = false;
      if (zedObject.getChannelType() != null) {
        jaxbObject.setChannelType(zedObject.getChannelType().toString());
      }
    }
    catch (Exception exception) {
      String message =
        "class AstToJaxb: "
        + "Cannot transform a ChannelExpr to the corresponding "
        + "Jaxb class";
      throw new CztException(message, exception);
    }

    getLogger().exiting(getClassName(), "visitChannelExpr", jaxbObject);
    createElement_ = true;
    return jaxbObject;
  }

  public Object visitEventSet(net.sourceforge.czt.tcoz.ast.EventSet zedObject)
  {
    getLogger().entering(getClassName(), "visitEventSet", zedObject);

    EventSet jaxbObject = null;
    try {
      jaxbObject = objectFactory_.createEventSetElement();
      if (!createElement_) {
        jaxbObject = objectFactory_.createEventSet();
      }
      {
        java.util.List list = zedObject.getEvent();
        java.util.List newlist = jaxbObject.getEvent();
        for (Iterator iter = list.iterator(); iter.hasNext();) {
          Object o = iter.next();
          if (o instanceof Term) {
            createElement_ = false;
            o = ((Term) o).accept(this);
          }
          newlist.add(o);
        }
      }
    }
    catch (Exception exception) {
      String message =
        "class AstToJaxb: "
        + "Cannot transform a EventSet to the corresponding "
        + "Jaxb class";
      throw new CztException(message, exception);
    }
    if (zedObject.getAnns() != null) {
      java.util.List list = zedObject.getAnns();
      if (list.size() > 0) {
        try {
          net.sourceforge.czt.z.jaxb.gen.TermA.AnnsType anns =
                           annsObjectFactory_.createTermAAnnsType();
          java.util.List newlist = anns.getany();
          for (Iterator iter = list.iterator(); iter.hasNext();) {
            Term term = (Term) iter.next();
            Object o = term.accept(this);
            newlist.add(o);
          }
          jaxbObject.setAnns(anns);
        }
        catch (Exception exception) {
          String message = "class AstToJaxb: "
                    + "Cannot transform a EventSet to the corresponding "
                    + "Jaxb class";
          throw new CztException(message, exception);
        }
      }
    }

    getLogger().exiting(getClassName(), "visitEventSet", jaxbObject);
    createElement_ = true;
    return jaxbObject;
  }

  public Object visitEvent(net.sourceforge.czt.tcoz.ast.Event zedObject)
  {
    getLogger().entering(getClassName(), "visitEvent", zedObject);

    Event jaxbObject = null;
    try {
      jaxbObject = objectFactory_.createEventElement();
      if (!createElement_) {
        jaxbObject = objectFactory_.createEvent();
      }
      createElement_ = false;
      if (zedObject.getName() != null) {
        Term term = zedObject.getName();
        jaxbObject.setName((RefName) term.accept(this));
      }
      createElement_ = true;
      if (zedObject.getExpr() != null) {
        Term term = zedObject.getExpr();
        jaxbObject.setExpr((Expr) term.accept(this));
      }
    }
    catch (Exception exception) {
      String message =
        "class AstToJaxb: "
        + "Cannot transform a Event to the corresponding "
        + "Jaxb class";
      throw new CztException(message, exception);
    }
    if (zedObject.getAnns() != null) {
      java.util.List list = zedObject.getAnns();
      if (list.size() > 0) {
        try {
          net.sourceforge.czt.z.jaxb.gen.TermA.AnnsType anns =
                           annsObjectFactory_.createTermAAnnsType();
          java.util.List newlist = anns.getany();
          for (Iterator iter = list.iterator(); iter.hasNext();) {
            Term term = (Term) iter.next();
            Object o = term.accept(this);
            newlist.add(o);
          }
          jaxbObject.setAnns(anns);
        }
        catch (Exception exception) {
          String message = "class AstToJaxb: "
                    + "Cannot transform a Event to the corresponding "
                    + "Jaxb class";
          throw new CztException(message, exception);
        }
      }
    }

    getLogger().exiting(getClassName(), "visitEvent", jaxbObject);
    createElement_ = true;
    return jaxbObject;
  }

  public Object visitTopologyProExpr(net.sourceforge.czt.tcoz.ast.TopologyProExpr zedObject)
  {
    getLogger().entering(getClassName(), "visitTopologyProExpr", zedObject);

    TopologyProExpr jaxbObject = null;
    try {
      jaxbObject = objectFactory_.createTopologyProExprElement();
      if (!createElement_) {
        jaxbObject = objectFactory_.createTopologyProExpr();
      }
      {
        java.util.List list = zedObject.getConnection();
        java.util.List newlist = jaxbObject.getConnection();
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
        + "Cannot transform a TopologyProExpr to the corresponding "
        + "Jaxb class";
      throw new CztException(message, exception);
    }

    getLogger().exiting(getClassName(), "visitTopologyProExpr", jaxbObject);
    createElement_ = true;
    return jaxbObject;
  }

  public Object visitTimeoutEndProExpr(net.sourceforge.czt.tcoz.ast.TimeoutEndProExpr zedObject)
  {
    getLogger().entering(getClassName(), "visitTimeoutEndProExpr", zedObject);

    TimeoutEndProExpr jaxbObject = null;
    try {
      jaxbObject = objectFactory_.createTimeoutEndProExpr();
      createElement_ = false;
      if (zedObject.getNormalOp() != null) {
        Term term = zedObject.getNormalOp();
        jaxbObject.setNormalOp((OperationExpr) term.accept(this));
      }
      createElement_ = false;
      if (zedObject.getIntOrTimeout() != null) {
        Term term = zedObject.getIntOrTimeout();
        jaxbObject.setIntOrTimeout((Expr1) term.accept(this));
      }
      createElement_ = false;
      if (zedObject.getHandlerOp() != null) {
        Term term = zedObject.getHandlerOp();
        jaxbObject.setHandlerOp((OperationExpr) term.accept(this));
      }
    }
    catch (Exception exception) {
      String message =
        "class AstToJaxb: "
        + "Cannot transform a TimeoutEndProExpr to the corresponding "
        + "Jaxb class";
      throw new CztException(message, exception);
    }

    getLogger().exiting(getClassName(), "visitTimeoutEndProExpr", jaxbObject);
    createElement_ = true;
    return jaxbObject;
  }

  public Object visitTimeoutStartProExpr(net.sourceforge.czt.tcoz.ast.TimeoutStartProExpr zedObject)
  {
    getLogger().entering(getClassName(), "visitTimeoutStartProExpr", zedObject);

    TimeoutStartProExpr jaxbObject = null;
    try {
      jaxbObject = objectFactory_.createTimeoutStartProExpr();
      createElement_ = false;
      if (zedObject.getNormalOp() != null) {
        Term term = zedObject.getNormalOp();
        jaxbObject.setNormalOp((OperationExpr) term.accept(this));
      }
      createElement_ = false;
      if (zedObject.getIntOrTimeout() != null) {
        Term term = zedObject.getIntOrTimeout();
        jaxbObject.setIntOrTimeout((Expr1) term.accept(this));
      }
      createElement_ = false;
      if (zedObject.getHandlerOp() != null) {
        Term term = zedObject.getHandlerOp();
        jaxbObject.setHandlerOp((OperationExpr) term.accept(this));
      }
    }
    catch (Exception exception) {
      String message =
        "class AstToJaxb: "
        + "Cannot transform a TimeoutStartProExpr to the corresponding "
        + "Jaxb class";
      throw new CztException(message, exception);
    }

    getLogger().exiting(getClassName(), "visitTimeoutStartProExpr", jaxbObject);
    createElement_ = true;
    return jaxbObject;
  }
}
