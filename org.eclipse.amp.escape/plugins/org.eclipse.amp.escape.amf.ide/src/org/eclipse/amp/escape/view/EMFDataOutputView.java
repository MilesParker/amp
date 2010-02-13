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
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;

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

    public EMFDataOutputView(String projectName, String path) {
        super();
        IPath projectPath = new Path(projectName).append(RESULTS_FOLDER).append(new Path(path)).append(name + ".adata");
        dataFileURI = URI.createPlatformResourceURI(projectPath.toString(), true);
    }

    public EMFDataOutputView(IResource resource) {
        super();

        IProject project = resource.getProject();
        IPath projectPath = RESULTS_FOLDER.append(
                                                  resource.getProjectRelativePath().removeFirstSegments(1)
                                                  .removeLastSegments(1)).append(name + ".adata");

        dataFileURI = URI.createPlatformResourceURI(project.getName() + "/" + projectPath, true);
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

        resourceSet.getLoadOptions().put(XMLResource.OPTION_DEFER_ATTACHMENT, Boolean.TRUE);
        resourceSet.getLoadOptions().put(XMLResource.OPTION_DEFER_IDREF_RESOLUTION, Boolean.TRUE);
        resourceSet.getLoadOptions().put(XMLResource.OPTION_USE_DEPRECATED_METHODS, Boolean.TRUE);
        dataResource = resourceSet.createResource(dataFileURI);

        catalog = DataFactoryImpl.eINSTANCE.createCatalog();

        dataResource.getContents().add(catalog);

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

        currentRun.setName(getScape().getName());

        ParameterSet createParameterSet = DataFactoryImpl.eINSTANCE.createParameterSet();
        currentRun.getParameterSets().add(createParameterSet);

        addParameter(createParameterSet, "runCount", new Integer(1));
        addParameter(createParameterSet, "startPeriod", new Integer(scape.getStartPeriod()));
        addParameter(createParameterSet, "stopPeriod", new Integer(scape.getPeriod()));
        addParameter(createParameterSet, "randomSeed", new Long(scape.getRandomSeed()));

        List accessors = scape.retrieveAllAccessorsOrdered();
        for (Iterator propertyAccessorIt = accessors.iterator(); propertyAccessorIt.hasNext();) {
            PropertyAccessor accessor = (PropertyAccessor) propertyAccessorIt.next();
            addParameter(createParameterSet, accessor.getName(), accessor.getValue());
        }

        for (int i = 0; i < dataSelection.getSelectionSize(); i++) {
            DataSeries selectedSeries = dataSelection.getSelectedSeries(i);
            Measurement measure = DataFactoryImpl.eINSTANCE.createMeasurement();
            measure.setAttribute(selectedSeries.getDataPoint().getName());

            if (selectedSeries.getMeasureName() == "Count") {
                measure.setMeasure(ScaleType.COUNT);
            } else if (selectedSeries.getMeasureName() == "Sum") {
                measure.setMeasure(ScaleType.SUM);
            } else if (selectedSeries.getMeasureName() == "Average") {
                measure.setMeasure(ScaleType.AVERAGE);
            } else if (selectedSeries.getMeasureName() == "Minimum") {
                measure.setMeasure(ScaleType.MINIMUM);
            } else if (selectedSeries.getMeasureName() == "Maximum") {
                measure.setMeasure(ScaleType.MAXIMUM);
            } else if (selectedSeries.getMeasureName() == "Standard Deviation") {
                measure.setMeasure(ScaleType.STANDARD_DEVIATION);
            } else if (selectedSeries.getMeasureName() == "Variance") {
                measure.setMeasure(ScaleType.VARIANCE);
            }
            measureForSeries.put(selectedSeries, measure);

            currentRun.getMeasurements().add(measure);
        }

        super.scapeStarted(scapeEvent);
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
            catalog.getEntries().add(dataPoint);
        }
    }

    /**
     * @param attrName
     * @param integer
     */
    private void addParameter(ParameterSet set, String attrName, Object object) {
        Parameter param = DataFactoryImpl.eINSTANCE.createParameter();
        param.setAttribute(attrName);

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

    /**
     * @param scapeEvent
     * @see org.ascape.model.event.DefaultScapeListener#scapeClosing(org.ascape.model.event.ScapeEvent)
     */
    public void scapeClosing(ScapeEvent scapeEvent) {
        saveResults();
        super.scapeClosing(scapeEvent);
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
