//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2004.05.24 at 09:46:08 NZST 
//


package net.sourceforge.czt.z.jaxb.gen.impl;

public class NegPredElementImpl
    extends net.sourceforge.czt.z.jaxb.gen.impl.NegPredImpl
    implements net.sourceforge.czt.z.jaxb.gen.NegPredElement, com.sun.xml.bind.RIElement, com.sun.xml.bind.JAXBObject, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallableObject, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializable, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.ValidatableObject
{

    public final static java.lang.Class version = (net.sourceforge.czt.z.jaxb.gen.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (net.sourceforge.czt.z.jaxb.gen.NegPredElement.class);
    }

    public java.lang.String ____jaxb_ri____getNamespaceURI() {
        return "http://czt.sourceforge.net/zml";
    }

    public java.lang.String ____jaxb_ri____getLocalName() {
        return "NegPred";
    }

    public net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingEventHandler createUnmarshaller(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingContext context) {
        return new net.sourceforge.czt.z.jaxb.gen.impl.NegPredElementImpl.Unmarshaller(context);
    }

    public void serializeBody(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("http://czt.sourceforge.net/zml", "NegPred");
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
        return (net.sourceforge.czt.z.jaxb.gen.NegPredElement.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000"
+"\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv."
+"grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000"
+"\fcontentModelt\u0000 Lcom/sun/msv/grammar/Expression;xr\u0000\u001ecom.sun."
+"msv.grammar.Expression\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilon"
+"Reducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0003xp\u0007\u00e5K\u0084p"
+"p\u0000sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun."
+"msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~"
+"\u0000\u0004\u0007\u00e5Kyppsq\u0000~\u0000\u0007\u0005\u00f2ydppsr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0001\u0002\u0000\u0000xq\u0000~\u0000\b\u0002\u00a4\u00ed\u00b5ppsq\u0000~\u0000\u0000\u0002\u00a4\u00ed\u00aasr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000"
+"\u0005valuexp\u0000p\u0000sq\u0000~\u0000\u0007\u0002\u00a4\u00ed\u009fppsq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\u000b\u00001\u00bc\u00dfppsr\u0000 com.sun."
+"msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.U"
+"naryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0003xq\u0000~\u0000\u0004\u00001\u00bc\u00d4q\u0000~\u0000\u000fpsr\u0000 com.sun.msv"
+".grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0003L\u0000\tnameClassq\u0000~\u0000\u0001"
+"xq\u0000~\u0000\u0004\u00001\u00bc\u00d1q\u0000~\u0000\u000fpsr\u00002com.sun.msv.grammar.Expression$AnyString"
+"Expression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\bsq\u0000~\u0000\u000e\u0001q\u0000~\u0000\u0019sr\u0000 com.sun.msv.g"
+"rammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameCl"
+"ass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$EpsilonEx"
+"pression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\tq\u0000~\u0000\u001aq\u0000~\u0000\u001fsr\u0000#com.sun.msv.gramm"
+"ar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/Strin"
+"g;L\u0000\fnamespaceURIq\u0000~\u0000!xq\u0000~\u0000\u001ct\u0000-net.sourceforge.czt.z.jaxb.ge"
+"n.TermA.AnnsTypet\u0000+http://java.sun.com/jaxb/xjc/dummy-elemen"
+"tssq\u0000~\u0000\u000b\u0002s0\u00b0ppsq\u0000~\u0000\u0016\u0002s0\u00a5q\u0000~\u0000\u000fpsr\u0000\u001bcom.sun.msv.grammar.DataEx"
+"p\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Datatype;L\u0000\u0006except"
+"q\u0000~\u0000\u0003L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~\u0000\u0004\u0001\u0010s\u0014ppsr\u0000\""
+"com.sun.msv.datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv"
+".datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.da"
+"tatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.x"
+"sd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000!L\u0000\btypeNameq"
+"\u0000~\u0000!L\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/datatype/xsd/WhiteSpaceProc"
+"essor;xpt\u0000 http://www.w3.org/2001/XMLSchemat\u0000\u0005QNamesr\u00005com.s"
+"un.msv.datatype.xsd.WhiteSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000x"
+"r\u0000,com.sun.msv.datatype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xp"
+"sr\u00000com.sun.msv.grammar.Expression$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001"
+"\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\nq\u0000~\u0000\u000fpsr\u0000\u001bcom.sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000"
+"\u0002L\u0000\tlocalNameq\u0000~\u0000!L\u0000\fnamespaceURIq\u0000~\u0000!xpq\u0000~\u00002q\u0000~\u00001sq\u0000~\u0000 t\u0000\u0004t"
+"ypet\u0000)http://www.w3.org/2001/XMLSchema-instanceq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000"
+"\u0004Annst\u0000\u001ehttp://czt.sourceforge.net/zmlq\u0000~\u0000\u001fsq\u0000~\u0000\u000b\u0003M\u008b\u00aappsq\u0000~\u0000"
+"\u000b\u0003\u001b\u00ce\u00beppsq\u0000~\u0000\u000b\u0002\u00ea\u0011\u00d2ppsq\u0000~\u0000\u000b\u0002\u00b8T\u00e6ppsq\u0000~\u0000\u000b\u0002\u0086\u0097\u00fappsq\u0000~\u0000\u000b\u0002T\u00db\u000eppsq\u0000~\u0000"
+"\u000b\u0002#\u001e\"ppsq\u0000~\u0000\u000b\u0001\u00f1a6ppsq\u0000~\u0000\u000b\u0001\u00bf\u00a4Jppsq\u0000~\u0000\u000b\u0001\u008d\u00e7^ppsq\u0000~\u0000\u000b\u0001\\*rppsq\u0000~\u0000"
+"\u000b\u0001*m\u0086ppsq\u0000~\u0000\u000b\u0000\u00f8\u00b0\u009appsq\u0000~\u0000\u000b\u0000\u00c6\u00f3\u00aeppsq\u0000~\u0000\u000b\u0000\u00956\u00c2ppsq\u0000~\u0000\u000b\u0000cy\u00d6ppsq\u0000~\u0000"
+"\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\u000b\u00001\u00bc\u00dfppsq\u0000~\u0000\u0013\u00001\u00bc\u00d4q\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u00001\u00bc\u00d1q\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~"
+"\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000-net.sourceforge.czt.z.jaxb.gen.QntPredElemen"
+"tq\u0000~\u0000$sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\u000b\u00001\u00bc\u00dfppsq\u0000~\u0000\u0013\u00001\u00bc\u00d4q\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u00001\u00bc\u00d1q\u0000~"
+"\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u00007net.sourceforge.czt.oz.jaxb.gen.P"
+"romotedInitPredElementq\u0000~\u0000$sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\u000b\u00001\u00bc\u00dfppsq\u0000~\u0000\u0013\u00001"
+"\u00bc\u00d4q\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u00001\u00bc\u00d1q\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000-net.sourcefo"
+"rge.czt.z.jaxb.gen.MemPredElementq\u0000~\u0000$sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\u000b\u00001\u00bc"
+"\u00dfppsq\u0000~\u0000\u0013\u00001\u00bc\u00d4q\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u00001\u00bc\u00d1q\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000\'n"
+"et.sourceforge.czt.z.jaxb.gen.TruePredq\u0000~\u0000$sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~"
+"\u0000\u000b\u00001\u00bc\u00dfppsq\u0000~\u0000\u0013\u00001\u00bc\u00d4q\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u00001\u00bc\u00d1q\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000"
+" t\u0000&net.sourceforge.czt.z.jaxb.gen.IffPredq\u0000~\u0000$sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000"
+"sq\u0000~\u0000\u000b\u00001\u00bc\u00dfppsq\u0000~\u0000\u0013\u00001\u00bc\u00d4q\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u00001\u00bc\u00d1q\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fs"
+"q\u0000~\u0000 t\u0000-net.sourceforge.czt.z.jaxb.gen.AndPredElementq\u0000~\u0000$sq"
+"\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\u000b\u00001\u00bc\u00dfppsq\u0000~\u0000\u0013\u00001\u00bc\u00d4q\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u00001\u00bc\u00d1q\u0000~\u0000\u000fpq\u0000~\u0000\u0019"
+"q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u00003net.sourceforge.czt.zpatt.jaxb.gen.JokerP"
+"redElementq\u0000~\u0000$sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\u000b\u00001\u00bc\u00dfppsq\u0000~\u0000\u0013\u00001\u00bc\u00d4q\u0000~\u0000\u000fpsq\u0000~"
+"\u0000\u0016\u00001\u00bc\u00d1q\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000*net.sourceforge.czt.z.ja"
+"xb.gen.ImpliesPredq\u0000~\u0000$sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\u000b\u00001\u00bc\u00dfppsq\u0000~\u0000\u0013\u00001\u00bc\u00d4q\u0000"
+"~\u0000\u000fpsq\u0000~\u0000\u0016\u00001\u00bc\u00d1q\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000.net.sourceforge."
+"czt.z.jaxb.gen.ExprPredElementq\u0000~\u0000$sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\u000b\u00001\u00bc\u00dfpp"
+"sq\u0000~\u0000\u0013\u00001\u00bc\u00d4q\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u00001\u00bc\u00d1q\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000)net."
+"sourceforge.czt.z.jaxb.gen.ForallPredq\u0000~\u0000$sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000"
+"\u000b\u00001\u00bc\u00dfppsq\u0000~\u0000\u0013\u00001\u00bc\u00d4q\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u00001\u00bc\u00d1q\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 "
+"t\u0000)net.sourceforge.czt.z.jaxb.gen.ExistsPredq\u0000~\u0000$sq\u0000~\u0000\u0000\u00001\u00bc\u00eap"
+"p\u0000sq\u0000~\u0000\u000b\u00001\u00bc\u00dfppsq\u0000~\u0000\u0013\u00001\u00bc\u00d4q\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u00001\u00bc\u00d1q\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000"
+"\u001fsq\u0000~\u0000 t\u0000%net.sourceforge.czt.z.jaxb.gen.OrPredq\u0000~\u0000$sq\u0000~\u0000\u0000\u00001"
+"\u00bc\u00eapp\u0000sq\u0000~\u0000\u000b\u00001\u00bc\u00dfppsq\u0000~\u0000\u0013\u00001\u00bc\u00d4q\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u00001\u00bc\u00d1q\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq"
+"\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000*net.sourceforge.czt.z.jaxb.gen.FactElementq\u0000~\u0000$"
+"sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\u000b\u00001\u00bc\u00dfppsq\u0000~\u0000\u0013\u00001\u00bc\u00d4q\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u00001\u00bc\u00d1q\u0000~\u0000\u000fpq\u0000~"
+"\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000*net.sourceforge.czt.z.jaxb.gen.Exists1P"
+"redq\u0000~\u0000$sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\u000b\u00001\u00bc\u00dfppsq\u0000~\u0000\u0013\u00001\u00bc\u00d4q\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u00001\u00bc\u00d1q"
+"\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000+net.sourceforge.czt.z.jaxb.gen."
+"Pred2Elementq\u0000~\u0000$sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\u000b\u00001\u00bc\u00dfppsq\u0000~\u0000\u0013\u00001\u00bc\u00d4q\u0000~\u0000\u000fpsq"
+"\u0000~\u0000\u0016\u00001\u00bc\u00d1q\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000(net.sourceforge.czt.z."
+"jaxb.gen.FalsePredq\u0000~\u0000$sq\u0000~\u0000\u0000\u00001\u00bc\u00eapp\u0000sq\u0000~\u0000\u000b\u00001\u00bc\u00dfppsq\u0000~\u0000\u0013\u00001\u00bc\u00d4q\u0000"
+"~\u0000\u000fpsq\u0000~\u0000\u0016\u00001\u00bc\u00d1q\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000-net.sourceforge."
+"czt.z.jaxb.gen.NegPredElementq\u0000~\u0000$sq\u0000~\u0000\u000b\u0001\u00f2\u00d2\u0010ppsq\u0000~\u0000\u0016\u0001\u00f2\u00d2\u0005q\u0000~\u0000"
+"\u000fpq\u0000~\u0000*sq\u0000~\u0000 q\u0000~\u0000;q\u0000~\u0000<q\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000\u0007NegPredq\u0000~\u0000?sr\u0000\"com.sun"
+".msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun"
+"/msv/grammar/ExpressionPool$ClosedHash;xpsr\u0000-com.sun.msv.gra"
+"mmar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0002\u0000\u0004I\u0000\u0005countI\u0000\tthreshol"
+"dL\u0000\u0006parentq\u0000~\u0000\u00bc[\u0000\u0005tablet\u0000![Lcom/sun/msv/grammar/Expression;x"
+"p\u0000\u0000\u0000:\u0000\u0000\u0000rpur\u0000![Lcom.sun.msv.grammar.Expression;\u00d68D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp"
+"\u0000\u0000\u0001\u007fppppppq\u0000~\u0000\nppppppppppppppppppppppppppppppppppq\u0000~\u0000Mq\u0000~\u0000Dp"
+"ppppppppppppppppppppppppppppppppppppppppq\u0000~\u0000Iq\u0000~\u0000@pppppppppp"
+"ppppppppppppppppppppppppppq\u0000~\u0000\u00b6pppq\u0000~\u0000Nq\u0000~\u0000Epppppq\u0000~\u0000\tpppppp"
+"pppppppppppppppppppppppppppppq\u0000~\u0000Jq\u0000~\u0000Appppppppppppppppppppp"
+"pppppppppppppppppppq\u0000~\u0000Oq\u0000~\u0000Fppppppppppppppppppppppppppppppp"
+"ppppppppppq\u0000~\u0000Kq\u0000~\u0000Bppppppppppppppppppq\u0000~\u0000Rq\u0000~\u0000\u0015q\u0000~\u0000\u00b2q\u0000~\u0000\u0010q\u0000"
+"~\u0000\u00acq\u0000~\u0000\u00a6q\u0000~\u0000\u00a0q\u0000~\u0000\u009aq\u0000~\u0000\u0094q\u0000~\u0000\u008eq\u0000~\u0000\u0088q\u0000~\u0000\u00b1q\u0000~\u0000\u00abq\u0000~\u0000\u00a5q\u0000~\u0000\u009fq\u0000~\u0000\u0099q\u0000"
+"~\u0000\u0093q\u0000~\u0000\u008dq\u0000~\u0000\u0087q\u0000~\u0000\u0081q\u0000~\u0000{q\u0000~\u0000uq\u0000~\u0000oq\u0000~\u0000Gq\u0000~\u0000iq\u0000~\u0000cq\u0000~\u0000]q\u0000~\u0000Wq\u0000"
+"~\u0000Qq\u0000~\u0000\u0012q\u0000~\u0000\u0082q\u0000~\u0000|q\u0000~\u0000vq\u0000~\u0000pq\u0000~\u0000jq\u0000~\u0000dq\u0000~\u0000^q\u0000~\u0000\fq\u0000~\u0000Xppppppp"
+"pppppppppppppppppppq\u0000~\u0000Lq\u0000~\u0000Cppppppppppppppppppq\u0000~\u0000%pppppppp"
+"ppppppppppppppq\u0000~\u0000H"));
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
            return net.sourceforge.czt.z.jaxb.gen.impl.NegPredElementImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  1 :
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.NegPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.NegPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("QntPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.NegPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.NegPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("PromotedInitPred" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.NegPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.NegPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("MemPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.NegPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.NegPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("TruePred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.NegPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.NegPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("IffPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.NegPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.NegPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("AndPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.NegPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.NegPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("JokerPred" == ___local)&&("http://czt.sourceforge.net/zpatt" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.NegPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.NegPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("ImpliesPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.NegPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.NegPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("ExprPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.NegPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.NegPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("ForallPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.NegPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.NegPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("ExistsPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.NegPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.NegPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("OrPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.NegPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.NegPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Fact" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.NegPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.NegPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Exists1Pred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.NegPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.NegPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Pred2" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.NegPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.NegPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("FalsePred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.NegPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.NegPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("NegPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.NegPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.NegPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Pred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.NegPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.NegPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Pred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.NegPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.NegPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.NegPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.NegPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                        return ;
                    case  0 :
                        if (("NegPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
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
                    case  1 :
                        spawnHandlerFromLeaveElement((((net.sourceforge.czt.z.jaxb.gen.impl.NegPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.NegPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                        return ;
                    case  2 :
                        if (("NegPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
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
                    case  1 :
                        spawnHandlerFromEnterAttribute((((net.sourceforge.czt.z.jaxb.gen.impl.NegPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.NegPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                        return ;
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
                    case  1 :
                        spawnHandlerFromLeaveAttribute((((net.sourceforge.czt.z.jaxb.gen.impl.NegPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.NegPredElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                        return ;
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
                        case  1 :
                            spawnHandlerFromText((((net.sourceforge.czt.z.jaxb.gen.impl.NegPredImpl)net.sourceforge.czt.z.jaxb.gen.impl.NegPredElementImpl.this).new Unmarshaller(context)), 2, value);
                            return ;
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
