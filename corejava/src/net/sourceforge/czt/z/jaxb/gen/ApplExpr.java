//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2004.06.09 at 01:28:31 NZST 
//


package net.sourceforge.czt.z.jaxb.gen;


/**
 * Java content class for ApplExpr complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/research/tmp/czt/gnast/src/xsd/Z.xsd line 1492)
 * <p>
 * <pre>
 * &lt;complexType name="ApplExpr">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/zml}Expr2">
 *       &lt;attribute name="Mixfix" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface ApplExpr
    extends net.sourceforge.czt.z.jaxb.gen.Expr2
{


    /**
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean}
     */
    java.lang.Boolean getMixfix();

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Boolean}
     */
    void setMixfix(java.lang.Boolean value);

}
