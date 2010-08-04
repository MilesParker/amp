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
package org.eclipse.amp.agf.gef;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.amp.axf.core.ICompositionProvider;
import org.eclipse.amp.axf.space.IGraphProvider;
import org.eclipse.amp.axf.space.ILocationProvider;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.viewers.IFilter;

public class ScapeGraphEditPart extends ScapeEditPart {

    List<NetworkConnection> connections;
    Map<Object, List<NetworkConnection>> targets;
    Map<Object, List<NetworkConnection>> sources;
    private IGraphProvider graphProvider;

    public ScapeGraphEditPart(ICompositionProvider memberProvider, ILocationProvider locationProvider,
            IGraphProvider graphProvider, IFilter filter) {
        super(memberProvider, locationProvider, filter);
    }

    @SuppressWarnings("unchecked")
    protected synchronized void refreshChildren() {
        Map adj = graphProvider.getAdjacencyMap(getModel());
        connections = new ArrayList<NetworkConnection>(adj.size());
        // if (sources == null) {
        sources = new HashMap<Object, List<NetworkConnection>>();
        targets = new HashMap<Object, List<NetworkConnection>>();
        // }
        for (Object object : adj.entrySet()) {
            Map.Entry<Object, Object> entry = (Map.Entry<Object, Object>) object;
            Object source = entry.getKey();
            List<NetworkConnection> sourceTargets = getConnectList(source, sources);
            sourceTargets.clear();
            for (Object target : graphProvider.getNeighborsFor(getModel(), source)) {
                List<NetworkConnection> targetSources = getConnectList(target, targets);
                NetworkConnection connect = null;
                for (NetworkConnection networkConnection : sourceTargets) {
                    if (networkConnection.target == target) {
                        connect = networkConnection;
                        break;
                    }
                }
                if (connect == null) {
                    connect = new NetworkConnection(source, target);
                }
                connections.add(connect);
                targetSources.add(connect);
                sourceTargets.add(connect);
            }
        }
    }

    /**
     * @param model
     * @see org.eclipse.gef.editparts.AbstractEditPart#setModel(java.lang.Object)
     */
    public void setModel(Object model) {
        super.setModel(model);
        graphProvider = (IGraphProvider) Platform.getAdapterManager().getAdapter(model, ICompositionProvider.class);
    }

    public synchronized List<NetworkConnection> getConnectList(Object source, Map<Object, List<NetworkConnection>> map) {
        List<NetworkConnection> connects = map.get(source);
        if (connects == null) {
            connects = new ArrayList<NetworkConnection>();
            map.put(source, connects);
        }
        return connects;
    }

    @Override
    public synchronized List getModelChildren() {
        return connections;
    }

    public synchronized List getModelSourceConnections(Object modelObject) {
        List<NetworkConnection> list = sources.get(modelObject);
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public synchronized List getModelTargetConnections(Object modelObject) {
        List<NetworkConnection> list = targets.get(modelObject);
        return list != null ? list : Collections.EMPTY_LIST;
    }
}
