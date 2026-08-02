package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Validacion;

public class TestValidacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Validacion v1 =new Validacion();
		
		boolean resultado1 = v1.validarMonto(400);
		System.out.println("Validacion verdadera : "+resultado1);
		
		
		boolean r2 = v1.validarMonto(-5);
		System.out.println("validacion falsa: "+ r2);
		
	}

}
