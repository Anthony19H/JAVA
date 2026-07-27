package com.krakedev;

public class TestRestaurante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Restaurante rest1 = new Restaurante();
		
		System.out.println("=========Restaurante 1 creado=========");
		
		System.out.println("Nombre :" + rest1.nombre);
		System.out.println("Direccion :" + rest1.direccion);
		System.out.println("Calificacion :" + rest1.calificacion);
		
		System.out.println("=========Restaurante 1 valores Asigandos==========");
		
		rest1.nombre = "La Tablita del tartaro";
		rest1.direccion = "El recreo";
		rest1.calificacion = 5.5f;
		
		System.out.println("Nombre :" + rest1.nombre);
		System.out.println("Direccion :" + rest1.direccion);
		System.out.println("Calificacion :" + rest1.calificacion);
		
		Restaurante rest2 = new Restaurante();
		
		System.out.println("=========Restaurante 2 creado=========");
		
		System.out.println("Nombre :" + rest2.nombre);
		System.out.println("Direccion :" + rest2.direccion);
		System.out.println("Calificacion :" + rest2.calificacion);
		
		System.out.println("=========Restaurante 2 valores Asigandos==========");
		
		rest2.nombre = "El hornero";
		rest2.direccion = "villaflora";
		rest2.calificacion = 5.5f;
		
		System.out.println("Nombre :" + rest2.nombre);
		System.out.println("Direccion :" + rest2.direccion);
		System.out.println("Calificacion :" + rest2.calificacion);
		
		
		
		


	}

}
