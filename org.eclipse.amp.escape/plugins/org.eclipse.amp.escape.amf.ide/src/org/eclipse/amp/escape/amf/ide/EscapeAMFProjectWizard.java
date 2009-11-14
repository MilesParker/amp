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
package org.eclipse.amp.escape.amf.ide;

import java.util.List;

import org.eclipse.amp.amf.gen.ide.DocumentModelBuilder;
import org.eclipse.amp.amf.gen.ide.GenIDEPlugin;
import org.eclipse.amp.amf.gen.ide.PluginTemplateProjectWizard;
import org.eclipse.jdt.core.JavaCore;

public class EscapeAMFProjectWizard extends PluginTemplateProjectWizard {

    public String getProjectTypeName() {
        return "Escape AMF";
    }

    @Override
    public String[] getNatures() {
        return new String[] { JavaCore.NATURE_ID, "org.eclipse.pde.PluginNature" };
    }

    public String getPluginID() {
        return EscapeAMFPlugin.PLUGIN_ID;
    }

    public void addBuilders(List<String> builderIDs) {
        builderIDs.add(EscapeAMFPlugin.PLUGIN_ID + "." + EscapeModelBuilder.ESCAPE_BUILDER_ID);
        builderIDs.add(EscapeAMFPlugin.PLUGIN_ID + "." + EscapeModelStyles2Builder.ESCAPE_BUILDER_2_ID);
        builderIDs.add(EscapeAMFPlugin.PLUGIN_ID + "." + EscapeModelStyles3DBuilder.ESCAPE_BUILDER_3D_ID);
        builderIDs.add(GenIDEPlugin.PLUGIN_ID + "." + DocumentModelBuilder.DOCUMENT_BUILDER_ID);
        // builderIDs.add(EscapeAMFPlugin.PLUGIN_ID + "." + EscapeGraphicsBuilder.ESCAPE_BUILDER_3_ID);
        super.addBuilders(builderIDs);
    }

    public String getSourceDirName() {
        return "srcgen";
    }
}
