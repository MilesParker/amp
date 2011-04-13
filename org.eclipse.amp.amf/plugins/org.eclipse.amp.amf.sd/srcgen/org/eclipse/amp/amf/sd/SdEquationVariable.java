/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.amp.amf.sd;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equation Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amp.amf.sd.SdEquationVariable#getEquation <em>Equation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amp.amf.sd.SdPackage#getSdEquationVariable()
 * @model abstract="true"
 * @generated
 */
public interface SdEquationVariable extends SdAbstractVariable {
	/**
	 * Returns the value of the '<em><b>Equation</b></em>' attribute.
	 * The default value is <code>"return 0;"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equation</em>' attribute.
	 * @see #setEquation(String)
	 * @see org.eclipse.amp.amf.sd.SdPackage#getSdEquationVariable_Equation()
	 * @model default="return 0;" required="true"
	 * @generated
	 */
	String getEquation();

	/**
	 * Sets the value of the '{@link org.eclipse.amp.amf.sd.SdEquationVariable#getEquation <em>Equation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Equation</em>' attribute.
	 * @see #getEquation()
	 * @generated
	 */
	void setEquation(String value);

} // SdEquationVariable
