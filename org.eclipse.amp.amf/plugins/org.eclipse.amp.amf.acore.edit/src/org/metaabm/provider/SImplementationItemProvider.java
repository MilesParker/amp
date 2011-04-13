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
import java.util.Collections;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
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
import org.metaabm.SImplementation;
import org.metaabm.SImplemented;
import org.metaabm.commands.SetGenerateCommand;
import org.metaabm.commands.SetLabelCommand;

/**
 * This is the item provider adapter for a {@link org.metaabm.SImplementation} object.
 * <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * @generated
 */
public class SImplementationItemProvider extends MetaABMItemProvider implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, ITableItemLabelProvider, ITableItemColorProvider, IItemColorProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SImplementationItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	protected Command createSetCommand(EditingDomain domain, EObject owner, EStructuralFeature feature, Object value, int index) {
		if (feature == MetaABMPackage.Literals.IID__LABEL) {
			return SetLabelCommand.create(domain, owner, feature, value, index);
		} else if (feature == MetaABMPackage.Literals.SIMPLEMENTATION__MODE) {
			return new SetGenerateCommand(domain, owner, value) {
				public Collection<?> doGetAffectedObjects() {
					return Collections.singleton(this.owner.eContainer());
				}
			};
		} else {
			return new SetCommand(domain, owner, feature, value, index) {
				public Collection<?> doGetAffectedObjects() {
					return Collections.singleton(this.owner.eContainer());
				}
			};
		}
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

			addPackagePropertyDescriptor(object);
			addClassNamePropertyDescriptor(object);
			addBasePathPropertyDescriptor(object);
			addModePropertyDescriptor(object);
			addTargetPropertyDescriptor(object);
			addQualifiedNamePropertyDescriptor(object);
			addDerivedPathPropertyDescriptor(object);
			addDerivedPackagePropertyDescriptor(object);
			addJavaFileLocPropertyDescriptor(object);
			addSrcDirPropertyDescriptor(object);
			addBinDirPropertyDescriptor(object);
			addClassFileLocPropertyDescriptor(object);
			addDerivedBinDirPropertyDescriptor(object);
			addDerivedSrcDirPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Package feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPackagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_SImplementation_package_feature"), getString("_UI_SImplementation_package_description"), MetaABMPackage.Literals.SIMPLEMENTATION__PACKAGE, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Class Name feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_SImplementation_className_feature"), getString("_UI_PropertyDescriptor_description", "_UI_SImplementation_className_feature", "_UI_SImplementation_type"), MetaABMPackage.Literals.SIMPLEMENTATION__CLASS_NAME, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Base Path feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBasePathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_SImplementation_basePath_feature"), getString("_UI_SImplementation_basePath_description"), MetaABMPackage.Literals.SIMPLEMENTATION__BASE_PATH, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Target feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_SImplementation_target_feature"), getString("_UI_PropertyDescriptor_description", "_UI_SImplementation_target_feature", "_UI_SImplementation_type"), MetaABMPackage.Literals.SIMPLEMENTATION__TARGET, false, false, false, null, null, new String[] { "org.eclipse.ui.views.properties.expert" }));
	}

	/**
	 * This adds a property descriptor for the Mode feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_SImplementation_mode_feature"), getString("_UI_PropertyDescriptor_description", "_UI_SImplementation_mode_feature", "_UI_SImplementation_type"), MetaABMPackage.Literals.SIMPLEMENTATION__MODE, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Qualified Name feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addQualifiedNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_SImplementation_qualifiedName_feature"), getString("_UI_PropertyDescriptor_description", "_UI_SImplementation_qualifiedName_feature", "_UI_SImplementation_type"), MetaABMPackage.Literals.SIMPLEMENTATION__QUALIFIED_NAME, false, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, new String[] { "org.eclipse.ui.views.properties.expert" }));
	}

	/**
	 * This adds a property descriptor for the Derived Path feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDerivedPathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_SImplementation_derivedPath_feature"), getString("_UI_PropertyDescriptor_description", "_UI_SImplementation_derivedPath_feature", "_UI_SImplementation_type"), MetaABMPackage.Literals.SIMPLEMENTATION__DERIVED_PATH, false, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, new String[] { "org.eclipse.ui.views.properties.expert" }));
	}

	/**
	 * This adds a property descriptor for the Derived Package feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDerivedPackagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_SImplementation_derivedPackage_feature"), getString("_UI_PropertyDescriptor_description", "_UI_SImplementation_derivedPackage_feature", "_UI_SImplementation_type"), MetaABMPackage.Literals.SIMPLEMENTATION__DERIVED_PACKAGE, false, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, new String[] { "org.eclipse.ui.views.properties.expert" }));
	}

	/**
	 * This adds a property descriptor for the Java File Loc feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addJavaFileLocPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_SImplementation_javaFileLoc_feature"), getString("_UI_PropertyDescriptor_description", "_UI_SImplementation_javaFileLoc_feature", "_UI_SImplementation_type"), MetaABMPackage.Literals.SIMPLEMENTATION__JAVA_FILE_LOC, false, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Src Dir feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSrcDirPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_SImplementation_srcDir_feature"), getString("_UI_PropertyDescriptor_description", "_UI_SImplementation_srcDir_feature", "_UI_SImplementation_type"), MetaABMPackage.Literals.SIMPLEMENTATION__SRC_DIR, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Bin Dir feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBinDirPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_SImplementation_binDir_feature"), getString("_UI_PropertyDescriptor_description", "_UI_SImplementation_binDir_feature", "_UI_SImplementation_type"), MetaABMPackage.Literals.SIMPLEMENTATION__BIN_DIR, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Class File Loc feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClassFileLocPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_SImplementation_classFileLoc_feature"), getString("_UI_PropertyDescriptor_description", "_UI_SImplementation_classFileLoc_feature", "_UI_SImplementation_type"), MetaABMPackage.Literals.SIMPLEMENTATION__CLASS_FILE_LOC, false, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Derived Bin Dir feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDerivedBinDirPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_SImplementation_derivedBinDir_feature"), getString("_UI_PropertyDescriptor_description", "_UI_SImplementation_derivedBinDir_feature", "_UI_SImplementation_type"), MetaABMPackage.Literals.SIMPLEMENTATION__DERIVED_BIN_DIR, false, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, new String[] { "org.eclipse.ui.views.properties.expert" }));
	}

	/**
	 * This adds a property descriptor for the Derived Src Dir feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDerivedSrcDirPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_SImplementation_derivedSrcDir_feature"), getString("_UI_PropertyDescriptor_description", "_UI_SImplementation_derivedSrcDir_feature", "_UI_SImplementation_type"), MetaABMPackage.Literals.SIMPLEMENTATION__DERIVED_SRC_DIR, false, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, new String[] { "org.eclipse.ui.views.properties.expert" }));
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
	 * This returns SImplementation.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SImplementation"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SImplementation) object).getClassName();
		return label == null || label.length() == 0 ? getString("_UI_SImplementation_type") : getString("_UI_SImplementation_type") + " " + label;
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

		switch (notification.getFeatureID(SImplementation.class)) {
			case MetaABMPackage.SIMPLEMENTATION__PACKAGE:
			case MetaABMPackage.SIMPLEMENTATION__CLASS_NAME:
			case MetaABMPackage.SIMPLEMENTATION__BASE_PATH:
			case MetaABMPackage.SIMPLEMENTATION__MODE:
			case MetaABMPackage.SIMPLEMENTATION__QUALIFIED_NAME:
			case MetaABMPackage.SIMPLEMENTATION__DERIVED_PATH:
			case MetaABMPackage.SIMPLEMENTATION__DERIVED_PACKAGE:
			case MetaABMPackage.SIMPLEMENTATION__JAVA_FILE_LOC:
			case MetaABMPackage.SIMPLEMENTATION__SRC_DIR:
			case MetaABMPackage.SIMPLEMENTATION__BIN_DIR:
			case MetaABMPackage.SIMPLEMENTATION__CLASS_FILE_LOC:
			case MetaABMPackage.SIMPLEMENTATION__DERIVED_BIN_DIR:
			case MetaABMPackage.SIMPLEMENTATION__DERIVED_SRC_DIR:
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

	public String suggestLabel(IID object) {
		SImplementation impl = (SImplementation) object;
		String label = "Implementation";
		SImplemented i = impl.getTarget();
		if (i != null && !StringUtils.isEmpty(i.getLabel())) {
			label = i.getLabel() + " " + label;
		}
		return label;
	}

	public String suggestID(IID object) {
		return "";
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ((IChildCreationExtender) adapterFactory).getResourceLocator();
	}

}
