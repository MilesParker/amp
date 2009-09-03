package name.milesparker.epi;
public class EpidemicPartFactory
		extends
			org.eclipse.amp.escape.ascape.adapt.AscapePartFactory {

	protected org.eclipse.gef.EditPart getPartForElement(Object model) {

		if (model instanceof Individual) {
			return new name.milesparker.epi.IndividualStyle2D();
		}

		if (model instanceof Location) {
			return new name.milesparker.epi.LocationStyle2D();
		}

		return super.getPartForElement(model);
	}
}
