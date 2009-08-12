/**
 * 
 */
package org.eclipse.amp.agf.gef;

import org.eclipse.amp.axf.core.IModel;
import org.eclipse.amp.axf.view.SWTAsyncModelListener;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gef.EditPart;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IViewPart;

public class EditPartListener extends SWTAsyncModelListener implements IAdaptable {

    private final EditPart editPart;

    public EditPartListener(Control control, EditPart editPart) {
        super(control, "Edit Root Update");
        this.editPart = editPart;
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