//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.1-05/30/2003 05:06 AM(java_re)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2003.08.25 at 04:40:49 NZST 
//


package net.sourceforge.czt.core.jaxb.gen;


/**
 * Java content class for Pred2 complex type.
 *  <p>The following schema fragment specifies the expected content contained within this java content object.
 * <p>
 * <pre>
 * &lt;complexType name="Pred2">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/zml}Pred">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://czt.sourceforge.net/zml}FalsePred"/>
 *           &lt;element ref="{http://czt.sourceforge.net/zml}TruePred"/>
 *           &lt;element ref="{http://czt.sourceforge.net/zml}AndPred"/>
 *           &lt;element ref="{http://czt.sourceforge.net/zml}ImpliesPred"/>
 *           &lt;element ref="{http://czt.sourceforge.net/zml}IffPred"/>
 *           &lt;element ref="{http://czt.sourceforge.net/zml}OrPred"/>
 *           &lt;element ref="{http://czt.sourceforge.net/zml}ExistsPred"/>
 *           &lt;element ref="{http://czt.sourceforge.net/zml}Exists1Pred"/>
 *           &lt;element ref="{http://czt.sourceforge.net/zml}ForallPred"/>
 *           &lt;element ref="{http://czt.sourceforge.net/zml}ExprPred"/>
 *           &lt;element ref="{http://czt.sourceforge.net/zml}MemPred"/>
 *           &lt;element ref="{http://czt.sourceforge.net/zml}NegPred"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element ref="{http://czt.sourceforge.net/zml}FalsePred"/>
 *           &lt;element ref="{http://czt.sourceforge.net/zml}TruePred"/>
 *           &lt;element ref="{http://czt.sourceforge.net/zml}AndPred"/>
 *           &lt;element ref="{http://czt.sourceforge.net/zml}ImpliesPred"/>
 *           &lt;element ref="{http://czt.sourceforge.net/zml}IffPred"/>
 *           &lt;element ref="{http://czt.sourceforge.net/zml}OrPred"/>
 *           &lt;element ref="{http://czt.sourceforge.net/zml}ExistsPred"/>
 *           &lt;element ref="{http://czt.sourceforge.net/zml}Exists1Pred"/>
 *           &lt;element ref="{http://czt.sourceforge.net/zml}ForallPred"/>
 *           &lt;element ref="{http://czt.sourceforge.net/zml}ExprPred"/>
 *           &lt;element ref="{http://czt.sourceforge.net/zml}MemPred"/>
 *           &lt;element ref="{http://czt.sourceforge.net/zml}NegPred"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface Pred2
    extends net.sourceforge.czt.core.jaxb.gen.Pred
{


    /**
     * 
     * @return possible object is
     * {@link net.sourceforge.czt.core.jaxb.gen.TruePred}
     * {@link net.sourceforge.czt.core.jaxb.gen.ExistsPred}
     * {@link net.sourceforge.czt.core.jaxb.gen.IffPred}
     * {@link net.sourceforge.czt.core.jaxb.gen.AndPredElement}
     * {@link net.sourceforge.czt.core.jaxb.gen.OrPred}
     * {@link net.sourceforge.czt.core.jaxb.gen.Exists1Pred}
     * {@link net.sourceforge.czt.core.jaxb.gen.ImpliesPred}
     * {@link net.sourceforge.czt.core.jaxb.gen.NegPredElement}
     * {@link net.sourceforge.czt.core.jaxb.gen.MemPredElement}
     * {@link net.sourceforge.czt.core.jaxb.gen.ExprPredElement}
     * {@link net.sourceforge.czt.core.jaxb.gen.ForallPred}
     * {@link net.sourceforge.czt.core.jaxb.gen.FalsePred}
     */
    net.sourceforge.czt.core.jaxb.gen.Pred getRightPred();

    /**
     * 
     * @param value allowed object is
     * {@link net.sourceforge.czt.core.jaxb.gen.TruePred}
     * {@link net.sourceforge.czt.core.jaxb.gen.ExistsPred}
     * {@link net.sourceforge.czt.core.jaxb.gen.IffPred}
     * {@link net.sourceforge.czt.core.jaxb.gen.AndPredElement}
     * {@link net.sourceforge.czt.core.jaxb.gen.OrPred}
     * {@link net.sourceforge.czt.core.jaxb.gen.Exists1Pred}
     * {@link net.sourceforge.czt.core.jaxb.gen.ImpliesPred}
     * {@link net.sourceforge.czt.core.jaxb.gen.NegPredElement}
     * {@link net.sourceforge.czt.core.jaxb.gen.MemPredElement}
     * {@link net.sourceforge.czt.core.jaxb.gen.ExprPredElement}
     * {@link net.sourceforge.czt.core.jaxb.gen.ForallPred}
     * {@link net.sourceforge.czt.core.jaxb.gen.FalsePred}
     */
    void setRightPred(net.sourceforge.czt.core.jaxb.gen.Pred value);

    /**
     * 
     * @return possible object is
     * {@link net.sourceforge.czt.core.jaxb.gen.TruePred}
     * {@link net.sourceforge.czt.core.jaxb.gen.ExistsPred}
     * {@link net.sourceforge.czt.core.jaxb.gen.IffPred}
     * {@link net.sourceforge.czt.core.jaxb.gen.AndPredElement}
     * {@link net.sourceforge.czt.core.jaxb.gen.OrPred}
     * {@link net.sourceforge.czt.core.jaxb.gen.Exists1Pred}
     * {@link net.sourceforge.czt.core.jaxb.gen.ImpliesPred}
     * {@link net.sourceforge.czt.core.jaxb.gen.NegPredElement}
     * {@link net.sourceforge.czt.core.jaxb.gen.MemPredElement}
     * {@link net.sourceforge.czt.core.jaxb.gen.ExprPredElement}
     * {@link net.sourceforge.czt.core.jaxb.gen.ForallPred}
     * {@link net.sourceforge.czt.core.jaxb.gen.FalsePred}
     */
    net.sourceforge.czt.core.jaxb.gen.Pred getLeftPred();

    /**
     * 
     * @param value allowed object is
     * {@link net.sourceforge.czt.core.jaxb.gen.TruePred}
     * {@link net.sourceforge.czt.core.jaxb.gen.ExistsPred}
     * {@link net.sourceforge.czt.core.jaxb.gen.IffPred}
     * {@link net.sourceforge.czt.core.jaxb.gen.AndPredElement}
     * {@link net.sourceforge.czt.core.jaxb.gen.OrPred}
     * {@link net.sourceforge.czt.core.jaxb.gen.Exists1Pred}
     * {@link net.sourceforge.czt.core.jaxb.gen.ImpliesPred}
     * {@link net.sourceforge.czt.core.jaxb.gen.NegPredElement}
     * {@link net.sourceforge.czt.core.jaxb.gen.MemPredElement}
     * {@link net.sourceforge.czt.core.jaxb.gen.ExprPredElement}
     * {@link net.sourceforge.czt.core.jaxb.gen.ForallPred}
     * {@link net.sourceforge.czt.core.jaxb.gen.FalsePred}
     */
    void setLeftPred(net.sourceforge.czt.core.jaxb.gen.Pred value);

}
