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
package org.eclipse.amp.agf.chart;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.swt.graphics.Color;

// TODO: Auto-generated Javadoc
/**
 * The Class CachedColorProvider.
 */
public class CachedColorProvider implements IColorProvider {

    Map<Object, Color> foregroundCache = new HashMap<Object, Color>();

    Map<Object, Color> backgroundCache = new HashMap<Object, Color>();

    /**
     *
     * @see org.eclipse.jface.viewers.IColorProvider#getBackground(java.lang.Object)
     */
    public Color getBackground(Object element) {
        return backgroundCache.get(element);
    }

    /**
     *
     * @see org.eclipse.jface.viewers.IColorProvider#getForeground(java.lang.Object)
     */
    public Color getForeground(Object element) {
        return foregroundCache.get(element);
    }

    /**
     * Put foreground color.
     * 
     * @param element the element
     * @param color the color
     */
    public void putForegroundColor(Object element, Color color) {
        foregroundCache.put(element, color);
    }

    /**
     * Put background color.
     * 
     * @param element the element
     * @param color the color
     */
    public void putBackgroundColor(Object element, Color color) {
        backgroundCache.put(element, color);
    }
}
