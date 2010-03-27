package edu.brook;

import org.eclipse.amp.escape.ascape.adapt.AscapePartFactory;
import org.eclipse.gef.EditPart;

public class DemographicPrisonersDilemmaPartFactory extends AscapePartFactory {

	protected EditPart getPartForElement(Object model) {

		if (model instanceof Player) {
			return new edu.brook.CooperateDefectStyle();
		}

		if (model instanceof PlayCell) {
			return new edu.brook.PlayCellStyle();
		}

		return super.getPartForElement(model);
	}
}
