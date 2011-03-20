/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.amp.amf.parameters.aPar.impl;

import org.eclipse.amp.amf.abase.aBase.Value;

import org.eclipse.amp.amf.parameters.aPar.AParPackage;
import org.eclipse.amp.amf.parameters.aPar.SweepParameter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.metaabm.SAttribute;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sweep Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.amp.amf.parameters.aPar.impl.SweepParameterImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.parameters.aPar.impl.SweepParameterImpl#getStartValue <em>Start Value</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.parameters.aPar.impl.SweepParameterImpl#getEndValue <em>End Value</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.parameters.aPar.impl.SweepParameterImpl#getIncrement <em>Increment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SweepParameterImpl extends ParameterImpl implements SweepParameter
{
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
   * The cached value of the '{@link #getStartValue() <em>Start Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStartValue()
   * @generated
   * @ordered
   */
  protected Value startValue;

  /**
   * The cached value of the '{@link #getEndValue() <em>End Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndValue()
   * @generated
   * @ordered
   */
  protected Value endValue;

  /**
   * The cached value of the '{@link #getIncrement() <em>Increment</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncrement()
   * @generated
   * @ordered
   */
  protected Value increment;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SweepParameterImpl()
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
    return AParPackage.Literals.SWEEP_PARAMETER;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AParPackage.SWEEP_PARAMETER__ATTRIBUTE, oldAttribute, attribute));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AParPackage.SWEEP_PARAMETER__ATTRIBUTE, oldAttribute, attribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value getStartValue()
  {
    return startValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStartValue(Value newStartValue, NotificationChain msgs)
  {
    Value oldStartValue = startValue;
    startValue = newStartValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AParPackage.SWEEP_PARAMETER__START_VALUE, oldStartValue, newStartValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStartValue(Value newStartValue)
  {
    if (newStartValue != startValue)
    {
      NotificationChain msgs = null;
      if (startValue != null)
        msgs = ((InternalEObject)startValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AParPackage.SWEEP_PARAMETER__START_VALUE, null, msgs);
      if (newStartValue != null)
        msgs = ((InternalEObject)newStartValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AParPackage.SWEEP_PARAMETER__START_VALUE, null, msgs);
      msgs = basicSetStartValue(newStartValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AParPackage.SWEEP_PARAMETER__START_VALUE, newStartValue, newStartValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value getEndValue()
  {
    return endValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEndValue(Value newEndValue, NotificationChain msgs)
  {
    Value oldEndValue = endValue;
    endValue = newEndValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AParPackage.SWEEP_PARAMETER__END_VALUE, oldEndValue, newEndValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEndValue(Value newEndValue)
  {
    if (newEndValue != endValue)
    {
      NotificationChain msgs = null;
      if (endValue != null)
        msgs = ((InternalEObject)endValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AParPackage.SWEEP_PARAMETER__END_VALUE, null, msgs);
      if (newEndValue != null)
        msgs = ((InternalEObject)newEndValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AParPackage.SWEEP_PARAMETER__END_VALUE, null, msgs);
      msgs = basicSetEndValue(newEndValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AParPackage.SWEEP_PARAMETER__END_VALUE, newEndValue, newEndValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value getIncrement()
  {
    return increment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIncrement(Value newIncrement, NotificationChain msgs)
  {
    Value oldIncrement = increment;
    increment = newIncrement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AParPackage.SWEEP_PARAMETER__INCREMENT, oldIncrement, newIncrement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIncrement(Value newIncrement)
  {
    if (newIncrement != increment)
    {
      NotificationChain msgs = null;
      if (increment != null)
        msgs = ((InternalEObject)increment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AParPackage.SWEEP_PARAMETER__INCREMENT, null, msgs);
      if (newIncrement != null)
        msgs = ((InternalEObject)newIncrement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AParPackage.SWEEP_PARAMETER__INCREMENT, null, msgs);
      msgs = basicSetIncrement(newIncrement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AParPackage.SWEEP_PARAMETER__INCREMENT, newIncrement, newIncrement));
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
      case AParPackage.SWEEP_PARAMETER__START_VALUE:
        return basicSetStartValue(null, msgs);
      case AParPackage.SWEEP_PARAMETER__END_VALUE:
        return basicSetEndValue(null, msgs);
      case AParPackage.SWEEP_PARAMETER__INCREMENT:
        return basicSetIncrement(null, msgs);
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
      case AParPackage.SWEEP_PARAMETER__ATTRIBUTE:
        if (resolve) return getAttribute();
        return basicGetAttribute();
      case AParPackage.SWEEP_PARAMETER__START_VALUE:
        return getStartValue();
      case AParPackage.SWEEP_PARAMETER__END_VALUE:
        return getEndValue();
      case AParPackage.SWEEP_PARAMETER__INCREMENT:
        return getIncrement();
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
      case AParPackage.SWEEP_PARAMETER__ATTRIBUTE:
        setAttribute((SAttribute)newValue);
        return;
      case AParPackage.SWEEP_PARAMETER__START_VALUE:
        setStartValue((Value)newValue);
        return;
      case AParPackage.SWEEP_PARAMETER__END_VALUE:
        setEndValue((Value)newValue);
        return;
      case AParPackage.SWEEP_PARAMETER__INCREMENT:
        setIncrement((Value)newValue);
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
      case AParPackage.SWEEP_PARAMETER__ATTRIBUTE:
        setAttribute((SAttribute)null);
        return;
      case AParPackage.SWEEP_PARAMETER__START_VALUE:
        setStartValue((Value)null);
        return;
      case AParPackage.SWEEP_PARAMETER__END_VALUE:
        setEndValue((Value)null);
        return;
      case AParPackage.SWEEP_PARAMETER__INCREMENT:
        setIncrement((Value)null);
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
      case AParPackage.SWEEP_PARAMETER__ATTRIBUTE:
        return attribute != null;
      case AParPackage.SWEEP_PARAMETER__START_VALUE:
        return startValue != null;
      case AParPackage.SWEEP_PARAMETER__END_VALUE:
        return endValue != null;
      case AParPackage.SWEEP_PARAMETER__INCREMENT:
        return increment != null;
    }
    return super.eIsSet(featureID);
  }

} //SweepParameterImpl
