/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.amp.amf.sd.util;

import org.eclipse.amp.amf.sd.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.metaabm.IAgentChild;
import org.metaabm.IModelExtension;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.amp.amf.sd.SdPackage
 * @generated
 */
public class SdAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SdPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SdAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SdPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SdSwitch<Adapter> modelSwitch =
		new SdSwitch<Adapter>() {
			@Override
			public Adapter caseSdNamedElement(SdNamedElement object) {
				return createSdNamedElementAdapter();
			}
			@Override
			public Adapter caseSdAbstractVariable(SdAbstractVariable object) {
				return createSdAbstractVariableAdapter();
			}
			@Override
			public Adapter caseSdEquationVariable(SdEquationVariable object) {
				return createSdEquationVariableAdapter();
			}
			@Override
			public Adapter caseSdModel(SdModel object) {
				return createSdModelAdapter();
			}
			@Override
			public Adapter caseSdAuxVariable(SdAuxVariable object) {
				return createSdAuxVariableAdapter();
			}
			@Override
			public Adapter caseSdStockVariable(SdStockVariable object) {
				return createSdStockVariableAdapter();
			}
			@Override
			public Adapter caseSdFlowVariable(SdFlowVariable object) {
				return createSdFlowVariableAdapter();
			}
			@Override
			public Adapter caseSdConnector(SdConnector object) {
				return createSdConnectorAdapter();
			}
			@Override
			public Adapter caseSdGeneratable(SdGeneratable object) {
				return createSdGeneratableAdapter();
			}
			@Override
			public Adapter caseIModelExtension(IModelExtension object) {
				return createIModelExtensionAdapter();
			}
			@Override
			public Adapter caseIAgentChild(IAgentChild object) {
				return createIAgentChildAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amp.amf.sd.SdNamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amp.amf.sd.SdNamedElement
	 * @generated
	 */
	public Adapter createSdNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amp.amf.sd.SdAbstractVariable <em>Abstract Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amp.amf.sd.SdAbstractVariable
	 * @generated
	 */
	public Adapter createSdAbstractVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amp.amf.sd.SdEquationVariable <em>Equation Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amp.amf.sd.SdEquationVariable
	 * @generated
	 */
	public Adapter createSdEquationVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amp.amf.sd.SdModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amp.amf.sd.SdModel
	 * @generated
	 */
	public Adapter createSdModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amp.amf.sd.SdAuxVariable <em>Aux Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amp.amf.sd.SdAuxVariable
	 * @generated
	 */
	public Adapter createSdAuxVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amp.amf.sd.SdStockVariable <em>Stock Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amp.amf.sd.SdStockVariable
	 * @generated
	 */
	public Adapter createSdStockVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amp.amf.sd.SdFlowVariable <em>Flow Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amp.amf.sd.SdFlowVariable
	 * @generated
	 */
	public Adapter createSdFlowVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amp.amf.sd.SdConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amp.amf.sd.SdConnector
	 * @generated
	 */
	public Adapter createSdConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.amp.amf.sd.SdGeneratable <em>Generatable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.amp.amf.sd.SdGeneratable
	 * @generated
	 */
	public Adapter createSdGeneratableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.metaabm.IModelExtension <em>IModel Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.metaabm.IModelExtension
	 * @generated
	 */
	public Adapter createIModelExtensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.metaabm.IAgentChild <em>IAgent Child</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.metaabm.IAgentChild
	 * @generated
	 */
	public Adapter createIAgentChildAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SdAdapterFactory
