/**
 * <copyright>
 *
 * Copyright (c) 2007-2009 Metascape, LLC
 * Copyright (c) 2006-2007 Argonne National Labs
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Argonne National Laboratory - Initial development (pre-contribution)
 *   Metascape - Subsequent development and maintenance
 *
 * </copyright>
 */
package org.metaabm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.metaabm.MetaABMPackage;
import org.metaabm.SImplementation;
import org.metaabm.SImplementationMode;
import org.metaabm.SImplemented;
import org.metaabm.util.Derivable;

/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>SImplementation</b></em>'. Just have to say
 * that this is one of the most self-referential meta-model classes yet.
 * 
 * @author Miles Parker <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.metaabm.impl.SImplementationImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link org.metaabm.impl.SImplementationImpl#getClassName <em>Class Name</em>}</li>
 *   <li>{@link org.metaabm.impl.SImplementationImpl#getBasePath <em>Base Path</em>}</li>
 *   <li>{@link org.metaabm.impl.SImplementationImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link org.metaabm.impl.SImplementationImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.metaabm.impl.SImplementationImpl#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link org.metaabm.impl.SImplementationImpl#getDerivedPath <em>Derived Path</em>}</li>
 *   <li>{@link org.metaabm.impl.SImplementationImpl#getDerivedPackage <em>Derived Package</em>}</li>
 *   <li>{@link org.metaabm.impl.SImplementationImpl#getJavaFileLoc <em>Java File Loc</em>}</li>
 *   <li>{@link org.metaabm.impl.SImplementationImpl#getSrcDir <em>Src Dir</em>}</li>
 *   <li>{@link org.metaabm.impl.SImplementationImpl#getBinDir <em>Bin Dir</em>}</li>
 *   <li>{@link org.metaabm.impl.SImplementationImpl#getClassFileLoc <em>Class File Loc</em>}</li>
 *   <li>{@link org.metaabm.impl.SImplementationImpl#getDerivedBinDir <em>Derived Bin Dir</em>}</li>
 *   <li>{@link org.metaabm.impl.SImplementationImpl#getDerivedSrcDir <em>Derived Src Dir</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SImplementationImpl extends EObjectImpl implements SImplementation {

	public final static char sc = '/';

	/**
	 * The default value of the '{@link #getPackage() <em>Package</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackage() <em>Package</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected String package_ = PACKAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getClassName()
	 * @generated
	 * @ordered
	 */
	protected String className = CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getBasePath() <em>Base Path</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getBasePath()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBasePath() <em>Base Path</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getBasePath()
	 * @generated
	 * @ordered
	 */
	protected String basePath = BASE_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMode() <em>Mode</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected static final SImplementationMode MODE_EDEFAULT = SImplementationMode.GENERATE_LITERAL;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected SImplementationMode mode = MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getQualifiedName() <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALIFIED_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDerivedPath() <em>Derived Path</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getDerivedPath()
	 * @generated
	 * @ordered
	 */
	protected static final String DERIVED_PATH_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDerivedPackage() <em>Derived Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedPackage()
	 * @generated
	 * @ordered
	 */
	protected static final String DERIVED_PACKAGE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getJavaFileLoc() <em>Java File Loc</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getJavaFileLoc()
	 * @generated
	 * @ordered
	 */
	protected static final String JAVA_FILE_LOC_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSrcDir() <em>Src Dir</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getSrcDir()
	 * @generated
	 * @ordered
	 */
	protected static final String SRC_DIR_EDEFAULT = "srcgen";

	/**
	 * The cached value of the '{@link #getSrcDir() <em>Src Dir</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getSrcDir()
	 * @generated
	 * @ordered
	 */
	protected String srcDir = SRC_DIR_EDEFAULT;

	/**
	 * The default value of the '{@link #getBinDir() <em>Bin Dir</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getBinDir()
	 * @generated
	 * @ordered
	 */
	protected static final String BIN_DIR_EDEFAULT = "bin";

	/**
	 * The cached value of the '{@link #getBinDir() <em>Bin Dir</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getBinDir()
	 * @generated
	 * @ordered
	 */
	protected String binDir = BIN_DIR_EDEFAULT;

	/**
	 * The default value of the '{@link #getClassFileLoc() <em>Class File Loc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassFileLoc()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_FILE_LOC_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDerivedBinDir() <em>Derived Bin Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedBinDir()
	 * @generated
	 * @ordered
	 */
	protected static final String DERIVED_BIN_DIR_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDerivedSrcDir() <em>Derived Src Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedSrcDir()
	 * @generated
	 * @ordered
	 */
	protected static final String DERIVED_SRC_DIR_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected SImplementationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaABMPackage.Literals.SIMPLEMENTATION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getPackage() {
		return package_;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(String newPackage) {
		String oldPackage = package_;
		package_ = newPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaABMPackage.SIMPLEMENTATION__PACKAGE, oldPackage, package_));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassName() {
		return className;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassName(String newClassName) {
		String oldClassName = className;
		className = newClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaABMPackage.SIMPLEMENTATION__CLASS_NAME, oldClassName, className));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getBasePath() {
		return basePath;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasePath(String newBasePath) {
		String oldBasePath = basePath;
		basePath = newBasePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaABMPackage.SIMPLEMENTATION__BASE_PATH, oldBasePath, basePath));
	}

	private SImplementation getParentImplementation() {
		if (getTarget() instanceof SImplemented && (getTarget()).getParent() != null) {
			return (getTarget()).getParent().getImplementation();
		} else {
			return null;
		}
	}

	public String derive(Derivable derivable) {
		String value = derivable.baseValue(this);
		if (value != null && value.length() > 0 || getParentImplementation() == null) {
			// if (value != null) {
			return value;
			// } else {
			// return defaultValue;
			// }
		} else {
			return getParentImplementation().derive(derivable);
		}
	}

	public String getDerivedPackage() {
		return derive(new Derivable() {
			public String baseValue(SImplementation object) {
				return object.getPackage();
			}
		});
	}

	/**
	 * Adds a dir to the current path, adding a seperator IFF both paths are not empty or null.
	 * 
	 * @param currentPath
	 * @param candidatePath
	 * @return
	 */
	public static String addDir(String currentPath, String candidatePath) {
		if (currentPath.length() > 0 && candidatePath.length() > 0) {
			return currentPath + sc + candidatePath;
		} else {
			if (currentPath.length() > 0) {
				return currentPath;
			} else {
				return candidatePath;
			}
		}
	}

	public String getPackagePath() {
		String fullPath = getDerivedPackage();
		fullPath = fullPath.replace('.', sc);
		return fullPath;
	}

	public String getClassFileLoc() {
		return addDir(addDir(addDir(getDerivedPath(), getDerivedBinDir()), getPackagePath()), getClassName() + ".class");
	}

	public String getJavaFileLoc() {
		return addDir(addDir(addDir(getDerivedPath(), getDerivedSrcDir()), getPackagePath()), getClassName() + ".java");
	}

	public String getDerivedBinDir() {
		return derive(new Derivable() {
			public String baseValue(SImplementation object) {
				return object.getBinDir();
			}
		});
	}

	public String getDerivedSrcDir() {
		return derive(new Derivable() {
			public String baseValue(SImplementation object) {
				return object.getSrcDir();
			}
		});
	}

	public String getDerivedPath() {
		return derive(new Derivable() {
			public String baseValue(SImplementation object) {
				return object.getBasePath();
			}
		});
	}

	public String getQualifiedName() {
		return getDerivedPackage() + "." + getClassName();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getSrcDir() {
		return srcDir;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSrcDir(String newSrcDir) {
		String oldSrcDir = srcDir;
		srcDir = newSrcDir;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaABMPackage.SIMPLEMENTATION__SRC_DIR, oldSrcDir, srcDir));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getBinDir() {
		return binDir;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setBinDir(String newBinDir) {
		String oldBinDir = binDir;
		binDir = newBinDir;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaABMPackage.SIMPLEMENTATION__BIN_DIR, oldBinDir, binDir));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SImplementationMode getMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(SImplementationMode newMode) {
		SImplementationMode oldMode = mode;
		mode = newMode == null ? MODE_EDEFAULT : newMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaABMPackage.SIMPLEMENTATION__MODE, oldMode, mode));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SImplemented getTarget() {
		if (eContainerFeatureID() != MetaABMPackage.SIMPLEMENTATION__TARGET)
			return null;
		return (SImplemented) eContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(SImplemented newTarget, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newTarget, MetaABMPackage.SIMPLEMENTATION__TARGET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(SImplemented newTarget) {
		if (newTarget != eInternalContainer() || (eContainerFeatureID() != MetaABMPackage.SIMPLEMENTATION__TARGET && newTarget != null)) {
			if (EcoreUtil.isAncestor(this, newTarget))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTarget != null)
				msgs = ((InternalEObject) newTarget).eInverseAdd(this, MetaABMPackage.SIMPLEMENTED__IMPLEMENTATION, SImplemented.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaABMPackage.SIMPLEMENTATION__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetaABMPackage.SIMPLEMENTATION__TARGET:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTarget((SImplemented) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetaABMPackage.SIMPLEMENTATION__TARGET:
				return basicSetTarget(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case MetaABMPackage.SIMPLEMENTATION__TARGET:
				return eInternalContainer().eInverseRemove(this, MetaABMPackage.SIMPLEMENTED__IMPLEMENTATION, SImplemented.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetaABMPackage.SIMPLEMENTATION__PACKAGE:
				return getPackage();
			case MetaABMPackage.SIMPLEMENTATION__CLASS_NAME:
				return getClassName();
			case MetaABMPackage.SIMPLEMENTATION__BASE_PATH:
				return getBasePath();
			case MetaABMPackage.SIMPLEMENTATION__MODE:
				return getMode();
			case MetaABMPackage.SIMPLEMENTATION__TARGET:
				return getTarget();
			case MetaABMPackage.SIMPLEMENTATION__QUALIFIED_NAME:
				return getQualifiedName();
			case MetaABMPackage.SIMPLEMENTATION__DERIVED_PATH:
				return getDerivedPath();
			case MetaABMPackage.SIMPLEMENTATION__DERIVED_PACKAGE:
				return getDerivedPackage();
			case MetaABMPackage.SIMPLEMENTATION__JAVA_FILE_LOC:
				return getJavaFileLoc();
			case MetaABMPackage.SIMPLEMENTATION__SRC_DIR:
				return getSrcDir();
			case MetaABMPackage.SIMPLEMENTATION__BIN_DIR:
				return getBinDir();
			case MetaABMPackage.SIMPLEMENTATION__CLASS_FILE_LOC:
				return getClassFileLoc();
			case MetaABMPackage.SIMPLEMENTATION__DERIVED_BIN_DIR:
				return getDerivedBinDir();
			case MetaABMPackage.SIMPLEMENTATION__DERIVED_SRC_DIR:
				return getDerivedSrcDir();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MetaABMPackage.SIMPLEMENTATION__PACKAGE:
				setPackage((String) newValue);
				return;
			case MetaABMPackage.SIMPLEMENTATION__CLASS_NAME:
				setClassName((String) newValue);
				return;
			case MetaABMPackage.SIMPLEMENTATION__BASE_PATH:
				setBasePath((String) newValue);
				return;
			case MetaABMPackage.SIMPLEMENTATION__MODE:
				setMode((SImplementationMode) newValue);
				return;
			case MetaABMPackage.SIMPLEMENTATION__TARGET:
				setTarget((SImplemented) newValue);
				return;
			case MetaABMPackage.SIMPLEMENTATION__SRC_DIR:
				setSrcDir((String) newValue);
				return;
			case MetaABMPackage.SIMPLEMENTATION__BIN_DIR:
				setBinDir((String) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MetaABMPackage.SIMPLEMENTATION__PACKAGE:
				setPackage(PACKAGE_EDEFAULT);
				return;
			case MetaABMPackage.SIMPLEMENTATION__CLASS_NAME:
				setClassName(CLASS_NAME_EDEFAULT);
				return;
			case MetaABMPackage.SIMPLEMENTATION__BASE_PATH:
				setBasePath(BASE_PATH_EDEFAULT);
				return;
			case MetaABMPackage.SIMPLEMENTATION__MODE:
				setMode(MODE_EDEFAULT);
				return;
			case MetaABMPackage.SIMPLEMENTATION__TARGET:
				setTarget((SImplemented) null);
				return;
			case MetaABMPackage.SIMPLEMENTATION__SRC_DIR:
				setSrcDir(SRC_DIR_EDEFAULT);
				return;
			case MetaABMPackage.SIMPLEMENTATION__BIN_DIR:
				setBinDir(BIN_DIR_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MetaABMPackage.SIMPLEMENTATION__PACKAGE:
				return PACKAGE_EDEFAULT == null ? package_ != null : !PACKAGE_EDEFAULT.equals(package_);
			case MetaABMPackage.SIMPLEMENTATION__CLASS_NAME:
				return CLASS_NAME_EDEFAULT == null ? className != null : !CLASS_NAME_EDEFAULT.equals(className);
			case MetaABMPackage.SIMPLEMENTATION__BASE_PATH:
				return BASE_PATH_EDEFAULT == null ? basePath != null : !BASE_PATH_EDEFAULT.equals(basePath);
			case MetaABMPackage.SIMPLEMENTATION__MODE:
				return mode != MODE_EDEFAULT;
			case MetaABMPackage.SIMPLEMENTATION__TARGET:
				return getTarget() != null;
			case MetaABMPackage.SIMPLEMENTATION__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case MetaABMPackage.SIMPLEMENTATION__DERIVED_PATH:
				return DERIVED_PATH_EDEFAULT == null ? getDerivedPath() != null : !DERIVED_PATH_EDEFAULT.equals(getDerivedPath());
			case MetaABMPackage.SIMPLEMENTATION__DERIVED_PACKAGE:
				return DERIVED_PACKAGE_EDEFAULT == null ? getDerivedPackage() != null : !DERIVED_PACKAGE_EDEFAULT.equals(getDerivedPackage());
			case MetaABMPackage.SIMPLEMENTATION__JAVA_FILE_LOC:
				return JAVA_FILE_LOC_EDEFAULT == null ? getJavaFileLoc() != null : !JAVA_FILE_LOC_EDEFAULT.equals(getJavaFileLoc());
			case MetaABMPackage.SIMPLEMENTATION__SRC_DIR:
				return SRC_DIR_EDEFAULT == null ? srcDir != null : !SRC_DIR_EDEFAULT.equals(srcDir);
			case MetaABMPackage.SIMPLEMENTATION__BIN_DIR:
				return BIN_DIR_EDEFAULT == null ? binDir != null : !BIN_DIR_EDEFAULT.equals(binDir);
			case MetaABMPackage.SIMPLEMENTATION__CLASS_FILE_LOC:
				return CLASS_FILE_LOC_EDEFAULT == null ? getClassFileLoc() != null : !CLASS_FILE_LOC_EDEFAULT.equals(getClassFileLoc());
			case MetaABMPackage.SIMPLEMENTATION__DERIVED_BIN_DIR:
				return DERIVED_BIN_DIR_EDEFAULT == null ? getDerivedBinDir() != null : !DERIVED_BIN_DIR_EDEFAULT.equals(getDerivedBinDir());
			case MetaABMPackage.SIMPLEMENTATION__DERIVED_SRC_DIR:
				return DERIVED_SRC_DIR_EDEFAULT == null ? getDerivedSrcDir() != null : !DERIVED_SRC_DIR_EDEFAULT.equals(getDerivedSrcDir());
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (package: ");
		result.append(package_);
		result.append(", className: ");
		result.append(className);
		result.append(", basePath: ");
		result.append(basePath);
		result.append(", mode: ");
		result.append(mode);
		result.append(", srcDir: ");
		result.append(srcDir);
		result.append(", binDir: ");
		result.append(binDir);
		result.append(')');
		return result.toString();
	}

} // SImplementationImpl