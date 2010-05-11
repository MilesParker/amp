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

package org.eclipse.amp.agf;

import org.eclipse.amp.agf.gef.IFigureProvider;
import org.eclipse.amp.agf.gef.Shapes;
import org.eclipse.amp.axf.core.IModel;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.ILabelProvider;

/**
 * 
 * @author mparker
 * 
 */
public class GraphicsAdapter implements IGraphicsAdapter {

    private static IGraphicsAdapter singleton;

    public static Class[] GRAPHICS_ADAPTERS = new Class[] { IFigureProvider.class, IColorProvider.class,
        ILabelProvider.class };

    public static final IColorProvider[] DEFAULT_COLOR_PROVIDERS = new IColorProvider[] { GenericGraphicsProvider
        .getDefault() };
    public static final ILabelProvider[] DEFAULT_LABEL_PROVIDERS = new ILabelProvider[] { GenericGraphicsProvider
        .getDefault() };
    public static final IFigureProvider[] EMPTY_FIGURE_PROVIDERS = new IFigureProvider[] {};

    private static final IFigureProvider[] DEFAULT_FIGURE_PROVIDERS = new IFigureProvider[] { Shapes.RECTANGLE_SHAPE_PROVIDER };

    /**
     * @param object
     * @return
     * @see org.eclipse.amp.agf.IGraphicsAdapter#getColors(java.lang.Object)
     */
    public IColorProvider[] getColors(Object object) {
        return getColorsForClass(object.getClass());
    }

    /**
     * @param object
     * @return
     * @see org.eclipse.amp.agf.IGraphicsAdapter#getFigures(java.lang.Object)
     */
    public IFigureProvider[] getFigures(Object object) {
        return getFiguresForClass(object.getClass());
    }

    /**
     * @param object
     * @return
     * @see org.eclipse.amp.agf.IGraphicsAdapter#getLabels(java.lang.Object)
     */
    public ILabelProvider[] getLabels(Object object) {
        return getLabelsForClass(object.getClass());
    }

    /**
     * @param object
     * @return
     * @see org.eclipse.amp.agf.IGraphicsAdapter#getColorsForClass(java.lang.Class)
     */
    public IColorProvider[] getColorsForClass(Class type) {
        return DEFAULT_COLOR_PROVIDERS;
    }

    /**
     * @param object
     * @return
     * @see org.eclipse.amp.agf.IGraphicsAdapter#getFiguresForClass(java.lang.Class)
     */
    public IFigureProvider[] getFiguresForClass(Class type) {
        return DEFAULT_FIGURE_PROVIDERS;
    }

    /**
     * @param object
     * @return
     * @see org.eclipse.amp.agf.IGraphicsAdapter#getLabelsForClass(java.lang.Class)
     */
    public ILabelProvider[] getLabelsForClass(Class type) {
        return DEFAULT_LABEL_PROVIDERS;
    }

    /**
     * @param adaptableObject
     * @param adapterType
     * @return
     * @see org.eclipse.core.runtime.IAdapterFactory#getAdapter(java.lang.Object, java.lang.Class)
     */
    public Object getAdapter(Object adaptableObject, Class adapterType) {
        if (adaptableObject instanceof IModel) {
            return Platform.getAdapterManager().getAdapter(((IModel) adaptableObject).getRoot(), adapterType);
        }
        if (adapterType == IFigureProvider.class) {
            IFigureProvider[] figureProviders = getFigures(adaptableObject);
            if (figureProviders != null && figureProviders.length > 0) {
                return figureProviders[0];
            }
            if (figureProviders != null) {
                return null;
            }
        }
        if (adapterType == ILabelProvider.class) {
            ILabelProvider[] labelProviders = getLabels(adaptableObject);
            if (labelProviders != null && labelProviders.length > 0) {
                return labelProviders[0];
            }
        }
        if (adapterType == IColorProvider.class) {
            IColorProvider[] colorProviders = getColors(adaptableObject);
            if (colorProviders != null && colorProviders.length > 0) {
                return colorProviders[0];
            }
        }
        return Platform.getAdapterManager().getAdapter(adaptableObject, adapterType);
    }

    /**
     * @return
     * @see org.eclipse.core.runtime.IAdapterFactory#getAdapterList()
     */
    public Class[] getAdapterList() {
        return GRAPHICS_ADAPTERS;
    }

    public static IGraphicsAdapter getDefault() {
        if (singleton == null) {
            singleton = new GraphicsAdapter();
        }
        return singleton;
    }
}
