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
import com.sdn.student.web.service.base.StudentServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = {
		"json.web.service.context.name=student",
		"json.web.service.context.path=Student"
	},
	service = AopService.class
)
public class StudentServiceImpl extends StudentServiceBaseImpl {
//	@Reference
//	private StudentLocalService studentLocalService;
//	
	public Student findStudentByFirstName(String firstName) throws NoSuchStudentException{
		return studentLocalService.findStudentByFirstName(firstName);
	}

}