//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2004.02.19 at 05:33:12 NZDT 
//


package net.sourceforge.czt.z.jaxb.gen;


/**
 * Java content class for InclDecl complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/research/projects/gnast/src/xsd/Z.xsd line 1162)
 * <p>
 * <pre>
 * &lt;complexType name="InclDecl">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/zml}Decl">
 *       &lt;sequence>
 *         &lt;element ref="{http://czt.sourceforge.net/zml}Expr"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface InclDecl
    extends net.sourceforge.czt.z.jaxb.gen.Decl
{


    /**
     * 
     * @return
     *     possible object is
     *     {@link net.sourceforge.czt.z.jaxb.gen.CondExprElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.LetExpr}
     *     {@link net.sourceforge.czt.z.jaxb.gen.QntExprElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.SetExpr}
     *     {@link net.sourceforge.czt.z.jaxb.gen.Qnt1ExprElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.RefExprElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.SetCompExpr}
     *     {@link net.sourceforge.czt.z.jaxb.gen.RenameExprElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.DecorExprElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.ExistsExpr}
     *     {@link net.sourceforge.czt.z.jaxb.gen.NegExpr}
     *     {@link net.sourceforge.czt.z.jaxb.gen.SchExpr2Element}
     *     {@link net.sourceforge.czt.z.jaxb.gen.SchExprElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.ProdExpr}
     *     {@link net.sourceforge.czt.z.jaxb.gen.IffExpr}
     *     {@link net.sourceforge.czt.z.jaxb.gen.ExprElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.Expr2NElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.ThetaExprElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.NumExprElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.LambdaExpr}
     *     {@link net.sourceforge.czt.z.jaxb.gen.OrExpr}
     *     {@link net.sourceforge.czt.z.jaxb.gen.ImpliesExpr}
     *     {@link net.sourceforge.czt.z.jaxb.gen.Exists1Expr}
     *     {@link net.sourceforge.czt.zpatt.jaxb.gen.JokerExprElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.Expr1Element}
     *     {@link net.sourceforge.czt.z.jaxb.gen.CompExpr}
     *     {@link net.sourceforge.czt.z.jaxb.gen.ForallExpr}
     *     {@link net.sourceforge.czt.z.jaxb.gen.Expr}
     *     {@link net.sourceforge.czt.z.jaxb.gen.PreExpr}
     *     {@link net.sourceforge.czt.z.jaxb.gen.Expr2Element}
     *     {@link net.sourceforge.czt.z.jaxb.gen.ProjExpr}
     *     {@link net.sourceforge.czt.z.jaxb.gen.ApplExprElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.HideExprElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.TupleExpr}
     *     {@link net.sourceforge.czt.z.jaxb.gen.TupleSelExprElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.PipeExpr}
     *     {@link net.sourceforge.czt.z.jaxb.gen.AndExpr}
     *     {@link net.sourceforge.czt.z.jaxb.gen.Expr0NElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.BindSelExprElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.PowerExpr}
     *     {@link net.sourceforge.czt.z.jaxb.gen.BindExprElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.MuExpr}
     */
    net.sourceforge.czt.z.jaxb.gen.Expr getExpr();

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link net.sourceforge.czt.z.jaxb.gen.CondExprElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.LetExpr}
     *     {@link net.sourceforge.czt.z.jaxb.gen.QntExprElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.SetExpr}
     *     {@link net.sourceforge.czt.z.jaxb.gen.Qnt1ExprElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.RefExprElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.SetCompExpr}
     *     {@link net.sourceforge.czt.z.jaxb.gen.RenameExprElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.DecorExprElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.ExistsExpr}
     *     {@link net.sourceforge.czt.z.jaxb.gen.NegExpr}
     *     {@link net.sourceforge.czt.z.jaxb.gen.SchExpr2Element}
     *     {@link net.sourceforge.czt.z.jaxb.gen.SchExprElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.ProdExpr}
     *     {@link net.sourceforge.czt.z.jaxb.gen.IffExpr}
     *     {@link net.sourceforge.czt.z.jaxb.gen.ExprElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.Expr2NElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.ThetaExprElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.NumExprElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.LambdaExpr}
     *     {@link net.sourceforge.czt.z.jaxb.gen.OrExpr}
     *     {@link net.sourceforge.czt.z.jaxb.gen.ImpliesExpr}
     *     {@link net.sourceforge.czt.z.jaxb.gen.Exists1Expr}
     *     {@link net.sourceforge.czt.zpatt.jaxb.gen.JokerExprElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.Expr1Element}
     *     {@link net.sourceforge.czt.z.jaxb.gen.CompExpr}
     *     {@link net.sourceforge.czt.z.jaxb.gen.ForallExpr}
     *     {@link net.sourceforge.czt.z.jaxb.gen.Expr}
     *     {@link net.sourceforge.czt.z.jaxb.gen.PreExpr}
     *     {@link net.sourceforge.czt.z.jaxb.gen.Expr2Element}
     *     {@link net.sourceforge.czt.z.jaxb.gen.ProjExpr}
     *     {@link net.sourceforge.czt.z.jaxb.gen.ApplExprElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.HideExprElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.TupleExpr}
     *     {@link net.sourceforge.czt.z.jaxb.gen.TupleSelExprElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.PipeExpr}
     *     {@link net.sourceforge.czt.z.jaxb.gen.AndExpr}
     *     {@link net.sourceforge.czt.z.jaxb.gen.Expr0NElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.BindSelExprElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.PowerExpr}
     *     {@link net.sourceforge.czt.z.jaxb.gen.BindExprElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.MuExpr}
     */
    void setExpr(net.sourceforge.czt.z.jaxb.gen.Expr value);

}
