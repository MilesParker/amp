/**
 * <copyright>
 *
 * Copyright (c) 2007-2009 Metascape, LLC
 * Copyright (c) 2006-2007 Argonne National Labs
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Argonne National Laboratory - Initial development (pre-contribution)
 *   Metascape - Subsequent development and maintenance
 *
 * </copyright>
 */
package org.metaabm.ide;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

/**
 * This is the one page of the wizard. <!-- begin-user-doc --> <!-- end-user-doc
 * -->
 * 
 * @generated
 */
public class CustomModelWizardNewFileCreationPage extends WizardNewFileCreationPage {
    /**
     * Pass in the selection. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public CustomModelWizardNewFileCreationPage(String pageId, IStructuredSelection selection) {
        super(pageId, selection);
    }

    /**
     * The framework calls this to see if the file is correct. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected boolean validatePage() {
        if (super.validatePage()) {
            // Make sure the file ends in ".metaabm".
            //
            String requiredExt = MetaABMModelerPlugin.INSTANCE.getString("_UI_MetaABMEditorFilenameExtension");
            String enteredExt = new Path(getFileName()).getFileExtension();
            if (enteredExt == null || !enteredExt.equals(requiredExt)) {
                setErrorMessage(MetaABMModelerPlugin.INSTANCE.getString("_WARN_FilenameExtension",
                                                                        new Object[] { requiredExt }));
                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public IFile getModelFile() {
        return ResourcesPlugin.getWorkspace().getRoot().getFile(getContainerFullPath().append(getFileName()));
    }
}