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
import org.eclipse.draw3d.geometry.Vector3fImpl;
import org.eclipse.draw3d.shapes.CuboidFigureShape;
import org.eclipse.draw3d.shapes.CylindricFigureShape;
import org.eclipse.draw3d.shapes.Shape;
import org.eclipse.draw3d.shapes.SphereFigureShape;

/**
 * 
 * @author mparker
 * 
 */
public class Shapes3D {

    public enum ShapeType {
        CUBE, TILE, SPHERE, CYLINDER
    };

    public static IShape3DProvider CUBE_SHAPE_PROVIDER = new IShape3DProvider() {
        public Shape getShape3D(Object object, IFigure3D figure) {
            return new CuboidFigureShape(figure);
        }

        public IVector3f getSize3D(Object object) {
            return new Vector3fImpl(GenericEditPart.SCALE * .75f, GenericEditPart.SCALE * .75f,
                                    GenericEditPart.SCALE * .75f);
        }

        public IVector3f getRelativeLocation3D(Object object) {
            return new Vector3fImpl(GenericEditPart.SCALE * .125f, GenericEditPart.SCALE * .125f, 0);
        }
    };

    public static IShape3DProvider CYLINDER_SHAPE_PROVIDER = new IShape3DProvider() {
        public Shape getShape3D(Object object, IFigure3D figure) {
            return new CylindricFigureShape(figure, 30, 1.0f, false);
        }

        public IVector3f getSize3D(Object object) {
            return new Vector3fImpl(GenericEditPart.SCALE * .9f, GenericEditPart.SCALE * .9f,
                                    GenericEditPart.SCALE * .20f);
        }

        public IVector3f getRelativeLocation3D(Object object) {
            // "checker"
            return new Vector3fImpl(GenericEditPart.SCALE * .05f, GenericEditPart.SCALE * .05f, 0);
        }
    };
    public static IShape3DProvider SPHERE_SHAPE_PROVIDER = new IShape3DProvider() {
        public Shape getShape3D(Object object, IFigure3D figure) {
            return new SphereFigureShape(figure, 3);
        }

        public IVector3f getSize3D(Object object) {
            return new Vector3fImpl(GenericEditPart.SCALE * .9f, GenericEditPart.SCALE * .9f,
                                    GenericEditPart.SCALE * .9f);
        }

        public IVector3f getRelativeLocation3D(Object object) {
            return new Vector3fImpl(GenericEditPart.SCALE * .05f, GenericEditPart.SCALE * .05f, 0);
        }
    };
    public static IShape3DProvider TILE_SHAPE_PROVIDER = new IShape3DProvider() {
        public Shape getShape3D(Object object, IFigure3D figure) {
            return new CuboidFigureShape(figure);
        }

        public IVector3f getSize3D(Object object) {
            return new Vector3fImpl(GenericEditPart.SCALE, GenericEditPart.SCALE, 0.0f);
        }

        public IVector3f getRelativeLocation3D(Object object) {
            return new Vector3fImpl(0.0f, 0.0f, 0.0f);
        }
    };
}
