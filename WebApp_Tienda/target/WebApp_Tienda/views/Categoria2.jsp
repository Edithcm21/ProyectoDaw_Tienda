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
    <link rel="stylesheet" href="Styles/Style.css">
</head>
<body>
<section id="pantalla-dividida">

        <div class="izquierda">
            <fieldset >
            <div >
                <form action="Controlador?menu=Categorias" method="GET">
                    <div>
                        <br>
                        <label>Nombre</label>
                        <label>

                            <%
                                CategoriaBin valor= (CategoriaBin) request.getAttribute("categoriase");
                                if (valor == null) {


                            %>
                            <input type="text" name="nombre"  class="" maxlength="30">

                            <%
                            } else {


                            %>
                            <input type="text" name="nombre" value="<%=valor.getNombre_categoria()%>"  class="">

                            <% }
                            %>
                        </label>

                    </div>
                    <br>

                    <input type="submit" name="accion"  value="Insertar" class="boton-3">
                    <input type="submit" name="accion"  value="Actualizar" class="boton-3" >
                </form>
                <a href="ServletPrincipal?accion=home"><input type="submit" name="accion"  value="Regresar al inicio" class="boton-4"></a>

            </div>
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
                    <a class="boton-5" href="Controlador?menu=Categorias&accion=Editar&id=<%=list.getId_categoria()%>">Editar </a>
                    <a class="boton-5" href="Controlador?menu=Categorias&accion=Eliminar&id=<%=list.getId_categoria()%>">Eliminar</a>
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

</section>
</body>
</html>
