package com.krakedev;

public class Calculadora {

	public int sumar(int a, int b) {
		int r;
		r = a + b;
		return r;
	}
	
	
	public double restar (int a, int b) {
		double r;
		r = a - b;
		return r;
	}
	
	public double multiplicar(double valor1 , double valor2 ) {
		
		double r = valor1 * valor2;
		return r;
	}
	
	public double dividir(double dividendo, double divisor) {
		
		double cociente = dividendo/divisor;
		return cociente;
	}
	
	public double promediar(double valor1 ,double valor2,double valor3) {
		
		double totalPromedio = (valor1+valor2+valor3)/3;
		return totalPromedio;
	}
	
	public void mostrarResultado() {
		System.out.println("Ahorita no joven. Sali al almuerzo .Regreso en 15 minutos");
	}
	
	public void mostrarMensaje(String nombre, String apodo) {
		System.out.println("Hola! " +nombre+", Tu apodo es: " +apodo);
	}
	
	public double calcularDescuento(double valor1,double descuento) {
		
		double resultadoDescuento = valor1 -(valor1*descuento/100);
		return resultadoDescuento;
	}
	
	
}
