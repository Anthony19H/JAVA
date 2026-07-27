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
        System.out.println(platoA.nombre);
        System.out.println(platoA.tipo);
        System.out.println(platoA.precio);
        System.out.println(platoA.disponible);
        
        System.out.println("-- Plato B --");
        System.out.println(platoB.nombre);
        System.out.println(platoB.tipo);
        System.out.println(platoB.precio);
        System.out.println(platoB.disponible);
        
        System.out.println("-- Plato C --");
        System.out.println(platoC.nombre);
        System.out.println(platoC.tipo);
        System.out.println(platoC.precio);
        System.out.println(platoC.disponible);
        
        System.out.println("=== VALORES MODIFICADOS ===");
		
        
        platoA.nombre = "Ceviche de Camarón";
        platoA.tipo = "Entrada";
        platoA.precio = 8.50f;
        platoA.disponible = true;
        
        platoB.nombre = "Seco de Pollo";
        platoB.tipo = "Plato Fuerte";
        platoB.precio = 5.00f;
        platoB.disponible = true;
        
        platoC.nombre = "Tres Leches";
        platoC.tipo = "Postre";
        platoC.precio = 3.50f;
        platoC.disponible = false;
        
        
        System.out.println("--- PLATO A ---");
        System.out.println("Nombre: " + platoA.nombre);
        System.out.println("Tipo: " + platoA.tipo);
        System.out.println("Precio: " + platoA.precio);
        System.out.println("Disponible: " + platoA.disponible);
        
        System.out.println("---- PLATO B ---");
        System.out.println("Nombre: " + platoB.nombre);
        System.out.println("Tipo: " + platoB.tipo);
        System.out.println("Precio: " + platoB.precio);
        System.out.println("Disponible: " + platoB.disponible);
        
        System.out.println("---- PLATO C ---");
        System.out.println("Nombre: " + platoC.nombre);
        System.out.println("Tipo: " + platoC.tipo);
        System.out.println("Precio: " + platoC.precio);
        System.out.println("Disponible: " + platoC.disponible);
		
	}

}
