//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2004.02.19 at 05:33:12 NZDT 
//


package net.sourceforge.czt.z.jaxb.gen.impl;

public class FreetypeImpl
    extends net.sourceforge.czt.z.jaxb.gen.impl.TermAImpl
    implements net.sourceforge.czt.z.jaxb.gen.Freetype, com.sun.xml.bind.JAXBObject, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallableObject, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializable, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.ValidatableObject
{

    protected com.sun.xml.bind.util.ListImpl _Branch = new com.sun.xml.bind.util.ListImpl(new java.util.ArrayList());
    protected net.sourceforge.czt.z.jaxb.gen.DeclName _DeclName;
    public final static java.lang.Class version = (net.sourceforge.czt.z.jaxb.gen.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (net.sourceforge.czt.z.jaxb.gen.Freetype.class);
    }

    public java.util.List getBranch() {
        return _Branch;
    }

    public net.sourceforge.czt.z.jaxb.gen.DeclName getDeclName() {
        return _DeclName;
    }

    public void setDeclName(net.sourceforge.czt.z.jaxb.gen.DeclName value) {
        _DeclName = value;
    }

    public net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingEventHandler createUnmarshaller(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingContext context) {
        return new net.sourceforge.czt.z.jaxb.gen.impl.FreetypeImpl.Unmarshaller(context);
    }

    public void serializeBody(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = _Branch.size();
        super.serializeBody(context);
        if (_DeclName instanceof javax.xml.bind.Element) {
            context.childAsBody(((com.sun.xml.bind.JAXBObject) _DeclName), "DeclName");
        } else {
            context.startElement("http://czt.sourceforge.net/zml", "DeclName");
            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _DeclName), "DeclName");
            context.endNamespaceDecls();
            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _DeclName), "DeclName");
            context.endAttributes();
            context.childAsBody(((com.sun.xml.bind.JAXBObject) _DeclName), "DeclName");
            context.endElement();
        }
        while (idx1 != len1) {
            if (_Branch.get(idx1) instanceof javax.xml.bind.Element) {
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _Branch.get(idx1 ++)), "Branch");
            } else {
                context.startElement("http://czt.sourceforge.net/zml", "Branch");
                int idx_2 = idx1;
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Branch.get(idx_2 ++)), "Branch");
                context.endNamespaceDecls();
                int idx_3 = idx1;
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Branch.get(idx_3 ++)), "Branch");
                context.endAttributes();
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _Branch.get(idx1 ++)), "Branch");
                context.endElement();
            }
        }
    }

    public void serializeAttributes(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = _Branch.size();
        super.serializeAttributes(context);
        if (_DeclName instanceof javax.xml.bind.Element) {
            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _DeclName), "DeclName");
        }
        while (idx1 != len1) {
            if (_Branch.get(idx1) instanceof javax.xml.bind.Element) {
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Branch.get(idx1 ++)), "Branch");
            } else {
                idx1 += 1;
            }
        }
    }

    public void serializeURIs(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = _Branch.size();
        super.serializeURIs(context);
        if (_DeclName instanceof javax.xml.bind.Element) {
            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _DeclName), "DeclName");
        }
        while (idx1 != len1) {
            if (_Branch.get(idx1) instanceof javax.xml.bind.Element) {
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Branch.get(idx1 ++)), "Branch");
            } else {
                idx1 += 1;
            }
        }
    }

    public java.lang.Class getPrimaryInterface() {
        return (net.sourceforge.czt.z.jaxb.gen.Freetype.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava"
+"/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0002xp\r\u001e:1ppsq\u0000~\u0000\u0000\b~\u0081\u0089ppsr\u0000\u001dcom"
+".sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001\u0003\u008b\u000e\u0087ppsr\u0000\'com.sun"
+".msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClasst\u0000\u001fLc"
+"om/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv.grammar.Element"
+"Exp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000\fcontentModelq\u0000"
+"~\u0000\u0002xq\u0000~\u0000\u0003\u0003\u008b\u000e|sr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000p\u0000sq"
+"\u0000~\u0000\u0000\u0003\u008b\u000eqppsq\u0000~\u0000\t\u0001\u0015\u0012\u0090pp\u0000sq\u0000~\u0000\u0007\u0001\u0015\u0012\u0085ppsr\u0000 com.sun.msv.grammar.O"
+"neOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0002xq\u0000~\u0000\u0003\u0001\u0015\u0012zq\u0000~\u0000\u000epsr\u0000 com.sun.msv.grammar.Attr"
+"ibuteExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClassq\u0000~\u0000\nxq\u0000~\u0000\u0003\u0001\u0015\u0012wq\u0000~"
+"\u0000\u000epsr\u00002com.sun.msv.grammar.Expression$AnyStringExpression\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\bsq\u0000~\u0000\r\u0001q\u0000~\u0000\u0018sr\u0000 com.sun.msv.grammar.AnyNam"
+"eClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000"
+"\u0000xpsr\u00000com.sun.msv.grammar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\tq\u0000~\u0000\u0019q\u0000~\u0000\u001esr\u0000#com.sun.msv.grammar.SimpleName"
+"Class\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/String;L\u0000\fnamespac"
+"eURIq\u0000~\u0000 xq\u0000~\u0000\u001bt\u0000-net.sourceforge.czt.z.jaxb.gen.TermA.AnnsT"
+"ypet\u0000+http://java.sun.com/jaxb/xjc/dummy-elementssq\u0000~\u0000\u0007\u0002u\u00fb\u00dcp"
+"psq\u0000~\u0000\u0015\u0002u\u00fb\u00d1q\u0000~\u0000\u000epsr\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L"
+"\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004namet"
+"\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~\u0000\u0003\u0001\u0007\u00bd\u001dppsr\u0000\"com.sun.msv.d"
+"atatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd"
+".BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.Co"
+"ncreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.xsd.XSDatatype"
+"Impl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000 L\u0000\btypeNameq\u0000~\u0000 L\u0000\nwhiteS"
+"pacet\u0000.Lcom/sun/msv/datatype/xsd/WhiteSpaceProcessor;xpt\u0000 ht"
+"tp://www.w3.org/2001/XMLSchemat\u0000\u0005QNamesr\u00005com.sun.msv.dataty"
+"pe.xsd.WhiteSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.ms"
+"v.datatype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.m"
+"sv.grammar.Expression$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\n"
+"q\u0000~\u0000\u000epsr\u0000\u001bcom.sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalName"
+"q\u0000~\u0000 L\u0000\fnamespaceURIq\u0000~\u0000 xpq\u0000~\u00001q\u0000~\u00000sq\u0000~\u0000\u001ft\u0000\u0004typet\u0000)http://"
+"www.w3.org/2001/XMLSchema-instanceq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000\u0004Annst\u0000\u001ehttp:"
+"//czt.sourceforge.net/zmlq\u0000~\u0000\u001esq\u0000~\u0000\u0007\u0004\u00f3r\u00fdppsq\u0000~\u0000\t\u0001\u0015\u0012\u0090pp\u0000sq\u0000~\u0000"
+"\u0007\u0001\u0015\u0012\u0085ppsq\u0000~\u0000\u0012\u0001\u0015\u0012zq\u0000~\u0000\u000epsq\u0000~\u0000\u0015\u0001\u0015\u0012wq\u0000~\u0000\u000epq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001f"
+"t\u0000.net.sourceforge.czt.z.jaxb.gen.DeclNameElementq\u0000~\u0000#sq\u0000~\u0000\t"
+"\u0003\u00de`kpp\u0000sq\u0000~\u0000\u0000\u0003\u00de``ppsq\u0000~\u0000\t\u0001\u0015\u0012\u0090pp\u0000sq\u0000~\u0000\u0007\u0001\u0015\u0012\u0085ppsq\u0000~\u0000\u0012\u0001\u0015\u0012zq\u0000~\u0000\u000ep"
+"sq\u0000~\u0000\u0015\u0001\u0015\u0012wq\u0000~\u0000\u000epq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000\'net.sourceforge.czt."
+"z.jaxb.gen.DeclNameq\u0000~\u0000#sq\u0000~\u0000\u0007\u0002\u00c9M\u00cbppsq\u0000~\u0000\u0015\u0002\u00c9M\u00c0q\u0000~\u0000\u000epq\u0000~\u0000)sq\u0000"
+"~\u0000\u001fq\u0000~\u0000:q\u0000~\u0000;q\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000\bDeclNameq\u0000~\u0000>sq\u0000~\u0000\u0012\u0004\u009f\u00b8\u00a3ppsq\u0000~\u0000\u0007\u0004\u009f"
+"\u00b8\u00a0ppsq\u0000~\u0000\t\u0001\u0015\u0012\u0090pp\u0000sq\u0000~\u0000\u0007\u0001\u0015\u0012\u0085ppsq\u0000~\u0000\u0012\u0001\u0015\u0012zq\u0000~\u0000\u000epsq\u0000~\u0000\u0015\u0001\u0015\u0012wq\u0000~\u0000\u000e"
+"pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000,net.sourceforge.czt.z.jaxb.gen.Bran"
+"chElementq\u0000~\u0000#sq\u0000~\u0000\t\u0003\u008a\u00a6\u000epp\u0000sq\u0000~\u0000\u0000\u0003\u008a\u00a6\u0003ppsq\u0000~\u0000\t\u0001\u0015\u0012\u0090pp\u0000sq\u0000~\u0000\u0007\u0001\u0015"
+"\u0012\u0085ppsq\u0000~\u0000\u0012\u0001\u0015\u0012zq\u0000~\u0000\u000epsq\u0000~\u0000\u0015\u0001\u0015\u0012wq\u0000~\u0000\u000epq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000%"
+"net.sourceforge.czt.z.jaxb.gen.Branchq\u0000~\u0000#sq\u0000~\u0000\u0007\u0002u\u0093nppsq\u0000~\u0000\u0015"
+"\u0002u\u0093cq\u0000~\u0000\u000epq\u0000~\u0000)sq\u0000~\u0000\u001fq\u0000~\u0000:q\u0000~\u0000;q\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000\u0006Branchq\u0000~\u0000>sr\u0000\""
+"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/L"
+"com/sun/msv/grammar/ExpressionPool$ClosedHash;xpsr\u0000-com.sun."
+"msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0002\u0000\u0004I\u0000\u0005countI\u0000\tt"
+"hresholdL\u0000\u0006parentq\u0000~\u0000i[\u0000\u0005tablet\u0000![Lcom/sun/msv/grammar/Expre"
+"ssion;xp\u0000\u0000\u0000\u0016\u0000\u0000\u00009pur\u0000![Lcom.sun.msv.grammar.Expression;\u00d68D\u00c3]\u00ad"
+"\u00a7\n\u0002\u0000\u0000xp\u0000\u0000\u0000\u00bfpppppppppppppppppppppppq\u0000~\u0000\u0014q\u0000~\u0000Bq\u0000~\u0000Jq\u0000~\u0000Nq\u0000~\u0000Wq"
+"\u0000~\u0000_pppppq\u0000~\u0000\u0011q\u0000~\u0000Aq\u0000~\u0000Iq\u0000~\u0000Vq\u0000~\u0000^pppppppppppppppppppppq\u0000~\u0000$"
+"pppppq\u0000~\u0000cppq\u0000~\u0000\u0005ppppq\u0000~\u0000Gpppq\u0000~\u0000\u0006pppppppppppppppppppppppppp"
+"pppppq\u0000~\u0000\u000fpppppq\u0000~\u0000\\pppppppppppppppq\u0000~\u0000\bq\u0000~\u0000?ppppppppppppppp"
+"pppppppppppppppppppppppppq\u0000~\u0000Tppq\u0000~\u0000Sppppppppppppp"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends net.sourceforge.czt.oz.jaxb.gen.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingContext context) {
            super(context, "--------");
        }

        protected Unmarshaller(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return net.sourceforge.czt.z.jaxb.gen.impl.FreetypeImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  1 :
                        if (("DeclName" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 2;
                            return ;
                        }
                        if (("DeclName" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _DeclName = ((net.sourceforge.czt.z.jaxb.gen.impl.DeclNameElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.DeclNameElementImpl.class), 4, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        break;
                    case  7 :
                        if (("Branch" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 5;
                            return ;
                        }
                        if (("Branch" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Branch.add(((net.sourceforge.czt.z.jaxb.gen.impl.BranchElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.BranchElementImpl.class), 7, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  4 :
                        if (("Branch" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 5;
                            return ;
                        }
                        if (("Branch" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Branch.add(((net.sourceforge.czt.z.jaxb.gen.impl.BranchElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.BranchElementImpl.class), 7, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        break;
                    case  2 :
                        attIdx = context.getAttribute("", "Id");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _DeclName = ((net.sourceforge.czt.z.jaxb.gen.impl.DeclNameImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.DeclNameImpl.class), 3, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("Word" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _DeclName = ((net.sourceforge.czt.z.jaxb.gen.impl.DeclNameImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.DeclNameImpl.class), 3, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        _DeclName = ((net.sourceforge.czt.z.jaxb.gen.impl.DeclNameImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.DeclNameImpl.class), 3, ___uri, ___local, ___qname, __atts));
                        return ;
                    case  5 :
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Branch.add(((net.sourceforge.czt.z.jaxb.gen.impl.BranchImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.BranchImpl.class), 6, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("DeclName" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Branch.add(((net.sourceforge.czt.z.jaxb.gen.impl.BranchImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.BranchImpl.class), 6, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("DeclName" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Branch.add(((net.sourceforge.czt.z.jaxb.gen.impl.BranchImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.BranchImpl.class), 6, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        _Branch.add(((net.sourceforge.czt.z.jaxb.gen.impl.BranchImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.BranchImpl.class), 6, ___uri, ___local, ___qname, __atts)));
                        return ;
                    case  0 :
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.TermAImpl)net.sourceforge.czt.z.jaxb.gen.impl.FreetypeImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.TermAImpl)net.sourceforge.czt.z.jaxb.gen.impl.FreetypeImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname, __atts);
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
                        if (("DeclName" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.popAttributes();
                            state = 4;
                            return ;
                        }
                        break;
                    case  6 :
                        if (("Branch" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.popAttributes();
                            state = 7;
                            return ;
                        }
                        break;
                    case  7 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  2 :
                        attIdx = context.getAttribute("", "Id");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        _DeclName = ((net.sourceforge.czt.z.jaxb.gen.impl.DeclNameImpl) spawnChildFromLeaveElement((net.sourceforge.czt.z.jaxb.gen.impl.DeclNameImpl.class), 3, ___uri, ___local, ___qname));
                        return ;
                    case  5 :
                        _Branch.add(((net.sourceforge.czt.z.jaxb.gen.impl.BranchImpl) spawnChildFromLeaveElement((net.sourceforge.czt.z.jaxb.gen.impl.BranchImpl.class), 6, ___uri, ___local, ___qname)));
                        return ;
                    case  0 :
                        spawnHandlerFromLeaveElement((((net.sourceforge.czt.z.jaxb.gen.impl.TermAImpl)net.sourceforge.czt.z.jaxb.gen.impl.FreetypeImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
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
                    case  7 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  2 :
                        if (("Id" == ___local)&&("" == ___uri)) {
                            _DeclName = ((net.sourceforge.czt.z.jaxb.gen.impl.DeclNameImpl) spawnChildFromEnterAttribute((net.sourceforge.czt.z.jaxb.gen.impl.DeclNameImpl.class), 3, ___uri, ___local, ___qname));
                            return ;
                        }
                        _DeclName = ((net.sourceforge.czt.z.jaxb.gen.impl.DeclNameImpl) spawnChildFromEnterAttribute((net.sourceforge.czt.z.jaxb.gen.impl.DeclNameImpl.class), 3, ___uri, ___local, ___qname));
                        return ;
                    case  5 :
                        _Branch.add(((net.sourceforge.czt.z.jaxb.gen.impl.BranchImpl) spawnChildFromEnterAttribute((net.sourceforge.czt.z.jaxb.gen.impl.BranchImpl.class), 6, ___uri, ___local, ___qname)));
                        return ;
                    case  0 :
                        spawnHandlerFromEnterAttribute((((net.sourceforge.czt.z.jaxb.gen.impl.TermAImpl)net.sourceforge.czt.z.jaxb.gen.impl.FreetypeImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
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
                    case  7 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  2 :
                        attIdx = context.getAttribute("", "Id");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        _DeclName = ((net.sourceforge.czt.z.jaxb.gen.impl.DeclNameImpl) spawnChildFromLeaveAttribute((net.sourceforge.czt.z.jaxb.gen.impl.DeclNameImpl.class), 3, ___uri, ___local, ___qname));
                        return ;
                    case  5 :
                        _Branch.add(((net.sourceforge.czt.z.jaxb.gen.impl.BranchImpl) spawnChildFromLeaveAttribute((net.sourceforge.czt.z.jaxb.gen.impl.BranchImpl.class), 6, ___uri, ___local, ___qname)));
                        return ;
                    case  0 :
                        spawnHandlerFromLeaveAttribute((((net.sourceforge.czt.z.jaxb.gen.impl.TermAImpl)net.sourceforge.czt.z.jaxb.gen.impl.FreetypeImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
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
                        case  7 :
                            revertToParentFromText(value);
                            return ;
                        case  2 :
                            attIdx = context.getAttribute("", "Id");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            _DeclName = ((net.sourceforge.czt.z.jaxb.gen.impl.DeclNameImpl) spawnChildFromText((net.sourceforge.czt.z.jaxb.gen.impl.DeclNameImpl.class), 3, value));
                            return ;
                        case  5 :
                            _Branch.add(((net.sourceforge.czt.z.jaxb.gen.impl.BranchImpl) spawnChildFromText((net.sourceforge.czt.z.jaxb.gen.impl.BranchImpl.class), 6, value)));
                            return ;
                        case  0 :
                            spawnHandlerFromText((((net.sourceforge.czt.z.jaxb.gen.impl.TermAImpl)net.sourceforge.czt.z.jaxb.gen.impl.FreetypeImpl.this).new Unmarshaller(context)), 1, value);
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
