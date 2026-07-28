package com.krakedev;

public class Cuadrado {

	
	public int lado;
	
	public double calcularArea() {
		double resultado = lado*lado;
		return resultado;
	}
	
	
	public double calcularPerimetro() {
		double resultado = lado * 4;
		return resultado;
	}
}
