package com.krakedev.juegos.test;

import com.krakedev.juegos.servicios.Dealer;

public class TestConstructorDealer {
    public static void main(String[] args) {
        // 1. Instanciar un Dealer (gracias al constructor, esto crea y llena el naipe automáticamente)
        Dealer dealer = new Dealer();
        
        // 2. Llamar al método imprimirNaipe()
        dealer.imprimirNaipe();
    }
}