/**
 * 
 */
package org.metaabm.act.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.DragAndDropFeedback;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.DelegatingWrapperItemProvider;
import org.eclipse.emf.edit.provider.IWrapperItemProvider;

import org.metaabm.act.AAct;
import org.metaabm.act.MetaABMActPackage;
import org.metaabm.commands.RemoveActTargetsCommand;

public class AActWrapperItemProvider extends DelegatingWrapperItemProvider {

    // AActItemProvider provider;

    public AActWrapperItemProvider(Object value, Object owner, EStructuralFeature feature, int index,
            AdapterFactory adapterFactory) {
        super(value, owner, feature, index, adapterFactory);
        // this.provider = actItemProvider;
    }

    protected Object unwrap(Object object) {
        while (object instanceof IWrapperItemProvider) {
            object = ((IWrapperItemProvider) object).getValue();
        }
        return object;
    }

    @Override
    protected IWrapperItemProvider createWrapper(Object value, Object owner, AdapterFactory adapterFactory) {
        if (!((EReference) feature).isContainment() && value instanceof AAct) {
            return new AActWrapperItemProvider(value, owner, getFeature(), getIndex(), adapterFactory);
        }
        if (!(value instanceof IWrapperItemProvider)) {
            return super.createWrapper(value, owner, adapterFactory);
        }
        return (IWrapperItemProvider) value;
    }

    @Override
    protected Command createDragAndDropCommand(EditingDomain domain, Object owner, float location, int operations,
            int operation, Collection<?> collection) {
        AAct source = (AAct) unwrap(owner);
        List<AAct> allSources = new ArrayList<AAct>(source.getAllSources());
        allSources.add(source);
        if (Collections.disjoint(allSources, collection)) {
            CompoundCommand cmd = new CompoundCommand();
            if (operation == DragAndDropFeedback.DROP_LINK) {
                Collection<AAct> unwrapped = new ArrayList<AAct>();
                for (Object object : collection) {
                    AAct act = (AAct) unwrap(object);
                    unwrapped.add(act);
                }
                cmd.append(super.createDragAndDropCommand(domain, owner, location, operations, operation, unwrapped));
            } else if (operation == DragAndDropFeedback.DROP_COPY) {
                Collection<AAct> unwrapped = new ArrayList<AAct>();
                for (Object object : collection) {
                    AAct act = (AAct) unwrap(object);
                    unwrapped.add(act);
                }
                cmd.append(super.createDragAndDropCommand(domain, owner, location, operations, operation, unwrapped));
            } else if (operation == DragAndDropFeedback.DROP_MOVE) {
                Collection<AAct> targets = new ArrayList<AAct>();
                for (Object object : collection) {
                    AAct act = (AAct) unwrap(object);
                    targets.add(act);
                }
                cmd.append(super.createDragAndDropCommand(domain, owner, location, operations, operation, targets));
                for (AAct target : targets) {
                    for (AAct lastSource : target.getSources()) {
                        cmd.append(new RemoveActTargetsCommand(domain, lastSource,
                                                               MetaABMActPackage.Literals.AACT__TARGETS, Collections.singleton(target)));
                    }
                    AActItemProvider.reassignSelects(domain, cmd, source, target);
                }
            }
            return cmd;
        }
        return super.createDragAndDropCommand(domain, owner, location, operations, operation, collection);
    }
}