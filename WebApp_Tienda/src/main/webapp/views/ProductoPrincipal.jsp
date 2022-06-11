<%@ page import="Modelo.CategoriaBin" %>
<%@ page import="java.util.List" %>
<%@ page import="Modelo.ProductosBin" %>
<%--
  Created by IntelliJ IDEA.
  User: edith
  Date: 06/06/2022
  Time: 11:44 a. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>ProductoPrincipal</title>
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
<body >
<div id="pantalla-dividida">
    <div class="izquierda">
        <fieldset >
            <form action="ServletProductoPrincipal?menu=Productos" method="get" enctype="multipart/form-data">
                <div>
                    <%
                        ProductosBin valor= (ProductosBin) request.getAttribute("producto");

                        if (valor == null) {


                    %>
                    <p><label>Nombre</label><input type="text" name="Nombre"  class=""></p>
                    <br><br>
                    <p><label>Descripcion</label><input type="text" name="Descripcion"  class=""></p>
                    <br><br>
                    <% }
                    else{
                    %>
                    <p><label>Nombre</label><input type="text" name="Nombre" value="<%=valor.getNombre()%>"  class=""></p>
                    <p><label>Descripcion</label><input type="text"  name="Descripcion" value="<%=valor.getDescripcion()%>"  class=""></p>
                    <%}
                    %>
                    <label for="Categoria">Categoria</label>
                    <select id="Categoria" name="Categoria" required>
                        <% //Llenar seleccion de categorias
                            List<CategoriaBin> categoria=(List<CategoriaBin>) request.getAttribute("categorias");
                            if(categoria!=null)
                            {
                                for (CategoriaBin rec :categoria) {
                        %>
                        <option value="<%=rec.getId_categoria()%>" selected><%=rec.getNombre_categoria()%></option>
                        <%
                            }
                        }
                        else{
                        %>
                        <option value="0" selected>Aun no existen colores</option>
                        <% }%>
                    </select>
                </div>
                <input type="submit" name="accion"  value="Insertar" class="boton-3">
                <input type="submit" name="accion"  value="Actualizar" class="boton-3" >
            </form>
            <a href="ControladorValidar?accion=regresar"><input type="button" value="Regresar a inicio"  class="boton-7"></a>
        </fieldset>
    </div>

    <div class="derecha">
        <table class="table table-hover">
            <thead>
            <tr>
                <th>ID_producto</th>
                <th>Nombre</th>
                <th>Categoria</th>
                <th>Descripcion</th>
            </tr>
            </thead>
            <tbody>
            <%
                List<ProductosBin> prod=(List)request.getAttribute("productos");
                if(prod!=null)
                {
                    for(ProductosBin list:prod)
                    {
            %>

            <tr>
                <td><%=list.getId_producto() %></td>
                <td><%=list.getNombre()%></td>
                <td><%=list.getCategoria()%></td>
                <td><%=list.getDescripcion()%></td>
                <td>
                    <a class="boton-8" href="ServletProductoPrincipal?menu=Productos&accion=Editar&id=<%=list.getId_producto()%>">Editar </a>
                    <br><br>
                    <a class="boton-8" href="ServletProductoPrincipal?menu=Productos&accion=Eliminar&id=<%=list.getId_producto()%>">Eliminar</a>
                </td>
            </tr>
            <%
                }
            }
            else
            {
            %>
            <option value="No hay Productos"></option>
            <% } %>

            </tbody>
        </table>
    </div>
</div>

</body>
</html>
