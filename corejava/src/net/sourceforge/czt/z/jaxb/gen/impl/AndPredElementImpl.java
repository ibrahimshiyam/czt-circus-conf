//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2005.03.03 at 09:16:01 GMT 
//


package net.sourceforge.czt.z.jaxb.gen.impl;

public class AndPredElementImpl
    extends net.sourceforge.czt.z.jaxb.gen.impl.AndPredImpl
    implements net.sourceforge.czt.z.jaxb.gen.AndPredElement, com.sun.xml.bind.RIElement, com.sun.xml.bind.JAXBObject, net.sourceforge.czt.circus.jaxb.gen.impl.runtime.UnmarshallableObject, net.sourceforge.czt.circus.jaxb.gen.impl.runtime.XMLSerializable, net.sourceforge.czt.circus.jaxb.gen.impl.runtime.ValidatableObject
{

    public final static java.lang.Class version = (net.sourceforge.czt.z.jaxb.gen.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (net.sourceforge.czt.z.jaxb.gen.AndPredElement.class);
    }

    public java.lang.String ____jaxb_ri____getNamespaceURI() {
        return "http://czt.sourceforge.net/zml";
    }

    public java.lang.String ____jaxb_ri____getLocalName() {
        return "AndPred";
    }

    public net.sourceforge.czt.circus.jaxb.gen.impl.runtime.UnmarshallingEventHandler createUnmarshaller(net.sourceforge.czt.circus.jaxb.gen.impl.runtime.UnmarshallingContext context) {
        return new net.sourceforge.czt.z.jaxb.gen.impl.AndPredElementImpl.Unmarshaller(context);
    }

    public void serializeBody(net.sourceforge.czt.circus.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("http://czt.sourceforge.net/zml", "AndPred");
        super.serializeURIs(context);
        context.endNamespaceDecls();
        super.serializeAttributes(context);
        context.endAttributes();
        super.serializeBody(context);
        context.endElement();
    }

    public void serializeAttributes(net.sourceforge.czt.circus.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public void serializeURIs(net.sourceforge.czt.circus.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public java.lang.Class getPrimaryInterface() {
        return (net.sourceforge.czt.z.jaxb.gen.AndPredElement.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000"
+"\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv."
+"grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000"
+"\fcontentModelt\u0000 Lcom/sun/msv/grammar/Expression;xr\u0000\u001ecom.sun."
+"msv.grammar.Expression\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Lj"
+"ava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0003xppp\u0000sr\u0000\u001fcom.sun.msv.gra"
+"mmar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.BinaryExp"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~\u0000\u0004ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007pps"
+"q\u0000~\u0000\u0007ppsr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\bpps"
+"q\u0000~\u0000\u0000sr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000p\u0000sq\u0000~\u0000\u0007ppsq"
+"\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\rppsr\u0000 com.sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002"
+"\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0003xq\u0000~"
+"\u0000\u0004q\u0000~\u0000\u0011psr\u0000 com.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003ex"
+"pq\u0000~\u0000\u0003L\u0000\tnameClassq\u0000~\u0000\u0001xq\u0000~\u0000\u0004q\u0000~\u0000\u0011psr\u00002com.sun.msv.grammar.E"
+"xpression$AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004sq\u0000~\u0000\u0010\u0001q\u0000~\u0000\u001bsr"
+"\u0000 com.sun.msv.grammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv"
+".grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expre"
+"ssion$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004q\u0000~\u0000\u001cq\u0000~\u0000!sr\u0000#com.su"
+"n.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava"
+"/lang/String;L\u0000\fnamespaceURIq\u0000~\u0000#xq\u0000~\u0000\u001et\u0000-net.sourceforge.cz"
+"t.z.jaxb.gen.TermA.AnnsTypet\u0000+http://java.sun.com/jaxb/xjc/d"
+"ummy-elementssq\u0000~\u0000\rppsq\u0000~\u0000\u0018q\u0000~\u0000\u0011psr\u0000\u001bcom.sun.msv.grammar.Dat"
+"aExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Datatype;L\u0000\u0006exc"
+"eptq\u0000~\u0000\u0003L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~\u0000\u0004ppsr\u0000\"c"
+"om.sun.msv.datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv."
+"datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.dat"
+"atype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.xs"
+"d.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000#L\u0000\btypeNameq\u0000"
+"~\u0000#L\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/datatype/xsd/WhiteSpaceProce"
+"ssor;xpt\u0000 http://www.w3.org/2001/XMLSchemat\u0000\u0005QNamesr\u00005com.su"
+"n.msv.datatype.xsd.WhiteSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr"
+"\u0000,com.sun.msv.datatype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xps"
+"r\u00000com.sun.msv.grammar.Expression$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002"
+"\u0000\u0000xq\u0000~\u0000\u0004q\u0000~\u0000\u0011psr\u0000\u001bcom.sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tl"
+"ocalNameq\u0000~\u0000#L\u0000\fnamespaceURIq\u0000~\u0000#xpq\u0000~\u00004q\u0000~\u00003sq\u0000~\u0000\"t\u0000\u0004typet\u0000"
+")http://www.w3.org/2001/XMLSchema-instanceq\u0000~\u0000!sq\u0000~\u0000\"t\u0000\u0004Anns"
+"t\u0000\u001ehttp://czt.sourceforge.net/zmlq\u0000~\u0000!sq\u0000~\u0000\rppsq\u0000~\u0000\rppsq\u0000~\u0000\r"
+"ppsq\u0000~\u0000\rppsq\u0000~\u0000\rppsq\u0000~\u0000\rppsq\u0000~\u0000\rppsq\u0000~\u0000\rppsq\u0000~\u0000\rppsq\u0000~\u0000\rppsq"
+"\u0000~\u0000\rppsq\u0000~\u0000\rppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\rppsq\u0000~\u0000\u0015q\u0000~\u0000\u0011psq\u0000~\u0000\u0018q\u0000~\u0000\u0011pq\u0000~\u0000\u001b"
+"q\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"t\u0000)net.sourceforge.czt.z.jaxb.gen.ForallPred"
+"q\u0000~\u0000&sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\rppsq\u0000~\u0000\u0015q\u0000~\u0000\u0011psq\u0000~\u0000\u0018q\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000"
+"!sq\u0000~\u0000\"t\u0000-net.sourceforge.czt.z.jaxb.gen.NegPredElementq\u0000~\u0000&"
+"sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\rppsq\u0000~\u0000\u0015q\u0000~\u0000\u0011psq\u0000~\u0000\u0018q\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~"
+"\u0000\"t\u0000*net.sourceforge.czt.z.jaxb.gen.Exists1Predq\u0000~\u0000&sq\u0000~\u0000\u0000pp"
+"\u0000sq\u0000~\u0000\rppsq\u0000~\u0000\u0015q\u0000~\u0000\u0011psq\u0000~\u0000\u0018q\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"t\u0000.net"
+".sourceforge.czt.z.jaxb.gen.ExprPredElementq\u0000~\u0000&sq\u0000~\u0000\u0000pp\u0000sq\u0000"
+"~\u0000\rppsq\u0000~\u0000\u0015q\u0000~\u0000\u0011psq\u0000~\u0000\u0018q\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"t\u0000\'net.sou"
+"rceforge.czt.z.jaxb.gen.TruePredq\u0000~\u0000&sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\rppsq\u0000~\u0000\u0015"
+"q\u0000~\u0000\u0011psq\u0000~\u0000\u0018q\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"t\u0000&net.sourceforge.cz"
+"t.z.jaxb.gen.IffPredq\u0000~\u0000&sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\rppsq\u0000~\u0000\u0015q\u0000~\u0000\u0011psq\u0000~\u0000\u0018"
+"q\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"t\u0000%net.sourceforge.czt.z.jaxb.gen"
+".OrPredq\u0000~\u0000&sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\rppsq\u0000~\u0000\u0015q\u0000~\u0000\u0011psq\u0000~\u0000\u0018q\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000"
+"~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"t\u0000)net.sourceforge.czt.z.jaxb.gen.ExistsPredq\u0000"
+"~\u0000&sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\rppsq\u0000~\u0000\u0015q\u0000~\u0000\u0011psq\u0000~\u0000\u0018q\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!s"
+"q\u0000~\u0000\"t\u0000-net.sourceforge.czt.z.jaxb.gen.MemPredElementq\u0000~\u0000&sq"
+"\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\rppsq\u0000~\u0000\u0015q\u0000~\u0000\u0011psq\u0000~\u0000\u0018q\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\""
+"t\u00003net.sourceforge.czt.zpatt.jaxb.gen.JokerPredElementq\u0000~\u0000&s"
+"q\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\rppsq\u0000~\u0000\u0015q\u0000~\u0000\u0011psq\u0000~\u0000\u0018q\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000"
+"\"t\u0000(net.sourceforge.czt.z.jaxb.gen.FalsePredq\u0000~\u0000&sq\u0000~\u0000\u0000pp\u0000sq"
+"\u0000~\u0000\rppsq\u0000~\u0000\u0015q\u0000~\u0000\u0011psq\u0000~\u0000\u0018q\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"t\u0000-net.so"
+"urceforge.czt.z.jaxb.gen.AndPredElementq\u0000~\u0000&sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\rp"
+"psq\u0000~\u0000\u0015q\u0000~\u0000\u0011psq\u0000~\u0000\u0018q\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"t\u0000*net.sourcef"
+"orge.czt.z.jaxb.gen.ImpliesPredq\u0000~\u0000&sq\u0000~\u0000\rppsq\u0000~\u0000\rppsq\u0000~\u0000\rpp"
+"sq\u0000~\u0000\rppsq\u0000~\u0000\rppsq\u0000~\u0000\rppsq\u0000~\u0000\rppsq\u0000~\u0000\rppsq\u0000~\u0000\rppsq\u0000~\u0000\rppsq\u0000~"
+"\u0000\rppsq\u0000~\u0000\rppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\rppsq\u0000~\u0000\u0015q\u0000~\u0000\u0011psq\u0000~\u0000\u0018q\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000"
+"~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"q\u0000~\u0000Sq\u0000~\u0000&sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\rppsq\u0000~\u0000\u0015q\u0000~\u0000\u0011psq\u0000~\u0000\u0018q"
+"\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"q\u0000~\u0000Yq\u0000~\u0000&sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\rppsq\u0000~\u0000\u0015q"
+"\u0000~\u0000\u0011psq\u0000~\u0000\u0018q\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"q\u0000~\u0000_q\u0000~\u0000&sq\u0000~\u0000\u0000pp\u0000sq\u0000"
+"~\u0000\rppsq\u0000~\u0000\u0015q\u0000~\u0000\u0011psq\u0000~\u0000\u0018q\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"q\u0000~\u0000eq\u0000~\u0000&"
+"sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\rppsq\u0000~\u0000\u0015q\u0000~\u0000\u0011psq\u0000~\u0000\u0018q\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~"
+"\u0000\"q\u0000~\u0000kq\u0000~\u0000&sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\rppsq\u0000~\u0000\u0015q\u0000~\u0000\u0011psq\u0000~\u0000\u0018q\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000"
+"~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"q\u0000~\u0000qq\u0000~\u0000&sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\rppsq\u0000~\u0000\u0015q\u0000~\u0000\u0011psq\u0000~\u0000\u0018q"
+"\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"q\u0000~\u0000wq\u0000~\u0000&sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\rppsq\u0000~\u0000\u0015q"
+"\u0000~\u0000\u0011psq\u0000~\u0000\u0018q\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"q\u0000~\u0000}q\u0000~\u0000&sq\u0000~\u0000\u0000pp\u0000sq\u0000"
+"~\u0000\rppsq\u0000~\u0000\u0015q\u0000~\u0000\u0011psq\u0000~\u0000\u0018q\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"q\u0000~\u0000\u0083q\u0000~\u0000&"
+"sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\rppsq\u0000~\u0000\u0015q\u0000~\u0000\u0011psq\u0000~\u0000\u0018q\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~"
+"\u0000\"q\u0000~\u0000\u0089q\u0000~\u0000&sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\rppsq\u0000~\u0000\u0015q\u0000~\u0000\u0011psq\u0000~\u0000\u0018q\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000"
+"~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"q\u0000~\u0000\u008fq\u0000~\u0000&sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\rppsq\u0000~\u0000\u0015q\u0000~\u0000\u0011psq\u0000~\u0000\u0018q"
+"\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"q\u0000~\u0000\u0095q\u0000~\u0000&sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\rppsq\u0000~\u0000\u0015q"
+"\u0000~\u0000\u0011psq\u0000~\u0000\u0018q\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"q\u0000~\u0000\u009bq\u0000~\u0000&sq\u0000~\u0000\rppsq\u0000~"
+"\u0000\u0018q\u0000~\u0000\u0011psq\u0000~\u0000)ppsr\u0000)com.sun.msv.datatype.xsd.EnumerationFace"
+"t\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0006valuest\u0000\u000fLjava/util/Set;xr\u00009com.sun.msv.datat"
+"ype.xsd.DataTypeWithValueConstraintFacet\"\u00a7Ro\u00ca\u00c7\u008aT\u0002\u0000\u0000xr\u0000*com.s"
+"un.msv.datatype.xsd.DataTypeWithFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0005Z\u0000\fisFacetFi"
+"xedZ\u0000\u0012needValueCheckFlagL\u0000\bbaseTypet\u0000)Lcom/sun/msv/datatype/"
+"xsd/XSDatatypeImpl;L\u0000\fconcreteTypet\u0000\'Lcom/sun/msv/datatype/x"
+"sd/ConcreteType;L\u0000\tfacetNameq\u0000~\u0000#xq\u0000~\u00000q\u0000~\u0000At\u0000\u0002Opsr\u00005com.sun"
+".msv.datatype.xsd.WhiteSpaceProcessor$Preserve\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000"
+"~\u00006\u0000\u0000sr\u0000#com.sun.msv.datatype.xsd.StringType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\ris"
+"AlwaysValidxq\u0000~\u0000.q\u0000~\u00003t\u0000\u0006stringq\u0000~\u0000\u00f5\u0001q\u0000~\u0000\u00f7t\u0000\u000benumerationsr\u0000\u0011"
+"java.util.HashSet\u00baD\u0085\u0095\u0096\u00b8\u00b74\u0003\u0000\u0000xpw\f\u0000\u0000\u0000\u0010?@\u0000\u0000\u0000\u0000\u0000\u0004t\u0000\u0002NLt\u0000\u0003Andt\u0000\u0004Se"
+"mit\u0000\u0005Chainxq\u0000~\u00009sq\u0000~\u0000:q\u0000~\u0000\u00f3q\u0000~\u0000Asq\u0000~\u0000\"t\u0000\u0002Opt\u0000\u0000q\u0000~\u0000!sq\u0000~\u0000\rpps"
+"q\u0000~\u0000\u0018q\u0000~\u0000\u0011pq\u0000~\u0000,q\u0000~\u0000<q\u0000~\u0000!sq\u0000~\u0000\"t\u0000\u0007AndPredq\u0000~\u0000Asr\u0000\"com.sun.m"
+"sv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/m"
+"sv/grammar/ExpressionPool$ClosedHash;xpsr\u0000-com.sun.msv.gramm"
+"ar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstreamVers"
+"ionL\u0000\u0006parentt\u0000$Lcom/sun/msv/grammar/ExpressionPool;xp\u0000\u0000\u0000W\u0001pq"
+"\u0000~\u0000\u00a5q\u0000~\u0000Kq\u0000~\u0000Bq\u0000~\u0000Fq\u0000~\u0000\u00a0q\u0000~\u0000\u009cq\u0000~\u0000Jq\u0000~\u0000\u00a4q\u0000~\u0000\u00a6q\u0000~\u0000Lq\u0000~\u0000\u008cq\u0000~\u0000\u0086q"
+"\u0000~\u0000\u0080q\u0000~\u0000zq\u0000~\u0000tq\u0000~\u0000nq\u0000~\u0000hq\u0000~\u0000bq\u0000~\u0000\\q\u0000~\u0000Vq\u0000~\u0000Pq\u0000~\u0000\u0017q\u0000~\u0000\u00beq\u0000~\u0000\u00b9q"
+"\u0000~\u0000\u00b4q\u0000~\u0000\u00afq\u0000~\u0000\u00aaq\u0000~\u0000\u0098q\u0000~\u0000\u0092q\u0000~\u0000\u00c3q\u0000~\u0000\u00c8q\u0000~\u0000\u00cdq\u0000~\u0000\u00d2q\u0000~\u0000\u00d7q\u0000~\u0000\u00dcq\u0000~\u0000\u00e1q"
+"\u0000~\u0000\u00e6q\u0000~\u0000\u000bq\u0000~\u0000\nq\u0000~\u0000Hq\u0000~\u0000\u00a2q\u0000~\u0000\u00a7q\u0000~\u0000Mq\u0000~\u0000\u00e9q\u0000~\u0000Gq\u0000~\u0000\u00a1q\u0000~\u0000\fq\u0000~\u0000\u00bdq"
+"\u0000~\u0000\u00b8q\u0000~\u0000\u00b3q\u0000~\u0000\u00aeq\u0000~\u0000\u00a9q\u0000~\u0000\u0097q\u0000~\u0000\u0091q\u0000~\u0000\u008bq\u0000~\u0000\u0085q\u0000~\u0000\u007fq\u0000~\u0000yq\u0000~\u0000sq\u0000~\u0000mq"
+"\u0000~\u0000gq\u0000~\u0000aq\u0000~\u0000[q\u0000~\u0000Uq\u0000~\u0000Oq\u0000~\u0000\u0014q\u0000~\u0000\u00c2q\u0000~\u0000\u00c7q\u0000~\u0000\u00ccq\u0000~\u0000\u00d1q\u0000~\u0000\u00d6q\u0000~\u0000\u00dbq"
+"\u0000~\u0000\u00e0q\u0000~\u0000Iq\u0000~\u0000\u00a3q\u0000~\u0000\u00e5q\u0000~\u0000Dq\u0000~\u0000\u009eq\u0000~\u0000\u000eq\u0000~\u0000Cq\u0000~\u0000\u009dq\u0000~\u0000\u0012q\u0000~\u0000\'q\u0000~\u0001\u0004q"
+"\u0000~\u0000\tq\u0000~\u0000Eq\u0000~\u0000\u009fx"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends net.sourceforge.czt.circus.jaxb.gen.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(net.sourceforge.czt.circus.jaxb.gen.impl.runtime.UnmarshallingContext context) {
            super(context, "----");
        }

        protected Unmarshaller(net.sourceforge.czt.circus.jaxb.gen.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return net.sourceforge.czt.z.jaxb.gen.impl.AndPredElementImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  1 :
                        attIdx = context.getAttribute("", "Op");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.AndPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.AndPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("ForallPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.AndPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.AndPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("NegPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.AndPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.AndPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Exists1Pred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.AndPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.AndPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("ExprPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.AndPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.AndPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("TruePred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.AndPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.AndPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("IffPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.AndPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.AndPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("OrPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.AndPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.AndPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("ExistsPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.AndPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.AndPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("MemPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.AndPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.AndPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("JokerPred" == ___local)&&("http://czt.sourceforge.net/zpatt" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.AndPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.AndPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("FalsePred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.AndPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.AndPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("AndPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.AndPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.AndPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("ImpliesPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.AndPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.AndPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Pred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.AndPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.AndPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Pred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.AndPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.AndPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.AndPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.AndPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                        return ;
                    case  3 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  0 :
                        if (("AndPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 1;
                            return ;
                        }
                        break;
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
                        attIdx = context.getAttribute("", "Op");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        spawnHandlerFromLeaveElement((((net.sourceforge.czt.z.jaxb.gen.impl.AndPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.AndPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                        return ;
                    case  3 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  2 :
                        if (("AndPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
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
                        if (("Op" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((net.sourceforge.czt.z.jaxb.gen.impl.AndPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.AndPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                            return ;
                        }
                        spawnHandlerFromEnterAttribute((((net.sourceforge.czt.z.jaxb.gen.impl.AndPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.AndPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                        attIdx = context.getAttribute("", "Op");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        spawnHandlerFromLeaveAttribute((((net.sourceforge.czt.z.jaxb.gen.impl.AndPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.AndPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                            attIdx = context.getAttribute("", "Op");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            spawnHandlerFromText((((net.sourceforge.czt.z.jaxb.gen.impl.AndPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.AndPredElementImpl.this).new Unmarshaller(context)), 2, value);
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
