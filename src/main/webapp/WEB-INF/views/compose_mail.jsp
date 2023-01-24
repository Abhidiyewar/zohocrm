<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="Menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>email sending</title>
</head>
<body>
<h2>Compose Email here...</h2>
<form action="ComposeMail" method="post" >
<pre>

To          <input type="text" name="email" value="${email}"/>
Subject     <input type ="text" name="subject"/>
<textarea name="content" rows="10" cols="50"></textarea>
<input type="submit" value="Send"/>
</pre>
</form>
${msg}
</body>
</html>