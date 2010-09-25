<%@ page language="java" contentType="text/html; utf-8"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; utf-8">
</head>
<body>
<c:if test="${user != null }">
	<table>
		<tr>
			<br>
			name:${user.name}
		</tr>
		<tr>
			<br>
			last name:${user.lastName}
		</tr>
		<tr>
			<br>
			email:${user.email}
		</tr>
		<tr>
			<br>
			address:${user.address}
		</tr>
		<tr>
			<br>
			userName:${user.userName}
		</tr>
	</table>
</c:if>
</body>
</html>