//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2004.02.19 at 05:33:12 NZDT 
//


package net.sourceforge.czt.z.jaxb.gen;


/**
 * Java content class for AxPara complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/research/projects/gnast/src/xsd/Z.xsd line 1055)
 * <p>
 * <pre>
 * &lt;complexType name="AxPara">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/zml}Para">
 *       &lt;sequence>
 *         &lt;element ref="{http://czt.sourceforge.net/zml}DeclName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://czt.sourceforge.net/zml}SchText"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Box" type="{http://czt.sourceforge.net/zml}Box" default="AxBox" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface AxPara
    extends net.sourceforge.czt.z.jaxb.gen.Para
{


    /**
     * 
     * @return
     *     possible object is
     *     {@link net.sourceforge.czt.z.jaxb.gen.SchText}
     *     {@link net.sourceforge.czt.z.jaxb.gen.SchTextElement}
     */
    net.sourceforge.czt.z.jaxb.gen.SchText getSchText();

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link net.sourceforge.czt.z.jaxb.gen.SchText}
     *     {@link net.sourceforge.czt.z.jaxb.gen.SchTextElement}
     */
    void setSchText(net.sourceforge.czt.z.jaxb.gen.SchText value);

    /**
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getBox();

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setBox(java.lang.String value);

    /**
     * Gets the value of the DeclName property.
     * 
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the DeclName property.
     * 
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeclName().add(newItem);
     * </pre>
     * 
     * 
     * Objects of the following type(s) are allowed in the list
     * {@link net.sourceforge.czt.z.jaxb.gen.DeclNameElement}
     * {@link net.sourceforge.czt.z.jaxb.gen.DeclName}
     * 
     */
    java.util.List getDeclName();

}
