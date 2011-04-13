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
package org.metaabm.function.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
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
import org.metaabm.MetaABMPackage;
import org.metaabm.function.FImplementedLibrary;
import org.metaabm.function.MetaABMFunctionFactory;
import org.metaabm.function.MetaABMFunctionPackage;
import org.metaabm.provider.MetaABMEditPlugin;
import org.metaabm.provider.SImplementedItemProvider;

/**
 * This is the item provider adapter for a {@link org.metaabm.function.FImplementedLibrary} object.
 * <!-- begin-user-doc
 * --> <!-- end-user-doc -->
 * @generated
 */
public class FImplementedLibraryItemProvider extends SImplementedItemProvider implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, ITableItemLabelProvider, ITableItemColorProvider, IItemColorProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public FImplementedLibraryItemProvider(AdapterFactory adapterFactory) {
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
			addFunctionsPropertyDescriptor(object);
			addSubsPropertyDescriptor(object);
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
	 * This adds a property descriptor for the Functions feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFunctionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_FLibrary_functions_feature"), getString("_UI_PropertyDescriptor_description", "_UI_FLibrary_functions_feature", "_UI_FLibrary_type"), MetaABMFunctionPackage.Literals.FLIBRARY__FUNCTIONS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Subs feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_FLibrary_subs_feature"), getString("_UI_PropertyDescriptor_description", "_UI_FLibrary_subs_feature", "_UI_FLibrary_type"), MetaABMFunctionPackage.Literals.FLIBRARY__SUBS, true, false, true, null, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(MetaABMFunctionPackage.Literals.FLIBRARY__FUNCTIONS);
			childrenFeatures.add(MetaABMFunctionPackage.Literals.FLIBRARY__SUBS);
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
	 * This returns FImplementedLibrary.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FImplementedLibrary"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((FImplementedLibrary) object).getID();
		return label == null || label.length() == 0 ? getString("_UI_FImplementedLibrary_type") : getString("_UI_FImplementedLibrary_type") + " " + label;
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

		switch (notification.getFeatureID(FImplementedLibrary.class)) {
			case MetaABMFunctionPackage.FIMPLEMENTED_LIBRARY__PLURAL_LABEL:
			case MetaABMFunctionPackage.FIMPLEMENTED_LIBRARY__DESCRIPTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case MetaABMFunctionPackage.FIMPLEMENTED_LIBRARY__FUNCTIONS:
			case MetaABMFunctionPackage.FIMPLEMENTED_LIBRARY__SUBS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add(createChildParameter(MetaABMFunctionPackage.Literals.FLIBRARY__FUNCTIONS, MetaABMFunctionFactory.eINSTANCE.createFOperator()));

		newChildDescriptors.add(createChildParameter(MetaABMFunctionPackage.Literals.FLIBRARY__FUNCTIONS, MetaABMFunctionFactory.eINSTANCE.createFLogicalOperator()));

		newChildDescriptors.add(createChildParameter(MetaABMFunctionPackage.Literals.FLIBRARY__FUNCTIONS, MetaABMFunctionFactory.eINSTANCE.createFGenericFunction()));

		newChildDescriptors.add(createChildParameter(MetaABMFunctionPackage.Literals.FLIBRARY__FUNCTIONS, MetaABMFunctionFactory.eINSTANCE.createFGenericLogical()));

		newChildDescriptors.add(createChildParameter(MetaABMFunctionPackage.Literals.FLIBRARY__SUBS, MetaABMFunctionFactory.eINSTANCE.createFLibrary()));

		newChildDescriptors.add(createChildParameter(MetaABMFunctionPackage.Literals.FLIBRARY__SUBS, MetaABMFunctionFactory.eINSTANCE.createFImplementedLibrary()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return MetaABMEditPlugin.INSTANCE;
	}

}
