package com.krakedev;

public class Restaurante {
	
	private String nombre;
	private String direccion;
	private float calificacion;
	
	public Restaurante(String nombre, String direccion, float calificacion) {
		this.nombre=nombre;
		this.calificacion=calificacion;
		this.direccion=direccion;
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public float getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(float calificacion) {
		this.calificacion = calificacion;
	}
	
	
}
