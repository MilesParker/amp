/**
 * <copyright>
 *
 * Copyright (c) 2009 Metascape, LLC.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Metascape - Initial API and Implementation
 *
 * </copyright>
 *
 */
package org.eclipse.amp.escape.ascape.adapt;

import java.util.ArrayList;
import java.util.List;

import org.ascape.model.HostCell;
import org.ascape.model.Scape;
import org.ascape.model.space.Graph;
import org.ascape.model.space.Singleton;

// TODO: Auto-generated Javadoc
/**
 * The Class AscapeTreeMemberProvider.
 */
public class AscapeTreeMemberProvider extends AscapeGraphicsProvider {

    /**
     * @param parent
     * @return
     * @see org.eclipse.amp.axf.core.ICompositionProvider#getList(java.lang.Object)
     */
    @SuppressWarnings("unchecked")
    public List getList(Object parent) {
        if (parent instanceof Scape) {
            Scape scape = (Scape) parent;
            List use = new ArrayList(scape);
            List hosts = new ArrayList();
            List graphs = new ArrayList();
            for (Object agent : scape) {
                Scape memberScape = (Scape) agent;
                if (memberScape.getPrototypeAgent() instanceof HostCell) {
                    hosts.add(memberScape);
                }
                if (memberScape.getSpace() instanceof Graph) {
                    graphs.add(memberScape);
                }
                if (memberScape.getSpace() instanceof Singleton) {
                    use.remove(memberScape);
                }
            }
            // Exchange order so that hosts always show up on bottom
            use.removeAll(hosts);
            // Exchange order so that graphs always show up on top
            use.removeAll(graphs);
            return use;
        }
        return null;
    }

    /**
     * @param hasIterable
     * @return
     * @see org.eclipse.amp.axf.core.ICompositionProvider#isMutable(java.lang.Object)
     */
    public boolean isMutable(Object hasIterable) {
        return true;
    }
}
