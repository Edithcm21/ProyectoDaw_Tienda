<%@ page import="java.util.List" %>
<%@ page import="Datos.CategoriaDao" %>
<%@ page import="Modelo.CategoriaBin" %>
<%@ page import="Modelo.ProductosColorTallaBin" %>
<%@page pageEncoding="utf-8" %>
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
        .marqui{
            font-family: BlinkMacSystemFont, sans-serif;
            color: lightcoral;
            size: 35px;
            height: 55px;


        }
        .padre {
            background-color: #fafafa;
            margin: 1rem;
            padding: 1rem;
            border: 2px solid #ccc;
            text-align: center;
        }



    </STYLE>
</head>
<body>
<marquee behavior="ALTERNATE" class="marqui" ><br><b>ENVÍOS GRATIS A PARTIR DE $899 PESOS A TODA LA REPÚBLICA MEXICANA </b></marquee>
<nav >
    <ul class="menu-horizontal">
        <li>
            <a href="ServletPrincipal?accion=home&id=0">Productos</a>
            <ul class="menu-vertical">
                <%
                    CategoriaDao dao=new CategoriaDao();
                    List<CategoriaBin> lista=dao.Select();
                    if(lista!=null)
                    {
                        for (CategoriaBin r:lista) {
                %>
                <li><a href="ServletPrincipal?accion=home&id=<%=r.getId_categoria()%>"><%=r.getNombre_categoria()%></a></li>
                <%
                        }
                    }
                %>

            </ul>
        </li>

        <li><a >              </a></li>
        <li><a >              </a></li>
        <li><a >Tejiendo con el corazon </a></li>
        <li><a >              </a></li>
        <li><a href="views/Login.jsp" methods="post">Acceder
          </a>


        <li><a href="#">Carrito</a></li>

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

<img src="images/portada.jpg" width="100%" height="80%" alt="">
<div class="padre">
    <img src="images/ACCESORIOS.jpg" width="30%" height="30%" alt="">
    <img src="images/AMIGURUMIS-1.jpg" width="30%" height="30%" alt="">
    <img src="images/BEBE003-1.jpg" width="30%" height="30%" alt="">
</div>
<div class="padre">
    <img src="images/DECO3-2.jpg" width="30%" height="30%" alt="">
    <img src="images/MODA.jpg" width="30%" height="30%" alt="">
    <img src="images/AMIGURUMIS-1.jpg" width="30%" height="30%" alt="">
</div>
<% }%>

</body>
</html>
