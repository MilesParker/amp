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
 * A marker interface for levels of update granularity. These are designed to be extensible for particular engine
 * implementations. Note that granularity can (and will) be used to define more sophisticated granularities. For
 * example, engines could be defined to update for each state change within an agent, each set of changes for an agent,
 * or for each complete iteration of the entire model.
 * 
 * @see TimeGranularityImpl for an example of how the default granularities are defined.
 * 
 * @author mparker
 * 
 */
public interface ITimeGranularity {

}
