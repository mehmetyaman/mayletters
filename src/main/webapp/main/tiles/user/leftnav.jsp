<%@page import="com.mayletters.util.Right"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:choose>
	<c:when test="${user != null and not empty user.roles}">
		<table class="group">
			<tr>
				<th class="group"><fmt:message key="label.operations" /></th>
			</tr>
			<c:forEach var="role" items="${user.roles}">
				<c:forEach var="right" items="${role.rights}">
					<tr>
						<td>rightnameeee:${right.rightName}</td>
					</tr>
				</c:forEach>
			</c:forEach>
		</table>
	</c:when>
</c:choose>

</body>
</html>