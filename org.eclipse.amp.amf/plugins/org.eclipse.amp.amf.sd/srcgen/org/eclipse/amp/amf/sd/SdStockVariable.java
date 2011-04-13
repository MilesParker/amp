/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.amp.amf.sd;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stock Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amp.amf.sd.SdStockVariable#getIntegral <em>Integral</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.sd.SdStockVariable#getInitialValue <em>Initial Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amp.amf.sd.SdPackage#getSdStockVariable()
 * @model
 * @generated
 */
public interface SdStockVariable extends SdAbstractVariable {
	/**
	 * Returns the value of the '<em><b>Integral</b></em>' attribute.
	 * The default value is <code>"return 0;"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integral</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integral</em>' attribute.
	 * @see #setIntegral(String)
	 * @see org.eclipse.amp.amf.sd.SdPackage#getSdStockVariable_Integral()
	 * @model default="return 0;" required="true"
	 * @generated
	 */
	String getIntegral();

	/**
	 * Sets the value of the '{@link org.eclipse.amp.amf.sd.SdStockVariable#getIntegral <em>Integral</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integral</em>' attribute.
	 * @see #getIntegral()
	 * @generated
	 */
	void setIntegral(String value);

	/**
	 * Returns the value of the '<em><b>Initial Value</b></em>' attribute.
	 * The default value is <code>"return 0;"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Value</em>' attribute.
	 * @see #setInitialValue(String)
	 * @see org.eclipse.amp.amf.sd.SdPackage#getSdStockVariable_InitialValue()
	 * @model default="return 0;" required="true"
	 * @generated
	 */
	String getInitialValue();

	/**
	 * Sets the value of the '{@link org.eclipse.amp.amf.sd.SdStockVariable#getInitialValue <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Value</em>' attribute.
	 * @see #getInitialValue()
	 * @generated
	 */
	void setInitialValue(String value);

} // SdStockVariable
