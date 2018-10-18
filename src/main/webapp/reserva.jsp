<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pedido</title>
</head>
<body>
<h1> Gestion Reserva</h1>
	<a href="./principal">Hacer mas reservas</a>
	</div>
	<br>
	<br>
	<div>
		<a href="./pagando" name="btn_pagar" value="">Pagar</a>
	</div>
	<br>
	<br>
	<form name="confirmando" method="POSt">
		<c:forEach var="unaRes" items="${listaReservas}" varStatus="counter">



			<div>
				<label>Estado Reserva</label> <input class="" name=""
					data-id="  ${unaRes.rid}" value="${unaRes.estado}">
			</div>
			<label>Numero Reserva</label>
			<input class="" name="nummres" data-id="  ${unaRes.rid}"
				value="${unaRes.rid}">
			</div>
			<div>
				<label>Nombre Usuario</label> <input class="" name="hola"
					data-id="  ${unaRes.rid}" value="${unaRes.usuario}">
			</div>
			<div>
				<label>Nombre Habitacion</label> <input class="" name=""
					data-id="  ${unaRes.rid}" value="${unaRes.habitacion}">
			</div>
			<div>
				<label>Noches</label> <input class="" name=""
					data-id="  ${unaRes.rid}" value="${unaRes.dias}">
			</div>
			<div>
				<label>Precio Total</label> <input class="" name=""
					data-id="  ${unaRes.rid}" value="${unaRes.precioTotal}">
				<samp>&#8364</samp>
			</div>
			<div>
				<button class="bborrar" data-id="${unaRes.rid}">Cancelar
					reserva</button>
			</div>



		</c:forEach>
	</form>





</body>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript" src="./script/amigo.js"></script>
</html>