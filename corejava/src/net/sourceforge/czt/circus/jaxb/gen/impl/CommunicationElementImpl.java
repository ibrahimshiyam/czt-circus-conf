//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2005.03.03 at 09:16:01 GMT 
//


package net.sourceforge.czt.circus.jaxb.gen.impl;

public class CommunicationElementImpl
    extends net.sourceforge.czt.circus.jaxb.gen.impl.CommunicationImpl
    implements net.sourceforge.czt.circus.jaxb.gen.CommunicationElement, com.sun.xml.bind.RIElement, com.sun.xml.bind.JAXBObject, net.sourceforge.czt.circus.jaxb.gen.impl.runtime.UnmarshallableObject, net.sourceforge.czt.circus.jaxb.gen.impl.runtime.XMLSerializable, net.sourceforge.czt.circus.jaxb.gen.impl.runtime.ValidatableObject
{

    public final static java.lang.Class version = (net.sourceforge.czt.circus.jaxb.gen.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (net.sourceforge.czt.circus.jaxb.gen.CommunicationElement.class);
    }

    public java.lang.String ____jaxb_ri____getNamespaceURI() {
        return "http://czt.sourceforge.net/circus";
    }

    public java.lang.String ____jaxb_ri____getLocalName() {
        return "Communication";
    }

    public net.sourceforge.czt.circus.jaxb.gen.impl.runtime.UnmarshallingEventHandler createUnmarshaller(net.sourceforge.czt.circus.jaxb.gen.impl.runtime.UnmarshallingContext context) {
        return new net.sourceforge.czt.circus.jaxb.gen.impl.CommunicationElementImpl.Unmarshaller(context);
    }

    public void serializeBody(net.sourceforge.czt.circus.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("http://czt.sourceforge.net/circus", "Communication");
        super.serializeURIs(context);
        context.endNamespaceDecls();
        super.serializeAttributes(context);
        context.endAttributes();
        super.serializeBody(context);
        context.endElement();
    }

    public void serializeAttributes(net.sourceforge.czt.circus.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public void serializeURIs(net.sourceforge.czt.circus.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public java.lang.Class getPrimaryInterface() {
        return (net.sourceforge.czt.circus.jaxb.gen.CommunicationElement.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000"
+"\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv."
+"grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000"
+"\fcontentModelt\u0000 Lcom/sun/msv/grammar/Expression;xr\u0000\u001ecom.sun."
+"msv.grammar.Expression\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Lj"
+"ava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0003xppp\u0000sr\u0000\u001fcom.sun.msv.gra"
+"mmar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.BinaryExp"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~\u0000\u0004ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007pps"
+"q\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000x"
+"q\u0000~\u0000\bppsq\u0000~\u0000\u0000sr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000p\u0000sq"
+"\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000eppsr\u0000 com.sun.msv.grammar.OneOrMoreExp\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq"
+"\u0000~\u0000\u0003xq\u0000~\u0000\u0004q\u0000~\u0000\u0012psr\u0000 com.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001"
+"\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0003L\u0000\tnameClassq\u0000~\u0000\u0001xq\u0000~\u0000\u0004q\u0000~\u0000\u0012psr\u00002com.sun.msv.g"
+"rammar.Expression$AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004sq\u0000~\u0000\u0011"
+"\u0001q\u0000~\u0000\u001csr\u0000 com.sun.msv.grammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom"
+".sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.gramm"
+"ar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004q\u0000~\u0000\u001dq\u0000~\u0000\"sr"
+"\u0000#com.sun.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalName"
+"t\u0000\u0012Ljava/lang/String;L\u0000\fnamespaceURIq\u0000~\u0000$xq\u0000~\u0000\u001ft\u0000-net.source"
+"forge.czt.z.jaxb.gen.TermA.AnnsTypet\u0000+http://java.sun.com/ja"
+"xb/xjc/dummy-elementssq\u0000~\u0000\u000eppsq\u0000~\u0000\u0019q\u0000~\u0000\u0012psr\u0000\u001bcom.sun.msv.gra"
+"mmar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Datatyp"
+"e;L\u0000\u0006exceptq\u0000~\u0000\u0003L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~\u0000"
+"\u0004ppsr\u0000\"com.sun.msv.datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com."
+"sun.msv.datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun"
+".msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.dat"
+"atype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000$L\u0000\bty"
+"peNameq\u0000~\u0000$L\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/datatype/xsd/WhiteSp"
+"aceProcessor;xpt\u0000 http://www.w3.org/2001/XMLSchemat\u0000\u0005QNamesr"
+"\u00005com.sun.msv.datatype.xsd.WhiteSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$NullSetExpression\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004q\u0000~\u0000\u0012psr\u0000\u001bcom.sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d"
+"\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000$L\u0000\fnamespaceURIq\u0000~\u0000$xpq\u0000~\u00005q\u0000~\u00004sq\u0000~\u0000#t"
+"\u0000\u0004typet\u0000)http://www.w3.org/2001/XMLSchema-instanceq\u0000~\u0000\"sq\u0000~\u0000"
+"#t\u0000\u0004Annst\u0000\u001ehttp://czt.sourceforge.net/zmlq\u0000~\u0000\"sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000"
+"\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000eppsq\u0000~\u0000\u0016q\u0000~\u0000\u0012psq\u0000~\u0000\u0019q\u0000~\u0000\u0012pq\u0000~\u0000\u001cq\u0000~\u0000 q\u0000~\u0000\"s"
+"q\u0000~\u0000#t\u0000&net.sourceforge.czt.z.jaxb.gen.RefNameq\u0000~\u0000\'sq\u0000~\u0000\u000epps"
+"q\u0000~\u0000\u0019q\u0000~\u0000\u0012pq\u0000~\u0000-q\u0000~\u0000=q\u0000~\u0000\"sq\u0000~\u0000#t\u0000\bChanNamet\u0000!http://czt.sou"
+"rceforge.net/circussq\u0000~\u0000\u000eppsq\u0000~\u0000\u0016q\u0000~\u0000\u0012psq\u0000~\u0000\u000eq\u0000~\u0000\u0012psq\u0000~\u0000\u000eq\u0000~"
+"\u0000\u0012psq\u0000~\u0000\u0000q\u0000~\u0000\u0012p\u0000sq\u0000~\u0000\u000eppsq\u0000~\u0000\u0016q\u0000~\u0000\u0012psq\u0000~\u0000\u0019q\u0000~\u0000\u0012pq\u0000~\u0000\u001cq\u0000~\u0000 q\u0000"
+"~\u0000\"sq\u0000~\u0000#t\u00005net.sourceforge.czt.circus.jaxb.gen.InputFieldEl"
+"ementq\u0000~\u0000\'sq\u0000~\u0000\u0000q\u0000~\u0000\u0012p\u0000sq\u0000~\u0000\u000eppsq\u0000~\u0000\u0016q\u0000~\u0000\u0012psq\u0000~\u0000\u0019q\u0000~\u0000\u0012pq\u0000~\u0000\u001c"
+"q\u0000~\u0000 q\u0000~\u0000\"sq\u0000~\u0000#t\u00006net.sourceforge.czt.circus.jaxb.gen.Outpu"
+"tFieldElementq\u0000~\u0000\'sq\u0000~\u0000\u0000q\u0000~\u0000\u0012p\u0000sq\u0000~\u0000\u000eppsq\u0000~\u0000\u0016q\u0000~\u0000\u0012psq\u0000~\u0000\u0019q\u0000~"
+"\u0000\u0012pq\u0000~\u0000\u001cq\u0000~\u0000 q\u0000~\u0000\"sq\u0000~\u0000#t\u00005net.sourceforge.czt.circus.jaxb.g"
+"en.MixedFieldElementq\u0000~\u0000\'q\u0000~\u0000\"sq\u0000~\u0000\u000eppsq\u0000~\u0000\u0019q\u0000~\u0000\u0012psq\u0000~\u0000*ppsr"
+"\u0000)com.sun.msv.datatype.xsd.EnumerationFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0006val"
+"uest\u0000\u000fLjava/util/Set;xr\u00009com.sun.msv.datatype.xsd.DataTypeWi"
+"thValueConstraintFacet\"\u00a7Ro\u00ca\u00c7\u008aT\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xs"
+"d.DataTypeWithFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0005Z\u0000\fisFacetFixedZ\u0000\u0012needValueChe"
+"ckFlagL\u0000\bbaseTypet\u0000)Lcom/sun/msv/datatype/xsd/XSDatatypeImpl"
+";L\u0000\fconcreteTypet\u0000\'Lcom/sun/msv/datatype/xsd/ConcreteType;L\u0000"
+"\tfacetNameq\u0000~\u0000$xq\u0000~\u00001q\u0000~\u0000Ot\u0000\bCommTypesr\u00005com.sun.msv.datatyp"
+"e.xsd.WhiteSpaceProcessor$Preserve\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u00007\u0000\u0000sr\u0000#com"
+".sun.msv.datatype.xsd.StringType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\risAlwaysValidx"
+"q\u0000~\u0000/q\u0000~\u00004t\u0000\u0006stringq\u0000~\u0000r\u0001q\u0000~\u0000tt\u0000\u000benumerationsr\u0000\u0011java.util.Ha"
+"shSet\u00baD\u0085\u0095\u0096\u00b8\u00b74\u0003\u0000\u0000xpw\f\u0000\u0000\u0000\u0010?@\u0000\u0000\u0000\u0000\u0000\u0004t\u0000\u0005Syncht\u0000\u0006Outputt\u0000\u0005Mixedt\u0000\u0005"
+"Inputxq\u0000~\u0000:sq\u0000~\u0000;q\u0000~\u0000pq\u0000~\u0000Osq\u0000~\u0000#t\u0000\bCommTypet\u0000\u0000q\u0000~\u0000\"sq\u0000~\u0000\u000epp"
+"sq\u0000~\u0000\u0019q\u0000~\u0000\u0012psq\u0000~\u0000*ppsr\u0000/com.sun.msv.datatype.xsd.NonNegative"
+"IntegerType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000$com.sun.msv.datatype.xsd.IntegerTy"
+"pe\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000+com.sun.msv.datatype.xsd.IntegerDerivedType"
+"\u0099\u00f1]\u0090&6k\u00be\u0002\u0000\u0001L\u0000\nbaseFacetsq\u0000~\u0000mxq\u0000~\u0000/q\u0000~\u00004t\u0000\u0012nonNegativeIntege"
+"rq\u0000~\u00008sr\u0000*com.sun.msv.datatype.xsd.MinInclusiveFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001"
+"\u0002\u0000\u0000xr\u0000#com.sun.msv.datatype.xsd.RangeFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\nlimi"
+"tValuet\u0000\u0012Ljava/lang/Object;xq\u0000~\u0000kppq\u0000~\u00008\u0000\u0000sq\u0000~\u0000\u0085q\u0000~\u00004t\u0000\u0007inte"
+"gerq\u0000~\u00008sr\u0000,com.sun.msv.datatype.xsd.FractionDigitsFacet\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0001\u0002\u0000\u0001I\u0000\u0005scalexr\u0000;com.sun.msv.datatype.xsd.DataTypeWithLexi"
+"calConstraintFacetT\u0090\u001c>\u001azb\u00ea\u0002\u0000\u0000xq\u0000~\u0000lppq\u0000~\u00008\u0001\u0000sr\u0000#com.sun.msv."
+"datatype.xsd.NumberType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000/q\u0000~\u00004t\u0000\u0007decimalq\u0000~\u00008"
+"q\u0000~\u0000\u0093t\u0000\u000efractionDigits\u0000\u0000\u0000\u0000q\u0000~\u0000\u008dt\u0000\fminInclusivesr\u0000)com.sun.ms"
+"v.datatype.xsd.IntegerValueType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0005valueq\u0000~\u0000$xr\u0000\u0010j"
+"ava.lang.Number\u0086\u00ac\u0095\u001d\u000b\u0094\u00e0\u008b\u0002\u0000\u0000xpt\u0000\u00010q\u0000~\u0000:sq\u0000~\u0000;q\u0000~\u0000\u0088q\u0000~\u00004sq\u0000~\u0000#t"
+"\u0000\tMultiSychq\u0000~\u0000\u0080q\u0000~\u0000\"sq\u0000~\u0000\u000eppsq\u0000~\u0000\u0019q\u0000~\u0000\u0012pq\u0000~\u0000-q\u0000~\u0000=q\u0000~\u0000\"sq\u0000~"
+"\u0000#t\u0000\rCommunicationq\u0000~\u0000Osr\u0000\"com.sun.msv.grammar.ExpressionPoo"
+"l\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/ExpressionPoo"
+"l$ClosedHash;xpsr\u0000-com.sun.msv.grammar.ExpressionPool$Closed"
+"Hash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstreamVersionL\u0000\u0006parentt\u0000$Lcom/sun/"
+"msv/grammar/ExpressionPool;xp\u0000\u0000\u0000\u001b\u0001pq\u0000~\u0000(q\u0000~\u0000Kq\u0000~\u0000\u000bq\u0000~\u0000\u009eq\u0000~\u0000f"
+"q\u0000~\u0000Pq\u0000~\u0000\u0015q\u0000~\u0000Fq\u0000~\u0000Uq\u0000~\u0000[q\u0000~\u0000aq\u0000~\u0000Rq\u0000~\u0000\tq\u0000~\u0000\nq\u0000~\u0000\u000fq\u0000~\u0000\rq\u0000~\u0000S"
+"q\u0000~\u0000\u0013q\u0000~\u0000Dq\u0000~\u0000\u0081q\u0000~\u0000Qq\u0000~\u0000\u0018q\u0000~\u0000Gq\u0000~\u0000Vq\u0000~\u0000\\q\u0000~\u0000bq\u0000~\u0000\fx"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends net.sourceforge.czt.circus.jaxb.gen.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(net.sourceforge.czt.circus.jaxb.gen.impl.runtime.UnmarshallingContext context) {
            super(context, "----");
        }

        protected Unmarshaller(net.sourceforge.czt.circus.jaxb.gen.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return net.sourceforge.czt.circus.jaxb.gen.impl.CommunicationElementImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  1 :
                        attIdx = context.getAttribute("", "CommType");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        attIdx = context.getAttribute("", "MultiSych");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.circus.jaxb.gen.impl.CommunicationImpl)net.sourceforge.czt.circus.jaxb.gen.impl.CommunicationElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("ChanName" == ___local)&&("http://czt.sourceforge.net/circus" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.circus.jaxb.gen.impl.CommunicationImpl)net.sourceforge.czt.circus.jaxb.gen.impl.CommunicationElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        spawnHandlerFromEnterElement((((net.sourceforge.czt.circus.jaxb.gen.impl.CommunicationImpl)net.sourceforge.czt.circus.jaxb.gen.impl.CommunicationElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                        return ;
                    case  0 :
                        if (("Communication" == ___local)&&("http://czt.sourceforge.net/circus" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 1;
                            return ;
                        }
                        break;
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
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        attIdx = context.getAttribute("", "CommType");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "MultiSych");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        spawnHandlerFromLeaveElement((((net.sourceforge.czt.circus.jaxb.gen.impl.CommunicationImpl)net.sourceforge.czt.circus.jaxb.gen.impl.CommunicationElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                        return ;
                    case  2 :
                        if (("Communication" == ___local)&&("http://czt.sourceforge.net/circus" == ___uri)) {
                            context.popAttributes();
                            state = 3;
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
                    case  3 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        if (("CommType" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((net.sourceforge.czt.circus.jaxb.gen.impl.CommunicationImpl)net.sourceforge.czt.circus.jaxb.gen.impl.CommunicationElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                            return ;
                        }
                        if (("MultiSych" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((net.sourceforge.czt.circus.jaxb.gen.impl.CommunicationImpl)net.sourceforge.czt.circus.jaxb.gen.impl.CommunicationElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                            return ;
                        }
                        spawnHandlerFromEnterAttribute((((net.sourceforge.czt.circus.jaxb.gen.impl.CommunicationImpl)net.sourceforge.czt.circus.jaxb.gen.impl.CommunicationElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                    case  3 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        attIdx = context.getAttribute("", "CommType");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "MultiSych");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        spawnHandlerFromLeaveAttribute((((net.sourceforge.czt.circus.jaxb.gen.impl.CommunicationImpl)net.sourceforge.czt.circus.jaxb.gen.impl.CommunicationElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                        case  3 :
                            revertToParentFromText(value);
                            return ;
                        case  1 :
                            attIdx = context.getAttribute("", "CommType");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            attIdx = context.getAttribute("", "MultiSych");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            spawnHandlerFromText((((net.sourceforge.czt.circus.jaxb.gen.impl.CommunicationImpl)net.sourceforge.czt.circus.jaxb.gen.impl.CommunicationElementImpl.this).new Unmarshaller(context)), 2, value);
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
