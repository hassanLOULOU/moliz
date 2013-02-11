/**
 * Copyright (c) 2012 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Tanja Mayerhofer - initial API and implementation
 */
package org.modelexecution.fumldebug.core.trace.tracemodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.modelexecution.fumldebug.core.trace.tracemodel.TracemodelFactory
 * @model kind="package"
 * @generated
 */
public interface TracemodelPackage extends EPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2012 Vienna University of Technology.\r\nAll rights reserved. This program and the accompanying materials are made \r\navailable under the terms of the Eclipse Public License v1.0 which accompanies \r\nthis distribution, and is available at http://www.eclipse.org/legal/epl-v10.html\r\n\r\nContributors:\r\nTanja Mayerhofer - initial API and implementation";

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tracemodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://tracemodel/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tracemodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TracemodelPackage eINSTANCE = org.modelexecution.fumldebug.core.trace.tracemodel.impl.TracemodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.modelexecution.fumldebug.core.trace.tracemodel.impl.TraceImpl <em>Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.impl.TraceImpl
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.impl.TracemodelPackageImpl#getTrace()
	 * @generated
	 */
	int TRACE = 0;

	/**
	 * The feature id for the '<em><b>Activity Executions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__ACTIVITY_EXECUTIONS = 0;

	/**
	 * The number of structural features of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.modelexecution.fumldebug.core.trace.tracemodel.impl.ActivityExecutionImpl <em>Activity Execution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.impl.ActivityExecutionImpl
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.impl.TracemodelPackageImpl#getActivityExecution()
	 * @generated
	 */
	int ACTIVITY_EXECUTION = 1;

	/**
	 * The feature id for the '<em><b>User Parameter Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXECUTION__USER_PARAMETER_INPUTS = 0;

	/**
	 * The feature id for the '<em><b>Node Executions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXECUTION__NODE_EXECUTIONS = 1;

	/**
	 * The feature id for the '<em><b>Caller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXECUTION__CALLER = 2;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXECUTION__ACTIVITY = 3;

	/**
	 * The feature id for the '<em><b>Activity Execution ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXECUTION__ACTIVITY_EXECUTION_ID = 4;

	/**
	 * The feature id for the '<em><b>Trace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXECUTION__TRACE = 5;

	/**
	 * The number of structural features of the '<em>Activity Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXECUTION_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.modelexecution.fumldebug.core.trace.tracemodel.impl.ActivityNodeExecutionImpl <em>Activity Node Execution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.impl.ActivityNodeExecutionImpl
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.impl.TracemodelPackageImpl#getActivityNodeExecution()
	 * @generated
	 */
	int ACTIVITY_NODE_EXECUTION = 2;

	/**
	 * The feature id for the '<em><b>Logical Successor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_EXECUTION__LOGICAL_SUCCESSOR = 0;

	/**
	 * The feature id for the '<em><b>Logical Predecessor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_EXECUTION__LOGICAL_PREDECESSOR = 1;

	/**
	 * The feature id for the '<em><b>Chronological Successor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_EXECUTION__CHRONOLOGICAL_SUCCESSOR = 2;

	/**
	 * The feature id for the '<em><b>Chronological Predecessor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_EXECUTION__CHRONOLOGICAL_PREDECESSOR = 3;

	/**
	 * The feature id for the '<em><b>Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_EXECUTION__NODE = 4;

	/**
	 * The feature id for the '<em><b>Activity Execution</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_EXECUTION__ACTIVITY_EXECUTION = 5;

	/**
	 * The feature id for the '<em><b>Executed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_EXECUTION__EXECUTED = 6;

	/**
	 * The number of structural features of the '<em>Activity Node Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_EXECUTION_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.modelexecution.fumldebug.core.trace.tracemodel.impl.ActionExecutionImpl <em>Action Execution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.impl.ActionExecutionImpl
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.impl.TracemodelPackageImpl#getActionExecution()
	 * @generated
	 */
	int ACTION_EXECUTION = 11;

	/**
	 * The feature id for the '<em><b>Logical Successor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EXECUTION__LOGICAL_SUCCESSOR = ACTIVITY_NODE_EXECUTION__LOGICAL_SUCCESSOR;

	/**
	 * The feature id for the '<em><b>Logical Predecessor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EXECUTION__LOGICAL_PREDECESSOR = ACTIVITY_NODE_EXECUTION__LOGICAL_PREDECESSOR;

	/**
	 * The feature id for the '<em><b>Chronological Successor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EXECUTION__CHRONOLOGICAL_SUCCESSOR = ACTIVITY_NODE_EXECUTION__CHRONOLOGICAL_SUCCESSOR;

	/**
	 * The feature id for the '<em><b>Chronological Predecessor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EXECUTION__CHRONOLOGICAL_PREDECESSOR = ACTIVITY_NODE_EXECUTION__CHRONOLOGICAL_PREDECESSOR;

	/**
	 * The feature id for the '<em><b>Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EXECUTION__NODE = ACTIVITY_NODE_EXECUTION__NODE;

	/**
	 * The feature id for the '<em><b>Activity Execution</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EXECUTION__ACTIVITY_EXECUTION = ACTIVITY_NODE_EXECUTION__ACTIVITY_EXECUTION;

	/**
	 * The feature id for the '<em><b>Executed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EXECUTION__EXECUTED = ACTIVITY_NODE_EXECUTION__EXECUTED;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EXECUTION__INPUTS = ACTIVITY_NODE_EXECUTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EXECUTION__OUTPUTS = ACTIVITY_NODE_EXECUTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Action Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EXECUTION_FEATURE_COUNT = ACTIVITY_NODE_EXECUTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.modelexecution.fumldebug.core.trace.tracemodel.impl.CallActionExecutionImpl <em>Call Action Execution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.impl.CallActionExecutionImpl
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.impl.TracemodelPackageImpl#getCallActionExecution()
	 * @generated
	 */
	int CALL_ACTION_EXECUTION = 3;

	/**
	 * The feature id for the '<em><b>Logical Successor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_EXECUTION__LOGICAL_SUCCESSOR = ACTION_EXECUTION__LOGICAL_SUCCESSOR;

	/**
	 * The feature id for the '<em><b>Logical Predecessor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_EXECUTION__LOGICAL_PREDECESSOR = ACTION_EXECUTION__LOGICAL_PREDECESSOR;

	/**
	 * The feature id for the '<em><b>Chronological Successor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_EXECUTION__CHRONOLOGICAL_SUCCESSOR = ACTION_EXECUTION__CHRONOLOGICAL_SUCCESSOR;

	/**
	 * The feature id for the '<em><b>Chronological Predecessor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_EXECUTION__CHRONOLOGICAL_PREDECESSOR = ACTION_EXECUTION__CHRONOLOGICAL_PREDECESSOR;

	/**
	 * The feature id for the '<em><b>Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_EXECUTION__NODE = ACTION_EXECUTION__NODE;

	/**
	 * The feature id for the '<em><b>Activity Execution</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_EXECUTION__ACTIVITY_EXECUTION = ACTION_EXECUTION__ACTIVITY_EXECUTION;

	/**
	 * The feature id for the '<em><b>Executed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_EXECUTION__EXECUTED = ACTION_EXECUTION__EXECUTED;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_EXECUTION__INPUTS = ACTION_EXECUTION__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_EXECUTION__OUTPUTS = ACTION_EXECUTION__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Callee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_EXECUTION__CALLEE = ACTION_EXECUTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Call Action Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_EXECUTION_FEATURE_COUNT = ACTION_EXECUTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.modelexecution.fumldebug.core.trace.tracemodel.impl.UserParameterInputImpl <em>User Parameter Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.impl.UserParameterInputImpl
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.impl.TracemodelPackageImpl#getUserParameterInput()
	 * @generated
	 */
	int USER_PARAMETER_INPUT = 4;

	/**
	 * The feature id for the '<em><b>User Input Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PARAMETER_INPUT__USER_INPUT_TOKENS = 0;

	/**
	 * The feature id for the '<em><b>Input Parameter Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PARAMETER_INPUT__INPUT_PARAMETER_NODE = 1;

	/**
	 * The number of structural features of the '<em>User Parameter Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PARAMETER_INPUT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.modelexecution.fumldebug.core.trace.tracemodel.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.impl.InputImpl
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.impl.TracemodelPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 5;

	/**
	 * The feature id for the '<em><b>Tokens</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__TOKENS = 0;

	/**
	 * The feature id for the '<em><b>Input Pin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__INPUT_PIN = 1;

	/**
	 * The feature id for the '<em><b>Consumed Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__CONSUMED_VALUE = 2;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.modelexecution.fumldebug.core.trace.tracemodel.impl.OutputImpl <em>Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.impl.OutputImpl
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.impl.TracemodelPackageImpl#getOutput()
	 * @generated
	 */
	int OUTPUT = 6;

	/**
	 * The feature id for the '<em><b>Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__TOKENS = 0;

	/**
	 * The feature id for the '<em><b>Output Pin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__OUTPUT_PIN = 1;

	/**
	 * The number of structural features of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.modelexecution.fumldebug.core.trace.tracemodel.impl.TokenInstanceImpl <em>Token Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.impl.TokenInstanceImpl
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.impl.TracemodelPackageImpl#getTokenInstance()
	 * @generated
	 */
	int TOKEN_INSTANCE = 7;

	/**
	 * The feature id for the '<em><b>Traversed Edges</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_INSTANCE__TRAVERSED_EDGES = 0;

	/**
	 * The number of structural features of the '<em>Token Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_INSTANCE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.modelexecution.fumldebug.core.trace.tracemodel.impl.ObjectTokenInstanceImpl <em>Object Token Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.impl.ObjectTokenInstanceImpl
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.impl.TracemodelPackageImpl#getObjectTokenInstance()
	 * @generated
	 */
	int OBJECT_TOKEN_INSTANCE = 8;

	/**
	 * The feature id for the '<em><b>Traversed Edges</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TOKEN_INSTANCE__TRAVERSED_EDGES = TOKEN_INSTANCE__TRAVERSED_EDGES;

	/**
	 * The feature id for the '<em><b>Value Instance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TOKEN_INSTANCE__VALUE_INSTANCE = TOKEN_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Token Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TOKEN_INSTANCE_FEATURE_COUNT = TOKEN_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.modelexecution.fumldebug.core.trace.tracemodel.impl.ControlTokenInstanceImpl <em>Control Token Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.impl.ControlTokenInstanceImpl
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.impl.TracemodelPackageImpl#getControlTokenInstance()
	 * @generated
	 */
	int CONTROL_TOKEN_INSTANCE = 9;

	/**
	 * The feature id for the '<em><b>Traversed Edges</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TOKEN_INSTANCE__TRAVERSED_EDGES = TOKEN_INSTANCE__TRAVERSED_EDGES;

	/**
	 * The number of structural features of the '<em>Control Token Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TOKEN_INSTANCE_FEATURE_COUNT = TOKEN_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.modelexecution.fumldebug.core.trace.tracemodel.impl.ValueInstanceImpl <em>Value Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.impl.ValueInstanceImpl
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.impl.TracemodelPackageImpl#getValueInstance()
	 * @generated
	 */
	int VALUE_INSTANCE = 10;

	/**
	 * The feature id for the '<em><b>Snapshots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_INSTANCE__SNAPSHOTS = 0;

	/**
	 * The feature id for the '<em><b>Original</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_INSTANCE__ORIGINAL = 1;

	/**
	 * The feature id for the '<em><b>Value ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_INSTANCE__VALUE_ID = 2;

	/**
	 * The number of structural features of the '<em>Value Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_INSTANCE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.modelexecution.fumldebug.core.trace.tracemodel.impl.ControlNodeExecutionImpl <em>Control Node Execution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.impl.ControlNodeExecutionImpl
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.impl.TracemodelPackageImpl#getControlNodeExecution()
	 * @generated
	 */
	int CONTROL_NODE_EXECUTION = 12;

	/**
	 * The feature id for the '<em><b>Logical Successor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_EXECUTION__LOGICAL_SUCCESSOR = ACTIVITY_NODE_EXECUTION__LOGICAL_SUCCESSOR;

	/**
	 * The feature id for the '<em><b>Logical Predecessor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_EXECUTION__LOGICAL_PREDECESSOR = ACTIVITY_NODE_EXECUTION__LOGICAL_PREDECESSOR;

	/**
	 * The feature id for the '<em><b>Chronological Successor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_EXECUTION__CHRONOLOGICAL_SUCCESSOR = ACTIVITY_NODE_EXECUTION__CHRONOLOGICAL_SUCCESSOR;

	/**
	 * The feature id for the '<em><b>Chronological Predecessor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_EXECUTION__CHRONOLOGICAL_PREDECESSOR = ACTIVITY_NODE_EXECUTION__CHRONOLOGICAL_PREDECESSOR;

	/**
	 * The feature id for the '<em><b>Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_EXECUTION__NODE = ACTIVITY_NODE_EXECUTION__NODE;

	/**
	 * The feature id for the '<em><b>Activity Execution</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_EXECUTION__ACTIVITY_EXECUTION = ACTIVITY_NODE_EXECUTION__ACTIVITY_EXECUTION;

	/**
	 * The feature id for the '<em><b>Executed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_EXECUTION__EXECUTED = ACTIVITY_NODE_EXECUTION__EXECUTED;

	/**
	 * The feature id for the '<em><b>Routed Tokens</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_EXECUTION__ROUTED_TOKENS = ACTIVITY_NODE_EXECUTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Control Node Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_EXECUTION_FEATURE_COUNT = ACTIVITY_NODE_EXECUTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.modelexecution.fumldebug.core.trace.tracemodel.impl.ValueInstanceSnapshotImpl <em>Value Instance Snapshot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.impl.ValueInstanceSnapshotImpl
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.impl.TracemodelPackageImpl#getValueInstanceSnapshot()
	 * @generated
	 */
	int VALUE_INSTANCE_SNAPSHOT = 13;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_INSTANCE_SNAPSHOT__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Value Instance Snapshot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_INSTANCE_SNAPSHOT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '<em>Activity</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fUML.Syntax.Activities.IntermediateActivities.Activity
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.impl.TracemodelPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 14;

	/**
	 * The meta object id for the '<em>Activity Node</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fUML.Syntax.Activities.IntermediateActivities.ActivityNode
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.impl.TracemodelPackageImpl#getActivityNode()
	 * @generated
	 */
	int ACTIVITY_NODE = 15;

	/**
	 * The meta object id for the '<em>Behavior</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fUML.Syntax.CommonBehaviors.BasicBehaviors.Behavior
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.impl.TracemodelPackageImpl#getBehavior()
	 * @generated
	 */
	int BEHAVIOR = 16;

	/**
	 * The meta object id for the '<em>Activity Parameter Node</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fUML.Syntax.Activities.IntermediateActivities.ActivityParameterNode
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.impl.TracemodelPackageImpl#getActivityParameterNode()
	 * @generated
	 */
	int ACTIVITY_PARAMETER_NODE = 17;

	/**
	 * The meta object id for the '<em>Input Pin</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fUML.Syntax.Actions.BasicActions.InputPin
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.impl.TracemodelPackageImpl#getInputPin()
	 * @generated
	 */
	int INPUT_PIN = 18;

	/**
	 * The meta object id for the '<em>Output Pin</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fUML.Syntax.Actions.BasicActions.OutputPin
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.impl.TracemodelPackageImpl#getOutputPin()
	 * @generated
	 */
	int OUTPUT_PIN = 19;

	/**
	 * The meta object id for the '<em>Activity Edge</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fUML.Syntax.Activities.IntermediateActivities.ActivityEdge
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.impl.TracemodelPackageImpl#getActivityEdge()
	 * @generated
	 */
	int ACTIVITY_EDGE = 20;

	/**
	 * The meta object id for the '<em>Value</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fUML.Semantics.Classes.Kernel.Value
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.impl.TracemodelPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 21;


	/**
	 * Returns the meta object for class '{@link org.modelexecution.fumldebug.core.trace.tracemodel.Trace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace</em>'.
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.Trace
	 * @generated
	 */
	EClass getTrace();

	/**
	 * Returns the meta object for the containment reference list '{@link org.modelexecution.fumldebug.core.trace.tracemodel.Trace#getActivityExecutions <em>Activity Executions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activity Executions</em>'.
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.Trace#getActivityExecutions()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_ActivityExecutions();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fumldebug.core.trace.tracemodel.ActivityExecution <em>Activity Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Execution</em>'.
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.ActivityExecution
	 * @generated
	 */
	EClass getActivityExecution();

	/**
	 * Returns the meta object for the containment reference list '{@link org.modelexecution.fumldebug.core.trace.tracemodel.ActivityExecution#getUserParameterInputs <em>User Parameter Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>User Parameter Inputs</em>'.
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.ActivityExecution#getUserParameterInputs()
	 * @see #getActivityExecution()
	 * @generated
	 */
	EReference getActivityExecution_UserParameterInputs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.modelexecution.fumldebug.core.trace.tracemodel.ActivityExecution#getNodeExecutions <em>Node Executions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node Executions</em>'.
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.ActivityExecution#getNodeExecutions()
	 * @see #getActivityExecution()
	 * @generated
	 */
	EReference getActivityExecution_NodeExecutions();

	/**
	 * Returns the meta object for the reference '{@link org.modelexecution.fumldebug.core.trace.tracemodel.ActivityExecution#getCaller <em>Caller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Caller</em>'.
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.ActivityExecution#getCaller()
	 * @see #getActivityExecution()
	 * @generated
	 */
	EReference getActivityExecution_Caller();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.fumldebug.core.trace.tracemodel.ActivityExecution#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activity</em>'.
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.ActivityExecution#getActivity()
	 * @see #getActivityExecution()
	 * @generated
	 */
	EAttribute getActivityExecution_Activity();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.fumldebug.core.trace.tracemodel.ActivityExecution#getActivityExecutionID <em>Activity Execution ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activity Execution ID</em>'.
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.ActivityExecution#getActivityExecutionID()
	 * @see #getActivityExecution()
	 * @generated
	 */
	EAttribute getActivityExecution_ActivityExecutionID();

	/**
	 * Returns the meta object for the container reference '{@link org.modelexecution.fumldebug.core.trace.tracemodel.ActivityExecution#getTrace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Trace</em>'.
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.ActivityExecution#getTrace()
	 * @see #getActivityExecution()
	 * @generated
	 */
	EReference getActivityExecution_Trace();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fumldebug.core.trace.tracemodel.ActivityNodeExecution <em>Activity Node Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Node Execution</em>'.
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.ActivityNodeExecution
	 * @generated
	 */
	EClass getActivityNodeExecution();

	/**
	 * Returns the meta object for the reference list '{@link org.modelexecution.fumldebug.core.trace.tracemodel.ActivityNodeExecution#getLogicalSuccessor <em>Logical Successor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Logical Successor</em>'.
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.ActivityNodeExecution#getLogicalSuccessor()
	 * @see #getActivityNodeExecution()
	 * @generated
	 */
	EReference getActivityNodeExecution_LogicalSuccessor();

	/**
	 * Returns the meta object for the reference list '{@link org.modelexecution.fumldebug.core.trace.tracemodel.ActivityNodeExecution#getLogicalPredecessor <em>Logical Predecessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Logical Predecessor</em>'.
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.ActivityNodeExecution#getLogicalPredecessor()
	 * @see #getActivityNodeExecution()
	 * @generated
	 */
	EReference getActivityNodeExecution_LogicalPredecessor();

	/**
	 * Returns the meta object for the reference '{@link org.modelexecution.fumldebug.core.trace.tracemodel.ActivityNodeExecution#getChronologicalSuccessor <em>Chronological Successor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Chronological Successor</em>'.
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.ActivityNodeExecution#getChronologicalSuccessor()
	 * @see #getActivityNodeExecution()
	 * @generated
	 */
	EReference getActivityNodeExecution_ChronologicalSuccessor();

	/**
	 * Returns the meta object for the reference '{@link org.modelexecution.fumldebug.core.trace.tracemodel.ActivityNodeExecution#getChronologicalPredecessor <em>Chronological Predecessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Chronological Predecessor</em>'.
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.ActivityNodeExecution#getChronologicalPredecessor()
	 * @see #getActivityNodeExecution()
	 * @generated
	 */
	EReference getActivityNodeExecution_ChronologicalPredecessor();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.fumldebug.core.trace.tracemodel.ActivityNodeExecution#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node</em>'.
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.ActivityNodeExecution#getNode()
	 * @see #getActivityNodeExecution()
	 * @generated
	 */
	EAttribute getActivityNodeExecution_Node();

	/**
	 * Returns the meta object for the container reference '{@link org.modelexecution.fumldebug.core.trace.tracemodel.ActivityNodeExecution#getActivityExecution <em>Activity Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Activity Execution</em>'.
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.ActivityNodeExecution#getActivityExecution()
	 * @see #getActivityNodeExecution()
	 * @generated
	 */
	EReference getActivityNodeExecution_ActivityExecution();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.fumldebug.core.trace.tracemodel.ActivityNodeExecution#isExecuted <em>Executed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Executed</em>'.
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.ActivityNodeExecution#isExecuted()
	 * @see #getActivityNodeExecution()
	 * @generated
	 */
	EAttribute getActivityNodeExecution_Executed();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fumldebug.core.trace.tracemodel.CallActionExecution <em>Call Action Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Action Execution</em>'.
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.CallActionExecution
	 * @generated
	 */
	EClass getCallActionExecution();

	/**
	 * Returns the meta object for the reference '{@link org.modelexecution.fumldebug.core.trace.tracemodel.CallActionExecution#getCallee <em>Callee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Callee</em>'.
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.CallActionExecution#getCallee()
	 * @see #getCallActionExecution()
	 * @generated
	 */
	EReference getCallActionExecution_Callee();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fumldebug.core.trace.tracemodel.UserParameterInput <em>User Parameter Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Parameter Input</em>'.
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.UserParameterInput
	 * @generated
	 */
	EClass getUserParameterInput();

	/**
	 * Returns the meta object for the containment reference list '{@link org.modelexecution.fumldebug.core.trace.tracemodel.UserParameterInput#getUserInputTokens <em>User Input Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>User Input Tokens</em>'.
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.UserParameterInput#getUserInputTokens()
	 * @see #getUserParameterInput()
	 * @generated
	 */
	EReference getUserParameterInput_UserInputTokens();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.fumldebug.core.trace.tracemodel.UserParameterInput#getInputParameterNode <em>Input Parameter Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Parameter Node</em>'.
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.UserParameterInput#getInputParameterNode()
	 * @see #getUserParameterInput()
	 * @generated
	 */
	EAttribute getUserParameterInput_InputParameterNode();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fumldebug.core.trace.tracemodel.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for the reference list '{@link org.modelexecution.fumldebug.core.trace.tracemodel.Input#getTokens <em>Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tokens</em>'.
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.Input#getTokens()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_Tokens();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.fumldebug.core.trace.tracemodel.Input#getInputPin <em>Input Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Pin</em>'.
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.Input#getInputPin()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_InputPin();

	/**
	 * Returns the meta object for the reference '{@link org.modelexecution.fumldebug.core.trace.tracemodel.Input#getConsumedValue <em>Consumed Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Consumed Value</em>'.
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.Input#getConsumedValue()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_ConsumedValue();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fumldebug.core.trace.tracemodel.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output</em>'.
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.Output
	 * @generated
	 */
	EClass getOutput();

	/**
	 * Returns the meta object for the containment reference list '{@link org.modelexecution.fumldebug.core.trace.tracemodel.Output#getTokens <em>Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tokens</em>'.
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.Output#getTokens()
	 * @see #getOutput()
	 * @generated
	 */
	EReference getOutput_Tokens();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.fumldebug.core.trace.tracemodel.Output#getOutputPin <em>Output Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Pin</em>'.
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.Output#getOutputPin()
	 * @see #getOutput()
	 * @generated
	 */
	EAttribute getOutput_OutputPin();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fumldebug.core.trace.tracemodel.TokenInstance <em>Token Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token Instance</em>'.
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.TokenInstance
	 * @generated
	 */
	EClass getTokenInstance();

	/**
	 * Returns the meta object for the attribute list '{@link org.modelexecution.fumldebug.core.trace.tracemodel.TokenInstance#getTraversedEdges <em>Traversed Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Traversed Edges</em>'.
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.TokenInstance#getTraversedEdges()
	 * @see #getTokenInstance()
	 * @generated
	 */
	EAttribute getTokenInstance_TraversedEdges();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fumldebug.core.trace.tracemodel.ObjectTokenInstance <em>Object Token Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Token Instance</em>'.
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.ObjectTokenInstance
	 * @generated
	 */
	EClass getObjectTokenInstance();

	/**
	 * Returns the meta object for the containment reference '{@link org.modelexecution.fumldebug.core.trace.tracemodel.ObjectTokenInstance#getValueInstance <em>Value Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Instance</em>'.
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.ObjectTokenInstance#getValueInstance()
	 * @see #getObjectTokenInstance()
	 * @generated
	 */
	EReference getObjectTokenInstance_ValueInstance();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fumldebug.core.trace.tracemodel.ControlTokenInstance <em>Control Token Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Token Instance</em>'.
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.ControlTokenInstance
	 * @generated
	 */
	EClass getControlTokenInstance();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fumldebug.core.trace.tracemodel.ValueInstance <em>Value Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Instance</em>'.
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.ValueInstance
	 * @generated
	 */
	EClass getValueInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link org.modelexecution.fumldebug.core.trace.tracemodel.ValueInstance#getSnapshots <em>Snapshots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Snapshots</em>'.
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.ValueInstance#getSnapshots()
	 * @see #getValueInstance()
	 * @generated
	 */
	EReference getValueInstance_Snapshots();

	/**
	 * Returns the meta object for the reference '{@link org.modelexecution.fumldebug.core.trace.tracemodel.ValueInstance#getOriginal <em>Original</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original</em>'.
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.ValueInstance#getOriginal()
	 * @see #getValueInstance()
	 * @generated
	 */
	EReference getValueInstance_Original();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.fumldebug.core.trace.tracemodel.ValueInstance#getValueID <em>Value ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value ID</em>'.
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.ValueInstance#getValueID()
	 * @see #getValueInstance()
	 * @generated
	 */
	EAttribute getValueInstance_ValueID();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fumldebug.core.trace.tracemodel.ActionExecution <em>Action Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Execution</em>'.
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.ActionExecution
	 * @generated
	 */
	EClass getActionExecution();

	/**
	 * Returns the meta object for the containment reference list '{@link org.modelexecution.fumldebug.core.trace.tracemodel.ActionExecution#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.ActionExecution#getInputs()
	 * @see #getActionExecution()
	 * @generated
	 */
	EReference getActionExecution_Inputs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.modelexecution.fumldebug.core.trace.tracemodel.ActionExecution#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outputs</em>'.
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.ActionExecution#getOutputs()
	 * @see #getActionExecution()
	 * @generated
	 */
	EReference getActionExecution_Outputs();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fumldebug.core.trace.tracemodel.ControlNodeExecution <em>Control Node Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Node Execution</em>'.
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.ControlNodeExecution
	 * @generated
	 */
	EClass getControlNodeExecution();

	/**
	 * Returns the meta object for the reference list '{@link org.modelexecution.fumldebug.core.trace.tracemodel.ControlNodeExecution#getRoutedTokens <em>Routed Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Routed Tokens</em>'.
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.ControlNodeExecution#getRoutedTokens()
	 * @see #getControlNodeExecution()
	 * @generated
	 */
	EReference getControlNodeExecution_RoutedTokens();

	/**
	 * Returns the meta object for class '{@link org.modelexecution.fumldebug.core.trace.tracemodel.ValueInstanceSnapshot <em>Value Instance Snapshot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Instance Snapshot</em>'.
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.ValueInstanceSnapshot
	 * @generated
	 */
	EClass getValueInstanceSnapshot();

	/**
	 * Returns the meta object for the attribute '{@link org.modelexecution.fumldebug.core.trace.tracemodel.ValueInstanceSnapshot#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.modelexecution.fumldebug.core.trace.tracemodel.ValueInstanceSnapshot#getValue()
	 * @see #getValueInstanceSnapshot()
	 * @generated
	 */
	EAttribute getValueInstanceSnapshot_Value();

	/**
	 * Returns the meta object for data type '{@link fUML.Syntax.Activities.IntermediateActivities.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Activity</em>'.
	 * @see fUML.Syntax.Activities.IntermediateActivities.Activity
	 * @model instanceClass="fUML.Syntax.Activities.IntermediateActivities.Activity" serializeable="false"
	 * @generated
	 */
	EDataType getActivity();

	/**
	 * Returns the meta object for data type '{@link fUML.Syntax.Activities.IntermediateActivities.ActivityNode <em>Activity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Activity Node</em>'.
	 * @see fUML.Syntax.Activities.IntermediateActivities.ActivityNode
	 * @model instanceClass="fUML.Syntax.Activities.IntermediateActivities.ActivityNode" serializeable="false"
	 * @generated
	 */
	EDataType getActivityNode();

	/**
	 * Returns the meta object for data type '{@link fUML.Syntax.CommonBehaviors.BasicBehaviors.Behavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Behavior</em>'.
	 * @see fUML.Syntax.CommonBehaviors.BasicBehaviors.Behavior
	 * @model instanceClass="fUML.Syntax.CommonBehaviors.BasicBehaviors.Behavior" serializeable="false"
	 * @generated
	 */
	EDataType getBehavior();

	/**
	 * Returns the meta object for data type '{@link fUML.Syntax.Activities.IntermediateActivities.ActivityParameterNode <em>Activity Parameter Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Activity Parameter Node</em>'.
	 * @see fUML.Syntax.Activities.IntermediateActivities.ActivityParameterNode
	 * @model instanceClass="fUML.Syntax.Activities.IntermediateActivities.ActivityParameterNode" serializeable="false"
	 * @generated
	 */
	EDataType getActivityParameterNode();

	/**
	 * Returns the meta object for data type '{@link fUML.Syntax.Actions.BasicActions.InputPin <em>Input Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Input Pin</em>'.
	 * @see fUML.Syntax.Actions.BasicActions.InputPin
	 * @model instanceClass="fUML.Syntax.Actions.BasicActions.InputPin" serializeable="false"
	 * @generated
	 */
	EDataType getInputPin();

	/**
	 * Returns the meta object for data type '{@link fUML.Syntax.Actions.BasicActions.OutputPin <em>Output Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Output Pin</em>'.
	 * @see fUML.Syntax.Actions.BasicActions.OutputPin
	 * @model instanceClass="fUML.Syntax.Actions.BasicActions.OutputPin" serializeable="false"
	 * @generated
	 */
	EDataType getOutputPin();

	/**
	 * Returns the meta object for data type '{@link fUML.Syntax.Activities.IntermediateActivities.ActivityEdge <em>Activity Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Activity Edge</em>'.
	 * @see fUML.Syntax.Activities.IntermediateActivities.ActivityEdge
	 * @model instanceClass="fUML.Syntax.Activities.IntermediateActivities.ActivityEdge" serializeable="false"
	 * @generated
	 */
	EDataType getActivityEdge();

	/**
	 * Returns the meta object for data type '{@link fUML.Semantics.Classes.Kernel.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Value</em>'.
	 * @see fUML.Semantics.Classes.Kernel.Value
	 * @model instanceClass="fUML.Semantics.Classes.Kernel.Value" serializeable="false"
	 * @generated
	 */
	EDataType getValue();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TracemodelFactory getTracemodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.modelexecution.fumldebug.core.trace.tracemodel.impl.TraceImpl <em>Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fumldebug.core.trace.tracemodel.impl.TraceImpl
		 * @see org.modelexecution.fumldebug.core.trace.tracemodel.impl.TracemodelPackageImpl#getTrace()
		 * @generated
		 */
		EClass TRACE = eINSTANCE.getTrace();

		/**
		 * The meta object literal for the '<em><b>Activity Executions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__ACTIVITY_EXECUTIONS = eINSTANCE.getTrace_ActivityExecutions();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fumldebug.core.trace.tracemodel.impl.ActivityExecutionImpl <em>Activity Execution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fumldebug.core.trace.tracemodel.impl.ActivityExecutionImpl
		 * @see org.modelexecution.fumldebug.core.trace.tracemodel.impl.TracemodelPackageImpl#getActivityExecution()
		 * @generated
		 */
		EClass ACTIVITY_EXECUTION = eINSTANCE.getActivityExecution();

		/**
		 * The meta object literal for the '<em><b>User Parameter Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EXECUTION__USER_PARAMETER_INPUTS = eINSTANCE.getActivityExecution_UserParameterInputs();

		/**
		 * The meta object literal for the '<em><b>Node Executions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EXECUTION__NODE_EXECUTIONS = eINSTANCE.getActivityExecution_NodeExecutions();

		/**
		 * The meta object literal for the '<em><b>Caller</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EXECUTION__CALLER = eINSTANCE.getActivityExecution_Caller();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_EXECUTION__ACTIVITY = eINSTANCE.getActivityExecution_Activity();

		/**
		 * The meta object literal for the '<em><b>Activity Execution ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_EXECUTION__ACTIVITY_EXECUTION_ID = eINSTANCE.getActivityExecution_ActivityExecutionID();

		/**
		 * The meta object literal for the '<em><b>Trace</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EXECUTION__TRACE = eINSTANCE.getActivityExecution_Trace();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fumldebug.core.trace.tracemodel.impl.ActivityNodeExecutionImpl <em>Activity Node Execution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fumldebug.core.trace.tracemodel.impl.ActivityNodeExecutionImpl
		 * @see org.modelexecution.fumldebug.core.trace.tracemodel.impl.TracemodelPackageImpl#getActivityNodeExecution()
		 * @generated
		 */
		EClass ACTIVITY_NODE_EXECUTION = eINSTANCE.getActivityNodeExecution();

		/**
		 * The meta object literal for the '<em><b>Logical Successor</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE_EXECUTION__LOGICAL_SUCCESSOR = eINSTANCE.getActivityNodeExecution_LogicalSuccessor();

		/**
		 * The meta object literal for the '<em><b>Logical Predecessor</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE_EXECUTION__LOGICAL_PREDECESSOR = eINSTANCE.getActivityNodeExecution_LogicalPredecessor();

		/**
		 * The meta object literal for the '<em><b>Chronological Successor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE_EXECUTION__CHRONOLOGICAL_SUCCESSOR = eINSTANCE.getActivityNodeExecution_ChronologicalSuccessor();

		/**
		 * The meta object literal for the '<em><b>Chronological Predecessor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE_EXECUTION__CHRONOLOGICAL_PREDECESSOR = eINSTANCE.getActivityNodeExecution_ChronologicalPredecessor();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_NODE_EXECUTION__NODE = eINSTANCE.getActivityNodeExecution_Node();

		/**
		 * The meta object literal for the '<em><b>Activity Execution</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE_EXECUTION__ACTIVITY_EXECUTION = eINSTANCE.getActivityNodeExecution_ActivityExecution();

		/**
		 * The meta object literal for the '<em><b>Executed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_NODE_EXECUTION__EXECUTED = eINSTANCE.getActivityNodeExecution_Executed();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fumldebug.core.trace.tracemodel.impl.CallActionExecutionImpl <em>Call Action Execution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fumldebug.core.trace.tracemodel.impl.CallActionExecutionImpl
		 * @see org.modelexecution.fumldebug.core.trace.tracemodel.impl.TracemodelPackageImpl#getCallActionExecution()
		 * @generated
		 */
		EClass CALL_ACTION_EXECUTION = eINSTANCE.getCallActionExecution();

		/**
		 * The meta object literal for the '<em><b>Callee</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_ACTION_EXECUTION__CALLEE = eINSTANCE.getCallActionExecution_Callee();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fumldebug.core.trace.tracemodel.impl.UserParameterInputImpl <em>User Parameter Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fumldebug.core.trace.tracemodel.impl.UserParameterInputImpl
		 * @see org.modelexecution.fumldebug.core.trace.tracemodel.impl.TracemodelPackageImpl#getUserParameterInput()
		 * @generated
		 */
		EClass USER_PARAMETER_INPUT = eINSTANCE.getUserParameterInput();

		/**
		 * The meta object literal for the '<em><b>User Input Tokens</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_PARAMETER_INPUT__USER_INPUT_TOKENS = eINSTANCE.getUserParameterInput_UserInputTokens();

		/**
		 * The meta object literal for the '<em><b>Input Parameter Node</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_PARAMETER_INPUT__INPUT_PARAMETER_NODE = eINSTANCE.getUserParameterInput_InputParameterNode();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fumldebug.core.trace.tracemodel.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fumldebug.core.trace.tracemodel.impl.InputImpl
		 * @see org.modelexecution.fumldebug.core.trace.tracemodel.impl.TracemodelPackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '<em><b>Tokens</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT__TOKENS = eINSTANCE.getInput_Tokens();

		/**
		 * The meta object literal for the '<em><b>Input Pin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__INPUT_PIN = eINSTANCE.getInput_InputPin();

		/**
		 * The meta object literal for the '<em><b>Consumed Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT__CONSUMED_VALUE = eINSTANCE.getInput_ConsumedValue();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fumldebug.core.trace.tracemodel.impl.OutputImpl <em>Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fumldebug.core.trace.tracemodel.impl.OutputImpl
		 * @see org.modelexecution.fumldebug.core.trace.tracemodel.impl.TracemodelPackageImpl#getOutput()
		 * @generated
		 */
		EClass OUTPUT = eINSTANCE.getOutput();

		/**
		 * The meta object literal for the '<em><b>Tokens</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT__TOKENS = eINSTANCE.getOutput_Tokens();

		/**
		 * The meta object literal for the '<em><b>Output Pin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT__OUTPUT_PIN = eINSTANCE.getOutput_OutputPin();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fumldebug.core.trace.tracemodel.impl.TokenInstanceImpl <em>Token Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fumldebug.core.trace.tracemodel.impl.TokenInstanceImpl
		 * @see org.modelexecution.fumldebug.core.trace.tracemodel.impl.TracemodelPackageImpl#getTokenInstance()
		 * @generated
		 */
		EClass TOKEN_INSTANCE = eINSTANCE.getTokenInstance();

		/**
		 * The meta object literal for the '<em><b>Traversed Edges</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN_INSTANCE__TRAVERSED_EDGES = eINSTANCE.getTokenInstance_TraversedEdges();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fumldebug.core.trace.tracemodel.impl.ObjectTokenInstanceImpl <em>Object Token Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fumldebug.core.trace.tracemodel.impl.ObjectTokenInstanceImpl
		 * @see org.modelexecution.fumldebug.core.trace.tracemodel.impl.TracemodelPackageImpl#getObjectTokenInstance()
		 * @generated
		 */
		EClass OBJECT_TOKEN_INSTANCE = eINSTANCE.getObjectTokenInstance();

		/**
		 * The meta object literal for the '<em><b>Value Instance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_TOKEN_INSTANCE__VALUE_INSTANCE = eINSTANCE.getObjectTokenInstance_ValueInstance();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fumldebug.core.trace.tracemodel.impl.ControlTokenInstanceImpl <em>Control Token Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fumldebug.core.trace.tracemodel.impl.ControlTokenInstanceImpl
		 * @see org.modelexecution.fumldebug.core.trace.tracemodel.impl.TracemodelPackageImpl#getControlTokenInstance()
		 * @generated
		 */
		EClass CONTROL_TOKEN_INSTANCE = eINSTANCE.getControlTokenInstance();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fumldebug.core.trace.tracemodel.impl.ValueInstanceImpl <em>Value Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fumldebug.core.trace.tracemodel.impl.ValueInstanceImpl
		 * @see org.modelexecution.fumldebug.core.trace.tracemodel.impl.TracemodelPackageImpl#getValueInstance()
		 * @generated
		 */
		EClass VALUE_INSTANCE = eINSTANCE.getValueInstance();

		/**
		 * The meta object literal for the '<em><b>Snapshots</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_INSTANCE__SNAPSHOTS = eINSTANCE.getValueInstance_Snapshots();

		/**
		 * The meta object literal for the '<em><b>Original</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_INSTANCE__ORIGINAL = eINSTANCE.getValueInstance_Original();

		/**
		 * The meta object literal for the '<em><b>Value ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_INSTANCE__VALUE_ID = eINSTANCE.getValueInstance_ValueID();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fumldebug.core.trace.tracemodel.impl.ActionExecutionImpl <em>Action Execution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fumldebug.core.trace.tracemodel.impl.ActionExecutionImpl
		 * @see org.modelexecution.fumldebug.core.trace.tracemodel.impl.TracemodelPackageImpl#getActionExecution()
		 * @generated
		 */
		EClass ACTION_EXECUTION = eINSTANCE.getActionExecution();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_EXECUTION__INPUTS = eINSTANCE.getActionExecution_Inputs();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_EXECUTION__OUTPUTS = eINSTANCE.getActionExecution_Outputs();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fumldebug.core.trace.tracemodel.impl.ControlNodeExecutionImpl <em>Control Node Execution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fumldebug.core.trace.tracemodel.impl.ControlNodeExecutionImpl
		 * @see org.modelexecution.fumldebug.core.trace.tracemodel.impl.TracemodelPackageImpl#getControlNodeExecution()
		 * @generated
		 */
		EClass CONTROL_NODE_EXECUTION = eINSTANCE.getControlNodeExecution();

		/**
		 * The meta object literal for the '<em><b>Routed Tokens</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_NODE_EXECUTION__ROUTED_TOKENS = eINSTANCE.getControlNodeExecution_RoutedTokens();

		/**
		 * The meta object literal for the '{@link org.modelexecution.fumldebug.core.trace.tracemodel.impl.ValueInstanceSnapshotImpl <em>Value Instance Snapshot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.modelexecution.fumldebug.core.trace.tracemodel.impl.ValueInstanceSnapshotImpl
		 * @see org.modelexecution.fumldebug.core.trace.tracemodel.impl.TracemodelPackageImpl#getValueInstanceSnapshot()
		 * @generated
		 */
		EClass VALUE_INSTANCE_SNAPSHOT = eINSTANCE.getValueInstanceSnapshot();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_INSTANCE_SNAPSHOT__VALUE = eINSTANCE.getValueInstanceSnapshot_Value();

		/**
		 * The meta object literal for the '<em>Activity</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fUML.Syntax.Activities.IntermediateActivities.Activity
		 * @see org.modelexecution.fumldebug.core.trace.tracemodel.impl.TracemodelPackageImpl#getActivity()
		 * @generated
		 */
		EDataType ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em>Activity Node</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fUML.Syntax.Activities.IntermediateActivities.ActivityNode
		 * @see org.modelexecution.fumldebug.core.trace.tracemodel.impl.TracemodelPackageImpl#getActivityNode()
		 * @generated
		 */
		EDataType ACTIVITY_NODE = eINSTANCE.getActivityNode();

		/**
		 * The meta object literal for the '<em>Behavior</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fUML.Syntax.CommonBehaviors.BasicBehaviors.Behavior
		 * @see org.modelexecution.fumldebug.core.trace.tracemodel.impl.TracemodelPackageImpl#getBehavior()
		 * @generated
		 */
		EDataType BEHAVIOR = eINSTANCE.getBehavior();

		/**
		 * The meta object literal for the '<em>Activity Parameter Node</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fUML.Syntax.Activities.IntermediateActivities.ActivityParameterNode
		 * @see org.modelexecution.fumldebug.core.trace.tracemodel.impl.TracemodelPackageImpl#getActivityParameterNode()
		 * @generated
		 */
		EDataType ACTIVITY_PARAMETER_NODE = eINSTANCE.getActivityParameterNode();

		/**
		 * The meta object literal for the '<em>Input Pin</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fUML.Syntax.Actions.BasicActions.InputPin
		 * @see org.modelexecution.fumldebug.core.trace.tracemodel.impl.TracemodelPackageImpl#getInputPin()
		 * @generated
		 */
		EDataType INPUT_PIN = eINSTANCE.getInputPin();

		/**
		 * The meta object literal for the '<em>Output Pin</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fUML.Syntax.Actions.BasicActions.OutputPin
		 * @see org.modelexecution.fumldebug.core.trace.tracemodel.impl.TracemodelPackageImpl#getOutputPin()
		 * @generated
		 */
		EDataType OUTPUT_PIN = eINSTANCE.getOutputPin();

		/**
		 * The meta object literal for the '<em>Activity Edge</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fUML.Syntax.Activities.IntermediateActivities.ActivityEdge
		 * @see org.modelexecution.fumldebug.core.trace.tracemodel.impl.TracemodelPackageImpl#getActivityEdge()
		 * @generated
		 */
		EDataType ACTIVITY_EDGE = eINSTANCE.getActivityEdge();

		/**
		 * The meta object literal for the '<em>Value</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fUML.Semantics.Classes.Kernel.Value
		 * @see org.modelexecution.fumldebug.core.trace.tracemodel.impl.TracemodelPackageImpl#getValue()
		 * @generated
		 */
		EDataType VALUE = eINSTANCE.getValue();

	}

} //TracemodelPackage
