//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.5-b16-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.06.26 at 02:10:37 PM NZST 
//


package net.sourceforge.czt.circus.jaxb.gen;


/**
 * Java content class for CircusFieldList complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/research/czt/trunk/jaxb/build/xsd/Circus.xsd line 2317)
 * <p>
 * <pre>
 * &lt;complexType name="CircusFieldList">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/circus}FieldList">
 *       &lt;sequence>
 *         &lt;element ref="{http://czt.sourceforge.net/circus}Field" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface CircusFieldList
    extends net.sourceforge.czt.circus.jaxb.gen.FieldList
{


    /**
     * Gets the value of the Field property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the Field property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link net.sourceforge.czt.circus.jaxb.gen.DotFieldElement}
     * {@link net.sourceforge.czt.circus.jaxb.gen.Field}
     * {@link net.sourceforge.czt.circus.jaxb.gen.FieldElement}
     * {@link net.sourceforge.czt.circus.jaxb.gen.OutputField}
     * {@link net.sourceforge.czt.circus.jaxb.gen.InputFieldElement}
     * 
     */
    java.util.List getField();

}
