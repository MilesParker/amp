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
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Node</b></em>'.
 * 
 * @author Miles Parker * <!-- end-user-doc -->
 *         <p>
 *         The following features are supported:
 *         <ul>
 *         <li>{@link org.metaabm.Node#getChildren <em>Children</em>}</li>
 *         <li>{@link org.metaabm.Node#getParent <em>Parent</em>}</li>
 *         <li>{@link org.metaabm.Node#getSource <em>Source</em>}</li>
 *         <li>{@link org.metaabm.Node#getTarget <em>Target</em>}</li>
 *         </ul>
 *         </p>
 * @see org.metaabmPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends TID {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String copyright = "";

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference list. The
	 * list contents are of type {@link org.metaabm.Node}. It is bidirectional
	 * and its opposite is '{@link org.metaabm.Node#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference list isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Source</em>' reference list.
	 * @see org.metaabmPackage#getNode_Source()
	 * @see org.metaabm.Node#getTarget
	 * @model type="org.metaabm.Node" opposite="target"
	 * @generated
	 */
	EList<Node> getSource();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference list. The
	 * list contents are of type {@link org.metaabm.Node}. It is bidirectional
	 * and its opposite is '{@link org.metaabm.Node#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference list isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Target</em>' reference list.
	 * @see org.metaabmPackage#getNode_Target()
	 * @see org.metaabm.Node#getSource
	 * @model type="org.metaabm.Node" opposite="source"
	 * @generated
	 */
	EList<Node> getTarget();

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference
	 * list. The list contents are of type {@link org.metaabm.Node}. It is
	 * bidirectional and its opposite is '{@link org.metaabm.Node#getParent
	 * <em>Parent</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.metaabmPackage#getNode_Children()
	 * @see org.metaabm.Node#getParent
	 * @model type="org.metaabm.Node" opposite="parent" containment="true"
	 * @generated
	 */
	EList<Node> getChildren();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference. It
	 * is bidirectional and its opposite is '
	 * {@link org.metaabm.Node#getChildren <em>Children</em>}'. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(Node)
	 * @see org.metaabmPackage#getNode_Parent()
	 * @see org.metaabm.Node#getChildren
	 * @model opposite="children"
	 * @generated
	 */
	Node getParent();

	/**
	 * Sets the value of the '{@link org.metaabm.Node#getParent <em>Parent</em>}
	 * ' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Node value);

} // Node
