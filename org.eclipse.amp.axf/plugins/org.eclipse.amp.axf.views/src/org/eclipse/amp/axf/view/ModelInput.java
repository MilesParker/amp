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
package org.eclipse.amp.axf.view;

import org.eclipse.amp.axf.core.IModel;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPersistableElement;


// TODO: Auto-generated Javadoc
/**
 * The Class ModelInput.
 */
public class ModelInput implements IEditorInput {

    protected IModel model;

    public static ImageDescriptor MODEL_IMAGE;

    private final ISelection initialSelection;

    /**
     * Instantiates a new model input.
     * 
     * @param model the model
     * @param initialSelection an optional selection for the first object
     */
    public ModelInput(IModel model, ISelection initialSelection) {
        super();
        this.model = model;
        this.initialSelection = initialSelection;
    }

    /**
     * Instantiates a new model input.
     * 
     * @param model the model
     * @param initialSelection an optional selection for the first object
     */
    public ModelInput(IModel model) {
        this(model, null);
    }

    /**
     * @return
     * @see org.eclipse.ui.IEditorInput#exists()
     */
    public boolean exists() {
        // TODO Auto-generated method stub
        return true;
    }

    /**
     * @return
     * @see org.eclipse.ui.IEditorInput#getImageDescriptor()
     */
    public ImageDescriptor getImageDescriptor() {
        // TODO Auto-generated method stub
        return MODEL_IMAGE;
    }

    /**
     * @return
     * @see org.eclipse.ui.IEditorInput#getName()
     */
    public String getName() {
        // TODO Auto-generated method stub
        return initialSelection instanceof StructuredSelection ? ((StructuredSelection) initialSelection)
                .getFirstElement().toString() : getModel().getName();
    }

    /**
     * @return
     * @see org.eclipse.ui.IEditorInput#getPersistable()
     */
    public IPersistableElement getPersistable() {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * @return
     * @see org.eclipse.ui.IEditorInput#getToolTipText()
     */
    public String getToolTipText() {
        return "Running " + getModel().getName() + " Model";
    }

    /**
     * Gets the model.
     * 
     * @return the model
     */
    public IModel getModel() {
        return model;
    }

    /**
     * @param type
     * @return
     * @see org.eclipse.core.runtime.IAdaptable#getAdapter(java.lang.Class)
     */
    public Object getAdapter(Class type) {
        if (type == IModel.class) {
            return model;
        }
        return null;
    }

    /**
     * Sets the model.
     * 
     * @param model the new model
     */
    public void setModel(IModel model) {
        this.model = model;
    }

    /**
     * @return the initialSelection
     */
    public ISelection getSelection() {
        return initialSelection;
    }
}
