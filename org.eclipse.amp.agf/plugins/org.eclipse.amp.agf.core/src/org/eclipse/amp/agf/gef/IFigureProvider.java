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

public interface IFigureProvider {

    IFigure getFigure(Object object);

    /**
     * Can the figure be modified based on object state. If this value is false, consumers are able to optimize by
     * building figure once and only once for a given model instantiation.
     * 
     * @param object
     * @return
     */
    boolean isFigureMutable(Object object);

    /**
     * Can the color of the figure be modified based on object state? If this value is false, consumers are able to
     * optimize by coloring the figure once and only once for a given model instantiation. If the figure itself is
     * mutable, then this value is (generally) irrelevant as most consumers will re-color the new figure at the same
     * time. If the figure is handling its own coloring, then this value is irrelevant.
     * 
     * @param object
     * @return
     */
    boolean isColorMutable(Object object);

    /**
     * Does the figure handle its own coloring? If false, then consumers use a separate color provider to set the figure
     * background and foreground colors. If true -- as in the case of a composite figure that includes separate colors
     * for each component -- then consumers are not responsible for setting figure colors and should not do so.
     * 
     * @param object
     * @return
     */
    boolean isHandlingColor(Object object);
}
