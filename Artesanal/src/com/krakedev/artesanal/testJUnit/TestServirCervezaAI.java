package com.krakedev.artesanal.testJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.artesanal.Maquina;

public class TestServirCervezaAI {

    private static final double TOLERANCIA = 0.0001;

    /**
     * Valida que, cuando existe suficiente cerveza,
     * se sirva la cantidad solicitada, se descuente de la cantidad actual
     * y se retorne el valor correcto a pagar.
     * Usa el constructor con capacidad máxima.
     */
    @Test
    public void testServirCantidadMenorDisponible() {

        Maquina maquina = new Maquina("Pilsener", "Rubia", 0.02, 1000, "C001");

        maquina.recargarCerveza(500);

        double valor = maquina.servirCerveza(200);

        assertEquals(4.0, valor, TOLERANCIA);
        assertEquals(300.0, maquina.getCantidadActual(), TOLERANCIA);
    }

    /**
     * Valida que se pueda servir exactamente toda la cerveza disponible.
     * Después de servir, la cantidad actual debe quedar en cero.
     */
    @Test
    public void testServirCantidadExactaDisponible() {

        Maquina maquina = new Maquina("Pilsener", "Rubia", 0.05, 1000, "C002");

        maquina.recargarCerveza(400);

        double valor = maquina.servirCerveza(400);

        assertEquals(20.0, valor, TOLERANCIA);
        assertEquals(0.0, maquina.getCantidadActual(), TOLERANCIA);
    }

    /**
     * Valida que, cuando no existe suficiente cerveza,
     * no se sirva nada, el valor retornado sea cero
     * y la cantidad actual permanezca sin cambios.
     * Usa el constructor sin capacidad máxima.
     */
    @Test
    public void testNoServirPorCantidadInsuficiente() {

        Maquina maquina = new Maquina("Stout", "Oscura", 0.03, "C003");

        maquina.recargarCerveza(300);

        double valor = maquina.servirCerveza(500);

        assertEquals(0.0, valor, TOLERANCIA);
        assertEquals(300.0, maquina.getCantidadActual(), TOLERANCIA);
    }

    /**
     * Valida que el valor retornado corresponda al cálculo:
     * cantidad servida × precio por mililitro.
     */
    @Test
    public void testCalculoValorAPagar() {

        Maquina maquina = new Maquina("IPA", "Amarga", 0.015, 2000, "C004");

        maquina.recargarCerveza(1000);

        double valor = maquina.servirCerveza(600);

        assertEquals(9.0, valor, TOLERANCIA);
        assertEquals(400.0, maquina.getCantidadActual(), TOLERANCIA);
    }
}