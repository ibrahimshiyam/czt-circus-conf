//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2005.03.03 at 09:16:01 GMT 
//


package net.sourceforge.czt.tcoz.jaxb.gen.impl;

public class ConnectionImpl
    extends net.sourceforge.czt.z.jaxb.gen.impl.TermAImpl
    implements net.sourceforge.czt.tcoz.jaxb.gen.Connection, com.sun.xml.bind.JAXBObject, net.sourceforge.czt.circus.jaxb.gen.impl.runtime.UnmarshallableObject, net.sourceforge.czt.circus.jaxb.gen.impl.runtime.XMLSerializable, net.sourceforge.czt.circus.jaxb.gen.impl.runtime.ValidatableObject
{

    protected com.sun.xml.bind.util.ListImpl _Channels;
    protected com.sun.xml.bind.util.ListImpl _RightProcess;
    protected com.sun.xml.bind.util.ListImpl _LeftProcess;
    public final static java.lang.Class version = (net.sourceforge.czt.tcoz.jaxb.gen.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (net.sourceforge.czt.tcoz.jaxb.gen.Connection.class);
    }

    protected com.sun.xml.bind.util.ListImpl _getChannels() {
        if (_Channels == null) {
            _Channels = new com.sun.xml.bind.util.ListImpl(new java.util.ArrayList());
        }
        return _Channels;
    }

    public java.util.List getChannels() {
        return _getChannels();
    }

    protected com.sun.xml.bind.util.ListImpl _getRightProcess() {
        if (_RightProcess == null) {
            _RightProcess = new com.sun.xml.bind.util.ListImpl(new java.util.ArrayList());
        }
        return _RightProcess;
    }

    public java.util.List getRightProcess() {
        return _getRightProcess();
    }

    protected com.sun.xml.bind.util.ListImpl _getLeftProcess() {
        if (_LeftProcess == null) {
            _LeftProcess = new com.sun.xml.bind.util.ListImpl(new java.util.ArrayList());
        }
        return _LeftProcess;
    }

    public java.util.List getLeftProcess() {
        return _getLeftProcess();
    }

    public net.sourceforge.czt.circus.jaxb.gen.impl.runtime.UnmarshallingEventHandler createUnmarshaller(net.sourceforge.czt.circus.jaxb.gen.impl.runtime.UnmarshallingContext context) {
        return new net.sourceforge.czt.tcoz.jaxb.gen.impl.ConnectionImpl.Unmarshaller(context);
    }

    public void serializeBody(net.sourceforge.czt.circus.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = ((_Channels == null)? 0 :_Channels.size());
        int idx2 = 0;
        final int len2 = ((_RightProcess == null)? 0 :_RightProcess.size());
        int idx3 = 0;
        final int len3 = ((_LeftProcess == null)? 0 :_LeftProcess.size());
        super.serializeBody(context);
        while (idx3 != len3) {
            context.startElement("http://czt.sourceforge.net/tcoz", "LeftProcess");
            int idx_0 = idx3;
            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _LeftProcess.get(idx_0 ++)), "LeftProcess");
            context.endNamespaceDecls();
            int idx_1 = idx3;
            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _LeftProcess.get(idx_1 ++)), "LeftProcess");
            context.endAttributes();
            context.childAsBody(((com.sun.xml.bind.JAXBObject) _LeftProcess.get(idx3 ++)), "LeftProcess");
            context.endElement();
        }
        while (idx2 != len2) {
            context.startElement("http://czt.sourceforge.net/tcoz", "RightProcess");
            int idx_2 = idx2;
            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _RightProcess.get(idx_2 ++)), "RightProcess");
            context.endNamespaceDecls();
            int idx_3 = idx2;
            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _RightProcess.get(idx_3 ++)), "RightProcess");
            context.endAttributes();
            context.childAsBody(((com.sun.xml.bind.JAXBObject) _RightProcess.get(idx2 ++)), "RightProcess");
            context.endElement();
        }
        while (idx1 != len1) {
            context.startElement("http://czt.sourceforge.net/tcoz", "Channels");
            int idx_4 = idx1;
            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Channels.get(idx_4 ++)), "Channels");
            context.endNamespaceDecls();
            int idx_5 = idx1;
            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Channels.get(idx_5 ++)), "Channels");
            context.endAttributes();
            context.childAsBody(((com.sun.xml.bind.JAXBObject) _Channels.get(idx1 ++)), "Channels");
            context.endElement();
        }
    }

    public void serializeAttributes(net.sourceforge.czt.circus.jaxb.gen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = ((_Channels == null)? 0 :_Channels.size());
        int idx2 = 0;
        final int len2 = ((_RightProcess == null)? 0 :_RightProcess.size());
        int idx3 = 0;
        final int len3 = ((_LeftProcess == null)? 0 :_LeftProcess.size());
        super.serializeAttributes(context);
        while (idx3 != len3) {
            idx3 += 1;
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
        final int len1 = ((_Channels == null)? 0 :_Channels.size());
        int idx2 = 0;
        final int len2 = ((_RightProcess == null)? 0 :_RightProcess.size());
        int idx3 = 0;
        final int len3 = ((_LeftProcess == null)? 0 :_LeftProcess.size());
        super.serializeURIs(context);
        while (idx3 != len3) {
            idx3 += 1;
        }
        while (idx2 != len2) {
            idx2 += 1;
        }
        while (idx1 != len1) {
            idx1 += 1;
        }
    }

    public java.lang.Class getPrimaryInterface() {
        return (net.sourceforge.czt.tcoz.jaxb.gen.Connection.class);
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
+"\bppsq\u0000~\u0000\u0013q\u0000~\u0000\u000fpsq\u0000~\u0000\u0016q\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000&net.sourc"
+"eforge.czt.z.jaxb.gen.RefNameq\u0000~\u0000$sq\u0000~\u0000\bppsq\u0000~\u0000\u0016q\u0000~\u0000\u000fpq\u0000~\u0000*q"
+"\u0000~\u0000:q\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000\u000bLeftProcesst\u0000\u001fhttp://czt.sourceforge.net/t"
+"cozsq\u0000~\u0000\u0013ppsq\u0000~\u0000\npp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\npp\u0000sq\u0000~\u0000\bppsq\u0000~\u0000\u0013q\u0000~\u0000\u000fpsq\u0000"
+"~\u0000\u0016q\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 q\u0000~\u0000Hq\u0000~\u0000$sq\u0000~\u0000\bppsq\u0000~\u0000\u0016q\u0000~\u0000\u000fp"
+"q\u0000~\u0000*q\u0000~\u0000:q\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000\fRightProcessq\u0000~\u0000Msq\u0000~\u0000\u0013ppsq\u0000~\u0000\npp\u0000sq"
+"\u0000~\u0000\u0000ppsq\u0000~\u0000\npp\u0000sq\u0000~\u0000\bppsq\u0000~\u0000\u0013q\u0000~\u0000\u000fpsq\u0000~\u0000\u0016q\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~"
+"\u0000\u001fsq\u0000~\u0000 q\u0000~\u0000Hq\u0000~\u0000$sq\u0000~\u0000\bppsq\u0000~\u0000\u0016q\u0000~\u0000\u000fpq\u0000~\u0000*q\u0000~\u0000:q\u0000~\u0000\u001fsq\u0000~\u0000 t"
+"\u0000\bChannelsq\u0000~\u0000Msr\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/ExpressionPool$Closed"
+"Hash;xpsr\u0000-com.sun.msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N"
+"\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstreamVersionL\u0000\u0006parentt\u0000$Lcom/sun/msv/gram"
+"mar/ExpressionPool;xp\u0000\u0000\u0000\u0017\u0001pq\u0000~\u0000%q\u0000~\u0000Iq\u0000~\u0000Vq\u0000~\u0000bq\u0000~\u0000\u0012q\u0000~\u0000Dq\u0000~"
+"\u0000Rq\u0000~\u0000^q\u0000~\u0000\u0007q\u0000~\u0000\tq\u0000~\u0000\u0010q\u0000~\u0000Bq\u0000~\u0000Pq\u0000~\u0000\\q\u0000~\u0000\u0006q\u0000~\u0000@q\u0000~\u0000Nq\u0000~\u0000Zq\u0000~"
+"\u0000\u0015q\u0000~\u0000Eq\u0000~\u0000Sq\u0000~\u0000_q\u0000~\u0000\u0005x"));
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
            return net.sourceforge.czt.tcoz.jaxb.gen.impl.ConnectionImpl.this;
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
                            spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.TermAImpl)net.sourceforge.czt.tcoz.jaxb.gen.impl.ConnectionImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        spawnHandlerFromEnterElement((((net.sourceforge.czt.z.jaxb.gen.impl.TermAImpl)net.sourceforge.czt.tcoz.jaxb.gen.impl.ConnectionImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname, __atts);
                        return ;
                    case  7 :
                        if (("RightProcess" == ___local)&&("http://czt.sourceforge.net/tcoz" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 5;
                            return ;
                        }
                        if (("Channels" == ___local)&&("http://czt.sourceforge.net/tcoz" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 8;
                            return ;
                        }
                        break;
                    case  4 :
                        if (("LeftProcess" == ___local)&&("http://czt.sourceforge.net/tcoz" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 2;
                            return ;
                        }
                        if (("RightProcess" == ___local)&&("http://czt.sourceforge.net/tcoz" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 5;
                            return ;
                        }
                        break;
                    case  2 :
                        attIdx = context.getAttribute("", "Decl");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _getLeftProcess().add(((net.sourceforge.czt.z.jaxb.gen.impl.RefNameImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.RefNameImpl.class), 3, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("Word" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _getLeftProcess().add(((net.sourceforge.czt.z.jaxb.gen.impl.RefNameImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.RefNameImpl.class), 3, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        _getLeftProcess().add(((net.sourceforge.czt.z.jaxb.gen.impl.RefNameImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.RefNameImpl.class), 3, ___uri, ___local, ___qname, __atts)));
                        return ;
                    case  8 :
                        attIdx = context.getAttribute("", "Decl");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _getChannels().add(((net.sourceforge.czt.z.jaxb.gen.impl.RefNameImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.RefNameImpl.class), 9, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("Word" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _getChannels().add(((net.sourceforge.czt.z.jaxb.gen.impl.RefNameImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.RefNameImpl.class), 9, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        _getChannels().add(((net.sourceforge.czt.z.jaxb.gen.impl.RefNameImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.RefNameImpl.class), 9, ___uri, ___local, ___qname, __atts)));
                        return ;
                    case  10 :
                        if (("Channels" == ___local)&&("http://czt.sourceforge.net/tcoz" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 8;
                            return ;
                        }
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  1 :
                        if (("LeftProcess" == ___local)&&("http://czt.sourceforge.net/tcoz" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 2;
                            return ;
                        }
                        break;
                    case  5 :
                        attIdx = context.getAttribute("", "Decl");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Anns" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _getRightProcess().add(((net.sourceforge.czt.z.jaxb.gen.impl.RefNameImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.RefNameImpl.class), 6, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("Word" == ___local)&&("http://czt.sourceforge.net/zml" == ___uri)) {
                            _getRightProcess().add(((net.sourceforge.czt.z.jaxb.gen.impl.RefNameImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.RefNameImpl.class), 6, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        _getRightProcess().add(((net.sourceforge.czt.z.jaxb.gen.impl.RefNameImpl) spawnChildFromEnterElement((net.sourceforge.czt.z.jaxb.gen.impl.RefNameImpl.class), 6, ___uri, ___local, ___qname, __atts)));
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
                        if (("LeftProcess" == ___local)&&("http://czt.sourceforge.net/tcoz" == ___uri)) {
                            context.popAttributes();
                            state = 4;
                            return ;
                        }
                        break;
                    case  0 :
                        spawnHandlerFromLeaveElement((((net.sourceforge.czt.z.jaxb.gen.impl.TermAImpl)net.sourceforge.czt.tcoz.jaxb.gen.impl.ConnectionImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
                        return ;
                    case  2 :
                        attIdx = context.getAttribute("", "Decl");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        _getLeftProcess().add(((net.sourceforge.czt.z.jaxb.gen.impl.RefNameImpl) spawnChildFromLeaveElement((net.sourceforge.czt.z.jaxb.gen.impl.RefNameImpl.class), 3, ___uri, ___local, ___qname)));
                        return ;
                    case  8 :
                        attIdx = context.getAttribute("", "Decl");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        _getChannels().add(((net.sourceforge.czt.z.jaxb.gen.impl.RefNameImpl) spawnChildFromLeaveElement((net.sourceforge.czt.z.jaxb.gen.impl.RefNameImpl.class), 9, ___uri, ___local, ___qname)));
                        return ;
                    case  10 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  6 :
                        if (("RightProcess" == ___local)&&("http://czt.sourceforge.net/tcoz" == ___uri)) {
                            context.popAttributes();
                            state = 7;
                            return ;
                        }
                        break;
                    case  9 :
                        if (("Channels" == ___local)&&("http://czt.sourceforge.net/tcoz" == ___uri)) {
                            context.popAttributes();
                            state = 10;
                            return ;
                        }
                        break;
                    case  5 :
                        attIdx = context.getAttribute("", "Decl");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        _getRightProcess().add(((net.sourceforge.czt.z.jaxb.gen.impl.RefNameImpl) spawnChildFromLeaveElement((net.sourceforge.czt.z.jaxb.gen.impl.RefNameImpl.class), 6, ___uri, ___local, ___qname)));
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
                        spawnHandlerFromEnterAttribute((((net.sourceforge.czt.z.jaxb.gen.impl.TermAImpl)net.sourceforge.czt.tcoz.jaxb.gen.impl.ConnectionImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
                        return ;
                    case  2 :
                        if (("Decl" == ___local)&&("" == ___uri)) {
                            _getLeftProcess().add(((net.sourceforge.czt.z.jaxb.gen.impl.RefNameImpl) spawnChildFromEnterAttribute((net.sourceforge.czt.z.jaxb.gen.impl.RefNameImpl.class), 3, ___uri, ___local, ___qname)));
                            return ;
                        }
                        _getLeftProcess().add(((net.sourceforge.czt.z.jaxb.gen.impl.RefNameImpl) spawnChildFromEnterAttribute((net.sourceforge.czt.z.jaxb.gen.impl.RefNameImpl.class), 3, ___uri, ___local, ___qname)));
                        return ;
                    case  8 :
                        if (("Decl" == ___local)&&("" == ___uri)) {
                            _getChannels().add(((net.sourceforge.czt.z.jaxb.gen.impl.RefNameImpl) spawnChildFromEnterAttribute((net.sourceforge.czt.z.jaxb.gen.impl.RefNameImpl.class), 9, ___uri, ___local, ___qname)));
                            return ;
                        }
                        _getChannels().add(((net.sourceforge.czt.z.jaxb.gen.impl.RefNameImpl) spawnChildFromEnterAttribute((net.sourceforge.czt.z.jaxb.gen.impl.RefNameImpl.class), 9, ___uri, ___local, ___qname)));
                        return ;
                    case  10 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  5 :
                        if (("Decl" == ___local)&&("" == ___uri)) {
                            _getRightProcess().add(((net.sourceforge.czt.z.jaxb.gen.impl.RefNameImpl) spawnChildFromEnterAttribute((net.sourceforge.czt.z.jaxb.gen.impl.RefNameImpl.class), 6, ___uri, ___local, ___qname)));
                            return ;
                        }
                        _getRightProcess().add(((net.sourceforge.czt.z.jaxb.gen.impl.RefNameImpl) spawnChildFromEnterAttribute((net.sourceforge.czt.z.jaxb.gen.impl.RefNameImpl.class), 6, ___uri, ___local, ___qname)));
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
                        spawnHandlerFromLeaveAttribute((((net.sourceforge.czt.z.jaxb.gen.impl.TermAImpl)net.sourceforge.czt.tcoz.jaxb.gen.impl.ConnectionImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
                        return ;
                    case  2 :
                        attIdx = context.getAttribute("", "Decl");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        _getLeftProcess().add(((net.sourceforge.czt.z.jaxb.gen.impl.RefNameImpl) spawnChildFromLeaveAttribute((net.sourceforge.czt.z.jaxb.gen.impl.RefNameImpl.class), 3, ___uri, ___local, ___qname)));
                        return ;
                    case  8 :
                        attIdx = context.getAttribute("", "Decl");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        _getChannels().add(((net.sourceforge.czt.z.jaxb.gen.impl.RefNameImpl) spawnChildFromLeaveAttribute((net.sourceforge.czt.z.jaxb.gen.impl.RefNameImpl.class), 9, ___uri, ___local, ___qname)));
                        return ;
                    case  10 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  5 :
                        attIdx = context.getAttribute("", "Decl");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        _getRightProcess().add(((net.sourceforge.czt.z.jaxb.gen.impl.RefNameImpl) spawnChildFromLeaveAttribute((net.sourceforge.czt.z.jaxb.gen.impl.RefNameImpl.class), 6, ___uri, ___local, ___qname)));
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
                            spawnHandlerFromText((((net.sourceforge.czt.z.jaxb.gen.impl.TermAImpl)net.sourceforge.czt.tcoz.jaxb.gen.impl.ConnectionImpl.this).new Unmarshaller(context)), 1, value);
                            return ;
                        case  2 :
                            attIdx = context.getAttribute("", "Decl");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            _getLeftProcess().add(((net.sourceforge.czt.z.jaxb.gen.impl.RefNameImpl) spawnChildFromText((net.sourceforge.czt.z.jaxb.gen.impl.RefNameImpl.class), 3, value)));
                            return ;
                        case  8 :
                            attIdx = context.getAttribute("", "Decl");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            _getChannels().add(((net.sourceforge.czt.z.jaxb.gen.impl.RefNameImpl) spawnChildFromText((net.sourceforge.czt.z.jaxb.gen.impl.RefNameImpl.class), 9, value)));
                            return ;
                        case  10 :
                            revertToParentFromText(value);
                            return ;
                        case  5 :
                            attIdx = context.getAttribute("", "Decl");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            _getRightProcess().add(((net.sourceforge.czt.z.jaxb.gen.impl.RefNameImpl) spawnChildFromText((net.sourceforge.czt.z.jaxb.gen.impl.RefNameImpl.class), 6, value)));
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
