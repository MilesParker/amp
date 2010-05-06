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

package org.eclipse.amp.agf.gef;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.swt.graphics.Color;

/**
 * 
 * @author mparker
 *
 */
public class Shapes {

    public static final Dimension SIZE_FULL = new Dimension(AgentEditPart.SCALE, AgentEditPart.SCALE);
    public static final Dimension SIZE_INSET_1 = new Dimension(AgentEditPart.SCALE - 1, AgentEditPart.SCALE - 1);

    public static IFigureProvider EMPTY_PROVIDER = new DefaultFigureProvider() {
        public IFigure getFigure(Object object) {
            return new Figure();
        };
    };

    public static IFigureProvider OVAL_SHAPE_PROVIDER = new DefaultFigureProvider() {
        public IFigure getFigure(Object object) {
            return createOval();
        };
    };

    public static IFigureProvider RECTANGLE_SHAPE_PROVIDER = new DefaultFigureProvider() {
        public IFigure getFigure(Object object) {
            return createRectangle();
        };
    };

    public static IFigureProvider ROUNDED_RECTANGLE_SHAPE_PROVIDER = new DefaultFigureProvider() {
        public IFigure getFigure(Object object) {
            return createRoundedRectangle();
        };
    };

    public static IColorProvider DEFAULT_COLOR_PROVIDER = new IColorProvider() {

        public Color getForeground(Object element) {
            return ColorConstants.black;
        }

        public Color getBackground(Object element) {
            return ColorConstants.gray;
        }
    };

    private static void setupShared(Shape figure) {
        figure.setFill(true);
        figure.setOutline(true);
        figure.setLineWidth(1);
    }

    public static Shape createOval() {
        Shape figure = new Ellipse() {
            protected boolean useLocalCoordinates() {
                return true;
            }
        };
        setupShared(figure);
        figure.setSize(SIZE_INSET_1);
        return figure;
    }

    public static Shape createRoundedRectangle() {
        Shape figure = new RoundedRectangle() {
            protected boolean useLocalCoordinates() {
                return true;
            }
        };
        setupShared(figure);
        figure.setSize(SIZE_FULL);
        return figure;
    }

    public static Shape createRectangle() {
        Shape figure = new RectangleFigure() {
            protected boolean useLocalCoordinates() {
                return true;
            }
        };
        setupShared(figure);
        figure.setSize(SIZE_FULL);
        return figure;
    }

    public static Shape getMarkerShape(IFigure parent, int position) {
        Shape markerFigure;
        if (parent != null && parent.getChildren().size() >= position) {
            markerFigure = (Shape) parent.getChildren().get(position);
        } else {
            markerFigure = new Ellipse();
            markerFigure.setFill(false);
            markerFigure.setOutline(false);
            parent.add(markerFigure);
            markerFigure.setLocation(new Point(0, 0));
            markerFigure.setSize(new Dimension(AgentEditPart.SCALE / 4, AgentEditPart.SCALE / 4));
        }
        setupShared(markerFigure);
        return markerFigure;
    }

}
