//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.1-05/30/2003 05:06 AM(java_re)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2003.08.25 at 04:40:49 NZST 
//


package net.sourceforge.czt.core.jaxb.gen.impl;

public class SchExprImpl
    extends net.sourceforge.czt.core.jaxb.gen.impl.ExprImpl
    implements net.sourceforge.czt.core.jaxb.gen.SchExpr, com.sun.xml.bind.JAXBObject, net.sourceforge.czt.core.jaxb.gen.impl.runtime.UnmarshallableObject, net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializable, net.sourceforge.czt.core.jaxb.gen.impl.runtime.ValidatableObject
{

    protected net.sourceforge.czt.core.jaxb.gen.SchText _SchText;
    public final static java.lang.Class version = (net.sourceforge.czt.core.jaxb.gen.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (net.sourceforge.czt.core.jaxb.gen.SchExpr.class);
    }

    public net.sourceforge.czt.core.jaxb.gen.SchText getSchText() {
        return _SchText;
    }

    public void setSchText(net.sourceforge.czt.core.jaxb.gen.SchText value) {
        _SchText = value;
    }

    public net.sourceforge.czt.core.jaxb.gen.impl.runtime.UnmarshallingEventHandler createUnmarshaller(net.sourceforge.czt.core.jaxb.gen.impl.runtime.UnmarshallingContext context) {
        return new net.sourceforge.czt.core.jaxb.gen.impl.SchExprImpl.Unmarshaller(context);
    }

    public void serializeElementBody(net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        super.serializeElementBody(context);
        if (_SchText instanceof javax.xml.bind.Element) {
            context.childAsElementBody(((com.sun.xml.bind.JAXBObject) _SchText));
        } else {
            context.startElement("http://czt.sourceforge.net/zml", "SchText");
            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _SchText));
            context.endNamespaceDecls();
            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _SchText));
            context.endAttributes();
            context.childAsElementBody(((com.sun.xml.bind.JAXBObject) _SchText));
            context.endElement();
        }
    }

    public void serializeAttributes(net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        super.serializeAttributes(context);
    }

    public void serializeAttributeBody(net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        super.serializeAttributeBody(context);
        if (_SchText instanceof javax.xml.bind.Element) {
            context.childAsAttributeBody(((com.sun.xml.bind.JAXBObject) _SchText));
        } else {
            context.startElement("http://czt.sourceforge.net/zml", "SchText");
            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _SchText));
            context.endNamespaceDecls();
            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _SchText));
            context.endAttributes();
            context.childAsElementBody(((com.sun.xml.bind.JAXBObject) _SchText));
            context.endElement();
        }
    }

    public void serializeURIs(net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        super.serializeURIs(context);
    }

    public java.lang.Class getPrimaryInterface() {
        return (net.sourceforge.czt.core.jaxb.gen.SchExpr.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava"
+"/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0002xp\u0004\u0097\u0018#ppsr\u0000\u001dcom.sun.msv.gra"
+"mmar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001\u0001\u0087\u00b2\u00bfppsr\u0000\'com.sun.msv.grammar"
+".trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClasst\u0000\u001fLcom/sun/msv/g"
+"rammar/NameClass;xr\u0000\u001ecom.sun.msv.grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002"
+"\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000\fcontentModelq\u0000~\u0000\u0002xq\u0000~\u0000\u0003\u0001\u0087\u00b2"
+"\u00b4sr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000p\u0000sq\u0000~\u0000\b\u0001\u0087\u00b2\u00a9pp\u0000s"
+"q\u0000~\u0000\u0006\u0001\u0087\u00b2\u009eppsr\u0000 com.sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr"
+"\u0000\u001ccom.sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0002xq\u0000~\u0000\u0003\u0001\u0087"
+"\u00b2\u0093q\u0000~\u0000\rpsr\u0000 com.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003ex"
+"pq\u0000~\u0000\u0002L\u0000\tnameClassq\u0000~\u0000\txq\u0000~\u0000\u0003\u0001\u0087\u00b2\u0090q\u0000~\u0000\rpsr\u00002com.sun.msv.gramm"
+"ar.Expression$AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\bsq\u0000~\u0000\f"
+"\u0001q\u0000~\u0000\u0016sr\u0000 com.sun.msv.grammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom"
+".sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.gramm"
+"ar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\tq\u0000~\u0000\u0017q\u0000~"
+"\u0000\u001csr\u0000#com.sun.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocal"
+"Namet\u0000\u0012Ljava/lang/String;L\u0000\fnamespaceURIq\u0000~\u0000\u001exq\u0000~\u0000\u0019t\u00000net.so"
+"urceforge.czt.core.jaxb.gen.TermA.AnnsTypet\u0000+http://java.sun"
+".com/jaxb/xjc/dummy-elementssq\u0000~\u0000\u001dt\u0000\u0004Annst\u0000\u001ehttp://czt.sourc"
+"eforge.net/zmlq\u0000~\u0000\u001csq\u0000~\u0000\u0006\u0003\u000fe_ppsq\u0000~\u0000\b\u0001\u0087\u00b2\u00b4pp\u0000sq\u0000~\u0000\b\u0001\u0087\u00b2\u00a9pp\u0000sq\u0000"
+"~\u0000\u0006\u0001\u0087\u00b2\u009eppsq\u0000~\u0000\u0010\u0001\u0087\u00b2\u0093q\u0000~\u0000\rpsq\u0000~\u0000\u0013\u0001\u0087\u00b2\u0090q\u0000~\u0000\rpq\u0000~\u0000\u0016q\u0000~\u0000\u001aq\u0000~\u0000\u001csq\u0000~"
+"\u0000\u001dt\u0000)net.sourceforge.czt.core.jaxb.gen.SchTextq\u0000~\u0000!sq\u0000~\u0000\u001dt\u0000\u0007"
+"SchTextq\u0000~\u0000$sq\u0000~\u0000\b\u0001\u0087\u00b2\u00a9pp\u0000sq\u0000~\u0000\u0006\u0001\u0087\u00b2\u009eppsq\u0000~\u0000\u0010\u0001\u0087\u00b2\u0093q\u0000~\u0000\rpsq\u0000~\u0000\u0013\u0001"
+"\u0087\u00b2\u0090q\u0000~\u0000\rpq\u0000~\u0000\u0016q\u0000~\u0000\u001aq\u0000~\u0000\u001csq\u0000~\u0000\u001dt\u00000net.sourceforge.czt.core.ja"
+"xb.gen.SchTextElementq\u0000~\u0000!sr\u0000\"com.sun.msv.grammar.Expression"
+"Pool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/Expression"
+"Pool$ClosedHash;xpsr\u0000-com.sun.msv.grammar.ExpressionPool$Clo"
+"sedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0002\u0000\u0004I\u0000\u0005countI\u0000\tthresholdL\u0000\u0006parentq\u0000~\u00006[\u0000\u0005table"
+"t\u0000![Lcom/sun/msv/grammar/Expression;xp\u0000\u0000\u0000\t\u0000\u0000\u00009pur\u0000![Lcom.sun"
+".msv.grammar.Expression;\u00d68D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp\u0000\u0000\u0000\u00bfppppppppppppppppppp"
+"pppppppppppq\u0000~\u0000%pppppppppppppppppppppppppppppppppppppppppppp"
+"pppppppq\u0000~\u0000\u0012q\u0000~\u0000)q\u0000~\u00001ppppppppq\u0000~\u0000\u000fq\u0000~\u0000(q\u0000~\u00000ppppppppppppppp"
+"pppppppppppppppq\u0000~\u0000\u0007ppppppppppppppppppppppppppppppppppq\u0000~\u0000\u0005p"
+"pppppppppppppppppppppppppppp"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends net.sourceforge.czt.core.jaxb.gen.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(net.sourceforge.czt.core.jaxb.gen.impl.runtime.UnmarshallingContext context) {
            super(context, "-----");
        }

        protected Unmarshaller(net.sourceforge.czt.core.jaxb.gen.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return net.sourceforge.czt.core.jaxb.gen.impl.SchExprImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  0 :
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.ExprImpl)net.sourceforge.czt.core.jaxb.gen.impl.SchExprImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.ExprImpl)net.sourceforge.czt.core.jaxb.gen.impl.SchExprImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname, __atts);
                        return ;
                    case  2 :
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _SchText = ((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl.class), 3, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("ConstDecl" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _SchText = ((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl.class), 3, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("InclDecl" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _SchText = ((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl.class), 3, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("VarDecl" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _SchText = ((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl.class), 3, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("FalsePred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _SchText = ((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl.class), 3, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("TruePred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _SchText = ((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl.class), 3, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("AndPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _SchText = ((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl.class), 3, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("ImpliesPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _SchText = ((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl.class), 3, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("IffPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _SchText = ((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl.class), 3, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("OrPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _SchText = ((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl.class), 3, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("ExistsPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _SchText = ((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl.class), 3, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("Exists1Pred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _SchText = ((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl.class), 3, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("ForallPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _SchText = ((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl.class), 3, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("ExprPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _SchText = ((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl.class), 3, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("MemPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _SchText = ((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl.class), 3, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("NegPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _SchText = ((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl.class), 3, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        _SchText = ((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl.class), 3, ___uri, ___local, ___qname, __atts));
                        return ;
                    case  4 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  1 :
                        if (("SchText" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 2;
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
                        if (("SchText" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.popAttributes();
                            state = 4;
                            return ;
                        }
                        break;
                    case  0 :
                        spawnHandlerFromLeaveElement((((net.sourceforge.czt.core.jaxb.gen.impl.ExprImpl)net.sourceforge.czt.core.jaxb.gen.impl.SchExprImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
                        return ;
                    case  2 :
                        _SchText = ((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl) spawnChildFromLeaveElement((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl.class), 3, ___uri, ___local, ___qname));
                        return ;
                    case  4 :
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
                    case  0 :
                        spawnHandlerFromEnterAttribute((((net.sourceforge.czt.core.jaxb.gen.impl.ExprImpl)net.sourceforge.czt.core.jaxb.gen.impl.SchExprImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
                        return ;
                    case  2 :
                        _SchText = ((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl) spawnChildFromEnterAttribute((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl.class), 3, ___uri, ___local, ___qname));
                        return ;
                    case  4 :
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
                    case  0 :
                        spawnHandlerFromLeaveAttribute((((net.sourceforge.czt.core.jaxb.gen.impl.ExprImpl)net.sourceforge.czt.core.jaxb.gen.impl.SchExprImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
                        return ;
                    case  2 :
                        _SchText = ((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl) spawnChildFromLeaveAttribute((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl.class), 3, ___uri, ___local, ___qname));
                        return ;
                    case  4 :
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
                        case  0 :
                            spawnHandlerFromText((((net.sourceforge.czt.core.jaxb.gen.impl.ExprImpl)net.sourceforge.czt.core.jaxb.gen.impl.SchExprImpl.this).new Unmarshaller(context)), 1, value);
                            return ;
                        case  2 :
                            _SchText = ((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl) spawnChildFromText((net.sourceforge.czt.core.jaxb.gen.impl.SchTextImpl.class), 3, value));
                            return ;
                        case  4 :
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
