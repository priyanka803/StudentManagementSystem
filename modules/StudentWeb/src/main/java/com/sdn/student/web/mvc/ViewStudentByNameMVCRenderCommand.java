package com.sdn.student.web.mvc;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.sdn.student.web.constants.MVCCommandNameConstants;
import com.sdn.student.web.constants.StudentPortletKeys;
import com.sdn.student.web.exception.NoSuchStudentException;
import com.sdn.student.web.model.Student;
import com.sdn.student.web.service.StudentLocalServiceUtil;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = { "javax.portlet.name=" + StudentPortletKeys.STUDENT,
		"mvc.command.name=" + MVCCommandNameConstants.VIEW_STUDENT_BY_NAME_URL }, service = MVCRenderCommand.class)

public class ViewStudentByNameMVCRenderCommand implements MVCRenderCommand {

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		String firstName = ParamUtil.getString(renderRequest, "firstName");
		Student student = null;
		try {
			student = StudentLocalServiceUtil.findStudentByFirstName(firstName);
		} catch (NoSuchStudentException e) {
			e.printStackTrace();
		}
		renderRequest.setAttribute("student", student);
		return MVCCommandNameConstants.VIEW_STUDENT_BY_NAME_JSP;
	}

}
