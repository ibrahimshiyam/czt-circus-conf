//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2004.02.19 at 05:33:12 NZDT 
//


package net.sourceforge.czt.z.jaxb.gen;


/**
 * Section-Type environments map names to (SectionName,Type) pairs.
 * 
 * Java content class for SectTypeEnvAnn complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/research/projects/gnast/src/xsd/Z.xsd line 1651)
 * <p>
 * <pre>
 * &lt;complexType name="SectTypeEnvAnn">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/zml}Ann">
 *       &lt;sequence>
 *         &lt;element ref="{http://czt.sourceforge.net/zml}NameSectTypeTriple" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface SectTypeEnvAnn
    extends net.sourceforge.czt.z.jaxb.gen.Ann
{


    /**
     * Gets the value of the NameSectTypeTriple property.
     * 
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the NameSectTypeTriple property.
     * 
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNameSectTypeTriple().add(newItem);
     * </pre>
     * 
     * 
     * Objects of the following type(s) are allowed in the list
     * {@link net.sourceforge.czt.z.jaxb.gen.NameSectTypeTripleElement}
     * {@link net.sourceforge.czt.z.jaxb.gen.NameSectTypeTriple}
     * 
     */
    java.util.List getNameSectTypeTriple();

}
