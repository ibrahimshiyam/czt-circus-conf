//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2005.03.03 at 09:16:01 GMT 
//


package net.sourceforge.czt.tcoz.jaxb.gen;


/**
 * Java content class for SynPllProExpr complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/research/czt/gnast/src/xsd/TCOZ.xsd line 256)
 * <p>
 * <pre>
 * &lt;complexType name="SynPllProExpr">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/object-z}OpExpr2">
 *       &lt;sequence>
 *         &lt;element name="Events" type="{http://czt.sourceforge.net/tcoz}EventSet"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface SynPllProExpr
    extends net.sourceforge.czt.oz.jaxb.gen.OpExpr2
{


    /**
     * Gets the value of the events property.
     * 
     * @return
     *     possible object is
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.EventSet}
     */
    net.sourceforge.czt.tcoz.jaxb.gen.EventSet getEvents();

    /**
     * Sets the value of the events property.
     * 
     * @param value
     *     allowed object is
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.EventSet}
     */
    void setEvents(net.sourceforge.czt.tcoz.jaxb.gen.EventSet value);

}
