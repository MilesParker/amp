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
package org.metaabm.act.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
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

import org.apache.commons.lang.StringUtils;
import org.metaabm.IID;
import org.metaabm.MetaABMPackage;
import org.metaabm.SProjection;
import org.metaabm.act.ABuildProjection;
import org.metaabm.act.MetaABMActPackage;

/**
 * This is the item provider adapter for a {@link org.metaabm.act.ABuildProjection} object.
 * <!-- begin-user-doc -->
 * 
 * @author Miles Parker <!-- end-user-doc -->
 * @generated
 */
public class ABuildProjectionItemProvider extends AActItemProvider implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, ITableItemLabelProvider, ITableItemColorProvider, IItemColorProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ABuildProjectionItemProvider(AdapterFactory adapterFactory) {
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
			addAgentsPropertyDescriptor(object);
			addProjectionPropertyDescriptor(object);
			addAttributesPropertyDescriptor(object);
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

	/**
	 * This adds a property descriptor for the Agents feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAgentsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_ABuildProjection_agents_feature"), getString("_UI_PropertyDescriptor_description", "_UI_ABuildProjection_agents_feature", "_UI_ABuildProjection_type"), MetaABMActPackage.Literals.ABUILD_PROJECTION__AGENTS, true, false, true, null, getString("_UI_ActPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Projection feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProjectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_ABuildProjection_projection_feature"), getString("_UI_PropertyDescriptor_description", "_UI_ABuildProjection_projection_feature", "_UI_ABuildProjection_type"), MetaABMActPackage.Literals.ABUILD_PROJECTION__PROJECTION, true, false, true, null, getString("_UI_ActPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Attributes feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAttributesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_ABuildProjection_attributes_feature"), getString("_UI_PropertyDescriptor_description", "_UI_ABuildProjection_attributes_feature", "_UI_ABuildProjection_type"), MetaABMActPackage.Literals.ABUILD_PROJECTION__ATTRIBUTES, true, false, true, null, getString("_UI_ActPropertyCategory"), null));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
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

		switch (notification.getFeatureID(ABuildProjection.class)) {
			case MetaABMActPackage.ABUILD_PROJECTION__PLURAL_LABEL:
			case MetaABMActPackage.ABUILD_PROJECTION__DESCRIPTION:
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

	public String suggestLabel(IID object) {
		SProjection projection = ((ABuildProjection) object).getProjection();
		return "Build " + (projection != null && projection.getLabel() != null ? StringUtils.capitalize(projection.getLabel()) : "[?]");
	}
}
