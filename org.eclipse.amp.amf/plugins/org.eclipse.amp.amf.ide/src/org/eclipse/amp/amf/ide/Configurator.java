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
 * </copyright> $Id: Configurator.java,v 1.1 2009/07/16 21:04:29 mparker Exp $
 */
package org.eclipse.amp.amf.ide;

import org.eclipse.core.resources.IResource;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;

/**
 * A simple encapsulation for runtime configuration to allow easy customization of runtime launchers for different AMF
 * targets.
 * 
 * @author milesparker
 * 
 */
public interface Configurator {
    public void configure(ILaunchConfigurationWorkingCopy config, IResource resource);

    public void configureForLaunch(ILaunchConfigurationWorkingCopy config, IResource resource);
}
