package com.htv.models;



public class Habitacion{
	
	private int hid;
	public String direccion;
	private double precioxdia;
	
	public Habitacion(int hid, String direccion, Double precioxdia) {
		super();
		this.hid = hid;
		this.direccion = direccion;
		this.precioxdia = precioxdia;
	}
	public int getHid() {
		return hid;
	}
	public void setHid(int hid) {
		this.hid = hid;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Double getPrecioxdia() {
		return precioxdia;
	}
	public void setPrecioxdia(Double precioxdia) {
		this.precioxdia = precioxdia;
	}
	
}
