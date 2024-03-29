<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Update Doctor</h1>
    <form action="updateDoctor" method="post">


       doctorId: <input type="hidden" name="doctorId" value="${doctor.doctorId}">

        doctorName: <input type="text" name="doctorName" value="${doctor.doctorName}"><br>

        Speciality: <input type="text" name="speciality" value="${doctor.speciality}"><br>

        Fess: <input type="number" name="fees" value="${doctor.fees}"><br>

        Ratings: <input type="number" name="ratings" value="${doctor.ratings}"><br>

        Experience: <input type="number" name="experience" value="${doctor.experience}"><br>

        <input type="submit" value="Update Doctor">
    </form>
</body>
</html>