/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.amp.amf.sd;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amp.amf.sd.SdAbstractVariable#getToElement <em>To Element</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.sd.SdAbstractVariable#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amp.amf.sd.SdPackage#getSdAbstractVariable()
 * @model abstract="true"
 * @generated
 */
public interface SdAbstractVariable extends SdGeneratable {
	/**
	 * Returns the value of the '<em><b>To Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.amp.amf.sd.SdConnector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Element</em>' containment reference list.
	 * @see org.eclipse.amp.amf.sd.SdPackage#getSdAbstractVariable_ToElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<SdConnector> getToElement();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.amp.amf.sd.SdModel#getAbstractVariables <em>Abstract Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(SdModel)
	 * @see org.eclipse.amp.amf.sd.SdPackage#getSdAbstractVariable_Parent()
	 * @see org.eclipse.amp.amf.sd.SdModel#getAbstractVariables
	 * @model opposite="abstractVariables" transient="false"
	 * @generated
	 */
	SdModel getParent();

	/**
	 * Sets the value of the '{@link org.eclipse.amp.amf.sd.SdAbstractVariable#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(SdModel value);

} // SdAbstractVariable
