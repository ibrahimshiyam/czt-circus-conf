//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2004.01.05 at 10:33:20 NZDT 
//


package net.sourceforge.czt.z.jaxb.gen.impl;

public class ZSectImpl
    extends net.sourceforge.czt.z.jaxb.gen.impl.SectImpl
    implements net.sourceforge.czt.z.jaxb.gen.ZSect, com.sun.xml.bind.JAXBObject, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallableObject, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializable, net.sourceforge.czt.oz.jaxb.gen.impl.runtime.ValidatableObject
{

    protected com.sun.xml.bind.util.ListImpl _Parent = new com.sun.xml.bind.util.ListImpl(new java.util.ArrayList());
    protected java.lang.String _Name;
    protected com.sun.xml.bind.util.ListImpl _Para = new com.sun.xml.bind.util.ListImpl(new java.util.ArrayList());
    public final static java.lang.Class version = (net.sourceforge.czt.z.jaxb.gen.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (net.sourceforge.czt.z.jaxb.gen.ZSect.class);
    }

    public java.util.List getParent() {
        return _Parent;
    }

    public java.lang.String getName() {
        return _Name;
    }

    public void setName(java.lang.String value) {
        _Name = value;
    }

    public java.util.List getPara() {
        return _Para;
    }

    public net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingEventHandler createUnmarshaller(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingContext context) {
        return new net.sourceforge.czt.z.jaxb.gen.impl.ZSectImpl.Unmarshaller(context);
    }

    public void serializeBody(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = _Parent.size();
        int idx3 = 0;
        final int len3 = _Para.size();
        super.serializeBody(context);
        context.startElement("http://czt.sourceforge.net/zml", "Name");
        context.endNamespaceDecls();
        context.endAttributes();
        try {
            context.text(((java.lang.String) _Name), "Name");
        } catch (java.lang.Exception e) {
            net.sourceforge.czt.oz.jaxb.gen.impl.runtime.Util.handlePrintConversionException(this, e, context);
        }
        context.endElement();
        while (idx1 != len1) {
            if (_Parent.get(idx1) instanceof javax.xml.bind.Element) {
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _Parent.get(idx1 ++)), "Parent");
            } else {
                context.startElement("http://czt.sourceforge.net/zml", "Parent");
                int idx_2 = idx1;
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Parent.get(idx_2 ++)), "Parent");
                context.endNamespaceDecls();
                int idx_3 = idx1;
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Parent.get(idx_3 ++)), "Parent");
                context.endAttributes();
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _Parent.get(idx1 ++)), "Parent");
                context.endElement();
            }
        }
        while (idx3 != len3) {
            if (_Para.get(idx3) instanceof javax.xml.bind.Element) {
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _Para.get(idx3 ++)), "Para");
            } else {
                context.startElement("http://czt.sourceforge.net/zml", "Para");
                int idx_4 = idx3;
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Para.get(idx_4 ++)), "Para");
                context.endNamespaceDecls();
                int idx_5 = idx3;
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Para.get(idx_5 ++)), "Para");
                context.endAttributes();
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _Para.get(idx3 ++)), "Para");
                context.endElement();
            }
        }
    }

    public void serializeAttributes(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = _Parent.size();
        int idx3 = 0;
        final int len3 = _Para.size();
        super.serializeAttributes(context);
        while (idx1 != len1) {
            if (_Parent.get(idx1) instanceof javax.xml.bind.Element) {
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Parent.get(idx1 ++)), "Parent");
            } else {
                idx1 += 1;
            }
        }
        while (idx3 != len3) {
            if (_Para.get(idx3) instanceof javax.xml.bind.Element) {
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Para.get(idx3 ++)), "Para");
            } else {
                idx3 += 1;
            }
        }
    }

    public void serializeURIs(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = _Parent.size();
        int idx3 = 0;
        final int len3 = _Para.size();
        super.serializeURIs(context);
        while (idx1 != len1) {
            if (_Parent.get(idx1) instanceof javax.xml.bind.Element) {
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Parent.get(idx1 ++)), "Parent");
            } else {
                idx1 += 1;
            }
        }
        while (idx3 != len3) {
            if (_Para.get(idx3) instanceof javax.xml.bind.Element) {
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Para.get(idx3 ++)), "Para");
            } else {
                idx3 += 1;
            }
        }
    }

    public java.lang.Class getPrimaryInterface() {
        return (net.sourceforge.czt.z.jaxb.gen.ZSect.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava"
+"/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0002xp\u0011\u00fc\u00c0\u000eppsq\u0000~\u0000\u0000\u0007\u00c7\b\u0005ppsq\u0000~\u0000\u0000\u0003"
+"\u00c3\u00ca\u009eppsr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001\u0002\u00ac\u00a6\u0017p"
+"psr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tna"
+"meClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv.gra"
+"mmar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000\fco"
+"ntentModelq\u0000~\u0000\u0002xq\u0000~\u0000\u0003\u0002\u00ac\u00a6\fsr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005"
+"valuexp\u0000p\u0000sq\u0000~\u0000\u0000\u0002\u00ac\u00a6\u0001ppsq\u0000~\u0000\n\u0001F\u00b6\u00fdpp\u0000sq\u0000~\u0000\b\u0001F\u00b6\u00f2ppsr\u0000 com.sun.m"
+"sv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.Un"
+"aryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0002xq\u0000~\u0000\u0003\u0001F\u00b6\u00e7q\u0000~\u0000\u000fpsr\u0000 com.sun.msv."
+"grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClassq\u0000~\u0000\u000bx"
+"q\u0000~\u0000\u0003\u0001F\u00b6\u00e4q\u0000~\u0000\u000fpsr\u00002com.sun.msv.grammar.Expression$AnyStringE"
+"xpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\bsq\u0000~\u0000\u000e\u0001q\u0000~\u0000\u0019sr\u0000 com.sun.msv.gr"
+"ammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameCla"
+"ss\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$EpsilonExp"
+"ression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\tq\u0000~\u0000\u001aq\u0000~\u0000\u001fsr\u0000#com.sun.msv.gramma"
+"r.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/String"
+";L\u0000\fnamespaceURIq\u0000~\u0000!xq\u0000~\u0000\u001ct\u0000-net.sourceforge.czt.z.jaxb.gen"
+".TermA.AnnsTypet\u0000+http://java.sun.com/jaxb/xjc/dummy-element"
+"ssq\u0000~\u0000\b\u0001e\u00ee\u00ffppsq\u0000~\u0000\u0016\u0001e\u00ee\u00f4q\u0000~\u0000\u000fpsr\u0000\u001bcom.sun.msv.grammar.DataExp"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Datatype;L\u0000\u0006exceptq"
+"\u0000~\u0000\u0002L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~\u0000\u0003\u00005\u00e6\u00f3ppsr\u0000\"c"
+"om.sun.msv.datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv."
+"datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.dat"
+"atype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.xs"
+"d.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000!L\u0000\btypeNameq\u0000"
+"~\u0000!L\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/datatype/xsd/WhiteSpaceProce"
+"ssor;xpt\u0000 http://www.w3.org/2001/XMLSchemat\u0000\u0005QNamesr\u00005com.su"
+"n.msv.datatype.xsd.WhiteSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr"
+"\u0000,com.sun.msv.datatype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xps"
+"r\u00000com.sun.msv.grammar.Expression$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002"
+"\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\nq\u0000~\u0000\u000fpsr\u0000\u001bcom.sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002"
+"L\u0000\tlocalNameq\u0000~\u0000!L\u0000\fnamespaceURIq\u0000~\u0000!xpq\u0000~\u00002q\u0000~\u00001sq\u0000~\u0000 t\u0000\u0004ty"
+"pet\u0000)http://www.w3.org/2001/XMLSchema-instanceq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000\u0004"
+"Annst\u0000\u001ehttp://czt.sourceforge.net/zmlq\u0000~\u0000\u001fsq\u0000~\u0000\n\u0001\u0017$\u0082pp\u0000sq\u0000~\u0000"
+"\u0000\u0001\u0017$wppsq\u0000~\u0000\'\u0000\"\u00b9\u000fq\u0000~\u0000\u000fpsr\u0000#com.sun.msv.datatype.xsd.StringTy"
+"pe\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\risAlwaysValidxq\u0000~\u0000,q\u0000~\u00001t\u0000\u0006stringsr\u00005com.sun"
+".msv.datatype.xsd.WhiteSpaceProcessor$Preserve\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000"
+"~\u00004\u0001q\u0000~\u00007sq\u0000~\u00008q\u0000~\u0000Eq\u0000~\u00001sq\u0000~\u0000\b\u0000\u00f4kcppsq\u0000~\u0000\u0016\u0000\u00f4kXq\u0000~\u0000\u000fpq\u0000~\u0000*sq"
+"\u0000~\u0000 q\u0000~\u0000;q\u0000~\u0000<q\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000\u0004Nameq\u0000~\u0000?sq\u0000~\u0000\b\u0004\u0003=bppsq\u0000~\u0000\u0013\u0004\u0003=Wq"
+"\u0000~\u0000\u000fpsq\u0000~\u0000\b\u0004\u0003=Tq\u0000~\u0000\u000fpsq\u0000~\u0000\n\u0001F\u00b6\u00fdq\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\b\u0001F\u00b6\u00f2ppsq\u0000~\u0000\u0013\u0001F\u00b6\u00e7"
+"q\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u0001F\u00b6\u00e4q\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000,net.sourceforg"
+"e.czt.z.jaxb.gen.ParentElementq\u0000~\u0000$sq\u0000~\u0000\n\u0002\u00bc\u0086Uq\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u0000\u0002\u00bc"
+"\u0086Jppsq\u0000~\u0000\n\u0001F\u00b6\u00fdpp\u0000sq\u0000~\u0000\b\u0001F\u00b6\u00f2ppsq\u0000~\u0000\u0013\u0001F\u00b6\u00e7q\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u0001F\u00b6\u00e4q\u0000~\u0000\u000f"
+"pq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000%net.sourceforge.czt.z.jaxb.gen.Pare"
+"ntq\u0000~\u0000$sq\u0000~\u0000\b\u0001u\u00cfHppsq\u0000~\u0000\u0016\u0001u\u00cf=q\u0000~\u0000\u000fpq\u0000~\u0000*sq\u0000~\u0000 q\u0000~\u0000;q\u0000~\u0000<q\u0000~\u0000"
+"\u001fsq\u0000~\u0000 t\u0000\u0006Parentq\u0000~\u0000?q\u0000~\u0000\u001fsq\u0000~\u0000\b\n5\u00b8\u0004ppsq\u0000~\u0000\u0013\n5\u00b7\u00f9q\u0000~\u0000\u000fpsq\u0000~\u0000\b"
+"\n5\u00b7\u00f6q\u0000~\u0000\u000fpsq\u0000~\u0000\b\b\u00ef\u0000\u00f7q\u0000~\u0000\u000fpsq\u0000~\u0000\b\u0007\u00a8I\u00f8q\u0000~\u0000\u000fpsq\u0000~\u0000\b\u0006a\u0092\u00f9q\u0000~\u0000\u000fpsq"
+"\u0000~\u0000\b\u0005\u001a\u00db\u00faq\u0000~\u0000\u000fpsq\u0000~\u0000\b\u0003\u00d4$\u00fbq\u0000~\u0000\u000fpsq\u0000~\u0000\b\u0002\u008dm\u00fcq\u0000~\u0000\u000fpsq\u0000~\u0000\n\u0001F\u00b6\u00fdq\u0000~\u0000"
+"\u000fp\u0000sq\u0000~\u0000\b\u0001F\u00b6\u00f2ppsq\u0000~\u0000\u0013\u0001F\u00b6\u00e7q\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u0001F\u00b6\u00e4q\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~"
+"\u0000\u001fsq\u0000~\u0000 t\u0000.net.sourceforge.czt.z.jaxb.gen.ConjParaElementq\u0000~"
+"\u0000$sq\u0000~\u0000\n\u0001F\u00b6\u00fdq\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\b\u0001F\u00b6\u00f2ppsq\u0000~\u0000\u0013\u0001F\u00b6\u00e7q\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u0001F\u00b6\u00e4q\u0000~"
+"\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000/net.sourceforge.czt.z.jaxb.gen.Gi"
+"venParaElementq\u0000~\u0000$sq\u0000~\u0000\n\u0001F\u00b6\u00fdq\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\b\u0001F\u00b6\u00f2ppsq\u0000~\u0000\u0013\u0001F\u00b6\u00e7q\u0000"
+"~\u0000\u000fpsq\u0000~\u0000\u0016\u0001F\u00b6\u00e4q\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000.net.sourceforge."
+"czt.z.jaxb.gen.FreeParaElementq\u0000~\u0000$sq\u0000~\u0000\n\u0001F\u00b6\u00fdq\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\b\u0001F"
+"\u00b6\u00f2ppsq\u0000~\u0000\u0013\u0001F\u00b6\u00e7q\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u0001F\u00b6\u00e4q\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000,"
+"net.sourceforge.czt.z.jaxb.gen.AxParaElementq\u0000~\u0000$sq\u0000~\u0000\n\u0001F\u00b6\u00fdq"
+"\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\b\u0001F\u00b6\u00f2ppsq\u0000~\u0000\u0013\u0001F\u00b6\u00e7q\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u0001F\u00b6\u00e4q\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001d"
+"q\u0000~\u0000\u001fsq\u0000~\u0000 t\u00002net.sourceforge.czt.z.jaxb.gen.UnparsedParaEle"
+"mentq\u0000~\u0000$sq\u0000~\u0000\n\u0001F\u00b6\u00fdq\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\b\u0001F\u00b6\u00f2ppsq\u0000~\u0000\u0013\u0001F\u00b6\u00e7q\u0000~\u0000\u000fpsq\u0000~\u0000\u0016"
+"\u0001F\u00b6\u00e4q\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u00000net.sourceforge.czt.oz.jax"
+"b.gen.ClassParaElementq\u0000~\u0000$sq\u0000~\u0000\n\u0001F\u00b6\u00fdq\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\b\u0001F\u00b6\u00f2ppsq\u0000~"
+"\u0000\u0013\u0001F\u00b6\u00e7q\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u0001F\u00b6\u00e4q\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u00000net.sour"
+"ceforge.czt.z.jaxb.gen.OptempParaElementq\u0000~\u0000$sq\u0000~\u0000\n\u0001F\u00b6\u00fdq\u0000~\u0000\u000f"
+"p\u0000sq\u0000~\u0000\b\u0001F\u00b6\u00f2ppsq\u0000~\u0000\u0013\u0001F\u00b6\u00e7q\u0000~\u0000\u000fpsq\u0000~\u0000\u0016\u0001F\u00b6\u00e4q\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000"
+"\u001fsq\u0000~\u0000 t\u0000.net.sourceforge.czt.z.jaxb.gen.NarrParaElementq\u0000~\u0000"
+"$q\u0000~\u0000\u001fsr\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bex"
+"pTablet\u0000/Lcom/sun/msv/grammar/ExpressionPool$ClosedHash;xpsr"
+"\u0000-com.sun.msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0002\u0000\u0004I\u0000"
+"\u0005countI\u0000\tthresholdL\u0000\u0006parentq\u0000~\u0000\u009e[\u0000\u0005tablet\u0000![Lcom/sun/msv/gra"
+"mmar/Expression;xp\u0000\u0000\u0000,\u0000\u0000\u00009pur\u0000![Lcom.sun.msv.grammar.Express"
+"ion;\u00d68D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp\u0000\u0000\u0000\u00bfpppppppppq\u0000~\u0000lppppppppppq\u0000~\u0000jpppppppppp"
+"q\u0000~\u0000hppppppppppq\u0000~\u0000fppq\u0000~\u0000eppppppppq\u0000~\u0000Xpq\u0000~\u0000dpppq\u0000~\u0000Iq\u0000~\u0000%p"
+"ppppppppppppppq\u0000~\u0000\u0015q\u0000~\u0000Sq\u0000~\u0000[q\u0000~\u0000oq\u0000~\u0000uq\u0000~\u0000{q\u0000~\u0000\u0081q\u0000~\u0000\u0087q\u0000~\u0000\u008dq"
+"\u0000~\u0000\u0093q\u0000~\u0000\u0099q\u0000~\u0000\u0012q\u0000~\u0000Rq\u0000~\u0000Aq\u0000~\u0000Zq\u0000~\u0000nq\u0000~\u0000tq\u0000~\u0000zq\u0000~\u0000\u0080q\u0000~\u0000\u0006q\u0000~\u0000\u0086q"
+"\u0000~\u0000\u008cq\u0000~\u0000\u0092q\u0000~\u0000\u0098pq\u0000~\u0000\u0007pppppppq\u0000~\u0000kppppppppppq\u0000~\u0000ippppppppppq\u0000~"
+"\u0000gppppppppq\u0000~\u0000_pppppppppppppppq\u0000~\u0000\u0005pppppppq\u0000~\u0000\u0010q\u0000~\u0000Pppq\u0000~\u0000Op"
+"pppppppppq\u0000~\u0000Nppppppq\u0000~\u0000\tppp"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends net.sourceforge.czt.oz.jaxb.gen.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingContext context) {
            super(context, "-----------");
        }

        protected Unmarshaller(net.sourceforge.czt.oz.jaxb.gen.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return net.sourceforge.czt.z.jaxb.gen.impl.ZSectImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  1 :
                        if (("Name" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 2;
                            return ;
                        }
                        break;
                    case  7 :
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Para.add(((net.sourceforge.czt.z.jaxb.gen.impl.ParaImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.ParaImpl.class), 8, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        _Para.add(((net.sourceforge.czt.z.jaxb.gen.impl.ParaImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.ParaImpl.class), 8, ___uri, ___local, ___qname, __atts)));
                        return ;
                    case  9 :
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Parent.add(((net.sourceforge.czt.z.jaxb.gen.impl.ParentImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.ParentImpl.class), 10, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("Word" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Parent.add(((net.sourceforge.czt.z.jaxb.gen.impl.ParentImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.ParentImpl.class), 10, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        _Parent.add(((net.sourceforge.czt.z.jaxb.gen.impl.ParentImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.ParentImpl.class), 10, ___uri, ___local, ___qname, __atts)));
                        return ;
                    case  6 :
                        if (("ConjPara" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Para.add(((net.sourceforge.czt.z.jaxb.gen.impl.ConjParaElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.ConjParaElementImpl.class), 6, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("GivenPara" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Para.add(((net.sourceforge.czt.z.jaxb.gen.impl.GivenParaElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.GivenParaElementImpl.class), 6, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("FreePara" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Para.add(((net.sourceforge.czt.z.jaxb.gen.impl.FreeParaElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.FreeParaElementImpl.class), 6, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("AxPara" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Para.add(((net.sourceforge.czt.z.jaxb.gen.impl.AxParaElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.AxParaElementImpl.class), 6, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("UnparsedPara" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Para.add(((net.sourceforge.czt.z.jaxb.gen.impl.UnparsedParaElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.UnparsedParaElementImpl.class), 6, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("ClassPara" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            _Para.add(((net.sourceforge.czt.oz.jaxb.gen.impl.ClassParaElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.oz.jaxb.gen.impl.ClassParaElementImpl.class), 6, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("OptempPara" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Para.add(((net.sourceforge.czt.z.jaxb.gen.impl.OptempParaElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.OptempParaElementImpl.class), 6, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("NarrPara" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Para.add(((net.sourceforge.czt.z.jaxb.gen.impl.NarrParaElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.NarrParaElementImpl.class), 6, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("Para" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 7;
                            return ;
                        }
                        if (("Para" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Para.add(((net.sourceforge.czt.z.jaxb.gen.impl.ParaElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.ParaElementImpl.class), 6, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  5 :
                        if (("Parent" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 9;
                            return ;
                        }
                        if (("Parent" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Parent.add(((net.sourceforge.czt.z.jaxb.gen.impl.ParentElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.ParentElementImpl.class), 5, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("ConjPara" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Para.add(((net.sourceforge.czt.z.jaxb.gen.impl.ConjParaElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.ConjParaElementImpl.class), 6, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("GivenPara" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Para.add(((net.sourceforge.czt.z.jaxb.gen.impl.GivenParaElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.GivenParaElementImpl.class), 6, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("FreePara" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Para.add(((net.sourceforge.czt.z.jaxb.gen.impl.FreeParaElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.FreeParaElementImpl.class), 6, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("AxPara" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Para.add(((net.sourceforge.czt.z.jaxb.gen.impl.AxParaElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.AxParaElementImpl.class), 6, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("UnparsedPara" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Para.add(((net.sourceforge.czt.z.jaxb.gen.impl.UnparsedParaElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.UnparsedParaElementImpl.class), 6, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("ClassPara" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            _Para.add(((net.sourceforge.czt.oz.jaxb.gen.impl.ClassParaElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.oz.jaxb.gen.impl.ClassParaElementImpl.class), 6, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("OptempPara" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Para.add(((net.sourceforge.czt.z.jaxb.gen.impl.OptempParaElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.OptempParaElementImpl.class), 6, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("NarrPara" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Para.add(((net.sourceforge.czt.z.jaxb.gen.impl.NarrParaElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.NarrParaElementImpl.class), 6, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("Para" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 7;
                            return ;
                        }
                        if (("Para" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Para.add(((net.sourceforge.czt.z.jaxb.gen.impl.ParaElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.ParaElementImpl.class), 6, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        state = 6;
                        continue outer;
                    case  4 :
                        if (("Parent" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 9;
                            return ;
                        }
                        if (("Parent" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Parent.add(((net.sourceforge.czt.z.jaxb.gen.impl.ParentElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.ParentElementImpl.class), 5, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        state = 5;
                        continue outer;
                    case  0 :
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.SectImpl)net.sourceforge.czt.z.jaxb.gen.impl.ZSectImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.SectImpl)net.sourceforge.czt.z.jaxb.gen.impl.ZSectImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname, __atts);
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
                        if (("Name" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.popAttributes();
                            state = 4;
                            return ;
                        }
                        break;
                    case  10 :
                        if (("Parent" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.popAttributes();
                            state = 5;
                            return ;
                        }
                        break;
                    case  7 :
                        _Para.add(((net.sourceforge.czt.z.jaxb.gen.impl.ParaImpl) spawnChildFromLeaveElement((net.sourceforge.czt.z.jaxb.gen.impl.ParaImpl.class), 8, ___uri, ___local, ___qname)));
                        return ;
                    case  9 :
                        _Parent.add(((net.sourceforge.czt.z.jaxb.gen.impl.ParentImpl) spawnChildFromLeaveElement((net.sourceforge.czt.z.jaxb.gen.impl.ParentImpl.class), 10, ___uri, ___local, ___qname)));
                        return ;
                    case  6 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  5 :
                        state = 6;
                        continue outer;
                    case  4 :
                        state = 5;
                        continue outer;
                    case  8 :
                        if (("Para" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.popAttributes();
                            state = 6;
                            return ;
                        }
                        break;
                    case  0 :
                        spawnHandlerFromLeaveElement((((net.sourceforge.czt.z.jaxb.gen.impl.SectImpl)net.sourceforge.czt.z.jaxb.gen.impl.ZSectImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
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
                        _Para.add(((net.sourceforge.czt.z.jaxb.gen.impl.ParaImpl) spawnChildFromEnterAttribute((net.sourceforge.czt.z.jaxb.gen.impl.ParaImpl.class), 8, ___uri, ___local, ___qname)));
                        return ;
                    case  9 :
                        _Parent.add(((net.sourceforge.czt.z.jaxb.gen.impl.ParentImpl) spawnChildFromEnterAttribute((net.sourceforge.czt.z.jaxb.gen.impl.ParentImpl.class), 10, ___uri, ___local, ___qname)));
                        return ;
                    case  6 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  5 :
                        state = 6;
                        continue outer;
                    case  4 :
                        state = 5;
                        continue outer;
                    case  0 :
                        spawnHandlerFromEnterAttribute((((net.sourceforge.czt.z.jaxb.gen.impl.SectImpl)net.sourceforge.czt.z.jaxb.gen.impl.ZSectImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
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
                        _Para.add(((net.sourceforge.czt.z.jaxb.gen.impl.ParaImpl) spawnChildFromLeaveAttribute((net.sourceforge.czt.z.jaxb.gen.impl.ParaImpl.class), 8, ___uri, ___local, ___qname)));
                        return ;
                    case  9 :
                        _Parent.add(((net.sourceforge.czt.z.jaxb.gen.impl.ParentImpl) spawnChildFromLeaveAttribute((net.sourceforge.czt.z.jaxb.gen.impl.ParentImpl.class), 10, ___uri, ___local, ___qname)));
                        return ;
                    case  6 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  5 :
                        state = 6;
                        continue outer;
                    case  4 :
                        state = 5;
                        continue outer;
                    case  0 :
                        spawnHandlerFromLeaveAttribute((((net.sourceforge.czt.z.jaxb.gen.impl.SectImpl)net.sourceforge.czt.z.jaxb.gen.impl.ZSectImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
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
                            _Para.add(((net.sourceforge.czt.z.jaxb.gen.impl.ParaImpl) spawnChildFromText((net.sourceforge.czt.z.jaxb.gen.impl.ParaImpl.class), 8, value)));
                            return ;
                        case  9 :
                            _Parent.add(((net.sourceforge.czt.z.jaxb.gen.impl.ParentImpl) spawnChildFromText((net.sourceforge.czt.z.jaxb.gen.impl.ParentImpl.class), 10, value)));
                            return ;
                        case  6 :
                            revertToParentFromText(value);
                            return ;
                        case  5 :
                            state = 6;
                            continue outer;
                        case  2 :
                            eatText1(value);
                            state = 3;
                            return ;
                        case  4 :
                            state = 5;
                            continue outer;
                        case  0 :
                            spawnHandlerFromText((((net.sourceforge.czt.z.jaxb.gen.impl.SectImpl)net.sourceforge.czt.z.jaxb.gen.impl.ZSectImpl.this).new Unmarshaller(context)), 1, value);
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
                _Name = value;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

    }

}
