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

import java.io.IOException;
import java.util.List;

import org.eclipse.amp.amf.gen.ide.MetaABMProjectWizard;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.JavaCore;

public class AscapeProjectWizard extends MetaABMProjectWizard {

    public String getProjectTypeName() {
        return "metaABM for Ascape";
    }

    @Override
    public String[] getNatures() {
        return new String[] { JavaCore.NATURE_ID, "org.eclipse.pde.PluginNature" };
    }

    public String getPluginID() {
        return AscapeIDEActivator.PLUGIN_ID;
    }

    @Override
    public void createFiles() throws CoreException, IOException {
        IFolder mFolder = getProject().getFolder("META-INF");
        mFolder.create(true, true, null);
        copyFiles(new Path("res/ASCAPE_MANIFEST_TEMPLATE.MF"), new Path("META-INF/MANIFEST.MF"), new StringPair[] {
            new StringPair("%project_name%", getProject().getName()),
            new StringPair("%project_symbol%", getProject().getName()) });
        copyFiles(new Path("res/build_template.properties"), new Path("build.properties"), new StringPair[0]);
    }

    public void addBuilders(List<String> builderIDs) {
        builderIDs.add(AscapeIDEActivator.PLUGIN_ID + "." + AscapeModelBuilder.ASCAPE_BUILDER_ID);
        super.addBuilders(builderIDs);
    }
}
