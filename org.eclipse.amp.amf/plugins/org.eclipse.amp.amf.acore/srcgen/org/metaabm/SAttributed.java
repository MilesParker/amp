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
package org.metaabm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>SAttributed</b></em>'.
 * 
 * @author Miles Parker <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.metaabm.SAttributed#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.metaabm.MetaABMPackage#getSAttributed()
 * @model abstract="true"
 * @generated
 */
public interface SAttributed extends SNamed {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link org.metaabm.SAttribute}.
	 * It is bidirectional and its opposite is '{@link org.metaabm.SAttribute#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see org.metaabm.MetaABMPackage#getSAttributed_Attributes()
	 * @see org.metaabm.SAttribute#getOwner
	 * @model opposite="owner" containment="true" keys="ID" ordered="false"
	 * @generated
	 */
	EList<SAttribute> getAttributes();

	SAttribute findAttribute(String id);

	boolean isReachable(IValue value);

} // SAttributed