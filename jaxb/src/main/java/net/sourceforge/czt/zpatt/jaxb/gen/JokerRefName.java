//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.5-b16-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.06.26 at 02:10:37 PM NZST 
//


package net.sourceforge.czt.zpatt.jaxb.gen;


/**
 * Java content class for JokerRefName complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/research/czt/trunk/jaxb/build/xsd/ZPattern.xsd line 574)
 * <p>
 * <pre>
 * &lt;complexType name="JokerRefName">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/zml}RefName">
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface JokerRefName
    extends net.sourceforge.czt.z.jaxb.gen.RefName
{


    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getName();

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setName(java.lang.String value);

}
