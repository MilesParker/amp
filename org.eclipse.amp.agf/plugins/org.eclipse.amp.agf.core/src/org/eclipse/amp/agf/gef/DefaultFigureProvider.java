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

package org.eclipse.amp.agf.gef;

import org.eclipse.draw2d.IFigure;

/**
 * 
 * @author mparker
 *
 */
public class DefaultFigureProvider implements IFigureProvider {

    /**
     * @param object
     * @return
     * @see org.eclipse.amp.agf.gef.IFigureProvider#getFigure(java.lang.Object)
     */
    public IFigure getFigure(Object object) {
        return null;
    }

    /**
     * False by default. If you want to be able to change your figure's color after creation you need to override.
     * 
     * @param object
     * @return
     * @see org.eclipse.amp.agf.gef.IFigureProvider#isColorMutable(java.lang.Object)
     */
    public boolean isColorMutable(Object object) {
        return false;
    }

    /**
     * False by default. If you want to be able to change the figure color after creation you need to override.
     * 
     * @param object
     * @return
     * @see org.eclipse.amp.agf.gef.IFigureProvider#isFigureMutable(java.lang.Object)
     */
    public boolean isFigureMutable(Object object) {
        return false;
    }

    /**
     * False by default. Override if you're coloring your own figures.
     * 
     * @param object
     * @return
     * @see org.eclipse.amp.agf.gef.IFigureProvider#isHandlingColor(java.lang.Object)
     */
    public boolean isHandlingColor(Object object) {
        return false;
    }

}
