/**
 */
package org.nasdanika.models.education;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.party.Party;
import org.nasdanika.models.party.Person;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>School</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.education.School#getFaculty <em>Faculty</em>}</li>
 *   <li>{@link org.nasdanika.models.education.School#getStudents <em>Students</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.education.EducationPackage#getSchool()
 * @model abstract="true"
 * @generated
 */
public interface School extends Party {
	/**
	 * Returns the value of the '<em><b>Faculty</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.party.Person}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Faculty</em>' containment reference list.
	 * @see org.nasdanika.models.education.EducationPackage#getSchool_Faculty()
	 * @model containment="true"
	 * @generated
	 */
	EList<Person> getFaculty();

	/**
	 * Returns the value of the '<em><b>Students</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.party.Person}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Students</em>' containment reference list.
	 * @see org.nasdanika.models.education.EducationPackage#getSchool_Students()
	 * @model containment="true"
	 * @generated
	 */
	EList<Person> getStudents();

} // School
