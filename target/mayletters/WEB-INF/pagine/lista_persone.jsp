<%@include file="../include/taglibs.jsp" %>
<%@include file="../include/header.jsp" %>

<title>Lista Persone</title>
	<script language='javascript'>
            function confirmDelete(url)    {
                if (confirm("<fmt:message key="label.person.confirmDelete" />"))  {
                    document.location=url;
                }
            }
            
	</script>
</head>
<body>

<table>
	<tr>
		<th><fmt:message key="persona.nome" /></th>
		<th><fmt:message key="persona.cognome" /></th>
		<th><fmt:message key="persona.dataNascita" /></th>
		<th><fmt:message key="persona.impiego" /></th>
		<th nowrap> </th>
	</tr>
	<c:forEach items="${ persone}" var="persona" varStatus="s">
		<tr class="<c:choose>
				<c:when test="${ s.index%2==0}">
					even
				</c:when>
				<c:otherwise>
					odd
				</c:otherwise>
				</c:choose>
				">
			<td><c:out value="${ persona.nome}" /></td>
			<td><c:out value="${ persona.cognome}" /></td>
			<td><fmt:formatDate value="${ persona.dataNascita}" type="date" dateStyle="long" />
			</td>
			<td><c:out value="${ persona.impiego}" /></td>
			<td><A href="<c:url value="/myform.erm?id=${ persona.id}"/>"><fmt:message key="label.edit" /></A></td>
			<td nowrap> </td>
			<td><A href="javascript:confirmDelete('<c:url value="/delete.erm?id=${ persona.id}"/>')"><fmt:message key="label.delete" /></A></td>
		</tr>
	</c:forEach>
        <tr>
            <td colspan="5">
<%@include file="../include/footer.jsp" %>
            </td>
        </tr>

</table>
</body></html>
