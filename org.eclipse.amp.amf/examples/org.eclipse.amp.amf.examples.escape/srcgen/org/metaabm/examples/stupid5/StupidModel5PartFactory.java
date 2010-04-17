package org.metaabm.examples.stupid5;

import org.ascape.model.HostCell;
import org.eclipse.amp.escape.ascape.adapt.AscapePartFactory;
import org.eclipse.gef.EditPart;
import org.eclipse.amp.escape.ascape.gef.DefaultHostCellEditPart;

public class StupidModel5PartFactory extends AscapePartFactory {

	protected EditPart getPartForElement(Object model) {

		if (model instanceof Bug) {
			return new org.metaabm.examples.stupid5.BugStyle2D();
		}

		if (model instanceof Habitat) {
			return new org.metaabm.examples.stupid5.HabitatStyle2D();
		}

		return super.getPartForElement(model);
	}
}
