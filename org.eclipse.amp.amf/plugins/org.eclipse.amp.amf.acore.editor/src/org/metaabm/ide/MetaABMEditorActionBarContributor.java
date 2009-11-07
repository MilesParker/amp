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
import java.util.List;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.ui.viewer.IViewerProvider;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.ui.action.ControlAction;
import org.eclipse.emf.edit.ui.action.CreateChildAction;
import org.eclipse.emf.edit.ui.action.CreateSiblingAction;
import org.eclipse.emf.edit.ui.action.EditingDomainActionBarContributor;
import org.eclipse.emf.edit.ui.action.LoadResourceAction;
import org.eclipse.emf.edit.ui.action.ValidateAction;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.IContributionManager;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.action.SubContributionItem;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PartInitException;
import org.metaabm.IID;
import org.metaabm.MetaABMPackage;
import org.metaabm.SAgent;
import org.metaabm.SAttribute;
import org.metaabm.act.MetaABMActPackage;

/**
 * This is the action bar contributor for the MetaABM model editor. <!--
 * begin-user-doc -->
 * 
 * @author Miles Parker * <!-- end-user-doc -->
 * @generated
 */
public class MetaABMEditorActionBarContributor extends EditingDomainActionBarContributor implements
ISelectionChangedListener {
    /**
     * This keeps track of the active editor. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    protected IEditorPart activeEditorPart;

    /**
     * This keeps track of the current selection provider. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected ISelectionProvider selectionProvider;

    /**
     * This action opens the Properties view. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    protected IAction showPropertiesViewAction =
        new Action(MetaModelerPlugin.INSTANCE.getString("_UI_ShowPropertiesView_menu_item")) {
        @Override
        public void run() {
            try {
                getPage().showView("org.eclipse.ui.views.PropertySheet");
            } catch (PartInitException exception) {
                MetaModelerPlugin.INSTANCE.log(exception);
            }
        }
    };

    /**
     * This action refreshes the viewer of the current editor if the editor
     * implements {@link org.eclipse.emf.common.ui.viewer.IViewerProvider}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected IAction refreshViewerAction =
        new Action(MetaModelerPlugin.INSTANCE.getString("_UI_RefreshViewer_menu_item")) {
        @Override
        public boolean isEnabled() {
            return activeEditorPart instanceof IViewerProvider;
        }

        @Override
        public void run() {
            if (activeEditorPart instanceof IViewerProvider) {
                Viewer viewer = ((IViewerProvider) activeEditorPart).getViewer();
                if (viewer != null) {
                    viewer.refresh();
                }
            }
        }
    };

    /**
     * This action applies default values to selected attributes
     */
    protected IAction assignDefaultValuesAction = new Action("Assign Default Values") {
        @Override
        public boolean isEnabled() {
            if (selectionProvider != null) {
                ISelection selection = selectionProvider.getSelection();
                if (selection instanceof IStructuredSelection) {
                    List<?> l = ((IStructuredSelection) selection).toList();
                    for (Object object : l) {
                        if (object instanceof SAttribute) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        @Override
        public void run() {
            InputDialog d =
                new InputDialog(null, "Assign Default", "Value to apply to selected attributes:", "0.0",
                                null);
            d.open();
            String value = d.getValue();
            ISelection selection = selectionProvider.getSelection();
            if (selection instanceof IStructuredSelection) {
                List<?> l = ((IStructuredSelection) selection).toList();
                CompoundCommand cmd = new CompoundCommand();
                EditingDomain domain = ((MetaABMEditor) activeEditorPart).getEditingDomain();
                for (Object object : l) {
                    if (object instanceof SAttribute) {
                        cmd.append(SetCommand.create(domain, object, MetaABMPackage.Literals.SATTRIBUTE__DEFAULT_VALUE,
                                                     value));
                    }
                }
                domain.getCommandStack().execute(cmd);
            }
        }
    };

    /**
     * This action applies default values to selected attributes
     */
    protected IAction toggleStatsAction = new Action("Toggle Gather Data") {
        @Override
        public boolean isEnabled() {
            if (selectionProvider != null) {
                ISelection selection = selectionProvider.getSelection();
                if (selection instanceof IStructuredSelection) {
                    List<?> l = ((IStructuredSelection) selection).toList();
                    for (Object object : l) {
                        if (object instanceof SAttribute) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        @Override
        public void run() {
            ISelection selection = selectionProvider.getSelection();
            if (selection instanceof IStructuredSelection) {
                List<?> l = ((IStructuredSelection) selection).toList();
                CompoundCommand cmd = new CompoundCommand();
                EditingDomain domain = ((MetaABMEditor) activeEditorPart).getEditingDomain();
                for (Object object : l) {
                    if (object instanceof SAttribute) {
                        cmd.append(SetCommand.create(domain, object, MetaABMPackage.Literals.SATTRIBUTE__GATHER_DATA,
                                                     !((SAttribute) object).isGatherData()));
                    }
                }
                domain.getCommandStack().execute(cmd);
            }
        }
    };

    /**
     * This will contain one
     * {@link org.eclipse.emf.edit.ui.action.CreateChildAction} corresponding to
     * each descriptor generated for the current selection by the item provider.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected Collection<IAction> createChildActions;

    protected Collection<IAction> createChildTargetActions;

    /**
     * This is the menu manager into which menu contribution items should be
     * added for CreateChild actions. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     */
    protected IMenuManager createChildMenuManager;

    protected IMenuManager createChildTargetMenuManager;

    /**
     * This will contain one
     * {@link org.eclipse.emf.edit.ui.action.CreateSiblingAction} corresponding
     * to each descriptor generated for the current selection by the item
     * provider. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    // protected Collection<IAction> createSiblingActions;
    //
    // protected Collection<IAction> createSiblingTargetActions;

    protected Collection<IAction> otherActions;

    /**
     * This is the menu manager into which menu contribution items should be
     * added for CreateSibling actions. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    // protected IMenuManager createSiblingMenuManager;
    //
    // protected IMenuManager createSiblingTargetMenuManager;

    private IMenuManager submenuManager;

    /**
     * This creates an instance of the contributor. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    public MetaABMEditorActionBarContributor() {
        super(ADDITIONS_LAST_STYLE);
        loadResourceAction = new LoadResourceAction();
        validateAction = new ValidateAction();
        controlAction = new ControlAction();
    }

    /**
     * This adds Separators for editor additions to the tool bar. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void contributeToToolBar(IToolBarManager toolBarManager) {
        toolBarManager.add(new Separator("metaabm-settings"));
        toolBarManager.add(new Separator("metaabm-additions"));
    }

    /**
     * This adds to the menu bar a menu and some separators for editor
     * additions, as well as the sub-menus for object creation items. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    @Override
    public void contributeToMenu(IMenuManager menuManager) {
        super.contributeToMenu(menuManager);

        submenuManager = new MenuManager(MetaABMModelerPlugin.INSTANCE.getString("_UI_MetaABMEditor_menu"),
        "org.metaabmMenuID");
        menuManager.insertAfter("additions", getSubmenuManager());
        submenuManager.add(new Separator("settings"));
        submenuManager.add(new Separator("actions"));
        submenuManager.add(new Separator("additions"));
        submenuManager.add(new Separator("additions-end"));

        // Prepare for CreateChild item addition or removal.
        //
        createChildTargetMenuManager =
            new MenuManager(MetaABMModelerPlugin.INSTANCE.getString("_UI_CreateChildTarget_menu_item"));
        submenuManager.insertBefore("additions", createChildTargetMenuManager);
        createChildMenuManager = new MenuManager(MetaABMModelerPlugin.INSTANCE.getString("_UI_CreateChild_menu_item"));
        submenuManager.insertBefore("additions", createChildMenuManager);

        // Prepare for CreateSibling item addition or removal.
        //
        // createSiblingTargetMenuManager =
        // new MenuManager(MetaABMModelerPlugin.INSTANCE.getString("_UI_CreateSiblingTarget_menu_item"));
        // submenuManager.insertBefore("additions", createSiblingTargetMenuManager);
        // createSiblingMenuManager =
        // new MenuManager(MetaABMModelerPlugin.INSTANCE.getString("_UI_CreateSibling_menu_item"));
        // submenuManager.insertBefore("additions", createSiblingMenuManager);

        // otherManager = new
        // MenuManager(MetaABMModelerPlugin.INSTANCE.getString(
        // "_UI_Other_menu_item"));
        // submenuManager.insertBefore("additions", otherManager);

        // otherActions = new ArrayList<IAction>();
        // otherActions.add(importFromClassAction);
        // otherActions.add(cleanupAction);
        // submenuManager.insertBefore("additions", importFromClassAction);
        // submenuManager.insertBefore("additions", cleanupAction);
        //
        submenuManager.addMenuListener(new IMenuListener() {
            public void menuAboutToShow(IMenuManager menuManager) {
                menuManager.updateAll(true);
            }
        });

        addGlobalActions(submenuManager);
    }

    /**
     * When the active editor changes, this remembers the change and registers
     * with it as a selection provider. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setActiveEditor(IEditorPart part) {
        super.setActiveEditor(part);
        activeEditorPart = part;

        // Switch to the new selection provider.
        //
        if (selectionProvider != null) {
            selectionProvider.removeSelectionChangedListener(this);
        }
        if (part == null) {
            selectionProvider = null;
        } else {
            selectionProvider = part.getSite().getSelectionProvider();
            selectionProvider.addSelectionChangedListener(this);

            // Fake a selection changed event to update the menus.
            //
            if (selectionProvider.getSelection() != null) {
                selectionChanged(new SelectionChangedEvent(selectionProvider, selectionProvider.getSelection()));
            }
        }
    }

    /**
     * This implements
     * {@link org.eclipse.jface.viewers.ISelectionChangedListener}, handling
     * {@link org.eclipse.jface.viewers.SelectionChangedEvent}s by querying for
     * the children and siblings that can be added to the selected object and
     * updating the menus accordingly. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated NOT
     */
    public void selectionChanged(SelectionChangedEvent event) {
        // Remove any menu items for old selection.
        //
        if (createChildMenuManager != null) {
            depopulateManager(createChildMenuManager, createChildActions);
        }
        if (createChildTargetMenuManager != null) {
            depopulateManager(createChildTargetMenuManager, createChildActions);
        }
        // if (createSiblingMenuManager != null) {
        // depopulateManager(createSiblingMenuManager, createSiblingActions);
        // }
        // if (createSiblingTargetMenuManager != null) {
        // depopulateManager(createSiblingTargetMenuManager, createSiblingActions);
        // }

        // Query the new selection for appropriate new child/sibling descriptors
        //
        Collection<?> newChildDescriptors = null;
        Collection<CommandParameter> newChildTargetDescriptors = new ArrayList<CommandParameter>();
        Collection<?> newSiblingDescriptors = null;
        Collection<CommandParameter> newSiblingTargetDescriptors = new ArrayList<CommandParameter>();

        ISelection selection = event.getSelection();
        if (selection instanceof IStructuredSelection && ((IStructuredSelection) selection).size() == 1) {
            Object object = ((IStructuredSelection) selection).getFirstElement();

            EditingDomain domain = ((IEditingDomainProvider) activeEditorPart).getEditingDomain();

            newChildDescriptors = domain.getNewChildDescriptors(object, null);
            newSiblingDescriptors = domain.getNewChildDescriptors(null, object);
            moveTargetDescriptors(newChildDescriptors, newChildTargetDescriptors);
            moveTargetDescriptors(newSiblingDescriptors, newSiblingTargetDescriptors);
        }

        // Generate actions for selection; populate and redraw the menus.
        //
        createChildActions = generateCreateChildActions(newChildDescriptors, selection);
        createChildTargetActions = generateCreateChildActions(newChildTargetDescriptors, selection);
        // createSiblingActions = generateCreateSiblingActions(newSiblingDescriptors, selection);
        // createSiblingTargetActions = generateCreateSiblingActions(newSiblingTargetDescriptors, selection);

        populateAndUpdate(createChildMenuManager, createChildActions);
        populateAndUpdate(createChildTargetMenuManager, createChildTargetActions);
        // populateAndUpdate(createSiblingMenuManager, createSiblingActions);
        // populateAndUpdate(createSiblingTargetMenuManager, createSiblingTargetActions);

        // otherActions = new ArrayList<IAction>();
        // otherActions.add(importFromClassAction);
        // otherActions.add(cleanupAction);
        // if (importFromClassAction.isEnabled()) {
        // populateAndUpdate(submenuManager, otherActions);
        // } else {
        // depopulateManager(submenuManager, otherActions);
        // }
    }

    private void moveTargetDescriptors(Collection<?> memberDescriptors, Collection<CommandParameter> targetDescriptors) {
        for (Object object : memberDescriptors) {
            CommandParameter cmd = (CommandParameter) object;
            if (cmd.feature == MetaABMActPackage.Literals.AACT__TARGETS) {
                targetDescriptors.add(cmd);
            }
        }
        memberDescriptors.removeAll(targetDescriptors);
    }

    private void populateAndUpdate(IMenuManager manager, Collection<IAction> memberActions) {
        manager.removeAll();
        if (manager != null && memberActions.size() > 0) {
            populateManager(manager, memberActions, null);
            manager.update(true);
        }
    }

    /**
     * This generates a {@link org.eclipse.emf.edit.ui.action.CreateChildAction}
     * for each object in <code>descriptors</code>, and returns the collection
     * of these actions. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected Collection<IAction> generateCreateChildActions(Collection<?> descriptors, ISelection selection) {
        Collection<IAction> actions = new ArrayList<IAction>();
        if (descriptors != null) {
            for (Object descriptor : descriptors) {
                actions.add(new CreateChildAction(activeEditorPart, selection, descriptor));
            }
        }
        return actions;
    }

    /**
     * This generates a
     * {@link org.eclipse.emf.edit.ui.action.CreateSiblingAction} for each
     * object in <code>descriptors</code>, and returns the collection of these
     * actions. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected Collection<IAction> generateCreateSiblingActions(Collection<?> descriptors, ISelection selection) {
        Collection<IAction> actions = new ArrayList<IAction>();
        if (descriptors != null) {
            for (Object descriptor : descriptors) {
                actions.add(new CreateSiblingAction(activeEditorPart, selection, descriptor));
            }
        }
        return actions;
    }

    /**
     * This populates the specified <code>manager</code> with
     * {@link org.eclipse.jface.action.ActionContributionItem}s based on the
     * {@link org.eclipse.jface.action.IAction}s contained in the
     * <code>actions</code> collection, by inserting them before the specified
     * contribution item <code>contributionID</code>. If
     * <code>contributionID</code> is <code>null</code>, they are simply added.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void populateManager(IContributionManager manager, Collection<? extends IAction> actions,
            String contributionID) {
        if (actions != null) {
            for (IAction action : actions) {
                if (contributionID != null) {
                    manager.insertBefore(contributionID, action);
                } else {
                    manager.add(action);
                }
            }
        }
    }

    /**
     * This removes from the specified <code>manager</code> all
     * {@link org.eclipse.jface.action.ActionContributionItem}s based on the
     * {@link org.eclipse.jface.action.IAction}s contained in the
     * <code>actions</code> collection. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    protected void depopulateManager(IContributionManager manager, Collection<? extends IAction> actions) {
        if (actions != null) {
            IContributionItem[] items = manager.getItems();
            for (int i = 0; i < items.length; i++) {
                // Look into SubContributionItems
                //
                IContributionItem contributionItem = items[i];
                while (contributionItem instanceof SubContributionItem) {
                    contributionItem = ((SubContributionItem) contributionItem).getInnerItem();
                }

                // Delete the ActionContributionItems with matching action.
                //
                if (contributionItem instanceof ActionContributionItem) {
                    IAction action = ((ActionContributionItem) contributionItem).getAction();
                    if (actions.contains(action)) {
                        manager.remove(contributionItem);
                    }
                }
            }
        }
    }

    /**
     * This populates the pop-up menu before it appears. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    @Override
    public void menuAboutToShow(IMenuManager menuManager) {
        Object sel = null;
        MetaABMEditor editor = (MetaABMEditor) getActiveEditor();
        if (editor != null) {
            ISelection selection = editor.getSelection();
            if (selection instanceof StructuredSelection) {
                sel = ((StructuredSelection) selection).getFirstElement();
            }
        }
        // Add our standard marker.
        //
        if ((style & ADDITIONS_LAST_STYLE) == 0) {
            menuManager.add(new Separator("additions"));
        }
        menuManager.add(new Separator("edit"));

        // Add the edit menu actions.
        //
        menuManager.add(new ActionContributionItem(undoAction));
        menuManager.add(new ActionContributionItem(redoAction));
        menuManager.add(new Separator());
        menuManager.add(new ActionContributionItem(cutAction));
        menuManager.add(new ActionContributionItem(copyAction));
        menuManager.add(new ActionContributionItem(pasteAction));
        menuManager.add(new Separator());
        menuManager.add(new ActionContributionItem(deleteAction));
        menuManager.add(new Separator());

        if ((style & ADDITIONS_LAST_STYLE) != 0) {
            menuManager.add(new Separator("additions"));
            menuManager.add(new Separator());
        }
        // Add our other standard marker.
        //
        menuManager.add(new Separator("additions-end"));
        menuManager.insertAfter("additions-end", new Separator("ui-actions"));
        menuManager.insertAfter("ui-actions", showPropertiesViewAction);
        // refreshViewerAction.setEnabled(refreshViewerAction.isEnabled());
        // menuManager.insertAfter("ui-actions", refreshViewerAction);
        if (getActiveEditor() != null && editor.getViewer() != null) {
            addItemsFor(menuManager, sel);
        }

        if (!(sel instanceof IID)) {
            addGlobalActions(menuManager);
        }

        prepareMenu(menuManager, createChildActions, "_UI_CreateChild_menu_item");
        prepareMenu(menuManager, createChildTargetActions, "_UI_CreateChildTarget_menu_item");
        // prepareMenu(menuManager, createSiblingActions, "_UI_CreateSibling_menu_item");
        // prepareMenu(menuManager, createSiblingTargetActions, "_UI_CreateSiblingTarget_menu_item");
        prepareMenu(menuManager, otherActions, "_UI_Other_menu_item");
    }

    protected void addItemsFor(IMenuManager menuManager, Object sel) {
        if (sel instanceof SAgent) {
            menuManager.insertAfter("ui-actions", ((MetaABMEditor) activeEditor).getImportFromClassAction());
            selectionProvider.addSelectionChangedListener(((MetaABMEditor) activeEditor).getImportFromClassAction());
        }
    }

    protected void prepareMenu(IMenuManager menuManager, Collection<? extends IAction> actions, String menuID) {
        MenuManager submenuManager;
        submenuManager = new MenuManager(MetaABMModelerPlugin.INSTANCE.getString(menuID));
        populateManager(submenuManager, actions, null);
        menuManager.insertBefore("edit", submenuManager);
    }

    /**
     * This inserts global actions before the "additions-end" separator. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    @Override
    protected void addGlobalActions(IMenuManager menuManager) {
        menuManager.insertAfter("additions-end", new Separator("ui-actions"));
        menuManager.insertAfter("ui-actions", showPropertiesViewAction);

        refreshViewerAction.setEnabled(refreshViewerAction.isEnabled());
        menuManager.insertAfter("ui-actions", refreshViewerAction);

        assignDefaultValuesAction.setEnabled(assignDefaultValuesAction.isEnabled());
        menuManager.insertAfter("ui-actions", assignDefaultValuesAction);

        toggleStatsAction.setEnabled(toggleStatsAction.isEnabled());
        menuManager.insertAfter("ui-actions", toggleStatsAction);

        super.addGlobalActions(menuManager);
    }

    /**
     * This ensures that a delete action will clean up all references to deleted
     * objects. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected boolean removeAllReferencesOnDelete() {
        return true;
    }

    public IMenuManager getSubmenuManager() {
        return submenuManager;
    }

}
