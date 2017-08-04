<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">


<link rel='stylesheet' type='text/css' href='design.css'>
<title>Connexion</title>
</head>
<body><br/>
	${message}<br/><br/>
	<form method='post'>
		<input type='text' name='nom' placeholder='Nom'> <input
			type='text' name='prenom' placeholder='Prénom'>
		<button type='submit'>Valider</button>
	</form>
	<form action='accueil.html' method='get'><button type='submit'>Retour à l'accueil</button></form>
</body>
</html>