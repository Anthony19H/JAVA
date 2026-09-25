package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Graficador;
import com.krakedev.figuras.Rectangulo;
import com.krakedev.figuras.Triangulo;
import com.krakedev.figuras.TrianguloRectangulo;

public class TestPerimetro {

    public static void main(String[] args) {

        Cuadrado cuadrado = new Cuadrado("Cuadrado", "rojo", 20);
        Rectangulo rectangulo = new Rectangulo("Rectangulo", "naranja", 20, 10);
        Graficador graficador = new Graficador();
        Triangulo triangulo = new Triangulo("Triangulo", "amarillo", 30, 10);
        TrianguloRectangulo trianguloRectangulo = new TrianguloRectangulo("TrianguloRectangulo", "verde", 3, 4);

        graficador.graficar(cuadrado);
        graficador.graficar(rectangulo);
        graficador.graficar(triangulo);
        graficador.graficar(trianguloRectangulo);

    }

}