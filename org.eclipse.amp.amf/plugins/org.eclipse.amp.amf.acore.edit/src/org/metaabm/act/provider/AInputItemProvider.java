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
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.common.util.URI;
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
import org.metaabm.SAgent;
import org.metaabm.SAttribute;
import org.metaabm.SNamed;
import org.metaabm.act.AAct;
import org.metaabm.act.AInput;
import org.metaabm.act.ALiteral;
import org.metaabm.act.AMultiValue;
import org.metaabm.act.ASink;
import org.metaabm.act.MetaABMActFactory;
import org.metaabm.act.MetaABMActPackage;
import org.metaabm.commands.SuggestLabelCommand;
import org.metaabm.provider.MetaABMEditPlugin;
import org.metaabm.provider.MetaABMItemProvider;

/**
 * This is the item provider adapter for a {@link org.metaabm.act.AInput} object.
 * <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * @generated
 */
public class AInputItemProvider extends MetaABMItemProvider implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, ITableItemLabelProvider, ITableItemColorProvider, IItemColorProvider {

	static URI LIGHT_GRAY_BLUE_COLOR = URI.createURI("color://rgb/100/120/200");

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AInputItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addValuePropertyDescriptor(object);
			addSelectedPropertyDescriptor(object);
			addLiteralPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	public boolean inputValueFor(SAgent agent, IValue value) {
		if (agent.getAttributes().contains(value)) {
			return true;
		} else if (agent.getOwner() != null && inputValueFor(agent.getOwner(), value)) {
			return true;
		}
		return false;
	}

	/**
	 * This adds a property descriptor for the Value feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void addValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_AInput_value_feature"), getString("_UI_PropertyDescriptor_description", "_UI_AInput_value_feature", "_UI_AInput_type"), MetaABMActPackage.Literals.AINPUT__VALUE, true, false, true, null, null, null) {
			@SuppressWarnings("unchecked")
			public Collection<?> getChoiceOfValues(Object object) {
				AInput input = (AInput) object;
				return input.potentialValues((Collection<IValue>) super.getChoiceOfValues(object));
			}
		});
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
			childrenFeatures.add(MetaABMActPackage.Literals.AINPUT__LITERAL);
		}
		return childrenFeatures;
	}

	// @Override
	public Collection<?> getChildren(Object object) {
		Collection<?> children = super.getChildren(object);
		if (children.size() == 1 && children.toArray()[0] instanceof ALiteral) {
			return children;
		}
		return Collections.EMPTY_LIST;
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean hasChildren(Object object) {
		return hasChildren(object, true);
	}

	/**
	 * This adds a property descriptor for the Selected feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void addSelectedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_AInput_selected_feature"), getString("_UI_PropertyDescriptor_description", "_UI_AInput_selected_feature", "_UI_AInput_type"), MetaABMActPackage.Literals.AINPUT__SELECTED, true, false, true, null, null, null) {
			@SuppressWarnings("unchecked")
			public Collection<?> getChoiceOfValues(Object object) {
				Collection<AAct> original = (Collection<AAct>) super.getChoiceOfValues(object);
				Collection<AAct> potential = new ArrayList<AAct>();
				for (AAct candidate : original) {
					if (((AInput) object).getSink().isTargetOf(candidate)) {
						potential.add(candidate);
					}
				}
				return potential;
			}

		});
	}

	/**
	 * This adds a property descriptor for the Literal feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLiteralPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_AInput_literal_feature"), getString("_UI_PropertyDescriptor_description", "_UI_AInput_literal_feature", "_UI_AInput_type"), MetaABMActPackage.Literals.AINPUT__LITERAL, false, false, false, null, getString("_UI_RelationsPropertyCategory"), new String[] { "org.eclipse.ui.views.properties.expert" }));
	}

	protected Command createSetCommand(EditingDomain domain, EObject owner, EStructuralFeature feature, Object value, int index) {
		if (feature == MetaABMActPackage.Literals.AINPUT__VALUE || feature == MetaABMActPackage.Literals.AINPUT__LITERAL) {
			AInput input = (AInput) owner;
			ASink sink = input.getSink();
			SuggestLabelCommand suggestSinkLabelCommand = null;
			if (sink != null) {
				suggestSinkLabelCommand = new SuggestLabelCommand(domain, sink);
			}
			// force a store of old value..
			CompoundCommand cmd = new CompoundCommand("Set Input Value");
			cmd.append(super.createSetCommand(domain, owner, feature, value, index));
			if (feature == MetaABMActPackage.Literals.AINPUT__VALUE) {
				if (value instanceof ALiteral) {
					cmd.append(super.createSetCommand(domain, owner, MetaABMActPackage.Literals.AINPUT__LITERAL, value));
				} else if (input.getLiteral() != null) {
					cmd.append(super.createSetCommand(domain, owner, MetaABMActPackage.Literals.AINPUT__LITERAL, null));
				}
			} else if (feature == MetaABMActPackage.Literals.AINPUT__LITERAL) {
				cmd.append(super.createSetCommand(domain, owner, MetaABMActPackage.Literals.AINPUT__VALUE, value));
			}
			if (suggestSinkLabelCommand != null && !sink.isMultiValue()) {
				cmd.appendIfCanExecute(suggestSinkLabelCommand);
			}
			return cmd;
		}
		return super.createSetCommand(domain, owner, feature, value, index);
	}

	public boolean isAccessed(IValue value) {
		return value != null && !(value instanceof SAttribute && ((SAttribute) value).isImmutable()) && !(value instanceof ALiteral);
	}

	public String suggestLabel(IID object) {
		AInput input = (AInput) object;
		if (input.getLiteral() == null) {
			String label = input.getValue() != null ? input.getValue().getLabel() : "null";
			label += input.getSink() != null ? " " + input.getSink().getInputs().indexOf(input) : "[]";
			label += " Input";
			return label;
		} else {
			return input.getLiteral().getLabel() + " Input";
		}
	}

	/**
	 * This returns AInput.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AInput"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		AInput input = (AInput) object;
		if (input.getLiteral() == null) {
			IValue value = ((AInput) object).getValue();
			if (value != null && value.getLabel() != null) {
				String text;
				// valProvider = (MetaABMItemProvider)
				// MetaABMItemProviderAdapterFactory
				// .getGenericAdapterFactory().adapt(value,
				// IEditingDomainItemProvider.class);
				// if (valProvider != null) {
				// text = valProvider.getText(value);
				// } else {
				text = value.getLabel();
				// }
				if (input.getSelected() != null && input.getSink() != null && input.getSelected() != input.getSink().getRootSelected()) {
					text = input.getSelected().getLabel() + ": " + text;
				}
				return text;
			} else {
				return getString("_UI_" + ((EObject) object).eClass().getName() + "_type");
			}
		} else {
			if (input.getLiteral() instanceof AMultiValue) {
				return "Multiple Values";
			} else {
				return "\"" + input.getLiteral().getValueLiteral() + "\"";
			}
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

		switch (notification.getFeatureID(AInput.class)) {
			// case MetaABMActPackage.AINPUT__SINK:
			// case MetaABMActPackage.AINPUT__SELECTED:
			// fireNotifyChanged(new ViewerNotification(notification,
			// notification.getNotifier(), true, true));
			// return;
			case MetaABMActPackage.AINPUT__LITERAL:
			case MetaABMActPackage.AINPUT__VALUE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, true));
				return;
			case MetaABMActPackage.AINPUT__SELECTED:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				// fireNotifyChanged(new ViewerNotification(notification,
				// notification.getOldValue(), true, false));
				// fireNotifyChanged(new ViewerNotification(notification,
				// notification.getNewValue(), true, false));
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

		newChildDescriptors.add(createChildParameter(MetaABMActPackage.Literals.AINPUT__LITERAL, MetaABMActFactory.eINSTANCE.createALiteral()));

		newChildDescriptors.add(createChildParameter(MetaABMActPackage.Literals.AINPUT__LITERAL, MetaABMActFactory.eINSTANCE.createAMultiValue()));
	}

	@Override
	public String getColumnText(Object object, int columnIndex) {
		IValue value = ((AInput) object).getValue();
		if (value != null && columnIndex == 0) {
			return value.getLabel();
		} else if (columnIndex == 1) {
			if (value instanceof SNamed) {
				return ((SNamed) value).getDescription();
			} else {
				return getText(object);
			}
		}
		return super.getColumnText(object, columnIndex);
	}

	@Override
	public Object getForeground(Object object) {
		return LIGHT_GRAY_BLUE_COLOR;
	}

	// @Override
	// public Object getBackground(Object object) {
	// AInput input = (AInput) object;
	// return AActItemProvider.selectionColor(input.getSelected());
	// }

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
