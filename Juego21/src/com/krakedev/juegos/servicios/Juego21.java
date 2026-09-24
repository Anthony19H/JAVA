package com.krakedev.juegos.servicios;

import com.krakedev.juegos.entidades.Carta;
import com.krakedev.juegos.entidades.Jugador;
import java.io.PrintStream;
import java.util.ArrayList;

public class Juego21 {
    private ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
    private Dealer dealer;

    public Juego21() {
    }

    public ArrayList<Jugador> getJugadores() {
        return this.jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Dealer getDealer() {
        return this.dealer;
    }

    public void setDealer(Dealer dealer) {
        this.dealer = dealer;
    }

    public void cargarValores() {
        for(Carta carta : this.dealer.getNaipe()) {
            switch (carta.getValor()) {
                case "A":
                    carta.setValorJuego(11);
                    break;
                case "J":
                case "K":
                case "Q":
                    carta.setValorJuego(10);
                    break;
                default:
                    int x = Integer.parseInt(carta.getValor());
                    carta.setValorJuego(x);
                    break;
            }
        }
    }

    public void inicializar() {
        this.dealer = new Dealer();
        this.cargarValores();
    }

    public void agregarJugador(Jugador jugador) {
        this.jugadores.add(jugador);
    }

    public void repartirCarta(Jugador jugador) {
        if (this.dealer.getNaipe().size() == 0) {
            System.out.println("NAIPE VACIO");
        } else {
            Carta carta = this.dealer.entregarCarta();
            jugador.recibirCarta(carta);
        }
    }

    public void repartirRonda() {
        for(Jugador jugador : this.jugadores) {
            this.repartirCarta(jugador);
        }

        this.calcularTotal();
    }

    public void calcularTotal() {
        for(Jugador jugador : this.jugadores) {
            int valorTotal = 0;

            for(Carta carta : jugador.getCartas()) {
                valorTotal += carta.getValorJuego();
            }

            jugador.setPuntajeCartas(valorTotal);
        }
    }

    public ArrayList<Jugador> validarGanador() {
        ArrayList<Jugador> ganadores = new ArrayList<Jugador>();

        for(Jugador jugador : this.jugadores) {
            if (jugador.getPuntajeCartas() == 21) {
                ganadores.add(jugador);
            }
        }

        return ganadores;
    }

    public ArrayList<Jugador> jugar() {
        ArrayList<Jugador> ganadores = new ArrayList<Jugador>();

        for (int i = 0; i < 3; i++) {
            this.repartirRonda();

            ganadores = this.validarGanador();
            if (ganadores.size() >= 1) {
                break;
            }
        }

        return ganadores;
    }
}