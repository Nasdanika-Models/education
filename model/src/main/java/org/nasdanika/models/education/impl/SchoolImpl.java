/**
 */
package org.nasdanika.models.education.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.education.EducationPackage;
import org.nasdanika.models.education.School;

import org.nasdanika.models.party.Person;

import org.nasdanika.models.party.impl.PartyImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>School</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.education.impl.SchoolImpl#getFaculty <em>Faculty</em>}</li>
 *   <li>{@link org.nasdanika.models.education.impl.SchoolImpl#getStudents <em>Students</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SchoolImpl extends PartyImpl implements School {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchoolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EducationPackage.Literals.SCHOOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Person> getFaculty() {
		return (EList<Person>)eDynamicGet(EducationPackage.SCHOOL__FACULTY, EducationPackage.Literals.SCHOOL__FACULTY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Person> getStudents() {
		return (EList<Person>)eDynamicGet(EducationPackage.SCHOOL__STUDENTS, EducationPackage.Literals.SCHOOL__STUDENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EducationPackage.SCHOOL__FACULTY:
				return ((InternalEList<?>)getFaculty()).basicRemove(otherEnd, msgs);
			case EducationPackage.SCHOOL__STUDENTS:
				return ((InternalEList<?>)getStudents()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EducationPackage.SCHOOL__FACULTY:
				return getFaculty();
			case EducationPackage.SCHOOL__STUDENTS:
				return getStudents();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EducationPackage.SCHOOL__FACULTY:
				getFaculty().clear();
				getFaculty().addAll((Collection<? extends Person>)newValue);
				return;
			case EducationPackage.SCHOOL__STUDENTS:
				getStudents().clear();
				getStudents().addAll((Collection<? extends Person>)newValue);
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
			case EducationPackage.SCHOOL__FACULTY:
				getFaculty().clear();
				return;
			case EducationPackage.SCHOOL__STUDENTS:
				getStudents().clear();
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
			case EducationPackage.SCHOOL__FACULTY:
				return !getFaculty().isEmpty();
			case EducationPackage.SCHOOL__STUDENTS:
				return !getStudents().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SchoolImpl
