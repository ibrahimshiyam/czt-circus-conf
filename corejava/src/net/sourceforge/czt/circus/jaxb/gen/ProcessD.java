//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2005.03.03 at 09:16:01 GMT 
//


package net.sourceforge.czt.circus.jaxb.gen;


/**
 * Java content class for ProcessD complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/research/czt/gnast/src/xsd/Circus.xsd line 1123)
 * <p>
 * <pre>
 * &lt;complexType name="ProcessD">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/circus}Process1">
 *       &lt;sequence>
 *         &lt;element ref="{http://czt.sourceforge.net/zml}VarDecl"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface ProcessD
    extends net.sourceforge.czt.circus.jaxb.gen.Process1
{


    /**
     * Gets the value of the varDecl property.
     * 
     * @return
     *     possible object is
     *     {@link net.sourceforge.czt.z.jaxb.gen.VarDecl}
     *     {@link net.sourceforge.czt.z.jaxb.gen.VarDeclElement}
     */
    net.sourceforge.czt.z.jaxb.gen.VarDecl getVarDecl();

    /**
     * Sets the value of the varDecl property.
     * 
     * @param value
     *     allowed object is
     *     {@link net.sourceforge.czt.z.jaxb.gen.VarDecl}
     *     {@link net.sourceforge.czt.z.jaxb.gen.VarDeclElement}
     */
    void setVarDecl(net.sourceforge.czt.z.jaxb.gen.VarDecl value);

}
