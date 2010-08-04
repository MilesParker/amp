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

import org.eclipse.jface.viewers.IFilter;

// TODO: Auto-generated Javadoc
/**
 * The Class HostFilter.
 */
public class HostFilter implements IFilter {

    /**
     * @param object
     * @return
     * @see org.eclipse.jface.viewers.IFilter#select(java.lang.Object)
     */
    public boolean select(Object object) {
        return true;// ((Scape) object).getPrototypeAgent() instanceof HostCell;
    }

}
