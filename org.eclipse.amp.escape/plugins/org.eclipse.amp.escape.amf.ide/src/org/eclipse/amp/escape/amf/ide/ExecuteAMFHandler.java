package org.eclipse.amp.escape.amf.ide;

import java.io.File;
import java.io.IOException;

import org.eclipse.amp.escape.command.ExecuteHandler;
import org.eclipse.amp.escape.ide.EclipseEscapeRunner;
import org.eclipse.amp.escape.ide.EscapeIDEPlugin;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.metaabm.SContext;
import org.metaabm.SImplementation;
import org.metaabm.xsd.MetaABMPersist;

public class ExecuteAMFHandler extends ExecuteHandler {

    public ExecuteAMFHandler() {
        super(false);
    }

    public ExecuteAMFHandler(boolean headless) {
        super(headless);
    }

    protected void executeOpen(EclipseEscapeRunner eclipseRunner, Object executed, IProgressMonitor monitor) {
        if (executed instanceof IResource) {
            IResource modelResource = (IResource) executed;
            File file = modelResource.getLocation().toFile();
            if (modelResource.getFileExtension().equals("metaabm")) {
                try {
                    SContext context = MetaABMPersist.create(file).load();
                    SImplementation impl = context.getImplementation();
                    final String modelClassName = impl.getQualifiedName();
                    eclipseRunner.open(modelResource, modelClassName, context.getLabel());
                } catch (IOException e) {
                    EscapeIDEPlugin.warn("Couldn't load model.", e);
                }
            }
        }
    }

    protected boolean handleSelect(Object sel) {
        return sel instanceof IResource && ((IResource) sel).getFileExtension() != null
        && ((IResource) sel).getFileExtension().equals("metaabm");
    }
}
