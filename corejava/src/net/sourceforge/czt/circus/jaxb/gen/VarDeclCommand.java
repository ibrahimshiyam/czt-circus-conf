//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2005.03.03 at 09:16:01 GMT 
//


package net.sourceforge.czt.circus.jaxb.gen;


/**
 * Java content class for VarDeclCommand complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/research/czt/gnast/src/xsd/Circus.xsd line 1615)
 * <p>
 * <pre>
 * &lt;complexType name="VarDeclCommand">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/circus}Command">
 *       &lt;sequence>
 *         &lt;element ref="{http://czt.sourceforge.net/zml}VarDecl"/>
 *         &lt;element ref="{http://czt.sourceforge.net/circus}Action"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface VarDeclCommand
    extends net.sourceforge.czt.circus.jaxb.gen.Command
{


    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ActualParamActionElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.VarDeclCommandElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.SpecStmtCommandElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.FormalParamAction}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.HideActionElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ParallelActionRElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.SchTextActionElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.IntChoiceActionR}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ActionElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.StopAction}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.IntChoiceAction}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.InterleaveAction}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.MuActionElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ParallelActionElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ExtChoiceAction}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.SeqAction}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.SeqActionR}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.PrefixingActionElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.IfGuardedCommandElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.AssignmentCommandElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.InterleaveActionR}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.SkipAction}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ExtChoiceActionR}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.Action}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.GuardedActionElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ChaosAction}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.CallActionElement}
     */
    net.sourceforge.czt.circus.jaxb.gen.Action getAction();

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ActualParamActionElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.VarDeclCommandElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.SpecStmtCommandElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.FormalParamAction}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.HideActionElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ParallelActionRElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.SchTextActionElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.IntChoiceActionR}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ActionElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.StopAction}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.IntChoiceAction}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.InterleaveAction}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.MuActionElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ParallelActionElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ExtChoiceAction}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.SeqAction}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.SeqActionR}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.PrefixingActionElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.IfGuardedCommandElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.AssignmentCommandElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.InterleaveActionR}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.SkipAction}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ExtChoiceActionR}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.Action}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.GuardedActionElement}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.ChaosAction}
     *     {@link net.sourceforge.czt.circus.jaxb.gen.CallActionElement}
     */
    void setAction(net.sourceforge.czt.circus.jaxb.gen.Action value);

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
