//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2004.02.19 at 05:33:12 NZDT 
//


package net.sourceforge.czt.z.jaxb.gen;


/**
 * Java content class for TupleSelExpr complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/research/projects/gnast/src/xsd/Z.xsd line 1455)
 * <p>
 * <pre>
 * &lt;complexType name="TupleSelExpr">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/zml}Expr1">
 *       &lt;attribute name="Select" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface TupleSelExpr
    extends net.sourceforge.czt.z.jaxb.gen.Expr1
{


    /**
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Integer}
     */
    java.lang.Integer getSelect();

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Integer}
     */
    void setSelect(java.lang.Integer value);

}
