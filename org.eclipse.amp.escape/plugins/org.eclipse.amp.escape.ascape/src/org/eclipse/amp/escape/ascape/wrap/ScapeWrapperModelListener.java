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
package org.eclipse.amp.escape.ascape.wrap;

import java.util.TooManyListenersException;

import org.ascape.model.Scape;
import org.ascape.model.event.ScapeEvent;
import org.ascape.model.event.ScapeListener;
import org.eclipse.amp.axf.core.ILifeCycleListener;
import org.eclipse.amp.axf.core.IObservationProvider;

// TODO: Auto-generated Javadoc
/**
 * The listener interface for receiving scapeWrapperModel events. The class that is interested in processing a
 * scapeWrapperModel event implements this interface, and the object created with that class is registered with a
 * component using the component's <code>addScapeWrapperModelListener<code> method. When
 * the scapeWrapperModel event occurs, that object's appropriate
 * method is invoked.
 * 
 * @see ScapeWrapperModelEvent
 */
public class ScapeWrapperModelListener implements ILifeCycleListener {

    Scape scape;
    ScapeListener wrapped;

    /**
     * Instantiates a new scape wrapper model listener.
     * 
     * @param scape the scape
     * @param wrapped the wrapped
     */
    public ScapeWrapperModelListener(Scape scape, ScapeListener wrapped) {
        this.scape = scape;
        this.wrapped = wrapped;
    }

    /**
     * @param model
     * @see org.eclipse.amp.axf.core.ILifeCycleListener#observing(org.eclipse.amp.axf.core.IObservationProvider)
     */
    public void observing(IObservationProvider model) {
        try {
            wrapped.scapeAdded(new ScapeEvent(scape, ScapeEvent.REPORT_ADDED));
        } catch (TooManyListenersException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * @param key
     * @param updated
     * @see org.eclipse.amp.axf.core.IStateListener#stateChange(java.lang.Object, java.lang.Object)
     */
    public void stateChange(Object key, Object updated) {
    }

    /**
     * @param model
     * @see org.eclipse.amp.axf.core.ILifeCycleListener#observationEnding(org.eclipse.amp.axf.core.IObservationProvider)
     */
    public void observationEnding(IObservationProvider model) {
        wrapped.scapeClosing(new ScapeEvent(scape, ScapeEvent.REPORT_ADDED));
    }

    /**
     * @param model
     * @see org.eclipse.amp.axf.core.ILifeCycleListener#observeInitialize(org.eclipse.amp.axf.core.IObservationProvider)
     */
    public void observeInitialize(IObservationProvider model) {
        wrapped.scapeClosing(new ScapeEvent(scape, ScapeEvent.REPORT_INITIALIZED));
    }

    /**
     * @param model
     * @see org.eclipse.amp.axf.core.ILifeCycleListener#observeUpdate(org.eclipse.amp.axf.core.IObservationProvider)
     */
    public void observeUpdate(IObservationProvider model) {
        wrapped.scapeClosing(new ScapeEvent(scape, ScapeEvent.REPORT_ITERATE));
    }

    /**
     * @param model
     * @see org.eclipse.amp.axf.core.ILifeCycleListener#observationEnd(org.eclipse.amp.axf.core.IObservationProvider)
     */
    public void observationEnd(IObservationProvider model) {
        wrapped.scapeClosing(new ScapeEvent(scape, ScapeEvent.REPORT_REMOVED));
    }

    /**
     * @param model
     * @see org.eclipse.amp.axf.core.ILifeCycleListener#observeCreate(org.eclipse.amp.axf.core.IObservationProvider)
     */
    public void observeCreate(IObservationProvider model) {
        wrapped.scapeClosing(new ScapeEvent(scape, ScapeEvent.REQUEST_SETUP));
    }

    /**
     * @param model
     * @see org.eclipse.amp.axf.core.ILifeCycleListener#observeStart(org.eclipse.amp.axf.core.IObservationProvider)
     */
    public void observeStart(IObservationProvider model) {
        wrapped.scapeClosing(new ScapeEvent(scape, ScapeEvent.REPORT_START));
    }

    /**
     * @param model
     * @see org.eclipse.amp.axf.core.ILifeCycleListener#observeStop(org.eclipse.amp.axf.core.IObservationProvider)
     */
    public void observeStop(IObservationProvider model) {
        wrapped.scapeClosing(new ScapeEvent(scape, ScapeEvent.REPORT_STOP));
    }

    /**
     * Gets the wrapped.
     * 
     * @return the wrapped
     */
    public ScapeListener getWrapped() {
        return wrapped;
    }

    /**
     * @return
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return wrapped + " Wrapper";
    }
}
