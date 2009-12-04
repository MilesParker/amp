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

import org.eclipse.amp.agf.gef.EditPartViewPart;
import org.eclipse.amp.axf.core.ILifeCycleListener;
import org.eclipse.amp.axf.view.IModelPart;
import org.eclipse.core.runtime.Platform;
import org.eclipse.draw3d.ui.preferences.ScenePreferenceDistributor;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.RootEditPart;
import org.eclipse.gef3d.editparts.ScalableFreeformRootEditPart3D;
import org.eclipse.gef3d.tools.CameraTool;
import org.eclipse.gef3d.ui.parts.GraphicalViewer3D;
import org.eclipse.gef3d.ui.parts.GraphicalViewer3DImpl;
import org.eclipse.swt.widgets.Composite;

public class GEF3DViewPart extends EditPartViewPart {

    private CameraTool camera;

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
        // get3DViewer().getLightweightSystem3D().getUpdateManager().addUpdateListener(new UpdateListener() {
        // public void notifyValidating() {
        // }
        //
        // public void notifyPainting(Rectangle damage, Map dirtyRegions) {
        // getRootListener().endPainting();
        // }
        // });
        // parent.addPaintListener(new PaintListener() {
        //
        // public void paintControl(PaintEvent e) {
        // if (getRootListener() != null) {
        // // getRootListener().endPainting();
        // }
        // }
        // });

        // if (viewer instanceof IScene) {
        // sceneListener = new ScenePreferenceListener((IScene) viewer);
        // sceneListener.start();
        // }
    }

    protected EditPartViewer createViewer() {
        return new GraphicalViewer3DImpl();
    }

    public EditPartFactory createFactory(Object contents) {
        return getFactory3DProvider().getEditPart3DFactory();
    }

    /**
     * 
     * @see org.eclipse.amp.agf.gef.EditPartViewPart#createModelListeners()
     */
    public void createModelListeners() {
        if (viewer.getContents() instanceof IModelPart) {
            ((IModelPart) viewer.getContents()).createModelListeners();
        }
    }

    public I3DModelFactoryProvider getFactory3DProvider() {
        if (getModel() instanceof I3DModelFactoryProvider) {
            return (I3DModelFactoryProvider) getModel();
        } else {
            I3DModelFactoryProvider adapter = (I3DModelFactoryProvider) Platform.getAdapterManager()
            .getAdapter(getModel(), I3DModelFactoryProvider.class);
            if (adapter == null) {
                throw new RuntimeException("No I3DModelFactoryProvider adapter defined for: " + getModel());
            }
            return adapter;
        }
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
        camera = new CameraTool();
        getEditDomain().setActiveTool(camera);
    }

    /**
     * {@inheritDoc}
     * 
     * @see org.eclipse.gef.ui.parts.GraphicalEditor#dispose()
     */
    @Override
    public void dispose() {
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

    public CameraTool getCamera() {
        return camera;
    }
}
