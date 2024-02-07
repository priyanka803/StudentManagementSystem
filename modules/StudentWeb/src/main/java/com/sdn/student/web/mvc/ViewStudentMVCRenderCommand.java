package com.sdn.student.web.mvc;
//package com.sdn.student.web.mvc;
//
//import com.liferay.portal.kernel.dao.orm.QueryUtil;
//import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
//import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
//import com.sdn.student.web.constants.StudentPortletKeys;
//import com.sdn.student.web.model.Student;
//import com.sdn.student.web.service.StudentLocalService;
//
//import java.util.List;
//
//import javax.portlet.PortletException;
//import javax.portlet.RenderRequest;
//import javax.portlet.RenderResponse;
//
//import org.osgi.service.component.annotations.Component;
//import org.osgi.service.component.annotations.Reference;
//
//@Component(
//		immediate = true,
//		property = {
//				"javax.portlet.name="+ StudentPortletKeys.STUDENT,
//				"mvc.command.name=" 
//				}, 
//		service = MVCRenderCommand.class
//		)
//public class ViewStudentMVCCommandAction implements MVCRenderCommand{
//
//	@Reference
//	private StudentLocalService studentLocalService;
//	
//	@Override
//	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
//		List<Student> students=studentLocalService.getStudents(QueryUtil.ALL_POS,QueryUtil.ALL_POS);
//		renderRequest.setAttribute("students", students);
//		return "/view.jsp";
//	}
//
//}
