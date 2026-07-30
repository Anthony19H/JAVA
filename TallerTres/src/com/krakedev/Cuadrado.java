package com.krakedev;

public class Cuadrado {

	
	private int lado;
	
	public double calcularArea() {
		double resultado = lado*lado;
		return resultado;
	}
	
	
	public double calcularPerimetro() {
		double resultado = lado * 4;
		return resultado;
	}


	public int getLado() {
		return lado;
	}


	public void setLado(int lado) {
		this.lado = lado;
	}
	
	
}
