//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2005.02.24 at 01:10:48 GMT 
//


package net.sourceforge.czt.z.jaxb.gen.impl;

public class NameExprPairElementImpl
    extends net.sourceforge.czt.z.jaxb.gen.impl.NameExprPairImpl
    implements net.sourceforge.czt.z.jaxb.gen.NameExprPairElement, com.sun.xml.bind.RIElement, com.sun.xml.bind.JAXBObject, net.sourceforge.czt.circus.jaxb.gen.impl.runtime.UnmarshallableObject, net.sourceforge.czt.circus.jaxb.gen.impl.runtime.XMLSerializable, net.sourceforge.czt.circus.jaxb.gen.impl.runtime.ValidatableObject
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

    public net.sourceforge.czt.circus.jaxb.gen.impl.runtime.UnmarshallingEventHandler createUnmarshaller(net.sourceforge.czt.circus.jaxb.gen.impl.runtime.UnmarshallingContext context) {
        return new net.sourceforge.czt.z.jaxb.gen.impl.NameExprPairElementImpl.Unmarshaller(context);
    }

    public void serializeBody(net.sourceforge.czt.circus.jaxb.gen.impl.runtime.XMLSerializer context)
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

    public void serializeAttributes(net.sourceforge.czt.circus.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public void serializeURIs(net.sourceforge.czt.circus.jaxb.gen.impl.runtime.XMLSerializer context)
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
+"msv.grammar.Expression\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Lj"
+"ava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0003xppp\u0000sr\u0000\u001fcom.sun.msv.gra"
+"mmar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.BinaryExp"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~\u0000\u0004ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000"
+"sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000"
+"\u0000xq\u0000~\u0000\bppsr\u0000 com.sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001c"
+"com.sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0003xq\u0000~\u0000\u0004sr\u0000\u0011"
+"java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psr\u0000 com.sun.msv.gram"
+"mar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0003L\u0000\tnameClassq\u0000~\u0000\u0001xq\u0000~\u0000"
+"\u0004q\u0000~\u0000\u0014psr\u00002com.sun.msv.grammar.Expression$AnyStringExpressio"
+"n\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004sq\u0000~\u0000\u0013\u0001q\u0000~\u0000\u0018sr\u0000 com.sun.msv.grammar.AnyNam"
+"eClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000"
+"\u0000xpsr\u00000com.sun.msv.grammar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004q\u0000~\u0000\u0019q\u0000~\u0000\u001esr\u0000#com.sun.msv.grammar.SimpleNameClas"
+"s\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/String;L\u0000\fnamespaceURI"
+"q\u0000~\u0000 xq\u0000~\u0000\u001bt\u0000\'net.sourceforge.czt.z.jaxb.gen.DeclNamet\u0000+http"
+"://java.sun.com/jaxb/xjc/dummy-elementssq\u0000~\u0000\u000eppsq\u0000~\u0000\u0015q\u0000~\u0000\u0014ps"
+"r\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxn"
+"g/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0003L\u0000\u0004namet\u0000\u001dLcom/sun/msv/uti"
+"l/StringPair;xq\u0000~\u0000\u0004ppsr\u0000\"com.sun.msv.datatype.xsd.QnameType\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000x"
+"r\u0000\'com.sun.msv.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fname"
+"spaceUriq\u0000~\u0000 L\u0000\btypeNameq\u0000~\u0000 L\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/da"
+"tatype/xsd/WhiteSpaceProcessor;xpt\u0000 http://www.w3.org/2001/X"
+"MLSchemat\u0000\u0005QNamesr\u00005com.sun.msv.datatype.xsd.WhiteSpaceProce"
+"ssor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.WhiteSp"
+"aceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$"
+"NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004q\u0000~\u0000\u0014psr\u0000\u001bcom.sun.msv.util"
+".StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000 L\u0000\fnamespaceURIq\u0000~\u0000 x"
+"pq\u0000~\u00001q\u0000~\u00000sq\u0000~\u0000\u001ft\u0000\u0004typet\u0000)http://www.w3.org/2001/XMLSchema-"
+"instanceq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000\u0004Namet\u0000\u001ehttp://czt.sourceforge.net/zmls"
+"q\u0000~\u0000\u000eppsq\u0000~\u0000\u000eppsq\u0000~\u0000\u000eppsq\u0000~\u0000\u000eppsq\u0000~\u0000\u000eppsq\u0000~\u0000\u000eppsq\u0000~\u0000\u000eppsq\u0000~\u0000"
+"\u000eppsq\u0000~\u0000\u000eppsq\u0000~\u0000\u000eppsq\u0000~\u0000\u000eppsq\u0000~\u0000\u000eppsq\u0000~\u0000\u000eppsq\u0000~\u0000\u000eppsq\u0000~\u0000\u000epps"
+"q\u0000~\u0000\u000eppsq\u0000~\u0000\u000eppsq\u0000~\u0000\u000eppsq\u0000~\u0000\u000eppsq\u0000~\u0000\u000eppsq\u0000~\u0000\u000eppsq\u0000~\u0000\u000eppsq\u0000~\u0000"
+"\u000eppsq\u0000~\u0000\u000eppsq\u0000~\u0000\u000eppsq\u0000~\u0000\u000eppsq\u0000~\u0000\u000eppsq\u0000~\u0000\u000eppsq\u0000~\u0000\u000eppsq\u0000~\u0000\u000epps"
+"q\u0000~\u0000\u000eppsq\u0000~\u0000\u000eppsq\u0000~\u0000\u000eppsq\u0000~\u0000\u000eppsq\u0000~\u0000\u000eppsq\u0000~\u0000\u000eppsq\u0000~\u0000\u000eppsq\u0000~\u0000"
+"\u000eppsq\u0000~\u0000\u000eppsq\u0000~\u0000\u000eppsq\u0000~\u0000\u000eppsq\u0000~\u0000\u000eppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000eppsq\u0000~\u0000\u0010q\u0000"
+"~\u0000\u0014psq\u0000~\u0000\u0015q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000/net.sourceforge.czt."
+"z.jaxb.gen.DecorExprElementq\u0000~\u0000#sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000eppsq\u0000~\u0000\u0010q\u0000~\u0000\u0014"
+"psq\u0000~\u0000\u0015q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000.net.sourceforge.czt.z.j"
+"axb.gen.BindExprElementq\u0000~\u0000#sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000eppsq\u0000~\u0000\u0010q\u0000~\u0000\u0014psq\u0000"
+"~\u0000\u0015q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000\'net.sourceforge.czt.z.jaxb."
+"gen.CompExprq\u0000~\u0000#sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000eppsq\u0000~\u0000\u0010q\u0000~\u0000\u0014psq\u0000~\u0000\u0015q\u0000~\u0000\u0014pq\u0000"
+"~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000(net.sourceforge.czt.oz.jaxb.gen.PolyEx"
+"prq\u0000~\u0000#sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000eppsq\u0000~\u0000\u0010q\u0000~\u0000\u0014psq\u0000~\u0000\u0015q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000"
+"~\u0000\u001esq\u0000~\u0000\u001ft\u00000net.sourceforge.czt.z.jaxb.gen.RenameExprElement"
+"q\u0000~\u0000#sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000eppsq\u0000~\u0000\u0010q\u0000~\u0000\u0014psq\u0000~\u0000\u0015q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000"
+"\u001esq\u0000~\u0000\u001ft\u0000%net.sourceforge.czt.z.jaxb.gen.MuExprq\u0000~\u0000#sq\u0000~\u0000\u0000pp"
+"\u0000sq\u0000~\u0000\u000eppsq\u0000~\u0000\u0010q\u0000~\u0000\u0014psq\u0000~\u0000\u0015q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000.net"
+".sourceforge.czt.z.jaxb.gen.ApplExprElementq\u0000~\u0000#sq\u0000~\u0000\u0000pp\u0000sq\u0000"
+"~\u0000\u000eppsq\u0000~\u0000\u0010q\u0000~\u0000\u0014psq\u0000~\u0000\u0015q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000&net.sou"
+"rceforge.czt.z.jaxb.gen.IffExprq\u0000~\u0000#sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000eppsq\u0000~\u0000\u0010q"
+"\u0000~\u0000\u0014psq\u0000~\u0000\u0015q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000)net.sourceforge.czt"
+".z.jaxb.gen.ForallExprq\u0000~\u0000#sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000eppsq\u0000~\u0000\u0010q\u0000~\u0000\u0014psq\u0000~"
+"\u0000\u0015q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000\'net.sourceforge.czt.z.jaxb.g"
+"en.ProdExprq\u0000~\u0000#sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000eppsq\u0000~\u0000\u0010q\u0000~\u0000\u0014psq\u0000~\u0000\u0015q\u0000~\u0000\u0014pq\u0000~"
+"\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00004net.sourceforge.czt.circus.jaxb.gen.CSE"
+"xprRefElementq\u0000~\u0000#sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000eppsq\u0000~\u0000\u0010q\u0000~\u0000\u0014psq\u0000~\u0000\u0015q\u0000~\u0000\u0014pq"
+"\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00007net.sourceforge.czt.zpatt.jaxb.gen.Jo"
+"kerExprListElementq\u0000~\u0000#sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000eppsq\u0000~\u0000\u0010q\u0000~\u0000\u0014psq\u0000~\u0000\u0015q\u0000"
+"~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000-net.sourceforge.czt.z.jaxb.gen.N"
+"umExprElementq\u0000~\u0000#sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000eppsq\u0000~\u0000\u0010q\u0000~\u0000\u0014psq\u0000~\u0000\u0015q\u0000~\u0000\u0014pq"
+"\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000.net.sourceforge.czt.oz.jaxb.gen.Class"
+"UnionExprq\u0000~\u0000#sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000eppsq\u0000~\u0000\u0010q\u0000~\u0000\u0014psq\u0000~\u0000\u0015q\u0000~\u0000\u0014pq\u0000~\u0000\u0018"
+"q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00004net.sourceforge.czt.circus.jaxb.gen.CSExp"
+"rSetElementq\u0000~\u0000#sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000eppsq\u0000~\u0000\u0010q\u0000~\u0000\u0014psq\u0000~\u0000\u0015q\u0000~\u0000\u0014pq\u0000~"
+"\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000\'net.sourceforge.czt.z.jaxb.gen.ProjExpr"
+"q\u0000~\u0000#sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000eppsq\u0000~\u0000\u0010q\u0000~\u0000\u0014psq\u0000~\u0000\u0015q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000"
+"\u001esq\u0000~\u0000\u001ft\u0000/net.sourceforge.czt.z.jaxb.gen.ThetaExprElementq\u0000~"
+"\u0000#sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000eppsq\u0000~\u0000\u0010q\u0000~\u0000\u0014psq\u0000~\u0000\u0015q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq"
+"\u0000~\u0000\u001ft\u0000.net.sourceforge.czt.z.jaxb.gen.HideExprElementq\u0000~\u0000#sq"
+"\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000eppsq\u0000~\u0000\u0010q\u0000~\u0000\u0014psq\u0000~\u0000\u0015q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001f"
+"t\u0000.net.sourceforge.czt.z.jaxb.gen.CondExprElementq\u0000~\u0000#sq\u0000~\u0000\u0000"
+"pp\u0000sq\u0000~\u0000\u000eppsq\u0000~\u0000\u0010q\u0000~\u0000\u0014psq\u0000~\u0000\u0015q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000-n"
+"et.sourceforge.czt.z.jaxb.gen.SchExprElementq\u0000~\u0000#sq\u0000~\u0000\u0000pp\u0000sq"
+"\u0000~\u0000\u000eppsq\u0000~\u0000\u0010q\u0000~\u0000\u0014psq\u0000~\u0000\u0015q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000*net.so"
+"urceforge.czt.z.jaxb.gen.Exists1Exprq\u0000~\u0000#sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000eppsq"
+"\u0000~\u0000\u0010q\u0000~\u0000\u0014psq\u0000~\u0000\u0015q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000&net.sourceforg"
+"e.czt.z.jaxb.gen.AndExprq\u0000~\u0000#sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000eppsq\u0000~\u0000\u0010q\u0000~\u0000\u0014psq"
+"\u0000~\u0000\u0015q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000(net.sourceforge.czt.z.jaxb"
+".gen.TupleExprq\u0000~\u0000#sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000eppsq\u0000~\u0000\u0010q\u0000~\u0000\u0014psq\u0000~\u0000\u0015q\u0000~\u0000\u0014p"
+"q\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00004net.sourceforge.czt.tcoz.jaxb.gen.Ch"
+"annelExprElementq\u0000~\u0000#sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000eppsq\u0000~\u0000\u0010q\u0000~\u0000\u0014psq\u0000~\u0000\u0015q\u0000~\u0000"
+"\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000&net.sourceforge.czt.z.jaxb.gen.Pre"
+"Exprq\u0000~\u0000#sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000eppsq\u0000~\u0000\u0010q\u0000~\u0000\u0014psq\u0000~\u0000\u0015q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001c"
+"q\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000/net.sourceforge.czt.oz.jaxb.gen.ContainmentExp"
+"rq\u0000~\u0000#sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000eppsq\u0000~\u0000\u0010q\u0000~\u0000\u0014psq\u0000~\u0000\u0015q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~"
+"\u0000\u001esq\u0000~\u0000\u001ft\u00002net.sourceforge.czt.z.jaxb.gen.TupleSelExprElemen"
+"tq\u0000~\u0000#sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000eppsq\u0000~\u0000\u0010q\u0000~\u0000\u0014psq\u0000~\u0000\u0015q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~"
+"\u0000\u001esq\u0000~\u0000\u001ft\u0000-net.sourceforge.czt.z.jaxb.gen.RefExprElementq\u0000~\u0000"
+"#sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000eppsq\u0000~\u0000\u0010q\u0000~\u0000\u0014psq\u0000~\u0000\u0015q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000"
+"~\u0000\u001ft\u0000)net.sourceforge.czt.z.jaxb.gen.ExistsExprq\u0000~\u0000#sq\u0000~\u0000\u0000pp"
+"\u0000sq\u0000~\u0000\u000eppsq\u0000~\u0000\u0010q\u0000~\u0000\u0014psq\u0000~\u0000\u0015q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00004net"
+".sourceforge.czt.circus.jaxb.gen.NSExprSetElementq\u0000~\u0000#sq\u0000~\u0000\u0000"
+"pp\u0000sq\u0000~\u0000\u000eppsq\u0000~\u0000\u0010q\u0000~\u0000\u0014psq\u0000~\u0000\u0015q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000/n"
+"et.sourceforge.czt.oz.jaxb.gen.PredExprElementq\u0000~\u0000#sq\u0000~\u0000\u0000pp\u0000"
+"sq\u0000~\u0000\u000eppsq\u0000~\u0000\u0010q\u0000~\u0000\u0014psq\u0000~\u0000\u0015q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000&net."
+"sourceforge.czt.z.jaxb.gen.SetExprq\u0000~\u0000#sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000eppsq\u0000~"
+"\u0000\u0010q\u0000~\u0000\u0014psq\u0000~\u0000\u0015q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000)net.sourceforge."
+"czt.z.jaxb.gen.LambdaExprq\u0000~\u0000#sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000eppsq\u0000~\u0000\u0010q\u0000~\u0000\u0014ps"
+"q\u0000~\u0000\u0015q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000&net.sourceforge.czt.z.jax"
+"b.gen.NegExprq\u0000~\u0000#sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000eppsq\u0000~\u0000\u0010q\u0000~\u0000\u0014psq\u0000~\u0000\u0015q\u0000~\u0000\u0014pq"
+"\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00001net.sourceforge.czt.z.jaxb.gen.BindSe"
+"lExprElementq\u0000~\u0000#sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000eppsq\u0000~\u0000\u0010q\u0000~\u0000\u0014psq\u0000~\u0000\u0015q\u0000~\u0000\u0014pq\u0000"
+"~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000*net.sourceforge.czt.z.jaxb.gen.Implies"
+"Exprq\u0000~\u0000#sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000eppsq\u0000~\u0000\u0010q\u0000~\u0000\u0014psq\u0000~\u0000\u0015q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001c"
+"q\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000%net.sourceforge.czt.z.jaxb.gen.OrExprq\u0000~\u0000#sq\u0000~"
+"\u0000\u0000pp\u0000sq\u0000~\u0000\u000eppsq\u0000~\u0000\u0010q\u0000~\u0000\u0014psq\u0000~\u0000\u0015q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000"
+"&net.sourceforge.czt.z.jaxb.gen.LetExprq\u0000~\u0000#sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000ep"
+"psq\u0000~\u0000\u0010q\u0000~\u0000\u0014psq\u0000~\u0000\u0015q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00003net.sourcef"
+"orge.czt.zpatt.jaxb.gen.JokerExprElementq\u0000~\u0000#sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000e"
+"ppsq\u0000~\u0000\u0010q\u0000~\u0000\u0014psq\u0000~\u0000\u0015q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00004net.source"
+"forge.czt.circus.jaxb.gen.NSExprRefElementq\u0000~\u0000#sq\u0000~\u0000\u0000pp\u0000sq\u0000~"
+"\u0000\u000eppsq\u0000~\u0000\u0010q\u0000~\u0000\u0014psq\u0000~\u0000\u0015q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000*net.sour"
+"ceforge.czt.z.jaxb.gen.SetCompExprq\u0000~\u0000#sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000eppsq\u0000~"
+"\u0000\u0010q\u0000~\u0000\u0014psq\u0000~\u0000\u0015q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000(net.sourceforge."
+"czt.z.jaxb.gen.PowerExprq\u0000~\u0000#sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000eppsq\u0000~\u0000\u0010q\u0000~\u0000\u0014psq"
+"\u0000~\u0000\u0015q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000\'net.sourceforge.czt.z.jaxb"
+".gen.PipeExprq\u0000~\u0000#sq\u0000~\u0000\u000eppsq\u0000~\u0000\u0015q\u0000~\u0000\u0014pq\u0000~\u0000)q\u0000~\u00009q\u0000~\u0000\u001esq\u0000~\u0000\u001ft"
+"\u0000\fNameExprPairq\u0000~\u0000>sr\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/ExpressionPool$Cl"
+"osedHash;xpsr\u0000-com.sun.msv.grammar.ExpressionPool$ClosedHash"
+"\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstreamVersionL\u0000\u0006parentt\u0000$Lcom/sun/msv/"
+"grammar/ExpressionPool;xp\u0000\u0000\u0000\u0087\u0001pq\u0000~\u0000Rq\u0000~\u0000Pq\u0000~\u0000Oq\u0000~\u0000`q\u0000~\u0000^q\u0000~\u0000"
+"Mq\u0000~\u0000\\q\u0000~\u0000Zq\u0000~\u0000Iq\u0000~\u0000gq\u0000~\u0000Eq\u0000~\u0001Bq\u0000~\u0001<q\u0000~\u00016q\u0000~\u00010q\u0000~\u0001*q\u0000~\u0001$q\u0000~\u0001"
+"\u001eq\u0000~\u0001\u0018q\u0000~\u0001\u0012q\u0000~\u0001\fq\u0000~\u0001\u0006q\u0000~\u0001\u0000q\u0000~\u0000\u00faq\u0000~\u0000\u00f4q\u0000~\u0000\u00eeq\u0000~\u0000\u00e8q\u0000~\u0000\u00e2q\u0000~\u0000\u00dcq\u0000~\u0000"
+"\u00d6q\u0000~\u0000\u000fq\u0000~\u0000jq\u0000~\u0000pq\u0000~\u0000vq\u0000~\u0000|q\u0000~\u0000\u0082q\u0000~\u0000\u0088q\u0000~\u0000\u008eq\u0000~\u0000\u0094q\u0000~\u0000\u009aq\u0000~\u0000\u00a0q\u0000~\u0000"
+"\u00a6q\u0000~\u0000\u00acq\u0000~\u0000\u00b2q\u0000~\u0000\u00b8q\u0000~\u0000\u00beq\u0000~\u0000Hq\u0000~\u0000\u00c4q\u0000~\u0000\u00caq\u0000~\u0000\u00d0q\u0000~\u0000\fq\u0000~\u0001Hq\u0000~\u0001Nq\u0000~\u0001"
+"Tq\u0000~\u0001Zq\u0000~\u0001`q\u0000~\u0001fq\u0000~\u0000]q\u0000~\u0000Aq\u0000~\u0000fq\u0000~\u0000@q\u0000~\u0000Uq\u0000~\u0000?q\u0000~\u0000Vq\u0000~\u0000\nq\u0000~\u0000"
+"dq\u0000~\u0000Nq\u0000~\u0000aq\u0000~\u0001Cq\u0000~\u0001=q\u0000~\u00017q\u0000~\u00011q\u0000~\u0001+q\u0000~\u0001%q\u0000~\u0001\u001fq\u0000~\u0001\u0019q\u0000~\u0001\u0013q\u0000~\u0001"
+"\rq\u0000~\u0001\u0007q\u0000~\u0001\u0001q\u0000~\u0000\u00fbq\u0000~\u0000\u00f5q\u0000~\u0000\u00efq\u0000~\u0000\u00e9q\u0000~\u0000\u00e3q\u0000~\u0000\u00ddq\u0000~\u0000\u00d7q\u0000~\u0000qq\u0000~\u0000wq\u0000~\u0000"
+"}q\u0000~\u0000Fq\u0000~\u0000\u0083q\u0000~\u0000\u0089q\u0000~\u0000\u008fq\u0000~\u0000\u0095q\u0000~\u0000\u009bq\u0000~\u0000\u00a1q\u0000~\u0000\u00a7q\u0000~\u0000\u00adq\u0000~\u0000\u00b3q\u0000~\u0000\u00b9q\u0000~\u0000"
+"\u00bfq\u0000~\u0000\u00c5q\u0000~\u0000\u00cbq\u0000~\u0000\u00d1q\u0000~\u0000\u0012q\u0000~\u0000kq\u0000~\u0000cq\u0000~\u0000Kq\u0000~\u0001Iq\u0000~\u0001Oq\u0000~\u0000Cq\u0000~\u0001Uq\u0000~\u0001"
+"[q\u0000~\u0001aq\u0000~\u0001gq\u0000~\u0000\tq\u0000~\u0000$q\u0000~\u0001kq\u0000~\u0000Yq\u0000~\u0000Qq\u0000~\u0000Sq\u0000~\u0000Tq\u0000~\u0000[q\u0000~\u0000Wq\u0000~\u0000"
+"Lq\u0000~\u0000bq\u0000~\u0000Jq\u0000~\u0000Bq\u0000~\u0000eq\u0000~\u0000Xq\u0000~\u0000Dq\u0000~\u0000Gq\u0000~\u0000hq\u0000~\u0000_x"));
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
                    case  3 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  2 :
                        if (("NameExprPair" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
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
