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
/*
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
*/
    public static void main(String[] args) {
        /*
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
*/
        FiguraGeometryczna[] tab = new FiguraGeometryczna[15];

        tab[0] = new Kwadrat(2);
        tab[1] = new Kwadrat(4);
        tab[2] = new Kwadrat(3);
        tab[3] = new Prostokat(2, 3);
        tab[4] = new Kolo(2);
        tab[5] =new Kula(2);
        tab[6] = new Prostopadloscian(3, 4, 2);
        tab[7] = new Romb(2, 3);
        tab[8] = new Kolo(5);
        tab[9] = new Walec(2, 4);
        tab[10] = new Rownoleglobok(2, 3, 4);
        tab[11] = new Prostokat(2,6);
        tab[12] = new Trojkat(4, 5, 2, 1);
        tab[13] = new Kwadrat(7);
        tab[14] = new Kwadrat(5);
        
        int i=0;
        while(i<tab.length)
        {
            System.out.println(tab[i].toString());
            i++;
        }
    }
}