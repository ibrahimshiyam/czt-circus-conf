//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2004.06.09 at 03:13:59 NZST 
//


package net.sourceforge.czt.zpatt.jaxb.gen;


/**
 * A list of transformation rules.
 * Each rule says how one Z term (for example an expression) can be
 * transformed into another term.  Usually the intention is that
 * the two terms are equivalent, but a TransformList could also be
 * used to store rules that weaken predicates etc.  The order of
 * rules in this list can be significant, because if two rules match
 * the same term, transformation engines should try to give priority to
 * rules nearer the start of the list.
 * 
 * Java content class for TransformList element declaration.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/research/tmp/czt/gnast/src/xsd/ZPattern.xsd line 65)
 * <p>
 * <pre>
 * &lt;element name="TransformList" type="{http://czt.sourceforge.net/zpatt}TransformList"/>
 * </pre>
 * 
 */
public interface TransformListElement
    extends javax.xml.bind.Element, net.sourceforge.czt.zpatt.jaxb.gen.TransformList
{


}
