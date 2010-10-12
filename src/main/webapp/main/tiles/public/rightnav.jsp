<%@ page language="java" contentType="text/html; utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; utf-8">
<title>Insert title here</title>
</head>
<body>
<c:choose>
	<c:when test="${user != null }">
		<table class="group">
			<tbody>
				<tr>
					<td><fmt:message key="label.username" /></td>
					<td><a href="<%=request.getContextPath()%>/logout.do">${user.userName}</a></td>
				</tr>
			</tbody>
		</table>
	</c:when>

	<c:otherwise>
		<form name="login" action="<%=request.getContextPath()%>/login.do">
		<table class="group">
			<tbody>
				<tr>
					<th colspan="2" class="group"><fmt:message key="label.login" /></th>
				</tr>
				<tr>
					<td><fmt:message key="label.username" /></td>
					<td><input type="text" value="" name="username" id="username" /></td>
				</tr>
				<tr>
					<td><fmt:message key="label.password" /></td>
					<td><input type="password" value="" name="password"
						id="username" /></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit"
						value='<fmt:message key="button.submit"/>' id="button.login" />
					<td></td>
				</tr>
			</tbody>
		</table>
		</form>

		<br>
		<form name="register"
			action="<%=request.getContextPath()%>/login.erm?register=true">
		<table class="group" width="100%">
			<tr>
				<th class="group"><a onclick="document.register.submit();"
					onMouseOver="style.cursor='hand'"><fmt:message
					key="link.register" /></a></th>
			</tr>
			<tr>
				<td></td>
			</tr>
			</tbody>
		</table>
		</form>
	</c:otherwise>
</c:choose>

</body>