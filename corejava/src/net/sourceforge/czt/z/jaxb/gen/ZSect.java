//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2005.02.24 at 01:10:48 GMT 
//


package net.sourceforge.czt.z.jaxb.gen;


/**
 * Java content class for ZSect complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/research/czt/gnast/src/xsd/Z.xsd line 1141)
 * <p>
 * <pre>
 * &lt;complexType name="ZSect">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/zml}Sect">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://czt.sourceforge.net/zml}Parent" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://czt.sourceforge.net/zml}Para" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface ZSect
    extends net.sourceforge.czt.z.jaxb.gen.Sect
{


    /**
     * Gets the value of the Parent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the Parent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link net.sourceforge.czt.z.jaxb.gen.Parent}
     * {@link net.sourceforge.czt.z.jaxb.gen.ParentElement}
     * 
     */
    java.util.List getParent();

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getName();

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setName(java.lang.String value);

    /**
     * Gets the value of the Para property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the Para property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPara().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link net.sourceforge.czt.z.jaxb.gen.AxParaElement}
     * {@link net.sourceforge.czt.z.jaxb.gen.GivenParaElement}
     * {@link net.sourceforge.czt.zpatt.jaxb.gen.RuleElement}
     * {@link net.sourceforge.czt.z.jaxb.gen.OptempParaElement}
     * {@link net.sourceforge.czt.z.jaxb.gen.Para}
     * {@link net.sourceforge.czt.z.jaxb.gen.FreeParaElement}
     * {@link net.sourceforge.czt.zpatt.jaxb.gen.JokersElement}
     * {@link net.sourceforge.czt.oz.jaxb.gen.ClassParaElement}
     * {@link net.sourceforge.czt.z.jaxb.gen.NarrParaElement}
     * {@link net.sourceforge.czt.z.jaxb.gen.LatexMarkupParaElement}
     * {@link net.sourceforge.czt.z.jaxb.gen.ConjParaElement}
     * {@link net.sourceforge.czt.z.jaxb.gen.UnparsedParaElement}
     * {@link net.sourceforge.czt.z.jaxb.gen.ParaElement}
     * 
     */
    java.util.List getPara();

}
