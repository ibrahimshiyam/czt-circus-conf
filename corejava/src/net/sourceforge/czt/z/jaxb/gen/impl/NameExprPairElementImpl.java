//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2004.05.24 at 09:46:08 NZST 
//


package net.sourceforge.czt.z.jaxb.gen.impl;

public class NameExprPairElementImpl
    extends net.sourceforge.czt.z.jaxb.gen.impl.NameExprPairImpl
    implements net.sourceforge.czt.z.jaxb.gen.NameExprPairElement, com.sun.xml.bind.RIElement, com.sun.xml.bind.JAXBObject, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallableObject, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializable, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.ValidatableObject
{

    public final static java.lang.Class version = (net.sourceforge.czt.z.jaxb.gen.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (net.sourceforge.czt.z.jaxb.gen.NameExprPairElement.class);
    }

    public java.lang.String ____jaxb_ri____getNamespaceURI() {
        return "http://czt.sourceforge.net/zml";
    }

    public java.lang.String ____jaxb_ri____getLocalName() {
        return "NameExprPair";
    }

    public net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingEventHandler createUnmarshaller(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingContext context) {
        return new net.sourceforge.czt.z.jaxb.gen.impl.NameExprPairElementImpl.Unmarshaller(context);
    }

    public void serializeBody(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("http://czt.sourceforge.net/zml", "NameExprPair");
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
        return (net.sourceforge.czt.z.jaxb.gen.NameExprPairElement.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000"
+"\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv."
+"grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000"
+"\fcontentModelt\u0000 Lcom/sun/msv/grammar/Expression;xr\u0000\u001ecom.sun."
+"msv.grammar.Expression\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilon"
+"Reducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0003xp\fT\u00c0+p"
+"p\u0000sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun."
+"msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~"
+"\u0000\u0004\fT\u00c0 ppsq\u0000~\u0000\u0007\n\u00b4^\u00d5ppsq\u0000~\u0000\u0000\u0001\u00f6)Vpp\u0000sq\u0000~\u0000\u0007\u0001\u00f6)Kppsq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sr"
+"\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\b\u00001\u00bc\u00dfppsr\u0000 co"
+"m.sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.gra"
+"mmar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0003xq\u0000~\u0000\u0004\u00001\u00bc\u00d4sr\u0000\u0011java.lang.B"
+"oolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psr\u0000 com.sun.msv.grammar.Attribu"
+"teExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0003L\u0000\tnameClassq\u0000~\u0000\u0001xq\u0000~\u0000\u0004\u00001\u00bc\u00d1q\u0000~\u0000\u0014p"
+"sr\u00002com.sun.msv.grammar.Expression$AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\bsq\u0000~\u0000\u0013\u0001q\u0000~\u0000\u0018sr\u0000 com.sun.msv.grammar.AnyNameCl"
+"ass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xp"
+"sr\u00000com.sun.msv.grammar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001"
+"\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\tq\u0000~\u0000\u0019q\u0000~\u0000\u001esr\u0000#com.sun.msv.grammar.SimpleNameCla"
+"ss\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/String;L\u0000\fnamespaceUR"
+"Iq\u0000~\u0000 xq\u0000~\u0000\u001bt\u0000\'net.sourceforge.czt.z.jaxb.gen.DeclNamet\u0000+htt"
+"p://java.sun.com/jaxb/xjc/dummy-elementssq\u0000~\u0000\u000e\u0001\u00c4l\\ppsq\u0000~\u0000\u0015\u0001\u00c4"
+"lQq\u0000~\u0000\u0014psr\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLo"
+"rg/relaxng/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0003L\u0000\u0004namet\u0000\u001dLcom/su"
+"n/msv/util/StringPair;xq\u0000~\u0000\u0004\u0001\u0010s\u0014ppsr\u0000\"com.sun.msv.datatype.x"
+"sd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.BuiltinA"
+"tomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.ConcreteTyp"
+"e\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000 L\u0000\btypeNameq\u0000~\u0000 L\u0000\nwhiteSpacet\u0000.Lc"
+"om/sun/msv/datatype/xsd/WhiteSpaceProcessor;xpt\u0000 http://www."
+"w3.org/2001/XMLSchemat\u0000\u0005QNamesr\u00005com.sun.msv.datatype.xsd.Wh"
+"iteSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatyp"
+"e.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.gramma"
+"r.Expression$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\nq\u0000~\u0000\u0014psr\u0000"
+"\u001bcom.sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000 L\u0000\fn"
+"amespaceURIq\u0000~\u0000 xpq\u0000~\u00001q\u0000~\u00000sq\u0000~\u0000\u001ft\u0000\u0004typet\u0000)http://www.w3.or"
+"g/2001/XMLSchema-instanceq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000\u0004Namet\u0000\u001ehttp://czt.sou"
+"rceforge.net/zmlsq\u0000~\u0000\u000e\b\u00be5zppsq\u0000~\u0000\u000e\b\u008cx\u008eppsq\u0000~\u0000\u000e\bZ\u00bb\u00a2ppsq\u0000~\u0000\u000e\b("
+"\u00fe\u00b6ppsq\u0000~\u0000\u000e\u0007\u00f7A\u00cappsq\u0000~\u0000\u000e\u0007\u00c5\u0084\u00deppsq\u0000~\u0000\u000e\u0007\u0093\u00c7\u00f2ppsq\u0000~\u0000\u000e\u0007b\u000b\u0006ppsq\u0000~\u0000\u000e\u00070"
+"N\u001appsq\u0000~\u0000\u000e\u0006\u00fe\u0091.ppsq\u0000~\u0000\u000e\u0006\u00cc\u00d4Bppsq\u0000~\u0000\u000e\u0006\u009b\u0017Vppsq\u0000~\u0000\u000e\u0006iZjppsq\u0000~\u0000\u000e\u00067"
+"\u009d~ppsq\u0000~\u0000\u000e\u0006\u0005\u00e0\u0092ppsq\u0000~\u0000\u000e\u0005\u00d4#\u00a6ppsq\u0000~\u0000\u000e\u0005\u00a2f\u00bappsq\u0000~\u0000\u000e\u0005p\u00a9\u00ceppsq\u0000~\u0000\u000e\u0005>"
+"\u00ec\u00e2ppsq\u0000~\u0000\u000e\u0005\r/\u00f6ppsq\u0000~\u0000\u000e\u0004\u00dbs\nppsq\u0000~\u0000\u000e\u0004\u00a9\u00b6\u001eppsq\u0000~\u0000\u000e\u0004w\u00f92ppsq\u0000~\u0000\u000e\u0004F"
+"<Fppsq\u0000~\u0000\u000e\u0004\u0014\u007fZppsq\u0000~\u0000\u000e\u0003\u00e2\u00c2nppsq\u0000~\u0000\u000e\u0003\u00b1\u0005\u0082ppsq\u0000~\u0000\u000e\u0003\u007fH\u0096ppsq\u0000~\u0000\u000e\u0003M"
+"\u008b\u00aappsq\u0000~\u0000\u000e\u0003\u001b\u00ce\u00beppsq\u0000~\u0000\u000e\u0002\u00ea\u0011\u00d2ppsq\u0000~\u0000\u000e\u0002\u00b8T\u00e6ppsq\u0000~\u0000\u000e\u0002\u0086\u0097\u00fappsq\u0000~\u0000\u000e\u0002T"
+"\u00db\u000eppsq\u0000~\u0000\u000e\u0002#\u001e\"ppsq\u0000~\u0000\u000e\u0001\u00f1a6ppsq\u0000~\u0000\u000e\u0001\u00bf\u00a4Jppsq\u0000~\u0000\u000e\u0001\u008d\u00e7^ppsq\u0000~\u0000\u000e\u0001\\"
+"*rppsq\u0000~\u0000\u000e\u0001*m\u0086ppsq\u0000~\u0000\u000e\u0000\u00f8\u00b0\u009appsq\u0000~\u0000\u000e\u0000\u00c6\u00f3\u00aeppsq\u0000~\u0000\u000e\u0000\u00956\u00c2ppsq\u0000~\u0000\u000e\u0000c"
+"y\u00d6ppsq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\u000e\u00001\u00bc\u00dfppsq\u0000~\u0000\u0010\u00001\u00bc\u00d4q\u0000~\u0000\u0014psq\u0000~\u0000\u0015\u00001\u00bc\u00d1q\u0000~\u0000\u0014"
+"pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000,net.sourceforge.czt.z.jaxb.gen.Expr"
+"2NElementq\u0000~\u0000#sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\u000e\u00001\u00bc\u00dfppsq\u0000~\u0000\u0010\u00001\u00bc\u00d4q\u0000~\u0000\u0014psq\u0000~\u0000"
+"\u0015\u00001\u00bc\u00d1q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000-net.sourceforge.czt.z.jax"
+"b.gen.SchExprElementq\u0000~\u0000#sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\u000e\u00001\u00bc\u00dfppsq\u0000~\u0000\u0010\u00001\u00bc\u00d4"
+"q\u0000~\u0000\u0014psq\u0000~\u0000\u0015\u00001\u00bc\u00d1q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000-net.sourceforg"
+"e.czt.z.jaxb.gen.RefExprElementq\u0000~\u0000#sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\u000e\u00001\u00bc\u00dfp"
+"psq\u0000~\u0000\u0010\u00001\u00bc\u00d4q\u0000~\u0000\u0014psq\u0000~\u0000\u0015\u00001\u00bc\u00d1q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000/net"
+".sourceforge.czt.oz.jaxb.gen.ContainmentExprq\u0000~\u0000#sq\u0000~\u0000\u0000\u00001\u00bc\u00eap"
+"p\u0000sq\u0000~\u0000\u000e\u00001\u00bc\u00dfppsq\u0000~\u0000\u0010\u00001\u00bc\u00d4q\u0000~\u0000\u0014psq\u0000~\u0000\u0015\u00001\u00bc\u00d1q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000"
+"\u001esq\u0000~\u0000\u001ft\u0000(net.sourceforge.czt.oz.jaxb.gen.SelfExprq\u0000~\u0000#sq\u0000~\u0000"
+"\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\u000e\u00001\u00bc\u00dfppsq\u0000~\u0000\u0010\u00001\u00bc\u00d4q\u0000~\u0000\u0014psq\u0000~\u0000\u0015\u00001\u00bc\u00d1q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~"
+"\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000(net.sourceforge.czt.z.jaxb.gen.TupleExprq\u0000~\u0000"
+"#sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\u000e\u00001\u00bc\u00dfppsq\u0000~\u0000\u0010\u00001\u00bc\u00d4q\u0000~\u0000\u0014psq\u0000~\u0000\u0015\u00001\u00bc\u00d1q\u0000~\u0000\u0014pq\u0000"
+"~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000\'net.sourceforge.czt.z.jaxb.gen.ProdExp"
+"rq\u0000~\u0000#sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\u000e\u00001\u00bc\u00dfppsq\u0000~\u0000\u0010\u00001\u00bc\u00d4q\u0000~\u0000\u0014psq\u0000~\u0000\u0015\u00001\u00bc\u00d1q\u0000~"
+"\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000(net.sourceforge.czt.oz.jaxb.gen.P"
+"olyExprq\u0000~\u0000#sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\u000e\u00001\u00bc\u00dfppsq\u0000~\u0000\u0010\u00001\u00bc\u00d4q\u0000~\u0000\u0014psq\u0000~\u0000\u0015\u0000"
+"1\u00bc\u00d1q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00002net.sourceforge.czt.z.jaxb."
+"gen.TupleSelExprElementq\u0000~\u0000#sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\u000e\u00001\u00bc\u00dfppsq\u0000~\u0000\u0010\u0000"
+"1\u00bc\u00d4q\u0000~\u0000\u0014psq\u0000~\u0000\u0015\u00001\u00bc\u00d1q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000&net.sourcef"
+"orge.czt.z.jaxb.gen.AndExprq\u0000~\u0000#sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\u000e\u00001\u00bc\u00dfppsq\u0000"
+"~\u0000\u0010\u00001\u00bc\u00d4q\u0000~\u0000\u0014psq\u0000~\u0000\u0015\u00001\u00bc\u00d1q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000.net.sou"
+"rceforge.czt.z.jaxb.gen.Qnt1ExprElementq\u0000~\u0000#sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000"
+"~\u0000\u000e\u00001\u00bc\u00dfppsq\u0000~\u0000\u0010\u00001\u00bc\u00d4q\u0000~\u0000\u0014psq\u0000~\u0000\u0015\u00001\u00bc\u00d1q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~"
+"\u0000\u001ft\u0000&net.sourceforge.czt.z.jaxb.gen.NegExprq\u0000~\u0000#sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp"
+"\u0000sq\u0000~\u0000\u000e\u00001\u00bc\u00dfppsq\u0000~\u0000\u0010\u00001\u00bc\u00d4q\u0000~\u0000\u0014psq\u0000~\u0000\u0015\u00001\u00bc\u00d1q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001e"
+"sq\u0000~\u0000\u001ft\u00004net.sourceforge.czt.tcoz.jaxb.gen.ChannelExprElemen"
+"tq\u0000~\u0000#sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\u000e\u00001\u00bc\u00dfppsq\u0000~\u0000\u0010\u00001\u00bc\u00d4q\u0000~\u0000\u0014psq\u0000~\u0000\u0015\u00001\u00bc\u00d1q\u0000~"
+"\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000%net.sourceforge.czt.z.jaxb.gen.Mu"
+"Exprq\u0000~\u0000#sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\u000e\u00001\u00bc\u00dfppsq\u0000~\u0000\u0010\u00001\u00bc\u00d4q\u0000~\u0000\u0014psq\u0000~\u0000\u0015\u00001\u00bc\u00d1"
+"q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000\'net.sourceforge.czt.z.jaxb.gen"
+".CompExprq\u0000~\u0000#sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\u000e\u00001\u00bc\u00dfppsq\u0000~\u0000\u0010\u00001\u00bc\u00d4q\u0000~\u0000\u0014psq\u0000~\u0000"
+"\u0015\u00001\u00bc\u00d1q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000&net.sourceforge.czt.z.jax"
+"b.gen.SetExprq\u0000~\u0000#sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\u000e\u00001\u00bc\u00dfppsq\u0000~\u0000\u0010\u00001\u00bc\u00d4q\u0000~\u0000\u0014ps"
+"q\u0000~\u0000\u0015\u00001\u00bc\u00d1q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000/net.sourceforge.czt.z"
+".jaxb.gen.DecorExprElementq\u0000~\u0000#sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\u000e\u00001\u00bc\u00dfppsq\u0000~"
+"\u0000\u0010\u00001\u00bc\u00d4q\u0000~\u0000\u0014psq\u0000~\u0000\u0015\u00001\u00bc\u00d1q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000.net.sour"
+"ceforge.czt.z.jaxb.gen.SchExpr2Elementq\u0000~\u0000#sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~"
+"\u0000\u000e\u00001\u00bc\u00dfppsq\u0000~\u0000\u0010\u00001\u00bc\u00d4q\u0000~\u0000\u0014psq\u0000~\u0000\u0015\u00001\u00bc\u00d1q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000"
+"\u001ft\u0000.net.sourceforge.czt.z.jaxb.gen.CondExprElementq\u0000~\u0000#sq\u0000~\u0000"
+"\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\u000e\u00001\u00bc\u00dfppsq\u0000~\u0000\u0010\u00001\u00bc\u00d4q\u0000~\u0000\u0014psq\u0000~\u0000\u0015\u00001\u00bc\u00d1q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~"
+"\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00000net.sourceforge.czt.z.jaxb.gen.RenameExprEle"
+"mentq\u0000~\u0000#sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\u000e\u00001\u00bc\u00dfppsq\u0000~\u0000\u0010\u00001\u00bc\u00d4q\u0000~\u0000\u0014psq\u0000~\u0000\u0015\u00001\u00bc\u00d1"
+"q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000)net.sourceforge.czt.z.jaxb.gen"
+".ForallExprq\u0000~\u0000#sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\u000e\u00001\u00bc\u00dfppsq\u0000~\u0000\u0010\u00001\u00bc\u00d4q\u0000~\u0000\u0014psq\u0000"
+"~\u0000\u0015\u00001\u00bc\u00d1q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000\'net.sourceforge.czt.z.j"
+"axb.gen.PipeExprq\u0000~\u0000#sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\u000e\u00001\u00bc\u00dfppsq\u0000~\u0000\u0010\u00001\u00bc\u00d4q\u0000~\u0000"
+"\u0014psq\u0000~\u0000\u0015\u00001\u00bc\u00d1q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000+net.sourceforge.cz"
+"t.z.jaxb.gen.Expr2Elementq\u0000~\u0000#sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\u000e\u00001\u00bc\u00dfppsq\u0000~\u0000"
+"\u0010\u00001\u00bc\u00d4q\u0000~\u0000\u0014psq\u0000~\u0000\u0015\u00001\u00bc\u00d1q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000/net.sourc"
+"eforge.czt.z.jaxb.gen.ThetaExprElementq\u0000~\u0000#sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~"
+"\u0000\u000e\u00001\u00bc\u00dfppsq\u0000~\u0000\u0010\u00001\u00bc\u00d4q\u0000~\u0000\u0014psq\u0000~\u0000\u0015\u00001\u00bc\u00d1q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000"
+"\u001ft\u0000)net.sourceforge.czt.z.jaxb.gen.LambdaExprq\u0000~\u0000#sq\u0000~\u0000\u0000\u00001\u00bc\u00ea"
+"pp\u0000sq\u0000~\u0000\u000e\u00001\u00bc\u00dfppsq\u0000~\u0000\u0010\u00001\u00bc\u00d4q\u0000~\u0000\u0014psq\u0000~\u0000\u0015\u00001\u00bc\u00d1q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~"
+"\u0000\u001esq\u0000~\u0000\u001ft\u0000.net.sourceforge.czt.z.jaxb.gen.BindExprElementq\u0000~"
+"\u0000#sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\u000e\u00001\u00bc\u00dfppsq\u0000~\u0000\u0010\u00001\u00bc\u00d4q\u0000~\u0000\u0014psq\u0000~\u0000\u0015\u00001\u00bc\u00d1q\u0000~\u0000\u0014pq"
+"\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000\'net.sourceforge.czt.z.jaxb.gen.ProjEx"
+"prq\u0000~\u0000#sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\u000e\u00001\u00bc\u00dfppsq\u0000~\u0000\u0010\u00001\u00bc\u00d4q\u0000~\u0000\u0014psq\u0000~\u0000\u0015\u00001\u00bc\u00d1q\u0000"
+"~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00003net.sourceforge.czt.zpatt.jaxb.g"
+"en.JokerExprElementq\u0000~\u0000#sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\u000e\u00001\u00bc\u00dfppsq\u0000~\u0000\u0010\u00001\u00bc\u00d4q"
+"\u0000~\u0000\u0014psq\u0000~\u0000\u0015\u00001\u00bc\u00d1q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000,net.sourceforge"
+".czt.z.jaxb.gen.Expr0NElementq\u0000~\u0000#sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\u000e\u00001\u00bc\u00dfpps"
+"q\u0000~\u0000\u0010\u00001\u00bc\u00d4q\u0000~\u0000\u0014psq\u0000~\u0000\u0015\u00001\u00bc\u00d1q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000%net.s"
+"ourceforge.czt.z.jaxb.gen.OrExprq\u0000~\u0000#sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\u000e\u00001\u00bc\u00df"
+"ppsq\u0000~\u0000\u0010\u00001\u00bc\u00d4q\u0000~\u0000\u0014psq\u0000~\u0000\u0015\u00001\u00bc\u00d1q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00007ne"
+"t.sourceforge.czt.oz.jaxb.gen.PromotedAttrExprElementq\u0000~\u0000#sq"
+"\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\u000e\u00001\u00bc\u00dfppsq\u0000~\u0000\u0010\u00001\u00bc\u00d4q\u0000~\u0000\u0014psq\u0000~\u0000\u0015\u00001\u00bc\u00d1q\u0000~\u0000\u0014pq\u0000~\u0000\u0018"
+"q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000.net.sourceforge.czt.z.jaxb.gen.HideExprEl"
+"ementq\u0000~\u0000#sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\u000e\u00001\u00bc\u00dfppsq\u0000~\u0000\u0010\u00001\u00bc\u00d4q\u0000~\u0000\u0014psq\u0000~\u0000\u0015\u00001\u00bc"
+"\u00d1q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000.net.sourceforge.czt.z.jaxb.ge"
+"n.ApplExprElementq\u0000~\u0000#sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\u000e\u00001\u00bc\u00dfppsq\u0000~\u0000\u0010\u00001\u00bc\u00d4q\u0000~"
+"\u0000\u0014psq\u0000~\u0000\u0015\u00001\u00bc\u00d1q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000-net.sourceforge.c"
+"zt.z.jaxb.gen.NumExprElementq\u0000~\u0000#sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\u000e\u00001\u00bc\u00dfppsq"
+"\u0000~\u0000\u0010\u00001\u00bc\u00d4q\u0000~\u0000\u0014psq\u0000~\u0000\u0015\u00001\u00bc\u00d1q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000-net.so"
+"urceforge.czt.z.jaxb.gen.QntExprElementq\u0000~\u0000#sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000"
+"~\u0000\u000e\u00001\u00bc\u00dfppsq\u0000~\u0000\u0010\u00001\u00bc\u00d4q\u0000~\u0000\u0014psq\u0000~\u0000\u0015\u00001\u00bc\u00d1q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~"
+"\u0000\u001ft\u0000*net.sourceforge.czt.z.jaxb.gen.SetCompExprq\u0000~\u0000#sq\u0000~\u0000\u0000\u00001"
+"\u00bc\u00eapp\u0000sq\u0000~\u0000\u000e\u00001\u00bc\u00dfppsq\u0000~\u0000\u0010\u00001\u00bc\u00d4q\u0000~\u0000\u0014psq\u0000~\u0000\u0015\u00001\u00bc\u00d1q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq"
+"\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000)net.sourceforge.czt.z.jaxb.gen.ExistsExprq\u0000~\u0000#s"
+"q\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\u000e\u00001\u00bc\u00dfppsq\u0000~\u0000\u0010\u00001\u00bc\u00d4q\u0000~\u0000\u0014psq\u0000~\u0000\u0015\u00001\u00bc\u00d1q\u0000~\u0000\u0014pq\u0000~\u0000"
+"\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000&net.sourceforge.czt.z.jaxb.gen.LetExprq\u0000"
+"~\u0000#sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\u000e\u00001\u00bc\u00dfppsq\u0000~\u0000\u0010\u00001\u00bc\u00d4q\u0000~\u0000\u0014psq\u0000~\u0000\u0015\u00001\u00bc\u00d1q\u0000~\u0000\u0014p"
+"q\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000*net.sourceforge.czt.z.jaxb.gen.Exist"
+"s1Exprq\u0000~\u0000#sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\u000e\u00001\u00bc\u00dfppsq\u0000~\u0000\u0010\u00001\u00bc\u00d4q\u0000~\u0000\u0014psq\u0000~\u0000\u0015\u00001"
+"\u00bc\u00d1q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000&net.sourceforge.czt.z.jaxb.g"
+"en.PreExprq\u0000~\u0000#sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\u000e\u00001\u00bc\u00dfppsq\u0000~\u0000\u0010\u00001\u00bc\u00d4q\u0000~\u0000\u0014psq\u0000~"
+"\u0000\u0015\u00001\u00bc\u00d1q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000+net.sourceforge.czt.z.ja"
+"xb.gen.Expr1Elementq\u0000~\u0000#sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\u000e\u00001\u00bc\u00dfppsq\u0000~\u0000\u0010\u00001\u00bc\u00d4q"
+"\u0000~\u0000\u0014psq\u0000~\u0000\u0015\u00001\u00bc\u00d1q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000&net.sourceforge"
+".czt.z.jaxb.gen.IffExprq\u0000~\u0000#sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\u000e\u00001\u00bc\u00dfppsq\u0000~\u0000\u0010\u0000"
+"1\u00bc\u00d4q\u0000~\u0000\u0014psq\u0000~\u0000\u0015\u00001\u00bc\u00d1q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00001net.sourcef"
+"orge.czt.z.jaxb.gen.BindSelExprElementq\u0000~\u0000#sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~"
+"\u0000\u000e\u00001\u00bc\u00dfppsq\u0000~\u0000\u0010\u00001\u00bc\u00d4q\u0000~\u0000\u0014psq\u0000~\u0000\u0015\u00001\u00bc\u00d1q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000"
+"\u001ft\u0000*net.sourceforge.czt.z.jaxb.gen.ImpliesExprq\u0000~\u0000#sq\u0000~\u0000\u0000\u00001\u00bc"
+"\u00eapp\u0000sq\u0000~\u0000\u000e\u00001\u00bc\u00dfppsq\u0000~\u0000\u0010\u00001\u00bc\u00d4q\u0000~\u0000\u0014psq\u0000~\u0000\u0015\u00001\u00bc\u00d1q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000"
+"~\u0000\u001esq\u0000~\u0000\u001ft\u0000(net.sourceforge.czt.z.jaxb.gen.PowerExprq\u0000~\u0000#sq\u0000"
+"~\u0000\u000e\u0001\u00a0aFppsq\u0000~\u0000\u0015\u0001\u00a0a;q\u0000~\u0000\u0014pq\u0000~\u0000)sq\u0000~\u0000\u001fq\u0000~\u0000:q\u0000~\u0000;q\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000\f"
+"NameExprPairq\u0000~\u0000>sr\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/ExpressionPool$Clos"
+"edHash;xpsr\u0000-com.sun.msv.grammar.ExpressionPool$ClosedHash\u00d7j"
+"\u00d0N\u00ef\u00e8\u00ed\u001c\u0002\u0000\u0004I\u0000\u0005countI\u0000\tthresholdL\u0000\u0006parentq\u0000~\u0001\u007f[\u0000\u0005tablet\u0000![Lcom/"
+"sun/msv/grammar/Expression;xp\u0000\u0000\u0000\u008d\u0000\u0000\u0000\u00e6pur\u0000![Lcom.sun.msv.gram"
+"mar.Expression;\u00d68D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp\u0000\u0000\u0002\u00ffppppppppppppppppq\u0000~\u0000Sppppppp"
+"pppppppppq\u0000~\u0000fpppppppppppppppppq\u0000~\u0000Mppppppppppppppppq\u0000~\u0000`ppp"
+"ppppppppppppppq\u0000~\u0000Gppppppq\u0000~\u0000$pppppppppq\u0000~\u0000Zpppppppppppppppp"
+"pq\u0000~\u0000Appppppppppppppppq\u0000~\u0000Tppppppppppppppppq\u0000~\u0000gpppppppppppp"
+"pppppq\u0000~\u0000Nppppppppppppppppq\u0000~\u0000aq\u0000~\u0000\tppppppppppppppppq\u0000~\u0000Hppp"
+"pppppppppppppq\u0000~\u0000[pppppppppppppppppq\u0000~\u0000Bppppppppppppppppq\u0000~\u0000"
+"Uppppppppppppppppq\u0000~\u0000hpppppppppppppppppq\u0000~\u0000Opppppppppppppppp"
+"q\u0000~\u0000bppppppq\u0000~\u0001yppppppppppq\u0000~\u0000Ippppppppppppppppq\u0000~\u0000\\pppppppp"
+"pppppppppq\u0000~\u0000Cppppppppppppppppq\u0000~\u0000Vppppppppppppppppq\u0000~\u0000ipppp"
+"pppppppppppppq\u0000~\u0000Pppppppppppppppppq\u0000~\u0000cpppppppppppppppppq\u0000~\u0000"
+"Jppppppppppppppppq\u0000~\u0000]pppppppppppppppppq\u0000~\u0000Dpppppppppppppppp"
+"q\u0000~\u0000Wppppppppppppppppq\u0000~\u0000jpppppppppppppppppq\u0000~\u0000Qpppppppppppp"
+"ppppq\u0000~\u0000dpppppppppppppppppq\u0000~\u0000Kppppppppppppppppq\u0000~\u0000^pppppppp"
+"pppppppppq\u0000~\u0000Epppppppppppq\u0000~\u0001Eq\u0000~\u0001?q\u0000~\u00019q\u0000~\u00013q\u0000~\u0001-q\u0000~\u0001\'q\u0000~\u0001!"
+"q\u0000~\u0001\u001bq\u0000~\u0001\u0015q\u0000~\u0001\u000fq\u0000~\u0001\tq\u0000~\u0001Dq\u0000~\u0001>q\u0000~\u00018q\u0000~\u00012q\u0000~\u0001,q\u0000~\u0001&q\u0000~\u0001 q\u0000~\u0001\u001a"
+"q\u0000~\u0001\u0014q\u0000~\u0001\u000eq\u0000~\u0001\bq\u0000~\u0001\u0002q\u0000~\u0001\u0003q\u0000~\u0000\u00fcq\u0000~\u0000\u00fdq\u0000~\u0000\u00f6q\u0000~\u0000\u00f7q\u0000~\u0000\u00f0q\u0000~\u0000\u00f1q\u0000~\u0000\u00ea"
+"q\u0000~\u0000\u00ebq\u0000~\u0000\u00e4q\u0000~\u0000\u00e5q\u0000~\u0000\u00deq\u0000~\u0000\u00dfq\u0000~\u0000\u00d8q\u0000~\u0000\u00d9q\u0000~\u0000sq\u0000~\u0000yq\u0000~\u0000\u007fq\u0000~\u0000\u0085q\u0000~\u0000\u008b"
+"q\u0000~\u0000\u0091q\u0000~\u0000\u0097q\u0000~\u0000\u009dq\u0000~\u0000\u000fq\u0000~\u0000lq\u0000~\u0000rq\u0000~\u0000xq\u0000~\u0000~q\u0000~\u0000\u0084q\u0000~\u0000\u008aq\u0000~\u0000\u0090q\u0000~\u0000\u0096"
+"q\u0000~\u0000\u009cq\u0000~\u0000\u00a2q\u0000~\u0000\u00a8q\u0000~\u0000\u00aeq\u0000~\u0000\u00b4q\u0000~\u0000\u00baq\u0000~\u0000\u00c0q\u0000~\u0000\u00c6q\u0000~\u0000\u00ccq\u0000~\u0000\u00d2q\u0000~\u0000\u00a3q\u0000~\u0000\u00a9"
+"q\u0000~\u0000\u00afq\u0000~\u0000\u00b5q\u0000~\u0000\u00bbq\u0000~\u0000\u00c1q\u0000~\u0000\u00c7q\u0000~\u0000\u00cdq\u0000~\u0000\u00d3q\u0000~\u0000\u0012q\u0000~\u0000Lq\u0000~\u0000mq\u0000~\u0000Xq\u0000~\u0000e"
+"q\u0000~\u0000Rq\u0000~\u0001Kq\u0000~\u0001Jq\u0000~\u0001Qq\u0000~\u0001Pq\u0000~\u0001Wq\u0000~\u0001Vq\u0000~\u0001]q\u0000~\u0001\\q\u0000~\u0001cq\u0000~\u0001bq\u0000~\u0001i"
+"q\u0000~\u0001hq\u0000~\u0000_q\u0000~\u0001oq\u0000~\u0001nq\u0000~\u0001uq\u0000~\u0001tq\u0000~\u0000?q\u0000~\u0000\npppppppppppq\u0000~\u0000Fpppp"
+"pppppq\u0000~\u0000\fppppppq\u0000~\u0000Ypppppppppppppppppq\u0000~\u0000@"));
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
            return net.sourceforge.czt.z.jaxb.gen.impl.NameExprPairElementImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  1 :
                        if (("Name" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.NameExprPairImpl)net.sourceforge.czt.z.jaxb.gen.impl.NameExprPairElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        break;
                    case  0 :
                        if (("NameExprPair" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
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
                    case  2 :
                        if (("NameExprPair" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
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
