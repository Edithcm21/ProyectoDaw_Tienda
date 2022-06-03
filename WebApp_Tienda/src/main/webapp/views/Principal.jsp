<%--
  Created by IntelliJ IDEA.
  User: edith
  Date: 23/05/2022
  Time: 11:35 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<ul class="nav-bar-cell1-rev" id="navbarNav">
    <li class="nav var-item">
        <a style="margin-left: 10px; border: none;" class="btn btn-outline-ligth" href="#">HOME</a>
    </li>
    <li class="nav var-item">
        <a style="margin-left: 10px; border: none;" class="btn btn-outline-ligth" href="../Productos?menu=Productos&accion=listar">Productos</a>
    </li>
    <li class="nav var-item">
        <a style="margin-left: 10px; border: none;" class="btn btn-outline-ligth" href="Controlador?menu=Empleado">Empleados</a>
    </li>
    <li class="nav var-item">
        <a style="margin-left: 10px; border: none;" class="btn btn-outline-ligth" href="Controlador?menu=Cliente">Clientes</a>
    </li>
    <li class="nav var-item">
        <a style="margin-left: 10px; border: none;" class="btn btn-outline-ligth" href="../Controlador?menu=Categorias&accion=listar">Categorias</a>
    </li>
    <li class="nav var-item">
        <a style="margin-left: 10px; border: none;" class="btn btn-outline-ligth" href="../ServletTallas?menu=Tallas&accion=listar">Tallas</a>
    </li>
    <li class="nav var-item">
        <a style="margin-left: 10px; border: none;" class="btn btn-outline-ligth" href="../ServletColores?menu=Colores&accion=listar">Colores</a>
    </li>
    <li class="nav var-item">
        <a style="margin-left: 10px; border: none;" class="btn btn-outline-ligth" href="../ServletTipo_Empleados?menu=Tipo_Empleados&accion=listar">Tipo_empleados</a>
    </li>
    <li class="nav var-item">
        <a style="margin-left: 10px; border: none;" class="btn btn-outline-ligth" href="Login.jsp">Iniciar Sesion</a>
    </li>
</ul>
</body>
</html>
