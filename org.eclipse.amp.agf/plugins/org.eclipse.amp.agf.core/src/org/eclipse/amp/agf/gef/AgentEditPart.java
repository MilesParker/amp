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

import org.eclipse.amp.agf.IGraphicsAdapter;
import org.eclipse.draw2d.IFigure;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.ILabelProvider;

public class AgentEditPart extends AgentNodeEditPart {

    private IGraphicsAdapter graphicsAdapter;

    ILabelProvider labelProvider;

    IFigureProvider figureProvider;

    IColorProvider colorProvider;

    public AgentEditPart(IGraphicsAdapter graphicsAdapter) {
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
        figureProvider = (IFigureProvider) getGraphicsAdapter().getAdapter(model, IFigureProvider.class);
        labelProvider = (ILabelProvider) getGraphicsAdapter().getAdapter(model, ILabelProvider.class);
        colorProvider = (IColorProvider) getGraphicsAdapter().getAdapter(model, IColorProvider.class);
    }

    protected void updateColor(IFigure figure) {
        figure.setForegroundColor(getColorProvider().getForeground(getModel()));
        figure.setBackgroundColor(getColorProvider().getBackground(getModel()));
    }

    protected IFigure createFigure() {
        Object agent = getModel();
        figure = figureProvider.getFigure(agent);
        updateColor(figure);
        return figure;
    }

    /**
     * 
     * @see org.eclipse.amp.agf.gef.GenericEditPart#refreshVisuals()
     */
    protected void refreshVisuals() {
        if (figureProvider.isFigureUpdateable(getModel())) {
            setFigure(createFigure());
        }
        if (!figureProvider.isHandlingColor(getModel()) && figureProvider.isColorMutable(getModel())) {
            updateColor(figure);
        }
        updateSelection();
    }

    public IColorProvider getColorProvider() {
        return colorProvider;
    }

    /**
     * @return the figureProvider
     */
    public IFigureProvider getFigureProvider() {
        return figureProvider;
    }

    /**
     * @return the labelProvider
     */
    public ILabelProvider getLabelProvider() {
        return labelProvider;
    }

    public IGraphicsAdapter getGraphicsAdapter() {
        return graphicsAdapter;
    }
}
