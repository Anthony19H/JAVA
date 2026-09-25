package com.krakedev.figuras;

public class TrianguloRectangulo extends Figura{

    private int catetoA;
    private int catetoB;
    private double hipotenusa;

    public TrianguloRectangulo(String nombre, String color) {
        super(nombre, color);
        // TODO Auto-generated constructor stub
    }

    public TrianguloRectangulo(String nombre, String color, int catetoA, int catetoB) {
        super(nombre, color);
        this.catetoA = catetoA;
        this.catetoB = catetoB;
        this.hipotenusa = Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2));
    }
    
    @Override
    public String toString() {
        return "TrianguloRectangulo [catetoA=" + catetoA + ", catetoB=" + catetoB + ", hipotenusa=" + hipotenusa + "]";
    }

    @Override
    public int calcularPerimetro() {
        return (int) (catetoA + catetoB + hipotenusa);
    }

    @Override
    public double calcularArea() {
        return (catetoA * catetoB) / 2;
    }

}