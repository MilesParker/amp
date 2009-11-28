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

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.draw2d.Border;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gef.editpolicies.SelectionEditPolicy;
import org.eclipse.ui.statushandlers.StatusManager;

public abstract class GenericEditPart extends AbstractGraphicalEditPart implements PropertyChangeListener {

    public static final int SCALE = 20;
    public static final Dimension SIZE_FULL = new Dimension(AgentEditPart.SCALE, AgentEditPart.SCALE);
    public static final Dimension SIZE_INSET_1 = new Dimension(AgentEditPart.SCALE - 1, AgentEditPart.SCALE - 1);
    protected ConnectionAnchor anchor;
    public static final Border HIGHLIGHT_RECTANGLE = new MarginBorder(2) {
        @Override
        public void paint(IFigure figure, Graphics graphics, Insets insets) {
            Rectangle r = new Rectangle(new Point(0, 0), SIZE_INSET_1);
            graphics.setLineWidth(2);
            graphics.setForegroundColor(ColorConstants.yellow);
            graphics.setLineStyle(Graphics.LINE_SOLID);
            // graphics.setXORMode(false);
            graphics.drawRectangle(r);
            graphics.setLineStyle(Graphics.LINE_DASH);
            graphics.setForegroundColor(ColorConstants.black);
            graphics.drawRectangle(r);
        }
    };
    public static final Border HIGHLIGHT_ELLIPSE = new MarginBorder(2) {
        @Override
        public void paint(IFigure figure, Graphics graphics, Insets insets) {
            graphics.setLineWidth(2);
            graphics.setLineStyle(Graphics.LINE_SOLID);
            graphics.setXORMode(false);
            Rectangle r = Rectangle.SINGLETON;
            r.setBounds(figure.getBounds());
            graphics.setForegroundColor(ColorConstants.black);
            graphics.drawOval(r);
            r.shrink(1, 1);
            graphics.setForegroundColor(ColorConstants.yellow);
            graphics.drawOval(r);
        }
    };
    protected static Set<Class> noFigureWarning = new HashSet<Class>();

    /**
     * Upon activation, attach to the model element as a property change listener.
     */
    public void activate() {
        if (!isActive()) {
            super.activate();
        }
    }

    public GenericEditPart() {
        super();
    }

    /**
     * Construct the figure used to represent this agent. This method is intended to both create and update figures. If
     * a figure is passed in, this method should modify that figure as desired. If no figure is passed in, this method
     * should create that figure and then update it.
     * 
     * @param figure a figure to be built or null if the method is to create a figure
     * @return must return figure passed in if not null
     */
    protected IFigure buildFigure(IFigure figure) {
        return figure != null ? figure : shapeRectangle();
    }

    protected IFigure createFigure() {
        IFigure buildFigure = buildFigure(null);
        if (buildFigure == null) {
            if (!noFigureWarning.contains(getClass())) {
                StatusManager
                        .getManager()
                        .handle(
                                new Status(
                                    IStatus.WARNING,
                                    "org.eclipse.amp.escape.core",
                                    "No figure created by: "
                                        + getClass()
                                        + ". This is normal if the style does not always produce a figure, but you may want to check the #buildFigure implementation."));
                noFigureWarning.add(getClass());
            }
            buildFigure = shapeRectangle();
        }
        return buildFigure;
    }

    protected void updateSelection() {
        if (getSelected() == SELECTED_NONE) {
            if (getFigure().getBorder() != null) {
                getFigure().setBorder(null);
                getFigure().repaint();
            }
        } else {
            if (getFigure() instanceof Ellipse) {
                getFigure().setBorder(HIGHLIGHT_ELLIPSE);
            } else if (getFigure() instanceof RoundedRectangle) {
                getFigure().setBorder(HIGHLIGHT_RECTANGLE);
            } else {
                getFigure().setBorder(HIGHLIGHT_RECTANGLE);
            }
            getFigure().repaint();
        }
    }

    /**
     * 
     * @see org.eclipse.gef.editparts.AbstractGraphicalEditPart#refresh()
     */
    public void refresh() {
        refreshVisuals();
    }

    protected void refreshVisuals() {
        setFigure(buildFigure(getFigure()));
        updateSelection();
    }

    public void deactivate() {
        if (isActive()) {
            super.deactivate();
        }
    }

    private void setupShared(Shape figure) {
        figure.setFill(true);
        figure.setOutline(true);
        figure.setLineWidth(1);
    }

    protected Shape shapeOval() {
        Shape figure = new Ellipse() {
            protected boolean useLocalCoordinates() {
                return true;
            }
        };
        setupShared(figure);
        figure.setSize(SIZE_INSET_1);
        return figure;
    }

    protected Shape shapeRoundedRect() {
        Shape figure = new RoundedRectangle() {
            protected boolean useLocalCoordinates() {
                return true;
            }
        };
        setupShared(figure);
        figure.setSize(SIZE_FULL);
        return figure;
    }

    protected Shape shapeRectangle() {
        Shape figure = new RectangleFigure() {
            protected boolean useLocalCoordinates() {
                return true;
            }
        };
        setupShared(figure);
        figure.setSize(SIZE_FULL);
        return figure;
    }

    protected Shape shapeMarker() {
        Shape markerFigure;
        if (figure != null && figure.getChildren().size() > 0) {
            markerFigure = (Shape) figure.getChildren().get(0);
        } else {
            // This figure has only a marker
            if (figure == null) {
                setFigure(shapeRectangle());
            }
            markerFigure = new Ellipse();
            markerFigure.setFill(false);
            markerFigure.setOutline(false);
            getFigure().add(markerFigure);
            markerFigure.setLocation(new Point(0, 0));
            markerFigure.setSize(new Dimension(AgentEditPart.SCALE / 4, AgentEditPart.SCALE / 4));
        }
        setupShared(markerFigure);
        return markerFigure;
    }

    protected Shape shapeMarker2() {
        Shape markerFigure;
        if (figure != null && figure.getChildren().size() > 0) {
            markerFigure = (Shape) figure.getChildren().get(0);
        } else {
            // This figure has only a marker
            if (figure == null) {
                setFigure(shapeRectangle());
            }
            markerFigure = new Ellipse();
            markerFigure.setFill(false);
            markerFigure.setOutline(false);
            getFigure().add(markerFigure);
            markerFigure.setLocation(new Point(0, AgentEditPart.SCALE / 2));
            markerFigure.setSize(new Dimension(AgentEditPart.SCALE / 4, AgentEditPart.SCALE / 4));
        }
        setupShared(markerFigure);
        return markerFigure;
    }

    protected Shape shapeMarker3() {
        Shape markerFigure;
        if (figure != null && figure.getChildren().size() > 0) {
            markerFigure = (Shape) figure.getChildren().get(0);
        } else {
            // This figure has only a marker
            if (figure == null) {
                setFigure(shapeRectangle());
            }
            markerFigure = new Ellipse();
            markerFigure.setFill(false);
            markerFigure.setOutline(false);
            getFigure().add(markerFigure);
            markerFigure.setLocation(new Point(AgentEditPart.SCALE / 2, 0));
            markerFigure.setSize(new Dimension(AgentEditPart.SCALE / 4, AgentEditPart.SCALE / 4));
        }
        setupShared(markerFigure);
        return markerFigure;
    }

    protected Shape shapeMarker4() {
        Shape markerFigure;
        if (figure != null && figure.getChildren().size() > 0) {
            markerFigure = (Shape) figure.getChildren().get(0);
        } else {
            // This figure has only a marker
            if (figure == null) {
                setFigure(shapeRectangle());
            }
            markerFigure = new Ellipse();
            markerFigure.setFill(false);
            markerFigure.setOutline(false);
            getFigure().add(markerFigure);
            markerFigure.setLocation(new Point(AgentEditPart.SCALE / 2, AgentEditPart.SCALE / 2));
            markerFigure.setSize(new Dimension(AgentEditPart.SCALE / 4, AgentEditPart.SCALE / 4));
        }
        setupShared(markerFigure);
        return markerFigure;
    }

    protected void createEditPolicies() {
        installEditPolicy(EditPolicy.SELECTION_FEEDBACK_ROLE, new SelectionEditPolicy() {

            @Override
            protected void setSelectedState(int type) {
                super.setSelectedState(type);
                updateSelection();
            }

            @Override
            protected void hideSelection() {
            }

            @Override
            protected void showSelection() {
            }
        });
    }

    public void propertyChange(PropertyChangeEvent evt) {
        updateSelection();
    }
}