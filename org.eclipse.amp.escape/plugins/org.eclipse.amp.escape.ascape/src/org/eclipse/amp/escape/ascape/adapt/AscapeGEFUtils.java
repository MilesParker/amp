/**
 * <copyright>
 *
 * Copyright (c) 2010 Metascape, LLC.
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

package org.eclipse.amp.escape.ascape.adapt;

import org.eclipse.amp.axf.space.ILocation;
import org.eclipse.amp.axf.space.Location1DDoubleAdapter;
import org.eclipse.amp.axf.space.Location1DIntegerAdapter;
import org.eclipse.amp.axf.space.Location2DDoubleAdapter;
import org.eclipse.amp.axf.space.Location2DIntegerAdapter;

import org.ascape.model.space.Coordinate;
import org.ascape.model.space.Coordinate1DContinuous;
import org.ascape.model.space.Coordinate1DDiscrete;
import org.ascape.model.space.Coordinate2DContinuous;
import org.ascape.model.space.Coordinate2DDiscrete;

/**
 * 
 * @author mparker
 * 
 */
public class AscapeGEFUtils {

    public static ILocation adaptCoordinate(final Coordinate coordinate) {
        // java "object-orientation" strikes again..wouldn't it be nice to be able to use proper method dispatch?
        if (coordinate instanceof Coordinate2DDiscrete) {
            return new Location2DIntegerAdapter() {
                public int getXInteger() {
                    return ((Coordinate2DDiscrete) coordinate).getXValue();
                }

                public int getYInteger() {
                    return ((Coordinate2DDiscrete) coordinate).getYValue();
                }
            };
        } else if (coordinate instanceof Coordinate2DContinuous) {
            return new Location2DDoubleAdapter() {
                public double getXDouble() {
                    return ((Coordinate2DContinuous) coordinate).getXValue();
                }

                public double getYDouble() {
                    return ((Coordinate2DContinuous) coordinate).getYValue();
                }
            };
        } else if (coordinate instanceof Coordinate1DDiscrete) {
            return new Location1DIntegerAdapter() {

                public int getXInteger() {
                    return ((Coordinate1DDiscrete) coordinate).getXValue();
                }
            };
        } else if (coordinate instanceof Coordinate1DContinuous) {
            return new Location1DDoubleAdapter() {

                public double getXDouble() {
                    return ((Coordinate1DContinuous) coordinate).getXValue();
                }
            };
        }
        return ILocation.NOT_LOCATED;
    }

}