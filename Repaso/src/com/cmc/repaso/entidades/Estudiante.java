package com.cmc.repaso.entidades;

public class Estudiante {
	
	private String nombre;
	private double nota;
	private String resultado;
	private double asistencia;
	
	public Estudiante(String nombre,double asistencia) {
		this.nombre = nombre;
		this.asistencia =asistencia;
	}
	
	public void calificar(double nota) {
		this.nota = nota;
		System.out.println("");
		if(nota> 0 && nota<8) {
			this.resultado = "F";
			System.out.println("EL resultado es: " + resultado);
		}else if(nota >= 8 && asistencia >= 80 ){
			this.resultado = "A";
			System.out.println("El resultado es: " + resultado);
		}else if (nota >= 8 && asistencia < 80){
			this.resultado = "X";
			System.out.println("Reprobado por faltas");
		}else {
			this.resultado = "Invalido";
			System.out.println("El resultado es: " + resultado);
		}
	}

	public String getNombre() {
		return nombre;
	}

	
}
