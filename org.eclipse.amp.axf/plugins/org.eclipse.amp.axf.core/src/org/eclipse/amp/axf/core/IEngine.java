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
package org.eclipse.amp.axf.core;

import org.eclipse.amp.axf.time.ITimeGranularity;

// TODO: Auto-generated Javadoc
/**
 * The Interface IEngine.
 */
public interface IEngine {

    /**
     * Close.
     */
    void close();

    /**
     * Close finally.
     */
    void closeFinally();

    /**
     * Checks if is close requested.
     * 
     * @return true, if is close requested
     */
    boolean isCloseRequested();

    /**
     * Gets the model thread.
     * 
     * @return the model thread
     */
    Thread getModelThread();

    /**
     * Checks if is running.
     * 
     * @return true, if is running
     */
    boolean isRunning();

    /**
     * Checks if is paused.
     * 
     * @return true, if is paused
     */
    boolean isPaused();

    /**
     * Stop.
     */
    void stop();

    /**
     * Control.
     * 
     * @param ModelControl the model control
     */
    void control(EngineControl ModelControl);

    /**
     * Observation complete.
     * 
     * @param observer the observer
     */
    void observationComplete(ILifeCycleListener observer);

    /**
     * Gets the model.
     * 
     * @return the model
     */
    IObservationProvider getModel();

    /**
     * Sets the update granularity. This defines how often observers expect to receive state change notifications.
     * Regardless of this value, engines should always provide life-cycle notifications.
     * 
     * @param granularity the desired update granularity (engine specific).
     */
    void setUpdateGranularity(ITimeGranularity granularity);

    /**
     * Returns the update granularity.
     * 
     * @param granularity the desired update granularity (engine specific).
     */
    ITimeGranularity getUpdateGranularity();
}
