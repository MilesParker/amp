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
package org.ascape.view.vis;

import org.eclipse.amp.axf.core.IModel;
import org.eclipse.amp.axf.core.IObservationProvider;
import org.eclipse.amp.axf.ide.AXFWorkbenchPlugin;
import org.eclipse.ui.IViewPart;

public class TreeView extends EditPartFactoryScapeView {
    private static final long serialVersionUID = 1L;

    public TreeView() {
        super("org.eclipse.amp.view.TreeView", null, "Tree View");
    }

    public Object getAdapter(Class key) {
        if (key == IModel.class) {
            IObservationProvider model = (IObservationProvider) AXFWorkbenchPlugin.getDefault().getManager().getAdapter(getScape().getRoot(), IModel.class);
            return model;
        }
        if (key == IViewPart.class) {
            return getViewPart();
        }
        return null;
    }
}
