//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2005.02.14 at 08:40:58 GMT 
//


package net.sourceforge.czt.oz.jaxb.gen;


/**
 * Java content class for AnonOpExpr complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/research/czt/gnast/src/xsd/Object-Z.xsd line 313)
 * <p>
 * <pre>
 * &lt;complexType name="AnonOpExpr">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/object-z}OpExpr">
 *       &lt;sequence>
 *         &lt;element ref="{http://czt.sourceforge.net/object-z}OpText" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface AnonOpExpr
    extends net.sourceforge.czt.oz.jaxb.gen.OpExpr
{


    /**
     * Gets the value of the opText property.
     * 
     * @return
     *     possible object is
     *     {@link net.sourceforge.czt.oz.jaxb.gen.OpText}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.OpTextElement}
     */
    net.sourceforge.czt.oz.jaxb.gen.OpText getOpText();

    /**
     * Sets the value of the opText property.
     * 
     * @param value
     *     allowed object is
     *     {@link net.sourceforge.czt.oz.jaxb.gen.OpText}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.OpTextElement}
     */
    void setOpText(net.sourceforge.czt.oz.jaxb.gen.OpText value);

}
