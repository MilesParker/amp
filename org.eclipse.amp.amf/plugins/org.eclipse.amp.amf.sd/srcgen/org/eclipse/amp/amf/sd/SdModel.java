/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.amp.amf.sd;

import org.eclipse.emf.common.util.EList;

import org.metaabm.IAgentChild;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amp.amf.sd.SdModel#getAbstractVariables <em>Abstract Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amp.amf.sd.SdPackage#getSdModel()
 * @model
 * @generated
 */
public interface SdModel extends SdGeneratable, IAgentChild {
	/**
	 * Returns the value of the '<em><b>Abstract Variables</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.amp.amf.sd.SdAbstractVariable}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.amp.amf.sd.SdAbstractVariable#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Variables</em>' containment reference list.
	 * @see org.eclipse.amp.amf.sd.SdPackage#getSdModel_AbstractVariables()
	 * @see org.eclipse.amp.amf.sd.SdAbstractVariable#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<SdAbstractVariable> getAbstractVariables();

} // SdModel
