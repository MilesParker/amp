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

import org.eclipse.draw2d.IFigure;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.ILabelProvider;

public class AgentEditPart extends AgentNodeEditPart {

    ILabelProvider labelProvider;

    IFigureProvider figureProvider;

    private IColorProvider colorProvider;

    public AgentEditPart(IFigureProvider figureProvider, IColorProvider colorProvider, ILabelProvider labelProvider) {
        super();
        this.labelProvider = labelProvider;
        this.figureProvider = figureProvider;
        this.colorProvider = colorProvider;
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
        if (figureProvider.isFigureMutable(getModel())) {
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
}
