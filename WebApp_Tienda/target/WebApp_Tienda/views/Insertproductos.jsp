<%--
  Created by IntelliJ IDEA.
  User: edith
  Date: 18/05/2022
  Time: 09:22 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="Datos.CategoriaDao" %>
<%@ page import="java.util.List" %>
<%@ page import="Modelo.CategoriaBin" %>
<html>
<head>
    <title>Alta de Productos</title>
    <link rel="stylesheet" href="Styles/Style.css">
    <link rel="icon" href="images/logo.jpg">
</head>
<body>
<div>
    <h1>Agregar Usuario</h1>
</div>
<hr>
<br>
<form action="Controlador" method="post" enctype="multipart/form-data" >
    <label>id producto</label>
    <input type="text" name="Id">
    <label>talla</label>
    <input type="text" name="talla">
    <label>color</label>
    <input type="text" name="color">
    <label>foto</label>
    <input type="file" name="foto">
    <label>precio</label>
    <input type="text" name="precio">
    <label>cantidad</label>
    <input type="number" name="cantidad">
    <input type="submit" name="accion" value="Guardar">
    <input type="submit" name="accion" value="regresar">


</form>

</body>
</html>
