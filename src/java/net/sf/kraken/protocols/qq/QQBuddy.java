/**
 * $Revision$
 * $Date$
 *
 * Copyright 2008 Daniel Henninger.  All rights reserved.
 *
 * This software is published under the terms of the GNU Public License (GPL),
 * a copy of which is included in this distribution.
 */

package net.sf.kraken.protocols.qq;

import net.sf.jqql.beans.QQFriend;
import net.sf.kraken.roster.TransportBuddy;
import net.sf.kraken.roster.TransportBuddyManager;

import java.util.Collection;

/**
 * @author Daniel Henninger
 */
public class QQBuddy extends TransportBuddy {

    public QQBuddy(TransportBuddyManager manager, QQFriend qqFriend, String nickname, Collection<String> groups) {
        super(manager, String.valueOf(qqFriend.qqNum), nickname, groups);
        this.qqFriend = qqFriend;
    }

    public QQFriend qqFriend = null;
    
}