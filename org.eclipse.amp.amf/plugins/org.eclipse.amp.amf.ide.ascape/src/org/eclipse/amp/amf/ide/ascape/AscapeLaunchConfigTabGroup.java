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
package org.eclipse.amp.amf.ide.ascape;

import org.eclipse.amp.amf.ide.LaunchConfigTab;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.CommonTab;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;
import org.eclipse.jdt.debug.ui.launchConfigurations.JavaClasspathTab;

public class AscapeLaunchConfigTabGroup extends AbstractLaunchConfigurationTabGroup {

    public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
        LaunchConfigTab launchConfigTab = new LaunchConfigTab();
        launchConfigTab.setRuntimeConfig(AscapeRuntimeConfigurator.ASCAPE_CONFIGURATOR);
        setTabs(new ILaunchConfigurationTab[] { launchConfigTab, new JavaClasspathTab(), new CommonTab() });
    }

}
