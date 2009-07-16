package org.metaabm.gen.test.share;

import java.util.Date;

import junit.framework.TestCase;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;

public abstract class AbstractGenerateBaseTest extends TestCase {

    // TODO Make this settable from junit plugin test arguments..
    public static String REPOS_PATH = "/Resources/Developer/repos/metaabm/";
    private static String BASE_PROJECT_NAME = "org.eclipse.amp.amf.gen.test";

    public static final int EXPECTED_BUILD_TIME = 30000;
    private static final String GEN_PACKAGE = "org/metaabm/gen/test/";
    private static final String SRCGEN_LOC = "srcgen/" + GEN_PACKAGE;
    private static final String BIN_LOC = "bin/" + GEN_PACKAGE;
    public final static String[] BASE_MODEL_NAMES = { "TestGeneration.metaabm" };
    public final static String[] BASE_CLASS_NAMES = { "GeneratedModel", "GeneratedMemberAgent" };
    public final static String[] BASE_ACT_MOVE_MODEL_NAMES = { "TestBasics.metaabm", "TestActs.metaabm",
    "TestSpatial.metaabm" };
    public final static String[] BASE_ACT_MOVE_CLASS_NAMES = { "BasicModel", "OperationsAgent", "StateAgent",
        "BasicMovementModel", "BasicMovementAgent", "ComplexMovementAgent", "ComplexLocation" };

    // private IJavaProject javaProject;
    // private IProject testProject;

    protected void executeGeneration(final String projectName, final String[] modelNames, final String[] classNames) {
        // builder.setCreateMarkers(false);
        System.setProperty("METAABM_TESTING", "true");
        final IWorkspace workspace = ResourcesPlugin.getWorkspace();
        IWorkspaceRunnable runTest = new IWorkspaceRunnable() {

            public void run(IProgressMonitor monitor) throws CoreException {
                try {
                    // ResourcesPlugin.getWorkspace().getDescription().
                    // setAutoBuilding(false);
                    IProject testProject = createExistingProject(projectName, monitor);
                    assertTrue(testProject.exists());
                    LockMonitor buildMonitor = new LockMonitor();
                    IJavaProject javaProject = JavaCore.create(testProject);
                    assertNotNull(javaProject);
                    assertTrue(javaProject.exists());
                    javaProject.open(monitor);
                    testProject.refreshLocal(IResource.DEPTH_INFINITE, monitor);
                    // if (!projectName.equals(baseProjectName)) {
                    // IProject baseProject = ResourcesPlugin.getWorkspace().getRoot().getProject(baseProjectName);
                    // baseProject.create(buildMonitor);
                    // baseProject.open(monitor);
                    // for (IResource res : baseProject.members()) {
                    // if (res instanceof IFile && res.getFileExtension().equals("metaabm")) {
                    // IPath destPath = testProject.getFullPath().append(res.getProjectRelativePath());
                    // IFile replaced = workspace.getRoot().getFile(destPath);
                    // if (replaced.exists()) {
                    // replaced.delete(true, monitor);
                    // }
                    // res.copy(destPath, true, monitor);
                    // }
                    // }
                    // }
                    IFolder genFolder = testProject.getFolder(SRCGEN_LOC);
                    assertTrue(genFolder.exists());
                    if (genFolder != null) {
                        for (IResource res : genFolder.members()) {
                            res.delete(true, buildMonitor);
                            buildMonitor.blockContinue();
                        }
                    }
                    assertTrue(testProject.getFolder(SRCGEN_LOC).members(true).length == 0);
                    testProject.build(IncrementalProjectBuilder.CLEAN_BUILD, buildMonitor);
                    buildMonitor.blockContinue();
                    assertTrue(testProject.getFolder("bin").members(true).length == 0);
                    assertTrue(!buildMonitor.isDoneFlag());
                    testProject.build(IncrementalProjectBuilder.FULL_BUILD, buildMonitor);
                    assertTrue(!buildMonitor.isCanceled());
                    buildMonitor.block();
                    assertTrue(buildMonitor.isDoneFlag());
                    buildMonitor.reset();
                    testProject.refreshLocal(IResource.DEPTH_INFINITE, buildMonitor);
                    buildMonitor.block();
                    assertTrue(buildMonitor.doneFlag);
                    for (String className : classNames) {
                        postBuildForFile(className, testProject);
                    }
                } catch (CoreException e) {
                    throw new RuntimeException(e.getLocalizedMessage(), e);
                }
            }
        };
        try {
            workspace.run(runTest, workspace.getRoot(), IWorkspace.AVOID_UPDATE, null);

        } catch (CoreException e) {
            throw new RuntimeException(e);
        }
    }

    // public void loadProject(String projectName) throws CoreException, JavaModelException {
    // testProject = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
    // JavaCapabilityConfigurationPage jcpage = new JavaCapabilityConfigurationPage();
    // IPath path = Platform.getLocation();
    // try {
    // JavaCapabilityConfigurationPage.createProject(testProject, URIUtil.toURI(new URL("file://" + REPOS_PATH
    // + "/" + projectName)), null);
    // } catch (MalformedURLException e) {
    // throw new RuntimeException(e);
    // } catch (URISyntaxException e) {
    // throw new RuntimeException(e);
    // }
    // javaProject = JavaCore.create(testProject);
    // javaProject.open(null);
    // testProject.refreshLocal(IResource.DEPTH_INFINITE, null);
    // }

    // public void testGenerate() {
    // executeGeneration(new MetaABMBuilder(), "org.eclipse.amp.amf.gen.test",
    // BASE_MODEL_NAMES, BASE_CLASS_NAMES);
    // }

    // protected void buildModel(MetaABMBuilder builder, IProject testProject,
    // String modelName) throws CoreException {
    // IFile genFile = testProject.getFile(modelName);
    // assertNotNull(genFile);
    // assertNotNull(genFile.getLocation());
    // builder.loadPropertiesFromResource(genFile);
    // builder.getGenProperties().put("asTest", "true");
    // builder.getGenProperties().put("outputPath",
    // testProject.getRawLocation().toOSString());
    // builder.generateModel();
    // }

    boolean projectCreated;

    private synchronized IProject createExistingProject(String createProjectName, IProgressMonitor monitor) {
        try {
            IProject targetProject = ResourcesPlugin.getWorkspace().getRoot().getProject(createProjectName);
            // IPath projectDescriptionPath = new Path(REPOS_PATH + "/" + createProjectName);
            // File projectDescriptionFile = new File(projectDescriptionPath.toOSString());
            // assertTrue(projectDescriptionFile.exists());
            // IProjectDescription projectDesc = IDEWorkbenchPlugin.getPluginWorkspace()
            // .loadProjectDescription(projectDescriptionPath.append("/.project"));
            // assertNotNull(projectDesc);
            // String projectName = projectDesc.getName();
            // assertEquals(projectName, projectDescriptionFile.getName());
            // final IWorkspace workspace = ResourcesPlugin.getWorkspace();
            // projectDesc.setName(projectName);
            // // import from file system
            // // import project from location copying files - use default project
            // // location for this workspace
            // URI locationURI = projectDesc.getLocationURI();
            // // if location is null, project already exists in this location or
            // // some error condition occured.
            // File importSource = new File(locationURI);
            // assertNotNull(importSource);
            // assertTrue(importSource.exists());
            // assertEquals(importSource.getAbsolutePath(), "/Resources/Developer/repos/metaabm/org.metaabm.gen.test");
            // // IProjectDescription copyDesc = workspace.newProjectDescription(projectName);
            // // copyDesc.setBuildSpec(projectDesc.getBuildSpec());
            // // copyDesc.setComment(projectDesc.getComment());
            // // copyDesc.setDynamicReferences(projectDesc.getDynamicReferences());
            // // copyDesc.setNatureIds(projectDesc.getNatureIds());
            // // copyDesc.setReferencedProjects(projectDesc.getReferencedProjects());
            // // projectDesc = copyDesc;
            //
            // // IProject testProject = new IProject();
            // targetProject.create(new SubProgressMonitor(monitor, 30));
            targetProject.open(IResource.NONE, new SubProgressMonitor(monitor, 70));

            boolean srcgenFound = false;
            // for (Object object : filesToImport) {
            // if (object instanceof IFolder && ((IFolder) object).getName().equals("srcgen")) {
            // srcgenFound = true;
            // }
            // System.err.println(object);
            // }
            // assertTrue(srcgenFound);
            // IOverwriteQuery query = new IOverwriteQuery() {
            // public String queryOverwrite(String pathString) {
            // return IOverwriteQuery.ALL;
            // }
            // };
            // ImportOperation importOperation = new ImportOperation(targetProject.getFullPath(), importSource,
            // FileSystemStructureProvider.INSTANCE, query, filesToImport);
            // importOperation.setContext(null);
            // importOperation.setOverwriteResources(true); // need to overwrite
            // // .project, .classpath
            // // files
            // importOperation.setCreateContainerStructure(false);
            // IProgressMonitor completionMonitor = new NullProgressMonitor() {
            // public void done() {
            // projectCreated = true;
            // }
            //
            // public void setCanceled(boolean cancelled) {
            // super.setCanceled(cancelled);
            // fail("Project creation thread was canceled.");
            // }
            // };
            // try {
            // projectCreated = false;
            // importOperation.run(completionMonitor);
            // while (!projectCreated) {
            // Thread.sleep(10);
            // }
            // } catch (InvocationTargetException e) {
            // throw new RuntimeException(e);
            // } catch (InterruptedException e) {
            // throw new RuntimeException(e);
            // }
            // assertTrue(projectCreated);
            return targetProject;
        } catch (CoreException e) {
            throw new RuntimeException(e);
        } finally {
            monitor.done();
        }

    }

    protected void preBuildForFile(String fileName, IProject project) {
        assertTrue(!project.getFile(SRCGEN_LOC + fileName + ".java").exists());
        assertTrue(!project.getFile(BIN_LOC + fileName + ".class").exists());
    }

    protected void postBuildForFile(String fileName, IProject project) {
        IFile generatedJava = project.getFile(SRCGEN_LOC + fileName + ".java");
        assertNotNull(generatedJava);
        assertTrue("No source file at: " + project.getLocation() + "/" + generatedJava.getProjectRelativePath(),
                   generatedJava.exists());
        String classLoc = GEN_PACKAGE + fileName + ".class";
        IFile generatedClass = project.getFile("bin/" + classLoc);
        assertTrue("No compiled file at: " + project.getLocation() + "/" + generatedClass.getProjectRelativePath(),
                   generatedClass.exists());
        long genTime = generatedJava.getLocalTimeStamp();
        long expectedTime = System.currentTimeMillis() - EXPECTED_BUILD_TIME;
        assertTrue("Generate time: " + new Date(genTime).toString() + "   expected time: "
                   + new Date(expectedTime).toString(), genTime > expectedTime);
    }
}
