//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.5-b16-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.06.26 at 02:10:37 PM NZST 
//


package net.sourceforge.czt.circus.jaxb.gen;


/**
 * Java content class for SigmaExpr element declaration.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/research/czt/trunk/jaxb/build/xsd/Circus.xsd line 1502)
 * <pre>&lt;p xmlns:Z="http://czt.sourceforge.net/zml" xmlns:CIRCUS="http://czt.sourceforge.net/circus" xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:gnast="http://czt.sourceforge.net/gnast" xmlns:xml="http://www.w3.org/XML/1998/namespace" xmlns:jaxb="http://java.sun.com/xml/ns/jaxb">
 * Expression for channel selections, such as c.x or c.true for channel c.
 * It is set of pairs, where the first element is the channel reference and
 * the second element is the expression corresponding to the value to be
 * communicaticated. The channel reference is a RefExpr, as channel can
 * contain generic actuals. It denotes set of the all the possible values a
 * channel can communicate.
 * &lt;/p></pre>
 * 
 * <pre>&lt;p xmlns:Z="http://czt.sourceforge.net/zml" xmlns:CIRCUS="http://czt.sourceforge.net/circus" xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:gnast="http://czt.sourceforge.net/gnast" xmlns:xml="http://www.w3.org/XML/1998/namespace" xmlns:jaxb="http://java.sun.com/xml/ns/jaxb">
 * These expressions require special typechecking to ensure that elements are
 * well typed with respect to the (RefExpr X Expr) pair, rather than the structure
 * of the expressions. That is, SigmaExpr unify even when the expression have different
 * types, so that we can create the Sigma environment.
 * &lt;/p></pre>
 * 
 * 
 * 
 * <p>
 * <pre>
 * &lt;element name="SigmaExpr" type="{http://czt.sourceforge.net/circus}SigmaExpr"/>
 * </pre>
 * 
 */
public interface SigmaExprElement
    extends javax.xml.bind.Element, net.sourceforge.czt.circus.jaxb.gen.SigmaExpr
{


}
