/**
 * <copyright>
 *
 * Copyright (c) 2007-2009 Metascape, LLC
 * Copyright (c) 2006-2007 Argonne National Labs
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Argonne National Laboratory - Initial development (pre-contribution)
 *   Metascape - Subsequent development and maintenance
 *
 * </copyright>
 */
package org.metaabm.act.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.CopyCommand;
import org.eclipse.emf.edit.command.DragAndDropFeedback;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemColorProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITableItemColorProvider;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.metaabm.IID;
import org.metaabm.MetaABMPackage;
import org.metaabm.SNamed;
import org.metaabm.act.AAct;
import org.metaabm.act.AGroup;
import org.metaabm.act.AInput;
import org.metaabm.act.ARoot;
import org.metaabm.act.ASelect;
import org.metaabm.act.ASink;
import org.metaabm.act.ATransform;
import org.metaabm.act.MetaABMActFactory;
import org.metaabm.act.MetaABMActPackage;
import org.metaabm.commands.RemoveActTargetsCommand;
import org.metaabm.commands.SetLabelCommand;
import org.metaabm.commands.SuggestLabelCommand;
import org.metaabm.function.FFunction;
import org.metaabm.provider.IIDItemProvider;
import org.metaabm.provider.MetaABMEditPlugin;

/**
 * This is the item provider adapter for a {@link org.metaabm.act.AAct} object.
 * <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * @generated
 */
public class AActItemProvider extends IIDItemProvider implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, ITableItemLabelProvider, ITableItemColorProvider, IItemColorProvider {

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AActItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addSourcesPropertyDescriptor(object);
			addTargetsPropertyDescriptor(object);
			addReferencePropertyDescriptor(object);
			addGroupPropertyDescriptor(object);
			addSelectedPropertyDescriptor(object);
			addAllSourcesPropertyDescriptor(object);
			addAllTargetsPropertyDescriptor(object);
			addRootSelectedPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Sources feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourcesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_AAct_sources_feature"), getString("_UI_PropertyDescriptor_description", "_UI_AAct_sources_feature", "_UI_AAct_type"), MetaABMActPackage.Literals.AACT__SOURCES, true, false, true, null, getString("_UI_RelationsPropertyCategory"), new String[] { "org.eclipse.ui.views.properties.expert" }));
	}

	/**
	 * This adds a property descriptor for the Targets feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_AAct_targets_feature"), getString("_UI_PropertyDescriptor_description", "_UI_AAct_targets_feature", "_UI_AAct_type"), MetaABMActPackage.Literals.AACT__TARGETS, true, false, true, null, getString("_UI_RelationsPropertyCategory"), new String[] { "org.eclipse.ui.views.properties.expert" }));
	}

	/**
	 * This adds a property descriptor for the Reference feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReferencePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_AAct_reference_feature"), getString("_UI_PropertyDescriptor_description", "_UI_AAct_reference_feature", "_UI_AAct_type"), MetaABMActPackage.Literals.AACT__REFERENCE, false, false, true, null, getString("_UI_RelationsPropertyCategory"), new String[] { "org.eclipse.ui.views.properties.expert" }));
	}

	/**
	 * This adds a property descriptor for the Group feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGroupPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_AAct_group_feature"), getString("_UI_PropertyDescriptor_description", "_UI_AAct_group_feature", "_UI_AAct_type"), MetaABMActPackage.Literals.AACT__GROUP, false, false, true, null, getString("_UI_RelationsPropertyCategory"), new String[] { "org.eclipse.ui.views.properties.expert" }));
	}

	/**
	 * This adds a property descriptor for the Selected feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void addSelectedPropertyDescriptor(Object object) {
		ItemPropertyDescriptor createItemPropertyDescriptor = new ItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_AAct_selected_feature"), getString("_UI_PropertyDescriptor_description", "_UI_AAct_selected_feature", "_UI_AAct_type"), MetaABMActPackage.Literals.AACT__SELECTED, true, true, true, null, getString("_UI_ActPropertyCategory"), null) {

			@SuppressWarnings("unchecked")
			public Collection<?> getChoiceOfValues(Object object) {
				Collection<AAct> original = (Collection<AAct>) super.getChoiceOfValues(object);
				Collection<AAct> potential = new ArrayList<AAct>();
				for (AAct candidate : original) {
					if (((AAct) object).isTargetOf(candidate)) {
						potential.add(candidate);
					}
				}
				return potential;
			}

		};
		itemPropertyDescriptors.add(createItemPropertyDescriptor);
	}

	/**
	 * This adds a property descriptor for the All Sources feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllSourcesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_AAct_allSources_feature"), getString("_UI_PropertyDescriptor_description", "_UI_AAct_allSources_feature", "_UI_AAct_type"), MetaABMActPackage.Literals.AACT__ALL_SOURCES, false, false, true, null, getString("_UI_RelationsPropertyCategory"), new String[] { "org.eclipse.ui.views.properties.expert" }));
	}

	/**
	 * This adds a property descriptor for the All Targets feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllTargetsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_AAct_allTargets_feature"), getString("_UI_PropertyDescriptor_description", "_UI_AAct_allTargets_feature", "_UI_AAct_type"), MetaABMActPackage.Literals.AACT__ALL_TARGETS, false, false, true, null, getString("_UI_RelationsPropertyCategory"), new String[] { "org.eclipse.ui.views.properties.expert" }));
	}

	/**
	 * This adds a property descriptor for the Root Selected feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRootSelectedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_AAct_rootSelected_feature"), getString("_UI_PropertyDescriptor_description", "_UI_AAct_rootSelected_feature", "_UI_AAct_type"), MetaABMActPackage.Literals.AACT__ROOT_SELECTED, false, false, false, null, getString("_UI_RelationsPropertyCategory"), new String[] { "org.eclipse.ui.views.properties.expert" }));
	}

	public void addTargets(EList<AAct> sources, EList<AAct> result) {
		for (AAct source : sources) {
			if (!result.contains(source)) {
				result.add(source);
			}
			for (AAct target : source.getTargets()) {
				AAct run = target;
				while (run.getTargets().size() == 1 && run.getSources().size() == 1 && !result.contains(run)) {
					result.add(run);
					run = run.getTargets().get(0);
				}
			}
			addTargets(source.getTargets(), result);
		}
	}

	@SuppressWarnings("unchecked")
	public Collection<?> getChildren(Object object) {
		if (object instanceof ARoot) {
			ARoot root = (ARoot) object;
			EList<AAct> targets = new BasicEList(Collections.singleton(root));
			// Collection<AAct> visited = new HashSet<AAct>();
			// for (AAct members : root.getTargets()) {
			//
			// }
			BasicEList result = new BasicEList();
			addTargets(targets, result);
			result.remove(root);
			return result;
		} else if (object instanceof AGroup) {
			return super.getChildren(object);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			childrenFeatures = new ArrayList<EStructuralFeature>();
			// if (object instanceof ARoot) {
			childrenFeatures.add(MetaABMActPackage.Literals.AACT__TARGETS);
			// }
		}
		return childrenFeatures;
	}

	@SuppressWarnings("unchecked")
	public static CompoundCommand createActDragCommand(EditingDomain domain, int eventID, AAct sourceAct, final AAct targetAct) {
		CompoundCommand cmd = new CompoundCommand() {
			/**
			 * @return
			 * @see org.eclipse.emf.common.command.CompoundCommand#getAffectedObjects()
			 */
			public Collection<?> getAffectedObjects() {
				return Collections.singleton(targetAct);
			}
		};
		if (eventID == DragAndDropFeedback.DROP_LINK) {
			cmd.append(AddCommand.create(domain, sourceAct, MetaABMActPackage.Literals.AACT__TARGETS, targetAct));
		} else if (eventID == DragAndDropFeedback.DROP_COPY) {
			// TODO copy doesn't behave perfectly, updates sometimes lag
			Command create = CopyCommand.create(domain, targetAct);
			cmd.appendAndExecute(create);
			AAct newAct = (AAct) new ArrayList(create.getResult()).get(0);
			cmd.appendAndExecute(AddCommand.create(domain, sourceAct, MetaABMActPackage.Literals.AACT__TARGETS, newAct));
		} else if (eventID == DragAndDropFeedback.DROP_MOVE) {
			cmd.append(AddCommand.create(domain, sourceAct, MetaABMActPackage.Literals.AACT__TARGETS, targetAct));
			EList<AAct> sources = targetAct.getSources();
			sources.remove(sourceAct);
			for (AAct targetSource : sources) {
				cmd.append(RemoveCommand.create(domain, targetSource, MetaABMActPackage.Literals.AACT__TARGETS, targetAct));
			}
		}
		return cmd;
	}

	@Override
	protected Command createDragAndDropCommand(EditingDomain domain, Object owner, float location, int operations, int operation, Collection<?> collection) {
		if (owner instanceof AAct) {
			AAct source = (AAct) owner;
			List<AAct> allSources = new ArrayList<AAct>(source.getAllSources());
			allSources.add(source);
			CompoundCommand cmd = new CompoundCommand();
			for (Object object : collection) {
				if (object instanceof AAct) {
					AAct target = (AAct) object;
					cmd.append(createActDragCommand(domain, operation, source, target));
				}
			}
			return cmd;
		}
		return super.createDragAndDropCommand(domain, owner, location, operations, operation, collection);
	}

	// /**
	// * This specifies how to implement {@link #getChildren} and is used to
	// * deduce an appropriate feature for an
	// * {@link org.eclipse.emf.edit.command.AddCommand},
	// * {@link org.eclipse.emf.edit.command.RemoveCommand} or
	// * {@link org.eclipse.emf.edit.command.MoveCommand} in
	// * {@link #createCommand}. <!-- begin-user-doc --> <!-- end-user-doc -->
	// *
	// * @generated NOT
	// */
	// @Override
	// public Collection<? extends EStructuralFeature>
	// getChildrenFeatures(Object object) {
	// if (childrenFeatures == null) {
	// super.getChildrenFeatures(object);
	// childrenFeatures.add(MetaABMActPackage.Literals.AACT__SOURCES);
	// childrenFeatures.add(MetaABMActPackage.Literals.AACT__TARGETS);
	// }
	// return childrenFeatures;
	// }

	@SuppressWarnings("unchecked")
	protected Command createAddCommand(EditingDomain domain, EObject owner, EStructuralFeature feature, Collection<?> collection, int index) {
		if (feature == MetaABMActPackage.Literals.AACT__SOURCES) {
			CompoundCommand cmd = new CompoundCommand("Add Source");
			SuggestLabelCommand suggestLabelCommand = new SuggestLabelCommand(this, domain, (IID) owner);
			cmd.append(super.createAddCommand(domain, owner, feature, collection, index));
			cmd.append(suggestLabelCommand);
			return cmd;
		} else if (feature == MetaABMActPackage.Literals.AACT__TARGETS) {
			// Don't allow any circular references!
			AAct source = (AAct) owner;
			if (Collections.disjoint(source.getAllSources(), collection) && !collection.contains(owner)) {
				CompoundCommand cmd = new CompoundCommand("Add Target");
				SuggestLabelCommand suggestLabelCommand = new SuggestLabelCommand(domain, (Collection<IID>) collection);
				cmd.append(super.createAddCommand(domain, owner, feature, collection, index));
				AGroup group = source.getGroup();
				if (group != null) {
					// do not add existing members..
					Collection<?> newMembers = new ArrayList<Object>(collection);
					newMembers.removeAll(group.getMembers());
					if (newMembers.size() > 0) {
						cmd.append(AddCommand.create(domain, group, MetaABMActPackage.Literals.AGROUP__MEMBERS, newMembers));
					}
				}
				for (Object act : collection) {
					reassignSelects(domain, cmd, source, (AAct) act);
				}
				cmd.append(suggestLabelCommand);
				return cmd;
			} else {
				return UnexecutableCommand.INSTANCE;
			}
		} else {
			return super.createAddCommand(domain, owner, feature, collection, index);
		}
	}

	// ActIntermediaryItemProvider registerIntermediary(Object object,
	// EStructuralFeature ref) {
	// ActIntermediaryItemProvider provider = new
	// ActIntermediaryItemProvider(adapterFactory, (AAct) object, ref);
	// providerForFeature.put(MetaABMActPackage.Literals.AGROUP__MEMBERS,
	// provider);
	// return provider;
	// }

	// protected List children = null; // 14.2.3

	// public Collection getChildren(Object object) {
	// if (children == null) {
	// providerForFeature = new HashMap();
	// children = new ArrayList();
	// children.add(registerIntermediary(object,
	// MetaABMActPackage.Literals.AACT__SOURCES));
	// children.add(registerIntermediary(object,
	// MetaABMActPackage.Literals.AACT__TARGETS));
	// }
	// return children;
	// }

	// public Object getProvider(EStructuralFeature feature) {
	// return providerForFeature.get(feature);
	// }

	// protected Command createCreateCopyCommand(EditingDomain domain, EObject
	// owner, Helper helper) {
	// CompoundCommand cmd = new CompoundCommand();
	//
	// CreateCopyCommand createCreateCopyCommand = (CreateCopyCommand) new
	// CreateCopyCommand(domain, owner, helper) {
	//
	// public Collection<?> doGetChildrenToCopy() {
	// Collection<?> children = super.doGetChildrenToCopy();
	// children.addAll((Collection) ((AAct) owner).getAllTargets());
	// return children;
	// }
	//
	// };
	// return createCreateCopyCommand;
	// }
	//
	// protected Command createInitializeCopyCommand(EditingDomain domain,
	// EObject owner, Helper helper) {
	// InitializeCopyCommand createInitializeCopyCommand = new
	// InitializeCopyCommand(domain, owner, helper) {
	//
	// protected void copyReferences() {
	// super.copyReferences();
	// AAct owner = (AAct) getOwner();
	// for (Object object : getAffectedObjects()) {
	// if (object instanceof AAct) {
	// ((AAct) object).eSet(MetaABMActPackage.Literals.AACT__GROUP,
	// owner.getGroup());
	// // owner.getGroup().eSet(MetaABMActPackage.Literals.AGROUP__MEMBERS,
	// ((AAct) object));
	// }
	// }
	// }
	//
	// };
	// return createInitializeCopyCommand;
	// }

	protected Command createSetCommand(EditingDomain domain, EObject owner, EStructuralFeature feature, Object value, int index) {
		AAct actOwner = (AAct) owner;
		if (feature == MetaABMPackage.Literals.IID__LABEL || feature == MetaABMPackage.Literals.SNAMED__PLURAL_LABEL) {
			// createSetCommand.canExecute();
			// force a store of old value..
			CompoundCommand cmd = new CompoundCommand();
			List<SuggestLabelCommand> sugCmds = new ArrayList<SuggestLabelCommand>();
			Collection<AAct> allTargets = actOwner.getAllTargets();
			for (AAct act : allTargets) {
				sugCmds.add(new SuggestLabelCommand(domain, act));
			}
			Command createSetCommand = SetLabelCommand.create(domain, owner, feature, value, index);
			cmd.append(createSetCommand);
			for (SuggestLabelCommand sugCmd : sugCmds) {
				cmd.append(sugCmd);
			}
			return cmd;
		} else if (feature == MetaABMActPackage.Literals.ASINK__FUNCTION || feature == MetaABMActPackage.Literals.AINPUT__LITERAL || feature == MetaABMActPackage.Literals.AACCESSOR__ATTRIBUTE || feature == MetaABMActPackage.Literals.ASET__PARAMETER || feature == MetaABMActPackage.Literals.ABUILD_PROJECTION__PROJECTION || feature == MetaABMActPackage.Literals.ACREATE_AGENTS__AGENT_COUNT || feature == MetaABMActPackage.Literals.ASCHEDULE__PICK || feature == MetaABMActPackage.Literals.ASCHEDULE__PRIORITY || feature == MetaABMActPackage.Literals.ASCHEDULE__INTERVAL || feature == MetaABMActPackage.Literals.ASCHEDULE__START || feature == MetaABMActPackage.Literals.ASET__PARAMETER || feature == MetaABMActPackage.Literals.ASELECT__AGENT || feature == MetaABMActPackage.Literals.ASELECT__FOR
				|| feature == MetaABMActPackage.Literals.ASELECT__SPACE || feature == MetaABMActPackage.Literals.AACT__SELECTED || feature == MetaABMActPackage.Literals.AINPUT__VALUE || feature == MetaABMActPackage.Literals.AINPUT__LITERAL || feature == MetaABMActPackage.Literals.ATRANSFORM__DESTINATION || feature == MetaABMActPackage.Literals.ANETWORK__WITHIN) {
			SuggestLabelCommand suggestLabelCommand = null;
			if (!(owner instanceof ASink && (((ASink) owner).isMultiValue() || feature == MetaABMActPackage.Literals.ASINK__FUNCTION && value instanceof FFunction && ((FFunction) value).isMultiValue()))) {
				suggestLabelCommand = new SuggestLabelCommand(domain, (IID) owner);
			}
			Command createSetCommand = super.createSetCommand(domain, owner, feature, value, index);
			createSetCommand.canExecute();
			// force a store of old value..
			CompoundCommand cmd = new CompoundCommand();
			cmd.append(createSetCommand);
			if (suggestLabelCommand != null) {
				cmd.append(suggestLabelCommand);
			}
			return cmd;
		} else {
			Command createSetCommand = super.createSetCommand(domain, owner, feature, value, index);
			createSetCommand.canExecute();
			return createSetCommand;
		}
	}

	// protected Command createRemoveCommand(EditingDomain domain, EObject
	// owner, EStructuralFeature feature,
	// Collection collection) {
	// return createWrappedCommand(super.createRemoveCommand(domain, owner,
	// feature, collection), owner, feature);
	// }
	//
	// protected Command createAddCommand(EditingDomain domain, EObject owner,
	// EStructuralFeature feature,
	// Collection collection, int index) {
	// return createWrappedCommand(super.createAddCommand(domain, owner,
	// feature, collection, index), owner, feature);
	// }

	protected Command createRemoveCommand(EditingDomain domain, EObject owner, EStructuralFeature feature, Collection<?> collection) {
		if (feature == MetaABMActPackage.Literals.AACT__TARGETS) {
			CompoundCommand cmd = new CompoundCommand();
			for (Object target : collection) {
				if (((AAct) owner).getTargets().contains(target)) {
					cmd.append(new RemoveActTargetsCommand(domain, owner, feature, Collections.singleton(target)));
				}
			}
			return cmd;
			// } else if (feature == MetaABMActPackage.Literals.AACT__TARGETS) {
			// return super.createRemoveCommand(domain, owner, feature,
			// collection);
		}
		return super.createRemoveCommand(domain, owner, feature, collection);
	}

	// protected Command createWrappedCommand(Command command, final EObject
	// owner, final EStructuralFeature feature) {
	// if ((feature == MetaABMActPackage.eINSTANCE.getAAct_Sources())
	// || (feature == MetaABMActPackage.eINSTANCE.getAAct_Targets())
	// || (feature == MetaABMActPackage.eINSTANCE.getAGroup_Members())) {
	// return new CommandWrapper(command) {
	// public Collection getAffectedObjects() {
	// Collection affected = super.getAffectedObjects();
	// if (affected.contains(owner))
	// affected = Collections.singleton(getProvider(feature));
	// return affected;
	// }
	// };
	// } else {
	// return command;
	// }
	// }

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns AAct.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AAct"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		AAct act = (AAct) object;
		String label = act.getLabel();
		if (!(act.getSelected() instanceof ARoot) && act.getSelected() != null) {
			label += " [" + act.getSelected().getLabel() + "]";
		}
		if (act.getSources().size() > 0) {
			String[] terms = new String[act.getSources().size()];
			for (int i = 0; i < terms.length; i++) {
				terms[i] = act.getSources().get(i).getLabel();
			}
			label += "[<-" + StringUtils.join(terms, ",") + "]";
		}
		return label == null || label.length() == 0 ? getString("_UI_" + ((EObject) object).eClass().getName() + "_type") : label;
	}

	// public Object getParent(Object object) {
	// if (object instanceof ActIntermediaryItemProvider) {
	// ActIntermediaryItemProvider act = (ActIntermediaryItemProvider)
	// super.getParent(object);
	// AActItemProvider actItemProvider = (AActItemProvider)
	// adapterFactory.adapt(act,
	// IEditingDomainItemProvider.class);
	// return actItemProvider != null ?
	// actItemProvider.getProvider(act.reference) : null;
	// }
	// return super.getParent(object);
	// }

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached children and by creating a
	 * viewer notification, which it passes to {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);
		AAct act = (AAct) notification.getNotifier();
		ASelect root = act.getRootSelected();
		switch (notification.getFeatureID(AAct.class)) {
			case MetaABMPackage.IID__LABEL:
			case MetaABMPackage.IID__ID:
				// fireNotifyChanged(new ViewerNotification(notification,
				// notification.getNotifier(), true, false));
				ASelect rootSelected = root;
				if (rootSelected != null) { // should only be true for testing..
					for (AAct allTarget : rootSelected.getAllTargets()) {
						if (allTarget != act) {
							fireNotifyChanged(new ViewerNotification(notification, allTarget, false, true));
							if (allTarget instanceof ASink) {
								for (AInput input : ((ASink) allTarget).getInputs()) {
									if (input.getValue() == act) {
										fireNotifyChanged(new ViewerNotification(notification, input, false, true));
									}
								}
							}
						}
					}
				}
				for (Object object : getChildren(notification.getNotifier())) {
					if (object instanceof AActWrapperItemProvider) {
						fireNotifyChanged(new ViewerNotification(notification, object, false, true));
					}
				}
				// fall through to notify
				// return;
			case MetaABMActPackage.AACT__REFERENCE:
			case MetaABMActPackage.AACT__SELECTED:
				fireNotifyChanged(new ViewerNotification(notification, act, false, true));
				return;
			case MetaABMActPackage.AACT__GROUP:
			case MetaABMActPackage.AACT__SOURCES:
			case MetaABMActPackage.AGROUP__MEMBERS:
			case MetaABMActPackage.AACT__TARGETS:
				if (root != null) {
					fireNotifyChanged(new ViewerNotification(notification, root, true, false));
					fireNotifyChanged(new ViewerNotification(notification, root.getAllTargets(), false, true));
				}
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds to the collection of {@link org.eclipse.emf.edit.command.CommandParameter}s describing all of the
	 * children that can be created under this object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		for (EClassifier cl : MetaABMActPackage.eINSTANCE.getEClassifiers()) {
			if (cl instanceof EClass) {
				EClass actClass = (EClass) cl;
				if (MetaABMActPackage.Literals.AACT.isSuperTypeOf(actClass) && !MetaABMActPackage.Literals.AROOT.isSuperTypeOf(actClass) && !actClass.isAbstract()) {
					newChildDescriptors.add(createChildParameter(MetaABMActPackage.Literals.AACT__TARGETS, MetaABMActFactory.eINSTANCE.create(actClass)));
				}
			}
		}
		// // Don't allow creation of roots
	}

	@Override
	protected Object createWrapper(EObject owner, EStructuralFeature feature, Object value, int index) {
		if (!((EReference) feature).isContainment() && value instanceof AAct && !(value instanceof ARoot)) {
			return new AActWrapperItemProvider(value, owner, feature, index, adapterFactory);
		}
		// return super.createWrapper(owner, feature, value, index);
		// return value;
		return value;
	}

	protected boolean isWrappingNeeded(Object object) {
		// if (object instanceof AAct) {
		// return true;
		// }
		return false;// super.isWrappingNeeded(object);
	}

	@Override
	public boolean hasChildren(Object object) {
		// AAct act = (AAct) object;
		// if (act.getTargets().size() <= 1 && (!(object instanceof ASink) || ((ASink) object).getInputs().size() == 0)
		// && !(object instanceof AGroup) && !(object instanceof ARoot)) {
		// return false;
		// }
		return object instanceof ARoot && ((AAct) object).getTargets().size() > 0 || object instanceof AGroup && ((AGroup) object).getMembers().size() > 0;
		// return super.hasChildren(object, false);
	}

	// protected Command wrapCommand(Command command, Object object, Class<?
	// extends Command> commandClass,
	// CommandParameter commandParameter, CommandParameter oldCommandParameter)
	// {
	// System.err.println(commandClass);
	// Command hello = command;
	// // if (hello instanceof CompoundCommand) {
	// // for (Object blah : ((CompoundCommand) hello).getCommandList()) {
	// // System.err.println(blah);
	// // }
	// // }
	// return super.wrapCommand(command, object, commandClass, commandParameter,
	// oldCommandParameter);
	// }
	protected static Collection<ASelect> getSourceSelects(AAct source) {
		Collection<ASelect> allSourceSelects = new HashSet<ASelect>();
		if (source instanceof ASelect) {
			allSourceSelects.add(((ASelect) source));
		} else {
			allSourceSelects.add(source.getSelected());
		}
		for (Object object : source.getAllSources()) {
			if (object instanceof ASelect) {
				allSourceSelects.add(((ASelect) object));
			}
		}
		return allSourceSelects;
	}

	// protected static void checkAllTargetsSelect(EditingDomain domain, CompoundCommand cmd, AAct newSource,
	// AAct movedTarget) {
	// Set<ASelect> allSourceSelects = getSourceSelects(newSource);
	// if (movedTarget instanceof ASelect) {
	// allSourceSelects.add(((ASelect) movedTarget));
	// }
	// for (AAct existingTarget : movedTarget.getAllTargets()) {
	// if (existingTarget instanceof ASelect) {
	// allSourceSelects.add(existingTarget.getSelected());
	// }
	// }
	// for (AAct target : movedTarget.getAllTargets()) {
	// checkSelect(domain, cmd, newSource, allSourceSelects, target);
	// }
	// }

	protected static void reassignSelects(EditingDomain domain, CompoundCommand cmd, AAct newSource, AAct value) {
		ASelect newSelect = null;
		if (newSource instanceof ASelect) {
			newSelect = (ASelect) newSource;
		} else {
			newSelect = newSource.getSelected();
		}
		if (newSelect != null) {
			Collection<ASelect> allSourceSelects = getSourceSelects(newSource);
			reassignSelects(domain, cmd, value, newSelect, allSourceSelects, new HashSet<Object>());
		}
	}

	private static void reassignSelects(EditingDomain domain, CompoundCommand cmd, AAct act, ASelect newSelect, Collection<ASelect> allSourceSelects, Collection<Object> processed) {
		processed.add(act);
		if (act instanceof ATransform) {
			if (act.getSelected() == null || !allSourceSelects.contains(act.getSelected())) {
				cmd.append(SetCommand.create(domain, act, MetaABMActPackage.Literals.AACT__SELECTED, newSelect.getSelected()));
			}
			if (((ATransform) act).getDestination() == null || !allSourceSelects.contains(((ATransform) act).getDestination())) {
				cmd.append(SetCommand.create(domain, act, MetaABMActPackage.Literals.ATRANSFORM__DESTINATION, newSelect));
			}
		} else {
			if (!allSourceSelects.contains(act.getSelected())) {
				cmd.append(SetCommand.create(domain, act, MetaABMActPackage.Literals.AACT__SELECTED, newSelect));
			}
		}
		if (act instanceof ASink) {
			for (AInput input : ((ASink) act).getInputs()) {
				if (!allSourceSelects.contains(input.getSelected()) && !processed.contains(input)) {
					cmd.append(SetCommand.create(domain, input, MetaABMActPackage.Literals.AINPUT__SELECTED, newSelect));
					processed.add(input);
				}
			}
		}
		// if (value instanceof ASet) {
		// if (((ASet) value).getParameter() == null) {
		// if (owner instanceof AEvaluate) {
		// cmd.append(SetCommand.create(domain, value,
		// MetaABMActPackage.Literals.ASET__PARAMETER, owner));
		// }
		// }
		// }
		if (act instanceof ASelect) {
			allSourceSelects.add((ASelect) act);
		}
		for (AAct target : act.getAllTargets()) {
			if (!processed.contains(target)) {
				reassignSelects(domain, cmd, target, newSelect, allSourceSelects, processed);
			}
		}
	}

	protected String suggestSeperatedSourceLabel(Object object, String seperator) {
		AAct source = (AAct) object;
		EList<AAct> sources = source.getSources();
		String label;
		switch (sources.size()) {
			case 0:
				label = seperator + " Undefined";
				break;
			case 1:
				label = "(" + seperator + ") " + StringUtils.strip(sources.get(0).getLabel());
				break;
			default:
				label = "(" + StringUtils.join(labels(sources).iterator(), " " + seperator + " ") + ")";
		}
		// if (source.getSelected() != null && source.getSelected().getLabel() != null) {
		// String selLabel = source.getSelected().getLabel();
		// label = selLabel + " " + label.replace(selLabel + ": ", "");
		// }
		return label;
	}

	@Override
	public String getColumnText(Object object, int columnIndex) {
		if (columnIndex == 0) {
			return ((IID) object).getLabel();
		} else if (columnIndex == 1) {
			if (object instanceof SNamed) {
				return ((SNamed) object).getDescription();
			} else {
				return getText(object);
			}
		}
		return super.getColumnText(object, columnIndex);
	}

	public Object getParent(Object object) {
		if (!(object instanceof ARoot)) {
			EList<AAct> sources = ((AAct) object).getSources();
			if (!sources.isEmpty()) {
				return sources.get(0);
			}
		} else if (object instanceof ARoot) {
			return ((AAct) object).getGroup();
		}
		return super.getParent(object);
	}

	// @Override
	// public Object getBackground(Object object) {
	// AAct act = (AAct) object;
	// if (object instanceof AGroup || act.getSelected() == null || act.getSelected().getSelected() == null
	// || act.getSelected() == act.getSelected().getSelected()) {
	// return super.getBackground(object);
	// }
	// return selectionColor((AAct) object);
	// }

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return MetaABMEditPlugin.INSTANCE;
	}

	public List<AAct> getParents(Object object) {
		if (object instanceof ARoot) {
			Collections.singletonList(((AAct) object).getGroup());
		}
		return ((AAct) object).getSources();
	}

	public String suggestID(IID object) {
		String suggestID = StringUtils.deleteWhitespace(suggestLabel(object));
		suggestID = StringUtils.replaceChars(suggestID, "[]()", null);
		return StringUtils.uncapitalize(suggestID);
	}

}
