<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="Menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Billing</title>
</head>
<body>
<h2>Generate Bill here..</h2>

<form action="SaveBill" method="post">
<pre>
  First Name:   <input type="text" name="firstName" value="${contact.firstName}" >
  <br>
  Last Name:  <input type="text" name="lastname" value="${contact.lastName}" >
  <br>
  Email:     <input type="text" name="email" value="${contact.email}">
  <br>
  Mobile:    <input type="number" name="mobile" value="${contact.mobile}">
  <br>
 Product :   <input type="text" name="product"/>
 <br>
 Amount :   <input type="text" name="amount"/>
 
  <input type="submit" value="genereate bill"/>
  </pre>
  </form>
</body>
</html>