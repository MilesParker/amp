/*******************************************************************************
 * Copyright (c) 2009, Metascape LLC, Miles Parker.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Miles Parker - initial API and implementation
 ******************************************************************************/

package org.ascape.view.vis;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TooManyListenersException;

import org.ascape.model.Agent;
import org.ascape.model.CellOccupant;
import org.ascape.model.HostCell;
import org.ascape.model.LocatedAgent;
import org.ascape.model.event.ScapeEvent;
import org.eclipse.amp.escape.ascape.gef.GraphicsEditPart;
import org.eclipse.amp.escape.ascape.view.EditPartScapeView;
import org.eclipse.draw2d.AbstractLayout;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.FigureListener;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MouseEvent;
import org.eclipse.draw2d.MouseListener;
import org.eclipse.draw2d.SWTGraphics;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.EditPart;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

public class GraphicsView extends EditPartScapeView implements ISelectionProvider {

    private static final long serialVersionUID = 1L;

    public GraphicsView(String name) {
        super("org.eclipse.amp.escape.view.GraphicsView", null, name);
    }

    List<ISelectionChangedListener> selectionListeners = new ArrayList<ISelectionChangedListener>();

    ISelection currentSelection = StructuredSelection.EMPTY;
    Collection<LocatedAgent> selectedAgents;

    protected void updateScapeGraphics(Graphics graphics) {
    }

    public EditPart createEditPart(EditPart context, Object model) {
        return new GraphicsEditPart(this, model);
    }

    protected Image image;

    protected IFigure imageFigure;

    protected Graphics imageGraphics;

    /**
     * Size of each individual cell, typically in pixels. 6 by default.
     */
    protected int agentSize = 20;

    protected GC imageGC;

    public void createImageFigure() {
        imageFigure = new Figure() {
            public void paintFigure(Graphics graphics) {
                synchronized (this) {
                    if (image != null && !image.isDisposed()) {
                        graphics.drawImage(image, 0, 0);
                    }
                }
            }
        };

        imageFigure.setLayoutManager(new AbstractLayout() {
            public Dimension getMinimumSize(IFigure container, int hintWidth, int hintHeight) {
                if (getScape() != null) {
                    return getMinimumSizeWithin(new Dimension(hintWidth, hintHeight));
                }
                return new Dimension(500, 500);
            }

            protected Dimension calculatePreferredSize(IFigure container, int hintWidth, int hintHeight) {
                if (getScape() != null) {
                    return getPreferredSizeWithin(new Dimension(hintWidth, hintHeight));
                } else {
                    return new Dimension(500, 500);
                }
            }

            public void layout(IFigure container) {
                imageFigure.setLocation(new Point(0, 0));
            }
        });
        imageFigure.addFigureListener(new FigureListener() {
            public void figureMoved(IFigure source) {
                refresh();
            }
        });
        imageFigure.addMouseListener(new MouseListener() {

            public void mouseDoubleClicked(MouseEvent me) {
            }

            public void mousePressed(MouseEvent me) {
                LocatedAgent agentAtPixel = (LocatedAgent) getAgentAtPixel(me.getLocation().x, me.getLocation().y);
                if (agentAtPixel instanceof LocatedAgent) {
                    if (agentAtPixel instanceof HostCell && (me.getState() & MouseEvent.CONTROL) == 0) {
                        CellOccupant occupant = (CellOccupant) ((HostCell) agentAtPixel).getOccupant();
                        if (occupant != null) {
                            agentAtPixel = occupant;
                        }
                    }
                    if ((me.getState() & MouseEvent.SHIFT) > 0) {
                        if (!selectedAgents.contains(agentAtPixel)) {
                            selectedAgents.add(agentAtPixel);
                        } else {
                            selectedAgents.remove(agentAtPixel);
                        }
                    } else {
                        selectedAgents = new HashSet<LocatedAgent>();
                        selectedAgents.add(agentAtPixel);
                    }
                } else {
                    currentSelection = StructuredSelection.EMPTY;
                }
                currentSelection = new StructuredSelection(selectedAgents.toArray());
                setSelection(currentSelection);
                fireSelectionChanged();
                ((Display) getImage().getDevice()).syncExec(new Runnable() {
                    public void run() {
                        refresh();
                    };
                });
            }

            public void mouseReleased(MouseEvent me) {
            }
        });
    }

    public Agent getAgentAtPixel(int x, int y) {
        return null;
    }

    public void createImage() {
        Dimension size = getPreferredSizeWithin(imageFigure.getSize());
        if (size.width <= 0 || size.height <= 0) {
            size = new Dimension(1, 1);
        }
        if (image == null || image.getBounds().width != size.width || image.getBounds().height != size.height) {
            if (image != null) {
                // Need to release prior resources..
                if (!image.isDisposed()) {
                    image.dispose();
                    imageGC.dispose();
                    imageGraphics.dispose();
                }
            }
            // System.out.println("New: " + imageFigure.getSize());
            // System.out.println("OPld:" + image.getBounds());
            image = new Image(Display.getCurrent(), new org.eclipse.swt.graphics.Rectangle(0, 0, size.width,
                                                                                           size.height));
            imageGC = new GC(image);
            imageGraphics = new SWTGraphics(imageGC);
        }
    }

    public void refresh() {
        createImage();
        updateScapeGraphics(imageGraphics);
        if (getSelection() != null) {
            StructuredSelection sel = (StructuredSelection) getSelection();
            Iterator iter = sel.iterator();
            while (iter.hasNext()) {
                LocatedAgent agent = (LocatedAgent) iter.next();
                if (!agent.isDelete()) {
                    drawSelectedAgent(imageGraphics, agent);
                }
            }
        }
        imageFigure.repaint();
    }

    protected void drawSelectedAgent(Graphics graphics, LocatedAgent a) {
    }

    public void scapeAdded(ScapeEvent scapeEvent) throws TooManyListenersException {
        super.scapeAdded(scapeEvent);
        createFeatures();
    }

    /**
     * @param scapeEvent
     * @see org.ascape.model.event.DefaultScapeListener#scapeIterated(org.ascape.model.event.ScapeEvent)
     */
    public void scapeIterated(ScapeEvent scapeEvent) {
        super.scapeIterated(scapeEvent);

    }

    /**
     * 
     */
    public void createFeatures() {

    }

    public Dimension getSize() {
        return new Dimension(image.getBounds().width, image.getBounds().height);
    }

    public Dimension getPreferredSizeWithin(Dimension d) {
        return new Dimension(d.width < 1 ? 500 : d.width, d.height < 1 ? 500 : d.height);
    }

    public Dimension getMinimumSizeWithin(Dimension d) {
        return new Dimension(1, 1);
    }

    public Image getImage() {
        return image;
    }

    /**
     * @return the imageFigure
     */
    public IFigure getImageFigure() {
        return imageFigure;
    }

    /**
     * @param listener
     * @see org.eclipse.jface.viewers.ISelectionProvider#addSelectionChangedListener(org.eclipse.jface.viewers.ISelectionChangedListener)
     */
    public void addSelectionChangedListener(ISelectionChangedListener listener) {
        selectionListeners.add(listener);
    }

    /**
     * @return
     * @see org.eclipse.jface.viewers.ISelectionProvider#getSelection()
     */
    public ISelection getSelection() {
        return currentSelection;
    }

    /**
     * @param listener
     * @see org.eclipse.jface.viewers.ISelectionProvider#removeSelectionChangedListener(org.eclipse.jface.viewers.ISelectionChangedListener)
     */
    public void removeSelectionChangedListener(ISelectionChangedListener listener) {
        selectionListeners.remove(listener);
    }

    void fireSelectionChanged() {
        for (ISelectionChangedListener listener : selectionListeners) {
            listener.selectionChanged(new SelectionChangedEvent(this, currentSelection));
        }
    }

    /**
     * @param selection
     * @see org.eclipse.jface.viewers.ISelectionProvider#setSelection(org.eclipse.jface.viewers.ISelection)
     */
    public void setSelection(ISelection selection) {
        currentSelection = selection;
    }
}