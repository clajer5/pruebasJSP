<%@page import="pruebasJSP.Usuario"%>
<%@page import="pruebasJSP.UsuarioDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Agregar Usuario</title>
</head>
<body>
	<form action="agregarUsuariojsp.jsp" method="post">
		Nombre: <input type="text" name="nombre"><br>
		Email: <input type="text" name="email"><br>
		Id: <input type="number" name="id"><br>
		<input type="submit" value="Agregar Usuario">
	</form>
	
	<% 
	if (request.getMethod().equalsIgnoreCase("POST")){
		String nombre = request.getParameter("nombre");
		String email = request.getParameter("email");
		String id = request.getParameter("id");
		Usuario usuario = new Usuario();
		usuario.setNombre(nombre);
		usuario.setEmail(email);
		usuario.setId(Integer.parseInt(id));
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		usuarioDAO.insertarUsuario(usuario);
	}
	%>
</body>
</html>