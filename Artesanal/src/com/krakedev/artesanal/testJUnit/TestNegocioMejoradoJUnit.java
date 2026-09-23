package com.krakedev.artesanal.testJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.krakedev.artesanal.Maquina;
import com.krakedev.artesanal.NegocioMejorado;

public class TestNegocioMejoradoJUnit {

    @Test
    public void testGenerarCodigo() {
        NegocioMejorado negocio = new NegocioMejorado();
        String codigo = negocio.generarCodigo();

        assertNotNull(codigo);
        assertTrue(codigo.startsWith("M-"));
    }

    @Test
    public void testAgregarYRecuperarMaquina() {
        NegocioMejorado negocio = new NegocioMejorado();

        boolean agregado = negocio.agregarMaquina("IPA", "Cerveza artesanal amarga", 0.05);

        assertTrue(agregado);
        assertEquals(1, negocio.getMaquinas().size());

        Maquina m = negocio.getMaquinas().get(0);
        Maquina recuperada = negocio.recuperarMaquina(m.getCodigo());

        assertNotNull(recuperada);
        assertEquals("IPA", recuperada.getNombreCerveza());
    }

    @Test
    public void testRecuperarMaquinaInexistente() {
        NegocioMejorado negocio = new NegocioMejorado();
        Maquina recuperada = negocio.recuperarMaquina("M-999");

        assertNull(recuperada);
    }
}