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

import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
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
import org.metaabm.commands.SetLabelCommand;
import org.metaabm.commands.SuggestLabelCommand;
import org.metaabm.function.FFunction;
import org.metaabm.function.FLibrary;
import org.metaabm.function.MetaABMFunctionFactory;
import org.metaabm.function.MetaABMFunctionPackage;
import org.metaabm.provider.IIDItemProvider;
import org.metaabm.provider.MetaABMEditPlugin;

/**
 * This is the item provider adapter for a {@link org.metaabm.function.FFunction} object.
 * <!-- begin-user-doc -->
 * 
 * @author Miles Parker <!-- end-user-doc -->
 * @generated
 */
public class FFunctionItemProvider extends IIDItemProvider implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, ITableItemLabelProvider, ITableItemColorProvider, IItemColorProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public FFunctionItemProvider(AdapterFactory adapterFactory) {
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

			addAvailableTypesPropertyDescriptor(object);
			addMultiValuePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Available Types feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAvailableTypesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_FFunction_availableTypes_feature"), getString("_UI_PropertyDescriptor_description", "_UI_FFunction_availableTypes_feature", "_UI_FFunction_type"), MetaABMFunctionPackage.Literals.FFUNCTION__AVAILABLE_TYPES, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Multi Value feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMultiValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_FFunction_multiValue_feature"), getString("_UI_PropertyDescriptor_description", "_UI_FFunction_multiValue_feature", "_UI_FFunction_type"), MetaABMFunctionPackage.Literals.FFUNCTION__MULTI_VALUE, false, false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, new String[] { "org.eclipse.ui.views.properties.expert" }));
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
			childrenFeatures.add(MetaABMFunctionPackage.Literals.FFUNCTION__INPUT_PROTOTYPES);
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

	protected Command createSetCommand(EditingDomain domain, EObject owner, EStructuralFeature feature, Object value, int index) {
		Command createSetCommand = super.createSetCommand(domain, owner, feature, value, index);
		if ((feature == MetaABMPackage.Literals.SIMPLEMENTED__IMPLEMENTATION) && (value instanceof IID)) {
			CompoundCommand cmd = new CompoundCommand("Set Implemented SuggestIDs for it " + ((IID) owner).getClass());
			cmd.append(createSetCommand);
			cmd.append(new SuggestLabelCommand(domain, (IID) value));
			return cmd;
		} else if ((feature == MetaABMPackage.Literals.IID__LABEL) || (feature == MetaABMPackage.Literals.SNAMED__PLURAL_LABEL)) {
			return SetLabelCommand.create(domain, owner, feature, value, index);
		} else {
			// force a store of old value..
			createSetCommand.canExecute();
			return createSetCommand;
		}
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		String text = super.getText(object);
		FFunction func = (FFunction) object;
		if (func.eContainer() instanceof FLibrary) {
			text = ((FLibrary) func.eContainer()).getLabel() + ": " + text;
		}
		return text;
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

		switch (notification.getFeatureID(FFunction.class)) {
			case MetaABMFunctionPackage.FFUNCTION__AVAILABLE_TYPES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case MetaABMFunctionPackage.FFUNCTION__INPUT_PROTOTYPES:
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

		newChildDescriptors.add(createChildParameter(MetaABMFunctionPackage.Literals.FFUNCTION__INPUT_PROTOTYPES, MetaABMFunctionFactory.eINSTANCE.createFArgumentPrototype()));

		newChildDescriptors.add(createChildParameter(MetaABMFunctionPackage.Literals.FFUNCTION__INPUT_PROTOTYPES, MetaABMFunctionFactory.eINSTANCE.createFArgumentArrayPrototype()));

		newChildDescriptors.add(createChildParameter(MetaABMFunctionPackage.Literals.FFUNCTION__INPUT_PROTOTYPES, MetaABMFunctionFactory.eINSTANCE.createFMultiArgumentPrototype()));
	}

	public String suggestLabel(IID object) {
		return getString("_UI_" + object.eClass().getName() + "_type") + " ";
	}

	public String suggestID(IID object) {
		return StringUtils.uncapitalize(StringUtils.deleteWhitespace(StringUtils.capitalize(getString("_UI_" + object.eClass().getName() + "_type"))));
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
