<%@ page import="Modelo.TipoEmpleadoBin" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: edith
  Date: 27/05/2022
  Time: 06:30 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Tipos de empleado</title>
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
<div id="pantalla-dividida">
    <div class="izquierda">
        <fieldset >

            <form action="ServletTipo_Empleados?menu=Tipo_Empleado" method="GET">
                <div>
                    <label>Nombre</label>
                    <label>

                        <%
                            TipoEmpleadoBin valor= (TipoEmpleadoBin) request.getAttribute("tipo");
                            if (valor == null) {


                        %>
                        <input type="text" name="nombre"  maxlength="30">

                        <%
                        } else {


                        %>
                        <input type="text" name="nombre" value="<%=valor.getTipo()%>"  >

                        <% }
                        %>
                    </label>

                </div>
                <br><br>

                <input type="submit" name="accion"  value="Insertar" class="boton-3">
                <input type="submit" name="accion"  value="Actualizar" class="boton-3" >
            </form>

            <input type="button" value="Página anterior" onClick="history.go(-1);" class="boton-7">
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
                    <a class="boton-8" href="ServletTipo_Empleados?menu=Tipo_Empleado&accion=Editar&id=<%=list.getId_tipo()%>">Editar </a>
                    <a class="boton-8" href="ServletTipo_Empleados?menu=Tipo_Empleado&accion=Eliminar&id=<%=list.getTipo()%>">Eliminar</a>
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
