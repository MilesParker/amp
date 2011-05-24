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
import org.eclipse.amp.agf.gef.EditPartViewPart;
import org.eclipse.amp.agf.gef.ModelEditPartInput;
import org.eclipse.amp.axf.core.ILifeCycleListener;
import org.eclipse.amp.axf.core.IModel;
import org.eclipse.amp.axf.space.ILocation2D;
import org.eclipse.amp.axf.space.ILocationProvider;
import org.eclipse.amp.axf.view.IModelPart;
import org.eclipse.amp.axf.view.SWTAsyncModelListener;
import org.eclipse.core.runtime.Platform;
import org.eclipse.draw3d.ISceneListener;
import org.eclipse.draw3d.LightweightSystem3D;
import org.eclipse.draw3d.RenderContext;
import org.eclipse.draw3d.camera.ICamera;
import org.eclipse.draw3d.geometry.IVector3f;
import org.eclipse.draw3d.geometry.Math3DVector3f;
import org.eclipse.draw3d.geometry.Vector3f;
import org.eclipse.draw3d.geometry.Vector3fImpl;
import org.eclipse.draw3d.ui.preferences.ScenePreferenceDistributor;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.RootEditPart;
import org.eclipse.gef3d.editparts.ScalableFreeformRootEditPart3D;
import org.eclipse.gef3d.tools.CameraTool;
import org.eclipse.gef3d.ui.parts.GraphicalViewer3D;
import org.eclipse.gef3d.ui.parts.GraphicalViewer3DImpl;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorInput;

/**
 * Support for 3D visualization of AMP models.
 * @author milesparker
 *
 */
public class GEF3DViewPart extends EditPartViewPart {

    public static Vector3fImpl UP_VECTOR = new Vector3fImpl(0, 0, -1);

    ILocationProvider locationProvider;

    /**
     * 
     * @author mparker
     * 
     */
    private final class SceneListener implements ISceneListener {
        public void renderPassStarted(RenderContext renderContext) {
        }

        public void renderPassFinished(RenderContext renderContext) {
            ScapeEdit3DPart editPart = (ScapeEditRoot3DPart) getEditPart();
            if (renderListener != null && (editPart == null || getAnimationStep() == getAnimationStepCount())) {
                renderListener.endPainting();
            }
        }

        public void cameraChanged(ICamera iOldCamera, ICamera iNewCamera) {
        }
    }

    private final class RenderUpdateListener extends SWTAsyncModelListener {

        private boolean firstTime = true;

        private RenderUpdateListener(String name) {
            super(getViewer().getControl(), name);
        }

        public synchronized void update(IModel model) {
            beginPainting();
            LightweightSystem3D lws = ((GraphicalViewer3D) getViewer()).getLightweightSystem3D();
            while (lws.getUpdateManager3D().getCanvas() == null) {
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                }
            }
            if (firstTime) {
                animateCamera = false;
                moveCameraHelicopter();
                animateCamera = true;
                firstTime = false;
            }
            ScapeEditRoot3DPart editPart = (ScapeEditRoot3DPart) getEditPart();
            for (editPart.setAnimationStep(0); editPart.getAnimationStep() < editPart.getAnimationStepCount(); editPart
            .setAnimationStep(editPart.getAnimationStep() + 1)) {
                // getFigure().validate();
                getEditPart().refresh();
                ((GraphicalViewer3D) getViewer()).getLightweightSystem3D().render(true);
            }
        }
    }

    boolean animateCamera = true;

    boolean cancelCamera;

    private CameraTool cameraTool;

    private RenderUpdateListener renderListener;

    private Scape3DPartFactory factory3d;

    /**
     * The preference listener for this editor.
     */
    // protected ScenePreferenceListener sceneListener;

    public void createPartControl(Composite parent) {
        super.createPartControl(parent);
        parent.addDisposeListener(((GraphicalViewer3DImpl) viewer).getLightweightSystem3D());
        ScenePreferenceDistributor scenePreferenceDistributor = new ScenePreferenceDistributor(get3DViewer()
                                                                                               .getLightweightSystem3D());
        scenePreferenceDistributor.start();
        ((GraphicalViewer3D) getViewer()).getLightweightSystem3D().addSceneListener(new SceneListener());

    }

    protected EditPartViewer createViewer() {
        return new GraphicalViewer3DImpl();
    }

    public EditPartFactory createFactory(Object contents) {
        if (factory3d != null) {
            return factory3d;
        }
        return getFactory3DProvider(contents).getEditPart3DFactory(contents);
    }

    /**
     * @param input
     * @see org.eclipse.amp.agf.gef.EditPartViewPart#setInput(org.eclipse.ui.IEditorInput)
     */
    public void setInput(IEditorInput input) {
        super.setInput(input);

        final ModelEditPartInput modelInput = (ModelEditPartInput) input;
        // setPartName(getName());
        if (input != null && modelInput.getFactory() instanceof Scape3DPartFactory) {
            factory3d = (Scape3DPartFactory) modelInput.getFactory();
            locationProvider = factory3d.getLocationProvider();

        } else {
            locationProvider = (ILocationProvider) Platform.getAdapterManager().getAdapter(getModel(),
                                                                                           ILocationProvider.class);
        }
    }

    /**
     * 
     * @see org.eclipse.amp.agf.gef.EditPartViewPart#createModelListeners()
     */
    public void createModelListeners() {
        if (viewer.getContents() instanceof IModelPart) {
            ((IModelPart) viewer.getContents()).createModelListeners();
        }
        renderListener = new RenderUpdateListener("Update Root Figure");
        renderListener.setWaitForUpdate(true);
        getModel().addModelListener(renderListener);
    }

    public IModel3DFactoryProvider getFactory3DProvider(Object contents) {
        IModel3DFactoryProvider adapter = (IModel3DFactoryProvider) Platform.getAdapterManager()
        .getAdapter(contents, IModel3DFactoryProvider.class);
        if (adapter == null) {
            throw new RuntimeException("No I3DModelFactoryProvider adapter defined for: " + getModel());
        }
        return adapter;
    }

    /**
     * Convenience method.
     * 
     * @return
     */
    GraphicalViewer3D get3DViewer() {
        return (GraphicalViewer3D) getViewer();
    }

    public RootEditPart createRoot() {
        ScalableFreeformRootEditPart3D scalableFreeformRootEditPart3D = new ScalableFreeformRootEditPart3D();
        return scalableFreeformRootEditPart3D;
    }

    protected void createZoomer(RootEditPart rootEditPart) {
        cameraTool = new CameraTool();
        getEditDomain().setActiveTool(cameraTool);
    }

    /**
     * {@inheritDoc}
     * 
     * @see org.eclipse.gef.ui.parts.GraphicalEditor#dispose()
     */
    @Override
    public void dispose() {
        cancelCamera = true;

        if (viewer.getContents() instanceof IModelPart) {
            for (ILifeCycleListener listener : ((IModelPart) viewer.getContents()).getModelListeners()) {
                ((IModelPart) viewer.getContents()).removeModelListener(listener);
            }
        }
        // if (sceneListener != null) {
        // sceneListener.stop();
        // }

        super.dispose();
    }

    public ICamera getCamera() {
        final ICamera camera = ((GraphicalViewer3D) getViewer()).getLightweightSystem3D().getCamera();
        return camera;
    }

    public void moveCameraHelicopter() {
        moveCameraScaled(0.5f, 1.5f, -.2f, 0.5f, 0.5f, 0.0f);
    }

    public void moveCameraFirstPerson() {
        moveCameraScaled(0.5f, 1.0f, -.01f, 0.5f, 0.5f, 0.0f);
    }

    public void moveCameraOverhead() {
        moveCameraScaled(0.5f, 0.5f, -2.0f, 0.5f, 0.5f, 0.0f);
    }

    private void moveCameraScaled(float locX, float locY, float locZ, float targetX, float targetY, float targetZ) {
        ILocation2D extent = (ILocation2D) locationProvider.getExtent(getModel().getRoot());
        float ex = (float) (extent.getXDouble() * AgentEditPart.SCALE);
        float ey = (float) (extent.getYDouble() * AgentEditPart.SCALE);
        moveCamera(new Vector3fImpl(ex * locX, ey * locY, Math.min(ex, ey) * locZ), new Vector3fImpl(ex * targetX, ey
                                                                                                     * targetY, Math.min(ex, ey) * targetZ));
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
            camera.moveTo(endPoint);
            camera.lookAt(endLookPoint, UP_VECTOR);
        }
    }

    public static void calculateDelta(IVector3f startPoint, IVector3f endPoint, Vector3f addPoint, int steps) {
        Math3DVector3f.sub(endPoint, startPoint, addPoint);
        Math3DVector3f.scale(1.0f / steps, addPoint, addPoint);
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
                getCamera().moveTo(movePoint);
            }
        });
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
        return ((ScapeEditRoot3DPart) getEditPart()).getAnimationStep();
    }

    /**
     * @return the animationStepCount
     */
    public int getAnimationStepCount() {
        return ((ScapeEditRoot3DPart) getEditPart()).getAnimationStepCount();
    }

    /**
     * @param animationStepCount the animationStepCount to set
     */
    public void setAnimationStepCount(int animationStepCount) {
        ((ScapeEditRoot3DPart) getEditPart()).setAnimationStepCount(animationStepCount);
    }

    public CameraTool getCameraTool() {
        return cameraTool;
    }
}
