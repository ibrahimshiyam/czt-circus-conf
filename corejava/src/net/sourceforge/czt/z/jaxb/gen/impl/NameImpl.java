//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2004.07.23 at 08:45:41 NZST 
//


package net.sourceforge.czt.z.jaxb.gen.impl;

public class NameImpl
    extends net.sourceforge.czt.z.jaxb.gen.impl.TermAImpl
    implements net.sourceforge.czt.z.jaxb.gen.Name, com.sun.xml.bind.JAXBObject, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallableObject, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializable, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.ValidatableObject
{

    protected java.lang.String _Word;
    protected com.sun.xml.bind.util.ListImpl _Stroke = new com.sun.xml.bind.util.ListImpl(new java.util.ArrayList());
    public final static java.lang.Class version = (net.sourceforge.czt.z.jaxb.gen.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (net.sourceforge.czt.z.jaxb.gen.Name.class);
    }

    public java.lang.String getWord() {
        return _Word;
    }

    public void setWord(java.lang.String value) {
        _Word = value;
    }

    public java.util.List getStroke() {
        return _Stroke;
    }

    public net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingEventHandler createUnmarshaller(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingContext context) {
        return new net.sourceforge.czt.z.jaxb.gen.impl.NameImpl.Unmarshaller(context);
    }

    public void serializeBody(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx2 = 0;
        final int len2 = _Stroke.size();
        super.serializeBody(context);
        context.startElement("http://czt.sourceforge.net/zml", "Word");
        context.endNamespaceDecls();
        context.endAttributes();
        try {
            context.text(((java.lang.String) _Word), "Word");
        } catch (java.lang.Exception e) {
            net.sourceforge.czt.oz.jaxb.gen.impl.runtime.Util.handlePrintConversionException(this, e, context);
        }
        context.endElement();
        while (idx2 != len2) {
            if (_Stroke.get(idx2) instanceof javax.xml.bind.Element) {
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _Stroke.get(idx2 ++)), "Stroke");
            } else {
                context.startElement("http://czt.sourceforge.net/zml", "Stroke");
                int idx_2 = idx2;
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Stroke.get(idx_2 ++)), "Stroke");
                context.endNamespaceDecls();
                int idx_3 = idx2;
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Stroke.get(idx_3 ++)), "Stroke");
                context.endAttributes();
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _Stroke.get(idx2 ++)), "Stroke");
                context.endElement();
            }
        }
    }

    public void serializeAttributes(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx2 = 0;
        final int len2 = _Stroke.size();
        super.serializeAttributes(context);
        while (idx2 != len2) {
            if (_Stroke.get(idx2) instanceof javax.xml.bind.Element) {
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Stroke.get(idx2 ++)), "Stroke");
            } else {
                idx2 += 1;
            }
        }
    }

    public void serializeURIs(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx2 = 0;
        final int len2 = _Stroke.size();
        super.serializeURIs(context);
        while (idx2 != len2) {
            if (_Stroke.get(idx2) instanceof javax.xml.bind.Element) {
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Stroke.get(idx2 ++)), "Stroke");
            } else {
                idx2 += 1;
            }
        }
    }

    public java.lang.Class getPrimaryInterface() {
        return (net.sourceforge.czt.z.jaxb.gen.Name.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava"
+"/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0002xp\n\u00cc\u0014\u00f1ppsq\u0000~\u0000\u0000\u0006\u0001\u001c\u0010ppsr\u0000\u001dcom"
+".sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001\u0003\u0095\u0015Dppsr\u0000\'com.sun"
+".msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClasst\u0000\u001fLc"
+"om/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv.grammar.Element"
+"Exp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000\fcontentModelq\u0000"
+"~\u0000\u0002xq\u0000~\u0000\u0003\u0003\u0095\u00159sr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000p\u0000sq"
+"\u0000~\u0000\u0000\u0003\u0095\u0015.ppsq\u0000~\u0000\t\u00012\u00be2pp\u0000sq\u0000~\u0000\u0007\u00012\u00be\'ppsr\u0000 com.sun.msv.grammar.O"
+"neOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0002xq\u0000~\u0000\u0003\u00012\u00be\u001cq\u0000~\u0000\u000epsr\u0000 com.sun.msv.grammar.Attr"
+"ibuteExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClassq\u0000~\u0000\nxq\u0000~\u0000\u0003\u00012\u00be\u0019q\u0000~"
+"\u0000\u000epsr\u00002com.sun.msv.grammar.Expression$AnyStringExpression\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\bsq\u0000~\u0000\r\u0001q\u0000~\u0000\u0018sr\u0000 com.sun.msv.grammar.AnyNam"
+"eClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000"
+"\u0000xpsr\u00000com.sun.msv.grammar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\tq\u0000~\u0000\u0019q\u0000~\u0000\u001esr\u0000#com.sun.msv.grammar.SimpleName"
+"Class\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/String;L\u0000\fnamespac"
+"eURIq\u0000~\u0000 xq\u0000~\u0000\u001bt\u0000-net.sourceforge.czt.z.jaxb.gen.TermA.AnnsT"
+"ypet\u0000+http://java.sun.com/jaxb/xjc/dummy-elementssq\u0000~\u0000\u0007\u0002bV\u00f7p"
+"psq\u0000~\u0000\u0015\u0002bV\u00ecq\u0000~\u0000\u000epsr\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L"
+"\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004namet"
+"\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~\u0000\u0003\u0000\u0089\u0017\u00b2ppsr\u0000\"com.sun.msv.d"
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
+"//czt.sourceforge.net/zmlq\u0000~\u0000\u001esq\u0000~\u0000\t\u0002l\u0006\u00c7pp\u0000sq\u0000~\u0000\u0000\u0002l\u0006\u00bcppsq\u0000~\u0000"
+"&\u0001a0oq\u0000~\u0000\u000epsr\u0000#com.sun.msv.datatype.xsd.StringType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000"
+"\u0001Z\u0000\risAlwaysValidxq\u0000~\u0000+q\u0000~\u00000t\u0000\u0006stringsr\u00005com.sun.msv.datatyp"
+"e.xsd.WhiteSpaceProcessor$Preserve\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u00003\u0001q\u0000~\u00006sq\u0000"
+"~\u00007q\u0000~\u0000Dq\u0000~\u00000sq\u0000~\u0000\u0007\u0001\n\u00d6Hppsq\u0000~\u0000\u0015\u0001\n\u00d6=q\u0000~\u0000\u000epq\u0000~\u0000)sq\u0000~\u0000\u001fq\u0000~\u0000:q\u0000~"
+"\u0000;q\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000\u0004Wordq\u0000~\u0000>sq\u0000~\u0000\u0007\u0004\u00ca\u00f8\u00dcppsq\u0000~\u0000\u0012\u0004\u00ca\u00f8\u00d1q\u0000~\u0000\u000epsq\u0000~\u0000\u0007\u0004"
+"\u00ca\u00f8\u00ceq\u0000~\u0000\u000epsq\u0000~\u0000\u0007\u0003\u0098:\u009aq\u0000~\u0000\u000epsq\u0000~\u0000\u0007\u0002e|fq\u0000~\u0000\u000epsq\u0000~\u0000\t\u00012\u00be2q\u0000~\u0000\u000ep\u0000sq"
+"\u0000~\u0000\u0007\u00012\u00be\'ppsq\u0000~\u0000\u0012\u00012\u00be\u001cq\u0000~\u0000\u000epsq\u0000~\u0000\u0015\u00012\u00be\u0019q\u0000~\u0000\u000epq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000"
+"~\u0000\u001ft\u0000/net.sourceforge.czt.z.jaxb.gen.NumStrokeElementq\u0000~\u0000#sq"
+"\u0000~\u0000\t\u00012\u00be2q\u0000~\u0000\u000ep\u0000sq\u0000~\u0000\u0007\u00012\u00be\'ppsq\u0000~\u0000\u0012\u00012\u00be\u001cq\u0000~\u0000\u000epsq\u0000~\u0000\u0015\u00012\u00be\u0019q\u0000~\u0000\u000epq"
+"\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000\'net.sourceforge.czt.z.jaxb.gen.InStro"
+"keq\u0000~\u0000#sq\u0000~\u0000\t\u00012\u00be2q\u0000~\u0000\u000ep\u0000sq\u0000~\u0000\u0007\u00012\u00be\'ppsq\u0000~\u0000\u0012\u00012\u00be\u001cq\u0000~\u0000\u000epsq\u0000~\u0000\u0015\u00012"
+"\u00be\u0019q\u0000~\u0000\u000epq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000)net.sourceforge.czt.z.jaxb.g"
+"en.NextStrokeq\u0000~\u0000#sq\u0000~\u0000\t\u00012\u00be2q\u0000~\u0000\u000ep\u0000sq\u0000~\u0000\u0007\u00012\u00be\'ppsq\u0000~\u0000\u0012\u00012\u00be\u001cq\u0000~"
+"\u0000\u000epsq\u0000~\u0000\u0015\u00012\u00be\u0019q\u0000~\u0000\u000epq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000(net.sourceforge.c"
+"zt.z.jaxb.gen.OutStrokeq\u0000~\u0000#q\u0000~\u0000\u001esr\u0000\"com.sun.msv.grammar.Exp"
+"ressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/Exp"
+"ressionPool$ClosedHash;xpsr\u0000-com.sun.msv.grammar.ExpressionP"
+"ool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0002\u0000\u0004I\u0000\u0005countI\u0000\tthresholdL\u0000\u0006parentq\u0000~\u0000k["
+"\u0000\u0005tablet\u0000![Lcom/sun/msv/grammar/Expression;xp\u0000\u0000\u0000\u0016\u0000\u0000\u00009pur\u0000![L"
+"com.sun.msv.grammar.Expression;\u00d68D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp\u0000\u0000\u0000\u00bfpppq\u0000~\u0000$pppp"
+"pppppppppppppq\u0000~\u0000Oppq\u0000~\u0000Nppppppppppq\u0000~\u0000Mpppppppppq\u0000~\u0000Hpppppp"
+"pppppppppppq\u0000~\u0000Ppppppppppppppppppppppppppppppppppppppppppq\u0000~"
+"\u0000Qpppppppppppppppppppq\u0000~\u0000\u0014q\u0000~\u0000Tq\u0000~\u0000Zq\u0000~\u0000`q\u0000~\u0000fpq\u0000~\u0000@pq\u0000~\u0000\u0006pp"
+"q\u0000~\u0000\u0011q\u0000~\u0000Sq\u0000~\u0000Yq\u0000~\u0000_q\u0000~\u0000eppppppppppppppq\u0000~\u0000\u000fpppppppppppppppp"
+"pq\u0000~\u0000\u0005pppq\u0000~\u0000\bppppppppppppp"));
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
            return net.sourceforge.czt.z.jaxb.gen.impl.NameImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  1 :
                        if (("Word" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 2;
                            return ;
                        }
                        break;
                    case  7 :
                        if (("NumStroke" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Stroke.add(((net.sourceforge.czt.z.jaxb.gen.impl.NumStrokeElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.NumStrokeElementImpl.class), 7, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("InStroke" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Stroke.add(((net.sourceforge.czt.z.jaxb.gen.impl.InStrokeImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.InStrokeImpl.class), 7, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("NextStroke" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Stroke.add(((net.sourceforge.czt.z.jaxb.gen.impl.NextStrokeImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.NextStrokeImpl.class), 7, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("OutStroke" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Stroke.add(((net.sourceforge.czt.z.jaxb.gen.impl.OutStrokeImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.OutStrokeImpl.class), 7, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("Stroke" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 5;
                            return ;
                        }
                        if (("Stroke" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Stroke.add(((net.sourceforge.czt.z.jaxb.gen.impl.StrokeElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.StrokeElementImpl.class), 7, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  5 :
                        _Stroke.add(((net.sourceforge.czt.z.jaxb.gen.impl.StrokeImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.StrokeImpl.class), 6, ___uri, ___local, ___qname, __atts)));
                        return ;
                    case  4 :
                        if (("NumStroke" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Stroke.add(((net.sourceforge.czt.z.jaxb.gen.impl.NumStrokeElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.NumStrokeElementImpl.class), 7, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("InStroke" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Stroke.add(((net.sourceforge.czt.z.jaxb.gen.impl.InStrokeImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.InStrokeImpl.class), 7, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("NextStroke" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Stroke.add(((net.sourceforge.czt.z.jaxb.gen.impl.NextStrokeImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.NextStrokeImpl.class), 7, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("OutStroke" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Stroke.add(((net.sourceforge.czt.z.jaxb.gen.impl.OutStrokeImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.OutStrokeImpl.class), 7, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("Stroke" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 5;
                            return ;
                        }
                        if (("Stroke" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Stroke.add(((net.sourceforge.czt.z.jaxb.gen.impl.StrokeElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.StrokeElementImpl.class), 7, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        state = 7;
                        continue outer;
                    case  0 :
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.TermAImpl)net.sourceforge.czt.z.jaxb.gen.impl.NameImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.TermAImpl)net.sourceforge.czt.z.jaxb.gen.impl.NameImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname, __atts);
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
                    case  7 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  5 :
                        _Stroke.add(((net.sourceforge.czt.z.jaxb.gen.impl.StrokeImpl) spawnChildFromLeaveElement((net.sourceforge.czt.z.jaxb.gen.impl.StrokeImpl.class), 6, ___uri, ___local, ___qname)));
                        return ;
                    case  6 :
                        if (("Stroke" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.popAttributes();
                            state = 7;
                            return ;
                        }
                        break;
                    case  4 :
                        state = 7;
                        continue outer;
                    case  0 :
                        spawnHandlerFromLeaveElement((((net.sourceforge.czt.z.jaxb.gen.impl.TermAImpl)net.sourceforge.czt.z.jaxb.gen.impl.NameImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
                        return ;
                    case  3 :
                        if (("Word" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.popAttributes();
                            state = 4;
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
                    case  7 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  5 :
                        _Stroke.add(((net.sourceforge.czt.z.jaxb.gen.impl.StrokeImpl) spawnChildFromEnterAttribute((net.sourceforge.czt.z.jaxb.gen.impl.StrokeImpl.class), 6, ___uri, ___local, ___qname)));
                        return ;
                    case  4 :
                        state = 7;
                        continue outer;
                    case  0 :
                        spawnHandlerFromEnterAttribute((((net.sourceforge.czt.z.jaxb.gen.impl.TermAImpl)net.sourceforge.czt.z.jaxb.gen.impl.NameImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
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
                    case  5 :
                        _Stroke.add(((net.sourceforge.czt.z.jaxb.gen.impl.StrokeImpl) spawnChildFromLeaveAttribute((net.sourceforge.czt.z.jaxb.gen.impl.StrokeImpl.class), 6, ___uri, ___local, ___qname)));
                        return ;
                    case  4 :
                        state = 7;
                        continue outer;
                    case  0 :
                        spawnHandlerFromLeaveAttribute((((net.sourceforge.czt.z.jaxb.gen.impl.TermAImpl)net.sourceforge.czt.z.jaxb.gen.impl.NameImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
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
                        case  2 :
                            eatText1(value);
                            state = 3;
                            return ;
                        case  7 :
                            revertToParentFromText(value);
                            return ;
                        case  5 :
                            _Stroke.add(((net.sourceforge.czt.z.jaxb.gen.impl.StrokeImpl) spawnChildFromText((net.sourceforge.czt.z.jaxb.gen.impl.StrokeImpl.class), 6, value)));
                            return ;
                        case  4 :
                            state = 7;
                            continue outer;
                        case  0 :
                            spawnHandlerFromText((((net.sourceforge.czt.z.jaxb.gen.impl.TermAImpl)net.sourceforge.czt.z.jaxb.gen.impl.NameImpl.this).new Unmarshaller(context)), 1, value);
                            return ;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

        private void eatText1(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _Word = value;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

    }

}
