//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2005.02.24 at 01:10:48 GMT 
//


package net.sourceforge.czt.z.jaxb.gen.impl;

public class GenericTypeImpl
    extends net.sourceforge.czt.z.jaxb.gen.impl.TypeImpl
    implements net.sourceforge.czt.z.jaxb.gen.GenericType, com.sun.xml.bind.JAXBObject, net.sourceforge.czt.circus.jaxb.gen.impl.runtime.UnmarshallableObject, net.sourceforge.czt.circus.jaxb.gen.impl.runtime.XMLSerializable, net.sourceforge.czt.circus.jaxb.gen.impl.runtime.ValidatableObject
{

    protected net.sourceforge.czt.z.jaxb.gen.Type2 _Type;
    protected net.sourceforge.czt.z.jaxb.gen.Type2 _OptionalType;
    protected com.sun.xml.bind.util.ListImpl _Name;
    public final static java.lang.Class version = (net.sourceforge.czt.z.jaxb.gen.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (net.sourceforge.czt.z.jaxb.gen.GenericType.class);
    }

    public net.sourceforge.czt.z.jaxb.gen.Type2 getType() {
        return _Type;
    }

    public void setType(net.sourceforge.czt.z.jaxb.gen.Type2 value) {
        _Type = value;
    }

    public net.sourceforge.czt.z.jaxb.gen.Type2 getOptionalType() {
        return _OptionalType;
    }

    public void setOptionalType(net.sourceforge.czt.z.jaxb.gen.Type2 value) {
        _OptionalType = value;
    }

    protected com.sun.xml.bind.util.ListImpl _getName() {
        if (_Name == null) {
            _Name = new com.sun.xml.bind.util.ListImpl(new java.util.ArrayList());
        }
        return _Name;
    }

    public java.util.List getName() {
        return _getName();
    }

    public net.sourceforge.czt.circus.jaxb.gen.impl.runtime.UnmarshallingEventHandler createUnmarshaller(net.sourceforge.czt.circus.jaxb.gen.impl.runtime.UnmarshallingContext context) {
        return new net.sourceforge.czt.z.jaxb.gen.impl.GenericTypeImpl.Unmarshaller(context);
    }

    public void serializeBody(net.sourceforge.czt.circus.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx3 = 0;
        final int len3 = ((_Name == null)? 0 :_Name.size());
        super.serializeBody(context);
        while (idx3 != len3) {
            context.startElement("http://czt.sourceforge.net/zml", "Name");
            int idx_0 = idx3;
            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Name.get(idx_0 ++)), "Name");
            context.endNamespaceDecls();
            int idx_1 = idx3;
            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Name.get(idx_1 ++)), "Name");
            context.endAttributes();
            context.childAsBody(((com.sun.xml.bind.JAXBObject) _Name.get(idx3 ++)), "Name");
            context.endElement();
        }
        if (_Type instanceof javax.xml.bind.Element) {
            context.childAsBody(((com.sun.xml.bind.JAXBObject) _Type), "Type");
        } else {
            context.startElement("http://czt.sourceforge.net/zml", "Type2");
            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Type), "Type");
            context.endNamespaceDecls();
            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Type), "Type");
            context.endAttributes();
            context.childAsBody(((com.sun.xml.bind.JAXBObject) _Type), "Type");
            context.endElement();
        }
        if (_OptionalType!= null) {
            if (_OptionalType instanceof javax.xml.bind.Element) {
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _OptionalType), "OptionalType");
            } else {
                context.startElement("http://czt.sourceforge.net/zml", "Type2");
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _OptionalType), "OptionalType");
                context.endNamespaceDecls();
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _OptionalType), "OptionalType");
                context.endAttributes();
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _OptionalType), "OptionalType");
                context.endElement();
            }
        }
    }

    public void serializeAttributes(net.sourceforge.czt.circus.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx3 = 0;
        final int len3 = ((_Name == null)? 0 :_Name.size());
        super.serializeAttributes(context);
        while (idx3 != len3) {
            idx3 += 1;
        }
        if (_Type instanceof javax.xml.bind.Element) {
            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Type), "Type");
        }
        if (_OptionalType!= null) {
            if (_OptionalType instanceof javax.xml.bind.Element) {
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _OptionalType), "OptionalType");
            }
        }
    }

    public void serializeURIs(net.sourceforge.czt.circus.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx3 = 0;
        final int len3 = ((_Name == null)? 0 :_Name.size());
        super.serializeURIs(context);
        while (idx3 != len3) {
            idx3 += 1;
        }
        if (_Type instanceof javax.xml.bind.Element) {
            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Type), "Type");
        }
        if (_OptionalType!= null) {
            if (_OptionalType instanceof javax.xml.bind.Element) {
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _OptionalType), "OptionalType");
            }
        }
    }

    public java.lang.Class getPrimaryInterface() {
        return (net.sourceforge.czt.z.jaxb.gen.GenericType.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000b"
+"expandedExpq\u0000~\u0000\u0002xpppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsr\u0000\u001dcom.sun.msv.grammar."
+"ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001ppsr\u0000\'com.sun.msv.grammar.trex.Ele"
+"mentPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClasst\u0000\u001fLcom/sun/msv/grammar/Na"
+"meClass;xr\u0000\u001ecom.sun.msv.grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aigno"
+"reUndeclaredAttributesL\u0000\fcontentModelq\u0000~\u0000\u0002xq\u0000~\u0000\u0003sr\u0000\u0011java.lan"
+"g.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000p\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\npp\u0000sq\u0000~\u0000\bppsr"
+"\u0000 com.sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv"
+".grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0002xq\u0000~\u0000\u0003q\u0000~\u0000\u000fpsr\u0000 com.s"
+"un.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClas"
+"sq\u0000~\u0000\u000bxq\u0000~\u0000\u0003q\u0000~\u0000\u000fpsr\u00002com.sun.msv.grammar.Expression$AnyStri"
+"ngExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003sq\u0000~\u0000\u000e\u0001q\u0000~\u0000\u0019sr\u0000 com.sun.msv.gra"
+"mmar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameClas"
+"s\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$EpsilonExpr"
+"ession\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000\u001aq\u0000~\u0000\u001fsr\u0000#com.sun.msv.grammar.Sim"
+"pleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/String;L\u0000\fn"
+"amespaceURIq\u0000~\u0000!xq\u0000~\u0000\u001ct\u0000-net.sourceforge.czt.z.jaxb.gen.Term"
+"A.AnnsTypet\u0000+http://java.sun.com/jaxb/xjc/dummy-elementssq\u0000~"
+"\u0000\bppsq\u0000~\u0000\u0016q\u0000~\u0000\u000fpsr\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000"
+"\u0002dtt\u0000\u001fLorg/relaxng/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004namet\u0000"
+"\u001dLcom/sun/msv/util/StringPair;xq\u0000~\u0000\u0003ppsr\u0000\"com.sun.msv.dataty"
+"pe.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.Buil"
+"tinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.Concret"
+"eType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.xsd.XSDatatypeImpl\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000!L\u0000\btypeNameq\u0000~\u0000!L\u0000\nwhiteSpacet"
+"\u0000.Lcom/sun/msv/datatype/xsd/WhiteSpaceProcessor;xpt\u0000 http://"
+"www.w3.org/2001/XMLSchemat\u0000\u0005QNamesr\u00005com.sun.msv.datatype.xs"
+"d.WhiteSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.dat"
+"atype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.gr"
+"ammar.Expression$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000\u000fpsr\u0000"
+"\u001bcom.sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000!L\u0000\fn"
+"amespaceURIq\u0000~\u0000!xpq\u0000~\u00002q\u0000~\u00001sq\u0000~\u0000 t\u0000\u0004typet\u0000)http://www.w3.or"
+"g/2001/XMLSchema-instanceq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000\u0004Annst\u0000\u001ehttp://czt.sou"
+"rceforge.net/zmlq\u0000~\u0000\u001fsq\u0000~\u0000\u0013ppsq\u0000~\u0000\npp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\npp\u0000sq\u0000~\u0000"
+"\bppsq\u0000~\u0000\u0013q\u0000~\u0000\u000fpsq\u0000~\u0000\u0016q\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000\'net.sourc"
+"eforge.czt.z.jaxb.gen.DeclNameq\u0000~\u0000$sq\u0000~\u0000\bppsq\u0000~\u0000\u0016q\u0000~\u0000\u000fpq\u0000~\u0000*"
+"q\u0000~\u0000:q\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000\u0004Nameq\u0000~\u0000?sq\u0000~\u0000\bppsq\u0000~\u0000\bppsq\u0000~\u0000\bppsq\u0000~\u0000\bpp"
+"sq\u0000~\u0000\bppsq\u0000~\u0000\npp\u0000sq\u0000~\u0000\bppsq\u0000~\u0000\u0013q\u0000~\u0000\u000fpsq\u0000~\u0000\u0016q\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq"
+"\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000/net.sourceforge.czt.z.jaxb.gen.GivenTypeElement"
+"q\u0000~\u0000$sq\u0000~\u0000\npp\u0000sq\u0000~\u0000\bppsq\u0000~\u0000\u0013q\u0000~\u0000\u000fpsq\u0000~\u0000\u0016q\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000"
+"\u001fsq\u0000~\u0000 t\u00000net.sourceforge.czt.z.jaxb.gen.SchemaTypeElementq\u0000"
+"~\u0000$sq\u0000~\u0000\npp\u0000sq\u0000~\u0000\bppsq\u0000~\u0000\u0013q\u0000~\u0000\u000fpsq\u0000~\u0000\u0016q\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fs"
+"q\u0000~\u0000 t\u0000.net.sourceforge.czt.z.jaxb.gen.ProdTypeElementq\u0000~\u0000$s"
+"q\u0000~\u0000\npp\u0000sq\u0000~\u0000\bppsq\u0000~\u0000\u0013q\u0000~\u0000\u000fpsq\u0000~\u0000\u0016q\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000"
+" t\u00002net.sourceforge.czt.z.jaxb.gen.GenParamTypeElementq\u0000~\u0000$s"
+"q\u0000~\u0000\npp\u0000sq\u0000~\u0000\bppsq\u0000~\u0000\u0013q\u0000~\u0000\u000fpsq\u0000~\u0000\u0016q\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000"
+" t\u00000net.sourceforge.czt.oz.jaxb.gen.ClassTypeElementq\u0000~\u0000$sq\u0000"
+"~\u0000\npp\u0000sq\u0000~\u0000\bppsq\u0000~\u0000\u0013q\u0000~\u0000\u000fpsq\u0000~\u0000\u0016q\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t"
+"\u0000/net.sourceforge.czt.z.jaxb.gen.PowerTypeElementq\u0000~\u0000$sq\u0000~\u0000\b"
+"ppsq\u0000~\u0000\bq\u0000~\u0000\u000fpsq\u0000~\u0000\bq\u0000~\u0000\u000fpsq\u0000~\u0000\bq\u0000~\u0000\u000fpsq\u0000~\u0000\bq\u0000~\u0000\u000fpsq\u0000~\u0000\bq\u0000~\u0000"
+"\u000fpsq\u0000~\u0000\nq\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\bppsq\u0000~\u0000\u0013q\u0000~\u0000\u000fpsq\u0000~\u0000\u0016q\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~"
+"\u0000\u001fsq\u0000~\u0000 q\u0000~\u0000Wq\u0000~\u0000$sq\u0000~\u0000\nq\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\bppsq\u0000~\u0000\u0013q\u0000~\u0000\u000fpsq\u0000~\u0000\u0016q\u0000~"
+"\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 q\u0000~\u0000]q\u0000~\u0000$sq\u0000~\u0000\nq\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\bppsq\u0000~\u0000"
+"\u0013q\u0000~\u0000\u000fpsq\u0000~\u0000\u0016q\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 q\u0000~\u0000cq\u0000~\u0000$sq\u0000~\u0000\nq\u0000~\u0000"
+"\u000fp\u0000sq\u0000~\u0000\bppsq\u0000~\u0000\u0013q\u0000~\u0000\u000fpsq\u0000~\u0000\u0016q\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 q\u0000~\u0000"
+"iq\u0000~\u0000$sq\u0000~\u0000\nq\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\bppsq\u0000~\u0000\u0013q\u0000~\u0000\u000fpsq\u0000~\u0000\u0016q\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000"
+"\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 q\u0000~\u0000oq\u0000~\u0000$sq\u0000~\u0000\nq\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\bppsq\u0000~\u0000\u0013q\u0000~\u0000\u000fpsq\u0000~\u0000"
+"\u0016q\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 q\u0000~\u0000uq\u0000~\u0000$q\u0000~\u0000\u001fsr\u0000\"com.sun.msv.g"
+"rammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/g"
+"rammar/ExpressionPool$ClosedHash;xpsr\u0000-com.sun.msv.grammar.E"
+"xpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstreamVersionL"
+"\u0000\u0006parentt\u0000$Lcom/sun/msv/grammar/ExpressionPool;xp\u0000\u0000\u00000\u0001pq\u0000~\u0000\u0010"
+"q\u0000~\u0000Bq\u0000~\u0000Tq\u0000~\u0000Zq\u0000~\u0000`q\u0000~\u0000fq\u0000~\u0000lq\u0000~\u0000rq\u0000~\u0000~q\u0000~\u0000\u0083q\u0000~\u0000\u0088q\u0000~\u0000\u008dq\u0000~\u0000\u0092"
+"q\u0000~\u0000\u0097q\u0000~\u0000\tq\u0000~\u0000Qq\u0000~\u0000{q\u0000~\u0000\u0012q\u0000~\u0000Dq\u0000~\u0000Sq\u0000~\u0000Yq\u0000~\u0000_q\u0000~\u0000eq\u0000~\u0000kq\u0000~\u0000O"
+"q\u0000~\u0000qq\u0000~\u0000}q\u0000~\u0000\u0082q\u0000~\u0000Nq\u0000~\u0000\u0087q\u0000~\u0000\u008cq\u0000~\u0000yq\u0000~\u0000\u0091q\u0000~\u0000xq\u0000~\u0000%q\u0000~\u0000Iq\u0000~\u0000\u0096"
+"q\u0000~\u0000\u0007q\u0000~\u0000@q\u0000~\u0000vq\u0000~\u0000Mq\u0000~\u0000wq\u0000~\u0000Pq\u0000~\u0000zq\u0000~\u0000\u0005q\u0000~\u0000\u0006q\u0000~\u0000\u0015q\u0000~\u0000Ex"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends net.sourceforge.czt.circus.jaxb.gen.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(net.sourceforge.czt.circus.jaxb.gen.impl.runtime.UnmarshallingContext context) {
            super(context, "-----------");
        }

        protected Unmarshaller(net.sourceforge.czt.circus.jaxb.gen.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return net.sourceforge.czt.z.jaxb.gen.impl.GenericTypeImpl.this;
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
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.TypeImpl)net.sourceforge.czt.z.jaxb.gen.impl.GenericTypeImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.TypeImpl)net.sourceforge.czt.z.jaxb.gen.impl.GenericTypeImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname, __atts);
                        return ;
                    case  8 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  5 :
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Type = ((net.sourceforge.czt.z.jaxb.gen.impl.Type2Impl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.Type2Impl.class), 6, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        _Type = ((net.sourceforge.czt.z.jaxb.gen.impl.Type2Impl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.Type2Impl.class), 6, ___uri, ___local, ___qname, __atts));
                        return ;
                    case  1 :
                        if (("Name" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 2;
                            return ;
                        }
                        break;
                    case  7 :
                        if (("GivenType" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _OptionalType = ((net.sourceforge.czt.z.jaxb.gen.impl.GivenTypeElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.GivenTypeElementImpl.class), 8, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("SchemaType" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _OptionalType = ((net.sourceforge.czt.z.jaxb.gen.impl.SchemaTypeElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.SchemaTypeElementImpl.class), 8, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("ProdType" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _OptionalType = ((net.sourceforge.czt.z.jaxb.gen.impl.ProdTypeElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.ProdTypeElementImpl.class), 8, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("GenParamType" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _OptionalType = ((net.sourceforge.czt.z.jaxb.gen.impl.GenParamTypeElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.GenParamTypeElementImpl.class), 8, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("ClassType" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            _OptionalType = ((net.sourceforge.czt.oz.jaxb.gen.impl.ClassTypeElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.oz.jaxb.gen.impl.ClassTypeElementImpl.class), 8, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("PowerType" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _OptionalType = ((net.sourceforge.czt.z.jaxb.gen.impl.PowerTypeElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.PowerTypeElementImpl.class), 8, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("Type2" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 9;
                            return ;
                        }
                        if (("Type2" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _OptionalType = ((net.sourceforge.czt.z.jaxb.gen.impl.Type2ElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.Type2ElementImpl.class), 8, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        state = 8;
                        continue outer;
                    case  4 :
                        if (("Name" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 2;
                            return ;
                        }
                        if (("GivenType" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Type = ((net.sourceforge.czt.z.jaxb.gen.impl.GivenTypeElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.GivenTypeElementImpl.class), 7, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("SchemaType" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Type = ((net.sourceforge.czt.z.jaxb.gen.impl.SchemaTypeElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.SchemaTypeElementImpl.class), 7, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("ProdType" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Type = ((net.sourceforge.czt.z.jaxb.gen.impl.ProdTypeElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.ProdTypeElementImpl.class), 7, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("GenParamType" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Type = ((net.sourceforge.czt.z.jaxb.gen.impl.GenParamTypeElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.GenParamTypeElementImpl.class), 7, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("ClassType" == ___local)&&("http://czt.sourceforge.net/object-z" == ___uri)) {
                            _Type = ((net.sourceforge.czt.oz.jaxb.gen.impl.ClassTypeElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.oz.jaxb.gen.impl.ClassTypeElementImpl.class), 7, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("PowerType" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Type = ((net.sourceforge.czt.z.jaxb.gen.impl.PowerTypeElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.PowerTypeElementImpl.class), 7, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("Type2" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 5;
                            return ;
                        }
                        if (("Type2" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Type = ((net.sourceforge.czt.z.jaxb.gen.impl.Type2ElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.Type2ElementImpl.class), 7, ___uri, ___local, ___qname, __atts));
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
                            _getName().add(((net.sourceforge.czt.z.jaxb.gen.impl.DeclNameImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.DeclNameImpl.class), 3, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("Word" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _getName().add(((net.sourceforge.czt.z.jaxb.gen.impl.DeclNameImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.DeclNameImpl.class), 3, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        _getName().add(((net.sourceforge.czt.z.jaxb.gen.impl.DeclNameImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.DeclNameImpl.class), 3, ___uri, ___local, ___qname, __atts)));
                        return ;
                    case  9 :
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _OptionalType = ((net.sourceforge.czt.z.jaxb.gen.impl.Type2Impl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.Type2Impl.class), 10, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        _OptionalType = ((net.sourceforge.czt.z.jaxb.gen.impl.Type2Impl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.Type2Impl.class), 10, ___uri, ___local, ___qname, __atts));
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
                    case  0 :
                        spawnHandlerFromLeaveElement((((net.sourceforge.czt.z.jaxb.gen.impl.TypeImpl)net.sourceforge.czt.z.jaxb.gen.impl.GenericTypeImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
                        return ;
                    case  6 :
                        if (("Type2" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.popAttributes();
                            state = 7;
                            return ;
                        }
                        break;
                    case  10 :
                        if (("Type2" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.popAttributes();
                            state = 8;
                            return ;
                        }
                        break;
                    case  8 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  5 :
                        _Type = ((net.sourceforge.czt.z.jaxb.gen.impl.Type2Impl) spawnChildFromLeaveElement((net.sourceforge.czt.z.jaxb.gen.impl.Type2Impl.class), 6, ___uri, ___local, ___qname));
                        return ;
                    case  7 :
                        state = 8;
                        continue outer;
                    case  3 :
                        if (("Name" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.popAttributes();
                            state = 4;
                            return ;
                        }
                        break;
                    case  2 :
                        attIdx = context.getAttribute("", "Id");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        _getName().add(((net.sourceforge.czt.z.jaxb.gen.impl.DeclNameImpl) spawnChildFromLeaveElement((net.sourceforge.czt.z.jaxb.gen.impl.DeclNameImpl.class), 3, ___uri, ___local, ___qname)));
                        return ;
                    case  9 :
                        _OptionalType = ((net.sourceforge.czt.z.jaxb.gen.impl.Type2Impl) spawnChildFromLeaveElement((net.sourceforge.czt.z.jaxb.gen.impl.Type2Impl.class), 10, ___uri, ___local, ___qname));
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
                        spawnHandlerFromEnterAttribute((((net.sourceforge.czt.z.jaxb.gen.impl.TypeImpl)net.sourceforge.czt.z.jaxb.gen.impl.GenericTypeImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
                        return ;
                    case  8 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  5 :
                        _Type = ((net.sourceforge.czt.z.jaxb.gen.impl.Type2Impl) spawnChildFromEnterAttribute((net.sourceforge.czt.z.jaxb.gen.impl.Type2Impl.class), 6, ___uri, ___local, ___qname));
                        return ;
                    case  7 :
                        state = 8;
                        continue outer;
                    case  2 :
                        if (("Id" == ___local)&&("" == ___uri)) {
                            _getName().add(((net.sourceforge.czt.z.jaxb.gen.impl.DeclNameImpl) spawnChildFromEnterAttribute((net.sourceforge.czt.z.jaxb.gen.impl.DeclNameImpl.class), 3, ___uri, ___local, ___qname)));
                            return ;
                        }
                        _getName().add(((net.sourceforge.czt.z.jaxb.gen.impl.DeclNameImpl) spawnChildFromEnterAttribute((net.sourceforge.czt.z.jaxb.gen.impl.DeclNameImpl.class), 3, ___uri, ___local, ___qname)));
                        return ;
                    case  9 :
                        _OptionalType = ((net.sourceforge.czt.z.jaxb.gen.impl.Type2Impl) spawnChildFromEnterAttribute((net.sourceforge.czt.z.jaxb.gen.impl.Type2Impl.class), 10, ___uri, ___local, ___qname));
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
                        spawnHandlerFromLeaveAttribute((((net.sourceforge.czt.z.jaxb.gen.impl.TypeImpl)net.sourceforge.czt.z.jaxb.gen.impl.GenericTypeImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
                        return ;
                    case  8 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  5 :
                        _Type = ((net.sourceforge.czt.z.jaxb.gen.impl.Type2Impl) spawnChildFromLeaveAttribute((net.sourceforge.czt.z.jaxb.gen.impl.Type2Impl.class), 6, ___uri, ___local, ___qname));
                        return ;
                    case  7 :
                        state = 8;
                        continue outer;
                    case  2 :
                        attIdx = context.getAttribute("", "Id");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        _getName().add(((net.sourceforge.czt.z.jaxb.gen.impl.DeclNameImpl) spawnChildFromLeaveAttribute((net.sourceforge.czt.z.jaxb.gen.impl.DeclNameImpl.class), 3, ___uri, ___local, ___qname)));
                        return ;
                    case  9 :
                        _OptionalType = ((net.sourceforge.czt.z.jaxb.gen.impl.Type2Impl) spawnChildFromLeaveAttribute((net.sourceforge.czt.z.jaxb.gen.impl.Type2Impl.class), 10, ___uri, ___local, ___qname));
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
                            spawnHandlerFromText((((net.sourceforge.czt.z.jaxb.gen.impl.TypeImpl)net.sourceforge.czt.z.jaxb.gen.impl.GenericTypeImpl.this).new Unmarshaller(context)), 1, value);
                            return ;
                        case  8 :
                            revertToParentFromText(value);
                            return ;
                        case  5 :
                            _Type = ((net.sourceforge.czt.z.jaxb.gen.impl.Type2Impl) spawnChildFromText((net.sourceforge.czt.z.jaxb.gen.impl.Type2Impl.class), 6, value));
                            return ;
                        case  7 :
                            state = 8;
                            continue outer;
                        case  2 :
                            attIdx = context.getAttribute("", "Id");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            _getName().add(((net.sourceforge.czt.z.jaxb.gen.impl.DeclNameImpl) spawnChildFromText((net.sourceforge.czt.z.jaxb.gen.impl.DeclNameImpl.class), 3, value)));
                            return ;
                        case  9 :
                            _OptionalType = ((net.sourceforge.czt.z.jaxb.gen.impl.Type2Impl) spawnChildFromText((net.sourceforge.czt.z.jaxb.gen.impl.Type2Impl.class), 10, value));
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
