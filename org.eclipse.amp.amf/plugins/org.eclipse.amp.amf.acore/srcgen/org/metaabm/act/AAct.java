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
import org.metaabm.IAct;
import org.metaabm.IID;
import org.metaabm.IValue;
import org.metaabm.SAgent;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>AAct</b></em>'.
 * 
 * @author Miles Parker <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.metaabm.act.AAct#getSources <em>Sources</em>}</li>
 *   <li>{@link org.metaabm.act.AAct#getTargets <em>Targets</em>}</li>
 *   <li>{@link org.metaabm.act.AAct#getReference <em>Reference</em>}</li>
 *   <li>{@link org.metaabm.act.AAct#getGroup <em>Group</em>}</li>
 *   <li>{@link org.metaabm.act.AAct#getSelected <em>Selected</em>}</li>
 *   <li>{@link org.metaabm.act.AAct#getAllSources <em>All Sources</em>}</li>
 *   <li>{@link org.metaabm.act.AAct#getAllTargets <em>All Targets</em>}</li>
 *   <li>{@link org.metaabm.act.AAct#getRootSelected <em>Root Selected</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.metaabm.act.MetaABMActPackage#getAAct()
 * @model abstract="true"
 * @generated
 */
public interface AAct extends IID, IAct {
	/**
	 * Returns the value of the '<em><b>Sources</b></em>' reference list.
	 * The list contents are of type {@link org.metaabm.act.AAct}.
	 * It is bidirectional and its opposite is '{@link org.metaabm.act.AAct#getTargets <em>Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sources</em>' reference list isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sources</em>' reference list.
	 * @see org.metaabm.act.MetaABMActPackage#getAAct_Sources()
	 * @see org.metaabm.act.AAct#getTargets
	 * @model opposite="targets"
	 * @generated
	 */
	EList<AAct> getSources();

	/**
	 * Returns the value of the '<em><b>Targets</b></em>' reference list.
	 * The list contents are of type {@link org.metaabm.act.AAct}.
	 * It is bidirectional and its opposite is '{@link org.metaabm.act.AAct#getSources <em>Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Targets</em>' reference list isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targets</em>' reference list.
	 * @see org.metaabm.act.MetaABMActPackage#getAAct_Targets()
	 * @see org.metaabm.act.AAct#getSources
	 * @model opposite="sources"
	 * @generated
	 */
	EList<AAct> getTargets();

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' reference.
	 * @see org.metaabm.act.MetaABMActPackage#getAAct_Reference()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	SAgent getReference();

	/**
	 * Returns the value of the '<em><b>Group</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.metaabm.act.AGroup#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' container reference.
	 * @see #setGroup(AGroup)
	 * @see org.metaabm.act.MetaABMActPackage#getAAct_Group()
	 * @see org.metaabm.act.AGroup#getMembers
	 * @model opposite="members" transient="false"
	 * @generated
	 */
	AGroup getGroup();

	/**
	 * Sets the value of the '{@link org.metaabm.act.AAct#getGroup <em>Group</em>}' container reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Group</em>' container reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(AGroup value);

	/**
	 * Returns the value of the '<em><b>Selected</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected</em>' reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected</em>' reference.
	 * @see #setSelected(ASelect)
	 * @see org.metaabm.act.MetaABMActPackage#getAAct_Selected()
	 * @model
	 * @generated
	 */
	ASelect getSelected();

	/**
	 * Sets the value of the '{@link org.metaabm.act.AAct#getSelected <em>Selected</em>}' reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected</em>' reference.
	 * @see #getSelected()
	 * @generated
	 */
	void setSelected(ASelect value);

	/**
	 * Returns the value of the '<em><b>All Sources</b></em>' reference list.
	 * The list contents are of type {@link org.metaabm.act.AAct}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Sources</em>' reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Sources</em>' reference list.
	 * @see org.metaabm.act.MetaABMActPackage#getAAct_AllSources()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<AAct> getAllSources();

	/**
	 * Returns the value of the '<em><b>All Targets</b></em>' reference list.
	 * The list contents are of type {@link org.metaabm.act.AAct}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Targets</em>' reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Targets</em>' reference list.
	 * @see org.metaabm.act.MetaABMActPackage#getAAct_AllTargets()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<AAct> getAllTargets();

	/**
	 * Returns the value of the '<em><b>Root Selected</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Selected</em>' reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Selected</em>' reference.
	 * @see org.metaabm.act.MetaABMActPackage#getAAct_RootSelected()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	ASelect getRootSelected();

	boolean isTargetOf(Object check);

	public boolean isReachable(IValue value);

	boolean references(IValue value);

} // AAct
