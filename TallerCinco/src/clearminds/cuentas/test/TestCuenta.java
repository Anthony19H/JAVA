package clearminds.cuentas.test;

import clearminds.cuenta.Cuenta;

public class TestCuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuenta cuenta1 = new Cuenta("03476");
		cuenta1.setSaldo(675);
		Cuenta cuenta2 = new Cuenta("03476", "C", 98);
		Cuenta cuenta3 = new Cuenta("03476");
		cuenta3.setTipo("C");
		// 2. Visualización inicial
		System.out.println("-------- Valores Iniciales ---------");
		cuenta1.imprimir();
		cuenta2.imprimir();
		cuenta3.imprimir();
		
		cuenta1.setSaldo(200);
		cuenta1.setTipo("B");
		
		cuenta2.setSaldo(300);
		cuenta2.setTipo("C");
		
		cuenta3.setSaldo(400);
		cuenta3.setTipo("A");
		
		System.out.println("---------Valores Seteados--------");
		cuenta1.imprimirConMiEstilo();
		cuenta2.imprimirConMiEstilo();
		cuenta3.imprimirConMiEstilo();
		
		System.out.println("--------Valores Cuenta 4, Cuenta 5 ,Cuenta 6 --------");
		
		Cuenta cuenta4 = new Cuenta("0123", "A", 125);
		
		Cuenta cuenta5 = new Cuenta("3210");
		cuenta5.setSaldo(225);
		
		Cuenta cuenta6 = new Cuenta("0132");
		cuenta6.setTipo("C");
		cuenta6.setSaldo(500);
		
		cuenta4.imprimirConMiEstilo();
		cuenta5.imprimirConMiEstilo();
		cuenta6.imprimirConMiEstilo();
	}

}
