package org.eclipse.amp.escape.amf.ide;

import org.eclipse.amp.amf.gen.ide.ResourceJobHandler;
import org.eclipse.core.resources.IResource;

public class GenerateEscapeStyles3DHandler extends ResourceJobHandler {

    @Override
    public void execute(IResource resource) {
        EscapeModelBuilder.getEscapeBuilderDefault().setCurrentMonitor(getMonitor());
        EscapeModelBuilder.getEscapeBuilderDefault().handleModifiedResource(resource);
        EscapeModelStyles2Builder.getEscapeBuilderDefault().setCurrentMonitor(getMonitor());
        EscapeModelStyles2Builder.getEscapeBuilderDefault().handleModifiedResource(resource);
        EscapeModelStyle3DBuilder.getEscapeBuilderDefault().setCurrentMonitor(getMonitor());
        EscapeModelStyle3DBuilder.getEscapeBuilderDefault().handleModifiedResource(resource);
        // EscapeGraphicsBuilder.getEscapeBuilderDefault().setCurrentMonitor(getMonitor());
        // EscapeGraphicsBuilder.getEscapeBuilderDefault().handleModifiedResource(resource);
    }
}
