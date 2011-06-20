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
package org.eclipse.amp.escape.amf.ide;

import org.eclipse.amp.amf.parameters.AParFactory;
import org.eclipse.amp.amf.parameters.AParInterpreter;
import org.eclipse.amp.axf.time.TimeGranularity;
import org.eclipse.amp.escape.command.ExecuteHandler;
import org.eclipse.amp.escape.ide.EclipseEscapeRunner;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;

import org.ascape.runtime.Runner;
import org.metaabm.SContext;

// TODO: Auto-generated Javadoc
/**
 * The Class ExecuteParameterHandler.
 */
public class ExecuteParameterHandler extends ExecuteHandler {

    private AParInterpreter interpreter;
    protected IResource modelResource;
    private SContext model;

    /**
     * Instantiates a new execute parameter handler.
     * 
     * @param headless the headless
     */
    public ExecuteParameterHandler(boolean headless) {
        super(headless);
    }

    /**
     * Instantiates a new execute parameter handler.
     */
    public ExecuteParameterHandler() {
        super(false);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.amp.escape.command.ExecuteHandler#executeOpen(org.eclipse.amp.escape.ide.EclipseEscapeRunner,
     * java.lang.Object, org.eclipse.core.runtime.IProgressMonitor)
     */
    @Override
		protected EclipseEscapeRunner executeOpen(Object executed, IProgressMonitor monitor) {
        if (executed instanceof IResource) {
            modelResource = (IResource) executed;
            IProject project = modelResource.getProject();
            if (modelResource.getFileExtension().equals("apar")) {
                // a bit awkward..
                setInterpreter((AParInterpreter) AParFactory.create(null).getInterpreter(modelResource));
                model = getInterpreter().getRootContext();
                //If you create the runner sooner the member model and modelResource are null. So the headless run in the output file throw an assertion 
                EclipseEscapeRunner eclipseRunner = createRunner();
                if (isHeadless()) {
                    eclipseRunner.setUpdateGranularity(TimeGranularity.createFrequencyGranularity(Integer.MAX_VALUE));
                }
                eclipseRunner.setMonitor(monitor);
                eclipseRunner.setAutoRestart(false);
                eclipseRunner.open(project, model.getImplementation().getQualifiedName(),
                                   getInterpreter().getRunName(), getInterpreter().getArgs());
                return eclipseRunner;
            }
        }
        return null;
    }

    /**
     * @return
     * @see org.eclipse.amp.escape.command.ExecuteHandler#createRunner()
     */
    @Override
		protected EclipseEscapeRunner createRunner() {
        Runner.setDisplayGraphics(!isHeadless());
        EclipseEscapeRunner runner = new EclipseEscapeRunner() {
            private static final long serialVersionUID = 1L;

            /**
             * @param args
             * @param block
             * @see org.ascape.runtime.Runner#openImplementation(java.lang.String[], boolean)
             */
            @Override
						public void openImplementation(String[] args, boolean block) {
                getInterpreter().assignValues(new Object[] { getRootScape(), this }, null);
                super.openImplementation(args, block);
            }

        };
        return runner;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.amp.escape.command.ExecuteHandler#handleSelect(java.lang.Object)
     */
    @Override
		protected boolean handleSelect(Object sel) {
        return sel instanceof IResource && ((IResource) sel).getFileExtension() != null
        && ((IResource) sel).getFileExtension().equals("apar");
    }

    public void setInterpreter(AParInterpreter interpreter) {
        this.interpreter = interpreter;
    }

    public AParInterpreter getInterpreter() {
        return interpreter;
    }

    /**
     * @return the model
     */
    public SContext getModel() {
        return model;
    }
}
