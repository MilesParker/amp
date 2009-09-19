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
import org.eclipse.amp.amf.abase.IInterpreterProvider;
import org.eclipse.amp.amf.abase.aBase.Value;
import org.eclipse.amp.amf.parameters.AParInterpreter;
import org.eclipse.amp.amf.parameters.aPar.AParFactory;
import org.eclipse.amp.amf.parameters.aPar.Parameter;
import org.eclipse.amp.amf.testing.ATestInterpreter;
import org.eclipse.amp.amf.testing.ATestProvider;
import org.eclipse.amp.amf.testing.aTest.ATestFactory;
import org.eclipse.amp.amf.testing.aTest.Constraint;
import org.eclipse.amp.amf.testing.ares.ConstraintTest;
import org.eclipse.amp.amf.testing.ares.Issue;
import org.eclipse.amp.amf.testing.ares.ResultType;
import org.eclipse.amp.amf.testing.ares.Run;
import org.eclipse.amp.amf.testing.ares.RunSet;
import org.eclipse.amp.amf.testing.ares.impl.AresFactoryImpl;
import org.eclipse.amp.escape.ide.EclipseEscapeRunner;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.metaabm.SAttributeType;

/**
 * 
 * @author mparker
 * 
 */
public class TestRun {

    private final class MonitorParentStatus extends Thread {
        /**
         * @param name
         * @param parentMonitor
         * @param runner
         */
        private MonitorParentStatus(String name) {
            super(name);
        }

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
        }
    }

    EclipseEscapeRunner runner;

    public final static IPath RESULTS_FOLDER = new Path("results");

    private Run run;

    private boolean success;

    private RunSet runSet;

    private IProject project;

    private final TestRunSet testRunSet;

    private IInterpreterProvider atestProvider;

    private ATestInterpreter aTest;

    private AParInterpreter apar;

    private final IResource aTestResource;

    public TestRun(TestRunSet testRunSet, RunSet runSet, IProject project, IResource atestResource) {
        this.testRunSet = testRunSet;
        this.runSet = runSet;
        this.project = project;
        this.aTestResource = atestResource;
        atestProvider = ATestProvider.createPooled(null);
    }

    public TestRun(TestRunSet testRunSet, RunSet runSet, IProject project, IResource atestResource,
            IInterpreterProvider atestProvider) {
        this.testRunSet = testRunSet;
        this.runSet = runSet;
        this.project = project;
        this.aTestResource = atestResource;
        this.atestProvider = atestProvider;
    }

    boolean loading;

    private IProgressMonitor parentMonitor;

    private MultiStatus status;

    private boolean cancelled;

    private void loadInterpreter() {
        loading = true;
        Job loadTest = new Job("Load " + aTestResource.getName()) {
            protected IStatus run(IProgressMonitor monitor) {
                try {
                    aTest = (ATestInterpreter) atestProvider.getInterpreter(aTestResource);
                    apar = aTest.getAparInterpreter();
                    run = AresFactoryImpl.eINSTANCE.createRun();
                    run.setParameterization(apar.getModel());
                    // Note that we need to clone for case where constraints or parameters change.
                    run.setModel(apar.getRootContext());
                    for (Constraint constraint : aTest.getModel().getContraints()) {
                        Constraint shallowCopy = ATestFactory.eINSTANCE.createConstraint();
                        shallowCopy.setAgent(constraint.getAgent());
                        shallowCopy.setAttribute(constraint.getAttribute());
                        shallowCopy.setMaxValue((Value) EcoreUtil.copy(constraint.getMaxValue()));
                        shallowCopy.setMinValue((Value) EcoreUtil.copy(constraint.getMinValue()));
                        shallowCopy.setMeasure(constraint.getMeasure());
                        shallowCopy.setQualifier(constraint.getQualifier());
                        run.getConstraints().add(shallowCopy);
                    }
                    for (Parameter param : aTest.getAparInterpreter().getModel().getParameters()) {
                        Parameter shallowCopy = AParFactory.eINSTANCE.createParameter();
                        shallowCopy.setAttribute(param.getAttribute());
                        shallowCopy.setValue((Value) EcoreUtil.copy(param
                                                                    .getValue()));
                        run.getParameters().add(shallowCopy);
                    }
                    run.setTest(aTest.getModel());
                    run.setStarted(new Date());
                    run.setResult(ResultType.INCOMPLETE);
                    loading = false;
                    if (monitor.isCanceled()) {
                        cancelled = true;
                        return Status.CANCEL_STATUS;
                    }
                    return Status.OK_STATUS;
                } catch (RuntimeException e) {
                    testRunSet.testComplete(TestRun.this);
                    cancelled = true;
                    return new Status(IStatus.ERROR, "org.eclipse.amp.escape.testing.ide",
                                      "Couldn't load interpreter file for " + aTestResource.getLocationURI(), e);
                }
            }
        };
        loadTest.setPriority(Job.LONG);
        loadTest.schedule();
        while (loading == true) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
            }
        }
    }

    private void run() {
        runner = new EclipseEscapeRunner() {
            private static final long serialVersionUID = 1L;

            protected synchronized void runMainLoop() {
                super.runMainLoop();
                if (!parentMonitor.isCanceled() && getMonitor() != null && !getMonitor().isCanceled()) {
                    evaluateTest();
                }
                close();
                testRunSet.testComplete(TestRun.this);
            }

            /**
             * @param args
             * @param block
             * @see org.ascape.runtime.Runner#openImplementation(java.lang.String[], boolean)
             */
            public void openImplementation(String[] args, boolean block) {
                apar.assignValues(new Object[] { getRootScape(), this }, status);
                super.openImplementation(args, block);
            }

        };
        new MonitorParentStatus("Watch Run Set Monitor").start();
        runner.setAutoRestart(false);
        runner.open(project, apar.getRootContext().getImplementation().getQualifiedName(), aTest.getResource().getURI()
                    .trimFileExtension().lastSegment(), new String[] {}, false);
    }

    protected void runTest(final IProgressMonitor parentMonitor, final MultiStatus status, boolean block) {
        this.parentMonitor = parentMonitor;
        this.status = status;
        loadInterpreter();
        if (!cancelled && !parentMonitor.isCanceled()) {
            run();
        }
    }

    private void evaluateTest() {
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
