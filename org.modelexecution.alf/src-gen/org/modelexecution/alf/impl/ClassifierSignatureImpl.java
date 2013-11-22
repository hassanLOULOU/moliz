/**
 */
package org.modelexecution.alf.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.modelexecution.alf.AlfPackage;
import org.modelexecution.alf.ClassifierSignature;
import org.modelexecution.alf.Name;
import org.modelexecution.alf.SpecializationClause;
import org.modelexecution.alf.TemplateParameters;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classifier Signature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.modelexecution.alf.impl.ClassifierSignatureImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.modelexecution.alf.impl.ClassifierSignatureImpl#getTemplateParameters <em>Template Parameters</em>}</li>
 *   <li>{@link org.modelexecution.alf.impl.ClassifierSignatureImpl#getSpecializationClause <em>Specialization Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassifierSignatureImpl extends MinimalEObjectImpl.Container implements ClassifierSignature
{
  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected Name name;

  /**
   * The cached value of the '{@link #getTemplateParameters() <em>Template Parameters</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTemplateParameters()
   * @generated
   * @ordered
   */
  protected TemplateParameters templateParameters;

  /**
   * The cached value of the '{@link #getSpecializationClause() <em>Specialization Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpecializationClause()
   * @generated
   * @ordered
   */
  protected SpecializationClause specializationClause;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClassifierSignatureImpl()
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
    return AlfPackage.eINSTANCE.getClassifierSignature();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Name getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetName(Name newName, NotificationChain msgs)
  {
    Name oldName = name;
    name = newName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlfPackage.CLASSIFIER_SIGNATURE__NAME, oldName, newName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(Name newName)
  {
    if (newName != name)
    {
      NotificationChain msgs = null;
      if (name != null)
        msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlfPackage.CLASSIFIER_SIGNATURE__NAME, null, msgs);
      if (newName != null)
        msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlfPackage.CLASSIFIER_SIGNATURE__NAME, null, msgs);
      msgs = basicSetName(newName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlfPackage.CLASSIFIER_SIGNATURE__NAME, newName, newName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemplateParameters getTemplateParameters()
  {
    return templateParameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTemplateParameters(TemplateParameters newTemplateParameters, NotificationChain msgs)
  {
    TemplateParameters oldTemplateParameters = templateParameters;
    templateParameters = newTemplateParameters;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlfPackage.CLASSIFIER_SIGNATURE__TEMPLATE_PARAMETERS, oldTemplateParameters, newTemplateParameters);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTemplateParameters(TemplateParameters newTemplateParameters)
  {
    if (newTemplateParameters != templateParameters)
    {
      NotificationChain msgs = null;
      if (templateParameters != null)
        msgs = ((InternalEObject)templateParameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlfPackage.CLASSIFIER_SIGNATURE__TEMPLATE_PARAMETERS, null, msgs);
      if (newTemplateParameters != null)
        msgs = ((InternalEObject)newTemplateParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlfPackage.CLASSIFIER_SIGNATURE__TEMPLATE_PARAMETERS, null, msgs);
      msgs = basicSetTemplateParameters(newTemplateParameters, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlfPackage.CLASSIFIER_SIGNATURE__TEMPLATE_PARAMETERS, newTemplateParameters, newTemplateParameters));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpecializationClause getSpecializationClause()
  {
    return specializationClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSpecializationClause(SpecializationClause newSpecializationClause, NotificationChain msgs)
  {
    SpecializationClause oldSpecializationClause = specializationClause;
    specializationClause = newSpecializationClause;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlfPackage.CLASSIFIER_SIGNATURE__SPECIALIZATION_CLAUSE, oldSpecializationClause, newSpecializationClause);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSpecializationClause(SpecializationClause newSpecializationClause)
  {
    if (newSpecializationClause != specializationClause)
    {
      NotificationChain msgs = null;
      if (specializationClause != null)
        msgs = ((InternalEObject)specializationClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlfPackage.CLASSIFIER_SIGNATURE__SPECIALIZATION_CLAUSE, null, msgs);
      if (newSpecializationClause != null)
        msgs = ((InternalEObject)newSpecializationClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlfPackage.CLASSIFIER_SIGNATURE__SPECIALIZATION_CLAUSE, null, msgs);
      msgs = basicSetSpecializationClause(newSpecializationClause, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlfPackage.CLASSIFIER_SIGNATURE__SPECIALIZATION_CLAUSE, newSpecializationClause, newSpecializationClause));
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
      case AlfPackage.CLASSIFIER_SIGNATURE__NAME:
        return basicSetName(null, msgs);
      case AlfPackage.CLASSIFIER_SIGNATURE__TEMPLATE_PARAMETERS:
        return basicSetTemplateParameters(null, msgs);
      case AlfPackage.CLASSIFIER_SIGNATURE__SPECIALIZATION_CLAUSE:
        return basicSetSpecializationClause(null, msgs);
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
      case AlfPackage.CLASSIFIER_SIGNATURE__NAME:
        return getName();
      case AlfPackage.CLASSIFIER_SIGNATURE__TEMPLATE_PARAMETERS:
        return getTemplateParameters();
      case AlfPackage.CLASSIFIER_SIGNATURE__SPECIALIZATION_CLAUSE:
        return getSpecializationClause();
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
      case AlfPackage.CLASSIFIER_SIGNATURE__NAME:
        setName((Name)newValue);
        return;
      case AlfPackage.CLASSIFIER_SIGNATURE__TEMPLATE_PARAMETERS:
        setTemplateParameters((TemplateParameters)newValue);
        return;
      case AlfPackage.CLASSIFIER_SIGNATURE__SPECIALIZATION_CLAUSE:
        setSpecializationClause((SpecializationClause)newValue);
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
      case AlfPackage.CLASSIFIER_SIGNATURE__NAME:
        setName((Name)null);
        return;
      case AlfPackage.CLASSIFIER_SIGNATURE__TEMPLATE_PARAMETERS:
        setTemplateParameters((TemplateParameters)null);
        return;
      case AlfPackage.CLASSIFIER_SIGNATURE__SPECIALIZATION_CLAUSE:
        setSpecializationClause((SpecializationClause)null);
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
      case AlfPackage.CLASSIFIER_SIGNATURE__NAME:
        return name != null;
      case AlfPackage.CLASSIFIER_SIGNATURE__TEMPLATE_PARAMETERS:
        return templateParameters != null;
      case AlfPackage.CLASSIFIER_SIGNATURE__SPECIALIZATION_CLAUSE:
        return specializationClause != null;
    }
    return super.eIsSet(featureID);
  }

} //ClassifierSignatureImpl