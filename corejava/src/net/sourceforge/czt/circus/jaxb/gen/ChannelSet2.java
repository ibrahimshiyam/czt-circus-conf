//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2005.03.03 at 09:16:01 GMT 
//


package net.sourceforge.czt.circus.jaxb.gen;


/**
 * Java content class for ChannelSet2 complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/research/czt/gnast/src/xsd/Circus.xsd line 1046)
 * <p>
 * <pre>
 * &lt;complexType name="ChannelSet2">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/circus}ChannelSet">
 *       &lt;sequence>
 *         &lt;element ref="{http://czt.sourceforge.net/circus}ChannelSet"/>
 *         &lt;element ref="{http://czt.sourceforge.net/circus}ChannelSet"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface ChannelSet2
    extends net.sourceforge.czt.circus.jaxb.gen.ChannelSet
{


    /**
     * Gets the value of the rightOperand property.
     * 
     * @return
     *     possible object is
     *     {@link net.sourceforge.czt.circus.jaxb.gen.IntersectChannelSet}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.SetChannelSetElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.UnionChannelSet}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ChannelSetElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ChannelSet}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.DifferenceChannelSet}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.RefChannelSetElement}
     */
    net.sourceforge.czt.circus.jaxb.gen.ChannelSet getRightOperand();

    /**
     * Sets the value of the rightOperand property.
     * 
     * @param value
     *     allowed object is
     *     {@link net.sourceforge.czt.circus.jaxb.gen.IntersectChannelSet}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.SetChannelSetElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.UnionChannelSet}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ChannelSetElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ChannelSet}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.DifferenceChannelSet}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.RefChannelSetElement}
     */
    void setRightOperand(net.sourceforge.czt.circus.jaxb.gen.ChannelSet value);

    /**
     * Gets the value of the leftOperand property.
     * 
     * @return
     *     possible object is
     *     {@link net.sourceforge.czt.circus.jaxb.gen.IntersectChannelSet}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.SetChannelSetElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.UnionChannelSet}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ChannelSetElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ChannelSet}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.DifferenceChannelSet}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.RefChannelSetElement}
     */
    net.sourceforge.czt.circus.jaxb.gen.ChannelSet getLeftOperand();

    /**
     * Sets the value of the leftOperand property.
     * 
     * @param value
     *     allowed object is
     *     {@link net.sourceforge.czt.circus.jaxb.gen.IntersectChannelSet}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.SetChannelSetElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.UnionChannelSet}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ChannelSetElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ChannelSet}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.DifferenceChannelSet}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.RefChannelSetElement}
     */
    void setLeftOperand(net.sourceforge.czt.circus.jaxb.gen.ChannelSet value);

}
