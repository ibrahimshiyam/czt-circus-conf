//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2004.01.05 at 10:33:20 NZDT 
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
+"Reducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0003xp89Z\u008ep"
+"p\u0000sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun."
+"msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~"
+"\u0000\u000489Z\u0083ppsq\u0000~\u0000\u00076\u00b2\u00a4+ppsq\u0000~\u0000\u0000\u0002_UQpp\u0000sq\u0000~\u0000\u0007\u0002_UFppsq\u0000~\u0000\u0000\u0001F\u00b6\u00fdpp\u0000sr"
+"\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\b\u0001F\u00b6\u00f2ppsr\u0000 co"
+"m.sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.gra"
+"mmar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0003xq\u0000~\u0000\u0004\u0001F\u00b6\u00e7sr\u0000\u0011java.lang.B"
+"oolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psr\u0000 com.sun.msv.grammar.Attribu"
+"teExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0003L\u0000\tnameClassq\u0000~\u0000\u0001xq\u0000~\u0000\u0004\u0001F\u00b6\u00e4q\u0000~\u0000\u0014p"
+"sr\u00002com.sun.msv.grammar.Expression$AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\bsq\u0000~\u0000\u0013\u0001q\u0000~\u0000\u0018sr\u0000 com.sun.msv.grammar.AnyNameCl"
+"ass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xp"
+"sr\u00000com.sun.msv.grammar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001"
+"\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\tq\u0000~\u0000\u0019q\u0000~\u0000\u001esr\u0000#com.sun.msv.grammar.SimpleNameCla"
+"ss\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/String;L\u0000\fnamespaceUR"
+"Iq\u0000~\u0000 xq\u0000~\u0000\u001bt\u0000\'net.sourceforge.czt.z.jaxb.gen.DeclNamet\u0000+htt"
+"p://java.sun.com/jaxb/xjc/dummy-elementssq\u0000~\u0000\u000e\u0001\u0018\u009eDppsq\u0000~\u0000\u0015\u0001\u0018"
+"\u009e9q\u0000~\u0000\u0014psr\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLo"
+"rg/relaxng/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0003L\u0000\u0004namet\u0000\u001dLcom/su"
+"n/msv/util/StringPair;xq\u0000~\u0000\u0004\u00005\u00e6\u00f3ppsr\u0000\"com.sun.msv.datatype.x"
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
+"rceforge.net/zmlsq\u0000~\u0000\u000e4SN\u00d5ppsq\u0000~\u0000\u000e3\f\u0097\u00d6ppsq\u0000~\u0000\u000e1\u00c5\u00e0\u00d7ppsq\u0000~\u0000\u000e0\u007f"
+")\u00d8ppsq\u0000~\u0000\u000e/8r\u00d9ppsq\u0000~\u0000\u000e-\u00f1\u00bb\u00dappsq\u0000~\u0000\u000e,\u00ab\u0004\u00dbppsq\u0000~\u0000\u000e+dM\u00dcppsq\u0000~\u0000\u000e*\u001d"
+"\u0096\u00ddppsq\u0000~\u0000\u000e(\u00d6\u00df\u00deppsq\u0000~\u0000\u000e\'\u0090(\u00dfppsq\u0000~\u0000\u000e&Iq\u00e0ppsq\u0000~\u0000\u000e%\u0002\u00ba\u00e1ppsq\u0000~\u0000\u000e#\u00bc"
+"\u0003\u00e2ppsq\u0000~\u0000\u000e\"uL\u00e3ppsq\u0000~\u0000\u000e!.\u0095\u00e4ppsq\u0000~\u0000\u000e\u001f\u00e7\u00de\u00e5ppsq\u0000~\u0000\u000e\u001e\u00a1\'\u00e6ppsq\u0000~\u0000\u000e\u001dZ"
+"p\u00e7ppsq\u0000~\u0000\u000e\u001c\u0013\u00b9\u00e8ppsq\u0000~\u0000\u000e\u001a\u00cd\u0002\u00e9ppsq\u0000~\u0000\u000e\u0019\u0086K\u00eappsq\u0000~\u0000\u000e\u0018?\u0094\u00ebppsq\u0000~\u0000\u000e\u0016\u00f8"
+"\u00dd\u00ecppsq\u0000~\u0000\u000e\u0015\u00b2&\u00edppsq\u0000~\u0000\u000e\u0014ko\u00eeppsq\u0000~\u0000\u000e\u0013$\u00b8\u00efppsq\u0000~\u0000\u000e\u0011\u00de\u0001\u00f0ppsq\u0000~\u0000\u000e\u0010\u0097"
+"J\u00f1ppsq\u0000~\u0000\u000e\u000fP\u0093\u00f2ppsq\u0000~\u0000\u000e\u000e\t\u00dc\u00f3ppsq\u0000~\u0000\u000e\f\u00c3%\u00f4ppsq\u0000~\u0000\u000e\u000b|n\u00f5ppsq\u0000~\u0000\u000e\n5"
+"\u00b7\u00f6ppsq\u0000~\u0000\u000e\b\u00ef\u0000\u00f7ppsq\u0000~\u0000\u000e\u0007\u00a8I\u00f8ppsq\u0000~\u0000\u000e\u0006a\u0092\u00f9ppsq\u0000~\u0000\u000e\u0005\u001a\u00db\u00fappsq\u0000~\u0000\u000e\u0003\u00d4"
+"$\u00fbppsq\u0000~\u0000\u000e\u0002\u008dm\u00fcppsq\u0000~\u0000\u0000\u0001F\u00b6\u00fdpp\u0000sq\u0000~\u0000\u000e\u0001F\u00b6\u00f2ppsq\u0000~\u0000\u0010\u0001F\u00b6\u00e7q\u0000~\u0000\u0014psq\u0000"
+"~\u0000\u0015\u0001F\u00b6\u00e4q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000.net.sourceforge.czt.z.j"
+"axb.gen.ApplExprElementq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001F\u00b6\u00fdpp\u0000sq\u0000~\u0000\u000e\u0001F\u00b6\u00f2ppsq\u0000~\u0000\u0010\u0001"
+"F\u00b6\u00e7q\u0000~\u0000\u0014psq\u0000~\u0000\u0015\u0001F\u00b6\u00e4q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00001net.sourcef"
+"orge.czt.z.jaxb.gen.BindSelExprElementq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001F\u00b6\u00fdpp\u0000sq\u0000~"
+"\u0000\u000e\u0001F\u00b6\u00f2ppsq\u0000~\u0000\u0010\u0001F\u00b6\u00e7q\u0000~\u0000\u0014psq\u0000~\u0000\u0015\u0001F\u00b6\u00e4q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000"
+"\u001ft\u0000)net.sourceforge.czt.z.jaxb.gen.ExistsExprq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001F\u00b6\u00fd"
+"pp\u0000sq\u0000~\u0000\u000e\u0001F\u00b6\u00f2ppsq\u0000~\u0000\u0010\u0001F\u00b6\u00e7q\u0000~\u0000\u0014psq\u0000~\u0000\u0015\u0001F\u00b6\u00e4q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~"
+"\u0000\u001esq\u0000~\u0000\u001ft\u0000&net.sourceforge.czt.z.jaxb.gen.SetExprq\u0000~\u0000#sq\u0000~\u0000\u0000"
+"\u0001F\u00b6\u00fdpp\u0000sq\u0000~\u0000\u000e\u0001F\u00b6\u00f2ppsq\u0000~\u0000\u0010\u0001F\u00b6\u00e7q\u0000~\u0000\u0014psq\u0000~\u0000\u0015\u0001F\u00b6\u00e4q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000"
+"\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000-net.sourceforge.czt.z.jaxb.gen.SchExprElement"
+"q\u0000~\u0000#sq\u0000~\u0000\u0000\u0001F\u00b6\u00fdpp\u0000sq\u0000~\u0000\u000e\u0001F\u00b6\u00f2ppsq\u0000~\u0000\u0010\u0001F\u00b6\u00e7q\u0000~\u0000\u0014psq\u0000~\u0000\u0015\u0001F\u00b6\u00e4q\u0000~\u0000"
+"\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000-net.sourceforge.czt.z.jaxb.gen.Ref"
+"ExprElementq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001F\u00b6\u00fdpp\u0000sq\u0000~\u0000\u000e\u0001F\u00b6\u00f2ppsq\u0000~\u0000\u0010\u0001F\u00b6\u00e7q\u0000~\u0000\u0014psq\u0000"
+"~\u0000\u0015\u0001F\u00b6\u00e4q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000.net.sourceforge.czt.z.j"
+"axb.gen.CondExprElementq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001F\u00b6\u00fdpp\u0000sq\u0000~\u0000\u000e\u0001F\u00b6\u00f2ppsq\u0000~\u0000\u0010\u0001"
+"F\u00b6\u00e7q\u0000~\u0000\u0014psq\u0000~\u0000\u0015\u0001F\u00b6\u00e4q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000-net.sourcef"
+"orge.czt.z.jaxb.gen.NumExprElementq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001F\u00b6\u00fdpp\u0000sq\u0000~\u0000\u000e\u0001F"
+"\u00b6\u00f2ppsq\u0000~\u0000\u0010\u0001F\u00b6\u00e7q\u0000~\u0000\u0014psq\u0000~\u0000\u0015\u0001F\u00b6\u00e4q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000)"
+"net.sourceforge.czt.z.jaxb.gen.LambdaExprq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001F\u00b6\u00fdpp\u0000s"
+"q\u0000~\u0000\u000e\u0001F\u00b6\u00f2ppsq\u0000~\u0000\u0010\u0001F\u00b6\u00e7q\u0000~\u0000\u0014psq\u0000~\u0000\u0015\u0001F\u00b6\u00e4q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq"
+"\u0000~\u0000\u001ft\u0000(net.sourceforge.czt.z.jaxb.gen.PowerExprq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001F"
+"\u00b6\u00fdpp\u0000sq\u0000~\u0000\u000e\u0001F\u00b6\u00f2ppsq\u0000~\u0000\u0010\u0001F\u00b6\u00e7q\u0000~\u0000\u0014psq\u0000~\u0000\u0015\u0001F\u00b6\u00e4q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq"
+"\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000&net.sourceforge.czt.z.jaxb.gen.LetExprq\u0000~\u0000#sq\u0000~"
+"\u0000\u0000\u0001F\u00b6\u00fdpp\u0000sq\u0000~\u0000\u000e\u0001F\u00b6\u00f2ppsq\u0000~\u0000\u0010\u0001F\u00b6\u00e7q\u0000~\u0000\u0014psq\u0000~\u0000\u0015\u0001F\u00b6\u00e4q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000"
+"~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000(net.sourceforge.czt.z.jaxb.gen.TupleExprq\u0000~"
+"\u0000#sq\u0000~\u0000\u0000\u0001F\u00b6\u00fdpp\u0000sq\u0000~\u0000\u000e\u0001F\u00b6\u00f2ppsq\u0000~\u0000\u0010\u0001F\u00b6\u00e7q\u0000~\u0000\u0014psq\u0000~\u0000\u0015\u0001F\u00b6\u00e4q\u0000~\u0000\u0014pq"
+"\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000*net.sourceforge.czt.z.jaxb.gen.Exists"
+"1Exprq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001F\u00b6\u00fdpp\u0000sq\u0000~\u0000\u000e\u0001F\u00b6\u00f2ppsq\u0000~\u0000\u0010\u0001F\u00b6\u00e7q\u0000~\u0000\u0014psq\u0000~\u0000\u0015\u0001F\u00b6"
+"\u00e4q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000.net.sourceforge.czt.z.jaxb.ge"
+"n.BindExprElementq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001F\u00b6\u00fdpp\u0000sq\u0000~\u0000\u000e\u0001F\u00b6\u00f2ppsq\u0000~\u0000\u0010\u0001F\u00b6\u00e7q\u0000~"
+"\u0000\u0014psq\u0000~\u0000\u0015\u0001F\u00b6\u00e4q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000%net.sourceforge.c"
+"zt.z.jaxb.gen.OrExprq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001F\u00b6\u00fdpp\u0000sq\u0000~\u0000\u000e\u0001F\u00b6\u00f2ppsq\u0000~\u0000\u0010\u0001F\u00b6\u00e7"
+"q\u0000~\u0000\u0014psq\u0000~\u0000\u0015\u0001F\u00b6\u00e4q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000/net.sourceforg"
+"e.czt.z.jaxb.gen.DecorExprElementq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001F\u00b6\u00fdpp\u0000sq\u0000~\u0000\u000e\u0001F\u00b6"
+"\u00f2ppsq\u0000~\u0000\u0010\u0001F\u00b6\u00e7q\u0000~\u0000\u0014psq\u0000~\u0000\u0015\u0001F\u00b6\u00e4q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000\'n"
+"et.sourceforge.czt.z.jaxb.gen.ProdExprq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001F\u00b6\u00fdpp\u0000sq\u0000~"
+"\u0000\u000e\u0001F\u00b6\u00f2ppsq\u0000~\u0000\u0010\u0001F\u00b6\u00e7q\u0000~\u0000\u0014psq\u0000~\u0000\u0015\u0001F\u00b6\u00e4q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000"
+"\u001ft\u0000&net.sourceforge.czt.z.jaxb.gen.PreExprq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001F\u00b6\u00fdpp\u0000"
+"sq\u0000~\u0000\u000e\u0001F\u00b6\u00f2ppsq\u0000~\u0000\u0010\u0001F\u00b6\u00e7q\u0000~\u0000\u0014psq\u0000~\u0000\u0015\u0001F\u00b6\u00e4q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001es"
+"q\u0000~\u0000\u001ft\u0000\'net.sourceforge.czt.z.jaxb.gen.PipeExprq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001F"
+"\u00b6\u00fdpp\u0000sq\u0000~\u0000\u000e\u0001F\u00b6\u00f2ppsq\u0000~\u0000\u0010\u0001F\u00b6\u00e7q\u0000~\u0000\u0014psq\u0000~\u0000\u0015\u0001F\u00b6\u00e4q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq"
+"\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000%net.sourceforge.czt.z.jaxb.gen.MuExprq\u0000~\u0000#sq\u0000~\u0000"
+"\u0000\u0001F\u00b6\u00fdpp\u0000sq\u0000~\u0000\u000e\u0001F\u00b6\u00f2ppsq\u0000~\u0000\u0010\u0001F\u00b6\u00e7q\u0000~\u0000\u0014psq\u0000~\u0000\u0015\u0001F\u00b6\u00e4q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~"
+"\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000)net.sourceforge.czt.z.jaxb.gen.ForallExprq\u0000~"
+"\u0000#sq\u0000~\u0000\u0000\u0001F\u00b6\u00fdpp\u0000sq\u0000~\u0000\u000e\u0001F\u00b6\u00f2ppsq\u0000~\u0000\u0010\u0001F\u00b6\u00e7q\u0000~\u0000\u0014psq\u0000~\u0000\u0015\u0001F\u00b6\u00e4q\u0000~\u0000\u0014pq"
+"\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000,net.sourceforge.czt.z.jaxb.gen.Expr2N"
+"Elementq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001F\u00b6\u00fdpp\u0000sq\u0000~\u0000\u000e\u0001F\u00b6\u00f2ppsq\u0000~\u0000\u0010\u0001F\u00b6\u00e7q\u0000~\u0000\u0014psq\u0000~\u0000\u0015\u0001"
+"F\u00b6\u00e4q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000.net.sourceforge.czt.z.jaxb."
+"gen.Qnt1ExprElementq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001F\u00b6\u00fdpp\u0000sq\u0000~\u0000\u000e\u0001F\u00b6\u00f2ppsq\u0000~\u0000\u0010\u0001F\u00b6\u00e7q"
+"\u0000~\u0000\u0014psq\u0000~\u0000\u0015\u0001F\u00b6\u00e4q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000*net.sourceforge"
+".czt.z.jaxb.gen.SetCompExprq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001F\u00b6\u00fdpp\u0000sq\u0000~\u0000\u000e\u0001F\u00b6\u00f2ppsq\u0000"
+"~\u0000\u0010\u0001F\u00b6\u00e7q\u0000~\u0000\u0014psq\u0000~\u0000\u0015\u0001F\u00b6\u00e4q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000\'net.sou"
+"rceforge.czt.z.jaxb.gen.ProjExprq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001F\u00b6\u00fdpp\u0000sq\u0000~\u0000\u000e\u0001F\u00b6\u00f2"
+"ppsq\u0000~\u0000\u0010\u0001F\u00b6\u00e7q\u0000~\u0000\u0014psq\u0000~\u0000\u0015\u0001F\u00b6\u00e4q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000.ne"
+"t.sourceforge.czt.z.jaxb.gen.SchExpr2Elementq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001F\u00b6\u00fdp"
+"p\u0000sq\u0000~\u0000\u000e\u0001F\u00b6\u00f2ppsq\u0000~\u0000\u0010\u0001F\u00b6\u00e7q\u0000~\u0000\u0014psq\u0000~\u0000\u0015\u0001F\u00b6\u00e4q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000"
+"\u001esq\u0000~\u0000\u001ft\u0000\'net.sourceforge.czt.z.jaxb.gen.CompExprq\u0000~\u0000#sq\u0000~\u0000\u0000"
+"\u0001F\u00b6\u00fdpp\u0000sq\u0000~\u0000\u000e\u0001F\u00b6\u00f2ppsq\u0000~\u0000\u0010\u0001F\u00b6\u00e7q\u0000~\u0000\u0014psq\u0000~\u0000\u0015\u0001F\u00b6\u00e4q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000"
+"\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00004net.sourceforge.czt.tcoz.jaxb.gen.ChannelExpr"
+"Elementq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001F\u00b6\u00fdpp\u0000sq\u0000~\u0000\u000e\u0001F\u00b6\u00f2ppsq\u0000~\u0000\u0010\u0001F\u00b6\u00e7q\u0000~\u0000\u0014psq\u0000~\u0000\u0015\u0001"
+"F\u00b6\u00e4q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000&net.sourceforge.czt.z.jaxb."
+"gen.IffExprq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001F\u00b6\u00fdpp\u0000sq\u0000~\u0000\u000e\u0001F\u00b6\u00f2ppsq\u0000~\u0000\u0010\u0001F\u00b6\u00e7q\u0000~\u0000\u0014psq\u0000"
+"~\u0000\u0015\u0001F\u00b6\u00e4q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000+net.sourceforge.czt.z.j"
+"axb.gen.Expr1Elementq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001F\u00b6\u00fdpp\u0000sq\u0000~\u0000\u000e\u0001F\u00b6\u00f2ppsq\u0000~\u0000\u0010\u0001F\u00b6\u00e7"
+"q\u0000~\u0000\u0014psq\u0000~\u0000\u0015\u0001F\u00b6\u00e4q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00003net.sourceforg"
+"e.czt.zpatt.jaxb.gen.JokerExprElementq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001F\u00b6\u00fdpp\u0000sq\u0000~\u0000"
+"\u000e\u0001F\u00b6\u00f2ppsq\u0000~\u0000\u0010\u0001F\u00b6\u00e7q\u0000~\u0000\u0014psq\u0000~\u0000\u0015\u0001F\u00b6\u00e4q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001f"
+"t\u0000&net.sourceforge.czt.z.jaxb.gen.NegExprq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001F\u00b6\u00fdpp\u0000s"
+"q\u0000~\u0000\u000e\u0001F\u00b6\u00f2ppsq\u0000~\u0000\u0010\u0001F\u00b6\u00e7q\u0000~\u0000\u0014psq\u0000~\u0000\u0015\u0001F\u00b6\u00e4q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq"
+"\u0000~\u0000\u001ft\u00002net.sourceforge.czt.z.jaxb.gen.TupleSelExprElementq\u0000~"
+"\u0000#sq\u0000~\u0000\u0000\u0001F\u00b6\u00fdpp\u0000sq\u0000~\u0000\u000e\u0001F\u00b6\u00f2ppsq\u0000~\u0000\u0010\u0001F\u00b6\u00e7q\u0000~\u0000\u0014psq\u0000~\u0000\u0015\u0001F\u00b6\u00e4q\u0000~\u0000\u0014pq"
+"\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000+net.sourceforge.czt.z.jaxb.gen.Expr2E"
+"lementq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001F\u00b6\u00fdpp\u0000sq\u0000~\u0000\u000e\u0001F\u00b6\u00f2ppsq\u0000~\u0000\u0010\u0001F\u00b6\u00e7q\u0000~\u0000\u0014psq\u0000~\u0000\u0015\u0001F"
+"\u00b6\u00e4q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000*net.sourceforge.czt.z.jaxb.g"
+"en.ImpliesExprq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001F\u00b6\u00fdpp\u0000sq\u0000~\u0000\u000e\u0001F\u00b6\u00f2ppsq\u0000~\u0000\u0010\u0001F\u00b6\u00e7q\u0000~\u0000\u0014p"
+"sq\u0000~\u0000\u0015\u0001F\u00b6\u00e4q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000,net.sourceforge.czt."
+"z.jaxb.gen.Expr0NElementq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001F\u00b6\u00fdpp\u0000sq\u0000~\u0000\u000e\u0001F\u00b6\u00f2ppsq\u0000~\u0000\u0010"
+"\u0001F\u00b6\u00e7q\u0000~\u0000\u0014psq\u0000~\u0000\u0015\u0001F\u00b6\u00e4q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000-net.source"
+"forge.czt.z.jaxb.gen.QntExprElementq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001F\u00b6\u00fdpp\u0000sq\u0000~\u0000\u000e\u0001"
+"F\u00b6\u00f2ppsq\u0000~\u0000\u0010\u0001F\u00b6\u00e7q\u0000~\u0000\u0014psq\u0000~\u0000\u0015\u0001F\u00b6\u00e4q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000"
+"/net.sourceforge.czt.z.jaxb.gen.ThetaExprElementq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001"
+"F\u00b6\u00fdpp\u0000sq\u0000~\u0000\u000e\u0001F\u00b6\u00f2ppsq\u0000~\u0000\u0010\u0001F\u00b6\u00e7q\u0000~\u0000\u0014psq\u0000~\u0000\u0015\u0001F\u00b6\u00e4q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001c"
+"q\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000&net.sourceforge.czt.z.jaxb.gen.AndExprq\u0000~\u0000#sq\u0000"
+"~\u0000\u0000\u0001F\u00b6\u00fdpp\u0000sq\u0000~\u0000\u000e\u0001F\u00b6\u00f2ppsq\u0000~\u0000\u0010\u0001F\u00b6\u00e7q\u0000~\u0000\u0014psq\u0000~\u0000\u0015\u0001F\u00b6\u00e4q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q"
+"\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000.net.sourceforge.czt.z.jaxb.gen.HideExprEle"
+"mentq\u0000~\u0000#sq\u0000~\u0000\u0000\u0001F\u00b6\u00fdpp\u0000sq\u0000~\u0000\u000e\u0001F\u00b6\u00f2ppsq\u0000~\u0000\u0010\u0001F\u00b6\u00e7q\u0000~\u0000\u0014psq\u0000~\u0000\u0015\u0001F\u00b6\u00e4"
+"q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00000net.sourceforge.czt.z.jaxb.gen"
+".RenameExprElementq\u0000~\u0000#sq\u0000~\u0000\u000e\u0001\u0086\u00b6Sppsq\u0000~\u0000\u0015\u0001\u0086\u00b6Hq\u0000~\u0000\u0014pq\u0000~\u0000)sq\u0000~"
+"\u0000\u001fq\u0000~\u0000:q\u0000~\u0000;q\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000\fNameExprPairq\u0000~\u0000>sr\u0000\"com.sun.msv.g"
+"rammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/g"
+"rammar/ExpressionPool$ClosedHash;xpsr\u0000-com.sun.msv.grammar.E"
+"xpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0002\u0000\u0004I\u0000\u0005countI\u0000\tthresholdL\u0000\u0006pa"
+"rentq\u0000~\u0001c[\u0000\u0005tablet\u0000![Lcom/sun/msv/grammar/Expression;xp\u0000\u0000\u0000\u0081\u0000"
+"\u0000\u0000\u00e6pur\u0000![Lcom.sun.msv.grammar.Expression;\u00d68D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp\u0000\u0000\u0002\u00ffq\u0000"
+"~\u0000\u00ecq\u0000~\u0000\u00e6q\u0000~\u0000\u00e0q\u0000~\u0000\u00daq\u0000~\u0000\u00d4q\u0000~\u0000{q\u0000~\u0000\u0081q\u0000~\u0000\u0087q\u0000~\u0000\u008dq\u0000~\u0000\u000fq\u0000~\u0000hq\u0000~\u0000nq\u0000"
+"~\u0000tq\u0000~\u0000zq\u0000~\u0000\u0080q\u0000~\u0000\u0086q\u0000~\u0000\u008cq\u0000~\u0000\u0092q\u0000~\u0000\u0098q\u0000~\u0000\u009eq\u0000~\u0000\u00a4q\u0000~\u0000\u00aaq\u0000~\u0000\u00b0q\u0000~\u0000\u00b6q\u0000"
+"~\u0000\u00bcq\u0000~\u0000\u00c2q\u0000~\u0000\u00c8q\u0000~\u0000\u00ceq\u0000~\u0000\u0093q\u0000~\u0000\u0099q\u0000~\u0000\u009fq\u0000~\u0000\u00a5q\u0000~\u0000\u00abq\u0000~\u0000\u00b1q\u0000~\u0000\u00b7q\u0000~\u0000\u00bdq\u0000"
+"~\u0000\u00c3q\u0000~\u0000\u00c9q\u0000~\u0000\u00cfq\u0000~\u0000fq\u0000~\u0000eq\u0000~\u0001@q\u0000~\u0000dq\u0000~\u0001Aq\u0000~\u0001:q\u0000~\u0001;q\u0000~\u00014q\u0000~\u00015q\u0000"
+"~\u0001.q\u0000~\u0001/q\u0000~\u0001(q\u0000~\u0001)q\u0000~\u0001\"q\u0000~\u0000cq\u0000~\u0001#q\u0000~\u0001\u001cq\u0000~\u0001\u001dq\u0000~\u0001\u0016q\u0000~\u0001\u0017q\u0000~\u0001\u0010q\u0000"
+"~\u0001\u0011q\u0000~\u0001\nq\u0000~\u0001\u000bq\u0000~\u0001\u0004q\u0000~\u0000bq\u0000~\u0001\u0005q\u0000~\u0000\u00feq\u0000~\u0000\u00ffq\u0000~\u0001Gq\u0000~\u0001Fq\u0000~\u0001Mq\u0000~\u0001Lq\u0000"
+"~\u0001Sq\u0000~\u0001Rq\u0000~\u0001Yq\u0000~\u0000aq\u0000~\u0001Xpppppppppq\u0000~\u0000`ppppppppppq\u0000~\u0000_pppppppp"
+"ppq\u0000~\u0000^ppppppppppq\u0000~\u0000]ppppppppppq\u0000~\u0000\\ppppppppppq\u0000~\u0000[q\u0000~\u0000\tppp"
+"ppppppq\u0000~\u0000Zppppppppppq\u0000~\u0000Yppppppppppq\u0000~\u0000Xppppppppppq\u0000~\u0000Wpq\u0000~"
+"\u0001]ppppppppq\u0000~\u0000Vppppppppppq\u0000~\u0000Uppppppppppq\u0000~\u0000Tppppppppppq\u0000~\u0000S"
+"pppppppq\u0000~\u0000$ppq\u0000~\u0000Rppppppppppq\u0000~\u0000\fq\u0000~\u0000Qpppppppppq\u0000~\u0000Pppppppp"
+"pppq\u0000~\u0000Oppppppppppq\u0000~\u0000Nppppppppppq\u0000~\u0000Mppppppppppq\u0000~\u0000Lppppppp"
+"pppq\u0000~\u0000Kppppppppppq\u0000~\u0000Jppppppppppq\u0000~\u0000Ippppppppppq\u0000~\u0000Hppppppp"
+"pppq\u0000~\u0000Gppppppppppq\u0000~\u0000Fppppppppppq\u0000~\u0000Eppppppppppq\u0000~\u0000Dppppppp"
+"pppq\u0000~\u0000Cppppppppppq\u0000~\u0000Bppppppppppq\u0000~\u0000Appppppppppq\u0000~\u0000@ppppppp"
+"pppq\u0000~\u0000?pppppppppppppppppppppppppppppppppppppppppppppppppppp"
+"pppppppppppppppppppppppppppppppppppppppppppppppppppppppppppp"
+"pppppppppppppppppppppppppppppppppppppppppppppppppppppppppppp"
+"pppppppppppppppppppppppppppppppppppppppppppppppppppppppppppp"
+"ppppppppppppppppppppppppppppppppppq\u0000~\u0000\nppppppppppppppppppppp"
+"ppppppppppppppppq\u0000~\u0000\u00f9q\u0000~\u0000\u00f3q\u0000~\u0000\u00edq\u0000~\u0000\u00e7q\u0000~\u0000\u00e1q\u0000~\u0000\u00dbq\u0000~\u0000\u00d5q\u0000~\u0000\u0012q\u0000~\u0000"
+"iq\u0000~\u0000oq\u0000~\u0000uq\u0000~\u0000\u00f8q\u0000~\u0000\u00f2"));
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
                    case  0 :
                        if (("NameExprPair" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 1;
                            return ;
                        }
                        break;
                    case  1 :
                        if (("Name" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.NameExprPairImpl)net.sourceforge.czt.z.jaxb.gen.impl.NameExprPairElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
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
