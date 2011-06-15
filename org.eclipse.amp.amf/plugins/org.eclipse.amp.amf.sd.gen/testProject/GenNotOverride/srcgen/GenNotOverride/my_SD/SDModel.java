package GenNotOverride.my_SD;

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
public class SDModel extends AbstractSDModel {

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public SDModel() {
		// This part should not be overwritten by the generator!
		int a = 0;

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
		private SDModel sdModel;

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
		public SDDataCollector(String name, SDModel sdModel, Scape scape) {
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
