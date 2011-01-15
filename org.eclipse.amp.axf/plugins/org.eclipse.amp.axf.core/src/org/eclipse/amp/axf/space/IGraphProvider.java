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
package org.eclipse.amp.axf.space;

import java.util.List;
import java.util.Map;

public interface IGraphProvider {
    public Map<Object, Object> getAdjacencyMap(Object graph);

    public List<Object> getNeighborsFor(Object graph, Object source);

    public boolean isGraph(Object graph);
}
