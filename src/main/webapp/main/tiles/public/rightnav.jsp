<%@ page language="java" contentType="text/html; utf-8"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; utf-8">
<title>Insert title here</title>
</head>
<body>
<table class="group"><tbody>
<tr><th colspan="2"  class="group"><fmt:message key="label.login"/></th></tr>
<tr><td><fmt:message key="label.username"/></td><td><input type="text" value="User"/></td></tr>
<tr><td><fmt:message key="label.password"/></td><td><input type="password" value="pass"/></td></tr>
<tr><td colspan="2"><input type="submit" value='<fmt:message key="button.submit"/>'/><td></td></tr>
</tbody>
</table>
</body>