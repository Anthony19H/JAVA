package com.krakedev.figuras;

public class Triangulo extends Figura {
	
	private int base;
	private int altura;

	public Triangulo(String nombre, String color) {
		super(nombre, color);
	}
	
	public Triangulo(String nombre, String color, int base ,int  altura) {
		super(nombre, color);
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public String toString() {
	    return "Triangulo [nombre=" + super.getNombre() + ", color=" + super.getColor() + ", base=" + base + ", altura=" + altura + "]";
	}

	@Override
	public double calcularArea() {
	    return base * altura / 2;
	}
	
	@Override
    public int calcularPerimetro() {
        return 3 * base; 
    }
}
