package com.htv.controler;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.htv.bbdd.Bbdd;
import com.htv.models.Habitacion;
import com.htv.models.Reserva;
import com.htv.models.Usuario;

@WebServlet("/principal")
public class PrincipalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<Reserva> listaReservas = Bbdd.getInstancia().getReservas();
		request.setAttribute("listaReservas", listaReservas);
		
		int numUltimaReserva = Bbdd.getInstancia().ultimaRes();
		request.setAttribute("numUltimaReserva", numUltimaReserva);
		
		List<Habitacion> listaHabitaciones = Bbdd.getInstancia().getHabitaciones();
		request.setAttribute("listaHabitaciones", listaHabitaciones);
		// System.out.println(listaHabitaciones)
//		Reserva = Bbdd.getInstancia().ContadorNum(ContadorNum);
//		System.out.println(numUltimaReserva);

		request.getRequestDispatcher("principal.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// captando valores jsp

		String Cusaurio = request.getParameter("nusuario");

		String Creserva = request.getParameter("nreserva");
		int numCreserva = Integer.parseInt(Creserva);
		
		System.out.println(Cusaurio);
		
		String Chabitacion = request.getParameter("chabitacion");

		String Cnoches = request.getParameter("nnoches");
		int numCnoches = Integer.parseInt(Cnoches);

		String Cmonnoches = request.getParameter("nonnoches");
		double dobleCmonnoches = Double.parseDouble(Cmonnoches);

		// fin captando valores jsp
		// operaciones
		double CmonnochesXnumCnoches = numCnoches * dobleCmonnoches;
		int numCestado = 1;
		int masUnoNumCreserva = numCreserva + 1;
		// fin operaciones
		//validar usuario con nombre
		Usuario elUsuario = Bbdd.getInstancia().getUsuarioNombre(Cusaurio);
		
		if (elUsuario != null) {
			// System.out.println(unaRes);

			Reserva Lareserva = new Reserva(numCreserva, Cusaurio, Chabitacion, numCestado, numCnoches,
					CmonnochesXnumCnoches);
			
			 System.out.println(" numero estado=" +numCreserva+ " /  nombre usuario="+Cusaurio+ " /  nombre habitacion="+Chabitacion+ " /  cantidad noches="+numCnoches+
					 " / Cuantia total="+CmonnochesXnumCnoches+"€");

	

			boolean reserva = Bbdd.getInstancia().creandoReserva(Lareserva); /// la clacdve de ejecutar
			
			
		} else {
			request.setAttribute("NombreUSR", "añadir nombre almacenado, ejemplo (Pepe)");
			System.out.println("error");
		}

		doGet(request, response);
	}



}
