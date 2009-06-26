package org.eclipse.amp.escape.amf.ide;

import java.io.IOException;
import java.util.List;

import org.eclipse.amp.escape.ide.EscapeIDEPlugin;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.JavaCore;
import org.metaabm.ide.MetaABMProjectWizard;

public class EscapeAMFProjectWizard extends MetaABMProjectWizard {

    public String getProjectTypeName() {
        return "Escape AMF";
    }

    @Override
    public String[] getNatures() {
        return new String[] { JavaCore.NATURE_ID, "org.eclipse.pde.PluginNature" };
    }

    public String getPluginID() {
        return EscapeIDEPlugin.PLUGIN_ID;
    }

    @Override
    public void createFiles() throws CoreException, IOException {
        IFolder mFolder = getProject().getFolder("META-INF");
        mFolder.create(true, true, null);
        copyFiles(new Path("res/ESCAPE_MANIFEST_TEMPLATE.MF"), new Path("META-INF/MANIFEST.MF"), new StringPair[] {
            new StringPair("%project_name%", getProject().getName()),
            new StringPair("%project_symbol%", getProject().getName()) });
        copyFiles(new Path("res/build_template.properties"), new Path("build.properties"), new StringPair[0]);
    }

    public void addBuilders(List<String> builderIDs) {
        builderIDs.add(EscapeAMFPlugin.PLUGIN_ID + "." + EscapeModelBuilder.ESCAPE_BUILDER_ID);
        builderIDs.add(EscapeAMFPlugin.PLUGIN_ID + "." + EscapeModelStyles2Builder.ESCAPE_BUILDER_2_ID);
        // builderIDs.add(EscapeAMFPlugin.PLUGIN_ID + "." + EscapeGraphicsBuilder.ESCAPE_BUILDER_3_ID);
        super.addBuilders(builderIDs);
    }
}
