//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.5-b16-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.06.26 at 02:10:37 PM NZST 
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
    extends net.sourceforge.czt.circus.jaxb.gen.impl.runtime.DefaultJAXBContextImpl
{

    private static java.util.HashMap defaultImplementations = new java.util.HashMap(81, 0.75F);
    private static java.util.HashMap rootTagMap = new java.util.HashMap();
    public final static net.sourceforge.czt.circus.jaxb.gen.impl.runtime.GrammarInfo grammarInfo = new net.sourceforge.czt.circus.jaxb.gen.impl.runtime.GrammarInfoImpl(rootTagMap, defaultImplementations, (net.sourceforge.czt.oz.jaxb.gen.ObjectFactory.class));
    public final static java.lang.Class version = (net.sourceforge.czt.oz.jaxb.gen.impl.JAXBVersion.class);

    static {
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.ClassRef.class), "net.sourceforge.czt.oz.jaxb.gen.impl.ClassRefImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.ClassRefElement.class), "net.sourceforge.czt.oz.jaxb.gen.impl.ClassRefElementImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.VisibilityListElement.class), "net.sourceforge.czt.oz.jaxb.gen.impl.VisibilityListElementImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.ContainmentExpr.class), "net.sourceforge.czt.oz.jaxb.gen.impl.ContainmentExprImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.DistConjOpExpr.class), "net.sourceforge.czt.oz.jaxb.gen.impl.DistConjOpExprImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.OpPromotionExpr.class), "net.sourceforge.czt.oz.jaxb.gen.impl.OpPromotionExprImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.HideOpExprElement.class), "net.sourceforge.czt.oz.jaxb.gen.impl.HideOpExprElementImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.ClassSigElement.class), "net.sourceforge.czt.oz.jaxb.gen.impl.ClassSigElementImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.ExChoiceOpExpr.class), "net.sourceforge.czt.oz.jaxb.gen.impl.ExChoiceOpExprImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.ClassParaElement.class), "net.sourceforge.czt.oz.jaxb.gen.impl.ClassParaElementImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.HideOpExpr.class), "net.sourceforge.czt.oz.jaxb.gen.impl.HideOpExprImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.SeqOpExpr.class), "net.sourceforge.czt.oz.jaxb.gen.impl.SeqOpExprImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.RenameOpExpr.class), "net.sourceforge.czt.oz.jaxb.gen.impl.RenameOpExprImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.AnonOpExpr.class), "net.sourceforge.czt.oz.jaxb.gen.impl.AnonOpExprImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.DeltaList.class), "net.sourceforge.czt.oz.jaxb.gen.impl.DeltaListImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.SecondaryDeclElement.class), "net.sourceforge.czt.oz.jaxb.gen.impl.SecondaryDeclElementImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.StateElement.class), "net.sourceforge.czt.oz.jaxb.gen.impl.StateElementImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.InitialState.class), "net.sourceforge.czt.oz.jaxb.gen.impl.InitialStateImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.OpExprElement.class), "net.sourceforge.czt.oz.jaxb.gen.impl.OpExprElementImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.ClassRefTypeElement.class), "net.sourceforge.czt.oz.jaxb.gen.impl.ClassRefTypeElementImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.ClassPolyType.class), "net.sourceforge.czt.oz.jaxb.gen.impl.ClassPolyTypeImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.State.class), "net.sourceforge.czt.oz.jaxb.gen.impl.StateImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.ClassSig.class), "net.sourceforge.czt.oz.jaxb.gen.impl.ClassSigImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.PredExprElement.class), "net.sourceforge.czt.oz.jaxb.gen.impl.PredExprElementImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.ClassRefType.class), "net.sourceforge.czt.oz.jaxb.gen.impl.ClassRefTypeImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.RenameOpExprElement.class), "net.sourceforge.czt.oz.jaxb.gen.impl.RenameOpExprElementImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.DistSeqOpExpr.class), "net.sourceforge.czt.oz.jaxb.gen.impl.DistSeqOpExprImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.PredExpr.class), "net.sourceforge.czt.oz.jaxb.gen.impl.PredExprImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.AssoParallelOpExpr.class), "net.sourceforge.czt.oz.jaxb.gen.impl.AssoParallelOpExprImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.ClassPolyTypeElement.class), "net.sourceforge.czt.oz.jaxb.gen.impl.ClassPolyTypeElementImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.PrimaryDecl.class), "net.sourceforge.czt.oz.jaxb.gen.impl.PrimaryDeclImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.PrimaryDeclElement.class), "net.sourceforge.czt.oz.jaxb.gen.impl.PrimaryDeclElementImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.ClassUnionType.class), "net.sourceforge.czt.oz.jaxb.gen.impl.ClassUnionTypeImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.OperationElement.class), "net.sourceforge.czt.oz.jaxb.gen.impl.OperationElementImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.ClassPara.class), "net.sourceforge.czt.oz.jaxb.gen.impl.ClassParaImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.ParallelOpExpr.class), "net.sourceforge.czt.oz.jaxb.gen.impl.ParallelOpExprImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.OpExpr2Element.class), "net.sourceforge.czt.oz.jaxb.gen.impl.OpExpr2ElementImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.DistOpExprElement.class), "net.sourceforge.czt.oz.jaxb.gen.impl.DistOpExprElementImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.ConjOpExpr.class), "net.sourceforge.czt.oz.jaxb.gen.impl.ConjOpExprImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.ScopeEnrichOpExpr.class), "net.sourceforge.czt.oz.jaxb.gen.impl.ScopeEnrichOpExprImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.OpExpr.class), "net.sourceforge.czt.oz.jaxb.gen.impl.OpExprImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.ClassUnionTypeElement.class), "net.sourceforge.czt.oz.jaxb.gen.impl.ClassUnionTypeElementImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.NameSignaturePairElement.class), "net.sourceforge.czt.oz.jaxb.gen.impl.NameSignaturePairElementImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.ClassTypeElement.class), "net.sourceforge.czt.oz.jaxb.gen.impl.ClassTypeElementImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.NameSignaturePair.class), "net.sourceforge.czt.oz.jaxb.gen.impl.NameSignaturePairImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.SecondaryDecl.class), "net.sourceforge.czt.oz.jaxb.gen.impl.SecondaryDeclImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.DistOpExpr.class), "net.sourceforge.czt.oz.jaxb.gen.impl.DistOpExprImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.OpTextElement.class), "net.sourceforge.czt.oz.jaxb.gen.impl.OpTextElementImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.Operation.class), "net.sourceforge.czt.oz.jaxb.gen.impl.OperationImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.ClassUnionExpr.class), "net.sourceforge.czt.oz.jaxb.gen.impl.ClassUnionExprImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.AnonOpExprElement.class), "net.sourceforge.czt.oz.jaxb.gen.impl.AnonOpExprElementImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.PolyExpr.class), "net.sourceforge.czt.oz.jaxb.gen.impl.PolyExprImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.OpPromotionExprElement.class), "net.sourceforge.czt.oz.jaxb.gen.impl.OpPromotionExprElementImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.DistChoiceOpExpr.class), "net.sourceforge.czt.oz.jaxb.gen.impl.DistChoiceOpExprImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.InitialStateElement.class), "net.sourceforge.czt.oz.jaxb.gen.impl.InitialStateElementImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.OpText.class), "net.sourceforge.czt.oz.jaxb.gen.impl.OpTextImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.OpExpr2 .class), "net.sourceforge.czt.oz.jaxb.gen.impl.OpExpr2Impl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.ClassType.class), "net.sourceforge.czt.oz.jaxb.gen.impl.ClassTypeImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.VisibilityList.class), "net.sourceforge.czt.oz.jaxb.gen.impl.VisibilityListImpl");
        defaultImplementations.put((net.sourceforge.czt.oz.jaxb.gen.DeltaListElement.class), "net.sourceforge.czt.oz.jaxb.gen.impl.DeltaListElementImpl");
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/object-z", "SecondaryDecl"), (net.sourceforge.czt.oz.jaxb.gen.SecondaryDeclElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/object-z", "AssoParallelOpExpr"), (net.sourceforge.czt.oz.jaxb.gen.AssoParallelOpExpr.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/object-z", "PrimaryDecl"), (net.sourceforge.czt.oz.jaxb.gen.PrimaryDeclElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/object-z", "RenameOpExpr"), (net.sourceforge.czt.oz.jaxb.gen.RenameOpExprElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/object-z", "PolyExpr"), (net.sourceforge.czt.oz.jaxb.gen.PolyExpr.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/object-z", "HideOpExpr"), (net.sourceforge.czt.oz.jaxb.gen.HideOpExprElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/object-z", "DistConjOpExpr"), (net.sourceforge.czt.oz.jaxb.gen.DistConjOpExpr.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/object-z", "NameSignaturePair"), (net.sourceforge.czt.oz.jaxb.gen.NameSignaturePairElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/object-z", "InitialState"), (net.sourceforge.czt.oz.jaxb.gen.InitialStateElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/object-z", "AnonOpExpr"), (net.sourceforge.czt.oz.jaxb.gen.AnonOpExprElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/object-z", "OpText"), (net.sourceforge.czt.oz.jaxb.gen.OpTextElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/object-z", "ClassSig"), (net.sourceforge.czt.oz.jaxb.gen.ClassSigElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/object-z", "State"), (net.sourceforge.czt.oz.jaxb.gen.StateElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/object-z", "ExChoiceOpExpr"), (net.sourceforge.czt.oz.jaxb.gen.ExChoiceOpExpr.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/object-z", "ClassUnionExpr"), (net.sourceforge.czt.oz.jaxb.gen.ClassUnionExpr.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/object-z", "VisibilityList"), (net.sourceforge.czt.oz.jaxb.gen.VisibilityListElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/object-z", "DeltaList"), (net.sourceforge.czt.oz.jaxb.gen.DeltaListElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/object-z", "ClassPara"), (net.sourceforge.czt.oz.jaxb.gen.ClassParaElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/object-z", "ClassPolyType"), (net.sourceforge.czt.oz.jaxb.gen.ClassPolyTypeElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/object-z", "ClassUnionType"), (net.sourceforge.czt.oz.jaxb.gen.ClassUnionTypeElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/object-z", "ClassType"), (net.sourceforge.czt.oz.jaxb.gen.ClassTypeElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/object-z", "ClassRef"), (net.sourceforge.czt.oz.jaxb.gen.ClassRefElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/object-z", "SeqOpExpr"), (net.sourceforge.czt.oz.jaxb.gen.SeqOpExpr.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/object-z", "ConjOpExpr"), (net.sourceforge.czt.oz.jaxb.gen.ConjOpExpr.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/object-z", "OpExpr2"), (net.sourceforge.czt.oz.jaxb.gen.OpExpr2Element.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/object-z", "ScopeEnrichOpExpr"), (net.sourceforge.czt.oz.jaxb.gen.ScopeEnrichOpExpr.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/object-z", "Operation"), (net.sourceforge.czt.oz.jaxb.gen.OperationElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/object-z", "ParallelOpExpr"), (net.sourceforge.czt.oz.jaxb.gen.ParallelOpExpr.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/object-z", "DistOpExpr"), (net.sourceforge.czt.oz.jaxb.gen.DistOpExprElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/object-z", "DistChoiceOpExpr"), (net.sourceforge.czt.oz.jaxb.gen.DistChoiceOpExpr.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/object-z", "DistSeqOpExpr"), (net.sourceforge.czt.oz.jaxb.gen.DistSeqOpExpr.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/object-z", "ContainmentExpr"), (net.sourceforge.czt.oz.jaxb.gen.ContainmentExpr.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/object-z", "ClassRefType"), (net.sourceforge.czt.oz.jaxb.gen.ClassRefTypeElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/object-z", "PredExpr"), (net.sourceforge.czt.oz.jaxb.gen.PredExprElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/object-z", "OpPromotionExpr"), (net.sourceforge.czt.oz.jaxb.gen.OpPromotionExprElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://czt.sourceforge.net/object-z", "OpExpr"), (net.sourceforge.czt.oz.jaxb.gen.OpExprElement.class));
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
     * Create an instance of ClassRef
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.ClassRef createClassRef()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.ClassRefImpl();
    }

    /**
     * Create an instance of ClassRefElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.ClassRefElement createClassRefElement()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.ClassRefElementImpl();
    }

    /**
     * Create an instance of VisibilityListElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.VisibilityListElement createVisibilityListElement()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.VisibilityListElementImpl();
    }

    /**
     * Create an instance of ContainmentExpr
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.ContainmentExpr createContainmentExpr()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.ContainmentExprImpl();
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
     * Create an instance of ClassSigElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.ClassSigElement createClassSigElement()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.ClassSigElementImpl();
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
     * Create an instance of AnonOpExpr
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.AnonOpExpr createAnonOpExpr()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.AnonOpExprImpl();
    }

    /**
     * Create an instance of DeltaList
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.DeltaList createDeltaList()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.DeltaListImpl();
    }

    /**
     * Create an instance of SecondaryDeclElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.SecondaryDeclElement createSecondaryDeclElement()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.SecondaryDeclElementImpl();
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
     * Create an instance of OpExprElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.OpExprElement createOpExprElement()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.OpExprElementImpl();
    }

    /**
     * Create an instance of ClassRefTypeElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.ClassRefTypeElement createClassRefTypeElement()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.ClassRefTypeElementImpl();
    }

    /**
     * Create an instance of ClassPolyType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.ClassPolyType createClassPolyType()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.ClassPolyTypeImpl();
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
     * Create an instance of ClassSig
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.ClassSig createClassSig()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.ClassSigImpl();
    }

    /**
     * Create an instance of PredExprElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.PredExprElement createPredExprElement()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.PredExprElementImpl();
    }

    /**
     * Create an instance of ClassRefType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.ClassRefType createClassRefType()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.ClassRefTypeImpl();
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
     * Create an instance of PredExpr
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.PredExpr createPredExpr()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.PredExprImpl();
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
     * Create an instance of ClassPolyTypeElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.ClassPolyTypeElement createClassPolyTypeElement()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.ClassPolyTypeElementImpl();
    }

    /**
     * Create an instance of PrimaryDecl
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.PrimaryDecl createPrimaryDecl()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.PrimaryDeclImpl();
    }

    /**
     * Create an instance of PrimaryDeclElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.PrimaryDeclElement createPrimaryDeclElement()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.PrimaryDeclElementImpl();
    }

    /**
     * Create an instance of ClassUnionType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.ClassUnionType createClassUnionType()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.ClassUnionTypeImpl();
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
     * Create an instance of OpExpr2Element
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.OpExpr2Element createOpExpr2Element()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.OpExpr2ElementImpl();
    }

    /**
     * Create an instance of DistOpExprElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.DistOpExprElement createDistOpExprElement()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.DistOpExprElementImpl();
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
     * Create an instance of OpExpr
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.OpExpr createOpExpr()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.OpExprImpl();
    }

    /**
     * Create an instance of ClassUnionTypeElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.ClassUnionTypeElement createClassUnionTypeElement()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.ClassUnionTypeElementImpl();
    }

    /**
     * Create an instance of NameSignaturePairElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.NameSignaturePairElement createNameSignaturePairElement()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.NameSignaturePairElementImpl();
    }

    /**
     * Create an instance of ClassTypeElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.ClassTypeElement createClassTypeElement()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.ClassTypeElementImpl();
    }

    /**
     * Create an instance of NameSignaturePair
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.NameSignaturePair createNameSignaturePair()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.NameSignaturePairImpl();
    }

    /**
     * Create an instance of SecondaryDecl
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.SecondaryDecl createSecondaryDecl()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.SecondaryDeclImpl();
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
     * Create an instance of OpTextElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.OpTextElement createOpTextElement()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.OpTextElementImpl();
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
     * Create an instance of ClassUnionExpr
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.ClassUnionExpr createClassUnionExpr()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.ClassUnionExprImpl();
    }

    /**
     * Create an instance of AnonOpExprElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.AnonOpExprElement createAnonOpExprElement()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.AnonOpExprElementImpl();
    }

    /**
     * Create an instance of PolyExpr
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.PolyExpr createPolyExpr()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.PolyExprImpl();
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
     * Create an instance of OpText
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.OpText createOpText()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.OpTextImpl();
    }

    /**
     * Create an instance of OpExpr2
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.OpExpr2 createOpExpr2()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.OpExpr2Impl();
    }

    /**
     * Create an instance of ClassType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.ClassType createClassType()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.ClassTypeImpl();
    }

    /**
     * Create an instance of VisibilityList
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.VisibilityList createVisibilityList()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.VisibilityListImpl();
    }

    /**
     * Create an instance of DeltaListElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public net.sourceforge.czt.oz.jaxb.gen.DeltaListElement createDeltaListElement()
        throws javax.xml.bind.JAXBException
    {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.DeltaListElementImpl();
    }

}
