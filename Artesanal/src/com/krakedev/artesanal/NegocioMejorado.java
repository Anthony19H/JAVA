package com.krakedev.artesanal;

import java.util.ArrayList;

public class NegocioMejorado {

    private ArrayList<Maquina> maquinas;
    private ArrayList<Cliente> clientes;
    private int ultimoCodigo = 100;

    public NegocioMejorado() {
        this.maquinas = new ArrayList<Maquina>();
        this.clientes = new ArrayList<Cliente>();
    }

    public ArrayList<Maquina> getMaquinas() {
        return maquinas;
    }
    
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
    
    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void setMaquinas(ArrayList<Maquina> maquinas) {
        this.maquinas = maquinas;
    }

    public String generarCodigo() {
        int numeroAleatorio = (int) (Math.random() * 100) + 1;
        return "M-" + numeroAleatorio;
    }

    public Maquina recuperarMaquina(String codigo) {
        for (int i = 0; i < maquinas.size(); i++) {
            Maquina m = maquinas.get(i);
            if (m.getCodigo().equals(codigo)) {
                return m;
            }
        }
        return null;
    }

    public boolean agregarMaquina(String nombreCerveza, String descripcion, double precioPorML) {
        String codigoGenerado = generarCodigo();

        Maquina existente = recuperarMaquina(codigoGenerado);

        if (existente == null) {
            Maquina nuevaMaquina = new Maquina(nombreCerveza, descripcion, precioPorML, codigoGenerado);
            maquinas.add(nuevaMaquina);
            return true;
        } else {
            return false;
        }
    }

    public void cargarMaquinas() {
        for (int i = 0; i < maquinas.size(); i++) {
            Maquina m = maquinas.get(i);
            m.llenarMaquina();
        }
    }
    
    public void registrarCliente(String nombre, String cedula) {
        Cliente cliente = new Cliente();
        cliente.setNombre(nombre);
        cliente.setCedula(cedula);
        cliente.setCodigo(ultimoCodigo);
        ultimoCodigo++;

        clientes.add(cliente);
    }
    
    public Cliente buscarClientePorCedula(String cedula) {
        for (int i = 0; i < clientes.size(); i++) {
            Cliente c = clientes.get(i);
            if (c.getCedula().equals(cedula)) {
                return c;
            }
        }
        return null;
    }

    public Cliente buscarClientePorCodigo(int codigo) {
        for (int i = 0; i < clientes.size(); i++) {
            Cliente c = clientes.get(i);
            if (c.getCodigo() == codigo) {
                return c;
            }
        }
        return null;
    }
    
    public void registrarConsumo(Cliente cliente, double valorConsumido) {
        if (cliente != null) {
            double nuevoTotal = cliente.getTotalConsumido() + valorConsumido;
            cliente.setTotalConsumido(nuevoTotal);
        }
    }
    
    public boolean consumirCerveza(int codigoCliente, String codigoMaquina, int cantidad) {
        Maquina maquina = recuperarMaquina(codigoMaquina);
        Cliente cliente = buscarClientePorCodigo(codigoCliente);

        if (maquina != null && cliente != null) {
            double valorConsumido = maquina.servirCerveza(cantidad);
            registrarConsumo(cliente, valorConsumido);
            return true;
        }
        return false;
    }
    
    public double consultarValorVendido() {
        double totalVendido = 0;
        for (int i = 0; i < clientes.size(); i++) {
            Cliente c = clientes.get(i);
            totalVendido += c.getTotalConsumido();
        }
        return totalVendido;
    }
}