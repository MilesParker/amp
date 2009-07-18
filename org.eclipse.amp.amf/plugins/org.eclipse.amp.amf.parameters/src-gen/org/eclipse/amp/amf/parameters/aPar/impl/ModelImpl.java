/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.amp.amf.parameters.aPar.impl;

import java.util.Collection;

import org.eclipse.amp.amf.parameters.aPar.AParPackage;
import org.eclipse.amp.amf.parameters.aPar.Import;
import org.eclipse.amp.amf.parameters.aPar.Model;
import org.eclipse.amp.amf.parameters.aPar.Parameter;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

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
 *   <li>{@link org.eclipse.amp.amf.parameters.aPar.impl.ModelImpl#getModel <em>Model</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.parameters.aPar.impl.ModelImpl#getIncorporates <em>Incorporates</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.parameters.aPar.impl.ModelImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getModel() <em>Model</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModel()
   * @generated
   * @ordered
   */
  protected EList<Import> model;

  /**
   * The cached value of the '{@link #getIncorporates() <em>Incorporates</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncorporates()
   * @generated
   * @ordered
   */
  protected EList<Import> incorporates;

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
    return AParPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Import> getModel()
  {
    if (model == null)
    {
      model = new EObjectContainmentEList<Import>(Import.class, this, AParPackage.MODEL__MODEL);
    }
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Import> getIncorporates()
  {
    if (incorporates == null)
    {
      incorporates = new EObjectContainmentEList<Import>(Import.class, this, AParPackage.MODEL__INCORPORATES);
    }
    return incorporates;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Parameter> getParameters()
  {
    if (parameters == null)
    {
      parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, AParPackage.MODEL__PARAMETERS);
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
    switch (featureID)
    {
      case AParPackage.MODEL__MODEL:
        return ((InternalEList<?>)getModel()).basicRemove(otherEnd, msgs);
      case AParPackage.MODEL__INCORPORATES:
        return ((InternalEList<?>)getIncorporates()).basicRemove(otherEnd, msgs);
      case AParPackage.MODEL__PARAMETERS:
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
    switch (featureID)
    {
      case AParPackage.MODEL__MODEL:
        return getModel();
      case AParPackage.MODEL__INCORPORATES:
        return getIncorporates();
      case AParPackage.MODEL__PARAMETERS:
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
    switch (featureID)
    {
      case AParPackage.MODEL__MODEL:
        getModel().clear();
        getModel().addAll((Collection<? extends Import>)newValue);
        return;
      case AParPackage.MODEL__INCORPORATES:
        getIncorporates().clear();
        getIncorporates().addAll((Collection<? extends Import>)newValue);
        return;
      case AParPackage.MODEL__PARAMETERS:
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
    switch (featureID)
    {
      case AParPackage.MODEL__MODEL:
        getModel().clear();
        return;
      case AParPackage.MODEL__INCORPORATES:
        getIncorporates().clear();
        return;
      case AParPackage.MODEL__PARAMETERS:
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
    switch (featureID)
    {
      case AParPackage.MODEL__MODEL:
        return model != null && !model.isEmpty();
      case AParPackage.MODEL__INCORPORATES:
        return incorporates != null && !incorporates.isEmpty();
      case AParPackage.MODEL__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
