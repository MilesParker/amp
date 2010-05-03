/*******************************************************************************
 * Copyright (c) 2007 Dennis Hübner and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare
 *******************************************************************************/

package org.eclipse.amp.escape.ide;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.ui.ide.IDE;

// TODO: Auto-generated Javadoc
/**
 * Abstract file wizard modified from oAW.
 * 
 * @author milesparker
 */
abstract public class AbstractFileWizard extends Wizard implements INewWizard {
    private WizardNewFileCreationPage page;
    private ISelection selection;

    private String fileTypeName;

    private String fileExtension;

    // private String fileDescription;

    /**
     * Instantiates a new abstract file wizard.
     * 
     * @param fileTypeName the file type name
     * @param fileExtension the file extension
     * @param fileDescription the file description
     */
    public AbstractFileWizard(String fileTypeName, String fileExtension, String fileDescription) {
        super();
        this.fileTypeName = fileTypeName;
        this.fileExtension = fileExtension;
        // this.fileDescription = fileDescription;
        setNeedsProgressMonitor(false);
    }

    /**
     * Gets the file extension.
     * 
     * @return the file extension
     */
    public String getFileExtension() {
        return fileExtension;
    }

    /**
     * Sets the file extension.
     * 
     * @param fileExtension the new file extension
     */
    public void setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
    }


    /**
     * Adding the page to the wizard.
     */
    public void addPages() {
        if (!(selection instanceof IStructuredSelection)) {
            selection = new StructuredSelection();
        }

        page = new WizardNewFileCreationPage("New " + fileTypeName + " File", (IStructuredSelection) selection) {
            @Override
            protected InputStream getInitialContents() {
                return new ByteArrayInputStream(new byte[0]);
            }

            @Override
            public IWizardPage getPreviousPage() {
                validatePage();// validates initial value's
                return super.getPreviousPage();
            }
        };
        page.setFileName("MyParameters." + getFileExtension());
        page.setTitle("Create " + fileTypeName + " File");
        page.setDescription("This wizard creates a new file with *." + getFileExtension()
                            + " extension that can be opened by the " + fileTypeName + " editor.");
        addPage(page);

    }

    /**
     * This method is called when 'Finish' button is pressed in the wizard. We will create an operation and run it using
     * wizard as execution context.
     * 
     * @return true, if perform finish
     */
    public boolean performFinish() {
        boolean retValue = false;
        final IFile f = page.createNewFile();
        if (f != null && f.exists()) {
            doOpenFile(f);
            retValue = true;
        }
        return retValue;
    }

    /**
     * Opens given file in an editor
     * 
     * @param f
     *        - File to open
     * @param monitor
     *        - Monitor to progress
     */
    private void doOpenFile(final IFile f) {
        getShell().getDisplay().asyncExec(new Runnable() {
            public void run() {
                IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
                try {
                    IDE.openEditor(page, f, true);
                } catch (PartInitException e) {
                }
            }
        });
    }

    /**
     * We will accept the selection in the workbench to see if we can initialize from it.
     * 
     * @param workbench the workbench
     * @param selection the selection
     * 
     * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
     */
    public void init(IWorkbench workbench, IStructuredSelection selection) {
        this.selection = selection;
    }
}