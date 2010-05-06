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
package org.eclipse.amp.agf.gef;

import org.eclipse.amp.agf.tree.AgentTreePart;
import org.eclipse.amp.agf.tree.ScapeTreePart;
import org.eclipse.amp.axf.core.ICompositionProvider;
import org.eclipse.amp.axf.core.IModel;
import org.eclipse.core.runtime.Platform;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.jface.viewers.ILabelProvider;

// TODO: Auto-generated Javadoc
/**
 * A factory for creating ScapePartTree objects.
 */
public class CompositionPartTreeFactory implements EditPartFactory {

    IModel model;

    public ICompositionProvider compositionProvider;

    public ILabelProvider labelProvider;

    public CompositionPartTreeFactory(IModel model) {
        this.model = model;
        compositionProvider = (ICompositionProvider) Platform.getAdapterManager()
        .getAdapter(model, ICompositionProvider.class);
        labelProvider = (ILabelProvider) Platform.getAdapterManager().getAdapter(model, ILabelProvider.class);
    }

    /**
     * @param context
     * @param model
     * @return
     * @see org.eclipse.gef.EditPartFactory#createEditPart(org.eclipse.gef.EditPart, java.lang.Object)
     */
    public EditPart createEditPart(EditPart context, Object model) {
        EditPart part = getPartForElement(model);
        if (part != null) {
            part.setModel(model);
        }
        return part;
    }

    /**
     * Maps an object to an EditPart.
     * 
     * @param model the model
     * 
     * @return the part for element
     * 
     * @throws RuntimeException if no match was found (programming error)
     */
    protected EditPart getPartForElement(Object model) {
        if (compositionProvider.isChildrenComposition(model)) {
            return new ScapeTreePart(compositionProvider, labelProvider);
        }
        return new AgentTreePart(labelProvider);
    }
}
