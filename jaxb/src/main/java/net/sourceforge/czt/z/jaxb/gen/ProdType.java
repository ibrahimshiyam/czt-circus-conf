//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.5-b16-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.06.26 at 02:10:37 PM NZST 
//


package net.sourceforge.czt.z.jaxb.gen;


/**
 * Java content class for ProdType complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/research/czt/trunk/jaxb/build/xsd/Z.xsd line 2342)
 * <p>
 * <pre>
 * &lt;complexType name="ProdType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/zml}Type2">
 *       &lt;sequence>
 *         &lt;element ref="{http://czt.sourceforge.net/zml}Type2" maxOccurs="unbounded" minOccurs="2"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface ProdType
    extends net.sourceforge.czt.z.jaxb.gen.Type2
{


    /**
     * Gets the value of the Type property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the Type property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link net.sourceforge.czt.z.jaxb.gen.PowerTypeElement}
     * {@link net.sourceforge.czt.circus.jaxb.gen.ActionTypeElement}
     * {@link net.sourceforge.czt.oz.jaxb.gen.ClassUnionTypeElement}
     * {@link net.sourceforge.czt.z.jaxb.gen.Type2Element}
     * {@link net.sourceforge.czt.tcoz.jaxb.gen.ChannelTypeElement}
     * {@link net.sourceforge.czt.z.jaxb.gen.GivenTypeElement}
     * {@link net.sourceforge.czt.circus.jaxb.gen.NameSetTypeElement}
     * {@link net.sourceforge.czt.z.jaxb.gen.Type2}
     * {@link net.sourceforge.czt.z.jaxb.gen.SchemaTypeElement}
     * {@link net.sourceforge.czt.circus.jaxb.gen.ProcessTypeElement}
     * {@link net.sourceforge.czt.oz.jaxb.gen.ClassPolyTypeElement}
     * {@link net.sourceforge.czt.circus.jaxb.gen.ChannelSetTypeElement}
     * {@link net.sourceforge.czt.oz.jaxb.gen.ClassRefTypeElement}
     * {@link net.sourceforge.czt.z.jaxb.gen.GenParamTypeElement}
     * {@link net.sourceforge.czt.z.jaxb.gen.ProdTypeElement}
     * 
     */
    java.util.List getType();

}
