//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2004.07.23 at 08:45:41 NZST 
//


package net.sourceforge.czt.z.jaxb.gen.impl;

public class NameSectTypeTripleElementImpl
    extends net.sourceforge.czt.z.jaxb.gen.impl.NameSectTypeTripleImpl
    implements net.sourceforge.czt.z.jaxb.gen.NameSectTypeTripleElement, com.sun.xml.bind.RIElement, com.sun.xml.bind.JAXBObject, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallableObject, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializable, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.ValidatableObject
{

    public final static java.lang.Class version = (net.sourceforge.czt.z.jaxb.gen.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (net.sourceforge.czt.z.jaxb.gen.NameSectTypeTripleElement.class);
    }

    public java.lang.String ____jaxb_ri____getNamespaceURI() {
        return "http://czt.sourceforge.net/zml";
    }

    public java.lang.String ____jaxb_ri____getLocalName() {
        return "NameSectTypeTriple";
    }

    public net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingEventHandler createUnmarshaller(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingContext context) {
        return new net.sourceforge.czt.z.jaxb.gen.impl.NameSectTypeTripleElementImpl.Unmarshaller(context);
    }

    public void serializeBody(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("http://czt.sourceforge.net/zml", "NameSectTypeTriple");
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
        return (net.sourceforge.czt.z.jaxb.gen.NameSectTypeTripleElement.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000"
+"\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv."
+"grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000"
+"\fcontentModelt\u0000 Lcom/sun/msv/grammar/Expression;xr\u0000\u001ecom.sun."
+"msv.grammar.Expression\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilon"
+"Reducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0003xp\u000f\u0019\u00cfup"
+"p\u0000sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun."
+"msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~"
+"\u0000\u0004\u000f\u0019\u00cfjppsq\u0000~\u0000\u0007\u000e\u0001X2ppsq\u0000~\u0000\u0007\u0005\u009e$\u00c3ppsq\u0000~\u0000\u0000\u0002\u00a6\u00bb\u00b3pp\u0000sq\u0000~\u0000\u0007\u0002\u00a6\u00bb\u00a8ppsq\u0000"
+"~\u0000\u0000\u00012\u00be2pp\u0000sr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\b"
+"\u00012\u00be\'ppsr\u0000 com.sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom"
+".sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0003xq\u0000~\u0000\u0004\u00012\u00be\u001csr\u0000"
+"\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psr\u0000 com.sun.msv.gra"
+"mmar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0003L\u0000\tnameClassq\u0000~\u0000\u0001xq\u0000~"
+"\u0000\u0004\u00012\u00be\u0019q\u0000~\u0000\u0015psr\u00002com.sun.msv.grammar.Expression$AnyStringExpr"
+"ession\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\bsq\u0000~\u0000\u0014\u0001q\u0000~\u0000\u0019sr\u0000 com.sun.msv.gramm"
+"ar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$EpsilonExpres"
+"sion\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\tq\u0000~\u0000\u001aq\u0000~\u0000\u001fsr\u0000#com.sun.msv.grammar.S"
+"impleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/String;L\u0000"
+"\fnamespaceURIq\u0000~\u0000!xq\u0000~\u0000\u001ct\u0000\'net.sourceforge.czt.z.jaxb.gen.De"
+"clNamet\u0000+http://java.sun.com/jaxb/xjc/dummy-elementssq\u0000~\u0000\u000f\u0001s"
+"\u00fdqppsq\u0000~\u0000\u0016\u0001s\u00fdfq\u0000~\u0000\u0015psr\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002"
+"\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0003L\u0000\u0004na"
+"met\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~\u0000\u0004\u0000\u0089\u0017\u00b2ppsr\u0000\"com.sun.ms"
+"v.datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype."
+"xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd"
+".ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.xsd.XSDatat"
+"ypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000!L\u0000\btypeNameq\u0000~\u0000!L\u0000\nwhi"
+"teSpacet\u0000.Lcom/sun/msv/datatype/xsd/WhiteSpaceProcessor;xpt\u0000"
+" http://www.w3.org/2001/XMLSchemat\u0000\u0005QNamesr\u00005com.sun.msv.dat"
+"atype.xsd.WhiteSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun"
+".msv.datatype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.su"
+"n.msv.grammar.Expression$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000"
+"\u0000\u0000\nq\u0000~\u0000\u0015psr\u0000\u001bcom.sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalN"
+"ameq\u0000~\u0000!L\u0000\fnamespaceURIq\u0000~\u0000!xpq\u0000~\u00002q\u0000~\u00001sq\u0000~\u0000 t\u0000\u0004typet\u0000)http"
+"://www.w3.org/2001/XMLSchema-instanceq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000\u0004Namet\u0000\u001eht"
+"tp://czt.sourceforge.net/zmlsq\u0000~\u0000\u0000\u0002\u00f7i\u000bpp\u0000sq\u0000~\u0000\u0007\u0002\u00f7i\u0000ppsq\u0000~\u0000\'\u0001"
+"a0oq\u0000~\u0000\u0015psr\u0000#com.sun.msv.datatype.xsd.StringType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z"
+"\u0000\risAlwaysValidxq\u0000~\u0000,q\u0000~\u00001t\u0000\u0006stringsr\u00005com.sun.msv.datatype."
+"xsd.WhiteSpaceProcessor$Preserve\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u00004\u0001q\u0000~\u00007sq\u0000~\u0000"
+"8q\u0000~\u0000Eq\u0000~\u00001sq\u0000~\u0000\u000f\u0001\u00968\u008cppsq\u0000~\u0000\u0016\u0001\u00968\u0081q\u0000~\u0000\u0015pq\u0000~\u0000*sq\u0000~\u0000 q\u0000~\u0000;q\u0000~\u0000<"
+"q\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000\u0004Sectq\u0000~\u0000?sq\u0000~\u0000\u000f\bc3jppsq\u0000~\u0000\u000f\u00070u6ppsq\u0000~\u0000\u000f\u0005\u00fd\u00b7\u0002pps"
+"q\u0000~\u0000\u000f\u0004\u00ca\u00f8\u00ceppsq\u0000~\u0000\u000f\u0003\u0098:\u009appsq\u0000~\u0000\u000f\u0002e|fppsq\u0000~\u0000\u0000\u00012\u00be2pp\u0000sq\u0000~\u0000\u000f\u00012\u00be\'pp"
+"sq\u0000~\u0000\u0011\u00012\u00be\u001cq\u0000~\u0000\u0015psq\u0000~\u0000\u0016\u00012\u00be\u0019q\u0000~\u0000\u0015pq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u00000net."
+"sourceforge.czt.z.jaxb.gen.SchemaTypeElementq\u0000~\u0000$sq\u0000~\u0000\u0000\u00012\u00be2p"
+"p\u0000sq\u0000~\u0000\u000f\u00012\u00be\'ppsq\u0000~\u0000\u0011\u00012\u00be\u001cq\u0000~\u0000\u0015psq\u0000~\u0000\u0016\u00012\u00be\u0019q\u0000~\u0000\u0015pq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000"
+"\u001fsq\u0000~\u0000 t\u0000+net.sourceforge.czt.z.jaxb.gen.Type2Elementq\u0000~\u0000$sq"
+"\u0000~\u0000\u0000\u00012\u00be2pp\u0000sq\u0000~\u0000\u000f\u00012\u00be\'ppsq\u0000~\u0000\u0011\u00012\u00be\u001cq\u0000~\u0000\u0015psq\u0000~\u0000\u0016\u00012\u00be\u0019q\u0000~\u0000\u0015pq\u0000~\u0000\u0019"
+"q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u00002net.sourceforge.czt.z.jaxb.gen.GenParamTy"
+"peElementq\u0000~\u0000$sq\u0000~\u0000\u0000\u00012\u00be2pp\u0000sq\u0000~\u0000\u000f\u00012\u00be\'ppsq\u0000~\u0000\u0011\u00012\u00be\u001cq\u0000~\u0000\u0015psq\u0000~\u0000"
+"\u0016\u00012\u00be\u0019q\u0000~\u0000\u0015pq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u00001net.sourceforge.czt.z.jax"
+"b.gen.GenericTypeElementq\u0000~\u0000$sq\u0000~\u0000\u0000\u00012\u00be2pp\u0000sq\u0000~\u0000\u000f\u00012\u00be\'ppsq\u0000~\u0000\u0011"
+"\u00012\u00be\u001cq\u0000~\u0000\u0015psq\u0000~\u0000\u0016\u00012\u00be\u0019q\u0000~\u0000\u0015pq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000.net.source"
+"forge.czt.z.jaxb.gen.ProdTypeElementq\u0000~\u0000$sq\u0000~\u0000\u0000\u00012\u00be2pp\u0000sq\u0000~\u0000\u000f"
+"\u00012\u00be\'ppsq\u0000~\u0000\u0011\u00012\u00be\u001cq\u0000~\u0000\u0015psq\u0000~\u0000\u0016\u00012\u00be\u0019q\u0000~\u0000\u0015pq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t"
+"\u0000/net.sourceforge.czt.z.jaxb.gen.GivenTypeElementq\u0000~\u0000$sq\u0000~\u0000\u0000"
+"\u00012\u00be2pp\u0000sq\u0000~\u0000\u000f\u00012\u00be\'ppsq\u0000~\u0000\u0011\u00012\u00be\u001cq\u0000~\u0000\u0015psq\u0000~\u0000\u0016\u00012\u00be\u0019q\u0000~\u0000\u0015pq\u0000~\u0000\u0019q\u0000~\u0000"
+"\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000/net.sourceforge.czt.z.jaxb.gen.PowerTypeEleme"
+"ntq\u0000~\u0000$sq\u0000~\u0000\u000f\u0001\u0018w3ppsq\u0000~\u0000\u0016\u0001\u0018w(q\u0000~\u0000\u0015pq\u0000~\u0000*sq\u0000~\u0000 q\u0000~\u0000;q\u0000~\u0000<q\u0000~\u0000"
+"\u001fsq\u0000~\u0000 t\u0000\u0012NameSectTypeTripleq\u0000~\u0000?sr\u0000\"com.sun.msv.grammar.Exp"
+"ressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/Exp"
+"ressionPool$ClosedHash;xpsr\u0000-com.sun.msv.grammar.ExpressionP"
+"ool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0002\u0000\u0004I\u0000\u0005countI\u0000\tthresholdL\u0000\u0006parentq\u0000~\u0000\u0084["
+"\u0000\u0005tablet\u0000![Lcom/sun/msv/grammar/Expression;xp\u0000\u0000\u0000\u001e\u0000\u0000\u00009pur\u0000![L"
+"com.sun.msv.grammar.Expression;\u00d68D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp\u0000\u0000\u0000\u00bfpppppppppppp"
+"pppppppppq\u0000~\u0000Qpppq\u0000~\u0000Apppppq\u0000~\u0000\rpppppppppppppppppppppppppppp"
+"pppq\u0000~\u0000Rppppppq\u0000~\u0000%pppppppppq\u0000~\u0000\tppq\u0000~\u0000\u000bppq\u0000~\u0000Npppppq\u0000~\u0000~ppp"
+"pppppppppq\u0000~\u0000Spppppppppppppppppppq\u0000~\u0000\u0013q\u0000~\u0000Vq\u0000~\u0000\\q\u0000~\u0000bq\u0000~\u0000hq\u0000"
+"~\u0000Iq\u0000~\u0000nq\u0000~\u0000tq\u0000~\u0000Oq\u0000~\u0000zpq\u0000~\u0000\u0010q\u0000~\u0000Uq\u0000~\u0000[q\u0000~\u0000aq\u0000~\u0000gq\u0000~\u0000mq\u0000~\u0000sq"
+"\u0000~\u0000yppppppppppppppppppppppppppq\u0000~\u0000Ppppq\u0000~\u0000\npppppppppppppppp"));
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
            return net.sourceforge.czt.z.jaxb.gen.impl.NameSectTypeTripleElementImpl.this;
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
                        if (("NameSectTypeTriple" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 1;
                            return ;
                        }
                        break;
                    case  1 :
                        if (("Name" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.NameSectTypeTripleImpl)net.sourceforge.czt.z.jaxb.gen.impl.NameSectTypeTripleElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
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
                    case  2 :
                        if (("NameSectTypeTriple" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
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
