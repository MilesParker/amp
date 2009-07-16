/*******************************************************************************
 * See org.eclipse.emf.mwe.internal.ui.debug.launching.ui.MWELaunchConfigMainTab for original copyright:
 * Copyright (c) 2005 - 2007 committers of openArchitectureWare and others.
 * Copyright (c) 2007-2009 Metascape, LLC
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Committers of openArchitectureWare - initial API and implementation
 *   Metascape - Customization for AMF usage
 * 
 *******************************************************************************/
package org.eclipse.amp.amf.ide;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.debug.ui.launchConfigurations.JavaLaunchTab;
import org.eclipse.jdt.launching.IJavaLaunchConfigurationConstants;
import org.eclipse.jdt.ui.JavaElementLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.ui.dialogs.ResourceListSelectionDialog;
import org.metaabm.SContext;
import org.metaabm.SImplementation;
import org.metaabm.xsd.MetaABMPersist;

/**
 * This class defines the Ascapelaunch config main tab. It is based on MWELaunchConfigMainTab, which is in turn based on
 * the Java one <code>org.eclipse.jdt.debug.ui.launchConfigurations.JavaMainTab</code>, but shows a workflow file
 * instead of a Java class.<br>
 * There is an additional <code>javaDebugCheckbox</code> to be able to select the debug process (oAW debug or Java
 * debug)
 */
public class LaunchConfigTab extends JavaLaunchTab {

    private WidgetListener fListener = new WidgetListener();

    private Text projText;

    private Button projButton;

    private Text launchFileText;

    private Button metaABMFileButton;

    private Path metaABMPath;

    private IResource metaABMModel;

    protected Text modelClassText;

    private Configurator runtimeConfig = RuntimeConfigurator.METAABM_CONFIGURATOR;

    public void createControl(Composite parent) {
        Font font = parent.getFont();

        Composite comp = new Composite(parent, SWT.NONE);
        setControl(comp);
        GridLayout topLayout = new GridLayout();
        topLayout.verticalSpacing = 0;
        comp.setLayout(topLayout);
        comp.setFont(font);

        // Project group
        projButton = createPushButton(parent, "&Browse...", null);
        projText = createGroup(comp, "&Project:", projButton, null);

        createVerticalSpacer(comp, 1);

        // metaABM group
        metaABMFileButton = createPushButton(parent, "&Search...", null);
        launchFileText = createGroup(comp, "metaABM Model:", metaABMFileButton, null);

        createVerticalSpacer(comp, 1);

        modelClassText = createGroup(comp, "(Main Class:)", null, null);
        modelClassText.setEnabled(false);
    }

    private Text createGroup(Composite comp, String title, Button searchButton, Button[] checkButtons) {
        Font font = comp.getFont();
        Group group = new Group(comp, SWT.NONE);
        group.setText(title);
        group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        GridLayout layout = new GridLayout();
        layout.numColumns = 2;
        group.setLayout(layout);
        group.setFont(font);
        Text text = new Text(group, SWT.SINGLE | SWT.BORDER);
        text.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        text.setFont(font);
        text.addModifyListener(fListener);
        if (searchButton != null) {
            searchButton.setParent(group);
            searchButton.addSelectionListener(fListener);
        }
        if (checkButtons != null) {
            for (Button button : checkButtons) {
                button.setParent(group);
                GridData gd = new GridData();
                gd.horizontalSpan = 2;
                button.setLayoutData(gd);
                button.addSelectionListener(fListener);
            }
        }
        return text;
    }

    private void setMetaABMText(String fullName) {
        metaABMPath = new Path(fullName);
        String projectName = projText.getText().trim();
        int pos = fullName.indexOf(projectName);
        if (projectName.length() > 0 && pos >= 0) {
            launchFileText.setText(fullName.substring(pos + projectName.length() + 1));
        } else {
            launchFileText.setText(fullName);
        }
        if (!metaABMPath.isEmpty() && getJavaProject() != null && getJavaProject().getProject() != null) {
            String osPath = getJavaProject().getProject().getLocation().toOSString() + "/" + metaABMPath;
            try {
                SContext context = MetaABMPersist.create(osPath).load();
                SImplementation impl = context.getImplementation();
                modelClassText.setText(impl.getQualifiedName());
            } catch (Exception e) {
                setErrorMessage("Invalid metaabm file: " + osPath + ": " + e);
            }
        }
    }

    @Override
    public void initializeFrom(ILaunchConfiguration config) {
        super.initializeFrom(config);
        try {
            projText.setText(config.getAttribute(IJavaLaunchConfigurationConstants.ATTR_PROJECT_NAME, ""));
            setMetaABMText(config.getAttribute(RuntimeConfigurator.ATTR_METAABM_FILE, ""));
        } catch (CoreException e) {
            setErrorMessage(e.getMessage());
        }
    }

    @Override
    public boolean isValid(ILaunchConfiguration launchConfig) {
        String text = launchFileText.getText().trim();
        if (text.length() > 0) {
            IProject project = getWorkspaceRoot().getProject(projText.getText().trim());
            if (project != null) {
                if (project.getFile(metaABMPath) == null) {
                    setErrorMessage("Specified file does not exist.");
                    return false;
                }
            } else {
                setErrorMessage("Specify a project.");
            }
        } else {
            setMessage("Specify a model file.");
        }
        return super.isValid(launchConfig);
    }

    public String getName() {
        return "Main";
    }

    public void performApply(ILaunchConfigurationWorkingCopy config) {
        try {
            IProject project = getWorkspaceRoot().getProject(projText.getText().trim());
            if (project != null && !metaABMPath.isEmpty()) {
                metaABMModel = project.getFile(metaABMPath);
                getConfigurator().configure(config, metaABMModel);
            }
        } catch (IllegalArgumentException e) {
            // ignore
        }
    }

    public void setDefaults(ILaunchConfigurationWorkingCopy config) {
        IJavaElement javaElement = getContext();
        if (javaElement != null) {
            initializeJavaProject(javaElement, config);
        } else {
            config.setAttribute(IJavaLaunchConfigurationConstants.ATTR_PROJECT_NAME, "");
        }
        getConfigurator().configure(config, metaABMModel);
    }

    private class WidgetListener implements ModifyListener, SelectionListener {

        public void modifyText(ModifyEvent e) {
            updateLaunchConfigurationDialog();
        }

        public void widgetDefaultSelected(SelectionEvent e) {
            // do nothing
        }

        public void widgetSelected(SelectionEvent e) {
            Object source = e.getSource();
            if (source == projButton) {
                handleProjectButtonSelected();
            } else if (source == metaABMFileButton) {
                handleMetaABMButtonSelected();
            } else {
                updateLaunchConfigurationDialog();
            }
        }
    }

    private void handleMetaABMButtonSelected() {
        ResourceListSelectionDialog dialog = new ResourceListSelectionDialog(getShell(), getWorkspaceRoot(),
                                                                             IResource.FILE);
        dialog.setTitle("Select starting workflow file.");
        dialog.setMessage("Select starting workflow file.");
        if (dialog.open() == Window.OK) {
            Object[] files = dialog.getResult();
            IFile file = (IFile) files[0];
            setMetaABMText(file.getProjectRelativePath().toString());
        }
    }

    private void handleProjectButtonSelected() {
        IJavaProject project = chooseJavaProject();
        if (project == null) {
            return;
        }
        String projectName = project.getElementName();
        projText.setText(projectName);
    }

    private IJavaProject chooseJavaProject() {
        ILabelProvider labelProvider = new JavaElementLabelProvider(JavaElementLabelProvider.SHOW_DEFAULT);
        ElementListSelectionDialog dialog = new ElementListSelectionDialog(getShell(), labelProvider);
        dialog.setTitle("Project Selection:");
        dialog.setMessage("Choose a metaABM project containing your model and generated classes.");
        try {
            dialog.setElements(JavaCore.create(getWorkspaceRoot()).getJavaProjects());
        } catch (JavaModelException jme) {
            // todo more pleasant result
            throw new RuntimeException(jme);
        }
        IJavaProject javaProject = getJavaProject();
        if (javaProject != null) {
            dialog.setInitialSelections(new Object[] { javaProject });
        }
        if (dialog.open() == Window.OK) {
            return (IJavaProject) dialog.getFirstResult();
        }
        return null;
    }

    private IJavaProject getJavaProject() {
        String projectName = projText.getText().trim();
        if (projectName.length() < 1) {
            return null;
        }
        return JavaCore.create(getWorkspaceRoot()).getJavaProject(projectName);
    }

    private IWorkspaceRoot getWorkspaceRoot() {
        return ResourcesPlugin.getWorkspace().getRoot();
    }

    public Configurator getConfigurator() {
        return runtimeConfig;
    }

    public void setRuntimeConfig(Configurator runtimeConfig) {
        this.runtimeConfig = runtimeConfig;
    }

}
