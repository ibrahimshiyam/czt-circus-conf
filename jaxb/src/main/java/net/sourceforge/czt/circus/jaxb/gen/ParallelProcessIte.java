//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.5-b16-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.06.26 at 02:10:37 PM NZST 
//


package net.sourceforge.czt.circus.jaxb.gen;


/**
 * Java content class for ParallelProcessIte complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/research/czt/trunk/jaxb/build/xsd/Circus.xsd line 2011)
 * <p>
 * <pre>
 * &lt;complexType name="ParallelProcessIte">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/circus}ParProcessIte">
 *       &lt;sequence>
 *         &lt;element ref="{http://czt.sourceforge.net/circus}ChannelSet"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface ParallelProcessIte
    extends net.sourceforge.czt.circus.jaxb.gen.ParProcessIte
{


    /**
     * Gets the value of the channelSet property.
     * 
     * @return
     *     possible object is
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ChannelSet}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ChannelSetElement}
     */
    net.sourceforge.czt.circus.jaxb.gen.ChannelSet getChannelSet();

    /**
     * Sets the value of the channelSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ChannelSet}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ChannelSetElement}
     */
    void setChannelSet(net.sourceforge.czt.circus.jaxb.gen.ChannelSet value);

}
