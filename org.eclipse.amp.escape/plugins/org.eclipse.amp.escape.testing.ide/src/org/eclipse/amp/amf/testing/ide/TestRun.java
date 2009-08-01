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

package org.eclipse.amp.amf.testing.ide;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.ascape.util.data.DataSeries;
import org.eclipse.amp.amf.testing.ATestInterpreter;
import org.eclipse.amp.amf.testing.aTest.Constraint;
import org.eclipse.amp.amf.testing.ares.Failure;
import org.eclipse.amp.amf.testing.ares.Issue;
import org.eclipse.amp.amf.testing.ares.Result;
import org.eclipse.amp.amf.testing.ares.Run;
import org.eclipse.amp.amf.testing.ares.impl.AresFactoryImpl;
import org.eclipse.amp.escape.ide.EclipseEscapeRunner;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

/**
 * 
 * @author mparker
 * 
 */
public class TestRun {

    MultiStatus status;

    EclipseEscapeRunner runner;

    ATestInterpreter atest;

    public final static IPath RESULTS_FOLDER = new Path("results");

    private Run run;

    private boolean success;

    public TestRun(ATestInterpreter atest, EclipseEscapeRunner runner, MultiStatus status) {
        super();
        this.atest = atest;
        this.runner = runner;
        this.status = status;
    }

    protected void initialize() {
        List<Constraint> constraints = atest.getAtestModel().getContraints();
        ResourceSet resourceSet = new ResourceSetImpl();

        IProject project = atest.getResource().getProject();
        IFolder resultsFolder = project.getFolder("results");
        IFile resultsFile = resultsFolder.getFile(atest.getResource().getProjectRelativePath().removeFileExtension()
                                                  .addFileExtension("ares").lastSegment());
        URI fileURI = URI.createPlatformResourceURI(project.getName() + "/" + resultsFile.getProjectRelativePath(),
                                                    true);
        Resource resource = resourceSet.createResource(fileURI);

        run = AresFactoryImpl.eINSTANCE.createRun();
        if (run != null) {
            resource.getContents().add(run);
        } else {
            throw new RuntimeException("Couldn't create resource.");
        }
        run.getConstraints().addAll(constraints);
        run.setStarted(new Date());
        run.setResult(Result.INCOMPLETE);
        Map<Object, Object> options = new HashMap<Object, Object>();
        try {
            resource.save(options);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    protected void performTest() {
        List<Constraint> constraints = run.getConstraints();
        success = true;
        for (Constraint constraint : constraints) {
            String constraintName = constraint.getMeasure().getLiteral() + " " + constraint.getAgent().getLabel() + " "
            + constraint.getAttribute().getLabel();
            int seriesIndex = runner.getData().getIndexOfSeries(constraintName);
            if (seriesIndex >= 0) {
                DataSeries ds = runner.getData().getSeries(constraintName);
                if (ds != null) {
                    if (ds.getValue() < atest.valueOf(constraint.getMinValue())) {
                        System.err.println(constraint.getMeasure() + " " + ds.getValue() + " < "
                                           + constraint.getMinValue());
                        fail(constraint, Issue.BELOW_RANGE, ds.getValue());
                    } else if (ds.getValue() > atest.valueOf(constraint.getMaxValue())) {
                        System.err.println(constraint.getMeasure() + " " + ds.getValue() + " > "
                                           + constraint.getMaxValue());
                        fail(constraint, Issue.ABOVE_RANGE, ds.getValue());
                    } else {
                        System.err.println(constraint.getMeasure() + " " + ds.getValue() + " [ "
                                           + constraint.getMinValue() + ", " + constraint.getMaxValue() + "]");
                    }
                }
            } else {
                status.add(new Status(Status.ERROR, "org.eclipse.amp.amf.testing", "Data Series not found for:"
                                      + constraintName));
            }
        }
        if (success) {
            run.setResult(Result.SUCCESS);
        } else {
            run.setResult(Result.FAILURE);
        }
    }

    private void fail(Constraint constraint, Issue issue, double value) {
        Failure f = AresFactoryImpl.eINSTANCE.createFailure();
        f.setConstraint(constraint);
        f.setActualValue(value);
        f.setIssue(issue);
        success = false;
    }
}
