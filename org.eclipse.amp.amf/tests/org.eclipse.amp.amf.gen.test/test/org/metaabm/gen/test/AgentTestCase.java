package org.metaabm.gen.test;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;

import junit.framework.TestCase;

public abstract class AgentTestCase extends TestCase {

    private String projectName;
    
    private String agentFullPath;
    
    protected Object agentLoaded;

    public AgentTestCase(String projectName, String testName, String agentFullPath) {
        super(testName);
        this.agentFullPath = agentFullPath;
        this.projectName = projectName;
    }

    protected void setUp() throws Exception {
        super.setUp();
        try {
            GenerateBaseTest baseTest = new GenerateBaseTest();
            baseTest.loadProject(projectName);
            baseTest.getJavaProject().getResolvedClasspath(false);
            final ClassLoader mainLoader = Thread.currentThread().getContextClassLoader();
            URL[] outputURL = { new File(baseTest.getTestProject().getLocation() + "/"
                    + baseTest.getJavaProject().getOutputLocation().removeFirstSegments(1) + "/").toURL() };
            ClassLoader delegateLoader = new URLClassLoader(outputURL) {
                @Override
                public Class<?> loadClass(String className) throws ClassNotFoundException {
                    try {
                        return super.loadClass(className);
                    } catch (ClassNotFoundException classNotFoundException) {
                        return mainLoader.loadClass(className);
                    }
                }
            };
            Thread.currentThread().setContextClassLoader(delegateLoader);
            agentLoaded = Thread.currentThread().getContextClassLoader().loadClass(agentFullPath).newInstance();
            Thread.currentThread().setContextClassLoader(mainLoader);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

	public void setAgentLoaded(Object agentLoaded) {
		this.agentLoaded = agentLoaded;
	}
}