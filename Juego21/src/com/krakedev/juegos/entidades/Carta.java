//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.krakedev.juegos.entidades;

public class Carta {
    private String valor;
    private int valorJuego;
    private String palo;

    public Carta() {
    }

    public String getValor() {
        return this.valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public int getValorJuego() {
        return this.valorJuego;
    }

    public void setValorJuego(int valorJuego) {
        this.valorJuego = valorJuego;
    }

    public String getPalo() {
        return this.palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public void imprimir() {
        System.out.print(this.valor + "-" + this.palo);
        System.out.println(" Valor Juego: " + this.valorJuego);
    }
}
