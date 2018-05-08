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
public class Prostopadloscian extends FiguraPrzestrzenna{
    private int a,b,c;
    
    @Override
    public double ObliczObjetosc() {
        return a*b*c;
    }
    
    @Override
    public double ObliczPole() {
        return 2*a*b+2*a*c+2*b*c;
        }

    public Prostopadloscian(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "Prostopadloscian{" + "a=" + a + ", b=" + b + ", c=" + c + '}';
    }
    
    
}
