//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2004.06.09 at 01:28:31 NZST 
//


package net.sourceforge.czt.zpatt.jaxb.gen;


/**
 * This is a abstract superclass of all the various kinds of
 * transformations that are possible.
 * Each transformation has a left-hand-side (LHS) and a RHS.
 * These terms can contain jokers (JokerExpr/JokerPred).
 * Usually, the jokers in RHS should be a subset of those in the LHS,
 * otherwise the transformation may not be well defined.
 * 
 * Java content class for Transform element declaration.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/research/tmp/czt/gnast/src/xsd/ZPattern.xsd line 82)
 * <p>
 * <pre>
 * &lt;element name="Transform" type="{http://czt.sourceforge.net/zpatt}Transform"/>
 * </pre>
 * 
 */
public interface TransformElement
    extends javax.xml.bind.Element, net.sourceforge.czt.zpatt.jaxb.gen.Transform
{


}
