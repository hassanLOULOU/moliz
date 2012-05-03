/*
 * Copyright (c) 2012 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Philip Langer - initial API and implementation
 */
package org.modelexecution.fumldebug.debugger.ui.launch;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ResourceListSelectionDialog;
import org.modelexecution.fumldebug.debugger.ActivityProviderRegistry;
import org.modelexecution.fumldebug.debugger.IActivityProvider;
import org.modelexecution.fumldebug.ui.commons.FUMLUICommons;

import fUML.Syntax.Activities.IntermediateActivities.Activity;

public class ActivityMainTab extends AbstractLaunchConfigurationTab {

	private Text resourceText;
	private Button browseResourceButton;
	private Collection<Activity> activities;

	public void createControl(Composite parent) {
		Font font = parent.getFont();
		Composite comp = createContainerComposite(parent, font);

		createResourceSelectionControls(font, comp);
		createActivitySelectionControls(font, comp);

	}

	private Composite createContainerComposite(Composite parent, Font font) {
		Composite comp = new Composite(parent, SWT.NONE);
		setControl(comp);
		GridLayout topLayout = new GridLayout();
		topLayout.verticalSpacing = 0;
		topLayout.numColumns = 3;
		comp.setLayout(topLayout);
		comp.setFont(font);
		createVerticalSpacer(comp, 3);
		return comp;
	}

	private void createResourceSelectionControls(Font font, Composite comp) {
		Label programLabel = new Label(comp, SWT.NONE);
		programLabel.setText("&Resource:");
		GridData gd = new GridData(GridData.BEGINNING);
		programLabel.setLayoutData(gd);
		programLabel.setFont(font);

		resourceText = new Text(comp, SWT.SINGLE | SWT.BORDER);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		resourceText.setLayoutData(gd);
		resourceText.setFont(font);
		resourceText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				updateLaunchConfigurationDialog();
			}
		});

		browseResourceButton = createPushButton(comp, "&Browse", null);
		browseResourceButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				browseResource();
			}
		});
	}

	protected void browseResource() {
		ResourceListSelectionDialog dialog = new ResourceListSelectionDialog(
				getShell(), ResourcesPlugin.getWorkspace().getRoot(),
				IResource.FILE);
		dialog.setTitle("Resource");
		dialog.setMessage("Select a resource to debug");
		if (dialog.open() == Window.OK) {
			Object[] files = dialog.getResult();
			IFile file = (IFile) files[0];
			resourceText.setText(file.getFullPath().toString());
		}

	}

	private void createActivitySelectionControls(Font font, Composite comp) {
		// TODO Auto-generated method stub
		// group Activities
	}

	@Override
	protected void updateLaunchConfigurationDialog() {
		super.updateLaunchConfigurationDialog();
		updateActivities();
	}

	private void updateActivities() {
		ActivityProviderRegistry activityProviderRegistry = ActivityProviderRegistry
				.getInstance();
		IResource iResource = getResource();
		if (activityProviderRegistry.hasActivityProvider(iResource)) {
			IActivityProvider activityProvider = activityProviderRegistry
					.getActivityProvider(iResource);
			activities = activityProvider.getActivities(iResource);
		} else {
			activities = Collections.emptyList();
		}
	}

	protected IResource getResource() {
		return ResourcesPlugin.getWorkspace().getRoot()
				.findMember(resourceText.getText());
	}

	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
	}

	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
		// TODO Auto-generated method stub

	}

	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getName() {
		return "Activity";
	}

	@Override
	public Image getImage() {
		return FUMLUICommons.getImage(FUMLUICommons.IMG_ACTIVITY);
	}

}
