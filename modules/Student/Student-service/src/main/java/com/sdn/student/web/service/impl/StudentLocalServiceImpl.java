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

package com.sdn.student.web.service.impl;

import com.liferay.portal.aop.AopService;
import com.sdn.student.web.exception.NoSuchStudentException;
import com.sdn.student.web.model.Student;
import com.sdn.student.web.service.base.StudentLocalServiceBaseImpl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(property = "model.class.name=com.sdn.student.web.model.Student", service = AopService.class)
public class StudentLocalServiceImpl extends StudentLocalServiceBaseImpl {

//	public Student addStudent(String firstName, String lastName, String course, String email) {
//
//		long studentId = counterLocalService.increment(Student.class.getName());
//		Student student = createStudent(studentId);
//
//		student.setFirstName(firstName);
//		student.setLastName(lastName);
//		student.setCourse(course);
//		student.setEmail(email);
//		student.setStudentId(studentId);
//		student = super.addStudent(student);
//		return student;
//	}
	
	public Student findStudentByFirstName(String firstName) throws NoSuchStudentException{

		return studentPersistence.findByFirstName(firstName);
	}

}