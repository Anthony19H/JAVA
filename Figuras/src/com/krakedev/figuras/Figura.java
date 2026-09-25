package com.krakedev.figuras;

// 1. Añadimos 'abstract' a la clase
public abstract class Figura {

    private String nombre;
    private String color;
    
    public Figura(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    @Override
    public String toString() {
        return "Figura [nombre=" + nombre + ", color=" + color + "]";
    }
    
    // 2. Declaramos los métodos abstractos (SIN cuerpo {}, terminan en ;)
    public abstract int calcularPerimetro();
    
    public abstract double calcularArea();
}