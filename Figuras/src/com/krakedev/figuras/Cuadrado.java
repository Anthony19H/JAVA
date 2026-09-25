package com.krakedev.figuras;

public class Cuadrado extends Figura {
	

	private int lado;
	
	
	public Cuadrado(String nombre, String color) {
		super(nombre,color);
		
	}
		public Cuadrado(String nombre, String color, int lado) {
			super(nombre,color);
			this.lado = lado;
	}
		
		public int getLado() {
			return lado;
		}
		
		public void setLado(int lado) {
			this.lado = lado;
		}
		
		@Override
		
		public String toString() {
		    return "Cuadrado [nombre=" + super.getNombre() + ", color=" + super.getColor() + ", lado=" + lado + "]";
		}
		
		@Override
		public int calcularPerimetro() {
			return 4 * lado;
		}
		@Override
		public double calcularArea() {
			return lado * lado;
		}
}
