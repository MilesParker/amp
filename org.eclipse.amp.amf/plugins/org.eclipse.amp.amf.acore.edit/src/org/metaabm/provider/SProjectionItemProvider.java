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
package org.metaabm.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemColorProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITableItemColorProvider;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.metaabm.MetaABMPackage;
import org.metaabm.SProjection;

/**
 * This is the item provider adapter for a {@link org.metaabm.SProjection} object.
 * <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * @generated
 */
public class SProjectionItemProvider extends SAttributedItemProvider implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, ITableItemLabelProvider, ITableItemColorProvider, IItemColorProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SProjectionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addOwnerPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * @param domain
	 * @param owner
	 * @param feature
	 * @param value
	 * @return
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#createSetCommand(org.eclipse.emf.edit.domain.EditingDomain,
	 *      org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.lang.Object)
	 */
	protected Command createSetCommand(EditingDomain domain, EObject owner, EStructuralFeature feature, Object value) {
		CompoundCommand cmd = new CompoundCommand();
		if (feature == MetaABMPackage.Literals.IID__LABEL) {
			SProjection proj = (SProjection) owner;
			// List<Command> sugLabels = new ArrayList<Command>();
			// for (AAct act : ((AGroup) proj.getOwner().getRootActivity()).getMembers()) {
			// if (act instanceof ABuildProjection && ((ABuildProjection) act).getProjection() == proj) {
			// sugLabels.add(new SuggestLabelCommand(domain, act));
			// }
			// }

			cmd.append(super.createSetCommand(domain, owner, feature, value));
			// for (AAct act : ((AGroup) proj.getOwner().getRootActivity()).getMembers()) {
			// if (act instanceof ABuildProjection && ((ABuildProjection) act).getProjection() == proj) {
			// cmd.append(new SuggestLabelCommand(domain, act));
			// }
			// }
		} else {
			cmd.append(super.createSetCommand(domain, owner, feature, value));
		}
		return cmd;
	}

	/**
	 * This adds a property descriptor for the Owner feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_SProjection_owner_feature"), getString("_UI_PropertyDescriptor_description", "_UI_SProjection_owner_feature", "_UI_SProjection_type"), MetaABMPackage.Literals.SPROJECTION__OWNER, false, false, false, null, getString("_UI_RelationsPropertyCategory"), new String[] { "org.eclipse.ui.views.properties.expert" }));
	}

	/**
	 * This returns SProjection.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SProjection"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		return super.getText(object);
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);
		super.notifyChanged(notification);
	}

	/**
	 * This adds to the collection of {@link org.eclipse.emf.edit.command.CommandParameter}s describing all of the
	 * children that can be created under this object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		// super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	public boolean isAttributesConsistent(Object obj) {
		return false;
	}

	protected Command createRemoveCommand(EditingDomain domain, EObject owner, EStructuralFeature feature, Collection<?> collection) {
		if (feature == MetaABMPackage.eINSTANCE.getSAttributed_Attributes() && isAttributesConsistent(owner)) {
			return UnexecutableCommand.INSTANCE;
		} else {
			return super.createRemoveCommand(domain, owner, feature, collection);
		}
	}

}
