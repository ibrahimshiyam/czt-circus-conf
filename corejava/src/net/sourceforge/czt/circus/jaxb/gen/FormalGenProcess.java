//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2005.03.03 at 09:16:01 GMT 
//


package net.sourceforge.czt.circus.jaxb.gen;


/**
 * Java content class for FormalGenProcess complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/research/czt/gnast/src/xsd/Circus.xsd line 1187)
 * <p>
 * <pre>
 * &lt;complexType name="FormalGenProcess">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/circus}Process1">
 *       &lt;sequence>
 *         &lt;element name="FormalGenTypes" type="{http://czt.sourceforge.net/zml}RefName" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface FormalGenProcess
    extends net.sourceforge.czt.circus.jaxb.gen.Process1
{


    /**
     * Gets the value of the FormalGenTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the FormalGenTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormalGenTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link net.sourceforge.czt.z.jaxb.gen.RefName}
     * 
     */
    java.util.List getFormalGenTypes();

}
