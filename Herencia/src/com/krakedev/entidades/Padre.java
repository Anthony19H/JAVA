package com.krakedev.entidades;

public class Padre {
    private String nombre;
    private String virtudes;
    private String defectos;
    private double totalAhorrado;

    // Constructor que recibe nombre, virtudes y defectos
    public Padre(String nombre, String virtudes, String defectos) {
        this.nombre = nombre;
        this.virtudes = virtudes;
        this.defectos = defectos;
        this.totalAhorrado = 0.0;
    }

    // Método ahorrar (lo heredan los hijos)
    public void ahorrar(double monto) {
        totalAhorrado += monto;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVirtudes() {
        return virtudes;
    }

    public void setVirtudes(String virtudes) {
        this.virtudes = virtudes;
    }

    public String getDefectos() {
        return defectos;
    }

    public void setDefectos(String defectos) {
        this.defectos = defectos;
    }

    public double getTotalAhorrado() {
        return totalAhorrado;
    }

    public void setTotalAhorrado(double totalAhorrado) {
        this.totalAhorrado = totalAhorrado;
    }

    @Override
    public String toString() {
        return "Padre [nombre=" + nombre + ", virtudes=" + virtudes + ", defectos=" + defectos + ", totalAhorrado=" + totalAhorrado + "]";
    }
}