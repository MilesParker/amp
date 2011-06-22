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
package org.metaabm.gen.test.share;

import junit.framework.TestCase;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.junit.Assert;

public abstract class AgentTestCase extends TestCase {

	private String projectName;

	private String agentQualifiedName;

	protected Object agentLoaded;

	public static boolean targetMode = false;

	public AgentTestCase(String projectName, String testName, String agentFullPath) {
		this.agentQualifiedName = agentFullPath;
		this.projectName = projectName;
	}

	@Override
	protected void setUp() throws Exception {
		if (targetMode) {
			IProject testProject = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
			ProjectLoader loader = new ProjectLoader(testProject);
			try {
				Class<?> loadClass = Thread.currentThread().getContextClassLoader().loadClass(agentQualifiedName);
				agentLoaded = loadClass.newInstance();
				Assert.assertNotNull(agentLoaded);
				loader.restore();
			} catch (Exception e) {
				loader.restore();
				throw new RuntimeException(e);
			}
		}
	}

	public void setAgentLoaded(Object agentLoaded) {
		this.agentLoaded = agentLoaded;
	}
}