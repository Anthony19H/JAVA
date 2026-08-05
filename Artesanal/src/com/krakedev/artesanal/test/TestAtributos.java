package com.krakedev.artesanal.test;

import com.krakedev.artesanal.Maquina;

public class TestAtributos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Maquina rubia = new Maquina("Pilsener","cerveza rubia", 0.02 ,100000,"C001" );
		
		rubia.imprimir();
		
		rubia.setNombreCerveza("Golden ale");
		rubia.setDescripcion("Cerveza con aroma mas inteso");
		rubia.imprimir();
	}

}
