
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

import net.sourceforge.czt.util.ReflectiveVisitor;
import net.sourceforge.czt.tcoz.ast.*;

/**
 * The unmarshaller responsible for deserializing XML data.
 *
 * @author Gnast version 0.1
 */
public class JaxbToAst extends net.sourceforge.czt.oz.jaxb.JaxbToAst
{
  protected TcozFactory mTcozFactory_;

  public JaxbToAst()
  {
    mTcozFactory_ =
      new net.sourceforge.czt.tcoz.impl.TcozFactoryImpl();
  }

  public JaxbToAst(net.sourceforge.czt.z.ast.ZFactory vZFactory, net.sourceforge.czt.oz.ast.OzFactory vOzFactory, TcozFactory vTcozFactory)
  {
    super(vZFactory, vOzFactory);
    mTcozFactory_ = vTcozFactory;
  }

  private static Logger getLogger()
  {
    return Logger.getLogger("net.sourceforge.czt.tcoz.jaxb.JaxbToAst");
  }

  public Object visitObject(Object object)
  {
    getLogger().fine("Visit " + object.getClass().toString());
    if (object instanceof String
        || object instanceof Boolean
        || object instanceof List
        || object instanceof Integer
        || object instanceof java.math.BigInteger) {
      return object;
    }
    throw new UnsupportedOperationException("Unexpected element "
                                            + object.getClass().getName());
  }

  public Object visitRecProExpr(net.sourceforge.czt.tcoz.jaxb.gen.RecProExpr jaxbObject)
  {
    getLogger().entering("JaxbToAst", "visitRecProExpr", jaxbObject);
    net.sourceforge.czt.z.ast.RefName opName =
      (net.sourceforge.czt.z.ast.RefName) dispatch(jaxbObject.getOpName());
    net.sourceforge.czt.oz.ast.OperationExpr operationExpr =
      (net.sourceforge.czt.oz.ast.OperationExpr) dispatch(jaxbObject.getOperationExpr());
    RecProExpr erg = mTcozFactory_.createRecProExpr(opName, operationExpr);
    getLogger().exiting("JaxbToAst", "visitRecProExpr", erg);
    return erg;
  }

  public Object visitWaitUntilProExpr(net.sourceforge.czt.tcoz.jaxb.gen.WaitUntilProExpr jaxbObject)
  {
    getLogger().entering("JaxbToAst", "visitWaitUntilProExpr", jaxbObject);
    net.sourceforge.czt.oz.ast.OperationExpr operationExpr =
      (net.sourceforge.czt.oz.ast.OperationExpr) dispatch(jaxbObject.getOperationExpr());
    net.sourceforge.czt.z.ast.Expr1 waitUntil =
      (net.sourceforge.czt.z.ast.Expr1) dispatch(jaxbObject.getWaitUntil());
    WaitUntilProExpr erg = mTcozFactory_.createWaitUntilProExpr(operationExpr, waitUntil);
    getLogger().exiting("JaxbToAst", "visitWaitUntilProExpr", erg);
    return erg;
  }

  public Object visitDeadlineProExpr(net.sourceforge.czt.tcoz.jaxb.gen.DeadlineProExpr jaxbObject)
  {
    getLogger().entering("JaxbToAst", "visitDeadlineProExpr", jaxbObject);
    net.sourceforge.czt.oz.ast.OperationExpr operationExpr =
      (net.sourceforge.czt.oz.ast.OperationExpr) dispatch(jaxbObject.getOperationExpr());
    net.sourceforge.czt.z.ast.Expr1 deadline =
      (net.sourceforge.czt.z.ast.Expr1) dispatch(jaxbObject.getDeadline());
    DeadlineProExpr erg = mTcozFactory_.createDeadlineProExpr(operationExpr, deadline);
    getLogger().exiting("JaxbToAst", "visitDeadlineProExpr", erg);
    return erg;
  }

  public Object visitWaitProExpr(net.sourceforge.czt.tcoz.jaxb.gen.WaitProExpr jaxbObject)
  {
    getLogger().entering("JaxbToAst", "visitWaitProExpr", jaxbObject);
    net.sourceforge.czt.z.ast.Expr expr =
      (net.sourceforge.czt.z.ast.Expr) dispatch(jaxbObject.getExpr());
    WaitProExpr erg = mTcozFactory_.createWaitProExpr(expr);
    getLogger().exiting("JaxbToAst", "visitWaitProExpr", erg);
    return erg;
  }

  public Object visitDivergeProExpr(net.sourceforge.czt.tcoz.jaxb.gen.DivergeProExpr jaxbObject)
  {
    getLogger().entering("JaxbToAst", "visitDivergeProExpr", jaxbObject);
    DivergeProExpr erg = mTcozFactory_.createDivergeProExpr();
    getLogger().exiting("JaxbToAst", "visitDivergeProExpr", erg);
    return erg;
  }

  public Object visitSynPllProExpr(net.sourceforge.czt.tcoz.jaxb.gen.SynPllProExpr jaxbObject)
  {
    getLogger().entering("JaxbToAst", "visitSynPllProExpr", jaxbObject);
    EventSet events =
      (EventSet) dispatch(jaxbObject.getEvents());
    SynPllProExpr erg = mTcozFactory_.createSynPllProExpr(events);
    getLogger().exiting("JaxbToAst", "visitSynPllProExpr", erg);
    return erg;
  }

  public Object visitInterruptProExpr(net.sourceforge.czt.tcoz.jaxb.gen.InterruptProExpr jaxbObject)
  {
    getLogger().entering("JaxbToAst", "visitInterruptProExpr", jaxbObject);
    net.sourceforge.czt.oz.ast.OperationExpr normalOp =
      (net.sourceforge.czt.oz.ast.OperationExpr) dispatch(jaxbObject.getNormalOp());
    net.sourceforge.czt.z.ast.Expr1 intOrTimeout =
      (net.sourceforge.czt.z.ast.Expr1) dispatch(jaxbObject.getIntOrTimeout());
    net.sourceforge.czt.oz.ast.OperationExpr handlerOp =
      (net.sourceforge.czt.oz.ast.OperationExpr) dispatch(jaxbObject.getHandlerOp());
    InterruptProExpr erg = mTcozFactory_.createInterruptProExpr(normalOp, intOrTimeout, handlerOp);
    getLogger().exiting("JaxbToAst", "visitInterruptProExpr", erg);
    return erg;
  }

  public Object visitInterleaveProExpr(net.sourceforge.czt.tcoz.jaxb.gen.InterleaveProExpr jaxbObject)
  {
    getLogger().entering("JaxbToAst", "visitInterleaveProExpr", jaxbObject);
    InterleaveProExpr erg = mTcozFactory_.createInterleaveProExpr();
    getLogger().exiting("JaxbToAst", "visitInterleaveProExpr", erg);
    return erg;
  }

  public Object visitAtProExpr(net.sourceforge.czt.tcoz.jaxb.gen.AtProExpr jaxbObject)
  {
    getLogger().entering("JaxbToAst", "visitAtProExpr", jaxbObject);
    Event event =
      (Event) dispatch(jaxbObject.getEvent());
    net.sourceforge.czt.z.ast.Expr expr =
      (net.sourceforge.czt.z.ast.Expr) dispatch(jaxbObject.getExpr());
    net.sourceforge.czt.oz.ast.OperationExpr operationExpr =
      (net.sourceforge.czt.oz.ast.OperationExpr) dispatch(jaxbObject.getOperationExpr());
    AtProExpr erg = mTcozFactory_.createAtProExpr(event, expr, operationExpr);
    getLogger().exiting("JaxbToAst", "visitAtProExpr", erg);
    return erg;
  }

  public Object visitConnection(net.sourceforge.czt.tcoz.jaxb.gen.Connection jaxbObject)
  {
    getLogger().entering("JaxbToAst", "visitConnection", jaxbObject);
    net.sourceforge.czt.oz.ast.RefNameList leftProcess =
      (net.sourceforge.czt.oz.ast.RefNameList) dispatch(jaxbObject.getLeftProcess());
    net.sourceforge.czt.oz.ast.RefNameList rightProcess =
      (net.sourceforge.czt.oz.ast.RefNameList) dispatch(jaxbObject.getRightProcess());
    net.sourceforge.czt.oz.ast.RefNameList channels =
      (net.sourceforge.czt.oz.ast.RefNameList) dispatch(jaxbObject.getChannels());
    Connection erg = mTcozFactory_.createConnection(leftProcess, rightProcess, channels);
    if (jaxbObject.getAnns() != null
        && jaxbObject.getAnns().getany() != null) {
      List annsList = erg.getAnns();
      List anyList = jaxbObject.getAnns().getany();
      for (Iterator iter = anyList.iterator(); iter.hasNext();) {
        Object obj = iter.next();
        Object o = dispatch(obj);
        annsList.add(o);
      }
    }
    getLogger().exiting("JaxbToAst", "visitConnection", erg);
    return erg;
  }

  public Object visitInterruptTimeOpExpr(net.sourceforge.czt.tcoz.jaxb.gen.InterruptTimeOpExpr jaxbObject)
  {
    getLogger().entering("JaxbToAst", "visitInterruptTimeOpExpr", jaxbObject);
    net.sourceforge.czt.oz.ast.OperationExpr normalOp =
      (net.sourceforge.czt.oz.ast.OperationExpr) dispatch(jaxbObject.getNormalOp());
    net.sourceforge.czt.z.ast.Expr1 intOrTimeout =
      (net.sourceforge.czt.z.ast.Expr1) dispatch(jaxbObject.getIntOrTimeout());
    net.sourceforge.czt.oz.ast.OperationExpr handlerOp =
      (net.sourceforge.czt.oz.ast.OperationExpr) dispatch(jaxbObject.getHandlerOp());
    InterruptTimeOpExpr erg = mTcozFactory_.createInterruptTimeOpExpr(normalOp, intOrTimeout, handlerOp);
    getLogger().exiting("JaxbToAst", "visitInterruptTimeOpExpr", erg);
    return erg;
  }

  public Object visitGuardProExpr(net.sourceforge.czt.tcoz.jaxb.gen.GuardProExpr jaxbObject)
  {
    getLogger().entering("JaxbToAst", "visitGuardProExpr", jaxbObject);
    net.sourceforge.czt.z.ast.SchText guard =
      (net.sourceforge.czt.z.ast.SchText) dispatch(jaxbObject.getGuard());
    net.sourceforge.czt.oz.ast.OperationExpr operationExpr =
      (net.sourceforge.czt.oz.ast.OperationExpr) dispatch(jaxbObject.getOperationExpr());
    GuardProExpr erg = mTcozFactory_.createGuardProExpr(guard, operationExpr);
    getLogger().exiting("JaxbToAst", "visitGuardProExpr", erg);
    return erg;
  }

  public Object visitStopProExpr(net.sourceforge.czt.tcoz.jaxb.gen.StopProExpr jaxbObject)
  {
    getLogger().entering("JaxbToAst", "visitStopProExpr", jaxbObject);
    StopProExpr erg = mTcozFactory_.createStopProExpr();
    getLogger().exiting("JaxbToAst", "visitStopProExpr", erg);
    return erg;
  }

  public Object visitSkipProExpr(net.sourceforge.czt.tcoz.jaxb.gen.SkipProExpr jaxbObject)
  {
    getLogger().entering("JaxbToAst", "visitSkipProExpr", jaxbObject);
    SkipProExpr erg = mTcozFactory_.createSkipProExpr();
    getLogger().exiting("JaxbToAst", "visitSkipProExpr", erg);
    return erg;
  }

  public Object visitChannelExpr(net.sourceforge.czt.tcoz.jaxb.gen.ChannelExpr jaxbObject)
  {
    getLogger().entering("JaxbToAst", "visitChannelExpr", jaxbObject);
    net.sourceforge.czt.z.ast.Expr expr =
      (net.sourceforge.czt.z.ast.Expr) dispatch(jaxbObject.getExpr());
    ChannelType channelType =
      (ChannelType) dispatch(jaxbObject.getChannelType());
    ChannelExpr erg = mTcozFactory_.createChannelExpr(expr, channelType);
    getLogger().exiting("JaxbToAst", "visitChannelExpr", erg);
    return erg;
  }

  public Object visitEventSet(net.sourceforge.czt.tcoz.jaxb.gen.EventSet jaxbObject)
  {
    getLogger().entering("JaxbToAst", "visitEventSet", jaxbObject);
    java.util.List event = new java.util.Vector();
    for (Iterator iter = jaxbObject.getEvent().iterator(); iter.hasNext();) {
      Object obj = iter.next();
      Object o = dispatch(obj);
      event.add(o);
    }
    EventSet erg = mTcozFactory_.createEventSet(event);
    if (jaxbObject.getAnns() != null
        && jaxbObject.getAnns().getany() != null) {
      List annsList = erg.getAnns();
      List anyList = jaxbObject.getAnns().getany();
      for (Iterator iter = anyList.iterator(); iter.hasNext();) {
        Object obj = iter.next();
        Object o = dispatch(obj);
        annsList.add(o);
      }
    }
    getLogger().exiting("JaxbToAst", "visitEventSet", erg);
    return erg;
  }

  public Object visitEvent(net.sourceforge.czt.tcoz.jaxb.gen.Event jaxbObject)
  {
    getLogger().entering("JaxbToAst", "visitEvent", jaxbObject);
    net.sourceforge.czt.z.ast.RefName name =
      (net.sourceforge.czt.z.ast.RefName) dispatch(jaxbObject.getName());
    net.sourceforge.czt.z.ast.Expr expr =
      (net.sourceforge.czt.z.ast.Expr) dispatch(jaxbObject.getExpr());
    Event erg = mTcozFactory_.createEvent(name, expr);
    if (jaxbObject.getAnns() != null
        && jaxbObject.getAnns().getany() != null) {
      List annsList = erg.getAnns();
      List anyList = jaxbObject.getAnns().getany();
      for (Iterator iter = anyList.iterator(); iter.hasNext();) {
        Object obj = iter.next();
        Object o = dispatch(obj);
        annsList.add(o);
      }
    }
    getLogger().exiting("JaxbToAst", "visitEvent", erg);
    return erg;
  }

  public Object visitTopologyProExpr(net.sourceforge.czt.tcoz.jaxb.gen.TopologyProExpr jaxbObject)
  {
    getLogger().entering("JaxbToAst", "visitTopologyProExpr", jaxbObject);
    java.util.List connection = new java.util.Vector();
    for (Iterator iter = jaxbObject.getConnection().iterator(); iter.hasNext();) {
      Object obj = iter.next();
      Object o = dispatch(obj);
      connection.add(o);
    }
    TopologyProExpr erg = mTcozFactory_.createTopologyProExpr(connection);
    getLogger().exiting("JaxbToAst", "visitTopologyProExpr", erg);
    return erg;
  }

  public Object visitTimeoutEndProExpr(net.sourceforge.czt.tcoz.jaxb.gen.TimeoutEndProExpr jaxbObject)
  {
    getLogger().entering("JaxbToAst", "visitTimeoutEndProExpr", jaxbObject);
    net.sourceforge.czt.oz.ast.OperationExpr normalOp =
      (net.sourceforge.czt.oz.ast.OperationExpr) dispatch(jaxbObject.getNormalOp());
    net.sourceforge.czt.z.ast.Expr1 intOrTimeout =
      (net.sourceforge.czt.z.ast.Expr1) dispatch(jaxbObject.getIntOrTimeout());
    net.sourceforge.czt.oz.ast.OperationExpr handlerOp =
      (net.sourceforge.czt.oz.ast.OperationExpr) dispatch(jaxbObject.getHandlerOp());
    TimeoutEndProExpr erg = mTcozFactory_.createTimeoutEndProExpr(normalOp, intOrTimeout, handlerOp);
    getLogger().exiting("JaxbToAst", "visitTimeoutEndProExpr", erg);
    return erg;
  }

  public Object visitTimeoutStartProExpr(net.sourceforge.czt.tcoz.jaxb.gen.TimeoutStartProExpr jaxbObject)
  {
    getLogger().entering("JaxbToAst", "visitTimeoutStartProExpr", jaxbObject);
    net.sourceforge.czt.oz.ast.OperationExpr normalOp =
      (net.sourceforge.czt.oz.ast.OperationExpr) dispatch(jaxbObject.getNormalOp());
    net.sourceforge.czt.z.ast.Expr1 intOrTimeout =
      (net.sourceforge.czt.z.ast.Expr1) dispatch(jaxbObject.getIntOrTimeout());
    net.sourceforge.czt.oz.ast.OperationExpr handlerOp =
      (net.sourceforge.czt.oz.ast.OperationExpr) dispatch(jaxbObject.getHandlerOp());
    TimeoutStartProExpr erg = mTcozFactory_.createTimeoutStartProExpr(normalOp, intOrTimeout, handlerOp);
    getLogger().exiting("JaxbToAst", "visitTimeoutStartProExpr", erg);
    return erg;
  }
}
