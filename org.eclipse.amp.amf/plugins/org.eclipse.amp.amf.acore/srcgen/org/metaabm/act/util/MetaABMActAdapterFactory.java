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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
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

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides
 * an adapter <code>createXXX</code> method for each class of the model. <!--
 * end-user-doc -->
 * @see org.metaabm.act.MetaABMActPackage
 * @generated
 */
public class MetaABMActAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static MetaABMActPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public MetaABMActAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MetaABMActPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc --> This implementation returns <code>true</code> if
	 * the object is either the model's package or is an instance object of the
	 * model. <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected MetaABMActSwitch<Adapter> modelSwitch = new MetaABMActSwitch<Adapter>() {
		@Override
		public Adapter caseAInput(AInput object) {
			return createAInputAdapter();
		}

		@Override
		public Adapter caseALiteral(ALiteral object) {
			return createALiteralAdapter();
		}

		@Override
		public Adapter caseAMultiValue(AMultiValue object) {
			return createAMultiValueAdapter();
		}

		@Override
		public Adapter caseAShaped(AShaped object) {
			return createAShapedAdapter();
		}

		@Override
		public Adapter caseAAct(AAct object) {
			return createAActAdapter();
		}

		@Override
		public Adapter caseAControl(AControl object) {
			return createAControlAdapter();
		}

		@Override
		public Adapter caseARoot(ARoot object) {
			return createARootAdapter();
		}

		@Override
		public Adapter caseAGroup(AGroup object) {
			return createAGroupAdapter();
		}

		@Override
		public Adapter caseASchedule(ASchedule object) {
			return createAScheduleAdapter();
		}

		@Override
		public Adapter caseARule(ARule object) {
			return createARuleAdapter();
		}

		@Override
		public Adapter caseABuild(ABuild object) {
			return createABuildAdapter();
		}

		@Override
		public Adapter caseAInitialize(AInitialize object) {
			return createAInitializeAdapter();
		}

		@Override
		public Adapter caseAMethod(AMethod object) {
			return createAMethodAdapter();
		}

		@Override
		public Adapter caseASink(ASink object) {
			return createASinkAdapter();
		}

		@Override
		public Adapter caseALogic(ALogic object) {
			return createALogicAdapter();
		}

		@Override
		public Adapter caseAAny(AAny object) {
			return createAAnyAdapter();
		}

		@Override
		public Adapter caseAAll(AAll object) {
			return createAAllAdapter();
		}

		@Override
		public Adapter caseANone(ANone object) {
			return createANoneAdapter();
		}

		@Override
		public Adapter caseAQuery(AQuery object) {
			return createAQueryAdapter();
		}

		@Override
		public Adapter caseAEvaluate(AEvaluate object) {
			return createAEvaluateAdapter();
		}

		@Override
		public Adapter caseAAccessor(AAccessor object) {
			return createAAccessorAdapter();
		}

		@Override
		public Adapter caseAWatch(AWatch object) {
			return createAWatchAdapter();
		}

		@Override
		public Adapter caseASet(ASet object) {
			return createASetAdapter();
		}

		@Override
		public Adapter caseACreateAgents(ACreateAgents object) {
			return createACreateAgentsAdapter();
		}

		@Override
		public Adapter caseACreateShapedAgents(ACreateShapedAgents object) {
			return createACreateShapedAgentsAdapter();
		}

		@Override
		public Adapter caseALoadAgents(ALoadAgents object) {
			return createALoadAgentsAdapter();
		}

		@Override
		public Adapter caseALoadShapedAgents(ALoadShapedAgents object) {
			return createALoadShapedAgentsAdapter();
		}

		@Override
		public Adapter caseABuildProjection(ABuildProjection object) {
			return createABuildProjectionAdapter();
		}

		@Override
		public Adapter caseABuildNetwork(ABuildNetwork object) {
			return createABuildNetworkAdapter();
		}

		@Override
		public Adapter caseABuildSpace(ABuildSpace object) {
			return createABuildSpaceAdapter();
		}

		@Override
		public Adapter caseABuildGeography(ABuildGeography object) {
			return createABuildGeographyAdapter();
		}

		@Override
		public Adapter caseABuildGrid(ABuildGrid object) {
			return createABuildGridAdapter();
		}

		@Override
		public Adapter caseASelect(ASelect object) {
			return createASelectAdapter();
		}

		@Override
		public Adapter caseAMove(AMove object) {
			return createAMoveAdapter();
		}

		@Override
		public Adapter caseATransform(ATransform object) {
			return createATransformAdapter();
		}

		@Override
		public Adapter caseALeave(ALeave object) {
			return createALeaveAdapter();
		}

		@Override
		public Adapter caseADie(ADie object) {
			return createADieAdapter();
		}

		@Override
		public Adapter caseAConnect(AConnect object) {
			return createAConnectAdapter();
		}

		@Override
		public Adapter caseANetwork(ANetwork object) {
			return createANetworkAdapter();
		}

		@Override
		public Adapter caseADisconnect(ADisconnect object) {
			return createADisconnectAdapter();
		}

		@Override
		public Adapter caseAReplace(AReplace object) {
			return createAReplaceAdapter();
		}

		@Override
		public Adapter caseACommand(ACommand object) {
			return createACommandAdapter();
		}

		@Override
		public Adapter caseACause(ACause object) {
			return createACauseAdapter();
		}

		@Override
		public Adapter caseADiffuse(ADiffuse object) {
			return createADiffuseAdapter();
		}

		@Override
		public Adapter caseAPerform(APerform object) {
			return createAPerformAdapter();
		}

		@Override
		public Adapter caseADerive(ADerive object) {
			return createADeriveAdapter();
		}

		@Override
		public Adapter caseIID(IID object) {
			return createIIDAdapter();
		}

		@Override
		public Adapter caseIValue(IValue object) {
			return createIValueAdapter();
		}

		@Override
		public Adapter caseIAct(IAct object) {
			return createIActAdapter();
		}

		@Override
		public Adapter caseSNamed(SNamed object) {
			return createSNamedAdapter();
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
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.metaabm.act.AInput <em>AInput</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.metaabm.act.AInput
	 * @generated
	 */
	public Adapter createAInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.metaabm.act.ALiteral <em>ALiteral</em>}'.
	 * <!-- begin-user-doc
	 * --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.metaabm.act.ALiteral
	 * @generated
	 */
	public Adapter createALiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.metaabm.act.AMultiValue <em>AMulti Value</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.metaabm.act.AMultiValue
	 * @generated
	 */
	public Adapter createAMultiValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.metaabm.act.AAct <em>AAct</em>}'.
	 * <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.metaabm.act.AAct
	 * @generated
	 */
	public Adapter createAActAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.metaabm.act.AControl <em>AControl</em>}'.
	 * <!-- begin-user-doc
	 * --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.metaabm.act.AControl
	 * @generated
	 */
	public Adapter createAControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.metaabm.act.ARoot <em>ARoot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.metaabm.act.ARoot
	 * @generated
	 */
	public Adapter createARootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.metaabm.act.AGroup <em>AGroup</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.metaabm.act.AGroup
	 * @generated
	 */
	public Adapter createAGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.metaabm.act.ASchedule <em>ASchedule</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.metaabm.act.ASchedule
	 * @generated
	 */
	public Adapter createAScheduleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.metaabm.act.ARule <em>ARule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.metaabm.act.ARule
	 * @generated
	 */
	public Adapter createARuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.metaabm.act.ABuild <em>ABuild</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.metaabm.act.ABuild
	 * @generated
	 */
	public Adapter createABuildAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.metaabm.act.AInitialize <em>AInitialize</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.metaabm.act.AInitialize
	 * @generated
	 */
	public Adapter createAInitializeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.metaabm.act.AMethod <em>AMethod</em>}'.
	 * <!-- begin-user-doc
	 * --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.metaabm.act.AMethod
	 * @generated
	 */
	public Adapter createAMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.metaabm.act.ASink <em>ASink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.metaabm.act.ASink
	 * @generated
	 */
	public Adapter createASinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.metaabm.act.ALogic <em>ALogic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.metaabm.act.ALogic
	 * @generated
	 */
	public Adapter createALogicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.metaabm.act.AAny <em>AAny</em>}'.
	 * <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.metaabm.act.AAny
	 * @generated
	 */
	public Adapter createAAnyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.metaabm.act.AAll <em>AAll</em>}'.
	 * <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.metaabm.act.AAll
	 * @generated
	 */
	public Adapter createAAllAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.metaabm.act.ANone <em>ANone</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.metaabm.act.ANone
	 * @generated
	 */
	public Adapter createANoneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.metaabm.act.AQuery <em>AQuery</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.metaabm.act.AQuery
	 * @generated
	 */
	public Adapter createAQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.metaabm.act.AEvaluate <em>AEvaluate</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.metaabm.act.AEvaluate
	 * @generated
	 */
	public Adapter createAEvaluateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.metaabm.act.AAccessor <em>AAccessor</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.metaabm.act.AAccessor
	 * @generated
	 */
	public Adapter createAAccessorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.metaabm.act.AWatch <em>AWatch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.metaabm.act.AWatch
	 * @generated
	 */
	public Adapter createAWatchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.metaabm.act.ASet <em>ASet</em>}'.
	 * <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.metaabm.act.ASet
	 * @generated
	 */
	public Adapter createASetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.metaabm.act.ACreateAgents <em>ACreate Agents</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.metaabm.act.ACreateAgents
	 * @generated
	 */
	public Adapter createACreateAgentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.metaabm.act.ABuildProjection <em>ABuild Projection</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.metaabm.act.ABuildProjection
	 * @generated
	 */
	public Adapter createABuildProjectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.metaabm.act.ABuildNetwork <em>ABuild Network</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.metaabm.act.ABuildNetwork
	 * @generated
	 */
	public Adapter createABuildNetworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.metaabm.act.ABuildSpace <em>ABuild Space</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.metaabm.act.ABuildSpace
	 * @generated
	 */
	public Adapter createABuildSpaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.metaabm.act.ABuildGeography <em>ABuild Geography</em>} '. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.metaabm.act.ABuildGeography
	 * @generated
	 */
	public Adapter createABuildGeographyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.metaabm.act.ABuildGrid <em>ABuild Grid</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.metaabm.act.ABuildGrid
	 * @generated
	 */
	public Adapter createABuildGridAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.metaabm.act.ASelect <em>ASelect</em>}'.
	 * <!-- begin-user-doc
	 * --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.metaabm.act.ASelect
	 * @generated
	 */
	public Adapter createASelectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.metaabm.act.AMove <em>AMove</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.metaabm.act.AMove
	 * @generated
	 */
	public Adapter createAMoveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.metaabm.act.ATransform <em>ATransform</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.metaabm.act.ATransform
	 * @generated
	 */
	public Adapter createATransformAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.metaabm.act.ALeave <em>ALeave</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.metaabm.act.ALeave
	 * @generated
	 */
	public Adapter createALeaveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.metaabm.act.ADie <em>ADie</em>}'.
	 * <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.metaabm.act.ADie
	 * @generated
	 */
	public Adapter createADieAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.metaabm.act.AConnect <em>AConnect</em>}'.
	 * <!-- begin-user-doc
	 * --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.metaabm.act.AConnect
	 * @generated
	 */
	public Adapter createAConnectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.metaabm.act.ANetwork <em>ANetwork</em>}'.
	 * <!-- begin-user-doc
	 * --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.metaabm.act.ANetwork
	 * @generated
	 */
	public Adapter createANetworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.metaabm.act.ADisconnect <em>ADisconnect</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.metaabm.act.ADisconnect
	 * @generated
	 */
	public Adapter createADisconnectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.metaabm.act.AReplace <em>AReplace</em>}'.
	 * <!-- begin-user-doc
	 * --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.metaabm.act.AReplace
	 * @generated
	 */
	public Adapter createAReplaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.metaabm.act.ACommand <em>ACommand</em>}'.
	 * <!-- begin-user-doc
	 * --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.metaabm.act.ACommand
	 * @generated
	 */
	public Adapter createACommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.metaabm.act.ACause <em>ACause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.metaabm.act.ACause
	 * @generated
	 */
	public Adapter createACauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.metaabm.act.ADiffuse <em>ADiffuse</em>}'.
	 * <!-- begin-user-doc
	 * --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.metaabm.act.ADiffuse
	 * @generated
	 */
	public Adapter createADiffuseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.metaabm.act.APerform <em>APerform</em>}'.
	 * <!-- begin-user-doc
	 * --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.metaabm.act.APerform
	 * @generated
	 */
	public Adapter createAPerformAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.metaabm.act.ADerive <em>ADerive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.metaabm.act.ADerive
	 * @generated
	 */
	public Adapter createADeriveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.metaabm.act.AShaped <em>AShaped</em>}'.
	 * <!-- begin-user-doc
	 * --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.metaabm.act.AShaped
	 * @generated
	 */
	public Adapter createAShapedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.metaabm.act.ALoadShapedAgents <em>ALoad Shaped Agents</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.metaabm.act.ALoadShapedAgents
	 * @generated
	 */
	public Adapter createALoadShapedAgentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.metaabm.act.ACreateShapedAgents <em>ACreate Shaped Agents</em>}'.
	 * <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.metaabm.act.ACreateShapedAgents
	 * @generated
	 */
	public Adapter createACreateShapedAgentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.metaabm.act.ALoadAgents <em>ALoad Agents</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.metaabm.act.ALoadAgents
	 * @generated
	 */
	public Adapter createALoadAgentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.metaabm.IID
	 * <em>IID</em>}'. <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see org.metaabm.IID
	 * @generated
	 */
	public Adapter createIIDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.metaabm.IValue
	 * <em>IValue</em>}'. <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see org.metaabm.IValue
	 * @generated
	 */
	public Adapter createIValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.metaabm.IAct
	 * <em>IAct</em>}'. <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see org.metaabm.IAct
	 * @generated
	 */
	public Adapter createIActAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.metaabm.SNamed
	 * <em>SNamed</em>}'. <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see org.metaabm.SNamed
	 * @generated
	 */
	public Adapter createSNamedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc --> This
	 * default implementation returns null. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} // MetaABMActAdapterFactory
