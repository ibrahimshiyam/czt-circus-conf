//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2004.02.19 at 05:33:12 NZDT 
//


package net.sourceforge.czt.oz.jaxb.gen.impl;

public class RenameOpExprElementImpl
    extends net.sourceforge.czt.oz.jaxb.gen.impl.RenameOpExprImpl
    implements net.sourceforge.czt.oz.jaxb.gen.RenameOpExprElement, com.sun.xml.bind.RIElement, com.sun.xml.bind.JAXBObject, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallableObject, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializable, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.ValidatableObject
{

    public final static java.lang.Class version = (net.sourceforge.czt.oz.jaxb.gen.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (net.sourceforge.czt.oz.jaxb.gen.RenameOpExprElement.class);
    }

    public java.lang.String ____jaxb_ri____getNamespaceURI() {
        return "http://czt.sourceforge.net/object-z";
    }

    public java.lang.String ____jaxb_ri____getLocalName() {
        return "RenameOpExpr";
    }

    public net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingEventHandler createUnmarshaller(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingContext context) {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.RenameOpExprElementImpl.Unmarshaller(context);
    }

    public void serializeBody(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("http://czt.sourceforge.net/object-z", "RenameOpExpr");
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
        return (net.sourceforge.czt.oz.jaxb.gen.RenameOpExprElement.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000"
+"\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv."
+"grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000"
+"\fcontentModelt\u0000 Lcom/sun/msv/grammar/Expression;xr\u0000\u001ecom.sun."
+"msv.grammar.Expression\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilon"
+"Reducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0003xp\u001880Rp"
+"p\u0000sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun."
+"msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~"
+"\u0000\u0004\u001880Gppsq\u0000~\u0000\u0007\u0016\u008ck\u0092ppsq\u0000~\u0000\u0007\u0012N\u008aRppsr\u0000\u001dcom.sun.msv.grammar.Choi"
+"ceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\b\u0003\'\u0086Sppsq\u0000~\u0000\u0000\u0003\'\u0086Hsr\u0000\u0011java.lang.Boolean\u00cd"
+" r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000p\u0000sq\u0000~\u0000\u0007\u0003\'\u0086=ppsq\u0000~\u0000\u0000\u0001\u0015\u0012\u0090pp\u0000sq\u0000~\u0000\f\u0001\u0015\u0012\u0085pp"
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
+"dummy-elementssq\u0000~\u0000\f\u0002\u0012s\u00a8ppsq\u0000~\u0000\u0017\u0002\u0012s\u009dq\u0000~\u0000\u0010psr\u0000\u001bcom.sun.msv.gr"
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
+"\f\u000f\'\u0003\u00fappsq\u0000~\u0000\f\u000e\u0011\u00f1hppsq\u0000~\u0000\f\f\u00fc\u00de\u00d6ppsq\u0000~\u0000\f\u000b\u00e7\u00ccDppsq\u0000~\u0000\f\n\u00d2\u00b9\u00b2ppsq\u0000~\u0000"
+"\f\t\u00bd\u00a7 ppsq\u0000~\u0000\f\b\u00a8\u0094\u008eppsq\u0000~\u0000\f\u0007\u0093\u0081\u00fcppsq\u0000~\u0000\f\u0006~ojppsq\u0000~\u0000\f\u0005i\\\u00d8ppsq\u0000~\u0000"
+"\f\u0004TJFppsq\u0000~\u0000\f\u0003?7\u00b4ppsq\u0000~\u0000\f\u0002*%\"ppsq\u0000~\u0000\u0000\u0001\u0015\u0012\u0090pp\u0000sq\u0000~\u0000\f\u0001\u0015\u0012\u0085ppsq\u0000~"
+"\u0000\u0014\u0001\u0015\u0012zq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001\u0015\u0012wq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00001net.sour"
+"ceforge.czt.oz.jaxb.gen.ScopeEnrichOpExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001\u0015\u0012\u0090pp\u0000s"
+"q\u0000~\u0000\f\u0001\u0015\u0012\u0085ppsq\u0000~\u0000\u0014\u0001\u0015\u0012zq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001\u0015\u0012wq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq"
+"\u0000~\u0000!t\u0000)net.sourceforge.czt.oz.jaxb.gen.SeqOpExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001"
+"\u0015\u0012\u0090pp\u0000sq\u0000~\u0000\f\u0001\u0015\u0012\u0085ppsq\u0000~\u0000\u0014\u0001\u0015\u0012zq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001\u0015\u0012wq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001e"
+"q\u0000~\u0000 sq\u0000~\u0000!t\u0000+net.sourceforge.czt.oz.jaxb.gen.ParenOpExprq\u0000~"
+"\u0000%sq\u0000~\u0000\u0000\u0001\u0015\u0012\u0090pp\u0000sq\u0000~\u0000\f\u0001\u0015\u0012\u0085ppsq\u0000~\u0000\u0014\u0001\u0015\u0012zq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001\u0015\u0012wq\u0000~\u0000\u0010pq"
+"\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00000net.sourceforge.czt.oz.jaxb.gen.DistC"
+"hoiceOpExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001\u0015\u0012\u0090pp\u0000sq\u0000~\u0000\f\u0001\u0015\u0012\u0085ppsq\u0000~\u0000\u0014\u0001\u0015\u0012zq\u0000~\u0000\u0010psq\u0000"
+"~\u0000\u0017\u0001\u0015\u0012wq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000-net.sourceforge.czt.oz."
+"jaxb.gen.DistSeqOpExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001\u0015\u0012\u0090pp\u0000sq\u0000~\u0000\f\u0001\u0015\u0012\u0085ppsq\u0000~\u0000\u0014\u0001\u0015"
+"\u0012zq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001\u0015\u0012wq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00002net.sourcefo"
+"rge.czt.oz.jaxb.gen.BasicOpExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001\u0015\u0012\u0090pp\u0000sq\u0000~"
+"\u0000\f\u0001\u0015\u0012\u0085ppsq\u0000~\u0000\u0014\u0001\u0015\u0012zq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001\u0015\u0012wq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000"
+"!t\u0000*net.sourceforge.czt.oz.jaxb.gen.ConjOpExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001\u0015\u0012"
+"\u0090pp\u0000sq\u0000~\u0000\f\u0001\u0015\u0012\u0085ppsq\u0000~\u0000\u0014\u0001\u0015\u0012zq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001\u0015\u0012wq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000"
+"~\u0000 sq\u0000~\u0000!t\u00003net.sourceforge.czt.oz.jaxb.gen.RenameOpExprElem"
+"entq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001\u0015\u0012\u0090pp\u0000sq\u0000~\u0000\f\u0001\u0015\u0012\u0085ppsq\u0000~\u0000\u0014\u0001\u0015\u0012zq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001\u0015\u0012wq"
+"\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00006net.sourceforge.czt.oz.jaxb.gen"
+".OpPromotionExprElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001\u0015\u0012\u0090pp\u0000sq\u0000~\u0000\f\u0001\u0015\u0012\u0085ppsq\u0000~\u0000\u0014\u0001"
+"\u0015\u0012zq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001\u0015\u0012wq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000.net.sourcef"
+"orge.czt.oz.jaxb.gen.ParallelOpExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001\u0015\u0012\u0090pp\u0000sq\u0000~\u0000\f\u0001"
+"\u0015\u0012\u0085ppsq\u0000~\u0000\u0014\u0001\u0015\u0012zq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001\u0015\u0012wq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000"
+"2net.sourceforge.czt.oz.jaxb.gen.AssoParallelOpExprq\u0000~\u0000%sq\u0000~"
+"\u0000\u0000\u0001\u0015\u0012\u0090pp\u0000sq\u0000~\u0000\f\u0001\u0015\u0012\u0085ppsq\u0000~\u0000\u0014\u0001\u0015\u0012zq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001\u0015\u0012wq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000"
+"~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00001net.sourceforge.czt.oz.jaxb.gen.HideOpExprE"
+"lementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001\u0015\u0012\u0090pp\u0000sq\u0000~\u0000\f\u0001\u0015\u0012\u0085ppsq\u0000~\u0000\u0014\u0001\u0015\u0012zq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001\u0015"
+"\u0012wq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000.net.sourceforge.czt.oz.jaxb."
+"gen.ExChoiceOpExprq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001\u0015\u0012\u0090pp\u0000sq\u0000~\u0000\f\u0001\u0015\u0012\u0085ppsq\u0000~\u0000\u0014\u0001\u0015\u0012zq\u0000"
+"~\u0000\u0010psq\u0000~\u0000\u0017\u0001\u0015\u0012wq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000.net.sourceforge."
+"czt.oz.jaxb.gen.DistConjOpExprq\u0000~\u0000%sq\u0000~\u0000\u0014\u0004=\u00e1;ppsq\u0000~\u0000\f\u0004=\u00e18pps"
+"q\u0000~\u0000\u0000\u0001\u0015\u0012\u0090pp\u0000sq\u0000~\u0000\f\u0001\u0015\u0012\u0085ppsq\u0000~\u0000\u0014\u0001\u0015\u0012zq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001\u0015\u0012wq\u0000~\u0000\u0010pq\u0000~\u0000"
+"\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00002net.sourceforge.czt.z.jaxb.gen.NameNameP"
+"airElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0003(\u00ce\u00a6pp\u0000sq\u0000~\u0000\u0007\u0003(\u00ce\u009bppsq\u0000~\u0000\u0000\u0001\u0015\u0012\u0090pp\u0000sq\u0000~\u0000\f\u0001"
+"\u0015\u0012\u0085ppsq\u0000~\u0000\u0014\u0001\u0015\u0012zq\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u0001\u0015\u0012wq\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000"
+"+net.sourceforge.czt.z.jaxb.gen.NameNamePairq\u0000~\u0000%sq\u0000~\u0000\f\u0002\u0013\u00bc\u0006p"
+"psq\u0000~\u0000\u0017\u0002\u0013\u00bb\u00fbq\u0000~\u0000\u0010pq\u0000~\u0000+sq\u0000~\u0000!q\u0000~\u0000<q\u0000~\u0000=q\u0000~\u0000 sq\u0000~\u0000!t\u0000\fNameName"
+"Pairq\u0000~\u0000@sq\u0000~\u0000\f\u0001\u00ab\u00c4\u00b0ppsq\u0000~\u0000\u0017\u0001\u00ab\u00c4\u00a5q\u0000~\u0000\u0010pq\u0000~\u0000+sq\u0000~\u0000!q\u0000~\u0000<q\u0000~\u0000=q\u0000"
+"~\u0000 sq\u0000~\u0000!t\u0000\fRenameOpExprt\u0000#http://czt.sourceforge.net/object"
+"-zsr\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTab"
+"let\u0000/Lcom/sun/msv/grammar/ExpressionPool$ClosedHash;xpsr\u0000-co"
+"m.sun.msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0002\u0000\u0004I\u0000\u0005cou"
+"ntI\u0000\tthresholdL\u0000\u0006parentq\u0000~\u0000\u00be[\u0000\u0005tablet\u0000![Lcom/sun/msv/grammar"
+"/Expression;xp\u0000\u0000\u0000:\u0000\u0000\u0000rpur\u0000![Lcom.sun.msv.grammar.Expression;"
+"\u00d68D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp\u0000\u0000\u0001\u007fpppppppq\u0000~\u0000Mppppppppq\u0000~\u0000Kppppppppq\u0000~\u0000Ippppp"
+"pppq\u0000~\u0000Gppppppppq\u0000~\u0000Eppppppppq\u0000~\u0000Cppppppppq\u0000~\u0000Appppppppppppp"
+"pppppppppppppppppppppppppppppppppppppq\u0000~\u0000\u00b2pppppppppppppq\u0000~\u0000\u0011"
+"ppppppppq\u0000~\u0000\u00a3q\u0000~\u0000\tpq\u0000~\u0000\u00a2pppppppppq\u0000~\u0000\rpppppppq\u0000~\u0000\u00b7pppppppppp"
+"pppppq\u0000~\u0000\u00aeq\u0000~\u0000\u00a6q\u0000~\u0000\u009eq\u0000~\u0000\u0098q\u0000~\u0000\u0092q\u0000~\u0000\u008cq\u0000~\u0000\u0086q\u0000~\u0000\u0080q\u0000~\u0000zq\u0000~\u0000tq\u0000~\u0000n"
+"q\u0000~\u0000\u00adq\u0000~\u0000\u00a5q\u0000~\u0000\u009dq\u0000~\u0000\u0097q\u0000~\u0000\u0091q\u0000~\u0000\u008bq\u0000~\u0000\u0085q\u0000~\u0000\u007fq\u0000~\u0000yq\u0000~\u0000sq\u0000~\u0000mq\u0000~\u0000g"
+"q\u0000~\u0000aq\u0000~\u0000[q\u0000~\u0000Uq\u0000~\u0000Oq\u0000~\u0000\u0013q\u0000~\u0000hq\u0000~\u0000bq\u0000~\u0000\\q\u0000~\u0000Lq\u0000~\u0000Vq\u0000~\u0000Pq\u0000~\u0000\u0016"
+"pppppq\u0000~\u0000Jpq\u0000~\u0000\u000bppppppq\u0000~\u0000Hppppppppq\u0000~\u0000Fppppppppq\u0000~\u0000Dppppppp"
+"pq\u0000~\u0000Bpppppppppppppppppppppppppppppppppppppppppppppppppppppp"
+"pppppppq\u0000~\u0000&q\u0000~\u0000\u00abppppppppppppppppppppppppppppppppppppppppppp"
+"ppq\u0000~\u0000\nppppppppppppppppppppppppp"));
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
            return net.sourceforge.czt.oz.jaxb.gen.impl.RenameOpExprElementImpl.this;
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
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.RenameOpExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.RenameOpExprElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("ScopeEnrichOpExpr" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.RenameOpExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.RenameOpExprElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("SeqOpExpr" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.RenameOpExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.RenameOpExprElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("ParenOpExpr" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.RenameOpExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.RenameOpExprElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("DistChoiceOpExpr" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.RenameOpExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.RenameOpExprElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("DistSeqOpExpr" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.RenameOpExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.RenameOpExprElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("BasicOpExpr" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.RenameOpExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.RenameOpExprElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("ConjOpExpr" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.RenameOpExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.RenameOpExprElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("RenameOpExpr" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.RenameOpExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.RenameOpExprElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("OpPromotionExpr" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.RenameOpExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.RenameOpExprElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("ParallelOpExpr" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.RenameOpExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.RenameOpExprElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("AssoParallelOpExpr" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.RenameOpExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.RenameOpExprElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("HideOpExpr" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.RenameOpExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.RenameOpExprElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("ExChoiceOpExpr" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.RenameOpExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.RenameOpExprElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("DistConjOpExpr" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.RenameOpExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.RenameOpExprElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("OperationExpr" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.RenameOpExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.RenameOpExprElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("OperationExpr" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.RenameOpExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.RenameOpExprElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        spawnHandlerFromEnterElement((((net.sourceforge.czt.oz.jaxb.gen.impl.RenameOpExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.RenameOpExprElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                        return ;
                    case  0 :
                        if (("RenameOpExpr" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
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
                        spawnHandlerFromLeaveElement((((net.sourceforge.czt.oz.jaxb.gen.impl.RenameOpExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.RenameOpExprElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                        return ;
                    case  2 :
                        if (("RenameOpExpr" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
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
                        spawnHandlerFromEnterAttribute((((net.sourceforge.czt.oz.jaxb.gen.impl.RenameOpExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.RenameOpExprElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                        spawnHandlerFromLeaveAttribute((((net.sourceforge.czt.oz.jaxb.gen.impl.RenameOpExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.RenameOpExprElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                            spawnHandlerFromText((((net.sourceforge.czt.oz.jaxb.gen.impl.RenameOpExprImpl)net.sourceforge.czt.oz.jaxb.gen.impl.RenameOpExprElementImpl.this).new Unmarshaller(context)), 2, value);
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
