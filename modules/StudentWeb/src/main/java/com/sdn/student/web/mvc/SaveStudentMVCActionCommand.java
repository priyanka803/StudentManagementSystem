package com.sdn.student.web.mvc;

import com.liferay.counter.kernel.service.CounterLocalService;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.sdn.student.web.constants.MVCCommandNameConstants;
import com.sdn.student.web.constants.StudentPortletKeys;
import com.sdn.student.web.model.Student;
import com.sdn.student.web.service.StudentLocalService;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
		immediate = true,
		property = {
				"javax.portlet.name="+ StudentPortletKeys.STUDENT,
				"mvc.command.name=" + MVCCommandNameConstants.ADD_STUDENT, 
				}, 
		service = MVCActionCommand.class)

public class SaveStudentMVCActionCommand extends BaseMVCActionCommand {

	@Reference
	private StudentLocalService studentLocalService;
	
	@Reference
	private CounterLocalService counterLocalService;
	
	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		
		  String firstName=ParamUtil.getString(actionRequest, "firstName"); String
		  lastName=ParamUtil.getString(actionRequest, "lastName"); String
		  course=ParamUtil.getString(actionRequest, "course"); String
		  email=ParamUtil.getString(actionRequest, "email");
		  
		  long studentId= counterLocalService.increment(Student.class.getName());
		  Student student= studentLocalService.createStudent(studentId);
		  student.setFirstName(firstName); student.setLastName(lastName);
		  student.setCourse(course); student.setEmail(email);
		  student.setStudentId(studentId); studentLocalService.addStudent(student);
		 
  	   //   super.processAction(actionRequest, actionResponse);
		//StudentLocalServiceUtil.addStudent(student);
		
	}

}
