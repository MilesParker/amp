/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.amp.amf.sd.util;

import java.util.List;

import org.eclipse.amp.amf.sd.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.metaabm.IAgentChild;
import org.metaabm.IModelExtension;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.amp.amf.sd.SdPackage
 * @generated
 */
public class SdSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SdPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SdSwitch() {
		if (modelPackage == null) {
			modelPackage = SdPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SdPackage.SD_NAMED_ELEMENT: {
				SdNamedElement sdNamedElement = (SdNamedElement)theEObject;
				T result = caseSdNamedElement(sdNamedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdPackage.SD_ABSTRACT_VARIABLE: {
				SdAbstractVariable sdAbstractVariable = (SdAbstractVariable)theEObject;
				T result = caseSdAbstractVariable(sdAbstractVariable);
				if (result == null) result = caseSdGeneratable(sdAbstractVariable);
				if (result == null) result = caseSdNamedElement(sdAbstractVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdPackage.SD_EQUATION_VARIABLE: {
				SdEquationVariable sdEquationVariable = (SdEquationVariable)theEObject;
				T result = caseSdEquationVariable(sdEquationVariable);
				if (result == null) result = caseSdAbstractVariable(sdEquationVariable);
				if (result == null) result = caseSdGeneratable(sdEquationVariable);
				if (result == null) result = caseSdNamedElement(sdEquationVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdPackage.SD_MODEL: {
				SdModel sdModel = (SdModel)theEObject;
				T result = caseSdModel(sdModel);
				if (result == null) result = caseSdGeneratable(sdModel);
				if (result == null) result = caseIAgentChild(sdModel);
				if (result == null) result = caseSdNamedElement(sdModel);
				if (result == null) result = caseIModelExtension(sdModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdPackage.SD_AUX_VARIABLE: {
				SdAuxVariable sdAuxVariable = (SdAuxVariable)theEObject;
				T result = caseSdAuxVariable(sdAuxVariable);
				if (result == null) result = caseSdEquationVariable(sdAuxVariable);
				if (result == null) result = caseSdAbstractVariable(sdAuxVariable);
				if (result == null) result = caseSdGeneratable(sdAuxVariable);
				if (result == null) result = caseSdNamedElement(sdAuxVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdPackage.SD_STOCK_VARIABLE: {
				SdStockVariable sdStockVariable = (SdStockVariable)theEObject;
				T result = caseSdStockVariable(sdStockVariable);
				if (result == null) result = caseSdAbstractVariable(sdStockVariable);
				if (result == null) result = caseSdGeneratable(sdStockVariable);
				if (result == null) result = caseSdNamedElement(sdStockVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdPackage.SD_FLOW_VARIABLE: {
				SdFlowVariable sdFlowVariable = (SdFlowVariable)theEObject;
				T result = caseSdFlowVariable(sdFlowVariable);
				if (result == null) result = caseSdEquationVariable(sdFlowVariable);
				if (result == null) result = caseSdAbstractVariable(sdFlowVariable);
				if (result == null) result = caseSdGeneratable(sdFlowVariable);
				if (result == null) result = caseSdNamedElement(sdFlowVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdPackage.SD_CONNECTOR: {
				SdConnector sdConnector = (SdConnector)theEObject;
				T result = caseSdConnector(sdConnector);
				if (result == null) result = caseSdGeneratable(sdConnector);
				if (result == null) result = caseSdNamedElement(sdConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SdPackage.SD_GENERATABLE: {
				SdGeneratable sdGeneratable = (SdGeneratable)theEObject;
				T result = caseSdGeneratable(sdGeneratable);
				if (result == null) result = caseSdNamedElement(sdGeneratable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSdNamedElement(SdNamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSdAbstractVariable(SdAbstractVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equation Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equation Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSdEquationVariable(SdEquationVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSdModel(SdModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aux Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aux Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSdAuxVariable(SdAuxVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stock Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stock Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSdStockVariable(SdStockVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSdFlowVariable(SdFlowVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSdConnector(SdConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generatable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generatable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSdGeneratable(SdGeneratable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IModel Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IModel Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIModelExtension(IModelExtension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IAgent Child</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IAgent Child</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIAgentChild(IAgentChild object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //SdSwitch
