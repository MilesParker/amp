package name.milesparker.epi.region;
public class CityPartFactory
		extends
			org.eclipse.amp.escape.ascape.adapt.AscapePartFactory {

	protected org.eclipse.gef.EditPart getPartForElement(Object model) {

		if (model instanceof Individual) {
			return new name.milesparker.epi.region.IndividualStyle2D();
		}

		return super.getPartForElement(model);
	}
}
