//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.1-05/30/2003 05:06 AM(java_re)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2003.08.25 at 04:40:49 NZST 
//


package net.sourceforge.czt.core.jaxb.gen.impl;

public class ZSectImpl
    extends net.sourceforge.czt.core.jaxb.gen.impl.SectImpl
    implements net.sourceforge.czt.core.jaxb.gen.ZSect, com.sun.xml.bind.JAXBObject, net.sourceforge.czt.core.jaxb.gen.impl.runtime.UnmarshallableObject, net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializable, net.sourceforge.czt.core.jaxb.gen.impl.runtime.ValidatableObject
{

    protected com.sun.xml.bind.util.ListImpl _Parent = new com.sun.xml.bind.util.ListImpl(new java.util.ArrayList());
    protected java.lang.String _Name;
    protected com.sun.xml.bind.util.ListImpl _Para = new com.sun.xml.bind.util.ListImpl(new java.util.ArrayList());
    public final static java.lang.Class version = (net.sourceforge.czt.core.jaxb.gen.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (net.sourceforge.czt.core.jaxb.gen.ZSect.class);
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

    public net.sourceforge.czt.core.jaxb.gen.impl.runtime.UnmarshallingEventHandler createUnmarshaller(net.sourceforge.czt.core.jaxb.gen.impl.runtime.UnmarshallingContext context) {
        return new net.sourceforge.czt.core.jaxb.gen.impl.ZSectImpl.Unmarshaller(context);
    }

    public void serializeElementBody(net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = _Parent.size();
        int idx3 = 0;
        final int len3 = _Para.size();
        super.serializeElementBody(context);
        context.startElement("http://czt.sourceforge.net/zml", "Name");
        context.endNamespaceDecls();
        context.endAttributes();
        try {
            context.text(((java.lang.String) _Name));
        } catch (java.lang.Exception e) {
            net.sourceforge.czt.core.jaxb.gen.impl.runtime.Util.handlePrintConversionException(this, e, context);
        }
        context.endElement();
        while (idx1 != len1) {
            if (_Parent.get(idx1) instanceof javax.xml.bind.Element) {
                context.childAsElementBody(((com.sun.xml.bind.JAXBObject) _Parent.get(idx1 ++)));
            } else {
                context.startElement("http://czt.sourceforge.net/zml", "Parent");
                int idx_2 = idx1;
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Parent.get(idx_2 ++)));
                context.endNamespaceDecls();
                int idx_3 = idx1;
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Parent.get(idx_3 ++)));
                context.endAttributes();
                context.childAsElementBody(((com.sun.xml.bind.JAXBObject) _Parent.get(idx1 ++)));
                context.endElement();
            }
        }
        while (idx3 != len3) {
            context.childAsElementBody(((com.sun.xml.bind.JAXBObject) _Para.get(idx3 ++)));
        }
    }

    public void serializeAttributes(net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = _Parent.size();
        int idx3 = 0;
        final int len3 = _Para.size();
        super.serializeAttributes(context);
        while (idx3 != len3) {
            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Para.get(idx3 ++)));
        }
    }

    public void serializeAttributeBody(net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = _Parent.size();
        int idx3 = 0;
        final int len3 = _Para.size();
        super.serializeAttributeBody(context);
        context.startElement("http://czt.sourceforge.net/zml", "Name");
        context.endNamespaceDecls();
        context.endAttributes();
        try {
            context.text(((java.lang.String) _Name));
        } catch (java.lang.Exception e) {
            net.sourceforge.czt.core.jaxb.gen.impl.runtime.Util.handlePrintConversionException(this, e, context);
        }
        context.endElement();
        while (idx1 != len1) {
            if (_Parent.get(idx1) instanceof javax.xml.bind.Element) {
                context.childAsAttributeBody(((com.sun.xml.bind.JAXBObject) _Parent.get(idx1 ++)));
            } else {
                context.startElement("http://czt.sourceforge.net/zml", "Parent");
                int idx_2 = idx1;
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Parent.get(idx_2 ++)));
                context.endNamespaceDecls();
                int idx_3 = idx1;
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Parent.get(idx_3 ++)));
                context.endAttributes();
                context.childAsElementBody(((com.sun.xml.bind.JAXBObject) _Parent.get(idx1 ++)));
                context.endElement();
            }
        }
        while (idx3 != len3) {
            context.childAsAttributeBody(((com.sun.xml.bind.JAXBObject) _Para.get(idx3 ++)));
        }
    }

    public void serializeURIs(net.sourceforge.czt.core.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = _Parent.size();
        int idx3 = 0;
        final int len3 = _Para.size();
        super.serializeURIs(context);
        while (idx3 != len3) {
            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Para.get(idx3 ++)));
        }
    }

    public java.lang.Class getPrimaryInterface() {
        return (net.sourceforge.czt.core.jaxb.gen.ZSect.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava"
+"/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0002xp\u0010\u00ae\u0015\u00fbppsq\u0000~\u0000\u0000\u0005\u00f83=ppsq\u0000~\u0000\u0000\u0002"
+"\u00e8\u00cd\u00cbppsr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001\u0001\u0087\u00b2\u00bfp"
+"psr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tna"
+"meClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv.gra"
+"mmar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000\fco"
+"ntentModelq\u0000~\u0000\u0002xq\u0000~\u0000\u0003\u0001\u0087\u00b2\u00b4sr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005"
+"valuexp\u0000p\u0000sq\u0000~\u0000\n\u0001\u0087\u00b2\u00a9pp\u0000sq\u0000~\u0000\b\u0001\u0087\u00b2\u009eppsr\u0000 com.sun.msv.grammar.O"
+"neOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0002xq\u0000~\u0000\u0003\u0001\u0087\u00b2\u0093q\u0000~\u0000\u000fpsr\u0000 com.sun.msv.grammar.Attr"
+"ibuteExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClassq\u0000~\u0000\u000bxq\u0000~\u0000\u0003\u0001\u0087\u00b2\u0090q\u0000~"
+"\u0000\u000fpsr\u00002com.sun.msv.grammar.Expression$AnyStringExpression\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\bsq\u0000~\u0000\u000e\u0001q\u0000~\u0000\u0018sr\u0000 com.sun.msv.grammar.AnyNam"
+"eClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000"
+"\u0000xpsr\u00000com.sun.msv.grammar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\tq\u0000~\u0000\u0019q\u0000~\u0000\u001esr\u0000#com.sun.msv.grammar.SimpleName"
+"Class\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/String;L\u0000\fnamespac"
+"eURIq\u0000~\u0000 xq\u0000~\u0000\u001bt\u00000net.sourceforge.czt.core.jaxb.gen.TermA.An"
+"nsTypet\u0000+http://java.sun.com/jaxb/xjc/dummy-elementssq\u0000~\u0000\u001ft\u0000"
+"\u0004Annst\u0000\u001ehttp://czt.sourceforge.net/zmlq\u0000~\u0000\u001esq\u0000~\u0000\n\u0001a\u001b\u0007pp\u0000sr\u0000\u001b"
+"com.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/d"
+"atatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/S"
+"tringPair;xq\u0000~\u0000\u0003\u0001a\u001a\u00fcq\u0000~\u0000\u000fpsr\u0000#com.sun.msv.datatype.xsd.Strin"
+"gType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\risAlwaysValidxr\u0000*com.sun.msv.datatype.xsd"
+".BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.Co"
+"ncreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.xsd.XSDatatype"
+"Impl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000 L\u0000\btypeNameq\u0000~\u0000 L\u0000\nwhiteS"
+"pacet\u0000.Lcom/sun/msv/datatype/xsd/WhiteSpaceProcessor;xpt\u0000 ht"
+"tp://www.w3.org/2001/XMLSchemat\u0000\u0006stringsr\u00005com.sun.msv.datat"
+"ype.xsd.WhiteSpaceProcessor$Preserve\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.m"
+"sv.datatype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xp\u0001sr\u00000com.sun"
+".msv.grammar.Expression$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000"
+"\u0000\nq\u0000~\u0000\u000fpsr\u0000\u001bcom.sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNa"
+"meq\u0000~\u0000 L\u0000\fnamespaceURIq\u0000~\u0000 xpq\u0000~\u00003q\u0000~\u00002sq\u0000~\u0000\u001ft\u0000\u0004Nameq\u0000~\u0000&sq\u0000"
+"~\u0000\b\u0003\u000femppsq\u0000~\u0000\u0012\u0003\u000febq\u0000~\u0000\u000fpsq\u0000~\u0000\b\u0003\u000fe_q\u0000~\u0000\u000fpsq\u0000~\u0000\n\u0001\u0087\u00b2\u00b4q\u0000~\u0000\u000fp\u0000sq"
+"\u0000~\u0000\n\u0001\u0087\u00b2\u00a9pp\u0000sq\u0000~\u0000\b\u0001\u0087\u00b2\u009eppsq\u0000~\u0000\u0012\u0001\u0087\u00b2\u0093q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001\u0087\u00b2\u0090q\u0000~\u0000\u000fpq\u0000~\u0000\u0018"
+"q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000(net.sourceforge.czt.core.jaxb.gen.Parentq"
+"\u0000~\u0000#sq\u0000~\u0000\u001ft\u0000\u0006Parentq\u0000~\u0000&sq\u0000~\u0000\n\u0001\u0087\u00b2\u00a9q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\b\u0001\u0087\u00b2\u009eppsq\u0000~\u0000\u0012\u0001"
+"\u0087\u00b2\u0093q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001\u0087\u00b2\u0090q\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000/net.sourcef"
+"orge.czt.core.jaxb.gen.ParentElementq\u0000~\u0000#q\u0000~\u0000\u001esq\u0000~\u0000\b\n\u00b5\u00e2\u00b9ppsq"
+"\u0000~\u0000\u0012\n\u00b5\u00e2\u00aeq\u0000~\u0000\u000fpsq\u0000~\u0000\b\n\u00b5\u00e2\u00abq\u0000~\u0000\u000fpsq\u0000~\u0000\b\t.0\u0000q\u0000~\u0000\u000fpsq\u0000~\u0000\b\u0007\u00a6}Uq\u0000~\u0000"
+"\u000fpsq\u0000~\u0000\b\u0006\u001e\u00ca\u00aaq\u0000~\u0000\u000fpsq\u0000~\u0000\b\u0004\u0097\u0017\u00ffq\u0000~\u0000\u000fpsq\u0000~\u0000\b\u0003\u000feTq\u0000~\u0000\u000fpsq\u0000~\u0000\n\u0001\u0087\u00b2\u00a9"
+"q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\b\u0001\u0087\u00b2\u009eppsq\u0000~\u0000\u0012\u0001\u0087\u00b2\u0093q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001\u0087\u00b2\u0090q\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000"
+"\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000/net.sourceforge.czt.core.jaxb.gen.AxParaEleme"
+"ntq\u0000~\u0000#sq\u0000~\u0000\n\u0001\u0087\u00b2\u00a9q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\b\u0001\u0087\u00b2\u009eppsq\u0000~\u0000\u0012\u0001\u0087\u00b2\u0093q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001\u0087"
+"\u00b2\u0090q\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00001net.sourceforge.czt.core.jax"
+"b.gen.ConjParaElementq\u0000~\u0000#sq\u0000~\u0000\n\u0001\u0087\u00b2\u00a9q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\b\u0001\u0087\u00b2\u009eppsq\u0000~\u0000"
+"\u0012\u0001\u0087\u00b2\u0093q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001\u0087\u00b2\u0090q\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00001net.sourc"
+"eforge.czt.core.jaxb.gen.FreeParaElementq\u0000~\u0000#sq\u0000~\u0000\n\u0001\u0087\u00b2\u00a9q\u0000~\u0000\u000f"
+"p\u0000sq\u0000~\u0000\b\u0001\u0087\u00b2\u009eppsq\u0000~\u0000\u0012\u0001\u0087\u00b2\u0093q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001\u0087\u00b2\u0090q\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000"
+"\u001esq\u0000~\u0000\u001ft\u00002net.sourceforge.czt.core.jaxb.gen.GivenParaElement"
+"q\u0000~\u0000#sq\u0000~\u0000\n\u0001\u0087\u00b2\u00a9q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\b\u0001\u0087\u00b2\u009eppsq\u0000~\u0000\u0012\u0001\u0087\u00b2\u0093q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001\u0087\u00b2\u0090"
+"q\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00001net.sourceforge.czt.core.jaxb."
+"gen.NarrParaElementq\u0000~\u0000#sq\u0000~\u0000\n\u0001\u0087\u00b2\u00a9q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\b\u0001\u0087\u00b2\u009eppsq\u0000~\u0000\u0012\u0001"
+"\u0087\u00b2\u0093q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001\u0087\u00b2\u0090q\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00003net.sourcef"
+"orge.czt.core.jaxb.gen.OptempParaElementq\u0000~\u0000#sq\u0000~\u0000\n\u0001\u0087\u00b2\u00a9q\u0000~\u0000\u000f"
+"p\u0000sq\u0000~\u0000\b\u0001\u0087\u00b2\u009eppsq\u0000~\u0000\u0012\u0001\u0087\u00b2\u0093q\u0000~\u0000\u000fpsq\u0000~\u0000\u0015\u0001\u0087\u00b2\u0090q\u0000~\u0000\u000fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000"
+"\u001esq\u0000~\u0000\u001ft\u00005net.sourceforge.czt.core.jaxb.gen.UnparsedParaElem"
+"entq\u0000~\u0000#q\u0000~\u0000\u001esr\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002"
+"\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/ExpressionPool$ClosedHa"
+"sh;xpsr\u0000-com.sun.msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8"
+"\u00ed\u001c\u0002\u0000\u0004I\u0000\u0005countI\u0000\tthresholdL\u0000\u0006parentq\u0000~\u0000\u0082[\u0000\u0005tablet\u0000![Lcom/sun/"
+"msv/grammar/Expression;xp\u0000\u0000\u0000#\u0000\u0000\u00009pur\u0000![Lcom.sun.msv.grammar."
+"Expression;\u00d68D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp\u0000\u0000\u0000\u00bfpppppppppppppppppppq\u0000~\u0000Vpppppppp"
+"ppq\u0000~\u0000?ppq\u0000~\u0000>ppppppq\u0000~\u0000Tpppq\u0000~\u0000=ppppppppppppppppq\u0000~\u0000Rpppppp"
+"ppppppppppppq\u0000~\u0000\u0007pq\u0000~\u0000\u0014q\u0000~\u0000Cq\u0000~\u0000Kq\u0000~\u0000Yq\u0000~\u0000_q\u0000~\u0000eq\u0000~\u0000kq\u0000~\u0000qq\u0000"
+"~\u0000wq\u0000~\u0000}pq\u0000~\u0000\u0011q\u0000~\u0000Bq\u0000~\u0000Jq\u0000~\u0000Xq\u0000~\u0000^q\u0000~\u0000dq\u0000~\u0000jq\u0000~\u0000pq\u0000~\u0000vq\u0000~\u0000|p"
+"ppppppppppppppppppppq\u0000~\u0000\u0005q\u0000~\u0000Uq\u0000~\u0000\tppq\u0000~\u0000\u0006ppppppppppppppppq\u0000"
+"~\u0000Sppppppppppppppppppppq\u0000~\u0000Qppq\u0000~\u0000Pppppppppppq\u0000~\u0000Oppppppppp"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends net.sourceforge.czt.core.jaxb.gen.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(net.sourceforge.czt.core.jaxb.gen.impl.runtime.UnmarshallingContext context) {
            super(context, "---------");
        }

        protected Unmarshaller(net.sourceforge.czt.core.jaxb.gen.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return net.sourceforge.czt.core.jaxb.gen.impl.ZSectImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  8 :
                        if (("AxPara" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Para.add(((net.sourceforge.czt.core.jaxb.gen.impl.AxParaElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.AxParaElementImpl.class), 8, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("ConjPara" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Para.add(((net.sourceforge.czt.core.jaxb.gen.impl.ConjParaElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.ConjParaElementImpl.class), 8, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("FreePara" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Para.add(((net.sourceforge.czt.core.jaxb.gen.impl.FreeParaElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.FreeParaElementImpl.class), 8, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("GivenPara" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Para.add(((net.sourceforge.czt.core.jaxb.gen.impl.GivenParaElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.GivenParaElementImpl.class), 8, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("NarrPara" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Para.add(((net.sourceforge.czt.core.jaxb.gen.impl.NarrParaElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.NarrParaElementImpl.class), 8, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("OptempPara" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Para.add(((net.sourceforge.czt.core.jaxb.gen.impl.OptempParaElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.OptempParaElementImpl.class), 8, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("UnparsedPara" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Para.add(((net.sourceforge.czt.core.jaxb.gen.impl.UnparsedParaElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.UnparsedParaElementImpl.class), 8, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  7 :
                        if (("Parent" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 5;
                            return ;
                        }
                        if (("AxPara" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Para.add(((net.sourceforge.czt.core.jaxb.gen.impl.AxParaElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.AxParaElementImpl.class), 8, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("ConjPara" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Para.add(((net.sourceforge.czt.core.jaxb.gen.impl.ConjParaElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.ConjParaElementImpl.class), 8, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("FreePara" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Para.add(((net.sourceforge.czt.core.jaxb.gen.impl.FreeParaElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.FreeParaElementImpl.class), 8, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("GivenPara" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Para.add(((net.sourceforge.czt.core.jaxb.gen.impl.GivenParaElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.GivenParaElementImpl.class), 8, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("NarrPara" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Para.add(((net.sourceforge.czt.core.jaxb.gen.impl.NarrParaElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.NarrParaElementImpl.class), 8, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("OptempPara" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Para.add(((net.sourceforge.czt.core.jaxb.gen.impl.OptempParaElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.OptempParaElementImpl.class), 8, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("UnparsedPara" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Para.add(((net.sourceforge.czt.core.jaxb.gen.impl.UnparsedParaElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.UnparsedParaElementImpl.class), 8, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        state = 8;
                        continue outer;
                    case  5 :
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Parent.add(((net.sourceforge.czt.core.jaxb.gen.impl.ParentImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.ParentImpl.class), 6, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("Word" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Parent.add(((net.sourceforge.czt.core.jaxb.gen.impl.ParentImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.ParentImpl.class), 6, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        _Parent.add(((net.sourceforge.czt.core.jaxb.gen.impl.ParentImpl) spawnChildFromEnterElement((net.sourceforge.czt.core.jaxb.gen.impl.ParentImpl.class), 6, ___uri, ___local, ___qname, __atts)));
                        return ;
                    case  1 :
                        if (("Name" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 2;
                            return ;
                        }
                        break;
                    case  4 :
                        if (("Parent" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 5;
                            return ;
                        }
                        state = 7;
                        continue outer;
                    case  0 :
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.SectImpl)net.sourceforge.czt.core.jaxb.gen.impl.ZSectImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        spawnHandlerFromEnterElement((((net.sourceforge.czt.core.jaxb.gen.impl.SectImpl)net.sourceforge.czt.core.jaxb.gen.impl.ZSectImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname, __atts);
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
                    case  6 :
                        if (("Parent" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.popAttributes();
                            state = 7;
                            return ;
                        }
                        break;
                    case  8 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  7 :
                        state = 8;
                        continue outer;
                    case  5 :
                        _Parent.add(((net.sourceforge.czt.core.jaxb.gen.impl.ParentImpl) spawnChildFromLeaveElement((net.sourceforge.czt.core.jaxb.gen.impl.ParentImpl.class), 6, ___uri, ___local, ___qname)));
                        return ;
                    case  3 :
                        if (("Name" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.popAttributes();
                            state = 4;
                            return ;
                        }
                        break;
                    case  4 :
                        state = 7;
                        continue outer;
                    case  0 :
                        spawnHandlerFromLeaveElement((((net.sourceforge.czt.core.jaxb.gen.impl.SectImpl)net.sourceforge.czt.core.jaxb.gen.impl.ZSectImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
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
                    case  8 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  7 :
                        state = 8;
                        continue outer;
                    case  5 :
                        _Parent.add(((net.sourceforge.czt.core.jaxb.gen.impl.ParentImpl) spawnChildFromEnterAttribute((net.sourceforge.czt.core.jaxb.gen.impl.ParentImpl.class), 6, ___uri, ___local, ___qname)));
                        return ;
                    case  4 :
                        state = 7;
                        continue outer;
                    case  0 :
                        spawnHandlerFromEnterAttribute((((net.sourceforge.czt.core.jaxb.gen.impl.SectImpl)net.sourceforge.czt.core.jaxb.gen.impl.ZSectImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
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
                    case  8 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  7 :
                        state = 8;
                        continue outer;
                    case  5 :
                        _Parent.add(((net.sourceforge.czt.core.jaxb.gen.impl.ParentImpl) spawnChildFromLeaveAttribute((net.sourceforge.czt.core.jaxb.gen.impl.ParentImpl.class), 6, ___uri, ___local, ___qname)));
                        return ;
                    case  4 :
                        state = 7;
                        continue outer;
                    case  0 :
                        spawnHandlerFromLeaveAttribute((((net.sourceforge.czt.core.jaxb.gen.impl.SectImpl)net.sourceforge.czt.core.jaxb.gen.impl.ZSectImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
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
                        case  8 :
                            revertToParentFromText(value);
                            return ;
                        case  7 :
                            state = 8;
                            continue outer;
                        case  5 :
                            _Parent.add(((net.sourceforge.czt.core.jaxb.gen.impl.ParentImpl) spawnChildFromText((net.sourceforge.czt.core.jaxb.gen.impl.ParentImpl.class), 6, value)));
                            return ;
                        case  4 :
                            state = 7;
                            continue outer;
                        case  2 :
                            eatText0(value);
                            state = 3;
                            return ;
                        case  0 :
                            spawnHandlerFromText((((net.sourceforge.czt.core.jaxb.gen.impl.SectImpl)net.sourceforge.czt.core.jaxb.gen.impl.ZSectImpl.this).new Unmarshaller(context)), 1, value);
                            return ;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

        private void eatText0(final java.lang.String value)
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
