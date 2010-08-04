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
 * </copyright> $Id: ResourceJobHandler.java,v 1.2 2010/08/04 01:54:01 mparker Exp $
 */
package org.eclipse.amp.amf.gen.ide;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.common.NotDefinedException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;

/**
 * Executes upon a resource, wrapped within a job.
 * 
 * @author milesparker
 * 
 */
public abstract class ResourceJobHandler extends ResourceHandler {

    @Override
    public void executeHandler(final ExecutionEvent event, final Object resource, final String name) throws ExecutionException {
        try {
            Job resourceRun = new Job(event.getCommand().getName() + " for " + name) {
                protected IStatus run(IProgressMonitor monitor) {
                    setMonitor(monitor);
                    try {
                        ResourceJobHandler.super.executeHandler(event, resource, name);
                    } catch (Exception e) {
                        return new Status(IStatus.ERROR, "org.eclipse.amp.amf.gen", e.getLocalizedMessage());
                    }
                    setMonitor(null);
                    return Status.OK_STATUS;
                }
            };
            resourceRun.setPriority(Job.SHORT);
            resourceRun.schedule();
        } catch (NotDefinedException e) {
            throw new ExecutionException("Internal Error", e);
        }
    }
}
