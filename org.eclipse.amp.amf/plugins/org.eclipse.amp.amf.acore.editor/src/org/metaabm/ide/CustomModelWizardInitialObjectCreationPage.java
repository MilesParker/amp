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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.metaabm.SImplementationMode;

/**
 * This is the page where the type of object to create is selected. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class CustomModelWizardInitialObjectCreationPage extends WizardPage {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     */
    protected Text modelNameField;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     */
    protected Text modelPackageField;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     */
    protected Text baseDirField;

    /**
     * @generated <!-- begin-user-doc --> <!-- end-user-doc -->
     */
    protected List<String> encodings;

    CustomMetaABMModelWizard wizard;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected Combo encodingField;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected Combo modeField;

    /**
     * Pass in the selection. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public CustomModelWizardInitialObjectCreationPage(CustomMetaABMModelWizard parent, String pageId) {
        super(pageId);
        wizard = parent;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     */
    public void createControl(Composite parent) {
        composite = new Composite(parent, SWT.NONE);
        {
            GridLayout layout = new GridLayout();
            layout.numColumns = 2;
            layout.verticalSpacing = 12;
            composite.setLayout(layout);

            GridData data = new GridData();
            data.verticalAlignment = GridData.FILL;
            data.grabExcessVerticalSpace = true;
            data.horizontalAlignment = GridData.FILL;
            composite.setLayoutData(data);
        }

        createLabel("_UI_MetaABMModelWizard_packageLabel");
        modelPackageField = new Text(composite, SWT.SINGLE);
        createField(modelPackageField);
        modelPackageField.addModifyListener(validator);

        createLabel("_UI_MetaABMModelWizard_nameLabel");
        modelNameField = new Text(composite, SWT.SINGLE);
        createField(modelNameField);
        modelNameField.addModifyListener(validator);

        createLabel("_UI_MetaABMModelWizard_modeLabel");
        modeField = new Combo(composite, SWT.READ_ONLY);
        createField(modeField);
        for (Object mode : SImplementationMode.VALUES) {
            modeField.add(((SImplementationMode) mode).getName());
        }
        modeField.select(0);

        createLabel("_UI_MetaABMModelWizard_baseDirLabel");
        baseDirField = new Text(composite, SWT.SINGLE);
        createField(baseDirField);
        baseDirField.setText(((CustomMetaABMModelWizard) getWizard()).getDefaultBaseDir());
        baseDirField
        .setToolTipText("This is the project relative base directory from which file locations will be taken. For example, by default java source files will be placed in [project directory]/[base directory]/srcgen. Unless you want to create metaABM models in a different project or location, leave this field blank.");

        createLabel("_UI_XMLEncoding");
        encodingField = new Combo(composite, SWT.BORDER);
        createField(encodingField);
        for (Iterator<String> i = getEncodings().iterator(); i.hasNext();) {
            encodingField.add(i.next());
        }
        encodingField.select(0);
        encodingField.addModifyListener(validator);

        setPageComplete(validatePage());
        setControl(composite);
    }

    private void createField(Control control) {
        GridData data = new GridData();
        data.horizontalAlignment = GridData.FILL;
        data.grabExcessHorizontalSpace = true;
        control.setLayoutData(data);
    }

    private void createLabel(String resource) {
        Label containerLabel = new Label(composite, SWT.LEFT);
        containerLabel.setText(MetaABMModelerPlugin.INSTANCE.getString(resource) + ":");

        GridData data = new GridData();
        data.horizontalAlignment = GridData.BEGINNING;
        containerLabel.setLayoutData(data);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected ModifyListener validator = new ModifyListener() {
        public void modifyText(ModifyEvent e) {
            setPageComplete(validatePage());
        }
    };

    private Composite composite;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     */
    protected boolean validatePage() {
        return !modelPackageField.getText().equals("") && !modelNameField.getText().equals("")
        && getEncodings().contains(encodingField.getText());
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     */
    public void setVisible(boolean visible) {
        super.setVisible(visible);
        if (visible) {
            if (modelPackageField.getText().equals("")) {
                modelPackageField.setText(wizard.getModelFile().getProject().getName());
            }
            if (modelNameField.getText().equals("")) {
                modelNameField.setText(wizard.getModelFile().getName().replace(".metaabm", ""));
            }
            modelNameField.setFocus();
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String getEncoding() {
        return encodingField.getText();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     */
    public String getModelName() {
        return modelNameField.getText();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     */
    public String getBaseDir() {
        return baseDirField.getText();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     */
    public String getPackage() {
        return modelPackageField.getText();
    }

    public String getMode() {
        return modeField.getText();
    }

    public void setBaseDir(String dir) {
        baseDirField.setText(dir);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected Collection<String> getEncodings() {
        if (encodings == null) {
            encodings = new ArrayList<String>();
            for (StringTokenizer stringTokenizer =
                new StringTokenizer(MetaABMModelerPlugin.INSTANCE.getString("_UI_XMLEncodingChoices")); stringTokenizer
                .hasMoreTokens();) {
                encodings.add(stringTokenizer.nextToken());
            }
        }
        return encodings;
    }
}