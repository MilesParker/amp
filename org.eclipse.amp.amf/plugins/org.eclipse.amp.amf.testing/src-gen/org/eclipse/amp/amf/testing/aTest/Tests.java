/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.amp.amf.testing.aTest;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tests</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amp.amf.testing.aTest.Tests#getImportURI <em>Import URI</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amp.amf.testing.aTest.ATestPackage#getTests()
 * @model
 * @generated
 */
public interface Tests extends EObject
{
  /**
   * Returns the value of the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Import URI</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Import URI</em>' attribute.
   * @see #setImportURI(String)
   * @see org.eclipse.amp.amf.testing.aTest.ATestPackage#getTests_ImportURI()
   * @model
   * @generated
   */
  String getImportURI();

  /**
   * Sets the value of the '{@link org.eclipse.amp.amf.testing.aTest.Tests#getImportURI <em>Import URI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Import URI</em>' attribute.
   * @see #getImportURI()
   * @generated
   */
  void setImportURI(String value);

} // Tests
