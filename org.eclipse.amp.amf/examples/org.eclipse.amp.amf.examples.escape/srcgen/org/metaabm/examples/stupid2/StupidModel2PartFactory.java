package org.metaabm.examples.stupid2;

import org.eclipse.amp.escape.ascape.adapt.AscapePartFactory;
import org.eclipse.gef.EditPart;

public class StupidModel2PartFactory extends AscapePartFactory {

	protected EditPart getPartForElement(Object model) {

		if (model instanceof Bug) {
			return new org.metaabm.examples.stupid2.BugStyle2D();
		}

		if (model instanceof Habitat) {
			return new org.metaabm.examples.stupid2.HabitatStyle2D();
		}

		return super.getPartForElement(model);
	}
}
