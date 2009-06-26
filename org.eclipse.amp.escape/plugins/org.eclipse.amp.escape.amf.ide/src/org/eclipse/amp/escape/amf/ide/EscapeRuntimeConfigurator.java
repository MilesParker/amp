package org.eclipse.amp.escape.amf.ide;

import org.metaabm.ide.Configurator;
import org.metaabm.ide.MetaABMRuntimeConfigurator;

public class EscapeRuntimeConfigurator extends MetaABMRuntimeConfigurator {

    public final static Configurator ESCAPE_CONFIGURATOR = new EscapeRuntimeConfigurator();

    /**
     * Configures the amodel launch for a model. If model is null, then performs
     * default configuration.
     * 
     * @param model
     *            may be null
     */
    /**
     * public void configure(ILaunchConfigurationWorkingCopy config, IResource model) { super.configure(config, model);
     * config.setAttribute( IJavaLaunchConfigurationConstants.ATTR_MAIN_TYPE_NAME,
     * "org.eclipse.amp.escape.runtime.EclipseRunner"); if (model != null) { File file = model.getLocation().toFile();
     * if (model.getFileExtension().equals("metaabm")) { try { SContext context = MetaABMPersist.create(file).load();
     * SImplementation impl = context.getImplementation(); String modelClass = impl.getQualifiedName(); config
     * .setAttribute( IJavaLaunchConfigurationConstants.ATTR_PROGRAM_ARGUMENTS, modelClass);
     * 
     * } catch (IOException e) { StatusManager.getManager().handle( new Status(Status.WARNING, "org.eclipse.amp.escape",
     * "Couldn't load model.", e)); } } else if (model.getFileExtension().equals("java")) { JavaResourceFactoryImpl
     * resourceFactory = new JavaResourceFactoryImpl();
     * Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("java", resourceFactory);
     * Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("packages", new
     * JavaPackageResourceFactoryImpl()); ResourceSet resourceSet = new ResourceSetImpl();
     * 
     * Resource resource = resourceSet.getResource(URI.createFileURI(model.getLocation().toPortableString()), true);
     * JCompilationUnit javaSource = (JCompilationUnit) resource.getEObject("/"); JClass publicClass =
     * javaSource.getTypes().get(0); config .setAttribute( IJavaLaunchConfigurationConstants.ATTR_PROGRAM_ARGUMENTS,
     * publicClass.getQualifiedName()); } } }
     **/
}
