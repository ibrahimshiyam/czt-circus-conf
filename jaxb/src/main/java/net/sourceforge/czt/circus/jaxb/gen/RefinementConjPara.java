//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.5-b16-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.06.26 at 02:10:37 PM NZST 
//


package net.sourceforge.czt.circus.jaxb.gen;


/**
 * Java content class for RefinementConjPara complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/research/czt/trunk/jaxb/build/xsd/Circus.xsd line 1698)
 * <p>
 * <pre>
 * &lt;complexType name="RefinementConjPara">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/circus}CircusConjPara">
 *       &lt;sequence>
 *         &lt;element name="Specification" type="{http://czt.sourceforge.net/circus}CircusAction"/>
 *         &lt;element name="Implementation" type="{http://czt.sourceforge.net/circus}CircusAction"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Model" type="{http://czt.sourceforge.net/circus}Model" default="FlDv" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface RefinementConjPara
    extends net.sourceforge.czt.circus.jaxb.gen.CircusConjPara
{


    /**
     * Gets the value of the specification property.
     * 
     * @return
     *     possible object is
     *     {@link net.sourceforge.czt.circus.jaxb.gen.CircusAction}
     */
    net.sourceforge.czt.circus.jaxb.gen.CircusAction getSpecification();

    /**
     * Sets the value of the specification property.
     * 
     * @param value
     *     allowed object is
     *     {@link net.sourceforge.czt.circus.jaxb.gen.CircusAction}
     */
    void setSpecification(net.sourceforge.czt.circus.jaxb.gen.CircusAction value);

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getModel();

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setModel(java.lang.String value);

    /**
     * Gets the value of the implementation property.
     * 
     * @return
     *     possible object is
     *     {@link net.sourceforge.czt.circus.jaxb.gen.CircusAction}
     */
    net.sourceforge.czt.circus.jaxb.gen.CircusAction getImplementation();

    /**
     * Sets the value of the implementation property.
     * 
     * @param value
     *     allowed object is
     *     {@link net.sourceforge.czt.circus.jaxb.gen.CircusAction}
     */
    void setImplementation(net.sourceforge.czt.circus.jaxb.gen.CircusAction value);

}
