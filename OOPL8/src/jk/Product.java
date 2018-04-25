/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jk;

/**
 *
 * @author student
 */
public abstract class Product {

    private double cena;
    private String nazwa;
    private String opis;

    public Product(double price, String name, String describe) {
        this.cena = cena;
        this.nazwa = nazwa;
        this.opis = opis;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public abstract void kup();

    public abstract void pokazDane();

    public static void main(String[] args) {
        Product[] p = new Product[10];
        p[0] = new Czekolada("czekolada", 1, "fsad");
        p[1] = new Dlugopis("dlugopis", 15, "fsad");
        p[2] = new Dzem("dzem", 2, "fsad");
        p[3] = new Ksiazka("ksiazka", 5, "fsad");
        p[4] = new Ksiazka("ksiazka", 3, "fsad");
        p[5] = new Polopiryna("polopiryna", 13, "fsad");
        p[6] = new Tractor("tractor", 11, "fsad");
        p[7] = new Dlugopis("dlugopis", 12, "fsad");
        p[8] = new Czekolada("czekolada", 30, "fsad");
        p[9] = new Czekolada("czekolada", 10, "fsad");

        for (int i = 0; i < 10; i++) {
            p[i].kup();

            p[i].pokazDane();
        }
    }
}
