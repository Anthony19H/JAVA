package com.krakedev.entidades;

public class Hijo extends Padre {
    private int juguetes;

    public Hijo(String nombre, String virtudes, String defectos, int juguetes) {
        super(nombre, virtudes, defectos);
        this.juguetes = juguetes;
    }

    // Sobrescribir el método ahorrar para que el hijo solo ahorre el 50%
    @Override
    public void ahorrar(double monto) {
        double montoMitad = monto * 0.5;
        super.ahorrar(montoMitad); // O también: setTotalAhorrado(getTotalAhorrado() + montoMitad);
    }

    public int getJuguetes() {
        return juguetes;
    }

    public void setJuguetes(int juguetes) {
        this.juguetes = juguetes;
    }

    @Override
    public String toString() {
        return "Hijo [nombre=" + getNombre() + ", virtudes=" + getVirtudes() + ", defectos=" + getDefectos() + ", totalAhorrado=" + getTotalAhorrado() + ", juguetes=" + juguetes + "]";
    }
}