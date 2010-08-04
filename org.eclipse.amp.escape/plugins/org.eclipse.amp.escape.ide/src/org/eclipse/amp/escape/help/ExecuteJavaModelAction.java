package org.eclipse.amp.escape.help;

import org.eclipse.amp.escape.ide.EclipseEscapeRunner;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.help.ILiveHelpAction;

public class ExecuteJavaModelAction implements ILiveHelpAction {

    String javaPath;

    public void setInitializationString(String data) {
        javaPath = data;
    }

    public void run() {
        IPath path = new Path(javaPath);
        EclipseEscapeRunner eclipseRunner = new EclipseEscapeRunner();
        IProject javaProject = ResourcesPlugin.getWorkspace().getRoot().getProject(path.segment(0));
        IPath fullPath = path.removeFirstSegments(1);
        try {
            javaProject.open(null);
            eclipseRunner.open(javaProject, fullPath.toPortableString(), fullPath.lastSegment());
        } catch (CoreException e) {
            throw new RuntimeException(e);
        }
    }

}
