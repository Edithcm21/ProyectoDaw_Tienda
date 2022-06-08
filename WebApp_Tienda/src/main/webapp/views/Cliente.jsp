<%@ page import="Modelo.ClientesBin" %><%--
  Created by IntelliJ IDEA.
  User: edith
  Date: 23/05/2022
  Time: 11:56 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Clientes</title>
</head>
<body>
<h1>Clientes</h1>
<div>
    <form action="ControladorValidar?menu=Categorias" method="post">
        <div>
            <br>
            <label>Nombre</label>
            <label><input type="text" name="nombre"  class="" maxlength="30" required></label>
            <br>
            <label>Apellidos</label>
            <label><input type="text" name="apellidos"  class="" maxlength="30" required></label>
            <br>
            <label>Colonia</label>
            <label><input type="text" name="colonia"  class="" maxlength="30" required></label>
            <br>
            <label>Ciudad</label>
            <label><input type="text" name="ciudad"  class="" maxlength="30" required></label>
            <br>
            <label>Calle</label>
            <label><input type="text" name="calle"  class="" maxlength="30" required></label>
            <br>
            <label>Avenida</label>
            <label><input type="text" name="avenida"  class="" maxlength="30" required></label>
            <br>
            <label>estado</label>
            <label><input type="text" name="estado"  class="" maxlength="30" required></label>
            <br>
            <label>Correo</label>
            <%
                ClientesBin cliente= (ClientesBin) request.getAttribute("usu");
            %>
            <label><input type="text" name="correo" value="<%=cliente.getUser()%>" class="" maxlength="30" required></label>
            <br>

            <label>password</label>
            <label><input type="text" name="password" value="<%=cliente.getPassword()%>" class="" maxlength="30" required></label>
            <br>
            <label>Telefono</label>
            <label><input type="text" name="telefono"  class="" maxlength="30" required></label>
        </div>
        <br>
        <input type="submit" name="accion"  value="Guardar" class="boton-3">
    </form>
    <a href="index.jsp"><input type="submit"  value="Regresar al inicio" class="boton-3" ></a>
</div>

</body>
</html>
