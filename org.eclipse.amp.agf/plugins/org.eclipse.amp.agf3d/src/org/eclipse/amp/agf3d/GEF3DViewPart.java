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

import java.util.Map;

import org.eclipse.amp.agf.gef.EditPartViewPart;
import org.eclipse.amp.axf.view.IModelPart;
import org.eclipse.core.runtime.Platform;
import org.eclipse.draw2d.LightweightSystem;
import org.eclipse.draw2d.UpdateListener;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.draw3d.LightweightSystem3D;
import org.eclipse.draw3d.ui.preferences.ScenePreferenceDistributor;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.RootEditPart;
import org.eclipse.gef3d.SurfaceSearch;
import org.eclipse.gef3d.editparts.ScalableFreeformRootEditPart3D;
import org.eclipse.gef3d.tools.CameraTool;
import org.eclipse.gef3d.ui.parts.GraphicalViewer3D;
import org.eclipse.gef3d.ui.parts.GraphicalViewer3DHelper;
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
        get3DViewer().getLightweightSystem3D().getUpdateManager().addUpdateListener(new UpdateListener() {
            public void notifyValidating() {
            }

            public void notifyPainting(Rectangle damage, Map dirtyRegions) {
                if (getRootListener() != null) {
                    getRootListener().endPainting();
                }
            }
        });

        // if (viewer instanceof IScene) {
        // sceneListener = new ScenePreferenceListener((IScene) viewer);
        // sceneListener.start();
        // }
    }

    class WorkaroundGraphicalViewer3DImpl extends GraphicalViewer3DImpl {
        public WorkaroundGraphicalViewer3DImpl() {
            m_ViewerHelper = new GraphicalViewer3DHelper(this) {
                /**
                 * @return
                 * @see org.eclipse.gef3d.ui.parts.GraphicalViewer3DHelper#createLightweightSystem()
                 */
                public LightweightSystem createLightweightSystem() {
                    LightweightSystem3D lws3D = new LightweightSystem3D() {
                        protected void controlResized() {
                            Rectangle.SINGLETON.setBounds(new Rectangle(0, 0, 1, 1));
                            super.controlResized();
                        }
                    };
                    lws3D.getPicker().setSurfaceSearch(new SurfaceSearch(viewer));
                    return lws3D;
                }
            };
        }
    }

    protected EditPartViewer createViewer() {
        GraphicalViewer3D graphicalViewer3DImpl = new GraphicalViewer3DImpl();

        return graphicalViewer3DImpl;
    }

    public EditPartFactory createFactory() {
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

        // if (sceneListener != null) {
        // sceneListener.stop();
        // }

        super.dispose();
    }

    public CameraTool getCamera() {
        return camera;
    }
}
