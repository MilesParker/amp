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

import java.util.List;

import org.eclipse.amp.amf.gen.ide.DocumentModelBuilder;
import org.eclipse.amp.amf.gen.ide.GenIDEPlugin;
import org.eclipse.amp.amf.gen.ide.PluginProjectWizard;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.ui.INewWizard;

public class RepastProjectWizard extends PluginProjectWizard implements INewWizard {

    public static String REPAST_HOME = "REPAST_HOME";

    public RepastProjectWizard() {
        super();
    }

    public void addClasspaths(List<IClasspathEntry> classpathEntries, IProject project) throws CoreException {
        super.addClasspaths(classpathEntries, project);
        IPath repastPath = new Path(RepastRuntimeConfigurator.REPAST_SUPPORT_PATH);
        classpathEntries.add(JavaCore.newContainerEntry(repastPath, true));
    }

    public void addBuilders(List<String> builderIDs) {
        builderIDs.add(RepastIDEActivator.PLUGIN_ID + "." + RepastModelBuilder.REPAST_BUILDER_ID);
        builderIDs.add(GenIDEPlugin.PLUGIN_ID + "." + DocumentModelBuilder.DOCUMENT_BUILDER_ID);
        super.addBuilders(builderIDs);
    }

    public String getSourceDirName() {
        return "srcgen";
    }

    public String getProjectTypeName() {
        return "MetaABM for Repast";
    }

}
