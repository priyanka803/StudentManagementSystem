/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.sdn.student.web.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.sdn.student.web.model.Student;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the student service. This utility wraps <code>com.sdn.student.web.service.persistence.impl.StudentPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see StudentPersistence
 * @generated
 */
public class StudentUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Student student) {
		getPersistence().clearCache(student);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Student> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Student> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Student> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Student> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Student> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Student update(Student student) {
		return getPersistence().update(student);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Student update(
		Student student, ServiceContext serviceContext) {

		return getPersistence().update(student, serviceContext);
	}

	/**
	 * Returns all the students where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching students
	 */
	public static List<Student> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the students where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StudentModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of students
	 * @param end the upper bound of the range of students (not inclusive)
	 * @return the range of matching students
	 */
	public static List<Student> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the students where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StudentModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of students
	 * @param end the upper bound of the range of students (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching students
	 */
	public static List<Student> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Student> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the students where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StudentModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of students
	 * @param end the upper bound of the range of students (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching students
	 */
	public static List<Student> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Student> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first student in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching student
	 * @throws NoSuchStudentException if a matching student could not be found
	 */
	public static Student findByUuid_First(
			String uuid, OrderByComparator<Student> orderByComparator)
		throws com.sdn.student.web.exception.NoSuchStudentException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first student in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching student, or <code>null</code> if a matching student could not be found
	 */
	public static Student fetchByUuid_First(
		String uuid, OrderByComparator<Student> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last student in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching student
	 * @throws NoSuchStudentException if a matching student could not be found
	 */
	public static Student findByUuid_Last(
			String uuid, OrderByComparator<Student> orderByComparator)
		throws com.sdn.student.web.exception.NoSuchStudentException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last student in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching student, or <code>null</code> if a matching student could not be found
	 */
	public static Student fetchByUuid_Last(
		String uuid, OrderByComparator<Student> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the students before and after the current student in the ordered set where uuid = &#63;.
	 *
	 * @param studentId the primary key of the current student
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next student
	 * @throws NoSuchStudentException if a student with the primary key could not be found
	 */
	public static Student[] findByUuid_PrevAndNext(
			long studentId, String uuid,
			OrderByComparator<Student> orderByComparator)
		throws com.sdn.student.web.exception.NoSuchStudentException {

		return getPersistence().findByUuid_PrevAndNext(
			studentId, uuid, orderByComparator);
	}

	/**
	 * Removes all the students where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of students where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching students
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the student where firstName = &#63; or throws a <code>NoSuchStudentException</code> if it could not be found.
	 *
	 * @param firstName the first name
	 * @return the matching student
	 * @throws NoSuchStudentException if a matching student could not be found
	 */
	public static Student findByFirstName(String firstName)
		throws com.sdn.student.web.exception.NoSuchStudentException {

		return getPersistence().findByFirstName(firstName);
	}

	/**
	 * Returns the student where firstName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param firstName the first name
	 * @return the matching student, or <code>null</code> if a matching student could not be found
	 */
	public static Student fetchByFirstName(String firstName) {
		return getPersistence().fetchByFirstName(firstName);
	}

	/**
	 * Returns the student where firstName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param firstName the first name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching student, or <code>null</code> if a matching student could not be found
	 */
	public static Student fetchByFirstName(
		String firstName, boolean useFinderCache) {

		return getPersistence().fetchByFirstName(firstName, useFinderCache);
	}

	/**
	 * Removes the student where firstName = &#63; from the database.
	 *
	 * @param firstName the first name
	 * @return the student that was removed
	 */
	public static Student removeByFirstName(String firstName)
		throws com.sdn.student.web.exception.NoSuchStudentException {

		return getPersistence().removeByFirstName(firstName);
	}

	/**
	 * Returns the number of students where firstName = &#63;.
	 *
	 * @param firstName the first name
	 * @return the number of matching students
	 */
	public static int countByFirstName(String firstName) {
		return getPersistence().countByFirstName(firstName);
	}

	/**
	 * Caches the student in the entity cache if it is enabled.
	 *
	 * @param student the student
	 */
	public static void cacheResult(Student student) {
		getPersistence().cacheResult(student);
	}

	/**
	 * Caches the students in the entity cache if it is enabled.
	 *
	 * @param students the students
	 */
	public static void cacheResult(List<Student> students) {
		getPersistence().cacheResult(students);
	}

	/**
	 * Creates a new student with the primary key. Does not add the student to the database.
	 *
	 * @param studentId the primary key for the new student
	 * @return the new student
	 */
	public static Student create(long studentId) {
		return getPersistence().create(studentId);
	}

	/**
	 * Removes the student with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param studentId the primary key of the student
	 * @return the student that was removed
	 * @throws NoSuchStudentException if a student with the primary key could not be found
	 */
	public static Student remove(long studentId)
		throws com.sdn.student.web.exception.NoSuchStudentException {

		return getPersistence().remove(studentId);
	}

	public static Student updateImpl(Student student) {
		return getPersistence().updateImpl(student);
	}

	/**
	 * Returns the student with the primary key or throws a <code>NoSuchStudentException</code> if it could not be found.
	 *
	 * @param studentId the primary key of the student
	 * @return the student
	 * @throws NoSuchStudentException if a student with the primary key could not be found
	 */
	public static Student findByPrimaryKey(long studentId)
		throws com.sdn.student.web.exception.NoSuchStudentException {

		return getPersistence().findByPrimaryKey(studentId);
	}

	/**
	 * Returns the student with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param studentId the primary key of the student
	 * @return the student, or <code>null</code> if a student with the primary key could not be found
	 */
	public static Student fetchByPrimaryKey(long studentId) {
		return getPersistence().fetchByPrimaryKey(studentId);
	}

	/**
	 * Returns all the students.
	 *
	 * @return the students
	 */
	public static List<Student> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the students.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StudentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of students
	 * @param end the upper bound of the range of students (not inclusive)
	 * @return the range of students
	 */
	public static List<Student> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the students.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StudentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of students
	 * @param end the upper bound of the range of students (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of students
	 */
	public static List<Student> findAll(
		int start, int end, OrderByComparator<Student> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the students.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StudentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of students
	 * @param end the upper bound of the range of students (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of students
	 */
	public static List<Student> findAll(
		int start, int end, OrderByComparator<Student> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the students from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of students.
	 *
	 * @return the number of students
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static StudentPersistence getPersistence() {
		return _persistence;
	}

	private static volatile StudentPersistence _persistence;

}