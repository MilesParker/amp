package org.eclipse.amp.escape.ascape.gef;

import org.eclipse.amp.agf.gef.EditPartViewPart;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.RootEditPart;
import org.eclipse.gef.editparts.ScalableRootEditPart;


public class GraphicsViewPart extends EditPartViewPart {

    public RootEditPart createRoot() {
        return new ScalableRootEditPart() {
            public void refresh() {
                ((EditPart) getChildren().get(0)).refresh();
            }
        };
    }
}
