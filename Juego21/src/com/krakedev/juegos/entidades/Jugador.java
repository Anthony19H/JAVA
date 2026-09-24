//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.krakedev.juegos.entidades;

import java.util.ArrayList;

public class Jugador {
    private String nickname;
    private ArrayList<Carta> cartas = new ArrayList();
    private int puntajeCartas;

    public Jugador(String nickname) {
        this.nickname = nickname;
    }

    public int getPuntajeCartas() {
        return this.puntajeCartas;
    }

    public void setPuntajeCartas(int puntajeCartas) {
        this.puntajeCartas = puntajeCartas;
    }

    public String getNickname() {
        return this.nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public ArrayList<Carta> getCartas() {
        return this.cartas;
    }

    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }

    public void recibirCarta(Carta carta) {
        this.cartas.add(carta);
    }

    public void imprimir() {
        System.out.println("Nickname: " + this.nickname);

        for(Carta carta : this.cartas) {
            carta.imprimir();
        }

        System.out.println(this.puntajeCartas);
    }
}
