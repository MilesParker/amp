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


// TODO: Auto-generated Javadoc
/**
 * The Interface IModel.
 */
public interface IModel extends IObservationProvider, ILifecycleNotifier {

    /**
     * Gets the time description.
     * 
     * @return the time description
     */
    String getTimeDescription();

    /**
     * Gets the engine.
     * 
     * @return the engine
     */
    IEngine getEngine();

    /**
     * Returns the root object for the model, that is the modeled object itself.
     * 
     * @return
     */
    Object getRoot();

    /**
     * Gets the name.
     * 
     * @return the name
     */
    String getName();

    /**
     * Gets the period, encoded as a long value as defined by the IEngine time granularity.
     * 
     * @return the period
     */
    int getPeriod();

    /**
     * Gets the stop period.
     * 
     * @return the stop period
     */
    int getStopPeriod();
}
