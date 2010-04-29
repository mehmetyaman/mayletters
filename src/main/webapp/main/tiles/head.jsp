<%@ page language="java" contentType="text/html; utf-8"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; utf-8">
<title></title>
</head>
<body>
<table width="%100"><tbody>
<tr><td align="left"><img src="<%=request.getContextPath()%>/layouts/images/zarf1.jpg"/></td><td align="center"><tiles:insertAttribute name="title" ignore="true"/></td>
</tr>
</tbody>
</table>
</body>
</html>