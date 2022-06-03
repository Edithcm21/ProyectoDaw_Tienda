<%@ page import="Modelo.ColoresBin" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %><%--
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
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

</head>
<body>
<div class="d-flex">
    <div class="card col-sm-4">
        <div >
            <form action="ServletColores?menu=Colores" method="get">
                <div>
                    <label>Color</label>
                    <label>

                        <%
                            ColoresBin valor= (ColoresBin) request.getAttribute("color");
                            if (valor == null) {


                        %>
                        <input type="text" name="nombre"  class="form-control">

                        <%
                        } else {


                        %>
                        <input type="text" name="nombre" value="<%=valor.getNombre_color()%>"  class="form-control">

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
                    <a class="btn btn-warning" href="ServletColores?menu=ServletColores&accion=Editar&id=<%=list.getId_color()%>">Editar </a>
                    <a class="btn btn-warning" href="ServletColores?menu=ServletColores&accion=Eliminar&id=<%=list.getId_color()%>">Eliminar</a>
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

</div>

</body>
</html>
