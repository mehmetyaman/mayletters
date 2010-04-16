<%@include file="../include/taglibs.jsp" %>
<%@include file="../include/header.jsp" %>

<title><fmt:message key="persona.form" /></title>

</head>
<body>
<form:form commandName="pers" method="post">
	<table>
		<tr>
			<td><fmt:message key="persona.nome" />:<br>
			<form:input path="nome" /></td>
			<td><form:errors path="nome" cssClass="error" /></td>
		</tr>
		<tr>
			<td><fmt:message key="persona.cognome" />:<br>
			<form:input path="cognome" /></td>
			<td><form:errors path="cognome" cssClass="error" /></td>
		</tr>
		<tr>
			<td><fmt:message key="persona.dataNascita" />:<br>
			<form:input path="dataNascita" /></td>
			<td><form:errors path="dataNascita" cssClass="error" /></td>
		</tr>
		<tr>
			<td><fmt:message key="persona.impiego" />:<br>
			<form:input path="impiego" /></td>
			<td><form:errors path="impiego" cssClass="error" /></td>
		</tr>
		<tr>
			<td><input type="submit" value="<fmt:message key="save.changes" />" /></td>
		</tr>
                <tr>
                        <td>
                        <%@include file="../include/footer.jsp" %>
                        </td>
		</tr>

	</table>
</form:form>
</body>
</html>
