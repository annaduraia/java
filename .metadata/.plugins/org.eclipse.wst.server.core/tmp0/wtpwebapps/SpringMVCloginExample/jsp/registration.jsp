<%@include file="include.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Login</title>
	</head>
	<body>
		<font color="red">${message}</font>
		<form:form id="registrationForm" method="post" action="registrationBean" modelAttribute="registrationBean">

			<form:label path="firstName">Enter your firstName</form:label>
			<form:input id="firstName" name="firstName" path="" /><br>
			<form:label path="lastName">Enter your lastName</form:label>
			<form:input id="lastName" name="lastName" path="" /><br>
			
		 	<form:label path="address">Enter your address</form:label>
			<form:input id="address" name="address" path="" /><br>
			<form:label path="age">Enter your age</form:label>
			<form:input id="age" name="age" path="" /><br>
			<input type="submit" value="Submit" />
		</form:form>
	</body>
</html>