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

import org.eclipse.amp.agf.GraphicsAdapter;
import org.eclipse.amp.agf.IGraphicsAdapter;
import org.eclipse.amp.agf.gef.IFigureProvider;
import org.eclipse.amp.agf.gef.Shapes;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.ILabelProvider;

import org.ascape.model.CellOccupant;
import org.ascape.model.HostCell;

// TODO: Auto-generated Javadoc
/**
 * A factory for creating ScapeAdapter objects.
 */
public class AscapeGraphicsAdapter extends GraphicsAdapter {

    private static IGraphicsAdapter singleton;

    private static final IColorProvider[] DEFAULT_COLOR_PROVIDERS = new IColorProvider[] { AscapeGraphicsProvider
        .getDefault() };

    private static final ILabelProvider[] DEFAULT_LABEL_PROVIDERS = new ILabelProvider[] { AscapeGraphicsProvider
        .getDefault() };

    private static final IFigureProvider[] DEFAULT_OCCUPANT_FIGURE_PROVIDERS = new IFigureProvider[] { Shapes.OVAL_SHAPE_PROVIDER };

    private static final IFigureProvider[] DEFAULT_FIGURE_PROVIDERS = new IFigureProvider[] { Shapes.RECTANGLE_SHAPE_PROVIDER };


    /**
     * @param object
     * @return
     * @see org.eclipse.amp.agf.GraphicsAdapter#getColorsForClass(java.lang.Class)
     */
    public IColorProvider[] getColorsForClass(Class type) {
        return DEFAULT_COLOR_PROVIDERS;
    }

    /**
     * @param object
     * @return
     * @see org.eclipse.amp.agf.GraphicsAdapter#getFiguresForClass(java.lang.Class)
     */
    public IFigureProvider[] getFiguresForClass(Class type) {
        if (CellOccupant.class.isAssignableFrom(type)) {
            return DEFAULT_OCCUPANT_FIGURE_PROVIDERS;
        } else if (HostCell.class == type) {
            return EMPTY_FIGURE_PROVIDERS;
        }
        return DEFAULT_FIGURE_PROVIDERS;
    }

    /**
     * @param object
     * @return
     * @see org.eclipse.amp.agf.GraphicsAdapter#getLabelsForClass(java.lang.Class)
     */
    public ILabelProvider[] getLabelsForClass(Class type) {
        return DEFAULT_LABEL_PROVIDERS;
    }

    public static IGraphicsAdapter getDefault() {
        if (singleton == null) {
            singleton = new AscapeGraphicsAdapter();
        }
        return singleton;
    }
}
