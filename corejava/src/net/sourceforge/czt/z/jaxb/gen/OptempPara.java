//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2004.06.09 at 03:13:59 NZST 
//


package net.sourceforge.czt.z.jaxb.gen;


/**
 * Java content class for OptempPara complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/research/tmp/czt/gnast/src/xsd/Z.xsd line 1181)
 * <p>
 * <pre>
 * &lt;complexType name="OptempPara">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/zml}Para">
 *       &lt;sequence>
 *         &lt;element ref="{http://czt.sourceforge.net/zml}Oper" maxOccurs="unbounded" minOccurs="2"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Assoc" type="{http://czt.sourceforge.net/zml}Assoc" />
 *       &lt;attribute name="Prec" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="Cat" use="required" type="{http://czt.sourceforge.net/zml}Cat" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface OptempPara
    extends net.sourceforge.czt.z.jaxb.gen.Para
{


    /**
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getCat();

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setCat(java.lang.String value);

    /**
     * Gets the value of the Oper property.
     * 
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the Oper property.
     * 
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOper().add(newItem);
     * </pre>
     * 
     * 
     * Objects of the following type(s) are allowed in the list
     * {@link net.sourceforge.czt.z.jaxb.gen.OperandElement}
     * {@link net.sourceforge.czt.z.jaxb.gen.OperElement}
     * {@link net.sourceforge.czt.z.jaxb.gen.Oper}
     * {@link net.sourceforge.czt.z.jaxb.gen.OperatorElement}
     * 
     */
    java.util.List getOper();

    /**
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getAssoc();

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setAssoc(java.lang.String value);

    /**
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Integer}
     */
    java.lang.Integer getPrec();

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Integer}
     */
    void setPrec(java.lang.Integer value);

}
