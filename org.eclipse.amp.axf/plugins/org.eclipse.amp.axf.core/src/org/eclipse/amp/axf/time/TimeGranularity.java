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

package org.eclipse.amp.axf.time;

/**
 * Provides typical model update granularity. Models updates can be delayed or they can be designed to take place only
 * every n model update periods. Note that these two are mutually exclusive!
 * 
 * @author mparker
 * 
 */
public class TimeGranularity implements ITimeGranularity {

    long updateDelay;

    int updateFrequency = 1;

    public final static TimeGranularity DEFAULT_GRANULARITY = new TimeGranularity(0, 1);

    private TimeGranularity(long updateDelay, int updateFrequency) {
        super();
        this.updateDelay = updateDelay;
        this.updateFrequency = updateFrequency;
    }

    public static TimeGranularity createDelayGranularity(long delay) {
        return new TimeGranularity(delay, 1);
    }

    public static TimeGranularity createFrequencyGranularity(int frequency) {
        return new TimeGranularity(0, frequency);
    }

    public long getUpdateDelay() {
        return updateDelay;
    }

    public void setUpdateDelay(long updateDelay) {
        updateFrequency = 1;
        this.updateDelay = updateDelay;
    }

    public int getUpdateFrequency() {
        return updateFrequency;
    }

    public void setUpdateFrequency(int updateFrequency) {
        updateDelay = 0;
        this.updateFrequency = updateFrequency;
    }

    public String getDescription() {
        if (updateDelay > 0) {
            return "-" + updateDelay + "ms";
        } else if (updateFrequency == 1) {
            return "1";
        } else if (updateFrequency == Integer.MAX_VALUE) {
            return "MAX";
        } else {
            return updateFrequency + "x";
        }
    }

    /**
     * @return
     * @see java.lang.Object#toString()
     */
    public String toString() {
        return getDescription();
    }
}
