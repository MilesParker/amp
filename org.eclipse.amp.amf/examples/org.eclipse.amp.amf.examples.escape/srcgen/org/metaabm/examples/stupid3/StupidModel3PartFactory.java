package org.metaabm.examples.stupid3;
public class StupidModel3PartFactory
		extends
			org.eclipse.amp.escape.ascape.adapt.AscapePartFactory {

	protected org.eclipse.gef.EditPart getPartForElement(Object model) {

		if (model instanceof Bug) {
			return new org.metaabm.examples.stupid3.BugStyle2D();
		}

		if (model instanceof Habitat) {
			return new org.metaabm.examples.stupid3.HabitatStyle2D();
		}

		return super.getPartForElement(model);
	}
}
