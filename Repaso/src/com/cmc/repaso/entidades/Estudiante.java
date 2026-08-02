package com.cmc.repaso.entidades;

public class Estudiante {
	
	private String nombre;
	private double nota;
	private String resultado;
	
	public Estudiante(String nombre) {
		this.nombre = nombre;
	}
	
	public void calificar(double nota) {
		this.nota = nota;
		System.out.println("");
		if(nota> 0 && nota<8) {
			this.resultado = "F";
			System.out.println("EL resultado es: " + resultado);
		}else if(nota >= 8){
			this.resultado = "A";
			System.out.println("El resultado es: " + resultado);
		}else {
			this.resultado = "invalido";
			System.out.println("El resultado es: " + resultado);
		}
	}

	public String getNombre() {
		return nombre;
	}

	
}
