//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.5-b16-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.06.26 at 02:10:37 PM NZST 
//


package net.sourceforge.czt.z.jaxb.gen;


/**
 * Java content class for DecorExpr complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/research/czt/trunk/jaxb/build/xsd/Z.xsd line 1913)
 * <p>
 * <pre>
 * &lt;complexType name="DecorExpr">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/zml}Expr1">
 *       &lt;sequence>
 *         &lt;element ref="{http://czt.sourceforge.net/zml}Stroke"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface DecorExpr
    extends net.sourceforge.czt.z.jaxb.gen.Expr1
{


    /**
     * Gets the value of the stroke property.
     * 
     * @return
     *     possible object is
     *     {@link net.sourceforge.czt.z.jaxb.gen.StrokeElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.Stroke}
     *     {@link net.sourceforge.czt.z.jaxb.gen.NextStroke}
     *     {@link net.sourceforge.czt.z.jaxb.gen.NumStrokeElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.OutStroke}
     *     {@link net.sourceforge.czt.z.jaxb.gen.InStroke}
     */
    net.sourceforge.czt.z.jaxb.gen.Stroke getStroke();

    /**
     * Sets the value of the stroke property.
     * 
     * @param value
     *     allowed object is
     *     {@link net.sourceforge.czt.z.jaxb.gen.StrokeElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.Stroke}
     *     {@link net.sourceforge.czt.z.jaxb.gen.NextStroke}
     *     {@link net.sourceforge.czt.z.jaxb.gen.NumStrokeElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.OutStroke}
     *     {@link net.sourceforge.czt.z.jaxb.gen.InStroke}
     */
    void setStroke(net.sourceforge.czt.z.jaxb.gen.Stroke value);

}
