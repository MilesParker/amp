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
package org.eclipse.amp.agf.gef;

import org.eclipse.amp.axf.core.IModel;
import org.eclipse.amp.axf.view.ModelInput;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.plugin.AbstractUIPlugin;

public class ModelEditPartInput extends ModelInput {

    private EditPartFactory factory;

    public ModelEditPartInput(IModel model, EditPartFactory factory, ISelection initialSelection) {
        super(model, initialSelection);
        this.factory = factory;
        if (model == null) {
            throw new RuntimeException("Attempted to instantiate model input with no model specified.");
        }
        if (MODEL_IMAGE == null) {
            MODEL_IMAGE = AbstractUIPlugin
            .imageDescriptorFromPlugin("org.eclipse.amp.axf.ui", "icons/etool16/RunStart.gif");
        }
    }

    public ModelEditPartInput(IModel model, EditPartFactory factory) {
        this(model, factory, null);
    }

    public EditPartFactory getFactory() {
        return factory;
    }
}
