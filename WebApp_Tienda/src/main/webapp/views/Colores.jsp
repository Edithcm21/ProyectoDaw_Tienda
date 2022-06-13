<%@ page import="Modelo.ColoresBin" %>
<%@ page import="java.util.List" %>
<%--
  Created by IntelliJ IDEA.
  User: edith
  Date: 26/05/2022
  Time: 06:47 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Title</title>
    <link rel="icon" href="images/logo.jpg">
    <style>
        .izquierda{

            height: 100vh;
            width: 30%;
            text-align: center;

        }
        .derecha{
            background-size: cover;
            background-position: center;
            height: 100vh;
            width: 70%;

        }
        #pantalla-dividida{
            display: flex;
        }
    </style>
    <link rel="stylesheet" href="Styles/Style.css">
    <link rel="stylesheet" href="Styles/Botones.css">
</head>
<body>
<section id="pantalla-dividida">
    <div class="izquierda">
        <fieldset>
            <form action="ServletColores?menu=Colores" method="get">
                    <label>Color</label>
                    <label>

                        <%
                            ColoresBin valor= (ColoresBin) request.getAttribute("color");
                            if (valor == null) {


                        %>
                        <input type="text" name="nombre"  class="">

                        <%
                        } else {


                        %>
                        <input type="text" name="nombre" value="<%=valor.getNombre_color()%>"  class=form-control">

                        <% }
                        %>
                    </label>
                <br><br>
                <input type="submit" name="accion"  value="Insertar" class="boton-3">
                <input type="submit" name="accion"  value="Actualizar" class="boton-3" >
            </form>
            <a href="ControladorValidar?accion=regresar"><input type="button" value="Regresar a inicio"  class="boton-7"></a>
        </fieldset>
    </div>
    <div class="derecha">
        <table class="">
            <thead>
            <tr>
                <th>ID</th>
                <th>Nombre</th>
                <th>ACCIONES</th>
            </tr>
            </thead>
            <tbody>
            <%
                List<ColoresBin> talla=(List)request.getAttribute("colores");
                if(talla!=null)
                {
                    for(ColoresBin list:talla)
                    {
            %>

            <tr>
                <td><%=list.getId_color() %></td>
                <td><%=list.getNombre_color()%></td>
                <td>
                    <a class="boton-8" href="ServletColores?menu=ServletColores&accion=Editar&id=<%=list.getId_color()%>">Editar </a>
                    <a class="boton-8" href="ServletColores?menu=ServletColores&accion=Eliminar&id=<%=list.getId_color()%>">Eliminar</a>
                </td>
            </tr>
            <%
                }
            }
            else
            {
            %>
            <option value="No hay colores"></option>
            <% } %>

            </tbody>
        </table>
    </div>

</section>

</body>
</html>
