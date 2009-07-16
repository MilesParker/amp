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
 * </copyright> $Id: AMFLaunchAction.java,v 1.1 2009/07/16 21:04:29 mparker Exp $
 */
package org.eclipse.amp.amf.ide;

import java.util.Iterator;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.ui.ILaunchShortcut;
import org.eclipse.jdt.launching.IJavaLaunchConfigurationConstants;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.statushandlers.StatusManager;

/**
 * Generic support for launching AMF generated models into separate runtimes and providing the common Eclipse
 * infrastructure for doing so.
 * 
 * @author milesparker
 * 
 */
public abstract class AMFLaunchAction implements IObjectActionDelegate, ILaunchShortcut {

    private ISelection selection;

    String targetName = "metaABM";

    public Configurator getConfigurator() {
        return new RuntimeConfigurator();
    }

    public void run(IAction action) {
        launchWith(selection);
    }

    public void launchWithResource(IResource metaabmFile) {
        ILaunchManager manager = DebugPlugin.getDefault().getLaunchManager();
        ILaunchConfigurationType type =
            manager.getLaunchConfigurationType(IJavaLaunchConfigurationConstants.ID_JAVA_APPLICATION);
        try {
            ILaunchConfigurationWorkingCopy configW = type.newInstance(null, "Run " + getTargetName() + " Model");
            getConfigurator().configureForLaunch(configW, metaabmFile);
            ILaunchConfiguration config = configW.doSave();
            config.launch(ILaunchManager.RUN_MODE, null);
        } catch (Exception e) {
            IStatus ioStatus =
                new Status(Status.WARNING, "org.eclipse.amp.amf.ide", "Problem launching " + getTargetName()
                           + " Model", e);
            StatusManager.getManager().handle(ioStatus);
        }
    }

    public void launchWith(ISelection selection) {
        if (selection instanceof IStructuredSelection) {
            IStructuredSelection structuredSelection = (IStructuredSelection) selection;
            for (Iterator<?> it = structuredSelection.iterator(); it.hasNext();) {
                Object element = it.next();
                if (element instanceof IResource) {
                    launchWithResource((IResource) element);
                }
            }
        }
    }

    public void selectionChanged(IAction action, ISelection selection) {
        this.selection = selection;
    }

    public void setActivePart(IAction action, IWorkbenchPart targetPart) {
    }

    public void launch(IEditorPart editor, String mode) {
        IResource resource = (IResource) editor.getEditorInput().getAdapter(IResource.class);
        launchWithResource(resource);
    }

    public void launch(ISelection selection, String mode) {
        launchWith(selection);
    }

    public String getTargetName() {
        return targetName;
    }

    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }
}