<%@ page import="Modelo.CategoriaBin" %>
<%@ page import="java.util.List" %>
<%--
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
            <fieldset >

                <form action="Controlador?menu=Categorias" method="GET">
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
                    <br>
                    <br>
                    <input type="submit" name="accion"  value="Insertar" class="boton-3">
                    <input type="submit" name="accion"  value="Actualizar" class="boton-3" >
                </form>
                <input type="button" value="Página anterior" onClick="history.go(-1); " class="boton-7">

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
                    <a class="boton-8" href="Controlador?menu=Categorias&accion=Editar&id=<%=list.getId_categoria()%>">Editar </a>
                    <a class="boton-8" href="Controlador?menu=Categorias&accion=Eliminar&id=<%=list.getId_categoria()%>">Eliminar</a>
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
