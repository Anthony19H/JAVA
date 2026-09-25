package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Figura;
import com.krakedev.figuras.Graficador;
import com.krakedev.figuras.Hexagono;
import com.krakedev.figuras.Rectangulo;
import com.krakedev.figuras.Triangulo;

public class TestGraficar {

    public static void main(String[] args) {
        Graficador graficador = new Graficador();

        Figura f1 = new Cuadrado("Cuadrado", "Rojo", 4);
        Figura f2 = new Rectangulo("Rectángulo", "Azul", 5, 3);
        Figura f3 = new Triangulo("Triángulo", "Verde", 4, 3);
        Figura f4 = new Hexagono("Hexágono", "Amarillo", 6);

        // Probar que el polimorfismo funciona para todas las figuras
        graficador.graficar(f1);
        System.out.println("-------------------");
        graficador.graficar(f2);
        System.out.println("-------------------");
        graficador.graficar(f3);
        System.out.println("-------------------");
        graficador.graficar(f4);
    }
}