<%@page import="io.sopra.pox3.exoconnexion.Message"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta http-equiv="refresh" content="2">
<link rel='stylesheet' type='text/css' href='design.css'>
</head>
<body>
<div class="content">
		<%
			List<Message> listMessages = (List<Message>) request.getAttribute("messages");
			for (Message message : listMessages) { 
		%>
		<div class='texte'><%=message.getText()%></div>
		<div class="infos">
			par
			<%=message.getUser().toString()%>
			le
			<%=message.getDate().toString()%></div>
		<br>

		<%
			}
		%>
		
	</div>
</body>
</html>