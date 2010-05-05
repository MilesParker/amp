/**
 * <copyright>
 *
 * Copyright (c) 2010 Metascape, LLC.
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

package org.eclipse.amp.axf.core;

/**
 * A marker interface indicating that an object will serve as the provider for any model features, such as Composition
 * Providers, Label Providers, and so no. Of course, implementors may choose to delegate any of this functionality. A
 * model (IModel instance) can implement this interface directly, in which case any customization will use the features
 * provided by it. Alternatively, a model can implement IAdaptable and return an instance of this adapter. Implementors
 * should (and AMP implementations do) find providers for a given model in the following order:
 * 
 * 1. Check whether the model itself implements IModelAdapter. If not, 2. Attempt to adapt the model directly, i.e. by
 * checking for implementation of IAdaptable and then looking for this marker interface. 3. Look for a generic adapter
 * registered through the platform for the provided model on this interface.
 * 
 * This allows users to
 * 
 * @see IModel
 * @see org.eclipse.core.runtime.IAdaptable
 * @author mparker
 * 
 */
public interface IModelAdapter {

}
