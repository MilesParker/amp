package sdl.SIR.sd.sir_SD;

import org.eclipse.amp.axf.sd.model.AbstractSDModel;
import org.eclipse.amp.axf.sd.model.AbstractStock;

/**
 * <!-- begin-user-doc -->
 * 
 * <!-- end-user-doc -->
 * @generated
 */
public class RecoveredPopulation extends AbstractStock {

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private RecoveredPopulation_RecoveryRate varRecoveredPopulation_RecoveryRate;

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecoveredPopulation() {
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
	public double integral() {

		/* To prevent manual changes in source code being overwritten by the generator, replace '@generated' with '@generated NOT' in the JavaDoc comment. */

		return RecoveryRate();
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getInitialValue() {

		/* To prevent manual changes in source code being overwritten by the generator, replace '@generated' with '@generated NOT' in the JavaDoc comment. */

		return 0;
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

		varRecoveredPopulation_RecoveryRate = new RecoveredPopulation_RecoveryRate(
				getParent().getVariable("RecoveryRate"));

	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double RecoveryRate() {

		/* To prevent manual changes in source code being overwritten by the generator, replace '@generated' with '@generated NOT' in the JavaDoc comment. */

		return ((RecoveryRate) varRecoveredPopulation_RecoveryRate
				.getToElement()).calculate(getCurrentTime());
	}

}
