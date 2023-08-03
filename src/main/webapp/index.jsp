<%-- 
    Document   : index
    Created on : 1/08/2023, 12:04:18 AM
    Author     : RYZEN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro de empleados JSP</title>
        <link href="css/estilos.css" rel="stylesheet" type="text/css"/>
        <script src="https://kit.fontawesome.com/65f1cc7d06.js" crossorigin="anonymous"></script>
    </head>
     <body>
        <div class="cuerpo">

            <header>
                <img src="img/TQ CONFIABLE.jpg" alt="no carga">
            </header>

            <nav>
                
            </nav>

            <section>
                
                
                <article>

                    <fieldset> 
                        <h1>Registar Empleado</h1>
                        <form action="SvEstudiante" method="POST">
                            <label for="txtCodigo">Código:</label><br>
                            <input type="number" id="txtCodigo" name="codigo" ><br>
                            <label for="txtNombre">Nombre:</label><br>
                            <input type="text" id="txtNombre" name="nombre"><br>
                            <label for="txtApellido">Apellido:</label><br>
                            <input type="text" id="txtApellido" name="apellido" ><br>
                            <label for="txtEdad">Edad</label><br>
                            <input type="number" id="txtEdad" name="edad" ><br><br>
                           
                            
                            <input type="submit" value="Registrar">
                        </form>
                    </fieldset>  
                </article>
                
                <article>
                    <fieldset> 
                       <h1>Ver lista de empleados</h1>
                        <p>Para ver la lista de los usuarios cargados haga click en el siguiente botón</p>
                        
                        <form action="SvEstudiante" method="GET">
                    
                            <input type="submit" value="Consultar usuario">
                        </form>
                    </fieldset>  
                </article>
                
                <article>
                    <fieldset>
                <h1>Eliminar Usuario</h1>
                <p>Ingrese el codigo del usuario que desea eliminar</p>
                <form action="SvEliminar" method="POST">
                    <p> <label>Codigo: </label> <input type="text" name="cod_emp" </p>
                        <input type="submit" value="Eliminar usuario">
                    
                    </fieldset>  
                </article>
                
            </section>

            <footer>
                <div class="contenedor">
                    <h2 class="titulo-seccion">Contactanos</h2>
                </div>
                <div class="redes-sociales">
                    <i class="fab fa-twitter"></i>
                    <i class="fab fa-facebook"></i>
                    <i class="fab fa-instagram"></i>
                </div>
                <div class="contenedor">
                    <p class="copy">© 2023 TQ CONFIABLE / Todos los derechos reservados</p>
                    
                </div>
                
            </footer>

        </div>
         <script src="https://kit.fontawesome.com/65f1cc7d06.js" crossorigin="anonymous"></script>
         
    </body>
</html>
