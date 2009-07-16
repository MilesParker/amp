/**
 * <copyright>
 *
 * Copyright (c) 2007-2009 Metascape, LLC
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Metascape - Development and maintenance
 *
 * </copyright> $Id: GenerateSkeletonHandler.java,v 1.1 2009/07/16 21:01:08 mparker Exp $
 */
package org.eclipse.amp.amf.gen.ide;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IResource;

/**
 * Handler support for generating a class skeleton (no implementation).
 * 
 * @author milesparker
 * 
 */
public class GenerateSkeletonHandler extends ResourceJobHandler {

    @Override
    public void execute(IResource resource) throws ExecutionException {
        MetaABMBuilder.getBaseBuilderDefault().handleModifiedResource(resource);
    }
}
