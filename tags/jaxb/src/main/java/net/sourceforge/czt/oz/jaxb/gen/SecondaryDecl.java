//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.5-b16-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.06.26 at 02:10:37 PM NZST 
//


package net.sourceforge.czt.oz.jaxb.gen;


/**
 * Java content class for SecondaryDecl complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/research/czt/trunk/jaxb/build/xsd/Object-Z.xsd line 347)
 * <p>
 * <pre>
 * &lt;complexType name="SecondaryDecl">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/zml}Term">
 *       &lt;sequence>
 *         &lt;element ref="{http://czt.sourceforge.net/zml}DeclList"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface SecondaryDecl
    extends net.sourceforge.czt.z.jaxb.gen.Term
{


    /**
     * Gets the value of the declList property.
     * 
     * @return
     *     possible object is
     *     {@link net.sourceforge.czt.z.jaxb.gen.DeclListElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.DeclList}
     *     {@link net.sourceforge.czt.z.jaxb.gen.ZDeclListElement}
     *     {@link net.sourceforge.czt.zpatt.jaxb.gen.JokerDeclListElement}
     *     {@link net.sourceforge.czt.zpatt.jaxb.gen.HeadDeclListElement}
     */
    net.sourceforge.czt.z.jaxb.gen.DeclList getDeclList();

    /**
     * Sets the value of the declList property.
     * 
     * @param value
     *     allowed object is
     *     {@link net.sourceforge.czt.z.jaxb.gen.DeclListElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.DeclList}
     *     {@link net.sourceforge.czt.z.jaxb.gen.ZDeclListElement}
     *     {@link net.sourceforge.czt.zpatt.jaxb.gen.JokerDeclListElement}
     *     {@link net.sourceforge.czt.zpatt.jaxb.gen.HeadDeclListElement}
     */
    void setDeclList(net.sourceforge.czt.z.jaxb.gen.DeclList value);

}
