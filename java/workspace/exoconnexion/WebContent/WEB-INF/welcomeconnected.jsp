<%@page import="io.sopra.pox3.exoconnexion.ChatRoom"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html >
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel='stylesheet' type='text/css' href='design.css'>

</head>
<body>
	Bonjour, ${user.prenom} ${user.nom}
	<br />
	<form action='chat.html' method='get'>

		<%
			List<ChatRoom> listChatRooms = (List<ChatRoom>) request.getAttribute("listChatRooms");
			int position = 0;
			for (ChatRoom chatRoom : listChatRooms) {
		%>
		<input type="radio" name="position"
			value="<%=position%>">
		<%=chatRoom.getName()%>

		<%
			position++;
			}
		%>

		<button type='submit'>Accéder au chat</button>
	</form>

	<form action='deco.html' method='get'>
		<button type='submit'>Déconnexion</button>
	</form>

</body>
</html>