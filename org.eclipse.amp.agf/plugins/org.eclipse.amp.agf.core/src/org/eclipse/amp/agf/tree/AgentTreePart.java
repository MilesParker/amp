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

import org.eclipse.amp.agf.GenericGraphicsProvider;
import org.eclipse.amp.agf.IGraphicsAdapter;
import org.eclipse.gef.editparts.AbstractTreeEditPart;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.graphics.Image;

// TODO: Auto-generated Javadoc
/**
 * The Class AgentTreePart.
 */
public class AgentTreePart extends AbstractTreeEditPart {

    protected IGraphicsAdapter graphicsAdapter;
    private ILabelProvider labelProvider;

    public AgentTreePart(IGraphicsAdapter graphicsAdapter) {
        super();
        this.graphicsAdapter = graphicsAdapter;
    }

    /**
     * @param model
     * @see org.eclipse.gef.editparts.AbstractEditPart#setModel(java.lang.Object)
     */
    public void setModel(Object model) {
        super.setModel(model);
        // figure provider may not be null, but the others may be. Generally label provider will be provided by an
        // adapted object
        labelProvider = (ILabelProvider) getGraphicsAdapter().getAdapter(model, ILabelProvider.class);
    }

    /**
     * @return
     * @see org.eclipse.gef.editparts.AbstractTreeEditPart#getText()
     */
    @Override
    protected String getText() {
        return labelProvider.getText(getModel());
    }

    /**
     * @return
     * @see org.eclipse.gef.editparts.AbstractTreeEditPart#getImage()
     */
    @Override
    protected Image getImage() {
        return GenericGraphicsProvider.AGENT_IMAGE;
    }

    public IGraphicsAdapter getGraphicsAdapter() {
        return graphicsAdapter;
    }

}
