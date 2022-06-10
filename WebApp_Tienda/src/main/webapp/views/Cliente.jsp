<%@ page import="Modelo.ClientesBin" %><%--
  Created by IntelliJ IDEA.
  User: edith
  Date: 23/05/2022
  Time: 11:56 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Clientes</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>

<div class="container ">
    <h1>Clientes</h1>
    <form action="ControladorValidar?menu=Categorias" method="post" class="form-group">
        <div>
            <br>
            <label>Nombre   </label>
            <label><input type="text" name="nombre"  class="form-control" maxlength="30" required></label>
            <br>
            <label>Apellidos</label>
            <label><input type="text" name="apellidos"  class="form-control" maxlength="30" required></label>
            <br>
            <label>Colonia  </label>
            <label><input type="text" name="colonia"  class="form-control" maxlength="30" required></label>
            <br>
            <label>Ciudad   </label>
            <label><input type="text" name="ciudad"  class="form-control" maxlength="30" required></label>
            <br>
            <label>Calle    </label>
            <label><input type="text" name="calle"  class="form-control" maxlength="30" required></label>
            <br>
            <label>Avenida  </label>
            <label><input type="text" name="avenida"  class="form-control" maxlength="30" required></label>
            <br>
            <label>estado   </label>
            <label><input type="text" name="estado"  class="form-control" maxlength="30" required></label>
            <br>
            <label>Correo   </label>
            <%
                ClientesBin cliente= (ClientesBin) request.getAttribute("usu");
            %>
            <label><input type="text" name="correo" value="<%=cliente.getUser()%>" class="form-control" maxlength="30" required></label>
            <br>

            <label>password</label>
            <label><input type="password" name="password" value="<%=cliente.getPassword()%>" class="form-control" maxlength="30" required></label>
            <br>
            <label>Telefono</label>
            <label><input type="text" name="telefono"  class="form-control" maxlength="30" required ></label>
        </div>
        <br>
        <input type="submit" name="accion"  value="Guardar" class="boton-3">
    </form>
    <a href="index.jsp"><input type="submit"  value="Regresar al inicio" class="boton-3" ></a>
</div>

</body>
</html>
