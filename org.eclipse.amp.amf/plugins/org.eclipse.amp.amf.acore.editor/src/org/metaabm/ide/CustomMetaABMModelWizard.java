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
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.ISetSelectionTarget;
import org.metaabm.MetaABMFactory;
import org.metaabm.MetaABMPackage;
import org.metaabm.SContext;
import org.metaabm.SImplementationMode;
import org.metaabm.act.MetaABMActFactory;
import org.metaabm.act.provider.MetaABMActItemProviderAdapterFactory;
import org.metaabm.commands.AddAgentsActsCommand;
import org.metaabm.commands.AddImplementatedCommand;
import org.metaabm.function.provider.MetaABMFunctionItemProviderAdapterFactory;
import org.metaabm.provider.MetaABMItemProviderAdapterFactory;

/**
 * This is a simple wizard for creating a new model file. <!-- begin-user-doc
 * --> <!-- end-user-doc -->
 */
public class CustomMetaABMModelWizard extends Wizard implements INewWizard {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final String copyright = "";

    /**
     * This caches an instance of the model package. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected MetaABMPackage metaabmPackage = MetaABMPackage.eINSTANCE;

    /**
     * This caches an instance of the model factory. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected MetaABMFactory metaabmFactory = metaabmPackage.getMetaABMFactory();

    /**
     * This is the file creation page. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     */
    protected CustomModelWizardNewFileCreationPage newFileCreationPage;

    /**
     * This is the initial object creation page. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     */
    protected CustomModelWizardInitialObjectCreationPage contextPage;

    /**
     * Remember the selection during initialization for populating the default
     * container. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected IStructuredSelection selection;

    /**
     * Remember the workbench during initialization. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected IWorkbench workbench;

    /**
     * This just records the information. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    public void init(IWorkbench workbench, IStructuredSelection selection) {
        this.workbench = workbench;
        this.selection = selection;
        setWindowTitle(MetaABMModelerPlugin.INSTANCE.getString("_UI_Wizard_label"));
        setDefaultPageImageDescriptor(ExtendedImageRegistry.INSTANCE.getImageDescriptor(MetaABMModelerPlugin.INSTANCE
                        .getImage("full/wizban/MetaABMModelFile")));
    }

    /**
     * Create a new model. <!-- begin-user-doc --> <!-- end-user-doc -->
     */
    protected EObject createInitialModel() {
        List<AdapterFactory> factories = new ArrayList<AdapterFactory>();
        factories.add(new ResourceItemProviderAdapterFactory());
        factories.add(new MetaABMItemProviderAdapterFactory());
        factories.add(new MetaABMFunctionItemProviderAdapterFactory());
        MetaABMActItemProviderAdapterFactory metaabmActItemProviderAdapterFactory =
                        new MetaABMActItemProviderAdapterFactory();
        factories.add(metaabmActItemProviderAdapterFactory);
        factories.add(new ReflectiveItemProviderAdapterFactory());

        AdapterFactory adapterFactory = new ComposedAdapterFactory(factories);
        // Create the command stack that will notify this editor as commands are
        // executed.
        BasicCommandStack commandStack = new BasicCommandStack();
        EditingDomain domain =
                        new AdapterFactoryEditingDomain(adapterFactory, commandStack, new HashMap<Resource, Boolean>());

        SContext rootContext = MetaABMFactory.eINSTANCE.createSContext();
        // We need to do this "manually" for root-level context
        // todo consolidate in editor
        Command implCmd = new AddImplementatedCommand(domain, Collections.singleton(rootContext));
        domain.getCommandStack().execute(implCmd);
        domain.getCommandStack().execute(
                        SetCommand.create(domain, rootContext, MetaABMPackage.Literals.SACTABLE__ROOT_ACTIVITY,
                                        MetaABMActFactory.eINSTANCE.createAGroup()));
        Command actsCmd = new AddAgentsActsCommand(domain, null, Collections.singleton(rootContext));
        domain.getCommandStack().execute(actsCmd);
        Command setNameCmd =
                        SetCommand.create(domain, rootContext, MetaABMPackage.Literals.IID__LABEL, contextPage
                                        .getModelName());
        domain.getCommandStack().execute(setNameCmd);
        Command setBasePathCmd =
                        SetCommand.create(domain, rootContext.getImplementation(),
                                        MetaABMPackage.Literals.SIMPLEMENTATION__BASE_PATH, contextPage.getBaseDir());
        domain.getCommandStack().execute(setBasePathCmd);
        Command setPackage =
                        SetCommand.create(domain, rootContext.getImplementation(), MetaABMPackage.eINSTANCE
                                        .getSImplementation_Package(), contextPage.getPackage());
        domain.getCommandStack().execute(setPackage);
        Command setImplMode2 =
                        SetCommand.create(domain, rootContext.getImplementation(), MetaABMPackage.eINSTANCE
                                        .getSImplementation_Mode(), SImplementationMode
                                        .getByName(contextPage.getMode()));
        domain.getCommandStack().execute(setImplMode2);
        // Command setSrcCmd = SetCommand.create(domain,
        // rootContext.getImplementation(),
        // MetaABMPackage.eINSTANCE.getSImplementation_SrcDir(), "srcgen");
        // domain.getCommandStack().execute(setSrcCmd);
        // Command setBinCmd = SetCommand.create(domain,
        // rootContext.getImplementation(),
        // MetaABMPackage.eINSTANCE.getSImplementation_BinDir(), "bin");
        // domain.getCommandStack().execute(setBinCmd);
        // impl.setBasePath(contextPage.getBaseDir());
        // impl.setPackage(contextPage.getPackage());
        // impl.setMode(SImplementationMode.getByName(contextPage.getMode()));
        // ContextCommandHelper.setName(rootContext,
        // contextPage.getModelName());
        return rootContext;
    }

    /**
     * Do the work after everything is specified. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    public boolean performFinish() {
        try {
            // Remember the file.
            //
            final IFile modelFile = getModelFile();

            // Do the work within an operation.
            //
            WorkspaceModifyOperation operation = new WorkspaceModifyOperation() {
                @SuppressWarnings("unchecked")
                protected void execute(IProgressMonitor progressMonitor) {
                    try {
                        // Create a resource set
                        //
                        ResourceSet resourceSet = new ResourceSetImpl();

                        // Get the URI of the model file.
                        //
                        URI fileURI = URI.createPlatformResourceURI(modelFile.getFullPath().toString(), false);

                        // Create a resource for this file.
                        //
                        Resource resource = resourceSet.createResource(fileURI);

                        // Add the initial model object to the contents.
                        //
                        EObject rootObject = createInitialModel();
                        if (rootObject != null) {
                            resource.getContents().add(rootObject);
                        }

                        // Save the contents of the resource to the file system.
                        //
                        Map options = new HashMap();
                        options.put(XMLResource.OPTION_ENCODING, contextPage.getEncoding());
                        resource.save(options);
                    } catch (Exception exception) {
                        MetaABMModelerPlugin.INSTANCE.log(exception);
                    } finally {
                        progressMonitor.done();
                    }
                }
            };

            getContainer().run(false, false, operation);

            // Select the new file resource in the current view.
            //
            IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
            IWorkbenchPage page = workbenchWindow.getActivePage();
            final IWorkbenchPart activePart = page.getActivePart();
            if (activePart instanceof ISetSelectionTarget) {
                final ISelection targetSelection = new StructuredSelection(modelFile);
                getShell().getDisplay().asyncExec(new Runnable() {
                    public void run() {
                        ((ISetSelectionTarget) activePart).selectReveal(targetSelection);
                    }
                });
            }

            // Open an editor on the new file.
            //
            try {
                page.openEditor(new FileEditorInput(modelFile), workbench.getEditorRegistry().getDefaultEditor(
                                modelFile.getFullPath().toString()).getId());
            } catch (PartInitException exception) {
                MessageDialog.openError(workbenchWindow.getShell(), MetaABMModelerPlugin.INSTANCE
                                .getString("_UI_OpenEditorError_label"), exception.getMessage());
                return false;
            }

            return true;
        } catch (Exception exception) {
            MetaABMModelerPlugin.INSTANCE.log(exception);
            return false;
        }
    }

    /**
     * The framework calls this to create the contents of the wizard. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void addPages() {
        // Create a page, set the title, and the initial model file name.
        //
        newFileCreationPage = new CustomModelWizardNewFileCreationPage("metaABM Model Name", selection);
        newFileCreationPage.setTitle(MetaABMModelerPlugin.INSTANCE.getString("_UI_MetaABMModelWizard_label"));
        newFileCreationPage.setDescription(MetaABMModelerPlugin.INSTANCE
                        .getString("_UI_MetaABMModelWizard_description"));
        newFileCreationPage.setFileName(MetaABMModelerPlugin.INSTANCE.getString("_UI_MetaABMEditorFilenameDefaultBase")
                        + "." + MetaABMModelerPlugin.INSTANCE.getString("_UI_MetaABMEditorFilenameExtension"));
        addPage(newFileCreationPage);

        // Try and get the resource selection to determine a current directory
        // for the file dialog.
        //
        if (selection != null && !selection.isEmpty()) {
            // Get the resource...
            //
            Object selectedElement = selection.iterator().next();
            if (selectedElement instanceof IResource) {
                // Get the resource parent, if its a file.
                //
                IResource selectedResource = (IResource) selectedElement;
                if (selectedResource.getType() == IResource.FILE) {
                    selectedResource = selectedResource.getParent();
                }

                // This gives us a directory...
                //
                if (selectedResource instanceof IFolder || selectedResource instanceof IProject) {
                    // Set this for the container.
                    //
                    newFileCreationPage.setContainerFullPath(selectedResource.getFullPath());

                    // Make up a unique new name here.
                    //
                    String defaultModelBaseFilename =
                                    MetaABMModelerPlugin.INSTANCE.getString("_UI_MetaABMEditorFilenameDefaultBase");
                    String defaultModelFilenameExtension =
                                    MetaABMModelerPlugin.INSTANCE.getString("_UI_MetaABMEditorFilenameExtension");
                    String modelFilename = defaultModelBaseFilename + "." + defaultModelFilenameExtension;
                    for (int i = 1; ((IContainer) selectedResource).findMember(modelFilename) != null; ++i) {
                        modelFilename = defaultModelBaseFilename + i + "." + defaultModelFilenameExtension;
                    }
                    newFileCreationPage.setFileName(modelFilename);
                }
            }
        }
        contextPage = new CustomModelWizardInitialObjectCreationPage(this, "metaABM Model Setup");
        contextPage.setTitle(MetaABMModelerPlugin.INSTANCE.getString("_UI_MetaABMModelWizard_label"));
        contextPage.setDescription(MetaABMModelerPlugin.INSTANCE.getString("_UI_Wizard_initial_object_description"));
        addPage(contextPage);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     */
    public String getDefaultBaseDir() {
        return "";
    }

    /**
     * Get the file from the page. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public IFile getModelFile() {
        return newFileCreationPage.getModelFile();
    }
}
