//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2005.02.24 at 01:10:48 GMT 
//


package net.sourceforge.czt.z.jaxb.gen.impl;

public class SignatureAnnImpl
    extends net.sourceforge.czt.z.jaxb.gen.impl.AnnImpl
    implements net.sourceforge.czt.z.jaxb.gen.SignatureAnn, com.sun.xml.bind.JAXBObject, net.sourceforge.czt.circus.jaxb.gen.impl.runtime.UnmarshallableObject, net.sourceforge.czt.circus.jaxb.gen.impl.runtime.XMLSerializable, net.sourceforge.czt.circus.jaxb.gen.impl.runtime.ValidatableObject
{

    protected net.sourceforge.czt.z.jaxb.gen.Signature _Signature;
    public final static java.lang.Class version = (net.sourceforge.czt.z.jaxb.gen.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (net.sourceforge.czt.z.jaxb.gen.SignatureAnn.class);
    }

    public net.sourceforge.czt.z.jaxb.gen.Signature getSignature() {
        return _Signature;
    }

    public void setSignature(net.sourceforge.czt.z.jaxb.gen.Signature value) {
        _Signature = value;
    }

    public net.sourceforge.czt.circus.jaxb.gen.impl.runtime.UnmarshallingEventHandler createUnmarshaller(net.sourceforge.czt.circus.jaxb.gen.impl.runtime.UnmarshallingContext context) {
        return new net.sourceforge.czt.z.jaxb.gen.impl.SignatureAnnImpl.Unmarshaller(context);
    }

    public void serializeBody(net.sourceforge.czt.circus.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        super.serializeBody(context);
        if (_Signature instanceof javax.xml.bind.Element) {
            context.childAsBody(((com.sun.xml.bind.JAXBObject) _Signature), "Signature");
        } else {
            context.startElement("http://czt.sourceforge.net/zml", "Signature");
            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Signature), "Signature");
            context.endNamespaceDecls();
            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Signature), "Signature");
            context.endAttributes();
            context.childAsBody(((com.sun.xml.bind.JAXBObject) _Signature), "Signature");
            context.endElement();
        }
    }

    public void serializeAttributes(net.sourceforge.czt.circus.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        super.serializeAttributes(context);
        if (_Signature instanceof javax.xml.bind.Element) {
            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Signature), "Signature");
        }
    }

    public void serializeURIs(net.sourceforge.czt.circus.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        super.serializeURIs(context);
        if (_Signature instanceof javax.xml.bind.Element) {
            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Signature), "Signature");
        }
    }

    public java.lang.Class getPrimaryInterface() {
        return (net.sourceforge.czt.z.jaxb.gen.SignatureAnn.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun."
+"msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gramm"
+"ar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expression"
+"\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000bex"
+"pandedExpq\u0000~\u0000\u0002xpppsr\u0000\'com.sun.msv.grammar.trex.ElementPatter"
+"n\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr"
+"\u0000\u001ecom.sun.msv.grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclar"
+"edAttributesL\u0000\fcontentModelq\u0000~\u0000\u0002xq\u0000~\u0000\u0003pp\u0000sq\u0000~\u0000\u0000ppsr\u0000 com.sun"
+".msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar."
+"UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0002xq\u0000~\u0000\u0003sr\u0000\u0011java.lang.Boolean\u00cd r"
+"\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psr\u0000 com.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClassq\u0000~\u0000\u0007xq\u0000~\u0000\u0003q\u0000~\u0000\u000fpsr\u00002com.sun.m"
+"sv.grammar.Expression$AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003sq"
+"\u0000~\u0000\u000e\u0001q\u0000~\u0000\u0013sr\u0000 com.sun.msv.grammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000"
+"\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.g"
+"rammar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000\u0014q\u0000~"
+"\u0000\u0019sr\u0000#com.sun.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocal"
+"Namet\u0000\u0012Ljava/lang/String;L\u0000\fnamespaceURIq\u0000~\u0000\u001bxq\u0000~\u0000\u0016t\u0000/net.so"
+"urceforge.czt.z.jaxb.gen.SignatureElementt\u0000+http://java.sun."
+"com/jaxb/xjc/dummy-elementssq\u0000~\u0000\u0006pp\u0000sr\u0000\u001fcom.sun.msv.grammar."
+"SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001ppsq\u0000~\u0000\u0006pp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u000bq\u0000~\u0000\u000fps"
+"q\u0000~\u0000\u0010q\u0000~\u0000\u000fpq\u0000~\u0000\u0013q\u0000~\u0000\u0017q\u0000~\u0000\u0019sq\u0000~\u0000\u001at\u0000(net.sourceforge.czt.z.jax"
+"b.gen.Signatureq\u0000~\u0000\u001esq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0010q\u0000~\u0000\u000fpsr\u0000\u001bcom.sun.msv.gram"
+"mar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Datatype"
+";L\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~\u0000\u0003"
+"ppsr\u0000\"com.sun.msv.datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.s"
+"un.msv.datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun."
+"msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.data"
+"type.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000\u001bL\u0000\btyp"
+"eNameq\u0000~\u0000\u001bL\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/datatype/xsd/WhiteSpa"
+"ceProcessor;xpt\u0000 http://www.w3.org/2001/XMLSchemat\u0000\u0005QNamesr\u0000"
+"5com.sun.msv.datatype.xsd.WhiteSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$NullSetExpression\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000\u000fpsr\u0000\u001bcom.sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0"
+"\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u001bL\u0000\fnamespaceURIq\u0000~\u0000\u001bxpq\u0000~\u00005q\u0000~\u00004sq\u0000~\u0000\u001at\u0000"
+"\u0004typet\u0000)http://www.w3.org/2001/XMLSchema-instanceq\u0000~\u0000\u0019sq\u0000~\u0000\u001a"
+"t\u0000\tSignaturet\u0000\u001ehttp://czt.sourceforge.net/zmlsr\u0000\"com.sun.msv"
+".grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv"
+"/grammar/ExpressionPool$ClosedHash;xpsr\u0000-com.sun.msv.grammar"
+".ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstreamVersio"
+"nL\u0000\u0006parentt\u0000$Lcom/sun/msv/grammar/ExpressionPool;xp\u0000\u0000\u0000\u0007\u0001pq\u0000~"
+"\u0000!q\u0000~\u0000\u0005q\u0000~\u0000\nq\u0000~\u0000#q\u0000~\u0000(q\u0000~\u0000\rq\u0000~\u0000$x"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends net.sourceforge.czt.circus.jaxb.gen.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(net.sourceforge.czt.circus.jaxb.gen.impl.runtime.UnmarshallingContext context) {
            super(context, "-----");
        }

        protected Unmarshaller(net.sourceforge.czt.circus.jaxb.gen.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return net.sourceforge.czt.z.jaxb.gen.impl.SignatureAnnImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        if (("NameTypePair" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Signature = ((net.sourceforge.czt.z.jaxb.gen.impl.SignatureImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.SignatureImpl.class), 4, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("NameTypePair" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Signature = ((net.sourceforge.czt.z.jaxb.gen.impl.SignatureImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.SignatureImpl.class), 4, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        _Signature = ((net.sourceforge.czt.z.jaxb.gen.impl.SignatureImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.SignatureImpl.class), 4, ___uri, ___local, ___qname, __atts));
                        return ;
                    case  2 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  1 :
                        if (("Signature" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 3;
                            return ;
                        }
                        if (("Signature" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Signature = ((net.sourceforge.czt.z.jaxb.gen.impl.SignatureElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.SignatureElementImpl.class), 2, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        break;
                    case  0 :
                        spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.AnnImpl)net.sourceforge.czt.z.jaxb.gen.impl.SignatureAnnImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname, __atts);
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
                        _Signature = ((net.sourceforge.czt.z.jaxb.gen.impl.SignatureImpl) spawnChildFromLeaveElement((net.sourceforge.czt.z.jaxb.gen.impl.SignatureImpl.class), 4, ___uri, ___local, ___qname));
                        return ;
                    case  2 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  0 :
                        spawnHandlerFromLeaveElement((((net.sourceforge.czt.z.jaxb.gen.impl.AnnImpl)net.sourceforge.czt.z.jaxb.gen.impl.SignatureAnnImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
                        return ;
                    case  4 :
                        if (("Signature" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.popAttributes();
                            state = 2;
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
                        _Signature = ((net.sourceforge.czt.z.jaxb.gen.impl.SignatureImpl) spawnChildFromEnterAttribute((net.sourceforge.czt.z.jaxb.gen.impl.SignatureImpl.class), 4, ___uri, ___local, ___qname));
                        return ;
                    case  2 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  0 :
                        spawnHandlerFromEnterAttribute((((net.sourceforge.czt.z.jaxb.gen.impl.AnnImpl)net.sourceforge.czt.z.jaxb.gen.impl.SignatureAnnImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
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
                        _Signature = ((net.sourceforge.czt.z.jaxb.gen.impl.SignatureImpl) spawnChildFromLeaveAttribute((net.sourceforge.czt.z.jaxb.gen.impl.SignatureImpl.class), 4, ___uri, ___local, ___qname));
                        return ;
                    case  2 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  0 :
                        spawnHandlerFromLeaveAttribute((((net.sourceforge.czt.z.jaxb.gen.impl.AnnImpl)net.sourceforge.czt.z.jaxb.gen.impl.SignatureAnnImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
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
                            _Signature = ((net.sourceforge.czt.z.jaxb.gen.impl.SignatureImpl) spawnChildFromText((net.sourceforge.czt.z.jaxb.gen.impl.SignatureImpl.class), 4, value));
                            return ;
                        case  2 :
                            revertToParentFromText(value);
                            return ;
                        case  0 :
                            spawnHandlerFromText((((net.sourceforge.czt.z.jaxb.gen.impl.AnnImpl)net.sourceforge.czt.z.jaxb.gen.impl.SignatureAnnImpl.this).new Unmarshaller(context)), 1, value);
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
