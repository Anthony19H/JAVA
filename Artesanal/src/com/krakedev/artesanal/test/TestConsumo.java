package com.krakedev.artesanal.test;

import com.krakedev.artesanal.Cliente;
import com.krakedev.artesanal.NegocioMejorado;

public class TestConsumo {

    public static void main(String[] args) {
        NegocioMejorado negocio = new NegocioMejorado();

       
        negocio.agregarMaquina("IPA", "Cerveza artesanal IPA", 0.05);
        negocio.cargarMaquinas();

        
        String codigoMaquina = negocio.getMaquinas().get(0).getCodigo();

        
        negocio.registrarCliente("Anthony Moya", "1712345678");
        
        
        Cliente cliente = negocio.getClientes().get(0);
        int codigoCliente = cliente.getCodigo();

        
        negocio.consumirCerveza(codigoCliente, codigoMaquina, 500); // 500 ml
        negocio.consumirCerveza(codigoCliente, codigoMaquina, 300); // 300 ml

        
        System.out.println("Total consumido por " + cliente.getNombre() + ": $" + cliente.getTotalConsumido());
        System.out.println("Total general vendido en el negocio: $" + negocio.consultarValorVendido());
    }
}