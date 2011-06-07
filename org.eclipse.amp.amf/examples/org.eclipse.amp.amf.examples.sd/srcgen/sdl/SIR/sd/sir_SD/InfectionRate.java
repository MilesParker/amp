package sdl.SIR.sd.sir_SD;

import org.eclipse.amp.axf.sd.model.AbstractSDModel;
import org.eclipse.amp.axf.sd.model.AbstractVariable;

/**
 * <!-- begin-user-doc -->
 * 
 * <!-- end-user-doc -->
 * @generated
 */
public class InfectionRate extends AbstractVariable {

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private InfectionRate_ContactRate varInfectionRate_ContactRate;

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private InfectionRate_Infectivity varInfectionRate_Infectivity;

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private InfectionRate_Population varInfectionRate_Population;

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private InfectionRate_InfectedPopulation varInfectionRate_InfectedPopulation;

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private InfectionRate_SucseptiblePopulation varInfectionRate_SucseptiblePopulation;

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfectionRate() {
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

		return SucseptiblePopulation() * ContactRate() * Infectivity()
				* InfectedPopulation() / Population();
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

		varInfectionRate_ContactRate = new InfectionRate_ContactRate(
				getParent().getVariable("ContactRate"));

		varInfectionRate_Infectivity = new InfectionRate_Infectivity(
				getParent().getVariable("Infectivity"));

		varInfectionRate_Population = new InfectionRate_Population(getParent()
				.getVariable("Population"));

		varInfectionRate_InfectedPopulation = new InfectionRate_InfectedPopulation(
				getParent().getVariable("InfectedPopulation"));

		varInfectionRate_SucseptiblePopulation = new InfectionRate_SucseptiblePopulation(
				getParent().getVariable("SucseptiblePopulation"));

	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double ContactRate() {

		/* To prevent manual changes in source code being overwritten by the generator, replace '@generated' with '@generated NOT' in the JavaDoc comment. */

		return ((ContactRate) varInfectionRate_ContactRate.getToElement())
				.calculate(getCurrentTime());
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double Infectivity() {

		/* To prevent manual changes in source code being overwritten by the generator, replace '@generated' with '@generated NOT' in the JavaDoc comment. */

		return ((Infectivity) varInfectionRate_Infectivity.getToElement())
				.calculate(getCurrentTime());
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double Population() {

		/* To prevent manual changes in source code being overwritten by the generator, replace '@generated' with '@generated NOT' in the JavaDoc comment. */

		return ((Population) varInfectionRate_Population.getToElement())
				.calculate(getCurrentTime());
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double InfectedPopulation() {

		/* To prevent manual changes in source code being overwritten by the generator, replace '@generated' with '@generated NOT' in the JavaDoc comment. */

		return ((InfectedPopulation) varInfectionRate_InfectedPopulation
				.getToElement()).calculate(getCurrentTime());
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double SucseptiblePopulation() {

		/* To prevent manual changes in source code being overwritten by the generator, replace '@generated' with '@generated NOT' in the JavaDoc comment. */

		return ((SucseptiblePopulation) varInfectionRate_SucseptiblePopulation
				.getToElement()).calculate(getCurrentTime());
	}

}
