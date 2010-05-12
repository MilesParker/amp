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

    // TODO provide a default or mark this as abstract?
    /**
     * Returns nothing. You must override this method to avoid a failure.
     * 
     * @param object
     * @return
     * @see org.eclipse.amp.agf.gef.IFigureProvider#getFigure(java.lang.Object)
     */
    public IFigure getFigure(Object object) {
        return null;
    }

    /**
     * Does nothing.
     * 
     * @param object
     * @param figure
     * @see org.eclipse.amp.agf.gef.IFigureProvider#updateFigure(java.lang.Object, org.eclipse.draw2d.IFigure)
     */
    public void updateFigure(Object object, IFigure figure) {
    }

    /**
     * False by default. If you want to be able to change your figure's color after creation you need to override.
     * 
     * @param object
     * @return
     * @see org.eclipse.amp.agf.gef.IFigureProvider#isColorMutable(java.lang.Object)
     */
    public boolean isColorMutable(Object object) {
        return true;
    }

    /**
     * Does the figure itself change during model execution? This value should only be true if you wish to add or remove
     * values from the figure after initial creation. False by default.
     * 
     * @param object
     * @return
     * @see org.eclipse.amp.agf.gef.IFigureProvider#isFigureUpdateable(java.lang.Object)
     */
    public boolean isFigureUpdateable(Object object) {
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
