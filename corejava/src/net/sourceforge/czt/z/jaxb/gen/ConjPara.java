//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2005.03.03 at 09:16:01 GMT 
//


package net.sourceforge.czt.z.jaxb.gen;


/**
 * Java content class for ConjPara complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/research/czt/gnast/src/xsd/Z.xsd line 1193)
 * <p>
 * <pre>
 * &lt;complexType name="ConjPara">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/zml}Para">
 *       &lt;sequence>
 *         &lt;element ref="{http://czt.sourceforge.net/zml}DeclName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://czt.sourceforge.net/zml}Pred"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface ConjPara
    extends net.sourceforge.czt.z.jaxb.gen.Para
{


    /**
     * Gets the value of the pred property.
     * 
     * @return
     *     possible object is
     *     {@link net.sourceforge.czt.z.jaxb.gen.ExistsPred}
     *     {@link net.sourceforge.czt.z.jaxb.gen.OrPred}
     *     {@link net.sourceforge.czt.z.jaxb.gen.AndPredElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.TruePred}
     *     {@link net.sourceforge.czt.z.jaxb.gen.MemPredElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.PredElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.ImpliesPred}
     *     {@link net.sourceforge.czt.z.jaxb.gen.IffPred}
     *     {@link net.sourceforge.czt.zpatt.jaxb.gen.JokerPredElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.FalsePred}
     *     {@link net.sourceforge.czt.z.jaxb.gen.Pred}
     *     {@link net.sourceforge.czt.z.jaxb.gen.ExprPredElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.NegPredElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.Exists1Pred}
     *     {@link net.sourceforge.czt.z.jaxb.gen.ForallPred}
     */
    net.sourceforge.czt.z.jaxb.gen.Pred getPred();

    /**
     * Sets the value of the pred property.
     * 
     * @param value
     *     allowed object is
     *     {@link net.sourceforge.czt.z.jaxb.gen.ExistsPred}
     *     {@link net.sourceforge.czt.z.jaxb.gen.OrPred}
     *     {@link net.sourceforge.czt.z.jaxb.gen.AndPredElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.TruePred}
     *     {@link net.sourceforge.czt.z.jaxb.gen.MemPredElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.PredElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.ImpliesPred}
     *     {@link net.sourceforge.czt.z.jaxb.gen.IffPred}
     *     {@link net.sourceforge.czt.zpatt.jaxb.gen.JokerPredElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.FalsePred}
     *     {@link net.sourceforge.czt.z.jaxb.gen.Pred}
     *     {@link net.sourceforge.czt.z.jaxb.gen.ExprPredElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.NegPredElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.Exists1Pred}
     *     {@link net.sourceforge.czt.z.jaxb.gen.ForallPred}
     */
    void setPred(net.sourceforge.czt.z.jaxb.gen.Pred value);

    /**
     * Gets the value of the DeclName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the DeclName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeclName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link net.sourceforge.czt.z.jaxb.gen.DeclName}
     * {@link net.sourceforge.czt.z.jaxb.gen.DeclNameElement}
     * {@link net.sourceforge.czt.zpatt.jaxb.gen.JokerNameElement}
     * 
     */
    java.util.List getDeclName();

}
