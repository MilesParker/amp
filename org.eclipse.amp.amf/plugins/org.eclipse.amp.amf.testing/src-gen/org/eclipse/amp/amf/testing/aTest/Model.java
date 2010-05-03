/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.amp.amf.testing.aTest;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amp.amf.testing.aTest.Model#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.testing.aTest.Model#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.testing.aTest.Model#getTests <em>Tests</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.testing.aTest.Model#getContraints <em>Contraints</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.testing.aTest.Model#getContains <em>Contains</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amp.amf.testing.aTest.ATestPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.amp.amf.testing.aTest.ATestPackage#getModel_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.amp.amf.testing.aTest.Model#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see org.eclipse.amp.amf.testing.aTest.ATestPackage#getModel_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link org.eclipse.amp.amf.testing.aTest.Model#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Tests</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tests</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tests</em>' containment reference.
   * @see #setTests(Tests)
   * @see org.eclipse.amp.amf.testing.aTest.ATestPackage#getModel_Tests()
   * @model containment="true"
   * @generated
   */
  Tests getTests();

  /**
   * Sets the value of the '{@link org.eclipse.amp.amf.testing.aTest.Model#getTests <em>Tests</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tests</em>' containment reference.
   * @see #getTests()
   * @generated
   */
  void setTests(Tests value);

  /**
   * Returns the value of the '<em><b>Contraints</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.amp.amf.testing.aTest.Constraint}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contraints</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contraints</em>' containment reference list.
   * @see org.eclipse.amp.amf.testing.aTest.ATestPackage#getModel_Contraints()
   * @model containment="true"
   * @generated
   */
  EList<Constraint> getContraints();

  /**
   * Returns the value of the '<em><b>Contains</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.amp.amf.testing.aTest.TestMember}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contains</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contains</em>' containment reference list.
   * @see org.eclipse.amp.amf.testing.aTest.ATestPackage#getModel_Contains()
   * @model containment="true"
   * @generated
   */
  EList<TestMember> getContains();

} // Model
