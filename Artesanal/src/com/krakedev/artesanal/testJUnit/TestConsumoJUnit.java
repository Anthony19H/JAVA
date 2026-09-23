package com.krakedev.artesanal.testJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.krakedev.artesanal.Cliente;
import com.krakedev.artesanal.Maquina;
import com.krakedev.artesanal.NegocioMejorado;

public class TestConsumoJUnit {

    @Test
    public void testConsumirCervezaYConsultarVendido() {
        NegocioMejorado negocio = new NegocioMejorado();

        negocio.agregarMaquina("UwU", "Cerveza artesanal UwU", 0.05);
        negocio.cargarMaquinas();

        negocio.registrarCliente("Anthony Herrera", "1712345678");

        Maquina maquina = negocio.getMaquinas().get(0);
        Cliente cliente = negocio.getClientes().get(0);

        String codigoMaquina = maquina.getCodigo();
        int codigoCliente = cliente.getCodigo();
        double cantidadInicialMaquina = maquina.getCantidadActual();

        boolean consumido = negocio.consumirCerveza(codigoCliente, codigoMaquina, 500);

        assertTrue(consumido);
        assertNotNull(cliente);
        assertEquals(25.0, cliente.getTotalConsumido(), 0.01);
        assertEquals(cantidadInicialMaquina - 500, maquina.getCantidadActual(), 0.01);

        negocio.consumirCerveza(codigoCliente, codigoMaquina, 300);

        assertEquals(40.0, cliente.getTotalConsumido(), 0.01);
        assertEquals(40.0, negocio.consultarValorVendido(), 0.01);
    }
}