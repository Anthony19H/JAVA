package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto p1 = new Producto("Ram", 200);
		
		double totalDescuento=p1.calcularPrecioPromo(20);
		System.out.println("El precio total con el descuento es: " + totalDescuento);
		
		p1.setPrecio(100);
		double totalDescuento2 =p1.calcularPrecioPromo(20);
		System.out.println("El precio total con el descuento es: " + totalDescuento2);
	}

}
