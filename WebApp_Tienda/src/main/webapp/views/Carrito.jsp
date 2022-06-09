<%@ page import="Modelo.ClientesBin" %>
<%@ page import="java.util.List" %>
<%@ page import="Modelo.Carrito" %><%--
  Created by IntelliJ IDEA.
  User: edith
  Date: 28/05/2022
  Time: 12:52 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Carrito</title>
    <link rel="icon" href="images/logo.jpg">
    <link rel="stylesheet" href="Styles/Botones.css">
    <link rel="stylesheet" href="Styles/menu.css">
    <link rel="stylesheet" href="Styles/Style.css">

</head>
<body>
<nav >
    <ul class="menu-horizontal">
            <%
                ClientesBin cliente= (ClientesBin) request.getAttribute("cliente");
            %>


        <li><a href="ServletPrincipal?accion=cliente&id=0&id_cliente=<%=cliente.getId_cliente()%>">Seguir Comprando </a></li>
        <li><a >Luyed Store</a></li>
        <li><a >Tejiendo con el corazon </a></li>
        <li><a><%=cliente.getNombre()%> <%=cliente.getApellido()%></a>
            <ul class="menu-vertical">
                <li><a href="index.jsp">Cerrar Sesion</a></li>
            </ul>
        </li>

    </ul>
</nav>
<div id="pantalla-dividida">

    <div class="izquierda">
        <table >
            <thead>
            <tr>
                <th>Numero de venta</th>
                <th>Id del producto</th>
                <th>Nombre</th>
                <th>foto</th>
                <th>Descripcion</th>
                <th>Precio</th>
                <th>Cantidad</th>
                <th>Subtotal</th>
            </tr>
            </thead>
            <tbody>
            <%
                List<Carrito> lista=(List)request.getAttribute("carrito");
                if(lista!=null)
                {
                    for(Carrito list:lista)
                    {
            %>

            <tr>
                <td><%=list.getI() %></td>
                <td><%=list.getId_producto()%></td>
                <td><%=list.getNombre() %></td>
                <td><img src="images/<%=list.getFoto()%>" alt="" width="40px" height="40px"></td>
                <td><%=list.getDescripcion() %></td>
                <td><%=list.getPrecio()%></td>
                <td><%=list.getCantidad()%></td>
                <td><%=list.getSubtotal()%></td>
            </tr>
            <%
                }
            }
            %>

            </tbody>
        </table>
    </div>
    <div class="derecha">
        <fieldset>
            <h1>Terminar compra</h1>
            <label>Total</label>
            <input type="text" readonly="" value="<%int total=(int) request.getAttribute("totalapagar");%>">
        </fieldset>

    </div>

</div>>

</body>
</html>
