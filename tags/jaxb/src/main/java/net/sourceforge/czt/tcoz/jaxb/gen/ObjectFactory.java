//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.5-b16-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.06.26 at 02:10:37 PM NZST 
//


package net.sourceforge.czt.tcoz.jaxb.gen;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.sourceforge.czt.tcoz.jaxb.gen package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
public class ObjectFactory
    extends net.sourceforge.czt.circus.jaxb.gen.impl.runtime.DefaultJAXBContextImpl
{

    private static java.util.HashMap defaultImplementations = new java.util.HashMap(55, 0.75F);
    private static java.util.HashMap rootTagMap = new java.util.HashMap();
    public final static net.sourceforge.czt.circus.jaxb.gen.impl.runtime.GrammarInfo grammarInfo = new net.sourceforge.czt.circus.jaxb.gen.impl.runtime.GrammarInfoImpl(rootTagMap, defaultImplementations, (net.sourceforge.czt.tcoz.jaxb.gen.ObjectFactory.class));
    public final static java.lang.Class version = (net.sourceforge.czt.tcoz.jaxb.gen.impl.JAXBVersion.class);

    static {
        defaultImplementations.put((net.sourceforge.czt.tcoz.jaxb.gen.ConnectionElement.class), "net.sourceforge.czt.tcoz.jaxb.gen.impl.ConnectionElementImpl");
        defaultImplementations.put((net.sourceforge.czt.tcoz.jaxb.gen.TimeoutEndProExpr.class), "net.sourceforge.czt.tcoz.jaxb.gen.impl.TimeoutEndProExprImpl");
        defaultImplementations.put((net.sourceforge.czt.tcoz.jaxb.gen.SkipProExpr.class), "net.sourceforge.czt.tcoz.jaxb.gen.impl.SkipProExprImpl");
        defaultImplementations.put((net.sourceforge.czt.tcoz.jaxb.gen.SensorExpr.class), "net.sourceforge.czt.tcoz.jaxb.gen.impl.SensorExprImpl");
        defaultImplementations.put((net.sourceforge.czt.tcoz.jaxb.gen.RecProExpr.class), "net.sourceforge.czt.tcoz.jaxb.gen.impl.RecProExprImpl");
        defaultImplementations.put((net.sourceforge.czt.tcoz.jaxb.gen.TopologyProExpr.class), "net.sourceforge.czt.tcoz.jaxb.gen.impl.TopologyProExprImpl");
        defaultImplementations.put((net.sourceforge.czt.tcoz.jaxb.gen.AtProExprElement.class), "net.sourceforge.czt.tcoz.jaxb.gen.impl.AtProExprElementImpl");
        defaultImplementations.put((net.sourceforge.czt.tcoz.jaxb.gen.SynPllProExprElement.class), "net.sourceforge.czt.tcoz.jaxb.gen.impl.SynPllProExprElementImpl");
        defaultImplementations.put((net.sourceforge.czt.tcoz.jaxb.gen.WaitProExpr.class), "net.sourceforge.czt.tcoz.jaxb.gen.impl.WaitProExprImpl");
        defaultImplementations.put((net.sourceforge.czt.tcoz.jaxb.gen.SensorExprElement.class), "net.sourceforge.czt.tcoz.jaxb.gen.impl.SensorExprElementImpl");
        defaultImplementations.put((net.sourceforge.czt.tcoz.jaxb.gen.WaitUntilProExprElement.class), "net.sourceforge.czt.tcoz.jaxb.gen.impl.WaitUntilProExprElementImpl");
        defaultImplementations.put((net.sourceforge.czt.tcoz.jaxb.gen.InterleaveProExpr.class), "net.sourceforge.czt.tcoz.jaxb.gen.impl.InterleaveProExprImpl");
        defaultImplementations.put((net.sourceforge.czt.tcoz.jaxb.gen.WaitUntilProExpr.class), "net.sourceforge.czt.tcoz.jaxb.gen.impl.WaitUntilProExprImpl");
        defaultImplementations.put((net.sourceforge.czt.tcoz.jaxb.gen.ActuatorExprElement.class), "net.sourceforge.czt.tcoz.jaxb.gen.impl.ActuatorExprElementImpl");
        defaultImplementations.put((net.sourceforge.czt.tcoz.jaxb.gen.DistInChoiceProExpr.class), "net.sourceforge.czt.tcoz.jaxb.gen.impl.DistInChoiceProExprImpl");
        defaultImplementations.put((net.sourceforge.czt.tcoz.jaxb.gen.DivergeProExpr.class), "net.sourceforge.czt.tcoz.jaxb.gen.impl.DivergeProExprImpl");
        defaultImplementations.put((net.sourceforge.czt.tcoz.jaxb.gen.StopProExpr.class), "net.sourceforge.czt.tcoz.jaxb.gen.impl.StopProExprImpl");
        defaultImplementations.put((net.sourceforge.czt.tcoz.jaxb.gen.AtProExpr.class), "net.sourceforge.czt.tcoz.jaxb.gen.impl.AtProExprImpl");
        defaultImplementations.put((net.sourceforge.czt.tcoz.jaxb.gen.WaitProExprElement.class), "net.sourceforge.czt.tcoz.jaxb.gen.impl.WaitProExprElementImpl");
        defaultImplementations.put((net.sourceforge.czt.tcoz.jaxb.gen.InterruptProExpr.class), "net.sourceforge.czt.tcoz.jaxb.gen.impl.InterruptProExprImpl");
        defaultImplementations.put((net.sourceforge.czt.tcoz.jaxb.gen.EventSet.class), "net.sourceforge.czt.tcoz.jaxb.gen.impl.EventSetImpl");
        defaultImplementations.put((net.sourceforge.czt.tcoz.jaxb.gen.RecProExprElement.class), "net.sourceforge.czt.tcoz.jaxb.gen.impl.RecProExprElementImpl");
        defaultImplementations.put((net.sourceforge.czt.tcoz.jaxb.gen.TopologyProExprElement.class), "net.sourceforge.czt.tcoz.jaxb.gen.impl.TopologyProExprElementImpl");
        defaultImplementations.put((net.sourceforge.czt.tcoz.jaxb.gen.ActuatorExpr.class), "net.sourceforge.czt.tcoz.jaxb.gen.impl.ActuatorExprImpl");
        defaultImplementations.put((net.sourceforge.czt.tcoz.jaxb.gen.ChannelTypeElement.class), "net.sourceforge.czt.tcoz.jaxb.gen.impl.ChannelTypeElementImpl");
        defaultImplementations.put((net.sourceforge.czt.tcoz.jaxb.gen.DeadlineProExprElement.class), "net.sourceforge.czt.tcoz.jaxb.gen.impl.DeadlineProExprElementImpl");
        defaultImplementations.put((net.sourceforge.czt.tcoz.jaxb.gen.ChannelExprElement.class), "net.sourceforge.czt.tcoz.jaxb.gen.impl.ChannelExprElementImpl");
        defaultImplementations.put((net.sourceforge.czt.tcoz.jaxb.gen.DeadlineProExpr.class), "net.sourceforge.czt.tcoz.jaxb.gen.impl.DeadlineProExprImpl");
        defaultImplementations.put((net.sourceforge.czt.tcoz.jaxb.gen.EventSetElement.class), "net.sourceforge.czt.tcoz.jaxb.gen.impl.EventSetElementImpl");
        defaultImplementations.put((net.sourceforge.czt.tcoz.jaxb.gen.TimeoutStartProExpr.class), "net.sourceforge.czt.tcoz.jaxb.gen.impl.TimeoutStartProExprImpl");
        defaultImplementations.put((net.sourceforge.czt.tcoz.jaxb.gen.Connection.class), "net.sourceforge.czt.tcoz.jaxb.gen.impl.ConnectionImpl");
        defaultImplementations.put((net.sourceforge.czt.tcoz.jaxb.gen.InterruptTimeOpExprElement.class), "net.sourceforge.czt.tcoz.jaxb.gen.impl.InterruptTimeOpExprElementImpl");
        defaultImplementations.put((net.sourceforge.czt.tcoz.jaxb.gen.DistInterleaveProExpr.class), "net.sourceforge.czt.tcoz.jaxb.gen.impl.DistInterleaveProExprImpl");
        defaultImplementations.put((net.sourceforge.czt.tcoz.jaxb.gen.EventElement.class), "net.sourceforge.czt.tcoz.jaxb.gen.impl.EventElementImpl");
        defaultImplementations.put((net.sourceforge.czt.tcoz.jaxb.gen.SynPllProExpr.class), "net.sourceforge.czt.tcoz.jaxb.gen.impl.SynPllProExprImpl");
        defaultImplementations.put((net.sourceforge.czt.tcoz.jaxb.gen.InterruptTimeOpExpr.class), "net.sourceforge.czt.tcoz.jaxb.gen.impl.InterruptTimeOpExprImpl");
        defaultImplementations.put((net.sourceforge.czt.tcoz.jaxb.gen.InChoiceProExpr.class), "net.sourceforge.czt.tcoz.jaxb.gen.impl.InChoiceProExprImpl");
        defaultImplementations.put((net.sourceforge.czt.tcoz.jaxb.gen.ChannelExpr.class), "net.sourceforge.czt.tcoz.jaxb.gen.impl.ChannelExprImpl");
        defaultImplementations.put((net.sourceforge.czt.tcoz.jaxb.gen.Event.class), "net.sourceforge.czt.tcoz.jaxb.gen.impl.EventImpl");
        defaultImplementations.put((net.sourceforge.czt.tcoz.jaxb.gen.ChannelType.class), "net.sourceforge.czt.tcoz.jaxb.gen.impl.ChannelTypeImpl");
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/tcoz", "AtProExpr"), (net.sourceforge.czt.tcoz.jaxb.gen.AtProExprElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/tcoz", "ChannelExpr"), (net.sourceforge.czt.tcoz.jaxb.gen.ChannelExprElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/tcoz", "RecProExpr"), (net.sourceforge.czt.tcoz.jaxb.gen.RecProExprElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/tcoz", "Event"), (net.sourceforge.czt.tcoz.jaxb.gen.EventElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/tcoz", "TimeoutStartProExpr"), (net.sourceforge.czt.tcoz.jaxb.gen.TimeoutStartProExpr.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/tcoz", "DistInterleaveProExpr"), (net.sourceforge.czt.tcoz.jaxb.gen.DistInterleaveProExpr.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/tcoz", "TimeoutEndProExpr"), (net.sourceforge.czt.tcoz.jaxb.gen.TimeoutEndProExpr.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/tcoz", "DeadlineProExpr"), (net.sourceforge.czt.tcoz.jaxb.gen.DeadlineProExprElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/tcoz", "Connection"), (net.sourceforge.czt.tcoz.jaxb.gen.ConnectionElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/tcoz", "EventSet"), (net.sourceforge.czt.tcoz.jaxb.gen.EventSetElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/tcoz", "ActuatorExpr"), (net.sourceforge.czt.tcoz.jaxb.gen.ActuatorExprElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/tcoz", "StopProExpr"), (net.sourceforge.czt.tcoz.jaxb.gen.StopProExpr.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/tcoz", "WaitUntilProExpr"), (net.sourceforge.czt.tcoz.jaxb.gen.WaitUntilProExprElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/tcoz", "WaitProExpr"), (net.sourceforge.czt.tcoz.jaxb.gen.WaitProExprElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/tcoz", "DivergeProExpr"), (net.sourceforge.czt.tcoz.jaxb.gen.DivergeProExpr.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/tcoz", "TopologyProExpr"), (net.sourceforge.czt.tcoz.jaxb.gen.TopologyProExprElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/tcoz", "InChoiceProExpr"), (net.sourceforge.czt.tcoz.jaxb.gen.InChoiceProExpr.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/tcoz", "SkipProExpr"), (net.sourceforge.czt.tcoz.jaxb.gen.SkipProExpr.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/tcoz", "InterruptProExpr"), (net.sourceforge.czt.tcoz.jaxb.gen.InterruptProExpr.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/tcoz", "SynPllProExpr"), (net.sourceforge.czt.tcoz.jaxb.gen.SynPllProExprElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/tcoz", "DistInChoiceProExpr"), (net.sourceforge.czt.tcoz.jaxb.gen.DistInChoiceProExpr.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/tcoz", "SensorExpr"), (net.sourceforge.czt.tcoz.jaxb.gen.SensorExprElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/tcoz", "ChannelType"), (net.sourceforge.czt.tcoz.jaxb.gen.ChannelTypeElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/tcoz", "InterruptTimeOpExpr"), (net.sourceforge.czt.tcoz.jaxb.gen.InterruptTimeOpExprElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/tcoz", "InterleaveProExpr"), (net.sourceforge.czt.tcoz.jaxb.gen.InterleaveProExpr.class));
    }

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.sourceforge.czt.tcoz.jaxb.gen
     * 
     */
    public ObjectFactory() {
        super(grammarInfo);
    }

    /**
     * Create an instance of the specified Java content interface.
     * 
     * @param javaContentInterface
     *     the Class object of the javacontent interface to instantiate
     * @return
     *     a new instance
     * @throws JAXBException
     *     if an error occurs
     */
    public java.lang.Object newInstance(java.lang.Class javaContentInterface)
        throws javax.xml.bind.JAXBException
    {
        return super.newInstance(javaContentInterface);
    }

    /**
     * Get the specified property. This method can only be
     * used to get provider specific properties.
     * Attempting to get an undefined property will result
     * in a PropertyException being thrown.
     * 
     * @param name
     *     the name of the property to retrieve
     * @return
     *     the value of the requested property
     * @throws PropertyException
     *     when there is an error retrieving the given property or value
     */
    public java.lang.Object getProperty(java.lang.String name)
        throws javax.xml.bind.PropertyException
    {
        return super.getProperty(name);
    }

    /**
     * Set the specified property. This method can only be
     * used to set provider specific properties.
     * Attempting to set an undefined property will result
     * in a PropertyException being thrown.
     * 
     * @param value
     *     the value of the property to be set
     * @param name
     *     the name of the property to retrieve
     * @throws PropertyException
     *     when there is an error processing the given property or value
     */
    public void setProperty(java.lang.String name, java.lang.Object value)
        throws javax.xml.bind.PropertyException
    {
        super.setProperty(name, value);
    }

    /**
     * Create an instance of ConnectionElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.tcoz.jaxb.gen.ConnectionElement createConnectionElement()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.tcoz.jaxb.gen.impl.ConnectionElementImpl();
    }

    /**
     * Create an instance of TimeoutEndProExpr
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.tcoz.jaxb.gen.TimeoutEndProExpr createTimeoutEndProExpr()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.tcoz.jaxb.gen.impl.TimeoutEndProExprImpl();
    }

    /**
     * Create an instance of SkipProExpr
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.tcoz.jaxb.gen.SkipProExpr createSkipProExpr()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.tcoz.jaxb.gen.impl.SkipProExprImpl();
    }

    /**
     * Create an instance of SensorExpr
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.tcoz.jaxb.gen.SensorExpr createSensorExpr()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.tcoz.jaxb.gen.impl.SensorExprImpl();
    }

    /**
     * Create an instance of RecProExpr
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.tcoz.jaxb.gen.RecProExpr createRecProExpr()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.tcoz.jaxb.gen.impl.RecProExprImpl();
    }

    /**
     * Create an instance of TopologyProExpr
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.tcoz.jaxb.gen.TopologyProExpr createTopologyProExpr()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.tcoz.jaxb.gen.impl.TopologyProExprImpl();
    }

    /**
     * Create an instance of AtProExprElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.tcoz.jaxb.gen.AtProExprElement createAtProExprElement()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.tcoz.jaxb.gen.impl.AtProExprElementImpl();
    }

    /**
     * Create an instance of SynPllProExprElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.tcoz.jaxb.gen.SynPllProExprElement createSynPllProExprElement()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.tcoz.jaxb.gen.impl.SynPllProExprElementImpl();
    }

    /**
     * Create an instance of WaitProExpr
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.tcoz.jaxb.gen.WaitProExpr createWaitProExpr()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.tcoz.jaxb.gen.impl.WaitProExprImpl();
    }

    /**
     * Create an instance of SensorExprElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.tcoz.jaxb.gen.SensorExprElement createSensorExprElement()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.tcoz.jaxb.gen.impl.SensorExprElementImpl();
    }

    /**
     * Create an instance of WaitUntilProExprElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.tcoz.jaxb.gen.WaitUntilProExprElement createWaitUntilProExprElement()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.tcoz.jaxb.gen.impl.WaitUntilProExprElementImpl();
    }

    /**
     * Create an instance of InterleaveProExpr
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.tcoz.jaxb.gen.InterleaveProExpr createInterleaveProExpr()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.tcoz.jaxb.gen.impl.InterleaveProExprImpl();
    }

    /**
     * Create an instance of WaitUntilProExpr
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.tcoz.jaxb.gen.WaitUntilProExpr createWaitUntilProExpr()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.tcoz.jaxb.gen.impl.WaitUntilProExprImpl();
    }

    /**
     * Create an instance of ActuatorExprElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.tcoz.jaxb.gen.ActuatorExprElement createActuatorExprElement()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.tcoz.jaxb.gen.impl.ActuatorExprElementImpl();
    }

    /**
     * Create an instance of DistInChoiceProExpr
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.tcoz.jaxb.gen.DistInChoiceProExpr createDistInChoiceProExpr()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.tcoz.jaxb.gen.impl.DistInChoiceProExprImpl();
    }

    /**
     * Create an instance of DivergeProExpr
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.tcoz.jaxb.gen.DivergeProExpr createDivergeProExpr()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.tcoz.jaxb.gen.impl.DivergeProExprImpl();
    }

    /**
     * Create an instance of StopProExpr
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.tcoz.jaxb.gen.StopProExpr createStopProExpr()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.tcoz.jaxb.gen.impl.StopProExprImpl();
    }

    /**
     * Create an instance of AtProExpr
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.tcoz.jaxb.gen.AtProExpr createAtProExpr()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.tcoz.jaxb.gen.impl.AtProExprImpl();
    }

    /**
     * Create an instance of WaitProExprElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.tcoz.jaxb.gen.WaitProExprElement createWaitProExprElement()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.tcoz.jaxb.gen.impl.WaitProExprElementImpl();
    }

    /**
     * Create an instance of InterruptProExpr
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.tcoz.jaxb.gen.InterruptProExpr createInterruptProExpr()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.tcoz.jaxb.gen.impl.InterruptProExprImpl();
    }

    /**
     * Create an instance of EventSet
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.tcoz.jaxb.gen.EventSet createEventSet()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.tcoz.jaxb.gen.impl.EventSetImpl();
    }

    /**
     * Create an instance of RecProExprElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.tcoz.jaxb.gen.RecProExprElement createRecProExprElement()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.tcoz.jaxb.gen.impl.RecProExprElementImpl();
    }

    /**
     * Create an instance of TopologyProExprElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.tcoz.jaxb.gen.TopologyProExprElement createTopologyProExprElement()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.tcoz.jaxb.gen.impl.TopologyProExprElementImpl();
    }

    /**
     * Create an instance of ActuatorExpr
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.tcoz.jaxb.gen.ActuatorExpr createActuatorExpr()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.tcoz.jaxb.gen.impl.ActuatorExprImpl();
    }

    /**
     * Create an instance of ChannelTypeElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.tcoz.jaxb.gen.ChannelTypeElement createChannelTypeElement()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.tcoz.jaxb.gen.impl.ChannelTypeElementImpl();
    }

    /**
     * Create an instance of DeadlineProExprElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.tcoz.jaxb.gen.DeadlineProExprElement createDeadlineProExprElement()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.tcoz.jaxb.gen.impl.DeadlineProExprElementImpl();
    }

    /**
     * Create an instance of ChannelExprElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.tcoz.jaxb.gen.ChannelExprElement createChannelExprElement()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.tcoz.jaxb.gen.impl.ChannelExprElementImpl();
    }

    /**
     * Create an instance of DeadlineProExpr
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.tcoz.jaxb.gen.DeadlineProExpr createDeadlineProExpr()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.tcoz.jaxb.gen.impl.DeadlineProExprImpl();
    }

    /**
     * Create an instance of EventSetElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.tcoz.jaxb.gen.EventSetElement createEventSetElement()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.tcoz.jaxb.gen.impl.EventSetElementImpl();
    }

    /**
     * Create an instance of TimeoutStartProExpr
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.tcoz.jaxb.gen.TimeoutStartProExpr createTimeoutStartProExpr()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.tcoz.jaxb.gen.impl.TimeoutStartProExprImpl();
    }

    /**
     * Create an instance of Connection
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.tcoz.jaxb.gen.Connection createConnection()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.tcoz.jaxb.gen.impl.ConnectionImpl();
    }

    /**
     * Create an instance of InterruptTimeOpExprElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.tcoz.jaxb.gen.InterruptTimeOpExprElement createInterruptTimeOpExprElement()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.tcoz.jaxb.gen.impl.InterruptTimeOpExprElementImpl();
    }

    /**
     * Create an instance of DistInterleaveProExpr
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.tcoz.jaxb.gen.DistInterleaveProExpr createDistInterleaveProExpr()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.tcoz.jaxb.gen.impl.DistInterleaveProExprImpl();
    }

    /**
     * Create an instance of EventElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.tcoz.jaxb.gen.EventElement createEventElement()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.tcoz.jaxb.gen.impl.EventElementImpl();
    }

    /**
     * Create an instance of SynPllProExpr
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.tcoz.jaxb.gen.SynPllProExpr createSynPllProExpr()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.tcoz.jaxb.gen.impl.SynPllProExprImpl();
    }

    /**
     * Create an instance of InterruptTimeOpExpr
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.tcoz.jaxb.gen.InterruptTimeOpExpr createInterruptTimeOpExpr()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.tcoz.jaxb.gen.impl.InterruptTimeOpExprImpl();
    }

    /**
     * Create an instance of InChoiceProExpr
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.tcoz.jaxb.gen.InChoiceProExpr createInChoiceProExpr()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.tcoz.jaxb.gen.impl.InChoiceProExprImpl();
    }

    /**
     * Create an instance of ChannelExpr
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.tcoz.jaxb.gen.ChannelExpr createChannelExpr()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.tcoz.jaxb.gen.impl.ChannelExprImpl();
    }

    /**
     * Create an instance of Event
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.tcoz.jaxb.gen.Event createEvent()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.tcoz.jaxb.gen.impl.EventImpl();
    }

    /**
     * Create an instance of ChannelType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.tcoz.jaxb.gen.ChannelType createChannelType()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.tcoz.jaxb.gen.impl.ChannelTypeImpl();
    }

}
