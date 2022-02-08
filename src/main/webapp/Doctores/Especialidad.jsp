<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>	Especialidad</title>
</head>
<body>
<form action="/Hospital/CrearEspecialidad" class="form-register" method="post" onsubmit="return validar()">
		<h4>Crear especialidad</h4>
		<input class="controls" type="text" name="nombre_especilidad" id="nombre_especialidad"  pattern="[a-zA-Z\s]*"  title="Debe solo ingresar texto"  placeholder="Ingrese sus nombres" required><br>
		<span id="Nombre_especilidad" class="error"></span>
		
		<input class="controls" type="text" name="descripcion_especilidad" id="descripcion_especilidad"   pattern="[a-zA-Z\s]*"  title="Debe solo ingresar texto"  placeholder="Ingrese sus apellidos" required/><br>
		<span id="Descripcion_especilidad"> </span>
		
		<input class="botons" type="submit" value="Crear Especialidad" onclick="validar">
		
	</form>
</body>
</html>