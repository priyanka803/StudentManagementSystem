package com.sdn.student.web.mvc;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.sdn.student.web.constants.MVCCommandNameConstants;
import com.sdn.student.web.constants.StudentPortletKeys;
import com.sdn.student.web.model.Student;
import com.sdn.student.web.service.StudentLocalService;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
		immediate = true,
		property = {
				"javax.portlet.name="+ StudentPortletKeys.STUDENT,
				"mvc.command.name=" + MVCCommandNameConstants.UPDATE_STUDENT_RENDER_URL, 
				}, 
		service = MVCRenderCommand.class)
public class UpdateStudentMVCRenderCommand implements MVCRenderCommand{

	@Reference
	private StudentLocalService studentLocalService;
	
	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		long studentId=Integer.parseInt(ParamUtil.getString(renderRequest, "studentId"));
		Student student=null;
		try {
			student=studentLocalService.getStudent(studentId);
		} catch (PortalException e) {
			e.printStackTrace();
		}
		renderRequest.setAttribute("student", student);
		return MVCCommandNameConstants.UPDATE_STUDENT_JSP;
	}

}
