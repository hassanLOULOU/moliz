/**
 */
package org.modelexecution.xmof.Syntax.Classes.Kernel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.modelexecution.xmof.Syntax.Classes.Kernel.InstanceValue#getInstance <em>Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.modelexecution.xmof.Syntax.Classes.Kernel.KernelPackage#getInstanceValue()
 * @model
 * @generated
 */
public interface InstanceValue extends ValueSpecification {
	/**
	 * Returns the value of the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance</em>' reference.
	 * @see #setInstance(InstanceSpecification)
	 * @see org.modelexecution.xmof.Syntax.Classes.Kernel.KernelPackage#getInstanceValue_Instance()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	InstanceSpecification getInstance();

	/**
	 * Sets the value of the '{@link org.modelexecution.xmof.Syntax.Classes.Kernel.InstanceValue#getInstance <em>Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance</em>' reference.
	 * @see #getInstance()
	 * @generated
	 */
	void setInstance(InstanceSpecification value);

} // InstanceValue
