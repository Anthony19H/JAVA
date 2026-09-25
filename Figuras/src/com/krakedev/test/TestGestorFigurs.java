package com.krakedev.test;

import com.krakedev.figuras.*;

public class TestGestorFigurs {

	public static void main(String[] args) {
	    // TODO Auto-generated method stub

	    GestorFiguras gestor = new GestorFiguras();

	    gestor.agregarFigura(new Cuadrado("Cuadrado1", "azul", 4));
	    gestor.agregarFigura(new Triangulo("Triangulo1", "azul", 4, 3));
	    gestor.agregarFigura(new Rectangulo("Rect1", "azul", 4, 3));

	    Figura encontrada = gestor.buscarFigura("Triangulo1");

	    if (encontrada != null) {
	        System.out.println("Figura encontrada: " + encontrada);
	    } else {
	        System.out.println("No se encontro la figura");
	    }

	    System.out.println("Listar figuras:");

	    gestor.listarFiguras();

	    System.out.println("Area total: " + gestor.calcularAreaTotal());

	    System.out.println("Eliminar: ");

	    Figura elimina = gestor.buscarFigura("Triangulo1");

	    if (elimina != null) {
	        gestor.eliminarFigura("Triangulo1");
	    }

	    gestor.listarFiguras();

	    System.out.println(gestor.buscarFigura("Triangulo1"));
	}
}