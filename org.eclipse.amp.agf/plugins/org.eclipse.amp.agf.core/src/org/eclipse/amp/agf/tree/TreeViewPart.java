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
package org.eclipse.amp.agf.tree;

import org.eclipse.amp.agf.gef.EditPartViewPart;
import org.eclipse.amp.agf.gef.ModelFactoryProvider;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.RootEditPart;
import org.eclipse.gef.ui.parts.TreeViewer;


// TODO: Auto-generated Javadoc
/**
 * The Class TreeViewPart.
 */
public class TreeViewPart extends EditPartViewPart {

    public EditPartFactory createFactory(Object object) {
        if (getModel() instanceof ModelFactoryProvider) {
            EditPartFactory factory = ((ModelFactoryProvider) getModel()).getEditPartTreeFactory();
            if (factory != null) {
                return factory;
            }
        }
        return null;
    }

    /**
     * @return
     * @see org.eclipse.amp.agf.gef.EditPartViewPart#createViewer()
     */
    @Override
    protected EditPartViewer createViewer() {
        TreeViewer treeViewer = new TreeViewer();
        return treeViewer;
    }
    // public boolean isSingle() {
    // return true;
    // }

    public RootEditPart createRoot() {
        return null;
    }
}
