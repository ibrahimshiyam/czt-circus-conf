//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2005.02.24 at 01:10:48 GMT 
//


package net.sourceforge.czt.z.jaxb.gen;


/**
 * Java content class for Directive complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/research/czt/gnast/src/xsd/Z.xsd line 1264)
 * <p>
 * <pre>
 * &lt;complexType name="Directive">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/zml}TermA">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Unicode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Type" type="{http://czt.sourceforge.net/zml}DirectiveType" default="NONE" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface Directive
    extends net.sourceforge.czt.z.jaxb.gen.TermA
{


    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getType();

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setType(java.lang.String value);

    /**
     * Gets the value of the unicode property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getUnicode();

    /**
     * Sets the value of the unicode property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setUnicode(java.lang.String value);

    /**
     * Gets the value of the command property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getCommand();

    /**
     * Sets the value of the command property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setCommand(java.lang.String value);

}
