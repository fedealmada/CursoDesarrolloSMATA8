<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario de Prueba</title>
    </head>
    <body>
        <h1>Datos del cliente</h1>
        <form action="SvPrueba" method="POST">
            <p><label>DNI: </label> <input type="text" name="dni"></p>
            <p><label>Nombre: </label> <input type="text" name="nombre"></p>
            <p><label>Apellido: </label> <input type="text" name="apellido"></p>
            <p><label>Telefono: </label> <input type="text" name="telefono"></p>
            <button type="submit">Enviar</button>
        </form>
        
        <h1>Ver lista de clientes</h1>
        <p>Si desea ver todos los clientes haga click en el botón mostrar clientes</p>
        <form action="SvPrueba" method="GET">
            <button type="submit">Mostrar clientes</button>
        </form>
    </body>
</html>
