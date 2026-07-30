package clearminds.cuenta;

public class Cuenta {
	
	private String id;
	private String tipo;
	private double saldo;
	
	public Cuenta(String id ) {
		this.id = id;
		this.tipo = "A";
		
	}
	
	public  Cuenta(String id,String tipo ,double saldo) {
		this.id =id;
		this.tipo = tipo;
		this.saldo = saldo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getId() {
		return id;
	}
	
	public void imprimir() {
		
		System.out.println("*********************");
		System.out.println("     Cuenta          ");
		System.out.println("*********************");
		System.out.println("Numero de cuenta: "+id);
		System.out.println("Tipo: "+ tipo);
		System.out.println("Saldo: USD " + saldo );
		
	}
	
	
	public void imprimirConMiEstilo() {
	    
	    System.out.println("=====================================");
	    System.out.println("       DETALLE DE SU CUENTA          ");
	    System.out.println("=====================================");
	    System.out.println("• No. de Cuenta : " + id);
	    System.out.println("• Tipo de Cuenta: " + tipo);
	    System.out.println("• Saldo Actual  : USD " + saldo);
	    System.out.println("-------------------------------------");
	   
	    
	}
}
