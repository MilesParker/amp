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
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>SAgent</b></em>'.
 * 
 * @author Miles Parker <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.metaabm.SAgent#getStyles <em>Styles</em>}</li>
 *   <li>{@link org.metaabm.SAgent#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.metaabm.SAgent#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.metaabm.MetaABMPackage#getSAgent()
 * @model
 * @generated
 */
public interface SAgent extends SActable, SImplemented {
	/**
	 * Returns the value of the '<em><b>Styles</b></em>' containment reference list.
	 * The list contents are of type {@link org.metaabm.SStyle}.
	 * It is bidirectional and its opposite is '{@link org.metaabm.SStyle#getAgent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Styles</em>' containment reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Styles</em>' containment reference list.
	 * @see org.metaabm.MetaABMPackage#getSAgent_Styles()
	 * @see org.metaabm.SStyle#getAgent
	 * @model opposite="agent" containment="true" keys="ID"
	 * @generated
	 */
	EList<SStyle> getStyles();

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.metaabm.SContext#getAgents <em>Agents</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' container reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(SContext)
	 * @see org.metaabm.MetaABMPackage#getSAgent_Owner()
	 * @see org.metaabm.SContext#getAgents
	 * @model opposite="agents" transient="false"
	 * @generated
	 */
	SContext getOwner();

	/**
	 * Sets the value of the '{@link org.metaabm.SAgent#getOwner <em>Owner</em>}' container reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(SContext value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.metaabm.IAgentChild}.
	 * It is bidirectional and its opposite is '{@link org.metaabm.IAgentChild#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.metaabm.MetaABMPackage#getSAgent_Children()
	 * @see org.metaabm.IAgentChild#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<IAgentChild> getChildren();
} // SAgent