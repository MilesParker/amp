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

package org.eclipse.amp.amf.abase;

import org.eclipse.emf.ecore.resource.Resource;

/**
 * 
 * @author mparker
 *
 */
public interface ICached {

    public void setCache(IInterpreterProvider cache);

    void load(Resource emfResource);

}
