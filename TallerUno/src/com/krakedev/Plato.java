package com.krakedev;

public class Plato {

	
	private String nombre;
	private String tipo;
	private float precio;
	private boolean disponible;
	
	
	public Plato(String nombre , String tipo , float precio , boolean disponible) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.precio = precio;
		this.disponible = disponible;
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	
	
}
