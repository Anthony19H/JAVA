package com.krakedev.artesanal.test;

import com.krakedev.artesanal.Maquina;

public class TestRecargar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		boolean resultado;
		Maquina rubia = new Maquina("Pilsener", "Cerveza fria", 0.02, 8000,"C001");

		System.out.println("----------ESTADO INICIAL-----------");
		rubia.imprimir();
		
		System.out.println("----------Recarga 1-----------");
		resultado = rubia.recargarCerveza(3000);
		
		System.out.println("Se recargo correctamente? " + resultado);
		rubia.imprimir();
		
		System.out.println("----------Recarga 2-----------");
		resultado = rubia.recargarCerveza(2000);
		
		System.out.println("Se recargo correctamente? " + resultado);
		rubia.imprimir();
		
		System.out.println("----------Recarga 3-----------");
		resultado = rubia.recargarCerveza(2800);
		
		System.out.println("Se recargo correctamente? " + resultado);
		rubia.imprimir();
		
		System.out.println("----------Recarga 4-----------");
		resultado = rubia.recargarCerveza(100);
		
		System.out.println("Se recargo correctamente? " + resultado);
		rubia.imprimir();
	}

}
