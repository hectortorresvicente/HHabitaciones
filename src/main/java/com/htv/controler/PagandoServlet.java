package com.htv.controler;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.htv.bbdd.Bbdd;

import com.htv.models.Reserva;

@WebServlet("/pagando")
public class PagandoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<Reserva> listaReservas = Bbdd.getInstancia().getReservas1();
		request.setAttribute("listaReservas", listaReservas);
		System.out.println(listaReservas);

		request.getRequestDispatcher("pagando.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {	
		
		// captando valores jsp nuevos
				String estadoP = request.getParameter("estadoP");
				int numestadoP = Integer.parseInt(estadoP);
				String numeroReservaP = request.getParameter("numeroReservaP");
				int numnumeroReservaP = Integer.parseInt(numeroReservaP);
				String usuarioP = request.getParameter("usuarioP");
			
				String habitacionP = request.getParameter("habitacionP");

				String nochesP = request.getParameter("nochesP");
				int numnochesP = Integer.parseInt(nochesP);

				String precioP = request.getParameter("precioP");
				double dobleprecioP = Double.parseDouble(precioP);

				// fin captando valores jsp
				System.out.println(" numero estado=" +numestadoP);
		
			if(numestadoP == 1){
				int masnumestadoP = numestadoP + 1;
				Reserva Lareserva = new Reserva(numnumeroReservaP, usuarioP, habitacionP, masnumestadoP, numnochesP,
						dobleprecioP);
				boolean reserva = Bbdd.getInstancia().creandoReserva(Lareserva);
				
				System.out.println(" numero estado=" +numestadoP+ 
						" /  nombre usuario="+usuarioP+ 
						" /  nombre habitacion="+habitacionP+ 
						" /  cantidad noches="+numnochesP+
						" / Cuantia total="+dobleprecioP+"€");
				
				
				String numRes = request.getParameter("numeroReservaP");
				int EnumRes = Integer.parseInt(numRes);
				boolean eliminandoRes = Bbdd.getInstancia().eliminarReserva(EnumRes);
				
			}if(numestadoP == 2) {
				request.setAttribute("Pagado", " numero estado=" +numestadoP+ 
						" /  nombre usuario="+usuarioP+ 
						" /  nombre habitacion="+habitacionP+ 
						" /  cantidad noches="+numnochesP+
						" / Cuantia total="+dobleprecioP+"€");
				
				
			}
						
				
			
		doGet(request, response);
	}

}
