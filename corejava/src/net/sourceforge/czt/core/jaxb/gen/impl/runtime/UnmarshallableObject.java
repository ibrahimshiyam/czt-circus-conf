//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.1-05/30/2003 05:06 AM(java_re)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2003.08.25 at 04:40:49 NZST 
//

/*
 * Copyright 2003 Sun Microsystems, Inc. All rights reserved.
 * SUN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

/*
 * @(#)$Id$
 */
package net.sourceforge.czt.core.jaxb.gen.impl.runtime;


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
