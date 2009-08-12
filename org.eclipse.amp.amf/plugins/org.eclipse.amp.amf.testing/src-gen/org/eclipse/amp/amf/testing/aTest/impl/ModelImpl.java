/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.amp.amf.testing.aTest.impl;

import java.util.Collection;

import org.eclipse.amp.amf.testing.aTest.ATestPackage;
import org.eclipse.amp.amf.testing.aTest.Constraint;
import org.eclipse.amp.amf.testing.aTest.Model;
import org.eclipse.amp.amf.testing.aTest.Tests;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.amp.amf.testing.aTest.impl.ModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.testing.aTest.impl.ModelImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.testing.aTest.impl.ModelImpl#getTests <em>Tests</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.testing.aTest.impl.ModelImpl#getContraints <em>Contraints</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getTests() <em>Tests</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTests()
   * @generated
   * @ordered
   */
  protected Tests tests;

  /**
   * The cached value of the '{@link #getContraints() <em>Contraints</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContraints()
   * @generated
   * @ordered
   */
  protected EList<Constraint> contraints;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return ATestPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ATestPackage.MODEL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ATestPackage.MODEL__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Tests getTests()
  {
    return tests;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTests(Tests newTests, NotificationChain msgs)
  {
    Tests oldTests = tests;
    tests = newTests;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ATestPackage.MODEL__TESTS, oldTests, newTests);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTests(Tests newTests)
  {
    if (newTests != tests)
    {
      NotificationChain msgs = null;
      if (tests != null)
        msgs = ((InternalEObject)tests).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ATestPackage.MODEL__TESTS, null, msgs);
      if (newTests != null)
        msgs = ((InternalEObject)newTests).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ATestPackage.MODEL__TESTS, null, msgs);
      msgs = basicSetTests(newTests, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ATestPackage.MODEL__TESTS, newTests, newTests));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Constraint> getContraints()
  {
    if (contraints == null)
    {
      contraints = new EObjectContainmentEList<Constraint>(Constraint.class, this, ATestPackage.MODEL__CONTRAINTS);
    }
    return contraints;
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
      case ATestPackage.MODEL__TESTS:
        return basicSetTests(null, msgs);
      case ATestPackage.MODEL__CONTRAINTS:
        return ((InternalEList<?>)getContraints()).basicRemove(otherEnd, msgs);
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
      case ATestPackage.MODEL__NAME:
        return getName();
      case ATestPackage.MODEL__DESCRIPTION:
        return getDescription();
      case ATestPackage.MODEL__TESTS:
        return getTests();
      case ATestPackage.MODEL__CONTRAINTS:
        return getContraints();
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
    switch (featureID)
    {
      case ATestPackage.MODEL__NAME:
        setName((String)newValue);
        return;
      case ATestPackage.MODEL__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case ATestPackage.MODEL__TESTS:
        setTests((Tests)newValue);
        return;
      case ATestPackage.MODEL__CONTRAINTS:
        getContraints().clear();
        getContraints().addAll((Collection<? extends Constraint>)newValue);
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
      case ATestPackage.MODEL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ATestPackage.MODEL__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case ATestPackage.MODEL__TESTS:
        setTests((Tests)null);
        return;
      case ATestPackage.MODEL__CONTRAINTS:
        getContraints().clear();
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
      case ATestPackage.MODEL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ATestPackage.MODEL__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case ATestPackage.MODEL__TESTS:
        return tests != null;
      case ATestPackage.MODEL__CONTRAINTS:
        return contraints != null && !contraints.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(", description: ");
    result.append(description);
    result.append(')');
    return result.toString();
  }

} //ModelImpl
