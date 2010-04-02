/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.amp.amf.parameters.aPar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.metaabm.SAgent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agent Parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amp.amf.parameters.aPar.AgentParameters#getAgent <em>Agent</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.parameters.aPar.AgentParameters#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amp.amf.parameters.aPar.AParPackage#getAgentParameters()
 * @model
 * @generated
 */
public interface AgentParameters extends EObject
{
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
   * @see org.eclipse.amp.amf.parameters.aPar.AParPackage#getAgentParameters_Agent()
   * @model
   * @generated
   */
  SAgent getAgent();

  /**
   * Sets the value of the '{@link org.eclipse.amp.amf.parameters.aPar.AgentParameters#getAgent <em>Agent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Agent</em>' reference.
   * @see #getAgent()
   * @generated
   */
  void setAgent(SAgent value);

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
   * @see org.eclipse.amp.amf.parameters.aPar.AParPackage#getAgentParameters_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<Parameter> getParameters();

} // AgentParameters
