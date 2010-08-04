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
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationWrapper;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.metaabm.IID;
import org.metaabm.MetaABMFactory;
import org.metaabm.MetaABMPackage;
import org.metaabm.SAttributed;
import org.metaabm.SImplemented;
import org.metaabm.SStyle;
import org.metaabm.commands.AddImplementatedCommand;
import org.metaabm.commands.SetGenerateCommand;
import org.metaabm.commands.SuggestLabelCommand;

public class StylesItemProvider extends TransientGroupedItemProvider {

    public StylesItemProvider(AdapterFactory adapterFactory, EObject parent) {
        super(adapterFactory, parent);
        // TODO Auto-generated constructor stub
    }

    public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
        if (childrenFeatures == null) {
            super.getChildrenFeatures(object);
            childrenFeatures.add(MetaABMPackage.Literals.SAGENT__STYLES);
        }
        return childrenFeatures;
    }

    public String getText(Object object) {
        return "Styles";
    }

    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/SStyles"));
    }

    public void notifyChanged(Notification notification) {
        switch (notification.getFeatureID(SAttributed.class)) {
            case MetaABMPackage.SAGENT__STYLES:
                fireNotifyChanged(new NotificationWrapper(this, notification));
                return;
        }
    }

    /**
     * This returns the property descriptors for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
        if (itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);
            if (object instanceof SImplemented) {
                SImplementedItemProvider.addImplementationAsProperties((SImplemented) object, this);
            }
        }
        return itemPropertyDescriptors;
    }

    @SuppressWarnings("unchecked")
    protected Command createAddCommand(EditingDomain domain, EObject owner, EStructuralFeature feature,
            Collection<?> collection, int index) {
        if (feature == MetaABMPackage.Literals.SAGENT__STYLES) {
            CompoundCommand cmd = new CompoundCommand();
            cmd.appendAndExecute(super.createAddCommand(domain, owner, feature, collection, index));
            cmd.appendAndExecute(new AddImplementatedCommand(domain, collection));
            for (Object object : collection) {
                SStyle style = (SStyle) object;
                cmd.appendAndExecute(new SetGenerateCommand(domain, style.getImplementation(), style
                        .getImplementation().getMode()));
            }
            cmd.appendAndExecute(new SuggestLabelCommand(domain, (Collection<IID>) collection));
            return cmd;
        } else {
            return super.createAddCommand(domain, owner, feature, collection, index);
        }
    }

    protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);
        newChildDescriptors.add(createChildParameter(MetaABMPackage.Literals.SAGENT__STYLES, MetaABMFactory.eINSTANCE
                .createSStyle2D()));
        newChildDescriptors.add(createChildParameter(MetaABMPackage.Literals.SAGENT__STYLES, MetaABMFactory.eINSTANCE
                .createSStyle3D()));
        newChildDescriptors.add(createChildParameter(MetaABMPackage.Literals.SAGENT__STYLES, MetaABMFactory.eINSTANCE
                .createSStyleShape()));
    }
}
