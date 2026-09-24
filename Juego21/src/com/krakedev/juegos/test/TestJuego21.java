package com.krakedev.juegos.test;

import java.util.ArrayList;
import com.krakedev.juegos.entidades.Carta;
import com.krakedev.juegos.entidades.Jugador;
import com.krakedev.juegos.servicios.Juego21;

public class TestJuego21 {

    public static void main(String[] args) {
        System.out.println("=== INICIO DE PRUEBAS FINALES ===");
        
        for (int intento = 1; intento <= 10; intento++) {
            System.out.println("\n--- INTENTO / PARTIDA NRO: " + intento + " ---");
            
            Juego21 juego = new Juego21();
            juego.inicializar();
            
            juego.agregarJugador(new Jugador("Pepe"));
            juego.agregarJugador(new Jugador("Tommy"));
            juego.agregarJugador(new Jugador("Cynthia"));
            juego.agregarJugador(new Jugador("Diana"));

            // Ejecutamos el juego de 3 rondas
            ArrayList<Jugador> ganadores = juego.jugar();

            // IMPRIMIR EL ESTADO DE CADA JUGADOR EN ESTE INTENTO
            for (Jugador j : juego.getJugadores()) {
                System.out.println("Jugador: " + j.getNickname() + " | Puntaje: " + j.getPuntajeCartas());
                // Si quieres ver sus cartas también:
                for (Carta c : j.getCartas()) {
                    System.out.println("   - Carta: " + c.getValor() + "-" + c.getPalo() + " (Valor juego: " + c.getValorJuego() + ")");
                }
            }

            // Verificamos si hubo ganadores
            if (ganadores.size() > 0) {
                System.out.println("¡TENEMOS GANADOR(ES)!");
                for (Jugador g : ganadores) {
                    System.out.println("🎉 Ganador: " + g.getNickname() + " con " + g.getPuntajeCartas() + " puntos. 🎉");
                }
                break; 
            } else {
                System.out.println("Nadie llegó a 21 en este intento, reiniciando partida...");
            }
        }
    }
}