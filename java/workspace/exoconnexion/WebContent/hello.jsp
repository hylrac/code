<%@page import="io.sopra.pox3.exoconnexion.Outils"%>
<%@page import="io.sopra.pox3.exoconnexion.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Bonjour je m'appelle hello
	<br /> Au fait 1 + 1 =
	<%=1 + 1%>
	<br>
	<%
		String monRefer = request.getParameter("truc");
		//out.print(monRefer);
	%>

	C'est encore moi, ton referer c'est :
	<%=monRefer%>

	<%
		User user = Outils.getConnectedUser(request);
	if (user!=null){
		%>
		<div>
			Salut <%= user.getPrenom() %> <%=user.getNom() %>
		</div>
		<%
		
	}
	%>
</body>
</html>