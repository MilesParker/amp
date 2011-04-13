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

import java.util.ArrayList;
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
import org.metaabm.IValue;
import org.metaabm.SState;
import org.metaabm.act.AInput;
import org.metaabm.act.AMultiValue;
import org.metaabm.act.ASink;
import org.metaabm.act.MetaABMActPackage;
import org.metaabm.commands.AddMultiValueStateCommand;
import org.metaabm.commands.RemoveMultiValueStateCommand;

/**
 * This is the item provider adapter for a {@link org.metaabm.act.AMultiValue} object.
 * <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * @generated
 */
public class AMultiValueItemProvider extends ALiteralItemProvider implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, ITableItemLabelProvider, ITableItemColorProvider, IItemColorProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AMultiValueItemProvider(AdapterFactory adapterFactory) {
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

			addValuesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	@Override
	protected Command createAddCommand(EditingDomain domain, EObject owner, EStructuralFeature feature, Collection<?> collection, int index) {
		if (feature == MetaABMActPackage.Literals.AMULTI_VALUE__VALUES) {
			EObject container = ((AMultiValue) owner).eContainer();
			if (container != null) {
				ASink sink = ((AInput) container).getSink();
				if (sink.getInputs().get(0).getValue() == owner) {
					collection = validValues(collection);
					CompoundCommand cmd = new CompoundCommand();
					cmd.append(super.createAddCommand(domain, owner, feature, collection, index));
					cmd.append(new AddMultiValueStateCommand(domain, sink, sink.getInputs(), collection, index));
					return cmd;
				}
			}
		}
		return super.createAddCommand(domain, owner, feature, collection, index);
	}

	@Override
	protected Command createRemoveCommand(EditingDomain domain, EObject owner, EStructuralFeature feature, Collection<?> collection) {
		if (feature == MetaABMActPackage.Literals.AMULTI_VALUE__VALUES) {
			ASink sink = ((AInput) ((AMultiValue) owner).eContainer()).getSink();
			if (sink.getInputs().get(0).getValue() == owner) {
				CompoundCommand cmd = new CompoundCommand();
				cmd.append(super.createRemoveCommand(domain, owner, feature, collection));
				cmd.append(new RemoveMultiValueStateCommand(domain, sink, sink.getInputs(), collection, 0));
				return cmd;
			}
		}
		return super.createRemoveCommand(domain, owner, feature, collection);
	}

	/**
	 * This adds a property descriptor for the Values feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void addValuesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_AMultiValue_values_feature"), getString("_UI_PropertyDescriptor_description", "_UI_AMultiValue_values_feature", "_UI_AMultiValue_type"), MetaABMActPackage.Literals.AMULTI_VALUE__VALUES, true, true, false, null, null, null) {
			public Collection<?> getChoiceOfValues(Object object) {
				Collection<?> choiceOfValues = super.getChoiceOfValues(object);
				ASink sink = ((AInput) ((AMultiValue) object).eContainer()).getSink();
				if (sink.getInputs().get(0).getValue() == object) {
					return validValues(choiceOfValues);
				}
				return choiceOfValues;
			}
		});
	}

	protected Collection<IValue> validValues(Collection potential) {
		Collection<IValue> choices = new ArrayList<IValue>();
		for (Object value : potential) {
			if (value instanceof SState) {
				choices.add((IValue) value);
			}
		}
		return choices;
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
			childrenFeatures.add(MetaABMActPackage.Literals.AMULTI_VALUE__VALUES);
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
	 * This returns AMultiValue.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AMultiValue"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		String label = ((AMultiValue) object).getLabel();
		return label == null || label.length() == 0 ? getString("_UI_AMultiValue_type") : label;
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

		switch (notification.getFeatureID(AMultiValue.class)) {
			case MetaABMActPackage.AMULTI_VALUE__VALUES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	@Override
	public String suggestLabel(IID object) {
		return "Multiple value " + getText(object);
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
