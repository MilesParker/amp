/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.amp.amf.testing.aTest;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.amp.amf.testing.aTest.ATestPackage
 * @generated
 */
public interface ATestFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ATestFactory eINSTANCE = org.eclipse.amp.amf.testing.aTest.impl.ATestFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Tests</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tests</em>'.
   * @generated
   */
  Tests createTests();

  /**
   * Returns a new object of class '<em>Test Member</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Test Member</em>'.
   * @generated
   */
  TestMember createTestMember();

  /**
   * Returns a new object of class '<em>Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constraint</em>'.
   * @generated
   */
  Constraint createConstraint();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ATestPackage getATestPackage();

} //ATestFactory
