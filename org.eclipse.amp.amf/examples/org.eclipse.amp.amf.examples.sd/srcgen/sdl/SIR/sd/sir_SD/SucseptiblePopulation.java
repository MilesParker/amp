package sdl.SIR.sd.sir_SD;

import org.eclipse.amp.axf.sd.model.AbstractSDModel;
import org.eclipse.amp.axf.sd.model.AbstractStock;

/**
 * <!-- begin-user-doc -->
 * 
 * <!-- end-user-doc -->
 * @generated
 */
public class SucseptiblePopulation extends AbstractStock {

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private SucseptiblePopulation_InfectionRate varSucseptiblePopulation_InfectionRate;

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SucseptiblePopulation() {
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

		return -InfectionRate();
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getInitialValue() {

		/* To prevent manual changes in source code being overwritten by the generator, replace '@generated' with '@generated NOT' in the JavaDoc comment. */

		return 9999;
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

		varSucseptiblePopulation_InfectionRate = new SucseptiblePopulation_InfectionRate(
				getParent().getVariable("InfectionRate"));

	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double InfectionRate() {

		/* To prevent manual changes in source code being overwritten by the generator, replace '@generated' with '@generated NOT' in the JavaDoc comment. */

		return ((InfectionRate) varSucseptiblePopulation_InfectionRate
				.getToElement()).calculate(getCurrentTime());
	}

}
