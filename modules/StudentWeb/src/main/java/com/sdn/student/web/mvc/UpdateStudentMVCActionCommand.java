package com.sdn.student.web.mvc;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.sdn.student.web.constants.MVCCommandNameConstants;
import com.sdn.student.web.constants.StudentPortletKeys;
import com.sdn.student.web.model.Student;
import com.sdn.student.web.service.StudentLocalService;

import java.nio.channels.SeekableByteChannel;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
		immediate = true,
		property = {
				"javax.portlet.name="+ StudentPortletKeys.STUDENT,
				"mvc.command.name=" + MVCCommandNameConstants.UPDATE_STUDENT, 
				}, 
		service = MVCActionCommand.class
		)
public class UpdateStudentMVCActionCommand implements MVCActionCommand {

	@Reference
	private StudentLocalService studentLocalService;

	@Override
	public boolean processAction(ActionRequest actionRequest, ActionResponse actionResponse) throws PortletException {
		String firstName=ParamUtil.getString(actionRequest, "firstName");
		String lastName=ParamUtil.getString(actionRequest, "lastName");
		String course=ParamUtil.getString(actionRequest, "course");
		String email=ParamUtil.getString(actionRequest, "email");
		long studentId=Long.parseLong(ParamUtil.getString(actionRequest, "studentId"));
		//long studentId = ParamUtil.getLong(actionRequest,"studentId");
		Student student=null;
		try {
			student = studentLocalService.getStudent(studentId);
			SessionMessages.add(actionRequest, "success");
		} catch (PortalException e) {
			SessionErrors.add(actionRequest, "error");
			e.printStackTrace();
		}
		student.setFirstName(firstName);
		student.setLastName(lastName);
		student.setCourse(course);
		student.setEmail(email);
		studentLocalService.updateStudent(student);
	
	return true;
}

}
