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
import org.metaabm.IID;
import org.metaabm.MetaABMPackage;
import org.metaabm.act.ASchedule;
import org.metaabm.act.MetaABMActPackage;

/**
 * This is the item provider adapter for a {@link org.metaabm.act.ASchedule} object.
 * <!-- begin-user-doc -->
 * 
 * @author Miles Parker <!-- end-user-doc -->
 * @generated
 */
public class AScheduleItemProvider extends ASelectItemProvider implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, ITableItemLabelProvider, ITableItemColorProvider, IItemColorProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AScheduleItemProvider(AdapterFactory adapterFactory) {
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
			addStartPropertyDescriptor(object);
			addIntervalPropertyDescriptor(object);
			addPriorityPropertyDescriptor(object);
			addPickPropertyDescriptor(object);
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
	 * This adds a property descriptor for the Start feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStartPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_ASchedule_start_feature"), getString("_UI_PropertyDescriptor_description", "_UI_ASchedule_start_feature", "_UI_ASchedule_type"), MetaABMActPackage.Literals.ASCHEDULE__START, true, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, getString("_UI_ActPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Interval feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIntervalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_ASchedule_interval_feature"), getString("_UI_PropertyDescriptor_description", "_UI_ASchedule_interval_feature", "_UI_ASchedule_type"), MetaABMActPackage.Literals.ASCHEDULE__INTERVAL, true, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, getString("_UI_ActPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Priority feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPriorityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_ASchedule_priority_feature"), getString("_UI_PropertyDescriptor_description", "_UI_ASchedule_priority_feature", "_UI_ASchedule_type"), MetaABMActPackage.Literals.ASCHEDULE__PRIORITY, true, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, getString("_UI_ActPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Pick feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPickPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_ASchedule_pick_feature"), getString("_UI_PropertyDescriptor_description", "_UI_ASchedule_pick_feature", "_UI_ASchedule_type"), MetaABMActPackage.Literals.ASCHEDULE__PICK, true, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, getString("_UI_ActPropertyCategory"), null));
	}

	/**
	 * This returns ASchedule.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ASchedule"));
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

		switch (notification.getFeatureID(ASchedule.class)) {
			case MetaABMActPackage.ASCHEDULE__PLURAL_LABEL:
			case MetaABMActPackage.ASCHEDULE__DESCRIPTION:
			case MetaABMActPackage.ASCHEDULE__START:
			case MetaABMActPackage.ASCHEDULE__INTERVAL:
			case MetaABMActPackage.ASCHEDULE__PRIORITY:
			case MetaABMActPackage.ASCHEDULE__PICK:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	public String suggestLabel(IID object) {
		ASchedule sch = (ASchedule) object;
		StringBuffer label = new StringBuffer();
		label.append("At ");
		label.append(sch.getStart());
		if (sch.getInterval() != 1) {
			label.append(" Every ");
			label.append(sch.getInterval());
		}
		return label.toString();
	}

	public String suggestID(IID object) {
		return "";
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
