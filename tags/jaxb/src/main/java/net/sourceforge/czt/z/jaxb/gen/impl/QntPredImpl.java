//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.5-b16-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.06.26 at 02:10:37 PM NZST 
//


package net.sourceforge.czt.z.jaxb.gen.impl;

public class QntPredImpl
    extends net.sourceforge.czt.z.jaxb.gen.impl.PredImpl
    implements net.sourceforge.czt.z.jaxb.gen.QntPred, com.sun.xml.bind.JAXBObject, net.sourceforge.czt.circus.jaxb.gen.impl.runtime.UnmarshallableObject, net.sourceforge.czt.circus.jaxb.gen.impl.runtime.XMLSerializable, net.sourceforge.czt.circus.jaxb.gen.impl.runtime.ValidatableObject
{

    protected net.sourceforge.czt.z.jaxb.gen.SchText _SchText;
    protected net.sourceforge.czt.z.jaxb.gen.Pred _Pred;
    public final static java.lang.Class version = (net.sourceforge.czt.z.jaxb.gen.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (net.sourceforge.czt.z.jaxb.gen.QntPred.class);
    }

    public net.sourceforge.czt.z.jaxb.gen.SchText getSchText() {
        return _SchText;
    }

    public void setSchText(net.sourceforge.czt.z.jaxb.gen.SchText value) {
        _SchText = value;
    }

    public net.sourceforge.czt.z.jaxb.gen.Pred getPred() {
        return _Pred;
    }

    public void setPred(net.sourceforge.czt.z.jaxb.gen.Pred value) {
        _Pred = value;
    }

    public net.sourceforge.czt.circus.jaxb.gen.impl.runtime.UnmarshallingEventHandler createUnmarshaller(net.sourceforge.czt.circus.jaxb.gen.impl.runtime.UnmarshallingContext context) {
        return new net.sourceforge.czt.z.jaxb.gen.impl.QntPredImpl.Unmarshaller(context);
    }

    public void serializeBody(net.sourceforge.czt.circus.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        super.serializeBody(context);
        if (_SchText instanceof javax.xml.bind.Element) {
            context.childAsBody(((com.sun.xml.bind.JAXBObject) _SchText), "SchText");
        } else {
            context.startElement("http://czt.sourceforge.net/zml", "SchText");
            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _SchText), "SchText");
            context.endNamespaceDecls();
            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _SchText), "SchText");
            context.endAttributes();
            context.childAsBody(((com.sun.xml.bind.JAXBObject) _SchText), "SchText");
            context.endElement();
        }
        if (_Pred instanceof javax.xml.bind.Element) {
            context.childAsBody(((com.sun.xml.bind.JAXBObject) _Pred), "Pred");
        } else {
            context.startElement("http://czt.sourceforge.net/zml", "Pred");
            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Pred), "Pred");
            context.endNamespaceDecls();
            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Pred), "Pred");
            context.endAttributes();
            context.childAsBody(((com.sun.xml.bind.JAXBObject) _Pred), "Pred");
            context.endElement();
        }
    }

    public void serializeAttributes(net.sourceforge.czt.circus.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        super.serializeAttributes(context);
        if (_SchText instanceof javax.xml.bind.Element) {
            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _SchText), "SchText");
        }
        if (_Pred instanceof javax.xml.bind.Element) {
            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Pred), "Pred");
        }
    }

    public void serializeURIs(net.sourceforge.czt.circus.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        super.serializeURIs(context);
        if (_SchText instanceof javax.xml.bind.Element) {
            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _SchText), "SchText");
        }
        if (_Pred instanceof javax.xml.bind.Element) {
            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Pred), "Pred");
        }
    }

    public java.lang.Class getPrimaryInterface() {
        return (net.sourceforge.czt.z.jaxb.gen.QntPred.class);
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
+"URIq\u0000~\u0000 xq\u0000~\u0000\u001bt\u0000,net.sourceforge.czt.z.jaxb.gen.Term.AnnsTyp"
+"et\u0000+http://java.sun.com/jaxb/xjc/dummy-elementssq\u0000~\u0000\u0007ppsq\u0000~\u0000"
+"\u0015q\u0000~\u0000\u000epsr\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLor"
+"g/relaxng/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004namet\u0000\u001dLcom/sun"
+"/msv/util/StringPair;xq\u0000~\u0000\u0003ppsr\u0000\"com.sun.msv.datatype.xsd.Qn"
+"ameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.BuiltinAtomic"
+"Type\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000"
+"\u0003L\u0000\fnamespaceUriq\u0000~\u0000 L\u0000\btypeNameq\u0000~\u0000 L\u0000\nwhiteSpacet\u0000.Lcom/su"
+"n/msv/datatype/xsd/WhiteSpaceProcessor;xpt\u0000 http://www.w3.or"
+"g/2001/XMLSchemat\u0000\u0005QNamesr\u00005com.sun.msv.datatype.xsd.WhiteSp"
+"aceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd"
+".WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Exp"
+"ression$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000\u000epsr\u0000\u001bcom.sun."
+"msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000 L\u0000\fnamespaceU"
+"RIq\u0000~\u0000 xpq\u0000~\u00001q\u0000~\u00000sq\u0000~\u0000\u001ft\u0000\u0004typet\u0000)http://www.w3.org/2001/XM"
+"LSchema-instanceq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000\u0004Annst\u0000\u001ehttp://czt.sourceforge."
+"net/zmlq\u0000~\u0000\u001esq\u0000~\u0000\tpp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0012q\u0000~\u0000\u000epsq\u0000~\u0000\u0015q\u0000~\u0000\u000epq\u0000~\u0000\u0018q\u0000"
+"~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000.net.sourceforge.czt.z.jaxb.gen.ZSchTextElem"
+"entq\u0000~\u0000#sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~"
+"\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\tpp\u0000sq\u0000~\u0000\u0007p"
+"psq\u0000~\u0000\u0012q\u0000~\u0000\u000epsq\u0000~\u0000\u0015q\u0000~\u0000\u000epq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000*net.sourcef"
+"orge.czt.z.jaxb.gen.ImpliesPredq\u0000~\u0000#sq\u0000~\u0000\tpp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0012q"
+"\u0000~\u0000\u000epsq\u0000~\u0000\u0015q\u0000~\u0000\u000epq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000)net.sourceforge.czt"
+".z.jaxb.gen.ForallPredq\u0000~\u0000#sq\u0000~\u0000\tpp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0012q\u0000~\u0000\u000epsq\u0000~"
+"\u0000\u0015q\u0000~\u0000\u000epq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000%net.sourceforge.czt.z.jaxb.g"
+"en.OrPredq\u0000~\u0000#sq\u0000~\u0000\tpp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0012q\u0000~\u0000\u000epsq\u0000~\u0000\u0015q\u0000~\u0000\u000epq\u0000~\u0000\u0018"
+"q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000\'net.sourceforge.czt.z.jaxb.gen.TruePredq\u0000"
+"~\u0000#sq\u0000~\u0000\tpp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0012q\u0000~\u0000\u000epsq\u0000~\u0000\u0015q\u0000~\u0000\u000epq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001es"
+"q\u0000~\u0000\u001ft\u0000-net.sourceforge.czt.z.jaxb.gen.MemPredElementq\u0000~\u0000#sq"
+"\u0000~\u0000\tpp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0012q\u0000~\u0000\u000epsq\u0000~\u0000\u0015q\u0000~\u0000\u000epq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001f"
+"t\u0000&net.sourceforge.czt.z.jaxb.gen.IffPredq\u0000~\u0000#sq\u0000~\u0000\tpp\u0000sq\u0000~\u0000"
+"\u0007ppsq\u0000~\u0000\u0012q\u0000~\u0000\u000epsq\u0000~\u0000\u0015q\u0000~\u0000\u000epq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00003net.sourc"
+"eforge.czt.zpatt.jaxb.gen.JokerPredElementq\u0000~\u0000#sq\u0000~\u0000\tpp\u0000sq\u0000~"
+"\u0000\u0007ppsq\u0000~\u0000\u0012q\u0000~\u0000\u000epsq\u0000~\u0000\u0015q\u0000~\u0000\u000epq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000-net.sour"
+"ceforge.czt.z.jaxb.gen.AndPredElementq\u0000~\u0000#sq\u0000~\u0000\tpp\u0000sq\u0000~\u0000\u0007pps"
+"q\u0000~\u0000\u0012q\u0000~\u0000\u000epsq\u0000~\u0000\u0015q\u0000~\u0000\u000epq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000)net.sourcefor"
+"ge.czt.z.jaxb.gen.ExistsPredq\u0000~\u0000#sq\u0000~\u0000\tpp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0012q\u0000~\u0000"
+"\u000epsq\u0000~\u0000\u0015q\u0000~\u0000\u000epq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000*net.sourceforge.czt.z."
+"jaxb.gen.Exists1Predq\u0000~\u0000#sq\u0000~\u0000\tpp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0012q\u0000~\u0000\u000epsq\u0000~\u0000\u0015"
+"q\u0000~\u0000\u000epq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000-net.sourceforge.czt.z.jaxb.gen"
+".NegPredElementq\u0000~\u0000#sq\u0000~\u0000\tpp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0012q\u0000~\u0000\u000epsq\u0000~\u0000\u0015q\u0000~\u0000\u000e"
+"pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000.net.sourceforge.czt.z.jaxb.gen.Expr"
+"PredElementq\u0000~\u0000#sq\u0000~\u0000\tpp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0012q\u0000~\u0000\u000epsq\u0000~\u0000\u0015q\u0000~\u0000\u000epq\u0000~"
+"\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000(net.sourceforge.czt.z.jaxb.gen.FalsePre"
+"dq\u0000~\u0000#sr\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bex"
+"pTablet\u0000/Lcom/sun/msv/grammar/ExpressionPool$ClosedHash;xpsr"
+"\u0000-com.sun.msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000"
+"\u0005countB\u0000\rstreamVersionL\u0000\u0006parentt\u0000$Lcom/sun/msv/grammar/Expre"
+"ssionPool;xp\u0000\u0000\u0000/\u0001pq\u0000~\u0000\u0014q\u0000~\u0000Aq\u0000~\u0000Sq\u0000~\u0000Yq\u0000~\u0000_q\u0000~\u0000eq\u0000~\u0000kq\u0000~\u0000Mq\u0000"
+"~\u0000qq\u0000~\u0000wq\u0000~\u0000}q\u0000~\u0000\u0083q\u0000~\u0000Iq\u0000~\u0000\u0089q\u0000~\u0000\u008fq\u0000~\u0000\u0095q\u0000~\u0000\u009bq\u0000~\u0000$q\u0000~\u0000Eq\u0000~\u0000\u0006q\u0000"
+"~\u0000\u0005q\u0000~\u0000Nq\u0000~\u0000Pq\u0000~\u0000\u000fq\u0000~\u0000\bq\u0000~\u0000Oq\u0000~\u0000Kq\u0000~\u0000\u0011q\u0000~\u0000@q\u0000~\u0000Rq\u0000~\u0000Xq\u0000~\u0000^q\u0000"
+"~\u0000dq\u0000~\u0000jq\u0000~\u0000pq\u0000~\u0000Lq\u0000~\u0000vq\u0000~\u0000|q\u0000~\u0000\u0082q\u0000~\u0000\u0088q\u0000~\u0000\u008eq\u0000~\u0000\u0094q\u0000~\u0000\u009aq\u0000~\u0000Gq\u0000"
+"~\u0000Jq\u0000~\u0000Fq\u0000~\u0000Hx"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends net.sourceforge.czt.circus.jaxb.gen.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(net.sourceforge.czt.circus.jaxb.gen.impl.runtime.UnmarshallingContext context) {
            super(context, "--------");
        }

        protected Unmarshaller(net.sourceforge.czt.circus.jaxb.gen.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return net.sourceforge.czt.z.jaxb.gen.impl.QntPredImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  1 :
                        if (("ZSchText" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _SchText = ((net.sourceforge.czt.z.jaxb.gen.impl.ZSchTextElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.ZSchTextElementImpl.class), 4, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("SchText" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 2;
                            return ;
                        }
                        if (("SchText" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _SchText = ((net.sourceforge.czt.z.jaxb.gen.impl.SchTextElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.SchTextElementImpl.class), 4, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        break;
                    case  6 :
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Pred = ((net.sourceforge.czt.z.jaxb.gen.impl.PredImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.PredImpl.class), 7, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        _Pred = ((net.sourceforge.czt.z.jaxb.gen.impl.PredImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.PredImpl.class), 7, ___uri, ___local, ___qname, __atts));
                        return ;
                    case  5 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  0 :
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.PredImpl)net.sourceforge.czt.z.jaxb.gen.impl.QntPredImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.PredImpl)net.sourceforge.czt.z.jaxb.gen.impl.QntPredImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname, __atts);
                        return ;
                    case  4 :
                        if (("ImpliesPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Pred = ((net.sourceforge.czt.z.jaxb.gen.impl.ImpliesPredImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.ImpliesPredImpl.class), 5, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("ForallPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Pred = ((net.sourceforge.czt.z.jaxb.gen.impl.ForallPredImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.ForallPredImpl.class), 5, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("OrPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Pred = ((net.sourceforge.czt.z.jaxb.gen.impl.OrPredImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.OrPredImpl.class), 5, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("TruePred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Pred = ((net.sourceforge.czt.z.jaxb.gen.impl.TruePredImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.TruePredImpl.class), 5, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("MemPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Pred = ((net.sourceforge.czt.z.jaxb.gen.impl.MemPredElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.MemPredElementImpl.class), 5, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("IffPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Pred = ((net.sourceforge.czt.z.jaxb.gen.impl.IffPredImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.IffPredImpl.class), 5, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("JokerPred" == ___local)&&("http://czt.sourceforge.net/zpatt" == ___uri)) {
                            _Pred = ((net.sourceforge.czt.zpatt.jaxb.gen.impl.JokerPredElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.zpatt.jaxb.gen.impl.JokerPredElementImpl.class), 5, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("AndPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Pred = ((net.sourceforge.czt.z.jaxb.gen.impl.AndPredElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.AndPredElementImpl.class), 5, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("ExistsPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Pred = ((net.sourceforge.czt.z.jaxb.gen.impl.ExistsPredImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.ExistsPredImpl.class), 5, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("Exists1Pred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Pred = ((net.sourceforge.czt.z.jaxb.gen.impl.Exists1PredImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.Exists1PredImpl.class), 5, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("NegPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Pred = ((net.sourceforge.czt.z.jaxb.gen.impl.NegPredElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.NegPredElementImpl.class), 5, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("ExprPred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Pred = ((net.sourceforge.czt.z.jaxb.gen.impl.ExprPredElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.ExprPredElementImpl.class), 5, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("FalsePred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Pred = ((net.sourceforge.czt.z.jaxb.gen.impl.FalsePredImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.FalsePredImpl.class), 5, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("Pred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 6;
                            return ;
                        }
                        if (("Pred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Pred = ((net.sourceforge.czt.z.jaxb.gen.impl.PredElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.PredElementImpl.class), 5, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        break;
                    case  2 :
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _SchText = ((net.sourceforge.czt.z.jaxb.gen.impl.SchTextImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.SchTextImpl.class), 3, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        _SchText = ((net.sourceforge.czt.z.jaxb.gen.impl.SchTextImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.SchTextImpl.class), 3, ___uri, ___local, ___qname, __atts));
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
                        if (("SchText" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.popAttributes();
                            state = 4;
                            return ;
                        }
                        break;
                    case  6 :
                        _Pred = ((net.sourceforge.czt.z.jaxb.gen.impl.PredImpl) spawnChildFromLeaveElement((net.sourceforge.czt.z.jaxb.gen.impl.PredImpl.class), 7, ___uri, ___local, ___qname));
                        return ;
                    case  5 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  0 :
                        spawnHandlerFromLeaveElement((((net.sourceforge.czt.z.jaxb.gen.impl.PredImpl)net.sourceforge.czt.z.jaxb.gen.impl.QntPredImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
                        return ;
                    case  7 :
                        if (("Pred" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            context.popAttributes();
                            state = 5;
                            return ;
                        }
                        break;
                    case  2 :
                        _SchText = ((net.sourceforge.czt.z.jaxb.gen.impl.SchTextImpl) spawnChildFromLeaveElement((net.sourceforge.czt.z.jaxb.gen.impl.SchTextImpl.class), 3, ___uri, ___local, ___qname));
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
                    case  6 :
                        _Pred = ((net.sourceforge.czt.z.jaxb.gen.impl.PredImpl) spawnChildFromEnterAttribute((net.sourceforge.czt.z.jaxb.gen.impl.PredImpl.class), 7, ___uri, ___local, ___qname));
                        return ;
                    case  5 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  0 :
                        spawnHandlerFromEnterAttribute((((net.sourceforge.czt.z.jaxb.gen.impl.PredImpl)net.sourceforge.czt.z.jaxb.gen.impl.QntPredImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
                        return ;
                    case  2 :
                        _SchText = ((net.sourceforge.czt.z.jaxb.gen.impl.SchTextImpl) spawnChildFromEnterAttribute((net.sourceforge.czt.z.jaxb.gen.impl.SchTextImpl.class), 3, ___uri, ___local, ___qname));
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
                    case  6 :
                        _Pred = ((net.sourceforge.czt.z.jaxb.gen.impl.PredImpl) spawnChildFromLeaveAttribute((net.sourceforge.czt.z.jaxb.gen.impl.PredImpl.class), 7, ___uri, ___local, ___qname));
                        return ;
                    case  5 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  0 :
                        spawnHandlerFromLeaveAttribute((((net.sourceforge.czt.z.jaxb.gen.impl.PredImpl)net.sourceforge.czt.z.jaxb.gen.impl.QntPredImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
                        return ;
                    case  2 :
                        _SchText = ((net.sourceforge.czt.z.jaxb.gen.impl.SchTextImpl) spawnChildFromLeaveAttribute((net.sourceforge.czt.z.jaxb.gen.impl.SchTextImpl.class), 3, ___uri, ___local, ___qname));
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
                        case  6 :
                            _Pred = ((net.sourceforge.czt.z.jaxb.gen.impl.PredImpl) spawnChildFromText((net.sourceforge.czt.z.jaxb.gen.impl.PredImpl.class), 7, value));
                            return ;
                        case  5 :
                            revertToParentFromText(value);
                            return ;
                        case  0 :
                            spawnHandlerFromText((((net.sourceforge.czt.z.jaxb.gen.impl.PredImpl)net.sourceforge.czt.z.jaxb.gen.impl.QntPredImpl.this).new Unmarshaller(context)), 1, value);
                            return ;
                        case  2 :
                            _SchText = ((net.sourceforge.czt.z.jaxb.gen.impl.SchTextImpl) spawnChildFromText((net.sourceforge.czt.z.jaxb.gen.impl.SchTextImpl.class), 3, value));
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
