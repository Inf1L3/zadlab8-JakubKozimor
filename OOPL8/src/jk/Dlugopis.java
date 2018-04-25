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
public class Dlugopis extends Product {
     public Dlugopis(String nazwa, double cena, String opis) {
        super(cena, nazwa, opis);
    }

     @Override
    public void kup() {
        System.out.println(
                "Kupuje dlugopis");
    }

     @Override
    public void pokazDane() {
        System.out.println(
                "cena:" + getCena()
                + " nazwa:" + getNazwa()
                + " opis:" + getOpis()
        );
    }
}
