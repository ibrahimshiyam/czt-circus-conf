//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2005.02.14 at 08:40:58 GMT 
//


package net.sourceforge.czt.z.jaxb.gen.impl;

public class NameTypePairImpl implements net.sourceforge.czt.z.jaxb.gen.NameTypePair, com.sun.xml.bind.JAXBObject, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallableObject, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializable, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.ValidatableObject
{

    protected net.sourceforge.czt.z.jaxb.gen.Type _Type;
    protected net.sourceforge.czt.z.jaxb.gen.DeclName _Name;
    public final static java.lang.Class version = (net.sourceforge.czt.z.jaxb.gen.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (net.sourceforge.czt.z.jaxb.gen.NameTypePair.class);
    }

    public net.sourceforge.czt.z.jaxb.gen.Type getType() {
        return _Type;
    }

    public void setType(net.sourceforge.czt.z.jaxb.gen.Type value) {
        _Type = value;
    }

    public net.sourceforge.czt.z.jaxb.gen.DeclName getName() {
        return _Name;
    }

    public void setName(net.sourceforge.czt.z.jaxb.gen.DeclName value) {
        _Name = value;
    }

    public net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingEventHandler createUnmarshaller(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingContext context) {
        return new net.sourceforge.czt.z.jaxb.gen.impl.NameTypePairImpl.Unmarshaller(context);
    }

    public void serializeBody(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("http://czt.sourceforge.net/zml", "Name");
        context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Name), "Name");
        context.endNamespaceDecls();
        context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Name), "Name");
        context.endAttributes();
        context.childAsBody(((com.sun.xml.bind.JAXBObject) _Name), "Name");
        context.endElement();
        if (_Type instanceof javax.xml.bind.Element) {
            context.childAsBody(((com.sun.xml.bind.JAXBObject) _Type), "Type");
        } else {
            context.startElement("http://czt.sourceforge.net/zml", "Type");
            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Type), "Type");
            context.endNamespaceDecls();
            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Type), "Type");
            context.endAttributes();
            context.childAsBody(((com.sun.xml.bind.JAXBObject) _Type), "Type");
            context.endElement();
        }
    }

    public void serializeAttributes(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        if (_Type instanceof javax.xml.bind.Element) {
            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Type), "Type");
        }
    }

    public void serializeURIs(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        if (_Type instanceof javax.xml.bind.Element) {
            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Type), "Type");
        }
    }

    public java.lang.Class getPrimaryInterface() {
        return (net.sourceforge.czt.z.jaxb.gen.NameTypePair.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000b"
+"expandedExpq\u0000~\u0000\u0002xpppsr\u0000\'com.sun.msv.grammar.trex.ElementPatt"
+"ern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;"
+"xr\u0000\u001ecom.sun.msv.grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndecl"
+"aredAttributesL\u0000\fcontentModelq\u0000~\u0000\u0002xq\u0000~\u0000\u0003pp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0006pp\u0000"
+"sr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001ppsr\u0000 com."
+"sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.gramm"
+"ar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0002xq\u0000~\u0000\u0003sr\u0000\u0011java.lang.Boolean"
+"\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psr\u0000 com.sun.msv.grammar.AttributeExp\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClassq\u0000~\u0000\u0007xq\u0000~\u0000\u0003q\u0000~\u0000\u0012psr\u00002com.su"
+"n.msv.grammar.Expression$AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000"
+"\u0003sq\u0000~\u0000\u0011\u0001q\u0000~\u0000\u0016sr\u0000 com.sun.msv.grammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000"
+"xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.ms"
+"v.grammar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000\u0017"
+"q\u0000~\u0000\u001csr\u0000#com.sun.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlo"
+"calNamet\u0000\u0012Ljava/lang/String;L\u0000\fnamespaceURIq\u0000~\u0000\u001exq\u0000~\u0000\u0019t\u0000\'net"
+".sourceforge.czt.z.jaxb.gen.DeclNamet\u0000+http://java.sun.com/j"
+"axb/xjc/dummy-elementssq\u0000~\u0000\fppsq\u0000~\u0000\u0013q\u0000~\u0000\u0012psr\u0000\u001bcom.sun.msv.gr"
+"ammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Dataty"
+"pe;L\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~"
+"\u0000\u0003ppsr\u0000\"com.sun.msv.datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com"
+".sun.msv.datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.su"
+"n.msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.da"
+"tatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000\u001eL\u0000\bt"
+"ypeNameq\u0000~\u0000\u001eL\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/datatype/xsd/WhiteS"
+"paceProcessor;xpt\u0000 http://www.w3.org/2001/XMLSchemat\u0000\u0005QNames"
+"r\u00005com.sun.msv.datatype.xsd.WhiteSpaceProcessor$Collapse\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$NullSetExpression"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000\u0012psr\u0000\u001bcom.sun.msv.util.StringPair\u00d0t\u001ejB\u008f"
+"\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u001eL\u0000\fnamespaceURIq\u0000~\u0000\u001expq\u0000~\u0000/q\u0000~\u0000.sq\u0000~\u0000\u001d"
+"t\u0000\u0004typet\u0000)http://www.w3.org/2001/XMLSchema-instanceq\u0000~\u0000\u001csq\u0000~"
+"\u0000\u001dt\u0000\u0004Namet\u0000\u001ehttp://czt.sourceforge.net/zmlsq\u0000~\u0000\fppsq\u0000~\u0000\fppsq"
+"\u0000~\u0000\fppsq\u0000~\u0000\fppsq\u0000~\u0000\fppsq\u0000~\u0000\fppsq\u0000~\u0000\u0006pp\u0000sq\u0000~\u0000\fppsq\u0000~\u0000\u000eq\u0000~\u0000\u0012ps"
+"q\u0000~\u0000\u0013q\u0000~\u0000\u0012pq\u0000~\u0000\u0016q\u0000~\u0000\u001aq\u0000~\u0000\u001csq\u0000~\u0000\u001dt\u00000net.sourceforge.czt.z.jax"
+"b.gen.SchemaTypeElementq\u0000~\u0000!sq\u0000~\u0000\u0006pp\u0000sq\u0000~\u0000\fppsq\u0000~\u0000\u000eq\u0000~\u0000\u0012psq\u0000"
+"~\u0000\u0013q\u0000~\u0000\u0012pq\u0000~\u0000\u0016q\u0000~\u0000\u001aq\u0000~\u0000\u001csq\u0000~\u0000\u001dt\u0000/net.sourceforge.czt.z.jaxb."
+"gen.GivenTypeElementq\u0000~\u0000!sq\u0000~\u0000\u0006pp\u0000sq\u0000~\u0000\fppsq\u0000~\u0000\u000eq\u0000~\u0000\u0012psq\u0000~\u0000\u0013"
+"q\u0000~\u0000\u0012pq\u0000~\u0000\u0016q\u0000~\u0000\u001aq\u0000~\u0000\u001csq\u0000~\u0000\u001dt\u00001net.sourceforge.czt.z.jaxb.gen"
+".GenericTypeElementq\u0000~\u0000!sq\u0000~\u0000\u0006pp\u0000sq\u0000~\u0000\fppsq\u0000~\u0000\u000eq\u0000~\u0000\u0012psq\u0000~\u0000\u0013q"
+"\u0000~\u0000\u0012pq\u0000~\u0000\u0016q\u0000~\u0000\u001aq\u0000~\u0000\u001csq\u0000~\u0000\u001dt\u0000.net.sourceforge.czt.z.jaxb.gen."
+"ProdTypeElementq\u0000~\u0000!sq\u0000~\u0000\u0006pp\u0000sq\u0000~\u0000\fppsq\u0000~\u0000\u000eq\u0000~\u0000\u0012psq\u0000~\u0000\u0013q\u0000~\u0000\u0012"
+"pq\u0000~\u0000\u0016q\u0000~\u0000\u001aq\u0000~\u0000\u001csq\u0000~\u0000\u001dt\u00000net.sourceforge.czt.oz.jaxb.gen.Cla"
+"ssTypeElementq\u0000~\u0000!sq\u0000~\u0000\u0006pp\u0000sq\u0000~\u0000\fppsq\u0000~\u0000\u000eq\u0000~\u0000\u0012psq\u0000~\u0000\u0013q\u0000~\u0000\u0012pq"
+"\u0000~\u0000\u0016q\u0000~\u0000\u001aq\u0000~\u0000\u001csq\u0000~\u0000\u001dt\u0000/net.sourceforge.czt.z.jaxb.gen.PowerT"
+"ypeElementq\u0000~\u0000!sq\u0000~\u0000\u0006pp\u0000sq\u0000~\u0000\fppsq\u0000~\u0000\u000eq\u0000~\u0000\u0012psq\u0000~\u0000\u0013q\u0000~\u0000\u0012pq\u0000~\u0000"
+"\u0016q\u0000~\u0000\u001aq\u0000~\u0000\u001csq\u0000~\u0000\u001dt\u00002net.sourceforge.czt.z.jaxb.gen.GenParamT"
+"ypeElementq\u0000~\u0000!sr\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/ExpressionPool$Closed"
+"Hash;xpsr\u0000-com.sun.msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N"
+"\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstreamVersionL\u0000\u0006parentt\u0000$Lcom/sun/msv/gram"
+"mar/ExpressionPool;xp\u0000\u0000\u0000\u0019\u0001pq\u0000~\u0000\rq\u0000~\u0000Dq\u0000~\u0000Jq\u0000~\u0000Pq\u0000~\u0000Vq\u0000~\u0000\\q\u0000~"
+"\u0000bq\u0000~\u0000hq\u0000~\u0000\u0005q\u0000~\u0000>q\u0000~\u0000@q\u0000~\u0000Aq\u0000~\u0000\"q\u0000~\u0000\u0010q\u0000~\u0000Eq\u0000~\u0000Kq\u0000~\u0000Qq\u0000~\u0000Wq\u0000~"
+"\u0000]q\u0000~\u0000cq\u0000~\u0000iq\u0000~\u0000\nq\u0000~\u0000?q\u0000~\u0000=q\u0000~\u0000Bx"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends net.sourceforge.czt.oz.jaxb.gen.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingContext context) {
            super(context, "-------");
        }

        protected Unmarshaller(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return net.sourceforge.czt.z.jaxb.gen.impl.NameTypePairImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  1 :
                        attIdx = context.getAttribute("", "Id");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Name = ((net.sourceforge.czt.z.jaxb.gen.impl.DeclNameImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.DeclNameImpl.class), 2, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("Word" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Name = ((net.sourceforge.czt.z.jaxb.gen.impl.DeclNameImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.DeclNameImpl.class), 2, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        _Name = ((net.sourceforge.czt.z.jaxb.gen.impl.DeclNameImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.DeclNameImpl.class), 2, ___uri, ___local, ___qname, __atts));
                        return ;
                    case  3 :
                        if (("SchemaType" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Type = ((net.sourceforge.czt.z.jaxb.gen.impl.SchemaTypeElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.SchemaTypeElementImpl.class), 4, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("GivenType" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Type = ((net.sourceforge.czt.z.jaxb.gen.impl.GivenTypeElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.GivenTypeElementImpl.class), 4, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("GenericType" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Type = ((net.sourceforge.czt.z.jaxb.gen.impl.GenericTypeElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.GenericTypeElementImpl.class), 4, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("ProdType" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Type = ((net.sourceforge.czt.z.jaxb.gen.impl.ProdTypeElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.ProdTypeElementImpl.class), 4, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("ClassType" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            _Type = ((net.sourceforge.czt.oz.jaxb.gen.impl.ClassTypeElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.oz.jaxb.gen.impl.ClassTypeElementImpl.class), 4, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("PowerType" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Type = ((net.sourceforge.czt.z.jaxb.gen.impl.PowerTypeElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.PowerTypeElementImpl.class), 4, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("GenParamType" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Type = ((net.sourceforge.czt.z.jaxb.gen.impl.GenParamTypeElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.GenParamTypeElementImpl.class), 4, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("Type" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 5;
                            return ;
                        }
                        if (("Type" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Type = ((net.sourceforge.czt.z.jaxb.gen.impl.TypeElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.TypeElementImpl.class), 4, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        break;
                    case  5 :
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Type = ((net.sourceforge.czt.z.jaxb.gen.impl.TypeImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.TypeImpl.class), 6, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        _Type = ((net.sourceforge.czt.z.jaxb.gen.impl.TypeImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.TypeImpl.class), 6, ___uri, ___local, ___qname, __atts));
                        return ;
                    case  0 :
                        if (("Name" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 1;
                            return ;
                        }
                        break;
                    case  4 :
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
                        attIdx = context.getAttribute("", "Id");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        _Name = ((net.sourceforge.czt.z.jaxb.gen.impl.DeclNameImpl) spawnChildFromLeaveElement((net.sourceforge.czt.z.jaxb.gen.impl.DeclNameImpl.class), 2, ___uri, ___local, ___qname));
                        return ;
                    case  5 :
                        _Type = ((net.sourceforge.czt.z.jaxb.gen.impl.TypeImpl) spawnChildFromLeaveElement((net.sourceforge.czt.z.jaxb.gen.impl.TypeImpl.class), 6, ___uri, ___local, ___qname));
                        return ;
                    case  2 :
                        if (("Name" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  6 :
                        if (("Type" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.popAttributes();
                            state = 4;
                            return ;
                        }
                        break;
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
                    case  1 :
                        if (("Id" == ___local)&&("" == ___uri)) {
                            _Name = ((net.sourceforge.czt.z.jaxb.gen.impl.DeclNameImpl) spawnChildFromEnterAttribute((net.sourceforge.czt.z.jaxb.gen.impl.DeclNameImpl.class), 2, ___uri, ___local, ___qname));
                            return ;
                        }
                        _Name = ((net.sourceforge.czt.z.jaxb.gen.impl.DeclNameImpl) spawnChildFromEnterAttribute((net.sourceforge.czt.z.jaxb.gen.impl.DeclNameImpl.class), 2, ___uri, ___local, ___qname));
                        return ;
                    case  5 :
                        _Type = ((net.sourceforge.czt.z.jaxb.gen.impl.TypeImpl) spawnChildFromEnterAttribute((net.sourceforge.czt.z.jaxb.gen.impl.TypeImpl.class), 6, ___uri, ___local, ___qname));
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
                    case  1 :
                        attIdx = context.getAttribute("", "Id");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        _Name = ((net.sourceforge.czt.z.jaxb.gen.impl.DeclNameImpl) spawnChildFromLeaveAttribute((net.sourceforge.czt.z.jaxb.gen.impl.DeclNameImpl.class), 2, ___uri, ___local, ___qname));
                        return ;
                    case  5 :
                        _Type = ((net.sourceforge.czt.z.jaxb.gen.impl.TypeImpl) spawnChildFromLeaveAttribute((net.sourceforge.czt.z.jaxb.gen.impl.TypeImpl.class), 6, ___uri, ___local, ___qname));
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
                        case  1 :
                            attIdx = context.getAttribute("", "Id");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            _Name = ((net.sourceforge.czt.z.jaxb.gen.impl.DeclNameImpl) spawnChildFromText((net.sourceforge.czt.z.jaxb.gen.impl.DeclNameImpl.class), 2, value));
                            return ;
                        case  5 :
                            _Type = ((net.sourceforge.czt.z.jaxb.gen.impl.TypeImpl) spawnChildFromText((net.sourceforge.czt.z.jaxb.gen.impl.TypeImpl.class), 6, value));
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
