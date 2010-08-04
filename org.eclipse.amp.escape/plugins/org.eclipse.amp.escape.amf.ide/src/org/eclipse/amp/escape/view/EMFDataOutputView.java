/**
 * <copyright>
 *
 * Copyright (c) 2009 Metascape, LLC.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Metascape - Initial API and Implementation
 *
 * </copyright>
 *
 */

package org.eclipse.amp.escape.view;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TooManyListenersException;

import org.eclipse.amp.amf.adata.Catalog;
import org.eclipse.amp.amf.adata.DataPackage;
import org.eclipse.amp.amf.adata.DataPoint;
import org.eclipse.amp.amf.adata.Measurement;
import org.eclipse.amp.amf.adata.Parameter;
import org.eclipse.amp.amf.adata.ParameterSet;
import org.eclipse.amp.amf.adata.Run;
import org.eclipse.amp.amf.adata.ScaleType;
import org.eclipse.amp.amf.adata.impl.DataFactoryImpl;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.ui.statushandlers.StatusManager;

import org.ascape.model.event.ScapeEvent;
import org.ascape.util.PropertyAccessor;
import org.ascape.util.data.DataSeries;
import org.ascape.view.nonvis.DataView;
import org.metaabm.IValue;
import org.metaabm.SAgent;
import org.metaabm.SAttribute;
import org.metaabm.SContext;
import org.metaabm.SState;
import org.metaabm.SStateValue;

/**
 * 
 * @author mparker
 * 
 */
public class EMFDataOutputView extends DataView {

    private static final long serialVersionUID = 1L;
    private ResourceSet resourceSet;

    private Catalog catalog;
    private Run currentRun;

    Map<DataSeries, Measurement> measureForSeries = new HashMap<DataSeries, Measurement>();
    private URI dataFileURI;
    private Resource dataResource;

    public final static IPath RESULTS_FOLDER = new Path("output");
    private final SContext model;

    public EMFDataOutputView(IResource resource, SContext model) {
        super();
        this.model = model;

        IProject project = resource.getProject();
        IPath projectPath = RESULTS_FOLDER.append(
                                                  resource.getProjectRelativePath().removeFirstSegments(1)
                                                  .removeLastSegments(1)).append(
                                                                                 getFileName(resource)
                                                                                 + ".adata");

        dataFileURI = URI.createPlatformResourceURI(project.getName() + "/" + projectPath, true);
    }

    private String getFileName(IResource resource) {
        String name = ((IFile) resource).getProjectRelativePath().removeFileExtension().lastSegment();
        // name += DateFormatUtils.format(System.currentTimeMillis(), "MM-dd-yy_HH-mm-S");
        return name;
    }

    /**
     * @param scapeEvent
     * @throws TooManyListenersException
     * @see org.ascape.view.nonvis.DataView#scapeAdded(org.ascape.model.event.ScapeEvent)
     */
    public void scapeAdded(ScapeEvent scapeEvent) throws TooManyListenersException {
        super.scapeAdded(scapeEvent);
        getDataSelection().selectAll();
        resourceSet = new ResourceSetImpl();

        // resourceSet.getLoadOptions().put(XMLResource.OPTION_DEFER_ATTACHMENT, Boolean.TRUE);
        // resourceSet.getLoadOptions().put(XMLResource.OPTION_DEFER_IDREF_RESOLUTION, Boolean.TRUE);
        // resourceSet.getLoadOptions().put(XMLResource.OPTION_USE_DEPRECATED_METHODS, Boolean.FALSE);
        boolean exists = resourceSet.getURIConverter().exists(dataFileURI, null);
        if (exists) {
            dataResource = resourceSet.getResource(dataFileURI, true);
            catalog = (Catalog) dataResource.getContents().get(0);
        } else {
            dataResource = resourceSet.createResource(dataFileURI);
            catalog = DataFactoryImpl.eINSTANCE.createCatalog();
            dataResource.getContents().add(catalog);
        }

        saveResults();
    }

    /**
     * @param scapeEvent
     * @see org.ascape.model.event.DefaultScapeListener#scapeStarted(org.ascape.model.event.ScapeEvent)
     */
    public void scapeStarted(ScapeEvent scapeEvent) {
        currentRun = DataFactoryImpl.eINSTANCE.createRun();
        currentRun.setStarted(new Date());

        catalog.getRuns().add(currentRun);

        currentRun.setModel(model);
        currentRun.setName(getScape().getName());

        ParameterSet createParameterSet = DataFactoryImpl.eINSTANCE.createParameterSet();
        currentRun.getParameterSets().add(createParameterSet);

        // addParameter(createParameterSet, "runCount", new Integer(1));
        // addParameter(createParameterSet, "startPeriod", new Integer(scape.getStartPeriod()));
        // addParameter(createParameterSet, "stopPeriod", new Integer(scape.getPeriod()));
        // addParameter(createParameterSet, "randomSeed", new Long(scape.getRandomSeed()));

        List accessors = scape.retrieveAllAccessorsOrdered();
        for (Iterator propertyAccessorIt = accessors.iterator(); propertyAccessorIt.hasNext();) {
            PropertyAccessor accessor = (PropertyAccessor) propertyAccessorIt.next();
            addParameter(createParameterSet, accessor.getName(), accessor.getValue());
        }

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

    private IValue getValueForName(String attrName) {
        String searchName = attrName.toLowerCase().replace(" ", "");
        for (EObject object : model.getAllAgents()) {
            SAgent agent = (SAgent) object;
            for (SAttribute attribute : agent.getAttributes()) {
                // TODO there is actually some low possibility of name clash here..
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
                                          new Status(Status.WARNING, "org.eclipse.amp.escape.amf.ide",
                                                     "Couldn't find attribute for parameter name: " + attrName));
        return null;
    }

    /**
     * @param scapeEvent
     * @see org.ascape.model.event.DefaultScapeListener#scapeIterated(org.ascape.model.event.ScapeEvent)
     */
    public void scapeIterated(ScapeEvent scapeEvent) {
        super.scapeIterated(scapeEvent);
        for (Object selected : dataSelection.getSelectedSeries()) {
            DataSeries selectedSeries = (DataSeries) selected;
            DataPoint dataPoint = DataFactoryImpl.eINSTANCE.createDataPoint();
            Measurement measurement = measureForSeries.get(selectedSeries);
            dataPoint.setMeasure(measurement);
            dataPoint.setPeriod(getScape().getPeriod());
            dataPoint.setRun(currentRun);
            dataPoint.setValue(selectedSeries.getValue());
            measurement.getEntries().add(dataPoint);
        }
    }

    /**
     * @param attrName
     * @param integer
     */
    private void addParameter(ParameterSet set, String attrName, Object object) {
        Parameter param = DataFactoryImpl.eINSTANCE.createParameter();
        IValue valueForName = getValueForName(attrName);
        if (valueForName instanceof SAttribute) {
            param.setAttribute((SAttribute) valueForName);
        }
        param.setName(attrName);
        // Object createFromString = null;
        // // EcoreUtil.create(EcorePackage.Literals.EINTEGER_OBJECT);
        // if (object instanceof Boolean) {
        // createFromString = EcoreUtil.createFromString(EcorePackage.eINSTANCE.getEBoolean(), object
        // .toString());
        // } else if (object instanceof String) {
        // createFromString = EcoreUtil.createFromString(EcorePackage.eINSTANCE.getEString(), object
        // .toString());
        // } else if (object instanceof Double) {
        // createFromString = EcoreUtil.createFromString(EcorePackage.eINSTANCE.getEDouble(), object
        // .toString());
        // } else if (object instanceof Integer) {
        // createFromString = EcoreUtil
        // .createFromString(EcorePackage.eINSTANCE.getEInt(), object.toString());
        // }
        // if (createFromString != null) {
        param.eSet(DataPackage.Literals.PARAMETER__VALUE, object.toString());
        set.getMembers().add(param);
        // }
    }

    /**
     * @param scapeEvent
     * @see org.ascape.model.event.DefaultScapeListener#scapeStopped(org.ascape.model.event.ScapeEvent)
     */
    public void scapeStopped(ScapeEvent scapeEvent) {
        currentRun.setFinished(new Date());
        // let's save results in case we get interrupted
        saveResults();
        super.scapeStopped(scapeEvent);
    }

    private synchronized void saveResults() {
        Map<Object, Object> saveOptions = new HashMap<Object, Object>();
        try {
            dataResource.save(saveOptions);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
