<%@ page import="Modelo.ProductosColorTallaBin" %>
<%@ page import="java.util.List" %>
<%@page contentType="text/html; ISO-8859-1" pageEncoding="utf-8" %>
<html>
<head>
    <title>Luyed</title>
    <link rel="icon" href="images/logo.jpg">
</head>
<body>
<jsp:include page="views/Menu.jsp"></jsp:include>

<div align="center">
    <div class="row">

        <%
            List<ProductosColorTallaBin> productos=(List)request.getAttribute("productos");
            if(productos!=null)
            {
                for(ProductosColorTallaBin list:productos)
                {
        %>
        <div class="col-sm-4">
            <div class="card">
                <div class="card-header">
                    <h4><%=list.getNombre()%></h4>
                </div>
                <div class="card-body">
                    <i>$ <%=list.getPrecio()%></i>
                    <img src="images/<%=list.getFoto()%>" width="200" height="180" alt="">
                </div>
                <div class="card-footer text-center" >
                    <label><%=list.getDescripcion()%></label>
                    <div>
                        <a class="btn btn-outline-info">Agregar a carrito</a>
                        <a class="btn btn-danger">Comprar</a>
                    </div>
                </div>
            </div>

        </div>
        <%
            }
            }
        %>
    </div>
</div>


<li class="nav var-item">
    <a style="margin-left: 10px; border: none;" class="btn btn-outline-ligth" href="views/Principal.jsp">principal</a>
</li>

</body>
</html>
