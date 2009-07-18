/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.amp.amf.parameters.aPar;

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
 *   <li>{@link org.eclipse.amp.amf.parameters.aPar.Model#getModel <em>Model</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.parameters.aPar.Model#getIncorporates <em>Incorporates</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.parameters.aPar.Model#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amp.amf.parameters.aPar.AParPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Model</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.amp.amf.parameters.aPar.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Model</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Model</em>' containment reference list.
   * @see org.eclipse.amp.amf.parameters.aPar.AParPackage#getModel_Model()
   * @model containment="true"
   * @generated
   */
  EList<Import> getModel();

  /**
   * Returns the value of the '<em><b>Incorporates</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.amp.amf.parameters.aPar.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Incorporates</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Incorporates</em>' containment reference list.
   * @see org.eclipse.amp.amf.parameters.aPar.AParPackage#getModel_Incorporates()
   * @model containment="true"
   * @generated
   */
  EList<Import> getIncorporates();

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.amp.amf.parameters.aPar.Parameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see org.eclipse.amp.amf.parameters.aPar.AParPackage#getModel_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<Parameter> getParameters();

} // Model
