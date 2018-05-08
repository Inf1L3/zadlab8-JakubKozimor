/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jk;

/**
 *
 * @author Jakub
 */
public class Kolo extends FiguraPlaska{
    private int r;

    @Override
    public double ObliczObwod() {
        return 2*Math.PI*r;
       }

    @Override
    public double ObliczPole() {
        return Math.PI*r*r;
        }

    public Kolo(int r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return super.toString() + "Kolo{" + "r=" + r + '}' + "Pole: " + ObliczPole() + " Obwod: " + ObliczObwod();
    }
}
