//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2004.02.19 at 05:33:12 NZDT 
//


package net.sourceforge.czt.z.jaxb.gen.impl;

public class ExistsPredImpl
    extends net.sourceforge.czt.z.jaxb.gen.impl.QntPredImpl
    implements net.sourceforge.czt.z.jaxb.gen.ExistsPred, com.sun.xml.bind.RIElement, com.sun.xml.bind.JAXBObject, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallableObject, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializable, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.ValidatableObject
{

    public final static java.lang.Class version = (net.sourceforge.czt.z.jaxb.gen.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (net.sourceforge.czt.z.jaxb.gen.ExistsPred.class);
    }

    public java.lang.String ____jaxb_ri____getNamespaceURI() {
        return "http://czt.sourceforge.net/zml";
    }

    public java.lang.String ____jaxb_ri____getLocalName() {
        return "ExistsPred";
    }

    public net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingEventHandler createUnmarshaller(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingContext context) {
        return new net.sourceforge.czt.z.jaxb.gen.impl.ExistsPredImpl.Unmarshaller(context);
    }

    public void serializeBody(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("http://czt.sourceforge.net/zml", "ExistsPred");
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
        return (net.sourceforge.czt.z.jaxb.gen.ExistsPred.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000"
+"\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv."
+"grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000"
+"\fcontentModelt\u0000 Lcom/sun/msv/grammar/Expression;xr\u0000\u001ecom.sun."
+"msv.grammar.Expression\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilon"
+"Reducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0003xp\u001a\u0010V\u00eep"
+"p\u0000sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun."
+"msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~"
+"\u0000\u0004\u001a\u0010V\u00e3ppsq\u0000~\u0000\u0007\u0018\u00f6\u00d3\u0080ppsq\u0000~\u0000\u0007\u0007\u00a5\u00aa]ppsr\u0000\u001dcom.sun.msv.grammar.Choi"
+"ceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\b\u0003M\u009dxppsq\u0000~\u0000\u0000\u0003M\u009dmsr\u0000\u0011java.lang.Boolean\u00cd"
+" r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000p\u0000sq\u0000~\u0000\u0007\u0003M\u009dbppsq\u0000~\u0000\u0000\u0001\u0015\u0012\u0090pp\u0000sq\u0000~\u0000\f\u0001\u0015\u0012\u0085pp"
+"sr\u0000 com.sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.m"
+"sv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0003xq\u0000~\u0000\u0004\u0001\u0015\u0012zq\u0000~\u0000\u0010psr\u0000"
+" com.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0003L\u0000\tna"
+"meClassq\u0000~\u0000\u0001xq\u0000~\u0000\u0004\u0001\u0015\u0012wq\u0000~\u0000\u0010psr\u00002com.sun.msv.grammar.Expressi"
+"on$AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\bsq\u0000~\u0000\u000f\u0001q\u0000~\u0000\u001asr\u0000 c"
+"om.sun.msv.grammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.gr"
+"ammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expressi"
+"on$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\tq\u0000~\u0000\u001bq\u0000~\u0000 sr\u0000#com.s"
+"un.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljav"
+"a/lang/String;L\u0000\fnamespaceURIq\u0000~\u0000\"xq\u0000~\u0000\u001dt\u0000-net.sourceforge.c"
+"zt.z.jaxb.gen.TermA.AnnsTypet\u0000+http://java.sun.com/jaxb/xjc/"
+"dummy-elementssq\u0000~\u0000\f\u00028\u008a\u00cdppsq\u0000~\u0000\u0017\u00028\u008a\u00c2q\u0000~\u0000\u0010psr\u0000\u001bcom.sun.msv.gr"
+"ammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Dataty"
+"pe;L\u0000\u0006exceptq\u0000~\u0000\u0003L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~"
+"\u0000\u0004\u0001\u0007\u00bd\u001dppsr\u0000\"com.sun.msv.datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000"
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
+"\f\u0004X\f\u00e0ppsq\u0000~\u0000\u0000\u0001\u0015\u0012\u0090pp\u0000sq\u0000~\u0000\f\u0001\u0015\u0012\u0085ppsq\u0000~\u0000\u0014\u0001\u0015\u0012zq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001\u0015\u0012wq\u0000"
+"~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000-net.sourceforge.czt.z.jaxb.gen.S"
+"chTextElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0003B\u00faNpp\u0000sq\u0000~\u0000\u0007\u0003B\u00faCppsq\u0000~\u0000\u0000\u0001\u0015\u0012\u0090pp\u0000sq\u0000~"
+"\u0000\f\u0001\u0015\u0012\u0085ppsq\u0000~\u0000\u0014\u0001\u0015\u0012zq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001\u0015\u0012wq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000"
+"!t\u0000&net.sourceforge.czt.z.jaxb.gen.SchTextq\u0000~\u0000%sq\u0000~\u0000\f\u0002-\u00e7\u00aepps"
+"q\u0000~\u0000\u0017\u0002-\u00e7\u00a3q\u0000~\u0000\u0010pq\u0000~\u0000+sq\u0000~\u0000!q\u0000~\u0000<q\u0000~\u0000=q\u0000~\u0000 sq\u0000~\u0000!t\u0000\u0007SchTextq\u0000~"
+"\u0000@sq\u0000~\u0000\f\u0011Q)\u001eppsq\u0000~\u0000\f\u0010<\u0016\u008cppsq\u0000~\u0000\f\u000f\'\u0003\u00fappsq\u0000~\u0000\f\u000e\u0011\u00f1hppsq\u0000~\u0000\f\f\u00fc\u00de\u00d6"
+"ppsq\u0000~\u0000\f\u000b\u00e7\u00ccDppsq\u0000~\u0000\f\n\u00d2\u00b9\u00b2ppsq\u0000~\u0000\f\t\u00bd\u00a7 ppsq\u0000~\u0000\f\b\u00a8\u0094\u008eppsq\u0000~\u0000\f\u0007\u0093\u0081\u00fc"
+"ppsq\u0000~\u0000\f\u0006~ojppsq\u0000~\u0000\f\u0005i\\\u00d8ppsq\u0000~\u0000\f\u0004TJFppsq\u0000~\u0000\f\u0003?7\u00b4ppsq\u0000~\u0000\f\u0002*%\""
+"ppsq\u0000~\u0000\u0000\u0001\u0015\u0012\u0090pp\u0000sq\u0000~\u0000\f\u0001\u0015\u0012\u0085ppsq\u0000~\u0000\u0014\u0001\u0015\u0012zq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001\u0015\u0012wq\u0000~\u0000\u0010pq"
+"\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000(net.sourceforge.czt.z.jaxb.gen.FalseP"
+"redq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001\u0015\u0012\u0090pp\u0000sq\u0000~\u0000\f\u0001\u0015\u0012\u0085ppsq\u0000~\u0000\u0014\u0001\u0015\u0012zq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001\u0015\u0012wq"
+"\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000\'net.sourceforge.czt.z.jaxb.gen."
+"TruePredq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001\u0015\u0012\u0090pp\u0000sq\u0000~\u0000\f\u0001\u0015\u0012\u0085ppsq\u0000~\u0000\u0014\u0001\u0015\u0012zq\u0000~\u0000\u0010psq\u0000~\u0000\u0017"
+"\u0001\u0015\u0012wq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000*net.sourceforge.czt.z.jaxb"
+".gen.ImpliesPredq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001\u0015\u0012\u0090pp\u0000sq\u0000~\u0000\f\u0001\u0015\u0012\u0085ppsq\u0000~\u0000\u0014\u0001\u0015\u0012zq\u0000~\u0000"
+"\u0010psq\u0000~\u0000\u0017\u0001\u0015\u0012wq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000-net.sourceforge.cz"
+"t.z.jaxb.gen.MemPredElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001\u0015\u0012\u0090pp\u0000sq\u0000~\u0000\f\u0001\u0015\u0012\u0085ppsq\u0000"
+"~\u0000\u0014\u0001\u0015\u0012zq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001\u0015\u0012wq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000&net.sou"
+"rceforge.czt.z.jaxb.gen.IffPredq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001\u0015\u0012\u0090pp\u0000sq\u0000~\u0000\f\u0001\u0015\u0012\u0085p"
+"psq\u0000~\u0000\u0014\u0001\u0015\u0012zq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001\u0015\u0012wq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000%net"
+".sourceforge.czt.z.jaxb.gen.OrPredq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001\u0015\u0012\u0090pp\u0000sq\u0000~\u0000\f\u0001\u0015"
+"\u0012\u0085ppsq\u0000~\u0000\u0014\u0001\u0015\u0012zq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001\u0015\u0012wq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000)"
+"net.sourceforge.czt.z.jaxb.gen.ExistsPredq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001\u0015\u0012\u0090pp\u0000s"
+"q\u0000~\u0000\f\u0001\u0015\u0012\u0085ppsq\u0000~\u0000\u0014\u0001\u0015\u0012zq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001\u0015\u0012wq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq"
+"\u0000~\u0000!t\u0000*net.sourceforge.czt.z.jaxb.gen.Exists1Predq\u0000~\u0000%sq\u0000~\u0000\u0000"
+"\u0001\u0015\u0012\u0090pp\u0000sq\u0000~\u0000\f\u0001\u0015\u0012\u0085ppsq\u0000~\u0000\u0014\u0001\u0015\u0012zq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001\u0015\u0012wq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000"
+"\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000+net.sourceforge.czt.z.jaxb.gen.Pred2Elementq\u0000"
+"~\u0000%sq\u0000~\u0000\u0000\u0001\u0015\u0012\u0090pp\u0000sq\u0000~\u0000\f\u0001\u0015\u0012\u0085ppsq\u0000~\u0000\u0014\u0001\u0015\u0012zq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001\u0015\u0012wq\u0000~\u0000\u0010p"
+"q\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000-net.sourceforge.czt.z.jaxb.gen.AndPr"
+"edElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001\u0015\u0012\u0090pp\u0000sq\u0000~\u0000\f\u0001\u0015\u0012\u0085ppsq\u0000~\u0000\u0014\u0001\u0015\u0012zq\u0000~\u0000\u0010psq\u0000~\u0000"
+"\u0017\u0001\u0015\u0012wq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000)net.sourceforge.czt.z.jax"
+"b.gen.ForallPredq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001\u0015\u0012\u0090pp\u0000sq\u0000~\u0000\f\u0001\u0015\u0012\u0085ppsq\u0000~\u0000\u0014\u0001\u0015\u0012zq\u0000~\u0000"
+"\u0010psq\u0000~\u0000\u0017\u0001\u0015\u0012wq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000-net.sourceforge.cz"
+"t.z.jaxb.gen.NegPredElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001\u0015\u0012\u0090pp\u0000sq\u0000~\u0000\f\u0001\u0015\u0012\u0085ppsq\u0000"
+"~\u0000\u0014\u0001\u0015\u0012zq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001\u0015\u0012wq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000-net.sou"
+"rceforge.czt.z.jaxb.gen.QntPredElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001\u0015\u0012\u0090pp\u0000sq\u0000~"
+"\u0000\f\u0001\u0015\u0012\u0085ppsq\u0000~\u0000\u0014\u0001\u0015\u0012zq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001\u0015\u0012wq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000"
+"!t\u0000.net.sourceforge.czt.z.jaxb.gen.ExprPredElementq\u0000~\u0000%sq\u0000~\u0000"
+"\u0000\u0001\u0015\u0012\u0090pp\u0000sq\u0000~\u0000\f\u0001\u0015\u0012\u0085ppsq\u0000~\u0000\u0014\u0001\u0015\u0012zq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001\u0015\u0012wq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~"
+"\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00003net.sourceforge.czt.zpatt.jaxb.gen.JokerPred"
+"Elementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001\u0015\u0012\u0090pp\u0000sq\u0000~\u0000\f\u0001\u0015\u0012\u0085ppsq\u0000~\u0000\u0014\u0001\u0015\u0012zq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001"
+"\u0015\u0012wq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000*net.sourceforge.czt.z.jaxb."
+"gen.FactElementq\u0000~\u0000%sq\u0000~\u0000\f\u0001\u0019\u0083^ppsq\u0000~\u0000\u0017\u0001\u0019\u0083Sq\u0000~\u0000\u0010pq\u0000~\u0000+sq\u0000~\u0000!q"
+"\u0000~\u0000<q\u0000~\u0000=q\u0000~\u0000 sq\u0000~\u0000!t\u0000\nExistsPredq\u0000~\u0000@sr\u0000\"com.sun.msv.gramma"
+"r.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/gramma"
+"r/ExpressionPool$ClosedHash;xpsr\u0000-com.sun.msv.grammar.Expres"
+"sionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0002\u0000\u0004I\u0000\u0005countI\u0000\tthresholdL\u0000\u0006parentq"
+"\u0000~\u0000\u00ca[\u0000\u0005tablet\u0000![Lcom/sun/msv/grammar/Expression;xp\u0000\u0000\u0000?\u0000\u0000\u0000rpu"
+"r\u0000![Lcom.sun.msv.grammar.Expression;\u00d68D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp\u0000\u0000\u0001\u007fppppppp"
+"q\u0000~\u0000cppppppppq\u0000~\u0000appppppppq\u0000~\u0000\u0011q\u0000~\u0000_pppppppq\u0000~\u0000]ppppppppq\u0000~\u0000"
+"[pppq\u0000~\u0000\rppppq\u0000~\u0000Ypppppq\u0000~\u0000\tppq\u0000~\u0000Wppppppppq\u0000~\u0000Upppppppppppp"
+"pppppppppppppppppppppppppppppppppppppppppppppppppppppq\u0000~\u0000\u00c4pp"
+"pppppppppppq\u0000~\u0000Ppppppppppppppppppppppq\u0000~\u0000\u00baq\u0000~\u0000\u00b4q\u0000~\u0000\u00aeq\u0000~\u0000\u00a8q\u0000~"
+"\u0000\u00a2q\u0000~\u0000\u009cq\u0000~\u0000\u0096q\u0000~\u0000\u0090q\u0000~\u0000\u008aq\u0000~\u0000\u0084q\u0000~\u0000Aq\u0000~\u0000\u00b9q\u0000~\u0000\u00b3q\u0000~\u0000\u00adq\u0000~\u0000\u00a7q\u0000~\u0000\u00a1q\u0000~"
+"\u0000\u009bq\u0000~\u0000\u0095q\u0000~\u0000\u008fq\u0000~\u0000\u0089q\u0000~\u0000\u0083q\u0000~\u0000}q\u0000~\u0000wq\u0000~\u0000qq\u0000~\u0000kq\u0000~\u0000eq\u0000~\u0000Kq\u0000~\u0000Cq\u0000~"
+"\u0000\u0013q\u0000~\u0000~q\u0000~\u0000xq\u0000~\u0000bq\u0000~\u0000rq\u0000~\u0000lq\u0000~\u0000fq\u0000~\u0000Lq\u0000~\u0000Dq\u0000~\u0000&q\u0000~\u0000\u0016q\u0000~\u0000\u00c0q\u0000~"
+"\u0000`q\u0000~\u0000\u00bfpppppppq\u0000~\u0000^pppq\u0000~\u0000\u000bppppq\u0000~\u0000\\ppppppppq\u0000~\u0000Zppppppppq\u0000~"
+"\u0000Xppppppppq\u0000~\u0000Vppppppppppppppppppppppppppppppppppppppppppq\u0000~"
+"\u0000\nppppppppppppppppppppppppppppppppppppppppppppppppq\u0000~\u0000Ippppp"
+"pppppppppppppppppppppppppppp"));
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
            return net.sourceforge.czt.z.jaxb.gen.impl.ExistsPredImpl.this;
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
                    case  1 :
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.QntPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.ExistsPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("SchText" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.QntPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.ExistsPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("SchText" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.QntPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.ExistsPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.QntPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.ExistsPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                        return ;
                    case  0 :
                        if (("ExistsPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
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
                    case  3 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        spawnHandlerFromLeaveElement((((net.sourceforge.czt.z.jaxb.gen.impl.QntPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.ExistsPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                        return ;
                    case  2 :
                        if (("ExistsPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
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
                    case  3 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        spawnHandlerFromEnterAttribute((((net.sourceforge.czt.z.jaxb.gen.impl.QntPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.ExistsPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                        spawnHandlerFromLeaveAttribute((((net.sourceforge.czt.z.jaxb.gen.impl.QntPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.ExistsPredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                            spawnHandlerFromText((((net.sourceforge.czt.z.jaxb.gen.impl.QntPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.ExistsPredImpl.this).new Unmarshaller(context)), 2, value);
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
