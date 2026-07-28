package com.krakedev;

public class Rectangulo {

	public int base;
	public int altura;
	
	
	
	public int calcularArea() {
		
		int area = base * altura;
		return area;
	}
	
	public double calcularPerimetro() {
		
		double resultado = (base+altura)*2;
		return resultado;
		
	}
	
	
}
