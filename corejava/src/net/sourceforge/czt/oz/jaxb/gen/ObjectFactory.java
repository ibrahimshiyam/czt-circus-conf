//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2004.01.05 at 10:33:20 NZDT 
//


package net.sourceforge.czt.oz.jaxb.gen;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.sourceforge.czt.oz.jaxb.gen package. 
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
    public final static net.sourceforge.czt.oz.jaxb.gen.impl.runtime.GrammarInfo grammarInfo = new net.sourceforge.czt.oz.jaxb.gen.impl.runtime.GrammarInfoImpl(rootTagMap, defaultImplementations, (net.sourceforge.czt.oz.jaxb.gen.ObjectFactory.class));
    public final static java.lang.Class version = (net.sourceforge.czt.oz.jaxb.gen.impl.JAXBVersion.class);

    static {
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.ParallelOpExpr.class), "net.sourceforge.czt.oz.jaxb.gen.impl.ParallelOpExprImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.FormalParametersElement.class), "net.sourceforge.czt.oz.jaxb.gen.impl.FormalParametersElementImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.ConjOpExpr.class), "net.sourceforge.czt.oz.jaxb.gen.impl.ConjOpExprImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.DeclNameList.class), "net.sourceforge.czt.oz.jaxb.gen.impl.DeclNameListImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.ExChoiceOpExpr.class), "net.sourceforge.czt.oz.jaxb.gen.impl.ExChoiceOpExprImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.StateElement.class), "net.sourceforge.czt.oz.jaxb.gen.impl.StateElementImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.SeqOpExpr.class), "net.sourceforge.czt.oz.jaxb.gen.impl.SeqOpExprImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.RenameOpExpr.class), "net.sourceforge.czt.oz.jaxb.gen.impl.RenameOpExprImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.MainOpExprElement.class), "net.sourceforge.czt.oz.jaxb.gen.impl.MainOpExprElementImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.OperationBox.class), "net.sourceforge.czt.oz.jaxb.gen.impl.OperationBoxImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.DistOpExpr.class), "net.sourceforge.czt.oz.jaxb.gen.impl.DistOpExprImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.ClassPara.class), "net.sourceforge.czt.oz.jaxb.gen.impl.ClassParaImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.LocalDef.class), "net.sourceforge.czt.oz.jaxb.gen.impl.LocalDefImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.TwoOpExpr.class), "net.sourceforge.czt.oz.jaxb.gen.impl.TwoOpExprImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.OperationExpr.class), "net.sourceforge.czt.oz.jaxb.gen.impl.OperationExprImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.DistConjOpExpr.class), "net.sourceforge.czt.oz.jaxb.gen.impl.DistConjOpExprImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.ActualParameters.class), "net.sourceforge.czt.oz.jaxb.gen.impl.ActualParametersImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.LocalDefElement.class), "net.sourceforge.czt.oz.jaxb.gen.impl.LocalDefElementImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.AssoParallelOpExpr.class), "net.sourceforge.czt.oz.jaxb.gen.impl.AssoParallelOpExprImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.MainOpExpr.class), "net.sourceforge.czt.oz.jaxb.gen.impl.MainOpExprImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.BasicOpExprElement.class), "net.sourceforge.czt.oz.jaxb.gen.impl.BasicOpExprElementImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.RenameList.class), "net.sourceforge.czt.oz.jaxb.gen.impl.RenameListImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.SecondaryAttributes.class), "net.sourceforge.czt.oz.jaxb.gen.impl.SecondaryAttributesImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.OpPromotionExprElement.class), "net.sourceforge.czt.oz.jaxb.gen.impl.OpPromotionExprElementImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.BasicOpExpr.class), "net.sourceforge.czt.oz.jaxb.gen.impl.BasicOpExprImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.DeclNameListElement.class), "net.sourceforge.czt.oz.jaxb.gen.impl.DeclNameListElementImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.InitialStateElement.class), "net.sourceforge.czt.oz.jaxb.gen.impl.InitialStateElementImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.RenameListElement.class), "net.sourceforge.czt.oz.jaxb.gen.impl.RenameListElementImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.OperationExprElement.class), "net.sourceforge.czt.oz.jaxb.gen.impl.OperationExprElementImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.State.class), "net.sourceforge.czt.oz.jaxb.gen.impl.StateImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.ActualParametersElement.class), "net.sourceforge.czt.oz.jaxb.gen.impl.ActualParametersElementImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.OperationBoxElement.class), "net.sourceforge.czt.oz.jaxb.gen.impl.OperationBoxElementImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.DistChoiceOpExpr.class), "net.sourceforge.czt.oz.jaxb.gen.impl.DistChoiceOpExprImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.OperationBoxExpr.class), "net.sourceforge.czt.oz.jaxb.gen.impl.OperationBoxExprImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.HideOpExpr.class), "net.sourceforge.czt.oz.jaxb.gen.impl.HideOpExprImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.RefNameListElement.class), "net.sourceforge.czt.oz.jaxb.gen.impl.RefNameListElementImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.DistSeqOpExpr.class), "net.sourceforge.czt.oz.jaxb.gen.impl.DistSeqOpExprImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.HideOpExprElement.class), "net.sourceforge.czt.oz.jaxb.gen.impl.HideOpExprElementImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.RenameOpExprElement.class), "net.sourceforge.czt.oz.jaxb.gen.impl.RenameOpExprElementImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.OpPromotionExpr.class), "net.sourceforge.czt.oz.jaxb.gen.impl.OpPromotionExprImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.InitialState.class), "net.sourceforge.czt.oz.jaxb.gen.impl.InitialStateImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.ParenOpExpr.class), "net.sourceforge.czt.oz.jaxb.gen.impl.ParenOpExprImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.Operation.class), "net.sourceforge.czt.oz.jaxb.gen.impl.OperationImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.InheritedClass.class), "net.sourceforge.czt.oz.jaxb.gen.impl.InheritedClassImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.ScopeEnrichOpExpr.class), "net.sourceforge.czt.oz.jaxb.gen.impl.ScopeEnrichOpExprImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.RefNameList.class), "net.sourceforge.czt.oz.jaxb.gen.impl.RefNameListImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.SecondaryAttributesElement.class), "net.sourceforge.czt.oz.jaxb.gen.impl.SecondaryAttributesElementImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.OperationElement.class), "net.sourceforge.czt.oz.jaxb.gen.impl.OperationElementImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.FormalParameters.class), "net.sourceforge.czt.oz.jaxb.gen.impl.FormalParametersImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.InheritedClassElement.class), "net.sourceforge.czt.oz.jaxb.gen.impl.InheritedClassElementImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.OperationBoxExprElement.class), "net.sourceforge.czt.oz.jaxb.gen.impl.OperationBoxExprElementImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.ClassParaElement.class), "net.sourceforge.czt.oz.jaxb.gen.impl.ClassParaElementImpl");
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/object-z", "AssoParallelOpExpr"), (net.sourceforge.czt.oz.jaxb.gen.AssoParallelOpExpr.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/object-z", "RenameOpExpr"), (net.sourceforge.czt.oz.jaxb.gen.RenameOpExprElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/object-z", "LocalDef"), (net.sourceforge.czt.oz.jaxb.gen.LocalDefElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/object-z", "DistConjOpExpr"), (net.sourceforge.czt.oz.jaxb.gen.DistConjOpExpr.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/object-z", "HideOpExpr"), (net.sourceforge.czt.oz.jaxb.gen.HideOpExprElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/object-z", "RenameList"), (net.sourceforge.czt.oz.jaxb.gen.RenameListElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/object-z", "SecondaryAttributes"), (net.sourceforge.czt.oz.jaxb.gen.SecondaryAttributesElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/object-z", "ActualParameters"), (net.sourceforge.czt.oz.jaxb.gen.ActualParametersElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/object-z", "InitialState"), (net.sourceforge.czt.oz.jaxb.gen.InitialStateElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/object-z", "RefNameList"), (net.sourceforge.czt.oz.jaxb.gen.RefNameListElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/object-z", "OperationExpr"), (net.sourceforge.czt.oz.jaxb.gen.OperationExprElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/object-z", "DeclNameList"), (net.sourceforge.czt.oz.jaxb.gen.DeclNameListElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/object-z", "State"), (net.sourceforge.czt.oz.jaxb.gen.StateElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/object-z", "ExChoiceOpExpr"), (net.sourceforge.czt.oz.jaxb.gen.ExChoiceOpExpr.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/object-z", "OperationBox"), (net.sourceforge.czt.oz.jaxb.gen.OperationBoxElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/object-z", "ClassPara"), (net.sourceforge.czt.oz.jaxb.gen.ClassParaElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/object-z", "SeqOpExpr"), (net.sourceforge.czt.oz.jaxb.gen.SeqOpExpr.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/object-z", "ScopeEnrichOpExpr"), (net.sourceforge.czt.oz.jaxb.gen.ScopeEnrichOpExpr.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/object-z", "ConjOpExpr"), (net.sourceforge.czt.oz.jaxb.gen.ConjOpExpr.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/object-z", "Operation"), (net.sourceforge.czt.oz.jaxb.gen.OperationElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/object-z", "MainOpExpr"), (net.sourceforge.czt.oz.jaxb.gen.MainOpExprElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/object-z", "ParallelOpExpr"), (net.sourceforge.czt.oz.jaxb.gen.ParallelOpExpr.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/object-z", "BasicOpExpr"), (net.sourceforge.czt.oz.jaxb.gen.BasicOpExprElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/object-z", "DistChoiceOpExpr"), (net.sourceforge.czt.oz.jaxb.gen.DistChoiceOpExpr.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/object-z", "OperationBoxExpr"), (net.sourceforge.czt.oz.jaxb.gen.OperationBoxExprElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/object-z", "DistSeqOpExpr"), (net.sourceforge.czt.oz.jaxb.gen.DistSeqOpExpr.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/object-z", "InheritedClass"), (net.sourceforge.czt.oz.jaxb.gen.InheritedClassElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/object-z", "FormalParameters"), (net.sourceforge.czt.oz.jaxb.gen.FormalParametersElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/object-z", "ParenOpExpr"), (net.sourceforge.czt.oz.jaxb.gen.ParenOpExpr.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/object-z", "OpPromotionExpr"), (net.sourceforge.czt.oz.jaxb.gen.OpPromotionExprElement.class));
    }

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.sourceforge.czt.oz.jaxb.gen
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
     * Create an instance of ParallelOpExpr
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.ParallelOpExpr createParallelOpExpr()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.ParallelOpExprImpl();
    }

    /**
     * Create an instance of FormalParametersElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.FormalParametersElement createFormalParametersElement()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.FormalParametersElementImpl();
    }

    /**
     * Create an instance of ConjOpExpr
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.ConjOpExpr createConjOpExpr()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.ConjOpExprImpl();
    }

    /**
     * Create an instance of DeclNameList
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.DeclNameList createDeclNameList()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.DeclNameListImpl();
    }

    /**
     * Create an instance of ExChoiceOpExpr
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.ExChoiceOpExpr createExChoiceOpExpr()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.ExChoiceOpExprImpl();
    }

    /**
     * Create an instance of StateElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.StateElement createStateElement()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.StateElementImpl();
    }

    /**
     * Create an instance of SeqOpExpr
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.SeqOpExpr createSeqOpExpr()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.SeqOpExprImpl();
    }

    /**
     * Create an instance of RenameOpExpr
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.RenameOpExpr createRenameOpExpr()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.RenameOpExprImpl();
    }

    /**
     * Create an instance of MainOpExprElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.MainOpExprElement createMainOpExprElement()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.MainOpExprElementImpl();
    }

    /**
     * Create an instance of OperationBox
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.OperationBox createOperationBox()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.OperationBoxImpl();
    }

    /**
     * Create an instance of DistOpExpr
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.DistOpExpr createDistOpExpr()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.DistOpExprImpl();
    }

    /**
     * Create an instance of ClassPara
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.ClassPara createClassPara()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.ClassParaImpl();
    }

    /**
     * Create an instance of LocalDef
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.LocalDef createLocalDef()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.LocalDefImpl();
    }

    /**
     * Create an instance of TwoOpExpr
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.TwoOpExpr createTwoOpExpr()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.TwoOpExprImpl();
    }

    /**
     * Create an instance of OperationExpr
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.OperationExpr createOperationExpr()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.OperationExprImpl();
    }

    /**
     * Create an instance of DistConjOpExpr
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.DistConjOpExpr createDistConjOpExpr()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.DistConjOpExprImpl();
    }

    /**
     * Create an instance of ActualParameters
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.ActualParameters createActualParameters()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.ActualParametersImpl();
    }

    /**
     * Create an instance of LocalDefElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.LocalDefElement createLocalDefElement()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.LocalDefElementImpl();
    }

    /**
     * Create an instance of AssoParallelOpExpr
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.AssoParallelOpExpr createAssoParallelOpExpr()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.AssoParallelOpExprImpl();
    }

    /**
     * Create an instance of MainOpExpr
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.MainOpExpr createMainOpExpr()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.MainOpExprImpl();
    }

    /**
     * Create an instance of BasicOpExprElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.BasicOpExprElement createBasicOpExprElement()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.BasicOpExprElementImpl();
    }

    /**
     * Create an instance of RenameList
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.RenameList createRenameList()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.RenameListImpl();
    }

    /**
     * Create an instance of SecondaryAttributes
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.SecondaryAttributes createSecondaryAttributes()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.SecondaryAttributesImpl();
    }

    /**
     * Create an instance of OpPromotionExprElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.OpPromotionExprElement createOpPromotionExprElement()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.OpPromotionExprElementImpl();
    }

    /**
     * Create an instance of BasicOpExpr
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.BasicOpExpr createBasicOpExpr()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.BasicOpExprImpl();
    }

    /**
     * Create an instance of DeclNameListElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.DeclNameListElement createDeclNameListElement()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.DeclNameListElementImpl();
    }

    /**
     * Create an instance of InitialStateElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.InitialStateElement createInitialStateElement()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.InitialStateElementImpl();
    }

    /**
     * Create an instance of RenameListElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.RenameListElement createRenameListElement()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.RenameListElementImpl();
    }

    /**
     * Create an instance of OperationExprElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.OperationExprElement createOperationExprElement()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.OperationExprElementImpl();
    }

    /**
     * Create an instance of State
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.State createState()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.StateImpl();
    }

    /**
     * Create an instance of ActualParametersElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.ActualParametersElement createActualParametersElement()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.ActualParametersElementImpl();
    }

    /**
     * Create an instance of OperationBoxElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.OperationBoxElement createOperationBoxElement()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.OperationBoxElementImpl();
    }

    /**
     * Create an instance of DistChoiceOpExpr
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.DistChoiceOpExpr createDistChoiceOpExpr()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.DistChoiceOpExprImpl();
    }

    /**
     * Create an instance of OperationBoxExpr
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.OperationBoxExpr createOperationBoxExpr()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.OperationBoxExprImpl();
    }

    /**
     * Create an instance of HideOpExpr
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.HideOpExpr createHideOpExpr()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.HideOpExprImpl();
    }

    /**
     * Create an instance of RefNameListElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.RefNameListElement createRefNameListElement()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.RefNameListElementImpl();
    }

    /**
     * Create an instance of DistSeqOpExpr
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.DistSeqOpExpr createDistSeqOpExpr()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.DistSeqOpExprImpl();
    }

    /**
     * Create an instance of HideOpExprElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.HideOpExprElement createHideOpExprElement()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.HideOpExprElementImpl();
    }

    /**
     * Create an instance of RenameOpExprElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.RenameOpExprElement createRenameOpExprElement()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.RenameOpExprElementImpl();
    }

    /**
     * Create an instance of OpPromotionExpr
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.OpPromotionExpr createOpPromotionExpr()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.OpPromotionExprImpl();
    }

    /**
     * Create an instance of InitialState
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.InitialState createInitialState()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.InitialStateImpl();
    }

    /**
     * Create an instance of ParenOpExpr
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.ParenOpExpr createParenOpExpr()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.ParenOpExprImpl();
    }

    /**
     * Create an instance of Operation
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.Operation createOperation()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.OperationImpl();
    }

    /**
     * Create an instance of InheritedClass
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.InheritedClass createInheritedClass()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.InheritedClassImpl();
    }

    /**
     * Create an instance of ScopeEnrichOpExpr
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.ScopeEnrichOpExpr createScopeEnrichOpExpr()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.ScopeEnrichOpExprImpl();
    }

    /**
     * Create an instance of RefNameList
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.RefNameList createRefNameList()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.RefNameListImpl();
    }

    /**
     * Create an instance of SecondaryAttributesElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.SecondaryAttributesElement createSecondaryAttributesElement()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.SecondaryAttributesElementImpl();
    }

    /**
     * Create an instance of OperationElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.OperationElement createOperationElement()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.OperationElementImpl();
    }

    /**
     * Create an instance of FormalParameters
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.FormalParameters createFormalParameters()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.FormalParametersImpl();
    }

    /**
     * Create an instance of InheritedClassElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.InheritedClassElement createInheritedClassElement()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.InheritedClassElementImpl();
    }

    /**
     * Create an instance of OperationBoxExprElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.OperationBoxExprElement createOperationBoxExprElement()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.OperationBoxExprElementImpl();
    }

    /**
     * Create an instance of ClassParaElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.ClassParaElement createClassParaElement()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.ClassParaElementImpl();
    }

}
