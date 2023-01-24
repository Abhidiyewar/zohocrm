<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ include file="Menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>view Bill</title>
</head>

<body>
<h2>View bills</h2>
 <table border="3">
        <tr>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Email</th>
            <th>Mobile</th>
            <th>Product</th>
            <th>Amount</th>
        </tr>
      
			<tr>
				<td>${Bill.firstName}</td>
				<td>${Bill.lastname}</td>
				<td>${Bill.email}</td>
				<td>${Bill.mobile}</td>
				<td>${Bill.product}</td>
				<td>${Bill.amount}</td>
				
			</tr>
		
        </table>
</body>
</html>