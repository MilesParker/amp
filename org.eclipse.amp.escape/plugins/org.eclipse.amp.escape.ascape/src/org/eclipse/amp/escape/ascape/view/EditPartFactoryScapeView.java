/*******************************************************************************
 * Copyright (c) 2009, Metascape LLC, Miles Parker.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Miles Parker - initial API and implementation
 ******************************************************************************/
package org.eclipse.amp.escape.ascape.view;

import org.eclipse.amp.agf.gef.ModelEditPartInput;
import org.eclipse.amp.axf.view.ModelInput;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.RootEditPart;
import org.eclipse.jface.viewers.StructuredSelection;


public abstract class EditPartFactoryScapeView extends ModelScapeView {
    private static final long serialVersionUID = 1L;
    private RootEditPart rootPart;

    public EditPartFactoryScapeView(String primaryID, String secondaryID, String name) {
        super(primaryID, secondaryID, name);
    }

    public ModelInput createInput() {
        ModelInput editorInput = new ModelEditPartInput(getModel(), null, new StructuredSelection(getScape()));
        return editorInput;
    }

    public Object getAdapter(Class key) {
        if (key == EditPart.class) {
            return rootPart.getChildren().get(0);
        }
        return super.getAdapter(key);
    }

    public RootEditPart getRootPart() {
        return rootPart;
    }
}
