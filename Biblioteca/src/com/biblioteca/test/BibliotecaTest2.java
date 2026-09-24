//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.biblioteca.test;

import com.biblioteca.Biblioteca;
import com.biblioteca.Libro;
import java.util.ArrayList;

public class BibliotecaTest2 {
    public BibliotecaTest2() {
    }

    public static void main(String[] args) {
        Libro l1 = new Libro("JJ benitez", "Caballo de troya", "", 2010, (double)21.0F);
        Libro l2 = new Libro(2, "Gabriel Garcia Marquez", "Caballo de troya", "", 2010, (double)21.0F);
        Libro l3 = new Libro("Maria Fernanda Heredia", "Caballo de troya", "", 2010, (double)21.0F);
        Libro l4 = new Libro(4, "Homero", "Caballo de troya", "", 2010, (double)21.0F);
        Libro l5 = new Libro("Benitez", "Caballo de troya", "", 2010, (double)21.0F);
        Biblioteca b1 = new Biblioteca();
        b1.agregarLibro(l1);
        b1.agregarLibro(l2);
        b1.agregarLibro(l3);
        b1.agregarLibro(l4);
        b1.agregarLibro(l5);
        System.out.println("libros: " + String.valueOf(b1.getLibros()));
        ArrayList<Libro> libros = b1.buscarPorCadena("");
        System.out.println("Libros encontrados: " + String.valueOf(libros));
        System.out.println();
        System.out.println("Eliminar registro");
        System.out.println("cantidad de libros: " + b1.getLibros().size());
        b1.eliminarLibro(new Libro());
        System.out.println("cantidad de libros con new Libro: " + b1.getLibros().size());
        b1.eliminarLibro((Libro)null);
        System.out.println("cantidad de libros con null: " + b1.getLibros().size());
        Libro libro = b1.eliminarLibro(2);
        System.out.println("cantidad de libros con indice: " + b1.getLibros().size());
        System.out.println("Libro eliminado: " + String.valueOf(libro));
    }
}
