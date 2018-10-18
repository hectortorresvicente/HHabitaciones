<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pedido</title>
</head>
<body>
	<h1>Gestion Reserva</h1>
	<a href="./principal">Hacer mas reservas</a>
	</div>
	<br>
	<br>
	<div>
		<a href="./reserva" name="btn_pagar" value="">gestionar reserva</a>
	</div>
	<br>
	<br>
	<form name="confirmando" method="POSt">
	<hr>
		<c:forEach var="unaRes" items="${listaReservas}" varStatus="counter">

			<div class="" id="">"${unaRes.estado ==2? "Pagado" : "Paga, pagarme, te ara feliz!! ;-)" }"</div>
			<br>

			<div>
				<label>Estado Reserva</label> <input class="" name="estadoP"
					data-id="  ${unaRes.rid}" value="${unaRes.estado}">
			</div>
			<label>Numero Reserva</label>
			<input class="" name="numeroReservaP" data-id="  ${unaRes.rid}"
				value="${unaRes.rid}">
			</div>
			<div>
				<label>Nombre Usuario</label> <input class="" name="usuarioP"
					data-id="  ${unaRes.rid}" value="${unaRes.usuario}">
			</div>
			<div>
				<label>Nombre Habitacion</label> <input class="" name="habitacionP"
					data-id="  ${unaRes.rid}" value="${unaRes.habitacion}">
			</div>
			<div>
				<label>Noches</label> <input class="" name="nochesP"
					data-id="  ${unaRes.rid}" value="${unaRes.dias}">
			</div>
			<div>
				<label>Precio Total</label> <input class="" name="precioP"
					data-id="  ${unaRes.rid}" value="${unaRes.precioTotal}">
				<samp>&#8364</samp>
			</div>
			<div>
			
			
				<button class="Pagando" data-id="${unaRes.rid}">"${unaRes.estado ==2? "Pagado!!" : "Pagar" }"</button>
			</div>
			<br>
			

<hr>

		</c:forEach>
	</form>





</body>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript" src="./script/amigo.js"></script>
</html>