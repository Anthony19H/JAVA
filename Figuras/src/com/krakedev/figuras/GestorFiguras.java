package com.krakedev.figuras;

import java.util.HashMap;
import java.util.Map;

public class GestorFiguras {

    private Map<String, Figura> catalogo = new HashMap<>();

    public void agregarFigura(Figura figura) {
        catalogo.put(figura.getNombre(), figura);
    }

    public Figura buscarFigura(String id) {
        return catalogo.get(id);
    }

    public void listarFiguras() {
        for (Figura figura : catalogo.values()) {
            System.out.println(figura);
        }
    }

    public double calcularAreaTotal() {
        double total = 0;
        for (Figura figura : catalogo.values()) {
            total += figura.calcularArea();
        }
        return total;
    }
    public void eliminarFigura(String id) {
        catalogo.remove(id);
    }
}