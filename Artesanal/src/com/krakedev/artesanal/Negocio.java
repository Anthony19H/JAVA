package com.krakedev.artesanal;
 
public class Negocio {
 
	private String nombre;
	private Maquina maquina1;
	private int ultimoCodigo=100;
	private Cliente cliente;
 
	public Negocio() {
 
	}
 
	
 
	public Negocio(String nombre, Maquina maquina1) {
		this.nombre = nombre;
		this.maquina1 = maquina1;
	}
 
 
	public String getNombre() {
		return nombre;
	}
 
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
 
	public Maquina getMaquina1() {
		return maquina1;
	}
 
	public void setMaquina1(Maquina maquina1) {
		this.maquina1 = maquina1;
	}
	
	
	// crear el metodo que asigan el ultimo coidgo unicos a los nuevos clientes.
 
	public void asignarCodigoCliente(Cliente cliente) {
 
		cliente.setCodigo(ultimoCodigo);
		ultimoCodigo++; // es lo mismo que decir ====ultimoCodigo =ultimoCodigo+1;
 
	}
	// meotdo carga rmaquina
 
	public void cargarMaquina() {
		// utilizando el atributo compuesto de mi clase maquin puedo llaamr a sus metodos,
		maquina1.llenarMaquina();
		
	}
	
	// metodo consumir  cervecza
 
	public void consumirCerveza(Cliente cliente, double  ml) {
		
		double valorPagar =maquina1.servirCerveza(ml);
		cliente.setTotalConsumido(cliente.getTotalConsumido()+valorPagar);
		
	}
	
	
 
 
	
 
}
