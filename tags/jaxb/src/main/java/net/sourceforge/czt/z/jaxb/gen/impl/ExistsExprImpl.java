//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.5-b16-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.06.26 at 02:10:37 PM NZST 
//


package net.sourceforge.czt.z.jaxb.gen.impl;

public class ExistsExprImpl
    extends net.sourceforge.czt.z.jaxb.gen.impl.Qnt1ExprImpl
    implements net.sourceforge.czt.z.jaxb.gen.ExistsExpr, com.sun.xml.bind.RIElement, com.sun.xml.bind.JAXBObject, net.sourceforge.czt.circus.jaxb.gen.impl.runtime.UnmarshallableObject, net.sourceforge.czt.circus.jaxb.gen.impl.runtime.XMLSerializable, net.sourceforge.czt.circus.jaxb.gen.impl.runtime.ValidatableObject
{

    public final static java.lang.Class version = (net.sourceforge.czt.z.jaxb.gen.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (net.sourceforge.czt.z.jaxb.gen.ExistsExpr.class);
    }

    public java.lang.String ____jaxb_ri____getNamespaceURI() {
        return "http://czt.sourceforge.net/zml";
    }

    public java.lang.String ____jaxb_ri____getLocalName() {
        return "ExistsExpr";
    }

    public net.sourceforge.czt.circus.jaxb.gen.impl.runtime.UnmarshallingEventHandler createUnmarshaller(net.sourceforge.czt.circus.jaxb.gen.impl.runtime.UnmarshallingContext context) {
        return new net.sourceforge.czt.z.jaxb.gen.impl.ExistsExprImpl.Unmarshaller(context);
    }

    public void serializeBody(net.sourceforge.czt.circus.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("http://czt.sourceforge.net/zml", "ExistsExpr");
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
        return (net.sourceforge.czt.z.jaxb.gen.ExistsExpr.class);
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
+"r\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\bppsq\u0000~\u0000\u0000sr\u0000"
+"\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000p\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000s"
+"q\u0000~\u0000\fppsr\u0000 com.sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001cco"
+"m.sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0003xq\u0000~\u0000\u0004q\u0000~\u0000\u0010p"
+"sr\u0000 com.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0003L\u0000"
+"\tnameClassq\u0000~\u0000\u0001xq\u0000~\u0000\u0004q\u0000~\u0000\u0010psr\u00002com.sun.msv.grammar.Expressio"
+"n$AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004sq\u0000~\u0000\u000f\u0001q\u0000~\u0000\u001asr\u0000 com.su"
+"n.msv.grammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar"
+".NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$Ep"
+"silonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004q\u0000~\u0000\u001bq\u0000~\u0000 sr\u0000#com.sun.msv.gr"
+"ammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/St"
+"ring;L\u0000\fnamespaceURIq\u0000~\u0000\"xq\u0000~\u0000\u001dt\u0000,net.sourceforge.czt.z.jaxb"
+".gen.Term.AnnsTypet\u0000+http://java.sun.com/jaxb/xjc/dummy-elem"
+"entssq\u0000~\u0000\fppsq\u0000~\u0000\u0017q\u0000~\u0000\u0010psr\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0003L"
+"\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~\u0000\u0004ppsr\u0000\"com.sun.ms"
+"v.datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype."
+"xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd"
+".ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.xsd.XSDatat"
+"ypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000\"L\u0000\btypeNameq\u0000~\u0000\"L\u0000\nwhi"
+"teSpacet\u0000.Lcom/sun/msv/datatype/xsd/WhiteSpaceProcessor;xpt\u0000"
+" http://www.w3.org/2001/XMLSchemat\u0000\u0005QNamesr\u00005com.sun.msv.dat"
+"atype.xsd.WhiteSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun"
+".msv.datatype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.su"
+"n.msv.grammar.Expression$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004q"
+"\u0000~\u0000\u0010psr\u0000\u001bcom.sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq"
+"\u0000~\u0000\"L\u0000\fnamespaceURIq\u0000~\u0000\"xpq\u0000~\u00003q\u0000~\u00002sq\u0000~\u0000!t\u0000\u0004typet\u0000)http://w"
+"ww.w3.org/2001/XMLSchema-instanceq\u0000~\u0000 sq\u0000~\u0000!t\u0000\u0004Annst\u0000\u001ehttp:/"
+"/czt.sourceforge.net/zmlq\u0000~\u0000 sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\fppsq\u0000~\u0000\u0014q\u0000~\u0000\u0010psq"
+"\u0000~\u0000\u0017q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000.net.sourceforge.czt.z.jaxb"
+".gen.ZSchTextElementq\u0000~\u0000%sq\u0000~\u0000\fppsq\u0000~\u0000\fq\u0000~\u0000\u0010psq\u0000~\u0000\fq\u0000~\u0000\u0010psq\u0000"
+"~\u0000\fq\u0000~\u0000\u0010psq\u0000~\u0000\fq\u0000~\u0000\u0010psq\u0000~\u0000\fq\u0000~\u0000\u0010psq\u0000~\u0000\fq\u0000~\u0000\u0010psq\u0000~\u0000\fq\u0000~\u0000\u0010psq\u0000"
+"~\u0000\fq\u0000~\u0000\u0010psq\u0000~\u0000\fq\u0000~\u0000\u0010psq\u0000~\u0000\fq\u0000~\u0000\u0010psq\u0000~\u0000\fq\u0000~\u0000\u0010psq\u0000~\u0000\fq\u0000~\u0000\u0010psq\u0000"
+"~\u0000\fq\u0000~\u0000\u0010psq\u0000~\u0000\fq\u0000~\u0000\u0010psq\u0000~\u0000\fq\u0000~\u0000\u0010psq\u0000~\u0000\fq\u0000~\u0000\u0010psq\u0000~\u0000\fq\u0000~\u0000\u0010psq\u0000"
+"~\u0000\fq\u0000~\u0000\u0010psq\u0000~\u0000\fq\u0000~\u0000\u0010psq\u0000~\u0000\fq\u0000~\u0000\u0010psq\u0000~\u0000\fq\u0000~\u0000\u0010psq\u0000~\u0000\fq\u0000~\u0000\u0010psq\u0000"
+"~\u0000\fq\u0000~\u0000\u0010psq\u0000~\u0000\fq\u0000~\u0000\u0010psq\u0000~\u0000\fq\u0000~\u0000\u0010psq\u0000~\u0000\fq\u0000~\u0000\u0010psq\u0000~\u0000\fq\u0000~\u0000\u0010psq\u0000"
+"~\u0000\fq\u0000~\u0000\u0010psq\u0000~\u0000\fq\u0000~\u0000\u0010psq\u0000~\u0000\fq\u0000~\u0000\u0010psq\u0000~\u0000\fq\u0000~\u0000\u0010psq\u0000~\u0000\fq\u0000~\u0000\u0010psq\u0000"
+"~\u0000\fq\u0000~\u0000\u0010psq\u0000~\u0000\fq\u0000~\u0000\u0010psq\u0000~\u0000\fq\u0000~\u0000\u0010psq\u0000~\u0000\fq\u0000~\u0000\u0010psq\u0000~\u0000\fq\u0000~\u0000\u0010psq\u0000"
+"~\u0000\fq\u0000~\u0000\u0010psq\u0000~\u0000\fq\u0000~\u0000\u0010psq\u0000~\u0000\fq\u0000~\u0000\u0010psq\u0000~\u0000\fq\u0000~\u0000\u0010psq\u0000~\u0000\u0000q\u0000~\u0000\u0010p\u0000sq"
+"\u0000~\u0000\fppsq\u0000~\u0000\u0014q\u0000~\u0000\u0010psq\u0000~\u0000\u0017q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000&net.so"
+"urceforge.czt.z.jaxb.gen.IffExprq\u0000~\u0000%sq\u0000~\u0000\u0000q\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\fppsq"
+"\u0000~\u0000\u0014q\u0000~\u0000\u0010psq\u0000~\u0000\u0017q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000(net.sourceforg"
+"e.czt.z.jaxb.gen.PowerExprq\u0000~\u0000%sq\u0000~\u0000\u0000q\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\fppsq\u0000~\u0000\u0014q\u0000"
+"~\u0000\u0010psq\u0000~\u0000\u0017q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000-net.sourceforge.czt."
+"z.jaxb.gen.SchExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000q\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\fppsq\u0000~\u0000\u0014q\u0000~"
+"\u0000\u0010psq\u0000~\u0000\u0017q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000*net.sourceforge.czt.z"
+".jaxb.gen.SetCompExprq\u0000~\u0000%sq\u0000~\u0000\u0000q\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\fppsq\u0000~\u0000\u0014q\u0000~\u0000\u0010ps"
+"q\u0000~\u0000\u0017q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000(net.sourceforge.czt.z.jax"
+"b.gen.TupleExprq\u0000~\u0000%sq\u0000~\u0000\u0000q\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\fppsq\u0000~\u0000\u0014q\u0000~\u0000\u0010psq\u0000~\u0000\u0017q"
+"\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000)net.sourceforge.czt.z.jaxb.gen."
+"LambdaExprq\u0000~\u0000%sq\u0000~\u0000\u0000q\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\fppsq\u0000~\u0000\u0014q\u0000~\u0000\u0010psq\u0000~\u0000\u0017q\u0000~\u0000\u0010p"
+"q\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00002net.sourceforge.czt.z.jaxb.gen.Tuple"
+"SelExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000q\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\fppsq\u0000~\u0000\u0014q\u0000~\u0000\u0010psq\u0000~\u0000\u0017q\u0000"
+"~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00004net.sourceforge.czt.tcoz.jaxb.ge"
+"n.ChannelExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000q\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\fppsq\u0000~\u0000\u0014q\u0000~\u0000\u0010psq"
+"\u0000~\u0000\u0017q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000.net.sourceforge.czt.z.jaxb"
+".gen.HideExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000q\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\fppsq\u0000~\u0000\u0014q\u0000~\u0000\u0010psq"
+"\u0000~\u0000\u0017q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000(net.sourceforge.czt.oz.jax"
+"b.gen.PolyExprq\u0000~\u0000%sq\u0000~\u0000\u0000q\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\fppsq\u0000~\u0000\u0014q\u0000~\u0000\u0010psq\u0000~\u0000\u0017q\u0000"
+"~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000-net.sourceforge.czt.z.jaxb.gen.N"
+"umExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000q\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\fppsq\u0000~\u0000\u0014q\u0000~\u0000\u0010psq\u0000~\u0000\u0017q\u0000~"
+"\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000*net.sourceforge.czt.z.jaxb.gen.Im"
+"pliesExprq\u0000~\u0000%sq\u0000~\u0000\u0000q\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\fppsq\u0000~\u0000\u0014q\u0000~\u0000\u0010psq\u0000~\u0000\u0017q\u0000~\u0000\u0010pq"
+"\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000/net.sourceforge.czt.oz.jaxb.gen.PredE"
+"xprElementq\u0000~\u0000%sq\u0000~\u0000\u0000q\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\fppsq\u0000~\u0000\u0014q\u0000~\u0000\u0010psq\u0000~\u0000\u0017q\u0000~\u0000\u0010p"
+"q\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000.net.sourceforge.czt.oz.jaxb.gen.Clas"
+"sUnionExprq\u0000~\u0000%sq\u0000~\u0000\u0000q\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\fppsq\u0000~\u0000\u0014q\u0000~\u0000\u0010psq\u0000~\u0000\u0017q\u0000~\u0000\u0010p"
+"q\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00000net.sourceforge.czt.z.jaxb.gen.Renam"
+"eExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000q\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\fppsq\u0000~\u0000\u0014q\u0000~\u0000\u0010psq\u0000~\u0000\u0017q\u0000~\u0000"
+"\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000.net.sourceforge.czt.z.jaxb.gen.Bin"
+"dExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000q\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\fppsq\u0000~\u0000\u0014q\u0000~\u0000\u0010psq\u0000~\u0000\u0017q\u0000~\u0000"
+"\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00001net.sourceforge.czt.z.jaxb.gen.Bin"
+"dSelExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000q\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\fppsq\u0000~\u0000\u0014q\u0000~\u0000\u0010psq\u0000~\u0000\u0017q"
+"\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000%net.sourceforge.czt.z.jaxb.gen."
+"OrExprq\u0000~\u0000%sq\u0000~\u0000\u0000q\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\fppsq\u0000~\u0000\u0014q\u0000~\u0000\u0010psq\u0000~\u0000\u0017q\u0000~\u0000\u0010pq\u0000~\u0000"
+"\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000\'net.sourceforge.czt.z.jaxb.gen.ProdExprq"
+"\u0000~\u0000%sq\u0000~\u0000\u0000q\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\fppsq\u0000~\u0000\u0014q\u0000~\u0000\u0010psq\u0000~\u0000\u0017q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq"
+"\u0000~\u0000 sq\u0000~\u0000!t\u0000&net.sourceforge.czt.z.jaxb.gen.SetExprq\u0000~\u0000%sq\u0000~"
+"\u0000\u0000q\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\fppsq\u0000~\u0000\u0014q\u0000~\u0000\u0010psq\u0000~\u0000\u0017q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~"
+"\u0000!t\u0000&net.sourceforge.czt.z.jaxb.gen.NegExprq\u0000~\u0000%sq\u0000~\u0000\u0000q\u0000~\u0000\u0010p"
+"\u0000sq\u0000~\u0000\fppsq\u0000~\u0000\u0014q\u0000~\u0000\u0010psq\u0000~\u0000\u0017q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000)net"
+".sourceforge.czt.z.jaxb.gen.ForallExprq\u0000~\u0000%sq\u0000~\u0000\u0000q\u0000~\u0000\u0010p\u0000sq\u0000~"
+"\u0000\fppsq\u0000~\u0000\u0014q\u0000~\u0000\u0010psq\u0000~\u0000\u0017q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00003net.sour"
+"ceforge.czt.tcoz.jaxb.gen.SensorExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000q\u0000~\u0000\u0010p"
+"\u0000sq\u0000~\u0000\fppsq\u0000~\u0000\u0014q\u0000~\u0000\u0010psq\u0000~\u0000\u0017q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000&net"
+".sourceforge.czt.z.jaxb.gen.PreExprq\u0000~\u0000%sq\u0000~\u0000\u0000q\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\fp"
+"psq\u0000~\u0000\u0014q\u0000~\u0000\u0010psq\u0000~\u0000\u0017q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000\'net.sourcef"
+"orge.czt.z.jaxb.gen.ProjExprq\u0000~\u0000%sq\u0000~\u0000\u0000q\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\fppsq\u0000~\u0000\u0014"
+"q\u0000~\u0000\u0010psq\u0000~\u0000\u0017q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000/net.sourceforge.cz"
+"t.z.jaxb.gen.ThetaExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000q\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\fppsq\u0000~\u0000"
+"\u0014q\u0000~\u0000\u0010psq\u0000~\u0000\u0017q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00005net.sourceforge.c"
+"zt.tcoz.jaxb.gen.ActuatorExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000q\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\f"
+"ppsq\u0000~\u0000\u0014q\u0000~\u0000\u0010psq\u0000~\u0000\u0017q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00004net.source"
+"forge.czt.circus.jaxb.gen.SigmaExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000q\u0000~\u0000\u0010p\u0000"
+"sq\u0000~\u0000\fppsq\u0000~\u0000\u0014q\u0000~\u0000\u0010psq\u0000~\u0000\u0017q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000*net."
+"sourceforge.czt.z.jaxb.gen.Exists1Exprq\u0000~\u0000%sq\u0000~\u0000\u0000q\u0000~\u0000\u0010p\u0000sq\u0000~"
+"\u0000\fppsq\u0000~\u0000\u0014q\u0000~\u0000\u0010psq\u0000~\u0000\u0017q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000)net.sour"
+"ceforge.czt.z.jaxb.gen.ExistsExprq\u0000~\u0000%sq\u0000~\u0000\u0000q\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\fpps"
+"q\u0000~\u0000\u0014q\u0000~\u0000\u0010psq\u0000~\u0000\u0017q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000\'net.sourcefor"
+"ge.czt.z.jaxb.gen.CompExprq\u0000~\u0000%sq\u0000~\u0000\u0000q\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\fppsq\u0000~\u0000\u0014q\u0000"
+"~\u0000\u0010psq\u0000~\u0000\u0017q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00007net.sourceforge.czt."
+"circus.jaxb.gen.BasicChannelSetExprq\u0000~\u0000%sq\u0000~\u0000\u0000q\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\fp"
+"psq\u0000~\u0000\u0014q\u0000~\u0000\u0010psq\u0000~\u0000\u0017q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000\'net.sourcef"
+"orge.czt.z.jaxb.gen.PipeExprq\u0000~\u0000%sq\u0000~\u0000\u0000q\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\fppsq\u0000~\u0000\u0014"
+"q\u0000~\u0000\u0010psq\u0000~\u0000\u0017q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000/net.sourceforge.cz"
+"t.oz.jaxb.gen.ContainmentExprq\u0000~\u0000%sq\u0000~\u0000\u0000q\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\fppsq\u0000~\u0000"
+"\u0014q\u0000~\u0000\u0010psq\u0000~\u0000\u0017q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000/net.sourceforge.c"
+"zt.z.jaxb.gen.DecorExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000q\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\fppsq\u0000~"
+"\u0000\u0014q\u0000~\u0000\u0010psq\u0000~\u0000\u0017q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000&net.sourceforge."
+"czt.z.jaxb.gen.LetExprq\u0000~\u0000%sq\u0000~\u0000\u0000q\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\fppsq\u0000~\u0000\u0014q\u0000~\u0000\u0010p"
+"sq\u0000~\u0000\u0017q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000&net.sourceforge.czt.z.ja"
+"xb.gen.AndExprq\u0000~\u0000%sq\u0000~\u0000\u0000q\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\fppsq\u0000~\u0000\u0014q\u0000~\u0000\u0010psq\u0000~\u0000\u0017q\u0000"
+"~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00003net.sourceforge.czt.zpatt.jaxb.g"
+"en.JokerExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000q\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\fppsq\u0000~\u0000\u0014q\u0000~\u0000\u0010psq\u0000"
+"~\u0000\u0017q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000.net.sourceforge.czt.z.jaxb."
+"gen.ApplExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000q\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\fppsq\u0000~\u0000\u0014q\u0000~\u0000\u0010psq\u0000"
+"~\u0000\u0017q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000.net.sourceforge.czt.z.jaxb."
+"gen.CondExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000q\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\fppsq\u0000~\u0000\u0014q\u0000~\u0000\u0010psq\u0000"
+"~\u0000\u0017q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000-net.sourceforge.czt.z.jaxb."
+"gen.RefExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000q\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\fppsq\u0000~\u0000\u0014q\u0000~\u0000\u0010psq\u0000~"
+"\u0000\u0017q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000%net.sourceforge.czt.z.jaxb.g"
+"en.MuExprq\u0000~\u0000%q\u0000~\u0000 sq\u0000~\u0000\fppsq\u0000~\u0000\u0017q\u0000~\u0000\u0010pq\u0000~\u0000+q\u0000~\u0000;q\u0000~\u0000 sq\u0000~\u0000!"
+"t\u0000\nExistsExprq\u0000~\u0000@sr\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/ExpressionPool$Clo"
+"sedHash;xpsr\u0000-com.sun.msv.grammar.ExpressionPool$ClosedHash\u00d7"
+"j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstreamVersionL\u0000\u0006parentt\u0000$Lcom/sun/msv/g"
+"rammar/ExpressionPool;xp\u0000\u0000\u0000\u0089\u0001pq\u0000~\u0000Mq\u0000~\u0000Uq\u0000~\u0000fq\u0000~\u0000Sq\u0000~\u0000Nq\u0000~\u0000g"
+"q\u0000~\u0001Dq\u0000~\u0001>q\u0000~\u0000aq\u0000~\u00018q\u0000~\u00012q\u0000~\u0001,q\u0000~\u0001&q\u0000~\u0000^q\u0000~\u0001 q\u0000~\u0001\u001aq\u0000~\u0001\u0014q\u0000~\u0001\u000e"
+"q\u0000~\u0001\bq\u0000~\u0001\u0002q\u0000~\u0000\u00fcq\u0000~\u0000\u00f6q\u0000~\u0000Pq\u0000~\u0000\u00f0q\u0000~\u0000\u00eaq\u0000~\u0000\u00e4q\u0000~\u0000\u00deq\u0000~\u0000\u00d8q\u0000~\u0000\u0013q\u0000~\u0000B"
+"q\u0000~\u0000rq\u0000~\u0000xq\u0000~\u0000~q\u0000~\u0000\u0084q\u0000~\u0000\u008aq\u0000~\u0000\u0090q\u0000~\u0000\u0096q\u0000~\u0000\u009cq\u0000~\u0000\u00a2q\u0000~\u0000\u00a8q\u0000~\u0000\u00aeq\u0000~\u0000\u00b4"
+"q\u0000~\u0000\u00baq\u0000~\u0000\u00c0q\u0000~\u0000\u00c6q\u0000~\u0000\u00ccq\u0000~\u0000\u00d2q\u0000~\u0001Jq\u0000~\u0001Pq\u0000~\u0001Vq\u0000~\u0001\\q\u0000~\u0001bq\u0000~\u0001hq\u0000~\u0000`"
+"q\u0000~\u0000\u0011q\u0000~\u0000Yq\u0000~\u0000dq\u0000~\u0000pq\u0000~\u0000Hq\u0000~\u0000Qq\u0000~\u0000iq\u0000~\u0000jq\u0000~\u0000[q\u0000~\u0000\\q\u0000~\u0000Kq\u0000~\u0000\u000b"
+"q\u0000~\u0000Rq\u0000~\u0000bq\u0000~\u0000_q\u0000~\u0000Tq\u0000~\u0000kq\u0000~\u0000]q\u0000~\u0000Oq\u0000~\u0000Jq\u0000~\u0000Wq\u0000~\u0000hq\u0000~\u0000Gq\u0000~\u0000L"
+"q\u0000~\u0000nq\u0000~\u0000\tq\u0000~\u0000&q\u0000~\u0001mq\u0000~\u0000cq\u0000~\u0000mq\u0000~\u0000Iq\u0000~\u0001Eq\u0000~\u0001?q\u0000~\u00019q\u0000~\u00013q\u0000~\u0001-"
+"q\u0000~\u0001\'q\u0000~\u0001!q\u0000~\u0000Vq\u0000~\u0001\u001bq\u0000~\u0000\rq\u0000~\u0001\u0015q\u0000~\u0001\u000fq\u0000~\u0001\tq\u0000~\u0001\u0003q\u0000~\u0000\u00fdq\u0000~\u0000\u00f7q\u0000~\u0000\u00f1"
+"q\u0000~\u0000\u00ebq\u0000~\u0000\u00e5q\u0000~\u0000\u00dfq\u0000~\u0000\u00d9q\u0000~\u0000\u0016q\u0000~\u0000Cq\u0000~\u0000sq\u0000~\u0000yq\u0000~\u0000\u007fq\u0000~\u0000\u0085q\u0000~\u0000\u008bq\u0000~\u0000\u0091"
+"q\u0000~\u0000\u0097q\u0000~\u0000\u009dq\u0000~\u0000\u00a3q\u0000~\u0000lq\u0000~\u0000\u00a9q\u0000~\u0000\u00afq\u0000~\u0000\u00b5q\u0000~\u0000\u00bbq\u0000~\u0000\u00c1q\u0000~\u0000\u00c7q\u0000~\u0000\u00cdq\u0000~\u0000\u00d3"
+"q\u0000~\u0001Kq\u0000~\u0001Qq\u0000~\u0001Wq\u0000~\u0001]q\u0000~\u0001cq\u0000~\u0001iq\u0000~\u0000Xq\u0000~\u0000\nq\u0000~\u0000Zq\u0000~\u0000eq\u0000~\u0000ox"));
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
            return net.sourceforge.czt.z.jaxb.gen.impl.ExistsExprImpl.this;
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
                        if (("ExistsExpr" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 1;
                            return ;
                        }
                        break;
                    case  1 :
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.Qnt1ExprImpl)net.sourceforge.czt.z.jaxb.gen.impl.ExistsExprImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("ZSchText" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.Qnt1ExprImpl)net.sourceforge.czt.z.jaxb.gen.impl.ExistsExprImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("SchText" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.Qnt1ExprImpl)net.sourceforge.czt.z.jaxb.gen.impl.ExistsExprImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("SchText" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.Qnt1ExprImpl)net.sourceforge.czt.z.jaxb.gen.impl.ExistsExprImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.Qnt1ExprImpl)net.sourceforge.czt.z.jaxb.gen.impl.ExistsExprImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
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
                        spawnHandlerFromLeaveElement((((net.sourceforge.czt.z.jaxb.gen.impl.Qnt1ExprImpl)net.sourceforge.czt.z.jaxb.gen.impl.ExistsExprImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                        return ;
                    case  2 :
                        if (("ExistsExpr" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
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
                        spawnHandlerFromEnterAttribute((((net.sourceforge.czt.z.jaxb.gen.impl.Qnt1ExprImpl)net.sourceforge.czt.z.jaxb.gen.impl.ExistsExprImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                        spawnHandlerFromLeaveAttribute((((net.sourceforge.czt.z.jaxb.gen.impl.Qnt1ExprImpl)net.sourceforge.czt.z.jaxb.gen.impl.ExistsExprImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                            spawnHandlerFromText((((net.sourceforge.czt.z.jaxb.gen.impl.Qnt1ExprImpl)net.sourceforge.czt.z.jaxb.gen.impl.ExistsExprImpl.this).new Unmarshaller(context)), 2, value);
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
