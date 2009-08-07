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
import org.eclipse.amp.amf.testing.ares.ConstraintTest;
import org.eclipse.amp.amf.testing.ares.Issue;
import org.eclipse.amp.amf.testing.ares.ResultType;
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
import org.metaabm.SAttributeType;

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
        run.setResult(ResultType.INCOMPLETE);
    }

    protected void runTest(final IProgressMonitor parentMonitor, final MultiStatus status) {
        initialize();
        AParInterpreter apar = atest.getAparInterpreter();
        final EclipseEscapeRunner runner = new EclipseEscapeRunner() {
            protected synchronized void runMainLoop() {
                super.runMainLoop();
                if (!parentMonitor.isCanceled()) {
                    evaluateTest(this, status);
                }
                close();
            }
        };
        new Thread("Watch Run Set Monitor") {
            public void run() {
                while (!runner.isRunning()) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                    }
                }
                while (runner.isRunning() && !runner.isCloseRequested()) {
                    if (parentMonitor.isCanceled()) {
                        runner.close();
                    }
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                }
            };
        }.start();
        runner.setAutoRestart(false);
        runner.open(project, apar.getTargetModel().getImplementation().getQualifiedName(), atest.getResource()
                    .getName(), apar.getArgs());
    }

    private void evaluateTest(EclipseEscapeRunner runner, MultiStatus status) {
        success = true;
        for (Constraint constraint : run.getConstraints()) {
            String constraintName = constraint.getMeasure().getLiteral() + " " + constraint.getAgent().getLabel() + " ";
            if (constraint.getQualifier() != null) {
                constraintName += constraint.getQualifier().getLabel() + " ";
            }
            if (constraint.getAttribute().getSType() == SAttributeType.BOOLEAN_LITERAL) {
                constraintName += "is ";
            }
            constraintName += constraint.getAttribute().getLabel();
            int seriesIndex = runner.getData().getIndexOfSeries(constraintName);
            if (seriesIndex >= 0) {
                DataSeries ds = runner.getData().getSeries(constraintName);
                if (ds != null) {
                    if (ds.getValue() < ATestInterpreter.doubleValue(constraint.getMinValue())) {
                        result(constraint, Issue.BELOW_RANGE, ds.getValue());
                    } else if (ds.getValue() > ATestInterpreter.doubleValue(constraint.getMaxValue())) {
                        result(constraint, Issue.ABOVE_RANGE, ds.getValue());
                    } else {
                        result(constraint, Issue.NONE, ds.getValue());
                    }
                } else {
                    result(constraint, Issue.NOT_FOUND, Double.NaN);
                }
            } else {
                status.add(new Status(Status.ERROR, "org.eclipse.amp.amf.testing", "Data Series not found for:"
                                      + constraintName));
                result(constraint, Issue.NOT_FOUND, Double.NaN);
            }
        }
        if (success) {
            run.setResult(ResultType.SUCCESS);
        } else {
            run.setResult(ResultType.FAILURE);
        }
        run.setFinished(new Date());
    }

    private void result(Constraint constraint, Issue issue, double value) {
        ConstraintTest res = AresFactoryImpl.eINSTANCE.createConstraintTest();
        run.getResults().add(res);
        res.setConstraint(constraint);
        res.setActualValue(value);
        res.setIssue(issue);
        if (issue != Issue.NONE) {
            success = false;
        }
    }

    public Run getRun() {
        return run;
    }
}
