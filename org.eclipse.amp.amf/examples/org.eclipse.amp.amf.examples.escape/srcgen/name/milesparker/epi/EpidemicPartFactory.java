package name.milesparker.epi;

import org.eclipse.amp.escape.ascape.adapt.AscapePartFactory;
import org.eclipse.gef.EditPart;

public class EpidemicPartFactory extends AscapePartFactory {

	protected EditPart getPartForElement(Object model) {

		if (model instanceof Individual) {
			return new name.milesparker.epi.IndividualStyle2D();
		}

		if (model instanceof Place) {
			return new name.milesparker.epi.PlaceStyle2D();
		}

		return super.getPartForElement(model);
	}
}
