/*
 * Copyright (c) 2012 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Tanja Mayerhofer - initial API and implementation
 */

package org.modelexecution.fumldebug.core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.modelexecution.fumldebug.core.event.ActivityEntryEvent;
import org.modelexecution.fumldebug.core.event.ActivityExitEvent;
import org.modelexecution.fumldebug.core.event.ActivityNodeEntryEvent;
import org.modelexecution.fumldebug.core.event.ActivityNodeExitEvent;
import org.modelexecution.fumldebug.core.event.BreakpointEvent;
import org.modelexecution.fumldebug.core.event.Event;
import org.modelexecution.fumldebug.core.event.ExtensionalValueEvent;
import org.modelexecution.fumldebug.core.event.ExtensionalValueEventType;
import org.modelexecution.fumldebug.core.event.StepEvent;
import org.modelexecution.fumldebug.core.impl.BreakpointImpl;
import org.modelexecution.fumldebug.core.util.ActivityFactory;

import fUML.Semantics.Activities.IntermediateActivities.ActivityExecution;
import fUML.Semantics.Classes.Kernel.ExtensionalValue;
import fUML.Semantics.Classes.Kernel.ExtensionalValueList;
import fUML.Semantics.Classes.Kernel.FeatureValue;
import fUML.Semantics.Classes.Kernel.Link;
import fUML.Semantics.Classes.Kernel.Object_;
import fUML.Semantics.Classes.Kernel.Reference;
import fUML.Semantics.CommonBehaviors.BasicBehaviors.ParameterValueList;
import fUML.Syntax.Actions.CompleteActions.ReclassifyObjectAction;
import fUML.Syntax.Actions.IntermediateActions.ClearAssociationAction;
import fUML.Syntax.Actions.IntermediateActions.CreateLinkAction;
import fUML.Syntax.Actions.IntermediateActions.CreateObjectAction;
import fUML.Syntax.Actions.IntermediateActions.DestroyLinkAction;
import fUML.Syntax.Actions.IntermediateActions.DestroyObjectAction;
import fUML.Syntax.Activities.IntermediateActivities.Activity;
import fUML.Syntax.Activities.IntermediateActivities.ForkNode;
import fUML.Syntax.Classes.Kernel.Association;
import fUML.Syntax.Classes.Kernel.Class_;
import fUML.Syntax.Classes.Kernel.ClassifierList;
import fUML.Syntax.Classes.Kernel.Property;
import fUML.Syntax.Classes.Kernel.PropertyList;
import fUML.Syntax.Classes.Kernel.StructuralFeature;

/**
 * @author Tanja Mayerhofer
 *
 */
public class ExtensionalValueEventsTest extends MolizTest implements ExecutionEventListener{

	private List<Event> eventlist = new ArrayList<Event>();
	private List<ExtensionalValueList> extensionalValueLists = new ArrayList<ExtensionalValueList>();
	
	public ExtensionalValueEventsTest() {
		ExecutionContext.getInstance().getExecutionEventProvider().addEventListener(this);
		ExecutionContext.getInstance().activityExecutionOutput = new HashMap<ActivityExecution, ParameterValueList>();
		ExecutionContext.getInstance().activityExecutions = new HashMap<Integer, ActivityExecution>();
	}
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		eventlist = new ArrayList<Event>();
		extensionalValueLists = new ArrayList<ExtensionalValueList>();
		ExecutionContext.getInstance().reset();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
     * Tests the ExtensionalValueEvents for CreateObjectAction
	 * 
	 * Activity:
	 * CreateObjectAction1 (class = Class1)
	 * CreateObjectAction2 (class = Class2)
	 * 
	 * Activity ControlFlow:
	 * CreateObjectAction1 --> CreateObjectAction2
	 */
	@Test
	public void testCreateObjectAction() {
		Class_ class1 = ActivityFactory.createClass("Class1");
		Class_ class2 = ActivityFactory.createClass("Class2");
		Activity activity = ActivityFactory.createActivity("testCreateObjectAction");
		CreateObjectAction create1 = ActivityFactory.createCreateObjectAction(activity, "CreateObject Class1", class1);
		CreateObjectAction create2 = ActivityFactory.createCreateObjectAction(activity, "CreateObject Class2", class2);
		
		ActivityFactory.createControlFlow(activity, create1, create2);
		
		// Start Debugging
		ExecutionContext.getInstance().debug(activity, null, new ParameterValueList());
				
		assertEquals(2, eventlist.size());
		
		assertTrue(eventlist.get(0) instanceof ActivityEntryEvent);
		ActivityEntryEvent activityentry = ((ActivityEntryEvent)eventlist.get(0));		
		assertEquals(activity, activityentry.getActivity());		
		assertNull(activityentry.getParent());
		
		assertTrue(eventlist.get(1) instanceof StepEvent);
		assertEquals(activity, ((StepEvent)eventlist.get(1)).getLocation());
		
		assertEquals(0, extensionalValueLists.get(extensionalValueLists.size()-1).size());
		
		// Resume Execution
		ExecutionContext.getInstance().resume(activityentry.getActivityExecutionID());
		
		assertEquals(9, eventlist.size());
		
		assertTrue(eventlist.get(2) instanceof ActivityNodeEntryEvent);
		assertEquals(create1, ((ActivityNodeEntryEvent)eventlist.get(2)).getNode());	
		
		assertTrue(eventlist.get(3) instanceof ExtensionalValueEvent);
		assertEquals(ExtensionalValueEventType.CREATION, ((ExtensionalValueEvent)eventlist.get(3)).getType());
		ExtensionalValue value1 =  ((ExtensionalValueEvent)eventlist.get(3)).getExtensionalValue();
		assertTrue(value1 instanceof Object_);
		assertEquals(1, value1.getTypes().size());
		assertEquals(class1, value1.getTypes().get(0));
				
		assertTrue(eventlist.get(4) instanceof ActivityNodeExitEvent);
		assertEquals(create1, ((ActivityNodeExitEvent)eventlist.get(4)).getNode());
					
		assertTrue(eventlist.get(5) instanceof ActivityNodeEntryEvent);
		assertEquals(create2, ((ActivityNodeEntryEvent)eventlist.get(5)).getNode());	
		
		assertTrue(eventlist.get(6) instanceof ExtensionalValueEvent);
		assertEquals(ExtensionalValueEventType.CREATION, ((ExtensionalValueEvent)eventlist.get(6)).getType());
		ExtensionalValue value2 =  ((ExtensionalValueEvent)eventlist.get(6)).getExtensionalValue();
		assertTrue(value2 instanceof Object_);
		assertEquals(1, value2.getTypes().size());
		assertEquals(class2, value2.getTypes().get(0));
				
		assertTrue(eventlist.get(7) instanceof ActivityNodeExitEvent);
		assertEquals(create2, ((ActivityNodeExitEvent)eventlist.get(7)).getNode());
		
		assertTrue(eventlist.get(8) instanceof ActivityExitEvent);
		assertEquals(activity, ((ActivityExitEvent)eventlist.get(8)).getActivity());
		assertEquals(activityentry, ((ActivityExitEvent)eventlist.get(8)).getParent());
		
		assertEquals(2, extensionalValueLists.get(extensionalValueLists.size()-1).size());		
	}
	
	/**
     * Tests the ExtensionalValueEvents for CreateLinkAction
	 * 
	 * Activity:
	 * CreateObjectAction Student (class = Student (properties: vorlesungen:Vorlesung[*]))
	 * CreateObjectAction Vorlesung (class = Vorlesung (properties: studenten:Student[*]))
	 * CreateLinkAction 
	 * 
	 * Activity DataFlow:
	 * CreateObjectAction Student target --> CreateLinkAction input
	 * CreateObjectAction Vorlesung target --> CreateLinkAction input
	 */
	@Test
	public void testCreateLinkAction() {
		Class_ student = ActivityFactory.createClass("Student");		
		Class_ vorlesung = ActivityFactory.createClass("Vorlesung");
		
		Property vorlesungen = ActivityFactory.createProperty("vorlesungen", 0, -1, vorlesung, student);
		Property studenten = ActivityFactory.createProperty("studenten", 0, -1, student, vorlesung);
		PropertyList members = new PropertyList();
		members.add(vorlesungen);
		members.add(studenten);
		Association student2vorlesung = ActivityFactory.createAssociation("student2vorlesung", members);
		
		Activity activity = ActivityFactory.createActivity("testCreateLinkAction");
				
		CreateObjectAction createstudent = ActivityFactory.createCreateObjectAction(activity, "CreateObject Student", student);
		CreateObjectAction createvorlesung = ActivityFactory.createCreateObjectAction(activity, "CreateObject Vorlesung", vorlesung);
		CreateLinkAction createlinkaction = ActivityFactory.createCreateLinkAction(activity, "CreateLink student2vorlesung", members);
		
		ActivityFactory.createObjectFlow(activity, createvorlesung.result, createlinkaction.input.get(0));
		ActivityFactory.createObjectFlow(activity, createstudent.result, createlinkaction.input.get(1));
		
		// Start Debugging
		ExecutionContext.getInstance().debug(activity, null, new ParameterValueList());
				
		assertEquals(2, eventlist.size());
		
		assertTrue(eventlist.get(0) instanceof ActivityEntryEvent);
		ActivityEntryEvent activityentry = ((ActivityEntryEvent)eventlist.get(0));		
		assertEquals(activity, activityentry.getActivity());		
		assertNull(activityentry.getParent());
		
		assertTrue(eventlist.get(1) instanceof StepEvent);
		assertEquals(activity, ((StepEvent)eventlist.get(1)).getLocation());
		
		assertEquals(0, extensionalValueLists.get(extensionalValueLists.size()-1).size());
		
		// Resume Execution
		ExecutionContext.getInstance().resume(activityentry.getActivityExecutionID());
		
		assertEquals(12, eventlist.size());
		
		assertTrue(eventlist.get(2) instanceof ActivityNodeEntryEvent);
		assertEquals(createstudent, ((ActivityNodeEntryEvent)eventlist.get(2)).getNode());	
		
		assertTrue(eventlist.get(3) instanceof ExtensionalValueEvent);
		assertEquals(ExtensionalValueEventType.CREATION, ((ExtensionalValueEvent)eventlist.get(3)).getType());
		Object_ stud_obj =  (Object_)((ExtensionalValueEvent)eventlist.get(3)).getExtensionalValue();
		assertEquals(student, stud_obj.getTypes().get(0));
				
		assertTrue(eventlist.get(4) instanceof ActivityNodeExitEvent);
		assertEquals(createstudent, ((ActivityNodeExitEvent)eventlist.get(4)).getNode());
					
		assertTrue(eventlist.get(5) instanceof ActivityNodeEntryEvent);
		assertEquals(createvorlesung, ((ActivityNodeEntryEvent)eventlist.get(5)).getNode());	
		
		assertTrue(eventlist.get(6) instanceof ExtensionalValueEvent);
		assertEquals(ExtensionalValueEventType.CREATION, ((ExtensionalValueEvent)eventlist.get(6)).getType());
		Object_ vo_obj =  (Object_)((ExtensionalValueEvent)eventlist.get(6)).getExtensionalValue();
		assertEquals(vorlesung, vo_obj.getTypes().get(0));
				
		assertTrue(eventlist.get(7) instanceof ActivityNodeExitEvent);
		assertEquals(createvorlesung, ((ActivityNodeExitEvent)eventlist.get(7)).getNode());
		
		assertTrue(eventlist.get(8) instanceof ActivityNodeEntryEvent);
		assertEquals(createlinkaction, ((ActivityNodeEntryEvent)eventlist.get(8)).getNode());	
		
		assertTrue(eventlist.get(9) instanceof ExtensionalValueEvent);
		assertEquals(ExtensionalValueEventType.CREATION, ((ExtensionalValueEvent)eventlist.get(9)).getType());
		Link link =  (Link)(((ExtensionalValueEvent)eventlist.get(9)).getExtensionalValue());
		List<StructuralFeature> values_expected = new ArrayList<StructuralFeature>();
		values_expected.add(vorlesungen);
		values_expected.add(studenten);
		List<Object_> objects_expected = new ArrayList<Object_>();
		objects_expected.add(vo_obj);
		objects_expected.add(stud_obj);
		checkLink(student2vorlesung, link, values_expected, objects_expected);
		/*
		ExtensionalValue link =  ((ExtensionalValueEvent)eventlist.get(9)).getExtensionalValue();
		assertTrue(link instanceof Link);
		assertEquals(student2vorlesung, ((Link)link).type);
		assertEquals(2, ((Link)link).featureValues.size());		
		FeatureValue vo = null;
		FeatureValue stud = null;
		for(int i=0;i<((Link)link).featureValues.size();++i) {
			if(((Link)link).featureValues.get(i).feature.equals(vorlesungen)) {
				vo = ((Link)link).featureValues.get(i);
			} else if(((Link)link).featureValues.get(i).feature.equals(studenten)) {
				stud = ((Link)link).featureValues.get(i);
			}
		}		
		assertNotNull(vo);
		assertNotNull(stud);
		assertEquals(1, vo.values.size());
		assertEquals(1, stud.values.size());
		Object_ link_studobj = ((Reference)stud.values.get(0)).referent;
		Object_ link_voobj = ((Reference)vo.values.get(0)).referent;
		assertEquals(vo_obj, link_voobj);
		assertEquals(stud_obj, link_studobj);		
				*/
		assertTrue(eventlist.get(10) instanceof ActivityNodeExitEvent);
		assertEquals(createlinkaction, ((ActivityNodeExitEvent)eventlist.get(10)).getNode());
		
		assertTrue(eventlist.get(11) instanceof ActivityExitEvent);
		assertEquals(activity, ((ActivityExitEvent)eventlist.get(11)).getActivity());
		assertEquals(activityentry, ((ActivityExitEvent)eventlist.get(11)).getParent());
		
		assertEquals(3, extensionalValueLists.get(extensionalValueLists.size()-1).size());		
	}
	
	/**
     * Tests the ExtensionalValueEvents for DestroyObjectAction
	 * 
	 * Activity:
	 * CreateObjectAction1 (class = Class1)
	 * CreateObjectAction2 (class = Class2)
	 * DestroyObjectAction (object from CreateObjectAction1) 
	 * 
	 * Activity DataFlow:
	 * CreateObjectAction1 result --> CreateObjectAction2 target
	 * 
	 * ActivityControlFlow:
	 * CreateObjectAction1 --> CreateObjectAction2
	 * CreateObjectAction2 --> DestroyObjectAction
	 */
	@Test
	public void testDestroyObjectAction() {
		Class_ class1 = ActivityFactory.createClass("Class1");		
		Class_ class2 = ActivityFactory.createClass("Class2");
				
		Activity activity = ActivityFactory.createActivity("testDestroyObjectAction");
				
		CreateObjectAction create1 = ActivityFactory.createCreateObjectAction(activity, "CreateObject Class1", class1);
		CreateObjectAction create2 = ActivityFactory.createCreateObjectAction(activity, "CreateObject Class2", class2);		
		DestroyObjectAction destroyobjectaction = ActivityFactory.createDestroyObjectAction(activity, "DestroyObject Class1", false, false);
		
		ActivityFactory.createObjectFlow(activity, create1.result, destroyobjectaction.target);
		ActivityFactory.createControlFlow(activity, create1, create2);
		ActivityFactory.createControlFlow(activity, create2, destroyobjectaction);
		
		// Set Breakpoint
		BreakpointImpl breakdestroyaction = new BreakpointImpl(destroyobjectaction);
		ExecutionContext.getInstance().addBreakpoint(breakdestroyaction);

		// Start Debugging
		ExecutionContext.getInstance().debug(activity, null, new ParameterValueList());
				
		assertEquals(2, eventlist.size());
		
		assertTrue(eventlist.get(0) instanceof ActivityEntryEvent);
		ActivityEntryEvent activityentry = ((ActivityEntryEvent)eventlist.get(0));		
		assertEquals(activity, activityentry.getActivity());		
		assertNull(activityentry.getParent());
		
		assertTrue(eventlist.get(1) instanceof StepEvent);
		assertEquals(activity, ((StepEvent)eventlist.get(1)).getLocation());
		
		assertEquals(0, extensionalValueLists.get(extensionalValueLists.size()-1).size());
		
		// Resume Execution
		ExecutionContext.getInstance().resume(activityentry.getActivityExecutionID());
		
		assertEquals(10, eventlist.size());
		
		assertTrue(eventlist.get(2) instanceof ActivityNodeEntryEvent);
		assertEquals(create1, ((ActivityNodeEntryEvent)eventlist.get(2)).getNode());	
		
		assertTrue(eventlist.get(3) instanceof ExtensionalValueEvent);
		assertEquals(ExtensionalValueEventType.CREATION, ((ExtensionalValueEvent)eventlist.get(3)).getType());
		Object_ obj1 =  (Object_)((ExtensionalValueEvent)eventlist.get(3)).getExtensionalValue();
		assertEquals(class1, obj1.getTypes().get(0));
				
		assertTrue(eventlist.get(4) instanceof ActivityNodeExitEvent);
		assertEquals(create1, ((ActivityNodeExitEvent)eventlist.get(4)).getNode());
					
		assertTrue(eventlist.get(5) instanceof ActivityNodeEntryEvent);
		assertEquals(create2, ((ActivityNodeEntryEvent)eventlist.get(5)).getNode());	
		
		assertTrue(eventlist.get(6) instanceof ExtensionalValueEvent);
		assertEquals(ExtensionalValueEventType.CREATION, ((ExtensionalValueEvent)eventlist.get(6)).getType());
		Object_ obj2 =  (Object_)((ExtensionalValueEvent)eventlist.get(6)).getExtensionalValue();
		assertEquals(class2, obj2.getTypes().get(0));
				
		assertTrue(eventlist.get(7) instanceof ActivityNodeExitEvent);
		assertEquals(create2, ((ActivityNodeExitEvent)eventlist.get(7)).getNode());
		
		assertTrue(eventlist.get(8) instanceof BreakpointEvent);
		assertEquals(breakdestroyaction, ((BreakpointEvent)eventlist.get(8)).getBreakpoint());
		
		assertTrue(eventlist.get(9) instanceof StepEvent);
		StepEvent step = ((StepEvent)eventlist.get(9));
		assertEquals(create2, step.getLocation());
		assertEquals(activityentry, step.getParent());
		assertEquals(1, step.getNewEnabledNodes().size());
		assertEquals(destroyobjectaction, step.getNewEnabledNodes().get(0));
		
		assertEquals(2, extensionalValueLists.get(extensionalValueLists.size()-1).size());
		
		// Resume Execution
		ExecutionContext.getInstance().resume(activityentry.getActivityExecutionID());
		
		assertEquals(14, eventlist.size());
		
		assertTrue(eventlist.get(10) instanceof ActivityNodeEntryEvent);
		assertEquals(destroyobjectaction, ((ActivityNodeEntryEvent)eventlist.get(10)).getNode());	
		
		assertTrue(eventlist.get(11) instanceof ExtensionalValueEvent);
		assertEquals(ExtensionalValueEventType.DESTRUCTION, ((ExtensionalValueEvent)eventlist.get(11)).getType());
		assertEquals(obj1, ((ExtensionalValueEvent)eventlist.get(11)).getExtensionalValue());
		
		assertTrue(eventlist.get(12) instanceof ActivityNodeExitEvent);
		assertEquals(destroyobjectaction, ((ActivityNodeExitEvent)eventlist.get(12)).getNode());
		
		assertTrue(eventlist.get(13) instanceof ActivityExitEvent);
		assertEquals(activity, ((ActivityExitEvent)eventlist.get(13)).getActivity());
		assertEquals(activityentry, ((ActivityExitEvent)eventlist.get(13)).getParent());
		
		assertEquals(1, extensionalValueLists.get(extensionalValueLists.size()-1).size());		
	}
	
	/**
     * Tests the ExtensionalValueEvents for DestroyLinkAction
	 * 
	 * Activity:
	 * CreateObjectAction Student (class = Student (properties: vorlesungen:Vorlesung[*]))
	 * CreateObjectAction Vorlesung (class = Vorlesung (properties: studenten:Student[*]))
	 * ForkNode Student
	 * ForkNode Vorlesung
	 * CreateLinkAction 
	 * DestroyLinkAction
	 * 
	 * Activity DataFlow:
	 * CreateObjectAction Student target --> ForkNode Student
	 * CreateObjectAction Vorlesung target --> ForkNode Vorlesung
	 * 
	 * ForkNode Student --> CreateLinkAction input
	 * ForkNode Vorlesung --> CreateLinkAction input
	 * 
	 * ForkNode Student --> DestroyLinkAction input
	 * ForkNode Vorlesung --> DestroyLinkAction input
	 * 
	 * Activity ControlFlow:
	 * CreateLinkAction --> DestroyLinkAction
	 */
	@Test
	public void testDestroyLinkAction() {
		Class_ student = ActivityFactory.createClass("Student");		
		Class_ vorlesung = ActivityFactory.createClass("Vorlesung");
		
		Property vorlesungen = ActivityFactory.createProperty("vorlesungen", 0, -1, vorlesung, student);
		Property studenten = ActivityFactory.createProperty("studenten", 0, -1, student, vorlesung);
		PropertyList members = new PropertyList();
		members.add(vorlesungen);
		members.add(studenten);
		Association student2vorlesung = ActivityFactory.createAssociation("student2vorlesung", members);
		
		Activity activity = ActivityFactory.createActivity("testDestroyLinkAction");
				
		CreateObjectAction createstudent = ActivityFactory.createCreateObjectAction(activity, "CreateObject Student", student);
		CreateObjectAction createvorlesung = ActivityFactory.createCreateObjectAction(activity, "CreateObject Vorlesung", vorlesung);
		
		ForkNode forkstudent = ActivityFactory.createForkNode(activity, "Fork Student");
		ForkNode forkvorlesung = ActivityFactory.createForkNode(activity, "Fork Vorlesung");
		
		CreateLinkAction createlinkaction = ActivityFactory.createCreateLinkAction(activity, "CreateLink student2vorlesung", members);
		DestroyLinkAction destroylinkaction = ActivityFactory.createDestroyLinkAction(activity, "DestroyLink student2vorlesung", members);
		
		ActivityFactory.createObjectFlow(activity, createvorlesung.result, forkvorlesung);
		ActivityFactory.createObjectFlow(activity, createstudent.result, forkstudent);
		
		ActivityFactory.createObjectFlow(activity, forkvorlesung, createlinkaction.input.get(0));
		ActivityFactory.createObjectFlow(activity, forkstudent, createlinkaction.input.get(1));
		
		ActivityFactory.createObjectFlow(activity, forkvorlesung, destroylinkaction.input.get(0));
		ActivityFactory.createObjectFlow(activity, forkstudent, destroylinkaction.input.get(1));
		
		ActivityFactory.createControlFlow(activity, createlinkaction, destroylinkaction);
		
		// Set Breakpoint for DestroyLinkAction
		Breakpoint breakpoint = new BreakpointImpl(destroylinkaction);
		ExecutionContext.getInstance().addBreakpoint(breakpoint);		
		
		// Start Debugging
		ExecutionContext.getInstance().debug(activity, null, new ParameterValueList());
				
		assertEquals(2, eventlist.size());
		
		assertTrue(eventlist.get(0) instanceof ActivityEntryEvent);
		ActivityEntryEvent activityentry = ((ActivityEntryEvent)eventlist.get(0));		
		assertEquals(activity, activityentry.getActivity());		
		assertNull(activityentry.getParent());
		
		assertTrue(eventlist.get(1) instanceof StepEvent);
		assertEquals(activity, ((StepEvent)eventlist.get(1)).getLocation());
		
		assertEquals(0, extensionalValueLists.get(extensionalValueLists.size()-1).size());
		
		// Resume Execution
		ExecutionContext.getInstance().resume(activityentry.getActivityExecutionID());
		
		assertEquals(17, eventlist.size());
		
		assertTrue(eventlist.get(2) instanceof ActivityNodeEntryEvent);
		assertEquals(createstudent, ((ActivityNodeEntryEvent)eventlist.get(2)).getNode());	
		
		assertTrue(eventlist.get(3) instanceof ExtensionalValueEvent);
		assertEquals(ExtensionalValueEventType.CREATION, ((ExtensionalValueEvent)eventlist.get(3)).getType());
		Object_ stud_obj =  (Object_)((ExtensionalValueEvent)eventlist.get(3)).getExtensionalValue();
		assertEquals(student, stud_obj.getTypes().get(0));
				
		assertTrue(eventlist.get(4) instanceof ActivityNodeExitEvent);
		assertEquals(createstudent, ((ActivityNodeExitEvent)eventlist.get(4)).getNode());
	
		assertTrue(eventlist.get(5) instanceof ActivityNodeEntryEvent);
		assertEquals(createvorlesung, ((ActivityNodeEntryEvent)eventlist.get(5)).getNode());	
		
		assertTrue(eventlist.get(6) instanceof ExtensionalValueEvent);
		assertEquals(ExtensionalValueEventType.CREATION, ((ExtensionalValueEvent)eventlist.get(6)).getType());
		Object_ vo_obj =  (Object_)((ExtensionalValueEvent)eventlist.get(6)).getExtensionalValue();
		assertEquals(vorlesung, vo_obj.getTypes().get(0));						
		
		assertTrue(eventlist.get(7) instanceof ActivityNodeExitEvent);
		assertEquals(createvorlesung, ((ActivityNodeExitEvent)eventlist.get(7)).getNode());	
		
		assertTrue(eventlist.get(8) instanceof ActivityNodeEntryEvent);
		assertEquals(forkstudent, ((ActivityNodeEntryEvent)eventlist.get(8)).getNode());
		
		assertTrue(eventlist.get(9) instanceof ActivityNodeExitEvent);
		assertEquals(forkstudent, ((ActivityNodeExitEvent)eventlist.get(9)).getNode());
		
		assertTrue(eventlist.get(10) instanceof ActivityNodeEntryEvent);
		assertEquals(forkvorlesung, ((ActivityNodeEntryEvent)eventlist.get(10)).getNode());
		
		assertTrue(eventlist.get(11) instanceof ActivityNodeExitEvent);
		assertEquals(forkvorlesung, ((ActivityNodeExitEvent)eventlist.get(11)).getNode());	
		
		assertTrue(eventlist.get(12) instanceof ActivityNodeEntryEvent);
		assertEquals(createlinkaction, ((ActivityNodeEntryEvent)eventlist.get(12)).getNode());	
		
		assertTrue(eventlist.get(13) instanceof ExtensionalValueEvent);
		assertEquals(ExtensionalValueEventType.CREATION, ((ExtensionalValueEvent)eventlist.get(13)).getType());
		Link link =  (Link)((ExtensionalValueEvent)eventlist.get(13)).getExtensionalValue();
		List<StructuralFeature> values_expected = new ArrayList<StructuralFeature>();
		values_expected.add(vorlesungen);
		values_expected.add(studenten);
		List<Object_> objects_expected = new ArrayList<Object_>();
		objects_expected.add(vo_obj);
		objects_expected.add(stud_obj);
		checkLink(student2vorlesung, link, values_expected, objects_expected);

		assertTrue(eventlist.get(14) instanceof ActivityNodeExitEvent);
		assertEquals(createlinkaction, ((ActivityNodeExitEvent)eventlist.get(14)).getNode());
		
		assertTrue(eventlist.get(15) instanceof BreakpointEvent);
		assertEquals(breakpoint, ((BreakpointEvent)eventlist.get(15)).getBreakpoint());
		
		assertTrue(eventlist.get(16) instanceof StepEvent);
		StepEvent step = ((StepEvent)eventlist.get(16));
		assertEquals(createlinkaction, step.getLocation());
		assertEquals(activityentry, step.getParent());
		assertEquals(1, step.getNewEnabledNodes().size());
		assertEquals(destroylinkaction, step.getNewEnabledNodes().get(0));
		
		assertEquals(3, extensionalValueLists.get(extensionalValueLists.size()-1).size());
		
		// Resume Execution
		ExecutionContext.getInstance().resume(activityentry.getActivityExecutionID());
		
		assertEquals(21, eventlist.size());
		
		assertTrue(eventlist.get(17) instanceof ActivityNodeEntryEvent);
		assertEquals(destroylinkaction, ((ActivityNodeEntryEvent)eventlist.get(17)).getNode());	
		
		assertTrue(eventlist.get(18) instanceof ExtensionalValueEvent);
		assertEquals(ExtensionalValueEventType.DESTRUCTION, ((ExtensionalValueEvent)eventlist.get(18)).getType());
		link =  (Link)((ExtensionalValueEvent)eventlist.get(18)).getExtensionalValue();		
		checkLink(null, link, values_expected, objects_expected);

		assertTrue(eventlist.get(19) instanceof ActivityNodeExitEvent);
		assertEquals(destroylinkaction, ((ActivityNodeExitEvent)eventlist.get(19)).getNode());
		
		assertTrue(eventlist.get(20) instanceof ActivityExitEvent);
		assertEquals(activity, ((ActivityExitEvent)eventlist.get(20)).getActivity());
		assertEquals(activityentry, ((ActivityExitEvent)eventlist.get(20)).getParent());
		
		assertEquals(2, extensionalValueLists.get(extensionalValueLists.size()-1).size());		
	}
	
	/**
     * Tests the ExtensionalValueEvents for ClearAssociationAction
	 * 
	 * Activity:
	 * CreateObjectAction Student (class = Student (properties: vorlesungen:Vorlesung[*]))
	 * CreateObjectAction Vorlesung 1 (class = Vorlesung (properties: studenten:Student[*]))
	 * CreateObjectAction Vorlesung 2 (class = Vorlesung (properties: studenten:Student[*]))
	 * ForkNode Student
	 * CreateLinkAction1 Student - Vorlesung 1
	 * CreateLinkAction2 Student - Vorlesung 2
	 * ClearAssociationAction (Association between Student and Vorlesung)
	 * 
	 * Activity DataFlow:
	 * CreateObjectAction Student result --> ForkNode Student
	 * ForkNode Student --> CreateLinkAction1 input
	 * ForkNode Student --> CreateLinkAction2 input
	 * ForkNode Student --> ClearAssociationAction) 
	 * CreateObjectAction Vorlesung 1 result --> CreateLinkAction1 input
	 * CreateObjectAction Vorlesung 2 result --> CreateLinkAction2 input
	 * 
	 * 
	 * Activity ControlFlow:
	 * CreateObjectAction Student --> CreateObjectACtion Vorlesung1
	 * CreateObjectACtion Vorlesung1 --> CreateObjectACtion Vorlesung2
	 * CreateLinkAction1 --> ClearAssociationAction
	 * CreateLinkAction2 --> ClearAssociationAction
	 */
	@Test
	public void testClearAssociationAction() {
		Class_ student = ActivityFactory.createClass("Student");		
		Class_ vorlesung = ActivityFactory.createClass("Vorlesung");
		
		Property vorlesungen = ActivityFactory.createProperty("vorlesungen", 0, -1, vorlesung, student);
		Property studenten = ActivityFactory.createProperty("studenten", 0, -1, student, vorlesung);
		PropertyList members = new PropertyList();
		members.add(vorlesungen);
		members.add(studenten);
		Association student2vorlesung = ActivityFactory.createAssociation("student2vorlesung", members);
		
		Activity activity = ActivityFactory.createActivity("testClearAssociationAction");
				
		CreateObjectAction createstudent = ActivityFactory.createCreateObjectAction(activity, "CreateObject Student", student);
		CreateObjectAction createvorlesung1 = ActivityFactory.createCreateObjectAction(activity, "CreateObject Vorlesung", vorlesung);
		CreateObjectAction createvorlesung2 = ActivityFactory.createCreateObjectAction(activity, "CreateObject Vorlesung 2", vorlesung);
		
		ForkNode forkstudent = ActivityFactory.createForkNode(activity, "Fork Student");
		
		CreateLinkAction createlinkaction1 = ActivityFactory.createCreateLinkAction(activity, "CreateLink student2vorlesung", members);
		CreateLinkAction createlinkaction2 = ActivityFactory.createCreateLinkAction(activity, "CreateLink student2vorlesung", members);
		
		ClearAssociationAction clearassociation = ActivityFactory.createClearAssociationAction(activity, "Clear Association", student2vorlesung);
		
		ActivityFactory.createObjectFlow(activity, createstudent.result, forkstudent);
		ActivityFactory.createObjectFlow(activity, forkstudent, createlinkaction1.input.get(1));
		ActivityFactory.createObjectFlow(activity, forkstudent, createlinkaction2.input.get(1));
		ActivityFactory.createObjectFlow(activity, forkstudent, clearassociation.input.get(0));
		
		ActivityFactory.createObjectFlow(activity, createvorlesung1.result, createlinkaction1.input.get(0));
		ActivityFactory.createObjectFlow(activity, createvorlesung2.result, createlinkaction2.input.get(0));		
		
		ActivityFactory.createControlFlow(activity, createstudent, createvorlesung1);
		ActivityFactory.createControlFlow(activity, createstudent, createvorlesung2);
		ActivityFactory.createControlFlow(activity, createlinkaction1, clearassociation);
		ActivityFactory.createControlFlow(activity, createlinkaction2, clearassociation);
		
		// Set Breakpoint for ClearAssociationAction
		Breakpoint breakpoint = new BreakpointImpl(clearassociation);
		ExecutionContext.getInstance().addBreakpoint(breakpoint);		
		
		// Start Debugging
		ExecutionContext.getInstance().debug(activity, null, new ParameterValueList());
				
		assertEquals(2, eventlist.size());
		
		assertTrue(eventlist.get(0) instanceof ActivityEntryEvent);
		ActivityEntryEvent activityentry = ((ActivityEntryEvent)eventlist.get(0));		
		assertEquals(activity, activityentry.getActivity());		
		assertNull(activityentry.getParent());
		
		assertTrue(eventlist.get(1) instanceof StepEvent);
		assertEquals(activity, ((StepEvent)eventlist.get(1)).getLocation());
		
		assertEquals(0, extensionalValueLists.get(extensionalValueLists.size()-1).size());
		
		// Resume Execution
		ExecutionContext.getInstance().resume(activityentry.getActivityExecutionID());
		
		assertEquals(21, eventlist.size());
		
		assertTrue(eventlist.get(2) instanceof ActivityNodeEntryEvent);
		assertEquals(createstudent, ((ActivityNodeEntryEvent)eventlist.get(2)).getNode());	
		
		assertTrue(eventlist.get(3) instanceof ExtensionalValueEvent);
		assertEquals(ExtensionalValueEventType.CREATION, ((ExtensionalValueEvent)eventlist.get(3)).getType());
		Object_ stud_obj =  (Object_)((ExtensionalValueEvent)eventlist.get(3)).getExtensionalValue();
		assertEquals(student, stud_obj.getTypes().get(0));
				
		assertTrue(eventlist.get(4) instanceof ActivityNodeExitEvent);
		assertEquals(createstudent, ((ActivityNodeExitEvent)eventlist.get(4)).getNode());
	
		assertTrue(eventlist.get(5) instanceof ActivityNodeEntryEvent);
		assertEquals(forkstudent, ((ActivityNodeEntryEvent)eventlist.get(5)).getNode());
		
		assertTrue(eventlist.get(6) instanceof ActivityNodeExitEvent);
		assertEquals(forkstudent, ((ActivityNodeExitEvent)eventlist.get(6)).getNode());	
		
		assertTrue(eventlist.get(7) instanceof ActivityNodeEntryEvent);
		assertEquals(createvorlesung1, ((ActivityNodeEntryEvent)eventlist.get(7)).getNode());	
		
		assertTrue(eventlist.get(8) instanceof ExtensionalValueEvent);
		assertEquals(ExtensionalValueEventType.CREATION, ((ExtensionalValueEvent)eventlist.get(8)).getType());
		Object_ vo1_obj =  (Object_)((ExtensionalValueEvent)eventlist.get(8)).getExtensionalValue();
		assertEquals(vorlesung, vo1_obj.getTypes().get(0));						
		
		assertTrue(eventlist.get(9) instanceof ActivityNodeExitEvent);
		assertEquals(createvorlesung1, ((ActivityNodeExitEvent)eventlist.get(9)).getNode());	
		
		assertTrue(eventlist.get(10) instanceof ActivityNodeEntryEvent);
		assertEquals(createvorlesung2, ((ActivityNodeEntryEvent)eventlist.get(10)).getNode());
		
		assertTrue(eventlist.get(11) instanceof ExtensionalValueEvent);
		assertEquals(ExtensionalValueEventType.CREATION, ((ExtensionalValueEvent)eventlist.get(11)).getType());
		Object_ vo2_obj =  (Object_)((ExtensionalValueEvent)eventlist.get(11)).getExtensionalValue();
		assertEquals(vorlesung, vo2_obj.getTypes().get(0));			
		
		assertTrue(eventlist.get(12) instanceof ActivityNodeExitEvent);
		assertEquals(createvorlesung2, ((ActivityNodeExitEvent)eventlist.get(12)).getNode());
			
		assertTrue(eventlist.get(13) instanceof ActivityNodeEntryEvent);
		assertEquals(createlinkaction1, ((ActivityNodeEntryEvent)eventlist.get(13)).getNode());	
		
		assertTrue(eventlist.get(14) instanceof ExtensionalValueEvent);
		assertEquals(ExtensionalValueEventType.CREATION, ((ExtensionalValueEvent)eventlist.get(14)).getType());
		
		Link link =  (Link)((ExtensionalValueEvent)eventlist.get(14)).getExtensionalValue();
		List<StructuralFeature> values_expected = new ArrayList<StructuralFeature>();
		values_expected.add(vorlesungen);
		values_expected.add(studenten);
		List<Object_> objects_expected_link1 = new ArrayList<Object_>();
		objects_expected_link1.add(vo1_obj);
		objects_expected_link1.add(stud_obj);
		checkLink(student2vorlesung, link, values_expected, objects_expected_link1);		
				
		assertTrue(eventlist.get(15) instanceof ActivityNodeExitEvent);
		assertEquals(createlinkaction1, ((ActivityNodeExitEvent)eventlist.get(15)).getNode());
		
		assertTrue(eventlist.get(16) instanceof ActivityNodeEntryEvent);
		assertEquals(createlinkaction2, ((ActivityNodeEntryEvent)eventlist.get(16)).getNode());	
		
		assertTrue(eventlist.get(17) instanceof ExtensionalValueEvent);
		assertEquals(ExtensionalValueEventType.CREATION, ((ExtensionalValueEvent)eventlist.get(17)).getType());
		link =  (Link) ((ExtensionalValueEvent)eventlist.get(17)).getExtensionalValue();
		List<Object_> objects_expected_link2 = new ArrayList<Object_>();
		objects_expected_link2.add(vo2_obj);
		objects_expected_link2.add(stud_obj);
		checkLink(student2vorlesung, link, values_expected, objects_expected_link2);				
				
		assertTrue(eventlist.get(18) instanceof ActivityNodeExitEvent);
		assertEquals(createlinkaction2, ((ActivityNodeExitEvent)eventlist.get(18)).getNode());
		
		assertTrue(eventlist.get(19) instanceof BreakpointEvent);
		assertEquals(breakpoint, ((BreakpointEvent)eventlist.get(19)).getBreakpoint());
		
		assertTrue(eventlist.get(20) instanceof StepEvent);
		StepEvent step = ((StepEvent)eventlist.get(20));
		assertEquals(createlinkaction2, step.getLocation());
		assertEquals(activityentry, step.getParent());
		assertEquals(1, step.getNewEnabledNodes().size());
		assertEquals(clearassociation, step.getNewEnabledNodes().get(0));
		
		assertEquals(5, extensionalValueLists.get(extensionalValueLists.size()-1).size());
		
		// Resume Execution
		ExecutionContext.getInstance().resume(activityentry.getActivityExecutionID());
		
		assertEquals(26, eventlist.size());
		
		assertTrue(eventlist.get(21) instanceof ActivityNodeEntryEvent);
		assertEquals(clearassociation, ((ActivityNodeEntryEvent)eventlist.get(21)).getNode());	
		
		assertTrue(eventlist.get(22) instanceof ExtensionalValueEvent);
		assertEquals(ExtensionalValueEventType.DESTRUCTION, ((ExtensionalValueEvent)eventlist.get(22)).getType());
		link = (Link)((ExtensionalValueEvent)eventlist.get(22)).getExtensionalValue();
		checkLink(null, link, values_expected, objects_expected_link1);	
		
		assertTrue(eventlist.get(23) instanceof ExtensionalValueEvent);
		assertEquals(ExtensionalValueEventType.DESTRUCTION, ((ExtensionalValueEvent)eventlist.get(23)).getType());
		link = (Link)((ExtensionalValueEvent)eventlist.get(23)).getExtensionalValue();
		checkLink(null, link, values_expected, objects_expected_link2);
		
		assertTrue(eventlist.get(24) instanceof ActivityNodeExitEvent);
		assertEquals(clearassociation, ((ActivityNodeExitEvent)eventlist.get(24)).getNode());
		
		assertTrue(eventlist.get(25) instanceof ActivityExitEvent);
		assertEquals(activity, ((ActivityExitEvent)eventlist.get(25)).getActivity());
		assertEquals(activityentry, ((ActivityExitEvent)eventlist.get(25)).getParent());
		
		assertEquals(3, extensionalValueLists.get(extensionalValueLists.size()-1).size());		
		for(int i=0;i<3;++i) {
			assertTrue(extensionalValueLists.get(extensionalValueLists.size()-1).get(i).getClass().equals(Object_.class));
		}
	}
	
	private void checkLink(Association association, Link link, List<StructuralFeature> values_expected, List<Object_> objects_expected) {
		assertEquals(association, link.type);
		assertEquals(values_expected.size(), link.featureValues.size());		
		
		List<FeatureValue> values = new ArrayList<FeatureValue>();		
		for(int i=0;i<values_expected.size();++i){
			for(int j=0;j<link.featureValues.size();++j) {
				if(link.featureValues.get(j).feature.equals(values_expected.get(i))) {
					values.add(link.featureValues.get(j));
				}
			}
		}
		
		assertEquals(values_expected.size(), values.size());
		for(int i=0;i<values.size();++i) {
			assertEquals(1, values.get(i).values.size());
			Object_ o = ((Reference)values.get(i).values.get(0)).referent;
			assertEquals(objects_expected.get(i), o);
		}		
	}
	
	/**
     * Tests the ExtensionalValueEvents for ReclassifyObjectAction
	 * 
	 * Activity:
	 * CreateObjectAction (class = Class1)
	 * ReclassifyObjectAction (remove: Class1)
	 * 
	 * Activity ObjectFlow:
	 * CreateObjectAction1.result --> ReclassifyObjectAction.object
	 */
	@Test
	public void testReclassifyObjectAction() {
		Class_ class1 = ActivityFactory.createClass("Class1");
		
		Activity activity = ActivityFactory.createActivity("testReclassifyObjectAction");
		
		ClassifierList oldTypes = new ClassifierList();
		oldTypes.add(class1);
		ClassifierList newTypes = new ClassifierList();
		
		ReclassifyObjectAction reclassify = ActivityFactory.createReclassifyObjectAction(activity, "ReclassifyObject", newTypes, oldTypes);
		CreateObjectAction create = ActivityFactory.createCreateObjectAction(activity, "CreateObject Class1", class1);
				
		ActivityFactory.createObjectFlow(activity, create.result, reclassify.object);
		
		// Set Breakpoint
		Breakpoint breakpoint = new BreakpointImpl(reclassify);
		ExecutionContext.getInstance().addBreakpoint(breakpoint);
		
		// Start Debugging
		ExecutionContext.getInstance().debug(activity, null, new ParameterValueList());
				
		assertEquals(2, eventlist.size());
		
		assertTrue(eventlist.get(0) instanceof ActivityEntryEvent);
		ActivityEntryEvent activityentry = ((ActivityEntryEvent)eventlist.get(0));		
		assertEquals(activity, activityentry.getActivity());		
		assertNull(activityentry.getParent());
		
		assertTrue(eventlist.get(1) instanceof StepEvent);
		assertEquals(activity, ((StepEvent)eventlist.get(1)).getLocation());
		
		assertEquals(0, extensionalValueLists.get(extensionalValueLists.size()-1).size());
		
		// Resume Execution
		ExecutionContext.getInstance().resume(activityentry.getActivityExecutionID());
		
		assertEquals(7, eventlist.size());
		
		assertTrue(eventlist.get(2) instanceof ActivityNodeEntryEvent);
		assertEquals(create, ((ActivityNodeEntryEvent)eventlist.get(2)).getNode());	
		
		assertTrue(eventlist.get(3) instanceof ExtensionalValueEvent);
		assertEquals(ExtensionalValueEventType.CREATION, ((ExtensionalValueEvent)eventlist.get(3)).getType());
		ExtensionalValue value1 =  ((ExtensionalValueEvent)eventlist.get(3)).getExtensionalValue();
		assertTrue(value1 instanceof Object_);
		assertEquals(1, value1.getTypes().size());
		assertEquals(class1, value1.getTypes().get(0));
				
		assertTrue(eventlist.get(4) instanceof ActivityNodeExitEvent);
		assertEquals(create, ((ActivityNodeExitEvent)eventlist.get(4)).getNode());
					
		assertTrue(eventlist.get(5) instanceof BreakpointEvent);
		assertEquals(breakpoint, ((BreakpointEvent)eventlist.get(5)).getBreakpoint());
		
		assertTrue(eventlist.get(6) instanceof StepEvent);
		StepEvent step = ((StepEvent)eventlist.get(6));
		assertEquals(create, step.getLocation());
		assertEquals(activityentry, step.getParent());
		assertEquals(1, step.getNewEnabledNodes().size());
		assertEquals(reclassify, step.getNewEnabledNodes().get(0));
		
		assertEquals(1, extensionalValueLists.get(extensionalValueLists.size()-1).size());
		Object_ obj = (Object_) extensionalValueLists.get(extensionalValueLists.size()-1).get(0);
		assertEquals(1, obj.types.size());
		assertEquals(class1, obj.types.get(0));		
		
		// Resume Execution
		ExecutionContext.getInstance().resume(activityentry.getActivityExecutionID());
		
		assertEquals(10, eventlist.size());
				
		assertTrue(eventlist.get(7) instanceof ActivityNodeEntryEvent);
		assertEquals(reclassify, ((ActivityNodeEntryEvent)eventlist.get(7)).getNode());	
		
		/*
		assertTrue(eventlist.get(8) instanceof ExtensionalValueEvent);
		assertEquals(ExtensionalValueEventType.TYPE_REMOVED, ((ExtensionalValueEvent)eventlist.get(8)).getType());
		ExtensionalValue value2 =  ((ExtensionalValueEvent)eventlist.get(8)).getExtensionalValue();
		assertTrue(value2 instanceof Object_);
		assertEquals(obj, value2);
		assertEquals(0, value2.getTypes().size());
				*/
		assertTrue(eventlist.get(8) instanceof ActivityNodeExitEvent);
		assertEquals(reclassify, ((ActivityNodeExitEvent)eventlist.get(8)).getNode());
		
		assertTrue(eventlist.get(9) instanceof ActivityExitEvent);
		assertEquals(activity, ((ActivityExitEvent)eventlist.get(9)).getActivity());
		assertEquals(activityentry, ((ActivityExitEvent)eventlist.get(9)).getParent());
		
		assertEquals(1, extensionalValueLists.get(extensionalValueLists.size()-1).size());		
	}
	
	@Override
	public void notify(Event event) {
		eventlist.add(event);
		
		if(event instanceof StepEvent || event instanceof ActivityExitEvent) {
			ExtensionalValueList list = new ExtensionalValueList();
			for(int i=0;i<ExecutionContext.getInstance().getExtensionalValues().size();++i) {
				ExtensionalValue value = ExecutionContext.getInstance().getExtensionalValues().get(i);
				if(value.getClass() == Object_.class) {
					list.add(copyObject((Object_)ExecutionContext.getInstance().getExtensionalValues().get(i)));
				}
				if(value.getClass() == Link.class) {
					list.add(value);
				}
			}
			extensionalValueLists.add(list);
		}
	}			
}