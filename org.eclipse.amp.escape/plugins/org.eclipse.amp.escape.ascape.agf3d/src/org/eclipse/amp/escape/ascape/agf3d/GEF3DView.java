package org.eclipse.amp.escape.ascape.agf3d;

import org.ascape.view.vis.GEFView;
import org.eclipse.amp.agf3d.I3DModelFactoryProvider;
import org.eclipse.core.runtime.Platform;
import org.eclipse.gef.EditPartFactory;

public class GEF3DView extends GEFView {

    private static final long serialVersionUID = -3490738641167358897L;
    private EditPartFactory _3DFactory;

    public GEF3DView() {
        super("org.eclipse.amp.view.GEF3DView", null, "Graphic 3D View");
    }

    public EditPartFactory createFactory() {
        return getFactory3DProvider().getEditPart3DFactory();
    }

    public I3DModelFactoryProvider getFactory3DProvider() {
        if (getModel() instanceof I3DModelFactoryProvider) {
            return (I3DModelFactoryProvider) getModel();
        } else {
            I3DModelFactoryProvider adapter = (I3DModelFactoryProvider) Platform.getAdapterManager().getAdapter(getModel(),
                                                                                                                I3DModelFactoryProvider.class);
            if (adapter == null) {
                throw new RuntimeException("No I3DModelFactoryProvider adapter defined for: " + getModel());
            }
            return adapter;
        }
    }
}
