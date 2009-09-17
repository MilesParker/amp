/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.amp.amf.testing.aTest;

import org.eclipse.amp.amf.abase.aBase.Value;

import org.eclipse.emf.ecore.EObject;

import org.metaabm.SAgent;
import org.metaabm.SAttribute;
import org.metaabm.SStateValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amp.amf.testing.aTest.Constraint#getMeasure <em>Measure</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.testing.aTest.Constraint#getAgent <em>Agent</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.testing.aTest.Constraint#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.testing.aTest.Constraint#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.testing.aTest.Constraint#getMinValue <em>Min Value</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.testing.aTest.Constraint#getMaxValue <em>Max Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amp.amf.testing.aTest.ATestPackage#getConstraint()
 * @model
 * @generated
 */
public interface Constraint extends EObject
{
  /**
   * Returns the value of the '<em><b>Measure</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipse.amp.amf.testing.aTest.Measure}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Measure</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Measure</em>' attribute.
   * @see org.eclipse.amp.amf.testing.aTest.Measure
   * @see #setMeasure(Measure)
   * @see org.eclipse.amp.amf.testing.aTest.ATestPackage#getConstraint_Measure()
   * @model
   * @generated
   */
  Measure getMeasure();

  /**
   * Sets the value of the '{@link org.eclipse.amp.amf.testing.aTest.Constraint#getMeasure <em>Measure</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Measure</em>' attribute.
   * @see org.eclipse.amp.amf.testing.aTest.Measure
   * @see #getMeasure()
   * @generated
   */
  void setMeasure(Measure value);

  /**
   * Returns the value of the '<em><b>Agent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Agent</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Agent</em>' reference.
   * @see #setAgent(SAgent)
   * @see org.eclipse.amp.amf.testing.aTest.ATestPackage#getConstraint_Agent()
   * @model
   * @generated
   */
  SAgent getAgent();

  /**
   * Sets the value of the '{@link org.eclipse.amp.amf.testing.aTest.Constraint#getAgent <em>Agent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Agent</em>' reference.
   * @see #getAgent()
   * @generated
   */
  void setAgent(SAgent value);

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
   * @see org.eclipse.amp.amf.testing.aTest.ATestPackage#getConstraint_Attribute()
   * @model
   * @generated
   */
  SAttribute getAttribute();

  /**
   * Sets the value of the '{@link org.eclipse.amp.amf.testing.aTest.Constraint#getAttribute <em>Attribute</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute</em>' reference.
   * @see #getAttribute()
   * @generated
   */
  void setAttribute(SAttribute value);

  /**
   * Returns the value of the '<em><b>Qualifier</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Qualifier</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Qualifier</em>' reference.
   * @see #setQualifier(SStateValue)
   * @see org.eclipse.amp.amf.testing.aTest.ATestPackage#getConstraint_Qualifier()
   * @model
   * @generated
   */
  SStateValue getQualifier();

  /**
   * Sets the value of the '{@link org.eclipse.amp.amf.testing.aTest.Constraint#getQualifier <em>Qualifier</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Qualifier</em>' reference.
   * @see #getQualifier()
   * @generated
   */
  void setQualifier(SStateValue value);

  /**
   * Returns the value of the '<em><b>Min Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Min Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Min Value</em>' containment reference.
   * @see #setMinValue(Value)
   * @see org.eclipse.amp.amf.testing.aTest.ATestPackage#getConstraint_MinValue()
   * @model containment="true"
   * @generated
   */
  Value getMinValue();

  /**
   * Sets the value of the '{@link org.eclipse.amp.amf.testing.aTest.Constraint#getMinValue <em>Min Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Min Value</em>' containment reference.
   * @see #getMinValue()
   * @generated
   */
  void setMinValue(Value value);

  /**
   * Returns the value of the '<em><b>Max Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Max Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Max Value</em>' containment reference.
   * @see #setMaxValue(Value)
   * @see org.eclipse.amp.amf.testing.aTest.ATestPackage#getConstraint_MaxValue()
   * @model containment="true"
   * @generated
   */
  Value getMaxValue();

  /**
   * Sets the value of the '{@link org.eclipse.amp.amf.testing.aTest.Constraint#getMaxValue <em>Max Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max Value</em>' containment reference.
   * @see #getMaxValue()
   * @generated
   */
  void setMaxValue(Value value);

} // Constraint
