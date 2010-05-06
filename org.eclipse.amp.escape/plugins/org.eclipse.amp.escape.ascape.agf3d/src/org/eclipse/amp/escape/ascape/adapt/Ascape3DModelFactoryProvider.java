/**
 * <copyright>
 *
 * Copyright (c) 2010 Metascape, LLC.
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

import org.eclipse.amp.agf3d.I3DModelFactoryProvider;
import org.eclipse.gef.EditPartFactory;

/**
 * 
 * @author mparker
 *
 */
public class Ascape3DModelFactoryProvider implements I3DModelFactoryProvider {

    // Ascape3DPartFactory factory = new Ascape3DPartFactory();
    /**
     * @param model
     * @return
     * @see org.eclipse.amp.agf3d.I3DModelFactoryProvider#getEditPart3DFactory(java.lang.Object)
     */
    public EditPartFactory getEditPart3DFactory(Object model) {
        return null;
    }
}
