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
   <s:property value="name"/>
   <s:property value="message"/>
   
   <s:property value="fruits"/>
   <s:property value="$session.message"/>
   <s:property value="#session.courses"/>
   
</body>
</html>