//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.5-b16-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.06.26 at 02:10:37 PM NZST 
//


package net.sourceforge.czt.z.jaxb.gen;


/**
 * Java content class for ZRefName complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/research/czt/trunk/jaxb/build/xsd/Z.xsd line 1726)
 * <p>
 * <pre>
 * &lt;complexType name="ZRefName">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/zml}RefName">
 *       &lt;sequence>
 *         &lt;element name="Word" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://czt.sourceforge.net/zml}StrokeList"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Decl" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface ZRefName
    extends net.sourceforge.czt.z.jaxb.gen.RefName
{


    /**
     * Gets the value of the word property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getWord();

    /**
     * Sets the value of the word property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setWord(java.lang.String value);

    /**
     * Gets the value of the decl property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Object}
     */
    java.lang.Object getDecl();

    /**
     * Sets the value of the decl property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Object}
     */
    void setDecl(java.lang.Object value);

    /**
     * Gets the value of the strokeList property.
     * 
     * @return
     *     possible object is
     *     {@link net.sourceforge.czt.z.jaxb.gen.StrokeListElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.StrokeList}
     *     {@link net.sourceforge.czt.z.jaxb.gen.ZStrokeListElement}
     */
    net.sourceforge.czt.z.jaxb.gen.StrokeList getStrokeList();

    /**
     * Sets the value of the strokeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link net.sourceforge.czt.z.jaxb.gen.StrokeListElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.StrokeList}
     *     {@link net.sourceforge.czt.z.jaxb.gen.ZStrokeListElement}
     */
    void setStrokeList(net.sourceforge.czt.z.jaxb.gen.StrokeList value);

}
