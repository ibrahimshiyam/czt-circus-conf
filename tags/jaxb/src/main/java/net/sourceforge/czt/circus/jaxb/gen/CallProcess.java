//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.5-b16-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.06.26 at 02:10:37 PM NZST 
//


package net.sourceforge.czt.circus.jaxb.gen;


/**
 * Java content class for CallProcess complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/research/czt/trunk/jaxb/build/xsd/Circus.xsd line 1859)
 * <p>
 * <pre>
 * &lt;complexType name="CallProcess">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/circus}CircusProcess">
 *       &lt;sequence>
 *         &lt;element name="CallExpr" type="{http://czt.sourceforge.net/zml}RefExpr"/>
 *         &lt;element name="Actuals" type="{http://czt.sourceforge.net/zml}ExprList"/>
 *       &lt;/sequence>
 *       &lt;attribute name="CallKind" type="{http://czt.sourceforge.net/circus}CallKind" default="Param" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface CallProcess
    extends net.sourceforge.czt.circus.jaxb.gen.CircusProcess
{


    /**
     * Gets the value of the callExpr property.
     * 
     * @return
     *     possible object is
     *     {@link net.sourceforge.czt.z.jaxb.gen.RefExpr}
     */
    net.sourceforge.czt.z.jaxb.gen.RefExpr getCallExpr();

    /**
     * Sets the value of the callExpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link net.sourceforge.czt.z.jaxb.gen.RefExpr}
     */
    void setCallExpr(net.sourceforge.czt.z.jaxb.gen.RefExpr value);

    /**
     * Gets the value of the callKind property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getCallKind();

    /**
     * Sets the value of the callKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setCallKind(java.lang.String value);

    /**
     * Gets the value of the actuals property.
     * 
     * @return
     *     possible object is
     *     {@link net.sourceforge.czt.z.jaxb.gen.ExprList}
     */
    net.sourceforge.czt.z.jaxb.gen.ExprList getActuals();

    /**
     * Sets the value of the actuals property.
     * 
     * @param value
     *     allowed object is
     *     {@link net.sourceforge.czt.z.jaxb.gen.ExprList}
     */
    void setActuals(net.sourceforge.czt.z.jaxb.gen.ExprList value);

}
