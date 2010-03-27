package name.milesparker.epi.region;

import org.eclipse.amp.escape.ascape.adapt.AscapePartFactory;
import org.eclipse.gef.EditPart;

public class CityPartFactory extends AscapePartFactory {

	protected EditPart getPartForElement(Object model) {

		if (model instanceof Individual) {
			return new name.milesparker.epi.region.IndividualStyle2D();
		}

		return super.getPartForElement(model);
	}
}
