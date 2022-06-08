<%@ page import="Modelo.ClientesBin" %>
<%@ page import="Datos.CategoriaDao" %>
<%@ page import="Modelo.CategoriaBin" %>
<%@ page import="java.util.List" %>
<%@ page import="Modelo.ProductosColorTallaBin" %><%--
  Created by IntelliJ IDEA.
  User: edith
  Date: 07/06/2022
  Time: 04:42 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Luyed</title>
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
    <ul class="menu-horizontal">
        <li>
            <%
                ClientesBin cliente= (ClientesBin) request.getAttribute("cliente");
            %>
            <a href="ServletPrincipal?accion=cliente&id=0&user=<%=cliente.getUser()%>&pass=<%=cliente.getPassword()%>">Productos</a>
            <ul class="menu-vertical">
                <%
                    CategoriaDao dao=new CategoriaDao();
                    List<CategoriaBin> lista=dao.Select();
                    if(lista!=null)
                    {
                        for (CategoriaBin r:lista) {
                %>
                <li><a href="ServletPrincipal?accion=cliente&id=<%=r.getId_categoria()%>&user=<%=cliente.getUser()%>&pass=<%=cliente.getPassword()%>"><%=r.getNombre_categoria()%></a></li>
                <%
                        }
                    }
                %>

            </ul>
        </li>

        <li><a >              </a></li>
        <li><a >              </a></li>
        <li><a >Tejiendo con el corazon </a></li>


        <li><a><%=cliente.getNombre()%> <%=cliente.getApellido()%></a>
        <ul class="menu-vertical">
            <li><a href="index.jsp">Cerrar Sesion</a></li>
        </ul>
        </li>
        <li><a href="#">Ventas</a></li>

    </ul>
</nav>

<div >

    <%
        List<ProductosColorTallaBin> productos=(List)request.getAttribute("productos");
        if(productos!=null)
        {
            for(ProductosColorTallaBin list:productos)
            {
    %>
    <div >

        <table >
            <tr>
                <td><h4><%=list.getNombre()%></h4></td>
            </tr>
            <tr>
                <td>
                    <img src="images/<%=list.getFoto()%>" width="200" height="180" alt="">
                    <br>
                    $ <%=list.getPrecio()%>
                </td>
            </tr>
            <tr>
                <td> <%=list.getDescripcion()%></td>
            </tr>
            <tr>

                <td><a href="views/Login.jsp"><input type="submit"  class="boton-7" value="Agregar carrito"></a><a href="views/Login.jsp"><input type="submit" class="boton-7" value="Comprar"></a></td>
            </tr>
        </table>
        <br>
    </div>

    <%
            }
        }
        else{
    %>
</div>
<img src="images/imagenfondoempleado.jpg" alt="" width="100%" height="757">
<%}%>
</body>
</html>
