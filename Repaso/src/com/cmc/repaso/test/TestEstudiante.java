package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estudiante e1 =new Estudiante("Anthony",85.0);
		System.out.println("Las notas del estudiante " + e1.getNombre());
		
		e1.calificar(9);
		
		Estudiante e2 =new Estudiante("Dario",70.0);
		e2.calificar(9);
		
		Estudiante e3 =new Estudiante("Luis",95.0);
		e3.calificar(5);
		
	}

}
