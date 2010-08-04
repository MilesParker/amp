/**
 * 
 */
package org.metaabm.gen.util;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jdt.core.JavaConventions;
import org.eclipse.jdt.core.JavaCore;
import org.metaabm.SImplementation;
import org.metaabm.impl.SImplementationImpl;

/**
 * @author Miles Parker
 */
public class GeneratorUtils {

    // public static List<EClass> getAllSubtypesForType(TreeIterator<?>
    // contents, EClassifier roottype) {
    // List<EClass> subTypes = new ArrayList<EClass>();
    // while (contents.hasNext()) {
    // EObject obj = (EObject) contents.next();
    // if (obj instanceof EClass)
    // if (((EClass) obj).getEAllSuperTypes().contains(roottype))
    // subTypes.add((EClass) obj);
    // }
    // return subTypes;
    // }

    // public static int time() {
    // return Long.System.currentTimeMillis();
    // }

    public static String timestamp() {
        Date time = new Date();
        return DateFormat.getDateInstance(DateFormat.MEDIUM).format(time) + " "
                        + DateFormat.getTimeInstance(DateFormat.LONG).format(time);
    }

    public static int timesec() {
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        return c.get(Calendar.SECOND);
    }

    public static String timelapse(Integer start) {
        return timesec() - start + " sec";
    }

    public static String getPackageLocation(EObject obj) {
        SImplementation impl = (SImplementation) obj;
        return SImplementationImpl.addDir(SImplementationImpl.addDir(impl.getDerivedPath(), impl.getDerivedSrcDir()),
                        impl.getPackagePath());
    }

    public static List<EStructuralFeature> getMissingFeatures(EObject object) {
        List<EStructuralFeature> missing = new ArrayList<EStructuralFeature>();
        EClass referenceClass = object.eClass();
        for (EStructuralFeature feature : referenceClass.getEStructuralFeatures()) {
            if (feature.isRequired() && object.eGet(feature) == null) {
                System.out.println(feature);
                System.out.println(object.eGet(feature));
                missing.add(feature);
            }
        }
        return missing;
    }

    public final static List<String> getMissingNames(EObject object) {
        List<String> missing = new ArrayList<String>();
        EClass referenceClass = object.eClass();
        for (EStructuralFeature feature : referenceClass.getEStructuralFeatures()) {
            if (feature.isRequired() && object.eGet(feature) == null) {
                missing.add(feature.getName());
            }
        }
        return missing;
    }

    public final static boolean isValidID(String id) {
        return validateID(id).isOK();
    }
    
    public final static void workItemDone(IProgressMonitor monitor) {
        ((IProgressMonitor) monitor).worked(1);
    }
    
    public final static void workName(IProgressMonitor monitor, String name) {
        ((IProgressMonitor) monitor).setTaskName(name);
    }
    
    public final static void workBegin(IProgressMonitor monitor, String name, Integer count) {
        ((IProgressMonitor) monitor).beginTask(name, count);
    }
    
    public final static void workRemaining(IProgressMonitor monitor, Integer count) {
        ((SubMonitor) monitor).setWorkRemaining(count);
    }

    private final static IStatus validateID(String id) {
        return JavaConventions.validateIdentifier(id, JavaCore.VERSION_1_5, JavaCore.VERSION_1_5);
    }
}
