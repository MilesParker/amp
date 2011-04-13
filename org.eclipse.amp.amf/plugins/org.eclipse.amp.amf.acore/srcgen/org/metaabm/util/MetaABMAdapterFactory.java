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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
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
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter <code>createXXX</code>
 * method for each class of the model. <!-- end-user-doc -->
 * @see org.metaabm.MetaABMPackage
 * @generated
 */
public class MetaABMAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static MetaABMPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MetaABMAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MetaABMPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc --> This implementation
	 * returns <code>true</code> if the object is either the model's package or is an instance object of the model. <!--
	 * end-user-doc -->
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
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected MetaABMSwitch<Adapter> modelSwitch = new MetaABMSwitch<Adapter>() {
		@Override
		public Adapter caseIID(IID object) {
			return createIIDAdapter();
		}

		@Override
		public Adapter caseITyped(ITyped object) {
			return createITypedAdapter();
		}

		@Override
		public Adapter caseITypedArray(ITypedArray object) {
			return createITypedArrayAdapter();
		}

		@Override
		public Adapter caseIValue(IValue object) {
			return createIValueAdapter();
		}

		@Override
		public Adapter caseIArtifact(IArtifact object) {
			return createIArtifactAdapter();
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
		public Adapter caseSAttributed(SAttributed object) {
			return createSAttributedAdapter();
		}

		@Override
		public Adapter caseSActable(SActable object) {
			return createSActableAdapter();
		}

		@Override
		public Adapter caseSAttribute(SAttribute object) {
			return createSAttributeAdapter();
		}

		@Override
		public Adapter caseSAttributeArray(SAttributeArray object) {
			return createSAttributeArrayAdapter();
		}

		@Override
		public Adapter caseSState(SState object) {
			return createSStateAdapter();
		}

		@Override
		public Adapter caseSStateValue(SStateValue object) {
			return createSStateValueAdapter();
		}

		@Override
		public Adapter caseSAgent(SAgent object) {
			return createSAgentAdapter();
		}

		@Override
		public Adapter caseSContext(SContext object) {
			return createSContextAdapter();
		}

		@Override
		public Adapter caseSProjection(SProjection object) {
			return createSProjectionAdapter();
		}

		@Override
		public Adapter caseSNDimensional(SNDimensional object) {
			return createSNDimensionalAdapter();
		}

		@Override
		public Adapter caseSContinuousSpace(SContinuousSpace object) {
			return createSContinuousSpaceAdapter();
		}

		@Override
		public Adapter caseSGrid(SGrid object) {
			return createSGridAdapter();
		}

		@Override
		public Adapter caseSNetwork(SNetwork object) {
			return createSNetworkAdapter();
		}

		@Override
		public Adapter caseSGeography(SGeography object) {
			return createSGeographyAdapter();
		}

		@Override
		public Adapter caseSValueLayer(SValueLayer object) {
			return createSValueLayerAdapter();
		}

		@Override
		public Adapter caseSStyle(SStyle object) {
			return createSStyleAdapter();
		}

		@Override
		public Adapter caseSStyle2D(SStyle2D object) {
			return createSStyle2DAdapter();
		}

		@Override
		public Adapter caseSStyleShape(SStyleShape object) {
			return createSStyleShapeAdapter();
		}

		@Override
		public Adapter caseSStyle3D(SStyle3D object) {
			return createSStyle3DAdapter();
		}

		@Override
		public Adapter caseSImplemented(SImplemented object) {
			return createSImplementedAdapter();
		}

		@Override
		public Adapter caseSImplementation(SImplementation object) {
			return createSImplementationAdapter();
		}

		@Override
		public Adapter caseIAgentChild(IAgentChild object) {
			return createIAgentChildAdapter();
		}

		@Override
		public Adapter caseIAttributeChild(IAttributeChild object) {
			return createIAttributeChildAdapter();
		}

		@Override
		public Adapter caseIModelExtension(IModelExtension object) {
			return createIModelExtensionAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.metaabm.IID <em>IID</em>}'.
	 * <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.metaabm.IID
	 * @generated
	 */
	public Adapter createIIDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.metaabm.ITyped <em>ITyped</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.metaabm.ITyped
	 * @generated
	 */
	public Adapter createITypedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class ' {@link org.metaabm.ITypedArray <em>ITyped Array</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
	 * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.metaabm.ITypedArray
	 * @generated
	 */
	public Adapter createITypedArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.metaabm.IValue <em>IValue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.metaabm.IValue
	 * @generated
	 */
	public Adapter createIValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.metaabm.IArtifact <em>IArtifact</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
	 * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.metaabm.IArtifact
	 * @generated
	 */
	public Adapter createIArtifactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.metaabm.IAct <em>IAct</em>}'.
	 * <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.metaabm.IAct
	 * @generated
	 */
	public Adapter createIActAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.metaabm.SNamed <em>SNamed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.metaabm.SNamed
	 * @generated
	 */
	public Adapter createSNamedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class ' {@link org.metaabm.SAttributed <em>SAttributed</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
	 * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.metaabm.SAttributed
	 * @generated
	 */
	public Adapter createSAttributedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.metaabm.SAttribute <em>SAttribute</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
	 * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.metaabm.SAttribute
	 * @generated
	 */
	public Adapter createSAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class ' {@link org.metaabm.SAttributeArray <em>SAttribute Array</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
	 * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.metaabm.SAttributeArray
	 * @generated
	 */
	public Adapter createSAttributeArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.metaabm.SAgent <em>SAgent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.metaabm.SAgent
	 * @generated
	 */
	public Adapter createSAgentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.metaabm.SContext <em>SContext</em>}'.
	 * <!-- begin-user-doc
	 * --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.metaabm.SContext
	 * @generated
	 */
	public Adapter createSContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class ' {@link org.metaabm.SProjection <em>SProjection</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
	 * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.metaabm.SProjection
	 * @generated
	 */
	public Adapter createSProjectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class ' {@link org.metaabm.SNDimensional <em>SN Dimensional</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
	 * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.metaabm.SNDimensional
	 * @generated
	 */
	public Adapter createSNDimensionalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.metaabm.SContinuousSpace <em>SContinuous Space</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
	 * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.metaabm.SContinuousSpace
	 * @generated
	 */
	public Adapter createSContinuousSpaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.metaabm.SGrid <em>SGrid</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.metaabm.SGrid
	 * @generated
	 */
	public Adapter createSGridAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.metaabm.SNetwork <em>SNetwork</em>}'.
	 * <!-- begin-user-doc
	 * --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.metaabm.SNetwork
	 * @generated
	 */
	public Adapter createSNetworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.metaabm.SGeography <em>SGeography</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
	 * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.metaabm.SGeography
	 * @generated
	 */
	public Adapter createSGeographyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class ' {@link org.metaabm.SValueLayer <em>SValue Layer</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
	 * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.metaabm.SValueLayer
	 * @generated
	 */
	public Adapter createSValueLayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.metaabm.SStyle <em>SStyle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.metaabm.SStyle
	 * @generated
	 */
	public Adapter createSStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.metaabm.SStyle3D <em>SStyle3 D</em>}'.
	 * <!-- begin-user-doc
	 * --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.metaabm.SStyle3D
	 * @generated
	 */
	public Adapter createSStyle3DAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.metaabm.SStyle2D <em>SStyle2 D</em>}'.
	 * <!-- begin-user-doc
	 * --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.metaabm.SStyle2D
	 * @generated
	 */
	public Adapter createSStyle2DAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class ' {@link org.metaabm.SStyleShape <em>SStyle Shape</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
	 * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.metaabm.SStyleShape
	 * @generated
	 */
	public Adapter createSStyleShapeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class ' {@link org.metaabm.SImplemented <em>SImplemented</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
	 * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.metaabm.SImplemented
	 * @generated
	 */
	public Adapter createSImplementedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class ' {@link org.metaabm.SImplementation <em>SImplementation</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
	 * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.metaabm.SImplementation
	 * @generated
	 */
	public Adapter createSImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.metaabm.IAgentChild <em>IAgent Child</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
	 * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.metaabm.IAgentChild
	 * @generated
	 */
	public Adapter createIAgentChildAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.metaabm.IAttributeChild <em>IAttribute Child</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.metaabm.IAttributeChild
	 * @generated
	 */
	public Adapter createIAttributeChildAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.metaabm.SState <em>SState</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.metaabm.SState
	 * @generated
	 */
	public Adapter createSStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class ' {@link org.metaabm.SStateValue <em>SState Value</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
	 * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.metaabm.SStateValue
	 * @generated
	 */
	public Adapter createSStateValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.metaabm.SActable <em>SActable</em>}'.
	 * <!-- begin-user-doc
	 * --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.metaabm.SActable
	 * @generated
	 */
	public Adapter createSActableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc --> This default implementation returns null. <!--
	 * end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} // MetaABMAdapterFactory
