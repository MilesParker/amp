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
package org.metaabm.function.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.metaabm.IArtifact;
import org.metaabm.IID;
import org.metaabm.ITyped;
import org.metaabm.ITypedArray;
import org.metaabm.SImplemented;
import org.metaabm.SNamed;
import org.metaabm.function.*;
import org.metaabm.function.FArgumentArrayPrototype;
import org.metaabm.function.FArgumentPrototype;
import org.metaabm.function.FFunction;
import org.metaabm.function.FGeneric;
import org.metaabm.function.FGenericFunction;
import org.metaabm.function.FGenericLogical;
import org.metaabm.function.FImplementedLibrary;
import org.metaabm.function.FLibrary;
import org.metaabm.function.FLogical;
import org.metaabm.function.FLogicalOperator;
import org.metaabm.function.FMultiArgumentPrototype;
import org.metaabm.function.FOperator;
import org.metaabm.function.MetaABMFunctionPackage;

/*
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance
 * hierarchy. It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the
 * result of the switch. <!-- end-user-doc -->
 * @see org.metaabm.function.MetaABMFunctionPackage
 * @generated
 */
public class MetaABMFunctionSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static MetaABMFunctionPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public MetaABMFunctionSwitch() {
		if (modelPackage == null) {
			modelPackage = MetaABMFunctionPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		} else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return eSuperTypes.isEmpty() ? defaultCase(theEObject) : doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MetaABMFunctionPackage.FARGUMENT_PROTOTYPE: {
				FArgumentPrototype fArgumentPrototype = (FArgumentPrototype) theEObject;
				T result = caseFArgumentPrototype(fArgumentPrototype);
				if (result == null)
					result = caseITyped(fArgumentPrototype);
				if (result == null)
					result = caseSNamed(fArgumentPrototype);
				if (result == null)
					result = caseIID(fArgumentPrototype);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMFunctionPackage.FARGUMENT_ARRAY_PROTOTYPE: {
				FArgumentArrayPrototype fArgumentArrayPrototype = (FArgumentArrayPrototype) theEObject;
				T result = caseFArgumentArrayPrototype(fArgumentArrayPrototype);
				if (result == null)
					result = caseFArgumentPrototype(fArgumentArrayPrototype);
				if (result == null)
					result = caseITypedArray(fArgumentArrayPrototype);
				if (result == null)
					result = caseITyped(fArgumentArrayPrototype);
				if (result == null)
					result = caseSNamed(fArgumentArrayPrototype);
				if (result == null)
					result = caseIID(fArgumentArrayPrototype);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMFunctionPackage.FFUNCTION: {
				FFunction fFunction = (FFunction) theEObject;
				T result = caseFFunction(fFunction);
				if (result == null)
					result = caseIID(fFunction);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMFunctionPackage.FLOGICAL: {
				FLogical fLogical = (FLogical) theEObject;
				T result = caseFLogical(fLogical);
				if (result == null)
					result = caseFFunction(fLogical);
				if (result == null)
					result = caseIID(fLogical);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMFunctionPackage.FOPERATOR: {
				FOperator fOperator = (FOperator) theEObject;
				T result = caseFOperator(fOperator);
				if (result == null)
					result = caseFFunction(fOperator);
				if (result == null)
					result = caseSNamed(fOperator);
				if (result == null)
					result = caseIID(fOperator);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMFunctionPackage.FLOGICAL_OPERATOR: {
				FLogicalOperator fLogicalOperator = (FLogicalOperator) theEObject;
				T result = caseFLogicalOperator(fLogicalOperator);
				if (result == null)
					result = caseFOperator(fLogicalOperator);
				if (result == null)
					result = caseFLogical(fLogicalOperator);
				if (result == null)
					result = caseFFunction(fLogicalOperator);
				if (result == null)
					result = caseSNamed(fLogicalOperator);
				if (result == null)
					result = caseIID(fLogicalOperator);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMFunctionPackage.FGENERIC: {
				FGeneric fGeneric = (FGeneric) theEObject;
				T result = caseFGeneric(fGeneric);
				if (result == null)
					result = caseFFunction(fGeneric);
				if (result == null)
					result = caseSNamed(fGeneric);
				if (result == null)
					result = caseIID(fGeneric);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMFunctionPackage.FGENERIC_FUNCTION: {
				FGenericFunction fGenericFunction = (FGenericFunction) theEObject;
				T result = caseFGenericFunction(fGenericFunction);
				if (result == null)
					result = caseFGeneric(fGenericFunction);
				if (result == null)
					result = caseFFunction(fGenericFunction);
				if (result == null)
					result = caseSNamed(fGenericFunction);
				if (result == null)
					result = caseIID(fGenericFunction);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMFunctionPackage.FGENERIC_LOGICAL: {
				FGenericLogical fGenericLogical = (FGenericLogical) theEObject;
				T result = caseFGenericLogical(fGenericLogical);
				if (result == null)
					result = caseFGeneric(fGenericLogical);
				if (result == null)
					result = caseFLogical(fGenericLogical);
				if (result == null)
					result = caseFFunction(fGenericLogical);
				if (result == null)
					result = caseSNamed(fGenericLogical);
				if (result == null)
					result = caseIID(fGenericLogical);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMFunctionPackage.FLIBRARY: {
				FLibrary fLibrary = (FLibrary) theEObject;
				T result = caseFLibrary(fLibrary);
				if (result == null)
					result = caseSNamed(fLibrary);
				if (result == null)
					result = caseIArtifact(fLibrary);
				if (result == null)
					result = caseIID(fLibrary);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMFunctionPackage.FIMPLEMENTED_LIBRARY: {
				FImplementedLibrary fImplementedLibrary = (FImplementedLibrary) theEObject;
				T result = caseFImplementedLibrary(fImplementedLibrary);
				if (result == null)
					result = caseSImplemented(fImplementedLibrary);
				if (result == null)
					result = caseFLibrary(fImplementedLibrary);
				if (result == null)
					result = caseSNamed(fImplementedLibrary);
				if (result == null)
					result = caseIArtifact(fImplementedLibrary);
				if (result == null)
					result = caseIID(fImplementedLibrary);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMFunctionPackage.FMULTI_ARGUMENT_PROTOTYPE: {
				FMultiArgumentPrototype fMultiArgumentPrototype = (FMultiArgumentPrototype) theEObject;
				T result = caseFMultiArgumentPrototype(fMultiArgumentPrototype);
				if (result == null)
					result = caseFArgumentPrototype(fMultiArgumentPrototype);
				if (result == null)
					result = caseITyped(fMultiArgumentPrototype);
				if (result == null)
					result = caseSNamed(fMultiArgumentPrototype);
				if (result == null)
					result = caseIID(fMultiArgumentPrototype);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			default:
				return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FArgument Prototype</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FArgument Prototype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFArgumentPrototype(FArgumentPrototype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FArgument Array Prototype</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FArgument Array Prototype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFArgumentArrayPrototype(FArgumentArrayPrototype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FFunction</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FFunction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFFunction(FFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FLogical</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FLogical</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFLogical(FLogical object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FOperator</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FOperator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFOperator(FOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FLogical Operator</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FLogical Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFLogicalOperator(FLogicalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FGeneric</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FGeneric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFGeneric(FGeneric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FGeneric Function</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FGeneric Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFGenericFunction(FGenericFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FGeneric Logical</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FGeneric Logical</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFGenericLogical(FGenericLogical object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FLibrary</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FLibrary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFLibrary(FLibrary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FImplemented Library</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FImplemented Library</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFImplementedLibrary(FImplementedLibrary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FMulti Argument Prototype</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FMulti Argument Prototype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFMultiArgumentPrototype(FMultiArgumentPrototype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>IID</em>'. <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>IID</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIID(IID object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ITyped</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ITyped</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseITyped(ITyped object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SNamed</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SNamed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSNamed(SNamed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ITyped Array</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ITyped Array</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseITypedArray(ITypedArray object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IArtifact</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IArtifact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIArtifact(IArtifact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SImplemented</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SImplemented</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSImplemented(SImplemented object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch, but this is
	 * the last case anyway. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} // MetaABMFunctionSwitch
