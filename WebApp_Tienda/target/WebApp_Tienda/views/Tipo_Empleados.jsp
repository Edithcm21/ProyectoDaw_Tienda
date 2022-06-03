<%@ page import="Modelo.TipoEmpleadoBin" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: edith
  Date: 27/05/2022
  Time: 06:30 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Tipos de empleado</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

</head>
<body>
<div class="d-flex">
    <div class="card col-sm-4">
        <div >
            <form action="ServletTipo_Empleados?menu=Tipo_Empleado" method="GET">
                <div>
                    <label>Nombre</label>
                    <label>

                        <%
                            TipoEmpleadoBin valor= (TipoEmpleadoBin) request.getAttribute("tipo");
                            if (valor == null) {


                        %>
                        <input type="text" name="nombre"  class="form-control" maxlength="30">

                        <%
                        } else {


                        %>
                        <input type="text" name="nombre" value="<%=valor.getTipo()%>"  class="form-control">

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
                List<TipoEmpleadoBin> tipo=(List<TipoEmpleadoBin>)request.getAttribute("tipos");
                if(tipo!=null)
                {
                    for(TipoEmpleadoBin list:tipo)
                    {
            %>

            <tr>
                <td><%=list.getId_tipo() %></td>
                <td><%=list.getTipo()%></td>
                <td>
                    <a class="btn btn-warning" href="ServletTipo_Empleados?menu=Tipo_Empleado&accion=Editar&id=<%=list.getId_tipo()%>">Editar </a>
                    <a class="btn btn-warning" href="ServletTipo_Empleados?menu=Tipo_Empleado&accion=Eliminar&id=<%=list.getTipo()%>">Eliminar</a>
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
