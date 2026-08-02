package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estudiante e1 =new Estudiante("Anthony");
		System.out.println("Las notas del estudiante " + e1.getNombre());
		e1.calificar(5);
		
		
		e1.calificar(9);
		
		
		
	}

}
