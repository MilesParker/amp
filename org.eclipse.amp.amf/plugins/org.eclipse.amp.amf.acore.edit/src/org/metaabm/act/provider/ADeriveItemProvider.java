/**
 * Copyright (c) 2007-2009 Metascape, LLC, Copyright (c) 2006-2007 Argonne National Labs
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.metaabm.act.provider;

import java.util.ArrayList;
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
import org.metaabm.SAttribute;
import org.metaabm.act.ADerive;
import org.metaabm.act.MetaABMActPackage;

/**
 * This is the item provider adapter for a {@link org.metaabm.act.ADerive} object.
 * <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * @generated
 */
public class ADeriveItemProvider extends AAccessorItemProvider implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, ITableItemLabelProvider, ITableItemColorProvider, IItemColorProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ADeriveItemProvider(AdapterFactory adapterFactory) {
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

			addAgentPropertyDescriptor(object);
			addSpacePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Agent feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAgentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_ASelect_agent_feature"), getString("_UI_PropertyDescriptor_description", "_UI_ASelect_agent_feature", "_UI_ASelect_type"), MetaABMActPackage.Literals.ASELECT__AGENT, true, false, true, null, getString("_UI_ActPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void addAttributePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_AAccessor_attribute_feature"), getString("_UI_PropertyDescriptor_description", "_UI_AAccessor_attribute_feature", "_UI_AAccessor_type"), MetaABMActPackage.Literals.AACCESSOR__ATTRIBUTE, true, false, true, null, getString("_UI_ActPropertyCategory"), null) {
			@SuppressWarnings("unchecked")
			public Collection<?> getChoiceOfValues(Object object) {
				ADerive derive = (ADerive) object;
				Collection<SAttribute> attributes = derive.getReference().getAttributes();
				Collection<SAttribute> derivedAttributes = new ArrayList<SAttribute>();
				for (SAttribute attr : attributes) {
					if (attr.isDerived()) {
						derivedAttributes.add(attr);
					}
				}
				return derivedAttributes;
			}

		});
	}

	/**
	 * This adds a property descriptor for the Space feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_ASelect_space_feature"), getString("_UI_PropertyDescriptor_description", "_UI_ASelect_space_feature", "_UI_ASelect_type"), MetaABMActPackage.Literals.ASELECT__SPACE, true, false, true, null, getString("_UI_ActPropertyCategory"), null));
	}

	/**
	 * This returns ADerive.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ADerive"));
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
	 * This handles model notifications by calling {@link #updateChildren} to update any cached children and by creating
	 * a viewer notification, which it passes to {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ADerive.class)) {
			case MetaABMActPackage.ADERIVE__AGENT:
			case MetaABMActPackage.ADERIVE__SPACE:
			case MetaABMActPackage.ADERIVE__FOR:
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
