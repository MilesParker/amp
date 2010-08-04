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

import org.ascape.model.Agent;
import org.ascape.model.AscapeObject;
import org.ascape.model.HostCell;
import org.ascape.model.event.ScapeListener;
import org.eclipse.amp.agf.GenericGraphicsProvider;
import org.eclipse.amp.escape.ascape.wrap.ScapeWrapperModelListener;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.swt.graphics.Color;

// TODO: Auto-generated Javadoc
/**
 * The Class AscapeProvider.
 */
public class AscapeGraphicsProvider extends GenericGraphicsProvider {

    private static AscapeGraphicsProvider singleton;

    /**
     * @param element
     * @return
     * @see org.eclipse.jface.viewers.ILabelProvider#getText(java.lang.Object)
     */
    public String getText(Object element) {
        String text = null;
        if (element.getClass() == HostCell.class) {
            return "Cell " + ((HostCell) element).getCoordinate();
        }
        if (element instanceof AscapeObject) {
            text = ((AscapeObject) element).getName();
            if (text != null) {
                return text;
            }
        }
        if (element instanceof ScapeListener) {
            text = ((ScapeListener) element).getName();
            if (text != null) {
                return text;
            }
        }
        if (element instanceof ScapeWrapperModelListener) {
            return getText(((ScapeWrapperModelListener) element).getWrapped());
        }
        return super.getText(element);
    }

    /**
     * @param element
     * @return
     * @see org.eclipse.jface.viewers.IColorProvider#getForeground(java.lang.Object)
     */
    public Color getForeground(Object element) {
        if (element instanceof IColorProvider) {
            return ((IColorProvider) element).getForeground(element);
        } else if (element instanceof Agent) {
            return (Color) ((Agent) element).getPlatformColor();
        }
        return null;
    }

    /**
     * @param element
     * @return
     * @see org.eclipse.jface.viewers.IColorProvider#getBackground(java.lang.Object)
     */
    public Color getBackground(Object element) {
        if (element instanceof IColorProvider) {
            return ((IColorProvider) element).getBackground(element);
        } else if (element instanceof Agent) {
            return (Color) ((Agent) element).getPlatformColor();
        }
        return null;
    }

    public static AscapeGraphicsProvider getDefault() {
        if (singleton == null) {
            singleton = new AscapeGraphicsProvider();
        }
        return singleton;
    }

}
