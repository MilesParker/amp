/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.amp.amf.parameters.aPar;

import org.eclipse.amp.amf.abase.aBase.Value;

import org.metaabm.SAttribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sweep Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amp.amf.parameters.aPar.SweepParameter#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.parameters.aPar.SweepParameter#getStartValue <em>Start Value</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.parameters.aPar.SweepParameter#getEndValue <em>End Value</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.parameters.aPar.SweepParameter#getIncrement <em>Increment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amp.amf.parameters.aPar.AParPackage#getSweepParameter()
 * @model
 * @generated
 */
public interface SweepParameter extends Parameter
{
  /**
   * Returns the value of the '<em><b>Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute</em>' reference.
   * @see #setAttribute(SAttribute)
   * @see org.eclipse.amp.amf.parameters.aPar.AParPackage#getSweepParameter_Attribute()
   * @model
   * @generated
   */
  SAttribute getAttribute();

  /**
   * Sets the value of the '{@link org.eclipse.amp.amf.parameters.aPar.SweepParameter#getAttribute <em>Attribute</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute</em>' reference.
   * @see #getAttribute()
   * @generated
   */
  void setAttribute(SAttribute value);

  /**
   * Returns the value of the '<em><b>Start Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Start Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Start Value</em>' containment reference.
   * @see #setStartValue(Value)
   * @see org.eclipse.amp.amf.parameters.aPar.AParPackage#getSweepParameter_StartValue()
   * @model containment="true"
   * @generated
   */
  Value getStartValue();

  /**
   * Sets the value of the '{@link org.eclipse.amp.amf.parameters.aPar.SweepParameter#getStartValue <em>Start Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Start Value</em>' containment reference.
   * @see #getStartValue()
   * @generated
   */
  void setStartValue(Value value);

  /**
   * Returns the value of the '<em><b>End Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End Value</em>' containment reference.
   * @see #setEndValue(Value)
   * @see org.eclipse.amp.amf.parameters.aPar.AParPackage#getSweepParameter_EndValue()
   * @model containment="true"
   * @generated
   */
  Value getEndValue();

  /**
   * Sets the value of the '{@link org.eclipse.amp.amf.parameters.aPar.SweepParameter#getEndValue <em>End Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End Value</em>' containment reference.
   * @see #getEndValue()
   * @generated
   */
  void setEndValue(Value value);

  /**
   * Returns the value of the '<em><b>Increment</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Increment</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Increment</em>' containment reference.
   * @see #setIncrement(Value)
   * @see org.eclipse.amp.amf.parameters.aPar.AParPackage#getSweepParameter_Increment()
   * @model containment="true"
   * @generated
   */
  Value getIncrement();

  /**
   * Sets the value of the '{@link org.eclipse.amp.amf.parameters.aPar.SweepParameter#getIncrement <em>Increment</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Increment</em>' containment reference.
   * @see #getIncrement()
   * @generated
   */
  void setIncrement(Value value);

} // SweepParameter
