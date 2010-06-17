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

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.metaabm.MetaABMFactory;
import org.metaabm.MetaABMPackage;
import org.metaabm.SAgent;
import org.metaabm.SAttribute;
import org.metaabm.SAttributed;
import org.metaabm.act.AAct;
import org.metaabm.act.ADerive;
import org.metaabm.act.AGroup;

public class AttributesItemProvider extends TransientGroupedItemProvider {

    public AttributesItemProvider(AdapterFactory adapterFactory, EObject parent) {
        super(adapterFactory, parent);
        // TODO Auto-generated constructor stub
    }

    public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
        if (childrenFeatures == null) {
            super.getChildrenFeatures(object);
            childrenFeatures.add(MetaABMPackage.Literals.SATTRIBUTED__ATTRIBUTES);
        }
        return childrenFeatures;
    }

    public String getText(Object object) {
        return "Attributes";
    }

    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/SAttributes"));
    }

    public void notifyChanged(Notification notification) {
        updateChildren(notification);
        switch (notification.getFeatureID(SAttributed.class)) {
            case MetaABMPackage.SATTRIBUTED__ATTRIBUTES:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, true));
                SAttribute attr = (SAttribute) notification.getOldValue();
                if (attr != null) {
                    fireNotifyChanged(new ViewerNotification(notification, attr, true, true));
                    for (EObject value : attr.getAccessors()) {
                        fireNotifyChanged(new ViewerNotification(notification, value, true, true));
                    }
                }
                return;
        }
    }

    protected Command createRemoveCommand(EditingDomain domain, EObject owner, EStructuralFeature feature,
            Collection<?> collection) {
        if (feature == MetaABMPackage.Literals.SATTRIBUTED__ATTRIBUTES) {
            Collection<AAct> derived = new ArrayList<AAct>();
            for (Object object : collection) {
                SAttribute attr = (SAttribute) object;
                if (attr.isDerived()) {
                    SAgent agent = (SAgent) attr.getOwner();
                    AGroup root = (AGroup) agent.getRootActivity();
                    for (AAct act : root.getMembers()) {
                        if (act instanceof ADerive && ((ADerive) act).getAttribute() == attr) {
                            derived.add(act);
                        }
                    }
                }
            }
            if (!derived.isEmpty()) {
                CompoundCommand cmd = new CompoundCommand();
                cmd.append(super.createRemoveCommand(domain, owner, feature, collection));
                for (AAct derive : derived) {
                    cmd.append(RemoveCommand.create(domain, derive));
                }
                return cmd;
            }
        }
        return super.createRemoveCommand(domain, owner, feature, collection);
    }

    // protected Command createRemoveCommand(EditingDomain domain, EObject owner, EStructuralFeature feature,
    // Collection<?> collection) {
    // CompoundCommand cmd = new CompoundCommand();
    // if (feature == MetaABMPackage.Literals.SATTRIBUTED__ATTRIBUTES) {
    // Command removeCommand = super.createRemoveCommand(domain, owner, feature, collection);
    // cmd.appendAndExecute(removeCommand);
    // cmd.appendAndExecute(new RemoveAttributedAttributesCommand(domain, owner, feature, collection));
    // }
    // return cmd;
    // }

    protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);
        newChildDescriptors.add(createChildParameter(MetaABMPackage.Literals.SATTRIBUTED__ATTRIBUTES,
                                                     MetaABMFactory.eINSTANCE.createSAttribute()));

        newChildDescriptors.add(createChildParameter(MetaABMPackage.Literals.SATTRIBUTED__ATTRIBUTES,
                                                     MetaABMFactory.eINSTANCE.createSAttributeArray()));
        newChildDescriptors.add(createChildParameter(MetaABMPackage.Literals.SATTRIBUTED__ATTRIBUTES,
                                                     MetaABMFactory.eINSTANCE.createSState()));
    }
}
