<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ include file="Menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List sales</title>
</head>
<body>
<h2>List of converted Leads</h2>
<table border="3">
		<tr>
			<th>FirstName</th>
			<th>LastName</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Source</th>
			
		</tr>
		<c:forEach var="contact" items="${contact}">
			<tr>
				<td><a href="Contactinfo?id=${contact.id}">${contact.firstName}</a></td>
				<td>${contact.lastName}</td>
				<td>${contact.email}</td>
				<td>${contact.mobile}</td>
				<td>${contact.source}</td>
				<td><a href="GenerateBill?id=${contact.id}">Billing</a></td>
			</tr>
		</c:forEach>

	</table>

</body>
</html>