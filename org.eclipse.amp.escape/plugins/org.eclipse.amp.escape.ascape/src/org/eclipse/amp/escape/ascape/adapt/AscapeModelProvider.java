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
package org.eclipse.amp.escape.ascape.adapt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.amp.axf.core.ICompositionProvider;
import org.eclipse.amp.axf.space.IGraphProvider;
import org.eclipse.amp.axf.space.ILocation;
import org.eclipse.amp.axf.space.ILocation2D;
import org.eclipse.amp.axf.space.ILocationProvider;

import org.ascape.model.Agent;
import org.ascape.model.CellOccupant;
import org.ascape.model.HostCell;
import org.ascape.model.LocatedAgent;
import org.ascape.model.Scape;
import org.ascape.model.space.Array2D;
import org.ascape.model.space.Continuous2D;
import org.ascape.model.space.Coordinate;
import org.ascape.model.space.Graph;
import org.ascape.model.space.Node;
import org.ascape.model.space.Singleton;
import org.ascape.model.space.Space;

// TODO: Auto-generated Javadoc
/**
 * The Class AscapeProvider.
 */
public class AscapeModelProvider implements ILocationProvider, IGraphProvider, ICompositionProvider {

    private static AscapeModelProvider singleton;

    /**
     * @param located
     * @return
     * @see org.eclipse.amp.axf.space.ILocationProvider#getLocation(java.lang.Object)
     */
    public ILocation getLocation(Object located) {
        LocatedAgent agent = (LocatedAgent) located;
        Coordinate coor = null;
        if (agent instanceof CellOccupant && ((CellOccupant) agent).getHostCell() != null) {
            coor = ((CellOccupant) agent).getHostCell().getCoordinate();
        } else {
            coor = agent.getCoordinate();
        }
        ILocation adaptCoordinate = AscapeGEFUtils.adaptCoordinate(coor);
        if (adaptCoordinate instanceof ILocation2D) {
            return adaptCoordinate;
        }
        return null;
    }

    /**
     * @param located
     * @return
     * @see org.eclipse.amp.axf.space.ILocationProvider#getExtent(java.lang.Object)
     */
    public ILocation getExtent(Object located) {
        Space spatialScape = getSpatialScape((Scape) located);
        if (spatialScape != null) {
            return AscapeGEFUtils.adaptCoordinate(spatialScape.getExtent());
        }
        return null;
    }

    /**
     * Gets the array2 d.
     * 
     * @param scape the scape
     * 
     * @return the array2 d
     */
    public Space getSpatialScape(Scape scape) {
        if (scape.getSpace() instanceof Array2D) {
            return scape.getSpace();
        } else if (scape.getSpace() instanceof Continuous2D) {
            return scape.getSpace();
        } else {
            if (scape.getPrototypeAgent() instanceof Scape) {
                for (Object subScape : scape) {
                    Space spatialScape = getSpatialScape((Scape) subScape);
                    if (spatialScape != null) {
                        return spatialScape;
                    }
                }
            }
        }
        return null;
    }

    /**
     * @param graph
     * @return
     * @see org.eclipse.amp.axf.space.IGraphProvider#getAdjacencyMap(java.lang.Object)
     */
    public HashMap getAdjacencyMap(Object scape) {
        return ((Graph) ((Scape) scape).getSpace()).getAdjacencyMap();
    }

    /**
     * @param graph
     * @param source
     * @return
     * @see org.eclipse.amp.axf.space.IGraphProvider#getNeighborsFor(java.lang.Object, java.lang.Object)
     */
    public List getNeighborsFor(Object scape, Object source) {
        return ((Graph) ((Scape) scape).getSpace()).getNeighborsFor((Node) source);
    }

    /**
     * @param graph
     * @return
     * @see org.eclipse.amp.axf.space.IGraphProvider#isGraph(java.lang.Object)
     */
    public boolean isGraph(Object graph) {
        return graph instanceof Graph || graph instanceof Scape && ((Scape) graph).getSpace() instanceof Graph;
    }

    /**
     * @param hasIterable
     * @return
     * @see org.eclipse.amp.axf.core.ICompositionProvider#getIteratable(java.lang.Object)
     */
    public Iterable getIteratable(Object object) {
        return getList(object);
    }

    /**
     * @param parent
     * @return
     * @see org.eclipse.amp.axf.core.ICompositionProvider#getList(java.lang.Object)
     */
    @SuppressWarnings("unchecked")
    public List getList(Object parent) {
        Scape scape = (Scape) parent;
        if (scape.isRoot()) {
            List use = new ArrayList(scape);
            List hosts = new ArrayList();
            List graphs = new ArrayList();
            for (Object agent : scape) {
                if (((Scape) agent).getPrototypeAgent() instanceof HostCell) {
                    hosts.add(agent);
                }
                if (((Scape) agent).getSpace() instanceof Graph) {
                    graphs.add(agent);
                }
                if (((Scape) agent).getSpace() instanceof Continuous2D) {
                    graphs.add(agent);
                }
                if (((Scape) agent).getSpace() instanceof Singleton) {
                    use.remove(agent);
                }
            }
            // Exchange order so that hosts always show up on bottom
            use.removeAll(hosts);
            use.addAll(0, hosts);
            // Exchange order so that graphs always show up on top
            use.removeAll(graphs);
            use.addAll(graphs.size(), graphs);
            return use;
        } else if (scape.getSpace() instanceof List) {
            return (List) scape.getSpace();
        }
        return new ArrayList(scape);
    }

    /**
     * @param parent
     * @return
     * @see org.eclipse.amp.axf.core.ICompositionProvider#isMutable(java.lang.Object)
     */
    public boolean isMutable(Object parent) {
        Scape scape = (Scape) parent;
        return scape.isMutable() || scape.getPeriod() < 1 && !scape.isRoot();
    }

    public Object getParent(Object member) {
        return ((Agent) member).getScape();
    }

    public boolean isChildrenComposition(Object parent) {
        return parent instanceof Scape && ((Scape) parent).getPrototypeAgent() instanceof Scape;
    }

    /**
     * @param member
     * @return
     * @see org.eclipse.amp.axf.core.ICompositionProvider#getChildrenClass(java.lang.Object)
     */
    public Class getChildrenClass(Object member) {
        Object object = member;
        if (object instanceof Scape) {
            Agent prototypeAgent = ((Scape) object).getPrototypeAgent();
            if (prototypeAgent != null) {
                return prototypeAgent.getClass();
            }
        }
        return Object.class;
    }

    public static AscapeModelProvider getDefault() {
        if (singleton == null) {
            singleton = new AscapeModelProvider();
        }
        return singleton;
    }

    /**
     * @param member
     * @return
     * @see org.eclipse.amp.axf.core.ICompositionProvider#isComposition(java.lang.Object)
     */
    public boolean isComposition(Object member) {
        return member instanceof Scape;
    }
}
