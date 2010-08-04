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
package org.eclipse.amp.escape.ascape.agf3d;

import org.eclipse.amp.agf.gef.ModelEditPartInput;
import org.eclipse.amp.axf.view.ModelInput;
import org.eclipse.jface.viewers.StructuredSelection;

import org.ascape.view.vis.GEFView;

public class GEF3DView extends GEFView {

    private static final long serialVersionUID = -3490738641167358897L;

    public GEF3DView() {
        super("org.eclipse.amp.view.GEF3DView", null, "Graphic 3D View");
    }

    public ModelInput createInput() {
        ModelInput editorInput = new ModelEditPartInput(getModel(), null, new StructuredSelection(getScape()));
        return editorInput;
    }
}
