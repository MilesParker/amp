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
package org.eclipse.amp.escape.ide;

// TODO: Auto-generated Javadoc
/**
 * The Class ExpectedValue.
 */
public class ExpectedValue {
    
    /**
     * Instantiates a new expected value.
     * 
     * @param measure the measure
     * @param min the min
     * @param max the max
     */
    public ExpectedValue(String measure, String min, String max) {
        super();
        this.measure = measure;
        this.min = min;
        this.max = max;
    }

    String measure;
    String min;
    String max;

    /**
     * Gets the measure.
     * 
     * @return the measure
     */
    public String getMeasure() {
        return measure;
    }

    /**
     * Sets the measure.
     * 
     * @param measure the new measure
     */
    public void setMeasure(String measure) {
        this.measure = measure;
    }

    /**
     * Gets the min.
     * 
     * @return the min
     */
    public String getMin() {
        return min;
    }

    /**
     * Sets the min.
     * 
     * @param min the new min
     */
    public void setMin(String min) {
        this.min = min;
    }

    /**
     * Gets the max.
     * 
     * @return the max
     */
    public String getMax() {
        return max;
    }

    /**
     * Sets the max.
     * 
     * @param max the new max
     */
    public void setMax(String max) {
        this.max = max;
    }
}