//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2005.02.14 at 08:40:58 GMT 
//


package net.sourceforge.czt.z.jaxb.gen.impl;

public class NameImpl
    extends net.sourceforge.czt.z.jaxb.gen.impl.TermAImpl
    implements net.sourceforge.czt.z.jaxb.gen.Name, com.sun.xml.bind.JAXBObject, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallableObject, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializable, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.ValidatableObject
{

    protected java.lang.String _Word;
    protected com.sun.xml.bind.util.ListImpl _Stroke;
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

    protected com.sun.xml.bind.util.ListImpl _getStroke() {
        if (_Stroke == null) {
            _Stroke = new com.sun.xml.bind.util.ListImpl(new java.util.ArrayList());
        }
        return _Stroke;
    }

    public java.util.List getStroke() {
        return _getStroke();
    }

    public net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingEventHandler createUnmarshaller(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingContext context) {
        return new net.sourceforge.czt.z.jaxb.gen.impl.NameImpl.Unmarshaller(context);
    }

    public void serializeBody(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx2 = 0;
        final int len2 = ((_Stroke == null)? 0 :_Stroke.size());
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
        final int len2 = ((_Stroke == null)? 0 :_Stroke.size());
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
        final int len2 = ((_Stroke == null)? 0 :_Stroke.size());
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
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000b"
+"expandedExpq\u0000~\u0000\u0002xpppsq\u0000~\u0000\u0000ppsr\u0000\u001dcom.sun.msv.grammar.ChoiceEx"
+"p\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001ppsr\u0000\'com.sun.msv.grammar.trex.ElementPatt"
+"ern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;"
+"xr\u0000\u001ecom.sun.msv.grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndecl"
+"aredAttributesL\u0000\fcontentModelq\u0000~\u0000\u0002xq\u0000~\u0000\u0003sr\u0000\u0011java.lang.Boolea"
+"n\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000p\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\tpp\u0000sq\u0000~\u0000\u0007ppsr\u0000 com.su"
+"n.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar"
+".UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0002xq\u0000~\u0000\u0003q\u0000~\u0000\u000epsr\u0000 com.sun.msv.g"
+"rammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClassq\u0000~\u0000\nxq"
+"\u0000~\u0000\u0003q\u0000~\u0000\u000epsr\u00002com.sun.msv.grammar.Expression$AnyStringExpres"
+"sion\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003sq\u0000~\u0000\r\u0001q\u0000~\u0000\u0018sr\u0000 com.sun.msv.grammar.Any"
+"NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$EpsilonExpression\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000\u0019q\u0000~\u0000\u001esr\u0000#com.sun.msv.grammar.SimpleNameC"
+"lass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/String;L\u0000\fnamespace"
+"URIq\u0000~\u0000 xq\u0000~\u0000\u001bt\u0000-net.sourceforge.czt.z.jaxb.gen.TermA.AnnsTy"
+"pet\u0000+http://java.sun.com/jaxb/xjc/dummy-elementssq\u0000~\u0000\u0007ppsq\u0000~"
+"\u0000\u0015q\u0000~\u0000\u000epsr\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLo"
+"rg/relaxng/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004namet\u0000\u001dLcom/su"
+"n/msv/util/StringPair;xq\u0000~\u0000\u0003ppsr\u0000\"com.sun.msv.datatype.xsd.Q"
+"nameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.BuiltinAtomi"
+"cType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.ConcreteType\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002"
+"\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000 L\u0000\btypeNameq\u0000~\u0000 L\u0000\nwhiteSpacet\u0000.Lcom/s"
+"un/msv/datatype/xsd/WhiteSpaceProcessor;xpt\u0000 http://www.w3.o"
+"rg/2001/XMLSchemat\u0000\u0005QNamesr\u00005com.sun.msv.datatype.xsd.WhiteS"
+"paceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xs"
+"d.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Ex"
+"pression$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000\u000epsr\u0000\u001bcom.sun"
+".msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000 L\u0000\fnamespace"
+"URIq\u0000~\u0000 xpq\u0000~\u00001q\u0000~\u00000sq\u0000~\u0000\u001ft\u0000\u0004typet\u0000)http://www.w3.org/2001/X"
+"MLSchema-instanceq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000\u0004Annst\u0000\u001ehttp://czt.sourceforge"
+".net/zmlq\u0000~\u0000\u001esq\u0000~\u0000\tpp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000&q\u0000~\u0000\u000epsr\u0000#com.sun.msv.da"
+"tatype.xsd.StringType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\risAlwaysValidxq\u0000~\u0000+q\u0000~\u00000t"
+"\u0000\u0006stringsr\u00005com.sun.msv.datatype.xsd.WhiteSpaceProcessor$Pre"
+"serve\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u00003\u0001q\u0000~\u00006sq\u0000~\u00007q\u0000~\u0000Dq\u0000~\u00000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0015q\u0000"
+"~\u0000\u000epq\u0000~\u0000)q\u0000~\u00009q\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000\u0004Wordq\u0000~\u0000>sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0012q\u0000~\u0000\u000epsq\u0000"
+"~\u0000\u0007q\u0000~\u0000\u000epsq\u0000~\u0000\u0007q\u0000~\u0000\u000epsq\u0000~\u0000\u0007q\u0000~\u0000\u000epsq\u0000~\u0000\tq\u0000~\u0000\u000ep\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0012"
+"q\u0000~\u0000\u000epsq\u0000~\u0000\u0015q\u0000~\u0000\u000epq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000(net.sourceforge.cz"
+"t.z.jaxb.gen.OutStrokeq\u0000~\u0000#sq\u0000~\u0000\tq\u0000~\u0000\u000ep\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0012q\u0000~\u0000\u000ep"
+"sq\u0000~\u0000\u0015q\u0000~\u0000\u000epq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000\'net.sourceforge.czt.z.ja"
+"xb.gen.InStrokeq\u0000~\u0000#sq\u0000~\u0000\tq\u0000~\u0000\u000ep\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0012q\u0000~\u0000\u000epsq\u0000~\u0000\u0015q"
+"\u0000~\u0000\u000epq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000)net.sourceforge.czt.z.jaxb.gen."
+"NextStrokeq\u0000~\u0000#sq\u0000~\u0000\tq\u0000~\u0000\u000ep\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0012q\u0000~\u0000\u000epsq\u0000~\u0000\u0015q\u0000~\u0000\u000ep"
+"q\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000/net.sourceforge.czt.z.jaxb.gen.NumSt"
+"rokeElementq\u0000~\u0000#q\u0000~\u0000\u001esr\u0000\"com.sun.msv.grammar.ExpressionPool\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/ExpressionPool$"
+"ClosedHash;xpsr\u0000-com.sun.msv.grammar.ExpressionPool$ClosedHa"
+"sh\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstreamVersionL\u0000\u0006parentt\u0000$Lcom/sun/ms"
+"v/grammar/ExpressionPool;xp\u0000\u0000\u0000\u0016\u0001pq\u0000~\u0000\u0011q\u0000~\u0000\u0006q\u0000~\u0000Rq\u0000~\u0000Xq\u0000~\u0000^q\u0000"
+"~\u0000dq\u0000~\u0000Nq\u0000~\u0000Oq\u0000~\u0000@q\u0000~\u0000$q\u0000~\u0000Hq\u0000~\u0000\u0014q\u0000~\u0000Sq\u0000~\u0000Yq\u0000~\u0000_q\u0000~\u0000eq\u0000~\u0000\u000fq\u0000"
+"~\u0000Lq\u0000~\u0000\u0005q\u0000~\u0000\bq\u0000~\u0000Pq\u0000~\u0000Mx"));
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
                    case  5 :
                        if (("OutStroke" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _getStroke().add(((net.sourceforge.czt.z.jaxb.gen.impl.OutStrokeImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.OutStrokeImpl.class), 5, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("InStroke" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _getStroke().add(((net.sourceforge.czt.z.jaxb.gen.impl.InStrokeImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.InStrokeImpl.class), 5, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("NextStroke" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _getStroke().add(((net.sourceforge.czt.z.jaxb.gen.impl.NextStrokeImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.NextStrokeImpl.class), 5, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("NumStroke" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _getStroke().add(((net.sourceforge.czt.z.jaxb.gen.impl.NumStrokeElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.NumStrokeElementImpl.class), 5, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("Stroke" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 6;
                            return ;
                        }
                        if (("Stroke" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _getStroke().add(((net.sourceforge.czt.z.jaxb.gen.impl.StrokeElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.StrokeElementImpl.class), 5, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  1 :
                        if (("Word" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 2;
                            return ;
                        }
                        break;
                    case  0 :
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.TermAImpl)net.sourceforge.czt.z.jaxb.gen.impl.NameImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.TermAImpl)net.sourceforge.czt.z.jaxb.gen.impl.NameImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname, __atts);
                        return ;
                    case  6 :
                        _getStroke().add(((net.sourceforge.czt.z.jaxb.gen.impl.StrokeImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.StrokeImpl.class), 7, ___uri, ___local, ___qname, __atts)));
                        return ;
                    case  4 :
                        if (("OutStroke" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _getStroke().add(((net.sourceforge.czt.z.jaxb.gen.impl.OutStrokeImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.OutStrokeImpl.class), 5, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("InStroke" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _getStroke().add(((net.sourceforge.czt.z.jaxb.gen.impl.InStrokeImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.InStrokeImpl.class), 5, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("NextStroke" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _getStroke().add(((net.sourceforge.czt.z.jaxb.gen.impl.NextStrokeImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.NextStrokeImpl.class), 5, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("NumStroke" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _getStroke().add(((net.sourceforge.czt.z.jaxb.gen.impl.NumStrokeElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.NumStrokeElementImpl.class), 5, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("Stroke" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 6;
                            return ;
                        }
                        if (("Stroke" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _getStroke().add(((net.sourceforge.czt.z.jaxb.gen.impl.StrokeElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.StrokeElementImpl.class), 5, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        state = 5;
                        continue outer;
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
                    case  5 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  3 :
                        if (("Word" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.popAttributes();
                            state = 4;
                            return ;
                        }
                        break;
                    case  0 :
                        spawnHandlerFromLeaveElement((((net.sourceforge.czt.z.jaxb.gen.impl.TermAImpl)net.sourceforge.czt.z.jaxb.gen.impl.NameImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
                        return ;
                    case  6 :
                        _getStroke().add(((net.sourceforge.czt.z.jaxb.gen.impl.StrokeImpl) spawnChildFromLeaveElement((net.sourceforge.czt.z.jaxb.gen.impl.StrokeImpl.class), 7, ___uri, ___local, ___qname)));
                        return ;
                    case  4 :
                        state = 5;
                        continue outer;
                    case  7 :
                        if (("Stroke" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.popAttributes();
                            state = 5;
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
                    case  5 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  0 :
                        spawnHandlerFromEnterAttribute((((net.sourceforge.czt.z.jaxb.gen.impl.TermAImpl)net.sourceforge.czt.z.jaxb.gen.impl.NameImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
                        return ;
                    case  6 :
                        _getStroke().add(((net.sourceforge.czt.z.jaxb.gen.impl.StrokeImpl) spawnChildFromEnterAttribute((net.sourceforge.czt.z.jaxb.gen.impl.StrokeImpl.class), 7, ___uri, ___local, ___qname)));
                        return ;
                    case  4 :
                        state = 5;
                        continue outer;
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
                    case  5 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  0 :
                        spawnHandlerFromLeaveAttribute((((net.sourceforge.czt.z.jaxb.gen.impl.TermAImpl)net.sourceforge.czt.z.jaxb.gen.impl.NameImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
                        return ;
                    case  6 :
                        _getStroke().add(((net.sourceforge.czt.z.jaxb.gen.impl.StrokeImpl) spawnChildFromLeaveAttribute((net.sourceforge.czt.z.jaxb.gen.impl.StrokeImpl.class), 7, ___uri, ___local, ___qname)));
                        return ;
                    case  4 :
                        state = 5;
                        continue outer;
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
                        case  5 :
                            revertToParentFromText(value);
                            return ;
                        case  2 :
                            eatText1(value);
                            state = 3;
                            return ;
                        case  0 :
                            spawnHandlerFromText((((net.sourceforge.czt.z.jaxb.gen.impl.TermAImpl)net.sourceforge.czt.z.jaxb.gen.impl.NameImpl.this).new Unmarshaller(context)), 1, value);
                            return ;
                        case  6 :
                            _getStroke().add(((net.sourceforge.czt.z.jaxb.gen.impl.StrokeImpl) spawnChildFromText((net.sourceforge.czt.z.jaxb.gen.impl.StrokeImpl.class), 7, value)));
                            return ;
                        case  4 :
                            state = 5;
                            continue outer;
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
