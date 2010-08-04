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
 *   Metascape - Initial development and maintenance
 *
 * </copyright>
 */
package org.metaabm.provider;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandWrapper;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.CreateChildCommand;
import org.eclipse.emf.edit.command.DragAndDropCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

public class TransientGroupedItemProvider extends MetaABMItemProvider implements IEditingDomainItemProvider,
IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {

    public TransientGroupedItemProvider(AdapterFactory adapterFactory, EObject parent) {
        super(adapterFactory);
        parent.eAdapters().add(this);
    }

    public Object getParent(Object object) {
        return target;
    }

    public Collection<?> getChildren(Object object) {
        return super.getChildren(target);
    }

    public Collection<?> getNewChildDescriptors(Object object, EditingDomain editingDomain, Object sibling) {
        return super.getNewChildDescriptors(target, editingDomain, sibling);
    }

    public ResourceLocator getResourceLocator() {
        return MetaABMEditPlugin.INSTANCE;
    }

    public Command createCommand(final Object object, final EditingDomain domain,
            Class<? extends Command> commandClass, CommandParameter commandParameter) {

        if (commandClass != DragAndDropCommand.class) {
            commandParameter.setOwner(target);
        }

        return super.createCommand(target, domain, commandClass, commandParameter);

    }


    /**
     * This returns the description for {@link CreateChildCommand}.
     */
    public String getCreateChildDescription(Object owner, Object feature, Object child, Collection<?> selection) {
        if (feature instanceof EStructuralFeature && FeatureMapUtil.isFeatureMap((EStructuralFeature) feature)) {
            FeatureMap.Entry entry = (FeatureMap.Entry) child;
            feature = entry.getEStructuralFeature();
            child = entry.getValue();
        }

        String childType = feature instanceof EAttribute ? getTypeText((EAttribute) feature) : getTypeText(child);
        Object selectionObject = selection == null || selection.isEmpty() ? null : selection.iterator().next();

        if (selectionObject == owner) {
            return getResourceLocator()
            .getString("_UI_CreateChild_description",
                       new Object[] { childType, getFeatureText(feature), getTypeText(owner) });
        }

        Object sibling = selectionObject;
        Object siblingFeature = getChildFeature(owner, sibling);

        if (siblingFeature instanceof EStructuralFeature
                && FeatureMapUtil.isFeatureMap((EStructuralFeature) siblingFeature)) {
            FeatureMap.Entry entry = (FeatureMap.Entry) sibling;
            siblingFeature = entry.getEStructuralFeature();
            sibling = entry.getValue();
        }

        String siblingType = siblingFeature instanceof EAttribute ? getTypeText((EAttribute) siblingFeature)
            : getTypeText(sibling);
        return getResourceLocator().getString("_UI_CreateSibling_description",
                                              new Object[] { childType, getFeatureText(feature), siblingType });
    }

    protected Command createRemoveCommand(EditingDomain domain, EObject owner, EStructuralFeature feature,
            Collection<?> collection) {
        return createWrappedCommand(super.createRemoveCommand(domain, owner, feature, collection), owner);
    }

    protected Command createAddCommand(EditingDomain domain, EObject owner, EStructuralFeature feature,
            Collection<?> collection, int index) {
        return createWrappedCommand(super.createAddCommand(domain, owner, feature, collection, index), owner);
    }

    protected Command createWrappedCommand(Command command, final EObject owner) {
        return new CommandWrapper(command) {
            @SuppressWarnings("unchecked")
            public Collection<?> getAffectedObjects() {
                Collection<Object> affected = (Collection<Object>) super.getAffectedObjects();
                if (affected.contains(owner)) {
                    // gack..java generics strikes again..
                    affected = Collections.singleton((Object) TransientGroupedItemProvider.this);
                }
                return affected;
            }
        };
    }
}
