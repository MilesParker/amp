package org.eclipse.amp.escape.view;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TooManyListenersException;

import org.ascape.model.event.ScapeEvent;
import org.ascape.util.PropertyAccessor;
import org.ascape.util.data.DataSeries;
import org.ascape.view.nonvis.DataView;
import org.eclipse.amp.amf.adata.Catalog;
import org.eclipse.amp.amf.adata.DataPackage;
import org.eclipse.amp.amf.adata.DataPoint;
import org.eclipse.amp.amf.adata.Measurement;
import org.eclipse.amp.amf.adata.Parameter;
import org.eclipse.amp.amf.adata.ParameterSet;
import org.eclipse.amp.amf.adata.Run;
import org.eclipse.amp.amf.adata.ScaleType;
import org.eclipse.amp.amf.adata.impl.DataFactoryImpl;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ui.statushandlers.StatusManager;
import org.metaabm.IValue;
import org.metaabm.SAgent;
import org.metaabm.SAttribute;
import org.metaabm.SContext;
import org.metaabm.SState;
import org.metaabm.SStateValue;
/**
 * Collect the Simulationdata in a Catalog Data structure
 */
public class EMFSimDataCollector extends DataView {

	private Run currentRun;

	private Catalog catalog;

	private Map<DataSeries, Measurement> measureForSeries;

	private final SContext model;

	public EMFSimDataCollector(SContext model) {
		assert (model != null);
		this.model = model;
		measureForSeries = new HashMap<DataSeries, Measurement>();
		catalog = DataFactoryImpl.eINSTANCE.createCatalog();
	}

	@Override
	public void scapeStopped(ScapeEvent scapeEvent) {
		super.scapeStopped(scapeEvent);
		currentRun.setFinished(new Date());
	}

	@Override
	public void scapeStarted(ScapeEvent scapeEvent) {
		super.scapeStarted(scapeEvent);

		currentRun = DataFactoryImpl.eINSTANCE.createRun();
		currentRun.setStarted(new Date());

		catalog.getRuns().add(currentRun);

		currentRun.setModel(model);
		currentRun.setName(getScape().getName());

		ParameterSet createParameterSet = DataFactoryImpl.eINSTANCE.createParameterSet();
		currentRun.getParameterSets().add(createParameterSet);

		@SuppressWarnings("unchecked")
		List<PropertyAccessor> accessors = scape.retrieveAllAccessorsOrdered();
		for (Iterator<PropertyAccessor> propertyAccessorIt = accessors.iterator(); propertyAccessorIt.hasNext();) {
			PropertyAccessor accessor = propertyAccessorIt.next();
			addParameter(createParameterSet, accessor.getName(), accessor.getValue());
		}

		measureForSeries = new HashMap<DataSeries, Measurement>();
		for (int i = 0; i < dataSelection.getSelectionSize(); i++) {
			DataSeries selectedSeries = dataSelection.getSelectedSeries(i);
			Measurement measure = DataFactoryImpl.eINSTANCE.createMeasurement();
			String measureName = selectedSeries.getDataPoint().getName();
			IValue valueForName = getValueForName(measureName);
			measure.setValue(valueForName);
			measure.setName(measureName);

			if (selectedSeries.getMeasureName() == "Count") {
				measure.setType(ScaleType.COUNT);
			} else if (selectedSeries.getMeasureName() == "Sum") {
				measure.setType(ScaleType.SUM);
			} else if (selectedSeries.getMeasureName() == "Average") {
				measure.setType(ScaleType.AVERAGE);
			} else if (selectedSeries.getMeasureName() == "Minimum") {
				measure.setType(ScaleType.MINIMUM);
			} else if (selectedSeries.getMeasureName() == "Maximum") {
				measure.setType(ScaleType.MAXIMUM);
			} else if (selectedSeries.getMeasureName() == "Standard Deviation") {
				measure.setType(ScaleType.STANDARD_DEVIATION);
			} else if (selectedSeries.getMeasureName() == "Variance") {
				measure.setType(ScaleType.VARIANCE);
			}
			measureForSeries.put(selectedSeries, measure);

			currentRun.getMeasurements().add(measure);
		}

		super.scapeStarted(scapeEvent);
	}

	@Override
	public void scapeIterated(ScapeEvent scapeEvent) {
		super.scapeIterated(scapeEvent);
		for (Object selected : dataSelection.getSelectedSeries()) {
			DataSeries selectedSeries = (DataSeries) selected;
			DataPoint dataPoint = DataFactoryImpl.eINSTANCE.createDataPoint();
			Measurement measurement = measureForSeries.get(selectedSeries);
			// dataPoint.setMeasure(measurement);
			dataPoint.setPeriod(getScape().getPeriod());
			dataPoint.setMeasurement(measurement);
			dataPoint.setValue(selectedSeries.getValue());
			measurement.getEntries().add(dataPoint);
		}
	}

	@Override
	public void scapeAdded(ScapeEvent scapeEvent) throws TooManyListenersException {
		super.scapeAdded(scapeEvent);
		getDataSelection().selectAll();
	}
	
	private void addParameter(ParameterSet set, String attrName, Object object) {
		Parameter param = DataFactoryImpl.eINSTANCE.createParameter();
		IValue valueForName = getValueForName(attrName);
		if (valueForName instanceof SAttribute) {
			param.setAttribute((SAttribute) valueForName);
		}
		param.setName(attrName);

		param.eSet(DataPackage.Literals.PARAMETER__VALUE, object.toString());
		set.getMembers().add(param);
	}

	private IValue getValueForName(String attrName) {
		String searchName = attrName.toLowerCase().replace(" ", "");
		for (EObject object : model.getAllAgents()) {
			SAgent agent = (SAgent) object;
			for (SAttribute attribute : agent.getAttributes()) {
				// TODO there is actually some low possibility of name clash
				// here..
				String matchName = attribute.getLabel();
				if (attribute instanceof SState) {
					for (SStateValue value : ((SState) attribute).getOptions()) {
						String stateName = value.getLabel() + " " + matchName;
						if (agent.getOwner() != null) {
							stateName = agent.getLabel() + " " + stateName;
						}
						stateName = stateName.toLowerCase().replace(" ", "");
						if (stateName.equals(searchName)) {
							return value;
						}
					}
				} else {
					if (agent.getOwner() != null) {
						matchName = agent.getLabel() + " " + matchName;
					}
					matchName = matchName.toLowerCase().replace(" ", "");
					if (matchName.equals(searchName)) {
						return attribute;
					}
				}
			}
		}
		StatusManager.getManager().handle(
				new Status(Status.WARNING, "org.eclipse.amp.escape.amf.ide", "Couldn't find attribute for parameter name: "
						+ attrName));
		return null;
	}

	public void setCatalog(Catalog catalog) {
		this.catalog = catalog;
	}

	public Catalog getCatalog() {
		return catalog;
	}
}
