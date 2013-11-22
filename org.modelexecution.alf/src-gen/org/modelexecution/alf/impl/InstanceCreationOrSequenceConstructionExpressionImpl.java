/**
 */
package org.modelexecution.alf.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.modelexecution.alf.AlfPackage;
import org.modelexecution.alf.InstanceCreationOrSequenceConstructionExpression;
import org.modelexecution.alf.QualifiedName;
import org.modelexecution.alf.SequenceConstructionExpressionCompletion;
import org.modelexecution.alf.Tuple;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance Creation Or Sequence Construction Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.modelexecution.alf.impl.InstanceCreationOrSequenceConstructionExpressionImpl#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link org.modelexecution.alf.impl.InstanceCreationOrSequenceConstructionExpressionImpl#getSequenceConstructionExpressionCompletion <em>Sequence Construction Expression Completion</em>}</li>
 *   <li>{@link org.modelexecution.alf.impl.InstanceCreationOrSequenceConstructionExpressionImpl#getTuple <em>Tuple</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstanceCreationOrSequenceConstructionExpressionImpl extends BaseExpressionImpl implements InstanceCreationOrSequenceConstructionExpression
{
  /**
   * The cached value of the '{@link #getQualifiedName() <em>Qualified Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQualifiedName()
   * @generated
   * @ordered
   */
  protected QualifiedName qualifiedName;

  /**
   * The cached value of the '{@link #getSequenceConstructionExpressionCompletion() <em>Sequence Construction Expression Completion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSequenceConstructionExpressionCompletion()
   * @generated
   * @ordered
   */
  protected SequenceConstructionExpressionCompletion sequenceConstructionExpressionCompletion;

  /**
   * The cached value of the '{@link #getTuple() <em>Tuple</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTuple()
   * @generated
   * @ordered
   */
  protected Tuple tuple;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InstanceCreationOrSequenceConstructionExpressionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AlfPackage.eINSTANCE.getInstanceCreationOrSequenceConstructionExpression();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QualifiedName getQualifiedName()
  {
    return qualifiedName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQualifiedName(QualifiedName newQualifiedName, NotificationChain msgs)
  {
    QualifiedName oldQualifiedName = qualifiedName;
    qualifiedName = newQualifiedName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlfPackage.INSTANCE_CREATION_OR_SEQUENCE_CONSTRUCTION_EXPRESSION__QUALIFIED_NAME, oldQualifiedName, newQualifiedName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQualifiedName(QualifiedName newQualifiedName)
  {
    if (newQualifiedName != qualifiedName)
    {
      NotificationChain msgs = null;
      if (qualifiedName != null)
        msgs = ((InternalEObject)qualifiedName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlfPackage.INSTANCE_CREATION_OR_SEQUENCE_CONSTRUCTION_EXPRESSION__QUALIFIED_NAME, null, msgs);
      if (newQualifiedName != null)
        msgs = ((InternalEObject)newQualifiedName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlfPackage.INSTANCE_CREATION_OR_SEQUENCE_CONSTRUCTION_EXPRESSION__QUALIFIED_NAME, null, msgs);
      msgs = basicSetQualifiedName(newQualifiedName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlfPackage.INSTANCE_CREATION_OR_SEQUENCE_CONSTRUCTION_EXPRESSION__QUALIFIED_NAME, newQualifiedName, newQualifiedName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SequenceConstructionExpressionCompletion getSequenceConstructionExpressionCompletion()
  {
    return sequenceConstructionExpressionCompletion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSequenceConstructionExpressionCompletion(SequenceConstructionExpressionCompletion newSequenceConstructionExpressionCompletion, NotificationChain msgs)
  {
    SequenceConstructionExpressionCompletion oldSequenceConstructionExpressionCompletion = sequenceConstructionExpressionCompletion;
    sequenceConstructionExpressionCompletion = newSequenceConstructionExpressionCompletion;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlfPackage.INSTANCE_CREATION_OR_SEQUENCE_CONSTRUCTION_EXPRESSION__SEQUENCE_CONSTRUCTION_EXPRESSION_COMPLETION, oldSequenceConstructionExpressionCompletion, newSequenceConstructionExpressionCompletion);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSequenceConstructionExpressionCompletion(SequenceConstructionExpressionCompletion newSequenceConstructionExpressionCompletion)
  {
    if (newSequenceConstructionExpressionCompletion != sequenceConstructionExpressionCompletion)
    {
      NotificationChain msgs = null;
      if (sequenceConstructionExpressionCompletion != null)
        msgs = ((InternalEObject)sequenceConstructionExpressionCompletion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlfPackage.INSTANCE_CREATION_OR_SEQUENCE_CONSTRUCTION_EXPRESSION__SEQUENCE_CONSTRUCTION_EXPRESSION_COMPLETION, null, msgs);
      if (newSequenceConstructionExpressionCompletion != null)
        msgs = ((InternalEObject)newSequenceConstructionExpressionCompletion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlfPackage.INSTANCE_CREATION_OR_SEQUENCE_CONSTRUCTION_EXPRESSION__SEQUENCE_CONSTRUCTION_EXPRESSION_COMPLETION, null, msgs);
      msgs = basicSetSequenceConstructionExpressionCompletion(newSequenceConstructionExpressionCompletion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlfPackage.INSTANCE_CREATION_OR_SEQUENCE_CONSTRUCTION_EXPRESSION__SEQUENCE_CONSTRUCTION_EXPRESSION_COMPLETION, newSequenceConstructionExpressionCompletion, newSequenceConstructionExpressionCompletion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Tuple getTuple()
  {
    return tuple;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTuple(Tuple newTuple, NotificationChain msgs)
  {
    Tuple oldTuple = tuple;
    tuple = newTuple;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlfPackage.INSTANCE_CREATION_OR_SEQUENCE_CONSTRUCTION_EXPRESSION__TUPLE, oldTuple, newTuple);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTuple(Tuple newTuple)
  {
    if (newTuple != tuple)
    {
      NotificationChain msgs = null;
      if (tuple != null)
        msgs = ((InternalEObject)tuple).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlfPackage.INSTANCE_CREATION_OR_SEQUENCE_CONSTRUCTION_EXPRESSION__TUPLE, null, msgs);
      if (newTuple != null)
        msgs = ((InternalEObject)newTuple).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlfPackage.INSTANCE_CREATION_OR_SEQUENCE_CONSTRUCTION_EXPRESSION__TUPLE, null, msgs);
      msgs = basicSetTuple(newTuple, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlfPackage.INSTANCE_CREATION_OR_SEQUENCE_CONSTRUCTION_EXPRESSION__TUPLE, newTuple, newTuple));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AlfPackage.INSTANCE_CREATION_OR_SEQUENCE_CONSTRUCTION_EXPRESSION__QUALIFIED_NAME:
        return basicSetQualifiedName(null, msgs);
      case AlfPackage.INSTANCE_CREATION_OR_SEQUENCE_CONSTRUCTION_EXPRESSION__SEQUENCE_CONSTRUCTION_EXPRESSION_COMPLETION:
        return basicSetSequenceConstructionExpressionCompletion(null, msgs);
      case AlfPackage.INSTANCE_CREATION_OR_SEQUENCE_CONSTRUCTION_EXPRESSION__TUPLE:
        return basicSetTuple(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AlfPackage.INSTANCE_CREATION_OR_SEQUENCE_CONSTRUCTION_EXPRESSION__QUALIFIED_NAME:
        return getQualifiedName();
      case AlfPackage.INSTANCE_CREATION_OR_SEQUENCE_CONSTRUCTION_EXPRESSION__SEQUENCE_CONSTRUCTION_EXPRESSION_COMPLETION:
        return getSequenceConstructionExpressionCompletion();
      case AlfPackage.INSTANCE_CREATION_OR_SEQUENCE_CONSTRUCTION_EXPRESSION__TUPLE:
        return getTuple();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AlfPackage.INSTANCE_CREATION_OR_SEQUENCE_CONSTRUCTION_EXPRESSION__QUALIFIED_NAME:
        setQualifiedName((QualifiedName)newValue);
        return;
      case AlfPackage.INSTANCE_CREATION_OR_SEQUENCE_CONSTRUCTION_EXPRESSION__SEQUENCE_CONSTRUCTION_EXPRESSION_COMPLETION:
        setSequenceConstructionExpressionCompletion((SequenceConstructionExpressionCompletion)newValue);
        return;
      case AlfPackage.INSTANCE_CREATION_OR_SEQUENCE_CONSTRUCTION_EXPRESSION__TUPLE:
        setTuple((Tuple)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AlfPackage.INSTANCE_CREATION_OR_SEQUENCE_CONSTRUCTION_EXPRESSION__QUALIFIED_NAME:
        setQualifiedName((QualifiedName)null);
        return;
      case AlfPackage.INSTANCE_CREATION_OR_SEQUENCE_CONSTRUCTION_EXPRESSION__SEQUENCE_CONSTRUCTION_EXPRESSION_COMPLETION:
        setSequenceConstructionExpressionCompletion((SequenceConstructionExpressionCompletion)null);
        return;
      case AlfPackage.INSTANCE_CREATION_OR_SEQUENCE_CONSTRUCTION_EXPRESSION__TUPLE:
        setTuple((Tuple)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AlfPackage.INSTANCE_CREATION_OR_SEQUENCE_CONSTRUCTION_EXPRESSION__QUALIFIED_NAME:
        return qualifiedName != null;
      case AlfPackage.INSTANCE_CREATION_OR_SEQUENCE_CONSTRUCTION_EXPRESSION__SEQUENCE_CONSTRUCTION_EXPRESSION_COMPLETION:
        return sequenceConstructionExpressionCompletion != null;
      case AlfPackage.INSTANCE_CREATION_OR_SEQUENCE_CONSTRUCTION_EXPRESSION__TUPLE:
        return tuple != null;
    }
    return super.eIsSet(featureID);
  }

} //InstanceCreationOrSequenceConstructionExpressionImpl