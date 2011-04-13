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
package org.metaabm.act;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration ' <em><b>ABuild Network Types</b></em>',
 * and utility methods for working with them.
 * 
 * @author Miles Parker <!-- end-user-doc -->
 * @see org.metaabm.act.MetaABMActPackage#getABuildNetworkTypes()
 * @model
 * @generated
 */
public enum ABuildNetworkTypes implements Enumerator {
	/**
	 * The '<em><b>Barabasi</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #BARABASI_VALUE
	 * @generated
	 * @ordered
	 */
	BARABASI(0, "Barabasi", "Barabasi"),
	/**
	 * The '<em><b>Erdos Renyi</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #ERDOS_RENYI_VALUE
	 * @generated
	 * @ordered
	 */
	ERDOS_RENYI(1, "ErdosRenyi", "ErdosRenyi"),
	/**
	 * The '<em><b>Eppstein Power Law</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #EPPSTEIN_POWER_LAW_VALUE
	 * @generated
	 * @ordered
	 */
	EPPSTEIN_POWER_LAW(2, "EppsteinPowerLaw", "EppsteinPowerLaw"),
	/**
	 * The '<em><b>Graph ML</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #GRAPH_ML_VALUE
	 * @generated
	 * @ordered
	 */
	GRAPH_ML(3, "GraphML", "GraphML"),
	/**
	 * The '<em><b>Kleinberg Small World</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #KLEINBERG_SMALL_WORLD_VALUE
	 * @generated
	 * @ordered
	 */
	KLEINBERG_SMALL_WORLD(4, "KleinbergSmallWorld", "KleinbergSmallWorld"),
	/**
	 * The '<em><b>Lattice1 D</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #LATTICE1_D_VALUE
	 * @generated
	 * @ordered
	 */
	LATTICE1_D(5, "Lattice1D", "Lattice1D"),
	/**
	 * The '<em><b>Lattice2 D</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #LATTICE2_D_VALUE
	 * @generated
	 * @ordered
	 */
	LATTICE2_D(6, "Lattice2D", "Lattice2D"),
	/**
	 * The '<em><b>Pajek</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #PAJEK_VALUE
	 * @generated
	 * @ordered
	 */
	PAJEK(7, "Pajek", "Pajek"),
	/**
	 * The '<em><b>Random Density</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #RANDOM_DENSITY_VALUE
	 * @generated
	 * @ordered
	 */
	RANDOM_DENSITY(8, "RandomDensity", "RandomDensity"),
	/**
	 * The '<em><b>Watts Small World</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #WATTS_SMALL_WORLD_VALUE
	 * @generated
	 * @ordered
	 */
	WATTS_SMALL_WORLD(9, "WattsSmallWorld", "WattsSmallWorld"),
	/**
	 * The '<em><b>ASCII Matrix</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #ASCII_MATRIX_VALUE
	 * @generated
	 * @ordered
	 */
	ASCII_MATRIX(10, "ASCIIMatrix", "ASCIIMatrix");
	/**
	 * The '<em><b>Barabasi</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Barabasi</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BARABASI
	 * @model name="Barabasi"
	 * @generated
	 * @ordered
	 */
	public static final int BARABASI_VALUE = 0;

	/**
	 * The '<em><b>Erdos Renyi</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Erdos Renyi</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ERDOS_RENYI
	 * @model name="ErdosRenyi"
	 * @generated
	 * @ordered
	 */
	public static final int ERDOS_RENYI_VALUE = 1;

	/**
	 * The '<em><b>Eppstein Power Law</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Eppstein Power Law</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EPPSTEIN_POWER_LAW
	 * @model name="EppsteinPowerLaw"
	 * @generated
	 * @ordered
	 */
	public static final int EPPSTEIN_POWER_LAW_VALUE = 2;

	/**
	 * The '<em><b>Graph ML</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Graph ML</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GRAPH_ML
	 * @model name="GraphML"
	 * @generated
	 * @ordered
	 */
	public static final int GRAPH_ML_VALUE = 3;

	/**
	 * The '<em><b>Kleinberg Small World</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Kleinberg Small World</b></em>' literal object isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KLEINBERG_SMALL_WORLD
	 * @model name="KleinbergSmallWorld"
	 * @generated
	 * @ordered
	 */
	public static final int KLEINBERG_SMALL_WORLD_VALUE = 4;

	/**
	 * The '<em><b>Lattice1 D</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lattice1 D</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LATTICE1_D
	 * @model name="Lattice1D"
	 * @generated
	 * @ordered
	 */
	public static final int LATTICE1_D_VALUE = 5;

	/**
	 * The '<em><b>Lattice2 D</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lattice2 D</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LATTICE2_D
	 * @model name="Lattice2D"
	 * @generated
	 * @ordered
	 */
	public static final int LATTICE2_D_VALUE = 6;

	/**
	 * The '<em><b>Pajek</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pajek</b></em>' literal object isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PAJEK
	 * @model name="Pajek"
	 * @generated
	 * @ordered
	 */
	public static final int PAJEK_VALUE = 7;

	/**
	 * The '<em><b>Random Density</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Random Density</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RANDOM_DENSITY
	 * @model name="RandomDensity"
	 * @generated
	 * @ordered
	 */
	public static final int RANDOM_DENSITY_VALUE = 8;

	/**
	 * The '<em><b>Watts Small World</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Watts Small World</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WATTS_SMALL_WORLD
	 * @model name="WattsSmallWorld"
	 * @generated
	 * @ordered
	 */
	public static final int WATTS_SMALL_WORLD_VALUE = 9;

	/**
	 * The '<em><b>ASCII Matrix</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ASCII Matrix</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASCII_MATRIX
	 * @model name="ASCIIMatrix"
	 * @generated
	 * @ordered
	 */
	public static final int ASCII_MATRIX_VALUE = 10;

	/**
	 * An array of all the '<em><b>ABuild Network Types</b></em>' enumerators. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	private static final ABuildNetworkTypes[] VALUES_ARRAY = new ABuildNetworkTypes[] { BARABASI, ERDOS_RENYI, EPPSTEIN_POWER_LAW, GRAPH_ML, KLEINBERG_SMALL_WORLD, LATTICE1_D, LATTICE2_D, PAJEK, RANDOM_DENSITY, WATTS_SMALL_WORLD, ASCII_MATRIX, };

	/**
	 * A public read-only list of all the '<em><b>ABuild Network Types</b></em>' enumerators.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final List<ABuildNetworkTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ABuild Network Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	public static ABuildNetworkTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ABuildNetworkTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ABuild Network Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static ABuildNetworkTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ABuildNetworkTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ABuild Network Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	public static ABuildNetworkTypes get(int value) {
		switch (value) {
			case BARABASI_VALUE:
				return BARABASI;
			case ERDOS_RENYI_VALUE:
				return ERDOS_RENYI;
			case EPPSTEIN_POWER_LAW_VALUE:
				return EPPSTEIN_POWER_LAW;
			case GRAPH_ML_VALUE:
				return GRAPH_ML;
			case KLEINBERG_SMALL_WORLD_VALUE:
				return KLEINBERG_SMALL_WORLD;
			case LATTICE1_D_VALUE:
				return LATTICE1_D;
			case LATTICE2_D_VALUE:
				return LATTICE2_D;
			case PAJEK_VALUE:
				return PAJEK;
			case RANDOM_DENSITY_VALUE:
				return RANDOM_DENSITY;
			case WATTS_SMALL_WORLD_VALUE:
				return WATTS_SMALL_WORLD;
			case ASCII_MATRIX_VALUE:
				return ASCII_MATRIX;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private ABuildNetworkTypes(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
}
