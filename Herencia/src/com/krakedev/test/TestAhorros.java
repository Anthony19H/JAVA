package com.krakedev.test;

import com.krakedev.entidades.Hija;
import com.krakedev.entidades.Hijo;
import com.krakedev.entidades.Padre;

public class TestAhorros {
    public static void main(String[] args) {
        
        // Paso 1: Padre
        Padre padre = new Padre("Carlos", "Generoso", "Orgulloso");
        padre.ahorrar(500.0);
        System.out.println("--- PADRE ---");
        System.out.println(padre);

        // Paso 2: Hija
        Hija hija = new Hija("Carla", "Inteligente", "Terca", 3);
        hija.ahorrar(500.0);
        System.out.println("\n--- HIJA ---");
        System.out.println(hija);

        // Paso 3: Hijo
        Hijo hijo = new Hijo("Mateo", "Amable", "Impaciente", 5);
        hijo.ahorrar(500.0); // Al invocar ahorrar con 500, internamente guardará solo 250 (el 50%)
        System.out.println("\n--- HIJO ---");
        System.out.println(hijo);
    }
}