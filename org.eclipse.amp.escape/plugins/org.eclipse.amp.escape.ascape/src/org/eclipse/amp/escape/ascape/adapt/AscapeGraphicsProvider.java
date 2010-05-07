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

import org.eclipse.amp.escape.ascape.wrap.ScapeWrapperModelListener;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;

import org.ascape.model.Agent;
import org.ascape.model.AscapeObject;
import org.ascape.model.event.ScapeListener;

// TODO: Auto-generated Javadoc
/**
 * The Class AscapeProvider.
 */
public class AscapeGraphicsProvider implements ILabelProvider, IColorProvider {

    private static AscapeGraphicsProvider singleton;

    /**
     * @param element
     * @return
     * @see org.eclipse.jface.viewers.ILabelProvider#getText(java.lang.Object)
     */
    public String getText(Object element) {
        String text = null;
        if (element instanceof AscapeObject) {
            text = ((AscapeObject) element).getName();
        }
        if (element instanceof ScapeListener) {
            text = ((ScapeListener) element).getName();
        }
        if (element instanceof ScapeWrapperModelListener) {
            text = getText(((ScapeWrapperModelListener) element).getWrapped());
        }
        // Text can't be null for some cases..
        if (text == null) {
            text = element.getClass().getSimpleName();
        }
        return text;
    }

    /**
     * @param element
     * @return
     * @see org.eclipse.jface.viewers.ILabelProvider#getImage(java.lang.Object)
     */
    public Image getImage(Object element) {
        return null;
        // if (element instanceof ScapeWrapperModelListener) {
        // return super.getImage(((ScapeWrapperModelListener) element).getWrapped());
        // }
        // throw new RuntimeException("Unexpected input for Scape Label Provider: " + element);
    }

    /**
     * @param listener
     * @see org.eclipse.jface.viewers.IBaseLabelProvider#addListener(org.eclipse.jface.viewers.ILabelProviderListener)
     */
    public void addListener(ILabelProviderListener listener) {
    }

    /**
     * 
     * @see org.eclipse.jface.viewers.IBaseLabelProvider#dispose()
     */
    public void dispose() {
    }

    /**
     * @param element
     * @param property
     * @return
     * @see org.eclipse.jface.viewers.IBaseLabelProvider#isLabelProperty(java.lang.Object, java.lang.String)
     */
    public boolean isLabelProperty(Object element, String property) {
        return false;
    }

    /**
     * @param listener
     * @see org.eclipse.jface.viewers.IBaseLabelProvider#removeListener(org.eclipse.jface.viewers.ILabelProviderListener)
     */
    public void removeListener(ILabelProviderListener listener) {
    }

    public static AscapeGraphicsProvider getDefault() {
        if (singleton == null) {
            singleton = new AscapeGraphicsProvider();
        }
        return singleton;
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
        return ColorConstants.cyan;
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
        return ColorConstants.orange;
    }
}
