//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2004.07.23 at 08:45:41 NZST 
//


package net.sourceforge.czt.z.jaxb.gen;


/**
 * Java content class for SchExpr complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/research/projects/gnast/src/xsd/Z.xsd line 1460)
 * <p>
 * <pre>
 * &lt;complexType name="SchExpr">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/zml}Expr">
 *       &lt;sequence>
 *         &lt;element ref="{http://czt.sourceforge.net/zml}SchText"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface SchExpr
    extends net.sourceforge.czt.z.jaxb.gen.Expr
{


    /**
     * 
     * @return
     *     possible object is
     *     {@link net.sourceforge.czt.z.jaxb.gen.SchTextElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.SchText}
     */
    net.sourceforge.czt.z.jaxb.gen.SchText getSchText();

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link net.sourceforge.czt.z.jaxb.gen.SchTextElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.SchText}
     */
    void setSchText(net.sourceforge.czt.z.jaxb.gen.SchText value);

}
