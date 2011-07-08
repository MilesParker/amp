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
 * </copyright> $Id: AbstractMWEBuilder.java,v 1.4 2010/08/04 01:54:01 mparker Exp $
 */
package org.eclipse.amp.amf.gen.ide;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.mwe.core.WorkflowEngine;
import org.eclipse.emf.mwe.core.WorkflowRunner;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.monitor.NullProgressMonitor;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitorAdapter;
import org.eclipse.emf.mwe.core.resources.ResourceLoader;
import org.eclipse.ui.statushandlers.StatusManager;

/**
 * Provides basic services for invoking a workflow against all .metaabm models within a project. particular support for
 * workflow logging, markers
 * 
 * @author milesparker
 * 
 */
public abstract class AbstractMWEBuilder extends IncrementalProjectBuilder {

    String sourceExtension;
    protected String[] workflowPaths;
    ExtendedResourceLoader resourceLoader;
    protected static MetaABMBuilder builder;
    private Map<String, String> genProps;
    protected IProgressMonitor currentMonitor;

    boolean createMarkers;
    private ModelMarkerHelper modelMarkerHelper;
    WorkflowUIExceptionHandler exceptionHandler;
    private String taskDescription;
    private String pluginName;
    private boolean reportErrors = true;

    public AbstractMWEBuilder(String taskDescription, String pluginName, String workflowPath, String sourceExtension) {
        this(taskDescription, pluginName, new String[] { workflowPath }, sourceExtension);
    }

    public AbstractMWEBuilder(String taskDescription, String pluginName, String[] workflowPaths, String sourceExtension) {
        this.taskDescription = taskDescription;
        this.pluginName = pluginName;
        this.workflowPaths = workflowPaths;
        this.sourceExtension = sourceExtension;
        setGenProperties(new HashMap<String, String>());
        loadPlugins();
    }

    public void addURL(URL url) throws CoreException {
        resourceLoader.addURL(url);
    }

    private class GenerationRunner extends WorkflowEngine {
        @Override
        public boolean executeWorkflow(Map<?, ?> externalSlotContents, Issues issues) {
            boolean result = false;
            result = super.executeWorkflow(externalSlotContents, issues);
            if (createMarkers) {
                modelMarkerHelper.addMarkers(issues);
            }
            return result;
        }
    }

    class BuilderDeltaVisitor implements IResourceDeltaVisitor {
        /*
         * (non-Javadoc)
         * 
         * @see org.eclipse.core.resources.IResourceDeltaVisitor#visit(org.eclipse .core.resources.IResourceDelta)
         */
        public boolean visit(IResourceDelta delta) throws CoreException {
            IResource resource = delta.getResource();
            switch (delta.getKind()) {
                case IResourceDelta.ADDED:
                    // handle added resource
                    handleModifiedResource(resource);
                    break;
                case IResourceDelta.REMOVED:
                    // For now, we won't try to delete existing java files
                    // handle removed resource
                    break;
                case IResourceDelta.CHANGED:
                    // handle changed resource
                    handleModifiedResource(resource);
                    break;
            }
            // return true to continue visiting children.
            return true;
        }
    }

    class BuilderResourceVisitor implements IResourceVisitor {
        public boolean visit(IResource resource) {
            handleModifiedResource(resource);
            return true;
        }
    }

    public abstract void loadPlugins();

    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }

    public void generateModel(IResource resource) {
        ClassLoader oldLoader = Thread.currentThread().getContextClassLoader();
        Thread.currentThread().setContextClassLoader(getClass().getClassLoader());
        LogWorkflow.registerToLogFactory();
        String projectName = resource.getProject().getName();
        String fileName = resource.getName();
        String fullTaskDescription = taskDescription + " for " + fileName + " in " + projectName;
        //        String location = "Workflow: " + workflowPath + " Model: " + fileName;
        if (createMarkers) {
            modelMarkerHelper = new ModelMarkerHelper(resource);
            modelMarkerHelper.deleteMarkers();
        }
        WorkflowEngine workflowRunner = new GenerationRunner();
        ProgressMonitor workflowMonitor;
        if (currentMonitor != null) {
            workflowMonitor = new ProgressMonitorAdapter(currentMonitor);
        } else {
            workflowMonitor = new NullProgressMonitor();
            workflowMonitor.setTaskName(fullTaskDescription);
        }
        exceptionHandler = new WorkflowUIExceptionHandler();
        Map<String, Object> slotContents = new HashMap<String, Object>();
        slotContents.put("progressMonitor", currentMonitor);
        slotContents.put("exceptionHandler", exceptionHandler);
        loadPropertiesFromPrefs();

        boolean success = true;
        for (String workflow : workflowPaths) {
            success &= workflowRunner.run(workflow, workflowMonitor, getGenProperties(), slotContents);
            if (!success) {
            	break;
            }
        }
        LogWorkflow.setSuccess(success);
        LogWorkflow.report(pluginName, fullTaskDescription, false);
        LogWorkflow.restoreLogFactory();
        Thread.currentThread().setContextClassLoader(oldLoader);
    }

    protected void loadPropertiesFromPrefs() {
    }

    public void loadPropertiesFromResource(IResource resource) {
        getGenProperties().put("modelFile", resource.getName());
        URI resourceURI = URI.createPlatformResourceURI(resource.getProject().getName() + "/"
                                                        + resource.getProjectRelativePath(), true);
        getGenProperties().put("modelPath", resourceURI.toPlatformString(true));
        getGenProperties().put("outputPath", resource.getProject().getLocation().addTrailingSeparator().toOSString());
        getGenProperties().put("buildProject", resource.getProject().getName());
    }

    public void handleModifiedResource(IResource resource) {
        if (resource instanceof IFile && resource.getName().endsWith(sourceExtension)) {
            loadPropertiesFromResource(resource);
            generateModel(resource);
            try {
                resource.getProject().refreshLocal(IResource.DEPTH_INFINITE, null);
            } catch (CoreException e) {
                StatusManager.getManager().handle(
                                                  new Status(IStatus.ERROR, "org.eclipse.amp.amf.gen",
                                                             "Couldn't refresh model.", e), StatusManager.SHOW);
                throw new RuntimeException("Core issue when generating model", e);
            }
        }
    }

    protected IProject[] build(int kind, Map args, IProgressMonitor monitor) throws CoreException {
        currentMonitor = monitor;
        if (kind == FULL_BUILD) {
            fullBuild(monitor);
        } else {
            IResourceDelta delta = getDelta(getProject());
            if (delta == null) {
                fullBuild(monitor);
            } else {
                incrementalBuild(delta, monitor);
            }
        }
        currentMonitor = null;
        return null;
    }

    protected void fullBuild(final IProgressMonitor monitor) throws CoreException {
        getProject().accept(new BuilderResourceVisitor());
    }

    protected void incrementalBuild(IResourceDelta delta, IProgressMonitor monitor) throws CoreException {
        // the visitor does the work.
        delta.accept(new BuilderDeltaVisitor());
    }

    public void setGenProperties(Map<String, String> genProps) {
        this.genProps = genProps;
    }

    public Map<String, String> getGenProperties() {
        return genProps;
    }

    public void setCurrentMonitor(IProgressMonitor currentMonitor) {
        this.currentMonitor = currentMonitor;
    }

    public boolean isReportErrors() {
        return reportErrors;
    }

    public void setReportErrors(boolean reportErrors) {
        this.reportErrors = reportErrors;
    }
}