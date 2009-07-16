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
 * </copyright> $Id: MetaABMProjectWizard.java,v 1.1 2009/07/16 21:01:08 mparker Exp $
 */
package org.eclipse.amp.amf.gen.ide;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringBufferInputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.statushandlers.StatusManager;
import org.osgi.framework.Bundle;

@SuppressWarnings("deprecation")
/**
 * Creates a generic AMF project; intended for specialization.
 */
public abstract class MetaABMProjectWizard extends Wizard implements INewWizard {

    private WizardNewProjectCreationPage metaABMProjectPage;

    protected static String PROJECT_SOURCE_DIR = "srcgen";

    protected class StringPair {
        public String a;
        public String b;

        public StringPair(String a, String b) {
            super();
            this.a = a;
            this.b = b;
        }
    }

    public MetaABMProjectWizard() {
        super();
    }

    public void init(IWorkbench workbench, IStructuredSelection selection) {
    }

    public void addPages() {
        metaABMProjectPage = new WizardNewProjectCreationPage("Specify model name and location.");
        addPage(metaABMProjectPage);
        setWindowTitle("Create a new " + getProjectTypeName() + " project.");
        metaABMProjectPage.setDescription(getWindowTitle());
    }

    public IProject getProject() {
        IProject project;
        IWorkspace workspace = ResourcesPlugin.getWorkspace();
        project = workspace.getRoot().getProject(metaABMProjectPage.getProjectName());
        return project;
    }

    public boolean performFinish() {
        try {
            IJavaProject javaProject = JavaCore.create(getProject());
            final IProjectDescription projectDescription =
                ResourcesPlugin.getWorkspace().newProjectDescription(metaABMProjectPage.getProjectName());
            projectDescription.setLocation(null);

            getProject().create(projectDescription, null);
            List<IClasspathEntry> classpathEntries = new ArrayList<IClasspathEntry>();

            projectDescription.setNatureIds(getNatures());

            List<String> builderIDs = new ArrayList<String>();
            addBuilders(builderIDs);
            ICommand[] buildCMDS = new ICommand[builderIDs.size()];
            int i = 0;
            for (String builderID : builderIDs) {
                ICommand build = projectDescription.newCommand();
                build.setBuilderName(builderID);
                buildCMDS[i++] = build;
            }
            projectDescription.setBuildSpec(buildCMDS);
            getProject().open(null);
            getProject().setDescription(projectDescription, null);

            addClasspaths(classpathEntries, getProject());

            javaProject.setRawClasspath(classpathEntries.toArray(new IClasspathEntry[classpathEntries.size()]), null);
            javaProject.setOutputLocation(new Path("/" + metaABMProjectPage.getProjectName() + "/bin"), null);

            createFiles();
            return true;
        } catch (Exception exception) {
            StatusManager.getManager().handle(
                                              new Status(IStatus.ERROR, "org.eclipse.amp.amf.ide",
                                                         "Problem creating new metaABM project; ignoring.", exception));
            try {
                getProject().delete(true, null);
            } catch (Exception e) {
                // TODO: handle exception
            }
            return false;
        }
    }

    public String[] getNatures() {
        return new String[] { JavaCore.NATURE_ID };
    }

    public void createFiles() throws CoreException, IOException {
    }

    public String getProjectTypeName() {
        return "metaABM";
    }

    public String getPluginID() {
        return GenIDEPlugin.PLUGIN_ID;
    }

    public void addClasspaths(List<IClasspathEntry> classpathEntries, IProject project) throws CoreException {
        classpathEntries.add(JavaCore.newContainerEntry(new Path("org.eclipse.jdt.launching.JRE_CONTAINER")));
        classpathEntries.add(JavaCore.newContainerEntry(new Path("org.eclipse.pde.core.requiredPlugins")));
        IFolder srcFolder = project.getFolder(PROJECT_SOURCE_DIR);
        classpathEntries.add(JavaCore.newSourceEntry(srcFolder.getFullPath()));
        srcFolder.create(true, true, null);
    }

    public void addBuilders(List<String> builderIDs) {
        builderIDs.add(GenIDEPlugin.PLUGIN_ID + "." + DocumentModelBuilder.DOCUMENT_BUILDER_ID);
        builderIDs.add(JavaCore.BUILDER_ID);
    }

    public InputStream streamFromPlugin(String pluginID, String path) {
        try {
            Bundle bundle = Platform.getBundle(pluginID);
            URL entry = bundle.getEntry(path);
            if (entry == null) {
                throw new RuntimeException("No resource:" + path + " found in plugin: " + pluginID);
            }
            return entry.openStream();
        } catch (IOException e) {
            throw new RuntimeException("Couldn't load project resource from plugin.", e);
        }
    }

    public void copyFiles(IPath srcFileLoc, IPath destFileLoc, StringPair[] pairs)
    throws CoreException, IOException {
        InputStream srcStream = streamFromPlugin(getPluginID(), srcFileLoc.toString());
        BufferedReader srcReader = new BufferedReader(new InputStreamReader(srcStream));
        StringBuffer buffer = new StringBuffer();
        String next = srcReader.readLine();
        while (next != null) {
            buffer.append(next + "\r\n");
            next = srcReader.readLine();
        }
        String parsedText = buffer.toString();
        for (StringPair p : pairs) {
            parsedText = StringUtils.replace(parsedText, p.a, p.b);
        }
        InputStream is = new StringBufferInputStream(parsedText);
        IFile destFile = getProject().getFile(destFileLoc);
        destFile.create(is, true, null);
    }
}