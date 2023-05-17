<%-- 
    Document   : dialogo
    Created on : 15 may. 2023, 20:56:20
    Author     : arroy
--%>
<%@page import="daw1.Gato"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Aguas con clase y sin bocadillos</title>
    <link rel="stylesheet" type="text/css" href="estilos.css" />
</head>
<body>
<h1>Aguas con clase</h1>
<hr>
<form method="post" action="dialogo.jsp">
    <label for="nombre1">Nombre del gato 1:</label>
    <input type="text" id="nombre1" name="nombre1"><br>
    <label for="nombre2">Nombre del gato 2:</label>
    <input type="text" id="nombre2" name="nombre2"><br>
    <label for="nombre3">Nombre del gato 3:</label>
    <input type="text" id="nombre3" name="nombre3"><br>
    <input type="submit" value="Enviar">
</form>
</body>
</html>

