package com.biblioteca;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList();
    }

    public Biblioteca(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    public ArrayList<Libro> getLibros() {
        return this.libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    public void agregarLibro(Libro libro) {
        if (libro == null) {
            System.out.println("Libro no es valido para ingresar");
        } else {
            if (libro.getId() <= 0) {
                libro.setId(this.libros.size() + 1);
            }

            this.libros.add(libro);
        }
    }

    public void eliminarLibro(Libro libro) {
        int indice = this.obtenerIndice(libro);
        if (indice == -1) {
            System.out.println("No exite libro para eliminar");
        } else {
            this.libros.remove(indice);
        }
    }

    public Libro eliminarLibro(int indice) {
        Libro libro = null;
        if (indice >= 0 && indice < this.libros.size()) {
            libro = (Libro)this.libros.get(indice);
            this.libros.remove(indice);
            return libro;
        } else {
            System.out.println("Indice no es correcto");
            return libro;
        }
    }

    public int obtenerIndice(Libro libro) {
        int indice = -1;
        if (libro == null) {
            return indice;
        } else {
            for(int i = 0; i < this.libros.size(); ++i) {
                if (((Libro)this.libros.get(i)).getId() == libro.getId()) {
                    indice = i;
                    break;
                }
            }

            return indice;
        }
    }

    public void prestarLibro(Libro libro, Usuario usuario) {
        if (usuario.getLibrosPrestados().size() > 3) {
            System.out.println("NO PUEDES PEDIR MAS DE 3");
        } else {
            for(int i = 0; i < this.libros.size(); ++i) {
                if (((Libro)this.libros.get(i)).getId() == libro.getId()) {
                    if (((Libro)this.libros.get(i)).isPrestado()) {
                        System.out.println("Lo sentimos no se puede prestar");
                        return;
                    }

                    ((Libro)this.libros.get(i)).prestar();
                    usuario.tomarLibro(libro);
                }
            }

        }
    }

    public Libro buscarPorId(int id) {
        for(Libro libro : this.libros) {
            if (libro.getId() == id) {
                return libro;
            }
        }

        return null;
    }

    public Libro buscarPorTitulo(String titulo) {
        for(Libro libro : this.libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }

        return null;
    }

    public void mostrarLibrosDisponibles() {
        for(Libro libro : this.libros) {
            if (!libro.isPrestado()) {
                System.out.println(libro);
            } else {
                System.out.println("Libro no disponible");
            }
        }

    }

    public void buscarPorAutor(String nombreAutor) {
        boolean encontrado = false;

        for(Libro libro : this.libros) {
            if (libro.getAutor().equalsIgnoreCase(nombreAutor)) {
                System.out.println(libro);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron libros de este AUTOR");
        }

    }

    public void buscarPrecioMaximo(double precioMaximo) {
        boolean encontrado = false;

        for(Libro libro : this.libros) {
            if (libro.getPrecio() <= precioMaximo) {
                System.out.println(libro);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron libros dentro de ese precio");
        }

    }

    public void buscarPrecioMinimo(double precioMinimo) {
        boolean encontrado = false;

        for(Libro libro : this.libros) {
            if (libro.getPrecio() >= precioMinimo) {
                System.out.println(libro);
                encontrado = true;
            }

            if (!encontrado) {
                System.out.println("No se encontraron libros menores al precio deseado");
            }
        }

    }

    public ArrayList<Libro> buscarPorCadena(String cadena) {
        ArrayList<Libro> lista = new ArrayList();

        for(Libro libro : this.libros) {
            if (libro.getAutor().toLowerCase().contains(cadena.toLowerCase())) {
                lista.add(libro);
            }
        }

        if (lista.isEmpty()) {
            System.out.println("No hay resultados");
        }

        return lista;
    }
}