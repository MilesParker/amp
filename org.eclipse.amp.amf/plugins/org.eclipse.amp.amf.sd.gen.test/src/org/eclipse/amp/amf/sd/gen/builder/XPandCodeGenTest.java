package org.eclipse.amp.amf.sd.gen.builder;

import java.io.File;
import java.io.IOException;

import org.eclipse.amp.escape.runtime.extension.IAgentChild;
import org.eclipse.core.runtime.CoreException;

/**
 * Check basic code generation issues. Are system dynamic Java classes being
 * generated? The tests in this class are very fragmentary. If there's a better
 * way to test this, please go ahead.
 * <p/>
 * Usually, you'll need to increase PermGenSpace to run this test! Use
 * <code>-XX:MaxPermSize=128m</code> as VM argument.
 * 
 * @author fei
 */
public class XPandCodeGenTest extends AbstractJavaSDTest {

	private static final String SRCGEN_PATH = "/srcgen/XPandCodeGenTest/";

	private static final String MY_JAVA = SRCGEN_PATH + "My.java";

	private static final String AUX_JAVA = SRCGEN_PATH + "my_SD/AnAux.java";

	private static final String AUX_TO_FLOW_JAVA = SRCGEN_PATH + "my_SD/AuxToFlow.java";

	private static final String STOCK_TO_FLOW_JAVA = SRCGEN_PATH + "my_SD/StockToFlow.java";

	private static final String FLOW_JAVA = SRCGEN_PATH + "my_SD/AFlow.java";

	private static final String SD_MODEL_JAVA = SRCGEN_PATH + "my_SD/SdModel.java";

	private static final String STOCK_JAVA = SRCGEN_PATH + "my_SD/AStock.java";

	private static final String[] javaFiles = { MY_JAVA, AUX_JAVA, AUX_TO_FLOW_JAVA, FLOW_JAVA, SD_MODEL_JAVA, STOCK_JAVA, STOCK_TO_FLOW_JAVA };

	public XPandCodeGenTest() throws Exception {
		super("XPandCodeGenTest");
	}

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		String projectFilePath = getProjectFilePath("");
		File dir = new File(projectFilePath, "srcgen");
		if (!dir.exists()) {
			dir.mkdir();
		}
		cleanOutProjectDir("srcgen");

		String[] expectedFilesToBeGenerated = new String[javaFiles.length * 2];
		for (int i = 0; i < javaFiles.length; i++) {
			expectedFilesToBeGenerated[i] = javaFiles[i];
		}
		for (int i = 0; i < javaFiles.length; i++) {
			expectedFilesToBeGenerated[i + javaFiles.length] = javaFiles[i].replace(".java", ".class").replace("/srcgen/", "/bin/");
		}

		doGenerate(expectedFilesToBeGenerated);
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
		cleanOutProjectDir("srcgen");
	}

	public void testMy() throws IOException, CoreException {
		String text = getFileText(MY_JAVA);
		assertTrue(text.contains("private List<" + IAgentChild.class.getSimpleName() + "> children;"));

		assertTrue(text.contains("children = new ArrayList<" + IAgentChild.class.getSimpleName() + ">();"));
		assertTrue(text.contains("children.add(new SdModel());"));

		assertTrue(text.contains("if (timeStep == getRoot().getRunner().getEarliestPeriod()) {"));
		assertTrue(text.contains("for (" + IAgentChild.class.getSimpleName() + " tmp : children) {"));
		assertTrue(text.contains("tmp.startSimulation(timeStep);"));

		assertTrue(text.contains("for (" + IAgentChild.class.getSimpleName() + " tmp : children) {"));
		assertTrue(text.contains("tmp.calculate(timeStep);"));

		checkNoCompilationErrors(MY_JAVA);
		assertEquals(24, countGeneratedTags(MY_JAVA));
	}

	public void testAux() throws IOException, CoreException {
		String text = getFileText(AUX_JAVA);
		assertTrue(text.contains("public class AnAux extends AbstractVariable"));
		assertTrue(text.contains("private AuxToFlow varAuxToFlow"));
		assertTrue(text.contains("public Double AFlow()"));
		checkNoCompilationErrors(AUX_JAVA);
		assertEquals(6, countGeneratedTags(AUX_JAVA));
	}

	public void testStock() throws IOException, CoreException {
		String text = getFileText(STOCK_JAVA);
		assertTrue(text.contains("public class AStock extends AbstractStock"));
		assertTrue(text.contains("private StockToFlow varStockToFlow;"));
		assertTrue(text.contains("public Double AFlow()"));
		checkNoCompilationErrors(STOCK_JAVA);
		assertEquals(7, countGeneratedTags(STOCK_JAVA));
	}

	public void testFlow() throws IOException, CoreException {
		String text = getFileText(FLOW_JAVA);
		assertTrue(text.contains("public class AFlow extends AbstractVariable"));
		checkNoCompilationErrors(FLOW_JAVA);
		assertEquals(4, countGeneratedTags(FLOW_JAVA));
	}

	public void testAuxToFlowCon() throws IOException, CoreException {
		String text = getFileText(AUX_TO_FLOW_JAVA);
		assertTrue(text.contains("public class AuxToFlow extends Connector"));
		assertTrue(text.contains("setToElement(target);"));
		checkNoCompilationErrors(AUX_TO_FLOW_JAVA);
		assertEquals(2, countGeneratedTags(AUX_TO_FLOW_JAVA));
	}

	public void testStockToFlowCon() throws IOException, CoreException {
		String text = getFileText(STOCK_TO_FLOW_JAVA);
		assertTrue(text.contains("public class StockToFlow extends Connector"));
		assertTrue(text.contains("setToElement(target);"));
		checkNoCompilationErrors(STOCK_TO_FLOW_JAVA);
		assertEquals(2, countGeneratedTags(STOCK_TO_FLOW_JAVA));
	}

	public void testSdModel() throws IOException, CoreException {
		String text = getFileText(SD_MODEL_JAVA);
		assertTrue(text.contains("public class SdModel extends AbstractSDModel"));
		assertTrue(text.contains("addVariable(new AnAux());"));
		assertTrue(text.contains("addVariable(new AStock());"));
		assertTrue(text.contains("addVariable(new AFlow());"));

		assertTrue(text.contains("for (AbstractVariable tmp : getVariable())"));
		assertTrue(text.contains("tmp.init(this);"));

		assertTrue(text.contains("public void addDataCollectors(Object scape) {"));
		assertTrue(text.contains("((Scape) scape).addStatCollector(new SDDataCollector(\"AnAux\", this,"));
		assertTrue(text.contains("((Scape) scape).addStatCollector(new SDDataCollector(\"AStock\", this,"));
		assertTrue(text.contains("((Scape) scape).addStatCollector(new SDDataCollector(\"AFlow\", this,"));

		checkNoCompilationErrors(SD_MODEL_JAVA);
		assertEquals(countGeneratedTags(SD_MODEL_JAVA), 8);
	}

}
