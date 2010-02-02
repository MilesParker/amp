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
import org.metaabm.act.AAll;
import org.metaabm.act.ABuild;
import org.metaabm.act.ABuildProjection;
import org.metaabm.act.ACommand;
import org.metaabm.act.ACreateAgents;
import org.metaabm.act.AEvaluate;
import org.metaabm.act.AGroup;
import org.metaabm.act.ALogic;
import org.metaabm.act.AQuery;
import org.metaabm.act.ASelect;
import org.metaabm.act.MetaABMActPackage;

/**
 * This is the action bar contributor for the MetaABM model editor. <!-- begin-user-doc -->
 * 
 * @author Miles Parker * <!-- end-user-doc -->
 * @generated
 */
public class MetaABMEditorActionBarContributor extends EditingDomainActionBarContributor implements
ISelectionChangedListener {
    /**
     * This keeps track of the active editor. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected IEditorPart activeEditorPart;

    /**
     * This keeps track of the current selection provider. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected ISelectionProvider selectionProvider;

    /**
     * This action opens the Properties view. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected IAction showPropertiesViewAction = new Action(MetaModelerPlugin.INSTANCE
                                                            .getString("_UI_ShowPropertiesView_menu_item")) {
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
     * This action refreshes the viewer of the current editor if the editor implements
     * {@link org.eclipse.emf.common.ui.viewer.IViewerProvider}. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected IAction refreshViewerAction = new Action(MetaModelerPlugin.INSTANCE
                                                       .getString("_UI_RefreshViewer_menu_item")) {
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
            InputDialog d = new InputDialog(null, "Assign Default", "Value to apply to selected attributes:", "0.0",
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
     * This will contain one {@link org.eclipse.emf.edit.ui.action.CreateChildAction} corresponding to each descriptor
     * generated for the current selection by the item provider. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected Collection<IAction> createChildActions;

    protected Collection<IAction> createSelectTargetActions;
    protected Collection<IAction> createCommandTargetActions;
    protected Collection<IAction> createBuildTargetActions;
    protected Collection<IAction> createOtherTargetActions;

    /**
     * This is the menu manager into which menu contribution items should be added for CreateChild actions. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected IMenuManager createChildMenuManager;

    private MenuManager createSelectTargetMenuManager;

    private MenuManager createCommandTargetMenuManager;

    private MenuManager createBuildTargetMenuManager;

    protected IMenuManager createOtherTargetMenuManager;

    protected Collection<IAction> otherActions;

    private IMenuManager submenuManager;

    private IMenuManager createTargetMenuManager;

    /**
     * This creates an instance of the contributor. <!-- begin-user-doc --> <!-- end-user-doc -->
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
     * This adds Separators for editor additions to the tool bar. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void contributeToToolBar(IToolBarManager toolBarManager) {
        toolBarManager.add(new Separator("metaabm-settings"));
        toolBarManager.add(new Separator("metaabm-additions"));
    }

    /**
     * This adds to the menu bar a menu and some separators for editor additions, as well as the sub-menus for object
     * creation items. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    @Override
    public void contributeToMenu(IMenuManager menuManager) {
        super.contributeToMenu(menuManager);

        submenuManager = new MenuManager(MetaABMModelerPlugin.INSTANCE.getString("_UI_MetaABMEditor_menu"),
        "org.metaabmMenuID");
        menuManager.insertAfter("additions", submenuManager);
        submenuManager.add(new Separator("settings"));
        submenuManager.add(new Separator("actions"));
        submenuManager.add(new Separator("additions"));
        submenuManager.add(new Separator("additions-end"));

        createTargetMenuManager = new MenuManager(MetaABMModelerPlugin.INSTANCE.getString("_UI_CreateTarget_menu"),
                                                  null);
        submenuManager.insertBefore("additions", createTargetMenuManager);
        createTargetMenuManager.add(new Separator("additions"));

        // Prepare for CreateChild item addition or removal.
        //
        createSelectTargetMenuManager = new MenuManager(MetaABMModelerPlugin.INSTANCE
                                                        .getString("_UI_CreateSelect_menu_item"));
        createTargetMenuManager.insertBefore("additions", createSelectTargetMenuManager);
        createBuildTargetMenuManager = new MenuManager(MetaABMModelerPlugin.INSTANCE
                                                       .getString("_UI_CreateBuild_menu_item"));
        createTargetMenuManager.insertBefore("additions", createBuildTargetMenuManager);
        createCommandTargetMenuManager = new MenuManager(MetaABMModelerPlugin.INSTANCE
                                                         .getString("_UI_CreateCommand_menu_item"));
        createTargetMenuManager.insertBefore("additions", createCommandTargetMenuManager);
        createOtherTargetMenuManager = new MenuManager(MetaABMModelerPlugin.INSTANCE
                                                       .getString("_UI_CreateOther_menu_item"));
        createTargetMenuManager.insertBefore("additions", createOtherTargetMenuManager);

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
     * When the active editor changes, this remembers the change and registers with it as a selection provider. <!--
     * begin-user-doc --> <!-- end-user-doc -->
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
     * This implements {@link org.eclipse.jface.viewers.ISelectionChangedListener}, handling
     * {@link org.eclipse.jface.viewers.SelectionChangedEvent}s by querying for the children and siblings that can be
     * added to the selected object and updating the menus accordingly. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    public void selectionChanged(SelectionChangedEvent event) {
        // Remove any menu items for old selection.
        //
        if (createChildMenuManager != null) {
            depopulateManager(createChildMenuManager, createChildActions);
        }
        if (createOtherTargetMenuManager != null) {
            depopulateManager(createSelectTargetMenuManager, createChildActions);
            depopulateManager(createCommandTargetMenuManager, createChildActions);
            depopulateManager(createBuildTargetMenuManager, createChildActions);
            depopulateManager(createOtherTargetMenuManager, createChildActions);
        }
        // if (createSiblingMenuManager != null) {
        // depopulateManager(createSiblingMenuManager, createSiblingActions);
        // }
        // if (createSiblingTargetMenuManager != null) {
        // depopulateManager(createSiblingTargetMenuManager, createSiblingActions);
        // }

        // Query the new selection for appropriate new child/sibling descriptors
        //
        Collection<?> newChildDescriptors = new ArrayList<CommandParameter>();
        List<CommandParameter> selectTargetDescriptors = new ArrayList<CommandParameter>();
        Collection<CommandParameter> commandTargetDescriptors = new ArrayList<CommandParameter>();
        Collection<CommandParameter> buildTargetDescriptors = new ArrayList<CommandParameter>();
        Collection<CommandParameter> otherTargetDescriptors = new ArrayList<CommandParameter>();
        // Collection<?> newSiblingDescriptors = null;
        // Collection<CommandParameter> newSiblingTargetDescriptors = new ArrayList<CommandParameter>();

        ISelection selection = event.getSelection();
        if (selection instanceof IStructuredSelection && ((IStructuredSelection) selection).size() == 1) {
            Object object = ((IStructuredSelection) selection).getFirstElement();

            EditingDomain domain = ((IEditingDomainProvider) activeEditorPart).getEditingDomain();

            newChildDescriptors = domain.getNewChildDescriptors(object, null);
            List<CommandParameter> movedChildDescriptors = new ArrayList<CommandParameter>();
            // newSiblingDescriptors = domain.getNewChildDescriptors(null, object);

            CommandParameter select = null;
            CommandParameter query = null;
            CommandParameter intersect = null;
            for (Object descriptor : newChildDescriptors) {
                CommandParameter cmd = (CommandParameter) descriptor;
                if (cmd.feature == MetaABMActPackage.Literals.AACT__TARGETS) {
                    movedChildDescriptors.add(cmd);
                    if (cmd.getValue() instanceof AGroup) {
                        // ignore..
                    } else if (cmd.getValue() instanceof ABuild || cmd.getValue() instanceof ACreateAgents
                            || cmd.getValue() instanceof ABuildProjection) {
                        buildTargetDescriptors.add(cmd);
                    } else if (cmd.getValue() instanceof ACommand || cmd.getValue() instanceof AEvaluate) {
                        commandTargetDescriptors.add(cmd);
                    } else if (cmd.getValue() instanceof ASelect || cmd.getValue() instanceof AQuery
                            || cmd.getValue() instanceof ALogic) {
                        selectTargetDescriptors.add(cmd);
                        if (cmd.getValue() instanceof ASelect) {
                            select = cmd;
                        } else if (cmd.getValue() instanceof AQuery) {
                            query = cmd;
                        } else if (cmd.getValue() instanceof AAll) {
                            intersect = cmd;
                        }
                    } else {
                        otherTargetDescriptors.add(cmd);
                    }
                }
            }
            newChildDescriptors.removeAll(movedChildDescriptors);

            // this is silly but whatever works..we need to re-order select menu
            if (select != null) {
                selectTargetDescriptors.remove(select);
                selectTargetDescriptors.add(0, select);
            }
            if (query != null) {
                selectTargetDescriptors.remove(query);
                selectTargetDescriptors.add(1, query);
            }
            if (intersect != null) {
                selectTargetDescriptors.remove(intersect);
                selectTargetDescriptors.add(2, intersect);
            }
        }

        // Generate actions for selection; populate and redraw the menus.
        //
        createChildActions = generateCreateChildActions(newChildDescriptors, selection);
        createSelectTargetActions = generateCreateChildActions(selectTargetDescriptors, selection);
        createCommandTargetActions = generateCreateChildActions(commandTargetDescriptors, selection);
        createBuildTargetActions = generateCreateChildActions(buildTargetDescriptors, selection);
        createOtherTargetActions = generateCreateChildActions(otherTargetDescriptors, selection);
        // createSiblingActions = generateCreateSiblingActions(newSiblingDescriptors, selection);
        // createSiblingTargetActions = generateCreateSiblingActions(newSiblingTargetDescriptors, selection);

        populateAndUpdate(createChildMenuManager, createChildActions);
        populateAndUpdate(createSelectTargetMenuManager, createSelectTargetActions);
        populateAndUpdate(createCommandTargetMenuManager, createCommandTargetActions);
        populateAndUpdate(createBuildTargetMenuManager, createBuildTargetActions);
        populateAndUpdate(createOtherTargetMenuManager, createOtherTargetActions);
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

    // private void moveTargetDescriptors(Collection<?> memberDescriptors, Collection<CommandParameter>
    // targetDescriptors) {
    // for (Object object : memberDescriptors) {
    // CommandParameter cmd = (CommandParameter) object;
    // if (cmd.feature == MetaABMActPackage.Literals.AACT__TARGETS) {
    // targetDescriptors.add(cmd);
    // }
    // }
    // memberDescriptors.removeAll(targetDescriptors);
    // }

    private void populateAndUpdate(IMenuManager manager, Collection<IAction> memberActions) {
        manager.removeAll();
        if (manager != null && memberActions.size() > 0) {
            populateManager(manager, memberActions, null);
            manager.update(true);
        }
    }

    /**
     * This generates a {@link org.eclipse.emf.edit.ui.action.CreateChildAction} for each object in
     * <code>descriptors</code>, and returns the collection of these actions. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
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
     * This generates a {@link org.eclipse.emf.edit.ui.action.CreateSiblingAction} for each object in
     * <code>descriptors</code>, and returns the collection of these actions. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
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
     * This populates the specified <code>manager</code> with {@link org.eclipse.jface.action.ActionContributionItem}s
     * based on the {@link org.eclipse.jface.action.IAction}s contained in the <code>actions</code> collection, by
     * inserting them before the specified contribution item <code>contributionID</code>. If <code>contributionID</code>
     * is <code>null</code>, they are simply added. <!-- begin-user-doc --> <!-- end-user-doc -->
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
     * This removes from the specified <code>manager</code> all {@link org.eclipse.jface.action.ActionContributionItem}s
     * based on the {@link org.eclipse.jface.action.IAction}s contained in the <code>actions</code> collection. <!--
     * begin-user-doc --> <!-- end-user-doc -->
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
     * This populates the pop-up menu before it appears. <!-- begin-user-doc --> <!-- end-user-doc -->
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

        prepareMenu(menuManager, createChildActions, "_UI_CreateChild_menu_item", "edit");
        MenuManager submenuManager;
        submenuManager = new MenuManager(MetaABMModelerPlugin.INSTANCE.getString("_UI_CreateTarget_menu"));
        menuManager.insertBefore("edit", submenuManager);
        submenuManager.add(new Separator("additions"));
        prepareMenu(submenuManager, createSelectTargetActions, "_UI_CreateSelect_menu_item", "additions");
        prepareMenu(submenuManager, createCommandTargetActions, "_UI_CreateCommand_menu_item", "additions");
        prepareMenu(submenuManager, createBuildTargetActions, "_UI_CreateBuild_menu_item", "additions");
        prepareMenu(submenuManager, createOtherTargetActions, "_UI_CreateOther_menu_item", "additions");
        // prepareMenu(menuManager, createSiblingActions, "_UI_CreateSibling_menu_item");
        // prepareMenu(menuManager, createSiblingTargetActions, "_UI_CreateSiblingTarget_menu_item");
        prepareMenu(menuManager, otherActions, "_UI_Other_menu_item", "additions");
    }

    protected void addItemsFor(IMenuManager menuManager, Object sel) {
        if (sel instanceof SAgent) {
            menuManager.insertAfter("ui-actions", ((MetaABMEditor) activeEditor).getImportFromClassAction());
            selectionProvider.addSelectionChangedListener(((MetaABMEditor) activeEditor).getImportFromClassAction());
        }
    }

    protected void prepareMenu(IMenuManager menuManager, Collection<? extends IAction> actions, String menuID,
            String seperator) {
        MenuManager submenuManager;
        submenuManager = new MenuManager(MetaABMModelerPlugin.INSTANCE.getString(menuID));
        populateManager(submenuManager, actions, null);
        menuManager.insertBefore(seperator, submenuManager);
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
     * This ensures that a delete action will clean up all references to deleted objects. <!-- begin-user-doc --> <!--
     * end-user-doc -->
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
