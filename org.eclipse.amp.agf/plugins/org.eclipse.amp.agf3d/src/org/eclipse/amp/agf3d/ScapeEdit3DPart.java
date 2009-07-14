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
import org.eclipse.amp.axf.core.IObservationProvider;
import org.eclipse.amp.axf.view.SWTAsyncModelListener;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw3d.Figure3D;
import org.eclipse.draw3d.IFigure3D;
import org.eclipse.draw3d.IScene;
import org.eclipse.draw3d.camera.ICamera;
import org.eclipse.draw3d.geometry.IVector3f;
import org.eclipse.draw3d.geometry.Math3DVector3f;
import org.eclipse.draw3d.geometry.Vector3f;
import org.eclipse.draw3d.geometry.Vector3fImpl;
import org.eclipse.draw3d.shapes.WiredCube;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.jface.viewers.IFilter;
import org.eclipse.swt.widgets.Display;

public class ScapeEdit3DPart extends ScapeEditPart {

    IModel model;

    private final class RenderUpdateListener extends SWTAsyncModelListener {
        private final Figure figure;

        private RenderUpdateListener(String name, Figure figure) {
            super(null, name);
            this.figure = figure;
        }

        public void observeCreate(IObservationProvider observed) {
            model = (IModel) observed;
            super.observeCreate(observed);
            animateCamera = false;
            moveCameraHelicopter();
            animateCamera = true;
        }

        public void update(IModel model) {
            figure.invalidateTree();
            for (animationStep = 0; animationStep < animationStepCount; animationStep++) {
                refresh();
                figure.getUpdateManager().performUpdate();
            }
            animationStep = 0;
        }
    }

    public ScapeEdit3DPart(ICompositionProvider memberProvider, ILocationProvider locationProvider,
            IExtentProvider extentProvider, IGraphProvider graphProvider, IFilter filter) {
        super(memberProvider, locationProvider, extentProvider, graphProvider, filter);
    }

    WiredCube sc;

    int animationStep;

    int animationStepCount = 1;

    boolean animateCamera = true;

    boolean cancelCamera;

    boolean cameraMoving;

    protected IFigure createFigure() {
        final Figure figure = new Figure3D();
        figure.setSize(calculateDimension());
        if (getMemberProvider().getParent(getModel()) == null) {
            renderListener = new RenderUpdateListener("Update Root Figure", figure);
            renderListener.setWaitForPaint(false);
            ((IModel) getModel()).addModelListener(renderListener);
        }
        return figure;
    }

    // @Override
    public synchronized void refresh() {
        if (getFilter() == null || getFilter().select(getModel())) {
            super.refresh();
            // performance improvement..we only need to do this once for Array2D
            if (!getMemberProvider().isMutable(getModel()) && !isFirstRefresh()) {
                for (Object child : getChildren()) {
                    ((EditPart) child).refresh();
                }
            } else {
                for (Object child : getChildren()) {
                    ((EditPart) child).refresh();
                    calculateConstraints(((GraphicalEditPart) child));
                }
            }
        }
        setFirstRefresh(false);
    }

    Map<Object, IVector3f> startPoints = new HashMap<Object, IVector3f>();
    Map<Object, Vector3f> addPoints = new HashMap<Object, Vector3f>();

    private RenderUpdateListener renderListener;

    protected void calculateConstraints(GraphicalEditPart editPart) {
        Object agent = editPart.getModel();
        ILocation location = getLocationProvider().getLocation(agent);
        if (location != null) {
            IFigure3D agentFigure = (IFigure3D) editPart.getFigure();
            IVector3f endPoint = new Vector3fImpl((float) GenericEditPart.SCALE * location.getX(),
                                                  (float) GenericEditPart.SCALE * location.getY(), -GenericEditPart.SCALE);
            if (animationStepCount > 1 && model != null && model.getPeriod() > 0) {
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
        final ICamera camera = getCamera();
        if (animateCamera) {
            new Thread() {
                public void run() {
                    cameraMoving = true;
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
                                break;
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
                                break;
                            }
                        }
                        Display.getDefault().syncExec(new Runnable() {
                            public void run() {
                                // Take care of any small deltas
                                // camera.lookAt(endLookPoint, upVector);
                            }
                        });
                    }
                    cameraMoving = false;
                }

            }.start();
        } else {
            camera.moveTo(endPoint.getX(), endPoint.getY(), endPoint.getZ());
            camera.lookAt(endLookPoint, new Vector3fImpl(0, -0, 1));
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
        final ICamera camera = ((IScene) getViewer()).getCamera();
        return camera;
    }

    public boolean isAnimateCamera() {
        return animateCamera;
    }

    public void setAnimateCamera(boolean animateCamera) {
        this.animateCamera = animateCamera;
    }
}
