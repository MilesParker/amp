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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
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
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides
 * an adapter <code>createXXX</code> method for each class of the model. <!--
 * end-user-doc -->
 * @see org.metaabm.function.MetaABMFunctionPackage
 * @generated
 */
public class MetaABMFunctionAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static MetaABMFunctionPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public MetaABMFunctionAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MetaABMFunctionPackage.eINSTANCE;
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
	protected MetaABMFunctionSwitch<Adapter> modelSwitch = new MetaABMFunctionSwitch<Adapter>() {
		@Override
		public Adapter caseFArgumentPrototype(FArgumentPrototype object) {
			return createFArgumentPrototypeAdapter();
		}

		@Override
		public Adapter caseFArgumentArrayPrototype(FArgumentArrayPrototype object) {
			return createFArgumentArrayPrototypeAdapter();
		}

		@Override
		public Adapter caseFFunction(FFunction object) {
			return createFFunctionAdapter();
		}

		@Override
		public Adapter caseFLogical(FLogical object) {
			return createFLogicalAdapter();
		}

		@Override
		public Adapter caseFOperator(FOperator object) {
			return createFOperatorAdapter();
		}

		@Override
		public Adapter caseFLogicalOperator(FLogicalOperator object) {
			return createFLogicalOperatorAdapter();
		}

		@Override
		public Adapter caseFGeneric(FGeneric object) {
			return createFGenericAdapter();
		}

		@Override
		public Adapter caseFGenericFunction(FGenericFunction object) {
			return createFGenericFunctionAdapter();
		}

		@Override
		public Adapter caseFGenericLogical(FGenericLogical object) {
			return createFGenericLogicalAdapter();
		}

		@Override
		public Adapter caseFLibrary(FLibrary object) {
			return createFLibraryAdapter();
		}

		@Override
		public Adapter caseFImplementedLibrary(FImplementedLibrary object) {
			return createFImplementedLibraryAdapter();
		}

		@Override
		public Adapter caseFMultiArgumentPrototype(FMultiArgumentPrototype object) {
			return createFMultiArgumentPrototypeAdapter();
		}

		@Override
		public Adapter caseIID(IID object) {
			return createIIDAdapter();
		}

		@Override
		public Adapter caseITyped(ITyped object) {
			return createITypedAdapter();
		}

		@Override
		public Adapter caseSNamed(SNamed object) {
			return createSNamedAdapter();
		}

		@Override
		public Adapter caseITypedArray(ITypedArray object) {
			return createITypedArrayAdapter();
		}

		@Override
		public Adapter caseIArtifact(IArtifact object) {
			return createIArtifactAdapter();
		}

		@Override
		public Adapter caseSImplemented(SImplemented object) {
			return createSImplementedAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.metaabm.function.FArgumentPrototype <em>FArgument Prototype</em>}'.
	 * <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.metaabm.function.FArgumentPrototype
	 * @generated
	 */
	public Adapter createFArgumentPrototypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.metaabm.function.FArgumentArrayPrototype <em>FArgument Array Prototype</em>}'.
	 * <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.metaabm.function.FArgumentArrayPrototype
	 * @generated
	 */
	public Adapter createFArgumentArrayPrototypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.metaabm.function.FFunction <em>FFunction</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.metaabm.function.FFunction
	 * @generated
	 */
	public Adapter createFFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.metaabm.function.FLogical <em>FLogical</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.metaabm.function.FLogical
	 * @generated
	 */
	public Adapter createFLogicalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.metaabm.function.FOperator <em>FOperator</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.metaabm.function.FOperator
	 * @generated
	 */
	public Adapter createFOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.metaabm.function.FLogicalOperator <em>FLogical Operator</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so
	 * that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.metaabm.function.FLogicalOperator
	 * @generated
	 */
	public Adapter createFLogicalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.metaabm.function.FGeneric <em>FGeneric</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.metaabm.function.FGeneric
	 * @generated
	 */
	public Adapter createFGenericAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.metaabm.function.FGenericFunction <em>FGeneric Function</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so
	 * that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.metaabm.function.FGenericFunction
	 * @generated
	 */
	public Adapter createFGenericFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.metaabm.function.FGenericLogical <em>FGeneric Logical</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.metaabm.function.FGenericLogical
	 * @generated
	 */
	public Adapter createFGenericLogicalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.metaabm.function.FLibrary <em>FLibrary</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.metaabm.function.FLibrary
	 * @generated
	 */
	public Adapter createFLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.metaabm.function.FImplementedLibrary <em>FImplemented Library</em>}'.
	 * <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.metaabm.function.FImplementedLibrary
	 * @generated
	 */
	public Adapter createFImplementedLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.metaabm.function.FMultiArgumentPrototype <em>FMulti Argument Prototype</em>}'.
	 * <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.metaabm.function.FMultiArgumentPrototype
	 * @generated
	 */
	public Adapter createFMultiArgumentPrototypeAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.metaabm.ITyped
	 * <em>ITyped</em>}'. <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see org.metaabm.ITyped
	 * @generated
	 */
	public Adapter createITypedAdapter() {
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
	 * Creates a new adapter for an object of class '
	 * {@link org.metaabm.ITypedArray <em>ITyped Array</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.metaabm.ITypedArray
	 * @generated
	 */
	public Adapter createITypedArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.metaabm.IArtifact <em>IArtifact</em>}'.
	 * <!-- begin-user-doc
	 * --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.metaabm.IArtifact
	 * @generated
	 */
	public Adapter createIArtifactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.metaabm.SImplemented <em>SImplemented</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.metaabm.SImplemented
	 * @generated
	 */
	public Adapter createSImplementedAdapter() {
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

} // MetaABMFunctionAdapterFactory
