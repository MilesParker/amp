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

package org.eclipse.amp.agf.gef;

import org.eclipse.amp.agf.IGraphicsAdapter;
import org.eclipse.amp.axf.core.IModel;
import org.eclipse.gef.EditPartFactory;

/**
 * 
 * @author mparker
 * 
 */
public class DefaultModelFactoryProvider implements IModelFactoryProvider {

    private IGraphicsAdapter factory;

    public DefaultModelFactoryProvider(IGraphicsAdapter factory) {
        super();
        this.factory = factory;
    }

    /**
     * @param model
     * @return
     * @see org.eclipse.amp.agf.gef.IModelFactoryProvider#getEditPartFactory(java.lang.Object)
     */
    public EditPartFactory getEditPartFactory(Object model) {
        return new ScapePartFactory((IModel) model, factory);
    }

    /**
     * @param model
     * @return
     * @see org.eclipse.amp.agf.gef.IModelFactoryProvider#getEditPartTreeFactory(java.lang.Object)
     */
    public EditPartFactory getEditPartTreeFactory(Object model) {
        return new ScapePartTreeFactory((IModel) model, factory);
    }
}
