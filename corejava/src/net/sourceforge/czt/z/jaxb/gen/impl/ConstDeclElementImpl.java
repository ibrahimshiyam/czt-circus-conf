//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2004.05.24 at 09:46:08 NZST 
//


package net.sourceforge.czt.z.jaxb.gen.impl;

public class ConstDeclElementImpl
    extends net.sourceforge.czt.z.jaxb.gen.impl.ConstDeclImpl
    implements net.sourceforge.czt.z.jaxb.gen.ConstDeclElement, com.sun.xml.bind.RIElement, com.sun.xml.bind.JAXBObject, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallableObject, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializable, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.ValidatableObject
{

    public final static java.lang.Class version = (net.sourceforge.czt.z.jaxb.gen.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (net.sourceforge.czt.z.jaxb.gen.ConstDeclElement.class);
    }

    public java.lang.String ____jaxb_ri____getNamespaceURI() {
        return "http://czt.sourceforge.net/zml";
    }

    public java.lang.String ____jaxb_ri____getLocalName() {
        return "ConstDecl";
    }

    public net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingEventHandler createUnmarshaller(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingContext context) {
        return new net.sourceforge.czt.z.jaxb.gen.impl.ConstDeclElementImpl.Unmarshaller(context);
    }

    public void serializeBody(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("http://czt.sourceforge.net/zml", "ConstDecl");
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
        return (net.sourceforge.czt.z.jaxb.gen.ConstDeclElement.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000"
+"\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv."
+"grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000"
+"\fcontentModelt\u0000 Lcom/sun/msv/grammar/Expression;xr\u0000\u001ecom.sun."
+"msv.grammar.Expression\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilon"
+"Reducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0003xp\u0010\u00b6\u00ee^p"
+"p\u0000sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun."
+"msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~"
+"\u0000\u0004\u0010\u00b6\u00eeSppsq\u0000~\u0000\u0007\u000e\u0003\u00ad\u0085ppsq\u0000~\u0000\u0007\u0005Ex\u0006ppsr\u0000\u001dcom.sun.msv.grammar.Choi"
+"ceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\b\u0001\u00e0\u00fccppsq\u0000~\u0000\u0000\u0001\u00e0\u00fcXsr\u0000\u0011java.lang.Boolean\u00cd"
+" r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000p\u0000sq\u0000~\u0000\u0007\u0001\u00e0\u00fcMppsq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\f\u00001\u00bc\u00dfpp"
+"sr\u0000 com.sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.m"
+"sv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0003xq\u0000~\u0000\u0004\u00001\u00bc\u00d4q\u0000~\u0000\u0010psr\u0000"
+" com.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0003L\u0000\tna"
+"meClassq\u0000~\u0000\u0001xq\u0000~\u0000\u0004\u00001\u00bc\u00d1q\u0000~\u0000\u0010psr\u00002com.sun.msv.grammar.Expressi"
+"on$AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\bsq\u0000~\u0000\u000f\u0001q\u0000~\u0000\u001asr\u0000 c"
+"om.sun.msv.grammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.gr"
+"ammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expressi"
+"on$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\tq\u0000~\u0000\u001bq\u0000~\u0000 sr\u0000#com.s"
+"un.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljav"
+"a/lang/String;L\u0000\fnamespaceURIq\u0000~\u0000\"xq\u0000~\u0000\u001dt\u0000-net.sourceforge.c"
+"zt.z.jaxb.gen.TermA.AnnsTypet\u0000+http://java.sun.com/jaxb/xjc/"
+"dummy-elementssq\u0000~\u0000\f\u0001\u00af?^ppsq\u0000~\u0000\u0017\u0001\u00af?Sq\u0000~\u0000\u0010psr\u0000\u001bcom.sun.msv.gr"
+"ammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Dataty"
+"pe;L\u0000\u0006exceptq\u0000~\u0000\u0003L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~"
+"\u0000\u0004\u0001\u0010s\u0014ppsr\u0000\"com.sun.msv.datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000"
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
+"\f\u0003d{\u009eppsq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\f\u00001\u00bc\u00dfppsq\u0000~\u0000\u0014\u00001\u00bc\u00d4q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00001\u00bc\u00d1q\u0000"
+"~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000.net.sourceforge.czt.z.jaxb.gen.D"
+"eclNameElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u00032\u00be\u00b2pp\u0000sq\u0000~\u0000\u0007\u00032\u00be\u00a7ppsq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000"
+"~\u0000\f\u00001\u00bc\u00dfppsq\u0000~\u0000\u0014\u00001\u00bc\u00d4q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00001\u00bc\u00d1q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~"
+"\u0000!t\u0000\'net.sourceforge.czt.z.jaxb.gen.DeclNameq\u0000~\u0000%sq\u0000~\u0000\f\u0003\u0001\u0001\u00b8p"
+"psq\u0000~\u0000\u0017\u0003\u0001\u0001\u00adq\u0000~\u0000\u0010pq\u0000~\u0000+sq\u0000~\u0000!q\u0000~\u0000<q\u0000~\u0000=q\u0000~\u0000 sq\u0000~\u0000!t\u0000\bDeclName"
+"q\u0000~\u0000@sq\u0000~\u0000\f\b\u00be5zppsq\u0000~\u0000\f\b\u008cx\u008eppsq\u0000~\u0000\f\bZ\u00bb\u00a2ppsq\u0000~\u0000\f\b(\u00fe\u00b6ppsq\u0000~\u0000\f\u0007"
+"\u00f7A\u00cappsq\u0000~\u0000\f\u0007\u00c5\u0084\u00deppsq\u0000~\u0000\f\u0007\u0093\u00c7\u00f2ppsq\u0000~\u0000\f\u0007b\u000b\u0006ppsq\u0000~\u0000\f\u00070N\u001appsq\u0000~\u0000\f\u0006"
+"\u00fe\u0091.ppsq\u0000~\u0000\f\u0006\u00cc\u00d4Bppsq\u0000~\u0000\f\u0006\u009b\u0017Vppsq\u0000~\u0000\f\u0006iZjppsq\u0000~\u0000\f\u00067\u009d~ppsq\u0000~\u0000\f\u0006"
+"\u0005\u00e0\u0092ppsq\u0000~\u0000\f\u0005\u00d4#\u00a6ppsq\u0000~\u0000\f\u0005\u00a2f\u00bappsq\u0000~\u0000\f\u0005p\u00a9\u00ceppsq\u0000~\u0000\f\u0005>\u00ec\u00e2ppsq\u0000~\u0000\f\u0005"
+"\r/\u00f6ppsq\u0000~\u0000\f\u0004\u00dbs\nppsq\u0000~\u0000\f\u0004\u00a9\u00b6\u001eppsq\u0000~\u0000\f\u0004w\u00f92ppsq\u0000~\u0000\f\u0004F<Fppsq\u0000~\u0000\f\u0004"
+"\u0014\u007fZppsq\u0000~\u0000\f\u0003\u00e2\u00c2nppsq\u0000~\u0000\f\u0003\u00b1\u0005\u0082ppsq\u0000~\u0000\f\u0003\u007fH\u0096ppsq\u0000~\u0000\f\u0003M\u008b\u00aappsq\u0000~\u0000\f\u0003"
+"\u001b\u00ce\u00beppsq\u0000~\u0000\f\u0002\u00ea\u0011\u00d2ppsq\u0000~\u0000\f\u0002\u00b8T\u00e6ppsq\u0000~\u0000\f\u0002\u0086\u0097\u00fappsq\u0000~\u0000\f\u0002T\u00db\u000eppsq\u0000~\u0000\f\u0002"
+"#\u001e\"ppsq\u0000~\u0000\f\u0001\u00f1a6ppsq\u0000~\u0000\f\u0001\u00bf\u00a4Jppsq\u0000~\u0000\f\u0001\u008d\u00e7^ppsq\u0000~\u0000\f\u0001\\*rppsq\u0000~\u0000\f\u0001"
+"*m\u0086ppsq\u0000~\u0000\f\u0000\u00f8\u00b0\u009appsq\u0000~\u0000\f\u0000\u00c6\u00f3\u00aeppsq\u0000~\u0000\f\u0000\u00956\u00c2ppsq\u0000~\u0000\f\u0000cy\u00d6ppsq\u0000~\u0000\u0000\u0000"
+"1\u00bc\u00eapp\u0000sq\u0000~\u0000\f\u00001\u00bc\u00dfppsq\u0000~\u0000\u0014\u00001\u00bc\u00d4q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00001\u00bc\u00d1q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001e"
+"q\u0000~\u0000 sq\u0000~\u0000!t\u0000,net.sourceforge.czt.z.jaxb.gen.Expr2NElementq\u0000"
+"~\u0000%sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\f\u00001\u00bc\u00dfppsq\u0000~\u0000\u0014\u00001\u00bc\u00d4q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00001\u00bc\u00d1q\u0000~\u0000\u0010p"
+"q\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000-net.sourceforge.czt.z.jaxb.gen.SchEx"
+"prElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\f\u00001\u00bc\u00dfppsq\u0000~\u0000\u0014\u00001\u00bc\u00d4q\u0000~\u0000\u0010psq\u0000~\u0000"
+"\u0017\u00001\u00bc\u00d1q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000-net.sourceforge.czt.z.jax"
+"b.gen.RefExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\f\u00001\u00bc\u00dfppsq\u0000~\u0000\u0014\u00001\u00bc\u00d4"
+"q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00001\u00bc\u00d1q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000/net.sourceforg"
+"e.czt.oz.jaxb.gen.ContainmentExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\f\u00001\u00bc"
+"\u00dfppsq\u0000~\u0000\u0014\u00001\u00bc\u00d4q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00001\u00bc\u00d1q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000(n"
+"et.sourceforge.czt.oz.jaxb.gen.SelfExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000"
+"~\u0000\f\u00001\u00bc\u00dfppsq\u0000~\u0000\u0014\u00001\u00bc\u00d4q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00001\u00bc\u00d1q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~"
+"\u0000!t\u0000(net.sourceforge.czt.z.jaxb.gen.TupleExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u00001\u00bc\u00ea"
+"pp\u0000sq\u0000~\u0000\f\u00001\u00bc\u00dfppsq\u0000~\u0000\u0014\u00001\u00bc\u00d4q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00001\u00bc\u00d1q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~"
+"\u0000 sq\u0000~\u0000!t\u0000\'net.sourceforge.czt.z.jaxb.gen.ProdExprq\u0000~\u0000%sq\u0000~\u0000"
+"\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\f\u00001\u00bc\u00dfppsq\u0000~\u0000\u0014\u00001\u00bc\u00d4q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00001\u00bc\u00d1q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~"
+"\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000(net.sourceforge.czt.oz.jaxb.gen.PolyExprq\u0000~\u0000"
+"%sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\f\u00001\u00bc\u00dfppsq\u0000~\u0000\u0014\u00001\u00bc\u00d4q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00001\u00bc\u00d1q\u0000~\u0000\u0010pq\u0000"
+"~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00002net.sourceforge.czt.z.jaxb.gen.TupleSe"
+"lExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\f\u00001\u00bc\u00dfppsq\u0000~\u0000\u0014\u00001\u00bc\u00d4q\u0000~\u0000\u0010psq"
+"\u0000~\u0000\u0017\u00001\u00bc\u00d1q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000&net.sourceforge.czt.z."
+"jaxb.gen.AndExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\f\u00001\u00bc\u00dfppsq\u0000~\u0000\u0014\u00001\u00bc\u00d4q\u0000~\u0000"
+"\u0010psq\u0000~\u0000\u0017\u00001\u00bc\u00d1q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000.net.sourceforge.cz"
+"t.z.jaxb.gen.Qnt1ExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\f\u00001\u00bc\u00dfppsq"
+"\u0000~\u0000\u0014\u00001\u00bc\u00d4q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00001\u00bc\u00d1q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000&net.so"
+"urceforge.czt.z.jaxb.gen.NegExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\f\u00001\u00bc\u00df"
+"ppsq\u0000~\u0000\u0014\u00001\u00bc\u00d4q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00001\u00bc\u00d1q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00004ne"
+"t.sourceforge.czt.tcoz.jaxb.gen.ChannelExprElementq\u0000~\u0000%sq\u0000~\u0000"
+"\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\f\u00001\u00bc\u00dfppsq\u0000~\u0000\u0014\u00001\u00bc\u00d4q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00001\u00bc\u00d1q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~"
+"\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000%net.sourceforge.czt.z.jaxb.gen.MuExprq\u0000~\u0000%sq"
+"\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\f\u00001\u00bc\u00dfppsq\u0000~\u0000\u0014\u00001\u00bc\u00d4q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00001\u00bc\u00d1q\u0000~\u0000\u0010pq\u0000~\u0000\u001a"
+"q\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000\'net.sourceforge.czt.z.jaxb.gen.CompExprq\u0000"
+"~\u0000%sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\f\u00001\u00bc\u00dfppsq\u0000~\u0000\u0014\u00001\u00bc\u00d4q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00001\u00bc\u00d1q\u0000~\u0000\u0010p"
+"q\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000&net.sourceforge.czt.z.jaxb.gen.SetEx"
+"prq\u0000~\u0000%sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\f\u00001\u00bc\u00dfppsq\u0000~\u0000\u0014\u00001\u00bc\u00d4q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00001\u00bc\u00d1q\u0000"
+"~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000/net.sourceforge.czt.z.jaxb.gen.D"
+"ecorExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\f\u00001\u00bc\u00dfppsq\u0000~\u0000\u0014\u00001\u00bc\u00d4q\u0000~\u0000\u0010"
+"psq\u0000~\u0000\u0017\u00001\u00bc\u00d1q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000.net.sourceforge.czt"
+".z.jaxb.gen.SchExpr2Elementq\u0000~\u0000%sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\f\u00001\u00bc\u00dfppsq\u0000"
+"~\u0000\u0014\u00001\u00bc\u00d4q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00001\u00bc\u00d1q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000.net.sou"
+"rceforge.czt.z.jaxb.gen.CondExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000"
+"~\u0000\f\u00001\u00bc\u00dfppsq\u0000~\u0000\u0014\u00001\u00bc\u00d4q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00001\u00bc\u00d1q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~"
+"\u0000!t\u00000net.sourceforge.czt.z.jaxb.gen.RenameExprElementq\u0000~\u0000%sq"
+"\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\f\u00001\u00bc\u00dfppsq\u0000~\u0000\u0014\u00001\u00bc\u00d4q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00001\u00bc\u00d1q\u0000~\u0000\u0010pq\u0000~\u0000\u001a"
+"q\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000)net.sourceforge.czt.z.jaxb.gen.ForallExpr"
+"q\u0000~\u0000%sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\f\u00001\u00bc\u00dfppsq\u0000~\u0000\u0014\u00001\u00bc\u00d4q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00001\u00bc\u00d1q\u0000~\u0000"
+"\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000\'net.sourceforge.czt.z.jaxb.gen.Pip"
+"eExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\f\u00001\u00bc\u00dfppsq\u0000~\u0000\u0014\u00001\u00bc\u00d4q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00001\u00bc"
+"\u00d1q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000+net.sourceforge.czt.z.jaxb.ge"
+"n.Expr2Elementq\u0000~\u0000%sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\f\u00001\u00bc\u00dfppsq\u0000~\u0000\u0014\u00001\u00bc\u00d4q\u0000~\u0000\u0010p"
+"sq\u0000~\u0000\u0017\u00001\u00bc\u00d1q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000/net.sourceforge.czt."
+"z.jaxb.gen.ThetaExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\f\u00001\u00bc\u00dfppsq\u0000"
+"~\u0000\u0014\u00001\u00bc\u00d4q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00001\u00bc\u00d1q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000)net.sou"
+"rceforge.czt.z.jaxb.gen.LambdaExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\f\u00001"
+"\u00bc\u00dfppsq\u0000~\u0000\u0014\u00001\u00bc\u00d4q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00001\u00bc\u00d1q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000."
+"net.sourceforge.czt.z.jaxb.gen.BindExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u00001\u00bc"
+"\u00eapp\u0000sq\u0000~\u0000\f\u00001\u00bc\u00dfppsq\u0000~\u0000\u0014\u00001\u00bc\u00d4q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00001\u00bc\u00d1q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000"
+"~\u0000 sq\u0000~\u0000!t\u0000\'net.sourceforge.czt.z.jaxb.gen.ProjExprq\u0000~\u0000%sq\u0000~"
+"\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\f\u00001\u00bc\u00dfppsq\u0000~\u0000\u0014\u00001\u00bc\u00d4q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00001\u00bc\u00d1q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000"
+"~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00003net.sourceforge.czt.zpatt.jaxb.gen.JokerExp"
+"rElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\f\u00001\u00bc\u00dfppsq\u0000~\u0000\u0014\u00001\u00bc\u00d4q\u0000~\u0000\u0010psq\u0000~\u0000\u0017"
+"\u00001\u00bc\u00d1q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000,net.sourceforge.czt.z.jaxb"
+".gen.Expr0NElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\f\u00001\u00bc\u00dfppsq\u0000~\u0000\u0014\u00001\u00bc\u00d4q\u0000"
+"~\u0000\u0010psq\u0000~\u0000\u0017\u00001\u00bc\u00d1q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000%net.sourceforge."
+"czt.z.jaxb.gen.OrExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\f\u00001\u00bc\u00dfppsq\u0000~\u0000\u0014\u00001\u00bc"
+"\u00d4q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00001\u00bc\u00d1q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00007net.sourcefor"
+"ge.czt.oz.jaxb.gen.PromotedAttrExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000"
+"sq\u0000~\u0000\f\u00001\u00bc\u00dfppsq\u0000~\u0000\u0014\u00001\u00bc\u00d4q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00001\u00bc\u00d1q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 s"
+"q\u0000~\u0000!t\u0000.net.sourceforge.czt.z.jaxb.gen.HideExprElementq\u0000~\u0000%s"
+"q\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\f\u00001\u00bc\u00dfppsq\u0000~\u0000\u0014\u00001\u00bc\u00d4q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00001\u00bc\u00d1q\u0000~\u0000\u0010pq\u0000~\u0000"
+"\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000.net.sourceforge.czt.z.jaxb.gen.ApplExprE"
+"lementq\u0000~\u0000%sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\f\u00001\u00bc\u00dfppsq\u0000~\u0000\u0014\u00001\u00bc\u00d4q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00001"
+"\u00bc\u00d1q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000-net.sourceforge.czt.z.jaxb.g"
+"en.NumExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\f\u00001\u00bc\u00dfppsq\u0000~\u0000\u0014\u00001\u00bc\u00d4q\u0000~"
+"\u0000\u0010psq\u0000~\u0000\u0017\u00001\u00bc\u00d1q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000-net.sourceforge.c"
+"zt.z.jaxb.gen.QntExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\f\u00001\u00bc\u00dfppsq"
+"\u0000~\u0000\u0014\u00001\u00bc\u00d4q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00001\u00bc\u00d1q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000*net.so"
+"urceforge.czt.z.jaxb.gen.SetCompExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\f"
+"\u00001\u00bc\u00dfppsq\u0000~\u0000\u0014\u00001\u00bc\u00d4q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00001\u00bc\u00d1q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t"
+"\u0000)net.sourceforge.czt.z.jaxb.gen.ExistsExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp"
+"\u0000sq\u0000~\u0000\f\u00001\u00bc\u00dfppsq\u0000~\u0000\u0014\u00001\u00bc\u00d4q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00001\u00bc\u00d1q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 "
+"sq\u0000~\u0000!t\u0000&net.sourceforge.czt.z.jaxb.gen.LetExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u00001"
+"\u00bc\u00eapp\u0000sq\u0000~\u0000\f\u00001\u00bc\u00dfppsq\u0000~\u0000\u0014\u00001\u00bc\u00d4q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00001\u00bc\u00d1q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq"
+"\u0000~\u0000 sq\u0000~\u0000!t\u0000*net.sourceforge.czt.z.jaxb.gen.Exists1Exprq\u0000~\u0000%"
+"sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\f\u00001\u00bc\u00dfppsq\u0000~\u0000\u0014\u00001\u00bc\u00d4q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00001\u00bc\u00d1q\u0000~\u0000\u0010pq\u0000~"
+"\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000&net.sourceforge.czt.z.jaxb.gen.PreExprq"
+"\u0000~\u0000%sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\f\u00001\u00bc\u00dfppsq\u0000~\u0000\u0014\u00001\u00bc\u00d4q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00001\u00bc\u00d1q\u0000~\u0000\u0010"
+"pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000+net.sourceforge.czt.z.jaxb.gen.Expr"
+"1Elementq\u0000~\u0000%sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\f\u00001\u00bc\u00dfppsq\u0000~\u0000\u0014\u00001\u00bc\u00d4q\u0000~\u0000\u0010psq\u0000~\u0000\u0017"
+"\u00001\u00bc\u00d1q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000&net.sourceforge.czt.z.jaxb"
+".gen.IffExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\f\u00001\u00bc\u00dfppsq\u0000~\u0000\u0014\u00001\u00bc\u00d4q\u0000~\u0000\u0010psq"
+"\u0000~\u0000\u0017\u00001\u00bc\u00d1q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00001net.sourceforge.czt.z."
+"jaxb.gen.BindSelExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\f\u00001\u00bc\u00dfppsq\u0000"
+"~\u0000\u0014\u00001\u00bc\u00d4q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00001\u00bc\u00d1q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000*net.sou"
+"rceforge.czt.z.jaxb.gen.ImpliesExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\f\u0000"
+"1\u00bc\u00dfppsq\u0000~\u0000\u0014\u00001\u00bc\u00d4q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00001\u00bc\u00d1q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000"
+"(net.sourceforge.czt.z.jaxb.gen.PowerExprq\u0000~\u0000%sq\u0000~\u0000\f\u0002\u00b3@\u00c9ppsq"
+"\u0000~\u0000\u0017\u0002\u00b3@\u00beq\u0000~\u0000\u0010pq\u0000~\u0000+sq\u0000~\u0000!q\u0000~\u0000<q\u0000~\u0000=q\u0000~\u0000 sq\u0000~\u0000!t\u0000\tConstDeclq\u0000"
+"~\u0000@sr\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTa"
+"blet\u0000/Lcom/sun/msv/grammar/ExpressionPool$ClosedHash;xpsr\u0000-c"
+"om.sun.msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0002\u0000\u0004I\u0000\u0005co"
+"untI\u0000\tthresholdL\u0000\u0006parentq\u0000~\u0001\u0095[\u0000\u0005tablet\u0000![Lcom/sun/msv/gramma"
+"r/Expression;xp\u0000\u0000\u0000\u0096\u0000\u0000\u0000\u00e6pur\u0000![Lcom.sun.msv.grammar.Expression"
+";\u00d68D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp\u0000\u0000\u0002\u00ffppppppppppppppppq\u0000~\u0000ippppppppppppppppq\u0000~\u0000|"
+"pppppppppppppppppq\u0000~\u0000cppppppppppppppppq\u0000~\u0000vppppppppppppppppp"
+"q\u0000~\u0000]ppppppppppppppppq\u0000~\u0000ppppppppppppppppppq\u0000~\u0000Wpppq\u0000~\u0000Apppp"
+"ppppppppq\u0000~\u0000jppppppppppppppppq\u0000~\u0000}pppppppppppppppppq\u0000~\u0000dpppp"
+"ppppppppppppq\u0000~\u0000wpppppppppppppppppq\u0000~\u0000^ppppppppppppppppq\u0000~\u0000q"
+"ppppppppppq\u0000~\u0000Ippppppq\u0000~\u0000Xppppppppppppppppq\u0000~\u0000kppppppppppppp"
+"pppq\u0000~\u0000~pppppppppppppppppq\u0000~\u0000eppppppppppppppppq\u0000~\u0000xppppppppp"
+"ppppppppq\u0000~\u0000_ppppppppppppppppq\u0000~\u0000rpppppppq\u0000~\u0000Ppppppppppq\u0000~\u0000Y"
+"ppppppppppppppppq\u0000~\u0000lq\u0000~\u0000\tpppppppppppppppq\u0000~\u0000\u007fpppppppppppppp"
+"pppq\u0000~\u0000fppppppppppppppppq\u0000~\u0000ypppppppppppppppppq\u0000~\u0000`ppppppppp"
+"pppppppq\u0000~\u0000sq\u0000~\u0000\u0011ppppppppppppppppq\u0000~\u0000Zppppq\u0000~\u0000\rpppppppppppq\u0000"
+"~\u0000mq\u0000~\u0000\npppppppppppppppq\u0000~\u0000\u0080pppppppppppppppppq\u0000~\u0000gpppppppppp"
+"ppppppq\u0000~\u0000zpppppppppppppppppq\u0000~\u0000appppppppppppppq\u0000~\u0000&pq\u0000~\u0000tpp"
+"pppppppppppppppq\u0000~\u0000[pppppppppppq\u0000~\u0001Iq\u0000~\u0001Cq\u0000~\u0001=q\u0000~\u00017q\u0000~\u00011q\u0000~\u0001"
+"+q\u0000~\u0001%q\u0000~\u0001\u001fq\u0000~\u0001\u0019q\u0000~\u0001\u0013q\u0000~\u0001\rq\u0000~\u0001Hq\u0000~\u0001Bq\u0000~\u0001<q\u0000~\u00016q\u0000~\u00010q\u0000~\u0001*q\u0000~\u0001"
+"$q\u0000~\u0001\u001eq\u0000~\u0001\u0018q\u0000~\u0001\u0012q\u0000~\u0001\fq\u0000~\u0001\u0006q\u0000~\u0001\u0007q\u0000~\u0001\u0000q\u0000~\u0001\u0001q\u0000~\u0000\u00faq\u0000~\u0000\u00fbq\u0000~\u0000\u00f4q\u0000~\u0000"
+"\u00f5q\u0000~\u0000\u00eeq\u0000~\u0000\u00efq\u0000~\u0000\u00e8q\u0000~\u0000\u00e9q\u0000~\u0000\u00e2q\u0000~\u0000\u00e3q\u0000~\u0000\u00dcq\u0000~\u0000\u00ddq\u0000~\u0000Lq\u0000~\u0000\u0083q\u0000~\u0000\u0089q\u0000~\u0000"
+"\u008fq\u0000~\u0000\u0095q\u0000~\u0000\u009bq\u0000~\u0000\u00a1q\u0000~\u0000\u0013q\u0000~\u0000Cq\u0000~\u0000Kq\u0000~\u0000\u0082q\u0000~\u0000\u0088q\u0000~\u0000\u008eq\u0000~\u0000\u0094q\u0000~\u0000\u009aq\u0000~\u0000"
+"\u00a0q\u0000~\u0000\u00a6q\u0000~\u0000\u00acq\u0000~\u0000\u00b2q\u0000~\u0000\u00b8q\u0000~\u0000\u00beq\u0000~\u0000\u00c4q\u0000~\u0000\u00caq\u0000~\u0000\u00d0q\u0000~\u0000\u00d6q\u0000~\u0000\u00a7q\u0000~\u0000\u00adq\u0000~\u0000"
+"\u00b3q\u0000~\u0000\u00b9q\u0000~\u0000\u00bfq\u0000~\u0000\u00c5q\u0000~\u0000\u00cbq\u0000~\u0000\u00d1q\u0000~\u0000\u00d7q\u0000~\u0000\u0016q\u0000~\u0000Dq\u0000~\u0000\u000bq\u0000~\u0000bq\u0000~\u0000nq\u0000~\u0000"
+"{q\u0000~\u0000hq\u0000~\u0001Oq\u0000~\u0001Nq\u0000~\u0001Uq\u0000~\u0001Tq\u0000~\u0001[q\u0000~\u0001Zq\u0000~\u0001aq\u0000~\u0001`q\u0000~\u0001gq\u0000~\u0001fq\u0000~\u0001"
+"mq\u0000~\u0001lq\u0000~\u0001sq\u0000~\u0000uq\u0000~\u0001rq\u0000~\u0001yq\u0000~\u0001xq\u0000~\u0001\u007fq\u0000~\u0001~q\u0000~\u0001\u0085q\u0000~\u0001\u0084q\u0000~\u0001\u008bq\u0000~\u0001"
+"\u008aq\u0000~\u0000Uq\u0000~\u0001\u008fppppppq\u0000~\u0000\\ppppppppppppppppq\u0000~\u0000oppppppppppppppppp"
+"q\u0000~\u0000V"));
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
            return net.sourceforge.czt.z.jaxb.gen.impl.ConstDeclElementImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  0 :
                        if (("ConstDecl" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
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
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.ConstDeclImpl)net.sourceforge.czt.z.jaxb.gen.impl.ConstDeclElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("DeclName" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.ConstDeclImpl)net.sourceforge.czt.z.jaxb.gen.impl.ConstDeclElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("DeclName" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.ConstDeclImpl)net.sourceforge.czt.z.jaxb.gen.impl.ConstDeclElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.ConstDeclImpl)net.sourceforge.czt.z.jaxb.gen.impl.ConstDeclElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
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
                    case  1 :
                        spawnHandlerFromLeaveElement((((net.sourceforge.czt.z.jaxb.gen.impl.ConstDeclImpl)net.sourceforge.czt.z.jaxb.gen.impl.ConstDeclElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                        return ;
                    case  2 :
                        if (("ConstDecl" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
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
                        spawnHandlerFromEnterAttribute((((net.sourceforge.czt.z.jaxb.gen.impl.ConstDeclImpl)net.sourceforge.czt.z.jaxb.gen.impl.ConstDeclElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                        spawnHandlerFromLeaveAttribute((((net.sourceforge.czt.z.jaxb.gen.impl.ConstDeclImpl)net.sourceforge.czt.z.jaxb.gen.impl.ConstDeclElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                            spawnHandlerFromText((((net.sourceforge.czt.z.jaxb.gen.impl.ConstDeclImpl)net.sourceforge.czt.z.jaxb.gen.impl.ConstDeclElementImpl.this).new Unmarshaller(context)), 2, value);
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
