<%@ page import="Datos.CategoriaDao" %>
<%@ page import="java.util.List" %>
<%@ page import="Modelo.CategoriaBin" %>
<%@ page import="java.util.Iterator" %><%--
  Created by IntelliJ IDEA.
  User: edith
  Date: 23/05/2022
  Time: 09:28 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Categorias</title>
</head>
<body>
    <div>
        <h1>Categorias</h1>
        <table >
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Categoria</th>
                    <th>Acciones</th>
                </tr>
            </thead>
            <%
                CategoriaDao categoria=new CategoriaDao();
                List<CategoriaBin> lista=categoria.Select();
                Iterator<CategoriaBin> iter=lista.iterator();
                CategoriaBin cat;
                while (iter.hasNext()){
                    cat=iter.next();

            %>
            <tbody>
                <tr>
                    <td><%=cat.getId_categoria() %></td>
                    <td><%=cat.getNombre_categoria()%></td>
                    <td>
                        <a>Edit</a>
                        <a>Remove</a>
                    </td>
                </tr>
                <% } %>
            </tbody>
        </table>
    </div>

</body>
</html>
