<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<s:form action="details">
	  <s:textfield name="student.studentName" label="studentName"></s:textfield>
	  <s:textfield name="student.studentId" label="studentId"></s:textfield>
	  <s:textfield name="student.department" label="Department"></s:textfield>
	  <s:textfield name="student.email" label="Email"></s:textfield>
	  <s:submit value="submit"></s:submit>
	</s:form>
</body>
</html>