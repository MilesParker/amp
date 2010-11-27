/**
 * <copyright>
 * </copyright>
 *
 * $Id: ParameterSet.java,v 1.2 2010/08/04 01:54:19 mparker Exp $
 */
package org.eclipse.amp.amf.adata;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amp.amf.adata.ParameterSet#getMembers <em>Members</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amp.amf.adata.DataPackage#getParameterSet()
 * @model
 * @generated
 */
public interface ParameterSet extends EObject {
    /**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.amp.amf.adata.Parameter}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see org.eclipse.amp.amf.adata.DataPackage#getParameterSet_Members()
	 * @model containment="true"
	 * @generated
	 */
    EList<Parameter> getMembers();

} // ParameterSet
