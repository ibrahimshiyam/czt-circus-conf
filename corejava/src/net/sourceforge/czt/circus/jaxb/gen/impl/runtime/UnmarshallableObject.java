//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2005.03.03 at 09:16:01 GMT 
//

package net.sourceforge.czt.circus.jaxb.gen.impl.runtime;


/**
 * Generated classes have to implement this interface for it
 * to be unmarshallable.
 * 
 * @author      Kohsuke KAWAGUCHI
 */
public interface UnmarshallableObject
{
    /**
     * Creates an unmarshaller that will unmarshall this object.
     */
    UnmarshallingEventHandler createUnmarshaller( UnmarshallingContext context );
}
