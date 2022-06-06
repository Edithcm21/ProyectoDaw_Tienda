<%--
  Created by IntelliJ IDEA.
  User: edith
  Date: 18/05/2022
  Time: 07:05 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" %>
<html>
<head>
    <title>Login</title>
    <link rel="icon" href="images/logo.jpg">
    <STYLE>
        .izquierda{

            height: 100vh;
            width: 50%;
            text-align: center;

        }
        .derecha{
            background-size: cover;
            background-position: center;
            height: 100vh;
            width: 50%;
            text-align: center;

        }
        #pantalla-dividida{
            display: flex;
        }
        fieldset{
            height: 100vh;
        }
    </STYLE>
    <link rel="stylesheet" href="Styles/Style.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Styles/Botones.css">



</head>
<body>
<div id="pantalla-dividida">
    <div class="izquierda">
<fieldset>
    <form  action="../ControladorValidar" method="post">
        <div >
            <img src="${pageContext.request.contextPath}/images/login.jpg" alt="70" width="340"/>
            <br>
            <H1>Iniciar Sesion</H1>
        </div>
        <div >
            <label>Correo:</label>
            <label>
                <input type="text" name="user" class="">
            </label>
        </div>
        <br>
        <div>
            <label>Password:</label>
            <label>
                <input type="password" name="password" class="">
            </label>
        </div>
        <br>
        <input type="submit" name="accion" value="ingresar" class="boton-3">
    </form>
    <a href="index.jsp"><input type="submit" value="Regresar" class="boton-7"></a>
</fieldset>
    </div>
    <div class="derecha">
<fieldset>
    <form  action="../ControladorValidar" method="post">
        <div >
            <img src="${pageContext.request.contextPath}/images/login.jpg" alt="70" width="340"/>
            <br>
            <h4>No tienes cuenta?.</h4>
            <H1>Registrate</H1>
        </div>
        <div >
            <label>Correo:</label>
            <label>
                <input type="text" name="user" class="">
            </label>
        </div>
        <br>
        <div>
            <label>Password:</label>
            <label>
                <input type="password" name="password" class="">
            </label>
        </div>
        <br>
        <input type="submit" name="accion" value="Registrar" class="boton-3">
    </form>
</fieldset>
    </div>
</div>
</body>
</html>
