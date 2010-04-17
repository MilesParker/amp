package name.milesparker.epi.region;

import org.ascape.model.HostCell;
import org.eclipse.amp.escape.ascape.adapt.AscapePartFactory;
import org.eclipse.gef.EditPart;
import org.eclipse.amp.escape.ascape.gef.DefaultHostCellEditPart;

public class RegionPartFactory extends AscapePartFactory {

	protected EditPart getPartForElement(Object model) {

		if (model instanceof City) {
			return new name.milesparker.epi.region.CityStyle2D();
		}

		if (model instanceof Individual) {
			return new name.milesparker.epi.region.IndividualStyle2D();
		}

		return super.getPartForElement(model);
	}
}
