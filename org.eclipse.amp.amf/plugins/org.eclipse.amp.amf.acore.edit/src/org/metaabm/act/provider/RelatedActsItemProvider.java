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
package org.metaabm.act.provider;

import java.util.Collection;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.metaabm.SAttribute;
import org.metaabm.provider.TransientGroupedItemProvider;

public class RelatedActsItemProvider extends TransientGroupedItemProvider {

    EStructuralFeature feature;

    String title;

    public RelatedActsItemProvider(AdapterFactory adapterFactory, EObject parent, EStructuralFeature feature,
        String title) {
        super(adapterFactory, parent);
        this.feature = feature;
        this.title = title;
    }

    public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
        if (childrenFeatures == null) {
            super.getChildrenFeatures(object);
            childrenFeatures.add(getFeature());
        }
        return childrenFeatures;
    }

    public String getText(Object object) {
        return title;
    }

    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/AAct"));
    }

    /**
     * @return the feature
     */
    public EStructuralFeature getFeature() {
        return feature;
    }

    public void notifyChanged(Notification notification) {
        updateChildren(notification);
        if (notification.getFeature() == getFeature()) {
            fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, true));
            SAttribute attr = (SAttribute) notification.getOldValue();
            if (attr != null) {
                fireNotifyChanged(new ViewerNotification(notification, attr, true, true));
                for (EObject value : attr.getAccessors()) {
                    fireNotifyChanged(new ViewerNotification(notification, value, true, true));
                }
            }
        }
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
}
