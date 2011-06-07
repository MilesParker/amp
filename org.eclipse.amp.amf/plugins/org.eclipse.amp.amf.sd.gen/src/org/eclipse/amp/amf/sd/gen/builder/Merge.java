package org.eclipse.amp.amf.sd.gen.builder;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.eclipse.amp.amf.sd.gen.SDActivator;
import org.eclipse.emf.codegen.merge.java.JControlModel;
import org.eclipse.emf.codegen.merge.java.JMerger;
import org.eclipse.emf.codegen.merge.java.facade.ast.ASTFacadeHelper;
import org.eclipse.xpand2.output.FileHandle;
import org.eclipse.xpand2.output.OutputImpl;

public class Merge extends OutputImpl {

	@Override
	public void closeFile() {
		FileHandle fi = getFileHandles().peek();
		JControlModel controlModel = new JControlModel();
		ASTFacadeHelper helper = new ASTFacadeHelper();
		String uri = SDActivator.getAbsoluteDir("jMerge/merge.xml");
		controlModel.initialize(helper, uri);
		JMerger jMerge = new JMerger(controlModel);
		jMerge.setSourceCompilationUnit(jMerge.createCompilationUnitForContents(fi.getBuffer().toString()));
		try {
			File targetFile = new File(fi.getAbsolutePath());
			if (targetFile.exists()) {
				jMerge.setTargetCompilationUnit(jMerge.createCompilationUnitForInputStream(new FileInputStream(targetFile)));
			}
			jMerge.merge();
			fi.setBuffer(new String(jMerge.getTargetCompilationUnit().getContents().getBytes()));
			super.closeFile();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
