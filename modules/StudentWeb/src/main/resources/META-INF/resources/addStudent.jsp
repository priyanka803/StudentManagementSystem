
<%@include file="init.jsp"%>
<%@page import="com.sdn.student.web.constants.MVCCommandNameConstants"%>

<portlet:actionURL name="<%= MVCCommandNameConstants.ADD_STUDENT %>" var="AddStudentActionURL" />
<liferay-ui:success key="success" message="your request has completed....."/>

<aui:form action="<%= AddStudentActionURL %>" name="student" >
<aui:input name="firstName" label="First Name" type="text"></aui:input>
<aui:input name="lastName" label="Last Name" type="text"></aui:input>
<aui:input name="course" label="Course" type="text"></aui:input>
<aui:input name="email" label="Email" type="text"></aui:input>
<aui:button type="submit" value="submit" name="submitForm"></aui:button>
</aui:form>