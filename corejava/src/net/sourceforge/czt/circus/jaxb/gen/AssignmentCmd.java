//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2005.02.24 at 01:10:48 GMT 
//


package net.sourceforge.czt.circus.jaxb.gen;


/**
 * Java content class for AssignmentCmd complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/research/czt/gnast/src/xsd/Circus.xsd line 1475)
 * <p>
 * <pre>
 * &lt;complexType name="AssignmentCmd">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/circus}Command">
 *       &lt;sequence>
 *         &lt;element ref="{http://czt.sourceforge.net/circus}AssignmentPair" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface AssignmentCmd
    extends net.sourceforge.czt.circus.jaxb.gen.Command
{


    /**
     * Gets the value of the AssignmentPair property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the AssignmentPair property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssignmentPair().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link net.sourceforge.czt.circus.jaxb.gen.AssignmentPairElement}
     * {@link net.sourceforge.czt.circus.jaxb.gen.AssignmentPair}
     * 
     */
    java.util.List getAssignmentPair();

}
