//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2005.02.24 at 01:10:48 GMT 
//


package net.sourceforge.czt.z.jaxb.gen.impl;

public class SectTypeEnvAnnImpl
    extends net.sourceforge.czt.z.jaxb.gen.impl.AnnImpl
    implements net.sourceforge.czt.z.jaxb.gen.SectTypeEnvAnn, com.sun.xml.bind.JAXBObject, net.sourceforge.czt.circus.jaxb.gen.impl.runtime.UnmarshallableObject, net.sourceforge.czt.circus.jaxb.gen.impl.runtime.XMLSerializable, net.sourceforge.czt.circus.jaxb.gen.impl.runtime.ValidatableObject
{

    protected com.sun.xml.bind.util.ListImpl _NameSectTypeTriple;
    public final static java.lang.Class version = (net.sourceforge.czt.z.jaxb.gen.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (net.sourceforge.czt.z.jaxb.gen.SectTypeEnvAnn.class);
    }

    protected com.sun.xml.bind.util.ListImpl _getNameSectTypeTriple() {
        if (_NameSectTypeTriple == null) {
            _NameSectTypeTriple = new com.sun.xml.bind.util.ListImpl(new java.util.ArrayList());
        }
        return _NameSectTypeTriple;
    }

    public java.util.List getNameSectTypeTriple() {
        return _getNameSectTypeTriple();
    }

    public net.sourceforge.czt.circus.jaxb.gen.impl.runtime.UnmarshallingEventHandler createUnmarshaller(net.sourceforge.czt.circus.jaxb.gen.impl.runtime.UnmarshallingContext context) {
        return new net.sourceforge.czt.z.jaxb.gen.impl.SectTypeEnvAnnImpl.Unmarshaller(context);
    }

    public void serializeBody(net.sourceforge.czt.circus.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = ((_NameSectTypeTriple == null)? 0 :_NameSectTypeTriple.size());
        super.serializeBody(context);
        while (idx1 != len1) {
            if (_NameSectTypeTriple.get(idx1) instanceof javax.xml.bind.Element) {
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _NameSectTypeTriple.get(idx1 ++)), "NameSectTypeTriple");
            } else {
                context.startElement("http://czt.sourceforge.net/zml", "NameSectTypeTriple");
                int idx_0 = idx1;
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _NameSectTypeTriple.get(idx_0 ++)), "NameSectTypeTriple");
                context.endNamespaceDecls();
                int idx_1 = idx1;
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _NameSectTypeTriple.get(idx_1 ++)), "NameSectTypeTriple");
                context.endAttributes();
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _NameSectTypeTriple.get(idx1 ++)), "NameSectTypeTriple");
                context.endElement();
            }
        }
    }

    public void serializeAttributes(net.sourceforge.czt.circus.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = ((_NameSectTypeTriple == null)? 0 :_NameSectTypeTriple.size());
        super.serializeAttributes(context);
        while (idx1 != len1) {
            if (_NameSectTypeTriple.get(idx1) instanceof javax.xml.bind.Element) {
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _NameSectTypeTriple.get(idx1 ++)), "NameSectTypeTriple");
            } else {
                idx1 += 1;
            }
        }
    }

    public void serializeURIs(net.sourceforge.czt.circus.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = ((_NameSectTypeTriple == null)? 0 :_NameSectTypeTriple.size());
        super.serializeURIs(context);
        while (idx1 != len1) {
            if (_NameSectTypeTriple.get(idx1) instanceof javax.xml.bind.Element) {
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _NameSectTypeTriple.get(idx1 ++)), "NameSectTypeTriple");
            } else {
                idx1 += 1;
            }
        }
    }

    public java.lang.Class getPrimaryInterface() {
        return (net.sourceforge.czt.z.jaxb.gen.SectTypeEnvAnn.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun."
+"msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gramm"
+"ar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expression"
+"\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000bex"
+"pandedExpq\u0000~\u0000\u0002xpppsr\u0000 com.sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0002x"
+"q\u0000~\u0000\u0003sr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psq\u0000~\u0000\u0000q\u0000~\u0000\n"
+"psr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tna"
+"meClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv.gra"
+"mmar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000\fco"
+"ntentModelq\u0000~\u0000\u0002xq\u0000~\u0000\u0003q\u0000~\u0000\np\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0006q\u0000~\u0000\npsr\u0000 com.sun."
+"msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClassq\u0000"
+"~\u0000\rxq\u0000~\u0000\u0003q\u0000~\u0000\npsr\u00002com.sun.msv.grammar.Expression$AnyStringE"
+"xpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003sq\u0000~\u0000\t\u0001q\u0000~\u0000\u0015sr\u0000 com.sun.msv.gramma"
+"r.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$EpsilonExpress"
+"ion\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000\u0016q\u0000~\u0000\u001bsr\u0000#com.sun.msv.grammar.Simple"
+"NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/String;L\u0000\fname"
+"spaceURIq\u0000~\u0000\u001dxq\u0000~\u0000\u0018t\u00008net.sourceforge.czt.z.jaxb.gen.NameSec"
+"tTypeTripleElementt\u0000+http://java.sun.com/jaxb/xjc/dummy-elem"
+"entssq\u0000~\u0000\fq\u0000~\u0000\np\u0000sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001"
+"\u0002\u0000\u0000xq\u0000~\u0000\u0001ppsq\u0000~\u0000\fpp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0006q\u0000~\u0000\npsq\u0000~\u0000\u0012q\u0000~\u0000\npq\u0000~\u0000\u0015q\u0000~"
+"\u0000\u0019q\u0000~\u0000\u001bsq\u0000~\u0000\u001ct\u00001net.sourceforge.czt.z.jaxb.gen.NameSectTypeT"
+"ripleq\u0000~\u0000 sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0012q\u0000~\u0000\npsr\u0000\u001bcom.sun.msv.grammar.DataEx"
+"p\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Datatype;L\u0000\u0006except"
+"q\u0000~\u0000\u0002L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~\u0000\u0003ppsr\u0000\"com."
+"sun.msv.datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv.dat"
+"atype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.dataty"
+"pe.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.xsd.X"
+"SDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000\u001dL\u0000\btypeNameq\u0000~\u0000\u001d"
+"L\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/datatype/xsd/WhiteSpaceProcesso"
+"r;xpt\u0000 http://www.w3.org/2001/XMLSchemat\u0000\u0005QNamesr\u00005com.sun.m"
+"sv.datatype.xsd.WhiteSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,c"
+"om.sun.msv.datatype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000"
+"com.sun.msv.grammar.Expression$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000x"
+"q\u0000~\u0000\u0003q\u0000~\u0000\npsr\u0000\u001bcom.sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tloca"
+"lNameq\u0000~\u0000\u001dL\u0000\fnamespaceURIq\u0000~\u0000\u001dxpq\u0000~\u00007q\u0000~\u00006sq\u0000~\u0000\u001ct\u0000\u0004typet\u0000)ht"
+"tp://www.w3.org/2001/XMLSchema-instanceq\u0000~\u0000\u001bsq\u0000~\u0000\u001ct\u0000\u0012NameSec"
+"tTypeTriplet\u0000\u001ehttp://czt.sourceforge.net/zmlq\u0000~\u0000\u001bsr\u0000\"com.sun"
+".msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun"
+"/msv/grammar/ExpressionPool$ClosedHash;xpsr\u0000-com.sun.msv.gra"
+"mmar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstreamVe"
+"rsionL\u0000\u0006parentt\u0000$Lcom/sun/msv/grammar/ExpressionPool;xp\u0000\u0000\u0000\t\u0001"
+"pq\u0000~\u0000#q\u0000~\u0000\u000bq\u0000~\u0000\u0010q\u0000~\u0000%q\u0000~\u0000*q\u0000~\u0000\u0005q\u0000~\u0000\bq\u0000~\u0000\u0011q\u0000~\u0000&x"));
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
            return net.sourceforge.czt.z.jaxb.gen.impl.SectTypeEnvAnnImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  4 :
                        if (("NameSectTypeTriple" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 2;
                            return ;
                        }
                        if (("NameSectTypeTriple" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _getNameSectTypeTriple().add(((net.sourceforge.czt.z.jaxb.gen.impl.NameSectTypeTripleElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.NameSectTypeTripleElementImpl.class), 4, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  2 :
                        if (("Name" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _getNameSectTypeTriple().add(((net.sourceforge.czt.z.jaxb.gen.impl.NameSectTypeTripleImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.NameSectTypeTripleImpl.class), 3, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        break;
                    case  0 :
                        spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.AnnImpl)net.sourceforge.czt.z.jaxb.gen.impl.SectTypeEnvAnnImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname, __atts);
                        return ;
                    case  1 :
                        if (("NameSectTypeTriple" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 2;
                            return ;
                        }
                        if (("NameSectTypeTriple" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _getNameSectTypeTriple().add(((net.sourceforge.czt.z.jaxb.gen.impl.NameSectTypeTripleElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.NameSectTypeTripleElementImpl.class), 4, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        state = 4;
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
                    case  4 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  0 :
                        spawnHandlerFromLeaveElement((((net.sourceforge.czt.z.jaxb.gen.impl.AnnImpl)net.sourceforge.czt.z.jaxb.gen.impl.SectTypeEnvAnnImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
                        return ;
                    case  3 :
                        if (("NameSectTypeTriple" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.popAttributes();
                            state = 4;
                            return ;
                        }
                        break;
                    case  1 :
                        state = 4;
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
                    case  4 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  0 :
                        spawnHandlerFromEnterAttribute((((net.sourceforge.czt.z.jaxb.gen.impl.AnnImpl)net.sourceforge.czt.z.jaxb.gen.impl.SectTypeEnvAnnImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        state = 4;
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
                    case  4 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  0 :
                        spawnHandlerFromLeaveAttribute((((net.sourceforge.czt.z.jaxb.gen.impl.AnnImpl)net.sourceforge.czt.z.jaxb.gen.impl.SectTypeEnvAnnImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        state = 4;
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
                        case  4 :
                            revertToParentFromText(value);
                            return ;
                        case  0 :
                            spawnHandlerFromText((((net.sourceforge.czt.z.jaxb.gen.impl.AnnImpl)net.sourceforge.czt.z.jaxb.gen.impl.SectTypeEnvAnnImpl.this).new Unmarshaller(context)), 1, value);
                            return ;
                        case  1 :
                            state = 4;
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
