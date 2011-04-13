/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.amp.amf.sd;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amp.amf.sd.SdConnector#getToElement <em>To Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amp.amf.sd.SdPackage#getSdConnector()
 * @model
 * @generated
 */
public interface SdConnector extends SdGeneratable {
	/**
	 * Returns the value of the '<em><b>To Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Element</em>' reference.
	 * @see #setToElement(SdAbstractVariable)
	 * @see org.eclipse.amp.amf.sd.SdPackage#getSdConnector_ToElement()
	 * @model required="true"
	 * @generated
	 */
	SdAbstractVariable getToElement();

	/**
	 * Sets the value of the '{@link org.eclipse.amp.amf.sd.SdConnector#getToElement <em>To Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Element</em>' reference.
	 * @see #getToElement()
	 * @generated
	 */
	void setToElement(SdAbstractVariable value);

} // SdConnector
