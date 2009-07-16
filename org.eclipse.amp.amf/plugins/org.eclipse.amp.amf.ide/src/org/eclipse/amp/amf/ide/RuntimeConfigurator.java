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
 * </copyright> $Id: RuntimeConfigurator.java,v 1.1 2009/07/16 21:04:29 mparker Exp $
 */
package org.eclipse.amp.amf.ide;

import org.eclipse.core.resources.IResource;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.jdt.launching.IJavaLaunchConfigurationConstants;

/**
 * Support for configurations intended to provide runtime launchers.
 * 
 * @author milesparker
 * 
 */
public class RuntimeConfigurator implements Configurator {

    public final static Configurator METAABM_CONFIGURATOR = new RuntimeConfigurator();

    public static final String ATTR_METAABM_FILE = "org.eclipse.amp.amf.gen.metaABMFile";

    public static final Configurator VM_CONFIG = new Configurator() {
        public void configure(ILaunchConfigurationWorkingCopy config, IResource model) {
            // Not clear that we should be setting these for users..
            // config.setAttribute(IJavaLaunchConfigurationConstants.ATTR_VM_ARGUMENTS, "-Xmx512M");
        }

        public void configureForLaunch(ILaunchConfigurationWorkingCopy config, IResource model) {
            configure(config, model);
        }
    };

    public void configure(ILaunchConfigurationWorkingCopy config, IResource model) {
        VM_CONFIG.configure(config, model);
        if (model != null) {
            config.setAttribute(ATTR_METAABM_FILE, model.getProjectRelativePath().toString());
            config.setAttribute(IJavaLaunchConfigurationConstants.ATTR_PROJECT_NAME, model.getProject().getName());
            config.setAttribute(IJavaLaunchConfigurationConstants.ID_JAVA_APPLICATION, model.getProject().getName());
        }
    }

    /**
     * Configures the actual launch runtime.
     * 
     * @param model may be null
     */
    public void configureForLaunch(ILaunchConfigurationWorkingCopy config, IResource model) {
        configure(config, model);
    }
}
