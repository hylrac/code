<%@page import="io.sopra.pox3.exoconnexion.Donnees"%>
<%@page import="io.sopra.pox3.exoconnexion.Message"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
<title>Chat ${position}</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel='stylesheet' type='text/css' href='design.css'>
</head>
<body>

	<jsp:include page="/WEB-INF/test.jsp" />
	<iframe src="chatroom.html"></iframe>

	<form method='post'>
		<input type="hidden" name="position" value='${position}' /> <input
			name='text' placeholder='${message}'>
		<button type='submit'>Valider</button>
	</form>
	<form action='accueil.html' method='get'>
		<button type='submit'>Retour à l'accueil</button>
	</form>
</body>
</html>