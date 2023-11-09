<%@page import="pruebasJSP.Usuario, pruebasJSP.UsuarioDAO, java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Usuarios</title>
</head>
<body>
	<h1>Lista de Usuarios</h1>
	<table>
		<tr>
			<th>ID</th>
			<th>Nombre</th>
			<th>Email</th>
		</tr>
		<%
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		List<Usuario> usuarios = usuarioDAO.listarUsuarios();
		for (Usuario usuario : usuarios){
		%>
		<tr>
			<td><%= usuario.getId() %></td>
			<td><%= usuario.getNombre() %></td>
			<td><%= usuario.getEmail() %></td>
		</tr>
		<%
		}
		%>
	</table>
</body>
</html>