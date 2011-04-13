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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.MissingResourceException;

import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.ResourceLocator;
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
import org.metaabm.IID;
import org.metaabm.IValue;
import org.metaabm.MetaABMPackage;
import org.metaabm.act.AInput;
import org.metaabm.act.ASelect;
import org.metaabm.act.ASink;
import org.metaabm.act.MetaABMActFactory;
import org.metaabm.act.MetaABMActPackage;
import org.metaabm.commands.SetSinkFunctionCommand;
import org.metaabm.commands.SetSinkLabelCommand;
import org.metaabm.commands.SuggestLabelCommand;
import org.metaabm.function.FFunction;
import org.metaabm.function.FGeneric;
import org.metaabm.function.FGenericLogical;
import org.metaabm.function.FLibrary;
import org.metaabm.function.FOperator;

/**
 * This is the item provider adapter for a {@link org.metaabm.act.ASink} object.
 * <!-- begin-user-doc -->
 * 
 * @author Miles Parker <!-- end-user-doc -->
 * @generated
 */
public class ASinkItemProvider extends AActItemProvider implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, ITableItemLabelProvider, ITableItemColorProvider, IItemColorProvider {

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ASinkItemProvider(AdapterFactory adapterFactory) {
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
			addInputsPropertyDescriptor(object);
			addFunctionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
			childrenFeatures = new ArrayList<EStructuralFeature>();
			childrenFeatures.add(MetaABMActPackage.Literals.ASINK__INPUTS);
			childrenFeatures.add(MetaABMActPackage.Literals.AACT__TARGETS);
		}
		return childrenFeatures;
	}

	public Collection<?> getChildren(Object object) {
		return ((ASink) object).getInputs();
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
	 * This adds a property descriptor for the Available Types feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAvailableTypesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_IValue_availableTypes_feature"), getString("_UI_PropertyDescriptor_description", "_UI_IValue_availableTypes_feature", "_UI_IValue_type"), MetaABMPackage.Literals.IVALUE__AVAILABLE_TYPES, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, new String[] { "org.eclipse.ui.views.properties.expert" }));
	}

	/**
	 * This adds a property descriptor for the Inputs feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInputsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_ASink_inputs_feature"), getString("_UI_PropertyDescriptor_description", "_UI_ASink_inputs_feature", "_UI_ASink_type"), MetaABMActPackage.Literals.ASINK__INPUTS, true, true, false, null, getString("_UI_RelationsPropertyCategory"), new String[] { "org.eclipse.ui.views.properties.expert" }));
	}

	/**
	 * This adds a property descriptor for the Function feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFunctionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_ASink_function_feature"), getString("_UI_PropertyDescriptor_description", "_UI_ASink_function_feature", "_UI_ASink_type"), MetaABMActPackage.Literals.ASINK__FUNCTION, true, false, true, null, getString("_UI_ActPropertyCategory"), null));
	}

	@SuppressWarnings("unchecked")
	protected Command createAddCommand(EditingDomain domain, EObject owner, EStructuralFeature feature, Collection<?> collection, int index) {
		if (feature == MetaABMActPackage.Literals.ASINK__INPUTS) {
			CompoundCommand cmd = new CompoundCommand("Add Sink Inputs");
			SuggestLabelCommand suggestLabelCommand = new SuggestLabelCommand(this, domain, (IID) owner);
			cmd.append(super.createAddCommand(domain, owner, feature, collection, index));
			for (AInput input : (Collection<AInput>) collection) {
				ASelect selected = ((ASink) owner).getSelected();
				if (selected != null) {
					cmd.appendIfCanExecute(SetCommand.create(domain, input, MetaABMActPackage.Literals.AINPUT__SELECTED, selected));
				}
				// cmd.appendIfCanExecute(AddCommand.create(domain,
				// input.getValue(),
				// (EStructuralFeature)
				// MetaABMPackage.Literals.IVALUE__ACCESSORS, input));
			}
			cmd.appendIfCanExecute(suggestLabelCommand);
			return cmd;
		} else {
			return super.createAddCommand(domain, owner, feature, collection, index);
		}
	}

	@SuppressWarnings("unchecked")
	protected Command createRemoveCommand(EditingDomain domain, EObject owner, EStructuralFeature feature, Collection<?> collection) {
		if (feature == MetaABMActPackage.Literals.ASINK__INPUTS) {
			CompoundCommand cmd = new CompoundCommand();
			for (AInput input : (Collection<AInput>) collection) {
				cmd.append(SetCommand.create(domain, input, MetaABMActPackage.Literals.AINPUT__VALUE, null));
			}
			cmd.append(super.createRemoveCommand(domain, owner, feature, collection));
			return cmd;
		} else {
			return super.createRemoveCommand(domain, owner, feature, collection);
		}
	}

	protected Command createSetCommand(EditingDomain domain, EObject owner, EStructuralFeature feature, Object value, int index) {
		ASink sink = (ASink) owner;
		if (feature == MetaABMActPackage.Literals.ASINK__FUNCTION && value == null || value instanceof FFunction) {
			FFunction function = (FFunction) value;
			CompoundCommand cmd = new CompoundCommand("Set Sink Function");
			cmd.append(super.createSetCommand(domain, owner, feature, value, index));
			cmd.appendIfCanExecute(new SetSinkFunctionCommand(domain, sink, function));
			if (value != null && !((FFunction) value).isMultiValue()) {
				cmd.appendIfCanExecute(new SuggestLabelCommand(domain, (IID) owner));
			}
			return cmd;
		} else if (feature == MetaABMPackage.Literals.IID__LABEL) {
			CompoundCommand cmd = new CompoundCommand("Sink Label Command");
			cmd.append(super.createSetCommand(domain, owner, feature, value, index));
			cmd.appendIfCanExecute(new SetSinkLabelCommand(domain, sink, (String) value));
			return cmd;
		}
		return super.createSetCommand(domain, owner, feature, value, index);
	}

	// public boolean reachable(ASink from, IValue value) {
	// if (from.isSourceFor(value)) {
	// return true;
	// } else if (reachable(from.getReference(), value)) {
	// return true;
	// } else if ((from.getSelected() != null) &&
	// (reachable(from.getSelected().getAgent(), value))) {
	// return true;
	// }
	// return false;
	// }

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached children and by creating a
	 * viewer notification, which it passes to {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ASink.class)) {
			case MetaABMActPackage.ASINK__SELECTED:
			case MetaABMActPackage.ASINK__FUNCTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, true));
				return;
			case MetaABMActPackage.ASINK__INPUTS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	public static String getImageNameForFunction(FFunction function) {
		if (function != null) {
			if (function instanceof FOperator) {
				return StringUtils.capitalize(function.getID());
			} else if (function.eContainer() instanceof FLibrary && ((FLibrary) function.eContainer()).getID().equals("spatial")) {
				return "Spatial";
			} else if (function.eContainer() instanceof FLibrary && ((FLibrary) function.eContainer()).getID().equals("random")) {
				return "Random";
			} else if (function instanceof FGenericLogical) {
				return "GenericLogical";
			}
		}
		return "GenericFunction";
	}

	static Map<FFunction, Object> sinkImages = new HashMap<FFunction, Object>();

	public Map<FFunction, Object> getImageCache() {
		return sinkImages;
	}

	/**
	 * Image from Function if defined. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Object getImage(Object object) {
		Object img = getImageCache().get(((ASink) object).getFunction());
		if (img == null) {
			img = getImageForFunction(getResourceLocator(), object, getQualifier());
			img = overlayImage(object, img);
			getImageCache().put(((ASink) object).getFunction(), img);
		}
		return img;
	}

	public static Object getImageForFunction(ResourceLocator locator, Object object, String qualifier) {
		Object img = null;
		String path = "full/obj16/";
		ASink sink = (ASink) object;
		FFunction baseFunction = sink.getFunction();
		if (baseFunction != null) {
			String imageNameForFunction = getImageNameForFunction(baseFunction);
			String imagePath = path + qualifier + imageNameForFunction;
			try {
				return locator.getImage(imagePath);
			} catch (MissingResourceException e) {
				System.err.println("Couldn't find image at: " + imagePath);
			}
		}
		try {
			return locator.getImage(path + "AEvaluate");
		} catch (MissingResourceException e2) {
			System.err.println("Couldn't find image at: " + path);
		}
		if (img == null) {
			throw new RuntimeException("Couldn't find image at: " + path);
		}
		return img;
	}

	public String getQualifier() {
		return "A";
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children that can be created under
	 * this object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(MetaABMActPackage.Literals.ASINK__INPUTS, MetaABMActFactory.eINSTANCE.createAInput()));
	}

	private String getInputLabel(ASink sink, int index) {
		EList<AInput> inputs = sink.getInputs();
		if (inputs.size() > index) {
			IValue value = inputs.get(index).getValue();
			if (value != null) {
				return value.getLabel();
			}
		}
		return "[?]";
	}

	public static List<String> getInputLabels(ASink sink) {
		List<String> inputs = new ArrayList<String>();
		for (AInput in : sink.getInputs()) {
			if (in.getValue() != null) {
				inputs.add(in.getValue().getLabel());
			}
		}
		return inputs;
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		// ASink sink = (ASink) object;
		// String label = sink.getLabel();
		// // Don't show selected if it is root
		// if (sink.getRootSelected() != null && sink.getRootSelected().getLabel() != null) {
		// label = label.replace(sink.getRootSelected().getLabel() + ": ", "");
		// }
		return super.getText(object);
	}

	public String suggestLabel(IID object) {
		ASink sink = (ASink) object;
		StringBuffer expression = new StringBuffer();
		// if (sink.getSelected() != null && sink.getSelected().getLabel() != null) {
		// expression.append(sink.getSelected().getLabel());
		// expression.append(": ");
		// }
		appendFunctionLabel(sink, expression);
		return expression.toString();
	}

	private void appendFunctionLabel(ASink sink, StringBuffer expression) {
		FFunction baseFunction = sink.getFunction();
		if (baseFunction == null) {
			expression.append("[Unspecified](" + StringUtils.join(getInputLabels(sink).iterator(), ", ") + ")");
		} else if (baseFunction instanceof FGeneric) {
			expression.append(baseFunction.getLabel());
			expression.append("(");
			expression.append(StringUtils.join(getInputLabels(sink).iterator(), ", "));
			expression.append(")");
		} else if (baseFunction instanceof FOperator) {
			FOperator operator = (FOperator) baseFunction;
			int arity = operator.getArity();
			switch (arity) {
				// typically literal
				case 0:
					break;
				case 1:
					expression.append(operator.getLabel());
					expression.append(" ");
					expression.append(getInputLabel(sink, 0));
					break;
				case 2:
					expression.append(getInputLabel(sink, 0));
					expression.append(" ");
					expression.append(operator.getLabel());
					expression.append(" ");
					expression.append(getInputLabel(sink, 1));
					break;
				default:
					expression.append("[Unsupported Arity:" + arity + "]");
			}
		} else {
			expression.append("[Unsupported Function Type");
		}
	}

	public boolean hasChildren(Object object) {
		return ((ASink) object).getInputs().size() > 0 || super.hasChildren(object);
	}

	// public String suggestID(IID object) {
	// ASink sink = (ASink) object;
	// String id;
	// if (sink.getFunction() != null) {
	// id = sink.getFunction().getID();
	// } else {
	// id = "Ident";
	// }
	// id += StringUtils.join(idsCaps(sink.getInputs()).toArray());
	// return super.suggestID(object) + id;
	// }
}
