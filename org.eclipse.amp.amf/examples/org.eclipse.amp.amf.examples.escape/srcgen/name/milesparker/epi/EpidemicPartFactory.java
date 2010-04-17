package name.milesparker.epi;

import org.ascape.model.HostCell;
import org.eclipse.amp.escape.ascape.adapt.AscapePartFactory;
import org.eclipse.gef.EditPart;
import org.eclipse.amp.escape.ascape.gef.DefaultHostCellEditPart;

public class EpidemicPartFactory extends AscapePartFactory {

	protected EditPart getPartForElement(Object model) {

		if (model instanceof Individual) {
			return new name.milesparker.epi.IndividualStyle2D();
		}

		if (model instanceof HostCell) {
			return new DefaultHostCellEditPart();
		}

		return super.getPartForElement(model);
	}
}
