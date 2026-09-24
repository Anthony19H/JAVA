
package com.biblioteca;

import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private String apellido;
    private String cedula;
    private int idUsuario;
    private ArrayList<Libro> librosPrestados;

    public Usuario() {
        this.librosPrestados = new ArrayList();
    }

    public Usuario(String nombre, String apellido, String cedula, int idUsuario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.idUsuario = idUsuario;
        this.librosPrestados = new ArrayList();
    }

    public ArrayList<Libro> getLibrosPrestados() {
        return this.librosPrestados;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return this.cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getIdUsuario() {
        return this.idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void tomarLibro(Libro libro) {
        this.librosPrestados.add(libro);
    }

    public String toString() {
        String var10000 = this.nombre;
        return "Usuario [nombre=" + var10000 + ", apellido=" + this.apellido + ", cedula=" + this.cedula + ", idUsuario=" + this.idUsuario + ", \n librosPrestados=" + String.valueOf(this.librosPrestados) + "]";
    }

    public void devolverLibro(Libro libro) {
        this.librosPrestados.remove(libro);
    }
}
