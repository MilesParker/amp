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
 * </copyright> $Id: ModelMarkerHelper.java,v 1.3 2010/08/04 01:54:01 mparker Exp $
 */
package org.eclipse.amp.amf.gen.ide;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.issues.MWEDiagnostic;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.xtend.XtendFacade;
import org.eclipse.xtend.typesystem.emf.EmfMetaModel;


/**
 * Manages markers for use in editor.
 * 
 * @author milesparker
 * 
 */
public class ModelMarkerHelper {

    public static final String MARKER_ID = GenIDEPlugin.PLUGIN_ID + ".modelproblem";

    public static final String MARKER_ELEMENT = "modelElement";

    IResource resource;

    XtendFacade extendNames;

    public ModelMarkerHelper(IResource resource) {
        super();
        this.resource = resource;
        extendNames = XtendFacade.create("metaabm::tmpl::names");
        EmfMetaModel emfModel = new EmfMetaModel();
        emfModel.setMetaModelPackage("org.metaabm.MetaABMPackage");
        extendNames.registerMetaModel(emfModel);
    }

    public void deleteMarkers() {
        try {
            resource.deleteMarkers(MARKER_ID, false, IResource.DEPTH_INFINITE);
        } catch (CoreException ce) {
            GenIDEPlugin.INSTANCE.log(ce);
        }
    }

    public void addMarkers(final Issues issues) {
        addMarkers(issues.getErrors(), IMarker.SEVERITY_ERROR);
        addMarkers(issues.getWarnings(), IMarker.SEVERITY_WARNING);
    }

    public void addMarkers(final MWEDiagnostic[] issues, final int severity) {
        try {
            new WorkspaceModifyOperation() {
                @Override
                protected void execute(final IProgressMonitor monitor) throws CoreException, InvocationTargetException,
                InterruptedException {
                    try {
                        for (MWEDiagnostic issue : issues) {
                            createMarker(severity, issue);
                        }
                    } catch (final CoreException e) {
                        GenIDEPlugin.INSTANCE.log(e);
                    }
                }
            }.run(new org.eclipse.core.runtime.NullProgressMonitor());
        } catch (final Exception e) {
            GenIDEPlugin.INSTANCE.log(e);
        }
    }

    private void createMarker(final int severity, MWEDiagnostic issue) throws CoreException {
        final IMarker marker = resource.createMarker(MARKER_ID);
        marker.setAttribute(IMarker.MESSAGE, issue.getMessage());
        marker.setAttribute(IMarker.SEVERITY, severity);
        if (issue.getElement() instanceof EObject) {
            EObject eObject = (EObject) issue.getElement();
            String location = (String) extendNames.call("usageLabel", new Object[] { eObject });
            marker.setAttribute(IMarker.LOCATION, location);
            String objectPath = eObject.eResource().getURIFragment(eObject);
            String filePath = resource.getProject().getName() + "/" + resource.getProjectRelativePath().toString();
            String finalPath = URI.createPlatformResourceURI(filePath, false) + "#" + objectPath;
            marker.setAttribute(MARKER_ELEMENT, finalPath);
        }
    }

}
