package sdl.SIR.sd.sir_SD;

import org.eclipse.amp.axf.sd.model.AbstractSDModel;
import org.eclipse.amp.axf.sd.model.AbstractVariable;

import org.ascape.util.data.StatCollectorCSAMM;
import org.ascape.model.Scape;

/**
 * <!-- begin-user-doc -->
 * 
 * <!-- end-user-doc -->
 * @generated
 */
public class SD extends AbstractSDModel {

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SD() {

		/* To prevent manual changes in source code being overwritten by the generator, replace '@generated' with '@generated NOT' in the JavaDoc comment. */

		addVariable(new InfectedPopulation());

		addVariable(new SucseptiblePopulation());

		addVariable(new InfectionRate());

		addVariable(new ContactRate());

		addVariable(new Population());

		addVariable(new Infectivity());

		addVariable(new RecoveredPopulation());

		addVariable(new RecoveryRate());

		addVariable(new IllnessDuration());

		for (AbstractVariable tmp : getVariable()) {
			tmp.init(this);
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addDataCollectors(Object scape) {

		((Scape) scape).addStatCollector(new SDDataCollector(
				"InfectedPopulation", this, (Scape) scape));

		((Scape) scape).addStatCollector(new SDDataCollector(
				"SucseptiblePopulation", this, (Scape) scape));

		((Scape) scape).addStatCollector(new SDDataCollector("InfectionRate",
				this, (Scape) scape));

		((Scape) scape).addStatCollector(new SDDataCollector("ContactRate",
				this, (Scape) scape));

		((Scape) scape).addStatCollector(new SDDataCollector("Population",
				this, (Scape) scape));

		((Scape) scape).addStatCollector(new SDDataCollector("Infectivity",
				this, (Scape) scape));

		((Scape) scape).addStatCollector(new SDDataCollector(
				"RecoveredPopulation", this, (Scape) scape));

		((Scape) scape).addStatCollector(new SDDataCollector("RecoveryRate",
				this, (Scape) scape));

		((Scape) scape).addStatCollector(new SDDataCollector("IllnessDuration",
				this, (Scape) scape));

	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private class SDDataCollector extends StatCollectorCSAMM {

		/**
		 * <!-- begin-user-doc -->
		 * 
		 * <!-- end-user-doc -->
		 * @generated
		 */
		private SD sdModel;

		/**
		 * <!-- begin-user-doc -->
		 * 
		 * <!-- end-user-doc -->
		 * @generated
		 */
		private Scape scape;

		/**
		 * <!-- begin-user-doc -->
		 * 
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public SDDataCollector(String name, SD sdModel, Scape scape) {
			super(name);
			this.sdModel = sdModel;
			this.scape = scape;
		}

		/**
		 * <!-- begin-user-doc -->
		 * 
		 * <!-- end-user-doc -->
		 * @generated
		 */
		@Override
		public double getValue(Object object) {
			AbstractVariable var = sdModel.getVariable(getName());
			int time = scape.getRunner().getPeriod();
			double retValue = var.calculate(time);
			return retValue;
		}
	}

}
