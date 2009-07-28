/**
 * <copyright>
 * </copyright>
 *
 * $Id: ParameterItemProvider.java,v 1.3 2009/07/28 20:56:29 mparker Exp $
 */
package org.eclipse.amp.amf.parameters.aPar.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.amp.amf.parameters.aPar.AParFactory;
import org.eclipse.amp.amf.parameters.aPar.AParPackage;
import org.eclipse.amp.amf.parameters.aPar.Parameter;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.metaabm.MetaABMFactory;

import org.metaabm.act.MetaABMActFactory;

import org.metaabm.function.MetaABMFunctionFactory;

/**
 * This is the item provider adapter for a {@link org.eclipse.amp.amf.parameters.aPar.Parameter} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ParameterItemProvider
    extends ItemProviderAdapter
    implements
        IEditingDomainItemProvider,
        IStructuredItemContentProvider,
        ITreeItemContentProvider,
        IItemLabelProvider,
        IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ParameterItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
        if (itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

            addAttributePropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAttributePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Parameter_attribute_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Parameter_attribute_feature", "_UI_Parameter_type"),
                 AParPackage.Literals.PARAMETER__ATTRIBUTE,
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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
        if (childrenFeatures == null) {
            super.getChildrenFeatures(object);
            childrenFeatures.add(AParPackage.Literals.PARAMETER__VALUE);
        }
        return childrenFeatures;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EStructuralFeature getChildFeature(Object object, Object child) {
        // Check the type of the specified child object and return the proper feature to use for
        // adding (see {@link AddCommand}) it as a child.

        return super.getChildFeature(object, child);
    }

    /**
     * This returns Parameter.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/Parameter"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        return getString("_UI_Parameter_type");
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged(Notification notification) {
        updateChildren(notification);

        switch (notification.getFeatureID(Parameter.class)) {
            case AParPackage.PARAMETER__VALUE:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
                return;
        }
        super.notifyChanged(notification);
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);

        newChildDescriptors.add
            (createChildParameter
                (AParPackage.Literals.PARAMETER__VALUE,
                 AParFactory.eINSTANCE.createModel()));

        newChildDescriptors.add
            (createChildParameter
                (AParPackage.Literals.PARAMETER__VALUE,
                 AParFactory.eINSTANCE.createImport()));

        newChildDescriptors.add
            (createChildParameter
                (AParPackage.Literals.PARAMETER__VALUE,
                 AParFactory.eINSTANCE.createIncorporates()));

        newChildDescriptors.add
            (createChildParameter
                (AParPackage.Literals.PARAMETER__VALUE,
                 AParFactory.eINSTANCE.createParameter()));

        newChildDescriptors.add
            (createChildParameter
                (AParPackage.Literals.PARAMETER__VALUE,
                 AParFactory.eINSTANCE.createIntValue()));

        newChildDescriptors.add
            (createChildParameter
                (AParPackage.Literals.PARAMETER__VALUE,
                 AParFactory.eINSTANCE.createRealValue()));

        newChildDescriptors.add
            (createChildParameter
                (AParPackage.Literals.PARAMETER__VALUE,
                 AParFactory.eINSTANCE.createStringValue()));

        newChildDescriptors.add
            (createChildParameter
                (AParPackage.Literals.PARAMETER__VALUE,
                 AParFactory.eINSTANCE.createBooleanValue()));

        newChildDescriptors.add
            (createChildParameter
                (AParPackage.Literals.PARAMETER__VALUE,
                 MetaABMFactory.eINSTANCE.createSAttribute()));

        newChildDescriptors.add
            (createChildParameter
                (AParPackage.Literals.PARAMETER__VALUE,
                 MetaABMFactory.eINSTANCE.createSAttributeArray()));

        newChildDescriptors.add
            (createChildParameter
                (AParPackage.Literals.PARAMETER__VALUE,
                 MetaABMFactory.eINSTANCE.createSState()));

        newChildDescriptors.add
            (createChildParameter
                (AParPackage.Literals.PARAMETER__VALUE,
                 MetaABMFactory.eINSTANCE.createSStateValue()));

        newChildDescriptors.add
            (createChildParameter
                (AParPackage.Literals.PARAMETER__VALUE,
                 MetaABMFactory.eINSTANCE.createSAgent()));

        newChildDescriptors.add
            (createChildParameter
                (AParPackage.Literals.PARAMETER__VALUE,
                 MetaABMFactory.eINSTANCE.createSContext()));

        newChildDescriptors.add
            (createChildParameter
                (AParPackage.Literals.PARAMETER__VALUE,
                 MetaABMFactory.eINSTANCE.createSContinuousSpace()));

        newChildDescriptors.add
            (createChildParameter
                (AParPackage.Literals.PARAMETER__VALUE,
                 MetaABMFactory.eINSTANCE.createSGrid()));

        newChildDescriptors.add
            (createChildParameter
                (AParPackage.Literals.PARAMETER__VALUE,
                 MetaABMFactory.eINSTANCE.createSNetwork()));

        newChildDescriptors.add
            (createChildParameter
                (AParPackage.Literals.PARAMETER__VALUE,
                 MetaABMFactory.eINSTANCE.createSGeography()));

        newChildDescriptors.add
            (createChildParameter
                (AParPackage.Literals.PARAMETER__VALUE,
                 MetaABMFactory.eINSTANCE.createSValueLayer()));

        newChildDescriptors.add
            (createChildParameter
                (AParPackage.Literals.PARAMETER__VALUE,
                 MetaABMFactory.eINSTANCE.createSStyle2D()));

        newChildDescriptors.add
            (createChildParameter
                (AParPackage.Literals.PARAMETER__VALUE,
                 MetaABMFactory.eINSTANCE.createSStyleShape()));

        newChildDescriptors.add
            (createChildParameter
                (AParPackage.Literals.PARAMETER__VALUE,
                 MetaABMFactory.eINSTANCE.createSStyle3D()));

        newChildDescriptors.add
            (createChildParameter
                (AParPackage.Literals.PARAMETER__VALUE,
                 MetaABMFactory.eINSTANCE.createSImplementation()));

        newChildDescriptors.add
            (createChildParameter
                (AParPackage.Literals.PARAMETER__VALUE,
                 MetaABMFunctionFactory.eINSTANCE.createFArgumentPrototype()));

        newChildDescriptors.add
            (createChildParameter
                (AParPackage.Literals.PARAMETER__VALUE,
                 MetaABMFunctionFactory.eINSTANCE.createFArgumentArrayPrototype()));

        newChildDescriptors.add
            (createChildParameter
                (AParPackage.Literals.PARAMETER__VALUE,
                 MetaABMFunctionFactory.eINSTANCE.createFOperator()));

        newChildDescriptors.add
            (createChildParameter
                (AParPackage.Literals.PARAMETER__VALUE,
                 MetaABMFunctionFactory.eINSTANCE.createFLogicalOperator()));

        newChildDescriptors.add
            (createChildParameter
                (AParPackage.Literals.PARAMETER__VALUE,
                 MetaABMFunctionFactory.eINSTANCE.createFGenericFunction()));

        newChildDescriptors.add
            (createChildParameter
                (AParPackage.Literals.PARAMETER__VALUE,
                 MetaABMFunctionFactory.eINSTANCE.createFGenericLogical()));

        newChildDescriptors.add
            (createChildParameter
                (AParPackage.Literals.PARAMETER__VALUE,
                 MetaABMFunctionFactory.eINSTANCE.createFLibrary()));

        newChildDescriptors.add
            (createChildParameter
                (AParPackage.Literals.PARAMETER__VALUE,
                 MetaABMFunctionFactory.eINSTANCE.createFImplementedLibrary()));

        newChildDescriptors.add
            (createChildParameter
                (AParPackage.Literals.PARAMETER__VALUE,
                 MetaABMFunctionFactory.eINSTANCE.createFMultiArgumentPrototype()));

        newChildDescriptors.add
            (createChildParameter
                (AParPackage.Literals.PARAMETER__VALUE,
                 MetaABMActFactory.eINSTANCE.createAInput()));

        newChildDescriptors.add
            (createChildParameter
                (AParPackage.Literals.PARAMETER__VALUE,
                 MetaABMActFactory.eINSTANCE.createALiteral()));

        newChildDescriptors.add
            (createChildParameter
                (AParPackage.Literals.PARAMETER__VALUE,
                 MetaABMActFactory.eINSTANCE.createAMultiValue()));

        newChildDescriptors.add
            (createChildParameter
                (AParPackage.Literals.PARAMETER__VALUE,
                 MetaABMActFactory.eINSTANCE.createASelect()));

        newChildDescriptors.add
            (createChildParameter
                (AParPackage.Literals.PARAMETER__VALUE,
                 MetaABMActFactory.eINSTANCE.createAGroup()));

        newChildDescriptors.add
            (createChildParameter
                (AParPackage.Literals.PARAMETER__VALUE,
                 MetaABMActFactory.eINSTANCE.createASchedule()));

        newChildDescriptors.add
            (createChildParameter
                (AParPackage.Literals.PARAMETER__VALUE,
                 MetaABMActFactory.eINSTANCE.createARule()));

        newChildDescriptors.add
            (createChildParameter
                (AParPackage.Literals.PARAMETER__VALUE,
                 MetaABMActFactory.eINSTANCE.createABuild()));

        newChildDescriptors.add
            (createChildParameter
                (AParPackage.Literals.PARAMETER__VALUE,
                 MetaABMActFactory.eINSTANCE.createAInitialize()));

        newChildDescriptors.add
            (createChildParameter
                (AParPackage.Literals.PARAMETER__VALUE,
                 MetaABMActFactory.eINSTANCE.createAMethod()));

        newChildDescriptors.add
            (createChildParameter
                (AParPackage.Literals.PARAMETER__VALUE,
                 MetaABMActFactory.eINSTANCE.createAAny()));

        newChildDescriptors.add
            (createChildParameter
                (AParPackage.Literals.PARAMETER__VALUE,
                 MetaABMActFactory.eINSTANCE.createAAll()));

        newChildDescriptors.add
            (createChildParameter
                (AParPackage.Literals.PARAMETER__VALUE,
                 MetaABMActFactory.eINSTANCE.createANone()));

        newChildDescriptors.add
            (createChildParameter
                (AParPackage.Literals.PARAMETER__VALUE,
                 MetaABMActFactory.eINSTANCE.createAQuery()));

        newChildDescriptors.add
            (createChildParameter
                (AParPackage.Literals.PARAMETER__VALUE,
                 MetaABMActFactory.eINSTANCE.createAEvaluate()));

        newChildDescriptors.add
            (createChildParameter
                (AParPackage.Literals.PARAMETER__VALUE,
                 MetaABMActFactory.eINSTANCE.createAWatch()));

        newChildDescriptors.add
            (createChildParameter
                (AParPackage.Literals.PARAMETER__VALUE,
                 MetaABMActFactory.eINSTANCE.createASet()));

        newChildDescriptors.add
            (createChildParameter
                (AParPackage.Literals.PARAMETER__VALUE,
                 MetaABMActFactory.eINSTANCE.createACreateAgents()));

        newChildDescriptors.add
            (createChildParameter
                (AParPackage.Literals.PARAMETER__VALUE,
                 MetaABMActFactory.eINSTANCE.createACreateShapedAgents()));

        newChildDescriptors.add
            (createChildParameter
                (AParPackage.Literals.PARAMETER__VALUE,
                 MetaABMActFactory.eINSTANCE.createALoadAgents()));

        newChildDescriptors.add
            (createChildParameter
                (AParPackage.Literals.PARAMETER__VALUE,
                 MetaABMActFactory.eINSTANCE.createALoadShapedAgents()));

        newChildDescriptors.add
            (createChildParameter
                (AParPackage.Literals.PARAMETER__VALUE,
                 MetaABMActFactory.eINSTANCE.createABuildNetwork()));

        newChildDescriptors.add
            (createChildParameter
                (AParPackage.Literals.PARAMETER__VALUE,
                 MetaABMActFactory.eINSTANCE.createABuildSpace()));

        newChildDescriptors.add
            (createChildParameter
                (AParPackage.Literals.PARAMETER__VALUE,
                 MetaABMActFactory.eINSTANCE.createABuildGeography()));

        newChildDescriptors.add
            (createChildParameter
                (AParPackage.Literals.PARAMETER__VALUE,
                 MetaABMActFactory.eINSTANCE.createABuildGrid()));

        newChildDescriptors.add
            (createChildParameter
                (AParPackage.Literals.PARAMETER__VALUE,
                 MetaABMActFactory.eINSTANCE.createAMove()));

        newChildDescriptors.add
            (createChildParameter
                (AParPackage.Literals.PARAMETER__VALUE,
                 MetaABMActFactory.eINSTANCE.createALeave()));

        newChildDescriptors.add
            (createChildParameter
                (AParPackage.Literals.PARAMETER__VALUE,
                 MetaABMActFactory.eINSTANCE.createADie()));

        newChildDescriptors.add
            (createChildParameter
                (AParPackage.Literals.PARAMETER__VALUE,
                 MetaABMActFactory.eINSTANCE.createAConnect()));

        newChildDescriptors.add
            (createChildParameter
                (AParPackage.Literals.PARAMETER__VALUE,
                 MetaABMActFactory.eINSTANCE.createADisconnect()));

        newChildDescriptors.add
            (createChildParameter
                (AParPackage.Literals.PARAMETER__VALUE,
                 MetaABMActFactory.eINSTANCE.createAReplace()));
    }

    /**
     * Return the resource locator for this item provider's resources.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        return AParEditPlugin.INSTANCE;
    }

}
