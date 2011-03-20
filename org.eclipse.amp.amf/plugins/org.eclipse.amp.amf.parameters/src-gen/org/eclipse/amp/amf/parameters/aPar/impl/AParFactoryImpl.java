/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.amp.amf.parameters.aPar.impl;

import org.eclipse.amp.amf.parameters.aPar.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AParFactoryImpl extends EFactoryImpl implements AParFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AParFactory init()
  {
    try
    {
      AParFactory theAParFactory = (AParFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/amp/amf/parameters/APar"); 
      if (theAParFactory != null)
      {
        return theAParFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new AParFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AParFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case AParPackage.MODEL: return createModel();
      case AParPackage.IMPORT: return createImport();
      case AParPackage.INCORPORATES: return createIncorporates();
      case AParPackage.PARAMETER: return createParameter();
      case AParPackage.SINGLE_PARAMETER: return createSingleParameter();
      case AParPackage.SWEEP_PARAMETER: return createSweepParameter();
      case AParPackage.SWEEP_LINK: return createSweepLink();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Incorporates createIncorporates()
  {
    IncorporatesImpl incorporates = new IncorporatesImpl();
    return incorporates;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SingleParameter createSingleParameter()
  {
    SingleParameterImpl singleParameter = new SingleParameterImpl();
    return singleParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SweepParameter createSweepParameter()
  {
    SweepParameterImpl sweepParameter = new SweepParameterImpl();
    return sweepParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SweepLink createSweepLink()
  {
    SweepLinkImpl sweepLink = new SweepLinkImpl();
    return sweepLink;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AParPackage getAParPackage()
  {
    return (AParPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static AParPackage getPackage()
  {
    return AParPackage.eINSTANCE;
  }

} //AParFactoryImpl
