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
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

    <style>
        fieldset{
            width: 50vh;
        }
    </style>

</head>
<body>
<nav >
    <ul class="menu-horizontal">
            <%
                ClientesBin cliente = (ClientesBin) request.getAttribute("cliente");
            %>


        <li><a href="ServletPrincipal?accion=cliente&id=0&id_cliente=<%=cliente.getId_cliente()%>">Seguir Comprando </a></li>
        <li><a href="#">Luyed Store</a></li>
        <li><a href="#">Tejiendo con el corazon </a></li>
        <li><a href="#"><%=cliente.getNombre()%> <%=cliente.getApellido()%></a>
            <ul class="menu-vertical">
                <li><a href="ServletPrincipal?accion=cerrar&id=0">Cerrar Sesion</a></li>
            </ul>
        </li>

    </ul>
</nav>
<div class="container st-4">
    <div class="row">
        <div class="sm-8">
            <table class="table table-hover">
                <thead>
                <tr>
                    <th>#venta</th>
                    <th>Id_prod</th>
                    <th>Nombre</th>
                    <th>foto</th>
                    <th>Descripcion</th>
                    <th>Precio</th>
                    <th>Can</th>
                    <th>Subtotal</th>
                </tr>
                </thead>
                <tbody>
                <%
                    Carrito total= (Carrito) request.getAttribute("total");
                    List<Carrito> lista = (List) request.getAttribute("carrito");

                    if (lista != null) {

                        for (Carrito list : lista) {

                %>

                <tr>
                    <td><%=list.getI()%></td>
                    <td><%=list.getId_producto()%></td>
                    <td><%=list.getNombre()%></td>
                    <td><img src="images/<%=list.getFoto()%>" alt="" width="40px" height="40px"></td>
                    <td><%=list.getDescripcion().substring(0,20)+"..."%></td>
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
        <div class="sm-4">
            <div class="card">
                <div class="card-header">
                    <h3>Generar Compra</h3>
                </div>
                <div class="card-body">
                    <label>Subtotal</label>
                    <input type="text" readonly="" value="$<%=total.getTotal()%>" class="form-control" >
                    <label>Costo de envio</label>
                    <input type="text" readonly="" value="$100" class="form-control" >
                    <label>Total</label>
                    <input type="text" readonly="" value="<%=total.getTotal()+100%>" class="form-control" >
                </div>
                <div class="card-footer">
                    <a href="ServletPrincipal?accion=GenerarCompra" class="btn btn-danger btn btn-block">Generar compra</a>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
