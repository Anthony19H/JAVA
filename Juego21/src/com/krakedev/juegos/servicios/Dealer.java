//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.krakedev.juegos.servicios;

import com.krakedev.juegos.entidades.Carta;
import java.util.ArrayList;
import java.util.List;

public class Dealer {
    private ArrayList<Carta> naipe = new ArrayList();

    public Dealer() {
        this.generarNaipe();
    }

    public ArrayList<Carta> getNaipe() {
        return this.naipe;
    }

    public void setNaipe(ArrayList<Carta> naipe) {
        this.naipe = naipe;
    }

    public void generarNaipe() {
        ArrayList<String> palos = new ArrayList(List.of("T", "CN", "CR", "D"));
        ArrayList<String> numeros = new ArrayList(List.of("A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"));

        for(String palo : palos) {
            for(String numero : numeros) {
                Carta carta = new Carta();
                carta.setPalo(palo);
                carta.setValor(numero);
                this.naipe.add(carta);
            }
        }

    }

    public void imprimirNaipe() {
        for(Carta carta : this.naipe) {
            carta.imprimir();
        }

    }

    public int generarAleatorio(int maximo) {
        int aleatorio = (int)(Math.random() * (double)(maximo + 1));
        return aleatorio;
    }

    public Carta entregarCarta() {
        int aleatorio = this.generarAleatorio(this.naipe.size() - 1);
        Carta carta = (Carta)this.naipe.get(aleatorio);
        this.naipe.remove(aleatorio);
        return carta;
    }
}
