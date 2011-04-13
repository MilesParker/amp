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
package org.metaabm.act.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.metaabm.IAct;
import org.metaabm.IID;
import org.metaabm.IValue;
import org.metaabm.SNamed;
import org.metaabm.act.*;
import org.metaabm.act.AAccessor;
import org.metaabm.act.AAct;
import org.metaabm.act.AAll;
import org.metaabm.act.AAny;
import org.metaabm.act.ABuild;
import org.metaabm.act.ABuildGeography;
import org.metaabm.act.ABuildGrid;
import org.metaabm.act.ABuildNetwork;
import org.metaabm.act.ABuildProjection;
import org.metaabm.act.ABuildSpace;
import org.metaabm.act.ACommand;
import org.metaabm.act.AConnect;
import org.metaabm.act.AControl;
import org.metaabm.act.ACreateAgents;
import org.metaabm.act.ACreateShapedAgents;
import org.metaabm.act.ADie;
import org.metaabm.act.ADisconnect;
import org.metaabm.act.AEvaluate;
import org.metaabm.act.AGroup;
import org.metaabm.act.AInitialize;
import org.metaabm.act.AInput;
import org.metaabm.act.ALeave;
import org.metaabm.act.ALiteral;
import org.metaabm.act.ALoadAgents;
import org.metaabm.act.ALoadShapedAgents;
import org.metaabm.act.ALogic;
import org.metaabm.act.AMethod;
import org.metaabm.act.AMove;
import org.metaabm.act.AMultiValue;
import org.metaabm.act.ANetwork;
import org.metaabm.act.ANone;
import org.metaabm.act.AQuery;
import org.metaabm.act.AReplace;
import org.metaabm.act.ARoot;
import org.metaabm.act.ARule;
import org.metaabm.act.ASchedule;
import org.metaabm.act.ASelect;
import org.metaabm.act.ASet;
import org.metaabm.act.AShaped;
import org.metaabm.act.ASink;
import org.metaabm.act.ATransform;
import org.metaabm.act.AWatch;
import org.metaabm.act.MetaABMActPackage;

/*
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance
 * hierarchy. It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the
 * result of the switch. <!-- end-user-doc -->
 * @see org.metaabm.act.MetaABMActPackage
 * @generated
 */
public class MetaABMActSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static MetaABMActPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public MetaABMActSwitch() {
		if (modelPackage == null) {
			modelPackage = MetaABMActPackage.eINSTANCE;
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
			case MetaABMActPackage.AINPUT: {
				AInput aInput = (AInput) theEObject;
				T result = caseAInput(aInput);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMActPackage.ALITERAL: {
				ALiteral aLiteral = (ALiteral) theEObject;
				T result = caseALiteral(aLiteral);
				if (result == null)
					result = caseIValue(aLiteral);
				if (result == null)
					result = caseIID(aLiteral);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMActPackage.AMULTI_VALUE: {
				AMultiValue aMultiValue = (AMultiValue) theEObject;
				T result = caseAMultiValue(aMultiValue);
				if (result == null)
					result = caseALiteral(aMultiValue);
				if (result == null)
					result = caseIValue(aMultiValue);
				if (result == null)
					result = caseIID(aMultiValue);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMActPackage.ASHAPED: {
				AShaped aShaped = (AShaped) theEObject;
				T result = caseAShaped(aShaped);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMActPackage.AACT: {
				AAct aAct = (AAct) theEObject;
				T result = caseAAct(aAct);
				if (result == null)
					result = caseIAct(aAct);
				if (result == null)
					result = caseIID(aAct);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMActPackage.ACONTROL: {
				AControl aControl = (AControl) theEObject;
				T result = caseAControl(aControl);
				if (result == null)
					result = caseAAct(aControl);
				if (result == null)
					result = caseIAct(aControl);
				if (result == null)
					result = caseIID(aControl);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMActPackage.AROOT: {
				ARoot aRoot = (ARoot) theEObject;
				T result = caseARoot(aRoot);
				if (result == null)
					result = caseASelect(aRoot);
				if (result == null)
					result = caseAAct(aRoot);
				if (result == null)
					result = caseIAct(aRoot);
				if (result == null)
					result = caseIID(aRoot);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMActPackage.AGROUP: {
				AGroup aGroup = (AGroup) theEObject;
				T result = caseAGroup(aGroup);
				if (result == null)
					result = caseAAct(aGroup);
				if (result == null)
					result = caseSNamed(aGroup);
				if (result == null)
					result = caseIAct(aGroup);
				if (result == null)
					result = caseIID(aGroup);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMActPackage.ASCHEDULE: {
				ASchedule aSchedule = (ASchedule) theEObject;
				T result = caseASchedule(aSchedule);
				if (result == null)
					result = caseARoot(aSchedule);
				if (result == null)
					result = caseSNamed(aSchedule);
				if (result == null)
					result = caseASelect(aSchedule);
				if (result == null)
					result = caseAAct(aSchedule);
				if (result == null)
					result = caseIAct(aSchedule);
				if (result == null)
					result = caseIID(aSchedule);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMActPackage.ARULE: {
				ARule aRule = (ARule) theEObject;
				T result = caseARule(aRule);
				if (result == null)
					result = caseARoot(aRule);
				if (result == null)
					result = caseSNamed(aRule);
				if (result == null)
					result = caseASelect(aRule);
				if (result == null)
					result = caseAAct(aRule);
				if (result == null)
					result = caseIAct(aRule);
				if (result == null)
					result = caseIID(aRule);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMActPackage.ABUILD: {
				ABuild aBuild = (ABuild) theEObject;
				T result = caseABuild(aBuild);
				if (result == null)
					result = caseARoot(aBuild);
				if (result == null)
					result = caseSNamed(aBuild);
				if (result == null)
					result = caseASelect(aBuild);
				if (result == null)
					result = caseAAct(aBuild);
				if (result == null)
					result = caseIAct(aBuild);
				if (result == null)
					result = caseIID(aBuild);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMActPackage.AINITIALIZE: {
				AInitialize aInitialize = (AInitialize) theEObject;
				T result = caseAInitialize(aInitialize);
				if (result == null)
					result = caseARoot(aInitialize);
				if (result == null)
					result = caseSNamed(aInitialize);
				if (result == null)
					result = caseASelect(aInitialize);
				if (result == null)
					result = caseAAct(aInitialize);
				if (result == null)
					result = caseIAct(aInitialize);
				if (result == null)
					result = caseIID(aInitialize);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMActPackage.AMETHOD: {
				AMethod aMethod = (AMethod) theEObject;
				T result = caseAMethod(aMethod);
				if (result == null)
					result = caseAAct(aMethod);
				if (result == null)
					result = caseSNamed(aMethod);
				if (result == null)
					result = caseIAct(aMethod);
				if (result == null)
					result = caseIID(aMethod);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMActPackage.ASINK: {
				ASink aSink = (ASink) theEObject;
				T result = caseASink(aSink);
				if (result == null)
					result = caseAAct(aSink);
				if (result == null)
					result = caseIValue(aSink);
				if (result == null)
					result = caseIAct(aSink);
				if (result == null)
					result = caseIID(aSink);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMActPackage.ALOGIC: {
				ALogic aLogic = (ALogic) theEObject;
				T result = caseALogic(aLogic);
				if (result == null)
					result = caseAControl(aLogic);
				if (result == null)
					result = caseAAct(aLogic);
				if (result == null)
					result = caseIAct(aLogic);
				if (result == null)
					result = caseIID(aLogic);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMActPackage.AANY: {
				AAny aAny = (AAny) theEObject;
				T result = caseAAny(aAny);
				if (result == null)
					result = caseALogic(aAny);
				if (result == null)
					result = caseAControl(aAny);
				if (result == null)
					result = caseAAct(aAny);
				if (result == null)
					result = caseIAct(aAny);
				if (result == null)
					result = caseIID(aAny);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMActPackage.AALL: {
				AAll aAll = (AAll) theEObject;
				T result = caseAAll(aAll);
				if (result == null)
					result = caseALogic(aAll);
				if (result == null)
					result = caseAControl(aAll);
				if (result == null)
					result = caseAAct(aAll);
				if (result == null)
					result = caseIAct(aAll);
				if (result == null)
					result = caseIID(aAll);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMActPackage.ANONE: {
				ANone aNone = (ANone) theEObject;
				T result = caseANone(aNone);
				if (result == null)
					result = caseALogic(aNone);
				if (result == null)
					result = caseAControl(aNone);
				if (result == null)
					result = caseAAct(aNone);
				if (result == null)
					result = caseIAct(aNone);
				if (result == null)
					result = caseIID(aNone);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMActPackage.AQUERY: {
				AQuery aQuery = (AQuery) theEObject;
				T result = caseAQuery(aQuery);
				if (result == null)
					result = caseASink(aQuery);
				if (result == null)
					result = caseAControl(aQuery);
				if (result == null)
					result = caseAAct(aQuery);
				if (result == null)
					result = caseIValue(aQuery);
				if (result == null)
					result = caseIAct(aQuery);
				if (result == null)
					result = caseIID(aQuery);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMActPackage.AEVALUATE: {
				AEvaluate aEvaluate = (AEvaluate) theEObject;
				T result = caseAEvaluate(aEvaluate);
				if (result == null)
					result = caseASink(aEvaluate);
				if (result == null)
					result = caseAAct(aEvaluate);
				if (result == null)
					result = caseIValue(aEvaluate);
				if (result == null)
					result = caseIAct(aEvaluate);
				if (result == null)
					result = caseIID(aEvaluate);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMActPackage.AACCESSOR: {
				AAccessor aAccessor = (AAccessor) theEObject;
				T result = caseAAccessor(aAccessor);
				if (result == null)
					result = caseAAct(aAccessor);
				if (result == null)
					result = caseIAct(aAccessor);
				if (result == null)
					result = caseIID(aAccessor);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMActPackage.AWATCH: {
				AWatch aWatch = (AWatch) theEObject;
				T result = caseAWatch(aWatch);
				if (result == null)
					result = caseAAccessor(aWatch);
				if (result == null)
					result = caseARoot(aWatch);
				if (result == null)
					result = caseASelect(aWatch);
				if (result == null)
					result = caseAAct(aWatch);
				if (result == null)
					result = caseIAct(aWatch);
				if (result == null)
					result = caseIID(aWatch);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMActPackage.ASET: {
				ASet aSet = (ASet) theEObject;
				T result = caseASet(aSet);
				if (result == null)
					result = caseAAccessor(aSet);
				if (result == null)
					result = caseACommand(aSet);
				if (result == null)
					result = caseAAct(aSet);
				if (result == null)
					result = caseIAct(aSet);
				if (result == null)
					result = caseIID(aSet);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMActPackage.ACREATE_AGENTS: {
				ACreateAgents aCreateAgents = (ACreateAgents) theEObject;
				T result = caseACreateAgents(aCreateAgents);
				if (result == null)
					result = caseASelect(aCreateAgents);
				if (result == null)
					result = caseAAct(aCreateAgents);
				if (result == null)
					result = caseIAct(aCreateAgents);
				if (result == null)
					result = caseIID(aCreateAgents);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMActPackage.ACREATE_SHAPED_AGENTS: {
				ACreateShapedAgents aCreateShapedAgents = (ACreateShapedAgents) theEObject;
				T result = caseACreateShapedAgents(aCreateShapedAgents);
				if (result == null)
					result = caseACreateAgents(aCreateShapedAgents);
				if (result == null)
					result = caseAShaped(aCreateShapedAgents);
				if (result == null)
					result = caseASelect(aCreateShapedAgents);
				if (result == null)
					result = caseAAct(aCreateShapedAgents);
				if (result == null)
					result = caseIAct(aCreateShapedAgents);
				if (result == null)
					result = caseIID(aCreateShapedAgents);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMActPackage.ALOAD_AGENTS: {
				ALoadAgents aLoadAgents = (ALoadAgents) theEObject;
				T result = caseALoadAgents(aLoadAgents);
				if (result == null)
					result = caseACreateAgents(aLoadAgents);
				if (result == null)
					result = caseASelect(aLoadAgents);
				if (result == null)
					result = caseAAct(aLoadAgents);
				if (result == null)
					result = caseIAct(aLoadAgents);
				if (result == null)
					result = caseIID(aLoadAgents);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMActPackage.ALOAD_SHAPED_AGENTS: {
				ALoadShapedAgents aLoadShapedAgents = (ALoadShapedAgents) theEObject;
				T result = caseALoadShapedAgents(aLoadShapedAgents);
				if (result == null)
					result = caseALoadAgents(aLoadShapedAgents);
				if (result == null)
					result = caseAShaped(aLoadShapedAgents);
				if (result == null)
					result = caseACreateAgents(aLoadShapedAgents);
				if (result == null)
					result = caseASelect(aLoadShapedAgents);
				if (result == null)
					result = caseAAct(aLoadShapedAgents);
				if (result == null)
					result = caseIAct(aLoadShapedAgents);
				if (result == null)
					result = caseIID(aLoadShapedAgents);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMActPackage.ABUILD_PROJECTION: {
				ABuildProjection aBuildProjection = (ABuildProjection) theEObject;
				T result = caseABuildProjection(aBuildProjection);
				if (result == null)
					result = caseAAct(aBuildProjection);
				if (result == null)
					result = caseSNamed(aBuildProjection);
				if (result == null)
					result = caseIAct(aBuildProjection);
				if (result == null)
					result = caseIID(aBuildProjection);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMActPackage.ABUILD_NETWORK: {
				ABuildNetwork aBuildNetwork = (ABuildNetwork) theEObject;
				T result = caseABuildNetwork(aBuildNetwork);
				if (result == null)
					result = caseABuildProjection(aBuildNetwork);
				if (result == null)
					result = caseAAct(aBuildNetwork);
				if (result == null)
					result = caseSNamed(aBuildNetwork);
				if (result == null)
					result = caseIAct(aBuildNetwork);
				if (result == null)
					result = caseIID(aBuildNetwork);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMActPackage.ABUILD_SPACE: {
				ABuildSpace aBuildSpace = (ABuildSpace) theEObject;
				T result = caseABuildSpace(aBuildSpace);
				if (result == null)
					result = caseABuildProjection(aBuildSpace);
				if (result == null)
					result = caseAAct(aBuildSpace);
				if (result == null)
					result = caseSNamed(aBuildSpace);
				if (result == null)
					result = caseIAct(aBuildSpace);
				if (result == null)
					result = caseIID(aBuildSpace);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMActPackage.ABUILD_GEOGRAPHY: {
				ABuildGeography aBuildGeography = (ABuildGeography) theEObject;
				T result = caseABuildGeography(aBuildGeography);
				if (result == null)
					result = caseABuildProjection(aBuildGeography);
				if (result == null)
					result = caseAAct(aBuildGeography);
				if (result == null)
					result = caseSNamed(aBuildGeography);
				if (result == null)
					result = caseIAct(aBuildGeography);
				if (result == null)
					result = caseIID(aBuildGeography);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMActPackage.ABUILD_GRID: {
				ABuildGrid aBuildGrid = (ABuildGrid) theEObject;
				T result = caseABuildGrid(aBuildGrid);
				if (result == null)
					result = caseABuildSpace(aBuildGrid);
				if (result == null)
					result = caseABuildProjection(aBuildGrid);
				if (result == null)
					result = caseAAct(aBuildGrid);
				if (result == null)
					result = caseSNamed(aBuildGrid);
				if (result == null)
					result = caseIAct(aBuildGrid);
				if (result == null)
					result = caseIID(aBuildGrid);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMActPackage.ASELECT: {
				ASelect aSelect = (ASelect) theEObject;
				T result = caseASelect(aSelect);
				if (result == null)
					result = caseAAct(aSelect);
				if (result == null)
					result = caseIAct(aSelect);
				if (result == null)
					result = caseIID(aSelect);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMActPackage.AMOVE: {
				AMove aMove = (AMove) theEObject;
				T result = caseAMove(aMove);
				if (result == null)
					result = caseATransform(aMove);
				if (result == null)
					result = caseACommand(aMove);
				if (result == null)
					result = caseAAct(aMove);
				if (result == null)
					result = caseIAct(aMove);
				if (result == null)
					result = caseIID(aMove);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMActPackage.ATRANSFORM: {
				ATransform aTransform = (ATransform) theEObject;
				T result = caseATransform(aTransform);
				if (result == null)
					result = caseACommand(aTransform);
				if (result == null)
					result = caseAAct(aTransform);
				if (result == null)
					result = caseIAct(aTransform);
				if (result == null)
					result = caseIID(aTransform);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMActPackage.ALEAVE: {
				ALeave aLeave = (ALeave) theEObject;
				T result = caseALeave(aLeave);
				if (result == null)
					result = caseATransform(aLeave);
				if (result == null)
					result = caseACommand(aLeave);
				if (result == null)
					result = caseAAct(aLeave);
				if (result == null)
					result = caseIAct(aLeave);
				if (result == null)
					result = caseIID(aLeave);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMActPackage.ADIE: {
				ADie aDie = (ADie) theEObject;
				T result = caseADie(aDie);
				if (result == null)
					result = caseATransform(aDie);
				if (result == null)
					result = caseACommand(aDie);
				if (result == null)
					result = caseAAct(aDie);
				if (result == null)
					result = caseIAct(aDie);
				if (result == null)
					result = caseIID(aDie);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMActPackage.ACONNECT: {
				AConnect aConnect = (AConnect) theEObject;
				T result = caseAConnect(aConnect);
				if (result == null)
					result = caseANetwork(aConnect);
				if (result == null)
					result = caseATransform(aConnect);
				if (result == null)
					result = caseACommand(aConnect);
				if (result == null)
					result = caseAAct(aConnect);
				if (result == null)
					result = caseIAct(aConnect);
				if (result == null)
					result = caseIID(aConnect);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMActPackage.ANETWORK: {
				ANetwork aNetwork = (ANetwork) theEObject;
				T result = caseANetwork(aNetwork);
				if (result == null)
					result = caseATransform(aNetwork);
				if (result == null)
					result = caseACommand(aNetwork);
				if (result == null)
					result = caseAAct(aNetwork);
				if (result == null)
					result = caseIAct(aNetwork);
				if (result == null)
					result = caseIID(aNetwork);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMActPackage.ADISCONNECT: {
				ADisconnect aDisconnect = (ADisconnect) theEObject;
				T result = caseADisconnect(aDisconnect);
				if (result == null)
					result = caseANetwork(aDisconnect);
				if (result == null)
					result = caseATransform(aDisconnect);
				if (result == null)
					result = caseACommand(aDisconnect);
				if (result == null)
					result = caseAAct(aDisconnect);
				if (result == null)
					result = caseIAct(aDisconnect);
				if (result == null)
					result = caseIID(aDisconnect);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMActPackage.AREPLACE: {
				AReplace aReplace = (AReplace) theEObject;
				T result = caseAReplace(aReplace);
				if (result == null)
					result = caseAConnect(aReplace);
				if (result == null)
					result = caseANetwork(aReplace);
				if (result == null)
					result = caseATransform(aReplace);
				if (result == null)
					result = caseACommand(aReplace);
				if (result == null)
					result = caseAAct(aReplace);
				if (result == null)
					result = caseIAct(aReplace);
				if (result == null)
					result = caseIID(aReplace);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMActPackage.ACOMMAND: {
				ACommand aCommand = (ACommand) theEObject;
				T result = caseACommand(aCommand);
				if (result == null)
					result = caseAAct(aCommand);
				if (result == null)
					result = caseIAct(aCommand);
				if (result == null)
					result = caseIID(aCommand);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMActPackage.ACAUSE: {
				ACause aCause = (ACause) theEObject;
				T result = caseACause(aCause);
				if (result == null)
					result = caseACommand(aCause);
				if (result == null)
					result = caseAAct(aCause);
				if (result == null)
					result = caseIAct(aCause);
				if (result == null)
					result = caseIID(aCause);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMActPackage.ADIFFUSE: {
				ADiffuse aDiffuse = (ADiffuse) theEObject;
				T result = caseADiffuse(aDiffuse);
				if (result == null)
					result = caseARoot(aDiffuse);
				if (result == null)
					result = caseASelect(aDiffuse);
				if (result == null)
					result = caseAAct(aDiffuse);
				if (result == null)
					result = caseIAct(aDiffuse);
				if (result == null)
					result = caseIID(aDiffuse);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMActPackage.APERFORM: {
				APerform aPerform = (APerform) theEObject;
				T result = caseAPerform(aPerform);
				if (result == null)
					result = caseARoot(aPerform);
				if (result == null)
					result = caseASelect(aPerform);
				if (result == null)
					result = caseAAct(aPerform);
				if (result == null)
					result = caseIAct(aPerform);
				if (result == null)
					result = caseIID(aPerform);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case MetaABMActPackage.ADERIVE: {
				ADerive aDerive = (ADerive) theEObject;
				T result = caseADerive(aDerive);
				if (result == null)
					result = caseAAccessor(aDerive);
				if (result == null)
					result = caseARoot(aDerive);
				if (result == null)
					result = caseASelect(aDerive);
				if (result == null)
					result = caseAAct(aDerive);
				if (result == null)
					result = caseIAct(aDerive);
				if (result == null)
					result = caseIID(aDerive);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			default:
				return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AInput</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AInput</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAInput(AInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ALiteral</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ALiteral</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseALiteral(ALiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AMulti Value</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AMulti Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAMultiValue(AMultiValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>AAct</em>'. <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>AAct</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAAct(AAct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AControl</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AControl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAControl(AControl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ARoot</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ARoot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseARoot(ARoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AGroup</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AGroup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAGroup(AGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ASchedule</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ASchedule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseASchedule(ASchedule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ARule</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ARule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseARule(ARule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ABuild</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ABuild</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseABuild(ABuild object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AInitialize</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AInitialize</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAInitialize(AInitialize object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AMethod</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AMethod</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAMethod(AMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ASink</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ASink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseASink(ASink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ALogic</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ALogic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseALogic(ALogic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>AAny</em>'. <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>AAny</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAAny(AAny object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>AAll</em>'. <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>AAll</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAAll(AAll object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ANone</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ANone</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseANone(ANone object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AQuery</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AQuery</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAQuery(AQuery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AEvaluate</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AEvaluate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAEvaluate(AEvaluate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AAccessor</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AAccessor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAAccessor(AAccessor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AWatch</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AWatch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAWatch(AWatch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>ASet</em>'. <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>ASet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseASet(ASet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ACreate Agents</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ACreate Agents</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseACreateAgents(ACreateAgents object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ABuild Projection</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ABuild Projection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseABuildProjection(ABuildProjection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ABuild Network</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ABuild Network</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseABuildNetwork(ABuildNetwork object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ABuild Space</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ABuild Space</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseABuildSpace(ABuildSpace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ABuild Geography</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ABuild Geography</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseABuildGeography(ABuildGeography object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ABuild Grid</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ABuild Grid</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseABuildGrid(ABuildGrid object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ASelect</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ASelect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseASelect(ASelect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AMove</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AMove</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAMove(AMove object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ATransform</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ATransform</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseATransform(ATransform object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ALeave</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ALeave</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseALeave(ALeave object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>ADie</em>'. <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>ADie</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseADie(ADie object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AConnect</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AConnect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAConnect(AConnect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ANetwork</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ANetwork</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseANetwork(ANetwork object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ADisconnect</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ADisconnect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseADisconnect(ADisconnect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AReplace</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AReplace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAReplace(AReplace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ACommand</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ACommand</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseACommand(ACommand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ACause</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ACause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseACause(ACause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ADiffuse</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ADiffuse</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseADiffuse(ADiffuse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APerform</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APerform</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPerform(APerform object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ADerive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ADerive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseADerive(ADerive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AShaped</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AShaped</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAShaped(AShaped object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ALoad Shaped Agents</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ALoad Shaped Agents</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseALoadShapedAgents(ALoadShapedAgents object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ACreate Shaped Agents</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ACreate Shaped Agents</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseACreateShapedAgents(ACreateShapedAgents object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ALoad Agents</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ALoad Agents</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseALoadAgents(ALoadAgents object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>IValue</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IValue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIValue(IValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>IAct</em>'. <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>IAct</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIAct(IAct object) {
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

} // MetaABMActSwitch
