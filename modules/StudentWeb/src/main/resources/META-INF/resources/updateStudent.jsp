<%@page import="com.sdn.student.web.model.Student"%>
<%@ include file="init.jsp" %>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.sdn.student.web.constants.MVCCommandNameConstants"%>

<%@ include file="init.jsp" %>
<% 
   //String studentId  =  renderRequest.getParameter("studentId");
  // String firstName  = renderRequest.getParameter("firstName");
   //String lastName  = renderRequest.getParameter("lastName");
   //String course  = renderRequest.getParameter("course");
  // String email  = renderRequest.getParameter("email");
  Student student=(Student)request.getAttribute("student");

%>

<portlet:actionURL name="<%= MVCCommandNameConstants.UPDATE_STUDENT %>" var="studentUpdateActionURL">
</portlet:actionURL>

<aui:form action="<%= studentUpdateActionURL %>" name="student" method="POST" >
<%--  <aui:input name="studentId" type="hidden" value="<%=Long.parseLong(studentId)%>"></aui:input> --%>
<aui:input name="studentId" type="hidden" value="<%=student.getStudentId()%>"></aui:input>

<aui:input name="firstName" label="First Name" type="text" value="${student.getFirstName()}"></aui:input>
<aui:input name="lastName" label="Last Name" type="text" value="${student.getLastName()}"></aui:input>
<aui:input name="course" label="Course" type="text" value="${student.getCourse()}"></aui:input>
<aui:input name="email" label="Email" type="text" value="${student.getEmail()}"></aui:input>
<aui:button type="submit" value="update" name="submitForm"></aui:button>
</aui:form>