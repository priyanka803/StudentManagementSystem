package com.sdn.student.web.mvc;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.sdn.student.web.constants.MVCCommandNameConstants;
import com.sdn.student.web.constants.StudentPortletKeys;
import com.sdn.student.web.service.StudentLocalService;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
		immediate = true,
		property = {
				"javax.portlet.name="+ StudentPortletKeys.STUDENT,
				"mvc.command.name="+ MVCCommandNameConstants.DELETE_STUDENT, 
				}, 
		service = MVCActionCommand.class
		)
public class DeleteStudentMVCActionCommand extends BaseMVCActionCommand{

	@Reference
	private StudentLocalService studentLocalService;
	
	@Override
	public void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws PortletException {
		long studentId=Integer.parseInt(ParamUtil.getString(actionRequest, "studentId"));
		try {
			studentLocalService.deleteStudent(studentId);
		} catch (PortalException e) {
			e.printStackTrace();
		}
	}
	

}
