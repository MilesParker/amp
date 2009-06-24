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
import org.eclipse.amp.axf.core.IObservationProvider;
import org.eclipse.core.runtime.IProgressMonitor;

// TODO: Auto-generated Javadoc
/**
 * The Class RunMonitorView.
 */
public class RunMonitorView extends MonitorView {

    /**
     * Instantiates a new run monitor view.
     * 
     * @param monitor the monitor
     */
    public RunMonitorView(IProgressMonitor monitor) {
        super(monitor, "Run Monitor View");
    }

    /**
     * @param model
     * @see org.eclipse.amp.axf.ide.view.MonitorView#observing(org.eclipse.amp.axf.core.IObservationProvider)
     */
    @Override
    public void observing(IObservationProvider model) {
        super.observing(model);
        String mainDesc = "Run " + modelDesc;
        monitor.setTaskName(mainDesc);
    }

    /**
     * @param key
     * @param model
     * @see org.eclipse.amp.axf.core.AbstractLifecycleListener#stateChange(java.lang.Object, java.lang.Object)
     */
    @Override
    public void stateChange(Object key, Object model) {
        super.stateChange(key, model);
        if (monitor.isCanceled() && ((IModel) model).getEngine().isRunning()) {
            ((IModel) model).getEngine().stop();
        }
    }

    /**
     * @param model
     * @see org.eclipse.amp.axf.core.AbstractLifecycleListener#observeUpdate(org.eclipse.amp.axf.core.IObservationProvider)
     */
    @Override
    public void observeUpdate(IObservationProvider model) {
        if (((IModel) model).getPeriod() % 10 == 0) {
            monitor.subTask("Period " + ((IModel) model).getPeriod()
                + (((IModel) model).getStopPeriod() > 0 ? " of " + ((IModel) model).getStopPeriod() : ""));
            monitor.worked(10);
        }
    }

    /**
     * @param observed
     * @see org.eclipse.amp.axf.core.AbstractLifecycleListener#observeStart(org.eclipse.amp.axf.core.IObservationProvider)
     */
    @Override
    public void observeStart(IObservationProvider observed) {
        IModel model = (IModel) observed;
        monitor.beginTask("Run " + model.getName(), model.getStopPeriod() > 0 ? model.getStopPeriod()
            : IProgressMonitor.UNKNOWN);
        monitor.subTask("Started");
        monitor.worked(1);
    }

    /**
     * @param model
     * @see org.eclipse.amp.axf.core.AbstractLifecycleListener#observeStop(org.eclipse.amp.axf.core.IObservationProvider)
     */
    @Override
    public void observeStop(IObservationProvider model) {
        monitor.subTask("Stopped");
        monitor.done();
    }

}
