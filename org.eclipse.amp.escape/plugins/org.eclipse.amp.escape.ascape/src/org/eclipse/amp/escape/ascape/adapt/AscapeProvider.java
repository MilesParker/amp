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

import org.ascape.model.Agent;
import org.ascape.model.AscapeObject;
import org.ascape.model.CellOccupant;
import org.ascape.model.HostCell;
import org.ascape.model.LocatedAgent;
import org.ascape.model.Scape;
import org.ascape.model.space.Array2D;
import org.ascape.model.space.Coordinate;
import org.ascape.model.space.Coordinate2DDiscrete;
import org.ascape.model.space.Graph;
import org.ascape.model.space.Node;
import org.ascape.model.space.Singleton;
import org.eclipse.amp.agf.gef.IExtentProvider;
import org.eclipse.amp.agf.gef.IGraphProvider;
import org.eclipse.amp.agf.gef.ILocation;
import org.eclipse.amp.agf.gef.ILocationProvider;
import org.eclipse.amp.axf.core.ICompositionProvider;
import org.eclipse.amp.escape.ascape.wrap.ScapeWrapperModel;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;

// TODO: Auto-generated Javadoc
/**
 * The Class AscapeProvider.
 */
public class AscapeProvider implements ILocationProvider, IExtentProvider, IGraphProvider, ILabelProvider,
ICompositionProvider {

    /**
     * The Class Location.
     */
    class Location implements ILocation {
        int x;
        int y;

        /**
         * Instantiates a new location.
         * 
         * @param x the x
         * @param y the y
         */
        public Location(int x, int y) {
            super();
            this.x = x;
            this.y = y;
        }

        /**
         * @return
         * @see org.eclipse.amp.agf.gef.ILocation#getX()
         */
        public int getX() {
            return x;
        }

        /**
         * @return
         * @see org.eclipse.amp.agf.gef.ILocation#getY()
         */
        public int getY() {
            return y;
        }
    }

    /**
     * @param element
     * @return
     * @see org.eclipse.jface.viewers.ILabelProvider#getText(java.lang.Object)
     */
    public String getText(Object element) {
        if (element instanceof ScapeWrapperModel) {
            return getText(((ScapeWrapperModel) element).getScape());
        }
        if (element instanceof AscapeObject) {
            return ((AscapeObject) element).getName();

        }
        return null;
    }

    /**
     * @param element
     * @return
     * @see org.eclipse.jface.viewers.ILabelProvider#getImage(java.lang.Object)
     */
    public Image getImage(Object element) {
        return null;
        // if (element instanceof ScapeWrapperModelListener) {
        // return super.getImage(((ScapeWrapperModelListener) element).getWrapped());
        // }
        // throw new RuntimeException("Unexpected input for Scape Label Provider: " + element);
    }

    /**
     * @param located
     * @return
     * @see org.eclipse.amp.agf.gef.ILocationProvider#getLocation(java.lang.Object)
     */
    public ILocation getLocation(Object located) {
        LocatedAgent agent = (LocatedAgent) located;
        Coordinate coor = null;
        if (agent instanceof CellOccupant && ((CellOccupant) agent).getHostCell() != null) {
            coor = ((CellOccupant) agent).getHostCell().getCoordinate();
        } else {
            coor = agent.getCoordinate();
        }
        if (coor instanceof Coordinate2DDiscrete) {
            Coordinate2DDiscrete coor2D = (Coordinate2DDiscrete) coor;
            return new Location(coor2D.getXValue(), coor2D.getYValue());
        }
        return null;
    }

    /**
     * @param located
     * @return
     * @see org.eclipse.amp.agf.gef.IExtentProvider#getExtent(java.lang.Object)
     */
    public ILocation getExtent(Object located) {
        final Array2D array2D = getArray2D((Scape) getUnwrapped(located));
        if (array2D != null) {
            return new ILocation() {
                public int getX() {
                    return ((Coordinate2DDiscrete) array2D.getExtent()).getXValue();
                }

                public int getY() {
                    return ((Coordinate2DDiscrete) array2D.getExtent()).getYValue();
                }
            };
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
    public Array2D getArray2D(Scape scape) {
        if (scape.getSpace() instanceof Array2D) {
            return (Array2D) scape.getSpace();
        } else {
            if (scape.getPrototypeAgent() instanceof Scape) {
                for (Object subScape : scape) {
                    return getArray2D((Scape) subScape);
                }
            }
        }
        return null;
    }

    /**
     * @param graph
     * @return
     * @see org.eclipse.amp.agf.gef.IGraphProvider#getAdjacencyMap(java.lang.Object)
     */
    public HashMap getAdjacencyMap(Object scape) {
        return ((Graph) ((Scape) scape).getSpace()).getAdjacencyMap();
    }

    /**
     * @param graph
     * @param source
     * @return
     * @see org.eclipse.amp.agf.gef.IGraphProvider#getNeighborsFor(java.lang.Object, java.lang.Object)
     */
    public List getNeighborsFor(Object scape, Object source) {
        return ((Graph) ((Scape) scape).getSpace()).getNeighborsFor((Node) source);
    }

    /**
     * @param graph
     * @return
     * @see org.eclipse.amp.agf.gef.IGraphProvider#isGraph(java.lang.Object)
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
        return (Scape) getUnwrapped(object);
    }

    /**
     * @param parent
     * @return
     * @see org.eclipse.amp.axf.core.ICompositionProvider#getList(java.lang.Object)
     */
    @SuppressWarnings("unchecked")
    public List getList(Object parent) {
        Scape scape = (Scape) getUnwrapped(parent);
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
        Scape scape = (Scape) getUnwrapped(parent);
        return scape.getSpace().isMutable() && !scape.isRoot();
    }

    public Object getParent(Object member) {
        return ((Agent) getUnwrapped(member)).getScape();
    }

    public boolean isChildrenComposition(Object parent) {
        return parent instanceof Scape && ((Scape) parent).getPrototypeAgent() instanceof Scape;
    }

    /**
     * @param listener
     * @see org.eclipse.jface.viewers.IBaseLabelProvider#addListener(org.eclipse.jface.viewers.ILabelProviderListener)
     */
    public void addListener(ILabelProviderListener listener) {
    }

    /**
     * 
     * @see org.eclipse.jface.viewers.IBaseLabelProvider#dispose()
     */
    public void dispose() {
    }

    /**
     * @param element
     * @param property
     * @return
     * @see org.eclipse.jface.viewers.IBaseLabelProvider#isLabelProperty(java.lang.Object, java.lang.String)
     */
    public boolean isLabelProperty(Object element, String property) {
        return false;
    }

    /**
     * @param listener
     * @see org.eclipse.jface.viewers.IBaseLabelProvider#removeListener(org.eclipse.jface.viewers.ILabelProviderListener)
     */
    public void removeListener(ILabelProviderListener listener) {
    }

    public Object getUnwrapped(Object object) {
        if (object instanceof ScapeWrapperModel) {
            return ((ScapeWrapperModel) object).getScape();
        }
        return object;
    }
}
