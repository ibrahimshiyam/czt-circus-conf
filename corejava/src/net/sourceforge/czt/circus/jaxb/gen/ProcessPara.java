//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2005.03.03 at 09:16:01 GMT 
//


package net.sourceforge.czt.circus.jaxb.gen;


/**
 * Java content class for ProcessPara complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/research/czt/gnast/src/xsd/Circus.xsd line 1005)
 * <p>
 * <pre>
 * &lt;complexType name="ProcessPara">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/zml}Para">
 *       &lt;sequence>
 *         &lt;element ref="{http://czt.sourceforge.net/zml}DeclName"/>
 *         &lt;element ref="{http://czt.sourceforge.net/circus}ProcessDef"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface ProcessPara
    extends net.sourceforge.czt.z.jaxb.gen.Para
{


    /**
     * Gets the value of the processDef property.
     * 
     * @return
     *     possible object is
     *     {@link net.sourceforge.czt.circus.jaxb.gen.InterleaveProcessR}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ActualGenProcess}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.CallProcessElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ParallelProcessRIElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.IntChoiceProcessRI}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.RenameProcessElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.InstantiationProcess}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.SeqProcessRI}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ExtChoiceProcessR}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ExtChoiceProcess}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.DescProcessElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.IndexedProcess}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.FormalParamProcess}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.IntChoiceProcess}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.InterleaveProcessRI}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ParallelProcessElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.SeqProcess}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.FormalGenProcessElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ProcessDef}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ParallelProcessRElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.IntChoiceProcessR}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ActualParamProcess}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.SeqProcessR}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.InterleaveProcess}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ExtChoiceProcessRI}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ProcessDefElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.HideProcessElement}
     */
    net.sourceforge.czt.circus.jaxb.gen.ProcessDef getProcessDef();

    /**
     * Sets the value of the processDef property.
     * 
     * @param value
     *     allowed object is
     *     {@link net.sourceforge.czt.circus.jaxb.gen.InterleaveProcessR}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ActualGenProcess}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.CallProcessElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ParallelProcessRIElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.IntChoiceProcessRI}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.RenameProcessElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.InstantiationProcess}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.SeqProcessRI}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ExtChoiceProcessR}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ExtChoiceProcess}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.DescProcessElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.IndexedProcess}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.FormalParamProcess}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.IntChoiceProcess}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.InterleaveProcessRI}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ParallelProcessElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.SeqProcess}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.FormalGenProcessElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ProcessDef}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ParallelProcessRElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.IntChoiceProcessR}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ActualParamProcess}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.SeqProcessR}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.InterleaveProcess}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ExtChoiceProcessRI}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ProcessDefElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.HideProcessElement}
     */
    void setProcessDef(net.sourceforge.czt.circus.jaxb.gen.ProcessDef value);

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

}
