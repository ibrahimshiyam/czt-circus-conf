//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2004.01.05 at 10:33:20 NZDT 
//


package net.sourceforge.czt.z.jaxb.gen;


/**
 * Type annotations give the type of an expression/term
 * Java content class for TypeAnn complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/research/projects/gnast/src/xsd/Z.xsd line 1305)
 * <p>
 * <pre>
 * &lt;complexType name="TypeAnn">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/zml}Ann">
 *       &lt;sequence>
 *         &lt;element ref="{http://czt.sourceforge.net/zml}Type"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface TypeAnn
    extends net.sourceforge.czt.z.jaxb.gen.Ann
{


    /**
     * 
     * @return
     *     possible object is
     *     {@link net.sourceforge.czt.z.jaxb.gen.TypeElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.Type}
     *     {@link net.sourceforge.czt.z.jaxb.gen.PowerTypeElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.GenTypeElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.SchemaTypeElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.GivenTypeElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.ProdTypeElement}
     */
    net.sourceforge.czt.z.jaxb.gen.Type getType();

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link net.sourceforge.czt.z.jaxb.gen.TypeElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.Type}
     *     {@link net.sourceforge.czt.z.jaxb.gen.PowerTypeElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.GenTypeElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.SchemaTypeElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.GivenTypeElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.ProdTypeElement}
     */
    void setType(net.sourceforge.czt.z.jaxb.gen.Type value);

}
