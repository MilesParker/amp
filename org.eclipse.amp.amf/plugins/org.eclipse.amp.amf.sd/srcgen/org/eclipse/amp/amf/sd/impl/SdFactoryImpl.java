/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.amp.amf.sd.impl;

import org.eclipse.amp.amf.sd.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SdFactoryImpl extends EFactoryImpl implements SdFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SdFactory init() {
		try {
			SdFactory theSdFactory = (SdFactory)EPackage.Registry.INSTANCE.getEFactory("sd"); 
			if (theSdFactory != null) {
				return theSdFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SdFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SdFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SdPackage.SD_NAMED_ELEMENT: return createSdNamedElement();
			case SdPackage.SD_MODEL: return createSdModel();
			case SdPackage.SD_AUX_VARIABLE: return createSdAuxVariable();
			case SdPackage.SD_STOCK_VARIABLE: return createSdStockVariable();
			case SdPackage.SD_FLOW_VARIABLE: return createSdFlowVariable();
			case SdPackage.SD_CONNECTOR: return createSdConnector();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SdNamedElement createSdNamedElement() {
		SdNamedElementImpl sdNamedElement = new SdNamedElementImpl();
		return sdNamedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SdModel createSdModel() {
		SdModelImpl sdModel = new SdModelImpl();
		return sdModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SdAuxVariable createSdAuxVariable() {
		SdAuxVariableImpl sdAuxVariable = new SdAuxVariableImpl();
		return sdAuxVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SdStockVariable createSdStockVariable() {
		SdStockVariableImpl sdStockVariable = new SdStockVariableImpl();
		return sdStockVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SdFlowVariable createSdFlowVariable() {
		SdFlowVariableImpl sdFlowVariable = new SdFlowVariableImpl();
		return sdFlowVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SdConnector createSdConnector() {
		SdConnectorImpl sdConnector = new SdConnectorImpl();
		return sdConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SdPackage getSdPackage() {
		return (SdPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SdPackage getPackage() {
		return SdPackage.eINSTANCE;
	}

} //SdFactoryImpl
