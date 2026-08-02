package com.krakedev;

public class TestRestaurante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Restaurante rest1 = new Restaurante("La Tablita del tartaro","El recreo",5.5f);
		
		System.out.println("=========Restaurante 1 valores Asigandos con constructor==========");
	
		
		System.out.println("Nombre :" + rest1.getNombre());
		System.out.println("Direccion :" + rest1.getDireccion());
		System.out.println("Calificacion :" + rest1.getCalificacion());
		
		Restaurante rest2 = new Restaurante("El hornero","villaflora",5.5f);
		
		
		System.out.println("=========Restaurante 2 valores Asigandos con constructor==========");
		
		System.out.println("Nombre :" + rest2.getNombre());
		System.out.println("Direccion :" + rest2.getDireccion());
		System.out.println("Calificacion :" + rest2.getCalificacion());
		
		
		
		


	}

}
