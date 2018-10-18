package com.htv.bbdd;

import java.util.ArrayList;

import java.util.List;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

import com.htv.models.Habitacion;
import com.htv.models.Reserva;
import com.htv.models.Usuario;

public class Bbdd {

	private static Bbdd instancia = null;
	private static List<Habitacion> listaHabitaciones = new ArrayList<>();
	private static List<Usuario> listaUsuarios = new ArrayList<>();
	private static List<Reserva> listaReservas = new ArrayList<>();

	public static Bbdd getInstancia() {
		if (instancia == null)
			instancia = new Bbdd();
		return instancia;
	}

	private Bbdd() {
		CreacionHabitaciones();
		CreacionUsuarios();
		CreacionReserva();
		// getReservas1();

	}

	// Creamos habitaciones
	public boolean CreacionHabitaciones() {
		listaHabitaciones.add(new Habitacion(1, " delante", 22.4));
		listaHabitaciones.add(new Habitacion(2, " arriba", 23.4));
		listaHabitaciones.add(new Habitacion(3, " abajo", 24.4));
		listaHabitaciones.add(new Habitacion(4, " detras", 26.4));

		return true;
	}

	// lanzamos la lista de habitaciones
	public final List<Habitacion> getHabitaciones() {
		return listaHabitaciones;
	}

	// creando reservas
	public boolean CreacionReserva() {
		

		return true;

	}

	// lanzando reservas
	public final static List<Reserva> getReservas() {
		return listaReservas;
	}

	public final static List<Reserva> getReservas1() {
		return listaReservas;
	}

	// lanzando total reservas
	public int ultimaRes() {
		int numREs = listaReservas.size() + 1;
		return numREs;

	}

	// conectar para reservas
	public final boolean creandoReserva(Object unaRes) {
		return listaReservas.add((Reserva) unaRes);
	}

	// borrando reservas
	public final boolean eliminarReserva(int getRid) {
		boolean eliminar = false;
		for (int i = 0; i < listaReservas.size(); i++) {
			if (listaReservas.get(i).getRid() == getRid) {
				listaReservas.remove(i);
				eliminar = true;
				break;
			}
		}
		return eliminar;

	}
	// reserva pagada estado 2
//	public final  int pagadaReserva(int getRid) {
//		int estadoDos=2;
//		for (int i = 0; i < listaReservas.size(); i++) {
//			if (listaReservas.get(i).getRid() == getRid) {
//				listaReservas.get(i).getEstado();
//				
//				break;
//			}
//		}
//		return estado;
//
//	}



	// Creamos usuarios
	public boolean CreacionUsuarios() {
		listaUsuarios.add(new Usuario(1, "Pepe", "hola1@hola2,com"));
		listaUsuarios.add(new Usuario(2, "Luisa", "hola2@hola2,com"));
		listaUsuarios.add(new Usuario(3, "Eso k e", "hola3@hola2,com"));
		listaUsuarios.add(new Usuario(4, "Io", "hola4@hola2,com"));

		return true;
	}

	// lanzamos la lista de usuarios
	public final static List<Usuario> getUsuarios() {
		return listaUsuarios;
	}
	// Usuarios validando
	public Usuario getUsuarioNombre(String nombre) {
		Usuario elUsuario = null;
		for (Usuario elUsu : listaUsuarios) {
			if (elUsu.getNombre().equals(nombre)) {
				elUsuario = elUsu;
				break;
			}
		}
		return elUsuario;
	}

}

