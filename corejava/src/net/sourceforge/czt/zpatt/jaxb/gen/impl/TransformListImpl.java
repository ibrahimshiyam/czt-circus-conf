//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2004.11.04 at 10:24:55 GMT 
//


package net.sourceforge.czt.zpatt.jaxb.gen.impl;

public class TransformListImpl implements net.sourceforge.czt.zpatt.jaxb.gen.TransformList, com.sun.xml.bind.JAXBObject, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallableObject, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializable, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.ValidatableObject
{

    protected com.sun.xml.bind.util.ListImpl _Transform = new com.sun.xml.bind.util.ListImpl(new java.util.ArrayList());
    public final static java.lang.Class version = (net.sourceforge.czt.zpatt.jaxb.gen.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (net.sourceforge.czt.zpatt.jaxb.gen.TransformList.class);
    }

    public java.util.List getTransform() {
        return _Transform;
    }

    public net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingEventHandler createUnmarshaller(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingContext context) {
        return new net.sourceforge.czt.zpatt.jaxb.gen.impl.TransformListImpl.Unmarshaller(context);
    }

    public void serializeBody(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = _Transform.size();
        while (idx1 != len1) {
            if (_Transform.get(idx1) instanceof javax.xml.bind.Element) {
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _Transform.get(idx1 ++)), "Transform");
            } else {
                context.startElement("http://czt.sourceforge.net/zpatt", "Transform");
                int idx_0 = idx1;
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Transform.get(idx_0 ++)), "Transform");
                context.endNamespaceDecls();
                int idx_1 = idx1;
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Transform.get(idx_1 ++)), "Transform");
                context.endAttributes();
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _Transform.get(idx1 ++)), "Transform");
                context.endElement();
            }
        }
    }

    public void serializeAttributes(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = _Transform.size();
        while (idx1 != len1) {
            if (_Transform.get(idx1) instanceof javax.xml.bind.Element) {
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Transform.get(idx1 ++)), "Transform");
            } else {
                idx1 += 1;
            }
        }
    }

    public void serializeURIs(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = _Transform.size();
        while (idx1 != len1) {
            if (_Transform.get(idx1) instanceof javax.xml.bind.Element) {
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Transform.get(idx1 ++)), "Transform");
            } else {
                idx1 += 1;
            }
        }
    }

    public java.lang.Class getPrimaryInterface() {
        return (net.sourceforge.czt.zpatt.jaxb.gen.TransformList.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun."
+"msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gramm"
+"ar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expression"
+"\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava/l"
+"ang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0002xp\u0000\u009f\u0007\u0004ppsr\u0000 com.sun.msv.gramm"
+"ar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.UnaryExp\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0002xq\u0000~\u0000\u0003\u0000\u009f\u0006\u00f9sr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002"
+"\u0000\u0001Z\u0000\u0005valuexp\u0000psq\u0000~\u0000\u0000\u0000\u009f\u0006\u00f6q\u0000~\u0000\npsr\u0000\'com.sun.msv.grammar.trex.E"
+"lementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClasst\u0000\u001fLcom/sun/msv/grammar/"
+"NameClass;xr\u0000\u001ecom.sun.msv.grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aig"
+"noreUndeclaredAttributesL\u0000\fcontentModelq\u0000~\u0000\u0002xq\u0000~\u0000\u0003\u0000O\u0083zq\u0000~\u0000\np"
+"\u0000sq\u0000~\u0000\u0000\u0000O\u0083oppsq\u0000~\u0000\u0006\u0000O\u0083dq\u0000~\u0000\npsr\u0000 com.sun.msv.grammar.Attribu"
+"teExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClassq\u0000~\u0000\rxq\u0000~\u0000\u0003\u0000O\u0083aq\u0000~\u0000\np"
+"sr\u00002com.sun.msv.grammar.Expression$AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\bsq\u0000~\u0000\t\u0001q\u0000~\u0000\u0015sr\u0000 com.sun.msv.grammar.AnyNameCl"
+"ass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xp"
+"sr\u00000com.sun.msv.grammar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001"
+"\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\tq\u0000~\u0000\u0016q\u0000~\u0000\u001bsr\u0000#com.sun.msv.grammar.SimpleNameCla"
+"ss\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/String;L\u0000\fnamespaceUR"
+"Iq\u0000~\u0000\u001dxq\u0000~\u0000\u0018t\u00007net.sourceforge.czt.zpatt.jaxb.gen.PredTransf"
+"ormElementt\u0000+http://java.sun.com/jaxb/xjc/dummy-elementssq\u0000~"
+"\u0000\f\u0000O\u0083zq\u0000~\u0000\np\u0000sq\u0000~\u0000\u0000\u0000O\u0083oppsq\u0000~\u0000\u0006\u0000O\u0083dq\u0000~\u0000\npsq\u0000~\u0000\u0012\u0000O\u0083aq\u0000~\u0000\npq\u0000~"
+"\u0000\u0015q\u0000~\u0000\u0019q\u0000~\u0000\u001bsq\u0000~\u0000\u001ct\u00007net.sourceforge.czt.zpatt.jaxb.gen.Expr"
+"TransformElementq\u0000~\u0000 q\u0000~\u0000\u001bsr\u0000\"com.sun.msv.grammar.Expression"
+"Pool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/Expression"
+"Pool$ClosedHash;xpsr\u0000-com.sun.msv.grammar.ExpressionPool$Clo"
+"sedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0002\u0000\u0004I\u0000\u0005countI\u0000\tthresholdL\u0000\u0006parentq\u0000~\u0000([\u0000\u0005table"
+"t\u0000![Lcom/sun/msv/grammar/Expression;xp\u0000\u0000\u0000\u0007\u0000\u0000\u00009pur\u0000![Lcom.sun"
+".msv.grammar.Expression;\u00d68D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp\u0000\u0000\u0000\u00bfppppppppppppppppppp"
+"pppppppppppppppppppppppppppppppppppppppppppppppppppppppppppp"
+"ppppppppppppq\u0000~\u0000\u000bppq\u0000~\u0000\bppppppppppq\u0000~\u0000\u0005ppppppppppppq\u0000~\u0000\u0011q\u0000~\u0000"
+"#pppppppppq\u0000~\u0000\u0010q\u0000~\u0000\"pppppppppppppppppppppppppppppppppppppppp"
+"pppppppppppppppppppp"));
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
            return net.sourceforge.czt.zpatt.jaxb.gen.impl.TransformListImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  0 :
                        if (("PredTransform" == ___local)&&("http://czt.sourceforge.net/zpatt" == ___uri)) {
                            _Transform.add(((net.sourceforge.czt.zpatt.jaxb.gen.impl.PredTransformElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.zpatt.jaxb.gen.impl.PredTransformElementImpl.class), 1, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("ExprTransform" == ___local)&&("http://czt.sourceforge.net/zpatt" == ___uri)) {
                            _Transform.add(((net.sourceforge.czt.zpatt.jaxb.gen.impl.ExprTransformElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.zpatt.jaxb.gen.impl.ExprTransformElementImpl.class), 1, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("Transform" == ___local)&&("http://czt.sourceforge.net/zpatt" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 2;
                            return ;
                        }
                        if (("Transform" == ___local)&&("http://czt.sourceforge.net/zpatt" == ___uri)) {
                            _Transform.add(((net.sourceforge.czt.zpatt.jaxb.gen.impl.TransformElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.zpatt.jaxb.gen.impl.TransformElementImpl.class), 1, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        state = 1;
                        continue outer;
                    case  2 :
                        _Transform.add(((net.sourceforge.czt.zpatt.jaxb.gen.impl.TransformImpl) spawnChildFromEnterElement((net.sourceforge.czt.zpatt.jaxb.gen.impl.TransformImpl.class), 3, ___uri, ___local, ___qname, __atts)));
                        return ;
                    case  1 :
                        if (("PredTransform" == ___local)&&("http://czt.sourceforge.net/zpatt" == ___uri)) {
                            _Transform.add(((net.sourceforge.czt.zpatt.jaxb.gen.impl.PredTransformElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.zpatt.jaxb.gen.impl.PredTransformElementImpl.class), 1, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("ExprTransform" == ___local)&&("http://czt.sourceforge.net/zpatt" == ___uri)) {
                            _Transform.add(((net.sourceforge.czt.zpatt.jaxb.gen.impl.ExprTransformElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.zpatt.jaxb.gen.impl.ExprTransformElementImpl.class), 1, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("Transform" == ___local)&&("http://czt.sourceforge.net/zpatt" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 2;
                            return ;
                        }
                        if (("Transform" == ___local)&&("http://czt.sourceforge.net/zpatt" == ___uri)) {
                            _Transform.add(((net.sourceforge.czt.zpatt.jaxb.gen.impl.TransformElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.zpatt.jaxb.gen.impl.TransformElementImpl.class), 1, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
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
                    case  3 :
                        if (("Transform" == ___local)&&("http://czt.sourceforge.net/zpatt" == ___uri)) {
                            context.popAttributes();
                            state = 1;
                            return ;
                        }
                        break;
                    case  0 :
                        state = 1;
                        continue outer;
                    case  2 :
                        _Transform.add(((net.sourceforge.czt.zpatt.jaxb.gen.impl.TransformImpl) spawnChildFromLeaveElement((net.sourceforge.czt.zpatt.jaxb.gen.impl.TransformImpl.class), 3, ___uri, ___local, ___qname)));
                        return ;
                    case  1 :
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
                        state = 1;
                        continue outer;
                    case  2 :
                        _Transform.add(((net.sourceforge.czt.zpatt.jaxb.gen.impl.TransformImpl) spawnChildFromEnterAttribute((net.sourceforge.czt.zpatt.jaxb.gen.impl.TransformImpl.class), 3, ___uri, ___local, ___qname)));
                        return ;
                    case  1 :
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
                        state = 1;
                        continue outer;
                    case  2 :
                        _Transform.add(((net.sourceforge.czt.zpatt.jaxb.gen.impl.TransformImpl) spawnChildFromLeaveAttribute((net.sourceforge.czt.zpatt.jaxb.gen.impl.TransformImpl.class), 3, ___uri, ___local, ___qname)));
                        return ;
                    case  1 :
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
                            state = 1;
                            continue outer;
                        case  2 :
                            _Transform.add(((net.sourceforge.czt.zpatt.jaxb.gen.impl.TransformImpl) spawnChildFromText((net.sourceforge.czt.zpatt.jaxb.gen.impl.TransformImpl.class), 3, value)));
                            return ;
                        case  1 :
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
