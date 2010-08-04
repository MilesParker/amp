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

import org.eclipse.amp.axf.core.AbstractLifecycleListener;
import org.eclipse.amp.axf.core.IModel;
import org.eclipse.amp.axf.core.IObservationProvider;
import org.eclipse.core.runtime.IProgressMonitor;

// TODO: Auto-generated Javadoc
/**
 * The Class MonitorView.
 */
public abstract class MonitorView extends AbstractLifecycleListener {

    protected final IProgressMonitor monitor;

    protected String modelDesc;

    /**
     * Instantiates a new monitor view.
     * 
     * @param monitor the monitor
     * @param name the name
     */
    public MonitorView(IProgressMonitor monitor, String name) {
        super(name);
        this.monitor = monitor;
    }

    /**
     * @param model
     * @see org.eclipse.amp.axf.core.AbstractLifecycleListener#observing(org.eclipse.amp.axf.core.IObservationProvider)
     */
    @Override
    public void observing(IObservationProvider model) {
        super.observing(model);
        // TODO change to label provider
        modelDesc = ((IModel) model).getName();
    }
}
