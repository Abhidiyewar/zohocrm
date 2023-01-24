<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="Menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Lead</title>
</head>
<body>
<h2>Create Lead Form</h2>

<form action="SaveLead" method="post">
  First Name:<br>
  <input type="text" name="firstName" >
  <br>
  Last Name:<br>
  <input type="text" name="lastName" >
  <br>
  Email:<br>
  <input type="text" name="email" >
  <br>
  Mobile:<br>
  <input type="number" name="mobile" >
  <br>
  Source:<br>
  <select name="Source">
  <option value="instagram">Instagram </option>
  <option value="facebook">FaceBook</option>
  <option value="youtube">Youtube</option>
  <option value="website">Website</option>
</select>
  <input type="submit" value="save"/>
  </form>
</body>
</html>