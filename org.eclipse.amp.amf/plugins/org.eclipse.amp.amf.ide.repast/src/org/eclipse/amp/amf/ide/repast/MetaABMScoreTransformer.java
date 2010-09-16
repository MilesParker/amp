/**
 * <copyright>
 *
 * Copyright (c) 2007-2009 Metascape, LLC
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Metascape - Initial development and maintenance
 *
 * </copyright>
 */
package org.eclipse.amp.amf.ide.repast;

import java.io.IOException;
import java.util.Map;

import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.metaabm.SAttribute;
import org.metaabm.SProjection;
import org.metaabm.xsd.MetaABMPersist;

public class MetaABMScoreTransformer {

    repast.score.ScoreFactory sf = repast.score.ScoreFactory.eINSTANCE;

    private Map<String, String> genProperties;

    public MetaABMScoreTransformer(Map<String, String> genProperties) {
        this.genProperties = genProperties;
    }

    repast.score.SContext create(org.metaabm.SContext m) {
        repast.score.SContext s = sf.createSContext();
        transform(s, m);
        for (org.metaabm.SAgent agent : m.getAgents()) {
            if (agent instanceof org.metaabm.SContext) {
                s.getAgents().add(create((org.metaabm.SContext) agent));
            } else {
                s.getAgents().add(create(agent));
            }
        }
        for (SAttribute attr : m.getAttributes()) {
            s.getAttributes().add(create(attr));
        }
        for (SProjection proj : m.getProjections()) {
            // Java's own version of "OO" again.. :(
            if (proj instanceof org.metaabm.SGrid) {
                s.getProjections().add(create((org.metaabm.SGrid) proj));
            } else if (proj instanceof org.metaabm.SNetwork) {
                s.getProjections().add(create((org.metaabm.SNetwork) proj));
            } else if (proj instanceof org.metaabm.SContinuousSpace) {
                s.getProjections().add(create((org.metaabm.SContinuousSpace) proj));
            } else if (proj instanceof org.metaabm.SGeography) {
                s.getProjections().add(create((org.metaabm.SGeography) proj));
            } else {
                throw new RuntimeException("Unhandled Projection type");
            }
        }
        return s;
    }

    repast.score.SAgent create(org.metaabm.SAgent m) {
        repast.score.SAgent s = sf.createSAgent();
        transform(s, m);
        for (SAttribute attr : m.getAttributes()) {
            s.getAttributes().add(create(attr));
        }
        return s;
    }

    repast.score.SAttribute create(org.metaabm.SAttribute m) {
        repast.score.SAttribute s = sf.createSAttribute();
        s.setDefaultValue(m.getDefaultValue());
        s.setGatherData(m.isGatherData());
        s.setSType(repast.score.SAttributeType.getByName(m.getSType().getName()));
        if (s.getSType() == null) {
            // Boolean is default value
            s.setSType(repast.score.SAttributeType.BOOLEAN_LITERAL);
        }
        s.setSType(repast.score.SAttributeType.getByName(m.getSType().getName()));
        s.setUnits(m.getUnits());
        transform((repast.score.IID) s, (org.metaabm.IID) m);
        return s;
    }

    repast.score.SProjection create(org.metaabm.SProjection m) {
        return null;
    }

    repast.score.SProjection create(org.metaabm.SGrid m) {
        repast.score.SGrid s = sf.createSGrid();
        s.setBorderRule(repast.score.SBorderRule.getByName(m.getBorderRule().getName()));
        s.setDimensionality(m.getDimensionality());
        s.setMultiOccupant(m.isMultiOccupant());
        transform(s, m);
        return s;
    }

    repast.score.SProjection create(org.metaabm.SContinuousSpace m) {
        repast.score.SContinuousSpace s = sf.createSContinuousSpace();
        s.setBorderRule(repast.score.SBorderRule.getByName(m.getBorderRule().getName()));
        s.setDimensionality(m.getDimensionality());
        transform(s, m);
        return s;
    }

    repast.score.SProjection create(org.metaabm.SNetwork m) {
        repast.score.SNetwork s = sf.createSNetwork();
        s.setDirected(m.isDirected());
        transform(s, m);
        return s;
    }

    repast.score.SProjection create(org.metaabm.SGeography m) {
        repast.score.SGeography s = sf.createSGeography();
        transform(s, m);
        return s;
    }

    repast.score.SImplementation create(org.metaabm.SImplementation m) {
        repast.score.SImplementation s = sf.createSImplementation();
        // We need to use explicit path because score runtime has no other way
        // of finding location of class files.
        s.setBasePath("../" + getGenProperties().get("buildProject"));
        String binDir = m.getBinDir();
        if (binDir != null) {
            s.setBinDir(binDir);
        }
        s.setPackage(m.getPackage());
        s.setSrcDir(m.getSrcDir());
        s.setClassName(m.getClassName());
        s.setMode(repast.score.SImplementationMode.GENERATE_LITERAL);
        return s;
    }

    void transform(repast.score.SAgent s, org.metaabm.SAgent m) {
        s.setImplementation(create(m.getImplementation()));
        transform((repast.score.SNamed) s, (org.metaabm.SNamed) m);
    }

    void transform(repast.score.SNamed s, org.metaabm.SNamed m) {
        s.setDescription(m.getDescription());
        s.setPluralLabel(m.getPluralLabel());
        transform((repast.score.IID) s, (org.metaabm.IID) m);
    }

    void transform(repast.score.IID s, org.metaabm.IID m) {
        s.setLabel(m.getLabel());
        s.setID(m.getID());
    }

    public static String getScoreDirectory(IPath path) {
        return path.removeLastSegments(1).toOSString() + "/" + path.lastSegment().replace(".metaabm", ".rs");
    }

    public void generateScoreModel() {
        try {
            String modelPath = getGenProperties().get("modelPath");
            String outputPath = getGenProperties().get("outputPath");
            // String project = getGenProperties().get("buildProject");

            MetaABMPersist mLoader = MetaABMPersist.createURI(URI.createPlatformResourceURI(modelPath,
                                                                                            false));
            mLoader.load();
            org.metaabm.SContext mContext = mLoader.getContext();
            repast.score.SContext sContext = create(mContext);
            String scoreModelDir =
                outputPath + "/" + sContext.getImplementation().getClassName() + ".rs" + "/model.score";
            repast.score.xsd.ContextPersist sSaver = repast.score.xsd.ContextPersist.create(sContext, scoreModelDir);
            sSaver.save();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    protected Map<String, String> getGenProperties() {
        return genProperties;
    }
}