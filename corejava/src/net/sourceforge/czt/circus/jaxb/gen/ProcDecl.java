//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2005.02.24 at 01:10:48 GMT 
//


package net.sourceforge.czt.circus.jaxb.gen;


/**
 * Java content class for ProcDecl complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/research/czt/gnast/src/xsd/Circus.xsd line 927)
 * <p>
 * <pre>
 * &lt;complexType name="ProcDecl">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/circus}CircusPara">
 *       &lt;sequence>
 *         &lt;element ref="{http://czt.sourceforge.net/zml}DeclName"/>
 *         &lt;element ref="{http://czt.sourceforge.net/circus}ProcDef"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface ProcDecl
    extends net.sourceforge.czt.circus.jaxb.gen.CircusPara
{


    /**
     * Gets the value of the declName property.
     * 
     * @return
     *     possible object is
     *     {@link net.sourceforge.czt.z.jaxb.gen.DeclName}
     *     {@link net.sourceforge.czt.z.jaxb.gen.DeclNameElement}
     *     {@link net.sourceforge.czt.zpatt.jaxb.gen.JokerNameElement}
     */
    net.sourceforge.czt.z.jaxb.gen.DeclName getDeclName();

    /**
     * Sets the value of the declName property.
     * 
     * @param value
     *     allowed object is
     *     {@link net.sourceforge.czt.z.jaxb.gen.DeclName}
     *     {@link net.sourceforge.czt.z.jaxb.gen.DeclNameElement}
     *     {@link net.sourceforge.czt.zpatt.jaxb.gen.JokerNameElement}
     */
    void setDeclName(net.sourceforge.czt.z.jaxb.gen.DeclName value);

    /**
     * Gets the value of the procDef property.
     * 
     * @return
     *     possible object is
     *     {@link net.sourceforge.czt.circus.jaxb.gen.IdxRepInterleaveProc}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.RepIntChProc}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.RepExtChProc}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.IdxRepParallelCompProcElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.SeqCompProc}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ProcDefElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ProcDef}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.HideProcElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.IdxRepExtChProc}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.CallProcElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.RepInterleaveProc}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ActualParamProc}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ProcDescElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.InterleaveProc}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ExtChoiceProc}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.RenameProcElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.FormalParamProc}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.IdxRepSeqCompProc}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.IntantiationProc}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.IntChoiceProc}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.IdxRepIntChProc}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ParallelCompProcElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.RepParallelCompProcElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ActualGenProc}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.FormalGenProcElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.IndexedProc}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.RepSeqCompProc}
     */
    net.sourceforge.czt.circus.jaxb.gen.ProcDef getProcDef();

    /**
     * Sets the value of the procDef property.
     * 
     * @param value
     *     allowed object is
     *     {@link net.sourceforge.czt.circus.jaxb.gen.IdxRepInterleaveProc}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.RepIntChProc}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.RepExtChProc}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.IdxRepParallelCompProcElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.SeqCompProc}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ProcDefElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ProcDef}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.HideProcElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.IdxRepExtChProc}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.CallProcElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.RepInterleaveProc}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ActualParamProc}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ProcDescElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.InterleaveProc}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ExtChoiceProc}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.RenameProcElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.FormalParamProc}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.IdxRepSeqCompProc}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.IntantiationProc}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.IntChoiceProc}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.IdxRepIntChProc}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ParallelCompProcElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.RepParallelCompProcElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ActualGenProc}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.FormalGenProcElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.IndexedProc}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.RepSeqCompProc}
     */
    void setProcDef(net.sourceforge.czt.circus.jaxb.gen.ProcDef value);

}
