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
 *   Metascape - Development and maintenance
 *
 * </copyright> $Id: LogWorkflow.java,v 1.2 2010/03/23 18:28:25 mparker Exp $
 */
package org.eclipse.amp.amf.gen.ide;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.mwe.core.issues.MWEDiagnostic;
import org.eclipse.ui.statushandlers.StatusManager;

import org.apache.commons.logging.Log;

/**
 * Apache logging support for workflows.
 * 
 * @author milesparker
 * 
 */
public class LogWorkflow implements Log {
    private static final long serialVersionUID = 9181448189753075665L;

    // TODO this will all have to be reworked if parallel generation is supported..class loader issues are very involved
    static List<MWEDiagnostic> errors = new ArrayList<MWEDiagnostic>();

    static List<MWEDiagnostic> warnings = new ArrayList<MWEDiagnostic>();

    static List<MWEDiagnostic> fatals = new ArrayList<MWEDiagnostic>();

    static StringBuffer info;

    String name;

    static boolean success;

    public LogWorkflow(String name) {
        clearLog();
        this.name = name;
    }

    static class WorkflowStatus extends MultiStatus {
        public WorkflowStatus(int severity, String pluginName, String message, MWEDiagnostic[] MWEDiagnostics) {
            super(pluginName, 0, message, null);
            setSeverity(severity);
            for (MWEDiagnostic MWEDiagnostic : MWEDiagnostics) {
                Status status = null;
                if (MWEDiagnostic.getElement() instanceof Exception) {
                    status = new Status(severity, pluginName, MWEDiagnostic.getMessage(), (Exception) MWEDiagnostic
                                        .getElement());
                } else {
                    status = new Status(severity, pluginName, MWEDiagnostic.getMessage());
                }
                add(status);
            }
        }
    }

    public static void report(IStatus status, boolean show) {
        int style = StatusManager.LOG;
        if (show) {
            style |= StatusManager.SHOW;
        }
        StatusManager.getManager().handle(status, style);
    }

    public static void report(int severity, String pluginName, String message, MWEDiagnostic[] MWEDiagnostics,
            boolean show) {
        report(createStatus(severity, pluginName, message, MWEDiagnostics), show);
    }

    public static void report(int severity, String pluginName, String message, boolean show) {
        report(new Status(severity, pluginName, message), show);
    }

    public static IStatus createStatus(int severity, String pluginName, String message, MWEDiagnostic[] MWEDiagnostics) {
        return new WorkflowStatus(severity, pluginName, message, MWEDiagnostics);
    }

    public static MWEDiagnostic[] getErrors() {
        return errors.toArray(new MWEDiagnostic[0]);
    }

    public static MWEDiagnostic[] getWarnings() {
        return warnings.toArray(new MWEDiagnostic[0]);
    }

    public static MWEDiagnostic[] getFatals() {
        return fatals.toArray(new MWEDiagnostic[0]);
    }

    static String priorLog;

    public static void registerToLogFactory() {
        priorLog = System.getProperty("org.apache.commons.logging.Log");
        System.setProperty("org.apache.commons.logging.Log", LogWorkflow.class.getName());
    }

    public static void restoreLogFactory() {
        if (priorLog != null) {
            System.setProperty("org.apache.commons.logging.Log", priorLog);
        }
    }

    public static void clearLog() {
        errors = new ArrayList<MWEDiagnostic>();
        warnings = new ArrayList<MWEDiagnostic>();
        fatals = new ArrayList<MWEDiagnostic>();
        info = new StringBuffer();
    }

    public static void report(String pluginName, String taskDescription) {
        report(pluginName, taskDescription, true);
    }

    public static void report(String pluginName, String taskDescription, boolean showErrors) {
        String logMessage = "\r\rLog:\r" + info;
        String taskMessage = taskDescription;// + logMessage;
        String successMessage = taskDescription + (success ? " completed succesfully." : " failed.");
        if (getFatals().length > 0) {
            report(IStatus.ERROR, pluginName, "Fatal errors occurred during " + taskMessage, getFatals(), true);
        } else if (getErrors().length > 0) {
            report(IStatus.ERROR, pluginName, "Errors occurred during " + taskMessage, getErrors(), showErrors);
        } else if (getWarnings().length > 0) {
            report(IStatus.WARNING, pluginName, successMessage
                   + " Warnings occurred while executing workflow. (These may not actually be problems.)" + logMessage,
                   getWarnings(), false);
        } else {
            report(IStatus.OK, pluginName, successMessage + logMessage, false);
        }
        clearLog();
    }

    public String messageFor(Object object) {
        if (object instanceof String) {
            return (String) object;
        } else if (object instanceof WrappedException) {
            return ((WrappedException) object).getMessage();
        } else
            return object.toString();
    }

    public void error(Object message) {
        errors.add(new MWEDiagnostic(0, (String) message, message, name, null, null, null));
        warningOrAbove("ERROR: " + messageFor(message));
    }

    public void error(Object message, Throwable t) {
        errors.add(new MWEDiagnostic(0, messageFor(message), t, name, t, null, null));
        warningOrAbove("ERROR: " + messageFor(message));
    }

    public void fatal(Object message) {
        fatals.add(new MWEDiagnostic(0, messageFor(message), message, name, null, null, null));
        warningOrAbove("FATAL: " + messageFor(message));
    }

    public void fatal(Object message, Throwable t) {
        fatals.add(new MWEDiagnostic(0, messageFor(message), t, name, t, null, null));
        warningOrAbove("FATAL: " + messageFor(message));
    }

    public void warn(Object message) {
        warnings.add(new MWEDiagnostic(0, messageFor(message), message, name, null, null, null));
        warningOrAbove("WARNING: " + messageFor(message));
    }

    public void warn(Object message, Throwable t) {
        warnings.add(new MWEDiagnostic(0, messageFor(message), t, name, t, null, null));
        warningOrAbove("WARNING: " + messageFor(message));
    }

    /**
     * Handle any messages that are below level of warning.
     */
    public void belowWarning(Object message) {
        System.out.println(message);
        // addInfo(message);
    }

    /**
     * Handle any messages that are below level of warning.
     */
    public void warningOrAbove(Object message) {
        System.err.println(message);
        // addInfo(message);
    }

    public static void addInfo(Object message) {
        info.append(message + "\r");
    }

    public void info(Object message) {
        belowWarning(message);
    }

    public void info(Object message, Throwable t) {
        belowWarning(message);
    }

    public void trace(Object message) {
        belowWarning(message);
    }

    public void trace(Object message, Throwable t) {
        belowWarning(message);
    }

    public void debug(Object message) {
        belowWarning(message);
    }

    public void debug(Object message, Throwable t) {
        belowWarning(message);
    }

    public boolean isDebugEnabled() {
        return true;
    }

    public boolean isErrorEnabled() {
        return true;
    }

    public boolean isFatalEnabled() {
        return true;
    }

    public boolean isInfoEnabled() {
        return true;
    }

    public boolean isTraceEnabled() {
        return true;
    }

    public boolean isWarnEnabled() {
        return true;
    }

    public static void setSuccess(boolean success) {
        LogWorkflow.success = success;
    }
}