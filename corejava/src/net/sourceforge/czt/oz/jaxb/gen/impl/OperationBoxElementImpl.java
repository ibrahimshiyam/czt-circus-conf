//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2004.06.09 at 01:28:31 NZST 
//


package net.sourceforge.czt.oz.jaxb.gen.impl;

public class OperationBoxElementImpl
    extends net.sourceforge.czt.oz.jaxb.gen.impl.OperationBoxImpl
    implements net.sourceforge.czt.oz.jaxb.gen.OperationBoxElement, com.sun.xml.bind.RIElement, com.sun.xml.bind.JAXBObject, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallableObject, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializable, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.ValidatableObject
{

    public final static java.lang.Class version = (net.sourceforge.czt.oz.jaxb.gen.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (net.sourceforge.czt.oz.jaxb.gen.OperationBoxElement.class);
    }

    public java.lang.String ____jaxb_ri____getNamespaceURI() {
        return "http://czt.sourceforge.net/object-z";
    }

    public java.lang.String ____jaxb_ri____getLocalName() {
        return "OperationBox";
    }

    public net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingEventHandler createUnmarshaller(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingContext context) {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.OperationBoxElementImpl.Unmarshaller(context);
    }

    public void serializeBody(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("http://czt.sourceforge.net/object-z", "OperationBox");
        super.serializeURIs(context);
        context.endNamespaceDecls();
        super.serializeAttributes(context);
        context.endAttributes();
        super.serializeBody(context);
        context.endElement();
    }

    public void serializeAttributes(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public void serializeURIs(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public java.lang.Class getPrimaryInterface() {
        return (net.sourceforge.czt.oz.jaxb.gen.OperationBoxElement.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000"
+"\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv."
+"grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000"
+"\fcontentModelt\u0000 Lcom/sun/msv/grammar/Expression;xr\u0000\u001ecom.sun."
+"msv.grammar.Expression\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilon"
+"Reducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0003xp*kjop"
+"p\u0000sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun."
+"msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~"
+"\u0000\u0004*kjdppsq\u0000~\u0000\u0007\'\u00a0\u00cf\u00b7ppsq\u0000~\u0000\u0007\u000e\u00b9fCppsq\u0000~\u0000\u0007\nTS\u0099ppsr\u0000\u001dcom.sun.msv."
+"grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\b\u0005\u0005\u00e0\u00edppsq\u0000~\u0000\u0000\u0005\u0005\u00e0\u00e2sr\u0000\u0011java.l"
+"ang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000p\u0000sq\u0000~\u0000\u0007\u0005\u0005\u00e0\u00d7ppsq\u0000~\u0000\u0000\u0001w\u00061pp\u0000"
+"sq\u0000~\u0000\r\u0001w\u0006&ppsr\u0000 com.sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000x"
+"r\u0000\u001ccom.sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0003xq\u0000~\u0000\u0004\u0001"
+"w\u0006\u001bq\u0000~\u0000\u0011psr\u0000 com.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003e"
+"xpq\u0000~\u0000\u0003L\u0000\tnameClassq\u0000~\u0000\u0001xq\u0000~\u0000\u0004\u0001w\u0006\u0018q\u0000~\u0000\u0011psr\u00002com.sun.msv.gram"
+"mar.Expression$AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\bsq\u0000~\u0000"
+"\u0010\u0001q\u0000~\u0000\u001bsr\u0000 com.sun.msv.grammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dco"
+"m.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.gram"
+"mar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\tq\u0000~\u0000\u001cq\u0000"
+"~\u0000!sr\u0000#com.sun.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tloca"
+"lNamet\u0000\u0012Ljava/lang/String;L\u0000\fnamespaceURIq\u0000~\u0000#xq\u0000~\u0000\u001et\u0000-net.s"
+"ourceforge.czt.z.jaxb.gen.TermA.AnnsTypet\u0000+http://java.sun.c"
+"om/jaxb/xjc/dummy-elementssq\u0000~\u0000\r\u0003\u008e\u00da\u00a1ppsq\u0000~\u0000\u0018\u0003\u008e\u00da\u0096q\u0000~\u0000\u0011psr\u0000\u001bco"
+"m.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/dat"
+"atype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0003L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/Str"
+"ingPair;xq\u0000~\u0000\u0004\u0001\u00f6\u00ef\u0011ppsr\u0000\"com.sun.msv.datatype.xsd.QnameType\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr"
+"\u0000\'com.sun.msv.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnames"
+"paceUriq\u0000~\u0000#L\u0000\btypeNameq\u0000~\u0000#L\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/dat"
+"atype/xsd/WhiteSpaceProcessor;xpt\u0000 http://www.w3.org/2001/XM"
+"LSchemat\u0000\u0005QNamesr\u00005com.sun.msv.datatype.xsd.WhiteSpaceProces"
+"sor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.WhiteSpa"
+"ceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$N"
+"ullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\nq\u0000~\u0000\u0011psr\u0000\u001bcom.sun.msv.u"
+"til.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000#L\u0000\fnamespaceURIq\u0000~"
+"\u0000#xpq\u0000~\u00004q\u0000~\u00003sq\u0000~\u0000\"t\u0000\u0004typet\u0000)http://www.w3.org/2001/XMLSche"
+"ma-instanceq\u0000~\u0000!sq\u0000~\u0000\"t\u0000\u0004Annst\u0000\u001ehttp://czt.sourceforge.net/z"
+"mlq\u0000~\u0000!sq\u0000~\u0000\r\u0005Nr\u00a7ppsq\u0000~\u0000\u0000\u0005Nr\u009cq\u0000~\u0000\u0011p\u0000sq\u0000~\u0000\u0007\u0005Nr\u0091ppsq\u0000~\u0000\u0000\u0001w\u00061pp"
+"\u0000sq\u0000~\u0000\r\u0001w\u0006&ppsq\u0000~\u0000\u0015\u0001w\u0006\u001bq\u0000~\u0000\u0011psq\u0000~\u0000\u0018\u0001w\u0006\u0018q\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!"
+"sq\u0000~\u0000\"t\u0000+net.sourceforge.czt.oz.jaxb.gen.RefNameListq\u0000~\u0000&sq\u0000"
+"~\u0000\r\u0003\u00d7l[ppsq\u0000~\u0000\u0018\u0003\u00d7lPq\u0000~\u0000\u0011pq\u0000~\u0000,sq\u0000~\u0000\"q\u0000~\u0000=q\u0000~\u0000>q\u0000~\u0000!sq\u0000~\u0000\"t\u0000\t"
+"DeltaListt\u0000#http://czt.sourceforge.net/object-zq\u0000~\u0000!sq\u0000~\u0000\r\u0004e"
+"\u0012\u00a5ppsq\u0000~\u0000\u0015\u0004e\u0012\u009aq\u0000~\u0000\u0011psq\u0000~\u0000\r\u0004e\u0012\u0097q\u0000~\u0000\u0011psq\u0000~\u0000\r\u0002\u00ee\fdq\u0000~\u0000\u0011psq\u0000~\u0000\u0000\u0001w"
+"\u00061q\u0000~\u0000\u0011p\u0000sq\u0000~\u0000\r\u0001w\u0006&ppsq\u0000~\u0000\u0015\u0001w\u0006\u001bq\u0000~\u0000\u0011psq\u0000~\u0000\u0018\u0001w\u0006\u0018q\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000"
+"~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"t\u0000.net.sourceforge.czt.z.jaxb.gen.InclDeclElem"
+"entq\u0000~\u0000&sq\u0000~\u0000\u0000\u0001w\u00061q\u0000~\u0000\u0011p\u0000sq\u0000~\u0000\r\u0001w\u0006&ppsq\u0000~\u0000\u0015\u0001w\u0006\u001bq\u0000~\u0000\u0011psq\u0000~\u0000\u0018\u0001"
+"w\u0006\u0018q\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"t\u0000/net.sourceforge.czt.z.jaxb."
+"gen.ConstDeclElementq\u0000~\u0000&sq\u0000~\u0000\u0000\u0001w\u00061q\u0000~\u0000\u0011p\u0000sq\u0000~\u0000\r\u0001w\u0006&ppsq\u0000~\u0000\u0015"
+"\u0001w\u0006\u001bq\u0000~\u0000\u0011psq\u0000~\u0000\u0018\u0001w\u0006\u0018q\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"t\u0000-net.source"
+"forge.czt.z.jaxb.gen.VarDeclElementq\u0000~\u0000&q\u0000~\u0000!sq\u0000~\u0000\r\u0018\u00e7ioppsq\u0000"
+"~\u0000\u0015\u0018\u00e7idq\u0000~\u0000\u0011psq\u0000~\u0000\r\u0018\u00e7iaq\u0000~\u0000\u0011psq\u0000~\u0000\r\u0017pc.q\u0000~\u0000\u0011psq\u0000~\u0000\r\u0015\u00f9\\\u00fbq\u0000~\u0000\u0011"
+"psq\u0000~\u0000\r\u0014\u0082V\u00c8q\u0000~\u0000\u0011psq\u0000~\u0000\r\u0013\u000bP\u0095q\u0000~\u0000\u0011psq\u0000~\u0000\r\u0011\u0094Jbq\u0000~\u0000\u0011psq\u0000~\u0000\r\u0010\u001dD/q"
+"\u0000~\u0000\u0011psq\u0000~\u0000\r\u000e\u00a6=\u00fcq\u0000~\u0000\u0011psq\u0000~\u0000\r\r/7\u00c9q\u0000~\u0000\u0011psq\u0000~\u0000\r\u000b\u00b81\u0096q\u0000~\u0000\u0011psq\u0000~\u0000\r\n"
+"A+cq\u0000~\u0000\u0011psq\u0000~\u0000\r\b\u00ca%0q\u0000~\u0000\u0011psq\u0000~\u0000\r\u0007S\u001e\u00fdq\u0000~\u0000\u0011psq\u0000~\u0000\r\u0005\u00dc\u0018\u00caq\u0000~\u0000\u0011psq\u0000"
+"~\u0000\r\u0004e\u0012\u0097q\u0000~\u0000\u0011psq\u0000~\u0000\r\u0002\u00ee\fdq\u0000~\u0000\u0011psq\u0000~\u0000\u0000\u0001w\u00061q\u0000~\u0000\u0011p\u0000sq\u0000~\u0000\r\u0001w\u0006&ppsq"
+"\u0000~\u0000\u0015\u0001w\u0006\u001bq\u0000~\u0000\u0011psq\u0000~\u0000\u0018\u0001w\u0006\u0018q\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"t\u0000*net.so"
+"urceforge.czt.z.jaxb.gen.Exists1Predq\u0000~\u0000&sq\u0000~\u0000\u0000\u0001w\u00061q\u0000~\u0000\u0011p\u0000sq"
+"\u0000~\u0000\r\u0001w\u0006&ppsq\u0000~\u0000\u0015\u0001w\u0006\u001bq\u0000~\u0000\u0011psq\u0000~\u0000\u0018\u0001w\u0006\u0018q\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000"
+"~\u0000\"t\u0000%net.sourceforge.czt.z.jaxb.gen.OrPredq\u0000~\u0000&sq\u0000~\u0000\u0000\u0001w\u00061q\u0000"
+"~\u0000\u0011p\u0000sq\u0000~\u0000\r\u0001w\u0006&ppsq\u0000~\u0000\u0015\u0001w\u0006\u001bq\u0000~\u0000\u0011psq\u0000~\u0000\u0018\u0001w\u0006\u0018q\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq"
+"\u0000~\u0000!sq\u0000~\u0000\"t\u0000\'net.sourceforge.czt.z.jaxb.gen.TruePredq\u0000~\u0000&sq\u0000"
+"~\u0000\u0000\u0001w\u00061q\u0000~\u0000\u0011p\u0000sq\u0000~\u0000\r\u0001w\u0006&ppsq\u0000~\u0000\u0015\u0001w\u0006\u001bq\u0000~\u0000\u0011psq\u0000~\u0000\u0018\u0001w\u0006\u0018q\u0000~\u0000\u0011pq\u0000"
+"~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"t\u0000)net.sourceforge.czt.z.jaxb.gen.ExistsP"
+"redq\u0000~\u0000&sq\u0000~\u0000\u0000\u0001w\u00061q\u0000~\u0000\u0011p\u0000sq\u0000~\u0000\r\u0001w\u0006&ppsq\u0000~\u0000\u0015\u0001w\u0006\u001bq\u0000~\u0000\u0011psq\u0000~\u0000\u0018\u0001"
+"w\u0006\u0018q\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"t\u00003net.sourceforge.czt.zpatt.j"
+"axb.gen.JokerPredElementq\u0000~\u0000&sq\u0000~\u0000\u0000\u0001w\u00061q\u0000~\u0000\u0011p\u0000sq\u0000~\u0000\r\u0001w\u0006&ppsq"
+"\u0000~\u0000\u0015\u0001w\u0006\u001bq\u0000~\u0000\u0011psq\u0000~\u0000\u0018\u0001w\u0006\u0018q\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"t\u0000+net.so"
+"urceforge.czt.z.jaxb.gen.Pred2Elementq\u0000~\u0000&sq\u0000~\u0000\u0000\u0001w\u00061q\u0000~\u0000\u0011p\u0000s"
+"q\u0000~\u0000\r\u0001w\u0006&ppsq\u0000~\u0000\u0015\u0001w\u0006\u001bq\u0000~\u0000\u0011psq\u0000~\u0000\u0018\u0001w\u0006\u0018q\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq"
+"\u0000~\u0000\"t\u0000*net.sourceforge.czt.z.jaxb.gen.FactElementq\u0000~\u0000&sq\u0000~\u0000\u0000"
+"\u0001w\u00061q\u0000~\u0000\u0011p\u0000sq\u0000~\u0000\r\u0001w\u0006&ppsq\u0000~\u0000\u0015\u0001w\u0006\u001bq\u0000~\u0000\u0011psq\u0000~\u0000\u0018\u0001w\u0006\u0018q\u0000~\u0000\u0011pq\u0000~\u0000\u001b"
+"q\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"t\u0000-net.sourceforge.czt.z.jaxb.gen.QntPredEle"
+"mentq\u0000~\u0000&sq\u0000~\u0000\u0000\u0001w\u00061q\u0000~\u0000\u0011p\u0000sq\u0000~\u0000\r\u0001w\u0006&ppsq\u0000~\u0000\u0015\u0001w\u0006\u001bq\u0000~\u0000\u0011psq\u0000~\u0000\u0018"
+"\u0001w\u0006\u0018q\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"t\u0000-net.sourceforge.czt.z.jaxb"
+".gen.AndPredElementq\u0000~\u0000&sq\u0000~\u0000\u0000\u0001w\u00061q\u0000~\u0000\u0011p\u0000sq\u0000~\u0000\r\u0001w\u0006&ppsq\u0000~\u0000\u0015\u0001"
+"w\u0006\u001bq\u0000~\u0000\u0011psq\u0000~\u0000\u0018\u0001w\u0006\u0018q\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"t\u0000*net.sourcef"
+"orge.czt.z.jaxb.gen.ImpliesPredq\u0000~\u0000&sq\u0000~\u0000\u0000\u0001w\u00061q\u0000~\u0000\u0011p\u0000sq\u0000~\u0000\r\u0001"
+"w\u0006&ppsq\u0000~\u0000\u0015\u0001w\u0006\u001bq\u0000~\u0000\u0011psq\u0000~\u0000\u0018\u0001w\u0006\u0018q\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"t\u0000"
+"(net.sourceforge.czt.z.jaxb.gen.FalsePredq\u0000~\u0000&sq\u0000~\u0000\u0000\u0001w\u00061q\u0000~\u0000"
+"\u0011p\u0000sq\u0000~\u0000\r\u0001w\u0006&ppsq\u0000~\u0000\u0015\u0001w\u0006\u001bq\u0000~\u0000\u0011psq\u0000~\u0000\u0018\u0001w\u0006\u0018q\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~"
+"\u0000!sq\u0000~\u0000\"t\u0000.net.sourceforge.czt.z.jaxb.gen.ExprPredElementq\u0000~"
+"\u0000&sq\u0000~\u0000\u0000\u0001w\u00061q\u0000~\u0000\u0011p\u0000sq\u0000~\u0000\r\u0001w\u0006&ppsq\u0000~\u0000\u0015\u0001w\u0006\u001bq\u0000~\u0000\u0011psq\u0000~\u0000\u0018\u0001w\u0006\u0018q\u0000~"
+"\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"t\u00007net.sourceforge.czt.oz.jaxb.gen.P"
+"romotedInitPredElementq\u0000~\u0000&sq\u0000~\u0000\u0000\u0001w\u00061q\u0000~\u0000\u0011p\u0000sq\u0000~\u0000\r\u0001w\u0006&ppsq\u0000~"
+"\u0000\u0015\u0001w\u0006\u001bq\u0000~\u0000\u0011psq\u0000~\u0000\u0018\u0001w\u0006\u0018q\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"t\u0000&net.sour"
+"ceforge.czt.z.jaxb.gen.IffPredq\u0000~\u0000&sq\u0000~\u0000\u0000\u0001w\u00061q\u0000~\u0000\u0011p\u0000sq\u0000~\u0000\r\u0001w"
+"\u0006&ppsq\u0000~\u0000\u0015\u0001w\u0006\u001bq\u0000~\u0000\u0011psq\u0000~\u0000\u0018\u0001w\u0006\u0018q\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"t\u0000-"
+"net.sourceforge.czt.z.jaxb.gen.NegPredElementq\u0000~\u0000&sq\u0000~\u0000\u0000\u0001w\u00061"
+"q\u0000~\u0000\u0011p\u0000sq\u0000~\u0000\r\u0001w\u0006&ppsq\u0000~\u0000\u0015\u0001w\u0006\u001bq\u0000~\u0000\u0011psq\u0000~\u0000\u0018\u0001w\u0006\u0018q\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000"
+"\u001fq\u0000~\u0000!sq\u0000~\u0000\"t\u0000)net.sourceforge.czt.z.jaxb.gen.ForallPredq\u0000~\u0000"
+"&sq\u0000~\u0000\u0000\u0001w\u00061q\u0000~\u0000\u0011p\u0000sq\u0000~\u0000\r\u0001w\u0006&ppsq\u0000~\u0000\u0015\u0001w\u0006\u001bq\u0000~\u0000\u0011psq\u0000~\u0000\u0018\u0001w\u0006\u0018q\u0000~\u0000"
+"\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"t\u0000-net.sourceforge.czt.z.jaxb.gen.Mem"
+"PredElementq\u0000~\u0000&q\u0000~\u0000!sq\u0000~\u0000\r\u0002\u00ca\u009a\u00a8ppsq\u0000~\u0000\u0018\u0002\u00ca\u009a\u009dq\u0000~\u0000\u0011pq\u0000~\u0000,sq\u0000~\u0000\""
+"q\u0000~\u0000=q\u0000~\u0000>q\u0000~\u0000!sq\u0000~\u0000\"t\u0000\fOperationBoxq\u0000~\u0000Psr\u0000\"com.sun.msv.gra"
+"mmar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/gra"
+"mmar/ExpressionPool$ClosedHash;xpsr\u0000-com.sun.msv.grammar.Exp"
+"ressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0002\u0000\u0004I\u0000\u0005countI\u0000\tthresholdL\u0000\u0006pare"
+"ntq\u0000~\u0000\u00e5[\u0000\u0005tablet\u0000![Lcom/sun/msv/grammar/Expression;xp\u0000\u0000\u0000M\u0000\u0000\u0000"
+"rpur\u0000![Lcom.sun.msv.grammar.Expression;\u00d68D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp\u0000\u0000\u0001\u007fpppp"
+"ppppppppppppq\u0000~\u0000Dpppppppppppppppppppppq\u0000~\u0000Bppppppppppppppppp"
+"ppppppppq\u0000~\u0000ippq\u0000~\u0000hppq\u0000~\u0000\u00bdq\u0000~\u0000\u00b7q\u0000~\u0000\u00b1q\u0000~\u0000\u00abq\u0000~\u0000\u00a5q\u0000~\u0000\u009fq\u0000~\u0000\u0099q\u0000~"
+"\u0000\u0093q\u0000~\u0000\u008dq\u0000~\u0000\u0087q\u0000~\u0000\u0081q\u0000~\u0000\u00bcq\u0000~\u0000\u00b6q\u0000~\u0000\u00b0q\u0000~\u0000\u00aaq\u0000~\u0000\u00a4q\u0000~\u0000\u009eq\u0000~\u0000\u0098q\u0000~\u0000\u0092q\u0000~"
+"\u0000\u008cq\u0000~\u0000\u0086q\u0000~\u0000\u0080q\u0000~\u0000zq\u0000~\u0000bq\u0000~\u0000\\q\u0000~\u0000Vq\u0000~\u0000Fq\u0000~\u0000\u0014q\u0000~\u0000{q\u0000~\u0000cq\u0000~\u0000]q\u0000~"
+"\u0000Wq\u0000~\u0000Gq\u0000~\u0000\u0017q\u0000~\u0000uq\u0000~\u0000qq\u0000~\u0000\u00c3q\u0000~\u0000\u00c2q\u0000~\u0000mq\u0000~\u0000\u00c9q\u0000~\u0000\u00c8q\u0000~\u0000\u00cfq\u0000~\u0000\u00ceq\u0000~"
+"\u0000\u00d5q\u0000~\u0000\u00d4q\u0000~\u0000\'q\u0000~\u0000\u00dbq\u0000~\u0000\u00daq\u0000~\u0000gq\u0000~\u0000\tpppppppppppppppppppppppppppp"
+"pppppppppppppppppq\u0000~\u0000lppppppq\u0000~\u0000pppppppq\u0000~\u0000tppppppq\u0000~\u0000xq\u0000~\u0000T"
+"pppppq\u0000~\u0000\u000bpppppppppppq\u0000~\u0000\u00dfppppppq\u0000~\u0000\u0012pppppppppppppppppppppq\u0000"
+"~\u0000\u000eppppppppppppppppppppppppq\u0000~\u0000kppppppq\u0000~\u0000oppppppq\u0000~\u0000sppq\u0000~\u0000"
+"\nq\u0000~\u0000\fppq\u0000~\u0000wq\u0000~\u0000Spq\u0000~\u0000Rppppppppppq\u0000~\u0000Qpppppppq\u0000~\u0000Kppppppppp"
+"pppppppppppppppppppppppppppppppppppppppppq\u0000~\u0000jppppppq\u0000~\u0000nppp"
+"pppq\u0000~\u0000rppppppq\u0000~\u0000vpppppppp"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends net.sourceforge.czt.oz.jaxb.gen.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingContext context) {
            super(context, "----");
        }

        protected Unmarshaller(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return net.sourceforge.czt.oz.jaxb.gen.impl.OperationBoxElementImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  1 :
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.OperationBoxImpl)net.sourceforge.czt.oz.jaxb.gen.impl.OperationBoxElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("DeltaList" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.OperationBoxImpl)net.sourceforge.czt.oz.jaxb.gen.impl.OperationBoxElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("InclDecl" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.OperationBoxImpl)net.sourceforge.czt.oz.jaxb.gen.impl.OperationBoxElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("ConstDecl" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.OperationBoxImpl)net.sourceforge.czt.oz.jaxb.gen.impl.OperationBoxElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("VarDecl" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.OperationBoxImpl)net.sourceforge.czt.oz.jaxb.gen.impl.OperationBoxElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Decl" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.OperationBoxImpl)net.sourceforge.czt.oz.jaxb.gen.impl.OperationBoxElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Decl" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.OperationBoxImpl)net.sourceforge.czt.oz.jaxb.gen.impl.OperationBoxElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Exists1Pred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.OperationBoxImpl)net.sourceforge.czt.oz.jaxb.gen.impl.OperationBoxElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("OrPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.OperationBoxImpl)net.sourceforge.czt.oz.jaxb.gen.impl.OperationBoxElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("TruePred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.OperationBoxImpl)net.sourceforge.czt.oz.jaxb.gen.impl.OperationBoxElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("ExistsPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.OperationBoxImpl)net.sourceforge.czt.oz.jaxb.gen.impl.OperationBoxElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("JokerPred" == ___local)&&("http://czt.sourceforge.net/zpatt" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.OperationBoxImpl)net.sourceforge.czt.oz.jaxb.gen.impl.OperationBoxElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Pred2" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.OperationBoxImpl)net.sourceforge.czt.oz.jaxb.gen.impl.OperationBoxElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Fact" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.OperationBoxImpl)net.sourceforge.czt.oz.jaxb.gen.impl.OperationBoxElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("QntPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.OperationBoxImpl)net.sourceforge.czt.oz.jaxb.gen.impl.OperationBoxElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("AndPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.OperationBoxImpl)net.sourceforge.czt.oz.jaxb.gen.impl.OperationBoxElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("ImpliesPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.OperationBoxImpl)net.sourceforge.czt.oz.jaxb.gen.impl.OperationBoxElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("FalsePred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.OperationBoxImpl)net.sourceforge.czt.oz.jaxb.gen.impl.OperationBoxElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("ExprPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.OperationBoxImpl)net.sourceforge.czt.oz.jaxb.gen.impl.OperationBoxElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("PromotedInitPred" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.OperationBoxImpl)net.sourceforge.czt.oz.jaxb.gen.impl.OperationBoxElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("IffPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.OperationBoxImpl)net.sourceforge.czt.oz.jaxb.gen.impl.OperationBoxElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("NegPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.OperationBoxImpl)net.sourceforge.czt.oz.jaxb.gen.impl.OperationBoxElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("ForallPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.OperationBoxImpl)net.sourceforge.czt.oz.jaxb.gen.impl.OperationBoxElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("MemPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.OperationBoxImpl)net.sourceforge.czt.oz.jaxb.gen.impl.OperationBoxElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Pred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.OperationBoxImpl)net.sourceforge.czt.oz.jaxb.gen.impl.OperationBoxElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Pred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.OperationBoxImpl)net.sourceforge.czt.oz.jaxb.gen.impl.OperationBoxElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.OperationBoxImpl)net.sourceforge.czt.oz.jaxb.gen.impl.OperationBoxElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                        return ;
                    case  0 :
                        if (("OperationBox" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 1;
                            return ;
                        }
                        break;
                    case  3 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                }
                super.enterElement(___uri, ___local, ___qname, __atts);
                break;
            }
        }

        public void leaveElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  1 :
                        spawnHandlerFromLeaveElement((((net.sourceforge.czt.oz.jaxb.gen.impl.OperationBoxImpl)net.sourceforge.czt.oz.jaxb.gen.impl.OperationBoxElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                        return ;
                    case  2 :
                        if (("OperationBox" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  3 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                }
                super.leaveElement(___uri, ___local, ___qname);
                break;
            }
        }

        public void enterAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  1 :
                        spawnHandlerFromEnterAttribute((((net.sourceforge.czt.oz.jaxb.gen.impl.OperationBoxImpl)net.sourceforge.czt.oz.jaxb.gen.impl.OperationBoxElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                        return ;
                    case  3 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                }
                super.enterAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void leaveAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  1 :
                        spawnHandlerFromLeaveAttribute((((net.sourceforge.czt.oz.jaxb.gen.impl.OperationBoxImpl)net.sourceforge.czt.oz.jaxb.gen.impl.OperationBoxElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                        return ;
                    case  3 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                }
                super.leaveAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void handleText(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                try {
                    switch (state) {
                        case  1 :
                            spawnHandlerFromText((((net.sourceforge.czt.oz.jaxb.gen.impl.OperationBoxImpl)net.sourceforge.czt.oz.jaxb.gen.impl.OperationBoxElementImpl.this).new Unmarshaller(context)), 2, value);
                            return ;
                        case  3 :
                            revertToParentFromText(value);
                            return ;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

    }

}
