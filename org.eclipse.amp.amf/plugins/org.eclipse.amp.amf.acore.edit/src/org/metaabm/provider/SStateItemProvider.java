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
import org.eclipse.emf.edit.command.SetCommand;
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
import org.metaabm.MetaABMFactory;
import org.metaabm.MetaABMPackage;
import org.metaabm.SState;
import org.metaabm.SStateValue;

/**
 * This is the item provider adapter for a {@link org.metaabm.SState} object. <!-- begin-user-doc --> <!-- end-user-doc
 * -->
 * 
 * @generated
 */
public class SStateItemProvider extends SAttributeItemProvider implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, ITableItemLabelProvider, ITableItemColorProvider, IItemColorProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SStateItemProvider(AdapterFactory adapterFactory) {
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

			addOptionsPropertyDescriptor(object);
			addDefaultOptionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the SType feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void addSTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_ITyped_sType_feature"), getString("_UI_PropertyDescriptor_description", "_UI_ITyped_sType_feature", "_UI_ITyped_type"), MetaABMPackage.Literals.ITYPED__STYPE, false, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Default Value feature. <!-- begin-user-doc --> <!-- end-user-doc --> Don't
	 * allow direct modification of default value
	 * 
	 * @generated NOT
	 */
	protected void addDefaultValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_SAttribute_defaultValue_feature"), getString("_UI_PropertyDescriptor_description", "_UI_SAttribute_defaultValue_feature", "_UI_SAttribute_type"), MetaABMPackage.Literals.SATTRIBUTE__DEFAULT_VALUE, false, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, getString("_UI_ValuesPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Options feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOptionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_SState_options_feature"), getString("_UI_PropertyDescriptor_description", "_UI_SState_options_feature", "_UI_SState_type"), MetaABMPackage.Literals.SSTATE__OPTIONS, true, false, false, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Default Option feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultOptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_SState_defaultOption_feature"), getString("_UI_PropertyDescriptor_description", "_UI_SState_defaultOption_feature", "_UI_SState_type"), MetaABMPackage.Literals.SSTATE__DEFAULT_OPTION, true, false, true, null, null, null));
	}

	@SuppressWarnings("unchecked")
	public Collection<?> getChildren(Object object) {
		Collection children = super.getChildren(object);
		children.addAll(((SState) object).getOptions());
		return children;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(MetaABMPackage.Literals.SSTATE__OPTIONS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns SState.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SState"));
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

		switch (notification.getFeatureID(SState.class)) {
			case MetaABMPackage.SSTATE__OPTIONS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	@Override
	protected Command createSetCommand(EditingDomain domain, EObject owner, EStructuralFeature feature, Object value, int index) {
		if (feature == MetaABMPackage.Literals.SSTATE__DEFAULT_OPTION) {
			CompoundCommand cmd = new CompoundCommand();
			cmd.append(super.createSetCommand(domain, owner, feature, value, index));
			if (value != null) {
				cmd.append(SetCommand.create(domain, owner, MetaABMPackage.Literals.SATTRIBUTE__DEFAULT_VALUE, ((SStateValue) value).getLabel()));
			} else {
				cmd.append(SetCommand.create(domain, owner, MetaABMPackage.Literals.SATTRIBUTE__DEFAULT_VALUE, null));
			}
			return cmd;
		}
		return super.createSetCommand(domain, owner, feature, value, index);
	}

	@Override
	protected Command createRemoveCommand(EditingDomain domain, EObject owner, EStructuralFeature feature, Collection<?> collection) {
		if (feature == MetaABMPackage.Literals.SSTATE__OPTIONS) {
			SState state = (SState) owner;
			if (collection.contains(state.getDefaultOption())) {
				CompoundCommand cmd = new CompoundCommand();
				cmd.append(SetCommand.create(domain, owner, MetaABMPackage.Literals.SSTATE__DEFAULT_OPTION, null));
				cmd.append(super.createRemoveCommand(domain, owner, feature, collection));
				return cmd;
			}
		}
		return super.createRemoveCommand(domain, owner, feature, collection);
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

		newChildDescriptors.add(createChildParameter(MetaABMPackage.Literals.SSTATE__OPTIONS, MetaABMFactory.eINSTANCE.createSStateValue()));
	}

}
