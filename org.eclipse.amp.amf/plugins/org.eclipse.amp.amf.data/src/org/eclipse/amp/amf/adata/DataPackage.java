/**
 * <copyright>
 * </copyright>
 *
 * $Id: DataPackage.java,v 1.5 2010/08/04 01:54:19 mparker Exp $
 */
package org.eclipse.amp.amf.adata;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.amp.amf.adata.DataFactory
 * @model kind="package"
 * @generated
 */
public interface DataPackage extends EPackage {
    /**
	 * The package name.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    String eNAME = "adata";

    /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    String eNS_URI = "http://eclipse.org/amp/amf/AData";

    /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    String eNS_PREFIX = "adata";

    /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    DataPackage eINSTANCE = org.eclipse.amp.amf.adata.impl.DataPackageImpl.init();

    /**
	 * The meta object id for the '{@link org.eclipse.amp.amf.adata.impl.RunImpl <em>Run</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see org.eclipse.amp.amf.adata.impl.RunImpl
	 * @see org.eclipse.amp.amf.adata.impl.DataPackageImpl#getRun()
	 * @generated
	 */
    int RUN = 0;

    /**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RUN__MODEL = 0;

    /**
	 * The feature id for the '<em><b>Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RUN__STARTED = 1;

    /**
	 * The feature id for the '<em><b>Finished</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RUN__FINISHED = 2;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RUN__NAME = 3;

    /**
	 * The feature id for the '<em><b>Parameter Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RUN__PARAMETER_SETS = 4;

    /**
	 * The feature id for the '<em><b>Measurements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RUN__MEASUREMENTS = 5;

    /**
	 * The number of structural features of the '<em>Run</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RUN_FEATURE_COUNT = 6;

    /**
	 * The meta object id for the '{@link org.eclipse.amp.amf.adata.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see org.eclipse.amp.amf.adata.impl.ParameterImpl
	 * @see org.eclipse.amp.amf.adata.impl.DataPackageImpl#getParameter()
	 * @generated
	 */
    int PARAMETER = 1;

    /**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PARAMETER__VALUE = 0;

    /**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PARAMETER__ATTRIBUTE = 1;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PARAMETER__NAME = 2;

    /**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PARAMETER_FEATURE_COUNT = 3;

    /**
	 * The meta object id for the '{@link org.eclipse.amp.amf.adata.impl.DataPointImpl <em>Point</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see org.eclipse.amp.amf.adata.impl.DataPointImpl
	 * @see org.eclipse.amp.amf.adata.impl.DataPackageImpl#getDataPoint()
	 * @generated
	 */
    int DATA_POINT = 2;

    /**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DATA_POINT__PERIOD = 0;

    /**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DATA_POINT__VALUE = 1;

    /**
	 * The feature id for the '<em><b>Measurement</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_POINT__MEASUREMENT = 2;

				/**
	 * The number of structural features of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DATA_POINT_FEATURE_COUNT = 3;

    /**
	 * The meta object id for the '{@link org.eclipse.amp.amf.adata.impl.CatalogImpl <em>Catalog</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see org.eclipse.amp.amf.adata.impl.CatalogImpl
	 * @see org.eclipse.amp.amf.adata.impl.DataPackageImpl#getCatalog()
	 * @generated
	 */
    int CATALOG = 3;

    /**
	 * The feature id for the '<em><b>Runs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CATALOG__RUNS = 0;

    /**
	 * The number of structural features of the '<em>Catalog</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CATALOG_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link org.eclipse.amp.amf.adata.impl.MeasurementImpl <em>Measurement</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see org.eclipse.amp.amf.adata.impl.MeasurementImpl
	 * @see org.eclipse.amp.amf.adata.impl.DataPackageImpl#getMeasurement()
	 * @generated
	 */
    int MEASUREMENT = 4;

    /**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MEASUREMENT__TYPE = 0;

    /**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MEASUREMENT__VALUE = 1;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MEASUREMENT__NAME = 2;

    /**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MEASUREMENT__ENTRIES = 3;

    /**
	 * The feature id for the '<em><b>Run</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__RUN = 4;

				/**
	 * The number of structural features of the '<em>Measurement</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MEASUREMENT_FEATURE_COUNT = 5;

    /**
	 * The meta object id for the '{@link org.eclipse.amp.amf.adata.impl.ParameterSetImpl <em>Parameter Set</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see org.eclipse.amp.amf.adata.impl.ParameterSetImpl
	 * @see org.eclipse.amp.amf.adata.impl.DataPackageImpl#getParameterSet()
	 * @generated
	 */
    int PARAMETER_SET = 5;

    /**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PARAMETER_SET__MEMBERS = 0;

    /**
	 * The number of structural features of the '<em>Parameter Set</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PARAMETER_SET_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link org.eclipse.amp.amf.adata.ScaleType <em>Scale Type</em>}' enum.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see org.eclipse.amp.amf.adata.ScaleType
	 * @see org.eclipse.amp.amf.adata.impl.DataPackageImpl#getScaleType()
	 * @generated
	 */
    int SCALE_TYPE = 6;


    /**
	 * Returns the meta object for class '{@link org.eclipse.amp.amf.adata.Run <em>Run</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Run</em>'.
	 * @see org.eclipse.amp.amf.adata.Run
	 * @generated
	 */
    EClass getRun();

    /**
	 * Returns the meta object for the reference '{@link org.eclipse.amp.amf.adata.Run#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see org.eclipse.amp.amf.adata.Run#getModel()
	 * @see #getRun()
	 * @generated
	 */
    EReference getRun_Model();

    /**
	 * Returns the meta object for the attribute '{@link org.eclipse.amp.amf.adata.Run#getStarted <em>Started</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Started</em>'.
	 * @see org.eclipse.amp.amf.adata.Run#getStarted()
	 * @see #getRun()
	 * @generated
	 */
    EAttribute getRun_Started();

    /**
	 * Returns the meta object for the attribute '{@link org.eclipse.amp.amf.adata.Run#getFinished <em>Finished</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Finished</em>'.
	 * @see org.eclipse.amp.amf.adata.Run#getFinished()
	 * @see #getRun()
	 * @generated
	 */
    EAttribute getRun_Finished();

    /**
	 * Returns the meta object for the attribute '{@link org.eclipse.amp.amf.adata.Run#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.amp.amf.adata.Run#getName()
	 * @see #getRun()
	 * @generated
	 */
    EAttribute getRun_Name();

    /**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.amp.amf.adata.Run#getParameterSets <em>Parameter Sets</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Sets</em>'.
	 * @see org.eclipse.amp.amf.adata.Run#getParameterSets()
	 * @see #getRun()
	 * @generated
	 */
    EReference getRun_ParameterSets();

    /**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.amp.amf.adata.Run#getMeasurements <em>Measurements</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measurements</em>'.
	 * @see org.eclipse.amp.amf.adata.Run#getMeasurements()
	 * @see #getRun()
	 * @generated
	 */
    EReference getRun_Measurements();

    /**
	 * Returns the meta object for class '{@link org.eclipse.amp.amf.adata.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see org.eclipse.amp.amf.adata.Parameter
	 * @generated
	 */
    EClass getParameter();

    /**
	 * Returns the meta object for the reference '{@link org.eclipse.amp.amf.adata.Parameter#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see org.eclipse.amp.amf.adata.Parameter#getAttribute()
	 * @see #getParameter()
	 * @generated
	 */
    EReference getParameter_Attribute();

    /**
	 * Returns the meta object for the attribute '{@link org.eclipse.amp.amf.adata.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.amp.amf.adata.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
    EAttribute getParameter_Name();

    /**
	 * Returns the meta object for the attribute '{@link org.eclipse.amp.amf.adata.Parameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.amp.amf.adata.Parameter#getValue()
	 * @see #getParameter()
	 * @generated
	 */
    EAttribute getParameter_Value();

    /**
	 * Returns the meta object for class '{@link org.eclipse.amp.amf.adata.DataPoint <em>Point</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point</em>'.
	 * @see org.eclipse.amp.amf.adata.DataPoint
	 * @generated
	 */
    EClass getDataPoint();

    /**
	 * Returns the meta object for the attribute '{@link org.eclipse.amp.amf.adata.DataPoint#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see org.eclipse.amp.amf.adata.DataPoint#getPeriod()
	 * @see #getDataPoint()
	 * @generated
	 */
    EAttribute getDataPoint_Period();

    /**
	 * Returns the meta object for the attribute '{@link org.eclipse.amp.amf.adata.DataPoint#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.amp.amf.adata.DataPoint#getValue()
	 * @see #getDataPoint()
	 * @generated
	 */
    EAttribute getDataPoint_Value();

    /**
	 * Returns the meta object for the container reference '{@link org.eclipse.amp.amf.adata.DataPoint#getMeasurement <em>Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Measurement</em>'.
	 * @see org.eclipse.amp.amf.adata.DataPoint#getMeasurement()
	 * @see #getDataPoint()
	 * @generated
	 */
	EReference getDataPoint_Measurement();

				/**
	 * Returns the meta object for class '{@link org.eclipse.amp.amf.adata.Catalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catalog</em>'.
	 * @see org.eclipse.amp.amf.adata.Catalog
	 * @generated
	 */
    EClass getCatalog();

    /**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.amp.amf.adata.Catalog#getRuns <em>Runs</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Runs</em>'.
	 * @see org.eclipse.amp.amf.adata.Catalog#getRuns()
	 * @see #getCatalog()
	 * @generated
	 */
    EReference getCatalog_Runs();

    /**
	 * Returns the meta object for class '{@link org.eclipse.amp.amf.adata.Measurement <em>Measurement</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement</em>'.
	 * @see org.eclipse.amp.amf.adata.Measurement
	 * @generated
	 */
    EClass getMeasurement();

    /**
	 * Returns the meta object for the attribute '{@link org.eclipse.amp.amf.adata.Measurement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.amp.amf.adata.Measurement#getType()
	 * @see #getMeasurement()
	 * @generated
	 */
    EAttribute getMeasurement_Type();

    /**
	 * Returns the meta object for the reference '{@link org.eclipse.amp.amf.adata.Measurement#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.amp.amf.adata.Measurement#getValue()
	 * @see #getMeasurement()
	 * @generated
	 */
    EReference getMeasurement_Value();

    /**
	 * Returns the meta object for the attribute '{@link org.eclipse.amp.amf.adata.Measurement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.amp.amf.adata.Measurement#getName()
	 * @see #getMeasurement()
	 * @generated
	 */
    EAttribute getMeasurement_Name();

    /**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.amp.amf.adata.Measurement#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see org.eclipse.amp.amf.adata.Measurement#getEntries()
	 * @see #getMeasurement()
	 * @generated
	 */
    EReference getMeasurement_Entries();

    /**
	 * Returns the meta object for the container reference '{@link org.eclipse.amp.amf.adata.Measurement#getRun <em>Run</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Run</em>'.
	 * @see org.eclipse.amp.amf.adata.Measurement#getRun()
	 * @see #getMeasurement()
	 * @generated
	 */
	EReference getMeasurement_Run();

				/**
	 * Returns the meta object for class '{@link org.eclipse.amp.amf.adata.ParameterSet <em>Parameter Set</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Set</em>'.
	 * @see org.eclipse.amp.amf.adata.ParameterSet
	 * @generated
	 */
    EClass getParameterSet();

    /**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.amp.amf.adata.ParameterSet#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see org.eclipse.amp.amf.adata.ParameterSet#getMembers()
	 * @see #getParameterSet()
	 * @generated
	 */
    EReference getParameterSet_Members();

    /**
	 * Returns the meta object for enum '{@link org.eclipse.amp.amf.adata.ScaleType <em>Scale Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Scale Type</em>'.
	 * @see org.eclipse.amp.amf.adata.ScaleType
	 * @generated
	 */
    EEnum getScaleType();

    /**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
    DataFactory getDataFactory();

    /**
	 * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
	 * @generated
	 */
    interface Literals {
        /**
		 * The meta object literal for the '{@link org.eclipse.amp.amf.adata.impl.RunImpl <em>Run</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see org.eclipse.amp.amf.adata.impl.RunImpl
		 * @see org.eclipse.amp.amf.adata.impl.DataPackageImpl#getRun()
		 * @generated
		 */
        EClass RUN = eINSTANCE.getRun();

        /**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference RUN__MODEL = eINSTANCE.getRun_Model();

        /**
		 * The meta object literal for the '<em><b>Started</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute RUN__STARTED = eINSTANCE.getRun_Started();

        /**
		 * The meta object literal for the '<em><b>Finished</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute RUN__FINISHED = eINSTANCE.getRun_Finished();

        /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute RUN__NAME = eINSTANCE.getRun_Name();

        /**
		 * The meta object literal for the '<em><b>Parameter Sets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference RUN__PARAMETER_SETS = eINSTANCE.getRun_ParameterSets();

        /**
		 * The meta object literal for the '<em><b>Measurements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference RUN__MEASUREMENTS = eINSTANCE.getRun_Measurements();

        /**
		 * The meta object literal for the '{@link org.eclipse.amp.amf.adata.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see org.eclipse.amp.amf.adata.impl.ParameterImpl
		 * @see org.eclipse.amp.amf.adata.impl.DataPackageImpl#getParameter()
		 * @generated
		 */
        EClass PARAMETER = eINSTANCE.getParameter();

        /**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference PARAMETER__ATTRIBUTE = eINSTANCE.getParameter_Attribute();

        /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

        /**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute PARAMETER__VALUE = eINSTANCE.getParameter_Value();

        /**
		 * The meta object literal for the '{@link org.eclipse.amp.amf.adata.impl.DataPointImpl <em>Point</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see org.eclipse.amp.amf.adata.impl.DataPointImpl
		 * @see org.eclipse.amp.amf.adata.impl.DataPackageImpl#getDataPoint()
		 * @generated
		 */
        EClass DATA_POINT = eINSTANCE.getDataPoint();

        /**
		 * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute DATA_POINT__PERIOD = eINSTANCE.getDataPoint_Period();

        /**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute DATA_POINT__VALUE = eINSTANCE.getDataPoint_Value();

        /**
		 * The meta object literal for the '<em><b>Measurement</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_POINT__MEASUREMENT = eINSTANCE.getDataPoint_Measurement();

								/**
		 * The meta object literal for the '{@link org.eclipse.amp.amf.adata.impl.CatalogImpl <em>Catalog</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see org.eclipse.amp.amf.adata.impl.CatalogImpl
		 * @see org.eclipse.amp.amf.adata.impl.DataPackageImpl#getCatalog()
		 * @generated
		 */
        EClass CATALOG = eINSTANCE.getCatalog();

        /**
		 * The meta object literal for the '<em><b>Runs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference CATALOG__RUNS = eINSTANCE.getCatalog_Runs();

        /**
		 * The meta object literal for the '{@link org.eclipse.amp.amf.adata.impl.MeasurementImpl <em>Measurement</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see org.eclipse.amp.amf.adata.impl.MeasurementImpl
		 * @see org.eclipse.amp.amf.adata.impl.DataPackageImpl#getMeasurement()
		 * @generated
		 */
        EClass MEASUREMENT = eINSTANCE.getMeasurement();

        /**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute MEASUREMENT__TYPE = eINSTANCE.getMeasurement_Type();

        /**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference MEASUREMENT__VALUE = eINSTANCE.getMeasurement_Value();

        /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute MEASUREMENT__NAME = eINSTANCE.getMeasurement_Name();

        /**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference MEASUREMENT__ENTRIES = eINSTANCE.getMeasurement_Entries();

        /**
		 * The meta object literal for the '<em><b>Run</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT__RUN = eINSTANCE.getMeasurement_Run();

								/**
		 * The meta object literal for the '{@link org.eclipse.amp.amf.adata.impl.ParameterSetImpl <em>Parameter Set</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see org.eclipse.amp.amf.adata.impl.ParameterSetImpl
		 * @see org.eclipse.amp.amf.adata.impl.DataPackageImpl#getParameterSet()
		 * @generated
		 */
        EClass PARAMETER_SET = eINSTANCE.getParameterSet();

        /**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference PARAMETER_SET__MEMBERS = eINSTANCE.getParameterSet_Members();

        /**
		 * The meta object literal for the '{@link org.eclipse.amp.amf.adata.ScaleType <em>Scale Type</em>}' enum.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see org.eclipse.amp.amf.adata.ScaleType
		 * @see org.eclipse.amp.amf.adata.impl.DataPackageImpl#getScaleType()
		 * @generated
		 */
        EEnum SCALE_TYPE = eINSTANCE.getScaleType();

    }

} //DataPackage
