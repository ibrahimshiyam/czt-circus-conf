//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2005.03.03 at 09:16:01 GMT 
//


package net.sourceforge.czt.circus.jaxb.gen.impl;

public class Action1Impl
    extends net.sourceforge.czt.circus.jaxb.gen.impl.ActionImpl
    implements net.sourceforge.czt.circus.jaxb.gen.Action1, com.sun.xml.bind.JAXBObject, net.sourceforge.czt.circus.jaxb.gen.impl.runtime.UnmarshallableObject, net.sourceforge.czt.circus.jaxb.gen.impl.runtime.XMLSerializable, net.sourceforge.czt.circus.jaxb.gen.impl.runtime.ValidatableObject
{

    protected net.sourceforge.czt.circus.jaxb.gen.Action _Action;
    public final static java.lang.Class version = (net.sourceforge.czt.circus.jaxb.gen.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (net.sourceforge.czt.circus.jaxb.gen.Action1 .class);
    }

    public net.sourceforge.czt.circus.jaxb.gen.Action getAction() {
        return _Action;
    }

    public void setAction(net.sourceforge.czt.circus.jaxb.gen.Action value) {
        _Action = value;
    }

    public net.sourceforge.czt.circus.jaxb.gen.impl.runtime.UnmarshallingEventHandler createUnmarshaller(net.sourceforge.czt.circus.jaxb.gen.impl.runtime.UnmarshallingContext context) {
        return new net.sourceforge.czt.circus.jaxb.gen.impl.Action1Impl.Unmarshaller(context);
    }

    public void serializeBody(net.sourceforge.czt.circus.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        super.serializeBody(context);
        if (_Action instanceof javax.xml.bind.Element) {
            context.childAsBody(((com.sun.xml.bind.JAXBObject) _Action), "Action");
        } else {
            context.startElement("http://czt.sourceforge.net/circus", "Action");
            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Action), "Action");
            context.endNamespaceDecls();
            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Action), "Action");
            context.endAttributes();
            context.childAsBody(((com.sun.xml.bind.JAXBObject) _Action), "Action");
            context.endElement();
        }
    }

    public void serializeAttributes(net.sourceforge.czt.circus.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        super.serializeAttributes(context);
        if (_Action instanceof javax.xml.bind.Element) {
            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Action), "Action");
        }
    }

    public void serializeURIs(net.sourceforge.czt.circus.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        super.serializeURIs(context);
        if (_Action instanceof javax.xml.bind.Element) {
            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Action), "Action");
        }
    }

    public java.lang.Class getPrimaryInterface() {
        return (net.sourceforge.czt.circus.jaxb.gen.Action1 .class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000b"
+"expandedExpq\u0000~\u0000\u0002xpppsr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001ppsr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom."
+"sun.msv.grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttr"
+"ibutesL\u0000\fcontentModelq\u0000~\u0000\u0002xq\u0000~\u0000\u0003sr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa"
+"\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000p\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\bpp\u0000sq\u0000~\u0000\u0006ppsr\u0000 com.sun.msv.gr"
+"ammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.UnaryEx"
+"p\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0002xq\u0000~\u0000\u0003q\u0000~\u0000\rpsr\u0000 com.sun.msv.grammar.A"
+"ttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClassq\u0000~\u0000\txq\u0000~\u0000\u0003q\u0000~\u0000"
+"\rpsr\u00002com.sun.msv.grammar.Expression$AnyStringExpression\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003sq\u0000~\u0000\f\u0001q\u0000~\u0000\u0017sr\u0000 com.sun.msv.grammar.AnyNameClas"
+"s\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr"
+"\u00000com.sun.msv.grammar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000"
+"\u0000xq\u0000~\u0000\u0003q\u0000~\u0000\u0018q\u0000~\u0000\u001dsr\u0000#com.sun.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/String;L\u0000\fnamespaceURIq\u0000~\u0000\u001f"
+"xq\u0000~\u0000\u001at\u0000-net.sourceforge.czt.z.jaxb.gen.TermA.AnnsTypet\u0000+htt"
+"p://java.sun.com/jaxb/xjc/dummy-elementssq\u0000~\u0000\u0006ppsq\u0000~\u0000\u0014q\u0000~\u0000\rp"
+"sr\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relax"
+"ng/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004namet\u0000\u001dLcom/sun/msv/ut"
+"il/StringPair;xq\u0000~\u0000\u0003ppsr\u0000\"com.sun.msv.datatype.xsd.QnameType"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000"
+"xr\u0000\'com.sun.msv.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnam"
+"espaceUriq\u0000~\u0000\u001fL\u0000\btypeNameq\u0000~\u0000\u001fL\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/d"
+"atatype/xsd/WhiteSpaceProcessor;xpt\u0000 http://www.w3.org/2001/"
+"XMLSchemat\u0000\u0005QNamesr\u00005com.sun.msv.datatype.xsd.WhiteSpaceProc"
+"essor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.WhiteS"
+"paceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression"
+"$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000\rpsr\u0000\u001bcom.sun.msv.uti"
+"l.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u001fL\u0000\fnamespaceURIq\u0000~\u0000\u001f"
+"xpq\u0000~\u00000q\u0000~\u0000/sq\u0000~\u0000\u001et\u0000\u0004typet\u0000)http://www.w3.org/2001/XMLSchema"
+"-instanceq\u0000~\u0000\u001dsq\u0000~\u0000\u001et\u0000\u0004Annst\u0000\u001ehttp://czt.sourceforge.net/zml"
+"q\u0000~\u0000\u001dsq\u0000~\u0000\u0006ppsq\u0000~\u0000\u0006ppsq\u0000~\u0000\u0006ppsq\u0000~\u0000\u0006ppsq\u0000~\u0000\u0006ppsq\u0000~\u0000\u0006ppsq\u0000~\u0000\u0006p"
+"psq\u0000~\u0000\u0006ppsq\u0000~\u0000\u0006ppsq\u0000~\u0000\u0006ppsq\u0000~\u0000\u0006ppsq\u0000~\u0000\u0006ppsq\u0000~\u0000\u0006ppsq\u0000~\u0000\u0006ppsq\u0000"
+"~\u0000\u0006ppsq\u0000~\u0000\u0006ppsq\u0000~\u0000\u0006ppsq\u0000~\u0000\u0006ppsq\u0000~\u0000\u0006ppsq\u0000~\u0000\u0006ppsq\u0000~\u0000\u0006ppsq\u0000~\u0000\u0006p"
+"psq\u0000~\u0000\u0006ppsq\u0000~\u0000\u0006ppsq\u0000~\u0000\bpp\u0000sq\u0000~\u0000\u0006ppsq\u0000~\u0000\u0011q\u0000~\u0000\rpsq\u0000~\u0000\u0014q\u0000~\u0000\rpq\u0000"
+"~\u0000\u0017q\u0000~\u0000\u001bq\u0000~\u0000\u001dsq\u0000~\u0000\u001et\u00009net.sourceforge.czt.circus.jaxb.gen.Va"
+"rDeclCommandElementq\u0000~\u0000\"sq\u0000~\u0000\bpp\u0000sq\u0000~\u0000\u0006ppsq\u0000~\u0000\u0011q\u0000~\u0000\rpsq\u0000~\u0000\u0014q"
+"\u0000~\u0000\rpq\u0000~\u0000\u0017q\u0000~\u0000\u001bq\u0000~\u0000\u001dsq\u0000~\u0000\u001et\u0000;net.sourceforge.czt.circus.jaxb"
+".gen.IfGuardedCommandElementq\u0000~\u0000\"sq\u0000~\u0000\bpp\u0000sq\u0000~\u0000\u0006ppsq\u0000~\u0000\u0011q\u0000~\u0000"
+"\rpsq\u0000~\u0000\u0014q\u0000~\u0000\rpq\u0000~\u0000\u0017q\u0000~\u0000\u001bq\u0000~\u0000\u001dsq\u0000~\u0000\u001et\u0000-net.sourceforge.czt.ci"
+"rcus.jaxb.gen.SeqActionq\u0000~\u0000\"sq\u0000~\u0000\bpp\u0000sq\u0000~\u0000\u0006ppsq\u0000~\u0000\u0011q\u0000~\u0000\rpsq\u0000"
+"~\u0000\u0014q\u0000~\u0000\rpq\u0000~\u0000\u0017q\u0000~\u0000\u001bq\u0000~\u0000\u001dsq\u0000~\u0000\u001et\u0000:net.sourceforge.czt.circus."
+"jaxb.gen.PrefixingActionElementq\u0000~\u0000\"sq\u0000~\u0000\bpp\u0000sq\u0000~\u0000\u0006ppsq\u0000~\u0000\u0011q"
+"\u0000~\u0000\rpsq\u0000~\u0000\u0014q\u0000~\u0000\rpq\u0000~\u0000\u0017q\u0000~\u0000\u001bq\u0000~\u0000\u001dsq\u0000~\u0000\u001et\u00004net.sourceforge.czt"
+".circus.jaxb.gen.ExtChoiceActionRq\u0000~\u0000\"sq\u0000~\u0000\bpp\u0000sq\u0000~\u0000\u0006ppsq\u0000~\u0000"
+"\u0011q\u0000~\u0000\rpsq\u0000~\u0000\u0014q\u0000~\u0000\rpq\u0000~\u0000\u0017q\u0000~\u0000\u001bq\u0000~\u0000\u001dsq\u0000~\u0000\u001et\u0000<net.sourceforge.c"
+"zt.circus.jaxb.gen.AssignmentCommandElementq\u0000~\u0000\"sq\u0000~\u0000\bpp\u0000sq\u0000"
+"~\u0000\u0006ppsq\u0000~\u0000\u0011q\u0000~\u0000\rpsq\u0000~\u0000\u0014q\u0000~\u0000\rpq\u0000~\u0000\u0017q\u0000~\u0000\u001bq\u0000~\u0000\u001dsq\u0000~\u0000\u001et\u0000.net.sou"
+"rceforge.czt.circus.jaxb.gen.SkipActionq\u0000~\u0000\"sq\u0000~\u0000\bpp\u0000sq\u0000~\u0000\u0006p"
+"psq\u0000~\u0000\u0011q\u0000~\u0000\rpsq\u0000~\u0000\u0014q\u0000~\u0000\rpq\u0000~\u0000\u0017q\u0000~\u0000\u001bq\u0000~\u0000\u001dsq\u0000~\u0000\u001et\u00005net.sourcef"
+"orge.czt.circus.jaxb.gen.FormalParamActionq\u0000~\u0000\"sq\u0000~\u0000\bpp\u0000sq\u0000~"
+"\u0000\u0006ppsq\u0000~\u0000\u0011q\u0000~\u0000\rpsq\u0000~\u0000\u0014q\u0000~\u0000\rpq\u0000~\u0000\u0017q\u0000~\u0000\u001bq\u0000~\u0000\u001dsq\u0000~\u0000\u001et\u00005net.sour"
+"ceforge.czt.circus.jaxb.gen.HideActionElementq\u0000~\u0000\"sq\u0000~\u0000\bpp\u0000s"
+"q\u0000~\u0000\u0006ppsq\u0000~\u0000\u0011q\u0000~\u0000\rpsq\u0000~\u0000\u0014q\u0000~\u0000\rpq\u0000~\u0000\u0017q\u0000~\u0000\u001bq\u0000~\u0000\u001dsq\u0000~\u0000\u001et\u00003net.s"
+"ourceforge.czt.circus.jaxb.gen.ExtChoiceActionq\u0000~\u0000\"sq\u0000~\u0000\bpp\u0000"
+"sq\u0000~\u0000\u0006ppsq\u0000~\u0000\u0011q\u0000~\u0000\rpsq\u0000~\u0000\u0014q\u0000~\u0000\rpq\u0000~\u0000\u0017q\u0000~\u0000\u001bq\u0000~\u0000\u001dsq\u0000~\u0000\u001et\u0000<net."
+"sourceforge.czt.circus.jaxb.gen.ActualParamActionElementq\u0000~\u0000"
+"\"sq\u0000~\u0000\bpp\u0000sq\u0000~\u0000\u0006ppsq\u0000~\u0000\u0011q\u0000~\u0000\rpsq\u0000~\u0000\u0014q\u0000~\u0000\rpq\u0000~\u0000\u0017q\u0000~\u0000\u001bq\u0000~\u0000\u001dsq\u0000"
+"~\u0000\u001et\u0000:net.sourceforge.czt.circus.jaxb.gen.SpecStmtCommandEle"
+"mentq\u0000~\u0000\"sq\u0000~\u0000\bpp\u0000sq\u0000~\u0000\u0006ppsq\u0000~\u0000\u0011q\u0000~\u0000\rpsq\u0000~\u0000\u0014q\u0000~\u0000\rpq\u0000~\u0000\u0017q\u0000~\u0000\u001b"
+"q\u0000~\u0000\u001dsq\u0000~\u0000\u001et\u00009net.sourceforge.czt.circus.jaxb.gen.ParallelAc"
+"tionElementq\u0000~\u0000\"sq\u0000~\u0000\bpp\u0000sq\u0000~\u0000\u0006ppsq\u0000~\u0000\u0011q\u0000~\u0000\rpsq\u0000~\u0000\u0014q\u0000~\u0000\rpq\u0000~"
+"\u0000\u0017q\u0000~\u0000\u001bq\u0000~\u0000\u001dsq\u0000~\u0000\u001et\u00003net.sourceforge.czt.circus.jaxb.gen.Int"
+"ChoiceActionq\u0000~\u0000\"sq\u0000~\u0000\bpp\u0000sq\u0000~\u0000\u0006ppsq\u0000~\u0000\u0011q\u0000~\u0000\rpsq\u0000~\u0000\u0014q\u0000~\u0000\rpq\u0000"
+"~\u0000\u0017q\u0000~\u0000\u001bq\u0000~\u0000\u001dsq\u0000~\u0000\u001et\u0000/net.sourceforge.czt.circus.jaxb.gen.Ch"
+"aosActionq\u0000~\u0000\"sq\u0000~\u0000\bpp\u0000sq\u0000~\u0000\u0006ppsq\u0000~\u0000\u0011q\u0000~\u0000\rpsq\u0000~\u0000\u0014q\u0000~\u0000\rpq\u0000~\u0000\u0017"
+"q\u0000~\u0000\u001bq\u0000~\u0000\u001dsq\u0000~\u0000\u001et\u00005net.sourceforge.czt.circus.jaxb.gen.CallA"
+"ctionElementq\u0000~\u0000\"sq\u0000~\u0000\bpp\u0000sq\u0000~\u0000\u0006ppsq\u0000~\u0000\u0011q\u0000~\u0000\rpsq\u0000~\u0000\u0014q\u0000~\u0000\rpq\u0000"
+"~\u0000\u0017q\u0000~\u0000\u001bq\u0000~\u0000\u001dsq\u0000~\u0000\u001et\u00004net.sourceforge.czt.circus.jaxb.gen.In"
+"tChoiceActionRq\u0000~\u0000\"sq\u0000~\u0000\bpp\u0000sq\u0000~\u0000\u0006ppsq\u0000~\u0000\u0011q\u0000~\u0000\rpsq\u0000~\u0000\u0014q\u0000~\u0000\rp"
+"q\u0000~\u0000\u0017q\u0000~\u0000\u001bq\u0000~\u0000\u001dsq\u0000~\u0000\u001et\u00008net.sourceforge.czt.circus.jaxb.gen."
+"SchTextActionElementq\u0000~\u0000\"sq\u0000~\u0000\bpp\u0000sq\u0000~\u0000\u0006ppsq\u0000~\u0000\u0011q\u0000~\u0000\rpsq\u0000~\u0000\u0014"
+"q\u0000~\u0000\rpq\u0000~\u0000\u0017q\u0000~\u0000\u001bq\u0000~\u0000\u001dsq\u0000~\u0000\u001et\u00008net.sourceforge.czt.circus.jax"
+"b.gen.GuardedActionElementq\u0000~\u0000\"sq\u0000~\u0000\bpp\u0000sq\u0000~\u0000\u0006ppsq\u0000~\u0000\u0011q\u0000~\u0000\rp"
+"sq\u0000~\u0000\u0014q\u0000~\u0000\rpq\u0000~\u0000\u0017q\u0000~\u0000\u001bq\u0000~\u0000\u001dsq\u0000~\u0000\u001et\u0000.net.sourceforge.czt.circ"
+"us.jaxb.gen.SeqActionRq\u0000~\u0000\"sq\u0000~\u0000\bpp\u0000sq\u0000~\u0000\u0006ppsq\u0000~\u0000\u0011q\u0000~\u0000\rpsq\u0000~"
+"\u0000\u0014q\u0000~\u0000\rpq\u0000~\u0000\u0017q\u0000~\u0000\u001bq\u0000~\u0000\u001dsq\u0000~\u0000\u001et\u0000:net.sourceforge.czt.circus.j"
+"axb.gen.ParallelActionRElementq\u0000~\u0000\"sq\u0000~\u0000\bpp\u0000sq\u0000~\u0000\u0006ppsq\u0000~\u0000\u0011q\u0000"
+"~\u0000\rpsq\u0000~\u0000\u0014q\u0000~\u0000\rpq\u0000~\u0000\u0017q\u0000~\u0000\u001bq\u0000~\u0000\u001dsq\u0000~\u0000\u001et\u00003net.sourceforge.czt."
+"circus.jaxb.gen.MuActionElementq\u0000~\u0000\"sq\u0000~\u0000\bpp\u0000sq\u0000~\u0000\u0006ppsq\u0000~\u0000\u0011q"
+"\u0000~\u0000\rpsq\u0000~\u0000\u0014q\u0000~\u0000\rpq\u0000~\u0000\u0017q\u0000~\u0000\u001bq\u0000~\u0000\u001dsq\u0000~\u0000\u001et\u00005net.sourceforge.czt"
+".circus.jaxb.gen.InterleaveActionRq\u0000~\u0000\"sq\u0000~\u0000\bpp\u0000sq\u0000~\u0000\u0006ppsq\u0000~"
+"\u0000\u0011q\u0000~\u0000\rpsq\u0000~\u0000\u0014q\u0000~\u0000\rpq\u0000~\u0000\u0017q\u0000~\u0000\u001bq\u0000~\u0000\u001dsq\u0000~\u0000\u001et\u0000.net.sourceforge."
+"czt.circus.jaxb.gen.StopActionq\u0000~\u0000\"sq\u0000~\u0000\bpp\u0000sq\u0000~\u0000\u0006ppsq\u0000~\u0000\u0011q\u0000"
+"~\u0000\rpsq\u0000~\u0000\u0014q\u0000~\u0000\rpq\u0000~\u0000\u0017q\u0000~\u0000\u001bq\u0000~\u0000\u001dsq\u0000~\u0000\u001et\u00004net.sourceforge.czt."
+"circus.jaxb.gen.InterleaveActionq\u0000~\u0000\"sr\u0000\"com.sun.msv.grammar"
+".ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar"
+"/ExpressionPool$ClosedHash;xpsr\u0000-com.sun.msv.grammar.Express"
+"ionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstreamVersionL\u0000\u0006pare"
+"ntt\u0000$Lcom/sun/msv/grammar/ExpressionPool;xp\u0000\u0000\u0000P\u0001pq\u0000~\u0000Iq\u0000~\u0000Sq"
+"\u0000~\u0000Jq\u0000~\u0000Nq\u0000~\u0000Rq\u0000~\u0000Tq\u0000~\u0000?q\u0000~\u0000\u0094q\u0000~\u0000\u008eq\u0000~\u0000\u0088q\u0000~\u0000\u0082q\u0000~\u0000|q\u0000~\u0000vq\u0000~\u0000pq"
+"\u0000~\u0000jq\u0000~\u0000dq\u0000~\u0000^q\u0000~\u0000Xq\u0000~\u0000\u0013q\u0000~\u0000\u00beq\u0000~\u0000\u00b8q\u0000~\u0000\u00b2q\u0000~\u0000\u00acq\u0000~\u0000\u00a6q\u0000~\u0000\u00a0q\u0000~\u0000\u009aq"
+"\u0000~\u0000Eq\u0000~\u0000\u00c4q\u0000~\u0000\u00caq\u0000~\u0000\u00d0q\u0000~\u0000\u00d6q\u0000~\u0000\u00dcq\u0000~\u0000\u00e2q\u0000~\u0000\u00e8q\u0000~\u0000Pq\u0000~\u0000Uq\u0000~\u0000Oq\u0000~\u0000\u00bdq"
+"\u0000~\u0000\u00b7q\u0000~\u0000\u00b1q\u0000~\u0000\u00abq\u0000~\u0000\u00a5q\u0000~\u0000\u009fq\u0000~\u0000\u0099q\u0000~\u0000\u0093q\u0000~\u0000\u008dq\u0000~\u0000\u0087q\u0000~\u0000\u0081q\u0000~\u0000{q\u0000~\u0000uq"
+"\u0000~\u0000oq\u0000~\u0000iq\u0000~\u0000cq\u0000~\u0000]q\u0000~\u0000Wq\u0000~\u0000\u0010q\u0000~\u0000\u00c3q\u0000~\u0000Dq\u0000~\u0000\u00c9q\u0000~\u0000Cq\u0000~\u0000\u00cfq\u0000~\u0000Bq"
+"\u0000~\u0000\u00d5q\u0000~\u0000Qq\u0000~\u0000\u00dbq\u0000~\u0000@q\u0000~\u0000\u00e1q\u0000~\u0000\u00e7q\u0000~\u0000Lq\u0000~\u0000Fq\u0000~\u0000\u0007q\u0000~\u0000Kq\u0000~\u0000\u000eq\u0000~\u0000Gq"
+"\u0000~\u0000\u0005q\u0000~\u0000Aq\u0000~\u0000#q\u0000~\u0000Hq\u0000~\u0000Mq\u0000~\u0000>x"));
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
            return net.sourceforge.czt.circus.jaxb.gen.impl.Action1Impl.this;
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
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.circus.jaxb.gen.impl.ActionImpl)net.sourceforge.czt.circus.jaxb.gen.impl.Action1Impl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        spawnHandlerFromEnterElement((((net.sourceforge.czt.circus.jaxb.gen.impl.ActionImpl)net.sourceforge.czt.circus.jaxb.gen.impl.Action1Impl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname, __atts);
                        return ;
                    case  3 :
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _Action = ((net.sourceforge.czt.circus.jaxb.gen.impl.ActionImpl) spawnChildFromEnterElement((net.sourceforge.czt.circus.jaxb.gen.impl.ActionImpl.class), 4, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        _Action = ((net.sourceforge.czt.circus.jaxb.gen.impl.ActionImpl) spawnChildFromEnterElement((net.sourceforge.czt.circus.jaxb.gen.impl.ActionImpl.class), 4, ___uri, ___local, ___qname, __atts));
                        return ;
                    case  1 :
                        if (("VarDeclCommand" == ___local)&&("http://czt.sourceforge.net/circus" == ___uri)) {
                            _Action = ((net.sourceforge.czt.circus.jaxb.gen.impl.VarDeclCommandElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.circus.jaxb.gen.impl.VarDeclCommandElementImpl.class), 2, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("IfGuardedCommand" == ___local)&&("http://czt.sourceforge.net/circus" == ___uri)) {
                            _Action = ((net.sourceforge.czt.circus.jaxb.gen.impl.IfGuardedCommandElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.circus.jaxb.gen.impl.IfGuardedCommandElementImpl.class), 2, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("SeqAction" == ___local)&&("http://czt.sourceforge.net/circus" == ___uri)) {
                            _Action = ((net.sourceforge.czt.circus.jaxb.gen.impl.SeqActionImpl) spawnChildFromEnterElement((net.sourceforge.czt.circus.jaxb.gen.impl.SeqActionImpl.class), 2, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("PrefixingAction" == ___local)&&("http://czt.sourceforge.net/circus" == ___uri)) {
                            _Action = ((net.sourceforge.czt.circus.jaxb.gen.impl.PrefixingActionElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.circus.jaxb.gen.impl.PrefixingActionElementImpl.class), 2, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("ExtChoiceActionR" == ___local)&&("http://czt.sourceforge.net/circus" == ___uri)) {
                            _Action = ((net.sourceforge.czt.circus.jaxb.gen.impl.ExtChoiceActionRImpl) spawnChildFromEnterElement((net.sourceforge.czt.circus.jaxb.gen.impl.ExtChoiceActionRImpl.class), 2, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("AssignmentCommand" == ___local)&&("http://czt.sourceforge.net/circus" == ___uri)) {
                            _Action = ((net.sourceforge.czt.circus.jaxb.gen.impl.AssignmentCommandElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.circus.jaxb.gen.impl.AssignmentCommandElementImpl.class), 2, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("SkipAction" == ___local)&&("http://czt.sourceforge.net/circus" == ___uri)) {
                            _Action = ((net.sourceforge.czt.circus.jaxb.gen.impl.SkipActionImpl) spawnChildFromEnterElement((net.sourceforge.czt.circus.jaxb.gen.impl.SkipActionImpl.class), 2, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("FormalParamAction" == ___local)&&("http://czt.sourceforge.net/circus" == ___uri)) {
                            _Action = ((net.sourceforge.czt.circus.jaxb.gen.impl.FormalParamActionImpl) spawnChildFromEnterElement((net.sourceforge.czt.circus.jaxb.gen.impl.FormalParamActionImpl.class), 2, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("HideAction" == ___local)&&("http://czt.sourceforge.net/circus" == ___uri)) {
                            _Action = ((net.sourceforge.czt.circus.jaxb.gen.impl.HideActionElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.circus.jaxb.gen.impl.HideActionElementImpl.class), 2, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("ExtChoiceAction" == ___local)&&("http://czt.sourceforge.net/circus" == ___uri)) {
                            _Action = ((net.sourceforge.czt.circus.jaxb.gen.impl.ExtChoiceActionImpl) spawnChildFromEnterElement((net.sourceforge.czt.circus.jaxb.gen.impl.ExtChoiceActionImpl.class), 2, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("ActualParamAction" == ___local)&&("http://czt.sourceforge.net/circus" == ___uri)) {
                            _Action = ((net.sourceforge.czt.circus.jaxb.gen.impl.ActualParamActionElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.circus.jaxb.gen.impl.ActualParamActionElementImpl.class), 2, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("SpecStmtCommand" == ___local)&&("http://czt.sourceforge.net/circus" == ___uri)) {
                            _Action = ((net.sourceforge.czt.circus.jaxb.gen.impl.SpecStmtCommandElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.circus.jaxb.gen.impl.SpecStmtCommandElementImpl.class), 2, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("ParallelAction" == ___local)&&("http://czt.sourceforge.net/circus" == ___uri)) {
                            _Action = ((net.sourceforge.czt.circus.jaxb.gen.impl.ParallelActionElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.circus.jaxb.gen.impl.ParallelActionElementImpl.class), 2, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("IntChoiceAction" == ___local)&&("http://czt.sourceforge.net/circus" == ___uri)) {
                            _Action = ((net.sourceforge.czt.circus.jaxb.gen.impl.IntChoiceActionImpl) spawnChildFromEnterElement((net.sourceforge.czt.circus.jaxb.gen.impl.IntChoiceActionImpl.class), 2, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("ChaosAction" == ___local)&&("http://czt.sourceforge.net/circus" == ___uri)) {
                            _Action = ((net.sourceforge.czt.circus.jaxb.gen.impl.ChaosActionImpl) spawnChildFromEnterElement((net.sourceforge.czt.circus.jaxb.gen.impl.ChaosActionImpl.class), 2, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("CallAction" == ___local)&&("http://czt.sourceforge.net/circus" == ___uri)) {
                            _Action = ((net.sourceforge.czt.circus.jaxb.gen.impl.CallActionElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.circus.jaxb.gen.impl.CallActionElementImpl.class), 2, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("IntChoiceActionR" == ___local)&&("http://czt.sourceforge.net/circus" == ___uri)) {
                            _Action = ((net.sourceforge.czt.circus.jaxb.gen.impl.IntChoiceActionRImpl) spawnChildFromEnterElement((net.sourceforge.czt.circus.jaxb.gen.impl.IntChoiceActionRImpl.class), 2, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("SchTextAction" == ___local)&&("http://czt.sourceforge.net/circus" == ___uri)) {
                            _Action = ((net.sourceforge.czt.circus.jaxb.gen.impl.SchTextActionElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.circus.jaxb.gen.impl.SchTextActionElementImpl.class), 2, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("GuardedAction" == ___local)&&("http://czt.sourceforge.net/circus" == ___uri)) {
                            _Action = ((net.sourceforge.czt.circus.jaxb.gen.impl.GuardedActionElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.circus.jaxb.gen.impl.GuardedActionElementImpl.class), 2, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("SeqActionR" == ___local)&&("http://czt.sourceforge.net/circus" == ___uri)) {
                            _Action = ((net.sourceforge.czt.circus.jaxb.gen.impl.SeqActionRImpl) spawnChildFromEnterElement((net.sourceforge.czt.circus.jaxb.gen.impl.SeqActionRImpl.class), 2, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("ParallelActionR" == ___local)&&("http://czt.sourceforge.net/circus" == ___uri)) {
                            _Action = ((net.sourceforge.czt.circus.jaxb.gen.impl.ParallelActionRElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.circus.jaxb.gen.impl.ParallelActionRElementImpl.class), 2, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("MuAction" == ___local)&&("http://czt.sourceforge.net/circus" == ___uri)) {
                            _Action = ((net.sourceforge.czt.circus.jaxb.gen.impl.MuActionElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.circus.jaxb.gen.impl.MuActionElementImpl.class), 2, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("InterleaveActionR" == ___local)&&("http://czt.sourceforge.net/circus" == ___uri)) {
                            _Action = ((net.sourceforge.czt.circus.jaxb.gen.impl.InterleaveActionRImpl) spawnChildFromEnterElement((net.sourceforge.czt.circus.jaxb.gen.impl.InterleaveActionRImpl.class), 2, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("StopAction" == ___local)&&("http://czt.sourceforge.net/circus" == ___uri)) {
                            _Action = ((net.sourceforge.czt.circus.jaxb.gen.impl.StopActionImpl) spawnChildFromEnterElement((net.sourceforge.czt.circus.jaxb.gen.impl.StopActionImpl.class), 2, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("InterleaveAction" == ___local)&&("http://czt.sourceforge.net/circus" == ___uri)) {
                            _Action = ((net.sourceforge.czt.circus.jaxb.gen.impl.InterleaveActionImpl) spawnChildFromEnterElement((net.sourceforge.czt.circus.jaxb.gen.impl.InterleaveActionImpl.class), 2, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("Action" == ___local)&&("http://czt.sourceforge.net/circus" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 3;
                            return ;
                        }
                        if (("Action" == ___local)&&("http://czt.sourceforge.net/circus" == ___uri)) {
                            _Action = ((net.sourceforge.czt.circus.jaxb.gen.impl.ActionElementImpl) spawnChildFromEnterElement((net.sourceforge.czt.circus.jaxb.gen.impl.ActionElementImpl.class), 2, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        break;
                    case  2 :
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
                    case  0 :
                        spawnHandlerFromLeaveElement((((net.sourceforge.czt.circus.jaxb.gen.impl.ActionImpl)net.sourceforge.czt.circus.jaxb.gen.impl.Action1Impl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
                        return ;
                    case  3 :
                        _Action = ((net.sourceforge.czt.circus.jaxb.gen.impl.ActionImpl) spawnChildFromLeaveElement((net.sourceforge.czt.circus.jaxb.gen.impl.ActionImpl.class), 4, ___uri, ___local, ___qname));
                        return ;
                    case  4 :
                        if (("Action" == ___local)&&("http://czt.sourceforge.net/circus" == ___uri)) {
                            context.popAttributes();
                            state = 2;
                            return ;
                        }
                        break;
                    case  2 :
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
                        spawnHandlerFromEnterAttribute((((net.sourceforge.czt.circus.jaxb.gen.impl.ActionImpl)net.sourceforge.czt.circus.jaxb.gen.impl.Action1Impl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
                        return ;
                    case  3 :
                        _Action = ((net.sourceforge.czt.circus.jaxb.gen.impl.ActionImpl) spawnChildFromEnterAttribute((net.sourceforge.czt.circus.jaxb.gen.impl.ActionImpl.class), 4, ___uri, ___local, ___qname));
                        return ;
                    case  2 :
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
                        spawnHandlerFromLeaveAttribute((((net.sourceforge.czt.circus.jaxb.gen.impl.ActionImpl)net.sourceforge.czt.circus.jaxb.gen.impl.Action1Impl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
                        return ;
                    case  3 :
                        _Action = ((net.sourceforge.czt.circus.jaxb.gen.impl.ActionImpl) spawnChildFromLeaveAttribute((net.sourceforge.czt.circus.jaxb.gen.impl.ActionImpl.class), 4, ___uri, ___local, ___qname));
                        return ;
                    case  2 :
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
                            spawnHandlerFromText((((net.sourceforge.czt.circus.jaxb.gen.impl.ActionImpl)net.sourceforge.czt.circus.jaxb.gen.impl.Action1Impl.this).new Unmarshaller(context)), 1, value);
                            return ;
                        case  3 :
                            _Action = ((net.sourceforge.czt.circus.jaxb.gen.impl.ActionImpl) spawnChildFromText((net.sourceforge.czt.circus.jaxb.gen.impl.ActionImpl.class), 4, value));
                            return ;
                        case  2 :
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
