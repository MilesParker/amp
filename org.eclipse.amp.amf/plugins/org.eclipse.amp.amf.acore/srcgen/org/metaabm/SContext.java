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

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>SContext</b></em>'.
 * 
 * @author Miles Parker <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.metaabm.SContext#getAgents <em>Agents</em>}</li>
 *   <li>{@link org.metaabm.SContext#getProjections <em>Projections</em>}</li>
 *   <li>{@link org.metaabm.SContext#getValueLayers <em>Value Layers</em>}</li>
 *   <li>{@link org.metaabm.SContext#getLibrary <em>Library</em>}</li>
 *   <li>{@link org.metaabm.SContext#getAllAgents <em>All Agents</em>}</li>
 *   <li>{@link org.metaabm.SContext#getAllContexts <em>All Contexts</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.metaabm.MetaABMPackage#getSContext()
 * @model
 * @generated
 */
public interface SContext extends SAgent {
	/**
	 * Returns the value of the '<em><b>Projections</b></em>' containment reference list.
	 * The list contents are of type {@link org.metaabm.SProjection}.
	 * It is bidirectional and its opposite is '{@link org.metaabm.SProjection#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Projections</em>' containment reference list isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projections</em>' containment reference list.
	 * @see org.metaabm.MetaABMPackage#getSContext_Projections()
	 * @see org.metaabm.SProjection#getOwner
	 * @model opposite="owner" containment="true" keys="ID"
	 * @generated
	 */
	EList<SProjection> getProjections();

	/**
	 * Returns the value of the '<em><b>Agents</b></em>' containment reference list.
	 * The list contents are of type {@link org.metaabm.SAgent}.
	 * It is bidirectional and its opposite is '{@link org.metaabm.SAgent#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agents</em>' containment reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agents</em>' containment reference list.
	 * @see org.metaabm.MetaABMPackage#getSContext_Agents()
	 * @see org.metaabm.SAgent#getOwner
	 * @model opposite="owner" containment="true" keys="ID"
	 * @generated
	 */
	EList<SAgent> getAgents();

	/**
	 * Returns the value of the '<em><b>Value Layers</b></em>' containment reference list.
	 * The list contents are of type {@link org.metaabm.SValueLayer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Layers</em>' containment reference list isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Layers</em>' containment reference list.
	 * @see org.metaabm.MetaABMPackage#getSContext_ValueLayers()
	 * @model containment="true" keys="ID"
	 * @generated
	 */
	EList<SValueLayer> getValueLayers();

	/**
	 * Returns the value of the '<em><b>Library</b></em>' containment reference list.
	 * The list contents are of type {@link org.metaabm.IArtifact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Library</em>' containment reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library</em>' containment reference list.
	 * @see org.metaabm.MetaABMPackage#getSContext_Library()
	 * @model containment="true" keys="ID"
	 * @generated
	 */
	EList<IArtifact> getLibrary();

	Collection<SContext> getSubContexts();

	List<SAgent> getAllSubAgents();

	EList<EObject> getAllAgents();

	EList<EObject> getAllContexts();

	SAgent findChild(String name);

	SAgent findAgent(String id);

} // SContext