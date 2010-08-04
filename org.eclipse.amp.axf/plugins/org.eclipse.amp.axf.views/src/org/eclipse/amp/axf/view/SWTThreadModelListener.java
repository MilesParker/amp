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

import org.eclipse.amp.axf.core.AbstractLifecycleListener;
import org.eclipse.amp.axf.core.IModel;
import org.eclipse.swt.widgets.Control;

// TODO: Auto-generated Javadoc
/**
 * The listener interface for receiving SWTThreadModel events. The class that is interested in processing a
 * SWTThreadModel event implements this interface, and the object created with that class is registered with a component
 * using the component's <code>addSWTThreadModelListener<code> method. When
 * the SWTThreadModel event occurs, that object's appropriate
 * method is invoked.
 * 
 * @see SWTThreadModelEvent
 */
public abstract class SWTThreadModelListener extends AbstractLifecycleListener {

    private Control widget;

    /**
     * Instantiates a new sWT thread model listener.
     * 
     * @param widget the widget
     * @param name the name
     */
    public SWTThreadModelListener(Control widget, String name) {
        super(name);
        this.widget = widget;
    }

    /**
     * Update.
     * 
     * @param model the model
     */
    public abstract void update(IModel model);

    /**
     * Sets the widget.
     * 
     * @param widget the new widget
     */
    public void setWidget(Control widget) {
        this.widget = widget;
    }

    /**
     * @return the widget
     */
    public Control getWidget() {
        return widget;
    }
}