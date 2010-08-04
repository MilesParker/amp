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

package org.eclipse.amp.amf.testing.ares.presentation;

import java.util.Iterator;

import org.eclipse.amp.amf.testing.aTest.Model;
import org.eclipse.amp.amf.testing.ares.Run;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.part.FileEditorInput;

/**
 * 
 * @author mparker
 *
 */
public class OpenATestHandler extends AbstractHandler {

    public Object execute(ExecutionEvent event) throws ExecutionException {
        ISelection selection = HandlerUtil.getCurrentSelection(event);
        if (!selection.isEmpty() && selection instanceof IStructuredSelection) {
            IStructuredSelection structuredSelection = (IStructuredSelection) selection;
            for (Iterator<?> it = structuredSelection.iterator(); it.hasNext();) {
                Object element = it.next();
                if (element instanceof Model) {
                    Model test = (Model) element;
                    openTest(test);
                } else if (element instanceof Run) {
                    Run run = (Run) element;
                    openTest(run.getTest());
                }
            }
        }
        return null;
    }

    private void openTest(Model test) {
        IFile testFile = (IFile) ResourcesPlugin.getWorkspace().getRoot()
        .findMember(test.eResource().getURI().toPlatformString(true));
        try {
            PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
            .openEditor(new FileEditorInput(testFile), "org.eclipse.amp.amf.testing.ATest");
        } catch (PartInitException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}