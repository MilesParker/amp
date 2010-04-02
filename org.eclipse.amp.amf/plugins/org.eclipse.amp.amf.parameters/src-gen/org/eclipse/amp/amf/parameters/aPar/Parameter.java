/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.amp.amf.parameters.aPar;

import org.eclipse.amp.amf.abase.aBase.Value;

import org.eclipse.emf.ecore.EObject;

import org.metaabm.SAttribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amp.amf.parameters.aPar.Parameter#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.parameters.aPar.Parameter#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amp.amf.parameters.aPar.AParPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends EObject
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
     * @see org.eclipse.amp.amf.parameters.aPar.AParPackage#getParameter_Attribute()
     * @model
     * @generated
     */
  SAttribute getAttribute();

  /**
     * Sets the value of the '{@link org.eclipse.amp.amf.parameters.aPar.Parameter#getAttribute <em>Attribute</em>}' reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @param value the new value of the '<em>Attribute</em>' reference.
     * @see #getAttribute()
     * @generated
     */
  void setAttribute(SAttribute value);

  /**
     * Returns the value of the '<em><b>Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' containment reference.
     * @see #setValue(Value)
     * @see org.eclipse.amp.amf.parameters.aPar.AParPackage#getParameter_Value()
     * @model containment="true"
     * @generated
     */
  Value getValue();

  /**
     * Sets the value of the '{@link org.eclipse.amp.amf.parameters.aPar.Parameter#getValue <em>Value</em>}' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' containment reference.
     * @see #getValue()
     * @generated
     */
  void setValue(Value value);

} // Parameter
