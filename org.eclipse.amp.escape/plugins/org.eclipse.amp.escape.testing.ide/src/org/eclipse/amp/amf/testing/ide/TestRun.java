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

import java.util.Date;

import org.ascape.util.data.DataSeries;
import org.eclipse.amp.amf.parameters.AParInterpreter;
import org.eclipse.amp.amf.testing.ATestInterpreter;
import org.eclipse.amp.amf.testing.aTest.Constraint;
import org.eclipse.amp.amf.testing.ares.Failure;
import org.eclipse.amp.amf.testing.ares.Issue;
import org.eclipse.amp.amf.testing.ares.Result;
import org.eclipse.amp.amf.testing.ares.Run;
import org.eclipse.amp.amf.testing.ares.RunSet;
import org.eclipse.amp.amf.testing.ares.impl.AresFactoryImpl;
import org.eclipse.amp.escape.ide.EclipseEscapeRunner;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * 
 * @author mparker
 * 
 */
public class TestRun {

    EclipseEscapeRunner runner;

    ATestInterpreter atest;

    public final static IPath RESULTS_FOLDER = new Path("results");

    private Run run;

    private boolean success;

    private RunSet runSet;

    private IProject project;

    public TestRun(RunSet runSet, IProject project, ATestInterpreter atest) {
        super();
        this.atest = atest;
        this.runSet = runSet;
        this.project = project;
    }

    protected void initialize() {
        run = AresFactoryImpl.eINSTANCE.createRun();
        runSet.getRuns().add(run);
        run.setParameterization(atest.getAparInterpreter().getModel());
        // Note that we need to clone for case where constraints or parameters change.
        run.setModel(atest.getAparInterpreter().getTargetModel());
        run.getConstraints().addAll(EcoreUtil.copyAll(atest.getModel().getContraints()));
        run.getParameters().addAll(EcoreUtil.copyAll(atest.getAparInterpreter().getModel().getParameters()));
        run.setTest(atest.getModel());
        run.setStarted(new Date());
        run.setResult(Result.INCOMPLETE);
    }

    protected void runTest(final IProgressMonitor monitor, final MultiStatus status) {
        AParInterpreter apar = atest.getAparInterpreter();
        EclipseEscapeRunner runner = new EclipseEscapeRunner() {
            protected synchronized void runMainLoop() {
                super.runMainLoop();
                runEclipse(this, monitor, status);
                close();
            }
        };
        runner.setMonitor(monitor);
        runner.setAutoRestart(false);
        runner.open(project, apar.getTargetModel().getImplementation().getQualifiedName(), atest.getResource()
                    .getName(), apar.getArgs());
    }

    private void runEclipse(EclipseEscapeRunner runner, IProgressMonitor monitor, MultiStatus status) {
        initialize();
        success = true;
        for (Constraint constraint : run.getConstraints()) {
            String constraintName = constraint.getMeasure().getLiteral() + " " + constraint.getAgent().getLabel() + " ";
            if (constraint.getQualifier() != null) {
                constraintName += constraint.getQualifier().getLabel() + " ";
            }
            constraintName += constraint.getAttribute().getLabel();
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
        run.setFinished(new Date());
    }

    private void fail(Constraint constraint, Issue issue, double value) {
        Failure f = AresFactoryImpl.eINSTANCE.createFailure();
        run.getFailures().add(f);
        f.setConstraint(constraint);
        f.setActualValue(value);
        f.setIssue(issue);
        success = false;
    }

    public Run getRun() {
        return run;
    }
}
