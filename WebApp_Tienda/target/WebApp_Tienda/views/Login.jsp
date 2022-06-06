<%--
  Created by IntelliJ IDEA.
  User: edith
  Date: 18/05/2022
  Time: 07:05 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Login</title>
    <link rel="stylesheet" href=${pageContext.request.contextPath}"src/main/webapp/Styles/Botones.css">
    <link rel="icon" href="images/logo.jpg">


</head>
<body>
<fieldset>
    <form  action="../ControladorValidar" method="post">
        <div >
            <img src="../images/login.jpg" alt="70" width="340"/>
            <label>Iniciar Sesion</label>
        </div>
        <div >
            <label>Correo:</label>
            <label>
                <input type="text" name="user" class="">
            </label>
        </div>
        <div>
            <label>Password:</label>
            <label>
                <input type="password" name="password" class="">
            </label>
        </div>
        <input type="submit" name="accion" value="ingresar" class="boton-3">
    </form>
</fieldset>
<fieldset>
    <form  action="../ControladorValidar" method="post">
        <div >
            <img src="../images/login.jpg" alt="70" width="340"/>
            <label>Registrate</label>
        </div>
        <div >
            <label>Correo:</label>
            <label>
                <input type="text" name="user" class="">
            </label>
        </div>
        <div>
            <label>Password:</label>
            <label>
                <input type="password" name="password" class="">
            </label>
        </div>
        <input type="submit" name="accion" value="Registrar" class="boton-3">
    </form>
</fieldset>
</fieldset>

</body>
</html>
