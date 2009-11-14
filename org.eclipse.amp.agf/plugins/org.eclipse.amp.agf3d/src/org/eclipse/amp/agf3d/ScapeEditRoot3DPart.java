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

import org.eclipse.amp.agf.gef.AgentEditPart;
import org.eclipse.amp.axf.core.ICompositionProvider;
import org.eclipse.amp.axf.core.IModel;
import org.eclipse.amp.axf.space.IGraphProvider;
import org.eclipse.amp.axf.space.ILocation;
import org.eclipse.amp.axf.space.ILocationProvider;
import org.eclipse.amp.axf.view.SWTAsyncModelListener;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw3d.Figure3D;
import org.eclipse.draw3d.FigureSurface;
import org.eclipse.draw3d.IFigure3D;
import org.eclipse.draw3d.ISceneListener;
import org.eclipse.draw3d.ISurface;
import org.eclipse.draw3d.RenderContext;
import org.eclipse.draw3d.SurfaceLayout;
import org.eclipse.draw3d.camera.ICamera;
import org.eclipse.draw3d.geometry.IVector3f;
import org.eclipse.draw3d.geometry.Math3DVector3f;
import org.eclipse.draw3d.geometry.Vector3f;
import org.eclipse.draw3d.geometry.Vector3fImpl;
import org.eclipse.gef3d.ui.parts.GraphicalViewer3D;
import org.eclipse.jface.viewers.IFilter;
import org.eclipse.swt.widgets.Display;

/**
 * 
 * @author mparker
 * 
 */
public class ScapeEditRoot3DPart extends ScapeEdit3DPart {

    private final class RenderUpdateListener extends SWTAsyncModelListener {

        private boolean firstTime = true;

        private RenderUpdateListener(String name) {
            super(getRoot().getViewer().getControl(), name);
        }

        public synchronized void update(IModel model) {
            beginPainting();
            if (firstTime) {
                animateCamera = false;
                moveCameraHelicopter();
                animateCamera = true;
                firstTime = false;
            }
            for (animationStep = 0; animationStep < animationStepCount; animationStep++) {
                refresh();
                ((GraphicalViewer3D) getRoot().getViewer()).getLightweightSystem3D().render(true);
            }
        }
    }

    int animationStep;

    int animationStepCount = 7;

    boolean animateCamera = true;

    boolean cancelCamera;

    private RenderUpdateListener renderListener;

    public ScapeEditRoot3DPart(ICompositionProvider memberProvider, ILocationProvider locationProvider,
            IGraphProvider graphProvider, IFilter filter) {
        super(memberProvider, locationProvider, graphProvider, filter);
    }

    /**
     * @return
     * @see org.eclipse.amp.agf3d.ScapeEdit3DPart#createFigure()
     */
    protected IFigure createFigure() {
        figure = new Figure3D() {
            private ISurface m_surface = new FigureSurface(this);

            @Override
            public ISurface getSurface() {
                return m_surface;
            }

        };
        SurfaceLayout.setDelegate((IFigure3D) figure, new FreeformLayout());
        return figure;
    }

    /**
     * 
     * @see org.eclipse.amp.agf.gef.ScapeEditPart#addNotify()
     */
    public void addNotify() {
        super.addNotify();
        renderListener = new RenderUpdateListener("Update Root Figure");
        renderListener.setWaitForUpdate(true);
        ((IModel) getModel()).addModelListener(renderListener);
        ((GraphicalViewer3D) getRoot().getViewer()).getLightweightSystem3D().addSceneListener(new ISceneListener() {

            public void renderPassStarted(RenderContext renderContext) {
            }

            public void renderPassFinished(RenderContext renderContext) {
                if (animationStep == animationStepCount) {
                    renderListener.endPainting();
                }
            }

            public void cameraChanged(ICamera iOldCamera, ICamera iNewCamera) {
            }
        });

    }

    public void deactivate() {
        cancelCamera = true;
        super.deactivate();
        if (renderListener != null) {
            ((IModel) getModel()).removeModelListener(renderListener);
        }
    }

    public void moveCameraHelicopter() {
        moveCameraScaled(0.5f, 1.5f, -.2f, 0.5f, 0.5f, 0.0f);
    }

    public void moveCameraFirstPerson() {
        moveCameraScaled(0.5f, 1.0f, -.01f, 0.5f, 0.0f, 0.0f);
    }

    public void moveCameraOverhead() {
        moveCameraScaled(0.5f, 0.5f, -2.0f, 0.5f, 0.5f, 0.0f);
    }

    private void moveCameraScaled(float locX, float locY, float locZ, float targetX, float targetY, float targetZ) {
        ILocation extent = getLocationProvider().getExtent(getModel());
        float ex = extent.getX() * AgentEditPart.SCALE;
        float ey = extent.getY() * AgentEditPart.SCALE;
        moveCamera(new Vector3fImpl(ex * locX, ey * locY, Math.min(ex, ey) * locZ), new Vector3fImpl(ex * targetX, ey
                                                                                                     * targetY, Math.min(ex, ey)
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
            camera.lookAt(endLookPoint, UP_VECTOR);
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
                        camera.lookAt(currentLookPoint, UP_VECTOR);
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

    public ICamera getCamera() {
        final ICamera camera = ((GraphicalViewer3D) getViewer()).getLightweightSystem3D().getCamera();
        return camera;
    }

    public boolean isAnimateCamera() {
        return animateCamera;
    }

    public void setAnimateCamera(boolean animateCamera) {
        this.animateCamera = animateCamera;
    }

    /**
     * @return the animationStep
     */
    public int getAnimationStep() {
        return animationStep;
    }

    /**
     * @return the animationStepCount
     */
    public int getAnimationStepCount() {
        return animationStepCount;
    }
}
