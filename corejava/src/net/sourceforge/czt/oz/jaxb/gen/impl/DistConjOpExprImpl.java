//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2005.02.14 at 08:40:58 GMT 
//


package net.sourceforge.czt.oz.jaxb.gen.impl;

public class DistConjOpExprImpl
    extends net.sourceforge.czt.oz.jaxb.gen.impl.DistOpExprImpl
    implements net.sourceforge.czt.oz.jaxb.gen.DistConjOpExpr, com.sun.xml.bind.RIElement, com.sun.xml.bind.JAXBObject, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallableObject, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializable, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.ValidatableObject
{

    public final static java.lang.Class version = (net.sourceforge.czt.oz.jaxb.gen.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (net.sourceforge.czt.oz.jaxb.gen.DistConjOpExpr.class);
    }

    public java.lang.String ____jaxb_ri____getNamespaceURI() {
        return "http://czt.sourceforge.net/object-z";
    }

    public java.lang.String ____jaxb_ri____getLocalName() {
        return "DistConjOpExpr";
    }

    public net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingEventHandler createUnmarshaller(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingContext context) {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.DistConjOpExprImpl.Unmarshaller(context);
    }

    public void serializeBody(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("http://czt.sourceforge.net/object-z", "DistConjOpExpr");
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
        return (net.sourceforge.czt.oz.jaxb.gen.DistConjOpExpr.class);
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
+"ring;L\u0000\fnamespaceURIq\u0000~\u0000\"xq\u0000~\u0000\u001dt\u0000-net.sourceforge.czt.z.jaxb"
+".gen.TermA.AnnsTypet\u0000+http://java.sun.com/jaxb/xjc/dummy-ele"
+"mentssq\u0000~\u0000\fppsq\u0000~\u0000\u0017q\u0000~\u0000\u0010psr\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0003"
+"L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~\u0000\u0004ppsr\u0000\"com.sun.m"
+"sv.datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype"
+".xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xs"
+"d.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.xsd.XSData"
+"typeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000\"L\u0000\btypeNameq\u0000~\u0000\"L\u0000\nwh"
+"iteSpacet\u0000.Lcom/sun/msv/datatype/xsd/WhiteSpaceProcessor;xpt"
+"\u0000 http://www.w3.org/2001/XMLSchemat\u0000\u0005QNamesr\u00005com.sun.msv.da"
+"tatype.xsd.WhiteSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.su"
+"n.msv.datatype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.s"
+"un.msv.grammar.Expression$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004"
+"q\u0000~\u0000\u0010psr\u0000\u001bcom.sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalName"
+"q\u0000~\u0000\"L\u0000\fnamespaceURIq\u0000~\u0000\"xpq\u0000~\u00003q\u0000~\u00002sq\u0000~\u0000!t\u0000\u0004typet\u0000)http://"
+"www.w3.org/2001/XMLSchema-instanceq\u0000~\u0000 sq\u0000~\u0000!t\u0000\u0004Annst\u0000\u001ehttp:"
+"//czt.sourceforge.net/zmlq\u0000~\u0000 sq\u0000~\u0000\fppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\fppsq\u0000~\u0000"
+"\u0014q\u0000~\u0000\u0010psq\u0000~\u0000\u0017q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000-net.sourceforge.c"
+"zt.z.jaxb.gen.SchTextElementq\u0000~\u0000%sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000s"
+"q\u0000~\u0000\fppsq\u0000~\u0000\u0014q\u0000~\u0000\u0010psq\u0000~\u0000\u0017q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000&net.s"
+"ourceforge.czt.z.jaxb.gen.SchTextq\u0000~\u0000%sq\u0000~\u0000\fppsq\u0000~\u0000\u0017q\u0000~\u0000\u0010pq\u0000"
+"~\u0000+q\u0000~\u0000;q\u0000~\u0000 sq\u0000~\u0000!t\u0000\u0007SchTextq\u0000~\u0000@sq\u0000~\u0000\fppsq\u0000~\u0000\fppsq\u0000~\u0000\fppsq"
+"\u0000~\u0000\fppsq\u0000~\u0000\fppsq\u0000~\u0000\fppsq\u0000~\u0000\fppsq\u0000~\u0000\fppsq\u0000~\u0000\fppsq\u0000~\u0000\fppsq\u0000~\u0000\f"
+"ppsq\u0000~\u0000\fppsq\u0000~\u0000\fppsq\u0000~\u0000\fppsq\u0000~\u0000\fppsq\u0000~\u0000\fppsq\u0000~\u0000\fppsq\u0000~\u0000\fppsq"
+"\u0000~\u0000\fppsq\u0000~\u0000\fppsq\u0000~\u0000\fppsq\u0000~\u0000\fppsq\u0000~\u0000\fppsq\u0000~\u0000\fppsq\u0000~\u0000\fppsq\u0000~\u0000\f"
+"ppsq\u0000~\u0000\fppsq\u0000~\u0000\fppsq\u0000~\u0000\fppsq\u0000~\u0000\fppsq\u0000~\u0000\fppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\fpps"
+"q\u0000~\u0000\u0014q\u0000~\u0000\u0010psq\u0000~\u0000\u0017q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000-net.sourcefor"
+"ge.czt.tcoz.jaxb.gen.SkipProExprq\u0000~\u0000%sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\fppsq\u0000~\u0000\u0014"
+"q\u0000~\u0000\u0010psq\u0000~\u0000\u0017q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000<net.sourceforge.cz"
+"t.tcoz.jaxb.gen.InterruptTimeOpExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000pp\u0000sq\u0000~"
+"\u0000\fppsq\u0000~\u0000\u0014q\u0000~\u0000\u0010psq\u0000~\u0000\u0017q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00002net.sour"
+"ceforge.czt.oz.jaxb.gen.AssoParallelOpExprq\u0000~\u0000%sq\u0000~\u0000\u0000pp\u0000sq\u0000~"
+"\u0000\fppsq\u0000~\u0000\u0014q\u0000~\u0000\u0010psq\u0000~\u0000\u0017q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00002net.sour"
+"ceforge.czt.tcoz.jaxb.gen.InterruptProExprq\u0000~\u0000%sq\u0000~\u0000\u0000pp\u0000sq\u0000~"
+"\u0000\fppsq\u0000~\u0000\u0014q\u0000~\u0000\u0010psq\u0000~\u0000\u0017q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000-net.sour"
+"ceforge.czt.tcoz.jaxb.gen.StopProExprq\u0000~\u0000%sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\fpps"
+"q\u0000~\u0000\u0014q\u0000~\u0000\u0010psq\u0000~\u0000\u0017q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00001net.sourcefor"
+"ge.czt.oz.jaxb.gen.HideOpExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\fppsq"
+"\u0000~\u0000\u0014q\u0000~\u0000\u0010psq\u0000~\u0000\u0017q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000.net.sourceforg"
+"e.czt.oz.jaxb.gen.ExChoiceOpExprq\u0000~\u0000%sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\fppsq\u0000~\u0000\u0014"
+"q\u0000~\u0000\u0010psq\u0000~\u0000\u0017q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00000net.sourceforge.cz"
+"t.tcoz.jaxb.gen.DivergeProExprq\u0000~\u0000%sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\fppsq\u0000~\u0000\u0014q\u0000"
+"~\u0000\u0010psq\u0000~\u0000\u0017q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00003net.sourceforge.czt."
+"tcoz.jaxb.gen.TimeoutEndProExprq\u0000~\u0000%sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\fppsq\u0000~\u0000\u0014q"
+"\u0000~\u0000\u0010psq\u0000~\u0000\u0017q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00001net.sourceforge.czt"
+".tcoz.jaxb.gen.InChoiceProExprq\u0000~\u0000%sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\fppsq\u0000~\u0000\u0014q\u0000"
+"~\u0000\u0010psq\u0000~\u0000\u0017q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00005net.sourceforge.czt."
+"tcoz.jaxb.gen.GuardProExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\fppsq\u0000~\u0000"
+"\u0014q\u0000~\u0000\u0010psq\u0000~\u0000\u0017q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00006net.sourceforge.c"
+"zt.oz.jaxb.gen.OpPromotionExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\fpps"
+"q\u0000~\u0000\u0014q\u0000~\u0000\u0010psq\u0000~\u0000\u0017q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000.net.sourcefor"
+"ge.czt.oz.jaxb.gen.ParallelOpExprq\u0000~\u0000%sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\fppsq\u0000~\u0000"
+"\u0014q\u0000~\u0000\u0010psq\u0000~\u0000\u0017q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00003net.sourceforge.c"
+"zt.oz.jaxb.gen.RenameOpExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\fppsq\u0000~"
+"\u0000\u0014q\u0000~\u0000\u0010psq\u0000~\u0000\u0017q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00006net.sourceforge."
+"czt.tcoz.jaxb.gen.SynPllProExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\fpp"
+"sq\u0000~\u0000\u0014q\u0000~\u0000\u0010psq\u0000~\u0000\u0017q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000*net.sourcefo"
+"rge.czt.oz.jaxb.gen.ConjOpExprq\u0000~\u0000%sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\fppsq\u0000~\u0000\u0014q\u0000"
+"~\u0000\u0010psq\u0000~\u0000\u0017q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000)net.sourceforge.czt."
+"oz.jaxb.gen.SeqOpExprq\u0000~\u0000%sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\fppsq\u0000~\u0000\u0014q\u0000~\u0000\u0010psq\u0000~\u0000"
+"\u0017q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00007net.sourceforge.czt.tcoz.jaxb"
+".gen.DistInterleaveProExprq\u0000~\u0000%sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\fppsq\u0000~\u0000\u0014q\u0000~\u0000\u0010p"
+"sq\u0000~\u0000\u0017q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00001net.sourceforge.czt.oz.j"
+"axb.gen.AnonOpExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\fppsq\u0000~\u0000\u0014q\u0000~\u0000\u0010ps"
+"q\u0000~\u0000\u0017q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00003net.sourceforge.czt.tcoz."
+"jaxb.gen.InterleaveProExprq\u0000~\u0000%sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\fppsq\u0000~\u0000\u0014q\u0000~\u0000\u0010p"
+"sq\u0000~\u0000\u0017q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00002net.sourceforge.czt.tcoz"
+".jaxb.gen.AtProExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\fppsq\u0000~\u0000\u0014q\u0000~\u0000\u0010p"
+"sq\u0000~\u0000\u0017q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000.net.sourceforge.czt.oz.j"
+"axb.gen.DistConjOpExprq\u0000~\u0000%sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\fppsq\u0000~\u0000\u0014q\u0000~\u0000\u0010psq\u0000~"
+"\u0000\u0017q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00001net.sourceforge.czt.oz.jaxb."
+"gen.ScopeEnrichOpExprq\u0000~\u0000%sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\fppsq\u0000~\u0000\u0014q\u0000~\u0000\u0010psq\u0000~\u0000"
+"\u0017q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00008net.sourceforge.czt.tcoz.jaxb"
+".gen.TopologyProExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\fppsq\u0000~\u0000\u0014q\u0000~\u0000\u0010"
+"psq\u0000~\u0000\u0017q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00005net.sourceforge.czt.tco"
+"z.jaxb.gen.DistInChoiceProExprq\u0000~\u0000%sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\fppsq\u0000~\u0000\u0014q\u0000"
+"~\u0000\u0010psq\u0000~\u0000\u0017q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000-net.sourceforge.czt."
+"oz.jaxb.gen.DistSeqOpExprq\u0000~\u0000%sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\fppsq\u0000~\u0000\u0014q\u0000~\u0000\u0010ps"
+"q\u0000~\u0000\u0017q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00005net.sourceforge.czt.tcoz."
+"jaxb.gen.TimeoutStartProExprq\u0000~\u0000%sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\fppsq\u0000~\u0000\u0014q\u0000~\u0000"
+"\u0010psq\u0000~\u0000\u0017q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00003net.sourceforge.czt.tc"
+"oz.jaxb.gen.RecProExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\fppsq\u0000~\u0000\u0014q\u0000~"
+"\u0000\u0010psq\u0000~\u0000\u0017q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00008net.sourceforge.czt.t"
+"coz.jaxb.gen.DeadlineProExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\fppsq\u0000"
+"~\u0000\u0014q\u0000~\u0000\u0010psq\u0000~\u0000\u0017q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00000net.sourceforge"
+".czt.oz.jaxb.gen.DistChoiceOpExprq\u0000~\u0000%sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\fppsq\u0000~\u0000"
+"\u0014q\u0000~\u0000\u0010psq\u0000~\u0000\u0017q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00009net.sourceforge.c"
+"zt.tcoz.jaxb.gen.WaitUntilProExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\f"
+"ppsq\u0000~\u0000\u0014q\u0000~\u0000\u0010psq\u0000~\u0000\u0017q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00004net.source"
+"forge.czt.tcoz.jaxb.gen.WaitProExprElementq\u0000~\u0000%sq\u0000~\u0000\fppsq\u0000~\u0000"
+"\u0017q\u0000~\u0000\u0010pq\u0000~\u0000+q\u0000~\u0000;q\u0000~\u0000 sq\u0000~\u0000!t\u0000\u000eDistConjOpExprt\u0000#http://czt.s"
+"ourceforge.net/object-zsr\u0000\"com.sun.msv.grammar.ExpressionPoo"
+"l\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/ExpressionPoo"
+"l$ClosedHash;xpsr\u0000-com.sun.msv.grammar.ExpressionPool$Closed"
+"Hash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstreamVersionL\u0000\u0006parentt\u0000$Lcom/sun/"
+"msv/grammar/ExpressionPool;xp\u0000\u0000\u0000o\u0001pq\u0000~\u0000aq\u0000~\u0000iq\u0000~\u0000kq\u0000~\u0000Zq\u0000~\u0000l"
+"q\u0000~\u0000hq\u0000~\u0000rq\u0000~\u0000]q\u0000~\u0000fq\u0000~\u0000pq\u0000~\u0000mq\u0000~\u0000oq\u0000~\u0000\tq\u0000~\u0000bq\u0000~\u0000Xq\u0000~\u0000Wq\u0000~\u0000\n"
+"q\u0000~\u0000Pq\u0000~\u0000&q\u0000~\u00013q\u0000~\u0000Uq\u0000~\u0000\u00c8q\u0000~\u0000\u000bq\u0000~\u0000\u00c2q\u0000~\u0000\u00bcq\u0000~\u0000\u00b6q\u0000~\u0000\u00b0q\u0000~\u0000\u00aaq\u0000~\u0000\u00a4"
+"q\u0000~\u0000\u009eq\u0000~\u0000\u0098q\u0000~\u0000\u0092q\u0000~\u0000\u008cq\u0000~\u0000\u0086q\u0000~\u0000\rq\u0000~\u0000jq\u0000~\u0000\u0080q\u0000~\u0000qq\u0000~\u0000zq\u0000~\u0000tq\u0000~\u0000K"
+"q\u0000~\u0000Cq\u0000~\u0000\u0013q\u0000~\u0000\u00c9q\u0000~\u0000\u00c3q\u0000~\u0000\u00bdq\u0000~\u0000\u00b7q\u0000~\u0000\u00b1q\u0000~\u0000\u00abq\u0000~\u0000\u00a5q\u0000~\u0000\u009fq\u0000~\u0000\u0099q\u0000~\u0000\u0093"
+"q\u0000~\u0000\u008dq\u0000~\u0000\u0087q\u0000~\u0000\u0081q\u0000~\u0000{q\u0000~\u0000uq\u0000~\u0000Lq\u0000~\u0000Dq\u0000~\u0000\u0016q\u0000~\u0000\u00cfq\u0000~\u0000\u00ceq\u0000~\u0000\u00d5q\u0000~\u0000\u00d4"
+"q\u0000~\u0000cq\u0000~\u0000\u00dbq\u0000~\u0000gq\u0000~\u0000\u00daq\u0000~\u0000\u00e1q\u0000~\u0000\u00e0q\u0000~\u0000\u00e7q\u0000~\u0000\u00e6q\u0000~\u0000\u00edq\u0000~\u0000\u00ecq\u0000~\u0000\u00f3q\u0000~\u0000\u00f2"
+"q\u0000~\u0000^q\u0000~\u0000\u00f9q\u0000~\u0000dq\u0000~\u0000Iq\u0000~\u0000\u0011q\u0000~\u0000\u00f8q\u0000~\u0000\u00ffq\u0000~\u0000\u00feq\u0000~\u0001\u0005q\u0000~\u0001\u0004q\u0000~\u0001\u000bq\u0000~\u0001\n"
+"q\u0000~\u0000`q\u0000~\u0000\\q\u0000~\u0000[q\u0000~\u0001\u0011q\u0000~\u0001\u0010q\u0000~\u0001\u0017q\u0000~\u0001\u0016q\u0000~\u0001\u001dq\u0000~\u0001\u001cq\u0000~\u0001#q\u0000~\u0001\"q\u0000~\u0000e"
+"q\u0000~\u0000Vq\u0000~\u0001)q\u0000~\u0001(q\u0000~\u0001/q\u0000~\u0001.q\u0000~\u0000Tq\u0000~\u0000Yq\u0000~\u0000nq\u0000~\u0000Aq\u0000~\u0000_x"));
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
            return net.sourceforge.czt.oz.jaxb.gen.impl.DistConjOpExprImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  0 :
                        if (("DistConjOpExpr" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
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
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.DistOpExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.DistConjOpExprImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("SchText" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.DistOpExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.DistConjOpExprImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("SchText" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.DistOpExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.DistConjOpExprImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.DistOpExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.DistConjOpExprImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
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
                        if (("DistConjOpExpr" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  3 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        spawnHandlerFromLeaveElement((((net.sourceforge.czt.oz.jaxb.gen.impl.DistOpExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.DistConjOpExprImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                        spawnHandlerFromEnterAttribute((((net.sourceforge.czt.oz.jaxb.gen.impl.DistOpExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.DistConjOpExprImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                        spawnHandlerFromLeaveAttribute((((net.sourceforge.czt.oz.jaxb.gen.impl.DistOpExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.DistConjOpExprImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                            spawnHandlerFromText((((net.sourceforge.czt.oz.jaxb.gen.impl.DistOpExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.DistConjOpExprImpl.this).new Unmarshaller(context)), 2, value);
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
