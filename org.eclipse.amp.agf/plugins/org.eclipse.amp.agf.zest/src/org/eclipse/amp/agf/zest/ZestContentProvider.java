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

package org.eclipse.amp.agf.zest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.eclipse.amp.axf.core.ICompositionProvider;
import org.eclipse.amp.axf.space.IGraphProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.zest.core.viewers.IGraphEntityContentProvider;

/**
 * 
 * @author mparker
 * 
 */
public class ZestContentProvider implements IGraphEntityContentProvider {

	IGraphProvider graphProvider;

	ICompositionProvider compostionProvider;

	private Collection<Object> graphs;

	public ZestContentProvider(IGraphProvider graphProvider, ICompositionProvider compostionProvider) {
		this.graphProvider = graphProvider;
		this.compostionProvider = compostionProvider;
	}

	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
	}

	public void dispose() {
	}

	Collection<Object> collectGraphs(Object parent, Collection<Object> buildCollection) {
		if (graphProvider.isGraph(parent)) {
			buildCollection.add(parent);
		}
		if (compostionProvider.isChildrenComposition(parent)) {
			for (Object child : compostionProvider.getIteratable(parent)) {
				collectGraphs(child, buildCollection);
			}
		}
		return buildCollection;
	}

	public Object[] getElements(Object parent) {
		Collection allElements = new HashSet();
		graphs = collectGraphs(parent, new HashSet<Object>());
		for (Object graph : graphs) {
			Map<Object, Object> graphMap = graphProvider.getAdjacencyMap(graph);
			Collection values = graphMap.values();
			for (Object valueMember : values) {
				Collection collection = (Collection) valueMember;
				if (!collection.isEmpty() && collection.iterator().next() != null) {
					allElements.addAll(collection);
				}
			}
			allElements.addAll(graphMap.keySet());
		}
		return allElements.toArray();
	}

	public Object[] getConnectedTo(Object object) {
		List neighborsFor = new ArrayList();
		// TODO one graph optimization
		for (Object graph : graphs) {
			neighborsFor.addAll(graphProvider.getNeighborsFor(graph, object));
		}
		return neighborsFor.toArray();
	}
};