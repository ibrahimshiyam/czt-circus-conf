//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2005.02.14 at 08:40:58 GMT 
//


package net.sourceforge.czt.z.jaxb.gen;


/**
 * Java content class for VarDecl complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/research/czt/gnast/src/xsd/Z.xsd line 1316)
 * <p>
 * <pre>
 * &lt;complexType name="VarDecl">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/zml}Decl">
 *       &lt;sequence>
 *         &lt;element ref="{http://czt.sourceforge.net/zml}DeclName" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://czt.sourceforge.net/zml}Expr"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface VarDecl
    extends net.sourceforge.czt.z.jaxb.gen.Decl
{


    /**
     * Gets the value of the expr property.
     * 
     * @return
     *     possible object is
     *     {@link net.sourceforge.czt.z.jaxb.gen.Exists1Expr}
     *     {@link net.sourceforge.czt.z.jaxb.gen.ExistsExpr}
     *     {@link net.sourceforge.czt.z.jaxb.gen.Expr}
     *     {@link net.sourceforge.czt.z.jaxb.gen.SetCompExpr}
     *     {@link net.sourceforge.czt.z.jaxb.gen.DecorExprElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.ApplExprElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.ThetaExprElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.ImpliesExpr}
     *     {@link net.sourceforge.czt.z.jaxb.gen.PowerExpr}
     *     {@link net.sourceforge.czt.z.jaxb.gen.HideExprElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.NumExprElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.RefExprElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.TupleSelExprElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.PipeExpr}
     *     {@link net.sourceforge.czt.z.jaxb.gen.AndExpr}
     *     {@link net.sourceforge.czt.z.jaxb.gen.RenameExprElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.TupleExpr}
     *     {@link net.sourceforge.czt.z.jaxb.gen.LambdaExpr}
     *     {@link net.sourceforge.czt.z.jaxb.gen.ProdExpr}
     *     {@link net.sourceforge.czt.z.jaxb.gen.OrExpr}
     *     {@link net.sourceforge.czt.zpatt.jaxb.gen.JokerExprListElement}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.PredExprElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.ProjExpr}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.PolyExpr}
     *     {@link net.sourceforge.czt.z.jaxb.gen.ForallExpr}
     *     {@link net.sourceforge.czt.z.jaxb.gen.IffExpr}
     *     {@link net.sourceforge.czt.z.jaxb.gen.LetExpr}
     *     {@link net.sourceforge.czt.z.jaxb.gen.NegExpr}
     *     {@link net.sourceforge.czt.z.jaxb.gen.BindSelExprElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.SchExprElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.CondExprElement}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.ContainmentExpr}
     *     {@link net.sourceforge.czt.z.jaxb.gen.ExprElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.SetExpr}
     *     {@link net.sourceforge.czt.z.jaxb.gen.MuExpr}
     *     {@link net.sourceforge.czt.z.jaxb.gen.BindExprElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.PreExpr}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.ClassUnionExpr}
     *     {@link net.sourceforge.czt.zpatt.jaxb.gen.JokerExprElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.CompExpr}
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.ChannelExprElement}
     */
    net.sourceforge.czt.z.jaxb.gen.Expr getExpr();

    /**
     * Sets the value of the expr property.
     * 
     * @param value
     *     allowed object is
     *     {@link net.sourceforge.czt.z.jaxb.gen.Exists1Expr}
     *     {@link net.sourceforge.czt.z.jaxb.gen.ExistsExpr}
     *     {@link net.sourceforge.czt.z.jaxb.gen.Expr}
     *     {@link net.sourceforge.czt.z.jaxb.gen.SetCompExpr}
     *     {@link net.sourceforge.czt.z.jaxb.gen.DecorExprElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.ApplExprElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.ThetaExprElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.ImpliesExpr}
     *     {@link net.sourceforge.czt.z.jaxb.gen.PowerExpr}
     *     {@link net.sourceforge.czt.z.jaxb.gen.HideExprElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.NumExprElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.RefExprElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.TupleSelExprElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.PipeExpr}
     *     {@link net.sourceforge.czt.z.jaxb.gen.AndExpr}
     *     {@link net.sourceforge.czt.z.jaxb.gen.RenameExprElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.TupleExpr}
     *     {@link net.sourceforge.czt.z.jaxb.gen.LambdaExpr}
     *     {@link net.sourceforge.czt.z.jaxb.gen.ProdExpr}
     *     {@link net.sourceforge.czt.z.jaxb.gen.OrExpr}
     *     {@link net.sourceforge.czt.zpatt.jaxb.gen.JokerExprListElement}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.PredExprElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.ProjExpr}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.PolyExpr}
     *     {@link net.sourceforge.czt.z.jaxb.gen.ForallExpr}
     *     {@link net.sourceforge.czt.z.jaxb.gen.IffExpr}
     *     {@link net.sourceforge.czt.z.jaxb.gen.LetExpr}
     *     {@link net.sourceforge.czt.z.jaxb.gen.NegExpr}
     *     {@link net.sourceforge.czt.z.jaxb.gen.BindSelExprElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.SchExprElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.CondExprElement}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.ContainmentExpr}
     *     {@link net.sourceforge.czt.z.jaxb.gen.ExprElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.SetExpr}
     *     {@link net.sourceforge.czt.z.jaxb.gen.MuExpr}
     *     {@link net.sourceforge.czt.z.jaxb.gen.BindExprElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.PreExpr}
     *     {@link net.sourceforge.czt.oz.jaxb.gen.ClassUnionExpr}
     *     {@link net.sourceforge.czt.zpatt.jaxb.gen.JokerExprElement}
     *     {@link net.sourceforge.czt.z.jaxb.gen.CompExpr}
     *     {@link net.sourceforge.czt.tcoz.jaxb.gen.ChannelExprElement}
     */
    void setExpr(net.sourceforge.czt.z.jaxb.gen.Expr value);

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
