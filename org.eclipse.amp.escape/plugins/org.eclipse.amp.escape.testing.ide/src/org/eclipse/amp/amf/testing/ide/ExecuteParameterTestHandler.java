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

import java.util.ArrayList;
import java.util.List;

import org.ascape.runtime.Runner;
import org.ascape.util.data.DataSeries;
import org.eclipse.amp.amf.parameters.AParInterpreter;
import org.eclipse.amp.amf.testing.ATestInterpreter;
import org.eclipse.amp.amf.testing.aTest.Constraint;
import org.eclipse.amp.escape.ascape.wrap.ScapeWrapperModel;
import org.eclipse.amp.escape.ide.EclipseEscapeRunner;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

// TODO: Auto-generated Javadoc
/**
 * The Class ExecuteParameterTestHandler.
 */
public class ExecuteParameterTestHandler extends AbstractHandler {

    List<ATestInterpreter> interpreters;
    private IProject project;
    private String name;

    /**
     * @param event
     * @return
     * @throws ExecutionException
     * @see org.eclipse.core.commands.AbstractHandler#execute(org.eclipse.core.commands.ExecutionEvent)
     */
    public Object execute(ExecutionEvent event) throws ExecutionException {
        interpreters = new ArrayList<ATestInterpreter>();
        ISelection selection = HandlerUtil.getCurrentSelection(event);
        if (!selection.isEmpty() && selection instanceof IStructuredSelection
                && ((StructuredSelection) selection).size() > 0) {
            IResource res = (IResource) ((StructuredSelection) selection).getFirstElement();
            project = res.getProject();
            for (Object obj : ((StructuredSelection) selection).toList()) {
                if (obj instanceof IResource) {
                    addResource((IResource) obj);
                }
            }

            Job escapeRun = new Job("Run " + name) {
                protected IStatus run(IProgressMonitor monitor) {
                    final MultiStatus status = new MultiStatus("org.eclipse.amp.amf.testing.ide", Status.OK,
                                                               "Executing Tests", null);
                    Runner.setDisplayGraphics(false);
                    for (final ATestInterpreter atest : interpreters) {
                        AParInterpreter apar = atest.getAparInterpreter();
                        EclipseEscapeRunner runner = new EclipseEscapeRunner() {
                            protected synchronized void runMainLoop() {
                                super.runMainLoop();
                                List<Constraint> constraints = atest.getAtestModel().getContraints();
                                for (Constraint constraint : constraints) {
                                    String constraintName = constraint.getMeasure().getLiteral() + " "
                                    + constraint.getAgent().getLabel() + " "
                                    + constraint.getAttribute().getLabel();
                                    DataSeries ds = ((ScapeWrapperModel) getModel())
                                    .getScape().getData()
                                    .getSeries(constraintName);
                                    ds = ds.getDataSeries(constraint.getMeasure().getName());
                                    if (ds != null) {
                                        if (ds.getValue() < atest.valueOf(constraint.getMinValue())) {
                                            System.err.println(constraint.getMeasure() + " " + ds.getValue()
                                                               + " < " + constraint.getMinValue());
                                        } else if (ds.getValue() > atest.valueOf(constraint
                                                                                 .getMaxValue())) {
                                            System.err.println(constraint.getMeasure() + " " + ds.getValue()
                                                               + " > " + constraint.getMaxValue());
                                        } else {
                                            System.err.println(constraint.getMeasure() + " " + ds.getValue() + " [ "
                                                               + constraint.getMinValue() + ", " + constraint.getMaxValue() + "]");
                                        }
                                    } else {
                                        status.add(new Status(Status.ERROR, "org.eclipse.amp.amf.testing",
                                                              "Data Series not found for:" + constraintName));
                                    }
                                }
                                close();
                            }
                        };
                        runner.setMonitor(monitor);
                        runner.setAutoRestart(false);
                        runner.open(project, apar.getTargetModel().getImplementation().getQualifiedName(), atest
                                    .getResource().getName(), apar.getArgs());

                    }
                    return status;
                }
            };
            escapeRun.setPriority(Job.LONG);
            escapeRun.schedule();

            name = "";
        }
        return null;
    }

    private void addResource(IResource res) {
        if (res instanceof IFile) {
            IFile file = (IFile) res;
            if (file.getFileExtension().equals("atest")) {
                interpreters.add(new ATestInterpreter(res));
            }
        } else if (res instanceof IFolder) {
            IFolder folder = (IFolder) res;
            try {
                for (IResource resMember : folder.members()) {
                    addResource(resMember);
                }
            } catch (CoreException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private boolean checkResource(Object res) {
        if (res instanceof IStructuredSelection) {
            IStructuredSelection ss = (IStructuredSelection) res;
            if (ss != null) {
                for (Object object : ss.toList()) {
                    boolean check = checkResource(object);
                    if (check) {
                        return true;
                    }
                }
            }
        } else if (res instanceof IFile) {
            IFile file = (IFile) res;
            if (file.getFileExtension().equals("atest")) {
                return true;
            }
        } else if (res instanceof IFolder) {
            IFolder folder = (IFolder) res;
            try {
                for (IResource resMember : folder.members()) {
                    boolean check = checkResource(resMember);
                    if (check) {
                        return true;
                    }
                }
            } catch (CoreException e) {
                throw new RuntimeException(e);
            }
        }
        return false;
    }

    // private void executeTests() {
    // // We create the output directories here because the launched suite won't have access to the project
    // synchronized (this) {
    // try {
    // IFolder outputFolder = project.getFolder(ParameterTest.OUTPUT_FOLDER);
    // if (!outputFolder.exists()) {
    // outputFolder.create(false, true, null);
    // }
    // IFolder resultFolder = project.getFolder(ParameterTest.RESULTS_FOLDER);
    // if (!resultFolder.exists()) {
    // resultFolder.create(false, true, null);
    // }
    // } catch (CoreException e1) {
    // throw new RuntimeException(e1);
    // }
    // }
    // List<XmlSuite> suites = new ArrayList<XmlSuite>();
    // XmlSuite suite = new XmlSuite();
    // suite.setVerbose(1);
    // suite.setName(name);
    // suite.setJUnit(false);
    // suite.setParallel("methods");
    // suite.setThreadCount(8);
    // List<String> reports = new ArrayList<String>();
    // reports.add("org.testng.reporters.JUnitXMLReporter");
    // // reports.add("org.eclipse.amp.escape.testng.SimpleTestListener");
    // suite.setListeners(reports);
    // suites.add(suite);
    // List<XmlClass> classes = new ArrayList<XmlClass>();
    //
    // XmlClass testClass = new XmlClass(ParameterTest.class);
    // classes.add(testClass);
    //
    // for (ATestInterpreter atest : interpreters) {
    // XmlTest test = new XmlTest(suite);
    // test.setXmlClasses(classes);
    // test.setName(atest.getResource().getName() + " Test");
    // test.addParameter("testName", test.getName());
    // test.addParameter("projectName", project.getName());
    // test.addParameter("projectLocation", project.getLocation().toOSString());
    // test.addParameter("testParams", atest.getAparInterpreter().getArgsString());
    // test.addParameter("testConstraints", atest.getConstraintString());
    // assignSettings(test);
    // }
    //
    // String suiteName = name + "Test.xml";
    // String xml = suite.toXml();
    // xml = StringUtils.remove(xml, "annotations=\"javadoc\"");
    // // System.out.println(xml);
    // try {
    // IFolder suiteFolder = project.getFolder(ParameterTest.SUITE_FOLDER);
    // if (!suiteFolder.exists()) {
    // suiteFolder.create(true, true, null);
    // }
    // IFile suiteFile = suiteFolder.getFile(suiteName);
    // InputStream is = new ByteArrayInputStream(xml.getBytes());
    // if (!suiteFile.exists()) {
    // suiteFile.create(is, true, null);
    // } else {
    // suiteFile.setContents(is, true, true, null);
    // }
    // launchSuiteConfiguration(suiteFile, ILaunchManager.RUN_MODE);
    // } catch (CoreException e) {
    // throw new RuntimeException(e);
    // }
    // }
    //
    // /**
    // * Assign settings.
    // *
    // * @param test the test
    // */
    // protected void assignSettings(XmlTest test) {
    // test.addParameter("testCount", "1");
    // }
    //
    // /**
    // * @param evaluationContext
    // * @see org.eclipse.core.commands.AbstractHandler#setEnabled(java.lang.Object)
    // */
    // @Override
    // public void setEnabled(Object evaluationContext) {
    // EvaluationContext ctx = (EvaluationContext) evaluationContext;
    // Object selection = ctx.getVariable("selection");
    // setBaseEnabled(checkResource(selection));
    // }
    //
    // /**
    // * Launch suite configuration.
    // *
    // * @param suiteFile the suite file
    // * @param mode the mode
    // */
    // public void launchSuiteConfiguration(IFile suiteFile, String mode) {
    // final IProject project = suiteFile.getProject();
    // final String suitePath = suiteFile.getLocation().toOSString();
    // ILaunchManager launchManager = DebugPlugin.getDefault().getLaunchManager();
    // ILaunchConfigurationWorkingCopy configWC = ConfigurationHelper.createBasicConfiguration(launchManager, project,
    // suiteFile.getName());
    //
    // configWC.setAttribute(TestNGLaunchConfigurationConstants.SUITE_TEST_LIST, Collections.singletonList(suitePath));
    // configWC.setAttribute(TestNGLaunchConfigurationConstants.TYPE, TestNGLaunchConfigurationConstants.SUITE);
    // configWC.setAttribute(IJavaLaunchConfigurationConstants.ATTR_VM_ARGUMENTS,
    // "-Xms256M  -Xmx700M  -XX:PermSize=256M  -XX:MaxPermSize=256M");
    // DebugUITools.launch(configWC, mode);
    // }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.amp.escape.command.ExecuteHandler#handleSelect(java.lang.Object)
     */
    protected boolean handleSelect(Object sel) {
        return sel instanceof IResource && ((IResource) sel).getFileExtension() != null
        && ((IResource) sel).getFileExtension().equals("atest");
    }
}
