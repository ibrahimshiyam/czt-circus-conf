//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2005.03.03 at 09:16:01 GMT 
//


package net.sourceforge.czt.z.jaxb.gen;


/**
 * Java content class for NumStroke complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/research/czt/gnast/src/xsd/Z.xsd line 1351)
 * <p>
 * <pre>
 * &lt;complexType name="NumStroke">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/zml}Stroke">
 *       &lt;attribute name="Number" use="required" type="{http://czt.sourceforge.net/zml}Number" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface NumStroke
    extends net.sourceforge.czt.z.jaxb.gen.Stroke
{


    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Integer}
     */
    java.lang.Integer getNumber();

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Integer}
     */
    void setNumber(java.lang.Integer value);

}
