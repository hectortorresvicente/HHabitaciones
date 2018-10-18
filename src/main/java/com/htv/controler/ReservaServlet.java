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

@WebServlet("/reserva")
public class ReservaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<Reserva> listaReservas = Bbdd.getInstancia().getReservas1();
		request.setAttribute("listaReservas", listaReservas);
		System.out.println(listaReservas);

		request.getRequestDispatcher("reserva.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String numRes = request.getParameter("nummres");
		int EnumRes = Integer.parseInt(numRes);
		
		

		boolean eliminandoRes = Bbdd.getInstancia().eliminarReserva(EnumRes);

		System.out.println(numRes);

		doGet(request, response);
	}

}
