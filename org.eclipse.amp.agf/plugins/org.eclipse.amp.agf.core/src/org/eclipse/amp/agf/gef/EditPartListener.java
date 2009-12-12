/**
 * 
 */
package org.eclipse.amp.agf.gef;

import org.eclipse.amp.axf.core.IModel;
import org.eclipse.amp.axf.view.SWTAsyncModelListener;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gef.EditPart;
import org.eclipse.ui.IViewPart;

public class EditPartListener extends SWTAsyncModelListener implements IAdaptable {

    private final EditPart editPart;

    public EditPartListener(EditPartViewPart view) {
        super(view.getViewer().getControl(), "Edit Root Update");
        this.editPart = view.getEditPart();
        setName(view.getName() + " Updater");
    }

    @Override
    public void update(final IModel model) {
        beginPainting();
        editPart.refresh();
    }

    public Object getAdapter(Class adapter) {
        if (adapter == IViewPart.class) {
            return editPart.getAdapter(adapter);
        }
        return null;
    }
}