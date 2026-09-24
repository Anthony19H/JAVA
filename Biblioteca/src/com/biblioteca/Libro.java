//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.biblioteca;

public class Libro {
    private int id;
    private String autor;
    private String genero;
    private String titulo;
    private int anio;
    private String isbn;
    private String editorial;
    private double precio;
    private boolean prestado;

    public Libro() {
    }

    public Libro(int id, String autor, String titulo, String genero, int anio, double precio) {
        this.id = id;
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.anio = anio;
        this.prestado = false;
        this.precio = precio;
    }

    public Libro(String autor, String titulo, String genero, int anio, double precio) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.anio = anio;
        this.prestado = false;
        this.precio = precio;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getEditorial() {
        return this.editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isPrestado() {
        return this.prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public int getAnio() {
        return this.anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void prestar() {
        this.prestado = true;
    }

    public void devolverLibro() {
        if (this.prestado) {
            this.prestado = false;
            System.out.println("libro devuelto");
        } else {
            System.out.println("libro NO se encuentra prestado");
        }

    }

    public void imprimir() {
        System.out.println("titulo= " + this.titulo);
    }

    public String toString() {
        return "Libro [id=" + this.id + ", autor=" + this.autor + ", genero=" + this.genero + ", titulo=" + this.titulo + ", anio=" + this.anio + ", prestado=" + this.prestado + "]\n";
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
