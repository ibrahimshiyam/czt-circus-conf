//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.5-b16-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.06.26 at 02:10:37 PM NZST 
//


package net.sourceforge.czt.oz.jaxb.gen.impl;

public class ClassSigImpl
    extends net.sourceforge.czt.z.jaxb.gen.impl.TermImpl
    implements net.sourceforge.czt.oz.jaxb.gen.ClassSig, com.sun.xml.bind.JAXBObject, net.sourceforge.czt.circus.jaxb.gen.impl.runtime.UnmarshallableObject, net.sourceforge.czt.circus.jaxb.gen.impl.runtime.XMLSerializable, net.sourceforge.czt.circus.jaxb.gen.impl.runtime.ValidatableObject
{

    protected com.sun.xml.bind.util.ListImpl _Operation;
    protected com.sun.xml.bind.util.ListImpl _Attribute;
    protected net.sourceforge.czt.z.jaxb.gen.Signature _State;
    protected com.sun.xml.bind.util.ListImpl _Classes;
    public final static java.lang.Class version = (net.sourceforge.czt.oz.jaxb.gen.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (net.sourceforge.czt.oz.jaxb.gen.ClassSig.class);
    }

    protected com.sun.xml.bind.util.ListImpl _getOperation() {
        if (_Operation == null) {
            _Operation = new com.sun.xml.bind.util.ListImpl(new java.util.ArrayList());
        }
        return _Operation;
    }

    public java.util.List getOperation() {
        return _getOperation();
    }

    protected com.sun.xml.bind.util.ListImpl _getAttribute() {
        if (_Attribute == null) {
            _Attribute = new com.sun.xml.bind.util.ListImpl(new java.util.ArrayList());
        }
        return _Attribute;
    }

    public java.util.List getAttribute() {
        return _getAttribute();
    }

    public net.sourceforge.czt.z.jaxb.gen.Signature getState() {
        return _State;
    }

    public void setState(net.sourceforge.czt.z.jaxb.gen.Signature value) {
        _State = value;
    }

    protected com.sun.xml.bind.util.ListImpl _getClasses() {
        if (_Classes == null) {
            _Classes = new com.sun.xml.bind.util.ListImpl(new java.util.ArrayList());
        }
        return _Classes;
    }

    public java.util.List getClasses() {
        return _getClasses();
    }

    public net.sourceforge.czt.circus.jaxb.gen.impl.runtime.UnmarshallingEventHandler createUnmarshaller(net.sourceforge.czt.circus.jaxb.gen.impl.runtime.UnmarshallingContext context) {
        return new net.sourceforge.czt.oz.jaxb.gen.impl.ClassSigImpl.Unmarshaller(context);
    }

    public void serializeBody(net.sourceforge.czt.circus.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = ((_Operation == null)? 0 :_Operation.size());
        int idx2 = 0;
        final int len2 = ((_Attribute == null)? 0 :_Attribute.size());
        int idx4 = 0;
        final int len4 = ((_Classes == null)? 0 :_Classes.size());
        super.serializeBody(context);
        while (idx4 != len4) {
            context.startElement("http://czt.sourceforge.net/object-z", "Classes");
            int idx_0 = idx4;
            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Classes.get(idx_0 ++)), "Classes");
            context.endNamespaceDecls();
            int idx_1 = idx4;
            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Classes.get(idx_1 ++)), "Classes");
            context.endAttributes();
            context.childAsBody(((com.sun.xml.bind.JAXBObject) _Classes.get(idx4 ++)), "Classes");
            context.endElement();
        }
        if (_State!= null) {
            context.startElement("http://czt.sourceforge.net/object-z", "State");
            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _State), "State");
            context.endNamespaceDecls();
            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _State), "State");
            context.endAttributes();
            context.childAsBody(((com.sun.xml.bind.JAXBObject) _State), "State");
            context.endElement();
        }
        while (idx2 != len2) {
            context.startElement("http://czt.sourceforge.net/object-z", "Attribute");
            int idx_4 = idx2;
            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Attribute.get(idx_4 ++)), "Attribute");
            context.endNamespaceDecls();
            int idx_5 = idx2;
            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Attribute.get(idx_5 ++)), "Attribute");
            context.endAttributes();
            context.childAsBody(((com.sun.xml.bind.JAXBObject) _Attribute.get(idx2 ++)), "Attribute");
            context.endElement();
        }
        while (idx1 != len1) {
            context.startElement("http://czt.sourceforge.net/object-z", "Operation");
            int idx_6 = idx1;
            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Operation.get(idx_6 ++)), "Operation");
            context.endNamespaceDecls();
            int idx_7 = idx1;
            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Operation.get(idx_7 ++)), "Operation");
            context.endAttributes();
            context.childAsBody(((com.sun.xml.bind.JAXBObject) _Operation.get(idx1 ++)), "Operation");
            context.endElement();
        }
    }

    public void serializeAttributes(net.sourceforge.czt.circus.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = ((_Operation == null)? 0 :_Operation.size());
        int idx2 = 0;
        final int len2 = ((_Attribute == null)? 0 :_Attribute.size());
        int idx4 = 0;
        final int len4 = ((_Classes == null)? 0 :_Classes.size());
        super.serializeAttributes(context);
        while (idx4 != len4) {
            idx4 += 1;
        }
        while (idx2 != len2) {
            idx2 += 1;
        }
        while (idx1 != len1) {
            idx1 += 1;
        }
    }

    public void serializeURIs(net.sourceforge.czt.circus.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = ((_Operation == null)? 0 :_Operation.size());
        int idx2 = 0;
        final int len2 = ((_Attribute == null)? 0 :_Attribute.size());
        int idx4 = 0;
        final int len4 = ((_Classes == null)? 0 :_Classes.size());
        super.serializeURIs(context);
        while (idx4 != len4) {
            idx4 += 1;
        }
        while (idx2 != len2) {
            idx2 += 1;
        }
        while (idx1 != len1) {
            idx1 += 1;
        }
    }

    public java.lang.Class getPrimaryInterface() {
        return (net.sourceforge.czt.oz.jaxb.gen.ClassSig.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000b"
+"expandedExpq\u0000~\u0000\u0002xpppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsr\u0000\u001dcom.sun.msv."
+"grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001ppsr\u0000\'com.sun.msv.grammar."
+"trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClasst\u0000\u001fLcom/sun/msv/gr"
+"ammar/NameClass;xr\u0000\u001ecom.sun.msv.grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000"
+"\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000\fcontentModelq\u0000~\u0000\u0002xq\u0000~\u0000\u0003sr\u0000\u0011"
+"java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000p\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u000bpp\u0000sq"
+"\u0000~\u0000\tppsr\u0000 com.sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom"
+".sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0002xq\u0000~\u0000\u0003q\u0000~\u0000\u0010ps"
+"r\u0000 com.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\t"
+"nameClassq\u0000~\u0000\fxq\u0000~\u0000\u0003q\u0000~\u0000\u0010psr\u00002com.sun.msv.grammar.Expression"
+"$AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003sq\u0000~\u0000\u000f\u0001q\u0000~\u0000\u001asr\u0000 com.sun"
+".msv.grammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar."
+"NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$Eps"
+"ilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000\u001bq\u0000~\u0000 sr\u0000#com.sun.msv.gra"
+"mmar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/Str"
+"ing;L\u0000\fnamespaceURIq\u0000~\u0000\"xq\u0000~\u0000\u001dt\u0000,net.sourceforge.czt.z.jaxb."
+"gen.Term.AnnsTypet\u0000+http://java.sun.com/jaxb/xjc/dummy-eleme"
+"ntssq\u0000~\u0000\tppsq\u0000~\u0000\u0017q\u0000~\u0000\u0010psr\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000"
+"\u0004namet\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~\u0000\u0003ppsr\u0000\"com.sun.msv"
+".datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.x"
+"sd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd."
+"ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.xsd.XSDataty"
+"peImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000\"L\u0000\btypeNameq\u0000~\u0000\"L\u0000\nwhit"
+"eSpacet\u0000.Lcom/sun/msv/datatype/xsd/WhiteSpaceProcessor;xpt\u0000 "
+"http://www.w3.org/2001/XMLSchemat\u0000\u0005QNamesr\u00005com.sun.msv.data"
+"type.xsd.WhiteSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun."
+"msv.datatype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun"
+".msv.grammar.Expression$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000"
+"~\u0000\u0010psr\u0000\u001bcom.sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000"
+"~\u0000\"L\u0000\fnamespaceURIq\u0000~\u0000\"xpq\u0000~\u00003q\u0000~\u00002sq\u0000~\u0000!t\u0000\u0004typet\u0000)http://ww"
+"w.w3.org/2001/XMLSchema-instanceq\u0000~\u0000 sq\u0000~\u0000!t\u0000\u0004Annst\u0000\u001ehttp://"
+"czt.sourceforge.net/zmlq\u0000~\u0000 sq\u0000~\u0000\tppsq\u0000~\u0000\u0014q\u0000~\u0000\u0010psq\u0000~\u0000\u000bq\u0000~\u0000\u0010p"
+"\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u000bpp\u0000sq\u0000~\u0000\tppsq\u0000~\u0000\u0014q\u0000~\u0000\u0010psq\u0000~\u0000\u0017q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001e"
+"q\u0000~\u0000 sq\u0000~\u0000!t\u0000(net.sourceforge.czt.oz.jaxb.gen.ClassRefq\u0000~\u0000%s"
+"q\u0000~\u0000\tppsq\u0000~\u0000\u0017q\u0000~\u0000\u0010pq\u0000~\u0000+q\u0000~\u0000;q\u0000~\u0000 sq\u0000~\u0000!t\u0000\u0007Classest\u0000#http://"
+"czt.sourceforge.net/object-zq\u0000~\u0000 sq\u0000~\u0000\tppsq\u0000~\u0000\u000bq\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\u0000"
+"ppsq\u0000~\u0000\u000bpp\u0000sq\u0000~\u0000\tppsq\u0000~\u0000\u0014q\u0000~\u0000\u0010psq\u0000~\u0000\u0017q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq"
+"\u0000~\u0000!t\u0000(net.sourceforge.czt.z.jaxb.gen.Signatureq\u0000~\u0000%sq\u0000~\u0000\tpp"
+"sq\u0000~\u0000\u0017q\u0000~\u0000\u0010pq\u0000~\u0000+q\u0000~\u0000;q\u0000~\u0000 sq\u0000~\u0000!t\u0000\u0005Stateq\u0000~\u0000Oq\u0000~\u0000 sq\u0000~\u0000\tpps"
+"q\u0000~\u0000\u0014q\u0000~\u0000\u0010psq\u0000~\u0000\u000bq\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u000bpp\u0000sq\u0000~\u0000\tppsq\u0000~\u0000\u0014q\u0000~\u0000\u0010"
+"psq\u0000~\u0000\u0017q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000+net.sourceforge.czt.z.j"
+"axb.gen.NameTypePairq\u0000~\u0000%sq\u0000~\u0000\tppsq\u0000~\u0000\u0017q\u0000~\u0000\u0010pq\u0000~\u0000+q\u0000~\u0000;q\u0000~\u0000 "
+"sq\u0000~\u0000!t\u0000\tAttributeq\u0000~\u0000Oq\u0000~\u0000 sq\u0000~\u0000\tppsq\u0000~\u0000\u0014q\u0000~\u0000\u0010psq\u0000~\u0000\u000bq\u0000~\u0000\u0010p"
+"\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u000bpp\u0000sq\u0000~\u0000\tppsq\u0000~\u0000\u0014q\u0000~\u0000\u0010psq\u0000~\u0000\u0017q\u0000~\u0000\u0010pq\u0000~\u0000\u001aq\u0000~\u0000\u001e"
+"q\u0000~\u0000 sq\u0000~\u0000!t\u00001net.sourceforge.czt.oz.jaxb.gen.NameSignatureP"
+"airq\u0000~\u0000%sq\u0000~\u0000\tppsq\u0000~\u0000\u0017q\u0000~\u0000\u0010pq\u0000~\u0000+q\u0000~\u0000;q\u0000~\u0000 sq\u0000~\u0000!t\u0000\tOperatio"
+"nq\u0000~\u0000Oq\u0000~\u0000 sr\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001"
+"L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/ExpressionPool$ClosedHash"
+";xpsr\u0000-com.sun.msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c"
+"\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstreamVersionL\u0000\u0006parentt\u0000$Lcom/sun/msv/grammar/"
+"ExpressionPool;xp\u0000\u0000\u0000 \u0001pq\u0000~\u0000\u0016q\u0000~\u0000Gq\u0000~\u0000Uq\u0000~\u0000cq\u0000~\u0000qq\u0000~\u0000Bq\u0000~\u0000^q\u0000"
+"~\u0000&q\u0000~\u0000Kq\u0000~\u0000Yq\u0000~\u0000gq\u0000~\u0000uq\u0000~\u0000lq\u0000~\u0000\u0006q\u0000~\u0000Aq\u0000~\u0000]q\u0000~\u0000kq\u0000~\u0000\u0011q\u0000~\u0000Dq\u0000"
+"~\u0000Rq\u0000~\u0000`q\u0000~\u0000\nq\u0000~\u0000Pq\u0000~\u0000nq\u0000~\u0000\u0013q\u0000~\u0000Fq\u0000~\u0000Tq\u0000~\u0000\bq\u0000~\u0000bq\u0000~\u0000pq\u0000~\u0000\u0007q\u0000"
+"~\u0000\u0005x"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends net.sourceforge.czt.circus.jaxb.gen.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(net.sourceforge.czt.circus.jaxb.gen.impl.runtime.UnmarshallingContext context) {
            super(context, "--------------");
        }

        protected Unmarshaller(net.sourceforge.czt.circus.jaxb.gen.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return net.sourceforge.czt.oz.jaxb.gen.impl.ClassSigImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  10 :
                        if (("Attribute" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 8;
                            return ;
                        }
                        if (("Operation" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 11;
                            return ;
                        }
                        state = 13;
                        continue outer;
                    case  5 :
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _State = ((net.sourceforge.czt.z.jaxb.gen.impl.SignatureImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.SignatureImpl.class), 6, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("NameTypePair" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _State = ((net.sourceforge.czt.z.jaxb.gen.impl.SignatureImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.SignatureImpl.class), 6, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("NameTypePair" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _State = ((net.sourceforge.czt.z.jaxb.gen.impl.SignatureImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.SignatureImpl.class), 6, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        _State = ((net.sourceforge.czt.z.jaxb.gen.impl.SignatureImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.SignatureImpl.class), 6, ___uri, ___local, ___qname, __atts));
                        return ;
                    case  13 :
                        if (("Operation" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 11;
                            return ;
                        }
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  7 :
                        if (("Attribute" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 8;
                            return ;
                        }
                        state = 10;
                        continue outer;
                    case  0 :
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.TermImpl)net.sourceforge.czt.oz.jaxb.gen.impl.ClassSigImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.TermImpl)net.sourceforge.czt.oz.jaxb.gen.impl.ClassSigImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname, __atts);
                        return ;
                    case  11 :
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _getOperation().add(((net.sourceforge.czt.oz.jaxb.gen.impl.NameSignaturePairImpl) spawnChildFromEnterElement((net.sourceforge.czt.oz.jaxb.gen.impl.NameSignaturePairImpl.class), 12, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("ZDeclName" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _getOperation().add(((net.sourceforge.czt.oz.jaxb.gen.impl.NameSignaturePairImpl) spawnChildFromEnterElement((net.sourceforge.czt.oz.jaxb.gen.impl.NameSignaturePairImpl.class), 12, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("JokerDeclName" == ___local)&&("http://czt.sourceforge.net/zpatt" == ___uri)) {
                            _getOperation().add(((net.sourceforge.czt.oz.jaxb.gen.impl.NameSignaturePairImpl) spawnChildFromEnterElement((net.sourceforge.czt.oz.jaxb.gen.impl.NameSignaturePairImpl.class), 12, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("DeclName" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _getOperation().add(((net.sourceforge.czt.oz.jaxb.gen.impl.NameSignaturePairImpl) spawnChildFromEnterElement((net.sourceforge.czt.oz.jaxb.gen.impl.NameSignaturePairImpl.class), 12, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("DeclName" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _getOperation().add(((net.sourceforge.czt.oz.jaxb.gen.impl.NameSignaturePairImpl) spawnChildFromEnterElement((net.sourceforge.czt.oz.jaxb.gen.impl.NameSignaturePairImpl.class), 12, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("Signature" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _getOperation().add(((net.sourceforge.czt.oz.jaxb.gen.impl.NameSignaturePairImpl) spawnChildFromEnterElement((net.sourceforge.czt.oz.jaxb.gen.impl.NameSignaturePairImpl.class), 12, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("Signature" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _getOperation().add(((net.sourceforge.czt.oz.jaxb.gen.impl.NameSignaturePairImpl) spawnChildFromEnterElement((net.sourceforge.czt.oz.jaxb.gen.impl.NameSignaturePairImpl.class), 12, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        _getOperation().add(((net.sourceforge.czt.oz.jaxb.gen.impl.NameSignaturePairImpl) spawnChildFromEnterElement((net.sourceforge.czt.oz.jaxb.gen.impl.NameSignaturePairImpl.class), 12, ___uri, ___local, ___qname, __atts)));
                        return ;
                    case  2 :
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _getClasses().add(((net.sourceforge.czt.oz.jaxb.gen.impl.ClassRefImpl) spawnChildFromEnterElement((net.sourceforge.czt.oz.jaxb.gen.impl.ClassRefImpl.class), 3, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("JokerRefName" == ___local)&&("http://czt.sourceforge.net/zpatt" == ___uri)) {
                            _getClasses().add(((net.sourceforge.czt.oz.jaxb.gen.impl.ClassRefImpl) spawnChildFromEnterElement((net.sourceforge.czt.oz.jaxb.gen.impl.ClassRefImpl.class), 3, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("ZRefName" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _getClasses().add(((net.sourceforge.czt.oz.jaxb.gen.impl.ClassRefImpl) spawnChildFromEnterElement((net.sourceforge.czt.oz.jaxb.gen.impl.ClassRefImpl.class), 3, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("RefName" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _getClasses().add(((net.sourceforge.czt.oz.jaxb.gen.impl.ClassRefImpl) spawnChildFromEnterElement((net.sourceforge.czt.oz.jaxb.gen.impl.ClassRefImpl.class), 3, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("RefName" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _getClasses().add(((net.sourceforge.czt.oz.jaxb.gen.impl.ClassRefImpl) spawnChildFromEnterElement((net.sourceforge.czt.oz.jaxb.gen.impl.ClassRefImpl.class), 3, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        _getClasses().add(((net.sourceforge.czt.oz.jaxb.gen.impl.ClassRefImpl) spawnChildFromEnterElement((net.sourceforge.czt.oz.jaxb.gen.impl.ClassRefImpl.class), 3, ___uri, ___local, ___qname, __atts)));
                        return ;
                    case  8 :
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _getAttribute().add(((net.sourceforge.czt.z.jaxb.gen.impl.NameTypePairImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.NameTypePairImpl.class), 9, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("ZDeclName" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _getAttribute().add(((net.sourceforge.czt.z.jaxb.gen.impl.NameTypePairImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.NameTypePairImpl.class), 9, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("JokerDeclName" == ___local)&&("http://czt.sourceforge.net/zpatt" == ___uri)) {
                            _getAttribute().add(((net.sourceforge.czt.z.jaxb.gen.impl.NameTypePairImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.NameTypePairImpl.class), 9, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("DeclName" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _getAttribute().add(((net.sourceforge.czt.z.jaxb.gen.impl.NameTypePairImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.NameTypePairImpl.class), 9, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("DeclName" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _getAttribute().add(((net.sourceforge.czt.z.jaxb.gen.impl.NameTypePairImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.NameTypePairImpl.class), 9, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        _getAttribute().add(((net.sourceforge.czt.z.jaxb.gen.impl.NameTypePairImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.NameTypePairImpl.class), 9, ___uri, ___local, ___qname, __atts)));
                        return ;
                    case  1 :
                        if (("Classes" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 2;
                            return ;
                        }
                        state = 4;
                        continue outer;
                    case  4 :
                        if (("Classes" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 2;
                            return ;
                        }
                        if (("State" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 5;
                            return ;
                        }
                        state = 7;
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
                    case  10 :
                        state = 13;
                        continue outer;
                    case  5 :
                        _State = ((net.sourceforge.czt.z.jaxb.gen.impl.SignatureImpl) spawnChildFromLeaveElement((net.sourceforge.czt.z.jaxb.gen.impl.SignatureImpl.class), 6, ___uri, ___local, ___qname));
                        return ;
                    case  12 :
                        if (("Operation" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            context.popAttributes();
                            state = 13;
                            return ;
                        }
                        break;
                    case  13 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  7 :
                        state = 10;
                        continue outer;
                    case  0 :
                        spawnHandlerFromLeaveElement((((net.sourceforge.czt.z.jaxb.gen.impl.TermImpl)net.sourceforge.czt.oz.jaxb.gen.impl.ClassSigImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
                        return ;
                    case  9 :
                        if (("Attribute" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            context.popAttributes();
                            state = 10;
                            return ;
                        }
                        break;
                    case  11 :
                        _getOperation().add(((net.sourceforge.czt.oz.jaxb.gen.impl.NameSignaturePairImpl) spawnChildFromLeaveElement((net.sourceforge.czt.oz.jaxb.gen.impl.NameSignaturePairImpl.class), 12, ___uri, ___local, ___qname)));
                        return ;
                    case  2 :
                        _getClasses().add(((net.sourceforge.czt.oz.jaxb.gen.impl.ClassRefImpl) spawnChildFromLeaveElement((net.sourceforge.czt.oz.jaxb.gen.impl.ClassRefImpl.class), 3, ___uri, ___local, ___qname)));
                        return ;
                    case  6 :
                        if (("State" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            context.popAttributes();
                            state = 7;
                            return ;
                        }
                        break;
                    case  8 :
                        _getAttribute().add(((net.sourceforge.czt.z.jaxb.gen.impl.NameTypePairImpl) spawnChildFromLeaveElement((net.sourceforge.czt.z.jaxb.gen.impl.NameTypePairImpl.class), 9, ___uri, ___local, ___qname)));
                        return ;
                    case  3 :
                        if (("Classes" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            context.popAttributes();
                            state = 4;
                            return ;
                        }
                        break;
                    case  1 :
                        state = 4;
                        continue outer;
                    case  4 :
                        state = 7;
                        continue outer;
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
                    case  10 :
                        state = 13;
                        continue outer;
                    case  5 :
                        _State = ((net.sourceforge.czt.z.jaxb.gen.impl.SignatureImpl) spawnChildFromEnterAttribute((net.sourceforge.czt.z.jaxb.gen.impl.SignatureImpl.class), 6, ___uri, ___local, ___qname));
                        return ;
                    case  13 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  7 :
                        state = 10;
                        continue outer;
                    case  0 :
                        spawnHandlerFromEnterAttribute((((net.sourceforge.czt.z.jaxb.gen.impl.TermImpl)net.sourceforge.czt.oz.jaxb.gen.impl.ClassSigImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
                        return ;
                    case  11 :
                        _getOperation().add(((net.sourceforge.czt.oz.jaxb.gen.impl.NameSignaturePairImpl) spawnChildFromEnterAttribute((net.sourceforge.czt.oz.jaxb.gen.impl.NameSignaturePairImpl.class), 12, ___uri, ___local, ___qname)));
                        return ;
                    case  2 :
                        _getClasses().add(((net.sourceforge.czt.oz.jaxb.gen.impl.ClassRefImpl) spawnChildFromEnterAttribute((net.sourceforge.czt.oz.jaxb.gen.impl.ClassRefImpl.class), 3, ___uri, ___local, ___qname)));
                        return ;
                    case  8 :
                        _getAttribute().add(((net.sourceforge.czt.z.jaxb.gen.impl.NameTypePairImpl) spawnChildFromEnterAttribute((net.sourceforge.czt.z.jaxb.gen.impl.NameTypePairImpl.class), 9, ___uri, ___local, ___qname)));
                        return ;
                    case  1 :
                        state = 4;
                        continue outer;
                    case  4 :
                        state = 7;
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
                    case  10 :
                        state = 13;
                        continue outer;
                    case  5 :
                        _State = ((net.sourceforge.czt.z.jaxb.gen.impl.SignatureImpl) spawnChildFromLeaveAttribute((net.sourceforge.czt.z.jaxb.gen.impl.SignatureImpl.class), 6, ___uri, ___local, ___qname));
                        return ;
                    case  13 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  7 :
                        state = 10;
                        continue outer;
                    case  0 :
                        spawnHandlerFromLeaveAttribute((((net.sourceforge.czt.z.jaxb.gen.impl.TermImpl)net.sourceforge.czt.oz.jaxb.gen.impl.ClassSigImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
                        return ;
                    case  11 :
                        _getOperation().add(((net.sourceforge.czt.oz.jaxb.gen.impl.NameSignaturePairImpl) spawnChildFromLeaveAttribute((net.sourceforge.czt.oz.jaxb.gen.impl.NameSignaturePairImpl.class), 12, ___uri, ___local, ___qname)));
                        return ;
                    case  2 :
                        _getClasses().add(((net.sourceforge.czt.oz.jaxb.gen.impl.ClassRefImpl) spawnChildFromLeaveAttribute((net.sourceforge.czt.oz.jaxb.gen.impl.ClassRefImpl.class), 3, ___uri, ___local, ___qname)));
                        return ;
                    case  8 :
                        _getAttribute().add(((net.sourceforge.czt.z.jaxb.gen.impl.NameTypePairImpl) spawnChildFromLeaveAttribute((net.sourceforge.czt.z.jaxb.gen.impl.NameTypePairImpl.class), 9, ___uri, ___local, ___qname)));
                        return ;
                    case  1 :
                        state = 4;
                        continue outer;
                    case  4 :
                        state = 7;
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
                        case  10 :
                            state = 13;
                            continue outer;
                        case  5 :
                            _State = ((net.sourceforge.czt.z.jaxb.gen.impl.SignatureImpl) spawnChildFromText((net.sourceforge.czt.z.jaxb.gen.impl.SignatureImpl.class), 6, value));
                            return ;
                        case  13 :
                            revertToParentFromText(value);
                            return ;
                        case  7 :
                            state = 10;
                            continue outer;
                        case  0 :
                            spawnHandlerFromText((((net.sourceforge.czt.z.jaxb.gen.impl.TermImpl)net.sourceforge.czt.oz.jaxb.gen.impl.ClassSigImpl.this).new Unmarshaller(context)), 1, value);
                            return ;
                        case  11 :
                            _getOperation().add(((net.sourceforge.czt.oz.jaxb.gen.impl.NameSignaturePairImpl) spawnChildFromText((net.sourceforge.czt.oz.jaxb.gen.impl.NameSignaturePairImpl.class), 12, value)));
                            return ;
                        case  2 :
                            _getClasses().add(((net.sourceforge.czt.oz.jaxb.gen.impl.ClassRefImpl) spawnChildFromText((net.sourceforge.czt.oz.jaxb.gen.impl.ClassRefImpl.class), 3, value)));
                            return ;
                        case  8 :
                            _getAttribute().add(((net.sourceforge.czt.z.jaxb.gen.impl.NameTypePairImpl) spawnChildFromText((net.sourceforge.czt.z.jaxb.gen.impl.NameTypePairImpl.class), 9, value)));
                            return ;
                        case  1 :
                            state = 4;
                            continue outer;
                        case  4 :
                            state = 7;
                            continue outer;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

    }

}
