<%@ page import="Modelo.TallasBin" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: edith
  Date: 26/05/2022
  Time: 01:11 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix =" c "%> <!-- Salida, condición, biblioteca de etiquetas de iteración !-->
<html>
<head>
    <title>Tallas</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

</head>
<body>
<div class="d-flex">
    <div class="card col-sm-4">
        <div >
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

                <input type="submit" name="accion"  value="Insertar" class="btn btn-info">
                <input type="submit" name="accion"  value="Actualizar" class="btn btn-info" >
            </form>
        </div>
    </div>
    <div class="col-sm-8">
        <table class="table table-hover">
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
                    <a class="btn btn-warning" href="ServletTallas?menu=ServletTallas&accion=Editar&id=<%=list.getId_talla()%>">Editar </a>
                    <a class="btn btn-warning" href="ServletTallas?menu=ServletTallas&accion=Eliminar&id=<%=list.getId_talla()%>">Eliminar</a>
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
