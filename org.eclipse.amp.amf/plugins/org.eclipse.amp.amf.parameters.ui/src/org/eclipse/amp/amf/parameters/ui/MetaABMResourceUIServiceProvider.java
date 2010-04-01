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

package org.eclipse.amp.amf.parameters.ui;

import org.eclipse.amp.amf.parameters.MetaABMResourceServiceProvider;
import org.eclipse.xtext.ui.resource.DefaultResourceUIServiceProvider;

/**
 * 
 * @author mparker
 *
 */
public class MetaABMResourceUIServiceProvider extends DefaultResourceUIServiceProvider {

    public MetaABMResourceUIServiceProvider() {
        super(new MetaABMResourceServiceProvider());
    }

}
