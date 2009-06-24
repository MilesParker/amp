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
package org.eclipse.amp.axf.ide;

import org.eclipse.amp.axf.core.ILifeCycleListener;
import org.eclipse.amp.axf.core.IModel;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.plugin.AbstractUIPlugin;

// TODO: Auto-generated Javadoc
/**
 * The Class ModelManagerLabelProvider.
 */
public class ModelManagerLabelProvider implements ILabelProvider {

    public static Image RUN_IMAGE = AbstractUIPlugin.imageDescriptorFromPlugin("org.eclipse.amp.axf.ide",
    "icons/etool16/model_running.gif").createImage();

    public static Image PAUSE_IMAGE = AbstractUIPlugin.imageDescriptorFromPlugin("org.eclipse.amp.axf.ide",
    "icons/etool16/model_paused.gif")
    .createImage();

    public static Image STOP_IMAGE = AbstractUIPlugin.imageDescriptorFromPlugin("org.eclipse.amp.axf.ide",
    "icons/etool16/model_stopped.gif")
    .createImage();

    public static Image LISTENER_IMAGE = AbstractUIPlugin.imageDescriptorFromPlugin("org.eclipse.amp.axf.ide",
    "icons/etool16/listener.gif")
    .createImage();

    /**
     * @param element
     * @return
     * @see org.eclipse.jface.viewers.ILabelProvider#getImage(java.lang.Object)
     */
    public Image getImage(Object element) {
        if (element instanceof IModel) {
            if (((IModel) element).getEngine().isPaused()) {
                return PAUSE_IMAGE;
            }
            if (((IModel) element).getEngine().isRunning()) {
                return RUN_IMAGE;
            }
            return STOP_IMAGE;
        }
        if (element instanceof ILifeCycleListener) {
            if (element instanceof IAdaptable) {
                IViewPart view = (IViewPart) ((IAdaptable) element).getAdapter(IViewPart.class);
                if (view != null) {
                    return view.getTitleImage();
                }
            }
            return LISTENER_IMAGE;
        }
        return null;
    }

    /**
     * @param element
     * @return
     * @see org.eclipse.jface.viewers.ILabelProvider#getText(java.lang.Object)
     */
    public String getText(Object element) {
        if (element instanceof IModel) {
            ((IModel) element).getName();
        }
        return element.toString();
    }

    /**
     * @param listener
     * @see org.eclipse.jface.viewers.IBaseLabelProvider#addListener(org.eclipse.jface.viewers.ILabelProviderListener)
     */
    public void addListener(ILabelProviderListener listener) {
        // TODO Auto-generated method stub

    }

    /**
     * 
     * @see org.eclipse.jface.viewers.IBaseLabelProvider#dispose()
     */
    public void dispose() {
        // TODO Auto-generated method stub

    }

    /**
     * @param element
     * @param property
     * @return
     * @see org.eclipse.jface.viewers.IBaseLabelProvider#isLabelProperty(java.lang.Object, java.lang.String)
     */
    public boolean isLabelProperty(Object element, String property) {
        // TODO Auto-generated method stub
        return false;
    }

    /**
     * @param listener
     * @see org.eclipse.jface.viewers.IBaseLabelProvider#removeListener(org.eclipse.jface.viewers.ILabelProviderListener)
     */
    public void removeListener(ILabelProviderListener listener) {
        // TODO Auto-generated method stub

    }

}
