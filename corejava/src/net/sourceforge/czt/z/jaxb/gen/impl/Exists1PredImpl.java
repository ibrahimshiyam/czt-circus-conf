//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2004.05.24 at 09:46:08 NZST 
//


package net.sourceforge.czt.z.jaxb.gen.impl;

public class Exists1PredImpl
    extends net.sourceforge.czt.z.jaxb.gen.impl.QntPredImpl
    implements net.sourceforge.czt.z.jaxb.gen.Exists1Pred, com.sun.xml.bind.RIElement, com.sun.xml.bind.JAXBObject, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallableObject, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializable, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.ValidatableObject
{

    public final static java.lang.Class version = (net.sourceforge.czt.z.jaxb.gen.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (net.sourceforge.czt.z.jaxb.gen.Exists1Pred.class);
    }

    public java.lang.String ____jaxb_ri____getNamespaceURI() {
        return "http://czt.sourceforge.net/zml";
    }

    public java.lang.String ____jaxb_ri____getLocalName() {
        return "Exists1Pred";
    }

    public net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingEventHandler createUnmarshaller(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingContext context) {
        return new net.sourceforge.czt.z.jaxb.gen.impl.Exists1PredImpl.Unmarshaller(context);
    }

    public void serializeBody(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("http://czt.sourceforge.net/zml", "Exists1Pred");
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
        return (net.sourceforge.czt.z.jaxb.gen.Exists1Pred.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000"
+"\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv."
+"grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000"
+"\fcontentModelt\u0000 Lcom/sun/msv/grammar/Expression;xr\u0000\u001ecom.sun."
+"msv.grammar.Expression\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilon"
+"Reducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0003xp\t\u00f6\u00fa+p"
+"p\u0000sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun."
+"msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~"
+"\u0000\u0004\t\u00f6\u00fa ppsq\u0000~\u0000\u0007\u0007\u00b7\u00ed=ppsq\u0000~\u0000\u0007\u0004ja\u008eppsr\u0000\u001dcom.sun.msv.grammar.Choi"
+"ceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\b\u0002\u00c1I,ppsq\u0000~\u0000\u0000\u0002\u00c1I!sr\u0000\u0011java.lang.Boolean\u00cd"
+" r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000p\u0000sq\u0000~\u0000\u0007\u0002\u00c1I\u0016ppsq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\f\u00001\u00bc\u00dfpp"
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
+"dummy-elementssq\u0000~\u0000\f\u0002\u008f\u008c\'ppsq\u0000~\u0000\u0017\u0002\u008f\u008c\u001cq\u0000~\u0000\u0010psr\u0000\u001bcom.sun.msv.gr"
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
+"\f\u0001\u00a9\u0018]ppsq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\f\u00001\u00bc\u00dfppsq\u0000~\u0000\u0014\u00001\u00bc\u00d4q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00001\u00bc\u00d1q\u0000"
+"~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000-net.sourceforge.czt.z.jaxb.gen.S"
+"chTextElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u0001w[qpp\u0000sq\u0000~\u0000\u0007\u0001w[fppsq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~"
+"\u0000\f\u00001\u00bc\u00dfppsq\u0000~\u0000\u0014\u00001\u00bc\u00d4q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00001\u00bc\u00d1q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000"
+"!t\u0000&net.sourceforge.czt.z.jaxb.gen.SchTextq\u0000~\u0000%sq\u0000~\u0000\f\u0001E\u009ewpps"
+"q\u0000~\u0000\u0017\u0001E\u009elq\u0000~\u0000\u0010pq\u0000~\u0000+sq\u0000~\u0000!q\u0000~\u0000<q\u0000~\u0000=q\u0000~\u0000 sq\u0000~\u0000!t\u0000\u0007SchTextq\u0000~"
+"\u0000@sq\u0000~\u0000\f\u0003M\u008b\u00aappsq\u0000~\u0000\f\u0003\u001b\u00ce\u00beppsq\u0000~\u0000\f\u0002\u00ea\u0011\u00d2ppsq\u0000~\u0000\f\u0002\u00b8T\u00e6ppsq\u0000~\u0000\f\u0002\u0086\u0097\u00fa"
+"ppsq\u0000~\u0000\f\u0002T\u00db\u000eppsq\u0000~\u0000\f\u0002#\u001e\"ppsq\u0000~\u0000\f\u0001\u00f1a6ppsq\u0000~\u0000\f\u0001\u00bf\u00a4Jppsq\u0000~\u0000\f\u0001\u008d\u00e7^"
+"ppsq\u0000~\u0000\f\u0001\\*rppsq\u0000~\u0000\f\u0001*m\u0086ppsq\u0000~\u0000\f\u0000\u00f8\u00b0\u009appsq\u0000~\u0000\f\u0000\u00c6\u00f3\u00aeppsq\u0000~\u0000\f\u0000\u00956\u00c2"
+"ppsq\u0000~\u0000\f\u0000cy\u00d6ppsq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\f\u00001\u00bc\u00dfppsq\u0000~\u0000\u0014\u00001\u00bc\u00d4q\u0000~\u0000\u0010psq\u0000~\u0000"
+"\u0017\u00001\u00bc\u00d1q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000-net.sourceforge.czt.z.jax"
+"b.gen.QntPredElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\f\u00001\u00bc\u00dfppsq\u0000~\u0000\u0014\u00001\u00bc\u00d4"
+"q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00001\u00bc\u00d1q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00007net.sourceforg"
+"e.czt.oz.jaxb.gen.PromotedInitPredElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000s"
+"q\u0000~\u0000\f\u00001\u00bc\u00dfppsq\u0000~\u0000\u0014\u00001\u00bc\u00d4q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00001\u00bc\u00d1q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq"
+"\u0000~\u0000!t\u0000-net.sourceforge.czt.z.jaxb.gen.MemPredElementq\u0000~\u0000%sq\u0000"
+"~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\f\u00001\u00bc\u00dfppsq\u0000~\u0000\u0014\u00001\u00bc\u00d4q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00001\u00bc\u00d1q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq"
+"\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000\'net.sourceforge.czt.z.jaxb.gen.TruePredq\u0000~"
+"\u0000%sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\f\u00001\u00bc\u00dfppsq\u0000~\u0000\u0014\u00001\u00bc\u00d4q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00001\u00bc\u00d1q\u0000~\u0000\u0010pq"
+"\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000&net.sourceforge.czt.z.jaxb.gen.IffPre"
+"dq\u0000~\u0000%sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\f\u00001\u00bc\u00dfppsq\u0000~\u0000\u0014\u00001\u00bc\u00d4q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00001\u00bc\u00d1q\u0000~"
+"\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000-net.sourceforge.czt.z.jaxb.gen.An"
+"dPredElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\f\u00001\u00bc\u00dfppsq\u0000~\u0000\u0014\u00001\u00bc\u00d4q\u0000~\u0000\u0010psq"
+"\u0000~\u0000\u0017\u00001\u00bc\u00d1q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00003net.sourceforge.czt.zp"
+"att.jaxb.gen.JokerPredElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\f\u00001\u00bc\u00dfpps"
+"q\u0000~\u0000\u0014\u00001\u00bc\u00d4q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00001\u00bc\u00d1q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000*net.s"
+"ourceforge.czt.z.jaxb.gen.ImpliesPredq\u0000~\u0000%sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000"
+"\f\u00001\u00bc\u00dfppsq\u0000~\u0000\u0014\u00001\u00bc\u00d4q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00001\u00bc\u00d1q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!"
+"t\u0000.net.sourceforge.czt.z.jaxb.gen.ExprPredElementq\u0000~\u0000%sq\u0000~\u0000\u0000"
+"\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\f\u00001\u00bc\u00dfppsq\u0000~\u0000\u0014\u00001\u00bc\u00d4q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00001\u00bc\u00d1q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000"
+"\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000)net.sourceforge.czt.z.jaxb.gen.ForallPredq\u0000~\u0000"
+"%sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\f\u00001\u00bc\u00dfppsq\u0000~\u0000\u0014\u00001\u00bc\u00d4q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00001\u00bc\u00d1q\u0000~\u0000\u0010pq\u0000"
+"~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000)net.sourceforge.czt.z.jaxb.gen.ExistsP"
+"redq\u0000~\u0000%sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\f\u00001\u00bc\u00dfppsq\u0000~\u0000\u0014\u00001\u00bc\u00d4q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00001\u00bc\u00d1q"
+"\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000%net.sourceforge.czt.z.jaxb.gen."
+"OrPredq\u0000~\u0000%sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\f\u00001\u00bc\u00dfppsq\u0000~\u0000\u0014\u00001\u00bc\u00d4q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00001"
+"\u00bc\u00d1q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000*net.sourceforge.czt.z.jaxb.g"
+"en.FactElementq\u0000~\u0000%sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\f\u00001\u00bc\u00dfppsq\u0000~\u0000\u0014\u00001\u00bc\u00d4q\u0000~\u0000\u0010p"
+"sq\u0000~\u0000\u0017\u00001\u00bc\u00d1q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000*net.sourceforge.czt."
+"z.jaxb.gen.Exists1Predq\u0000~\u0000%sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\f\u00001\u00bc\u00dfppsq\u0000~\u0000\u0014\u00001"
+"\u00bc\u00d4q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00001\u00bc\u00d1q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000+net.sourcefo"
+"rge.czt.z.jaxb.gen.Pred2Elementq\u0000~\u0000%sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\f\u00001\u00bc\u00dfp"
+"psq\u0000~\u0000\u0014\u00001\u00bc\u00d4q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00001\u00bc\u00d1q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000(net"
+".sourceforge.czt.z.jaxb.gen.FalsePredq\u0000~\u0000%sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000"
+"\f\u00001\u00bc\u00dfppsq\u0000~\u0000\u0014\u00001\u00bc\u00d4q\u0000~\u0000\u0010psq\u0000~\u0000\u0017\u00001\u00bc\u00d1q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!"
+"t\u0000-net.sourceforge.czt.z.jaxb.gen.NegPredElementq\u0000~\u0000%sq\u0000~\u0000\f\u0002"
+"?\f\u00deppsq\u0000~\u0000\u0017\u0002?\f\u00d3q\u0000~\u0000\u0010pq\u0000~\u0000+sq\u0000~\u0000!q\u0000~\u0000<q\u0000~\u0000=q\u0000~\u0000 sq\u0000~\u0000!t\u0000\u000bExis"
+"ts1Predq\u0000~\u0000@sr\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000"
+"\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/ExpressionPool$ClosedHas"
+"h;xpsr\u0000-com.sun.msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed"
+"\u001c\u0002\u0000\u0004I\u0000\u0005countI\u0000\tthresholdL\u0000\u0006parentq\u0000~\u0000\u00d1[\u0000\u0005tablet\u0000![Lcom/sun/m"
+"sv/grammar/Expression;xp\u0000\u0000\u0000B\u0000\u0000\u0000rpur\u0000![Lcom.sun.msv.grammar.E"
+"xpression;\u00d68D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp\u0000\u0000\u0001\u007fq\u0000~\u0000Aq\u0000~\u0000\u0011pppppppppppppppppppppq\u0000"
+"~\u0000\rppppq\u0000~\u0000\u000bppppppppppppq\u0000~\u0000bq\u0000~\u0000Ypppppppppppppppppq\u0000~\u0000\u00cbpppp"
+"pppppppppq\u0000~\u0000Ippppppppq\u0000~\u0000&q\u0000~\u0000^q\u0000~\u0000Uppppppppppppppppppppppp"
+"pppppppppq\u0000~\u0000\npppppppq\u0000~\u0000cq\u0000~\u0000Zppppppppppppppppppppppppppppq"
+"\u0000~\u0000Pppppppppppppq\u0000~\u0000_q\u0000~\u0000Vppppppppppppq\u0000~\u0000\tppppppppppppppppp"
+"ppppppppppq\u0000~\u0000dq\u0000~\u0000[pppppppppppppppppppppppppppppppppppppppp"
+"pq\u0000~\u0000`q\u0000~\u0000Wppppppppppppppppppq\u0000~\u0000Dq\u0000~\u0000\u0016q\u0000~\u0000\u00bbq\u0000~\u0000\u00b5q\u0000~\u0000\u00afq\u0000~\u0000\u00a9q"
+"\u0000~\u0000\u00a3q\u0000~\u0000\u009dq\u0000~\u0000\u0097q\u0000~\u0000\u0091q\u0000~\u0000\u008bq\u0000~\u0000\u00baq\u0000~\u0000\u00b4q\u0000~\u0000\u00aeq\u0000~\u0000\u00a8q\u0000~\u0000\u00a2q\u0000~\u0000\u009cq\u0000~\u0000\u0096q"
+"\u0000~\u0000\u0090q\u0000~\u0000\u008aq\u0000~\u0000\u0084q\u0000~\u0000~q\u0000~\u0000xq\u0000~\u0000\\q\u0000~\u0000rq\u0000~\u0000lq\u0000~\u0000fq\u0000~\u0000Kq\u0000~\u0000Cq\u0000~\u0000\u0013q"
+"\u0000~\u0000\u0085q\u0000~\u0000\u007fq\u0000~\u0000yq\u0000~\u0000sq\u0000~\u0000mq\u0000~\u0000gq\u0000~\u0000Lq\u0000~\u0000\u00c1q\u0000~\u0000\u00c0q\u0000~\u0000\u00c7q\u0000~\u0000\u00c6pppppp"
+"ppppppppppppppppppq\u0000~\u0000aq\u0000~\u0000Xpppppppppppppppppppppppppppppppp"
+"pppppppppq\u0000~\u0000]"));
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
            return net.sourceforge.czt.z.jaxb.gen.impl.Exists1PredImpl.this;
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
                        if (("Exists1Pred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 1;
                            return ;
                        }
                        break;
                    case  1 :
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.QntPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.Exists1PredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("SchText" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.QntPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.Exists1PredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("SchText" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.QntPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.Exists1PredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.QntPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.Exists1PredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
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
                        if (("Exists1Pred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  1 :
                        spawnHandlerFromLeaveElement((((net.sourceforge.czt.z.jaxb.gen.impl.QntPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.Exists1PredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                        spawnHandlerFromEnterAttribute((((net.sourceforge.czt.z.jaxb.gen.impl.QntPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.Exists1PredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                        spawnHandlerFromLeaveAttribute((((net.sourceforge.czt.z.jaxb.gen.impl.QntPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.Exists1PredImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                            spawnHandlerFromText((((net.sourceforge.czt.z.jaxb.gen.impl.QntPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.Exists1PredImpl.this).new Unmarshaller(context)), 2, value);
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
