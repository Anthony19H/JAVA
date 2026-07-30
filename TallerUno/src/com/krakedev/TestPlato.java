package com.krakedev;

public class TestPlato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Plato platoA;
        Plato platoB;
        Plato platoC;
        
        platoA = new Plato();
        platoB = new Plato();
        platoC = new Plato();
        
        
        System.out.println("=== VALORES POR DEFECTO ===");
        
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
        
        System.out.println("=== VALORES MODIFICADOS ===");
		
        
        platoA.setNombre("Ceviche de Camarón");
        platoA.setTipo("Entrada");
        platoA.setPrecio(8.50f);
        platoA.setDisponible(true);
        
        platoB.setNombre("Seco de Pollo");
        platoB.setTipo("Plato Fuerte");
        platoB.setPrecio(5.00f);
        platoB.setDisponible(true);
        
        platoC.setNombre("Tres Leches");
        platoC.setTipo("Postre");
        platoC.setPrecio(3.50f);
        platoC.setDisponible(false);
        
        
        System.out.println("--- PLATO A ---");
        System.out.println("Nombre: " + platoA.getNombre());
        System.out.println("Tipo: " + platoA.getTipo());
        System.out.println("Precio: " + platoA.getPrecio());
        System.out.println("Disponible: " + platoA.isDisponible());
        
        System.out.println("---- PLATO B ---");
        System.out.println("Nombre: " + platoB.getNombre());
        System.out.println("Tipo: " + platoB.getTipo());
        System.out.println("Precio: " + platoB.getPrecio());
        System.out.println("Disponible: " + platoB.isDisponible());
        
        System.out.println("---- PLATO C ---");
        System.out.println("Nombre: " + platoC.getNombre());
        System.out.println("Tipo: " + platoC.getTipo());
        System.out.println("Precio: " + platoC.getPrecio());
        System.out.println("Disponible: " + platoC.isDisponible());
		
	}

}
