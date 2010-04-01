/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.amp.amf.testing.aTest.impl;

import org.eclipse.amp.amf.abase.aBase.Value;

import org.eclipse.amp.amf.testing.aTest.ATestPackage;
import org.eclipse.amp.amf.testing.aTest.Constraint;
import org.eclipse.amp.amf.testing.aTest.Measure;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.metaabm.SAgent;
import org.metaabm.SAttribute;
import org.metaabm.SStateValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.amp.amf.testing.aTest.impl.ConstraintImpl#getMeasure <em>Measure</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.testing.aTest.impl.ConstraintImpl#getAgent <em>Agent</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.testing.aTest.impl.ConstraintImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.testing.aTest.impl.ConstraintImpl#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.testing.aTest.impl.ConstraintImpl#getMinValue <em>Min Value</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.testing.aTest.impl.ConstraintImpl#getMaxValue <em>Max Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstraintImpl extends MinimalEObjectImpl.Container implements Constraint
{
  /**
   * The default value of the '{@link #getMeasure() <em>Measure</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMeasure()
   * @generated
   * @ordered
   */
  protected static final Measure MEASURE_EDEFAULT = Measure.COUNT;

  /**
   * The cached value of the '{@link #getMeasure() <em>Measure</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMeasure()
   * @generated
   * @ordered
   */
  protected Measure measure = MEASURE_EDEFAULT;

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
   * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttribute()
   * @generated
   * @ordered
   */
  protected SAttribute attribute;

  /**
   * The cached value of the '{@link #getQualifier() <em>Qualifier</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQualifier()
   * @generated
   * @ordered
   */
  protected SStateValue qualifier;

  /**
   * The cached value of the '{@link #getMinValue() <em>Min Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinValue()
   * @generated
   * @ordered
   */
  protected Value minValue;

  /**
   * The cached value of the '{@link #getMaxValue() <em>Max Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxValue()
   * @generated
   * @ordered
   */
  protected Value maxValue;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConstraintImpl()
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
    return ATestPackage.Literals.CONSTRAINT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Measure getMeasure()
  {
    return measure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMeasure(Measure newMeasure)
  {
    Measure oldMeasure = measure;
    measure = newMeasure == null ? MEASURE_EDEFAULT : newMeasure;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ATestPackage.CONSTRAINT__MEASURE, oldMeasure, measure));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SAgent getAgent()
  {
    if (agent != null && agent.eIsProxy())
    {
      InternalEObject oldAgent = (InternalEObject)agent;
      agent = (SAgent)eResolveProxy(oldAgent);
      if (agent != oldAgent)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ATestPackage.CONSTRAINT__AGENT, oldAgent, agent));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ATestPackage.CONSTRAINT__AGENT, oldAgent, agent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SAttribute getAttribute()
  {
    if (attribute != null && attribute.eIsProxy())
    {
      InternalEObject oldAttribute = (InternalEObject)attribute;
      attribute = (SAttribute)eResolveProxy(oldAttribute);
      if (attribute != oldAttribute)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ATestPackage.CONSTRAINT__ATTRIBUTE, oldAttribute, attribute));
      }
    }
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SAttribute basicGetAttribute()
  {
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttribute(SAttribute newAttribute)
  {
    SAttribute oldAttribute = attribute;
    attribute = newAttribute;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ATestPackage.CONSTRAINT__ATTRIBUTE, oldAttribute, attribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SStateValue getQualifier()
  {
    if (qualifier != null && qualifier.eIsProxy())
    {
      InternalEObject oldQualifier = (InternalEObject)qualifier;
      qualifier = (SStateValue)eResolveProxy(oldQualifier);
      if (qualifier != oldQualifier)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ATestPackage.CONSTRAINT__QUALIFIER, oldQualifier, qualifier));
      }
    }
    return qualifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SStateValue basicGetQualifier()
  {
    return qualifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQualifier(SStateValue newQualifier)
  {
    SStateValue oldQualifier = qualifier;
    qualifier = newQualifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ATestPackage.CONSTRAINT__QUALIFIER, oldQualifier, qualifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value getMinValue()
  {
    return minValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMinValue(Value newMinValue, NotificationChain msgs)
  {
    Value oldMinValue = minValue;
    minValue = newMinValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ATestPackage.CONSTRAINT__MIN_VALUE, oldMinValue, newMinValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMinValue(Value newMinValue)
  {
    if (newMinValue != minValue)
    {
      NotificationChain msgs = null;
      if (minValue != null)
        msgs = ((InternalEObject)minValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ATestPackage.CONSTRAINT__MIN_VALUE, null, msgs);
      if (newMinValue != null)
        msgs = ((InternalEObject)newMinValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ATestPackage.CONSTRAINT__MIN_VALUE, null, msgs);
      msgs = basicSetMinValue(newMinValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ATestPackage.CONSTRAINT__MIN_VALUE, newMinValue, newMinValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value getMaxValue()
  {
    return maxValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMaxValue(Value newMaxValue, NotificationChain msgs)
  {
    Value oldMaxValue = maxValue;
    maxValue = newMaxValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ATestPackage.CONSTRAINT__MAX_VALUE, oldMaxValue, newMaxValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMaxValue(Value newMaxValue)
  {
    if (newMaxValue != maxValue)
    {
      NotificationChain msgs = null;
      if (maxValue != null)
        msgs = ((InternalEObject)maxValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ATestPackage.CONSTRAINT__MAX_VALUE, null, msgs);
      if (newMaxValue != null)
        msgs = ((InternalEObject)newMaxValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ATestPackage.CONSTRAINT__MAX_VALUE, null, msgs);
      msgs = basicSetMaxValue(newMaxValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ATestPackage.CONSTRAINT__MAX_VALUE, newMaxValue, newMaxValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ATestPackage.CONSTRAINT__MIN_VALUE:
        return basicSetMinValue(null, msgs);
      case ATestPackage.CONSTRAINT__MAX_VALUE:
        return basicSetMaxValue(null, msgs);
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
    switch (featureID)
    {
      case ATestPackage.CONSTRAINT__MEASURE:
        return getMeasure();
      case ATestPackage.CONSTRAINT__AGENT:
        if (resolve) return getAgent();
        return basicGetAgent();
      case ATestPackage.CONSTRAINT__ATTRIBUTE:
        if (resolve) return getAttribute();
        return basicGetAttribute();
      case ATestPackage.CONSTRAINT__QUALIFIER:
        if (resolve) return getQualifier();
        return basicGetQualifier();
      case ATestPackage.CONSTRAINT__MIN_VALUE:
        return getMinValue();
      case ATestPackage.CONSTRAINT__MAX_VALUE:
        return getMaxValue();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ATestPackage.CONSTRAINT__MEASURE:
        setMeasure((Measure)newValue);
        return;
      case ATestPackage.CONSTRAINT__AGENT:
        setAgent((SAgent)newValue);
        return;
      case ATestPackage.CONSTRAINT__ATTRIBUTE:
        setAttribute((SAttribute)newValue);
        return;
      case ATestPackage.CONSTRAINT__QUALIFIER:
        setQualifier((SStateValue)newValue);
        return;
      case ATestPackage.CONSTRAINT__MIN_VALUE:
        setMinValue((Value)newValue);
        return;
      case ATestPackage.CONSTRAINT__MAX_VALUE:
        setMaxValue((Value)newValue);
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
    switch (featureID)
    {
      case ATestPackage.CONSTRAINT__MEASURE:
        setMeasure(MEASURE_EDEFAULT);
        return;
      case ATestPackage.CONSTRAINT__AGENT:
        setAgent((SAgent)null);
        return;
      case ATestPackage.CONSTRAINT__ATTRIBUTE:
        setAttribute((SAttribute)null);
        return;
      case ATestPackage.CONSTRAINT__QUALIFIER:
        setQualifier((SStateValue)null);
        return;
      case ATestPackage.CONSTRAINT__MIN_VALUE:
        setMinValue((Value)null);
        return;
      case ATestPackage.CONSTRAINT__MAX_VALUE:
        setMaxValue((Value)null);
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
    switch (featureID)
    {
      case ATestPackage.CONSTRAINT__MEASURE:
        return measure != MEASURE_EDEFAULT;
      case ATestPackage.CONSTRAINT__AGENT:
        return agent != null;
      case ATestPackage.CONSTRAINT__ATTRIBUTE:
        return attribute != null;
      case ATestPackage.CONSTRAINT__QUALIFIER:
        return qualifier != null;
      case ATestPackage.CONSTRAINT__MIN_VALUE:
        return minValue != null;
      case ATestPackage.CONSTRAINT__MAX_VALUE:
        return maxValue != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (measure: ");
    result.append(measure);
    result.append(')');
    return result.toString();
  }

} //ConstraintImpl
