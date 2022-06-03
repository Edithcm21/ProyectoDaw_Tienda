<%@ page import="Modelo.CategoriaBin" %>
<%@ page import="java.util.List" %>

<%--
  Created by IntelliJ IDEA.
  User: edith
  Date: 20/05/2022
  Time: 11:27 a. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Categorias</title>
</head>
<body>

<table class="default" width="50%" >

    <tr >
        <td>
            <form action="" method="post">
                <H3>Agregar Categoria</H3>
                <p>Nombre: <input type="text" name="nombre" id="nombre" size="40"></p>
                    <input type="submit" value="Guardar">
                    <input type="reset" value="Limpiar">
                </p>
            </form>

        </td>
        <td>
              AQUI VA LA LISTA
        </td>

        <td>
            Modificar
        </td>

    </tr>
</table>


</body>
</html>
