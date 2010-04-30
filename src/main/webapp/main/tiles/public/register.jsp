<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<form action="/register.erm">
<table class="group"><tbody>
<tr><th colspan="2"  class="group"><fmt:message key="label.register"/></th></tr>
<tr><td><fmt:message key="label.username"/></td><td><input type="text" value="User" name="username" id="username"/></td></tr>
<tr><td><fmt:message key="label.password"/></td><td><input type="password" value="pass" name="password" id="username"/></td></tr>
<tr><td><fmt:message key="label.name"/></td><td><input type="text" value="" name="name" id="name"/></td></tr>
<tr><td><fmt:message key="label.middlename"/></td><td><input type="text" name="middlename" value="" id="middlename"/></td></tr>
<tr><td><fmt:message key="label.lastname"/></td><td><input type="text" name="lastname" value="" id="lastname"/></td></tr>
<tr><td colspan="2"><input type="submit" value='<fmt:message key="button.register"/>'/><td></td></tr>
</tbody>
</table>
</form>
</center>
</body>
</html>