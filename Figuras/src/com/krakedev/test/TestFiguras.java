package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Figura;
import com.krakedev.figuras.Rectangulo;
import com.krakedev.figuras.Triangulo;

public class TestFiguras {

    public static void main(String[] args) {
        // Como Figura es abstracta, instanciamos sus clases hijas 
        // asignando las referencias a variables de tipo Figura
        Figura f1 = new Cuadrado("Cuadrado 1", "Rojo", 5);
        Figura f2 = new Triangulo("Triángulo 1", "Verde", 4, 3);
        Figura f3 = new Rectangulo("Rectángulo 1", "Azul", 6, 2);

        // Al imprimir los objetos se invoca automáticamente el método toString()
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
    }
}