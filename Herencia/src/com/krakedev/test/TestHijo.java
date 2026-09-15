package com.krakedev.test;

import com.krakedev.entidades.Hijo;

public class TestHijo {
    public static void main(String[] args) {
        // Instanciar un Hijo con nombre, virtudes, defectos y juguetes
        Hijo hijo = new Hijo("Mateo", "Amable", "Impaciente", 5);

        // Imprimir para validar que se está usando el toString sobrescrito
        System.out.println(hijo);
    }
}