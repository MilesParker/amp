/*******************************************************************************
 * Copyright (c) 2009, Metascape LLC, Miles Parker.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Miles Parker - initial API and implementation
 ******************************************************************************/
package org.ascape.view.vis;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.ui.IViewPart;

public class GraphicsEditPart extends AbstractGraphicalEditPart {

    private final GraphicsView graphicsView;

    /**
     * @param graphicsView
     * @param model
     */
    GraphicsEditPart(GraphicsView graphicsView, Object model) {
        this.graphicsView = graphicsView;
        setModel(model);
    }

    protected IFigure createFigure() {
        graphicsView.createImageFigure();
        return graphicsView.getImageFigure();
    }

    protected void createEditPolicies() {
    }

    public void refresh() {
        graphicsView.refresh();
    }

    public void setModel(Object model) {
        super.setModel(model);
        graphicsView.createFeatures();
    }

    @Override
    public Object getAdapter(Class key) {
        if (key == IViewPart.class) {
            return graphicsView.getViewPart();
        }
        return super.getAdapter(key);
    }
}