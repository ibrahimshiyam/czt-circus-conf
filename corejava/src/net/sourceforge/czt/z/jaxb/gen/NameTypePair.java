//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2004.06.09 at 03:13:59 NZST 
//


package net.sourceforge.czt.z.jaxb.gen;


/**
 * Java content class for NameTypePair complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/research/tmp/czt/gnast/src/xsd/Z.xsd line 1755)
 * <p>
 * <pre>
 * &lt;complexType name="NameTypePair">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://czt.sourceforge.net/zml}DeclName"/>
 *         &lt;element ref="{http://czt.sourceforge.net/zml}Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface NameTypePair {


    /**
     * 
     * @return
     *     possible object is
     *     {@link net.sourceforge.czt.z.jaxb.gen.Type}
     *     {@link net.sourceforge.czt.z.jaxb.gen.GenTypeElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.ProdTypeElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.SchemaTypeElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.TypeElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.PowerTypeElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.GivenTypeElement}
     */
    net.sourceforge.czt.z.jaxb.gen.Type getType();

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link net.sourceforge.czt.z.jaxb.gen.Type}
     *     {@link net.sourceforge.czt.z.jaxb.gen.GenTypeElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.ProdTypeElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.SchemaTypeElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.TypeElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.PowerTypeElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.GivenTypeElement}
     */
    void setType(net.sourceforge.czt.z.jaxb.gen.Type value);

    /**
     * 
     * @return
     *     possible object is
     *     {@link net.sourceforge.czt.z.jaxb.gen.DeclName}
     */
    net.sourceforge.czt.z.jaxb.gen.DeclName getName();

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link net.sourceforge.czt.z.jaxb.gen.DeclName}
     */
    void setName(net.sourceforge.czt.z.jaxb.gen.DeclName value);

}
