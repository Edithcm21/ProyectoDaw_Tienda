
<%@ page import="Modelo.EmpleadosBin" %><%--
  Created by IntelliJ IDEA.
  User: edith
  Date: 05/06/2022
  Time: 12:43 a. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Productos</title>
    <link rel="icon" href="images/logo.jpg">
    <link rel="stylesheet" href="Styles/Botones.css">
    <link rel="stylesheet" href="Styles/menu.css">

    <STYLE>
        table {
            width: 100%;
            border: 15px black;
            overflow: hidden;
        }

        th,
        td {
            padding: 15px;
            color: black;
            border: 3px;
            text-align: center;
        }

        th {
            text-align: center;
        }
        fieldset{
            width: 50vh;
        }




    </STYLE>
</head>
<body>
<nav >
    <%
        EmpleadosBin empleado= (EmpleadosBin) request.getAttribute("empleado");
    %>
    <ul class="menu-horizontal">
        <li><a href="index.jsp">Cerrar Sesion</a></li>

        <li>
            <a href="Productos?menu=Productos&accion=listar&id_em=<%=empleado.getId_empleado()%>">Agregar productos</a>
            <ul class="menu-vertical">
                <li><a href="Controlador?menu=Categorias&accion=listar&id_em=<%=empleado.getId_empleado()%>">Agregar Categorias</a></li>
                <li><a href="ServletTallas?menu=Tallas&accion=listar&id_em=<%=empleado.getId_empleado()%>">Agregar tallas</a></li>
                <li><a href="ServletColores?menu=Colores&accion=listar&id_em=<%=empleado.getId_empleado()%>">Agregar colores</a></li>
                <li><a href="ServletProductoPrincipal?menu=Productos&accion=listar&id_em=<%=empleado.getId_empleado()%>">Agregar prod principal</a></li>
            </ul>
        </li>
        <li><a >Tejiendo con el corazon </a></li>
        <li>
            <a >Empleados</a>
            <ul class="menu-vertical">
               <li><a href="ServletTipo_Empleados?menu=Tipos&accion=listar">tipos de empleado</a></li>
            </ul>
        </li>

        <li><a><%=empleado.getNombre()%> <%=empleado.getApellido()%></a></li>
        <li><a href="#">Ventas</a></li>

    </ul>
</nav>

<img src="images/imagenfondoempleado.jpg" alt="" width="100%" height="757">
</body>
</html>
