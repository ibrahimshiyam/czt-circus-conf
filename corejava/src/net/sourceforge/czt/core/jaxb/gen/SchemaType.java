//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.1-05/30/2003 05:06 AM(java_re)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2003.08.25 at 04:40:49 NZST 
//


package net.sourceforge.czt.core.jaxb.gen;


/**
 * Java content class for SchemaType complex type.
 *  <p>The following schema fragment specifies the expected content contained within this java content object.
 * <p>
 * <pre>
 * &lt;complexType name="SchemaType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/zml}Type">
 *       &lt;sequence>
 *         &lt;element ref="{http://czt.sourceforge.net/zml}Signature"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface SchemaType
    extends net.sourceforge.czt.core.jaxb.gen.Type
{


    /**
     * 
     * @return possible object is
     * {@link net.sourceforge.czt.core.jaxb.gen.Signature}
     */
    net.sourceforge.czt.core.jaxb.gen.Signature getSignature();

    /**
     * 
     * @param value allowed object is
     * {@link net.sourceforge.czt.core.jaxb.gen.Signature}
     */
    void setSignature(net.sourceforge.czt.core.jaxb.gen.Signature value);

}
