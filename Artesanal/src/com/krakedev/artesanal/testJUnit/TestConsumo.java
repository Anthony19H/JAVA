package com.krakedev.artesanal.testJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.krakedev.artesanal.Cliente;
import com.krakedev.artesanal.Maquina;
import com.krakedev.artesanal.Negocio;

public class TestConsumo {

    private Negocio negocio;
    private Maquina maquina;
    private Cliente cliente;

    @BeforeEach
    public void setUp() {
        // Maquina de prueba estándar para tests modulares
        maquina = new Maquina("IPA", "Cerveza artesanal IPA", 0.05, 1000.0, "M001");
        negocio = new Negocio("Cervecería Krakedev", maquina);
        cliente = new Cliente("Carlos Pérez", "1712345678");
    }

    @Test
    @DisplayName("Prueba de consumo progresivo en Bar de Moe")
    public void probarConsumo() {
        Maquina maquina1 = new Maquina("Pilsener", "rubia", 0.002, 8000, "C001");
        Negocio barDeMoe = new Negocio("Bar de moe", maquina1);
        Cliente clienteAndres = new Cliente("Andres", "123456789");

        barDeMoe.cargarMaquina(); // Carga a 7800 (8000 - 200)

        // Primer consumo: 100 ml (100 * 0.002 = $0.2)
        barDeMoe.consumirCerveza(clienteAndres, 100);
        assertEquals(7700.0, maquina1.getCantidadActual(), 0.0001);
        assertEquals(0.2, clienteAndres.getTotalConsumido(), 0.0001);

        // Segundo consumo: 200 ml (200 * 0.002 = $0.4 -> Total acumulado: $0.6)
        barDeMoe.consumirCerveza(clienteAndres, 200);
        assertEquals(7500.0, maquina1.getCantidadActual(), 0.0001);
        assertEquals(0.6, clienteAndres.getTotalConsumido(), 0.0001);
    }

    @Test
    @DisplayName("Debe asignar códigos consecutivos a los nuevos clientes")
    public void testAsignarCodigoCliente() {
        Cliente cliente2 = new Cliente("Ana Gómez", "1787654321");

        negocio.asignarCodigoCliente(cliente);
        assertEquals(100, cliente.getCodigo(), "El primer código asignado debe ser 100");

        negocio.asignarCodigoCliente(cliente2);
        assertEquals(101, cliente2.getCodigo(), "El segundo código asignado debe ser 101");
    }

    @Test
    @DisplayName("Debe cargar la máquina llenando la cantidad actual al límite permitido")
    public void testCargarMaquina() {
        negocio.cargarMaquina(); // 1000 - 200 = 800

        assertEquals(800.0, maquina.getCantidadActual(), 0.0001,
                "La cantidad actual debe ser capacidadMáxima - 200");
    }

    @Test
    @DisplayName("Debe consumir cerveza correctamente y actualizar el total consumido del cliente")
    public void testConsumirCervezaExitoso() {
        negocio.cargarMaquina(); // 800 ML disponibles

        // Consumo 1: 500 ML (500 * 0.05 = $25.0)
        negocio.consumirCerveza(cliente, 500.0);
        assertEquals(25.0, cliente.getTotalConsumido(), 0.0001);
        assertEquals(300.0, maquina.getCantidadActual(), 0.0001);

        // Consumo 2: 200 ML (200 * 0.05 = $10.0 -> Acumulado: $35.0)
        negocio.consumirCerveza(cliente, 200.0);
        assertEquals(35.0, cliente.getTotalConsumido(), 0.0001);
    }

    @Test
    @DisplayName("No debe acumular valor al cliente si la máquina no tiene suficiente cerveza")
    public void testConsumirCervezaSinStockSuficiente() {
        // La máquina inicia vacía (0 ML)
        negocio.consumirCerveza(cliente, 100.0);

        assertEquals(0.0, cliente.getTotalConsumido(), 0.0001,
                "Si no hay stock suficiente, el valor consumido debe permanecer en 0.0");
    }
}