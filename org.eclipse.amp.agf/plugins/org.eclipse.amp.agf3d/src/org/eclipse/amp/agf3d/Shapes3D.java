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

package org.eclipse.amp.agf3d;

import org.eclipse.amp.agf.gef.GenericEditPart;
import org.eclipse.draw3d.IFigure3D;
import org.eclipse.draw3d.geometry.IVector3f;
import org.eclipse.draw3d.geometry.Position3D;
import org.eclipse.draw3d.geometry.Position3DUtil;
import org.eclipse.draw3d.geometry.Vector3fImpl;
import org.eclipse.draw3d.shapes.CuboidFigureShape;
import org.eclipse.draw3d.shapes.CuboidShape;
import org.eclipse.draw3d.shapes.CylinderShape;
import org.eclipse.draw3d.shapes.CylindricFigureShape;
import org.eclipse.draw3d.shapes.PositionableShape;
import org.eclipse.draw3d.shapes.Shape;
import org.eclipse.draw3d.shapes.SphereFigureShape;

/**
 * 
 * @author mparker
 * 
 */
public class Shapes3D {

    private static final Vector3fImpl ORIGIN = new Vector3fImpl(0.0f, 0.0f, 0.0f);

    private static final Vector3fImpl FLAT_SIZE = new Vector3fImpl(GenericEditPart.SCALE, GenericEditPart.SCALE, 0.0f);

    private static final Vector3fImpl NINETYPCT_SIZE = new Vector3fImpl(GenericEditPart.SCALE * .9f,
                                                                        GenericEditPart.SCALE * .9f, GenericEditPart.SCALE * .9f);

    private static final Vector3fImpl DISC_SIZE = new Vector3fImpl(GenericEditPart.SCALE * .9f,
                                                                   GenericEditPart.SCALE * .9f, GenericEditPart.SCALE * .20f);

    private static final Vector3fImpl CYLINDER_SIZE = new Vector3fImpl(GenericEditPart.SCALE * .9f,
                                                                       GenericEditPart.SCALE * .9f, GenericEditPart.SCALE * .80f);

    private static final Vector3fImpl TWENTIETH_IN = new Vector3fImpl(GenericEditPart.SCALE * .05f,
                                                                      GenericEditPart.SCALE * .05f, 0);

    private static final Vector3fImpl EIGHTH_IN = new Vector3fImpl(GenericEditPart.SCALE * .125f,
                                                                   GenericEditPart.SCALE * .125f, 0);

    private static final Vector3fImpl THREE_EIGHTS_IN = new Vector3fImpl(GenericEditPart.SCALE * .375f,
                                                                         GenericEditPart.SCALE * .3755f, 0);

    private static final Vector3fImpl THREE_QUARTER_SIZE = new Vector3fImpl(GenericEditPart.SCALE * .75f,
                                                                            GenericEditPart.SCALE * .75f, GenericEditPart.SCALE * .75f);

    private static final Vector3fImpl FULL_SIZE = new Vector3fImpl(GenericEditPart.SCALE, GenericEditPart.SCALE,
                                                                   GenericEditPart.SCALE);

    private static final Vector3fImpl HALF_SIZE = new Vector3fImpl(GenericEditPart.SCALE * .5f,
                                                                   GenericEditPart.SCALE * .5f, GenericEditPart.SCALE * .5f);

    private static final Vector3fImpl QUARTER_SIZE = new Vector3fImpl(GenericEditPart.SCALE * .25f,
                                                                      GenericEditPart.SCALE * .25f, GenericEditPart.SCALE * .25f);

    public enum ShapeType {
        CUBE, TILE, SPHERE, CYLINDER
    };

    public static IShape3DProvider CUBE_SHAPE_PROVIDER = new IShape3DProvider() {
        public Shape getShape3D(Object object, IFigure3D figure) {
            return new CuboidFigureShape(figure, true);
        }

        public IVector3f getSize3D(Object object) {
            return THREE_QUARTER_SIZE;
        }

        public IVector3f getRelativeLocation3D(Object object) {
            return EIGHTH_IN;
        }
    };

    public static IShape3DProvider CYLINDER_SHAPE_PROVIDER = new IShape3DProvider() {
        public Shape getShape3D(Object object, IFigure3D figure) {
            return new CylindricFigureShape(figure, 30, 1.0f, true);
        }

        public IVector3f getSize3D(Object object) {
            return CYLINDER_SIZE;
        }

        public IVector3f getRelativeLocation3D(Object object) {
            // "checker"
            return TWENTIETH_IN;
        }
    };
    public static IShape3DProvider DISC_SHAPE_PROVIDER = new IShape3DProvider() {
        public Shape getShape3D(Object object, IFigure3D figure) {
            CylindricFigureShape cylindricFigureShape = new CylindricFigureShape(figure, 30, 1.0f, true);
            cylindricFigureShape.setFill(true);
            return cylindricFigureShape;
        }

        public IVector3f getSize3D(Object object) {
            return DISC_SIZE;
        }

        public IVector3f getRelativeLocation3D(Object object) {
            // "checker"
            return TWENTIETH_IN;
        }
    };
    public static IShape3DProvider SMALL_DISC_SHAPE_PROVIDER = new IShape3DProvider() {
        public Shape getShape3D(Object object, IFigure3D figure) {
            CylindricFigureShape cylindricFigureShape = new CylindricFigureShape(figure, 30, 1.0f, true);
            cylindricFigureShape.setFill(true);
            return cylindricFigureShape;
        }

        public IVector3f getSize3D(Object object) {
            return QUARTER_SIZE;
        }

        public IVector3f getRelativeLocation3D(Object object) {
            // "checker"
            return THREE_EIGHTS_IN;
        }
    };
    public static IShape3DProvider SPHERE_SHAPE_PROVIDER = new IShape3DProvider() {
        public Shape getShape3D(Object object, IFigure3D figure) {
            return new SphereFigureShape(figure, 3);
        }

        public IVector3f getSize3D(Object object) {
            return NINETYPCT_SIZE;
        }

        public IVector3f getRelativeLocation3D(Object object) {
            return TWENTIETH_IN;
        }
    };
    public static IShape3DProvider TILE_SHAPE_PROVIDER = new IShape3DProvider() {
        public Shape getShape3D(Object object, IFigure3D figure) {
            return new CuboidFigureShape(figure);
        }

        public IVector3f getSize3D(Object object) {
            return FLAT_SIZE;
        }

        public IVector3f getRelativeLocation3D(Object object) {
            return ORIGIN;
        }
    };
    public static IShape3DProvider HUMAN_SHAPE_PROVIDER = new IShape3DProvider() {
        public Shape getShape3D(Object object, IFigure3D figure) {
            CompositeRenderShape shape = new CompositeRenderShape(figure, object, null);

            float scale = 1.0f;

            float bodyWidth = 0.4f * scale;
            float bodyDepth = 0.3f * scale;
            float bodyHeight = 0.4f * scale;
            float legWidth = 0.1f * scale;
            float legHeight = 0.6f * scale;
            float headWidth = 0.3f * scale;
            float headHeight = 0.2f * scale;

            // legs
            shape.addShape(createCylinder(legHeight, new Vector3fImpl(legWidth, legWidth, legHeight), new Vector3fImpl(
                                                                                                                       0.5f - 1.5f * legWidth, 0.5f - .5f * legWidth, 0)));

            // legs
            shape.addShape(createCylinder(legHeight, new Vector3fImpl(legWidth, legWidth, legHeight), new Vector3fImpl(
                                                                                                                       0.5f + .5f * legWidth, 0.5f - .5f * legWidth, 0)));
            // body
            shape.addShape(createCube(bodyHeight + legHeight, new Vector3fImpl(bodyWidth, bodyDepth, bodyHeight),
                                      new Vector3fImpl((1.0f - bodyWidth) / 2.0f, (1.0f - bodyDepth) / 2.0f,
                                                       legHeight)));

            // head
            shape.addShape(createCylinder(headHeight, new Vector3fImpl(headWidth, headWidth, headHeight),
                                          new Vector3fImpl(0.5f - .5f * headWidth, 0.5f - .5f * headWidth,
                                                           (legHeight + bodyHeight))));
            return shape;
        }

        public IVector3f getSize3D(Object object) {
            return FULL_SIZE;
        }

        public IVector3f getRelativeLocation3D(Object object) {
            return ORIGIN;
        }
    };

    protected static PositionableShape createCylinder(float headHeight, IVector3f size, IVector3f location) {
        Position3D p3 = Position3DUtil.createAbsolutePosition();
        p3.setCenter3D(new Vector3fImpl(location.getX(), location.getY(), location.getZ()));
        p3.setSize3D(size);
        CylinderShape shape = new CylinderShape(p3, 30, 1.0f, true);
        shape.setFill(true);
        shape.setOutline(true);
        return shape;
    }

    protected static PositionableShape createCube(float headHeight, IVector3f size, IVector3f location) {
        Position3D p3 = Position3DUtil.createAbsolutePosition();
        p3.setCenter3D(new Vector3fImpl(location.getX(), location.getY(), location.getZ()));
        p3.setSize3D(size);
        CuboidShape shape = new CuboidShape(p3, true);
        shape.setFill(true);
        shape.setOutline(true);
        return shape;
    }

}
