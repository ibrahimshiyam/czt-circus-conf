//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.5-b16-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.06.26 at 02:10:37 PM NZST 
//


package net.sourceforge.czt.circus.jaxb.gen;


/**
 * Java content class for BasicProcess complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/research/czt/trunk/jaxb/build/xsd/Circus.xsd line 1794)
 * <p>
 * <pre>
 * &lt;complexType name="BasicProcess">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/circus}CircusProcess">
 *       &lt;sequence>
 *         &lt;element name="StatePara" type="{http://czt.sourceforge.net/zml}Para"/>
 *         &lt;element name="LocalPara" type="{http://czt.sourceforge.net/zml}ParaList"/>
 *         &lt;element name="OnTheFlyPara" type="{http://czt.sourceforge.net/zml}ParaList"/>
 *         &lt;element name="MainAction" type="{http://czt.sourceforge.net/circus}CircusAction"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface BasicProcess
    extends net.sourceforge.czt.circus.jaxb.gen.CircusProcess
{


    /**
     * Gets the value of the localPara property.
     * 
     * @return
     *     possible object is
     *     {@link net.sourceforge.czt.z.jaxb.gen.ParaList}
     */
    net.sourceforge.czt.z.jaxb.gen.ParaList getLocalPara();

    /**
     * Sets the value of the localPara property.
     * 
     * @param value
     *     allowed object is
     *     {@link net.sourceforge.czt.z.jaxb.gen.ParaList}
     */
    void setLocalPara(net.sourceforge.czt.z.jaxb.gen.ParaList value);

    /**
     * Gets the value of the onTheFlyPara property.
     * 
     * @return
     *     possible object is
     *     {@link net.sourceforge.czt.z.jaxb.gen.ParaList}
     */
    net.sourceforge.czt.z.jaxb.gen.ParaList getOnTheFlyPara();

    /**
     * Sets the value of the onTheFlyPara property.
     * 
     * @param value
     *     allowed object is
     *     {@link net.sourceforge.czt.z.jaxb.gen.ParaList}
     */
    void setOnTheFlyPara(net.sourceforge.czt.z.jaxb.gen.ParaList value);

    /**
     * Gets the value of the mainAction property.
     * 
     * @return
     *     possible object is
     *     {@link net.sourceforge.czt.circus.jaxb.gen.CircusAction}
     */
    net.sourceforge.czt.circus.jaxb.gen.CircusAction getMainAction();

    /**
     * Sets the value of the mainAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link net.sourceforge.czt.circus.jaxb.gen.CircusAction}
     */
    void setMainAction(net.sourceforge.czt.circus.jaxb.gen.CircusAction value);

    /**
     * Gets the value of the statePara property.
     * 
     * @return
     *     possible object is
     *     {@link net.sourceforge.czt.z.jaxb.gen.Para}
     */
    net.sourceforge.czt.z.jaxb.gen.Para getStatePara();

    /**
     * Sets the value of the statePara property.
     * 
     * @param value
     *     allowed object is
     *     {@link net.sourceforge.czt.z.jaxb.gen.Para}
     */
    void setStatePara(net.sourceforge.czt.z.jaxb.gen.Para value);

}
