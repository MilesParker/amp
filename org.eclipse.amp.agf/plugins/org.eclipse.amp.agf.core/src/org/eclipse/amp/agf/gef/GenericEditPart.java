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

import org.eclipse.draw2d.Border;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gef.editpolicies.SelectionEditPolicy;

public abstract class GenericEditPart extends AbstractGraphicalEditPart implements PropertyChangeListener {

    public static final int SCALE = 20;
    protected ConnectionAnchor anchor;
    public static final Border HIGHLIGHT_RECTANGLE = new MarginBorder(2) {
        @Override
        public void paint(IFigure figure, Graphics graphics, Insets insets) {
            Rectangle r = Rectangle.SINGLETON;
            r.setBounds(figure.getBounds());
            r.shrink(1, 1);
            graphics.setLineWidth(figure.getBounds().width / 10);
            graphics.setForegroundColor(ColorConstants.black);
            graphics.setLineStyle(Graphics.LINE_SOLID);
            // graphics.setXORMode(false);
            graphics.drawRectangle(r);
            graphics.setLineStyle(Graphics.LINE_DASH);
            graphics.setForegroundColor(ColorConstants.yellow);
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
            graphics.setLineStyle(Graphics.LINE_DASH);
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

    /**
     * Construct the figure used to represent this agent. This method is intended to both create and update figures. If
     * a figure is passed in, this method should modify that figure as desired. If no figure is passed in, this method
     * should create that figure and then update it.
     * 
     * @param figure a figure to be built or null if the method is to create a figure
     * @return must return figure passed in if not null
     */
    protected IFigure buildFigure(IFigure figure) {
        return figure != null ? figure : Shapes.createRectangle();
    }

    protected IFigure createFigure() {
        Shape figure = Shapes.createRectangle();
        figure.setForegroundColor(ColorConstants.black);
        figure.setBackgroundColor(ColorConstants.gray);
        return figure;
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

    // /**
    // *
    // * @see org.eclipse.gef.editparts.AbstractGraphicalEditPart#refresh()
    // */
    // public void refresh() {
    // super.refresh();
    // refreshVisuals();
    // }

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