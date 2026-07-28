package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Cuadrado c1 =new Cuadrado();
		Cuadrado c2 =new Cuadrado();
		Cuadrado c3 =new Cuadrado();

		c1.lado = 3;
		c2.lado = 5;
		c3.lado = 6;
		
		double resultadoAreaCuadrado;
		double resultadoPerimetroCuadrado;
		resultadoAreaCuadrado = c1.calcularArea();
		resultadoPerimetroCuadrado = c1.calcularPerimetro();
		System.out.println("Resultado del area del cuadrado es: "+ resultadoAreaCuadrado);
		System.out.println("Resultado del perimetro del cuadrado es: "+ resultadoPerimetroCuadrado);
		
		
		double resultadoAreaCuadrado2;
		double resultadoPerimetroCuadrado2;
		resultadoAreaCuadrado2 = c2.calcularArea();
		resultadoPerimetroCuadrado2 = c2.calcularPerimetro();
		System.out.println("Resultado del segundo area del cuadrado es: "+ resultadoAreaCuadrado2);
		System.out.println("Resultado del perimetro del cuadrado es: "+ resultadoPerimetroCuadrado2);
		
		double resultadoAreaCuadrado3;
		double resultadoPerimetroCuadrado3;
		resultadoAreaCuadrado3 = c3.calcularArea();
		resultadoPerimetroCuadrado3 = c3.calcularPerimetro();
		System.out.println("Resultado del area del tercer cuadrado es: "+ resultadoAreaCuadrado3);
		System.out.println("Resultado del perimetro del cuadrado es: "+ resultadoPerimetroCuadrado3);
		
		
		
	}

}
