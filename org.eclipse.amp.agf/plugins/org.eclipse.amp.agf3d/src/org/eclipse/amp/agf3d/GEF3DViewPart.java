package org.eclipse.amp.agf3d;

import org.eclipse.amp.agf.gef.EditPartListener;
import org.eclipse.amp.agf.gef.EditPartViewPart;
import org.eclipse.amp.axf.view.IModelPart;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.RootEditPart;
import org.eclipse.gef3d.editparts.ScalableFreeformRootEditPart3D;
import org.eclipse.gef3d.preferences.ScenePreferenceListener;
import org.eclipse.gef3d.tools.CameraTool;
import org.eclipse.gef3d.ui.parts.GraphicalViewer3DImpl;
import org.eclipse.gef3d.ui.parts.IScene;
import org.eclipse.swt.widgets.Composite;

public class GEF3DViewPart extends EditPartViewPart {

    /**
     * The preference listener for this editor.
     */
    protected ScenePreferenceListener sceneListener;

    public void createPartControl(Composite parent) {
        super.createPartControl(parent);
        parent.addDisposeListener(((GraphicalViewer3DImpl) viewer).getLightweightSystem3D());

        if (viewer instanceof IScene) {
            sceneListener = new ScenePreferenceListener((IScene) viewer);
            sceneListener.start();
        }
    }

    EditPartListener rootListener;
    private CameraTool camera;

    public void createModelListeners() {
        if (viewer.getContents() instanceof IModelPart) {
            ((IModelPart) viewer.getContents()).createModelListeners();
        }
    }

    public RootEditPart createRoot() {
        return new ScalableFreeformRootEditPart3D();
    }

    protected void createZoomer(RootEditPart rootEditPart) {
        camera = new CameraTool();
        getEditDomain().setActiveTool(camera);
    }

    protected EditPartViewer createViewer() {
        return new GraphicalViewer3DImpl();
    }

    /**
     * {@inheritDoc}
     * 
     * @see org.eclipse.gef.ui.parts.GraphicalEditor#dispose()
     */
    @Override
    public void dispose() {

        if (sceneListener != null) {
            sceneListener.stop();
        }

        super.dispose();
    }

    public CameraTool getCamera() {
        return camera;
    }
}
