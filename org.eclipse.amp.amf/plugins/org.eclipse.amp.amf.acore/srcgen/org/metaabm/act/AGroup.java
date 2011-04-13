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
package org.metaabm.act;

import org.eclipse.emf.common.util.EList;
import org.metaabm.SNamed;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>AGroup</b></em>'.
 * 
 * @author Miles Parker <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.metaabm.act.AGroup#getRoots <em>Roots</em>}</li>
 *   <li>{@link org.metaabm.act.AGroup#getMembers <em>Members</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.metaabm.act.MetaABMActPackage#getAGroup()
 * @model
 * @generated
 */
public interface AGroup extends AAct, SNamed {
	/**
	 * Returns the value of the '<em><b>Roots</b></em>' reference list.
	 * The list contents are of type {@link org.metaabm.act.AAct}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roots</em>' reference list isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roots</em>' reference list.
	 * @see org.metaabm.act.MetaABMActPackage#getAGroup_Roots()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<AAct> getRoots();

	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link org.metaabm.act.AAct}.
	 * It is bidirectional and its opposite is '{@link org.metaabm.act.AAct#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Members</em>' containment reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see org.metaabm.act.MetaABMActPackage#getAGroup_Members()
	 * @see org.metaabm.act.AAct#getGroup
	 * @model opposite="group" containment="true" keys="ID"
	 * @generated
	 */
	EList<AAct> getMembers();

	AAct findMember(String id);

} // AGroup
