package org.metaabm.examples.stupid5;
public class StupidModel5PartFactory
		extends
			org.eclipse.amp.escape.ascape.adapt.AscapePartFactory {

	protected org.eclipse.gef.EditPart getPartForElement(Object model) {

		if (model instanceof Bug) {
			return new org.metaabm.examples.stupid5.BugStyle2D();
		}

		if (model instanceof Habitat) {
			return new org.metaabm.examples.stupid5.HabitatStyle2D();
		}

		return super.getPartForElement(model);
	}
}
