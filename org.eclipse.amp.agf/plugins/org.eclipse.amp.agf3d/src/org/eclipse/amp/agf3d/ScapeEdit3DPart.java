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

import java.util.HashMap;
import java.util.Map;

import org.eclipse.amp.agf.gef.AgentEditPart;
import org.eclipse.amp.agf.gef.GenericEditPart;
import org.eclipse.amp.agf.gef.IExtentProvider;
import org.eclipse.amp.agf.gef.IGraphProvider;
import org.eclipse.amp.agf.gef.ILocation;
import org.eclipse.amp.agf.gef.ILocationProvider;
import org.eclipse.amp.agf.gef.ScapeEditPart;
import org.eclipse.amp.axf.core.ICompositionProvider;
import org.eclipse.amp.axf.core.IModel;
import org.eclipse.amp.axf.view.SWTAsyncModelListener;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw3d.Figure3D;
import org.eclipse.draw3d.FigureSurface;
import org.eclipse.draw3d.IFigure3D;
import org.eclipse.draw3d.ISurface;
import org.eclipse.draw3d.PickingUpdateManager3D;
import org.eclipse.draw3d.ShapeFigure3D;
import org.eclipse.draw3d.SurfaceLayout;
import org.eclipse.draw3d.camera.ICamera;
import org.eclipse.draw3d.geometry.IVector3f;
import org.eclipse.draw3d.geometry.Math3DVector3f;
import org.eclipse.draw3d.geometry.Vector3f;
import org.eclipse.draw3d.geometry.Vector3fImpl;
import org.eclipse.draw3d.shapes.CuboidFigureShape;
import org.eclipse.draw3d.shapes.Shape;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef3d.ui.parts.GraphicalViewer3D;
import org.eclipse.jface.viewers.IFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;

public class ScapeEdit3DPart extends ScapeEditPart {

    /**
     * 
     * @author mparker
     *
     */
    private class ScapeAreaFigure extends ShapeFigure3D {
        private ISurface m_surface = new FigureSurface(this);

        public ScapeAreaFigure() {
            setLayoutManager(new SurfaceLayout());
            // SurfaceLayout.setDelegate(this, new FreeformLayout());
            getPosition3D().setLocation3D(IVector3f.NULLVEC3f);
            getPosition3D().setSize3D(new Vector3fImpl(400, 300, 20));
            // getPosition3D().setLocation3D(new Vector3fImpl(0, 0, 0));
            setBackgroundColor(ColorConstants.white);
            setAlpha((byte) 0x44);
        }

        @Override
        public ISurface getSurface() {
            return m_surface;
        }


        /**
         * @return
         * @see org.eclipse.draw3d.ShapeFigure3D#createShape()
         */
        protected Shape createShape() {
            return new CuboidFigureShape(this);
        }
    }

    private final class RenderUpdateListener extends SWTAsyncModelListener {
        private final Figure figure;
        private boolean firstTime = true;

        private RenderUpdateListener(String name, Figure figure) {
            super(null, name);
            this.figure = figure;
        }

        public void update(IModel model) {
            figure.invalidateTree();
            if (firstTime) {
                animateCamera = false;
                // moveCameraHelicopter();
                animateCamera = true;
                firstTime = false;
            }
            for (animationStep = 0; animationStep < animationStepCount; animationStep++) {
                refresh();
                ((PickingUpdateManager3D) figure.getUpdateManager()).performUpdate();
                ((PickingUpdateManager3D) figure.getUpdateManager()).getCanvas().redraw();
            }
            animationStep = 0;
        }
    }

    public ScapeEdit3DPart(ICompositionProvider memberProvider, ILocationProvider locationProvider,
            IExtentProvider extentProvider, IGraphProvider graphProvider, IFilter filter) {
        super(memberProvider, locationProvider, extentProvider, graphProvider, filter);
    }


    /**
     * 
     * @see org.eclipse.amp.agf.gef.ScapeEditPart#refreshChildren()
     */
    protected synchronized void refreshChildren() {

        // super.refreshChildren();
    }

    int animationStep;

    int animationStepCount = 1;

    boolean animateCamera = true;

    boolean cancelCamera;

    protected IFigure createFigure() {
        final Figure3D figure = new ScapeAreaFigure();
        if (getMemberProvider().getParent(getModel()) == null) {
            renderListener = new RenderUpdateListener("Update Root Figure", figure);
            renderListener.setWaitForUpdate(true);
            ((IModel) getModel()).addModelListener(renderListener);
        }
        figure.setForegroundColor(Display.getCurrent().getSystemColor(SWT.COLOR_CYAN));
        figure.setBackgroundColor(Display.getCurrent().getSystemColor(SWT.COLOR_RED));
        Dimension size = calculateDimension();
        ((IFigure3D) getFigure()).getPosition3D().setSize3D(new Vector3fImpl(size.width, size.height, 1.0f));
        return figure;
    }

    Map<Object, IVector3f> startPoints = new HashMap<Object, IVector3f>();
    Map<Object, Vector3f> addPoints = new HashMap<Object, Vector3f>();

    private RenderUpdateListener renderListener;

    @Override
    protected void calculateConstraints(GraphicalEditPart editPart) {
        Object agent = editPart.getModel();
        ILocation location = getLocationProvider().getLocation(agent);
        if (location != null) {
            IFigure3D agentFigure = (IFigure3D) editPart.getFigure();
            IVector3f endPoint = new Vector3fImpl((float) GenericEditPart.SCALE * location.getX(),
                                                  (float) GenericEditPart.SCALE * location.getY(), -GenericEditPart.SCALE);
            if (animationStepCount > 1 && getModel() != null && ((IModel) getModel()).getPeriod() > 0) {
                IVector3f startPoint;
                Vector3f addPoint;
                if (animationStep == 0) {
                    startPoint = agentFigure.getPosition3D().getLocation3D();
                    startPoints.put(agent, startPoint);
                    addPoint = new Vector3fImpl();
                    calculateDelta(startPoint, endPoint, addPoint, animationStepCount);
                    addPoints.put(agent, addPoint);
                } else {
                    startPoint = startPoints.get(agent);
                    addPoint = addPoints.get(agent);
                }
                Vector3f intermediatePoint = new Vector3fImpl();
                IVector3f currentPoint = agentFigure.getPosition3D().getLocation3D();
                Math3DVector3f.add(currentPoint, addPoint, intermediatePoint);
                agentFigure.getPosition3D().setLocation3D(intermediatePoint);

            } else {
                agentFigure.getPosition3D().setLocation3D(endPoint);
            }
        }
    }


    private void calculateDelta(IVector3f startPoint, IVector3f endPoint, Vector3f addPoint, int steps) {
        Math3DVector3f.sub(endPoint, startPoint, addPoint);
        Math3DVector3f.scale(1.0f / steps, addPoint, addPoint);
    }

    public void deactivate() {
        cancelCamera = true;
        super.deactivate();
        if (renderListener != null) {
            ((IModel) getModel()).removeModelListener(renderListener);
        }
    }

    public void moveCameraHelicopter() {
        moveCameraScaled(0.5f, -0.5f, .15f, 0.5f, 0.5f, 0.0f);
    }

    public void moveCameraOverhead() {
        moveCameraScaled(0.5f, 0.5f, 2.0f, 0.5f, 0.5f, 0.0f);
    }

    public void moveCameraFirstPerson() {
        moveCameraScaled(0.5f, 0f, .02f, 0.5f, 1.0f, 0.0f);
    }

    private void moveCameraScaled(float locX, float locY, float locZ, float targetX, float targetY, float targetZ) {
        ILocation extent = getExtentProvider().getExtent(getModel());
        float ex = extent.getX() * AgentEditPart.SCALE;
        float ey = extent.getY() * AgentEditPart.SCALE;
        moveCamera(new Vector3fImpl(ex * locX, ey * locY, ey * locZ), new Vector3fImpl(ex * targetX, ey * targetY, ey
                                                                                       * targetZ));
    }

    private void moveCamera(final IVector3f endPoint, final IVector3f endLookPoint) {
        if (animateCamera) {
            new Thread() {
                public void run() {
                    cancelCamera = true;
                    moveCameraAnimate(endPoint, endLookPoint);
                }
            }.start();
        } else {
            final ICamera camera = getCamera();
            camera.moveTo(endPoint.getX(), endPoint.getY(), endPoint.getZ());
            camera.lookAt(endLookPoint, new Vector3fImpl(0, -0, 1));
        }
    }

    private void moveCameraAnimate(final IVector3f endPoint, final IVector3f endLookPoint) {
        final ICamera camera = getCamera();
        cancelCamera = false;
        int moveCount = 50;
        final Vector3f startPoint = new Vector3fImpl();
        camera.getPosition(startPoint);
        Vector3f addPoint = new Vector3fImpl();
        calculateDelta(startPoint, endPoint, addPoint, moveCount);

        if (!cancelCamera) {
            for (int i = 0; i < moveCount - 1; i++) {
                Math3DVector3f.add(startPoint, addPoint, startPoint);
                moveToNow(startPoint);
                if (cancelCamera) {
                    return;
                }
            }
            // moveToNow((Vector3f) endPoint);
        }
        final Vector3fImpl upVector = new Vector3fImpl(0, 0, 1);
        final Vector3f currentLookPoint = new Vector3fImpl();
        camera.getViewDirection(currentLookPoint);
        Math3DVector3f.add(currentLookPoint, endPoint, currentLookPoint);
        Vector3f addLookPoint = new Vector3fImpl();
        calculateDelta(currentLookPoint, endLookPoint, addLookPoint, moveCount);
        if (!cancelCamera) {
            for (int i = 0; i < moveCount - 1; i++) {
                Math3DVector3f.add(currentLookPoint, addLookPoint, currentLookPoint);
                Display.getDefault().syncExec(new Runnable() {
                    public void run() {
                        camera.lookAt(currentLookPoint, upVector);
                    }
                });
                if (cancelCamera) {
                    return;
                }
            }
            // Display.getDefault().syncExec(new Runnable() {
            // public void run() {
            // // Take care of any small deltas
            // // camera.lookAt(endLookPoint, upVector);
            // }
            // });
        }
    }
    private void moveToNow(final Vector3f movePoint) {
        Display.getDefault().syncExec(new Runnable() {
            public void run() {
                getCamera().moveTo(movePoint.getX(), movePoint.getY(), movePoint.getZ());
            }
        });
    }

    private ICamera getCamera() {
        final ICamera camera = ((GraphicalViewer3D) getViewer()).getLightweightSystem3D().getCamera();
        return camera;
    }

    public boolean isAnimateCamera() {
        return animateCamera;
    }

    public void setAnimateCamera(boolean animateCamera) {
        this.animateCamera = animateCamera;
    }
}
