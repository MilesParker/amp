/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.amp.amf.parameters.aPar.impl;

import java.util.Collection;

import org.eclipse.amp.amf.parameters.aPar.AParPackage;
import org.eclipse.amp.amf.parameters.aPar.AgentParameters;
import org.eclipse.amp.amf.parameters.aPar.Parameter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.metaabm.SAgent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agent Parameters</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.amp.amf.parameters.aPar.impl.AgentParametersImpl#getAgent <em>Agent</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.parameters.aPar.impl.AgentParametersImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AgentParametersImpl extends MinimalEObjectImpl.Container implements AgentParameters
{
  /**
     * The cached value of the '{@link #getAgent() <em>Agent</em>}' reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @see #getAgent()
     * @generated
     * @ordered
     */
  protected SAgent agent;

  /**
     * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @see #getParameters()
     * @generated
     * @ordered
     */
  protected EList<Parameter> parameters;

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  protected AgentParametersImpl()
  {
        super();
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  @Override
  protected EClass eStaticClass()
  {
        return AParPackage.Literals.AGENT_PARAMETERS;
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public SAgent getAgent()
  {
        if (agent != null && agent.eIsProxy()) {
            InternalEObject oldAgent = (InternalEObject)agent;
            agent = (SAgent)eResolveProxy(oldAgent);
            if (agent != oldAgent) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, AParPackage.AGENT_PARAMETERS__AGENT, oldAgent, agent));
            }
        }
        return agent;
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public SAgent basicGetAgent()
  {
        return agent;
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public void setAgent(SAgent newAgent)
  {
        SAgent oldAgent = agent;
        agent = newAgent;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AParPackage.AGENT_PARAMETERS__AGENT, oldAgent, agent));
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public EList<Parameter> getParameters()
  {
        if (parameters == null) {
            parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, AParPackage.AGENT_PARAMETERS__PARAMETERS);
        }
        return parameters;
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
        switch (featureID) {
            case AParPackage.AGENT_PARAMETERS__PARAMETERS:
                return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
        switch (featureID) {
            case AParPackage.AGENT_PARAMETERS__AGENT:
                if (resolve) return getAgent();
                return basicGetAgent();
            case AParPackage.AGENT_PARAMETERS__PARAMETERS:
                return getParameters();
        }
        return super.eGet(featureID, resolve, coreType);
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
        switch (featureID) {
            case AParPackage.AGENT_PARAMETERS__AGENT:
                setAgent((SAgent)newValue);
                return;
            case AParPackage.AGENT_PARAMETERS__PARAMETERS:
                getParameters().clear();
                getParameters().addAll((Collection<? extends Parameter>)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  @Override
  public void eUnset(int featureID)
  {
        switch (featureID) {
            case AParPackage.AGENT_PARAMETERS__AGENT:
                setAgent((SAgent)null);
                return;
            case AParPackage.AGENT_PARAMETERS__PARAMETERS:
                getParameters().clear();
                return;
        }
        super.eUnset(featureID);
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  @Override
  public boolean eIsSet(int featureID)
  {
        switch (featureID) {
            case AParPackage.AGENT_PARAMETERS__AGENT:
                return agent != null;
            case AParPackage.AGENT_PARAMETERS__PARAMETERS:
                return parameters != null && !parameters.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //AgentParametersImpl
