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
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.metaabm.IID;
import org.metaabm.MetaABMPackage;
import org.metaabm.SImplemented;
import org.metaabm.SNamed;
import org.metaabm.commands.AddImplementatedCommand;
import org.metaabm.commands.SetLabelCommand;
import org.metaabm.commands.SuggestLabelCommand;

/**
 * This is the item provider adapter for a {@link org.metaabm.SNamed} object. <!-- begin-user-doc --> <!-- end-user-doc
 * -->
 * 
 * @generated
 */
public class SNamedItemProvider extends IIDItemProvider implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, ITableItemLabelProvider, ITableItemColorProvider, IItemColorProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SNamedItemProvider(AdapterFactory adapterFactory) {
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

			addPluralLabelPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Plural Label feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPluralLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_SNamed_pluralLabel_feature"), getString("_UI_PropertyDescriptor_description", "_UI_SNamed_pluralLabel_feature", "_UI_SNamed_type"), MetaABMPackage.Literals.SNAMED__PLURAL_LABEL, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, getString("_UI_IDsPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_SNamed_description_feature"), getString("_UI_PropertyDescriptor_description", "_UI_SNamed_description_feature", "_UI_SNamed_type"), MetaABMPackage.Literals.SNAMED__DESCRIPTION, true, true, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, getString("_UI_IDsPropertyCategory"), null));
	}

	@Override
	@SuppressWarnings("unchecked")
	protected Command createAddCommand(EditingDomain domain, EObject owner, EStructuralFeature feature, Collection<?> collection, int index) {
		Object cannonical = collection.iterator().next();
		if (cannonical instanceof IID) {
			CompoundCommand cmd = new CompoundCommand("Add Implementation and Suggest IDs");
			cmd.append(super.createAddCommand(domain, owner, feature, collection, index));
			if (cannonical instanceof SImplemented) {
				cmd.append(new AddImplementatedCommand(domain, collection));
			}
			cmd.append(new SuggestLabelCommand(domain, (Collection<IID>) collection));
			return cmd;
		} else {
			return super.createAddCommand(domain, owner, feature, collection, index);
		}
	}

	@Override
	protected Command createSetCommand(EditingDomain domain, EObject owner, EStructuralFeature feature, Object value, int index) {
		Command createSetCommand = super.createSetCommand(domain, owner, feature, value, index);
		if (feature == MetaABMPackage.Literals.SIMPLEMENTED__IMPLEMENTATION && value instanceof IID) {
			CompoundCommand cmd = new CompoundCommand("Set Implemented SuggestIDs for it " + ((IID) owner).getClass());
			cmd.append(createSetCommand);
			cmd.append(new SuggestLabelCommand(domain, (IID) value));
			return cmd;
		} else if (feature == MetaABMPackage.Literals.IID__LABEL || feature == MetaABMPackage.Literals.SNAMED__PLURAL_LABEL) {
			return SetLabelCommand.create(domain, owner, feature, value, index);
		} else {
			// force a store of old value..
			createSetCommand.canExecute();
			return createSetCommand;
		}
	}

	@Override
	public String suggestLabel(IID object) {
		return getString("_UI_" + object.eClass().getName() + "_type");
	}

	@Override
	public String suggestID(IID object) {
		return "";
	}

	/**
	 * This returns SNamed.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SNamed"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		String label = ((SNamed) object).getLabel();
		return label == null || label.length() == 0 ? getString("_UI_SNamed_type") : label;
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

		switch (notification.getFeatureID(SNamed.class)) {
			case MetaABMPackage.SNAMED__PLURAL_LABEL:
			case MetaABMPackage.SNAMED__DESCRIPTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
