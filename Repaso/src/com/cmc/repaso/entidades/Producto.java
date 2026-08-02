package com.cmc.repaso.entidades;

public class Producto {

	private String nombre;
	private double precio;
	
	public Producto (String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
		
		if(precio< 0) {
			this.precio=precio*-1;
		}else {
			this.precio = precio;
		}
	}
	
	
	public double calcularPrecioPromo(double descuento) {
		double resultadoDescuento = precio-(precio*descuento/100);
		return resultadoDescuento;
	}
	
}
