
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HHabitaciones</title>
</head>
<body>
	<h1>Habitaciones</h1>

	<%-- ${listaHabitaciones} --%>

	<form method="POSt" name="captando">
		<div>
		<div>
		<a href="./reserva">gestionar reserva</a>
		</div>
		<br>
		
			<div>
				<label>n reserva</label> <input name="nreserva" value="1">
			</div>
			<div>
			<div class="" id="">"${getUsuarioNombre.elUsuario ==null? NombreUSR : "añada nombre" }"</div>
			<!-- <div>A&ntildeadir el nombre de usuario (Pepe)</div> -->
				<label>Usuario</label> <input name="nusuario" value="">
			</div>
		</div>
		<br> <br>
		<hr>
		<div>
			<c:forEach var="unaHabitacion" items="${listaHabitaciones}"
				varStatus="">
				<div>
					<label>Nombre Habitacion: </label> <input name="chabitacion"
						value="${unaHabitacion.direccion}"> <br>
				</div>

				

				<div>
					<label>Numero Noches</label> <input name="nnoches" value="2">
				</div>

				<div>
					<label>Precios Nosches</label> <input name="nonnoches"
						value="${unaHabitacion.precioxdia}">
				</div>
		</div>
		
		<button>Reservar Habitaci&oacute;n</button>
		<br> <br>
		<hr>

		</c:forEach>
	</form>
	

	<!-- <div id="anulacion">
		<button>Anular Reservar</button>
	</div>

	<div id="compra">
		<button>Finaliazar Reservar</button>
	</div> -->
</body>
</html>