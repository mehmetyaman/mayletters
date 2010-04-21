<%@include file="../include/taglibs.jsp" %>
<%@include file="../include/header.jsp" %>
<html><head>
<title>Spring Jpa Hibernate Demo</title>
</head>
<body>
<table>
<tr> 
  <td></td> 
  <td>
    <h1>Spring Jpa Hibernate Demo</h1>
    <p />
    <fmt:message key="hello.world" />

    <p />
    <fmt:formatDate value="${adesso}" type="both" dateStyle="full" timeStyle="medium" />

  </td>
</tr>
<tr>
  <td colspan="2">
    <%@include file="../include/footer.jsp" %>
  </td>
</tr>
</table>
</body>
</html>
