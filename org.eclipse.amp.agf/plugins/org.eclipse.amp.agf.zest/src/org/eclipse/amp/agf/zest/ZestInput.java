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
package org.eclipse.amp.agf.zest;

import org.eclipse.amp.axf.core.IModel;
import org.eclipse.amp.axf.view.ModelInput;
import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.ViewerFilter;

// TODO: Auto-generated Javadoc
/**
 * The Class ZestInput.
 */
public class ZestInput extends ModelInput {

    Object domainObject;

    IContentProvider content;

    IBaseLabelProvider label;

    ViewerFilter[] filters;

    /**
     * Instantiates a new zest input.
     * 
     * @param model the model
     * @param domainObject the domain object
     * @param content the content
     * @param label the label
     * @param filters the filters
     */
    public ZestInput(IModel model, Object domainObject, IContentProvider content, IBaseLabelProvider label,
            ViewerFilter[] filters) {
        super(model);
        this.domainObject = domainObject;
        this.content = content;
        this.label = label;
        this.filters = filters;
    }

    /**
     * Gets the content.
     * 
     * @return the content
     */
    public IContentProvider getContent() {
        return content;
    }
    
    /**
     * Gets the label.
     * 
     * @return the label
     */
    public IBaseLabelProvider getLabel() {
        return label;
    }

    /**
     * Gets the domain object.
     * 
     * @return the domain object
     */
    public Object getDomainObject() {
        return domainObject;
    }

    /**
     * Gets the filters.
     * 
     * @return the filters
     */
    public ViewerFilter[] getFilters() {
        return filters;
    };
}
