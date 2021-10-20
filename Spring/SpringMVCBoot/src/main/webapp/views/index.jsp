<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
 Welcome to Spring Boot Learner Page

	<form action="add">
		Enter 1st number : <input type="text" name="num1"><br>
		Enter 2nd number : <input type="text" name="num2"><br> 
		<input type="submit">
	</form>
		
	<form action="addcoder" method="post">
		Enter Coder ID : <input type="text" name="cid"><br>
		Enter Coder Name : <input type="text" name="cname"><br> 
		<input type="submit">

	</form>
</body>
</html>