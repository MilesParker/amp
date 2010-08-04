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
 * </copyright> $Id: ResourceHandler.java,v 1.2 2010/08/04 01:54:01 mparker Exp $
 */
package org.eclipse.amp.amf.gen.ide;

 import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

 /**
  * Executes an arbitrary task upon a resource. Clients should override #execute(IResource).
  * 
  * @author milesparker
  * 
  */
 public abstract class ResourceHandler extends AbstractHandler {

     IProgressMonitor monitor;

     public Object execute(ExecutionEvent event) throws ExecutionException {
         ISelection selection = HandlerUtil.getCurrentSelection(event);
         if (!selection.isEmpty() && selection instanceof IStructuredSelection) {
             IStructuredSelection structuredSelection = (IStructuredSelection) selection;
             for (Iterator<?> it = structuredSelection.iterator(); it.hasNext();) {
                 Object element = it.next();
                 if (element instanceof IResource) {
                     IResource resource = (IResource) element;
                     executeHandler(event, resource, resource.getName());
                 } else if (element instanceof ICompilationUnit) {
                     ICompilationUnit unit = (ICompilationUnit) element;
                     executeHandler(event, unit, unit.getPrimaryElement().getElementName());
                 }
             }
         }
         return null;
     }

     /**
      * Override with desired execution behavior.
      * 
      * @param resource
      * @throws ExecutionException
      */
     // TODO Is there a reason that this isn't abstract?
     public void execute(IResource resource) throws ExecutionException {
     }

     public void execute(Object resource, String name) throws ExecutionException {
         execute((IResource) resource);
     }

     public void executeHandler(ExecutionEvent event, Object resource, String name) throws ExecutionException {
         execute(resource, name);
     }

     public IProgressMonitor getMonitor() {
         return monitor;
     }

     public void setMonitor(IProgressMonitor monitor) {
         this.monitor = monitor;
     }
 }
