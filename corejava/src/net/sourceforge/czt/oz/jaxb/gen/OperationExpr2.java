//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2004.11.04 at 10:24:55 GMT 
//


package net.sourceforge.czt.oz.jaxb.gen;


/**
 * Java content class for OperationExpr2 complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/research/projects/gnast/src/xsd/Object-Z.xsd line 485)
 * <p>
 * <pre>
 * &lt;complexType name="OperationExpr2">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/object-z}OperationExpr">
 *       &lt;sequence>
 *         &lt;element ref="{http://czt.sourceforge.net/object-z}OperationExpr"/>
 *         &lt;element ref="{http://czt.sourceforge.net/object-z}OperationExpr"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface OperationExpr2
    extends net.sourceforge.czt.oz.jaxb.gen.OperationExpr
{


    /**
     * 
     * @return
     *     possible object is
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.WaitUntilProExprElement}
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.InterruptProExpr}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.ParallelOpExpr}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.AssoParallelOpExpr}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.BasicOpExprElement}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.ConjOpExpr}
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.RecProExprElement}
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.DistInChoiceProExpr}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.ExChoiceOpExpr}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.OperationExpr}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.RenameOpExprElement}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.ScopeEnrichOpExpr}
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.InChoiceProExpr}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.DistSeqOpExpr}
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.AtProExprElement}
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.TimeoutEndProExpr}
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.InterleaveProExpr}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.ParenOpExpr}
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.TimeoutStartProExpr}
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.DistInterleaveProExpr}
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.GuardProExprElement}
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.DeadlineProExprElement}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.DistConjOpExpr}
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.WaitProExprElement}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.OperationExpr2Element}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.DistOpExprElement}
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.StopProExpr}
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.SynPllProExprElement}
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.DivergeProExpr}
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.TopologyProExprElement}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.OperationExprElement}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.DistChoiceOpExpr}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.OpPromotionExprElement}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.SeqOpExpr}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.HideOpExprElement}
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.SkipProExpr}
     */
    net.sourceforge.czt.oz.jaxb.gen.OperationExpr getRightOperationExpr();

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.WaitUntilProExprElement}
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.InterruptProExpr}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.ParallelOpExpr}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.AssoParallelOpExpr}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.BasicOpExprElement}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.ConjOpExpr}
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.RecProExprElement}
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.DistInChoiceProExpr}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.ExChoiceOpExpr}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.OperationExpr}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.RenameOpExprElement}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.ScopeEnrichOpExpr}
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.InChoiceProExpr}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.DistSeqOpExpr}
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.AtProExprElement}
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.TimeoutEndProExpr}
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.InterleaveProExpr}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.ParenOpExpr}
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.TimeoutStartProExpr}
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.DistInterleaveProExpr}
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.GuardProExprElement}
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.DeadlineProExprElement}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.DistConjOpExpr}
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.WaitProExprElement}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.OperationExpr2Element}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.DistOpExprElement}
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.StopProExpr}
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.SynPllProExprElement}
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.DivergeProExpr}
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.TopologyProExprElement}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.OperationExprElement}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.DistChoiceOpExpr}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.OpPromotionExprElement}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.SeqOpExpr}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.HideOpExprElement}
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.SkipProExpr}
     */
    void setRightOperationExpr(net.sourceforge.czt.oz.jaxb.gen.OperationExpr value);

    /**
     * 
     * @return
     *     possible object is
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.WaitUntilProExprElement}
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.InterruptProExpr}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.ParallelOpExpr}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.AssoParallelOpExpr}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.BasicOpExprElement}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.ConjOpExpr}
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.RecProExprElement}
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.DistInChoiceProExpr}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.ExChoiceOpExpr}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.OperationExpr}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.RenameOpExprElement}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.ScopeEnrichOpExpr}
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.InChoiceProExpr}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.DistSeqOpExpr}
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.AtProExprElement}
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.TimeoutEndProExpr}
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.InterleaveProExpr}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.ParenOpExpr}
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.TimeoutStartProExpr}
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.DistInterleaveProExpr}
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.GuardProExprElement}
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.DeadlineProExprElement}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.DistConjOpExpr}
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.WaitProExprElement}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.OperationExpr2Element}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.DistOpExprElement}
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.StopProExpr}
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.SynPllProExprElement}
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.DivergeProExpr}
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.TopologyProExprElement}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.OperationExprElement}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.DistChoiceOpExpr}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.OpPromotionExprElement}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.SeqOpExpr}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.HideOpExprElement}
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.SkipProExpr}
     */
    net.sourceforge.czt.oz.jaxb.gen.OperationExpr getLeftOperationExpr();

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.WaitUntilProExprElement}
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.InterruptProExpr}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.ParallelOpExpr}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.AssoParallelOpExpr}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.BasicOpExprElement}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.ConjOpExpr}
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.RecProExprElement}
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.DistInChoiceProExpr}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.ExChoiceOpExpr}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.OperationExpr}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.RenameOpExprElement}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.ScopeEnrichOpExpr}
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.InChoiceProExpr}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.DistSeqOpExpr}
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.AtProExprElement}
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.TimeoutEndProExpr}
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.InterleaveProExpr}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.ParenOpExpr}
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.TimeoutStartProExpr}
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.DistInterleaveProExpr}
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.GuardProExprElement}
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.DeadlineProExprElement}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.DistConjOpExpr}
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.WaitProExprElement}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.OperationExpr2Element}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.DistOpExprElement}
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.StopProExpr}
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.SynPllProExprElement}
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.DivergeProExpr}
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.TopologyProExprElement}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.OperationExprElement}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.DistChoiceOpExpr}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.OpPromotionExprElement}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.SeqOpExpr}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.HideOpExprElement}
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.SkipProExpr}
     */
    void setLeftOperationExpr(net.sourceforge.czt.oz.jaxb.gen.OperationExpr value);

}
