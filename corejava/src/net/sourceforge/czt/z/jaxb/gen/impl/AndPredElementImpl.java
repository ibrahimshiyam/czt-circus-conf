//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2004.02.19 at 05:33:12 NZDT 
//


package net.sourceforge.czt.z.jaxb.gen.impl;

public class AndPredElementImpl
    extends net.sourceforge.czt.z.jaxb.gen.impl.AndPredImpl
    implements net.sourceforge.czt.z.jaxb.gen.AndPredElement, com.sun.xml.bind.RIElement, com.sun.xml.bind.JAXBObject, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallableObject, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializable, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.ValidatableObject
{

    public final static java.lang.Class version = (net.sourceforge.czt.z.jaxb.gen.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (net.sourceforge.czt.z.jaxb.gen.AndPredElement.class);
    }

    public java.lang.String ____jaxb_ri____getNamespaceURI() {
        return "http://czt.sourceforge.net/zml";
    }

    public java.lang.String ____jaxb_ri____getLocalName() {
        return "AndPred";
    }

    public net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingEventHandler createUnmarshaller(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingContext context) {
        return new net.sourceforge.czt.z.jaxb.gen.impl.AndPredElementImpl.Unmarshaller(context);
    }

    public void serializeBody(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("http://czt.sourceforge.net/zml", "AndPred");
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
        return (net.sourceforge.czt.z.jaxb.gen.AndPredElement.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000"
+"\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv."
+"grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000"
+"\fcontentModelt\u0000 Lcom/sun/msv/grammar/Expression;xr\u0000\u001ecom.sun."
+"msv.grammar.Expression\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilon"
+"Reducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0003xp*x\u0001Yp"
+"p\u0000sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun."
+"msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~"
+"\u0000\u0004*x\u0001Nppsq\u0000~\u0000\u0007(\u00aa\u0098wppsq\u0000~\u0000\u0007&\u0001\u00fd+ppsq\u0000~\u0000\u0007\u0014\u00b0\u00d4\bppsr\u0000\u001dcom.sun.msv."
+"grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\b\u0003_\u00aa\u00e5ppsq\u0000~\u0000\u0000\u0003_\u00aa\u00dasr\u0000\u0011java.l"
+"ang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000p\u0000sq\u0000~\u0000\u0007\u0003_\u00aa\u00cfppsq\u0000~\u0000\u0000\u0001\u0015\u0012\u0090pp\u0000"
+"sq\u0000~\u0000\r\u0001\u0015\u0012\u0085ppsr\u0000 com.sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000x"
+"r\u0000\u001ccom.sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0003xq\u0000~\u0000\u0004\u0001"
+"\u0015\u0012zq\u0000~\u0000\u0011psr\u0000 com.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003e"
+"xpq\u0000~\u0000\u0003L\u0000\tnameClassq\u0000~\u0000\u0001xq\u0000~\u0000\u0004\u0001\u0015\u0012wq\u0000~\u0000\u0011psr\u00002com.sun.msv.gram"
+"mar.Expression$AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\bsq\u0000~\u0000"
+"\u0010\u0001q\u0000~\u0000\u001bsr\u0000 com.sun.msv.grammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dco"
+"m.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.gram"
+"mar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\tq\u0000~\u0000\u001cq\u0000"
+"~\u0000!sr\u0000#com.sun.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tloca"
+"lNamet\u0000\u0012Ljava/lang/String;L\u0000\fnamespaceURIq\u0000~\u0000#xq\u0000~\u0000\u001et\u0000-net.s"
+"ourceforge.czt.z.jaxb.gen.TermA.AnnsTypet\u0000+http://java.sun.c"
+"om/jaxb/xjc/dummy-elementssq\u0000~\u0000\r\u0002J\u0098:ppsq\u0000~\u0000\u0018\u0002J\u0098/q\u0000~\u0000\u0011psr\u0000\u001bco"
+"m.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/dat"
+"atype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0003L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/Str"
+"ingPair;xq\u0000~\u0000\u0004\u0001\u0007\u00bd\u001dppsr\u0000\"com.sun.msv.datatype.xsd.QnameType\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr"
+"\u0000\'com.sun.msv.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnames"
+"paceUriq\u0000~\u0000#L\u0000\btypeNameq\u0000~\u0000#L\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/dat"
+"atype/xsd/WhiteSpaceProcessor;xpt\u0000 http://www.w3.org/2001/XM"
+"LSchemat\u0000\u0005QNamesr\u00005com.sun.msv.datatype.xsd.WhiteSpaceProces"
+"sor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.WhiteSpa"
+"ceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$N"
+"ullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\nq\u0000~\u0000\u0011psr\u0000\u001bcom.sun.msv.u"
+"til.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000#L\u0000\fnamespaceURIq\u0000~"
+"\u0000#xpq\u0000~\u00004q\u0000~\u00003sq\u0000~\u0000\"t\u0000\u0004typet\u0000)http://www.w3.org/2001/XMLSche"
+"ma-instanceq\u0000~\u0000!sq\u0000~\u0000\"t\u0000\u0004Annst\u0000\u001ehttp://czt.sourceforge.net/z"
+"mlq\u0000~\u0000!sq\u0000~\u0000\r\u0011Q)\u001eppsq\u0000~\u0000\r\u0010<\u0016\u008cppsq\u0000~\u0000\r\u000f\'\u0003\u00fappsq\u0000~\u0000\r\u000e\u0011\u00f1hppsq\u0000~\u0000"
+"\r\f\u00fc\u00de\u00d6ppsq\u0000~\u0000\r\u000b\u00e7\u00ccDppsq\u0000~\u0000\r\n\u00d2\u00b9\u00b2ppsq\u0000~\u0000\r\t\u00bd\u00a7 ppsq\u0000~\u0000\r\b\u00a8\u0094\u008eppsq\u0000~\u0000"
+"\r\u0007\u0093\u0081\u00fcppsq\u0000~\u0000\r\u0006~ojppsq\u0000~\u0000\r\u0005i\\\u00d8ppsq\u0000~\u0000\r\u0004TJFppsq\u0000~\u0000\r\u0003?7\u00b4ppsq\u0000~\u0000"
+"\r\u0002*%\"ppsq\u0000~\u0000\u0000\u0001\u0015\u0012\u0090pp\u0000sq\u0000~\u0000\r\u0001\u0015\u0012\u0085ppsq\u0000~\u0000\u0015\u0001\u0015\u0012zq\u0000~\u0000\u0011psq\u0000~\u0000\u0018\u0001\u0015\u0012wq\u0000"
+"~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"t\u0000(net.sourceforge.czt.z.jaxb.gen.F"
+"alsePredq\u0000~\u0000&sq\u0000~\u0000\u0000\u0001\u0015\u0012\u0090pp\u0000sq\u0000~\u0000\r\u0001\u0015\u0012\u0085ppsq\u0000~\u0000\u0015\u0001\u0015\u0012zq\u0000~\u0000\u0011psq\u0000~\u0000\u0018"
+"\u0001\u0015\u0012wq\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"t\u0000\'net.sourceforge.czt.z.jaxb"
+".gen.TruePredq\u0000~\u0000&sq\u0000~\u0000\u0000\u0001\u0015\u0012\u0090pp\u0000sq\u0000~\u0000\r\u0001\u0015\u0012\u0085ppsq\u0000~\u0000\u0015\u0001\u0015\u0012zq\u0000~\u0000\u0011ps"
+"q\u0000~\u0000\u0018\u0001\u0015\u0012wq\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"t\u0000*net.sourceforge.czt.z"
+".jaxb.gen.ImpliesPredq\u0000~\u0000&sq\u0000~\u0000\u0000\u0001\u0015\u0012\u0090pp\u0000sq\u0000~\u0000\r\u0001\u0015\u0012\u0085ppsq\u0000~\u0000\u0015\u0001\u0015\u0012"
+"zq\u0000~\u0000\u0011psq\u0000~\u0000\u0018\u0001\u0015\u0012wq\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"t\u0000-net.sourcefor"
+"ge.czt.z.jaxb.gen.MemPredElementq\u0000~\u0000&sq\u0000~\u0000\u0000\u0001\u0015\u0012\u0090pp\u0000sq\u0000~\u0000\r\u0001\u0015\u0012\u0085"
+"ppsq\u0000~\u0000\u0015\u0001\u0015\u0012zq\u0000~\u0000\u0011psq\u0000~\u0000\u0018\u0001\u0015\u0012wq\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"t\u0000&ne"
+"t.sourceforge.czt.z.jaxb.gen.IffPredq\u0000~\u0000&sq\u0000~\u0000\u0000\u0001\u0015\u0012\u0090pp\u0000sq\u0000~\u0000\r"
+"\u0001\u0015\u0012\u0085ppsq\u0000~\u0000\u0015\u0001\u0015\u0012zq\u0000~\u0000\u0011psq\u0000~\u0000\u0018\u0001\u0015\u0012wq\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"t"
+"\u0000%net.sourceforge.czt.z.jaxb.gen.OrPredq\u0000~\u0000&sq\u0000~\u0000\u0000\u0001\u0015\u0012\u0090pp\u0000sq\u0000"
+"~\u0000\r\u0001\u0015\u0012\u0085ppsq\u0000~\u0000\u0015\u0001\u0015\u0012zq\u0000~\u0000\u0011psq\u0000~\u0000\u0018\u0001\u0015\u0012wq\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~"
+"\u0000\"t\u0000)net.sourceforge.czt.z.jaxb.gen.ExistsPredq\u0000~\u0000&sq\u0000~\u0000\u0000\u0001\u0015\u0012"
+"\u0090pp\u0000sq\u0000~\u0000\r\u0001\u0015\u0012\u0085ppsq\u0000~\u0000\u0015\u0001\u0015\u0012zq\u0000~\u0000\u0011psq\u0000~\u0000\u0018\u0001\u0015\u0012wq\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000"
+"~\u0000!sq\u0000~\u0000\"t\u0000*net.sourceforge.czt.z.jaxb.gen.Exists1Predq\u0000~\u0000&s"
+"q\u0000~\u0000\u0000\u0001\u0015\u0012\u0090pp\u0000sq\u0000~\u0000\r\u0001\u0015\u0012\u0085ppsq\u0000~\u0000\u0015\u0001\u0015\u0012zq\u0000~\u0000\u0011psq\u0000~\u0000\u0018\u0001\u0015\u0012wq\u0000~\u0000\u0011pq\u0000~\u0000"
+"\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"t\u0000+net.sourceforge.czt.z.jaxb.gen.Pred2Elem"
+"entq\u0000~\u0000&sq\u0000~\u0000\u0000\u0001\u0015\u0012\u0090pp\u0000sq\u0000~\u0000\r\u0001\u0015\u0012\u0085ppsq\u0000~\u0000\u0015\u0001\u0015\u0012zq\u0000~\u0000\u0011psq\u0000~\u0000\u0018\u0001\u0015\u0012wq"
+"\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"t\u0000-net.sourceforge.czt.z.jaxb.gen."
+"AndPredElementq\u0000~\u0000&sq\u0000~\u0000\u0000\u0001\u0015\u0012\u0090pp\u0000sq\u0000~\u0000\r\u0001\u0015\u0012\u0085ppsq\u0000~\u0000\u0015\u0001\u0015\u0012zq\u0000~\u0000\u0011p"
+"sq\u0000~\u0000\u0018\u0001\u0015\u0012wq\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"t\u0000)net.sourceforge.czt."
+"z.jaxb.gen.ForallPredq\u0000~\u0000&sq\u0000~\u0000\u0000\u0001\u0015\u0012\u0090pp\u0000sq\u0000~\u0000\r\u0001\u0015\u0012\u0085ppsq\u0000~\u0000\u0015\u0001\u0015\u0012"
+"zq\u0000~\u0000\u0011psq\u0000~\u0000\u0018\u0001\u0015\u0012wq\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"t\u0000-net.sourcefor"
+"ge.czt.z.jaxb.gen.NegPredElementq\u0000~\u0000&sq\u0000~\u0000\u0000\u0001\u0015\u0012\u0090pp\u0000sq\u0000~\u0000\r\u0001\u0015\u0012\u0085"
+"ppsq\u0000~\u0000\u0015\u0001\u0015\u0012zq\u0000~\u0000\u0011psq\u0000~\u0000\u0018\u0001\u0015\u0012wq\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"t\u0000-ne"
+"t.sourceforge.czt.z.jaxb.gen.QntPredElementq\u0000~\u0000&sq\u0000~\u0000\u0000\u0001\u0015\u0012\u0090pp"
+"\u0000sq\u0000~\u0000\r\u0001\u0015\u0012\u0085ppsq\u0000~\u0000\u0015\u0001\u0015\u0012zq\u0000~\u0000\u0011psq\u0000~\u0000\u0018\u0001\u0015\u0012wq\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!"
+"sq\u0000~\u0000\"t\u0000.net.sourceforge.czt.z.jaxb.gen.ExprPredElementq\u0000~\u0000&"
+"sq\u0000~\u0000\u0000\u0001\u0015\u0012\u0090pp\u0000sq\u0000~\u0000\r\u0001\u0015\u0012\u0085ppsq\u0000~\u0000\u0015\u0001\u0015\u0012zq\u0000~\u0000\u0011psq\u0000~\u0000\u0018\u0001\u0015\u0012wq\u0000~\u0000\u0011pq\u0000~"
+"\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"t\u00003net.sourceforge.czt.zpatt.jaxb.gen.Joke"
+"rPredElementq\u0000~\u0000&sq\u0000~\u0000\u0000\u0001\u0015\u0012\u0090pp\u0000sq\u0000~\u0000\r\u0001\u0015\u0012\u0085ppsq\u0000~\u0000\u0015\u0001\u0015\u0012zq\u0000~\u0000\u0011psq"
+"\u0000~\u0000\u0018\u0001\u0015\u0012wq\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"t\u0000*net.sourceforge.czt.z."
+"jaxb.gen.FactElementq\u0000~\u0000&sq\u0000~\u0000\r\u0011Q)\u001eppsq\u0000~\u0000\r\u0010<\u0016\u008cppsq\u0000~\u0000\r\u000f\'\u0003\u00fap"
+"psq\u0000~\u0000\r\u000e\u0011\u00f1hppsq\u0000~\u0000\r\f\u00fc\u00de\u00d6ppsq\u0000~\u0000\r\u000b\u00e7\u00ccDppsq\u0000~\u0000\r\n\u00d2\u00b9\u00b2ppsq\u0000~\u0000\r\t\u00bd\u00a7 p"
+"psq\u0000~\u0000\r\b\u00a8\u0094\u008eppsq\u0000~\u0000\r\u0007\u0093\u0081\u00fcppsq\u0000~\u0000\r\u0006~ojppsq\u0000~\u0000\r\u0005i\\\u00d8ppsq\u0000~\u0000\r\u0004TJFp"
+"psq\u0000~\u0000\r\u0003?7\u00b4ppsq\u0000~\u0000\r\u0002*%\"ppsq\u0000~\u0000\u0000\u0001\u0015\u0012\u0090pp\u0000sq\u0000~\u0000\r\u0001\u0015\u0012\u0085ppsq\u0000~\u0000\u0015\u0001\u0015\u0012z"
+"q\u0000~\u0000\u0011psq\u0000~\u0000\u0018\u0001\u0015\u0012wq\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"q\u0000~\u0000Vq\u0000~\u0000&sq\u0000~\u0000\u0000\u0001"
+"\u0015\u0012\u0090pp\u0000sq\u0000~\u0000\r\u0001\u0015\u0012\u0085ppsq\u0000~\u0000\u0015\u0001\u0015\u0012zq\u0000~\u0000\u0011psq\u0000~\u0000\u0018\u0001\u0015\u0012wq\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001f"
+"q\u0000~\u0000!sq\u0000~\u0000\"q\u0000~\u0000\\q\u0000~\u0000&sq\u0000~\u0000\u0000\u0001\u0015\u0012\u0090pp\u0000sq\u0000~\u0000\r\u0001\u0015\u0012\u0085ppsq\u0000~\u0000\u0015\u0001\u0015\u0012zq\u0000~\u0000"
+"\u0011psq\u0000~\u0000\u0018\u0001\u0015\u0012wq\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"q\u0000~\u0000bq\u0000~\u0000&sq\u0000~\u0000\u0000\u0001\u0015\u0012\u0090p"
+"p\u0000sq\u0000~\u0000\r\u0001\u0015\u0012\u0085ppsq\u0000~\u0000\u0015\u0001\u0015\u0012zq\u0000~\u0000\u0011psq\u0000~\u0000\u0018\u0001\u0015\u0012wq\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000"
+"!sq\u0000~\u0000\"q\u0000~\u0000hq\u0000~\u0000&sq\u0000~\u0000\u0000\u0001\u0015\u0012\u0090pp\u0000sq\u0000~\u0000\r\u0001\u0015\u0012\u0085ppsq\u0000~\u0000\u0015\u0001\u0015\u0012zq\u0000~\u0000\u0011psq"
+"\u0000~\u0000\u0018\u0001\u0015\u0012wq\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"q\u0000~\u0000nq\u0000~\u0000&sq\u0000~\u0000\u0000\u0001\u0015\u0012\u0090pp\u0000sq"
+"\u0000~\u0000\r\u0001\u0015\u0012\u0085ppsq\u0000~\u0000\u0015\u0001\u0015\u0012zq\u0000~\u0000\u0011psq\u0000~\u0000\u0018\u0001\u0015\u0012wq\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000"
+"~\u0000\"q\u0000~\u0000tq\u0000~\u0000&sq\u0000~\u0000\u0000\u0001\u0015\u0012\u0090pp\u0000sq\u0000~\u0000\r\u0001\u0015\u0012\u0085ppsq\u0000~\u0000\u0015\u0001\u0015\u0012zq\u0000~\u0000\u0011psq\u0000~\u0000\u0018"
+"\u0001\u0015\u0012wq\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"q\u0000~\u0000zq\u0000~\u0000&sq\u0000~\u0000\u0000\u0001\u0015\u0012\u0090pp\u0000sq\u0000~\u0000\r"
+"\u0001\u0015\u0012\u0085ppsq\u0000~\u0000\u0015\u0001\u0015\u0012zq\u0000~\u0000\u0011psq\u0000~\u0000\u0018\u0001\u0015\u0012wq\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"q"
+"\u0000~\u0000\u0080q\u0000~\u0000&sq\u0000~\u0000\u0000\u0001\u0015\u0012\u0090pp\u0000sq\u0000~\u0000\r\u0001\u0015\u0012\u0085ppsq\u0000~\u0000\u0015\u0001\u0015\u0012zq\u0000~\u0000\u0011psq\u0000~\u0000\u0018\u0001\u0015\u0012w"
+"q\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"q\u0000~\u0000\u0086q\u0000~\u0000&sq\u0000~\u0000\u0000\u0001\u0015\u0012\u0090pp\u0000sq\u0000~\u0000\r\u0001\u0015\u0012\u0085"
+"ppsq\u0000~\u0000\u0015\u0001\u0015\u0012zq\u0000~\u0000\u0011psq\u0000~\u0000\u0018\u0001\u0015\u0012wq\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"q\u0000~\u0000\u008c"
+"q\u0000~\u0000&sq\u0000~\u0000\u0000\u0001\u0015\u0012\u0090pp\u0000sq\u0000~\u0000\r\u0001\u0015\u0012\u0085ppsq\u0000~\u0000\u0015\u0001\u0015\u0012zq\u0000~\u0000\u0011psq\u0000~\u0000\u0018\u0001\u0015\u0012wq\u0000~\u0000"
+"\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"q\u0000~\u0000\u0092q\u0000~\u0000&sq\u0000~\u0000\u0000\u0001\u0015\u0012\u0090pp\u0000sq\u0000~\u0000\r\u0001\u0015\u0012\u0085ppsq"
+"\u0000~\u0000\u0015\u0001\u0015\u0012zq\u0000~\u0000\u0011psq\u0000~\u0000\u0018\u0001\u0015\u0012wq\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"q\u0000~\u0000\u0098q\u0000~\u0000"
+"&sq\u0000~\u0000\u0000\u0001\u0015\u0012\u0090pp\u0000sq\u0000~\u0000\r\u0001\u0015\u0012\u0085ppsq\u0000~\u0000\u0015\u0001\u0015\u0012zq\u0000~\u0000\u0011psq\u0000~\u0000\u0018\u0001\u0015\u0012wq\u0000~\u0000\u0011pq\u0000"
+"~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"q\u0000~\u0000\u009eq\u0000~\u0000&sq\u0000~\u0000\u0000\u0001\u0015\u0012\u0090pp\u0000sq\u0000~\u0000\r\u0001\u0015\u0012\u0085ppsq\u0000~\u0000\u0015"
+"\u0001\u0015\u0012zq\u0000~\u0000\u0011psq\u0000~\u0000\u0018\u0001\u0015\u0012wq\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"q\u0000~\u0000\u00a4q\u0000~\u0000&sq\u0000"
+"~\u0000\u0000\u0001\u0015\u0012\u0090pp\u0000sq\u0000~\u0000\r\u0001\u0015\u0012\u0085ppsq\u0000~\u0000\u0015\u0001\u0015\u0012zq\u0000~\u0000\u0011psq\u0000~\u0000\u0018\u0001\u0015\u0012wq\u0000~\u0000\u0011pq\u0000~\u0000\u001bq"
+"\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"q\u0000~\u0000\u00aaq\u0000~\u0000&sq\u0000~\u0000\u0000\u0001\u0015\u0012\u0090pp\u0000sq\u0000~\u0000\r\u0001\u0015\u0012\u0085ppsq\u0000~\u0000\u0015\u0001\u0015\u0012z"
+"q\u0000~\u0000\u0011psq\u0000~\u0000\u0018\u0001\u0015\u0012wq\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"q\u0000~\u0000\u00b0q\u0000~\u0000&sq\u0000~\u0000\r\u0002"
+"\u00a8\u009bGppsq\u0000~\u0000\u0018\u0002\u00a8\u009b<q\u0000~\u0000\u0011psq\u0000~\u0000)\u0001\u00f9\u00cd\u00eappsr\u0000)com.sun.msv.datatype.xs"
+"d.EnumerationFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0006valuest\u0000\u000fLjava/util/Set;xr\u00009"
+"com.sun.msv.datatype.xsd.DataTypeWithValueConstraintFacet\"\u00a7R"
+"o\u00ca\u00c7\u008aT\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.DataTypeWithFacet\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0005Z\u0000\fisFacetFixedZ\u0000\u0012needValueCheckFlagL\u0000\bbaseTypet\u0000)Lcom/"
+"sun/msv/datatype/xsd/XSDatatypeImpl;L\u0000\fconcreteTypet\u0000\'Lcom/s"
+"un/msv/datatype/xsd/ConcreteType;L\u0000\tfacetNameq\u0000~\u0000#xq\u0000~\u00000q\u0000~\u0000"
+"At\u0000\u0002Opsr\u00005com.sun.msv.datatype.xsd.WhiteSpaceProcessor$Prese"
+"rve\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u00006\u0000\u0000sr\u0000#com.sun.msv.datatype.xsd.StringTyp"
+"e\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\risAlwaysValidxq\u0000~\u0000.q\u0000~\u00003t\u0000\u0006stringq\u0000~\u0001\u001c\u0001q\u0000~\u0001\u001et"
+"\u0000\u000benumerationsr\u0000\u0011java.util.HashSet\u00baD\u0085\u0095\u0096\u00b8\u00b74\u0003\u0000\u0000xpw\f\u0000\u0000\u0000\u0010?@\u0000\u0000\u0000\u0000\u0000"
+"\u0004t\u0000\u0002NLt\u0000\u0003Andt\u0000\u0004Semit\u0000\u0005Chainxq\u0000~\u00009sq\u0000~\u0000:q\u0000~\u0001\u001aq\u0000~\u0000Asq\u0000~\u0000\"t\u0000\u0002Op"
+"t\u0000\u0000q\u0000~\u0000!sq\u0000~\u0000\r\u0001\u00cdh\u00d2ppsq\u0000~\u0000\u0018\u0001\u00cdh\u00c7q\u0000~\u0000\u0011pq\u0000~\u0000,sq\u0000~\u0000\"q\u0000~\u0000=q\u0000~\u0000>q\u0000~"
+"\u0000!sq\u0000~\u0000\"t\u0000\u0007AndPredq\u0000~\u0000Asr\u0000\"com.sun.msv.grammar.ExpressionPoo"
+"l\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/ExpressionPoo"
+"l$ClosedHash;xpsr\u0000-com.sun.msv.grammar.ExpressionPool$Closed"
+"Hash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0002\u0000\u0004I\u0000\u0005countI\u0000\tthresholdL\u0000\u0006parentq\u0000~\u00011[\u0000\u0005tablet\u0000!"
+"[Lcom/sun/msv/grammar/Expression;xp\u0000\u0000\u0000i\u0000\u0000\u0000rpur\u0000![Lcom.sun.ms"
+"v.grammar.Expression;\u00d68D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp\u0000\u0000\u0001\u007fpppppppq\u0000~\u0000Pq\u0000~\u0000\u00bfppppp"
+"ppq\u0000~\u0000Nq\u0000~\u0000\u00bdpppppq\u0000~\u0000\u0012pq\u0000~\u0000Lq\u0000~\u0000\u00bbpppppppq\u0000~\u0000Jq\u0000~\u0000\u00b9pppppppq\u0000~"
+"\u0000Hq\u0000~\u0000\u00b7q\u0000~\u0000\u000epppppq\u0000~\u0001\u0010q\u0000~\u0000Fq\u0000~\u0000\u00b5pppppppq\u0000~\u0000Dq\u0000~\u0000\u00b3pppppppq\u0000~\u0000"
+"Bq\u0000~\u0000\u00b1ppppppppppppppppppppppppppppppppppppppppppppppppq\u0000~\u0000\fp"
+"ppppppppppppppppppppppppppppppppppppppppppppppppppq\u0000~\u0000\u00c7q\u0000~\u0000\u00c2"
+"q\u0000~\u0000\u00adq\u0000~\u0000\u00a7q\u0000~\u0000\u00a1q\u0000~\u0000\u009bq\u0000~\u0000\u0095q\u0000~\u0000\u008fq\u0000~\u0000\u0089q\u0000~\u0000\u0083q\u0000~\u0000}q\u0000~\u0000\u00c6q\u0000~\u0000\u00c1q\u0000~\u0000\u00ac"
+"q\u0000~\u0000\u00a6q\u0000~\u0000\u00a0q\u0000~\u0000\u009aq\u0000~\u0000\u0094q\u0000~\u0000\u008eq\u0000~\u0000\u0088q\u0000~\u0000\u0082q\u0000~\u0000|q\u0000~\u0000vq\u0000~\u0000pq\u0000~\u0000jq\u0000~\u0000d"
+"q\u0000~\u0000^q\u0000~\u0000Xq\u0000~\u0000Rq\u0000~\u0000\u0014q\u0000~\u0000wq\u0000~\u0000Oq\u0000~\u0000qq\u0000~\u0000kq\u0000~\u0000eq\u0000~\u0000\'q\u0000~\u0000_q\u0000~\u0000Y"
+"q\u0000~\u0000Sq\u0000~\u0000\u0017q\u0000~\u0000Mq\u0000~\u0000\u00ccq\u0000~\u0000\u00cbq\u0000~\u0000\u00beq\u0000~\u0000\u00d1q\u0000~\u0000\u00d0q\u0000~\u0000\u00d6q\u0000~\u0000\u00d5q\u0000~\u0000\u00bcq\u0000~\u0000K"
+"q\u0000~\u0000\u00dbq\u0000~\u0000\u00daq\u0000~\u0000\u00e0q\u0000~\u0000\u00dfq\u0000~\u0000\u00baq\u0000~\u0000\u00e5q\u0000~\u0000\u00e4q\u0000~\u0000\u00eaq\u0000~\u0000Iq\u0000~\u0000\u00e9q\u0000~\u0000\u00b8q\u0000~\u0000\u00ef"
+"q\u0000~\u0000\u00eeq\u0000~\u0000\u00f4q\u0000~\u0000\u00f3q\u0000~\u0000\u00f9q\u0000~\u0000\u00f8q\u0000~\u0000Gq\u0000~\u0000\u00b6q\u0000~\u0000\u00feq\u0000~\u0000\u00fdq\u0000~\u0001\u0003q\u0000~\u0001\u0002q\u0000~\u0001\b"
+"q\u0000~\u0001\u0007q\u0000~\u0001\rq\u0000~\u0000Eq\u0000~\u0000\u00b4q\u0000~\u0001\fq\u0000~\u0000\u000bq\u0000~\u0000\nq\u0000~\u0000\tpppq\u0000~\u0000Cq\u0000~\u0000\u00b2ppppppp"
+"ppppppppppppppppppppppppppppppppppppppppppppppppq\u0000~\u0001+ppppppp"
+"pppppppppppppppppppppppppppppppppppppppppppppppppppppppppppp"
+"p"));
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
            return net.sourceforge.czt.z.jaxb.gen.impl.AndPredElementImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  0 :
                        if (("AndPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 1;
                            return ;
                        }
                        break;
                    case  3 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  1 :
                        attIdx = context.getAttribute("", "Op");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.AndPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.AndPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("FalsePred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.AndPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.AndPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("TruePred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.AndPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.AndPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("ImpliesPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.AndPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.AndPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("MemPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.AndPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.AndPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("IffPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.AndPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.AndPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("OrPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.AndPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.AndPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("ExistsPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.AndPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.AndPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Exists1Pred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.AndPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.AndPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Pred2" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.AndPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.AndPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("AndPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.AndPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.AndPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("ForallPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.AndPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.AndPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("NegPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.AndPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.AndPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("QntPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.AndPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.AndPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("ExprPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.AndPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.AndPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("JokerPred" == ___local)&&("http://czt.sourceforge.net/zpatt" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.AndPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.AndPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Fact" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.AndPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.AndPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Pred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.AndPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.AndPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Pred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.AndPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.AndPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.AndPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.AndPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
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
                        if (("AndPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  3 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        attIdx = context.getAttribute("", "Op");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        spawnHandlerFromLeaveElement((((net.sourceforge.czt.z.jaxb.gen.impl.AndPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.AndPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                        if (("Op" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((net.sourceforge.czt.z.jaxb.gen.impl.AndPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.AndPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                            return ;
                        }
                        spawnHandlerFromEnterAttribute((((net.sourceforge.czt.z.jaxb.gen.impl.AndPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.AndPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                        attIdx = context.getAttribute("", "Op");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        spawnHandlerFromLeaveAttribute((((net.sourceforge.czt.z.jaxb.gen.impl.AndPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.AndPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                            attIdx = context.getAttribute("", "Op");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            spawnHandlerFromText((((net.sourceforge.czt.z.jaxb.gen.impl.AndPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.AndPredElementImpl.this).new Unmarshaller(context)), 2, value);
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
