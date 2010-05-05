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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.amp.axf.core.ILifeCycleListener;
import org.eclipse.amp.axf.core.IModel;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.views.properties.IPropertySourceProvider;
import org.eclipse.ui.views.properties.PropertySheetPage;

// TODO: Auto-generated Javadoc
/**
 * The Class ModelViewPart.
 */
public abstract class ModelViewPart extends ViewPart implements IModelPart, IPropertyChangeListener {

    IModel model;

    protected PropertySheetPage propertySheetPage;

    /**
     * The listener interface for receiving propertyRefresh events. The class that is interested in processing a
     * propertyRefresh event implements this interface, and the object created with that class is registered with a
     * component using the component's <code>addPropertyRefreshListener<code> method. When
     * the propertyRefresh event occurs, that object's appropriate
     * method is invoked.
     * 
     * @see PropertyRefreshEvent
     */
    class PropertyRefreshListener extends SWTAsyncModelListener {

        /**
         * Instantiates a new property refresh listener.
         * 
         * @param control the control
         */
        public PropertyRefreshListener() {
            super(null, "Property Refresh", 2500);
        }

        /**
         * @param model
         * @see org.eclipse.amp.axf.view.SWTThreadModelListener#update(org.eclipse.amp.axf.core.IModel)
         */
        public void update(IModel model) {
            if (propertySheetPage != null && propertySheetPage.getControl() != null
                    && propertySheetPage.getControl().isVisible()) {
                propertySheetPage.refresh();
            }
            endPainting();
        }

        /**
         * @return
         * @see org.eclipse.amp.axf.view.SWTThreadModelListener#getWidget()
         */
        public Control getWidget() {
            if (propertySheetPage != null) {
                return propertySheetPage.getControl();
            } else {
                return null;
            }
        }
    }

    /**
     * @param parent
     * @see org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets.Composite)
     */
    @Override
    public void createPartControl(Composite parent) {
        propertySheetPage = new PropertySheetPage();
        IPropertySourceProvider source = (IPropertySourceProvider) Platform.getAdapterManager()
        .getAdapter(this, IPropertySourceProvider.class);
        if (source != null) {
            propertySheetPage.setPropertySourceProvider(source);
        }
    }

    List<ILifeCycleListener> modelListeners = new ArrayList<ILifeCycleListener>();

    // TODO Was this neccessary functionality?
    /**
     * Creates the selection listener.
     * 
     * @param provider the provider
     */
    protected void createSelectionListener(ISelectionProvider provider) {
        // MEEPlugin.getDefault().getManager().getSelectionSynchronizer().addViewer(provider);
    }

    /**
     * Removes the selection listener.
     * 
     * @param provider the provider
     */
    protected void removeSelectionListener(ISelectionProvider provider) {
        // MEEPlugin.getDefault().getManager().getSelectionSynchronizer().removeViewer(provider);
    }

    /**
     * Sets the input.
     * 
     * @param input the new input
     */
    public void setInput(IEditorInput input) {
        // super.setInput(input);
        if (input != null) {
            model = ((ModelInput) input).getModel();
        } else {
            model = null;
        }
    }

    /**
     * @param newName
     * @see org.eclipse.ui.part.ViewPart#setPartName(java.lang.String)
     */
    public void setPartName(String newName) {
        super.setPartName(newName);
    }

    /**
     * Gets the name.
     * 
     * @return the name
     */
    public String getName() {
        return (model != null ? model.getName() + " " : "") + "View";
    }

    /**
     * Gets the property sheet page.
     * 
     * @return the property sheet page
     */
    public PropertySheetPage getPropertySheetPage() {
        return propertySheetPage;
    }

    /**
     * 
     * @see org.eclipse.amp.axf.view.IModelPart#createModelListeners()
     */
    public void createModelListeners() {
        addModelListener(new PropertyRefreshListener());
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
     * @param event
     * @see org.eclipse.jface.util.IPropertyChangeListener#propertyChange(org.eclipse.jface.util.PropertyChangeEvent)
     */
    public void propertyChange(PropertyChangeEvent event) {
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
     * 
     * @see org.eclipse.ui.part.WorkbenchPart#setFocus()
     */
    @Override
    public void setFocus() {
    }

    /**
     * 
     * @see org.eclipse.ui.part.WorkbenchPart#dispose()
     */
    public void dispose() {
        if (model != null) {
            for (ILifeCycleListener listener : getModelListeners()) {
                if (model.getModelListeners().contains(listener)) {
                    if (listener instanceof SWTAsyncModelListener) {
                        ((SWTAsyncModelListener) listener).forceModelNotify(model);
                    }
                    if (model.getModelListeners().contains(listener)) {
                        model.removeModelListener(listener);
                    }
                }
            }
        }
        if (propertySheetPage != null) {
            propertySheetPage.dispose();
        }
        propertySheetPage = null;
        super.dispose();
    }

    /**
     * @param listener
     * @see org.eclipse.amp.axf.view.IModelPart#addModelListener(org.eclipse.amp.axf.core.ILifeCycleListener)
     */
    public void addModelListener(ILifeCycleListener listener) {
        modelListeners.add(listener);
        model.addModelListener(listener);
    }

    /**
     * @return
     * @see org.eclipse.amp.axf.view.IModelPart#getModelListeners()
     */
    public Collection<ILifeCycleListener> getModelListeners() {
        return modelListeners;
    }

    /**
     * @param view
     * @see org.eclipse.amp.axf.view.IModelPart#removeModelListener(org.eclipse.amp.axf.core.ILifeCycleListener)
     */
    public void removeModelListener(ILifeCycleListener view) {
        modelListeners.remove(view);
    }

    /**
     * @param type
     * @return
     * @see org.eclipse.ui.part.WorkbenchPart#getAdapter(java.lang.Class)
     */
    @Override
    public Object getAdapter(Class type) {
        if (type == org.eclipse.ui.views.properties.IPropertySheetPage.class) {
            return getPropertySheetPage();
        }
        if (type == IModel.class) {
            return getModel();
        }
        return super.getAdapter(type);
    }

    /**
     * Checks if is single.
     * 
     * @return true, if is single
     */
    public boolean isSingle() {
        return false;
    }
}
