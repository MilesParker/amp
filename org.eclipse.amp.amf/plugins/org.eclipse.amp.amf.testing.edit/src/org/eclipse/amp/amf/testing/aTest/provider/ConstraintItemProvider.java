/**
 * <copyright>
 * </copyright>
 *
 * $Id: ConstraintItemProvider.java,v 1.8 2010/08/04 01:54:39 mparker Exp $
 */
package org.eclipse.amp.amf.testing.aTest.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.amp.amf.abase.aBase.ABaseFactory;
import org.eclipse.amp.amf.testing.aTest.ATestPackage;
import org.eclipse.amp.amf.testing.aTest.Constraint;
import org.eclipse.amp.amf.testing.aTest.Measure;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.metaabm.SStateValue;

/**
 * This is the item provider adapter for a {@link org.eclipse.amp.amf.testing.aTest.Constraint} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class ConstraintItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public ConstraintItemProvider(AdapterFactory adapterFactory) {
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

            addMeasurePropertyDescriptor(object);
            addAgentPropertyDescriptor(object);
            addAttributePropertyDescriptor(object);
            addQualifierPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Measure feature.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected void addMeasurePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Constraint_measure_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Constraint_measure_feature", "_UI_Constraint_type"),
                 ATestPackage.Literals.CONSTRAINT__MEASURE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Agent feature.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected void addAgentPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Constraint_agent_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Constraint_agent_feature", "_UI_Constraint_type"),
                 ATestPackage.Literals.CONSTRAINT__AGENT,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Attribute feature.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected void addAttributePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Constraint_attribute_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Constraint_attribute_feature", "_UI_Constraint_type"),
                 ATestPackage.Literals.CONSTRAINT__ATTRIBUTE,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Qualifier feature.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected void addQualifierPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Constraint_qualifier_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Constraint_qualifier_feature", "_UI_Constraint_type"),
                 ATestPackage.Literals.CONSTRAINT__QUALIFIER,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
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
            childrenFeatures.add(ATestPackage.Literals.CONSTRAINT__MIN_VALUE);
            childrenFeatures.add(ATestPackage.Literals.CONSTRAINT__MAX_VALUE);
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
     * This returns Constraint.gif.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/Constraint"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    @Override
    public String getText(Object object) {
        Constraint constraint = (Constraint) object;
        String label = constraint.getMeasure() != null ? constraint.getMeasure() + " " : "";
        label += constraint.getAttribute() != null ? constraint.getAttribute().getLabel() + " " : "";
        label += constraint.getQualifier() instanceof SStateValue ? "=" + constraint.getQualifier().getLabel() : "";
        label += constraint.getQualifier() instanceof EObject ? constraint.getQualifier().getLabel() : "";
        label += constraint.getMinValue() != null ? "[" + constraint.getMinValue() + ", "
            : "";
        label += constraint.getMaxValue() != null ? constraint.getMaxValue() + "]" : "";
        return label;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached children and by creating
     * a viewer notification, which it passes to {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     */
    @Override
    public void notifyChanged(Notification notification) {
        updateChildren(notification);

        switch (notification.getFeatureID(Constraint.class)) {
            case ATestPackage.CONSTRAINT__MEASURE:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case ATestPackage.CONSTRAINT__MIN_VALUE:
            case ATestPackage.CONSTRAINT__MAX_VALUE:
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

        newChildDescriptors.add
            (createChildParameter
                (ATestPackage.Literals.CONSTRAINT__MIN_VALUE,
                 ABaseFactory.eINSTANCE.createValue()));

        newChildDescriptors.add
            (createChildParameter
                (ATestPackage.Literals.CONSTRAINT__MIN_VALUE,
                 ABaseFactory.eINSTANCE.createIntValue()));

        newChildDescriptors.add
            (createChildParameter
                (ATestPackage.Literals.CONSTRAINT__MIN_VALUE,
                 ABaseFactory.eINSTANCE.createRealValue()));

        newChildDescriptors.add
            (createChildParameter
                (ATestPackage.Literals.CONSTRAINT__MIN_VALUE,
                 ABaseFactory.eINSTANCE.createStringValue()));

        newChildDescriptors.add
            (createChildParameter
                (ATestPackage.Literals.CONSTRAINT__MIN_VALUE,
                 ABaseFactory.eINSTANCE.createBooleanValue()));

        newChildDescriptors.add
            (createChildParameter
                (ATestPackage.Literals.CONSTRAINT__MAX_VALUE,
                 ABaseFactory.eINSTANCE.createValue()));

        newChildDescriptors.add
            (createChildParameter
                (ATestPackage.Literals.CONSTRAINT__MAX_VALUE,
                 ABaseFactory.eINSTANCE.createIntValue()));

        newChildDescriptors.add
            (createChildParameter
                (ATestPackage.Literals.CONSTRAINT__MAX_VALUE,
                 ABaseFactory.eINSTANCE.createRealValue()));

        newChildDescriptors.add
            (createChildParameter
                (ATestPackage.Literals.CONSTRAINT__MAX_VALUE,
                 ABaseFactory.eINSTANCE.createStringValue()));

        newChildDescriptors.add
            (createChildParameter
                (ATestPackage.Literals.CONSTRAINT__MAX_VALUE,
                 ABaseFactory.eINSTANCE.createBooleanValue()));
    }

    /**
     * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
        Object childFeature = feature;
        Object childObject = child;

        boolean qualify =
            childFeature == ATestPackage.Literals.CONSTRAINT__MIN_VALUE ||
            childFeature == ATestPackage.Literals.CONSTRAINT__MAX_VALUE;

        if (qualify) {
            return getString
                ("_UI_CreateChild_text2",
                 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
        }
        return super.getCreateChildText(owner, feature, child, selection);
    }

    /**
     * Return the resource locator for this item provider's resources.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        return ATestEditPlugin.INSTANCE;
    }

    public static String getMeasureAbrv(Measure measure) {

        switch (measure.getValue()) {
            case Measure.COUNT_VALUE:
                return "#";
            case Measure.AVERAGE_VALUE:
                return "\u03BC";
            case Measure.SUM_VALUE:
                return "\u03A3";
            case Measure.MINIMUM_VALUE:
                return Measure.MINIMUM.getLiteral();
            case Measure.MAXIMUM_VALUE:
                return Measure.MAXIMUM.getLiteral();
        }
        return null;
    }

}
