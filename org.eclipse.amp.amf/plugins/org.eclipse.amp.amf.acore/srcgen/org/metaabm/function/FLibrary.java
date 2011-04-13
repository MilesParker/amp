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
package org.metaabm.function;

import org.eclipse.emf.common.util.EList;
import org.metaabm.IArtifact;
import org.metaabm.SNamed;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>FLibrary</b></em>'.
 * 
 * @author Miles Parker <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.metaabm.function.FLibrary#getFunctions <em>Functions</em>}</li>
 *   <li>{@link org.metaabm.function.FLibrary#getSubs <em>Subs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.metaabm.function.MetaABMFunctionPackage#getFLibrary()
 * @model
 * @generated
 */
public interface FLibrary extends SNamed, IArtifact {
	/**
	 * Returns the value of the '<em><b>Functions</b></em>' containment reference list.
	 * The list contents are of type {@link org.metaabm.function.FFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functions</em>' containment reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functions</em>' containment reference list.
	 * @see org.metaabm.function.MetaABMFunctionPackage#getFLibrary_Functions()
	 * @model containment="true" keys="ID"
	 * @generated
	 */
	EList<FFunction> getFunctions();

	/**
	 * Returns the value of the '<em><b>Subs</b></em>' containment reference list.
	 * The list contents are of type {@link org.metaabm.function.FLibrary}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subs</em>' reference list isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subs</em>' containment reference list.
	 * @see org.metaabm.function.MetaABMFunctionPackage#getFLibrary_Subs()
	 * @model containment="true" keys="ID"
	 * @generated
	 */
	EList<FLibrary> getSubs();

	/**
	 * Returns the sub library with the supplied <i>usage</i> name.
	 */
	public FFunction findFunction(String id);

	/**
	 * Returns the sub library with the supplied <i>usage</i> name.
	 */
	public FLibrary findSub(String id);

} // FLibrary
