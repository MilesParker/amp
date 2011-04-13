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
package org.metaabm.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.metaabm.*;
import org.metaabm.IAct;
import org.metaabm.IArtifact;
import org.metaabm.IID;
import org.metaabm.ITyped;
import org.metaabm.ITypedArray;
import org.metaabm.IValue;
import org.metaabm.MetaABMPackage;
import org.metaabm.SActable;
import org.metaabm.SAgent;
import org.metaabm.SAttribute;
import org.metaabm.SAttributeArray;
import org.metaabm.SAttributed;
import org.metaabm.SContext;
import org.metaabm.SContinuousSpace;
import org.metaabm.SGeography;
import org.metaabm.SGrid;
import org.metaabm.SImplementation;
import org.metaabm.SImplemented;
import org.metaabm.SNDimensional;
import org.metaabm.SNamed;
import org.metaabm.SNetwork;
import org.metaabm.SProjection;
import org.metaabm.SState;
import org.metaabm.SStateValue;
import org.metaabm.SStyle;
import org.metaabm.SStyle2D;
import org.metaabm.SStyle3D;
import org.metaabm.SStyleShape;
import org.metaabm.SValueLayer;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the call
 * {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the inheritance hierarchy until a non-null result is
 * returned, which is the result of the switch. <!-- end-user-doc -->
 * @see org.metaabm.MetaABMPackage
 * @generated
 */
public class MetaABMSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static MetaABMPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MetaABMSwitch() {
		if (modelPackage == null) {
			modelPackage = MetaABMPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MetaABMPackage.IID: {
				IID iid = (IID) theEObject;
				T result = caseIID(iid);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMPackage.ITYPED: {
				ITyped iTyped = (ITyped) theEObject;
				T result = caseITyped(iTyped);
				if (result == null)
					result = caseIID(iTyped);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMPackage.ITYPED_ARRAY: {
				ITypedArray iTypedArray = (ITypedArray) theEObject;
				T result = caseITypedArray(iTypedArray);
				if (result == null)
					result = caseITyped(iTypedArray);
				if (result == null)
					result = caseIID(iTypedArray);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMPackage.IVALUE: {
				IValue iValue = (IValue) theEObject;
				T result = caseIValue(iValue);
				if (result == null)
					result = caseIID(iValue);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMPackage.IARTIFACT: {
				IArtifact iArtifact = (IArtifact) theEObject;
				T result = caseIArtifact(iArtifact);
				if (result == null)
					result = caseIID(iArtifact);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMPackage.IACT: {
				IAct iAct = (IAct) theEObject;
				T result = caseIAct(iAct);
				if (result == null)
					result = caseIID(iAct);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMPackage.SNAMED: {
				SNamed sNamed = (SNamed) theEObject;
				T result = caseSNamed(sNamed);
				if (result == null)
					result = caseIID(sNamed);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMPackage.SATTRIBUTED: {
				SAttributed sAttributed = (SAttributed) theEObject;
				T result = caseSAttributed(sAttributed);
				if (result == null)
					result = caseSNamed(sAttributed);
				if (result == null)
					result = caseIID(sAttributed);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMPackage.SACTABLE: {
				SActable sActable = (SActable) theEObject;
				T result = caseSActable(sActable);
				if (result == null)
					result = caseSAttributed(sActable);
				if (result == null)
					result = caseSNamed(sActable);
				if (result == null)
					result = caseIID(sActable);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMPackage.SATTRIBUTE: {
				SAttribute sAttribute = (SAttribute) theEObject;
				T result = caseSAttribute(sAttribute);
				if (result == null)
					result = caseSNamed(sAttribute);
				if (result == null)
					result = caseIValue(sAttribute);
				if (result == null)
					result = caseITyped(sAttribute);
				if (result == null)
					result = caseIID(sAttribute);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMPackage.SATTRIBUTE_ARRAY: {
				SAttributeArray sAttributeArray = (SAttributeArray) theEObject;
				T result = caseSAttributeArray(sAttributeArray);
				if (result == null)
					result = caseSAttribute(sAttributeArray);
				if (result == null)
					result = caseITypedArray(sAttributeArray);
				if (result == null)
					result = caseSNamed(sAttributeArray);
				if (result == null)
					result = caseIValue(sAttributeArray);
				if (result == null)
					result = caseITyped(sAttributeArray);
				if (result == null)
					result = caseIID(sAttributeArray);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMPackage.SSTATE: {
				SState sState = (SState) theEObject;
				T result = caseSState(sState);
				if (result == null)
					result = caseSAttribute(sState);
				if (result == null)
					result = caseSNamed(sState);
				if (result == null)
					result = caseIValue(sState);
				if (result == null)
					result = caseITyped(sState);
				if (result == null)
					result = caseIID(sState);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMPackage.SSTATE_VALUE: {
				SStateValue sStateValue = (SStateValue) theEObject;
				T result = caseSStateValue(sStateValue);
				if (result == null)
					result = caseSNamed(sStateValue);
				if (result == null)
					result = caseIValue(sStateValue);
				if (result == null)
					result = caseIID(sStateValue);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMPackage.SAGENT: {
				SAgent sAgent = (SAgent) theEObject;
				T result = caseSAgent(sAgent);
				if (result == null)
					result = caseSActable(sAgent);
				if (result == null)
					result = caseSImplemented(sAgent);
				if (result == null)
					result = caseSAttributed(sAgent);
				if (result == null)
					result = caseSNamed(sAgent);
				if (result == null)
					result = caseIID(sAgent);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMPackage.SCONTEXT: {
				SContext sContext = (SContext) theEObject;
				T result = caseSContext(sContext);
				if (result == null)
					result = caseSAgent(sContext);
				if (result == null)
					result = caseSActable(sContext);
				if (result == null)
					result = caseSImplemented(sContext);
				if (result == null)
					result = caseSAttributed(sContext);
				if (result == null)
					result = caseSNamed(sContext);
				if (result == null)
					result = caseIID(sContext);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMPackage.SPROJECTION: {
				SProjection sProjection = (SProjection) theEObject;
				T result = caseSProjection(sProjection);
				if (result == null)
					result = caseSAttributed(sProjection);
				if (result == null)
					result = caseSNamed(sProjection);
				if (result == null)
					result = caseIID(sProjection);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMPackage.SN_DIMENSIONAL: {
				SNDimensional snDimensional = (SNDimensional) theEObject;
				T result = caseSNDimensional(snDimensional);
				if (result == null)
					result = caseSProjection(snDimensional);
				if (result == null)
					result = caseSAttributed(snDimensional);
				if (result == null)
					result = caseSNamed(snDimensional);
				if (result == null)
					result = caseIID(snDimensional);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMPackage.SCONTINUOUS_SPACE: {
				SContinuousSpace sContinuousSpace = (SContinuousSpace) theEObject;
				T result = caseSContinuousSpace(sContinuousSpace);
				if (result == null)
					result = caseSNDimensional(sContinuousSpace);
				if (result == null)
					result = caseSProjection(sContinuousSpace);
				if (result == null)
					result = caseSAttributed(sContinuousSpace);
				if (result == null)
					result = caseSNamed(sContinuousSpace);
				if (result == null)
					result = caseIID(sContinuousSpace);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMPackage.SGRID: {
				SGrid sGrid = (SGrid) theEObject;
				T result = caseSGrid(sGrid);
				if (result == null)
					result = caseSNDimensional(sGrid);
				if (result == null)
					result = caseSProjection(sGrid);
				if (result == null)
					result = caseSAttributed(sGrid);
				if (result == null)
					result = caseSNamed(sGrid);
				if (result == null)
					result = caseIID(sGrid);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMPackage.SNETWORK: {
				SNetwork sNetwork = (SNetwork) theEObject;
				T result = caseSNetwork(sNetwork);
				if (result == null)
					result = caseSProjection(sNetwork);
				if (result == null)
					result = caseSAttributed(sNetwork);
				if (result == null)
					result = caseSNamed(sNetwork);
				if (result == null)
					result = caseIID(sNetwork);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMPackage.SGEOGRAPHY: {
				SGeography sGeography = (SGeography) theEObject;
				T result = caseSGeography(sGeography);
				if (result == null)
					result = caseSProjection(sGeography);
				if (result == null)
					result = caseSAttributed(sGeography);
				if (result == null)
					result = caseSNamed(sGeography);
				if (result == null)
					result = caseIID(sGeography);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMPackage.SVALUE_LAYER: {
				SValueLayer sValueLayer = (SValueLayer) theEObject;
				T result = caseSValueLayer(sValueLayer);
				if (result == null)
					result = caseSNamed(sValueLayer);
				if (result == null)
					result = caseIID(sValueLayer);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMPackage.SSTYLE: {
				SStyle sStyle = (SStyle) theEObject;
				T result = caseSStyle(sStyle);
				if (result == null)
					result = caseSActable(sStyle);
				if (result == null)
					result = caseSImplemented(sStyle);
				if (result == null)
					result = caseSAttributed(sStyle);
				if (result == null)
					result = caseSNamed(sStyle);
				if (result == null)
					result = caseIID(sStyle);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMPackage.SSTYLE2_D: {
				SStyle2D sStyle2D = (SStyle2D) theEObject;
				T result = caseSStyle2D(sStyle2D);
				if (result == null)
					result = caseSStyle(sStyle2D);
				if (result == null)
					result = caseSActable(sStyle2D);
				if (result == null)
					result = caseSImplemented(sStyle2D);
				if (result == null)
					result = caseSAttributed(sStyle2D);
				if (result == null)
					result = caseSNamed(sStyle2D);
				if (result == null)
					result = caseIID(sStyle2D);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMPackage.SSTYLE_SHAPE: {
				SStyleShape sStyleShape = (SStyleShape) theEObject;
				T result = caseSStyleShape(sStyleShape);
				if (result == null)
					result = caseSStyle2D(sStyleShape);
				if (result == null)
					result = caseSStyle(sStyleShape);
				if (result == null)
					result = caseSActable(sStyleShape);
				if (result == null)
					result = caseSImplemented(sStyleShape);
				if (result == null)
					result = caseSAttributed(sStyleShape);
				if (result == null)
					result = caseSNamed(sStyleShape);
				if (result == null)
					result = caseIID(sStyleShape);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMPackage.SSTYLE3_D: {
				SStyle3D sStyle3D = (SStyle3D) theEObject;
				T result = caseSStyle3D(sStyle3D);
				if (result == null)
					result = caseSStyle(sStyle3D);
				if (result == null)
					result = caseSActable(sStyle3D);
				if (result == null)
					result = caseSImplemented(sStyle3D);
				if (result == null)
					result = caseSAttributed(sStyle3D);
				if (result == null)
					result = caseSNamed(sStyle3D);
				if (result == null)
					result = caseIID(sStyle3D);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMPackage.SIMPLEMENTED: {
				SImplemented sImplemented = (SImplemented) theEObject;
				T result = caseSImplemented(sImplemented);
				if (result == null)
					result = caseIID(sImplemented);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMPackage.SIMPLEMENTATION: {
				SImplementation sImplementation = (SImplementation) theEObject;
				T result = caseSImplementation(sImplementation);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMPackage.IAGENT_CHILD: {
				IAgentChild iAgentChild = (IAgentChild) theEObject;
				T result = caseIAgentChild(iAgentChild);
				if (result == null)
					result = caseIModelExtension(iAgentChild);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMPackage.IATTRIBUTE_CHILD: {
				IAttributeChild iAttributeChild = (IAttributeChild) theEObject;
				T result = caseIAttributeChild(iAttributeChild);
				if (result == null)
					result = caseIModelExtension(iAttributeChild);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMPackage.IMODEL_EXTENSION: {
				IModelExtension iModelExtension = (IModelExtension) theEObject;
				T result = caseIModelExtension(iModelExtension);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			default:
				return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IID</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IID</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIID(IID object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ITyped</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ITyped</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseITyped(ITyped object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ITyped Array</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ITyped Array</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseITypedArray(ITypedArray object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IValue</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IValue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIValue(IValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IArtifact</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IArtifact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIArtifact(IArtifact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IAct</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IAct</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIAct(IAct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SNamed</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SNamed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSNamed(SNamed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SAttributed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SAttributed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSAttributed(SAttributed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SAttribute</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SAttribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSAttribute(SAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SAttribute Array</em>'.
	 * <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SAttribute Array</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSAttributeArray(SAttributeArray object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SAgent</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SAgent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSAgent(SAgent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SContext</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SContext</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSContext(SContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SProjection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SProjection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSProjection(SProjection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SN Dimensional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SN Dimensional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSNDimensional(SNDimensional object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SContinuous Space</em>'.
	 * <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SContinuous Space</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSContinuousSpace(SContinuousSpace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGrid</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGrid</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrid(SGrid object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SNetwork</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SNetwork</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSNetwork(SNetwork object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGeography</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGeography</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGeography(SGeography object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SValue Layer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SValue Layer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSValueLayer(SValueLayer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SStyle</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SStyle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSStyle(SStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SStyle3 D</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SStyle3 D</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSStyle3D(SStyle3D object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SStyle2 D</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SStyle2 D</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSStyle2D(SStyle2D object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SStyle Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SStyle Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSStyleShape(SStyleShape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SImplemented</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SImplemented</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSImplemented(SImplemented object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SImplementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SImplementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSImplementation(SImplementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IAgent Child</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IAgent Child</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIAgentChild(IAgentChild object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IAttribute Child</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IAttribute Child</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIAttributeChild(IAttributeChild object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>SState</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SState</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSState(SState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SState Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SState Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSStateValue(SStateValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SActable</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SActable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSActable(SActable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch, but this is the last case
	 * anyway. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} // MetaABMSwitch
