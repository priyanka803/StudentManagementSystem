package com.sdn.student.web.portlet;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.sdn.student.web.constants.StudentPortletKeys;
import com.sdn.student.web.model.Student;
import com.sdn.student.web.service.StudentLocalService;

import java.io.IOException;
import java.util.List;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author hp
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Student",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + StudentPortletKeys.STUDENT,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class StudentPortlet extends MVCPortlet {
	@Reference
	private StudentLocalService studentLocalService;
	
//	@Reference
//	private CounterLocalService counterLocalService;
//	
//	public void addStudent(ActionRequest request, ActionResponse response) throws UnsupportedEncodingException, IOException {
//		String firstName=ParamUtil.getString(request, "firstName");
//		String lastName=ParamUtil.getString(request, "lastName");
//		String course=ParamUtil.getString(request, "course");
//		String email=ParamUtil.getString(request, "email");
//		
//		long studentId= counterLocalService.increment(Student.class.getName());
//		Student student= studentLocalService.createStudent(studentId);
//		student.setFirstName(firstName);
//		student.setLastName(lastName);
//		student.setCourse(course);
//		student.setEmail(email);
//		student.setStudentId(studentId);
//		studentLocalService.addStudent(student);
//		        
//	}
//	
//	public void deleteStudent(ActionRequest request,ActionResponse response) {
//		long studentId=Integer.parseInt(ParamUtil.getString(request, "studentId"));
//		try {
//			studentLocalService.deleteStudent(studentId);
//		} catch (PortalException e) {
//			e.printStackTrace();
//		}
//	}
//	@ProcessAction(name = "updateStudent")
//	public void updateStudent(ActionRequest actionRequest, ActionResponse actionResponse) {
//		System.out.println("enter inside the metod");
//		String firstName=ParamUtil.getString(actionRequest, "firstName");
//		System.out.println(firstName);
//		String lastName=ParamUtil.getString(actionRequest, "lastName");
//		System.out.println(lastName);
//		String course=ParamUtil.getString(actionRequest, "course");
//		System.out.println(course);
//		String email=ParamUtil.getString(actionRequest, "email");
//		System.out.println(email);
//		long studentId=Long.parseLong(ParamUtil.getString(actionRequest, "studentId"));
//		//long studentId = ParamUtil.getLong(actionRequest,"studentId");
//
//		System.out.println(studentId);
//		System.out.println(email);
//
//		Student student=null;
//		try {
//			System.out.println("getting inside the try");
//			student = studentLocalService.getStudent(studentId);
//		} catch (PortalException e) {
//			e.printStackTrace();
//		}
//		System.out.println("outside try");
//		student.setFirstName(firstName);
//		student.setLastName(lastName);
//		student.setCourse(course);
//		student.setEmail(email);
//		studentLocalService.updateStudent(student);
//	
//	}
//	
//	public Student getStudentById(ActionRequest request,ActionResponse response) {
//		long studentId=Integer.parseInt(ParamUtil.getString(request, "studentId"));
//		Student student=null;
//				try {
//					student=studentLocalService.getStudent(studentId);
//				} catch (PortalException e) {
//					e.printStackTrace();
//				}
//		return student;
//	}
//	
//	public List<Student> getAll(ActionRequest request,ActionResponse response){
//		List<Student> students=null;
//		int studentsCount=studentLocalService.getStudentsCount();
//		studentLocalService.getStudents(1, studentsCount);
//		return students;
//	}
//	
	
	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException{
		List<Student> students = studentLocalService.getStudents(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		renderRequest.setAttribute("students", students);
		super.render(renderRequest, renderResponse);
	}
}