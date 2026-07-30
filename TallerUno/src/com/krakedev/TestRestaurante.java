package com.krakedev;

public class TestRestaurante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Restaurante rest1 = new Restaurante();
		
		System.out.println("=========Restaurante 1 creado=========");
		
		System.out.println("Nombre :" + rest1.getNombre());
		System.out.println("Direccion :" + rest1.getDireccion());
		System.out.println("Calificacion :" + rest1.getCalificacion());
		
		System.out.println("=========Restaurante 1 valores Asigandos==========");
		
		rest1.setNombre("La Tablita del tartaro");
		rest1.setDireccion("El recreo");
		rest1.setCalificacion(5.5f);
		
		System.out.println("Nombre :" + rest1.getNombre());
		System.out.println("Direccion :" + rest1.getDireccion());
		System.out.println("Calificacion :" + rest1.getCalificacion());
		
		Restaurante rest2 = new Restaurante();
		
		System.out.println("=========Restaurante 2 creado=========");
		
		System.out.println("Nombre :" + rest2.getNombre());
		System.out.println("Direccion :" + rest2.getDireccion());
		System.out.println("Calificacion :" + rest2.getCalificacion());
		
		System.out.println("=========Restaurante 2 valores Asigandos==========");
		
		rest2.setNombre("El hornero");
		rest2.setDireccion("villaflora");
		rest2.setCalificacion(5.5f);
		
		System.out.println("Nombre :" + rest2.getNombre());
		System.out.println("Direccion :" + rest2.getDireccion());
		System.out.println("Calificacion :" + rest2.getCalificacion());
		
		
		
		


	}

}
