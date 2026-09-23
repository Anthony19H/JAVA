package com.krakedev.artesanal.testNegocio;

import com.krakedev.artesanal.Cliente;
import com.krakedev.artesanal.NegocioMejorado;

public class TestClientes {

	public static void main(String[] args) {

		NegocioMejorado negocio = new NegocioMejorado();

		negocio.registrarCliente("Juan Pérez", "1712345678");

		Cliente clienteEncontradoCedula = negocio.buscarClientePorCedula("1712345678");
		if (clienteEncontradoCedula != null) {
			System.out.println("Cliente encontrado por cédula: " + clienteEncontradoCedula.getNombre());
		} else {
			System.out.println("Cliente no encontrado por cédula");
		}

		Cliente clienteEncontradoCodigo = negocio.buscarClientePorCodigo(100);
		if (clienteEncontradoCodigo != null) {

			System.out.println("Cliente encontrado por código: " + clienteEncontradoCodigo.getNombre());
		} else {
			System.out.println("Cliente no encontrado por código");
		}
	}
}