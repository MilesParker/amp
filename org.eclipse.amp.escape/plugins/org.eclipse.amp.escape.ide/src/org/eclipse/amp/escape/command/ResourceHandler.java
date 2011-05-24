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
package org.eclipse.amp.escape.command;

import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IType;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

// TODO: Auto-generated Javadoc
/**
 * Executes an arbitrary task upon a resource. Clients should override #execute(IResource).
 * 
 * @author milesparker
 */
public abstract class ResourceHandler extends AbstractHandler {

    IProgressMonitor monitor;

    /* (non-Javadoc)
     * @see org.eclipse.core.commands.AbstractHandler#execute(org.eclipse.core.commands.ExecutionEvent)
     */
    public Object execute(ExecutionEvent event) throws ExecutionException {
        try {
        	// if command has an elementRef parameter, execute that
            IJavaElement javaElement = (IJavaElement) event.getObjectParameterForExecution("elementRef");
            executeForObject(event, javaElement);
            return null;
        } catch (ExecutionException e) {
            // we can safely ignore..the sub-class may not have defined this parameter..
        }
        
        // execute on the current selection
        ISelection selection = HandlerUtil.getCurrentSelection(event);
        if (selection != null && !selection.isEmpty() && selection instanceof IStructuredSelection) {
            IStructuredSelection structuredSelection = (IStructuredSelection) selection;
            for (Iterator<?> it = structuredSelection.iterator(); it.hasNext();) {
                Object element = it.next();
                executeForObject(event, element);
            }
        }
        return null;
    }

    private void executeForObject(ExecutionEvent event, Object element) throws ExecutionException {
        if (element instanceof IResource) {
            IResource resource = (IResource) element;
            executeHandler(event, resource, resource.getName());
        } else if (element instanceof ICompilationUnit) {
            ICompilationUnit unit = (ICompilationUnit) element;
            executeHandler(event, unit, unit.getPrimaryElement().getElementName());
        } else if (element instanceof IType) {
            IType unit = (IType) element;
            executeHandler(event, unit, unit.getElementName());
        }
    }

    /**
     * Override with desired execution behavior.
     * 
     * @param resource
     *        the resource
     * 
     * @throws ExecutionException
     *         the execution exception
     */
    // TODO Is there a reason that this isn't abstract?
    public void execute(IResource resource) throws ExecutionException {
    }

    /**
     * Execute.
     * 
     * @param resource
     *        the resource
     * @param name
     *        the name
     * 
     * @throws ExecutionException
     *         the execution exception
     */
    public void execute(Object resource, String name) throws ExecutionException {
        execute((IResource) resource);
    }

    /**
     * Execute handler.
     * 
     * @param event
     *        the event
     * @param resource
     *        the resource
     * @param name
     *        the name
     * 
     * @throws ExecutionException
     *         the execution exception
     */
    public void executeHandler(ExecutionEvent event, Object resource, String name) throws ExecutionException {
        execute(resource, name);
    }

    /**
     * Gets the monitor.
     * 
     * @return the monitor
     */
    public IProgressMonitor getMonitor() {
        return monitor;
    }

    /**
     * Sets the monitor.
     * 
     * @param monitor
     *        the new monitor
     */
    public void setMonitor(IProgressMonitor monitor) {
        this.monitor = monitor;
    }
}
