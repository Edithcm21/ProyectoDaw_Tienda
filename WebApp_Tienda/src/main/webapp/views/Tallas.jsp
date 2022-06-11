<%@ page import="Modelo.TallasBin" %>
<%@ page import="java.util.List" %>
<%--
  Created by IntelliJ IDEA.
  User: edith
  Date: 26/05/2022
  Time: 01:11 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>

<html>
<head>
    <title>Tallas</title>
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
<div id="pantalla-dividida">
    <div class="izquierda">
        <fieldset >
            <form action="ServletTallas?menu=Tallas" method="get">
                <div>
                    <label>Nombre de talla</label>
                    <label>
                        <%
                            TallasBin valor= (TallasBin) request.getAttribute("talla");
                            if (valor == null) {
                        %>
                        <input type="text" name="nombre"  class="form-control">
                        <%
                        } else {
                        %>
                        <input type="text" name="nombre" value="<%=valor.getNombretalla()%>"  class="form-control">
                        <% }
                        %>
                    </label>
                </div>
                <br><br>

                <input type="submit" name="accion"  value="Insertar" class="boton-3">
                <input type="submit" name="accion"  value="Actualizar" class="boton-3" >
            </form>
            <a href="ControladorValidar?accion=regresar"><input type="button" value="Regresar a inicio"  class="boton-7"></a>
        </fieldset>
    </div>
    <div class="derecha">
        <table >
            <thead>
            <tr>
                <th>ID</th>
                <th>Nombre</th>
                <th>ACCIONES</th>
            </tr>
            </thead>
            <tbody>
            <%
                List<TallasBin> talla=(List)request.getAttribute("tallas");
                if(talla!=null)
                {
                    for(TallasBin list:talla)
                    {
            %>

            <tr>
                <td><%=list.getId_talla() %></td>
                <td><%=list.getNombretalla()%></td>
                <td>
                    <a class="boton-8" href="ServletTallas?menu=ServletTallas&accion=Editar&id=<%=list.getId_talla()%>">Editar </a>
                    <a class="boton-8" href="ServletTallas?menu=ServletTallas&accion=Eliminar&id=<%=list.getId_talla()%>">Eliminar</a>
                </td>
            </tr>
            <%
                }
            }
            else
            {
            %>
            <option value="No hay categorias"></option>
            <% } %>

            </tbody>
        </table>
    </div>

</div>
</body>
</html>
