<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="Menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>list leads</title>
</head>
<body>
<h2>List of Leads</h2>
<form action="SendEmail" method="post">
<pre>
First Name:   ${lead.firstName}<br/>
Last Name :   ${lead.lastName}<br/>
Email :       ${lead.email}<br/>
Mobile:       ${lead.mobile}<br/>
Source:       ${lead.source}<br/>

<input type="hidden" name ="email" value= "${lead.email}"/>
<input type ="submit" value="Send Mail"/>
</form>


<form action="ConvertLead" method="post">
<input type="hidden" name ="id" value= "${lead.id}"/>
<input type ="submit" value="convert"/>
</form>

</pre>



</body>
</html>