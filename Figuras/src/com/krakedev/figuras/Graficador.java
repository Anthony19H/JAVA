package com.krakedev.figuras;

public class Graficador {

	public void graficar(Figura figura) {
	    System.out.println("Graficando " + figura.getNombre() + " de color " + figura.getColor());
	    System.out.println("Perimetro " + figura.calcularPerimetro());
	    System.out.println("Area " + figura.calcularArea());
	}
}
