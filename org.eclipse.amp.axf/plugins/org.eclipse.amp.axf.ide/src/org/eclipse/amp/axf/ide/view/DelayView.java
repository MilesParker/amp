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
import org.eclipse.amp.axf.time.TimeGranularity;

/**
 * 
 * @author mparker
 *
 */
public class DelayView extends AbstractLifecycleListener {

    /**
     * @param observed
     * @see org.eclipse.amp.axf.core.AbstractLifecycleListener#observeUpdate(org.eclipse.amp.axf.core.IObservationProvider)
     */
    public void observeUpdate(IObservationProvider observed) {
        long delayPeriod = ((TimeGranularity) ((IModel) observed).getEngine().getUpdateGranularity()).getUpdateDelay();
        if (delayPeriod > 0) {
            try {
                Thread.sleep(delayPeriod);
            } catch (InterruptedException e) {
            }
        }
    }
}
