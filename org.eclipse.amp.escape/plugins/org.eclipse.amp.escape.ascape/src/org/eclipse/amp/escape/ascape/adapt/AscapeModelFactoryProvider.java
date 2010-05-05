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
package org.eclipse.amp.escape.ascape.adapt;

import org.eclipse.amp.agf.gef.IModelFactoryProvider;
import org.eclipse.gef.EditPartFactory;

public class AscapeModelFactoryProvider implements IModelFactoryProvider {

    public EditPartFactory getEditPartFactory(Object model) {
        return new AscapePartFactory();
    }

    public EditPartFactory getEditPartTreeFactory(Object model) {
        return new AscapePartTreeFactory();
    }

}
