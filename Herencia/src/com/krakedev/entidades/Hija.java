package com.krakedev.entidades;

public class Hija extends Padre {
    private int juguetes;

    public Hija(String nombre, String virtudes, String defectos, int juguetes) {
        super(nombre, virtudes, defectos);
        this.juguetes = juguetes;
    }

    public int getJuguetes() {
        return juguetes;
    }

    public void setJuguetes(int juguetes) {
        this.juguetes = juguetes;
    }

    @Override
    public String toString() {
        return "Hija [nombre=" + getNombre() + ", virtudes=" + getVirtudes() + ", defectos=" + getDefectos() + ", totalAhorrado=" + getTotalAhorrado() + ", juguetes=" + juguetes + "]";
    }
}