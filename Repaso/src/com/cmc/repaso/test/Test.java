package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Item i1 = new Item();
		System.out.println("---------Valores iniciales----------");
        i1.setProductosActuales(20);
        i1.imprimir();

        System.out.println("\n--- DESPUÉS DE VENDER 7 ---");
        i1.vender(7);
        i1.imprimir(); 

        System.out.println("\n--- DESPUÉS DE DEVOLVER 2 ---");
        i1.devolver(2);
        i1.imprimir(); // 
		System.out.println("--------Otro producto-----------");
		
		Item i2 = new Item();
        i2.setProductosActuales(50);
        i2.imprimir();
        
        System.out.println("\n--- DESPUÉS DE VENDER 10 ---");
        i2.vender(10);
        i2.imprimir();
        
        System.out.println("\n--- DESPUÉS DE DEVOLVER 3 ---");
        i2.devolver(3);
        i2.imprimir();
	}

}
