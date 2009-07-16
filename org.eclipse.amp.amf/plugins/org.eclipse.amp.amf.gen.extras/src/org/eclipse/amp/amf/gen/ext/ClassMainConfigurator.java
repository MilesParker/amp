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
 *   Metascape - Initial development and maintenance
 *
 * </copyright>
 */
package org.eclipse.amp.amf.gen.ext;

import java.io.File;
import java.io.IOException;

import org.eclipse.amp.amf.ide.RuntimeConfigurator;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.jdt.launching.IJavaLaunchConfigurationConstants;
import org.eclipse.ui.statushandlers.StatusManager;
import org.metaabm.SContext;
import org.metaabm.SImplementation;
import org.metaabm.xsd.MetaABMPersist;

public class ClassMainConfigurator extends RuntimeConfigurator {

    /**
     * Configures the ascape launch for a model. If model is null, then performs default configuration.
     * @param model may be null
     */
    public void configure(ILaunchConfigurationWorkingCopy config, IResource model) {
        super.configure(config, model);
        if (model != null) {
            File file = model.getLocation().toFile();
            try {
                SContext context = MetaABMPersist.create(file).load();
                SImplementation impl = context.getImplementation();
                String modelClass = impl.getQualifiedName();
                config.setAttribute(IJavaLaunchConfigurationConstants.ATTR_MAIN_TYPE_NAME, modelClass + "GraphicsWriter");
                config.setAttribute(IJavaLaunchConfigurationConstants.ATTR_PROJECT_NAME, model.getProject().getName());
            } catch (IOException e) {
                StatusManager.getManager().handle(new Status(Status.WARNING, "org.eclipse.amp.amf.gen", "Couldn't load model.", e));
            }
        }
    }
}
