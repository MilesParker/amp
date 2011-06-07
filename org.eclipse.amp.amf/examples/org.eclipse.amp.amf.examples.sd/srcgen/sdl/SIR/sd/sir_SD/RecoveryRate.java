package sdl.SIR.sd.sir_SD;

import org.eclipse.amp.axf.sd.model.AbstractSDModel;
import org.eclipse.amp.axf.sd.model.AbstractVariable;

/**
 * <!-- begin-user-doc -->
 * 
 * <!-- end-user-doc -->
 * @generated
 */
public class RecoveryRate extends AbstractVariable {

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private RecoveryRate_IllnessDuration varRecoveryRate_IllnessDuration;

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private RecoveryRate_InfectedPopulation varRecoveryRate_InfectedPopulation;

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecoveryRate() {
		super();

		/* To prevent manual changes in source code being overwritten by the generator, replace '@generated' with '@generated NOT' in the JavaDoc comment. */

	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double equation() {

		/* To prevent manual changes in source code being overwritten by the generator, replace '@generated' with '@generated NOT' in the JavaDoc comment. */

		return InfectedPopulation() / IllnessDuration();
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void init(AbstractSDModel parent) {
		super.init(parent);

		/* To prevent manual changes in source code being overwritten by the generator, replace '@generated' with '@generated NOT' in the JavaDoc comment. */

		varRecoveryRate_IllnessDuration = new RecoveryRate_IllnessDuration(
				getParent().getVariable("IllnessDuration"));

		varRecoveryRate_InfectedPopulation = new RecoveryRate_InfectedPopulation(
				getParent().getVariable("InfectedPopulation"));

	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double IllnessDuration() {

		/* To prevent manual changes in source code being overwritten by the generator, replace '@generated' with '@generated NOT' in the JavaDoc comment. */

		return ((IllnessDuration) varRecoveryRate_IllnessDuration
				.getToElement()).calculate(getCurrentTime());
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double InfectedPopulation() {

		/* To prevent manual changes in source code being overwritten by the generator, replace '@generated' with '@generated NOT' in the JavaDoc comment. */

		return ((InfectedPopulation) varRecoveryRate_InfectedPopulation
				.getToElement()).calculate(getCurrentTime());
	}

}
