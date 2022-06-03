<%@ page import="Modelo.CategoriaBin" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: edith
  Date: 23/05/2022
  Time: 10:17 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>

<html>
<head>
    <title>Categorias</title>
</head>
<body>
<div class="d-flex">
    <div class="card col-sm-4">
        <div >
            <form action="Controlador?menu=Categorias" method="GET">
                <div>
                    <label>Nombre</label>
                    <label>

                        <%
                            CategoriaBin valor= (CategoriaBin) request.getAttribute("categoriase");
                            if (valor == null) {


                                %>
                        <input type="text" name="nombre"  class="form-control" maxlength="30">

                         <%
                        } else {


                    %>
                    <input type="text" name="nombre" value="<%=valor.getNombre_categoria()%>"  class="form-control">

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
                List<CategoriaBin> cat=(List<CategoriaBin>)request.getAttribute("categorias");
                if(cat!=null)
                {
                    for(CategoriaBin list:cat)
                    {
            %>

                <tr>
                    <td><%=list.getId_categoria() %></td>
                    <td><%=list.getNombre_categoria()%></td>
                    <td>
                        <a class="btn btn-warning" href="Controlador?menu=Categorias&accion=Editar&id=<%=list.getId_categoria()%>">Editar </a>
                        <a class="btn btn-warning" href="Controlador?menu=Categorias&accion=Eliminar&id=<%=list.getId_categoria()%>">Eliminar</a>
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
