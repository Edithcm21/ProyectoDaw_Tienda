<%@ page import="Modelo.CategoriaBin" %>
<%@ page import="java.util.List" %>
<%@ page import="Datos.CategoriaDao" %><%--
  Created by IntelliJ IDEA.
  User: edith
  Date: 01/06/2022
  Time: 05:41 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>

<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="Styles/menu.css">
   </head>
<body>
<nav>
    <ul class="menu-horizontal">
        <li>
            <a href="ServletPrincipal?accion=Home">Productos</a>
            <ul class="menu-vertical">
                <%
                    CategoriaDao dao=new CategoriaDao();
                    List<CategoriaBin> lista=dao.Select();
                    if(lista!=null)
                    {
                        for (CategoriaBin r:lista) {
                %>
                <li><a href="#"><%=r.getNombre_categoria()%></a></li>
                <%
                    }
                    }
                %>

            </ul>
        </li>
        <li><a href="#">Inicio</a></li>
        <li><a href="#">Inicio</a>
            <ul class="menu-vertical">
                <li><a href="#">Iniciar sesion</a></li>
            </ul>
        </li>
    </ul>
</nav>
</body>
</html>
