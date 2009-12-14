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

import java.util.TooManyListenersException;

import org.ascape.model.event.ScapeEvent;
import org.eclipse.draw2d.AbstractLayout;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.FigureListener;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.SWTGraphics;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.EditPart;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

public class GraphicsView extends EditPartScapeView {

    private static final long serialVersionUID = 1L;

    public GraphicsView(String name) {
        super("org.eclipse.amp.escape.view.GraphicsView", null, name);
    }

    protected void updateScapeGraphics(Graphics graphics) {
    }

    public EditPart createEditPart(EditPart context, Object model) {
        return new GraphicsEditPart(this, model);
    }

    protected Image image;

    IFigure imageFigure;

    /**
     * Size of each individual cell, typically in pixels. 6 by default.
     */
    protected int agentSize = 20;

    protected GC imageGC;

    Graphics imageGraphics;

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
        imageFigure.repaint();
    }


    public void scapeAdded(ScapeEvent scapeEvent) throws TooManyListenersException {
        super.scapeAdded(scapeEvent);
        createFeatures();
    }

    /**
     * 
     */
    protected void createFeatures() {

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
}