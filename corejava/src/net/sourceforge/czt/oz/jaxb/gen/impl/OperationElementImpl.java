//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2004.01.05 at 10:33:20 NZDT 
//


package net.sourceforge.czt.oz.jaxb.gen.impl;

public class OperationElementImpl
    extends net.sourceforge.czt.oz.jaxb.gen.impl.OperationImpl
    implements net.sourceforge.czt.oz.jaxb.gen.OperationElement, com.sun.xml.bind.RIElement, com.sun.xml.bind.JAXBObject, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallableObject, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializable, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.ValidatableObject
{

    public final static java.lang.Class version = (net.sourceforge.czt.oz.jaxb.gen.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (net.sourceforge.czt.oz.jaxb.gen.OperationElement.class);
    }

    public java.lang.String ____jaxb_ri____getNamespaceURI() {
        return "http://czt.sourceforge.net/object-z";
    }

    public java.lang.String ____jaxb_ri____getLocalName() {
        return "Operation";
    }

    public net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingEventHandler createUnmarshaller(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingContext context) {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.OperationElementImpl.Unmarshaller(context);
    }

    public void serializeBody(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("http://czt.sourceforge.net/object-z", "Operation");
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
        return (net.sourceforge.czt.oz.jaxb.gen.OperationElement.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000"
+"\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv."
+"grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000"
+"\fcontentModelt\u0000 Lcom/sun/msv/grammar/Expression;xr\u0000\u001ecom.sun."
+"msv.grammar.Expression\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilon"
+"Reducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0003xp-\u0010\u00c8~p"
+"p\u0000sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun."
+"msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~"
+"\u0000\u0004-\u0010\u00c8sppsq\u0000~\u0000\u0007,\u00af\u009cDppsq\u0000~\u0000\u0007\u0005\u001fs`ppsr\u0000\u001dcom.sun.msv.grammar.Choi"
+"ceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\b\u0002VU\u00d8ppsq\u0000~\u0000\u0000\u0002VU\u00cdsr\u0000\u0011java.lang.Boolean\u00cd"
+" r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000p\u0000sq\u0000~\u0000\u0007\u0002VU\u00c2ppsq\u0000~\u0000\u0000\u0001F\u00b6\u00fdpp\u0000sq\u0000~\u0000\f\u0001F\u00b6\u00f2pp"
+"sr\u0000 com.sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.m"
+"sv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0003xq\u0000~\u0000\u0004\u0001F\u00b6\u00e7q\u0000~\u0000\u0010psr\u0000"
+" com.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0003L\u0000\tna"
+"meClassq\u0000~\u0000\u0001xq\u0000~\u0000\u0004\u0001F\u00b6\u00e4q\u0000~\u0000\u0010psr\u00002com.sun.msv.grammar.Expressi"
+"on$AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\bsq\u0000~\u0000\u000f\u0001q\u0000~\u0000\u001asr\u0000 c"
+"om.sun.msv.grammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.gr"
+"ammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expressi"
+"on$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\tq\u0000~\u0000\u001bq\u0000~\u0000 sr\u0000#com.s"
+"un.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljav"
+"a/lang/String;L\u0000\fnamespaceURIq\u0000~\u0000\"xq\u0000~\u0000\u001dt\u0000-net.sourceforge.c"
+"zt.z.jaxb.gen.TermA.AnnsTypet\u0000+http://java.sun.com/jaxb/xjc/"
+"dummy-elementssq\u0000~\u0000\f\u0001\u000f\u009e\u00c0ppsq\u0000~\u0000\u0017\u0001\u000f\u009e\u00b5q\u0000~\u0000\u0010psr\u0000\u001bcom.sun.msv.gr"
+"ammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Dataty"
+"pe;L\u0000\u0006exceptq\u0000~\u0000\u0003L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~"
+"\u0000\u0004\u00005\u00e6\u00f3ppsr\u0000\"com.sun.msv.datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000"
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
+"\u0000\u0002\u00c9\u001d\u0083pp\u0000sq\u0000~\u0000\u0007\u0002\u00c9\u001dxppsq\u0000~\u0000\u0000\u0001F\u00b6\u00fdpp\u0000sq\u0000~\u0000\f\u0001F\u00b6\u00f2ppsq\u0000~\u0000\u0014\u0001F\u00b6\u00e7q\u0000~\u0000\u0010"
+"psq\u0000~\u0000\u0017\u0001F\u00b6\u00e4q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000\'net.sourceforge.czt"
+".z.jaxb.gen.DeclNameq\u0000~\u0000%sq\u0000~\u0000\f\u0001\u0082fvppsq\u0000~\u0000\u0017\u0001\u0082fkq\u0000~\u0000\u0010pq\u0000~\u0000+sq"
+"\u0000~\u0000!q\u0000~\u0000<q\u0000~\u0000=q\u0000~\u0000 sq\u0000~\u0000!t\u0000\u0004Namet\u0000#http://czt.sourceforge.ne"
+"t/object-zsq\u0000~\u0000\f\'\u0090(\u00dfppsq\u0000~\u0000\f&Iq\u00e0ppsq\u0000~\u0000\f%\u0002\u00ba\u00e1ppsq\u0000~\u0000\f#\u00bc\u0003\u00e2ppsq"
+"\u0000~\u0000\f\"uL\u00e3ppsq\u0000~\u0000\f!.\u0095\u00e4ppsq\u0000~\u0000\f\u001f\u00e7\u00de\u00e5ppsq\u0000~\u0000\f\u001e\u00a1\'\u00e6ppsq\u0000~\u0000\f\u001dZp\u00e7ppsq"
+"\u0000~\u0000\f\u001c\u0013\u00b9\u00e8ppsq\u0000~\u0000\f\u001a\u00cd\u0002\u00e9ppsq\u0000~\u0000\f\u0019\u0086K\u00eappsq\u0000~\u0000\f\u0018?\u0094\u00ebppsq\u0000~\u0000\f\u0016\u00f8\u00dd\u00ecppsq"
+"\u0000~\u0000\f\u0015\u00b2&\u00edppsq\u0000~\u0000\f\u0014ko\u00eeppsq\u0000~\u0000\f\u0013$\u00b8\u00efppsq\u0000~\u0000\f\u0011\u00de\u0001\u00f0ppsq\u0000~\u0000\f\u0010\u0097J\u00f1ppsq"
+"\u0000~\u0000\f\u000fP\u0093\u00f2ppsq\u0000~\u0000\f\u000e\t\u00dc\u00f3ppsq\u0000~\u0000\f\f\u00c3%\u00f4ppsq\u0000~\u0000\f\u000b|n\u00f5ppsq\u0000~\u0000\f\n5\u00b7\u00f6ppsq"
+"\u0000~\u0000\f\b\u00ef\u0000\u00f7ppsq\u0000~\u0000\f\u0007\u00a8I\u00f8ppsq\u0000~\u0000\f\u0006a\u0092\u00f9ppsq\u0000~\u0000\f\u0005\u001a\u00db\u00fappsq\u0000~\u0000\f\u0003\u00d4$\u00fbppsq"
+"\u0000~\u0000\f\u0002\u008dm\u00fcppsq\u0000~\u0000\u0000\u0001F\u00b6\u00fdpp\u0000sq\u0000~\u0000\f\u0001F\u00b6\u00f2ppsq\u0000~\u0000\u0014\u0001F\u00b6\u00e7q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001F\u00b6"
+"\u00e4q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00000net.sourceforge.czt.tcoz.jaxb"
+".gen.DivergeProExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001F\u00b6\u00fdpp\u0000sq\u0000~\u0000\f\u0001F\u00b6\u00f2ppsq\u0000~\u0000\u0014\u0001F\u00b6\u00e7q"
+"\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001F\u00b6\u00e4q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00001net.sourceforge"
+".czt.oz.jaxb.gen.ScopeEnrichOpExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001F\u00b6\u00fdpp\u0000sq\u0000~\u0000\f\u0001F"
+"\u00b6\u00f2ppsq\u0000~\u0000\u0014\u0001F\u00b6\u00e7q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001F\u00b6\u00e4q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000-"
+"net.sourceforge.czt.tcoz.jaxb.gen.StopProExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001F\u00b6\u00fd"
+"pp\u0000sq\u0000~\u0000\f\u0001F\u00b6\u00f2ppsq\u0000~\u0000\u0014\u0001F\u00b6\u00e7q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001F\u00b6\u00e4q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~"
+"\u0000 sq\u0000~\u0000!t\u00002net.sourceforge.czt.oz.jaxb.gen.BasicOpExprElemen"
+"tq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001F\u00b6\u00fdpp\u0000sq\u0000~\u0000\f\u0001F\u00b6\u00f2ppsq\u0000~\u0000\u0014\u0001F\u00b6\u00e7q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001F\u00b6\u00e4q\u0000~"
+"\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00002net.sourceforge.czt.tcoz.jaxb.gen"
+".AtProExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001F\u00b6\u00fdpp\u0000sq\u0000~\u0000\f\u0001F\u00b6\u00f2ppsq\u0000~\u0000\u0014\u0001F\u00b6\u00e7q\u0000~"
+"\u0000\u0010psq\u0000~\u0000\u0017\u0001F\u00b6\u00e4q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00003net.sourceforge.c"
+"zt.tcoz.jaxb.gen.InterleaveProExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001F\u00b6\u00fdpp\u0000sq\u0000~\u0000\f\u0001F"
+"\u00b6\u00f2ppsq\u0000~\u0000\u0014\u0001F\u00b6\u00e7q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001F\u00b6\u00e4q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00003"
+"net.sourceforge.czt.oz.jaxb.gen.RenameOpExprElementq\u0000~\u0000%sq\u0000~"
+"\u0000\u0000\u0001F\u00b6\u00fdpp\u0000sq\u0000~\u0000\f\u0001F\u00b6\u00f2ppsq\u0000~\u0000\u0014\u0001F\u00b6\u00e7q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001F\u00b6\u00e4q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000"
+"~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000-net.sourceforge.czt.tcoz.jaxb.gen.SkipProEx"
+"prq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001F\u00b6\u00fdpp\u0000sq\u0000~\u0000\f\u0001F\u00b6\u00f2ppsq\u0000~\u0000\u0014\u0001F\u00b6\u00e7q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001F\u00b6\u00e4q\u0000"
+"~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00006net.sourceforge.czt.oz.jaxb.gen."
+"OpPromotionExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001F\u00b6\u00fdpp\u0000sq\u0000~\u0000\f\u0001F\u00b6\u00f2ppsq\u0000~\u0000\u0014\u0001F"
+"\u00b6\u00e7q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001F\u00b6\u00e4q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00002net.sourcefo"
+"rge.czt.tcoz.jaxb.gen.InterruptProExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001F\u00b6\u00fdpp\u0000sq\u0000~"
+"\u0000\f\u0001F\u00b6\u00f2ppsq\u0000~\u0000\u0014\u0001F\u00b6\u00e7q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001F\u00b6\u00e4q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000"
+"!t\u00003net.sourceforge.czt.tcoz.jaxb.gen.TimeoutEndProExprq\u0000~\u0000%"
+"sq\u0000~\u0000\u0000\u0001F\u00b6\u00fdpp\u0000sq\u0000~\u0000\f\u0001F\u00b6\u00f2ppsq\u0000~\u0000\u0014\u0001F\u00b6\u00e7q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001F\u00b6\u00e4q\u0000~\u0000\u0010pq\u0000~"
+"\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00005net.sourceforge.czt.tcoz.jaxb.gen.Guard"
+"ProExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001F\u00b6\u00fdpp\u0000sq\u0000~\u0000\f\u0001F\u00b6\u00f2ppsq\u0000~\u0000\u0014\u0001F\u00b6\u00e7q\u0000~\u0000\u0010p"
+"sq\u0000~\u0000\u0017\u0001F\u00b6\u00e4q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00000net.sourceforge.czt."
+"oz.jaxb.gen.DistChoiceOpExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001F\u00b6\u00fdpp\u0000sq\u0000~\u0000\f\u0001F\u00b6\u00f2ppsq"
+"\u0000~\u0000\u0014\u0001F\u00b6\u00e7q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001F\u00b6\u00e4q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00002net.so"
+"urceforge.czt.oz.jaxb.gen.AssoParallelOpExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001F\u00b6\u00fdp"
+"p\u0000sq\u0000~\u0000\f\u0001F\u00b6\u00f2ppsq\u0000~\u0000\u0014\u0001F\u00b6\u00e7q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001F\u00b6\u00e4q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000"
+" sq\u0000~\u0000!t\u00004net.sourceforge.czt.oz.jaxb.gen.OperationExprEleme"
+"ntq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001F\u00b6\u00fdpp\u0000sq\u0000~\u0000\f\u0001F\u00b6\u00f2ppsq\u0000~\u0000\u0014\u0001F\u00b6\u00e7q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001F\u00b6\u00e4q\u0000"
+"~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00006net.sourceforge.czt.tcoz.jaxb.ge"
+"n.SynPllProExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001F\u00b6\u00fdpp\u0000sq\u0000~\u0000\f\u0001F\u00b6\u00f2ppsq\u0000~\u0000\u0014\u0001F"
+"\u00b6\u00e7q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001F\u00b6\u00e4q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000.net.sourcefo"
+"rge.czt.oz.jaxb.gen.DistConjOpExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001F\u00b6\u00fdpp\u0000sq\u0000~\u0000\f\u0001F"
+"\u00b6\u00f2ppsq\u0000~\u0000\u0014\u0001F\u00b6\u00e7q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001F\u00b6\u00e4q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00005"
+"net.sourceforge.czt.tcoz.jaxb.gen.TimeoutStartProExprq\u0000~\u0000%sq"
+"\u0000~\u0000\u0000\u0001F\u00b6\u00fdpp\u0000sq\u0000~\u0000\f\u0001F\u00b6\u00f2ppsq\u0000~\u0000\u0014\u0001F\u00b6\u00e7q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001F\u00b6\u00e4q\u0000~\u0000\u0010pq\u0000~\u0000\u001a"
+"q\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00001net.sourceforge.czt.oz.jaxb.gen.HideOpExp"
+"rElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001F\u00b6\u00fdpp\u0000sq\u0000~\u0000\f\u0001F\u00b6\u00f2ppsq\u0000~\u0000\u0014\u0001F\u00b6\u00e7q\u0000~\u0000\u0010psq\u0000~\u0000\u0017"
+"\u0001F\u00b6\u00e4q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000.net.sourceforge.czt.oz.jax"
+"b.gen.ParallelOpExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001F\u00b6\u00fdpp\u0000sq\u0000~\u0000\f\u0001F\u00b6\u00f2ppsq\u0000~\u0000\u0014\u0001F\u00b6\u00e7"
+"q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001F\u00b6\u00e4q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00003net.sourceforg"
+"e.czt.oz.jaxb.gen.OperationBoxElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001F\u00b6\u00fdpp\u0000sq\u0000~\u0000"
+"\f\u0001F\u00b6\u00f2ppsq\u0000~\u0000\u0014\u0001F\u00b6\u00e7q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001F\u00b6\u00e4q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!"
+"t\u00009net.sourceforge.czt.tcoz.jaxb.gen.WaitUntilProExprElement"
+"q\u0000~\u0000%sq\u0000~\u0000\u0000\u0001F\u00b6\u00fdpp\u0000sq\u0000~\u0000\f\u0001F\u00b6\u00f2ppsq\u0000~\u0000\u0014\u0001F\u00b6\u00e7q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001F\u00b6\u00e4q\u0000~\u0000"
+"\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00003net.sourceforge.czt.tcoz.jaxb.gen."
+"RecProExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001F\u00b6\u00fdpp\u0000sq\u0000~\u0000\f\u0001F\u00b6\u00f2ppsq\u0000~\u0000\u0014\u0001F\u00b6\u00e7q\u0000~"
+"\u0000\u0010psq\u0000~\u0000\u0017\u0001F\u00b6\u00e4q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00008net.sourceforge.c"
+"zt.tcoz.jaxb.gen.TopologyProExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001F\u00b6\u00fdpp\u0000sq\u0000"
+"~\u0000\f\u0001F\u00b6\u00f2ppsq\u0000~\u0000\u0014\u0001F\u00b6\u00e7q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001F\u00b6\u00e4q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~"
+"\u0000!t\u0000-net.sourceforge.czt.oz.jaxb.gen.DistSeqOpExprq\u0000~\u0000%sq\u0000~\u0000"
+"\u0000\u0001F\u00b6\u00fdpp\u0000sq\u0000~\u0000\f\u0001F\u00b6\u00f2ppsq\u0000~\u0000\u0014\u0001F\u00b6\u00e7q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001F\u00b6\u00e4q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~"
+"\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000)net.sourceforge.czt.oz.jaxb.gen.SeqOpExprq\u0000~"
+"\u0000%sq\u0000~\u0000\u0000\u0001F\u00b6\u00fdpp\u0000sq\u0000~\u0000\f\u0001F\u00b6\u00f2ppsq\u0000~\u0000\u0014\u0001F\u00b6\u00e7q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001F\u00b6\u00e4q\u0000~\u0000\u0010pq"
+"\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000.net.sourceforge.czt.oz.jaxb.gen.ExCho"
+"iceOpExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001F\u00b6\u00fdpp\u0000sq\u0000~\u0000\f\u0001F\u00b6\u00f2ppsq\u0000~\u0000\u0014\u0001F\u00b6\u00e7q\u0000~\u0000\u0010psq\u0000~\u0000"
+"\u0017\u0001F\u00b6\u00e4q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000*net.sourceforge.czt.oz.ja"
+"xb.gen.ConjOpExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001F\u00b6\u00fdpp\u0000sq\u0000~\u0000\f\u0001F\u00b6\u00f2ppsq\u0000~\u0000\u0014\u0001F\u00b6\u00e7q\u0000~"
+"\u0000\u0010psq\u0000~\u0000\u0017\u0001F\u00b6\u00e4q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00008net.sourceforge.c"
+"zt.tcoz.jaxb.gen.DeadlineProExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001F\u00b6\u00fdpp\u0000sq\u0000"
+"~\u0000\f\u0001F\u00b6\u00f2ppsq\u0000~\u0000\u0014\u0001F\u00b6\u00e7q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001F\u00b6\u00e4q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~"
+"\u0000!t\u0000+net.sourceforge.czt.oz.jaxb.gen.ParenOpExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001"
+"F\u00b6\u00fdpp\u0000sq\u0000~\u0000\f\u0001F\u00b6\u00f2ppsq\u0000~\u0000\u0014\u0001F\u00b6\u00e7q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001F\u00b6\u00e4q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001e"
+"q\u0000~\u0000 sq\u0000~\u0000!t\u00004net.sourceforge.czt.tcoz.jaxb.gen.WaitProExprE"
+"lementq\u0000~\u0000%sq\u0000~\u0000\f\u0000a,*ppsq\u0000~\u0000\u0017\u0000a,\u001fq\u0000~\u0000\u0010pq\u0000~\u0000+sq\u0000~\u0000!q\u0000~\u0000<q\u0000~\u0000="
+"q\u0000~\u0000 sq\u0000~\u0000!t\u0000\tOperationq\u0000~\u0000Nsr\u0000\"com.sun.msv.grammar.Expressi"
+"onPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/Expressi"
+"onPool$ClosedHash;xpsr\u0000-com.sun.msv.grammar.ExpressionPool$C"
+"losedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0002\u0000\u0004I\u0000\u0005countI\u0000\tthresholdL\u0000\u0006parentq\u0000~\u0001-[\u0000\u0005tab"
+"let\u0000![Lcom/sun/msv/grammar/Expression;xp\u0000\u0000\u0000i\u0000\u0000\u0000rpur\u0000![Lcom.s"
+"un.msv.grammar.Expression;\u00d68D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp\u0000\u0000\u0001\u007fq\u0000~\u0000\u00feq\u0000~\u0000Uq\u0000~\u0001\u0005q\u0000"
+"~\u0001\u0004q\u0000~\u0001\u000bq\u0000~\u0001\nq\u0000~\u0001\u0011q\u0000~\u0001\u0010q\u0000~\u0001\u0017q\u0000~\u0001\u0016q\u0000~\u0001\u001dq\u0000~\u0001\u001cq\u0000~\u0001#q\u0000~\u0001\"ppppppp"
+"pppppppq\u0000~\u0000Wq\u0000~\u0000cppppppppppppppppppppppppppq\u0000~\u0000\tpppq\u0000~\u0000Xq\u0000~\u0000"
+"dppppppppppppppppppppppppppppppq\u0000~\u0000Yq\u0000~\u0000eppppppppppppppppppp"
+"ppppq\u0000~\u0000\u000bppppppq\u0000~\u0000Zq\u0000~\u0000fpppppppppppppppppppppppppppppq\u0000~\u0000Oq"
+"\u0000~\u0000[q\u0000~\u0000gq\u0000~\u0001\'pppppppppppppppppq\u0000~\u0000\u0011ppppppppppq\u0000~\u0000Pq\u0000~\u0000\\q\u0000~\u0000"
+"hppppppppq\u0000~\u0000\rppppppq\u0000~\u0000&pppppppppppppq\u0000~\u0000Qq\u0000~\u0000]q\u0000~\u0000ippppppp"
+"ppppppppppppppppppppppq\u0000~\u0000Rq\u0000~\u0000^q\u0000~\u0000jppppppppppppppppppppppp"
+"q\u0000~\u0000\npppppq\u0000~\u0000Sq\u0000~\u0000_q\u0000~\u0000kq\u0000~\u0000Bppppppppppppppppppppppppppppq\u0000"
+"~\u0000Iq\u0000~\u0000`q\u0000~\u0000lq\u0000~\u0000Tppppppppq\u0000~\u0000\u00c9q\u0000~\u0000\u00c3q\u0000~\u0000\u00bdq\u0000~\u0000\u00b7q\u0000~\u0000\u00b1q\u0000~\u0000\u00abq\u0000~\u0000"
+"\u00a5q\u0000~\u0000\u009fq\u0000~\u0000\u0099q\u0000~\u0000\u0093q\u0000~\u0000\u008dq\u0000~\u0000\u00c8q\u0000~\u0000\u00c2q\u0000~\u0000\u00bcq\u0000~\u0000\u00b6q\u0000~\u0000\u00b0q\u0000~\u0000\u00aaq\u0000~\u0000\u00a4q\u0000~\u0000"
+"\u009eq\u0000~\u0000\u0098q\u0000~\u0000\u0092q\u0000~\u0000aq\u0000~\u0000\u008cq\u0000~\u0000\u0086q\u0000~\u0000\u0080q\u0000~\u0000zq\u0000~\u0000tq\u0000~\u0000nq\u0000~\u0000Dq\u0000~\u0000\u0013q\u0000~\u0000"
+"\u0087q\u0000~\u0000\u0081q\u0000~\u0000{q\u0000~\u0000uq\u0000~\u0000oq\u0000~\u0000Eq\u0000~\u0000\u0016q\u0000~\u0000\u00cfq\u0000~\u0000\u00ceq\u0000~\u0000\u00d5q\u0000~\u0000\u00d4q\u0000~\u0000\u00dbq\u0000~\u0000"
+"\u00daq\u0000~\u0000\u00e1q\u0000~\u0000\u00e0q\u0000~\u0000\u00e7q\u0000~\u0000\u00e6q\u0000~\u0000\u00edq\u0000~\u0000\u00ecq\u0000~\u0000\u00f3q\u0000~\u0000\u00f2q\u0000~\u0000\u00f9q\u0000~\u0000\u00f8q\u0000~\u0000bq\u0000~\u0000"
+"Vq\u0000~\u0000\u00ff"));
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
            return net.sourceforge.czt.oz.jaxb.gen.impl.OperationElementImpl.this;
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
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.OperationImpl)net.sourceforge.czt.oz.jaxb.gen.impl.OperationElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Name" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.OperationImpl)net.sourceforge.czt.oz.jaxb.gen.impl.OperationElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.OperationImpl)net.sourceforge.czt.oz.jaxb.gen.impl.OperationElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                        return ;
                    case  0 :
                        if (("Operation" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
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
                    case  2 :
                        if (("Operation" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  3 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        spawnHandlerFromLeaveElement((((net.sourceforge.czt.oz.jaxb.gen.impl.OperationImpl)net.sourceforge.czt.oz.jaxb.gen.impl.OperationElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                        spawnHandlerFromEnterAttribute((((net.sourceforge.czt.oz.jaxb.gen.impl.OperationImpl)net.sourceforge.czt.oz.jaxb.gen.impl.OperationElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                        spawnHandlerFromLeaveAttribute((((net.sourceforge.czt.oz.jaxb.gen.impl.OperationImpl)net.sourceforge.czt.oz.jaxb.gen.impl.OperationElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                            spawnHandlerFromText((((net.sourceforge.czt.oz.jaxb.gen.impl.OperationImpl)net.sourceforge.czt.oz.jaxb.gen.impl.OperationElementImpl.this).new Unmarshaller(context)), 2, value);
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
