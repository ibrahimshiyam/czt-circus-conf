//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.5-b16-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.06.26 at 02:10:37 PM NZST 
//


package net.sourceforge.czt.circus.jaxb.gen;


/**
 * Java content class for ActionType complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/research/czt/trunk/jaxb/build/xsd/Circus.xsd line 2573)
 * <p>
 * <pre>
 * &lt;complexType name="ActionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/zml}Type2">
 *       &lt;sequence>
 *         &lt;element ref="{http://czt.sourceforge.net/circus}ActionSignature"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface ActionType
    extends net.sourceforge.czt.z.jaxb.gen.Type2
{


    /**
     * Gets the value of the actionSignature property.
     * 
     * @return
     *     possible object is
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ActionSignatureElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ActionSignature}
     */
    net.sourceforge.czt.circus.jaxb.gen.ActionSignature getActionSignature();

    /**
     * Sets the value of the actionSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ActionSignatureElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ActionSignature}
     */
    void setActionSignature(net.sourceforge.czt.circus.jaxb.gen.ActionSignature value);

}
