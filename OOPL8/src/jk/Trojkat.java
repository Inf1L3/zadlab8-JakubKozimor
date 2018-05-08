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
public class Trojkat extends FiguraPlaska{
    private int a,b,c,h;

    @Override
    public double ObliczObwod() {
        return a+b+c;
       }

    @Override
    public double ObliczPole() {
        return 0.5*a*h;
        }

    public Trojkat(int a, int b, int c, int h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    @Override
    public String toString() {
        return "Trojkat{" + "a=" + a + ", b=" + b + ", c=" + c + ", h=" + h + '}';
    }

    

    
}
