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
package org.eclipse.amp.amf.ide.repast;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.amp.amf.ide.Configurator;
import org.eclipse.amp.amf.ide.RuntimeConfigurator;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.jdt.launching.IJavaLaunchConfigurationConstants;
import org.eclipse.jdt.launching.IRuntimeClasspathEntry;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.ui.statushandlers.StatusManager;
import org.metaabm.xsd.MetaABMPersist;

public class RepastRuntimeConfigurator extends RuntimeConfigurator {

    public final static Configurator REPAST_CONFIGURATOR = new RepastRuntimeConfigurator();

    public static final String REPAST_SUPPORT_PATH = "REPAST_SIMPHONY_SUPPORT";

    public static final String JAR_CLASSPATH_DEFAULT = "REPAST_SIMPHONY_LAUNCHER";

    /**
     * Configures the repast launch for a model. If model is null, then performs
     * default configuration.
     * 
     * @param model
     *            may be null
     */
    public void configure(ILaunchConfigurationWorkingCopy config, IResource model) {
        super.configure(config, model);
        try {
            List<String> classpath = new ArrayList<String>();
            IPath systemLibsPath = new Path(JavaRuntime.JRE_CONTAINER);
            classpath.add(JavaRuntime.newRuntimeContainerClasspathEntry(systemLibsPath,
                                                                        IRuntimeClasspathEntry.STANDARD_CLASSES).getMemento());
            IPath repastPath = new Path(JAR_CLASSPATH_DEFAULT);
            classpath.add(JavaRuntime.newRuntimeContainerClasspathEntry(repastPath, IRuntimeClasspathEntry.USER_CLASSES).getMemento());
            config.setAttribute(IJavaLaunchConfigurationConstants.ATTR_CLASSPATH, classpath);
        } catch (CoreException e) {
            StatusManager.getManager().handle(
                                              new Status(Status.WARNING, "org.eclipse.amp.amf.ide.repast",
                                                         "Couldn't set classpath. Is Simphony installed?.", e));
        }
        config.setAttribute(IJavaLaunchConfigurationConstants.ATTR_DEFAULT_CLASSPATH, false);

        config.setAttribute(IJavaLaunchConfigurationConstants.ATTR_MAIN_TYPE_NAME, "repast.simphony.runtime.RepastMain");
        // config.setAttribute(IJavaLaunchConfigurationConstants.ATTR_WORKING_DIRECTORY,
        // "${eclipse_home}/plugins/repast.simphony.runtime_" + REPAST_VERSION);
        if (model != null) {
            File file = model.getLocation().toFile();
            try {
                String scoreDir = "";
                if (model.getLocation().getFileExtension().equals("metaabm")) {
                    org.metaabm.SContext context = MetaABMPersist.create(file).load();
                    org.metaabm.SImplementation impl = context.getImplementation();
                    scoreDir =
                        model.getLocation().removeLastSegments(1).toOSString() + File.separatorChar
                        + impl.getClassName() + ".rs";
                } else if (model.getLocation().getFileExtension().equals("score")) {
                    scoreDir = model.getLocation().removeLastSegments(1).makeAbsolute().toOSString();
                } else if (model.getLocation().getFileExtension().equals("rs")) {
                    scoreDir = model.getLocation().makeAbsolute().toOSString();
                } else {
                    StatusManager.getManager().handle(
                                                      new Status(Status.WARNING, "org.eclipse.amp.amf.ide.repast",
                                                                 "Tried to configure runtime for unknown model type: " + file));
                }
                scoreDir = "\"" + scoreDir + "\"";
                config.setAttribute(IJavaLaunchConfigurationConstants.ATTR_PROGRAM_ARGUMENTS, scoreDir);
            } catch (IOException e) {
                StatusManager.getManager().handle(
                                                  new Status(Status.WARNING, "org.eclipse.amp.amf.ide.repast", "Couldn't load model.", e));
            }
        }
    }

    /**
     * Configures the actual launch runtime.
     * 
     * @param model
     *            may be null
     */
    public void configureForLaunch(ILaunchConfigurationWorkingCopy config, IResource model) {
        configure(config, model);
    }
}
