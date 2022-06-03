<%@ page import="Modelo.ProductosColorTallaBin" %>
<%@ page import="java.util.List" %>
<%@ page import="Modelo.ColoresBin" %>
<%@ page import="Modelo.ProductosBin" %>
<%@ page import="Modelo.TallasBin" %>
<!--
  Created by IntelliJ IDEA.
  User: edith
  Date: 30/05/2022
  Time: 05:48 p. m.
  To change this template use File | Settings | File Templates.
!-->
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Productos</title>
    <link rel="icon" href="images/logo.jpg">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

</head>
<body >
<div class="d-flex">
    <div class="card col-sm-4">
        <div >
            <form action="Productos?menu=Productos" method="get" enctype="multipart/form-data">
                <div>
                    <label for="pr">Id_producto(Referenciado)</label>
                            <select id="pr" name="id" required>
                                    <%
                            //Llenar select de producto principal
                            List<ProductosBin> p=(List<ProductosBin>) request.getAttribute("prodp");
                            if(p!=null)
                                {
                                    for (ProductosBin pp:p ) {
                                    %>
                                    <option value="<%=pp.getId_producto()%>"selected><%=pp.getNombre()%></option>
                                <%
                                    }
                                }
                                else{
                                %>
                                <option value="0" selected>Aun no existen colores</option>
                                <% }%>
                            </select>
                    <br><br>
                            <label for="color">Color</label>
                                <select id="color" name="color" required>
                                    <% //Llenar seleccion de colores
                                        List<ColoresBin> colores=(List<ColoresBin>) request.getAttribute("colores");
                                        if(colores!=null)
                                        {
                                            for (ColoresBin rec :colores ) {
                                                %>
                                                <option value="<%=rec.getId_color()%>" selected><%=rec.getNombre_color()%></option>
                                    <%
                                            }
                                        }
                                        else{
                                    %>
                                    <option value="0" selected>Aun no existen colores</option>
                                    <% }%>
                                </select>
                    <br><br>
                            <label>Talla</label>
                            <select id="Talla" name="talla" required>
                                <% //Llenar seleccion de colores
                                List<TallasBin> tallas=(List<TallasBin>) request.getAttribute("tallas");
                                if(colores!=null)
                                    {
                                        for (TallasBin talla :tallas ) {
                                %>
                                 <option value="<%=talla.getId_talla()%>" selected><%=talla.getNombretalla()%></option>
                                <%
                                }
                                }
                                else{
                                 %>
                                    <option value="0" selected>Aun no existen Tallas</option>
                                <% }%>
                            </select>
                    <br><br>
                            <%
                            ProductosColorTallaBin valor= (ProductosColorTallaBin)request.getAttribute("producto");

                          if (valor == null) {


                        %>
                            <p><label>Cantidad</label><input type="text" name="cantidad"  class="form-control"></p>
                            <p><label>Precio</label><input type="text"  name="precio"  class="form-control"></p>
                            <p><label>foto</label><input type="file" name="foto" class="form-control"></p>
                        <%
                        }

                          else {
                        %>
                            <p><label>Cantidad</label><input type="text" name="cantidad" value="<%=valor.getCantidad()%>"  class="form-control"></p>
                            <p><label>Precio</label><input type="text"  name="precio" value="<%=valor.getPrecio()%>"  class="form-control"></p>
                            <p><label>foto</label><input type="file" name="foto" value="<%=valor.getFoto()%>" class="form-control"></p>
                        <% }
                        %>

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
                <th>ID_producto</th>
                <th>Id_Alterno</th>
                <th>Color</th>
                <th>Talla</th>
                <th>Cantidad</th>
                <th>Imagen</th>
                <th>precio</th>
                <th>ACCIONES</th>
            </tr>
            </thead>
            <tbody>
            <%
                List<ProductosColorTallaBin> talla=(List)request.getAttribute("productos");
                if(talla!=null)
                {
                    for(ProductosColorTallaBin list:talla)
                    {
            %>

            <tr>
                <td><%=list.getId_producto() %></td>
                <td><%=list.getId_alterno()%></td>
                <td><%=list.getColor() %></td>
                <td><%=list.getTalla()%></td>
                <td><%=list.getCantidad() %></td>
                <td><img src="images/<%=list.getFoto()%>" alt="50" width="50" height="50"></td>
                <td><%=list.getPrecio()%></td>
                <td>
                    <a class="btn btn-warning" href="Productos?menu=Productos&accion=Editar&id_alterno=<%=list.getId_alterno()%>">Editar </a>
                    <a class="btn btn-warning" href="Productos?menu=Productos&accion=Eliminar&id_alterno=<%=list.getId_alterno()%>">Eliminar</a>
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
