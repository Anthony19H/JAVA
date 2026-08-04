package com.krakedev.demo.test;

import com.krakedev.demo.Producto;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto p1 = new Producto(1213,"laptop");
		p1.setDescripcion("Laptop gamer de ultima generacion");
		p1.setPeso(12.12);
		
		System.out.println("El codigo es: " + p1.getCodigo());
		System.out.println("El nombre es: " + p1.getNombre());
		System.out.println("El Descripcion es: " + p1.getDescripcion());
		System.out.println("El peso es: " + p1.getPeso());
	}

}
