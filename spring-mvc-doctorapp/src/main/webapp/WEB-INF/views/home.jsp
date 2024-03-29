<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
     
     <a href="admin">admin</a> <br> <br>
     
     <form action="search">
      Enter speciality: <input type="text" value="choice">
      <input type="submit" value="search">
     </form>  <br> <br>
     <h3>All doctors list</h3>
     ${doctors}
     
</body>
</html>