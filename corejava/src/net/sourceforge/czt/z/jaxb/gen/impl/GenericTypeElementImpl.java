//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2004.11.04 at 10:24:55 GMT 
//


package net.sourceforge.czt.z.jaxb.gen.impl;

public class GenericTypeElementImpl
    extends net.sourceforge.czt.z.jaxb.gen.impl.GenericTypeImpl
    implements net.sourceforge.czt.z.jaxb.gen.GenericTypeElement, com.sun.xml.bind.RIElement, com.sun.xml.bind.JAXBObject, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallableObject, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializable, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.ValidatableObject
{

    public final static java.lang.Class version = (net.sourceforge.czt.z.jaxb.gen.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (net.sourceforge.czt.z.jaxb.gen.GenericTypeElement.class);
    }

    public java.lang.String ____jaxb_ri____getNamespaceURI() {
        return "http://czt.sourceforge.net/zml";
    }

    public java.lang.String ____jaxb_ri____getLocalName() {
        return "GenericType";
    }

    public net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingEventHandler createUnmarshaller(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingContext context) {
        return new net.sourceforge.czt.z.jaxb.gen.impl.GenericTypeElementImpl.Unmarshaller(context);
    }

    public void serializeBody(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("http://czt.sourceforge.net/zml", "GenericType");
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
        return (net.sourceforge.czt.z.jaxb.gen.GenericTypeElement.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000"
+"\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv."
+"grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000"
+"\fcontentModelt\u0000 Lcom/sun/msv/grammar/Expression;xr\u0000\u001ecom.sun."
+"msv.grammar.Expression\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilon"
+"Reducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0003xp\bQ\u00eb@p"
+"p\u0000sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun."
+"msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~"
+"\u0000\u0004\bQ\u00eb5ppsq\u0000~\u0000\u0007\u0007\u001b\\[ppsq\u0000~\u0000\u0007\u0005\u008d\u00ca\u00e1ppsq\u0000~\u0000\u0007\u0004\u00009rppsr\u0000\u001dcom.sun.msv."
+"grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\b\u0001\u00e9\u00bf\u00cdppsq\u0000~\u0000\u0000\u0001\u00e9\u00bf\u00c2sr\u0000\u0011java.l"
+"ang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000p\u0000sq\u0000~\u0000\u0007\u0001\u00e9\u00bf\u00b7ppsq\u0000~\u0000\u0000\u0000O\u0083zpp\u0000"
+"sq\u0000~\u0000\r\u0000O\u0083oppsr\u0000 com.sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000x"
+"r\u0000\u001ccom.sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0003xq\u0000~\u0000\u0004\u0000"
+"O\u0083dq\u0000~\u0000\u0011psr\u0000 com.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003e"
+"xpq\u0000~\u0000\u0003L\u0000\tnameClassq\u0000~\u0000\u0001xq\u0000~\u0000\u0004\u0000O\u0083aq\u0000~\u0000\u0011psr\u00002com.sun.msv.gram"
+"mar.Expression$AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\bsq\u0000~\u0000"
+"\u0010\u0001q\u0000~\u0000\u001bsr\u0000 com.sun.msv.grammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dco"
+"m.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.gram"
+"mar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\tq\u0000~\u0000\u001cq\u0000"
+"~\u0000!sr\u0000#com.sun.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tloca"
+"lNamet\u0000\u0012Ljava/lang/String;L\u0000\fnamespaceURIq\u0000~\u0000#xq\u0000~\u0000\u001et\u0000-net.s"
+"ourceforge.czt.z.jaxb.gen.TermA.AnnsTypet\u0000+http://java.sun.c"
+"om/jaxb/xjc/dummy-elementssq\u0000~\u0000\r\u0001\u009a<8ppsq\u0000~\u0000\u0018\u0001\u009a<-q\u0000~\u0000\u0011psr\u0000\u001bco"
+"m.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/dat"
+"atype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0003L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/Str"
+"ingPair;xq\u0000~\u0000\u0004\u0000\u00ec\u00cf\u00f7ppsr\u0000\"com.sun.msv.datatype.xsd.QnameType\u0000\u0000"
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
+"mlq\u0000~\u0000!sq\u0000~\u0000\u0015\u0002\u0016y\u00a0ppsq\u0000~\u0000\u0000\u0002\u0016y\u009dpp\u0000sq\u0000~\u0000\u0007\u0002\u0016y\u0092ppsq\u0000~\u0000\u0000\u0000O\u0083zpp\u0000sq\u0000"
+"~\u0000\r\u0000O\u0083oppsq\u0000~\u0000\u0015\u0000O\u0083dq\u0000~\u0000\u0011psq\u0000~\u0000\u0018\u0000O\u0083aq\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~"
+"\u0000\"t\u0000\'net.sourceforge.czt.z.jaxb.gen.DeclNameq\u0000~\u0000&sq\u0000~\u0000\r\u0001\u00c6\u00f6\u0013p"
+"psq\u0000~\u0000\u0018\u0001\u00c6\u00f6\bq\u0000~\u0000\u0011pq\u0000~\u0000,sq\u0000~\u0000\"q\u0000~\u0000=q\u0000~\u0000>q\u0000~\u0000!sq\u0000~\u0000\"t\u0000\u0004Nameq\u0000~\u0000"
+"Asq\u0000~\u0000\r\u0001\u008d\u0091jppsq\u0000~\u0000\r\u0001>\r\u00eeppsq\u0000~\u0000\r\u0000\u00ee\u008arppsq\u0000~\u0000\r\u0000\u009f\u0006\u00f6ppsq\u0000~\u0000\u0000\u0000O\u0083zp"
+"p\u0000sq\u0000~\u0000\r\u0000O\u0083oppsq\u0000~\u0000\u0015\u0000O\u0083dq\u0000~\u0000\u0011psq\u0000~\u0000\u0018\u0000O\u0083aq\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000"
+"!sq\u0000~\u0000\"t\u00002net.sourceforge.czt.z.jaxb.gen.GenParamTypeElement"
+"q\u0000~\u0000&sq\u0000~\u0000\u0000\u0000O\u0083zpp\u0000sq\u0000~\u0000\r\u0000O\u0083oppsq\u0000~\u0000\u0015\u0000O\u0083dq\u0000~\u0000\u0011psq\u0000~\u0000\u0018\u0000O\u0083aq\u0000~\u0000"
+"\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"t\u00000net.sourceforge.czt.z.jaxb.gen.Sch"
+"emaTypeElementq\u0000~\u0000&sq\u0000~\u0000\u0000\u0000O\u0083zpp\u0000sq\u0000~\u0000\r\u0000O\u0083oppsq\u0000~\u0000\u0015\u0000O\u0083dq\u0000~\u0000\u0011p"
+"sq\u0000~\u0000\u0018\u0000O\u0083aq\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"t\u0000/net.sourceforge.czt."
+"z.jaxb.gen.GivenTypeElementq\u0000~\u0000&sq\u0000~\u0000\u0000\u0000O\u0083zpp\u0000sq\u0000~\u0000\r\u0000O\u0083oppsq\u0000"
+"~\u0000\u0015\u0000O\u0083dq\u0000~\u0000\u0011psq\u0000~\u0000\u0018\u0000O\u0083aq\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"t\u0000/net.sou"
+"rceforge.czt.z.jaxb.gen.PowerTypeElementq\u0000~\u0000&sq\u0000~\u0000\u0000\u0000O\u0083zpp\u0000sq"
+"\u0000~\u0000\r\u0000O\u0083oppsq\u0000~\u0000\u0015\u0000O\u0083dq\u0000~\u0000\u0011psq\u0000~\u0000\u0018\u0000O\u0083aq\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000"
+"~\u0000\"t\u0000.net.sourceforge.czt.z.jaxb.gen.ProdTypeElementq\u0000~\u0000&sq\u0000"
+"~\u0000\r\u0001\u008d\u0091uppsq\u0000~\u0000\r\u0001\u008d\u0091jq\u0000~\u0000\u0011psq\u0000~\u0000\r\u0001>\r\u00eeq\u0000~\u0000\u0011psq\u0000~\u0000\r\u0000\u00ee\u008arq\u0000~\u0000\u0011psq\u0000"
+"~\u0000\r\u0000\u009f\u0006\u00f6q\u0000~\u0000\u0011psq\u0000~\u0000\u0000\u0000O\u0083zq\u0000~\u0000\u0011p\u0000sq\u0000~\u0000\r\u0000O\u0083oppsq\u0000~\u0000\u0015\u0000O\u0083dq\u0000~\u0000\u0011psq"
+"\u0000~\u0000\u0018\u0000O\u0083aq\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"q\u0000~\u0000Yq\u0000~\u0000&sq\u0000~\u0000\u0000\u0000O\u0083zq\u0000~\u0000\u0011"
+"p\u0000sq\u0000~\u0000\r\u0000O\u0083oppsq\u0000~\u0000\u0015\u0000O\u0083dq\u0000~\u0000\u0011psq\u0000~\u0000\u0018\u0000O\u0083aq\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000"
+"!sq\u0000~\u0000\"q\u0000~\u0000_q\u0000~\u0000&sq\u0000~\u0000\u0000\u0000O\u0083zq\u0000~\u0000\u0011p\u0000sq\u0000~\u0000\r\u0000O\u0083oppsq\u0000~\u0000\u0015\u0000O\u0083dq\u0000~\u0000"
+"\u0011psq\u0000~\u0000\u0018\u0000O\u0083aq\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"q\u0000~\u0000eq\u0000~\u0000&sq\u0000~\u0000\u0000\u0000O\u0083zq"
+"\u0000~\u0000\u0011p\u0000sq\u0000~\u0000\r\u0000O\u0083oppsq\u0000~\u0000\u0015\u0000O\u0083dq\u0000~\u0000\u0011psq\u0000~\u0000\u0018\u0000O\u0083aq\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001f"
+"q\u0000~\u0000!sq\u0000~\u0000\"q\u0000~\u0000kq\u0000~\u0000&sq\u0000~\u0000\u0000\u0000O\u0083zq\u0000~\u0000\u0011p\u0000sq\u0000~\u0000\r\u0000O\u0083oppsq\u0000~\u0000\u0015\u0000O\u0083d"
+"q\u0000~\u0000\u0011psq\u0000~\u0000\u0018\u0000O\u0083aq\u0000~\u0000\u0011pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"q\u0000~\u0000qq\u0000~\u0000&q\u0000~\u0000!sq"
+"\u0000~\u0000\r\u00016\u008e\u00d5ppsq\u0000~\u0000\u0018\u00016\u008e\u00caq\u0000~\u0000\u0011pq\u0000~\u0000,sq\u0000~\u0000\"q\u0000~\u0000=q\u0000~\u0000>q\u0000~\u0000!sq\u0000~\u0000\"t\u0000"
+"\u000bGenericTypeq\u0000~\u0000Asr\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/ExpressionPool$Clos"
+"edHash;xpsr\u0000-com.sun.msv.grammar.ExpressionPool$ClosedHash\u00d7j"
+"\u00d0N\u00ef\u00e8\u00ed\u001c\u0002\u0000\u0004I\u0000\u0005countI\u0000\tthresholdL\u0000\u0006parentq\u0000~\u0000\u0096[\u0000\u0005tablet\u0000![Lcom/"
+"sun/msv/grammar/Expression;xp\u0000\u0000\u0000,\u0000\u0000\u00009pur\u0000![Lcom.sun.msv.gram"
+"mar.Expression;\u00d68D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp\u0000\u0000\u0000\u00bfpppppppq\u0000~\u0000\u000bppppppppq\u0000~\u0000\'ppp"
+"ppppppppppppppppppppppq\u0000~\u0000Rq\u0000~\u0000upppq\u0000~\u0000Dppppppppppq\u0000~\u0000\fppq\u0000~"
+"\u0000Bpppppppppppppppppppppppppppppq\u0000~\u0000Sq\u0000~\u0000vq\u0000~\u0000Kpppppppppppppp"
+"ppppppppppq\u0000~\u0000\u0017q\u0000~\u0000Gq\u0000~\u0000Vq\u0000~\u0000\\q\u0000~\u0000bq\u0000~\u0000hq\u0000~\u0000nq\u0000~\u0000yq\u0000~\u0000~q\u0000~\u0000\u0083"
+"q\u0000~\u0000\u0088q\u0000~\u0000\u0014q\u0000~\u0000Fq\u0000~\u0000Uq\u0000~\u0000[q\u0000~\u0000aq\u0000~\u0000gq\u0000~\u0000mq\u0000~\u0000Pq\u0000~\u0000xq\u0000~\u0000}q\u0000~\u0000\u0082"
+"q\u0000~\u0000\u0087q\u0000~\u0000\u008dq\u0000~\u0000\u008cq\u0000~\u0000sq\u0000~\u0000\tpq\u0000~\u0000rq\u0000~\u0000\u0090ppppppppppq\u0000~\u0000\nppq\u0000~\u0000\u0012pp"
+"pppppppppppppppppppq\u0000~\u0000\u000eq\u0000~\u0000Qq\u0000~\u0000tppppp"));
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
            return net.sourceforge.czt.z.jaxb.gen.impl.GenericTypeElementImpl.this;
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
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.GenericTypeImpl)net.sourceforge.czt.z.jaxb.gen.impl.GenericTypeElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Name" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.GenericTypeImpl)net.sourceforge.czt.z.jaxb.gen.impl.GenericTypeElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.GenericTypeImpl)net.sourceforge.czt.z.jaxb.gen.impl.GenericTypeElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                        return ;
                    case  3 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  0 :
                        if (("GenericType" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
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
                    case  1 :
                        spawnHandlerFromLeaveElement((((net.sourceforge.czt.z.jaxb.gen.impl.GenericTypeImpl)net.sourceforge.czt.z.jaxb.gen.impl.GenericTypeElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                        return ;
                    case  3 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  2 :
                        if (("GenericType" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
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
                    case  1 :
                        spawnHandlerFromEnterAttribute((((net.sourceforge.czt.z.jaxb.gen.impl.GenericTypeImpl)net.sourceforge.czt.z.jaxb.gen.impl.GenericTypeElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                        spawnHandlerFromLeaveAttribute((((net.sourceforge.czt.z.jaxb.gen.impl.GenericTypeImpl)net.sourceforge.czt.z.jaxb.gen.impl.GenericTypeElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                            spawnHandlerFromText((((net.sourceforge.czt.z.jaxb.gen.impl.GenericTypeImpl)net.sourceforge.czt.z.jaxb.gen.impl.GenericTypeElementImpl.this).new Unmarshaller(context)), 2, value);
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
