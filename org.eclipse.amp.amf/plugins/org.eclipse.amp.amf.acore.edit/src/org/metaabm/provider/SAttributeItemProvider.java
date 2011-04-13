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
import java.util.HashSet;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
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
import org.metaabm.IID;
import org.metaabm.MetaABMPackage;
import org.metaabm.SAgent;
import org.metaabm.SAttribute;
import org.metaabm.act.AAct;
import org.metaabm.act.ADerive;
import org.metaabm.act.AGroup;
import org.metaabm.act.AInput;
import org.metaabm.act.ASink;
import org.metaabm.act.MetaABMActFactory;
import org.metaabm.act.MetaABMActPackage;
import org.metaabm.commands.SuggestLabelCommand;

/**
 * This is the item provider adapter for a {@link org.metaabm.SAttribute} object.
 * <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * @generated
 */
public class SAttributeItemProvider extends SNamedItemProvider implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, ITableItemLabelProvider, ITableItemColorProvider, IItemColorProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SAttributeItemProvider(AdapterFactory adapterFactory) {
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
			addSTypePropertyDescriptor(object);
			addOwnerPropertyDescriptor(object);
			addGatherDataPropertyDescriptor(object);
			addDefaultValuePropertyDescriptor(object);
			addUnitsPropertyDescriptor(object);
			addImmutablePropertyDescriptor(object);
			addDerivedPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the SType feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_ITyped_sType_feature"), getString("_UI_PropertyDescriptor_description", "_UI_ITyped_sType_feature", "_UI_ITyped_type"), MetaABMPackage.Literals.ITYPED__STYPE, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	public Object getParent(Object object) {
		Object parent = super.getParent(object);

		if (parent instanceof SAgent) {
			SAgentItemProvider parentItemProvider = (SAgentItemProvider) adapterFactory.adapt(parent, IEditingDomainItemProvider.class);

			return parentItemProvider != null ? parentItemProvider.getAttributes() : null;
		} else {
			return parent;
		}
	}

	/**
	 * This adds a property descriptor for the Owner feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_SAttribute_owner_feature"), getString("_UI_PropertyDescriptor_description", "_UI_SAttribute_owner_feature", "_UI_SAttribute_type"), MetaABMPackage.Literals.SATTRIBUTE__OWNER, false, false, false, null, getString("_UI_RelationsPropertyCategory"), new String[] { "org.eclipse.ui.views.properties.expert" }));
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
	 * This adds a property descriptor for the Gather Data feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGatherDataPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_SAttribute_gatherData_feature"), getString("_UI_PropertyDescriptor_description", "_UI_SAttribute_gatherData_feature", "_UI_SAttribute_type"), MetaABMPackage.Literals.SATTRIBUTE__GATHER_DATA, true, false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, getString("_UI_ValuesPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Default Value feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_SAttribute_defaultValue_feature"), getString("_UI_PropertyDescriptor_description", "_UI_SAttribute_defaultValue_feature", "_UI_SAttribute_type"), MetaABMPackage.Literals.SATTRIBUTE__DEFAULT_VALUE, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, getString("_UI_ValuesPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Units feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUnitsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_SAttribute_units_feature"), getString("_UI_PropertyDescriptor_description", "_UI_SAttribute_units_feature", "_UI_SAttribute_type"), MetaABMPackage.Literals.SATTRIBUTE__UNITS, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, getString("_UI_ValuesPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Immutable feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImmutablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_SAttribute_immutable_feature"), getString("_UI_PropertyDescriptor_description", "_UI_SAttribute_immutable_feature", "_UI_SAttribute_type"), MetaABMPackage.Literals.SATTRIBUTE__IMMUTABLE, true, false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, getString("_UI_ValuesPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Derived feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDerivedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_SAttribute_derived_feature"), getString("_UI_PropertyDescriptor_description", "_UI_SAttribute_derived_feature", "_UI_SAttribute_type"), MetaABMPackage.Literals.SATTRIBUTE__DERIVED, true, false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, getString("_UI_ValuesPropertyCategory"), null));
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
			childrenFeatures.add(MetaABMPackage.Literals.SATTRIBUTE__CHILDREN);
			// childrenFeatures.add(MetaABMPackage.Literals.IVALUE_ACCESSORS);
		}
		return childrenFeatures;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Collection<?> getChildren(Object object) {
		Collection<?> children = super.getChildren(object);
		// Collection inputs = new ArrayList();
		Collection acts = new HashSet();
		// if (((SAttribute) object).getOwner() instanceof SAgent) {
		// SAgent agent = (SAgent) ((SAttribute) object).getOwner();
		// AGroup group = (AGroup) agent.getRootActivity();
		// for (AAct act : group.getMembers()) {
		// if ((act instanceof ASet) && (((ASet) act).getAttribute() == object))
		// {
		// acts.add(act);
		// }
		// if (act instanceof ASink) {
		// for (AInput input : ((ASink) act).getInputs()) {
		// if (input.getValue() == object) {
		// acts.add(act);
		// break;
		// }
		// }
		// }
		// }
		// }
		// children.removeAll(inputs);
		acts.addAll(children);
		// if (displayAttributeReferences) {
		// for (EObject access : ((SAttribute) object).getAccessors()) {
		// if (access instanceof AInput) {
		// acts.add(((AInput) access).getSink());
		// } else {
		// acts.add(access);
		// }
		// }
		// }
		return acts;
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
	 * This returns SAttribute.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SAttribute"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public String getText(Object object) {
		String label = ((SAttribute) object).getLabel();
		return label == null || label.length() == 0 ? getString("_UI_SAttribute_type") : label;
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

		switch (notification.getFeatureID(SAttribute.class)) {
			case MetaABMPackage.SATTRIBUTE__AVAILABLE_TYPES:
			case MetaABMPackage.SATTRIBUTE__STYPE:
			case MetaABMPackage.SATTRIBUTE__DEFAULT_VALUE:
			case MetaABMPackage.SATTRIBUTE__UNITS:
			case MetaABMPackage.SATTRIBUTE__IMMUTABLE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
				// case MetaABMPackage.SATTRIBUTE__ACCESSORS:
				// fireNotifyChanged(new ViewerNotification(notification,
				// notification.getNotifier(), true, true));
				// return;
			case MetaABMPackage.IID__LABEL:
				SAttribute attr = (SAttribute) notification.getNotifier();
				for (Object accessor : attr.getAccessors()) {
					if (accessor instanceof AInput) {
						fireNotifyChanged(new ViewerNotification(notification, accessor, false, true));
					}
				}
			case MetaABMPackage.SATTRIBUTE__CHILDREN:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	protected Command createSetCommand(EditingDomain domain, EObject owner, EStructuralFeature feature, Object value, int index) {
		SAttribute attr = (SAttribute) owner;
		if (feature == MetaABMPackage.Literals.IID__LABEL || feature == MetaABMPackage.Literals.IID__ID) {
			CompoundCommand cmd = new CompoundCommand("Set to " + value);
			cmd.append(super.createSetCommand(domain, owner, feature, value, index));
			for (Object accessor : attr.getAccessors()) {
				if (accessor instanceof AInput) {
					ASink sink = ((AInput) accessor).getSink();
					if (sink != null && !sink.isMultiValue()) {
						cmd.append(new SuggestLabelCommand(domain, sink));
					}
				} else {
					cmd.append(new SuggestLabelCommand(domain, (IID) accessor));
				}
			}
			return cmd;
		} else if (feature == MetaABMPackage.Literals.SATTRIBUTE__DERIVED) {
			if (value instanceof Boolean) {
				CompoundCommand cmd = new CompoundCommand();
				Boolean b = (Boolean) value;
				SAgent agent = (SAgent) attr.getOwner();
				AGroup root = (AGroup) agent.getRootActivity();
				if (b.booleanValue()) {
					ADerive derive = MetaABMActFactory.eINSTANCE.createADerive();
					cmd.append(super.createSetCommand(domain, owner, feature, value, index));
					cmd.append(AddCommand.create(domain, root, MetaABMActPackage.Literals.AGROUP__MEMBERS, derive));
					cmd.append(SetCommand.create(domain, derive, MetaABMActPackage.Literals.AACCESSOR__ATTRIBUTE, attr));
					cmd.append(SetCommand.create(domain, derive, MetaABMPackage.Literals.IID__LABEL, "Derive " + attr.getLabel()));
				} else {
					cmd.append(super.createSetCommand(domain, owner, feature, value, index));
					for (AAct act : root.getMembers()) {
						if (act instanceof ADerive && ((ADerive) act).getAttribute() == attr) {
							cmd.append(RemoveCommand.create(domain, root, MetaABMActPackage.Literals.AGROUP__MEMBERS, act));
						}
					}
				}
				return cmd;
			}
		}
		return super.createSetCommand(domain, owner, feature, value, index);
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

	@Override
	public Object getForeground(Object object) {
		SAttribute attr = (SAttribute) object;
		if (attr.getOwner() != null && !attr.getOwner().references(attr)) {
			return GRAYED_OUT_COLOR;
		}
		return super.getForeground(object);
	}

	@Override
	public Object getForeground(Object object, int columnIndex) {
		return columnIndex == 0 ? getForeground(object) : super.getForeground(object, columnIndex);
	}
}
