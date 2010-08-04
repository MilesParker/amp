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

package org.eclipse.amp.axf.ide.view;

import org.eclipse.amp.axf.core.IModel;
import org.eclipse.amp.axf.ide.AXFWorkbenchPlugin;
import org.eclipse.amp.axf.ide.AbstractModelWorkbenchListener;
import org.eclipse.amp.axf.ide.ModelViewManager;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

/**
 * 
 * @author mparker
 *
 */
public abstract class ActiveModelViewPart extends ViewPart {

    /**
     * @param parent
     * @see org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets.Composite)
     */
    public void createPartControl(Composite parent) {
        new Thread() {
            public void run() {
                AXFWorkbenchPlugin default1 = AXFWorkbenchPlugin.getDefault();
                while (default1 == null) {
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    default1 = AXFWorkbenchPlugin.getDefault();
                }
                ModelViewManager manager = default1.getManager();
                if (manager.getActiveModel() != null) {
                    modelChanged((IModel) manager.getActiveModel());
                }
                manager.getManagerListeners().addModelManagerListener(new AbstractModelWorkbenchListener() {

                    public void modelActivated(IModel model) {
                        modelChanged(model);
                    }

                });
            };
        }.start();
    }

    /**
     * @param activeModel
     */
    protected abstract void modelChanged(IModel activeModel);

    /**
     * 
     * @see org.eclipse.ui.part.WorkbenchPart#setFocus()
     */
    public void setFocus() {
    }

}