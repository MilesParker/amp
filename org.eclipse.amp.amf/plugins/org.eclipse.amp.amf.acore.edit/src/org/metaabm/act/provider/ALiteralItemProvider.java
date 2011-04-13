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
import org.metaabm.act.AInput;
import org.metaabm.act.ALiteral;
import org.metaabm.act.MetaABMActPackage;
import org.metaabm.commands.SetLabelCommand;
import org.metaabm.commands.SuggestLabelCommand;
import org.metaabm.provider.IIDItemProvider;
import org.metaabm.provider.MetaABMEditPlugin;

/**
 * This is the item provider adapter for a {@link org.metaabm.act.ALiteral} object.
 * <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * @generated
 */
public class ALiteralItemProvider extends IIDItemProvider implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, ITableItemLabelProvider, ITableItemColorProvider, IItemColorProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ALiteralItemProvider(AdapterFactory adapterFactory) {
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
			addValueLiteralPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Available Types feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAvailableTypesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_IValue_availableTypes_feature"), getString("_UI_PropertyDescriptor_description", "_UI_IValue_availableTypes_feature", "_UI_IValue_type"), MetaABMPackage.Literals.IVALUE__AVAILABLE_TYPES, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, new String[] { "org.eclipse.ui.views.properties.expert" }));
	}

	/**
	 * This adds a property descriptor for the Value Literal feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValueLiteralPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_ALiteral_valueLiteral_feature"), getString("_UI_PropertyDescriptor_description", "_UI_ALiteral_valueLiteral_feature", "_UI_ALiteral_type"), MetaABMActPackage.Literals.ALITERAL__VALUE_LITERAL, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, getString("_UI_IDsPropertyCategory"), null));
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
			// childrenFeatures.add(MetaABMPackage.Literals.IVALUE__ACCESSORS);
		}
		return childrenFeatures;
	}

	public String suggestLabel(IID object) {
		return "Literal " + getText(object);
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
	 * This returns ALiteral.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ALiteral"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		String label = ((ALiteral) object).getValueLiteral();
		return (label == null || label.length() == 0) ? "Literal" : label;
	}

	@Override
	protected Command createSetCommand(EditingDomain domain, EObject owner, EStructuralFeature feature, Object value, int index) {
		if (feature == MetaABMActPackage.Literals.ALITERAL__VALUE_LITERAL) {
			CompoundCommand cmd = new CompoundCommand("Set Literal");
			SuggestLabelCommand suggestLabelCommand = new SuggestLabelCommand(this, domain, (IID) owner);
			;
			ALiteral literal = (ALiteral) owner;
			AInput input = (AInput) literal.eContainer();
			SuggestLabelCommand suggestLabelCommand2 = new SuggestLabelCommand(domain, input.getSink());
			cmd.append(super.createSetCommand(domain, owner, feature, value, index));
			cmd.append(suggestLabelCommand);
			cmd.append(suggestLabelCommand2);
			return cmd;
		} else if ((feature == MetaABMPackage.Literals.IID__LABEL) || (feature == MetaABMPackage.Literals.SNAMED__PLURAL_LABEL)) {
			return SetLabelCommand.create(domain, owner, feature, value, index);
		} else {
			return super.createSetCommand(domain, owner, feature, value, index);
		}
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached children and by creating a
	 * viewer notification, which it passes to {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ALiteral.class)) {
			case MetaABMActPackage.ALITERAL__VALUE_LITERAL:
			case MetaABMActPackage.ALITERAL__ID:
			case MetaABMActPackage.ALITERAL__LABEL:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, true));
				fireNotifyChanged(new ViewerNotification(notification, ((ALiteral) notification.getNotifier()).eContainer(), true, true));
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
