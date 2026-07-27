package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculadora c1;
		c1 = new Calculadora();
		
		Calculadora c2;
		c2 = new Calculadora();
		
		int resultado;
		resultado = c1.sumar(2, 5);
		System.out.print("El resultado es :" + resultado);
		
		double resultadoResta =c2.restar(7, 3);
		System.out.println("\nEl resultado es :" + resultadoResta );
		
		Calculadora multiplicar = new Calculadora();
		
		double resultadoM =multiplicar.multiplicar(10, 5);
		System.out.println("El resultado de la multiplicaion es :" + resultadoM);
		
		double resultadoD =c1.dividir(10, 2);
		System.out.println("El resultado de la division es :" + resultadoD);
		
		double resultadoP = c1.promediar(10, 8, 9);
		System.out.println("El resultado del promedio es :" + resultadoP);
		
		//cuando es una funcion de tipo void no se declara variable para almacenar resultado 
		//llammos al apuntador, seleccionamos el metodo que no retorna nada
		
		c2.mostrarResultado();
		c1.mostrarMensaje("Anthony","Polilla");
	}

}
