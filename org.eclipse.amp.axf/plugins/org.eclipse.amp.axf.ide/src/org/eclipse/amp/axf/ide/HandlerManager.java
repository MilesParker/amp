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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.amp.axf.ide.handlers.ModelRunHandler;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.handlers.IHandlerActivation;
import org.eclipse.ui.handlers.IHandlerService;

/**
 * 
 * @author mparker
 *
 */
public class HandlerManager {

    private IHandlerService handlerService;

    private List<IHandlerActivation> handlerActivations;

    private List<ModelRunHandler> handlers;

    public synchronized void activate() {
        handlerService = (IHandlerService) AXFWorkbenchPlugin.getDefault().getWorkbench()
        .getService(IHandlerService.class);
        handlerActivations = new ArrayList<IHandlerActivation>();
        handlers = new ArrayList<ModelRunHandler>();
    }

    public synchronized void deactivate() {
        if (handlerService != null) {
            handlerService.deactivateHandlers(handlerActivations);
        }
    }

    /**
     * Adds the handler.
     * 
     * @param id the id
     * @param handler the handler
     */
    protected synchronized void addHandler(String id, final ModelRunHandler handler) {
        handlers.add(handler);
        handlerActivations.add(handlerService.activateHandler(id, handler));
        ModelViewManager manager = AXFWorkbenchPlugin.getDefault().getManager();
        manager.getActiveModelListeners().addListener(handler);
        manager.getManagerListeners().addModelManagerListener(handler);
    }

    public synchronized void notifyHandlers() {
        Display.getDefault().asyncExec(new Runnable() {
            public void run() {
                for (ModelRunHandler handler : handlers) {
                    handler.notifyChange();
                }
            }
        });
    }
}
