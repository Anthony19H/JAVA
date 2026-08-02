package com.krakedev;

public class TestPlato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Plato platoA;
        Plato platoB;
        Plato platoC;
        
        platoA = new Plato("Ceviche de Camarón","Entrada",5.00f,true);
        platoB = new Plato("Seco de Pollo","Plato Fuerte",5.00f,false);
        platoC = new Plato("Tres Leches","Postre",3.50f,false);
        
        
        System.out.println("=== VALORES POR CONSTRUCTOR===");
        
        System.out.println("-- Plato A --");
        System.out.println(platoA.getNombre());
        System.out.println(platoA.getTipo());
        System.out.println(platoA.getPrecio());
        System.out.println(platoA.isDisponible());
        
        System.out.println("-- Plato B --");
        System.out.println(platoB.getNombre());
        System.out.println(platoB.getTipo());
        System.out.println(platoB.getPrecio());
        System.out.println(platoB.isDisponible());
        
        System.out.println("-- Plato C --");
        System.out.println(platoC.getNombre());
        System.out.println(platoC.getTipo());
        System.out.println(platoC.getPrecio());
        System.out.println(platoC.isDisponible());
        
        
		
	}

}
