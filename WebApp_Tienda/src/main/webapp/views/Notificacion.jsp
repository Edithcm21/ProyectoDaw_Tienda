<%@ page import="Modelo.DetalleVentaBin" %><%--
  Created by IntelliJ IDEA.
  User: edith
  Date: 09/06/2022
  Time: 06:12 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<h1>Compra Exitosa</h1>
<%
    DetalleVentaBin detalle= (DetalleVentaBin) request.getAttribute("detalle");
%>
<div class="container col-sm-4">
<div class="card">
    <div class="card-header">
    </div>
    <div class="card-body">
        <label>Folio</label>
        <input type="text" readonly="" value="<%=detalle.getId_venta()%>" class="form-control" >
        <label>Id_cliente</label>
        <input type="text" readonly="" value="<%=detalle.getId_cliente()%>" class="form-control" >
        <label>Fecha</label>
        <input type="text" readonly="" value="<%=detalle.getFecha()%>" class="form-control" >
        <label>Hora</label>
        <input type="text" readonly="" value="<%=detalle.getHora()%>" class="form-control" >
        <label>Total</label>
        <input type="text" readonly="" value="<%=detalle.getTotal()%>" class="form-control" >
        <label>Estatus de pago</label>
        <input type="text" readonly="" value="<%=detalle.getEstatus_pago()%>" class="form-control" >
    </div>
    <div class="card-footer">
        <a href="ServletPrincipal?accion=cliente&id=0&id_cliente=<%=detalle.getId_cliente()%>" class="btn btn-danger btn btn-block">Regresar al inicio</a>
    </div>
</div>
</div>
</body>
</html>
