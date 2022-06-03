<%@ page import="Modelo.ImagenBin" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: edith
  Date: 28/05/2022
  Time: 12:01 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<!--
<div style="text-align: center;">
    <div>
        <form action="../Controlador" METHOD="post">
            <input type="submit" name="accion" value="listar">
            <input type="submit" name="accion" value="Nuevo">

        </form>
        <table>
            <thead>
            <tr>
                <th>ID</th>
                <th>NOMBRES</th>
                <th>FOTOS</th>
                <th>ACCONES</th>
            </tr>
            </thead>
            <tbody>
            <%
                List<ImagenBin> cat=(List<ImagenBin>)request.getAttribute("categorias");
                if(cat!=null)
                {
                    for(ImagenBin list:cat)
                    {
            %>
            <tr>
                <td><%=list.getId()%></td>
                <td><%=list.getNombre()%></td>
                <td><img src="ControlerIMG?id=<%=list.getId()%>" width="250" height="230" alt=""></td>
                <td>
                    <form action="../Controlador" METHOD="post">
                        <input type="submit" name="accion" value="editar">
                        <input type="submit" name="accion" value="eliminar">
                    </form>
                </td>
               <% }
               }%>
            </tr>
            </tbody>
        </table>
    </div>

</div>

!-->
<div>
    <h1>Agregar Usuario</h1>
</div>
<hr>
<br>
<form action="Controlador" method="post" enctype="multipart/form-data" >
    <label>id producto</label>
    <input type="text" name="Id">
    <label>talla</label>
    <input type="text" name="talla">
    <label>color</label>
    <input type="text" name="color">
    <label>foto</label>
    <input type="file" name="foto">
    <label>precio</label>
    <input type="text" name="precio">
    <label>cantidad</label>
    <input type="number" name="cantidad">
    <input type="submit" name="accion" value="Guardar">
    <input type="submit" name="accion" value="regresar">
    <input type="submit" name="accion"  value="Insertar" class="btn btn-info">
</form>
</body>
</html>
