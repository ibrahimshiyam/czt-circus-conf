//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2004.06.09 at 03:13:59 NZST 
//


package net.sourceforge.czt.oz.jaxb.gen.impl;

public class MainOpExprElementImpl
    extends net.sourceforge.czt.oz.jaxb.gen.impl.MainOpExprImpl
    implements net.sourceforge.czt.oz.jaxb.gen.MainOpExprElement, com.sun.xml.bind.RIElement, com.sun.xml.bind.JAXBObject, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallableObject, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializable, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.ValidatableObject
{

    public final static java.lang.Class version = (net.sourceforge.czt.oz.jaxb.gen.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (net.sourceforge.czt.oz.jaxb.gen.MainOpExprElement.class);
    }

    public java.lang.String ____jaxb_ri____getNamespaceURI() {
        return "http://czt.sourceforge.net/object-z";
    }

    public java.lang.String ____jaxb_ri____getLocalName() {
        return "MainOpExpr";
    }

    public net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingEventHandler createUnmarshaller(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingContext context) {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.MainOpExprElementImpl.Unmarshaller(context);
    }

    public void serializeBody(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("http://czt.sourceforge.net/object-z", "MainOpExpr");
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
        return (net.sourceforge.czt.oz.jaxb.gen.MainOpExprElement.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000"
+"\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv."
+"grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000"
+"\fcontentModelt\u0000 Lcom/sun/msv/grammar/Expression;xr\u0000\u001ecom.sun."
+"msv.grammar.Expression\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilon"
+"Reducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0003xp6s\u00c8\u0096p"
+"p\u0000sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun."
+"msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~"
+"\u0000\u00046s\u00c8\u008bppsq\u0000~\u0000\u00074\"\u0084Pppsq\u0000~\u0000\u0007\t\u00a6\u00d0\u0086ppsr\u0000\u001dcom.sun.msv.grammar.Choi"
+"ceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\b\u0003\u00da\u009d\u00a0ppsq\u0000~\u0000\u0000\u0003\u00da\u009d\u0095sr\u0000\u0011java.lang.Boolean\u00cd"
+" r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000p\u0000sq\u0000~\u0000\u0007\u0003\u00da\u009d\u008appsq\u0000~\u0000\u0000\u0001w\u00061pp\u0000sq\u0000~\u0000\f\u0001w\u0006&pp"
+"sr\u0000 com.sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.m"
+"sv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0003xq\u0000~\u0000\u0004\u0001w\u0006\u001bq\u0000~\u0000\u0010psr\u0000"
+" com.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0003L\u0000\tna"
+"meClassq\u0000~\u0000\u0001xq\u0000~\u0000\u0004\u0001w\u0006\u0018q\u0000~\u0000\u0010psr\u00002com.sun.msv.grammar.Expressi"
+"on$AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\bsq\u0000~\u0000\u000f\u0001q\u0000~\u0000\u001asr\u0000 c"
+"om.sun.msv.grammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.gr"
+"ammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expressi"
+"on$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\tq\u0000~\u0000\u001bq\u0000~\u0000 sr\u0000#com.s"
+"un.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljav"
+"a/lang/String;L\u0000\fnamespaceURIq\u0000~\u0000\"xq\u0000~\u0000\u001dt\u0000-net.sourceforge.c"
+"zt.z.jaxb.gen.TermA.AnnsTypet\u0000+http://java.sun.com/jaxb/xjc/"
+"dummy-elementssq\u0000~\u0000\f\u0002c\u0097Tppsq\u0000~\u0000\u0017\u0002c\u0097Iq\u0000~\u0000\u0010psr\u0000\u001bcom.sun.msv.gr"
+"ammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Dataty"
+"pe;L\u0000\u0006exceptq\u0000~\u0000\u0003L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~"
+"\u0000\u0004\u0001\u00f6\u00ef\u0011ppsr\u0000\"com.sun.msv.datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000"
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
+"\f\u0005\u00cc2\u00e1ppsq\u0000~\u0000\u0000\u0001w\u00061pp\u0000sq\u0000~\u0000\f\u0001w\u0006&ppsq\u0000~\u0000\u0014\u0001w\u0006\u001bq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001w\u0006\u0018q\u0000"
+"~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000-net.sourceforge.czt.z.jaxb.gen.S"
+"chTextElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0004U,\u00aepp\u0000sq\u0000~\u0000\u0007\u0004U,\u00a3ppsq\u0000~\u0000\u0000\u0001w\u00061pp\u0000sq\u0000~"
+"\u0000\f\u0001w\u0006&ppsq\u0000~\u0000\u0014\u0001w\u0006\u001bq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001w\u0006\u0018q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000"
+"!t\u0000&net.sourceforge.czt.z.jaxb.gen.SchTextq\u0000~\u0000%sq\u0000~\u0000\f\u0002\u00de&mpps"
+"q\u0000~\u0000\u0017\u0002\u00de&bq\u0000~\u0000\u0010pq\u0000~\u0000+sq\u0000~\u0000!q\u0000~\u0000<q\u0000~\u0000=q\u0000~\u0000 sq\u0000~\u0000!t\u0000\u0007SchTextq\u0000~"
+"\u0000@sq\u0000~\u0000\f*{\u00b3\u00c5ppsq\u0000~\u0000\f)\u0004\u00ad\u0092ppsq\u0000~\u0000\f\'\u008d\u00a7_ppsq\u0000~\u0000\f&\u0016\u00a1,ppsq\u0000~\u0000\f$\u009f\u009a\u00f9"
+"ppsq\u0000~\u0000\f#(\u0094\u00c6ppsq\u0000~\u0000\f!\u00b1\u008e\u0093ppsq\u0000~\u0000\f :\u0088`ppsq\u0000~\u0000\f\u001e\u00c3\u0082-ppsq\u0000~\u0000\f\u001dL{\u00fa"
+"ppsq\u0000~\u0000\f\u001b\u00d5u\u00c7ppsq\u0000~\u0000\f\u001a^o\u0094ppsq\u0000~\u0000\f\u0018\u00e7iappsq\u0000~\u0000\f\u0017pc.ppsq\u0000~\u0000\f\u0015\u00f9\\\u00fb"
+"ppsq\u0000~\u0000\f\u0014\u0082V\u00c8ppsq\u0000~\u0000\f\u0013\u000bP\u0095ppsq\u0000~\u0000\f\u0011\u0094Jbppsq\u0000~\u0000\f\u0010\u001dD/ppsq\u0000~\u0000\f\u000e\u00a6=\u00fc"
+"ppsq\u0000~\u0000\f\r/7\u00c9ppsq\u0000~\u0000\f\u000b\u00b81\u0096ppsq\u0000~\u0000\f\nA+cppsq\u0000~\u0000\f\b\u00ca%0ppsq\u0000~\u0000\f\u0007S\u001e\u00fd"
+"ppsq\u0000~\u0000\f\u0005\u00dc\u0018\u00cappsq\u0000~\u0000\f\u0004e\u0012\u0097ppsq\u0000~\u0000\f\u0002\u00ee\fdppsq\u0000~\u0000\u0000\u0001w\u00061pp\u0000sq\u0000~\u0000\f\u0001w\u0006"
+"&ppsq\u0000~\u0000\u0014\u0001w\u0006\u001bq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001w\u0006\u0018q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00009n"
+"et.sourceforge.czt.tcoz.jaxb.gen.WaitUntilProExprElementq\u0000~\u0000"
+"%sq\u0000~\u0000\u0000\u0001w\u00061pp\u0000sq\u0000~\u0000\f\u0001w\u0006&ppsq\u0000~\u0000\u0014\u0001w\u0006\u001bq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001w\u0006\u0018q\u0000~\u0000\u0010pq\u0000"
+"~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00003net.sourceforge.czt.tcoz.jaxb.gen.Inte"
+"rleaveProExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001w\u00061pp\u0000sq\u0000~\u0000\f\u0001w\u0006&ppsq\u0000~\u0000\u0014\u0001w\u0006\u001bq\u0000~\u0000\u0010ps"
+"q\u0000~\u0000\u0017\u0001w\u0006\u0018q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00005net.sourceforge.czt.t"
+"coz.jaxb.gen.GuardProExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001w\u00061pp\u0000sq\u0000~\u0000\f\u0001w\u0006&"
+"ppsq\u0000~\u0000\u0014\u0001w\u0006\u001bq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001w\u0006\u0018q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000-ne"
+"t.sourceforge.czt.oz.jaxb.gen.DistSeqOpExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001w\u00061pp"
+"\u0000sq\u0000~\u0000\f\u0001w\u0006&ppsq\u0000~\u0000\u0014\u0001w\u0006\u001bq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001w\u0006\u0018q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 "
+"sq\u0000~\u0000!t\u00002net.sourceforge.czt.oz.jaxb.gen.BasicOpExprElementq"
+"\u0000~\u0000%sq\u0000~\u0000\u0000\u0001w\u00061pp\u0000sq\u0000~\u0000\f\u0001w\u0006&ppsq\u0000~\u0000\u0014\u0001w\u0006\u001bq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001w\u0006\u0018q\u0000~\u0000\u0010"
+"pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00000net.sourceforge.czt.tcoz.jaxb.gen.D"
+"ivergeProExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001w\u00061pp\u0000sq\u0000~\u0000\f\u0001w\u0006&ppsq\u0000~\u0000\u0014\u0001w\u0006\u001bq\u0000~\u0000\u0010ps"
+"q\u0000~\u0000\u0017\u0001w\u0006\u0018q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00006net.sourceforge.czt.t"
+"coz.jaxb.gen.SynPllProExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001w\u00061pp\u0000sq\u0000~\u0000\f\u0001w\u0006"
+"&ppsq\u0000~\u0000\u0014\u0001w\u0006\u001bq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001w\u0006\u0018q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000*n"
+"et.sourceforge.czt.oz.jaxb.gen.ConjOpExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001w\u00061pp\u0000s"
+"q\u0000~\u0000\f\u0001w\u0006&ppsq\u0000~\u0000\u0014\u0001w\u0006\u001bq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001w\u0006\u0018q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq"
+"\u0000~\u0000!t\u00006net.sourceforge.czt.oz.jaxb.gen.OpPromotionExprElemen"
+"tq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001w\u00061pp\u0000sq\u0000~\u0000\f\u0001w\u0006&ppsq\u0000~\u0000\u0014\u0001w\u0006\u001bq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001w\u0006\u0018q\u0000~"
+"\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000.net.sourceforge.czt.oz.jaxb.gen.D"
+"istConjOpExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001w\u00061pp\u0000sq\u0000~\u0000\f\u0001w\u0006&ppsq\u0000~\u0000\u0014\u0001w\u0006\u001bq\u0000~\u0000\u0010ps"
+"q\u0000~\u0000\u0017\u0001w\u0006\u0018q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00002net.sourceforge.czt.o"
+"z.jaxb.gen.AssoParallelOpExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001w\u00061pp\u0000sq\u0000~\u0000\f\u0001w\u0006&pps"
+"q\u0000~\u0000\u0014\u0001w\u0006\u001bq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001w\u0006\u0018q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000.net.s"
+"ourceforge.czt.oz.jaxb.gen.ParallelOpExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001w\u00061pp\u0000s"
+"q\u0000~\u0000\f\u0001w\u0006&ppsq\u0000~\u0000\u0014\u0001w\u0006\u001bq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001w\u0006\u0018q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq"
+"\u0000~\u0000!t\u00003net.sourceforge.czt.oz.jaxb.gen.RenameOpExprElementq\u0000"
+"~\u0000%sq\u0000~\u0000\u0000\u0001w\u00061pp\u0000sq\u0000~\u0000\f\u0001w\u0006&ppsq\u0000~\u0000\u0014\u0001w\u0006\u001bq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001w\u0006\u0018q\u0000~\u0000\u0010p"
+"q\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000-net.sourceforge.czt.tcoz.jaxb.gen.Sk"
+"ipProExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001w\u00061pp\u0000sq\u0000~\u0000\f\u0001w\u0006&ppsq\u0000~\u0000\u0014\u0001w\u0006\u001bq\u0000~\u0000\u0010psq\u0000~\u0000"
+"\u0017\u0001w\u0006\u0018q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00000net.sourceforge.czt.oz.ja"
+"xb.gen.DistChoiceOpExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001w\u00061pp\u0000sq\u0000~\u0000\f\u0001w\u0006&ppsq\u0000~\u0000\u0014\u0001"
+"w\u0006\u001bq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001w\u0006\u0018q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00002net.sourcef"
+"orge.czt.tcoz.jaxb.gen.AtProExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001w\u00061pp\u0000sq\u0000"
+"~\u0000\f\u0001w\u0006&ppsq\u0000~\u0000\u0014\u0001w\u0006\u001bq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001w\u0006\u0018q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~"
+"\u0000!t\u00004net.sourceforge.czt.tcoz.jaxb.gen.WaitProExprElementq\u0000~"
+"\u0000%sq\u0000~\u0000\u0000\u0001w\u00061pp\u0000sq\u0000~\u0000\f\u0001w\u0006&ppsq\u0000~\u0000\u0014\u0001w\u0006\u001bq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001w\u0006\u0018q\u0000~\u0000\u0010pq"
+"\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00002net.sourceforge.czt.tcoz.jaxb.gen.Int"
+"erruptProExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001w\u00061pp\u0000sq\u0000~\u0000\f\u0001w\u0006&ppsq\u0000~\u0000\u0014\u0001w\u0006\u001bq\u0000~\u0000\u0010ps"
+"q\u0000~\u0000\u0017\u0001w\u0006\u0018q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00008net.sourceforge.czt.t"
+"coz.jaxb.gen.DeadlineProExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001w\u00061pp\u0000sq\u0000~\u0000\f\u0001"
+"w\u0006&ppsq\u0000~\u0000\u0014\u0001w\u0006\u001bq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001w\u0006\u0018q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000"
+"8net.sourceforge.czt.tcoz.jaxb.gen.TopologyProExprElementq\u0000~"
+"\u0000%sq\u0000~\u0000\u0000\u0001w\u00061pp\u0000sq\u0000~\u0000\f\u0001w\u0006&ppsq\u0000~\u0000\u0014\u0001w\u0006\u001bq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001w\u0006\u0018q\u0000~\u0000\u0010pq"
+"\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00005net.sourceforge.czt.tcoz.jaxb.gen.Tim"
+"eoutStartProExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001w\u00061pp\u0000sq\u0000~\u0000\f\u0001w\u0006&ppsq\u0000~\u0000\u0014\u0001w\u0006\u001bq\u0000~\u0000"
+"\u0010psq\u0000~\u0000\u0017\u0001w\u0006\u0018q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00001net.sourceforge.cz"
+"t.oz.jaxb.gen.HideOpExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001w\u00061pp\u0000sq\u0000~\u0000\f\u0001w\u0006&p"
+"psq\u0000~\u0000\u0014\u0001w\u0006\u001bq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001w\u0006\u0018q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00001net"
+".sourceforge.czt.oz.jaxb.gen.ScopeEnrichOpExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001w\u0006"
+"1pp\u0000sq\u0000~\u0000\f\u0001w\u0006&ppsq\u0000~\u0000\u0014\u0001w\u0006\u001bq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001w\u0006\u0018q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000"
+"~\u0000 sq\u0000~\u0000!t\u00003net.sourceforge.czt.tcoz.jaxb.gen.TimeoutEndProE"
+"xprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001w\u00061pp\u0000sq\u0000~\u0000\f\u0001w\u0006&ppsq\u0000~\u0000\u0014\u0001w\u0006\u001bq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001w\u0006\u0018q"
+"\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000)net.sourceforge.czt.oz.jaxb.gen"
+".SeqOpExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001w\u00061pp\u0000sq\u0000~\u0000\f\u0001w\u0006&ppsq\u0000~\u0000\u0014\u0001w\u0006\u001bq\u0000~\u0000\u0010psq\u0000~"
+"\u0000\u0017\u0001w\u0006\u0018q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000+net.sourceforge.czt.oz.j"
+"axb.gen.ParenOpExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001w\u00061pp\u0000sq\u0000~\u0000\f\u0001w\u0006&ppsq\u0000~\u0000\u0014\u0001w\u0006\u001bq"
+"\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001w\u0006\u0018q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00003net.sourceforge"
+".czt.tcoz.jaxb.gen.RecProExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001w\u00061pp\u0000sq\u0000~\u0000\f"
+"\u0001w\u0006&ppsq\u0000~\u0000\u0014\u0001w\u0006\u001bq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001w\u0006\u0018q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t"
+"\u0000.net.sourceforge.czt.oz.jaxb.gen.ExChoiceOpExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001"
+"w\u00061pp\u0000sq\u0000~\u0000\f\u0001w\u0006&ppsq\u0000~\u0000\u0014\u0001w\u0006\u001bq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001w\u0006\u0018q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001e"
+"q\u0000~\u0000 sq\u0000~\u0000!t\u0000-net.sourceforge.czt.tcoz.jaxb.gen.StopProExprq"
+"\u0000~\u0000%sq\u0000~\u0000\f\u0002QD6ppsq\u0000~\u0000\u0017\u0002QD+q\u0000~\u0000\u0010pq\u0000~\u0000+sq\u0000~\u0000!q\u0000~\u0000<q\u0000~\u0000=q\u0000~\u0000 sq"
+"\u0000~\u0000!t\u0000\nMainOpExprt\u0000#http://czt.sourceforge.net/object-zsr\u0000\"c"
+"om.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lc"
+"om/sun/msv/grammar/ExpressionPool$ClosedHash;xpsr\u0000-com.sun.m"
+"sv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0002\u0000\u0004I\u0000\u0005countI\u0000\tth"
+"resholdL\u0000\u0006parentq\u0000~\u0001&[\u0000\u0005tablet\u0000![Lcom/sun/msv/grammar/Expres"
+"sion;xp\u0000\u0000\u0000f\u0000\u0000\u0000rpur\u0000![Lcom.sun.msv.grammar.Expression;\u00d68D\u00c3]\u00ad\u00a7"
+"\n\u0002\u0000\u0000xp\u0000\u0000\u0001\u007fq\u0000~\u0000\u0011pppppppppppppppppppppq\u0000~\u0000\rppppppppppppq\u0000~\u0000Ppp"
+"pppppq\u0000~\u0000Uppppppq\u0000~\u0000Yppppppq\u0000~\u0000]ppppppq\u0000~\u0000aq\u0000~\u0001\u001fppppq\u0000~\u0000\u00c7q\u0000~"
+"\u0000\u00c1q\u0000~\u0000\u00bbq\u0000~\u0000\u00b5q\u0000~\u0000\u00afq\u0000~\u0000\u00a9q\u0000~\u0000\u00a3q\u0000~\u0000\u009dq\u0000~\u0000\u0097q\u0000~\u0000\u0091q\u0000~\u0000\u008bq\u0000~\u0000\u00c6q\u0000~\u0000\u00c0q\u0000~"
+"\u0000\u00baq\u0000~\u0000\u00b4q\u0000~\u0000\u00aeq\u0000~\u0000\u00a8q\u0000~\u0000\u00a2q\u0000~\u0000\u009cq\u0000~\u0000\u0096q\u0000~\u0000\u0090q\u0000~\u0000\u008aq\u0000~\u0000\u0084q\u0000~\u0000~q\u0000~\u0000xq\u0000~"
+"\u0000rq\u0000~\u0000Kq\u0000~\u0000Cq\u0000~\u0000\u0013q\u0000~\u0000\u0085q\u0000~\u0000\u007fq\u0000~\u0000yq\u0000~\u0000sq\u0000~\u0000Lq\u0000~\u0000Dq\u0000~\u0000\u0016q\u0000~\u0000mq\u0000~"
+"\u0000iq\u0000~\u0000eq\u0000~\u0000\u00cdq\u0000~\u0000\u00ccq\u0000~\u0000\u00d3q\u0000~\u0000\u00d2q\u0000~\u0000\u00d9q\u0000~\u0000\u00d8q\u0000~\u0000\u00dfq\u0000~\u0000\u00deq\u0000~\u0000\u00e5q\u0000~\u0000\u00e4q\u0000~"
+"\u0000\u00ebq\u0000~\u0000\u00eaq\u0000~\u0000\u00f1q\u0000~\u0000\u00f0q\u0000~\u0000\u00f7q\u0000~\u0000\u00f6q\u0000~\u0000\u00fdq\u0000~\u0000\u00fcq\u0000~\u0001\u0003q\u0000~\u0001\u0002q\u0000~\u0001\tq\u0000~\u0001\bq\u0000~"
+"\u0001\u000fq\u0000~\u0000Iq\u0000~\u0001\u000eq\u0000~\u0001\u0015q\u0000~\u0001\u0014q\u0000~\u0001\u001bq\u0000~\u0001\u001appppppq\u0000~\u0000Xppppppq\u0000~\u0000\\pppppp"
+"q\u0000~\u0000`ppppppq\u0000~\u0000dppppppq\u0000~\u0000hppppppq\u0000~\u0000lppppppq\u0000~\u0000pppppppppppp"
+"pppppppppppppppppppppppppppppppppppppppq\u0000~\u0000Aq\u0000~\u0000Wppppppq\u0000~\u0000["
+"ppppppq\u0000~\u0000_ppppppq\u0000~\u0000cppppq\u0000~\u0000\u000bpq\u0000~\u0000gppppppq\u0000~\u0000kppppppq\u0000~\u0000op"
+"ppppq\u0000~\u0000&pppppppppppppppppppppppppq\u0000~\u0000\npppppppppppppppppppq\u0000"
+"~\u0000Vppppppq\u0000~\u0000Zppppppq\u0000~\u0000^ppppppq\u0000~\u0000bppppppq\u0000~\u0000fppppppq\u0000~\u0000jpp"
+"ppppq\u0000~\u0000npppppppq\u0000~\u0000\t"));
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
            return net.sourceforge.czt.oz.jaxb.gen.impl.MainOpExprElementImpl.this;
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
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.MainOpExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.MainOpExprElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("SchText" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.MainOpExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.MainOpExprElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("SchText" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.MainOpExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.MainOpExprElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.MainOpExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.MainOpExprElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                        return ;
                    case  0 :
                        if (("MainOpExpr" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
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
                        spawnHandlerFromLeaveElement((((net.sourceforge.czt.oz.jaxb.gen.impl.MainOpExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.MainOpExprElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                        return ;
                    case  2 :
                        if (("MainOpExpr" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
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
                        spawnHandlerFromEnterAttribute((((net.sourceforge.czt.oz.jaxb.gen.impl.MainOpExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.MainOpExprElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                        spawnHandlerFromLeaveAttribute((((net.sourceforge.czt.oz.jaxb.gen.impl.MainOpExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.MainOpExprElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                            spawnHandlerFromText((((net.sourceforge.czt.oz.jaxb.gen.impl.MainOpExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.MainOpExprElementImpl.this).new Unmarshaller(context)), 2, value);
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
