/**
 * $Revision$
 * $Date$
 *
 * Copyright 2008 Daniel Henninger.  All rights reserved.
 *
 * This software is published under the terms of the GNU Public License (GPL),
 * a copy of which is included in this distribution.
 */

package net.sf.kraken.protocols.xmpp.packet;

import org.jivesoftware.smack.packet.PacketExtension;

/**
 * @author Daniel Henninger
 */
public class GoogleRelayExtension implements PacketExtension {

    public static String ELEMENT_NAME = "query";
    public static String NAMESPACE = "google:relay";

    public String getElementName() {
        return ELEMENT_NAME;
    }

    public String getNamespace() {
        return NAMESPACE;
    }
    
    public String toXML() {
        StringBuffer buf = new StringBuffer();
        buf.append("<").append(getElementName()).append(" xmlns=\"").append(getNamespace()).append("\"/>");
        return buf.toString();
    }

}
