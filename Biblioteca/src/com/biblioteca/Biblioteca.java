package com.biblioteca;

import java.util.ArrayList;

public class Biblioteca {
	
	private ArrayList<Libro> libros;
	
	//Constructor vacio
	public Biblioteca() {
		this.libros = new ArrayList<Libro>(); 
	}
	public Biblioteca(ArrayList<Libro> libros) {
	this.libros = libros;
	
	}
	public ArrayList<Libro> getLibros() {
		return libros;
	}
	public void setLibros(ArrayList<Libro> libros) {
		this.libros = libros;
	}
	
	//Metodo agregar libro
	public void agregarLibro(Libro libro) {
		libros.add(libro);
	}
	//Metodo prestar libro
	public void prestarLibro(Libro libro, Usuario usuario) {
		
		if(usuario.getLibrosPrestados().size()>3) {
			System.out.println("NO PUEDES PEDIR MAS DE 3");
			return;
		}
		
		for(int i = 0; i<libros.size(); i++) {
			
			if(libros.get(i).getId()==libro.getId()) {
				if(libros.get(i).isPrestado()) {
					System.out.println("Lo sentimos no se puede prestar");
					return;
				}
				libros.get(i).prestar();
				usuario.tomarLibro(libro);
			}
		}
	}
	
	public Libro buscarPorId(int id) {
		for(Libro libro: libros) {
			if(libro.getId()== id) {
				return libro;
			}
		}
		return null;
	}
	
	
	public Libro buscarPorTitulo(String titulo) {
	    for(Libro libro : libros) {
	        if(libro.getTitulo().equalsIgnoreCase(titulo)) {
	            return libro;
	        }
	    }
	    return null;
	}
}
