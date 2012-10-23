/**
 */
package org.modelexecution.xmof.Syntax.Actions.IntermediateActions.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.modelexecution.xmof.Syntax.Actions.BasicActions.InputPin;

import org.modelexecution.xmof.Syntax.Actions.IntermediateActions.IntermediateActionsPackage;
import org.modelexecution.xmof.Syntax.Actions.IntermediateActions.LinkEndCreationData;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link End Creation Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.modelexecution.xmof.Syntax.Actions.IntermediateActions.impl.LinkEndCreationDataImpl#getIsReplaceAll <em>Is Replace All</em>}</li>
 *   <li>{@link org.modelexecution.xmof.Syntax.Actions.IntermediateActions.impl.LinkEndCreationDataImpl#getInsertAt <em>Insert At</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkEndCreationDataImpl extends LinkEndDataImpl implements LinkEndCreationData {
	/**
	 * The default value of the '{@link #getIsReplaceAll() <em>Is Replace All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsReplaceAll()
	 * @generated
	 * @ordered
	 */
	protected static final Object IS_REPLACE_ALL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsReplaceAll() <em>Is Replace All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsReplaceAll()
	 * @generated
	 * @ordered
	 */
	protected Object isReplaceAll = IS_REPLACE_ALL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInsertAt() <em>Insert At</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsertAt()
	 * @generated
	 * @ordered
	 */
	protected InputPin insertAt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkEndCreationDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntermediateActionsPackage.Literals.LINK_END_CREATION_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getIsReplaceAll() {
		return isReplaceAll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsReplaceAll(Object newIsReplaceAll) {
		Object oldIsReplaceAll = isReplaceAll;
		isReplaceAll = newIsReplaceAll;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediateActionsPackage.LINK_END_CREATION_DATA__IS_REPLACE_ALL, oldIsReplaceAll, isReplaceAll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getInsertAt() {
		if (insertAt != null && insertAt.eIsProxy()) {
			InternalEObject oldInsertAt = (InternalEObject)insertAt;
			insertAt = (InputPin)eResolveProxy(oldInsertAt);
			if (insertAt != oldInsertAt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IntermediateActionsPackage.LINK_END_CREATION_DATA__INSERT_AT, oldInsertAt, insertAt));
			}
		}
		return insertAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin basicGetInsertAt() {
		return insertAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsertAt(InputPin newInsertAt) {
		InputPin oldInsertAt = insertAt;
		insertAt = newInsertAt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediateActionsPackage.LINK_END_CREATION_DATA__INSERT_AT, oldInsertAt, insertAt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IntermediateActionsPackage.LINK_END_CREATION_DATA__IS_REPLACE_ALL:
				return getIsReplaceAll();
			case IntermediateActionsPackage.LINK_END_CREATION_DATA__INSERT_AT:
				if (resolve) return getInsertAt();
				return basicGetInsertAt();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IntermediateActionsPackage.LINK_END_CREATION_DATA__IS_REPLACE_ALL:
				setIsReplaceAll(newValue);
				return;
			case IntermediateActionsPackage.LINK_END_CREATION_DATA__INSERT_AT:
				setInsertAt((InputPin)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case IntermediateActionsPackage.LINK_END_CREATION_DATA__IS_REPLACE_ALL:
				setIsReplaceAll(IS_REPLACE_ALL_EDEFAULT);
				return;
			case IntermediateActionsPackage.LINK_END_CREATION_DATA__INSERT_AT:
				setInsertAt((InputPin)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case IntermediateActionsPackage.LINK_END_CREATION_DATA__IS_REPLACE_ALL:
				return IS_REPLACE_ALL_EDEFAULT == null ? isReplaceAll != null : !IS_REPLACE_ALL_EDEFAULT.equals(isReplaceAll);
			case IntermediateActionsPackage.LINK_END_CREATION_DATA__INSERT_AT:
				return insertAt != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isReplaceAll: ");
		result.append(isReplaceAll);
		result.append(')');
		return result.toString();
	}

} //LinkEndCreationDataImpl
