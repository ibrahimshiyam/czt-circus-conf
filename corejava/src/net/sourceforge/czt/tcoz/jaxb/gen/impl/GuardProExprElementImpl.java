//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2004.07.23 at 08:45:41 NZST 
//


package net.sourceforge.czt.tcoz.jaxb.gen.impl;

public class GuardProExprElementImpl
    extends net.sourceforge.czt.tcoz.jaxb.gen.impl.GuardProExprImpl
    implements net.sourceforge.czt.tcoz.jaxb.gen.GuardProExprElement, com.sun.xml.bind.RIElement, com.sun.xml.bind.JAXBObject, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallableObject, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializable, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.ValidatableObject
{

    public final static java.lang.Class version = (net.sourceforge.czt.tcoz.jaxb.gen.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (net.sourceforge.czt.tcoz.jaxb.gen.GuardProExprElement.class);
    }

    public java.lang.String ____jaxb_ri____getNamespaceURI() {
        return "http://czt.sourceforge.net/tcoz";
    }

    public java.lang.String ____jaxb_ri____getLocalName() {
        return "GuardProExpr";
    }

    public net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingEventHandler createUnmarshaller(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingContext context) {
        return new net.sourceforge.czt.tcoz.jaxb.gen.impl.GuardProExprElementImpl.Unmarshaller(context);
    }

    public void serializeBody(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("http://czt.sourceforge.net/tcoz", "GuardProExpr");
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
        return (net.sourceforge.czt.tcoz.jaxb.gen.GuardProExprElement.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000"
+"\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv."
+"grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000"
+"\fcontentModelt\u0000 Lcom/sun/msv/grammar/Expression;xr\u0000\u001ecom.sun."
+"msv.grammar.Expression\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilon"
+"Reducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0003xp1\u00b8nwp"
+"p\u0000sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun."
+"msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~"
+"\u0000\u00041\u00b8nlppsq\u0000~\u0000\u0007/<9\u0094ppsq\u0000~\u0000\u0007\u0006~\u00f6\u00a9ppsr\u0000\u001dcom.sun.msv.grammar.Choi"
+"ceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\b\u00032\u00cdoppsq\u0000~\u0000\u0000\u00032\u00cddsr\u0000\u0011java.lang.Boolean\u00cd"
+" r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000p\u0000sq\u0000~\u0000\u0007\u00032\u00cdYppsq\u0000~\u0000\u0000\u00012\u00be2pp\u0000sq\u0000~\u0000\f\u00012\u00be\'pp"
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
+"dummy-elementssq\u0000~\u0000\f\u0002\u0000\u000f\"ppsq\u0000~\u0000\u0017\u0002\u0000\u000f\u0017q\u0000~\u0000\u0010psr\u0000\u001bcom.sun.msv.gr"
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
+"\u0000\u0003L)5pp\u0000sq\u0000~\u0000\u0007\u0003L)*ppsq\u0000~\u0000\u0000\u00012\u00be2pp\u0000sq\u0000~\u0000\f\u00012\u00be\'ppsq\u0000~\u0000\u0014\u00012\u00be\u001cq\u0000~\u0000\u0010"
+"psq\u0000~\u0000\u0017\u00012\u00be\u0019q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000&net.sourceforge.czt"
+".z.jaxb.gen.SchTextq\u0000~\u0000%sq\u0000~\u0000\f\u0002\u0019j\u00f3ppsq\u0000~\u0000\u0017\u0002\u0019j\u00e8q\u0000~\u0000\u0010pq\u0000~\u0000+sq\u0000"
+"~\u0000!q\u0000~\u0000<q\u0000~\u0000=q\u0000~\u0000 sq\u0000~\u0000!t\u0000\u0005Guardt\u0000\u001fhttp://czt.sourceforge.ne"
+"t/tcozsq\u0000~\u0000\f(\u00bdB\u00e6ppsq\u0000~\u0000\f\'\u008a\u0084\u00b2ppsq\u0000~\u0000\f&W\u00c6~ppsq\u0000~\u0000\f%%\bJppsq\u0000~\u0000\f"
+"#\u00f2J\u0016ppsq\u0000~\u0000\f\"\u00bf\u008b\u00e2ppsq\u0000~\u0000\f!\u008c\u00cd\u00aeppsq\u0000~\u0000\f Z\u000fzppsq\u0000~\u0000\f\u001f\'QFppsq\u0000~\u0000\f"
+"\u001d\u00f4\u0093\u0012ppsq\u0000~\u0000\f\u001c\u00c1\u00d4\u00deppsq\u0000~\u0000\f\u001b\u008f\u0016\u00aappsq\u0000~\u0000\f\u001a\\Xvppsq\u0000~\u0000\f\u0019)\u009aBppsq\u0000~\u0000\f"
+"\u0017\u00f6\u00dc\u000eppsq\u0000~\u0000\f\u0016\u00c4\u001d\u00dappsq\u0000~\u0000\f\u0015\u0091_\u00a6ppsq\u0000~\u0000\f\u0014^\u00a1rppsq\u0000~\u0000\f\u0013+\u00e3>ppsq\u0000~\u0000\f"
+"\u0011\u00f9%\nppsq\u0000~\u0000\f\u0010\u00c6f\u00d6ppsq\u0000~\u0000\f\u000f\u0093\u00a8\u00a2ppsq\u0000~\u0000\f\u000e`\u00eanppsq\u0000~\u0000\f\r.,:ppsq\u0000~\u0000\f"
+"\u000b\u00fbn\u0006ppsq\u0000~\u0000\f\n\u00c8\u00af\u00d2ppsq\u0000~\u0000\f\t\u0095\u00f1\u009eppsq\u0000~\u0000\f\bc3jppsq\u0000~\u0000\f\u00070u6ppsq\u0000~\u0000\f"
+"\u0005\u00fd\u00b7\u0002ppsq\u0000~\u0000\f\u0004\u00ca\u00f8\u00ceppsq\u0000~\u0000\f\u0003\u0098:\u009appsq\u0000~\u0000\f\u0002e|fppsq\u0000~\u0000\u0000\u00012\u00be2pp\u0000sq\u0000~\u0000"
+"\f\u00012\u00be\'ppsq\u0000~\u0000\u0014\u00012\u00be\u001cq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00012\u00be\u0019q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!"
+"t\u00001net.sourceforge.czt.tcoz.jaxb.gen.InChoiceProExprq\u0000~\u0000%sq\u0000"
+"~\u0000\u0000\u00012\u00be2pp\u0000sq\u0000~\u0000\f\u00012\u00be\'ppsq\u0000~\u0000\u0014\u00012\u00be\u001cq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00012\u00be\u0019q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq"
+"\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00005net.sourceforge.czt.tcoz.jaxb.gen.DistInCh"
+"oiceProExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u00012\u00be2pp\u0000sq\u0000~\u0000\f\u00012\u00be\'ppsq\u0000~\u0000\u0014\u00012\u00be\u001cq\u0000~\u0000\u0010psq\u0000"
+"~\u0000\u0017\u00012\u00be\u0019q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00003net.sourceforge.czt.tco"
+"z.jaxb.gen.InterleaveProExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u00012\u00be2pp\u0000sq\u0000~\u0000\f\u00012\u00be\'ppsq"
+"\u0000~\u0000\u0014\u00012\u00be\u001cq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00012\u00be\u0019q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00000net.so"
+"urceforge.czt.tcoz.jaxb.gen.DivergeProExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u00012\u00be2pp\u0000"
+"sq\u0000~\u0000\f\u00012\u00be\'ppsq\u0000~\u0000\u0014\u00012\u00be\u001cq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00012\u00be\u0019q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 s"
+"q\u0000~\u0000!t\u00006net.sourceforge.czt.oz.jaxb.gen.OpPromotionExprEleme"
+"ntq\u0000~\u0000%sq\u0000~\u0000\u0000\u00012\u00be2pp\u0000sq\u0000~\u0000\f\u00012\u00be\'ppsq\u0000~\u0000\u0014\u00012\u00be\u001cq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00012\u00be\u0019q\u0000"
+"~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000.net.sourceforge.czt.oz.jaxb.gen."
+"DistConjOpExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u00012\u00be2pp\u0000sq\u0000~\u0000\f\u00012\u00be\'ppsq\u0000~\u0000\u0014\u00012\u00be\u001cq\u0000~\u0000\u0010p"
+"sq\u0000~\u0000\u0017\u00012\u00be\u0019q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00002net.sourceforge.czt."
+"tcoz.jaxb.gen.InterruptProExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u00012\u00be2pp\u0000sq\u0000~\u0000\f\u00012\u00be\'pp"
+"sq\u0000~\u0000\u0014\u00012\u00be\u001cq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00012\u00be\u0019q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00006net."
+"sourceforge.czt.tcoz.jaxb.gen.SynPllProExprElementq\u0000~\u0000%sq\u0000~\u0000"
+"\u0000\u00012\u00be2pp\u0000sq\u0000~\u0000\f\u00012\u00be\'ppsq\u0000~\u0000\u0014\u00012\u00be\u001cq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00012\u00be\u0019q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~"
+"\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00001net.sourceforge.czt.oz.jaxb.gen.DistOpExprEl"
+"ementq\u0000~\u0000%sq\u0000~\u0000\u0000\u00012\u00be2pp\u0000sq\u0000~\u0000\f\u00012\u00be\'ppsq\u0000~\u0000\u0014\u00012\u00be\u001cq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00012\u00be"
+"\u0019q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00000net.sourceforge.czt.oz.jaxb.g"
+"en.DistChoiceOpExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u00012\u00be2pp\u0000sq\u0000~\u0000\f\u00012\u00be\'ppsq\u0000~\u0000\u0014\u00012\u00be\u001cq"
+"\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00012\u00be\u0019q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000-net.sourceforge"
+".czt.tcoz.jaxb.gen.StopProExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u00012\u00be2pp\u0000sq\u0000~\u0000\f\u00012\u00be\'pp"
+"sq\u0000~\u0000\u0014\u00012\u00be\u001cq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00012\u00be\u0019q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000-net."
+"sourceforge.czt.tcoz.jaxb.gen.SkipProExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u00012\u00be2pp\u0000s"
+"q\u0000~\u0000\f\u00012\u00be\'ppsq\u0000~\u0000\u0014\u00012\u00be\u001cq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00012\u00be\u0019q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq"
+"\u0000~\u0000!t\u0000*net.sourceforge.czt.oz.jaxb.gen.ConjOpExprq\u0000~\u0000%sq\u0000~\u0000\u0000"
+"\u00012\u00be2pp\u0000sq\u0000~\u0000\f\u00012\u00be\'ppsq\u0000~\u0000\u0014\u00012\u00be\u001cq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00012\u00be\u0019q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000"
+"\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00008net.sourceforge.czt.tcoz.jaxb.gen.TopologyPro"
+"ExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u00012\u00be2pp\u0000sq\u0000~\u0000\f\u00012\u00be\'ppsq\u0000~\u0000\u0014\u00012\u00be\u001cq\u0000~\u0000\u0010psq\u0000"
+"~\u0000\u0017\u00012\u00be\u0019q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000-net.sourceforge.czt.oz."
+"jaxb.gen.DistSeqOpExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u00012\u00be2pp\u0000sq\u0000~\u0000\f\u00012\u00be\'ppsq\u0000~\u0000\u0014\u00012"
+"\u00be\u001cq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00012\u00be\u0019q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000.net.sourcefo"
+"rge.czt.oz.jaxb.gen.ExChoiceOpExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u00012\u00be2pp\u0000sq\u0000~\u0000\f\u00012"
+"\u00be\'ppsq\u0000~\u0000\u0014\u00012\u00be\u001cq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00012\u00be\u0019q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00005"
+"net.sourceforge.czt.oz.jaxb.gen.OperationExpr2Elementq\u0000~\u0000%sq"
+"\u0000~\u0000\u0000\u00012\u00be2pp\u0000sq\u0000~\u0000\f\u00012\u00be\'ppsq\u0000~\u0000\u0014\u00012\u00be\u001cq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00012\u00be\u0019q\u0000~\u0000\u0010pq\u0000~\u0000\u001a"
+"q\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00002net.sourceforge.czt.oz.jaxb.gen.AssoParal"
+"lelOpExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u00012\u00be2pp\u0000sq\u0000~\u0000\f\u00012\u00be\'ppsq\u0000~\u0000\u0014\u00012\u00be\u001cq\u0000~\u0000\u0010psq\u0000~\u0000"
+"\u0017\u00012\u00be\u0019q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00001net.sourceforge.czt.oz.ja"
+"xb.gen.ScopeEnrichOpExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u00012\u00be2pp\u0000sq\u0000~\u0000\f\u00012\u00be\'ppsq\u0000~\u0000\u0014"
+"\u00012\u00be\u001cq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00012\u00be\u0019q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000.net.source"
+"forge.czt.oz.jaxb.gen.ParallelOpExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u00012\u00be2pp\u0000sq\u0000~\u0000\f"
+"\u00012\u00be\'ppsq\u0000~\u0000\u0014\u00012\u00be\u001cq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00012\u00be\u0019q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t"
+"\u00005net.sourceforge.czt.tcoz.jaxb.gen.GuardProExprElementq\u0000~\u0000%"
+"sq\u0000~\u0000\u0000\u00012\u00be2pp\u0000sq\u0000~\u0000\f\u00012\u00be\'ppsq\u0000~\u0000\u0014\u00012\u00be\u001cq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00012\u00be\u0019q\u0000~\u0000\u0010pq\u0000~"
+"\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00001net.sourceforge.czt.oz.jaxb.gen.HideOpE"
+"xprElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u00012\u00be2pp\u0000sq\u0000~\u0000\f\u00012\u00be\'ppsq\u0000~\u0000\u0014\u00012\u00be\u001cq\u0000~\u0000\u0010psq\u0000~"
+"\u0000\u0017\u00012\u00be\u0019q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00004net.sourceforge.czt.tcoz"
+".jaxb.gen.WaitProExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u00012\u00be2pp\u0000sq\u0000~\u0000\f\u00012\u00be\'ppsq"
+"\u0000~\u0000\u0014\u00012\u00be\u001cq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00012\u00be\u0019q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00009net.so"
+"urceforge.czt.tcoz.jaxb.gen.WaitUntilProExprElementq\u0000~\u0000%sq\u0000~"
+"\u0000\u0000\u00012\u00be2pp\u0000sq\u0000~\u0000\f\u00012\u00be\'ppsq\u0000~\u0000\u0014\u00012\u00be\u001cq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00012\u00be\u0019q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000"
+"~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00002net.sourceforge.czt.oz.jaxb.gen.BasicOpExpr"
+"Elementq\u0000~\u0000%sq\u0000~\u0000\u0000\u00012\u00be2pp\u0000sq\u0000~\u0000\f\u00012\u00be\'ppsq\u0000~\u0000\u0014\u00012\u00be\u001cq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001"
+"2\u00be\u0019q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00008net.sourceforge.czt.tcoz.ja"
+"xb.gen.DeadlineProExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u00012\u00be2pp\u0000sq\u0000~\u0000\f\u00012\u00be\'pps"
+"q\u0000~\u0000\u0014\u00012\u00be\u001cq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00012\u00be\u0019q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00005net.s"
+"ourceforge.czt.tcoz.jaxb.gen.TimeoutStartProExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001"
+"2\u00be2pp\u0000sq\u0000~\u0000\f\u00012\u00be\'ppsq\u0000~\u0000\u0014\u00012\u00be\u001cq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00012\u00be\u0019q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001e"
+"q\u0000~\u0000 sq\u0000~\u0000!t\u00002net.sourceforge.czt.tcoz.jaxb.gen.AtProExprEle"
+"mentq\u0000~\u0000%sq\u0000~\u0000\u0000\u00012\u00be2pp\u0000sq\u0000~\u0000\f\u00012\u00be\'ppsq\u0000~\u0000\u0014\u00012\u00be\u001cq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00012\u00be\u0019"
+"q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00003net.sourceforge.czt.tcoz.jaxb."
+"gen.TimeoutEndProExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u00012\u00be2pp\u0000sq\u0000~\u0000\f\u00012\u00be\'ppsq\u0000~\u0000\u0014\u00012\u00be"
+"\u001cq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00012\u00be\u0019q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00007net.sourcefor"
+"ge.czt.tcoz.jaxb.gen.DistInterleaveProExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u00012\u00be2pp\u0000"
+"sq\u0000~\u0000\f\u00012\u00be\'ppsq\u0000~\u0000\u0014\u00012\u00be\u001cq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00012\u00be\u0019q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 s"
+"q\u0000~\u0000!t\u00003net.sourceforge.czt.tcoz.jaxb.gen.RecProExprElementq"
+"\u0000~\u0000%sq\u0000~\u0000\u0000\u00012\u00be2pp\u0000sq\u0000~\u0000\f\u00012\u00be\'ppsq\u0000~\u0000\u0014\u00012\u00be\u001cq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00012\u00be\u0019q\u0000~\u0000\u0010"
+"pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00003net.sourceforge.czt.oz.jaxb.gen.Ren"
+"ameOpExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u00012\u00be2pp\u0000sq\u0000~\u0000\f\u00012\u00be\'ppsq\u0000~\u0000\u0014\u00012\u00be\u001cq\u0000~\u0000"
+"\u0010psq\u0000~\u0000\u0017\u00012\u00be\u0019q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000)net.sourceforge.cz"
+"t.oz.jaxb.gen.SeqOpExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u00012\u00be2pp\u0000sq\u0000~\u0000\f\u00012\u00be\'ppsq\u0000~\u0000\u0014\u0001"
+"2\u00be\u001cq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00012\u00be\u0019q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000+net.sourcef"
+"orge.czt.oz.jaxb.gen.ParenOpExprq\u0000~\u0000%sq\u0000~\u0000\f\u0002|4\u00d3ppsq\u0000~\u0000\u0017\u0002|4\u00c8q"
+"\u0000~\u0000\u0010pq\u0000~\u0000+sq\u0000~\u0000!q\u0000~\u0000<q\u0000~\u0000=q\u0000~\u0000 sq\u0000~\u0000!t\u0000\fGuardProExprq\u0000~\u0000Nsr\u0000"
+"\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/"
+"Lcom/sun/msv/grammar/ExpressionPool$ClosedHash;xpsr\u0000-com.sun"
+".msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0002\u0000\u0004I\u0000\u0005countI\u0000\t"
+"thresholdL\u0000\u0006parentq\u0000~\u0001B[\u0000\u0005tablet\u0000![Lcom/sun/msv/grammar/Expr"
+"ession;xp\u0000\u0000\u0000r\u0000\u0000\u0000rpur\u0000![Lcom.sun.msv.grammar.Expression;\u00d68D\u00c3]"
+"\u00ad\u00a7\n\u0002\u0000\u0000xp\u0000\u0000\u0001\u007fppppppppppppppppppppppppppppq\u0000~\u0000\npppppppq\u0000~\u0000\u0011ppp"
+"pq\u0000~\u0000Pppppppppq\u0000~\u0000Rpppppppq\u0000~\u0000\rq\u0000~\u0000Tppppppppq\u0000~\u0000Vppppppppq\u0000~"
+"\u0000Xppppppppq\u0000~\u0000Zppppppppq\u0000~\u0000\\ppppppppq\u0000~\u0000Bq\u0000~\u0000^pppppppq\u0000~\u0000`pp"
+"ppppppq\u0000~\u0000bppppppppq\u0000~\u0000dppppppppq\u0000~\u0000fppppppppq\u0000~\u0000hppppppppq\u0000"
+"~\u0000jppppq\u0000~\u0000\u00ccq\u0000~\u0000\u00c6q\u0000~\u0000\u00c0q\u0000~\u0000\u00baq\u0000~\u0000lq\u0000~\u0000\u00b4q\u0000~\u0000\u00aeq\u0000~\u0000\u00a8q\u0000~\u0000\u00a2q\u0000~\u0000\u009cq\u0000~"
+"\u0000\u0096q\u0000~\u0000\u00cbq\u0000~\u0000\u00c5q\u0000~\u0000\u00bfq\u0000~\u0000\u00b9q\u0000~\u0000\u00b3q\u0000~\u0000\u00adq\u0000~\u0000\u00a7q\u0000~\u0000\u00a1q\u0000~\u0000\u009bq\u0000~\u0000\u0095q\u0000~\u0000\u008fq\u0000~"
+"\u0000\u0089q\u0000~\u0000\u0083q\u0000~\u0000}q\u0000~\u0000\u000bq\u0000~\u0000wq\u0000~\u0000qq\u0000~\u0000Dq\u0000~\u0000\u0013q\u0000~\u0000\u0090q\u0000~\u0000\u008aq\u0000~\u0000\u0084q\u0000~\u0000~q\u0000~"
+"\u0000xq\u0000~\u0000rq\u0000~\u0000Eq\u0000~\u0000\u0016q\u0000~\u0000nq\u0000~\u0000\u00d2q\u0000~\u0000\u00d1q\u0000~\u0000\u00d8q\u0000~\u0000\u00d7q\u0000~\u0000\u00deq\u0000~\u0000\u00ddq\u0000~\u0000\u00e4q\u0000~"
+"\u0000\u00e3q\u0000~\u0000\u00eaq\u0000~\u0000\u00e9q\u0000~\u0000\u00f0q\u0000~\u0000\u00efq\u0000~\u0000\u00f6q\u0000~\u0000\u00f5q\u0000~\u0000\u00fcq\u0000~\u0000\u00fbq\u0000~\u0001\u0002q\u0000~\u0001\u0001q\u0000~\u0001\bq\u0000~"
+"\u0001\u0007q\u0000~\u0001\u000eq\u0000~\u0001\rq\u0000~\u0001\u0014q\u0000~\u0001\u0013q\u0000~\u0001\u001aq\u0000~\u0001\u0019q\u0000~\u0001 q\u0000~\u0000&q\u0000~\u0001\u001fq\u0000~\u0001&q\u0000~\u0001%q\u0000~"
+"\u0001,q\u0000~\u0001+q\u0000~\u00012q\u0000~\u00011q\u0000~\u0000Qq\u0000~\u00018q\u0000~\u00017q\u0000~\u0000Opppppq\u0000~\u0000Sppppppppq\u0000~\u0000U"
+"ppppppppq\u0000~\u0000Wppppppppq\u0000~\u0000Yq\u0000~\u0001<pppppppq\u0000~\u0000[ppppppppq\u0000~\u0000]pppp"
+"pq\u0000~\u0000Ippq\u0000~\u0000_pppppq\u0000~\u0000\tppq\u0000~\u0000appppppppq\u0000~\u0000cppppppppq\u0000~\u0000epppp"
+"ppppq\u0000~\u0000gppppppppq\u0000~\u0000ippppppppq\u0000~\u0000kppppppppq\u0000~\u0000mppppppppq\u0000~\u0000"
+"opppppppppp"));
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
            return net.sourceforge.czt.tcoz.jaxb.gen.impl.GuardProExprElementImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  0 :
                        if (("GuardProExpr" == ___local)&&("http://czt.sourceforge.net/tcoz" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 1;
                            return ;
                        }
                        break;
                    case  3 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  1 :
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.tcoz.jaxb.gen.impl.GuardProExprImpl)net.sourceforge.czt.tcoz.jaxb.gen.impl.GuardProExprElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Guard" == ___local)&&("http://czt.sourceforge.net/tcoz" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.tcoz.jaxb.gen.impl.GuardProExprImpl)net.sourceforge.czt.tcoz.jaxb.gen.impl.GuardProExprElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        spawnHandlerFromEnterElement((((net.sourceforge.czt.tcoz.jaxb.gen.impl.GuardProExprImpl)net.sourceforge.czt.tcoz.jaxb.gen.impl.GuardProExprElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
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
                        if (("GuardProExpr" == ___local)&&("http://czt.sourceforge.net/tcoz" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  1 :
                        spawnHandlerFromLeaveElement((((net.sourceforge.czt.tcoz.jaxb.gen.impl.GuardProExprImpl)net.sourceforge.czt.tcoz.jaxb.gen.impl.GuardProExprElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                        spawnHandlerFromEnterAttribute((((net.sourceforge.czt.tcoz.jaxb.gen.impl.GuardProExprImpl)net.sourceforge.czt.tcoz.jaxb.gen.impl.GuardProExprElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                        spawnHandlerFromLeaveAttribute((((net.sourceforge.czt.tcoz.jaxb.gen.impl.GuardProExprImpl)net.sourceforge.czt.tcoz.jaxb.gen.impl.GuardProExprElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                            spawnHandlerFromText((((net.sourceforge.czt.tcoz.jaxb.gen.impl.GuardProExprImpl)net.sourceforge.czt.tcoz.jaxb.gen.impl.GuardProExprElementImpl.this).new Unmarshaller(context)), 2, value);
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
