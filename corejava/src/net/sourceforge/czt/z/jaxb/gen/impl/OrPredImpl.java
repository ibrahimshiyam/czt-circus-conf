//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2004.07.23 at 08:45:41 NZST 
//


package net.sourceforge.czt.z.jaxb.gen.impl;

public class OrPredImpl
    extends net.sourceforge.czt.z.jaxb.gen.impl.Pred2Impl
    implements net.sourceforge.czt.z.jaxb.gen.OrPred, com.sun.xml.bind.RIElement, com.sun.xml.bind.JAXBObject, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallableObject, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializable, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.ValidatableObject
{

    public final static java.lang.Class version = (net.sourceforge.czt.z.jaxb.gen.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (net.sourceforge.czt.z.jaxb.gen.OrPred.class);
    }

    public java.lang.String ____jaxb_ri____getNamespaceURI() {
        return "http://czt.sourceforge.net/zml";
    }

    public java.lang.String ____jaxb_ri____getLocalName() {
        return "OrPred";
    }

    public net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingEventHandler createUnmarshaller(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingContext context) {
        return new net.sourceforge.czt.z.jaxb.gen.impl.OrPredImpl.Unmarshaller(context);
    }

    public void serializeBody(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("http://czt.sourceforge.net/zml", "OrPred");
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
        return (net.sourceforge.czt.z.jaxb.gen.OrPred.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000"
+"\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv."
+"grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000"
+"\fcontentModelt\u0000 Lcom/sun/msv/grammar/Expression;xr\u0000\u001ecom.sun."
+"msv.grammar.Expression\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilon"
+"Reducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0003xp,\u00d6\u00c3\u001ep"
+"p\u0000sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun."
+"msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~"
+"\u0000\u0004,\u00d6\u00c3\u0013ppsq\u0000~\u0000\u0007+4\u009eTppsq\u0000~\u0000\u0007\u0016\u00d5\u00fc\u00ddppsr\u0000\u001dcom.sun.msv.grammar.Choi"
+"ceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\b\u0002w[fppsq\u0000~\u0000\u0000\u0002w[[sr\u0000\u0011java.lang.Boolean\u00cd"
+" r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000p\u0000sq\u0000~\u0000\u0007\u0002w[Pppsq\u0000~\u0000\u0000\u00012\u00be2pp\u0000sq\u0000~\u0000\f\u00012\u00be\'pp"
+"sr\u0000 com.sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.m"
+"sv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0003xq\u0000~\u0000\u0004\u00012\u00be\u001cq\u0000~\u0000\u0010psr\u0000"
+" com.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0003L\u0000\tna"
+"meClassq\u0000~\u0000\u0001xq\u0000~\u0000\u0004\u00012\u00be\u0019q\u0000~\u0000\u0010psr\u00002com.sun.msv.grammar.Expressi"
+"on$AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\bsq\u0000~\u0000\u000f\u0001q\u0000~\u0000\u001asr\u0000 c"
+"om.sun.msv.grammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.gr"
+"ammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expressi"
+"on$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\tq\u0000~\u0000\u001bq\u0000~\u0000 sr\u0000#com.s"
+"un.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljav"
+"a/lang/String;L\u0000\fnamespaceURIq\u0000~\u0000\"xq\u0000~\u0000\u001dt\u0000-net.sourceforge.c"
+"zt.z.jaxb.gen.TermA.AnnsTypet\u0000+http://java.sun.com/jaxb/xjc/"
+"dummy-elementssq\u0000~\u0000\f\u0001D\u009d\u0019ppsq\u0000~\u0000\u0017\u0001D\u009d\u000eq\u0000~\u0000\u0010psr\u0000\u001bcom.sun.msv.gr"
+"ammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Dataty"
+"pe;L\u0000\u0006exceptq\u0000~\u0000\u0003L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~"
+"\u0000\u0004\u0000\u0089\u0017\u00b2ppsr\u0000\"com.sun.msv.datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000"
+"*com.sun.msv.datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%co"
+"m.sun.msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.ms"
+"v.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000\""
+"L\u0000\btypeNameq\u0000~\u0000\"L\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/datatype/xsd/Wh"
+"iteSpaceProcessor;xpt\u0000 http://www.w3.org/2001/XMLSchemat\u0000\u0005QN"
+"amesr\u00005com.sun.msv.datatype.xsd.WhiteSpaceProcessor$Collapse"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.WhiteSpaceProcessor\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$NullSetExpres"
+"sion\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\nq\u0000~\u0000\u0010psr\u0000\u001bcom.sun.msv.util.StringPa"
+"ir\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\"L\u0000\fnamespaceURIq\u0000~\u0000\"xpq\u0000~\u00003q\u0000~"
+"\u00002sq\u0000~\u0000!t\u0000\u0004typet\u0000)http://www.w3.org/2001/XMLSchema-instanceq"
+"\u0000~\u0000 sq\u0000~\u0000!t\u0000\u0004Annst\u0000\u001ehttp://czt.sourceforge.net/zmlq\u0000~\u0000 sq\u0000~\u0000"
+"\f\u0014^\u00a1rppsq\u0000~\u0000\f\u0013+\u00e3>ppsq\u0000~\u0000\f\u0011\u00f9%\nppsq\u0000~\u0000\f\u0010\u00c6f\u00d6ppsq\u0000~\u0000\f\u000f\u0093\u00a8\u00a2ppsq\u0000~\u0000"
+"\f\u000e`\u00eanppsq\u0000~\u0000\f\r.,:ppsq\u0000~\u0000\f\u000b\u00fbn\u0006ppsq\u0000~\u0000\f\n\u00c8\u00af\u00d2ppsq\u0000~\u0000\f\t\u0095\u00f1\u009eppsq\u0000~\u0000"
+"\f\bc3jppsq\u0000~\u0000\f\u00070u6ppsq\u0000~\u0000\f\u0005\u00fd\u00b7\u0002ppsq\u0000~\u0000\f\u0004\u00ca\u00f8\u00ceppsq\u0000~\u0000\f\u0003\u0098:\u009appsq\u0000~\u0000"
+"\f\u0002e|fppsq\u0000~\u0000\u0000\u00012\u00be2pp\u0000sq\u0000~\u0000\f\u00012\u00be\'ppsq\u0000~\u0000\u0014\u00012\u00be\u001cq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00012\u00be\u0019q\u0000"
+"~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000\'net.sourceforge.czt.z.jaxb.gen.T"
+"ruePredq\u0000~\u0000%sq\u0000~\u0000\u0000\u00012\u00be2pp\u0000sq\u0000~\u0000\f\u00012\u00be\'ppsq\u0000~\u0000\u0014\u00012\u00be\u001cq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001"
+"2\u00be\u0019q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000*net.sourceforge.czt.z.jaxb."
+"gen.Exists1Predq\u0000~\u0000%sq\u0000~\u0000\u0000\u00012\u00be2pp\u0000sq\u0000~\u0000\f\u00012\u00be\'ppsq\u0000~\u0000\u0014\u00012\u00be\u001cq\u0000~\u0000\u0010"
+"psq\u0000~\u0000\u0017\u00012\u00be\u0019q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000*net.sourceforge.czt"
+".z.jaxb.gen.ImpliesPredq\u0000~\u0000%sq\u0000~\u0000\u0000\u00012\u00be2pp\u0000sq\u0000~\u0000\f\u00012\u00be\'ppsq\u0000~\u0000\u0014\u0001"
+"2\u00be\u001cq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00012\u00be\u0019q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000-net.sourcef"
+"orge.czt.z.jaxb.gen.MemPredElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u00012\u00be2pp\u0000sq\u0000~\u0000\f\u00012"
+"\u00be\'ppsq\u0000~\u0000\u0014\u00012\u00be\u001cq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00012\u00be\u0019q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00007"
+"net.sourceforge.czt.oz.jaxb.gen.PromotedInitPredElementq\u0000~\u0000%"
+"sq\u0000~\u0000\u0000\u00012\u00be2pp\u0000sq\u0000~\u0000\f\u00012\u00be\'ppsq\u0000~\u0000\u0014\u00012\u00be\u001cq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00012\u00be\u0019q\u0000~\u0000\u0010pq\u0000~"
+"\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000+net.sourceforge.czt.z.jaxb.gen.Pred2Ele"
+"mentq\u0000~\u0000%sq\u0000~\u0000\u0000\u00012\u00be2pp\u0000sq\u0000~\u0000\f\u00012\u00be\'ppsq\u0000~\u0000\u0014\u00012\u00be\u001cq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00012\u00be\u0019"
+"q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000.net.sourceforge.czt.z.jaxb.gen"
+".ExprPredElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u00012\u00be2pp\u0000sq\u0000~\u0000\f\u00012\u00be\'ppsq\u0000~\u0000\u0014\u00012\u00be\u001cq\u0000~\u0000"
+"\u0010psq\u0000~\u0000\u0017\u00012\u00be\u0019q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000-net.sourceforge.cz"
+"t.z.jaxb.gen.QntPredElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u00012\u00be2pp\u0000sq\u0000~\u0000\f\u00012\u00be\'ppsq\u0000"
+"~\u0000\u0014\u00012\u00be\u001cq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00012\u00be\u0019q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000)net.sou"
+"rceforge.czt.z.jaxb.gen.ExistsPredq\u0000~\u0000%sq\u0000~\u0000\u0000\u00012\u00be2pp\u0000sq\u0000~\u0000\f\u00012"
+"\u00be\'ppsq\u0000~\u0000\u0014\u00012\u00be\u001cq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00012\u00be\u0019q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000%"
+"net.sourceforge.czt.z.jaxb.gen.OrPredq\u0000~\u0000%sq\u0000~\u0000\u0000\u00012\u00be2pp\u0000sq\u0000~\u0000"
+"\f\u00012\u00be\'ppsq\u0000~\u0000\u0014\u00012\u00be\u001cq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00012\u00be\u0019q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!"
+"t\u0000-net.sourceforge.czt.z.jaxb.gen.AndPredElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001"
+"2\u00be2pp\u0000sq\u0000~\u0000\f\u00012\u00be\'ppsq\u0000~\u0000\u0014\u00012\u00be\u001cq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00012\u00be\u0019q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001e"
+"q\u0000~\u0000 sq\u0000~\u0000!t\u0000*net.sourceforge.czt.z.jaxb.gen.FactElementq\u0000~\u0000"
+"%sq\u0000~\u0000\u0000\u00012\u00be2pp\u0000sq\u0000~\u0000\f\u00012\u00be\'ppsq\u0000~\u0000\u0014\u00012\u00be\u001cq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00012\u00be\u0019q\u0000~\u0000\u0010pq\u0000"
+"~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000-net.sourceforge.czt.z.jaxb.gen.NegPred"
+"Elementq\u0000~\u0000%sq\u0000~\u0000\u0000\u00012\u00be2pp\u0000sq\u0000~\u0000\f\u00012\u00be\'ppsq\u0000~\u0000\u0014\u00012\u00be\u001cq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001"
+"2\u00be\u0019q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000&net.sourceforge.czt.z.jaxb."
+"gen.IffPredq\u0000~\u0000%sq\u0000~\u0000\u0000\u00012\u00be2pp\u0000sq\u0000~\u0000\f\u00012\u00be\'ppsq\u0000~\u0000\u0014\u00012\u00be\u001cq\u0000~\u0000\u0010psq\u0000"
+"~\u0000\u0017\u00012\u00be\u0019q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00003net.sourceforge.czt.zpa"
+"tt.jaxb.gen.JokerPredElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u00012\u00be2pp\u0000sq\u0000~\u0000\f\u00012\u00be\'ppsq"
+"\u0000~\u0000\u0014\u00012\u00be\u001cq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00012\u00be\u0019q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000)net.so"
+"urceforge.czt.z.jaxb.gen.ForallPredq\u0000~\u0000%sq\u0000~\u0000\u0000\u00012\u00be2pp\u0000sq\u0000~\u0000\f\u0001"
+"2\u00be\'ppsq\u0000~\u0000\u0014\u00012\u00be\u001cq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00012\u00be\u0019q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000"
+"(net.sourceforge.czt.z.jaxb.gen.FalsePredq\u0000~\u0000%sq\u0000~\u0000\f\u0014^\u00a1rppsq"
+"\u0000~\u0000\f\u0013+\u00e3>ppsq\u0000~\u0000\f\u0011\u00f9%\nppsq\u0000~\u0000\f\u0010\u00c6f\u00d6ppsq\u0000~\u0000\f\u000f\u0093\u00a8\u00a2ppsq\u0000~\u0000\f\u000e`\u00eanppsq"
+"\u0000~\u0000\f\r.,:ppsq\u0000~\u0000\f\u000b\u00fbn\u0006ppsq\u0000~\u0000\f\n\u00c8\u00af\u00d2ppsq\u0000~\u0000\f\t\u0095\u00f1\u009eppsq\u0000~\u0000\f\bc3jppsq"
+"\u0000~\u0000\f\u00070u6ppsq\u0000~\u0000\f\u0005\u00fd\u00b7\u0002ppsq\u0000~\u0000\f\u0004\u00ca\u00f8\u00ceppsq\u0000~\u0000\f\u0003\u0098:\u009appsq\u0000~\u0000\f\u0002e|fppsq"
+"\u0000~\u0000\u0000\u00012\u00be2pp\u0000sq\u0000~\u0000\f\u00012\u00be\'ppsq\u0000~\u0000\u0014\u00012\u00be\u001cq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00012\u00be\u0019q\u0000~\u0000\u0010pq\u0000~\u0000\u001a"
+"q\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!q\u0000~\u0000Vq\u0000~\u0000%sq\u0000~\u0000\u0000\u00012\u00be2pp\u0000sq\u0000~\u0000\f\u00012\u00be\'ppsq\u0000~\u0000\u0014\u00012\u00be"
+"\u001cq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00012\u00be\u0019q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!q\u0000~\u0000\\q\u0000~\u0000%sq\u0000~\u0000\u0000"
+"\u00012\u00be2pp\u0000sq\u0000~\u0000\f\u00012\u00be\'ppsq\u0000~\u0000\u0014\u00012\u00be\u001cq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00012\u00be\u0019q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000"
+"\u001eq\u0000~\u0000 sq\u0000~\u0000!q\u0000~\u0000bq\u0000~\u0000%sq\u0000~\u0000\u0000\u00012\u00be2pp\u0000sq\u0000~\u0000\f\u00012\u00be\'ppsq\u0000~\u0000\u0014\u00012\u00be\u001cq\u0000~"
+"\u0000\u0010psq\u0000~\u0000\u0017\u00012\u00be\u0019q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!q\u0000~\u0000hq\u0000~\u0000%sq\u0000~\u0000\u0000\u00012\u00be2"
+"pp\u0000sq\u0000~\u0000\f\u00012\u00be\'ppsq\u0000~\u0000\u0014\u00012\u00be\u001cq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00012\u00be\u0019q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~"
+"\u0000 sq\u0000~\u0000!q\u0000~\u0000nq\u0000~\u0000%sq\u0000~\u0000\u0000\u00012\u00be2pp\u0000sq\u0000~\u0000\f\u00012\u00be\'ppsq\u0000~\u0000\u0014\u00012\u00be\u001cq\u0000~\u0000\u0010ps"
+"q\u0000~\u0000\u0017\u00012\u00be\u0019q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!q\u0000~\u0000tq\u0000~\u0000%sq\u0000~\u0000\u0000\u00012\u00be2pp\u0000s"
+"q\u0000~\u0000\f\u00012\u00be\'ppsq\u0000~\u0000\u0014\u00012\u00be\u001cq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00012\u00be\u0019q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq"
+"\u0000~\u0000!q\u0000~\u0000zq\u0000~\u0000%sq\u0000~\u0000\u0000\u00012\u00be2pp\u0000sq\u0000~\u0000\f\u00012\u00be\'ppsq\u0000~\u0000\u0014\u00012\u00be\u001cq\u0000~\u0000\u0010psq\u0000~\u0000"
+"\u0017\u00012\u00be\u0019q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!q\u0000~\u0000\u0080q\u0000~\u0000%sq\u0000~\u0000\u0000\u00012\u00be2pp\u0000sq\u0000~\u0000"
+"\f\u00012\u00be\'ppsq\u0000~\u0000\u0014\u00012\u00be\u001cq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00012\u00be\u0019q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!"
+"q\u0000~\u0000\u0086q\u0000~\u0000%sq\u0000~\u0000\u0000\u00012\u00be2pp\u0000sq\u0000~\u0000\f\u00012\u00be\'ppsq\u0000~\u0000\u0014\u00012\u00be\u001cq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00012\u00be"
+"\u0019q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!q\u0000~\u0000\u008cq\u0000~\u0000%sq\u0000~\u0000\u0000\u00012\u00be2pp\u0000sq\u0000~\u0000\f\u00012\u00be"
+"\'ppsq\u0000~\u0000\u0014\u00012\u00be\u001cq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00012\u00be\u0019q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!q\u0000~\u0000"
+"\u0092q\u0000~\u0000%sq\u0000~\u0000\u0000\u00012\u00be2pp\u0000sq\u0000~\u0000\f\u00012\u00be\'ppsq\u0000~\u0000\u0014\u00012\u00be\u001cq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00012\u00be\u0019q\u0000~"
+"\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!q\u0000~\u0000\u0098q\u0000~\u0000%sq\u0000~\u0000\u0000\u00012\u00be2pp\u0000sq\u0000~\u0000\f\u00012\u00be\'pps"
+"q\u0000~\u0000\u0014\u00012\u00be\u001cq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00012\u00be\u0019q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!q\u0000~\u0000\u009eq\u0000~"
+"\u0000%sq\u0000~\u0000\u0000\u00012\u00be2pp\u0000sq\u0000~\u0000\f\u00012\u00be\'ppsq\u0000~\u0000\u0014\u00012\u00be\u001cq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00012\u00be\u0019q\u0000~\u0000\u0010pq"
+"\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!q\u0000~\u0000\u00a4q\u0000~\u0000%sq\u0000~\u0000\u0000\u00012\u00be2pp\u0000sq\u0000~\u0000\f\u00012\u00be\'ppsq\u0000~\u0000"
+"\u0014\u00012\u00be\u001cq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00012\u00be\u0019q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!q\u0000~\u0000\u00aaq\u0000~\u0000%sq"
+"\u0000~\u0000\u0000\u00012\u00be2pp\u0000sq\u0000~\u0000\f\u00012\u00be\'ppsq\u0000~\u0000\u0014\u00012\u00be\u001cq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00012\u00be\u0019q\u0000~\u0000\u0010pq\u0000~\u0000\u001a"
+"q\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!q\u0000~\u0000\u00b0q\u0000~\u0000%sq\u0000~\u0000\u0000\u00012\u00be2pp\u0000sq\u0000~\u0000\f\u00012\u00be\'ppsq\u0000~\u0000\u0014\u00012\u00be"
+"\u001cq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00012\u00be\u0019q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!q\u0000~\u0000\u00b6q\u0000~\u0000%sq\u0000~\u0000\f"
+"\u0001\u00a2$\u00bappsq\u0000~\u0000\u0017\u0001\u00a2$\u00afq\u0000~\u0000\u0010pq\u0000~\u0000+sq\u0000~\u0000!q\u0000~\u0000<q\u0000~\u0000=q\u0000~\u0000 sq\u0000~\u0000!t\u0000\u0006OrP"
+"redq\u0000~\u0000@sr\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\b"
+"expTablet\u0000/Lcom/sun/msv/grammar/ExpressionPool$ClosedHash;xp"
+"sr\u0000-com.sun.msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0002\u0000\u0004"
+"I\u0000\u0005countI\u0000\tthresholdL\u0000\u0006parentq\u0000~\u0001\"[\u0000\u0005tablet\u0000![Lcom/sun/msv/g"
+"rammar/Expression;xp\u0000\u0000\u0000m\u0000\u0000\u0000rpur\u0000![Lcom.sun.msv.grammar.Expre"
+"ssion;\u00d68D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp\u0000\u0000\u0001\u007fppppppppppppppppq\u0000~\u0000\tpppppppppppppppp"
+"pppppppppppppppppppppppppppppppppppppppppppppppppppppppppppp"
+"q\u0000~\u0000\u000bpppppppppppppppppppq\u0000~\u0000Aq\u0000~\u0000\u00b7pppppppq\u0000~\u0000Cq\u0000~\u0000\u00b9pppppppq\u0000"
+"~\u0000Eq\u0000~\u0000\u00bbpppppppq\u0000~\u0000Gq\u0000~\u0000\u00bdppppq\u0000~\u0000&ppq\u0000~\u0000Iq\u0000~\u0000\u00bfpppppppq\u0000~\u0000Kq\u0000"
+"~\u0000\u00c1pppq\u0000~\u0000\u00c9q\u0000~\u0000\u00b3q\u0000~\u0000\u00adq\u0000~\u0000\u00a7q\u0000~\u0000Mq\u0000~\u0000\u00a1q\u0000~\u0000\u009bq\u0000~\u0000\u0095q\u0000~\u0000\u008fq\u0000~\u0000\u0089q\u0000~\u0000"
+"\u0083q\u0000~\u0000\u00b2q\u0000~\u0000\u00acq\u0000~\u0000\u00a6q\u0000~\u0000\u00a0q\u0000~\u0000\u009aq\u0000~\u0000\u0094q\u0000~\u0000\u008eq\u0000~\u0000\u0088q\u0000~\u0000\u0082q\u0000~\u0000|q\u0000~\u0000vq\u0000~\u0000"
+"pq\u0000~\u0000jq\u0000~\u0000dq\u0000~\u0000^q\u0000~\u0000Xq\u0000~\u0000Rq\u0000~\u0000\u0013q\u0000~\u0000}q\u0000~\u0000wq\u0000~\u0000qq\u0000~\u0000kq\u0000~\u0000eq\u0000~\u0000"
+"_q\u0000~\u0000Yq\u0000~\u0000Sq\u0000~\u0000\u0016q\u0000~\u0000Oq\u0000~\u0000\u00c8q\u0000~\u0000\u00ceq\u0000~\u0000\u00cdq\u0000~\u0000\u00d3q\u0000~\u0000\u00d2q\u0000~\u0000\u00c5q\u0000~\u0000\u00d8q\u0000~\u0000"
+"\u00d7q\u0000~\u0000\u00ddq\u0000~\u0000\u00dcq\u0000~\u0000\u00c3q\u0000~\u0000\u00e2q\u0000~\u0000\u00e1q\u0000~\u0000\u00e7q\u0000~\u0000\u00e6q\u0000~\u0000\u00ecq\u0000~\u0000\u00ebq\u0000~\u0000\u00f1q\u0000~\u0000\u00f0q\u0000~\u0000"
+"\u00f6q\u0000~\u0000\u00f5q\u0000~\u0000\u00fbq\u0000~\u0000\u00faq\u0000~\u0001\u0000q\u0000~\u0000\u00ffq\u0000~\u0001\u0005q\u0000~\u0001\u0004q\u0000~\u0001\nq\u0000~\u0001\tq\u0000~\u0001\u000fq\u0000~\u0001\u000eq\u0000~\u0001"
+"\u0014q\u0000~\u0001\u0013q\u0000~\u0001\u0019q\u0000~\u0001\u0018q\u0000~\u0000\nq\u0000~\u0001\u001cpppppppppppppppppppppppppppppppppp"
+"ppppppppppppppppppppppppppppppppppppq\u0000~\u0000Bq\u0000~\u0000\u00b8pppppppq\u0000~\u0000Dq\u0000"
+"~\u0000\u00bapppppppq\u0000~\u0000Fq\u0000~\u0000\u00bcpppppppq\u0000~\u0000Hq\u0000~\u0000\u0011q\u0000~\u0000\u00beppppppq\u0000~\u0000Jq\u0000~\u0000\u00c0pp"
+"pppppq\u0000~\u0000Lq\u0000~\u0000\u00c2ppq\u0000~\u0000\rppppq\u0000~\u0000Nq\u0000~\u0000\u00c4pppppppq\u0000~\u0000Pq\u0000~\u0000\u00c6ppppppp"
+"pp"));
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
            return net.sourceforge.czt.z.jaxb.gen.impl.OrPredImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  0 :
                        if (("OrPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 1;
                            return ;
                        }
                        break;
                    case  1 :
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.z.jaxb.gen.impl.OrPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("TruePred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.z.jaxb.gen.impl.OrPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Exists1Pred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.z.jaxb.gen.impl.OrPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("ImpliesPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.z.jaxb.gen.impl.OrPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("MemPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.z.jaxb.gen.impl.OrPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("PromotedInitPred" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.z.jaxb.gen.impl.OrPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Pred2" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.z.jaxb.gen.impl.OrPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("ExprPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.z.jaxb.gen.impl.OrPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("QntPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.z.jaxb.gen.impl.OrPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("ExistsPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.z.jaxb.gen.impl.OrPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("OrPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.z.jaxb.gen.impl.OrPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("AndPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.z.jaxb.gen.impl.OrPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Fact" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.z.jaxb.gen.impl.OrPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("NegPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.z.jaxb.gen.impl.OrPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("IffPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.z.jaxb.gen.impl.OrPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("JokerPred" == ___local)&&("http://czt.sourceforge.net/zpatt" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.z.jaxb.gen.impl.OrPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("ForallPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.z.jaxb.gen.impl.OrPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("FalsePred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.z.jaxb.gen.impl.OrPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Pred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.z.jaxb.gen.impl.OrPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Pred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.z.jaxb.gen.impl.OrPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.z.jaxb.gen.impl.OrPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
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
                    case  3 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  2 :
                        if (("OrPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  1 :
                        spawnHandlerFromLeaveElement((((net.sourceforge.czt.z.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.z.jaxb.gen.impl.OrPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                    case  3 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        spawnHandlerFromEnterAttribute((((net.sourceforge.czt.z.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.z.jaxb.gen.impl.OrPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                    case  3 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        spawnHandlerFromLeaveAttribute((((net.sourceforge.czt.z.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.z.jaxb.gen.impl.OrPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                        case  3 :
                            revertToParentFromText(value);
                            return ;
                        case  1 :
                            spawnHandlerFromText((((net.sourceforge.czt.z.jaxb.gen.impl.Pred2Impl)net.sourceforge.czt.z.jaxb.gen.impl.OrPredImpl.this).new Unmarshaller(context)), 2, value);
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
