//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2004.07.23 at 08:45:41 NZST 
//


package net.sourceforge.czt.zpatt.jaxb.gen;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.sourceforge.czt.zpatt.jaxb.gen package. 
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
    extends net.sourceforge.czt.oz.jaxb.gen.impl.runtime.DefaultJAXBContextImpl
{

    private static java.util.HashMap defaultImplementations = new java.util.HashMap();
    private static java.util.HashMap rootTagMap = new java.util.HashMap();
    public final static net.sourceforge.czt.oz.jaxb.gen.impl.runtime.GrammarInfo grammarInfo = new net.sourceforge.czt.oz.jaxb.gen.impl.runtime.GrammarInfoImpl(rootTagMap, defaultImplementations, (net.sourceforge.czt.zpatt.jaxb.gen.ObjectFactory.class));
    public final static java.lang.Class version = (net.sourceforge.czt.zpatt.jaxb.gen.impl.JAXBVersion.class);

    static {
        defaultImplementations.put((net.sourceforge.czt.zpatt.jaxb.gen.JokerExpr.class), "net.sourceforge.czt.zpatt.jaxb.gen.impl.JokerExprImpl");
        defaultImplementations.put((net.sourceforge.czt.zpatt.jaxb.gen.PredTransformElement.class), "net.sourceforge.czt.zpatt.jaxb.gen.impl.PredTransformElementImpl");
        defaultImplementations.put((net.sourceforge.czt.zpatt.jaxb.gen.TransformElement.class), "net.sourceforge.czt.zpatt.jaxb.gen.impl.TransformElementImpl");
        defaultImplementations.put((net.sourceforge.czt.zpatt.jaxb.gen.TransformListElement.class), "net.sourceforge.czt.zpatt.jaxb.gen.impl.TransformListElementImpl");
        defaultImplementations.put((net.sourceforge.czt.zpatt.jaxb.gen.Transform.class), "net.sourceforge.czt.zpatt.jaxb.gen.impl.TransformImpl");
        defaultImplementations.put((net.sourceforge.czt.zpatt.jaxb.gen.JokerPredElement.class), "net.sourceforge.czt.zpatt.jaxb.gen.impl.JokerPredElementImpl");
        defaultImplementations.put((net.sourceforge.czt.zpatt.jaxb.gen.PredTransform.class), "net.sourceforge.czt.zpatt.jaxb.gen.impl.PredTransformImpl");
        defaultImplementations.put((net.sourceforge.czt.zpatt.jaxb.gen.JokerPred.class), "net.sourceforge.czt.zpatt.jaxb.gen.impl.JokerPredImpl");
        defaultImplementations.put((net.sourceforge.czt.zpatt.jaxb.gen.JokerExprElement.class), "net.sourceforge.czt.zpatt.jaxb.gen.impl.JokerExprElementImpl");
        defaultImplementations.put((net.sourceforge.czt.zpatt.jaxb.gen.TransformList.class), "net.sourceforge.czt.zpatt.jaxb.gen.impl.TransformListImpl");
        defaultImplementations.put((net.sourceforge.czt.zpatt.jaxb.gen.ExprTransformElement.class), "net.sourceforge.czt.zpatt.jaxb.gen.impl.ExprTransformElementImpl");
        defaultImplementations.put((net.sourceforge.czt.zpatt.jaxb.gen.ExprTransform.class), "net.sourceforge.czt.zpatt.jaxb.gen.impl.ExprTransformImpl");
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/zpatt", "PredTransform"), (net.sourceforge.czt.zpatt.jaxb.gen.PredTransformElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/zpatt", "ExprTransform"), (net.sourceforge.czt.zpatt.jaxb.gen.ExprTransformElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/zpatt", "TransformList"), (net.sourceforge.czt.zpatt.jaxb.gen.TransformListElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/zpatt", "JokerExpr"), (net.sourceforge.czt.zpatt.jaxb.gen.JokerExprElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/zpatt", "Transform"), (net.sourceforge.czt.zpatt.jaxb.gen.TransformElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/zpatt", "JokerPred"), (net.sourceforge.czt.zpatt.jaxb.gen.JokerPredElement.class));
    }

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.sourceforge.czt.zpatt.jaxb.gen
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
     * Create an instance of JokerExpr
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.zpatt.jaxb.gen.JokerExpr createJokerExpr()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.zpatt.jaxb.gen.impl.JokerExprImpl();
    }

    /**
     * Create an instance of PredTransformElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.zpatt.jaxb.gen.PredTransformElement createPredTransformElement()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.zpatt.jaxb.gen.impl.PredTransformElementImpl();
    }

    /**
     * Create an instance of TransformElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.zpatt.jaxb.gen.TransformElement createTransformElement()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.zpatt.jaxb.gen.impl.TransformElementImpl();
    }

    /**
     * Create an instance of TransformListElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.zpatt.jaxb.gen.TransformListElement createTransformListElement()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.zpatt.jaxb.gen.impl.TransformListElementImpl();
    }

    /**
     * Create an instance of Transform
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.zpatt.jaxb.gen.Transform createTransform()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.zpatt.jaxb.gen.impl.TransformImpl();
    }

    /**
     * Create an instance of JokerPredElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.zpatt.jaxb.gen.JokerPredElement createJokerPredElement()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.zpatt.jaxb.gen.impl.JokerPredElementImpl();
    }

    /**
     * Create an instance of PredTransform
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.zpatt.jaxb.gen.PredTransform createPredTransform()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.zpatt.jaxb.gen.impl.PredTransformImpl();
    }

    /**
     * Create an instance of JokerPred
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.zpatt.jaxb.gen.JokerPred createJokerPred()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.zpatt.jaxb.gen.impl.JokerPredImpl();
    }

    /**
     * Create an instance of JokerExprElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.zpatt.jaxb.gen.JokerExprElement createJokerExprElement()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.zpatt.jaxb.gen.impl.JokerExprElementImpl();
    }

    /**
     * Create an instance of TransformList
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.zpatt.jaxb.gen.TransformList createTransformList()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.zpatt.jaxb.gen.impl.TransformListImpl();
    }

    /**
     * Create an instance of ExprTransformElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.zpatt.jaxb.gen.ExprTransformElement createExprTransformElement()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.zpatt.jaxb.gen.impl.ExprTransformElementImpl();
    }

    /**
     * Create an instance of ExprTransform
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.zpatt.jaxb.gen.ExprTransform createExprTransform()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.zpatt.jaxb.gen.impl.ExprTransformImpl();
    }

}
