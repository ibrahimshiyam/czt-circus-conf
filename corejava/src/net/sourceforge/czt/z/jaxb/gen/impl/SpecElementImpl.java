//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2004.01.05 at 10:33:20 NZDT 
//


package net.sourceforge.czt.z.jaxb.gen.impl;

public class SpecElementImpl
    extends net.sourceforge.czt.z.jaxb.gen.impl.SpecImpl
    implements net.sourceforge.czt.z.jaxb.gen.SpecElement, com.sun.xml.bind.RIElement, com.sun.xml.bind.JAXBObject, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallableObject, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializable, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.ValidatableObject
{

    public final static java.lang.Class version = (net.sourceforge.czt.z.jaxb.gen.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (net.sourceforge.czt.z.jaxb.gen.SpecElement.class);
    }

    public java.lang.String ____jaxb_ri____getNamespaceURI() {
        return "http://czt.sourceforge.net/zml";
    }

    public java.lang.String ____jaxb_ri____getLocalName() {
        return "Spec";
    }

    public net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingEventHandler createUnmarshaller(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingContext context) {
        return new net.sourceforge.czt.z.jaxb.gen.impl.SpecElementImpl.Unmarshaller(context);
    }

    public void serializeBody(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("http://czt.sourceforge.net/zml", "Spec");
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
        return (net.sourceforge.czt.z.jaxb.gen.SpecElement.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000"
+"\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv."
+"grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000"
+"\fcontentModelt\u0000 Lcom/sun/msv/grammar/Expression;xr\u0000\u001ecom.sun."
+"msv.grammar.Expression\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilon"
+"Reducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0003xp\u000b\u00d9x0p"
+"p\u0000sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun."
+"msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~"
+"\u0000\u0004\u000b\u00d9x%ppsq\u0000~\u0000\u0007\u000b\u001f\u00c2!ppsq\u0000~\u0000\u0007\nN_\u0080ppsq\u0000~\u0000\u0007\n\u0001\u00c8]ppsq\u0000~\u0000\u0007\t\u0000JCppsq\u0000~"
+"\u0000\u0007\u0006a\u00c4oppsr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\b\u0002\u008d"
+"\u009fappsq\u0000~\u0000\u0000\u0002\u008d\u009fVsr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000p\u0000s"
+"q\u0000~\u0000\u0007\u0002\u008d\u009fKppsq\u0000~\u0000\u0000\u0001F\u00b6\u00fdpp\u0000sq\u0000~\u0000\u000f\u0001F\u00b6\u00f2ppsr\u0000 com.sun.msv.grammar."
+"OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0003xq\u0000~\u0000\u0004\u0001F\u00b6\u00e7q\u0000~\u0000\u0013psr\u0000 com.sun.msv.grammar.Att"
+"ributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0003L\u0000\tnameClassq\u0000~\u0000\u0001xq\u0000~\u0000\u0004\u0001F\u00b6\u00e4q\u0000"
+"~\u0000\u0013psr\u00002com.sun.msv.grammar.Expression$AnyStringExpression\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\bsq\u0000~\u0000\u0012\u0001q\u0000~\u0000\u001dsr\u0000 com.sun.msv.grammar.AnyNa"
+"meClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002"
+"\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\tq\u0000~\u0000\u001eq\u0000~\u0000#sr\u0000#com.sun.msv.grammar.SimpleNam"
+"eClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/String;L\u0000\fnamespa"
+"ceURIq\u0000~\u0000%xq\u0000~\u0000 t\u0000-net.sourceforge.czt.z.jaxb.gen.TermA.Anns"
+"Typet\u0000+http://java.sun.com/jaxb/xjc/dummy-elementssq\u0000~\u0000\u000f\u0001F\u00e8I"
+"ppsq\u0000~\u0000\u001a\u0001F\u00e8>q\u0000~\u0000\u0013psr\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003"
+"L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0003L\u0000\u0004name"
+"t\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~\u0000\u0004\u00005\u00e6\u00f3ppsr\u0000\"com.sun.msv."
+"datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xs"
+"d.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.C"
+"oncreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.xsd.XSDatatyp"
+"eImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000%L\u0000\btypeNameq\u0000~\u0000%L\u0000\nwhite"
+"Spacet\u0000.Lcom/sun/msv/datatype/xsd/WhiteSpaceProcessor;xpt\u0000 h"
+"ttp://www.w3.org/2001/XMLSchemat\u0000\u0005QNamesr\u00005com.sun.msv.datat"
+"ype.xsd.WhiteSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.m"
+"sv.datatype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun."
+"msv.grammar.Expression$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000"
+"\nq\u0000~\u0000\u0013psr\u0000\u001bcom.sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNam"
+"eq\u0000~\u0000%L\u0000\fnamespaceURIq\u0000~\u0000%xpq\u0000~\u00006q\u0000~\u00005sq\u0000~\u0000$t\u0000\u0004typet\u0000)http:/"
+"/www.w3.org/2001/XMLSchema-instanceq\u0000~\u0000#sq\u0000~\u0000$t\u0000\u0004Annst\u0000\u001ehttp"
+"://czt.sourceforge.net/zmlq\u0000~\u0000#sq\u0000~\u0000\u000f\u0003\u00d4%\tppsq\u0000~\u0000\u0017\u0003\u00d4$\u00feq\u0000~\u0000\u0013ps"
+"q\u0000~\u0000\u000f\u0003\u00d4$\u00fbq\u0000~\u0000\u0013psq\u0000~\u0000\u000f\u0002\u008dm\u00fcq\u0000~\u0000\u0013psq\u0000~\u0000\u0000\u0001F\u00b6\u00fdq\u0000~\u0000\u0013p\u0000sq\u0000~\u0000\u000f\u0001F\u00b6\u00f2pp"
+"sq\u0000~\u0000\u0017\u0001F\u00b6\u00e7q\u0000~\u0000\u0013psq\u0000~\u0000\u001a\u0001F\u00b6\u00e4q\u0000~\u0000\u0013pq\u0000~\u0000\u001dq\u0000~\u0000!q\u0000~\u0000#sq\u0000~\u0000$t\u0000.net."
+"sourceforge.czt.z.jaxb.gen.NarrSectElementq\u0000~\u0000(sq\u0000~\u0000\u0000\u0001F\u00b6\u00fdq\u0000~"
+"\u0000\u0013p\u0000sq\u0000~\u0000\u000f\u0001F\u00b6\u00f2ppsq\u0000~\u0000\u0017\u0001F\u00b6\u00e7q\u0000~\u0000\u0013psq\u0000~\u0000\u001a\u0001F\u00b6\u00e4q\u0000~\u0000\u0013pq\u0000~\u0000\u001dq\u0000~\u0000!q\u0000"
+"~\u0000#sq\u0000~\u0000$t\u00003net.sourceforge.czt.z.jaxb.gen.UnparsedZSectElem"
+"entq\u0000~\u0000(sq\u0000~\u0000\u0000\u0001F\u00b6\u00fdq\u0000~\u0000\u0013p\u0000sq\u0000~\u0000\u000f\u0001F\u00b6\u00f2ppsq\u0000~\u0000\u0017\u0001F\u00b6\u00e7q\u0000~\u0000\u0013psq\u0000~\u0000\u001a\u0001"
+"F\u00b6\u00e4q\u0000~\u0000\u0013pq\u0000~\u0000\u001dq\u0000~\u0000!q\u0000~\u0000#sq\u0000~\u0000$t\u0000+net.sourceforge.czt.z.jaxb."
+"gen.ZSectElementq\u0000~\u0000(q\u0000~\u0000#sq\u0000~\u0000\u000f\u0002\u009e\u0085\u00cfppsq\u0000~\u0000\u001a\u0002\u009e\u0085\u00c4q\u0000~\u0000\u0013psq\u0000~\u0000+"
+"\u0001\u00bd\u008c~ppsr\u0000#com.sun.msv.datatype.xsd.AnyURIType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~"
+"\u00000q\u0000~\u00005t\u0000\u0006anyURIq\u0000~\u00009q\u0000~\u0000;sq\u0000~\u0000<q\u0000~\u0000_q\u0000~\u00005sq\u0000~\u0000$t\u0000\u0006Sourcet\u0000\u0000"
+"q\u0000~\u0000#sq\u0000~\u0000\u000f\u0001\u0001~\u0015ppsq\u0000~\u0000\u001a\u0001\u0001~\nq\u0000~\u0000\u0013psq\u0000~\u0000+\u0000\u00f4-cppsr\u0000%com.sun.msv"
+".datatype.xsd.DateTimeType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000)com.sun.msv.datatyp"
+"e.xsd.DateTimeBaseType\u0014W\u001a@3\u00a5\u00b4\u00e5\u0002\u0000\u0000xq\u0000~\u00000q\u0000~\u00005t\u0000\bdateTimeq\u0000~\u00009"
+"q\u0000~\u0000;sq\u0000~\u0000<q\u0000~\u0000jq\u0000~\u00005sq\u0000~\u0000$t\u0000\bModifiedq\u0000~\u0000cq\u0000~\u0000#sq\u0000~\u0000\u000f\u0000L\u0097\u001epp"
+"sq\u0000~\u0000\u001a\u0000L\u0097\u0013q\u0000~\u0000\u0013psq\u0000~\u0000+\u0000\"\u00b9\u000fq\u0000~\u0000\u0013psr\u0000#com.sun.msv.datatype.xsd"
+".StringType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\risAlwaysValidxq\u0000~\u00000q\u0000~\u00005t\u0000\u0006stringsr"
+"\u00005com.sun.msv.datatype.xsd.WhiteSpaceProcessor$Preserve\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u00008\u0001q\u0000~\u0000;sq\u0000~\u0000<q\u0000~\u0000sq\u0000~\u00005sq\u0000~\u0000$t\u0000\u0007Versionq\u0000~\u0000cq\u0000~\u0000#"
+"sq\u0000~\u0000\u000f\u0000\u00d1b\u009cppsq\u0000~\u0000\u001a\u0000\u00d1b\u0091q\u0000~\u0000\u0013pq\u0000~\u0000psq\u0000~\u0000$t\u0000\u0006Authorq\u0000~\u0000cq\u0000~\u0000#sq"
+"\u0000~\u0000\u000f\u0000\u00b9\u00b5\u00ffppsq\u0000~\u0000\u001a\u0000\u00b9\u00b5\u00f4q\u0000~\u0000\u0013pq\u0000~\u0000.sq\u0000~\u0000$q\u0000~\u0000?q\u0000~\u0000@q\u0000~\u0000#sq\u0000~\u0000$t\u0000"
+"\u0004Specq\u0000~\u0000Csr\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L"
+"\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/ExpressionPool$ClosedHash;"
+"xpsr\u0000-com.sun.msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0002"
+"\u0000\u0004I\u0000\u0005countI\u0000\tthresholdL\u0000\u0006parentq\u0000~\u0000\u0083[\u0000\u0005tablet\u0000![Lcom/sun/msv"
+"/grammar/Expression;xp\u0000\u0000\u0000\u001a\u0000\u0000\u00009pur\u0000![Lcom.sun.msv.grammar.Exp"
+"ression;\u00d68D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp\u0000\u0000\u0000\u00bfpppppq\u0000~\u0000Zq\u0000~\u0000\nppq\u0000~\u0000Gppppppppppppp"
+"pppq\u0000~\u0000\u0014pppppppppppppq\u0000~\u0000}pppppppq\u0000~\u0000\u0010pq\u0000~\u0000\tpppppppppppppq\u0000~"
+"\u0000yppppppppppppq\u0000~\u0000\u0019q\u0000~\u0000Jq\u0000~\u0000Pq\u0000~\u0000Vpppppppq\u0000~\u0000\u0016q\u0000~\u0000Iq\u0000~\u0000Oq\u0000~\u0000"
+"Uppppppppppppppppppq\u0000~\u0000Fppq\u0000~\u0000)q\u0000~\u0000Epppppppppq\u0000~\u0000Dppq\u0000~\u0000\u000bppp"
+"ppq\u0000~\u0000npppppppppppppppppppppppppppppppppppppppppppq\u0000~\u0000\u000epq\u0000~\u0000"
+"dq\u0000~\u0000\fppppppq\u0000~\u0000\rppp"));
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
            return net.sourceforge.czt.z.jaxb.gen.impl.SpecElementImpl.this;
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
                        if (("Spec" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 1;
                            return ;
                        }
                        break;
                    case  1 :
                        attIdx = context.getAttribute("", "Source");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        attIdx = context.getAttribute("", "Modified");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        attIdx = context.getAttribute("", "Version");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        attIdx = context.getAttribute("", "Author");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.SpecImpl)net.sourceforge.czt.z.jaxb.gen.impl.SpecElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("NarrSect" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.SpecImpl)net.sourceforge.czt.z.jaxb.gen.impl.SpecElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("UnparsedZSect" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.SpecImpl)net.sourceforge.czt.z.jaxb.gen.impl.SpecElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("ZSect" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.SpecImpl)net.sourceforge.czt.z.jaxb.gen.impl.SpecElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Sect" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.SpecImpl)net.sourceforge.czt.z.jaxb.gen.impl.SpecElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Sect" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.SpecImpl)net.sourceforge.czt.z.jaxb.gen.impl.SpecElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.SpecImpl)net.sourceforge.czt.z.jaxb.gen.impl.SpecElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
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
                        if (("Spec" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  1 :
                        attIdx = context.getAttribute("", "Source");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "Modified");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "Version");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "Author");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        spawnHandlerFromLeaveElement((((net.sourceforge.czt.z.jaxb.gen.impl.SpecImpl)net.sourceforge.czt.z.jaxb.gen.impl.SpecElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                        if (("Source" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((net.sourceforge.czt.z.jaxb.gen.impl.SpecImpl)net.sourceforge.czt.z.jaxb.gen.impl.SpecElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                            return ;
                        }
                        if (("Modified" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((net.sourceforge.czt.z.jaxb.gen.impl.SpecImpl)net.sourceforge.czt.z.jaxb.gen.impl.SpecElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                            return ;
                        }
                        if (("Version" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((net.sourceforge.czt.z.jaxb.gen.impl.SpecImpl)net.sourceforge.czt.z.jaxb.gen.impl.SpecElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                            return ;
                        }
                        if (("Author" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((net.sourceforge.czt.z.jaxb.gen.impl.SpecImpl)net.sourceforge.czt.z.jaxb.gen.impl.SpecElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                            return ;
                        }
                        spawnHandlerFromEnterAttribute((((net.sourceforge.czt.z.jaxb.gen.impl.SpecImpl)net.sourceforge.czt.z.jaxb.gen.impl.SpecElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                        attIdx = context.getAttribute("", "Source");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "Modified");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "Version");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "Author");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        spawnHandlerFromLeaveAttribute((((net.sourceforge.czt.z.jaxb.gen.impl.SpecImpl)net.sourceforge.czt.z.jaxb.gen.impl.SpecElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                            attIdx = context.getAttribute("", "Source");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            attIdx = context.getAttribute("", "Modified");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            attIdx = context.getAttribute("", "Version");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            attIdx = context.getAttribute("", "Author");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            spawnHandlerFromText((((net.sourceforge.czt.z.jaxb.gen.impl.SpecImpl)net.sourceforge.czt.z.jaxb.gen.impl.SpecElementImpl.this).new Unmarshaller(context)), 2, value);
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
